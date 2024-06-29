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

@OriginalClass("client!mk")
public class class332 extends class318 implements ImageProducer {

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "[[[I")
    public static int[][][] field4527 = new int[2][][];

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
    public static int[] field4530 = new int[250];

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "J")
    public static long field4524 = 0L;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field4536 = 0;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field4539 = 0;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lwo;")
    public static class285 field4520;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lwo;")
    public static class285 field4522;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4523;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field4537;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4534;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4525;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V", line = 3)
    private final synchronized void method2128(boolean arg0) {
        ++field4533;
        if (this.field4525 != null) {
            if (arg0) {
                this.field4525.setPixels(0, 0, super.field4280, super.field4281, this.field4534, super.field4283, 0, super.field4280);
                this.field4525.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 18)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4528;
        this.field4525 = arg0;
        arg0.setDimensions(super.field4280, super.field4281);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4534);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)Ljk;", line = 31)
    public static final class117 method2129(int arg0, boolean arg1) {
        ++field4531;
        if (~arg0 == -1) {
            if ((double) class224.field2811 == 3.0D) {
                return class212.field2588;
            }
            if ((double) class224.field2811 == 4.0D) {
                return class340.field4643;
            }
            if ((double) class224.field2811 == 6.0D) {
                return class282.field3685;
            }
            if ((double) class224.field2811 >= 8.0D) {
                return class55.field637;
            }
        } else if (~arg0 != -2) {
            if (arg0 == 2) {
                if ((double) class224.field2811 == 3.0D) {
                    return class438.field6019;
                }
                if ((double) class224.field2811 == 4.0D) {
                    return class414.field5680;
                }
                if ((double) class224.field2811 == 6.0D) {
                    return class373.field5059;
                }
                if ((double) class224.field2811 >= 8.0D) {
                    return class8.field75;
                }
            }
        } else {
            if ((double) class224.field2811 == 3.0D) {
                return class282.field3685;
            }
            if ((double) class224.field2811 == 4.0D) {
                return class55.field637;
            }
            if ((double) class224.field2811 == 6.0D) {
                return class438.field6019;
            }
            if ((double) class224.field2811 >= 8.0D) {
                return class414.field5680;
            }
        }
        if (!arg1) {
            field4536 = -48;
        }
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIB)V", line = 106)
    private final synchronized void method2130(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field4519;
        if (arg4 != 44) {
            field4527 = null;
        }
        if (this.field4525 != null) {
            this.field4525.setPixels(arg0, arg3, arg2, arg1, this.field4534, super.field4283, super.field4280 * arg3 + arg0, super.field4280);
            this.field4525.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 126)
    public static void method2131(int arg0) {
        field4527 = null;
        if (arg0 != 0) {
            method2133(-17, -14, -91, 37, -108, 21, -25, -82, 92, -17);
        }
        field4520 = null;
        field4530 = null;
        field4522 = null;
    }

    @OriginalMember(owner = "client!mk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 145)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4532;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 153)
    public final void method1598(boolean arg0, Canvas arg1) {
        this.field4523 = arg1;
        ++field4540;
        super.field4280 = this.field4523.getSize().width;
        super.field4281 = this.field4523.getSize().height;
        super.field4283 = new int[super.field4281 * super.field4280];
        this.field4534 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4537 = this.field4523.createImage(this);
        this.method2128(true);
        this.field4523.prepareImage(this.field4537, this.field4523);
        this.method2128(!arg0);
        if (arg0) {
            this.field4525 = null;
        }
        this.field4523.prepareImage(this.field4537, this.field4523);
        this.method2128(!arg0);
        this.field4523.prepareImage(this.field4537, this.field4523);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(CI)Z", line = 176)
    public static final boolean method2132(char arg0, int arg1) {
        if (arg1 != -25171) {
            return true;
        } else {
            ++field4529;
            return arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 187)
    public final void method1599(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method2130(arg2, arg3, arg4, arg0, (byte) 44);
        ++field4541;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg0, arg4, arg3);
        arg5.drawImage(this.field4537, 0, arg1, this.field4523);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V", line = 202)
    public final void method1600(int arg0, int arg1, Graphics arg2, boolean arg3) {
        ++field4526;
        this.method2128(arg3);
        arg2.drawImage(this.field4537, arg1, arg0, this.field4523);
    }

    @OriginalMember(owner = "client!mk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 229)
    public final void startProduction(ImageConsumer arg0) {
        ++field4535;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!mk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 237)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4538;
        return this.field4525 == arg0;
    }

    @OriginalMember(owner = "client!mk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 245)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4542;
        if (this.field4525 == arg0) {
            this.field4525 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIII)V", line = 255)
    public static final void method2133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4521;
        class186 var10 = null;
        for (class186 var11 = (class186) class432.field5895.method1690((byte) -117); var11 != null; var11 = (class186) class432.field5895.method1699((byte) 18)) {
            if (var11.field2156 == arg2 && ~var11.field2150 == ~arg9 && ~var11.field2157 == ~arg7 && var11.field2143 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class186();
            var10.field2143 = arg4;
            var10.field2150 = arg9;
            var10.field2157 = arg7;
            var10.field2156 = arg2;
            class212.method1295(0, var10);
            class432.field5895.method1696(false, var10);
        }
        var10.field2154 = arg3;
        var10.field2148 = arg1;
        var10.field2145 = arg6;
        if (arg5 != 31496) {
            method2132((char) 65524, -10);
        }
        var10.field2152 = arg8;
        var10.field2153 = arg0;
    }
}
