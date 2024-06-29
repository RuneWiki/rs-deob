import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 extends class24 {

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "Lv;")
    private static class122 field2435 = class55.method425(-90, " has logged out)3");

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field2432 = -1;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field2438 = -1;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "[[I")
    private static int[][] field2444 = new int[104][104];

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field2433 = -1;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "Lv;")
    public static class122 field2439 = class55.method425(-114, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field2436 = 0;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "Lv;")
    public static class122 field2447 = field2435;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Lrd;")
    public class106 field2440;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Lkb;")
    public static class62 field2437;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Lne;")
    public class83 field2445;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Z")
    public static boolean field2434;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "[B")
    public byte[] field2441;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)[Lvb;", line = 13)
    public static final class124[] method750(int arg0) {
        field2446++;
        class124[] var1 = new class124[class119.field2898];
        for (int var2 = arg0; var2 < class119.field2898; var2++) {
            class124 var3 = var1[var2] = new class124();
            var3.field3022 = class49.field1251;
            var3.field3024 = client.field455;
            var3.field3018 = class118.field2847[var2];
            var3.field3019 = class45.field1169[var2];
            var3.field3021 = class89.field2271[var2];
            var3.field3020 = class60.field1542[var2];
            byte[] var4 = class118.field2838[var2];
            int var5 = var3.field3021 * var3.field3020;
            var3.field3023 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field3023[var6] = class82.field2142[class30.method286(var4[var6], 255)];
            }
        }
        class61.method469(arg0 + 98);
        return var1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZIIIIIIIIII)Z", line = 62)
    public static final boolean method751(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                field2444[var12][var36] = 0;
                class55.field1454[var12][var36] = 99999999;
            }
        }
        field2448++;
        field2444[arg4][arg10] = 99;
        class55.field1454[arg4][arg10] = 0;
        int var13 = arg10;
        int var14 = arg4;
        byte var15 = 0;
        class119.field2875[var15] = arg4;
        int var37 = var15 + 1;
        class58.field1516[var15] = arg10;
        boolean var16 = false;
        int var17 = 0;
        int[][] var18 = class41.field1048[class34.field848].field388;
        int var19 = class119.field2875.length;
        while (var37 != var17) {
            var14 = class119.field2875[var17];
            var13 = class58.field1516[var17];
            var17 = (var17 + 1) % var19;
            if (arg6 == var14 && arg9 == var13) {
                var16 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class41.field1048[class34.field848].method155(arg2 - 1, arg6, (byte) 60, var13, arg5, arg9, var14)) {
                    var16 = true;
                    break;
                }
                if (arg2 < 10 && class41.field1048[class34.field848].method156(arg9, arg8 - 354, arg5, var13, arg2 - 1, var14, arg6)) {
                    var16 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg7 != 0 && class41.field1048[class34.field848].method158(var13, arg9, false, var14, arg6, arg0, arg7, arg3)) {
                var16 = true;
                break;
            }
            int var35 = class55.field1454[var14][var13] + 1;
            if (var14 > 0 && field2444[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x1280108) == 0) {
                class119.field2875[var37] = var14 - 1;
                class58.field1516[var37] = var13;
                var37 = (var37 + 1) % var19;
                field2444[var14 - 1][var13] = 2;
                class55.field1454[var14 - 1][var13] = var35;
            }
            if (var14 < 103 && field2444[var14 + 1][var13] == 0 && (var18[var14 + 1][var13] & 0x1280180) == 0) {
                class119.field2875[var37] = var14 + 1;
                class58.field1516[var37] = var13;
                field2444[var14 + 1][var13] = 8;
                var37 = (var37 + 1) % var19;
                class55.field1454[var14 + 1][var13] = var35;
            }
            if (var13 > 0 && field2444[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x1280102) == 0) {
                class119.field2875[var37] = var14;
                class58.field1516[var37] = var13 - 1;
                var37 = (var37 + 1) % var19;
                field2444[var14][var13 - 1] = 1;
                class55.field1454[var14][var13 - 1] = var35;
            }
            if (var13 < 103 && field2444[var14][var13 + 1] == 0 && (var18[var14][var13 + 1] & 0x1280120) == 0) {
                class119.field2875[var37] = var14;
                class58.field1516[var37] = var13 + 1;
                var37 = (var37 + 1) % var19;
                field2444[var14][var13 + 1] = 4;
                class55.field1454[var14][var13 + 1] = var35;
            }
            if (var14 > 0 && var13 > 0 && field2444[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13 - 1] & 0x128010E) == 0 && (var18[var14 - 1][var13] & 0x1280108) == 0 && (var18[var14][var13 - 1] & 0x1280102) == 0) {
                class119.field2875[var37] = var14 - 1;
                class58.field1516[var37] = var13 - 1;
                field2444[var14 - 1][var13 - 1] = 3;
                class55.field1454[var14 - 1][var13 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var14 < 103 && var13 > 0 && field2444[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x1280183) == 0 && (var18[var14 + 1][var13] & 0x1280180) == 0 && (var18[var14][var13 - 1] & 0x1280102) == 0) {
                class119.field2875[var37] = var14 + 1;
                class58.field1516[var37] = var13 - 1;
                field2444[var14 + 1][var13 - 1] = 9;
                class55.field1454[var14 + 1][var13 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var14 > 0 && var13 < 103 && field2444[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x1280138) == 0 && (var18[var14 - 1][var13] & 0x1280108) == 0 && (var18[var14][var13 + 1] & 0x1280120) == 0) {
                class119.field2875[var37] = var14 - 1;
                class58.field1516[var37] = var13 + 1;
                var37 = (var37 + 1) % var19;
                field2444[var14 - 1][var13 + 1] = 6;
                class55.field1454[var14 - 1][var13 + 1] = var35;
            }
            if (var14 < 103 && var13 < 103 && field2444[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 1] & 0x12801E0) == 0 && (var18[var14 + 1][var13] & 0x1280180) == 0 && (var18[var14][var13 + 1] & 0x1280120) == 0) {
                class119.field2875[var37] = var14 + 1;
                class58.field1516[var37] = var13 + 1;
                field2444[var14 + 1][var13 + 1] = 12;
                class55.field1454[var14 + 1][var13 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
        }
        class50.field1280 = 0;
        if (!var16) {
            if (!arg1) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg6 - var22; var23 <= arg6 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class55.field1454[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg6 > var23) {
                            var25 = arg6 - var23;
                        } else if (var23 > arg3 + arg6 - 1) {
                            var25 = var23 + 1 - arg3 - arg6;
                        }
                        int var26 = 0;
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (arg7 + arg9 - 1 < var24) {
                            var26 = var24 + 1 - arg7 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && var21 > class55.field1454[var23][var24]) {
                            var20 = var27;
                            var21 = class55.field1454[var23][var24];
                            var14 = var23;
                            var13 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg10 == var13) {
                return false;
            }
            class50.field1280 = 1;
        }
        byte var28 = 0;
        class119.field2875[var28] = var14;
        int var38 = var28 + 1;
        class58.field1516[var28] = var13;
        int var29;
        int var30 = var29 = field2444[var14][var13];
        while (arg4 != var14 || arg10 != var13) {
            if (var29 != var30) {
                class119.field2875[var38] = var14;
                var29 = var30;
                class58.field1516[var38++] = var13;
            }
            if ((var30 & 0x1) != 0) {
                var13++;
            } else if ((var30 & 0x4) != 0) {
                var13--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = field2444[var14][var13];
        }
        if (arg8 != 127) {
            return true;
        } else if (var38 > 0) {
            int var31 = var38--;
            int var32 = class119.field2875[var38];
            int var33 = class58.field1516[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            if (arg11 == 0) {
                class19.field472++;
                class74.field1935.method996((byte) 111, 67);
                class74.field1935.method523(255, var31 + var31 + 3);
            }
            if (arg11 == 1) {
                class72.field1872++;
                class74.field1935.method996((byte) 77, 132);
                class74.field1935.method523(255, var31 + var31 + 3 + 14);
            }
            if (arg11 == 2) {
                class10.field217++;
                class74.field1935.method996((byte) 71, 33);
                class74.field1935.method523(255, var31 + var31 + 3);
            }
            class74.field1935.method521(var33 + class51.field1286, 1198495528);
            class106.field2635 = class119.field2875[0];
            class66.field1699 = class58.field1516[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class74.field1935.method515(class119.field2875[var38] - var32, true);
                class74.field1935.method523(255, class58.field1516[var38] - var33);
            }
            class74.field1935.method479(1436108328, class2.field77 + var32);
            class74.field1935.method512(class131.field3172[82] ? 1 : 0, -23019);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z", line = 402)
    public static final boolean method752(byte arg0, int arg1) {
        int var2 = -96 % ((arg0 + 39) / 36);
        field2443++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V", line = 456)
    public static void method753(byte arg0) {
        field2447 = null;
        int var1 = 26 / ((arg0 - 9) / 57);
        field2437 = null;
        field2444 = null;
        field2439 = null;
        field2435 = null;
    }
}
