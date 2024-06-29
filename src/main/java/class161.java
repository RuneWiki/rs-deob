import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class161 extends class217 {

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[B")
    public byte[] field2396;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2389 = -1;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "[Lfk;")
    public static class45[] field2394 = new class45[32768];

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field2395 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I", line = 5)
    public static final int method1152(int arg0) {
        field2392++;
        if (arg0 != -1) {
            method1155(14, -37, -56, 36, 125, 16);
        }
        return 15;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)Lwh;", line = 18)
    public static final class10 method1153(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class10 var4 = var3.field1486;
            var3.field1486 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIIZII)Z", line = 32)
    public static final boolean method1154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class248.field3717[var12][var13] = 0;
                class45.field696[var12][var13] = 99999999;
            }
        }
        class248.field3717[arg8][arg10] = 99;
        class45.field696[arg8][arg10] = 0;
        field2390++;
        int var14 = arg8;
        int var15 = arg10;
        boolean var16 = false;
        byte var17 = 0;
        class101.field1548[var17] = arg8;
        int var18 = 0;
        int var33 = var17 + 1;
        class245.field3684[var17] = arg10;
        int[][] var19 = class90.field1309[class50.field775].field5037;
        while (var33 != var18) {
            var14 = class101.field1548[var18];
            var15 = class245.field3684[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg3 == var14 && arg2 == var15) {
                var16 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class90.field1309[class50.field775].method2218(arg4 - 1, (byte) 89, var15, arg11, arg3, arg2, 1, var14)) {
                    var16 = true;
                    break;
                }
                if (arg4 < 10 && class90.field1309[class50.field775].method2215(1, var15, var14, arg3, arg11, -127, arg4 - 1, arg2)) {
                    var16 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg6 != 0 && class90.field1309[class50.field775].method2206(1, false, arg6, arg3, arg7, arg2, var14, var15, arg1)) {
                var16 = true;
                break;
            }
            int var20 = class45.field696[var14][var15] + 1;
            if (var14 > 0 && class248.field3717[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class101.field1548[var33] = var14 - 1;
                class245.field3684[var33] = var15;
                class248.field3717[var14 - 1][var15] = 2;
                var33 = var33 + 1 & 0xFFF;
                class45.field696[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class248.field3717[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class101.field1548[var33] = var14 + 1;
                class245.field3684[var33] = var15;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var14 + 1][var15] = 8;
                class45.field696[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class248.field3717[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class101.field1548[var33] = var14;
                class245.field3684[var33] = var15 - 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var14][var15 - 1] = 1;
                class45.field696[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class248.field3717[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class101.field1548[var33] = var14;
                class245.field3684[var33] = var15 + 1;
                class248.field3717[var14][var15 + 1] = 4;
                class45.field696[var14][var15 + 1] = var20;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 > 0 && class248.field3717[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class101.field1548[var33] = var14 - 1;
                class245.field3684[var33] = var15 - 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var14 - 1][var15 - 1] = 3;
                class45.field696[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class248.field3717[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class101.field1548[var33] = var14 + 1;
                class245.field3684[var33] = var15 - 1;
                class248.field3717[var14 + 1][var15 - 1] = 9;
                var33 = var33 + 1 & 0xFFF;
                class45.field696[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class248.field3717[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class101.field1548[var33] = var14 - 1;
                class245.field3684[var33] = var15 + 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var14 - 1][var15 + 1] = 6;
                class45.field696[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 103 && var15 < 103 && class248.field3717[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class101.field1548[var33] = var14 + 1;
                class245.field3684[var33] = var15 + 1;
                var33 = var33 + 1 & 0xFFF;
                class248.field3717[var14 + 1][var15 + 1] = 12;
                class45.field696[var14 + 1][var15 + 1] = var20;
            }
        }
        class150.field2268 = 0;
        if (!var16) {
            if (!arg9) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg3 - var22; var24 <= (arg3 + var22); var24++) {
                for (int var25 = arg2 - var22; var25 <= arg2 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class45.field696[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var25 < arg2) {
                            var27 = arg2 - var25;
                        } else if (arg2 - (1 - arg6) < var25) {
                            var27 = var25 + 1 - arg2 - arg6;
                        }
                        if (arg3 > var24) {
                            var26 = arg3 - var24;
                        } else if (var24 > (arg3 + arg7 - 1)) {
                            var26 = var24 + 1 - arg3 - arg7;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var23 > class45.field696[var24][var25]) {
                            var15 = var25;
                            var23 = class45.field696[var24][var25];
                            var21 = var28;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg8 == var14 && arg10 == var15) {
                return false;
            }
            class150.field2268 = 1;
        }
        byte var29 = 0;
        class101.field1548[var29] = var14;
        int var34 = var29 + 1;
        class245.field3684[var29] = var15;
        int var30;
        int var31 = var30 = class248.field3717[var14][var15];
        int var32 = 88 / ((arg5 + 33) / 34);
        while (arg8 != var14 || arg10 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class101.field1548[var34] = var14;
                class245.field3684[var34++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class248.field3717[var14][var15];
        }
        if (var34 > 0) {
            class118.method917(0, var34, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V", line = 312)
    public static final void method1155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -26488) {
            return;
        }
        field2388++;
        if (arg0 == arg4) {
            class213.method1539(arg2, arg0, arg1, arg3, 2);
        } else if ((arg3 - arg0) >= class298.field4667 && class327.field5072 >= (arg0 + arg3) && arg2 - arg4 >= class34.field432 && class75.field1064 >= (arg2 + arg4)) {
            class179.method1298(arg4, false, arg3, arg0, arg2, arg1);
        } else {
            class310.method2150(arg4, arg0, arg2, false, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V", line = 336)
    public static void method1156(byte arg0) {
        field2394 = null;
        if (arg0 >= -59) {
            method1152(105);
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)Lom;", line = 353)
    public static final class70 method1157(byte arg0) {
        class70 var1 = new class70(class150.field2273, class98.field1453, class271.field4096[0], class101.field1541[0], class111.field1756[0], class323.field5027[0], class274.field4162[0], class57.field843);
        class265.method1835(10);
        field2391++;
        return arg0 > -90 ? (class70) null : var1;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 370)
    public static final void method1158(int arg0) {
        field2393++;
        if (!class274.field4146) {
            return;
        }
        class87.field1283 = null;
        if (arg0 == 4) {
            class274.field4146 = false;
            class235.field3609 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "([B)V", line = 401)
    public class161(byte[] arg0) {
        this.field2396 = arg0;
    }
}
