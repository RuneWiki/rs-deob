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

@OriginalClass("client!ft")
public class class4 extends class195 implements ImageProducer {

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "Luf;")
    public static class310 field50 = new class310(67, -1);

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "[[Z")
    public static boolean[][] field61 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ft", name = "C", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ft", name = "D", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ft", name = "F", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field60;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field59;

    @OriginalMember(owner = "client!ft", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field55;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field46;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIII)V", line = 3)
    private final synchronized void method24(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field51;
        if (this.field46 != null) {
            this.field46.setPixels(arg4, arg2, arg1, arg3, this.field55, super.field2782, super.field2786 * arg2 - -arg4, super.field2786);
            if (arg0 != -10448) {
                this.field55 = null;
            }
            this.field46.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZIZI)Lvh;", line = 22)
    public static final class240 method25(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        ++field58;
        class209 var5 = null;
        if (class214.field3048 != null) {
            var5 = new class209(arg0, class214.field3048, class239.field3286[arg0], 1000000);
        }
        if (arg4 > -83) {
            field61 = null;
        }
        class14.field165[arg0] = class186.field2589.method2983(arg0, var5, class399.field5554, 0);
        if (arg1) {
            class14.field165[arg0].method3035(false);
        }
        return new class240(class14.field165[arg0], arg3, arg2);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 45)
    public final void method26(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field57;
        if (arg0 != 28229) {
            this.field59 = null;
        }
        this.method30(false);
        arg1.drawImage(this.field59, arg2, arg3, this.field60);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 58)
    public static void method27(int arg0) {
        int var1 = 86 / ((-58 - arg0) / 58);
        field61 = null;
        field50 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 68)
    public final void method28(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method24(arg5 ^ -10448, arg4, arg2, arg1, arg3);
        ++field53;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg2, arg4, arg1);
        arg0.drawImage(this.field59, arg5, 0, this.field60);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ft", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 82)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field45;
        return this.field46 == arg0;
    }

    @OriginalMember(owner = "client!ft", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 90)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field44;
    }

    @OriginalMember(owner = "client!ft", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 97)
    public final void startProduction(ImageConsumer arg0) {
        ++field48;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ft", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 109)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field46 == arg0) {
            this.field46 = null;
        }
        ++field56;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZI)I", line = 120)
    public static final int method29(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method29(111, true, 24);
        }
        ++field43;
        return arg2 != 4 && ~arg2 != -6 ? 256 : class453.field6625[arg0 & 3];
    }

    @OriginalMember(owner = "client!ft", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 136)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field52;
        this.field46 = arg0;
        arg0.setDimensions(super.field2786, super.field2783);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field55);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V", line = 148)
    private final synchronized void method30(boolean arg0) {
        ++field54;
        if (this.field46 != null) {
            this.field46.setPixels(0, 0, super.field2786, super.field2783, this.field55, super.field2782, 0, super.field2786);
            this.field46.imageComplete(2);
            if (arg0) {
                this.removeConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 166)
    public final void method31(Canvas arg0, byte arg1) {
        this.field60 = arg0;
        ++field47;
        super.field2786 = this.field60.getSize().width;
        super.field2783 = this.field60.getSize().height;
        super.field2782 = new int[super.field2786 * super.field2783];
        this.field55 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field59 = this.field60.createImage(this);
        this.method30(false);
        this.field60.prepareImage(this.field59, this.field60);
        this.method30(false);
        this.field60.prepareImage(this.field59, this.field60);
        this.method30(false);
        this.field60.prepareImage(this.field59, this.field60);
        if (arg1 != 36) {
            field50 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIZ)I", line = 188)
    public static final int method32(int arg0, int arg1, boolean arg2) {
        ++field49;
        if (arg2) {
            return 0;
        } else {
            class113 var3 = class223.method1313(arg2, Integer.MIN_VALUE, arg0);
            if (var3 == null) {
                return class309.field4237.method1288(arg0, (byte) -107).field3213;
            } else {
                int var4 = 0;
                for (int var5 = arg1; var5 < var3.field1528.length; ++var5) {
                    if (var3.field1528[var5] == -1) {
                        ++var4;
                    }
                }
                return var4 + class309.field4237.method1288(arg0, (byte) -39).field3213 + -var3.field1528.length;
            }
        }
    }
}
