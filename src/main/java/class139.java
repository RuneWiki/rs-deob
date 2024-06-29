import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class139 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2530 = 0;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lkh;")
    public static class117 field2534 = class224.method1450((byte) -52, "::errortest");

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2532 = 128;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lkh;")
    public static class117 field2538 = class224.method1450((byte) -13, "(U2");

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lkh;")
    private static class117 field2536 = class224.method1450((byte) 118, "Players");

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lkh;")
    public static class117 field2535 = field2536;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Lkh;")
    private static class117 field2540 = class224.method1450((byte) -69, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "[I")
    public static int[] field2539 = new int[2048];

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lkh;")
    public static class117 field2533 = field2540;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lkh;")
    private static class117 field2543 = class224.method1450((byte) 122, "Please enter your password)3");

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lkh;")
    public static class117 field2529 = field2543;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Lai;")
    public static class10 field2542;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method947(byte arg0) {
        field2529 = null;
        field2535 = null;
        if (arg0 >= -50) {
            return;
        }
        field2533 = null;
        field2536 = null;
        field2534 = null;
        field2543 = null;
        field2538 = null;
        field2540 = null;
        field2542 = null;
        field2539 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V")
    public static final void method948(int arg0, byte arg1, int arg2) {
        field2541++;
        class36 var3 = class143.field2597[class203.field3675][arg2][arg0];
        if (var3 == null) {
            class151.method1075(class203.field3675, arg2, arg0);
            return;
        }
        class143 var4 = null;
        class143 var5 = (class143) var3.method314((byte) -26);
        int var6 = -99999999;
        while (var5 != null) {
            class154 var14 = class214.method1408((byte) 102, var5.field2586.field1286);
            int var15 = var14.field2780;
            if (var14.field2806 == 1) {
                var15 = (var5.field2586.field1295 + 1) * var15;
            }
            if (var6 < var15) {
                var4 = var5;
                var6 = var15;
            }
            var5 = (class143) var3.method320(0);
        }
        if (var4 == null) {
            class151.method1075(class203.field3675, arg2, arg0);
            return;
        }
        int var7 = -110 % ((arg1 - 72) / 38);
        class67 var8 = null;
        class67 var9 = null;
        var3.method323(-60, var4);
        for (class143 var10 = (class143) var3.method314((byte) -26); var10 != null; var10 = (class143) var3.method320(0)) {
            class67 var13 = var10.field2586;
            if (var4.field2586.field1286 != var13.field1286) {
                if (var9 == null) {
                    var9 = var13;
                }
                if (var9.field1286 != var13.field1286 && var8 == null) {
                    var8 = var13;
                }
            }
        }
        long var11 = (long) ((arg0 << 7) + arg2 + 1610612736);
        class90.method629(class203.field3675, arg2, arg0, class186.method1265(true, arg0 * 128 + 64, class203.field3675, arg2 * 128 + 64), var4.field2586, var11, var9, var8);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLmg;Lmg;)V")
    public static final void method949(byte arg0, class138 arg1, class138 arg2) {
        if (class173.field3118 == null) {
            class173.field3118 = class33.method285(0, class172.field3108, false, class81.field1538);
        }
        field2531++;
        if (class214.field3885 == null) {
            class214.field3885 = class221.method1436(class172.field3108, 0, class60.field1211, false);
        }
        if (class98.field1810 == null) {
            class98.field1810 = class221.method1436(class172.field3108, 0, class246.field4538, false);
        }
        if (class78.field1484 == null) {
            class78.field1484 = class221.method1436(class172.field3108, 0, class101.field1843, false);
        }
        class83.method579(0, 23, 765, 480, 0);
        class83.method573(0, 0, 138, 23, 12425273, 9135624);
        class83.method573(138, 0, 640, 23, 5197647, 2697513);
        int var3 = 96 / ((-arg0 - 17) / 50);
        arg1.method935(class157.field2857, 69, 15, 0, -1);
        if (class78.field1484 != null) {
            class78.field1484[1].method1084(140, 1);
            arg2.method938(class163.field2970, 152, 10, 16777215, -1);
            class78.field1484[0].method1084(140, 12);
            arg2.method938(class90.field1686, 152, 21, 16777215, -1);
        }
        if (class98.field1810 != null) {
            short var4 = 280;
            short var5 = 500;
            if (class71.field1358[0] == 0 && class25.field616[0] == 0) {
                class98.field1810[2].method1084(var4, 4);
            } else {
                class98.field1810[0].method1084(var4, 4);
            }
            if (class71.field1358[0] == 0 && class25.field616[0] == 1) {
                class98.field1810[3].method1084(var4 + 15, 4);
            } else {
                class98.field1810[1].method1084(var4 + 15, 4);
            }
            arg1.method938(class221.field3994, var4 + 32, 17, 16777215, -1);
            short var6 = 390;
            if (class71.field1358[0] == 1 && class25.field616[0] == 0) {
                class98.field1810[2].method1084(var6, 4);
            } else {
                class98.field1810[0].method1084(var6, 4);
            }
            short var7 = 610;
            if (class71.field1358[0] == 1 && class25.field616[0] == 1) {
                class98.field1810[3].method1084(var6 + 15, 4);
            } else {
                class98.field1810[1].method1084(var6 + 15, 4);
            }
            arg1.method938(field2535, var6 + 32, 17, 16777215, -1);
            if (class71.field1358[0] == 2 && class25.field616[0] == 0) {
                class98.field1810[2].method1084(var5, 4);
            } else {
                class98.field1810[0].method1084(var5, 4);
            }
            if (class71.field1358[0] == 2 && class25.field616[0] == 1) {
                class98.field1810[3].method1084(var5 + 15, 4);
            } else {
                class98.field1810[1].method1084(var5 + 15, 4);
            }
            arg1.method938(class182.field3294, var5 + 32, 17, 16777215, -1);
            if (class71.field1358[0] == 3 && class25.field616[0] == 0) {
                class98.field1810[2].method1084(var7, 4);
            } else {
                class98.field1810[0].method1084(var7, 4);
            }
            if (class71.field1358[0] == 3 && class25.field616[0] == 1) {
                class98.field1810[3].method1084(var7 + 15, 4);
            } else {
                class98.field1810[1].method1084(var7 + 15, 4);
            }
            arg1.method938(class145.field2670, var7 + 32, 17, 16777215, -1);
        }
        class83.method579(700, 4, 58, 16, 0);
        arg2.method935(class208.field3737, 729, 16, 16777215, -1);
        class100.field1826 = -1;
        if (class173.field3118 == null) {
            return;
        }
        byte var8 = 88;
        byte var9 = 19;
        int var10 = 765 / (var8 + 1);
        int var11 = 480 / (var9 + 1);
        int var12;
        int var13;
        do {
            var12 = var11;
            var13 = var10;
            if (class98.field1804 <= (var10 - 1) * var11) {
                var10--;
            }
            if ((var11 - 1) * var10 >= class98.field1804) {
                var11--;
            }
            if (class98.field1804 <= (var11 - 1) * var10) {
                var11--;
            }
        } while (var11 != var12 || var10 != var13);
        int var14 = (765 - var8 * var10) / (var10 + 1);
        if (var14 > 5) {
            var14 = 5;
        }
        int var15 = (480 - var9 * var11) / (var11 + 1);
        int var16 = (765 - (var10 - 1) * var14 - var8 * var10) / 2;
        if (var15 > 5) {
            var15 = 5;
        }
        int var17 = var16;
        int var18 = 0;
        int var19 = (480 - (var11 - 1) * var15 - var9 * var11) / 2;
        int var20 = var19 + 23;
        for (int var21 = 0; var21 < class98.field1804; var21++) {
            boolean var22 = true;
            class128 var23 = class202.field3655[var21];
            class117 var24 = class42.method358(var23.field2364, (byte) 34);
            if (var23.field2364 == -1) {
                var24 = class158.field2870;
                var22 = false;
            } else if (var23.field2364 > 1980) {
                var22 = false;
                var24 = class9.field169;
            }
            if (class137.field2479 >= var17 && class199.field3571 >= var20 && var8 + var17 > class137.field2479 && var20 + var9 > class199.field3571 && var22) {
                class100.field1826 = var21;
                class173.field3118[var23.field2363 ? 1 : 0].method264(var17, var20, 128, 16777215);
            } else {
                class173.field3118[var23.field2363 ? 1 : 0].method275(var17, var20);
            }
            if (class214.field3885 != null) {
                class214.field3885[(var23.field2363 ? 8 : 0) + var23.field2370].method1084(var17 + 29, var20);
            }
            arg1.method935(class42.method358(var23.field2378, (byte) 34), var17 + 15, var20 + 5 - -(var9 / 2), 0, -1);
            arg2.method935(var24, var17 + 60, var9 / 2 + 5 + var20, 268435455, -1);
            var20 += var9 + var15;
            int var10000 = ~var11;
            var18++;
            if (var10000 >= ~var18) {
                var17 += var14 + var8;
                var18 = 0;
                var20 = var19 + 23;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)[Lnb;")
    public static final class144[] method950(byte arg0) {
        field2537++;
        if (arg0 != -107) {
            field2530 = 14;
        }
        class144[] var1 = new class144[class203.field3668];
        for (int var2 = 0; var2 < class203.field3668; var2++) {
            int var3 = class204.field3690[var2] * class11.field376[var2];
            byte[] var4 = class105.field1921[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class122.field2287[class209.method1370(var4[var6], 255)];
            }
            var1[var2] = new class144(class106.field1934, class199.field3582, class100.field1827[var2], class106.field1927[var2], class204.field3690[var2], class11.field376[var2], var5);
        }
        class45.method376(arg0 + 5958);
        return var1;
    }
}
