import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class82 {

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Ldc;")
    public static class37 field1460 = class185.method1233((byte) 86, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1454 = 0;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1458 = 100;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
    public static int[] field1452;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
    public static int[] field1461;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Lcf;")
    public static final class29 method559(int arg0, int arg1) {
        class29 var2 = (class29) class96.field1682.method87(116, (long) arg1);
        if (arg0 >= -48) {
            return null;
        }
        field1456++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field817.method1547(arg1, 0, 16);
        class29 var4 = new class29();
        if (var3 != null) {
            var4.method239((byte) -73, new class28(var3));
        }
        class96.field1682.method92((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method560(boolean arg0) {
        field1462++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class97.field1701 - 1; var2++) {
                if (class171.field3281[var2] < 1000 && class171.field3281[var2 + 1] > 1000) {
                    var1 = false;
                    class37 var3 = class220.field4088[var2];
                    class220.field4088[var2] = class220.field4088[var2 + 1];
                    class220.field4088[var2 + 1] = var3;
                    class37 var4 = class231.field4234[var2];
                    class231.field4234[var2] = class231.field4234[var2 + 1];
                    class231.field4234[var2 + 1] = var4;
                    int var5 = class73.field1302[var2];
                    class73.field1302[var2] = class73.field1302[var2 + 1];
                    class73.field1302[var2 + 1] = var5;
                    int var6 = class195.field3649[var2];
                    class195.field3649[var2] = class195.field3649[var2 + 1];
                    class195.field3649[var2 + 1] = var6;
                    short var7 = class171.field3281[var2];
                    class171.field3281[var2] = class171.field3281[var2 + 1];
                    class171.field3281[var2 + 1] = var7;
                    long var8 = class183.field3392[var2];
                    class183.field3392[var2] = class183.field3392[var2 + 1];
                    class183.field3392[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
    public static final void method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1457++;
        for (int var6 = arg5; var6 <= arg3 + arg5; var6++) {
            for (int var11 = arg4; var11 <= arg1 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class190.field3521[arg2][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg5; var7 < arg5 + arg3; var7++) {
            for (int var10 = arg4; var10 < arg1 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class39.field808[arg2][var10][var7] = arg2 > 0 ? class39.field808[arg2 - 1][var10][var7] : 0;
                }
            }
        }
        if (~arg4 < arg0 && arg4 < 104) {
            for (int var8 = arg5 + 1; var8 < arg3 + arg5; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class39.field808[arg2][arg4][var8] = class39.field808[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var9 = arg4 + 1; var9 < arg1 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class39.field808[arg2][var9][arg5] = class39.field808[arg2][var9][arg5 - 1];
                }
            }
        }
        if (arg4 < 0 || arg5 < 0 || arg4 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 <= 0 || class39.field808[arg2][arg4 - 1][arg5] == 0) {
                if (arg5 > 0 && class39.field808[arg2][arg4][arg5 - 1] != 0) {
                    class39.field808[arg2][arg4][arg5] = class39.field808[arg2][arg4][arg5 - 1];
                    return;
                }
                if (arg4 > 0 && arg5 > 0 && class39.field808[arg2][arg4 - 1][arg5 - 1] != 0) {
                    class39.field808[arg2][arg4][arg5] = class39.field808[arg2][arg4 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            class39.field808[arg2][arg4][arg5] = class39.field808[arg2][arg4 - 1][arg5];
        } else if (arg4 <= 0 || class39.field808[arg2 - 1][arg4 - 1][arg5] == class39.field808[arg2][arg4 - 1][arg5]) {
            if (arg5 > 0 && class39.field808[arg2 - 1][arg4][arg5 - 1] != class39.field808[arg2][arg4][arg5 - 1]) {
                class39.field808[arg2][arg4][arg5] = class39.field808[arg2][arg4][arg5 - 1];
                return;
            }
            if (arg4 > 0 && arg5 > 0 && class39.field808[arg2][arg4 - 1][arg5 - 1] != class39.field808[arg2 - 1][arg4 - 1][arg5 - 1]) {
                class39.field808[arg2][arg4][arg5] = class39.field808[arg2][arg4 - 1][arg5 - 1];
                return;
            }
        } else {
            class39.field808[arg2][arg4][arg5] = class39.field808[arg2][arg4 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Ldc;")
    public static final class37 method562(byte arg0, int arg1) {
        field1453++;
        if (arg1 < 999999999) {
            return class151.method1034((byte) -9, arg1);
        } else {
            if (arg0 != 103) {
                method564(71);
            }
            return class62.field1140;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIZIIIZIII)Z")
    public static final boolean method563(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field1459++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class177.field3340[var12][var31] = 0;
                class192.field3591[var12][var31] = 99999999;
            }
        }
        class177.field3340[arg5][arg2] = 99;
        int var13 = arg5;
        class192.field3591[arg5][arg2] = 0;
        int var14 = arg2;
        byte var15 = 0;
        class97.field1697[var15] = arg5;
        int var32 = var15 + 1;
        class145.field2777[var15] = arg2;
        int var16 = 0;
        int[][] var17 = class11.field143[class125.field2246].field3080;
        boolean var18 = arg8;
        while (var32 != var16) {
            var14 = class145.field2777[var16];
            var13 = class97.field1697[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg1 == var13 && arg11 == var14) {
                var18 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class11.field143[class125.field2246].method1103((byte) -87, arg10 - 1, arg0, arg1, var14, 1, var13, arg11)) {
                    var18 = true;
                    break;
                }
                if (arg10 < 10 && class11.field143[class125.field2246].method1101(arg1, (byte) 111, var14, var13, arg11, arg0, arg10 - 1, 1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg9 != 0 && class11.field143[class125.field2246].method1088(arg11, arg1, var13, arg6, 1, var14, arg7, arg9, (byte) -124)) {
                var18 = true;
                break;
            }
            int var30 = class192.field3591[var13][var14] + 1;
            if (var13 > 0 && class177.field3340[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0) {
                class97.field1697[var32] = var13 - 1;
                class145.field2777[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class177.field3340[var13 - 1][var14] = 2;
                class192.field3591[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class177.field3340[var13 + 1][var14] == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0) {
                class97.field1697[var32] = var13 + 1;
                class145.field2777[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class177.field3340[var13 + 1][var14] = 8;
                class192.field3591[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class177.field3340[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class97.field1697[var32] = var13;
                class145.field2777[var32] = var14 - 1;
                class177.field3340[var13][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class192.field3591[var13][var14 - 1] = var30;
            }
            if (var14 < 103 && class177.field3340[var13][var14 + 1] == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class97.field1697[var32] = var13;
                class145.field2777[var32] = var14 + 1;
                class177.field3340[var13][var14 + 1] = 4;
                class192.field3591[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class177.field3340[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class97.field1697[var32] = var13 - 1;
                class145.field2777[var32] = var14 - 1;
                class177.field3340[var13 - 1][var14 - 1] = 3;
                class192.field3591[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && var14 > 0 && class177.field3340[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class97.field1697[var32] = var13 + 1;
                class145.field2777[var32] = var14 - 1;
                class177.field3340[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class192.field3591[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class177.field3340[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class97.field1697[var32] = var13 - 1;
                class145.field2777[var32] = var14 + 1;
                class177.field3340[var13 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class192.field3591[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class177.field3340[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class97.field1697[var32] = var13 + 1;
                class145.field2777[var32] = var14 + 1;
                class177.field3340[var13 + 1][var14 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class192.field3591[var13 + 1][var14 + 1] = var30;
            }
        }
        class173.field3301 = 0;
        if (!var18) {
            if (!arg4) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg1 - var21; var22 <= arg1 + var21; var22++) {
                for (int var23 = arg11 - var21; var23 <= arg11 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class192.field3591[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg1 > var22) {
                            var24 = arg1 - var22;
                        } else if (var22 > arg1 + arg6 - 1) {
                            var24 = var22 + 1 - arg1 - arg6;
                        }
                        int var25 = 0;
                        if (var23 < arg11) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg11 + arg9 - 1) {
                            var25 = var23 + 1 - arg11 - arg9;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var20 > class192.field3591[var22][var23]) {
                            var13 = var22;
                            var20 = class192.field3591[var22][var23];
                            var14 = var23;
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg2 == var14) {
                return false;
            }
            class173.field3301 = 1;
        }
        byte var27 = 0;
        class97.field1697[var27] = var13;
        int var33 = var27 + 1;
        class145.field2777[var27] = var14;
        int var28;
        int var29 = var28 = class177.field3340[var13][var14];
        while (arg5 != var13 || arg2 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class97.field1697[var33] = var13;
                class145.field2777[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class177.field3340[var13][var14];
        }
        if (var33 > 0) {
            class30.method245(true, var33, class145.field2777, class97.field1697, arg3);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method564(int arg0) {
        if (arg0 == -18540) {
            field1460 = null;
            field1461 = null;
            field1452 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILp;IZIZIIIIZI)V")
    public static final void method565(int arg0, class163 arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        int var12 = -127 % ((-arg7 - 55) / 58);
        field1455++;
        if (arg3 && (class193.field3602[0][arg9][arg0] & 0x2) == 0) {
            if ((class193.field3602[arg4][arg9][arg0] & 0x10) != 0) {
                return;
            }
            if (class37.method307(arg0, 89, arg9, arg4) != class41.field859) {
                return;
            }
        }
        if (arg4 < class65.field1172) {
            class65.field1172 = arg4;
        }
        class30 var13 = class73.method519(arg11, -21035);
        int[][] var14 = class39.field808[arg8];
        int var15;
        int var16;
        if (arg2 == 1 || arg2 == 3) {
            var15 = var13.field560;
            var16 = var13.field562;
        } else {
            var15 = var13.field562;
            var16 = var13.field560;
        }
        int var17;
        int var18;
        if (arg9 + var16 <= 104) {
            var17 = arg9 + (var16 + 1 >> 1);
            var18 = arg9 + (var16 >> 1);
        } else {
            var18 = arg9;
            var17 = arg9 + 1;
        }
        int var19;
        int var20;
        if (arg0 + var15 <= 104) {
            var19 = arg0 + (var15 + 1 >> 1);
            var20 = (var15 >> 1) + arg0;
        } else {
            var19 = arg0 + 1;
            var20 = arg0;
        }
        int var21 = (arg9 << 7) + (var16 << 6);
        int var22 = (arg0 << 7) + (var15 << 6);
        int var23 = var14[var17][var20] + var14[var18][var19] + var14[var17][var19] + var14[var18][var20] >> 2;
        int[][] var24 = null;
        if (arg10) {
            var24 = class78.field1370[0];
        } else if (arg8 < 3) {
            var24 = class39.field808[arg8 + 1];
        }
        long var25 = (long) (arg2 << 20 | arg6 << 14 | arg0 << 7 | arg9 | 0x40000000);
        if (var13.field601 == 0 || arg10) {
            var25 |= Long.MIN_VALUE;
        }
        if (var13.field591 == 1) {
            var25 |= 0x400000L;
        }
        if (arg5 && var13.method255(-1)) {
            class131.method919(arg9, false, arg0, var13, arg4, arg2);
        }
        long var27 = var25 | (long) arg11 << 32;
        if (arg6 == 22) {
            if (!arg3 || var13.field601 != 0 || var13.field614 == 1 || var13.field593) {
                class88 var30;
                if (var13.field584 == -1 && var13.field554 == null) {
                    class17 var29 = var13.method246(false, 22, arg5, var24, var14, var22, var21, arg2, var23);
                    var30 = var29.field264;
                } else {
                    var30 = new class86(arg11, 22, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
                }
                class207.method1373(arg4, arg9, arg0, var23, var30, var27, var13.field549);
                if (var13.field614 == 1 && arg1 != null) {
                    arg1.method1095(arg9, -111, arg0);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class88 var70;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var69 = var13.method246(false, 10, arg5, var24, var14, var22, var21, arg2, var23);
                var70 = var69.field264;
            } else {
                var70 = new class86(arg11, 10, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            if (var70 != null) {
                boolean var71 = class210.method1398(arg4, arg9, arg0, var23, var16, var15, var70, arg6 == 11 ? 256 : 0, var27);
                if (var13.field582 && var71 && arg5) {
                    int var72 = 15;
                    if (var70 instanceof class1) {
                        var72 = ((class1) var70).method13() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var16; var73++) {
                        for (int var74 = 0; var74 <= var15; var74++) {
                            if (var72 > class190.field3521[arg4][arg9 + var73][arg0 + var74]) {
                                class190.field3521[arg4][arg9 + var73][arg0 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var13.field614 != 0 && arg1 != null) {
                arg1.method1091(var13.field571, arg0, var15, var16, 256, arg9);
            }
        } else if (arg6 >= 12) {
            class88 var32;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var31 = var13.method246(false, arg6, arg5, var24, var14, var22, var21, arg2, var23);
                var32 = var31.field264;
            } else {
                var32 = new class86(arg11, arg6, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class210.method1398(arg4, arg9, arg0, var23, 1, 1, var32, 0, var27);
            if (arg5 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg4 > 0) {
                class119.field2135[arg4][arg9][arg0] = class138.method960(class119.field2135[arg4][arg9][arg0], 2340);
            }
            if (var13.field614 != 0 && arg1 != null) {
                arg1.method1091(var13.field571, arg0, var15, var16, 256, arg9);
            }
        } else if (arg6 == 0) {
            class88 var34;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var33 = var13.method246(false, 0, arg5, var24, var14, var22, var21, arg2, var23);
                var34 = var33.field264;
            } else {
                var34 = new class86(arg11, 0, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class70.method509(arg4, arg9, arg0, var23, var34, null, class217.field4056[arg2], 0, var27);
            if (arg5) {
                if (arg2 == 0) {
                    if (var13.field582) {
                        class190.field3521[arg4][arg9][arg0] = 50;
                        class190.field3521[arg4][arg9][arg0 + 1] = 50;
                    }
                    if (var13.field579) {
                        class119.field2135[arg4][arg9][arg0] = class138.method960(class119.field2135[arg4][arg9][arg0], 585);
                    }
                } else if (arg2 == 1) {
                    if (var13.field582) {
                        class190.field3521[arg4][arg9][arg0 + 1] = 50;
                        class190.field3521[arg4][arg9 + 1][arg0 + 1] = 50;
                    }
                    if (var13.field579) {
                        class119.field2135[arg4][arg9][arg0 + 1] = class138.method960(class119.field2135[arg4][arg9][arg0 + 1], 1170);
                    }
                } else if (arg2 == 2) {
                    if (var13.field582) {
                        class190.field3521[arg4][arg9 + 1][arg0] = 50;
                        class190.field3521[arg4][arg9 + 1][arg0 + 1] = 50;
                    }
                    if (var13.field579) {
                        class119.field2135[arg4][arg9 + 1][arg0] = class138.method960(class119.field2135[arg4][arg9 + 1][arg0], 585);
                    }
                } else if (arg2 == 3) {
                    if (var13.field582) {
                        class190.field3521[arg4][arg9][arg0] = 50;
                        class190.field3521[arg4][arg9 + 1][arg0] = 50;
                    }
                    if (var13.field579) {
                        class119.field2135[arg4][arg9][arg0] = class138.method960(class119.field2135[arg4][arg9][arg0], 1170);
                    }
                }
            }
            if (var13.field614 != 0 && arg1 != null) {
                arg1.method1107(var13.field571, arg0, arg2, 60, arg9, arg6);
            }
            if (var13.field587 != 16) {
                class163.method1104(arg4, arg9, arg0, var13.field587);
            }
        } else if (arg6 == 1) {
            class88 var36;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var35 = var13.method246(false, 1, arg5, var24, var14, var22, var21, arg2, var23);
                var36 = var35.field264;
            } else {
                var36 = new class86(arg11, 1, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class70.method509(arg4, arg9, arg0, var23, var36, null, class75.field1337[arg2], 0, var27);
            if (var13.field582 && arg5) {
                if (arg2 == 0) {
                    class190.field3521[arg4][arg9][arg0 + 1] = 50;
                } else if (arg2 == 1) {
                    class190.field3521[arg4][arg9 + 1][arg0 + 1] = 50;
                } else if (arg2 == 2) {
                    class190.field3521[arg4][arg9 + 1][arg0] = 50;
                } else if (arg2 == 3) {
                    class190.field3521[arg4][arg9][arg0] = 50;
                }
            }
            if (var13.field614 != 0 && arg1 != null) {
                arg1.method1107(var13.field571, arg0, arg2, -14, arg9, arg6);
            }
        } else if (arg6 == 2) {
            int var37 = arg2 + 1 & 0x3;
            class88 var39;
            class88 var41;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var38 = var13.method246(false, 2, arg5, var24, var14, var22, var21, arg2 + 4, var23);
                var39 = var38.field264;
                class17 var40 = var13.method246(false, 2, arg5, var24, var14, var22, var21, var37, var23);
                var41 = var40.field264;
            } else {
                var39 = new class86(arg11, 2, arg2 + 4, arg8, arg9, arg0, var13.field584, var13.field576, null);
                var41 = new class86(arg11, 2, var37, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class70.method509(arg4, arg9, arg0, var23, var39, var41, class217.field4056[arg2], class217.field4056[var37], var27);
            if (var13.field579 && arg5) {
                if (arg2 == 0) {
                    class119.field2135[arg4][arg9][arg0] = class138.method960(class119.field2135[arg4][arg9][arg0], 585);
                    class119.field2135[arg4][arg9][arg0 + 1] = class138.method960(class119.field2135[arg4][arg9][arg0 + 1], 1170);
                } else if (arg2 == 1) {
                    class119.field2135[arg4][arg9][arg0 + 1] = class138.method960(class119.field2135[arg4][arg9][arg0 + 1], 1170);
                    class119.field2135[arg4][arg9 + 1][arg0] = class138.method960(class119.field2135[arg4][arg9 + 1][arg0], 585);
                } else if (arg2 == 2) {
                    class119.field2135[arg4][arg9 + 1][arg0] = class138.method960(class119.field2135[arg4][arg9 + 1][arg0], 585);
                    class119.field2135[arg4][arg9][arg0] = class138.method960(class119.field2135[arg4][arg9][arg0], 1170);
                } else if (arg2 == 3) {
                    class119.field2135[arg4][arg9][arg0] = class138.method960(class119.field2135[arg4][arg9][arg0], 1170);
                    class119.field2135[arg4][arg9][arg0] = class138.method960(class119.field2135[arg4][arg9][arg0], 585);
                }
            }
            if (var13.field614 != 0 && arg1 != null) {
                arg1.method1107(var13.field571, arg0, arg2, 31, arg9, arg6);
            }
            if (var13.field587 != 16) {
                class163.method1104(arg4, arg9, arg0, var13.field587);
            }
        } else if (arg6 == 3) {
            class88 var43;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var42 = var13.method246(false, 3, arg5, var24, var14, var22, var21, arg2, var23);
                var43 = var42.field264;
            } else {
                var43 = new class86(arg11, 3, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class70.method509(arg4, arg9, arg0, var23, var43, null, class75.field1337[arg2], 0, var27);
            if (var13.field582 && arg5) {
                if (arg2 == 0) {
                    class190.field3521[arg4][arg9][arg0 + 1] = 50;
                } else if (arg2 == 1) {
                    class190.field3521[arg4][arg9 + 1][arg0 + 1] = 50;
                } else if (arg2 == 2) {
                    class190.field3521[arg4][arg9 + 1][arg0] = 50;
                } else if (arg2 == 3) {
                    class190.field3521[arg4][arg9][arg0] = 50;
                }
            }
            if (var13.field614 != 0 && arg1 != null) {
                arg1.method1107(var13.field571, arg0, arg2, 98, arg9, arg6);
            }
        } else if (arg6 == 9) {
            class88 var45;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var44 = var13.method246(false, arg6, arg5, var24, var14, var22, var21, arg2, var23);
                var45 = var44.field264;
            } else {
                var45 = new class86(arg11, arg6, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class210.method1398(arg4, arg9, arg0, var23, 1, 1, var45, 0, var27);
            if (var13.field614 != 0 && arg1 != null) {
                arg1.method1091(var13.field571, arg0, var15, var16, 256, arg9);
            }
            if (var13.field587 != 16) {
                class163.method1104(arg4, arg9, arg0, var13.field587);
            }
        } else if (arg6 == 4) {
            class88 var47;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var46 = var13.method246(false, 4, arg5, var24, var14, var22, var21, arg2, var23);
                var47 = var46.field264;
            } else {
                var47 = new class86(arg11, 4, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class152.method1039(arg4, arg9, arg0, var23, var47, null, class217.field4056[arg2], 0, 0, 0, var27);
        } else if (arg6 == 5) {
            int var48 = 16;
            long var49 = client.method276(arg4, arg9, arg0);
            if (var49 != 0L) {
                var48 = class73.method519(Integer.MAX_VALUE & (int) (var49 >>> 32), -21035).field587;
            }
            class88 var52;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var51 = var13.method246(false, 4, arg5, var24, var14, var22, var21, arg2, var23);
                var52 = var51.field264;
            } else {
                var52 = new class86(arg11, 4, arg2, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class152.method1039(arg4, arg9, arg0, var23, var52, null, class217.field4056[arg2], 0, class180.field3353[arg2] * var48, class120.field2148[arg2] * var48, var27);
        } else if (arg6 == 6) {
            int var53 = 8;
            long var54 = client.method276(arg4, arg9, arg0);
            if (var54 != 0L) {
                var53 = class73.method519((int) (var54 >>> 32) & Integer.MAX_VALUE, -21035).field587 / 2;
            }
            class88 var57;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var56 = var13.method246(false, 4, arg5, var24, var14, var22, var21, arg2 + 4, var23);
                var57 = var56.field264;
            } else {
                var57 = new class86(arg11, 4, arg2 + 4, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class152.method1039(arg4, arg9, arg0, var23, var57, null, 256, arg2, class92.field1573[arg2] * var53, class23.field404[arg2] * var53, var27);
        } else if (arg6 == 7) {
            int var58 = arg2 + 2 & 0x3;
            class88 var60;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var59 = var13.method246(false, 4, arg5, var24, var14, var22, var21, var58 + 4, var23);
                var60 = var59.field264;
            } else {
                var60 = new class86(arg11, 4, var58 + 4, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class152.method1039(arg4, arg9, arg0, var23, var60, null, 256, var58, 0, 0, var27);
        } else if (arg6 == 8) {
            int var61 = 8;
            long var62 = client.method276(arg4, arg9, arg0);
            if (var62 != 0L) {
                var61 = class73.method519((int) (var62 >>> 32) & Integer.MAX_VALUE, -21035).field587 / 2;
            }
            int var64 = arg2 + 2 & 0x3;
            class88 var66;
            class88 var68;
            if (var13.field584 == -1 && var13.field554 == null) {
                class17 var65 = var13.method246(false, 4, arg5, var24, var14, var22, var21, arg2 + 4, var23);
                var66 = var65.field264;
                class17 var67 = var13.method246(false, 4, arg5, var24, var14, var22, var21, var64 + 4, var23);
                var68 = var67.field264;
            } else {
                var66 = new class86(arg11, 4, arg2 + 4, arg8, arg9, arg0, var13.field584, var13.field576, null);
                var68 = new class86(arg11, 4, var64 + 4, arg8, arg9, arg0, var13.field584, var13.field576, null);
            }
            class152.method1039(arg4, arg9, arg0, var23, var66, var68, 256, arg2, class92.field1573[arg2] * var61, class23.field404[arg2] * var61, var27);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static final void method566(int arg0) {
        field1463++;
        if (class223.field4136 == 238) {
            int var1 = class12.field167.method215(-1797813752);
            int var2 = class238.field4378 + (var1 & 0x7);
            int var3 = class41.field860 + (var1 >> 4 & 0x7);
            int var4 = class12.field167.method230((byte) -122);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class12.field167.method215(-1797813752);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = class12.field167.method215(-1797813752);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                int var9 = var6 + 1;
                if (class238.field4382.field3494[0] >= var3 - var9 && class238.field4382.field3494[0] <= var3 + var9 && class238.field4382.field3525[0] >= var2 - var9 && var2 + var9 >= class238.field4382.field3525[0] && class214.field4001 != 0 && var7 > 0 && class225.field4159 < 50 && var4 != -1) {
                    class124.field2213[class225.field4159] = var4;
                    class29.field546[class225.field4159] = var7;
                    class117.field2099[class225.field4159] = var8;
                    class210.field3940[class225.field4159] = null;
                    class198.field3691[class225.field4159] = (var3 << 16) + ((var2 << 8) + var6);
                    class225.field4159++;
                }
            }
        } else if (class223.field4136 == 125) {
            int var10 = class12.field167.method215(-1797813752);
            int var11 = class41.field860 * 2 + (var10 >> 4 & 0xF);
            int var12 = (var10 & 0xF) + class238.field4378 * 2;
            int var13 = var11 + class12.field167.method206(-16933672);
            int var14 = class12.field167.method206(-16933672) + var12;
            int var15 = class12.field167.method228(true);
            int var16 = class12.field167.method230((byte) -109);
            int var17 = class12.field167.method215(-1797813752) * 4;
            int var18 = class12.field167.method215(-1797813752) * 4;
            int var19 = class12.field167.method230((byte) -106);
            int var20 = class12.field167.method230((byte) -98);
            int var21 = class12.field167.method215(-1797813752);
            int var22 = class12.field167.method215(-1797813752);
            if (var11 >= 0 && var12 >= 0 && var11 < 208 && var12 < 208 && var13 >= 0 && var14 >= 0 && var13 < 208 && var14 < 208 && var16 != 65535) {
                int var23 = var13 * 64;
                int var24 = var12 * 64;
                int var25 = var14 * 64;
                int var26 = var11 * 64;
                class171 var27 = new class171(var16, class125.field2246, var26, var24, class145.method1008(class125.field2246, var26, var24, (byte) 127) - var17, class203.field3758 + var19, var20 + class203.field3758, var21, var22, var15, var18);
                var27.method1157(var19 + class203.field3758, var25, var23, class145.method1008(class125.field2246, var23, var25, (byte) -77) - var18, -18499);
                class85.field1496.method1340(-124, new class9(var27));
            }
        } else if (class223.field4136 == 138) {
            int var28 = class12.field167.method230((byte) -114);
            int var29 = class12.field167.method189((byte) 104);
            int var30 = (var29 & 0x7) + class238.field4378;
            int var31 = (var29 >> 4 & 0x7) + class41.field860;
            int var32 = class12.field167.method234((byte) 82);
            if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104) {
                class73 var33 = new class73();
                var33.field1295 = var28;
                var33.field1299 = var32;
                if (class183.field3389[class125.field2246][var31][var30] == null) {
                    class183.field3389[class125.field2246][var31][var30] = new class203();
                }
                class183.field3389[class125.field2246][var31][var30].method1340(-108, new class6(var33));
                class101.method666(var31, var30, (byte) 123);
            }
        } else if (class223.field4136 == 198) {
            int var34 = class12.field167.method215(-1797813752);
            int var35 = (var34 >> 4 & 0x7) + class41.field860;
            int var36 = (var34 & 0x7) + class238.field4378;
            int var37 = class12.field167.method230((byte) -127);
            int var38 = class12.field167.method230((byte) -128);
            int var39 = class12.field167.method230((byte) -106);
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class203 var40 = class183.field3389[class125.field2246][var35][var36];
                if (var40 != null) {
                    for (class6 var41 = (class6) var40.method1338(57); var41 != null; var41 = (class6) var40.method1332((byte) -89)) {
                        class73 var42 = var41.field66;
                        if ((var37 & 0x7FFF) == var42.field1295 && var42.field1299 == var38) {
                            var42.field1299 = var39;
                            break;
                        }
                    }
                    class101.method666(var35, var36, (byte) 122);
                }
            }
        } else if (class223.field4136 == 24) {
            int var43 = class12.field167.method196(127);
            int var44 = class12.field167.method227(-107);
            int var45 = var44 & 0x3;
            int var46 = var44 >> 2;
            int var47 = class168.field3200[var46];
            int var48 = class12.field167.method215(-1797813752);
            int var49 = class41.field860 + (var48 >> 4 & 0x7);
            int var50 = (var48 & 0x7) + class238.field4378;
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                class183.method1225(var50, var43, 0, class125.field2246, var47, -1, -7593, var45, var46, var49);
            }
        } else if (class223.field4136 == 214) {
            int var51 = class12.field167.method215(-1797813752);
            int var52 = class41.field860 + (var51 >> 4 & 0x7);
            int var53 = (var51 & 0x7) + class238.field4378;
            int var54 = class12.field167.method230((byte) -106);
            int var55 = class12.field167.method215(-1797813752);
            int var56 = class12.field167.method230((byte) -111);
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                int var57 = var53 * 128 + 64;
                int var58 = var52 * 128 + 64;
                class185 var59 = new class185(var54, class125.field2246, var58, var57, class145.method1008(class125.field2246, var58, var57, (byte) 115) - var55, var56, class203.field3758);
                class191.field3566.method1340(-117, new class97(var59));
            }
        } else if (class223.field4136 == 134) {
            int var60 = class12.field167.method215(-1797813752);
            int var61 = class41.field860 + (var60 >> 4 & 0x7);
            int var62 = (var60 & 0x7) + class238.field4378;
            int var63 = class12.field167.method196(126);
            if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                class203 var64 = class183.field3389[class125.field2246][var61][var62];
                if (var64 != null) {
                    for (class6 var65 = (class6) var64.method1338(-117); var65 != null; var65 = (class6) var64.method1332((byte) -89)) {
                        if ((var63 & 0x7FFF) == var65.field66.field1295) {
                            var65.method433(0);
                            break;
                        }
                    }
                    if (var64.method1338(71) == null) {
                        class183.field3389[class125.field2246][var61][var62] = null;
                    }
                    class101.method666(var61, var62, (byte) 120);
                }
            }
        } else if (class223.field4136 == 188) {
            int var66 = class12.field167.method215(-1797813752);
            int var67 = (var66 & 0x7) + class238.field4378;
            int var68 = class41.field860 + (var66 >> 4 & 0x7);
            int var69 = class12.field167.method206(-16933672) + var68;
            int var70 = class12.field167.method206(-16933672) + var67;
            int var71 = class12.field167.method228(true);
            int var72 = class12.field167.method230((byte) -121);
            int var73 = class12.field167.method215(-1797813752) * 4;
            int var74 = class12.field167.method215(-1797813752) * 4;
            int var75 = class12.field167.method230((byte) -107);
            int var76 = class12.field167.method230((byte) -118);
            int var77 = class12.field167.method215(-1797813752);
            int var78 = class12.field167.method215(-1797813752);
            if (var68 >= 0 && var67 >= 0 && var68 < 104 && var67 < 104 && var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var72 != 65535) {
                int var79 = var69 * 128 + 64;
                int var80 = var67 * 128 + 64;
                int var81 = var70 * 128 + 64;
                int var82 = var68 * 128 + 64;
                class171 var83 = new class171(var72, class125.field2246, var82, var80, class145.method1008(class125.field2246, var82, var80, (byte) 89) - var73, class203.field3758 + var75, var76 + class203.field3758, var77, var78, var71, var74);
                var83.method1157(var75 + class203.field3758, var81, var79, class145.method1008(class125.field2246, var79, var81, (byte) -102) - var74, -18499);
                class85.field1496.method1340(125, new class9(var83));
            }
        } else if (class223.field4136 == 77) {
            int var84 = class12.field167.method227(-120);
            int var85 = var84 & 0x3;
            int var86 = var84 >> 2;
            int var87 = class168.field3200[var86];
            int var88 = class12.field167.method189((byte) 99);
            int var89 = class41.field860 + (var88 >> 4 & 0x7);
            int var90 = class238.field4378 + (var88 & 0x7);
            if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                class183.method1225(var90, -1, 0, class125.field2246, var87, -1, -7593, var85, var86, var89);
            }
        } else if (class223.field4136 == 16) {
            int var91 = class12.field167.method230((byte) -123);
            int var92 = class12.field167.method196(125);
            int var93 = class12.field167.method234((byte) 82);
            int var94 = class12.field167.method215(-1797813752);
            int var95 = (var94 >> 4 & 0x7) + class41.field860;
            int var96 = (var94 & 0x7) + class238.field4378;
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104 && class75.field1324 != var93) {
                class73 var97 = new class73();
                var97.field1295 = var92;
                var97.field1299 = var91;
                if (class183.field3389[class125.field2246][var95][var96] == null) {
                    class183.field3389[class125.field2246][var95][var96] = new class203();
                }
                class183.field3389[class125.field2246][var95][var96].method1340(113, new class6(var97));
                class101.method666(var95, var96, (byte) 113);
            }
        } else {
            int var98 = 67 % ((arg0 + 15) / 46);
            if (class223.field4136 == 74) {
                int var99 = class12.field167.method227(-117);
                int var100 = (var99 >> 4 & 0x7) + class41.field860;
                int var101 = (var99 & 0x7) + class238.field4378;
                int var102 = class12.field167.method230((byte) -110);
                int var103 = class12.field167.method234((byte) 82);
                byte var104 = class12.field167.method187(-75);
                byte var105 = class12.field167.method194(-18402);
                byte var106 = class12.field167.method206(-16933672);
                byte var107 = class12.field167.method188((byte) 105);
                int var108 = class12.field167.method215(-1797813752);
                int var109 = var108 >> 2;
                int var110 = class168.field3200[var109];
                int var111 = class12.field167.method196(126);
                int var112 = class12.field167.method234((byte) 82);
                class123 var113;
                if (class75.field1324 == var112) {
                    var113 = class238.field4382;
                } else {
                    var113 = class8.field107[var112];
                }
                int var114 = var108 & 0x3;
                if (var113 != null) {
                    class30 var115 = class73.method519(var103, -21035);
                    int var116;
                    int var117;
                    if (var114 == 1 || var114 == 3) {
                        var117 = var115.field560;
                        var116 = var115.field562;
                    } else {
                        var116 = var115.field560;
                        var117 = var115.field562;
                    }
                    int var118 = (var116 >> 1) + var100;
                    int var119 = (var117 >> 1) + var101;
                    int var120 = var100 + (var116 + 1 >> 1);
                    int var121 = (var117 + 1 >> 1) + var101;
                    int[][] var122 = class39.field808[class125.field2246];
                    int[][] var123 = null;
                    if (class125.field2246 < 3) {
                        var123 = class39.field808[class125.field2246 + 1];
                    }
                    int var124 = var122[var120][var119] + var122[var120][var121] + var122[var118][var119] + var122[var118][var121] >> 2;
                    int var125 = (var100 << 7) + (var116 << 6);
                    int var126 = (var101 << 7) + (var117 << 6);
                    class17 var127 = var115.method246(false, var109, false, var123, var122, var126, var125, var114, var124);
                    if (var127 != null) {
                        if (var106 > var105) {
                            byte var128 = var106;
                            var106 = var105;
                            var105 = var128;
                        }
                        if (var104 > var107) {
                            byte var129 = var104;
                            var104 = var107;
                            var107 = var129;
                        }
                        class183.method1225(var101, -1, var111 + 1, class125.field2246, var110, var102 + 1, -7593, 0, 0, var100);
                        var113.field2200 = (class1) var127.field264;
                        var113.field2178 = var111 + class203.field3758;
                        var113.field2209 = class203.field3758 + var102;
                        var113.field2201 = var124;
                        var113.field2188 = var100 + var105;
                        var113.field2185 = var100 + var106;
                        var113.field2189 = var101 + var104;
                        var113.field2177 = var101 * 128 + var117 * 64;
                        var113.field2194 = var101 + var107;
                        var113.field2193 = var100 * 128 + var116 * 64;
                    }
                }
            }
            if (class223.field4136 == 60) {
                int var130 = class12.field167.method212(127);
                int var131 = class41.field860 + (var130 >> 4 & 0x7);
                int var132 = class238.field4378 + (var130 & 0x7);
                int var133 = class12.field167.method234((byte) 82);
                int var134 = class12.field167.method212(126);
                int var135 = var134 & 0x3;
                if (var133 == 65535) {
                    var133 = -1;
                }
                int var136 = var134 >> 2;
                int var137 = class168.field3200[var136];
                class131.method917(104, var137, var131, var132, var133, var136, class125.field2246, var135);
            }
        }
    }
}
