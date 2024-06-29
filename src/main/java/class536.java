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

@OriginalClass("client!oo")
public class class536 extends class316 implements ImageProducer {

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public static int field7488 = 0;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "Z")
    public static boolean field7500 = false;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7498;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "Ljava/awt/Image;")
    private Image field7497;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7486;

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7495;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method1010(int arg0, int arg1, Graphics arg2, byte arg3) {
        int var5 = 101 / ((arg3 - 39) / 40);
        ++field7503;
        this.method3077((byte) -66);
        arg2.drawImage(this.field7497, arg1, arg0, this.field7498);
    }

    @OriginalMember(owner = "client!oo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7501;
    }

    @OriginalMember(owner = "client!oo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field7504;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    private final synchronized void method3077(byte arg0) {
        ++field7494;
        if (arg0 == -66) {
            if (this.field7495 != null) {
                this.field7495.setPixels(0, 0, super.field4243, super.field4248, this.field7486, super.field4242, 0, super.field4243);
                this.field7495.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field7487;
        this.field7495 = arg0;
        arg0.setDimensions(super.field4243, super.field4248);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7486);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!oo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7496;
        return this.field7495 == arg0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/awt/Graphics;IIZII)V")
    public final void method1009(Graphics arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.method3080(arg2, -102, arg4, arg1, arg5);
        ++field7490;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg2, arg1, arg4);
        arg0.drawImage(this.field7497, 0, 0, this.field7498);
        if (arg3) {
            this.field7495 = null;
        }
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1008(int arg0, Canvas arg1) {
        ++field7491;
        this.field7498 = arg1;
        super.field4243 = this.field7498.getSize().width;
        super.field4248 = this.field7498.getSize().height;
        super.field4242 = new int[super.field4248 * super.field4243];
        this.field7486 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7497 = this.field7498.createImage(this);
        if (arg0 <= 76) {
            method3079((class583) null, -70);
        }
        this.method3077((byte) -66);
        this.field7498.prepareImage(this.field7497, this.field7498);
        this.method3077((byte) -66);
        this.field7498.prepareImage(this.field7497, this.field7498);
        this.method3077((byte) -66);
        this.field7498.prepareImage(this.field7497, this.field7498);
    }

    @OriginalMember(owner = "client!oo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field7495 == arg0) {
            this.field7495 = null;
        }
        ++field7492;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IFI[BFIFFIIIFBLar;)V")
    public static final void method3078(int arg0, float arg1, int arg2, byte[] arg3, float arg4, int arg5, float arg6, float arg7, int arg8, int arg9, int arg10, float arg11, byte arg12, class585 arg13) {
        ++field7489;
        int var14 = arg2 * arg8;
        if (arg12 <= 115) {
            field7493 = -101;
        }
        float[] var15 = new float[var14];
        for (int var16 = 0; ~arg5 < ~var16; ++var16) {
            int var19 = arg0;
            arg13.method680(0, arg10, true, arg8, arg4 / (float) arg8, var15, arg6 / (float) arg10, arg7 / (float) arg2, arg9, arg11 * 127.0F, arg2);
            arg11 = arg1 * arg11;
            arg7 *= 2.0F;
            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                arg3[var19] = (byte) ((int) ((float) arg3[var19] + var15[var20]));
                ++var19;
            }
            arg4 *= 2.0F;
            arg6 *= 2.0F;
        }
        int var17 = arg0;
        for (int var18 = 0; ~var14 < ~var18; ++var18) {
            arg3[var17] = (byte) (arg3[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lgi;I)V")
    public static final void method3079(class583 arg0, int arg1) {
        if (class209.field2953 == null) {
            class639 var2 = new class639();
            byte[] var3 = var2.method3698(128, 128, 16, 2);
            class209.field2953 = class552.method3137(var3, (byte) 56, false);
        }
        ++field7502;
        if (class177.field2535 == null) {
            class301 var4 = new class301();
            byte[] var5 = var4.method1917(16, 103, 128, 128);
            class177.field2535 = class552.method3137(var5, (byte) 126, false);
        }
        if (arg1 != 128) {
            method3079((class583) null, 115);
        }
        class277 var6 = arg0.field8199;
        if (var6.method1783((byte) 46) && class571.field7880 == null) {
            byte[] var7 = class524.method3022(128, (byte) -89, 128, 16, 8, 0.5F, 16.0F, new class92(419684), 4.0F, 0.6F, 4.0F);
            class571.field7880 = class552.method3137(var7, (byte) 40, false);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method3080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7485;
        if (arg1 <= -58) {
            if (this.field7495 != null) {
                this.field7495.setPixels(arg4, arg0, arg3, arg2, this.field7486, super.field4242, super.field4243 * arg0 + arg4, super.field4243);
                this.field7495.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZIII)I")
    public static final int method3081(boolean arg0, int arg1, int arg2, int arg3) {
        ++field7499;
        class133 var4 = class568.method3229(arg2, (byte) -88, arg0);
        if (arg3 > -36) {
            return 16;
        } else if (var4 == null) {
            return 0;
        } else {
            return ~arg1 <= -1 && var4.field2116.length > arg1 ? var4.field2116[arg1] : 0;
        }
    }
}
