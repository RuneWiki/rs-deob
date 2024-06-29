import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class397 extends class200 implements ImageProducer {

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "[Z")
    public static boolean[] field5642 = new boolean[8];

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "[I")
    public static int[] field5639 = new int[1000];

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    public static int field5647 = 328;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "Lsd;")
    public static class74 field5640 = new class74(19, 7);

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field5649 = new String[100];

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
    public static int field5648 = 0;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "F")
    public static float field5643;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5645;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field5628;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5635;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5644;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 3)
    public final void method146(int arg0, Canvas arg1) {
        this.field5645 = arg1;
        if (arg0 != 0) {
            this.method145(-52, -88, 123, (Graphics) null);
        }
        ++field5634;
        super.field2773 = this.field5645.getSize().width;
        super.field2780 = this.field5645.getSize().height;
        super.field2775 = new int[super.field2780 * super.field2773];
        this.field5635 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5628 = this.field5645.createImage(this);
        this.method2378((byte) 121);
        this.field5645.prepareImage(this.field5628, this.field5645);
        this.method2378((byte) 122);
        this.field5645.prepareImage(this.field5628, this.field5645);
        this.method2378((byte) 123);
        this.field5645.prepareImage(this.field5628, this.field5645);
    }

    @OriginalMember(owner = "client!rt", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 27)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5644 == arg0) {
            this.field5644 = null;
        }
        ++field5633;
    }

    @OriginalMember(owner = "client!rt", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 41)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field5644 = arg0;
        ++field5629;
        arg0.setDimensions(super.field2773, super.field2780);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5635);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V", line = 53)
    public static void method2375(int arg0) {
        field5640 = null;
        field5649 = null;
        field5639 = null;
        if (arg0 != 16711680) {
            field5649 = null;
        }
        field5642 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 67)
    public final void method145(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field5631;
        this.method2378((byte) 123);
        if (arg1 != 27578) {
            field5647 = -112;
        }
        arg3.drawImage(this.field5628, arg0, arg2, this.field5645);
    }

    @OriginalMember(owner = "client!rt", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 79)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5627;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lg;I)V", line = 88)
    public static final void method2376(class470 arg0, int arg1) {
        class421.field6070 = arg0.method2761(0, "p11_full");
        ++field5638;
        class376.field5362 = arg0.method2761(0, "p12_full");
        class137.field1661 = arg0.method2761(0, "b12_full");
        class432.field6255 = arg0.method2761(0, "hitmarks");
        class66.field834 = arg0.method2761(0, "hitbar_default");
        class10.field106 = arg0.method2761(0, "timerbar_default");
        class463.field6524 = arg0.method2761(0, "headicons_pk");
        class457.field6443 = arg0.method2761(0, "headicons_prayer");
        class175.field2104 = arg0.method2761(0, "hint_headicons");
        class147.field1786 = arg0.method2761(0, "hint_mapmarkers");
        class382.field5429 = arg0.method2761(0, "mapflag");
        class99.field1214 = arg0.method2761(0, "cross");
        int var2 = -59 % ((-11 - arg1) / 48);
        class178.field2154 = arg0.method2761(0, "mapdots");
        class96.field1190 = arg0.method2761(0, "scrollbar");
        class236.field3267 = arg0.method2761(0, "name_icons");
        class162.field1941 = arg0.method2761(0, "floorshadows");
        class479.field6772 = arg0.method2761(0, "compass");
        class15.field204 = arg0.method2761(0, "otherlevel");
        class301.field4476 = arg0.method2761(0, "hint_mapedge");
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZIIIIIII)Z", line = 117)
    public static final boolean method2377(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5632;
        int var9 = class19.field258.field2539[0];
        int var10 = class19.field258.field2536[0];
        if (var9 >= arg6 && var9 < class159.field1895 && var10 >= 0 && var10 < class289.field4316) {
            if (~arg3 <= -1 && class159.field1895 > arg3 && arg7 >= 0 && ~class289.field4316 < ~arg7) {
                int var11 = class420.method2500(arg6 ^ 128, class174.field2093[class19.field258.field994], arg0, arg8, arg4, arg2, var10, arg3, var9, arg1, class19.field258.method1012(false), arg5, class382.field5421, arg7, class166.field1978);
                if (var11 < 1) {
                    return false;
                } else {
                    class158.field1886 = class382.field5421[var11 + -1];
                    class4.field52 = class166.field1978[var11 + -1];
                    class317.field4623 = false;
                    class101.method492((byte) 102);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 147)
    private final synchronized void method2378(byte arg0) {
        if (arg0 < 120) {
            field5647 = -107;
        }
        ++field5641;
        if (this.field5644 != null) {
            this.field5644.setPixels(0, 0, super.field2773, super.field2780, this.field5635, super.field2775, 0, super.field2773);
            this.field5644.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 165)
    public final void method147(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field5636;
        this.method2379(arg5, arg1, arg2, true, arg3);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg5, arg1, arg2);
        arg4.drawImage(this.field5628, 0, arg0, this.field5645);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!rt", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 178)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5630;
    }

    @OriginalMember(owner = "client!rt", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 188)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5637;
        return this.field5644 == arg0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIZI)V", line = 207)
    private final synchronized void method2379(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field5646;
        if (this.field5644 != null) {
            this.field5644.setPixels(arg4, arg0, arg1, arg2, this.field5635, super.field2775, super.field2773 * arg0 + arg4, super.field2773);
            if (!arg3) {
                field5643 = -0.29352194F;
            }
            this.field5644.imageComplete(2);
        }
    }
}
