import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class254 {

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[J")
    public static long[] field4216 = new long[32];

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Z")
    public static boolean field4219 = false;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Ltl;")
    public static class59 field4226 = class85.method639(":assist:", 9588);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "F")
    public static float field4211;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field4210;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lme;")
    public static class295 field4217;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lme;")
    public static class295 field4221;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Lme;")
    public static class295 field4223;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Loj;", line = 11)
    public static final class260 method1771(byte arg0) {
        field4225++;
        if (arg0 <= 52) {
            field4211 = -0.3935896F;
        }
        int var1 = class41.field615[0] * class236.field3925[0];
        byte[] var2 = class53.field794[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class284.field4879[class93.method680(255, var2[var4])];
        }
        class260 var5;
        if (class55.field815) {
            var5 = new class122(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], var3);
        } else {
            var5 = new class47(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], var3);
        }
        class133.method974((byte) -80);
        return var5;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IJII)Z", line = 45)
    public static final boolean method1772(int arg0, long arg1, int arg2, int arg3) {
        int var5 = ((int) arg1 & 0x3BA7BA) >> 20;
        int var6 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        field4218++;
        int var7 = ((int) arg1 & 0x7DF0C) >> 14;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class180 var8 = class188.method1390(var6, false);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var9 = var8.field3006;
                var10 = var8.field2976;
            } else {
                var9 = var8.field2976;
                var10 = var8.field3006;
            }
            int var11 = var8.field2954;
            if (var5 != 0) {
                var11 = (var11 << var5 & 0xF) + (var11 >> 4 - var5);
            }
            class28.method178(arg0, 2, 0, (byte) -6, class286.field4920.field1729[0], var10, class286.field4920.field1773[0], var11, arg3, 0, var9, true);
        } else {
            class28.method178(arg0, 2, var5, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, arg3, var7 + 1, 0, true);
        }
        class127.field2088 = class231.field3794;
        class223.field3619 = class149.field2444;
        int var12 = 104 / ((-arg2 - 21) / 55);
        class236.field3918 = 0;
        class64.field992 = 2;
        return true;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 97)
    public static void method1773(byte arg0) {
        field4221 = null;
        field4216 = null;
        field4223 = null;
        field4226 = null;
        if (arg0 != -86) {
            field4219 = true;
        }
        field4217 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)I", line = 111)
    public static final int method1774(boolean arg0) {
        field4215++;
        if (arg0) {
            field4217 = (class295) null;
        }
        try {
            if (class248.field4124 == 0) {
                if (class108.field1800 > class205.method1451(-127) - 5000L) {
                    return 0;
                }
                class179.field2936 = class308.field5222.method1293(class288.field4954, (byte) 61, class14.field201);
                class8.field99 = class205.method1451(-7);
                class248.field4124 = 1;
            }
            if (class205.method1451(33) > class8.field99 + 30000L) {
                return class26.method168(1000, 0);
            }
            if (class248.field4124 == 1) {
                if (class179.field2936.field4256 == 2) {
                    return class26.method168(1001, 0);
                }
                if (class179.field2936.field4256 != 1) {
                    return -1;
                }
                class21.field284 = new class171((Socket) class179.field2936.field4255, class308.field5222);
                class179.field2936 = null;
                int var1 = 0;
                if (class270.field4679) {
                    var1 = class139.field2299;
                }
                class234.field3888.field2787 = 0;
                class234.field3888.method1219(56, !arg0);
                class234.field3888.method1213(-1, var1);
                class21.field284.method1267(class234.field3888.field2758, class234.field3888.field2787, 0, (byte) 56);
                if (class227.field3652 != null) {
                    class227.field3652.method558(102);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(52);
                }
                int var2 = class21.field284.method1258(-84);
                if (class227.field3652 != null) {
                    class227.field3652.method558(54);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(-53);
                }
                if (var2 != 0) {
                    return class26.method168(var2, 0);
                }
                class248.field4124 = 2;
            }
            if (class248.field4124 == 2) {
                if (class21.field284.method1256(86) < 2) {
                    return -1;
                }
                class224.field3632 = class21.field284.method1258(-116);
                class224.field3632 <<= 0x8;
                class224.field3632 += class21.field284.method1258(-103);
                class282.field4856 = new byte[class224.field3632];
                class198.field3264 = 0;
                class248.field4124 = 3;
            }
            if (class248.field4124 != 3) {
                return -1;
            }
            int var3 = class21.field284.method1256(19);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class224.field3632 - class198.field3264)) {
                var3 = class224.field3632 - class198.field3264;
            }
            class21.field284.method1268(false, class282.field4856, var3, class198.field3264);
            class198.field3264 += var3;
            if (class198.field3264 < class224.field3632) {
                return -1;
            } else if (class248.method1743(class282.field4856, (byte) 38)) {
                class53.field782 = new class231[class73.field1171];
                int var4 = 0;
                for (int var5 = class150.field2470; var5 <= class223.field3610; var5++) {
                    class231 var6 = class102.method770(var5, -65536);
                    if (var6 != null) {
                        class53.field782[var4++] = var6;
                    }
                }
                class21.field284.method1257(1185568552);
                class90.field1403 = 0;
                class248.field4124 = 0;
                class21.field284 = null;
                class282.field4856 = null;
                class108.field1800 = class205.method1451(14);
                return 0;
            } else {
                return class26.method168(1002, 0);
            }
        } catch (IOException var8) {
            return class26.method168(1003, 0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[[I[[I[[[B[[B[[I[[B[[B[[BB[[I[[F[[I[[F[[F)[Lkj;", line = 253)
    public static final class32[] method1775(int arg0, int[][] arg1, int[][] arg2, byte[][][] arg3, byte[][] arg4, int[][] arg5, byte[][] arg6, byte[][] arg7, byte[][] arg8, byte arg9, int[][] arg10, float[][] arg11, int[][] arg12, float[][] arg13, float[][] arg14) {
        field4224++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg8[var16][var17];
                if (var18 == 0) {
                    var18 = arg8[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg8[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg8[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class317 var19 = class37.method245((var18 & 0xFF) - 1, -21177);
                    var15[var16][var17] = (var19.field5348 + 1 << 16) + var19.field5346;
                }
            }
        }
        class94 var20 = new class94(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg8[var21][var22] != 0) {
                    int[] var23;
                    if (arg6[var21][var22] == 0) {
                        var23 = class94.field1450[0];
                    } else {
                        var23 = class223.field3625[arg7[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21][var22];
                    if (arg2 != null) {
                        var24 = arg2[var21][var22] & 0xFFFFFF;
                    }
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var26 << 32 | (long) var24;
                    long var31 = (long) var28 << 32 | (long) var24;
                    long var33 = (long) var25 << 32 | (long) var24;
                    long var35 = (long) var24 | (long) var27 << 32;
                    int var37 = var23.length / 2;
                    class32 var38 = (class32) var20.method685(var33, arg9 + 30);
                    if (var38 == null) {
                        var38 = new class32((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg12 != null, var24);
                        var20.method694(var38, (byte) -90, var33);
                    }
                    var38.field448 += var37;
                    var38.field452++;
                    if (var29 != var33) {
                        class32 var39 = (class32) var20.method685(var29, 128);
                        if (var39 == null) {
                            var39 = new class32((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg12 != null, var24);
                            var20.method694(var39, (byte) -90, var29);
                        }
                        var39.field452++;
                        var39.field448 += var37;
                    }
                    if (var33 != var35 && var29 != var35) {
                        class32 var40 = (class32) var20.method685(var35, 128);
                        if (var40 == null) {
                            var40 = new class32((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg12 != null, var24);
                            var20.method694(var40, (byte) -90, var35);
                        }
                        var40.field452++;
                        var40.field448 += var37;
                    }
                    if (var31 != var33 && var29 != var31 && var31 != var35) {
                        class32 var41 = (class32) var20.method685(var31, 128);
                        if (var41 == null) {
                            var41 = new class32((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg12 != null, var24);
                            var20.method694(var41, (byte) -90, var31);
                        }
                        var41.field452++;
                        var41.field448 += var37;
                    }
                }
            }
        }
        for (class32 var42 = (class32) var20.method692(64); var42 != null; var42 = (class32) var20.method693((byte) 106)) {
            var42.method210();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg8[var43][var44] != 0) {
                    int var45;
                    if ((arg3[arg0][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg3[1][var43][var44] & 0x2) == 2 && arg0 > 0) {
                        var45 = arg0 - 1;
                    } else {
                        var45 = arg0;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    boolean[] var48 = null;
                    if (arg2 != null) {
                        var47 = arg2[var43][var44] >>> 24 << 3;
                        var46 = arg2[var43][var44] & 0xFFFFFF;
                    }
                    int[] var49;
                    byte var50;
                    if (arg6[var43][var44] == 0) {
                        var50 = 0;
                        var49 = class94.field1450[0];
                    } else {
                        var48 = class295.field5046[arg7[var43][var44]];
                        var49 = class223.field3625[arg7[var43][var44]];
                        var50 = arg4[var43][var44];
                        if (var49.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43][var44];
                    int var52 = var15[var43 + 1][var44];
                    long var53 = (long) var46 | (long) var51 << 32;
                    int var55 = var15[var43 + 1][var44 + 1];
                    int var56 = var15[var43][var44 + 1];
                    long var57 = (long) var56 << 32 | (long) var46;
                    long var59 = (long) var46 | (long) var52 << 32;
                    long var61 = (long) var46 | (long) var55 << 32;
                    int var63 = arg10[var43][var44];
                    int var64 = arg10[var43 + 1][var44];
                    int var65 = arg10[var43][var44 + 1];
                    int var66 = arg10[var43 + 1][var44 + 1];
                    int var67 = arg1[var43 + 1][var44];
                    int var68 = arg1[var43][var44];
                    int var69 = arg1[var43 + 1][var44 + 1];
                    int var70 = arg1[var43][var44 + 1];
                    int var71 = (var51 >> 16) - 1;
                    int var72 = (var52 >> 16) - 1;
                    int var73 = (var56 >> 16) - 1;
                    int var74 = (var55 >> 16) - 1;
                    class32 var75 = (class32) var20.method685(var53, arg9 ^ 0xE2);
                    class73.method588(class269.method1879((byte) -35, var70, var71, var65), var43, arg12, var75, var55 >= var51, var47, var48, -369069976, var51 >= var51, var50, var49, class269.method1879((byte) -56, var67, var71, var64), arg11, arg5, var51 <= var52, arg13, class269.method1879((byte) -107, var69, var71, var66), var51 <= var56, var45, class269.method1879((byte) -45, var68, var71, var63), var44, arg14);
                    if (var53 != var59) {
                        class32 var76 = (class32) var20.method685(var59, arg9 ^ 0xE2);
                        class73.method588(class269.method1879((byte) -110, var70, var72, var65), var43, arg12, var76, var52 <= var55, var47, var48, -369069976, var52 <= var51, var50, var49, class269.method1879((byte) -79, var67, var72, var64), arg11, arg5, var52 <= var52, arg13, class269.method1879((byte) -45, var69, var72, var66), var56 >= var52, var45, class269.method1879((byte) -115, var68, var72, var63), var44, arg14);
                    }
                    if (var53 != var61 && var59 != var61) {
                        class32 var77 = (class32) var20.method685(var61, 128);
                        class73.method588(class269.method1879((byte) -24, var70, var74, var65), var43, arg12, var77, var55 >= var55, var47, var48, -369069976, var51 >= var55, var50, var49, class269.method1879((byte) -126, var67, var74, var64), arg11, arg5, var55 <= var52, arg13, class269.method1879((byte) -61, var69, var74, var66), var55 <= var56, var45, class269.method1879((byte) -62, var68, var74, var63), var44, arg14);
                    }
                    if (var53 != var57 && var57 != var59 && var57 != var61) {
                        class32 var78 = (class32) var20.method685(var57, 128);
                        class73.method588(class269.method1879((byte) -13, var70, var73, var65), var43, arg12, var78, var55 >= var56, var47, var48, -369069976, var56 <= var51, var50, var49, class269.method1879((byte) -91, var67, var73, var64), arg11, arg5, var52 >= var56, arg13, class269.method1879((byte) -44, var69, var73, var66), var56 >= var56, var45, class269.method1879((byte) -82, var68, var73, var63), var44, arg14);
                    }
                }
            }
        }
        for (class32 var79 = (class32) var20.method692(arg9 ^ 0x22); var79 != null; var79 = (class32) var20.method693((byte) 106)) {
            if (var79.field439 == 0) {
                var79.method2000(122);
            } else {
                var79.method211();
            }
        }
        int var80 = var20.method691(arg9 - 117);
        class32[] var81 = new class32[var80];
        var20.method686(arg9 ^ 0x62, var81);
        long[] var82 = new long[var80];
        int var83 = 0;
        if (arg9 != 98) {
            method1774(true);
        }
        while (var83 < var80) {
            var82[var83] = var81[var83].field4932;
            var83++;
        }
        class169.method1191(var81, 2, var82);
        return var81;
    }
}
