import java.awt.Canvas;
import java.awt.Frame;
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

@OriginalClass("client!ms")
public class class492 extends class176 implements ImageProducer {

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field6871 = 0;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6877;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field6883;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field6875;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6878;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6885;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)Z", line = 3)
    public static final boolean method2867(int arg0, byte arg1) {
        ++field6870;
        if (class248.field3308[arg0]) {
            return true;
        } else if (!class47.field639.method684((byte) 96, arg0)) {
            return false;
        } else {
            int var2 = class47.field639.method694(arg0, (byte) 119);
            if (~var2 == -1) {
                class248.field3308[arg0] = true;
                return true;
            } else {
                if (class146.field2099[arg0] == null) {
                    class146.field2099[arg0] = new class464[var2];
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class146.field2099[arg0][var3] == null) {
                        byte[] var4 = class47.field639.method702((byte) -69, var3, arg0);
                        if (var4 != null) {
                            class464 var5 = class146.field2099[arg0][var3] = new class464();
                            var5.field6440 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method2735(128, new class32(var4));
                        }
                    }
                }
                if (arg1 <= 71) {
                    method2867(-5, (byte) -82);
                }
                class248.field3308[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 65)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field6876;
        this.field6885 = arg0;
        arg0.setDimensions(super.field2393, super.field2401);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6878);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 77)
    public static final void method2868(int arg0) {
        ++field6884;
        int var1 = class169.field2338 * 128 + 64;
        int var2 = class225.field2972 * 128 + 64;
        int var3 = class247.method1385(-118, var1, var2, class373.field5104) - class13.field176;
        if (class1.field12 >= 100) {
            class412.field5637 = class225.field2972 * 128 - -64;
            class197.field2680 = class169.field2338 * 128 + 64;
            class195.field2638 = class247.method1385(-113, class197.field2680, class412.field5637, class373.field5104) - class13.field176;
        } else {
            if (class197.field2680 < var1) {
                class197.field2680 += (-class197.field2680 + var1) * class1.field12 / 1000 + class23.field300;
                if (~var1 > ~class197.field2680) {
                    class197.field2680 = var1;
                }
            }
            if (var3 > class195.field2638) {
                class195.field2638 += (var3 - class195.field2638) * class1.field12 / 1000 + class23.field300;
                if (class195.field2638 > var3) {
                    class195.field2638 = var3;
                }
            }
            if (~var1 > ~class197.field2680) {
                class197.field2680 -= (class197.field2680 - var1) * class1.field12 / 1000 + class23.field300;
                if (~var1 < ~class197.field2680) {
                    class197.field2680 = var1;
                }
            }
            if (~class412.field5637 > ~var2) {
                class412.field5637 += class23.field300 - -((-class412.field5637 + var2) * class1.field12 / 1000);
                if (~class412.field5637 < ~var2) {
                    class412.field5637 = var2;
                }
            }
            if (~var3 > ~class195.field2638) {
                class195.field2638 -= (class195.field2638 - var3) * class1.field12 / 1000 + class23.field300;
                if (var3 > class195.field2638) {
                    class195.field2638 = var3;
                }
            }
            if (~var2 > ~class412.field5637) {
                class412.field5637 -= (-var2 + class412.field5637) * class1.field12 / 1000 + class23.field300;
                if (~class412.field5637 > ~var2) {
                    class412.field5637 = var2;
                }
            }
        }
        int var4 = class153.field2148 * 128 + 64;
        int var5 = class40.field576 * 128 + 64;
        int var6 = class247.method1385(arg0 + 13170, var4, var5, class373.field5104) - class252.field3361;
        int var7 = -class197.field2680 + var4;
        int var8 = var6 - class195.field2638;
        int var9 = var5 - class412.field5637;
        int var10 = (int) Math.sqrt((double) (var7 * var7 - -(var9 * var9)));
        int var11 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10));
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 16383;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (~var11 < ~class155.field2171) {
            class155.field2171 += (-class155.field2171 + var11 >> 3) * class447.field6087 / 1000 + class464.field6420 << 3;
            if (var11 < class155.field2171) {
                class155.field2171 = var11;
            }
        }
        if (var11 < class155.field2171) {
            class155.field2171 -= class464.field6420 - -((class155.field2171 - var11 >> 3) * class447.field6087 / 1000) << 3;
            if (~class155.field2171 > ~var11) {
                class155.field2171 = var11;
            }
        }
        int var13 = var12 - class348.field4796;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (~var14 < -1) {
            class348.field4796 += class447.field6087 * var14 / 1000 + class464.field6420 << 3;
            class348.field4796 &= 16383;
        }
        if (~var14 > -1) {
            class348.field4796 -= class464.field6420 - -(-var14 * class447.field6087 / 1000) << 3;
            class348.field4796 &= 16383;
        }
        int var15 = -class348.field4796 + var12;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (~var15 > 8191) {
            var15 += 16384;
        }
        if (var15 < 0 && ~var14 < -1 || var15 > 0 && var14 < 0) {
            class348.field4796 = var12;
        }
        if (arg0 == -13161) {
            class176.field2398 = 0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 240)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6869;
        return this.field6885 == arg0;
    }

    @OriginalMember(owner = "client!ms", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 248)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6873;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V", line = 255)
    private final synchronized void method2869(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6880;
        if (this.field6885 != null) {
            this.field6885.setPixels(arg1, arg4, arg3, arg2, this.field6878, super.field2397, super.field2393 * arg4 + arg1, super.field2393);
            int var6 = 27 / ((-59 - arg0) / 58);
            this.field6885.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 276)
    public final void method1010(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg3 != 7) {
            this.method2869(-62, -17, -61, -78, 110);
        }
        ++field6887;
        this.method2869(126, arg1, arg0, arg5, arg2);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg2, arg5, arg0);
        arg4.drawImage(this.field6875, 0, 0, this.field6877);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!ms", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 293)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field6885 == arg0) {
            this.field6885 = null;
        }
        ++field6872;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V", line = 305)
    private final synchronized void method2870(int arg0) {
        ++field6874;
        if (arg0 == -4465) {
            if (this.field6885 != null) {
                this.field6885.setPixels(0, 0, super.field2393, super.field2401, this.field6878, super.field2397, 0, super.field2393);
                this.field6885.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V", line = 322)
    public static void method2871(int arg0) {
        field6883 = null;
        if (arg0 != 1000) {
            method2871(-127);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 336)
    public final void method1009(Canvas arg0, byte arg1) {
        this.field6877 = arg0;
        int var3 = -67 / ((arg1 - 44) / 42);
        ++field6881;
        super.field2393 = this.field6877.getSize().width;
        super.field2401 = this.field6877.getSize().height;
        super.field2397 = new int[super.field2401 * super.field2393];
        this.field6878 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field6875 = this.field6877.createImage(this);
        this.method2870(-4465);
        this.field6877.prepareImage(this.field6875, this.field6877);
        this.method2870(-4465);
        this.field6877.prepareImage(this.field6875, this.field6877);
        this.method2870(-4465);
        this.field6877.prepareImage(this.field6875, this.field6877);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 360)
    public final void method1011(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method2870(arg2 + -4465);
        if (arg2 == 0) {
            ++field6882;
            arg0.drawImage(this.field6875, arg3, arg1, this.field6877);
        }
    }

    @OriginalMember(owner = "client!ms", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 376)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field6886;
    }
}
