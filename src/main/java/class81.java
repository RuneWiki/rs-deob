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

@OriginalClass("client!bt")
public class class81 extends class230 implements ImageProducer {

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "Lpf;")
    public static class425 field1077 = new class425(60, 4);

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "Lcf;")
    public static class251 field1078 = class227.method1375(10951);

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "[[I")
    public static int[][] field1080 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "Liq;")
    public static class134 field1079;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "Liq;")
    public static class134 field1081;

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "Lfh;")
    public static class170 field1076;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "Lal;")
    public static class198 field1068;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "Ltg;")
    public static class451 field1083;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1071;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field1060;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1074;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1065;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "[I")
    public static int[] field1084;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method469(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method524(arg5, arg3, arg4, arg0, true);
        ++field1061;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg4, arg3, arg0, arg5);
        arg2.drawImage(this.field1060, 0, arg1, this.field1071);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!bt", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1066;
        return this.field1065 == arg0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    private final synchronized void method521(int arg0) {
        ++field1062;
        if (arg0 <= -105) {
            if (this.field1065 != null) {
                this.field1065.setPixels(0, 0, super.field3519, super.field3517, this.field1074, super.field3515, 0, super.field3519);
                this.field1065.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1063;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
    public static final void method522(int arg0) {
        ++field1067;
        if (class188.field2815 > 0) {
            class77.method504((byte) 121);
        } else {
            class187.field2805 = class301.field4543;
            int var1 = -26 / ((-40 - arg0) / 39);
            class301.field4543 = null;
            class316.method1929(false, 40);
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
    public static void method523(int arg0) {
        field1080 = null;
        field1079 = null;
        field1078 = null;
        field1076 = null;
        field1068 = null;
        field1083 = null;
        field1077 = null;
        if (arg0 != -187) {
            field1080 = null;
        }
        field1084 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public final void method468(Graphics arg0, int arg1, byte arg2, int arg3) {
        ++field1075;
        this.method521(-115);
        if (arg2 != -10) {
            this.method469(71, -53, (Graphics) null, 81, -24, 108);
        }
        arg0.drawImage(this.field1060, arg1, arg3, this.field1071);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIZ)V")
    private final synchronized void method524(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1069;
        if (this.field1065 != null) {
            if (!arg4) {
                this.requestTopDownLeftRightResend((ImageConsumer) null);
            }
            this.field1065.setPixels(arg2, arg1, arg3, arg0, this.field1074, super.field3515, super.field3519 * arg1 + arg2, super.field3519);
            this.field1065.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
    public static final void method525(byte arg0) {
        ++field1059;
        if (class328.field4929 == null) {
            class328.field4929 = new int[65536];
            double var1 = 0.7D + -0.015D + Math.random() * 0.03D;
            int var3 = 0;
            if (arg0 <= -125) {
                while (var3 < 65536) {
                    double var4 = (double) ((var3 & 64555) >> 10) / 64.0D + 0.0078125D;
                    double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                    double var8 = (double) (127 & var3) / 128.0D;
                    double var10 = var8;
                    double var12 = var8;
                    double var14 = var8;
                    if (var6 != 0.0D) {
                        double var16;
                        if (var8 < 0.5D) {
                            var16 = (var6 + 1.0D) * var8;
                        } else {
                            var16 = var6 + var8 + -(var6 * var8);
                        }
                        double var18 = var8 * 2.0D + -var16;
                        double var20 = var4 + 0.3333333333333333D;
                        if (var20 > 1.0D) {
                            --var20;
                        }
                        double var24 = var4 + -0.3333333333333333D;
                        if (var24 < 0.0D) {
                            ++var24;
                        }
                        if (!(var20 * 6.0D < 1.0D)) {
                            if (!(var20 * 2.0D < 1.0D)) {
                                if (!(var20 * 3.0D < 2.0D)) {
                                    var10 = var18;
                                } else {
                                    var10 = (var16 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                                }
                            } else {
                                var10 = var16;
                            }
                        } else {
                            var10 = (-var18 + var16) * 6.0D * var20 + var18;
                        }
                        if (var4 * 6.0D < 1.0D) {
                            var12 = (-var18 + var16) * 6.0D * var4 + var18;
                        } else if (!(var4 * 2.0D < 1.0D)) {
                            if (!(var4 * 3.0D < 2.0D)) {
                                var12 = var18;
                            } else {
                                var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                            }
                        } else {
                            var12 = var16;
                        }
                        if (!(var24 * 6.0D < 1.0D)) {
                            if (!(var24 * 2.0D < 1.0D)) {
                                if (!(var24 * 3.0D < 2.0D)) {
                                    var14 = var18;
                                } else {
                                    var14 = (-var18 + var16) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                                }
                            } else {
                                var14 = var16;
                            }
                        } else {
                            var14 = (var16 - var18) * 6.0D * var24 + var18;
                        }
                    }
                    double var26 = Math.pow(var10, var1);
                    double var28 = Math.pow(var12, var1);
                    double var30 = Math.pow(var14, var1);
                    int var32 = (int) (var26 * 256.0D);
                    int var33 = (int) (var28 * 256.0D);
                    int var34 = (int) (var30 * 256.0D);
                    int var35 = (var33 << 8) + ((var32 << 16) - -var34);
                    class328.field4929[var3] = var35;
                    ++var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1064;
    }

    @OriginalMember(owner = "client!bt", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1073;
        this.field1065 = arg0;
        arg0.setDimensions(super.field3519, super.field3517);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1074);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bt", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1070;
        if (this.field1065 == arg0) {
            this.field1065 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method470(Canvas arg0, int arg1) {
        this.field1071 = arg0;
        ++field1072;
        super.field3519 = this.field1071.getSize().width;
        super.field3517 = this.field1071.getSize().height;
        super.field3515 = new int[super.field3519 * super.field3517];
        if (arg1 > -90) {
            this.method470((Canvas) null, 47);
        }
        this.field1074 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1060 = this.field1071.createImage(this);
        this.method521(-114);
        this.field1071.prepareImage(this.field1060, this.field1071);
        this.method521(-107);
        this.field1071.prepareImage(this.field1060, this.field1071);
        this.method521(-119);
        this.field1071.prepareImage(this.field1060, this.field1071);
    }
}
