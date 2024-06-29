import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class250 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
    public static boolean field4401 = true;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Llh;")
    public static class249 field4407 = new class249(8);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lr;")
    private static class66 field4411 = class93.method641(43, "slide:");

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lr;")
    public static class66 field4409 = field4411;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lr;")
    private static class66 field4414 = class93.method641(43, "Loading title screen )2 ");

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lr;")
    public static class66 field4408 = field4414;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lr;")
    public static class66 field4415 = field4411;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "[[[I")
    public static int[][][] field4412;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[[[I")
    public static int[][][] field4413;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1691(int arg0) {
        field4409 = null;
        field4415 = null;
        field4408 = null;
        field4414 = null;
        field4407 = null;
        field4411 = null;
        field4412 = null;
        field4413 = null;
        if (arg0 > -2) {
            field4407 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Lni;")
    public static final class168 method1692(int arg0) {
        field4404++;
        if (arg0 != -14452) {
            field4407 = null;
        }
        byte[] var1 = class44.field777[0];
        int var2 = class2.field25[0] * class199.field3443[0];
        class168 var5;
        if (class49.field876[0]) {
            byte[] var6 = class214.field3677[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class73.method521(class136.field2517[class115.method767(var1[var8], 255)], class115.method767(255, var6[var8]) << 24);
            }
            var5 = new class141(class11.field125, class54.field950, class36.field541[0], class231.field4029[0], class2.field25[0], class199.field3443[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class136.field2517[class115.method767(var1[var4], 255)];
            }
            var5 = new class168(class11.field125, class54.field950, class36.field541[0], class231.field4029[0], class2.field25[0], class199.field3443[0], var3);
        }
        class211.method1365((byte) -93);
        return var5;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLr;I)V")
    public static final void method1693(boolean arg0, class66 arg1, int arg2) {
        field4406++;
        byte var3 = 4;
        int var4 = var3 + 6;
        if (arg2 != -16678) {
            method1696(79L, 67, 108, 3, (class66) null, -121, 64);
        }
        int var5 = var3 + 6;
        int var6 = class33.field501.method221(arg1, 250);
        int var7 = class33.field501.method223(arg1, 250) * 13;
        class235.method1558(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var3 + var7, 0);
        class235.method1534(var4 - var3, var5 - var3, var3 + var6 + var3, var7 - (-var3 + -var3), 16777215);
        class33.field501.method222(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class100.method689(var4 - var3, var5 - var3, var3 + var6 + var3, var7 - -var3 + var3, (byte) -62);
        if (!arg0) {
            class50.method351(-121, var6, var7, var4, var5);
            return;
        }
        try {
            Graphics var8 = class131.field2452.getGraphics();
            class52.field908.method121(99, 0, 0, var8);
        } catch (Exception var9) {
            class131.field2452.repaint();
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
    public static final int method1694(int arg0, int arg1) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        field4402++;
        int var6 = -26 % ((arg1 - 61) / 33);
        double var7 = (double) ((arg0 & 0xFFF1) >> 8) / 256.0D;
        double var9 = 0.0D;
        double var11 = var2;
        if (var2 > var7) {
            var11 = var7;
        }
        if (var11 > var4) {
            var11 = var4;
        }
        double var13 = var2;
        if (var2 < var7) {
            var13 = var7;
        }
        double var15 = 0.0D;
        if (var13 < var4) {
            var13 = var4;
        }
        double var17 = (var11 + var13) / 2.0D;
        int var19 = (int) (var17 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var11 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var11) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var11) / (2.0D - var13 - var11);
            }
            if (var2 == var13) {
                var9 = (var7 - var4) / (var13 - var11);
            } else if (var7 == var13) {
                var9 = (var4 - var2) / (var13 - var11) + 2.0D;
            } else if (var4 == var13) {
                var9 = (var2 - var7) / (var13 - var11) + 4.0D;
            }
        }
        int var20 = (int) (var15 * 256.0D);
        double var21 = var9 / 6.0D;
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var23 = (int) (var21 * 256.0D);
        if (var19 > 243) {
            var20 >>= 0x4;
        } else if (var19 > 217) {
            var20 >>= 0x3;
        } else if (var19 > 192) {
            var20 >>= 0x2;
        } else if (var19 > 179) {
            var20 >>= 0x1;
        }
        return (var19 >> 1) + (var20 >> 5 << 7) + (var23 >> 2 << 10);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lpc;")
    public static final class29 method1695(int arg0) {
        field4403++;
        class265 var1 = new class265(class11.field125, class54.field950, class36.field541[0], class231.field4029[0], class2.field25[0], class199.field3443[arg0], class44.field777[0], class136.field2517);
        class211.method1365((byte) -93);
        return var1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JIIILr;II)V")
    public static final void method1696(long arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5, int arg6) {
        field4405++;
        class249 var8 = new class249(128);
        var8.method1638(32, 10);
        var8.method1650(false, (int) (Math.random() * 99999.0D));
        var8.method1650(false, 508);
        var8.method1651(true, arg0);
        var8.method1666(544537784, (int) (Math.random() * 9.9999999E7D));
        var8.method1641((byte) -9, arg4);
        var8.method1666(544537784, (int) (Math.random() * 9.9999999E7D));
        var8.method1650(false, class182.field3194);
        var8.method1638(32, arg1);
        int var9 = -21 / ((-arg2 - 52) / 55);
        var8.method1638(32, arg3);
        var8.method1666(544537784, (int) (Math.random() * 9.9999999E7D));
        var8.method1650(false, arg6);
        var8.method1650(false, arg5);
        var8.method1666(544537784, (int) (Math.random() * 9.9999999E7D));
        var8.method1660(false, class17.field232, class15.field187);
        class28.field412.field4335 = 0;
        class28.field412.method1638(32, 48);
        class28.field412.method1638(32, var8.field4335);
        class28.field412.method1669(var8.field4335, (byte) 118, 0, var8.field4350);
        class69.field1400 = 1;
        class47.field858 = 0;
        class91.field1750 = -3;
        class121.field2289 = 0;
    }
}
