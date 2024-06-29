import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 {

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public int field2773 = -1;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Ltd;")
    public static class136 field2759 = new class136();

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
    public static int[] field2762 = new int[5];

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
    public static int[] field2770 = new int[32];

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Laf;")
    public static class7 field2771 = class48.method406(40, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Laf;")
    private static class7 field2761 = class48.method406(40, "Password: ");

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Laf;")
    private static class7 field2764 = class48.method406(40, "Checking for updates )2 ");

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Laf;")
    public static class7 field2760 = class48.method406(40, "Null");

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Laf;")
    public static class7 field2768 = field2761;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Laf;")
    public static class7 field2767 = field2764;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lbc;")
    public class11 field2756;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Lrd;")
    public static class122 field2772;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    public int[] field2753;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[Lqc;")
    public static class114[] field2765;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[Laf;")
    public class7[] field2766;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILkb;I)Lbb;")
    public static final class10 method901(int arg0, class71 arg1, int arg2) {
        if (arg2 >= -102) {
            field2765 = null;
        }
        field2763++;
        byte[] var3 = arg1.method568(arg0, (byte) 90);
        return var3 == null ? null : new class10(var3);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method902(int arg0) {
        field2768 = null;
        field2771 = null;
        field2761 = null;
        field2764 = null;
        field2762 = null;
        field2767 = null;
        field2772 = null;
        field2759 = null;
        if (arg0 != -2) {
            field2767 = null;
        }
        field2760 = null;
        field2770 = null;
        field2765 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILad;Lad;)V")
    public static final void method903(int arg0, class5 arg1, class5 arg2) {
        field2769++;
        if (class96.field2269) {
            class144.method1170((byte) 70, arg2, arg1);
            return;
        }
        if (arg0 > -32) {
            field2764 = null;
        }
        if (class108.field2634 == 0 || class108.field2634 == 5) {
            byte var3 = 20;
            arg1.method47(class12.field308, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class33.method299(230, var4, 304, 34, 9179409);
            class33.method299(231, var4 + 1, 302, 32, 0);
            class33.method304(232, var4 + 2, class13.field330 * 3, 30, 9179409);
            class33.method304(class13.field330 * 3 + 232, var4 + 2, 300 - class13.field330 * 3, 30, 0);
            arg1.method47(class106.field2600, 382, 276 - var3, 16777215, -1);
        }
        if (class108.field2634 == 20) {
            class67.field1471.method896(382 - class67.field1471.field2723 / 2, -(class67.field1471.field2722 / 2) + 271);
            short var5 = 211;
            arg1.method47(class106.field2602, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg1.method47(class106.field2613, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg1.method47(class106.field2616, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg1.method42(method905(new class7[] { class137.field3281, class5.method40(class106.field2608) }, 1), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg1.method42(method905(new class7[] { field2768, class106.field2618.method60(-7) }, 1), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class108.field2634 == 10) {
            class67.field1471.method896(202, 171);
            if (class89.field2078 == 0) {
                short var6 = 251;
                arg1.method47(class18.field410, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 291;
                short var8 = 302;
                class11.field279.method896(var8 - 73, var7 - 20);
                arg1.method30(class89.field2080, var8 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class11.field279.method896(var9 - 73, var7 + -20);
                arg1.method30(class147.field3453, var9 - 73, var7 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class89.field2078 == 2) {
                short var10 = 211;
                arg1.method47(class106.field2602, 382, var10, 16776960, 0);
                int var30 = var10 + 15;
                arg1.method47(class106.field2613, 382, var30, 16776960, 0);
                short var11 = 302;
                int var31 = var30 + 15;
                arg1.method47(class106.field2616, 382, var31, 16776960, 0);
                short var12 = 321;
                int var32 = var31 + 15;
                int var33 = var32 + 10;
                arg1.method42(method905(new class7[] { class137.field3281, class5.method40(class106.field2608), class37.field944 == 0 & class155.field3611 % 40 < 20 ? class42.field1019 : class106.field2614 }, 1), 272, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg1.method42(method905(new class7[] { field2768, class106.field2618.method60(-19), class155.field3611 % 40 < 20 & class37.field944 == 1 ? class42.field1019 : class106.field2614 }, 1), 274, var34, 16777215, 0);
                class11.field279.method896(var11 - 73, var12 + -20);
                int var35 = var34 + 15;
                arg1.method47(class73.field1650, var11, var12 + 5, 16777215, 0);
                short var13 = 462;
                class11.field279.method896(var13 - 73, var12 - 20);
                arg1.method47(class79.field1842, var13, var12 + 5, 16777215, 0);
            } else if (class89.field2078 == 3) {
                short var14 = 236;
                short var15 = 382;
                short var16 = 321;
                arg1.method47(class84.field1991, 382, 211, 16776960, 0);
                arg1.method47(class141.field3334, 382, var14, 16777215, 0);
                int var36 = var14 + 15;
                arg1.method47(class72.field1617, 382, var36, 16777215, 0);
                int var37 = var36 + 15;
                arg1.method47(class81.field1867, 382, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg1.method47(class133.field3115, 382, var38, 16777215, 0);
                int var39 = var38 + 15;
                class11.field279.method896(var15 - 73, var16 - 20);
                arg1.method47(class79.field1842, var15, var16 + 5, 16777215, 0);
            }
        }
        if (class37.field930 != 1) {
            if (class151.field3548 > 0) {
                class25.method232(-27876, class151.field3548);
                class151.field3548 = 0;
            }
            client.method207((byte) 22);
        }
        class106.field2612[class111.field2683 ? 1 : 0].method896(725, 463);
        if (class108.field2634 > 5 && class126.field3024 != 2 && class155.field3610 == 0) {
            if (class9.field249 == null) {
                class9.field249 = class102.method837(class148.field3492, -115, class106.field2614, class127.field3060);
            } else {
                short var17 = 463;
                byte var18 = 5;
                byte var19 = 100;
                class9.field249.method896(var18, var17);
                byte var20 = 35;
                arg1.method47(method905(new class7[] { class151.field3525, class32.field854, class51.method421((byte) -5, class133.field3123) }, 1), var19 / 2 + var18, var20 / 2 + var17 + -2, 16777215, 0);
                if (class46.field1097 == null) {
                    arg2.method47(class95.field2259, var19 / 2 + var18, var20 / 2 + var17 + 12, 16777215, 0);
                } else {
                    arg2.method47(class68.field1495, var19 / 2 + var18, var20 / 2 + var17 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var21 = class13.field324.getGraphics();
            class102.field2425.method647(var21, 0, 0, (byte) 46);
        } catch (Exception var22) {
            class13.field324.repaint();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lse;I)V")
    public static final void method904(class130 arg0, int arg1) {
        int var2 = 0;
        if (arg0.field3071 == 0) {
            var2 = class47.field1151.method1036(arg0.field3078, arg0.field3092, arg0.field3068);
        }
        if (arg0.field3071 == 1) {
            var2 = class47.field1151.method1030(arg0.field3078, arg0.field3092, arg0.field3068);
        }
        field2754++;
        if (arg0.field3071 == 2) {
            var2 = class47.field1151.method1009(arg0.field3078, arg0.field3092, arg0.field3068);
        }
        if (arg0.field3071 == 3) {
            var2 = class47.field1151.method1023(arg0.field3078, arg0.field3092, arg0.field3068);
        }
        int var3 = 0;
        int var4 = -1;
        if (arg1 >= -10) {
            method904(null, -100);
        }
        int var5 = 0;
        if (var2 != 0) {
            int var6 = class47.field1151.method1008(arg0.field3078, arg0.field3092, arg0.field3068, var2);
            var4 = var2 >> 14 & 0x7FFF;
            var5 = var6 >> 6 & 0x3;
            var3 = var6 & 0x1F;
        }
        arg0.field3080 = var3;
        arg0.field3089 = var4;
        arg0.field3072 = var5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([Laf;I)Laf;")
    public static final class7 method905(class7[] arg0, int arg1) {
        field2755++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg1 == 1) {
            return class68.method546(arg0, arg0.length, 0, 106);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLof;)Z")
    public static final boolean method906(byte arg0, class103 arg1) {
        int var2 = arg1.field2512;
        field2758++;
        if (arg0 < 61) {
            method903(-38, null, null);
        }
        if (var2 == 205) {
            class14.field361 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            field2759.method1119(var4 == 1, false, var3);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            field2759.method1118(var6 == 1, 0, var5);
        }
        if (var2 == 324) {
            field2759.method1114(false, 0);
        }
        if (var2 == 325) {
            field2759.method1114(true, 0);
        }
        if (var2 == 326) {
            class47.field1150.method1131(96, 2027385224);
            field2759.method1116(class47.field1150, -5801);
            class87.field2022++;
            return true;
        } else {
            return false;
        }
    }
}
