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

@OriginalClass("client!af")
public class class300 extends class228 implements ImageProducer {

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4130;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field4120;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4129;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4131;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "[[I")
    public static int[][] field4132;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIILco;IBILco;)V")
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, class77 arg5, int arg6, byte arg7, int arg8, class77 arg9) {
        ++field4121;
        int var10 = arg5.method623((byte) 120);
        if (~var10 != 0) {
            Object var11 = null;
            class16 var12 = (class16) class386.field5631.method1073((long) var10, false);
            if (var12 == null) {
                class4[] var13 = class4.method24(class364.field5334, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class269.field3721.method265(var13[0], true);
                class386.field5631.method1072((long) var10, var12, false);
            }
            class269.method1611((byte) 35, arg9.field1732, 0, arg8, arg1 >> 1, 64 * arg9.method626((byte) 120), arg3 >> 1, arg9.field1735, arg4, arg9.field1738);
            int var14 = arg2 + -18 + class52.field637[0];
            int var15 = arg6 / 4 * 18 + var14;
            int var16 = arg0 - 16 + -54 + class52.field637[1];
            int var17 = arg6 % 4 * 18 + var16;
            var12.method85(var15, var17);
            if (arg5 == arg9) {
                class269.field3721.method233(18, var17 + -1, 18, var15 + -1, false, -256);
            }
            class375 var18 = class181.method1159(11849);
            var18.field5495 = var15;
            var18.field5499 = var17 - -16;
            var18.field5494 = var17;
            var18.field5496 = arg5;
            var18.field5497 = var15 + 16;
            class225.field3202.method2454(-9946, var18);
            if (arg7 <= 63) {
                field4132 = null;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4131 == arg0) {
            this.field4131 = null;
        }
        ++field4119;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class310 var7 = new class310();
        var7.field4222 = arg1 >> class523.field7736;
        var7.field4229 = arg2 >> class523.field7736;
        var7.field4217 = arg3 >> class523.field7736;
        var7.field4236 = arg4 >> class523.field7736;
        var7.field4221 = arg0;
        var7.field4211 = arg1;
        var7.field4232 = arg2;
        var7.field4216 = arg3;
        var7.field4233 = arg4;
        var7.field4227 = arg5;
        var7.field4213 = arg6;
        class271.field3736[class273.field3759++] = var7;
    }

    @OriginalMember(owner = "client!af", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4122;
        return this.field4131 == arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method1419(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 >= -62) {
            this.method1420(122, (Canvas) null);
        }
        this.method1759(-106);
        ++field4117;
        arg3.drawImage(this.field4120, arg0, arg2, this.field4130);
    }

    @OriginalMember(owner = "client!af", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4116;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method1416(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg5 < 106) {
            this.field4120 = null;
        }
        this.method1761(arg1, arg0, arg2, 4, arg3);
        ++field4128;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg0, arg2, arg1);
        arg4.drawImage(this.field4120, 0, 0, this.field4130);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!af", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4118;
        this.field4131 = arg0;
        arg0.setDimensions(super.field3239, super.field3238);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4129);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILem;IB)V")
    public static final void method1757(int arg0, class150 arg1, int arg2, byte arg3) {
        ++field4133;
        if (class110.field1664 == null && !class181.field2659) {
            if (arg1 != null && class194.method1210(arg1, 14869) != null) {
                class110.field1664 = arg1;
                class257.field3566 = class194.method1210(arg1, 14869);
                class436.field6383 = 0;
                class233.field3292 = arg0;
                if (arg3 > -83) {
                    method1758(117);
                }
                class55.field663 = false;
                class12.field194 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4126;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public static void method1758(int arg0) {
        if (arg0 == 14) {
            field4132 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    private final synchronized void method1759(int arg0) {
        ++field4125;
        if (this.field4131 != null) {
            this.field4131.setPixels(0, 0, super.field3239, super.field3238, this.field4129, super.field3236, 0, super.field3239);
            if (arg0 < -68) {
                this.field4131.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1420(int arg0, Canvas arg1) {
        this.field4130 = arg1;
        ++field4127;
        super.field3239 = this.field4130.getSize().width;
        super.field3238 = this.field4130.getSize().height;
        super.field3236 = new int[super.field3239 * super.field3238];
        this.field4129 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4120 = this.field4130.createImage(this);
        this.method1759(-126);
        this.field4130.prepareImage(this.field4120, this.field4130);
        this.method1759(-99);
        this.field4130.prepareImage(this.field4120, this.field4130);
        if (arg0 != -1) {
            this.field4130 = null;
        }
        this.method1759(arg0 ^ 123);
        this.field4130.prepareImage(this.field4120, this.field4130);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZB[IILef;)Ltq;")
    public static final class442 method1760(int arg0, boolean arg1, byte arg2, int[] arg3, int arg4, class338 arg5) {
        if (arg2 != -91) {
            field4132 = null;
        }
        ++field4123;
        if (!arg5.field4864 && (!class226.method1402(arg0, (byte) -88) || !class226.method1402(arg4, (byte) -119))) {
            return !arg5.field4842 ? new class442(arg5, arg0, arg4, class508.method3034(arg0, true), class508.method3034(arg4, true), arg3) : new class442(arg5, 34037, arg0, arg4, arg1, arg3);
        } else {
            return new class442(arg5, 3553, arg0, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4115;
        if (this.field4131 != null) {
            this.field4131.setPixels(arg4, arg1, arg2, arg0, this.field4129, super.field3236, super.field3239 * arg1 + arg4, super.field3239);
            this.field4131.imageComplete(2);
            if (arg3 != 4) {
                method1755(120, 41, 127, 74, -72, (class77) null, 83, (byte) 2, 113, (class77) null);
            }
        }
    }
}
