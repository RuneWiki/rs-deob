import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class174 extends class281 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2780 = null;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2779 = "flash1:";

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lgd;")
    public static class325 field2777 = new class325(16);

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2797 = "Allocated memory";

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Lpk;")
    public static class120 field2796;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2788;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2789;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "[I")
    public static int[] field2799;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "[[[I")
    public static int[][][] field2795;

    @OriginalMember(owner = "client!ac", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final void startProduction(ImageConsumer arg0) {
        field2775++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lnn;", line = 14)
    public static final class44 method1283(int arg0) {
        field2782++;
        class117.field1892 = arg0;
        return class140.method1076(26);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 23)
    public static void method1284(byte arg0) {
        field2796 = null;
        field2795 = (int[][][]) null;
        field2797 = null;
        field2779 = null;
        field2780 = null;
        if (arg0 == 101) {
            field2777 = null;
            field2799 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 39)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2785++;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 48)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2787++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 65)
    public final void method1285(byte arg0, Component arg1, int arg2, int arg3) {
        this.field4403 = new int[arg2 * arg3 + 1];
        int var5 = -105 / ((arg0 + 4) / 52);
        this.field4402 = arg2;
        this.field4401 = arg3;
        field2791++;
        this.field2788 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4405 = arg1.createImage(this);
        this.method1288(-119);
        arg1.prepareImage(this.field4405, this);
        this.method1288(-50);
        arg1.prepareImage(this.field4405, this);
        this.method1288(-101);
        arg1.prepareImage(this.field4405, this);
        this.method1981(18517);
    }

    @OriginalMember(owner = "client!ac", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 86)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2776++;
        return this.field2789 == arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V", line = 94)
    private final synchronized void method1286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2793++;
        if (this.field2789 == null) {
            return;
        }
        if (arg3 != 19200) {
            field2780 = (String) null;
        }
        this.field2789.setPixels(arg4, arg2, arg0, arg1, this.field2788, this.field4403, this.field4401 * arg2 + arg4, this.field4401);
        this.field2789.imageComplete(2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I", line = 119)
    public static final int method1287(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -341) {
            field2797 = (String) null;
        }
        field2781++;
        int var4 = class40.field606[class271.method1923(arg3, arg2)];
        if (arg0 > 0) {
            int var5 = class40.field614.method250((byte) -115, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class40.field614.method253(arg1 ^ 0xFFFFFE54, arg0 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 8 & 0xFF) * var9;
                int var11 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var11 << 8 & 0xFF0048) + (var10 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 187)
    private final synchronized void method1288(int arg0) {
        field2783++;
        if (this.field2789 == null) {
            return;
        }
        this.field2789.setPixels(0, 0, this.field4401, this.field4402, this.field2788, this.field4403, 0, this.field4401);
        if (arg0 > -44) {
            field2780 = (String) null;
        }
        this.field2789.imageComplete(2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 211)
    public final void method1289(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2794++;
        this.method1286(arg3, arg2, arg4, 19200, arg1);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg4, arg3, arg2);
        arg0.drawImage(this.field4405, 0, 0, this);
        arg0.setClip(var7);
        if (arg5 > -89) {
            field2798 = 42;
        }
    }

    @OriginalMember(owner = "client!ac", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 226)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2789 = arg0;
        field2778++;
        arg0.setDimensions(this.field4401, this.field4402);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2788);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ac", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 240)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field2792++;
        if (this.field2789 == arg0) {
            this.field2789 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 254)
    public final void method1290(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            field2795 = (int[][][]) ((int[][][]) null);
        }
        field2784++;
        this.method1288(arg0 - 79);
        arg1.drawImage(this.field4405, arg2, arg3, this);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 276)
    public static final void method1291(int arg0, int arg1) {
        field2790++;
        class304.field4842.method2285(arg1, (byte) 101);
        if (arg0 != 32652) {
            method1291(76, 63);
        }
    }
}
