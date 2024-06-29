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

@OriginalClass("client!rc")
public class class206 extends class153 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field2963 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2968;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2954;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 4)
    public static final void method1453(byte arg0) {
        class213.field3073.method717((byte) 74);
        field2953++;
        if (arg0 != 46) {
            field2963 = -5;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIBLjava/awt/Component;)V", line = 15)
    public final void method1105(int arg0, int arg1, byte arg2, Component arg3) {
        field2958++;
        int var5 = 69 % ((arg2 - 33) / 35);
        this.field2118 = arg1;
        this.field2120 = new int[arg0 * arg1 + 1];
        this.field2124 = arg0;
        this.field2968 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2119 = arg3.createImage(this);
        this.method1459(-104);
        arg3.prepareImage(this.field2119, this);
        this.method1459(-125);
        arg3.prepareImage(this.field2119, this);
        this.method1459(-105);
        arg3.prepareImage(this.field2119, this);
        this.method1111((byte) 119);
    }

    @OriginalMember(owner = "client!rc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 39)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2961++;
        return this.field2954 == arg0;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V", line = 51)
    public static final void method1454(byte arg0) {
        int var1 = class314.field4737 * 128 + 64;
        int var2 = 91 / ((arg0 + 26) / 62);
        field2959++;
        int var3 = class66.field870 * 128 + 64;
        int var4 = class135.method985(var3, class251.field3603, var1, (byte) -126) - class312.field4718;
        if (class232.field3280 >= 100) {
            class275.field4123 = class66.field870 * 128 + 64;
            class198.field2820 = class314.field4737 * 128 + 64;
            class101.field1394 = class135.method985(class275.field4123, class251.field3603, class198.field2820, (byte) -96) - class312.field4718;
        } else {
            if (var4 > class101.field1394) {
                class101.field1394 += (var4 - class101.field1394) * class232.field3280 / 1000 + class242.field3460;
                if (class101.field1394 > var4) {
                    class101.field1394 = var4;
                }
            }
            if (class275.field4123 < var3) {
                class275.field4123 += (var3 - class275.field4123) * class232.field3280 / 1000 + class242.field3460;
                if (class275.field4123 > var3) {
                    class275.field4123 = var3;
                }
            }
            if (var1 > class198.field2820) {
                class198.field2820 += (var1 - class198.field2820) * class232.field3280 / 1000 + class242.field3460;
                if (var1 < class198.field2820) {
                    class198.field2820 = var1;
                }
            }
            if (class275.field4123 > var3) {
                class275.field4123 -= class242.field3460 + ((class275.field4123 - var3) * class232.field3280 / 1000);
                if (class275.field4123 < var3) {
                    class275.field4123 = var3;
                }
            }
            if (var4 < class101.field1394) {
                class101.field1394 -= (class101.field1394 - var4) * class232.field3280 / 1000 + class242.field3460;
                if (class101.field1394 < var4) {
                    class101.field1394 = var4;
                }
            }
            if (class198.field2820 > var1) {
                class198.field2820 -= class242.field3460 + ((class198.field2820 - var1) * class232.field3280 / 1000);
                if (var1 > class198.field2820) {
                    class198.field2820 = var1;
                }
            }
        }
        int var5 = class106.field1424 * 128 + 64;
        int var6 = class74.field1024 * 128 + 64;
        int var7 = class135.method985(var6, class251.field3603, var5, (byte) -83) - class334.field5044;
        int var8 = var7 - class101.field1394;
        int var9 = var6 - class275.field4123;
        int var10 = var5 - class198.field2820;
        int var11 = (int) Math.sqrt((double) (var10 * var10 + (var9 * var9)));
        int var12 = (int) (Math.atan2((double) var8, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (-325.949D * Math.atan2((double) var10, (double) var9)) & 0x7FF;
        int var14 = var13 - class236.field3347;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (class204.field2944 < var12) {
            class204.field2944 += (var12 - class204.field2944) * class171.field2338 / 1000 + class175.field2379;
            if (var12 < class204.field2944) {
                class204.field2944 = var12;
            }
        }
        if (class204.field2944 > var12) {
            class204.field2944 -= (class204.field2944 - var12) * class171.field2338 / 1000 + class175.field2379;
            if (class204.field2944 < var12) {
                class204.field2944 = var12;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class236.field3347 += class171.field2338 * var14 / 1000 + class175.field2379;
            class236.field3347 &= 0x7FF;
        }
        if (var14 < 0) {
            class236.field3347 -= -var14 * class171.field2338 / 1000 + class175.field2379;
            class236.field3347 &= 0x7FF;
        }
        int var15 = var13 - class236.field3347;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class236.field3347 = var13;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIIII)V", line = 203)
    private final synchronized void method1455(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2969++;
        if (this.field2954 == null) {
            return;
        }
        if (arg0 > -26) {
            field2963 = -34;
        }
        this.field2954.setPixels(arg1, arg2, arg3, arg4, this.field2968, this.field2120, this.field2118 * arg2 + arg1, this.field2118);
        this.field2954.imageComplete(2);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V", line = 219)
    public static final void method1456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2971++;
        if (arg0 == arg2) {
            class254.method1737(arg5, arg2, arg4, arg6, arg7, -97, arg1);
            return;
        }
        int var8 = 44 / ((-arg3 - 7) / 37);
        if ((arg5 - arg2) >= field2952 && (arg2 + arg5) <= class259.field3813 && class101.field1397 <= arg1 - arg0 && class44.field536 >= arg0 + arg1) {
            class294.method2003(arg1, arg0, arg5, arg6, arg4, (byte) -114, arg7, arg2);
        } else {
            class54.method376(true, arg6, arg5, arg2, arg7, arg4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V", line = 241)
    public static final void method1457(byte arg0) {
        if (arg0 != 70) {
            method1453((byte) 70);
        }
        field2970++;
        class141.field1927.method573((byte) -88);
        class278.field4179 = 1;
        class100.field1383 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lrj;", line = 256)
    public static final class249 method1458(int arg0) {
        field2965++;
        try {
            return arg0 == 28570 ? (class249) Class.forName("gj").getDeclaredConstructor().newInstance() : (class249) null;
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 274)
    private final synchronized void method1459(int arg0) {
        field2967++;
        if (arg0 > -94) {
            method1457((byte) -50);
        }
        if (this.field2954 != null) {
            this.field2954.setPixels(0, 0, this.field2118, this.field2124, this.field2968, this.field2120, 0, this.field2118);
            this.field2954.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!rc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 290)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2966++;
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 298)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2954 = arg0;
        field2956++;
        arg0.setDimensions(this.field2118, this.field2124);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2968);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!rc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 314)
    public final void startProduction(ImageConsumer arg0) {
        field2960++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 322)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2955++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V", line = 333)
    public final void method1110(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2964++;
        if (arg2 > -49) {
            return;
        }
        this.method1455((byte) -119, arg1, arg3, arg4, arg5);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg3, arg4, arg5);
        arg0.drawImage(this.field2119, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 351)
    public final void method1109(int arg0, int arg1, Graphics arg2, int arg3) {
        field2957++;
        this.method1459(arg1 - 30470);
        if (arg1 != 30364) {
            field2962 = 26;
        }
        arg2.drawImage(this.field2119, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!rc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 367)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field2950++;
        if (this.field2954 == arg0) {
            this.field2954 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)[Lpn;", line = 380)
    public static final class170[] method1460(int arg0) {
        class170[] var1 = new class170[class342.field5121];
        if (arg0 != 64) {
            field2952 = 106;
        }
        for (int var2 = 0; var2 < class342.field5121; var2++) {
            byte[] var3 = class209.field3012[var2];
            int var4 = class323.field4903[var2] * class288.field4281[var2];
            if (class163.field2250[var2]) {
                int[] var5 = new int[var4];
                byte[] var6 = class185.field2553[var2];
                for (int var7 = 0; var7 < var4; var7++) {
                    var5[var7] = class190.method1334(class47.method303(-16777216, var6[var7] << 24), class235.field3331[class47.method303(var3[var7], 255)]);
                }
                if (class67.field908) {
                    var1[var2] = new class225(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], var5);
                } else {
                    var1[var2] = new class114(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], var5);
                }
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class235.field3331[class47.method303(255, var3[var9])];
                }
                if (class67.field908) {
                    var1[var2] = new class328(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], var8);
                } else {
                    var1[var2] = new class178(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], var8);
                }
            }
        }
        class236.method1624(76);
        field2951++;
        return var1;
    }
}
