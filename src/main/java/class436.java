import jaggl.OpenGL;
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

@OriginalClass("client!hm")
public class class436 extends class256 implements ImageProducer {

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "Luw;")
    public static class208 field5730 = new class208(31, -2);

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "F")
    public static float field5733 = 0.0F;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "Lcja;")
    public static class83 field5734 = new class83();

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "Lrn;")
    public static class633 field5736 = new class633(11, 3);

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5731;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field5719;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5725;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5729;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    private final synchronized void method2499(int arg0) {
        ++field5726;
        if (this.field5729 != null) {
            int var2 = -12 / ((63 - arg0) / 40);
            this.field5729.setPixels(0, 0, super.field3468, super.field3469, this.field5725, super.field3467, 0, super.field3468);
            this.field5729.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method2500(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field5722;
        if (this.field5729 != null) {
            if (arg2 >= -15) {
                this.startProduction((ImageConsumer) null);
            }
            this.field5729.setPixels(arg4, arg0, arg1, arg3, this.field5725, super.field3467, super.field3468 * arg0 + arg4, super.field3468);
            this.field5729.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5721;
        return this.field5729 == arg0;
    }

    @OriginalMember(owner = "client!hm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field5724;
        if (this.field5729 == arg0) {
            this.field5729 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public final void method1648(int arg0, int arg1, int arg2, Canvas arg3) {
        this.field5731 = arg3;
        super.field3468 = arg2;
        super.field3469 = arg0;
        ++field5732;
        super.field3467 = new int[super.field3469 * super.field3468];
        this.field5725 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5719 = this.field5731.createImage(this);
        this.method2499(arg1 + -83);
        if (arg1 == -1) {
            this.field5731.prepareImage(this.field5719, this.field5731);
            this.method2499(110);
            this.field5731.prepareImage(this.field5719, this.field5731);
            this.method2499(arg1 + 118);
            this.field5731.prepareImage(this.field5719, this.field5731);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILjava/awt/Graphics;IIIII)V")
    public final void method1647(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5727;
        if (arg1 != -1) {
            field5734 = null;
        }
        this.method2500(arg5, arg3, (byte) -21, arg4, arg0);
        Shape var9 = arg2.getClip();
        arg2.clipRect(arg6, arg7, arg3, arg4);
        arg2.drawImage(this.field5719, -arg0 + arg6, -arg5 + arg7, this.field5731);
        arg2.setClip(var9);
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V")
    public static void method2501(int arg0) {
        if (arg0 != -28560) {
            field5734 = null;
        }
        field5736 = null;
        field5734 = null;
        field5730 = null;
    }

    @OriginalMember(owner = "client!hm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field5728;
        this.field5729 = arg0;
        arg0.setDimensions(super.field3468, super.field3469);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5725);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5735;
    }

    @OriginalMember(owner = "client!hm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5723;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI[FIII)V")
    public static final void method2502(int arg0, byte arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        ++field5720;
        if (arg2 > 0 && !class735.method3997(arg2, (byte) -119)) {
            throw new IllegalArgumentException("");
        } else if (arg5 > 0 && !class735.method3997(arg5, (byte) -111)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class20.method87(arg4, 6409);
            int var8 = 0;
            int var9 = arg5 <= arg2 ? arg5 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg5 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg6, var8, arg0, arg2, arg5, 0, arg4, 5126, var12, 0);
                if (var9 <= 1) {
                    if (arg1 >= -113) {
                        field5730 = null;
                        return;
                    }
                    return;
                }
                int var14 = arg2 * var7;
                float[] var15 = var13;
                for (int var16 = 0; ~var7 < ~var16; ++var16) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 - -var14;
                    for (int var20 = 0; var11 > var20; ++var20) {
                        for (int var21 = 0; var10 > var21; ++var21) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg2 = var10;
                arg5 = var11;
                ++var8;
                var9 >>= 1;
                var10 >>= 1;
                var11 >>= 1;
            }
        }
    }
}
