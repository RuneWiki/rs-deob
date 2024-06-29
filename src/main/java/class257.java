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

@OriginalClass("client!jh")
public class class257 extends class165 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Lem;")
    public static class10 field4418 = null;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "[Z")
    public static boolean[] field4426 = new boolean[112];

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "Lmh;")
    public static class128 field4428 = class22.method156(123, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "F")
    public static float field4415;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Ltf;")
    public static class246 field4412;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Ldj;")
    public static class314 field4419;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Ldj;")
    public static class314 field4432;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4410;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4427;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lmd;", line = 9)
    public static final class241 method1807(int arg0, int arg1, int arg2) {
        field4433++;
        for (class241 var3 = (class241) class102.field1741.method2024(0); var3 != null; var3 = (class241) class102.field1741.method2027(1211754408)) {
            if (var3.field4135 && var3.method1636(true, arg1, arg2)) {
                return var3;
            }
        }
        if (arg0 != -14) {
            method1809(false, -11);
        }
        return null;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 31)
    public static void method1808(int arg0) {
        field4419 = null;
        if (arg0 != 4) {
            field4424 = -58;
        }
        field4428 = null;
        field4418 = null;
        field4432 = null;
        field4412 = null;
        field4426 = null;
    }

    @OriginalMember(owner = "client!jh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 51)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field4416++;
        if (this.field4427 == arg0) {
            this.field4427 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V", line = 64)
    public static final void method1809(boolean arg0, int arg1) {
        byte[][] var2;
        byte var3;
        if (class247.field4247 && arg0) {
            var2 = class52.field1025;
            var3 = 1;
        } else {
            var2 = class38.field810;
            var3 = 4;
        }
        field4409++;
        if (arg1 != 17335) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class218.method1503(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class175.field3095[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0xFFD53F) >> 14;
                            int var11 = (var7 & 0x3FFB) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class226.field3949.length; var13++) {
                                if (class226.field3949[var13] == var12 && var2[var13] != null) {
                                    class219.method1518((var10 & 0x7) * 8, var8, var9, (byte) -83, var5 * 8, var4, var2[var13], (var11 & 0x7) * 8, arg0, class180.field3158, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V", line = 150)
    private final synchronized void method1810(int arg0) {
        field4421++;
        if (this.field4427 == null) {
            return;
        }
        if (arg0 != 25417) {
            field4426 = (boolean[]) null;
        }
        this.field4427.setPixels(0, 0, this.field2834, this.field2833, this.field4410, this.field2832, 0, this.field2834);
        this.field4427.imageComplete(2);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)Lmh;", line = 165)
    public static final class128 method1811(int arg0, byte arg1) {
        field4425++;
        int var2 = -65 % ((-arg1 - 62) / 53);
        return class201.method1404(10, 114, arg0, false);
    }

    @OriginalMember(owner = "client!jh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 180)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field4429++;
    }

    @OriginalMember(owner = "client!jh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 191)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field4417++;
        return this.field4427 == arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 205)
    public final void method148(int arg0, int arg1, int arg2, Graphics arg3) {
        field4420++;
        if (arg1 != 128) {
            method1807(3, 65, 77);
        }
        this.method1810(25417);
        arg3.drawImage(this.field2840, arg2, arg0, this);
    }

    @OriginalMember(owner = "client!jh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 218)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field4413++;
        this.field4427 = arg0;
        arg0.setDimensions(this.field2834, this.field2833);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4410);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V", line = 237)
    public static final void method1812(int arg0) {
        if (class196.field3433 != -1) {
            class211.method1455(class196.field3433, -15843);
        }
        field4414++;
        for (int var1 = 0; var1 < field4424; var1++) {
            if (class26.field581[var1]) {
                class199.field3468[var1] = true;
            }
            class253.field4366[var1] = class26.field581[var1];
            class26.field581[var1] = false;
        }
        if (class247.field4247) {
            class226.field3947 = true;
        }
        class264.field4581 = -1;
        class165.field2843 = -1;
        class66.field1273 = class293.field5011;
        int var2 = 121 % ((arg0 + 31) / 55);
        class185.field3223 = null;
        if (class196.field3433 != -1) {
            field4424 = 0;
            class142.method950(class199.field3465, class16.field420, 0, -13238, -1, 0, class196.field3433, 0, 0);
        }
        if (class247.field4247) {
            class269.method1879();
        } else {
            class213.method1472();
        }
        class50.field992 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIZI)V", line = 283)
    private final synchronized void method1813(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field4415 = 0.96959F;
        }
        field4411++;
        if (this.field4427 != null) {
            this.field4427.setPixels(arg0, arg2, arg4, arg1, this.field4410, this.field2832, this.field2834 * arg2 + arg0, this.field2834);
            this.field4427.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 299)
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        field4423++;
        if (arg4 != 1) {
            this.method149(84, 3, -46, 34, -36, (Graphics) null);
        }
        this.method1813(arg2, arg1, arg0, false, arg3);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg0, arg3, arg1);
        arg5.drawImage(this.field2840, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!jh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 321)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field4422++;
    }

    @OriginalMember(owner = "client!jh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 329)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4430++;
        return true;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZILjava/awt/Component;I)V", line = 337)
    public final void method150(boolean arg0, int arg1, Component arg2, int arg3) {
        this.field2832 = new int[arg1 * arg3 + 1];
        field4431++;
        this.field2833 = arg3;
        this.field2834 = arg1;
        this.field4410 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2840 = arg2.createImage(this);
        this.method1810(25417);
        arg2.prepareImage(this.field2840, this);
        this.method1810(25417);
        arg2.prepareImage(this.field2840, this);
        this.method1810(25417);
        if (arg0) {
            field4415 = 0.07155262F;
        }
        arg2.prepareImage(this.field2840, this);
        this.method1083(128);
    }
}
