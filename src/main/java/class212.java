import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class212 extends class106 {

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public int field3720 = -1;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public int field3725 = 0;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "[I")
    public static int[] field3726 = new int[32];

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Loc;")
    public static class151 field3722 = class137.method873(2, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "[I")
    private static int[] field3730 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Loc;")
    public static class151 field3735;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Loc;")
    public static class151 field3736;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lwh;")
    public static class236 field3733;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Lhh;")
    public static class84 field3732;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1325(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= class79.field1526 && arg5 <= class25.field524 && arg6 >= class233.field4281 && class154.field2793 >= arg4) {
            class169.method1091(arg5, arg6, arg0, arg1, arg4, (byte) 7, arg3, arg7);
        } else {
            class66.method435(arg6, arg0, 19060, arg3, arg5, arg1, arg7, arg4);
        }
        if (arg2 >= -96) {
            field3732 = null;
        }
        field3716++;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public static void method1326(byte arg0) {
        field3733 = null;
        field3732 = null;
        field3722 = null;
        field3726 = null;
        field3730 = null;
        field3736 = null;
        if (arg0 == 56) {
            field3735 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILwd;)I")
    public static final int method1327(int arg0, int arg1, class232 arg2) {
        field3727++;
        if (arg2.field4198 == null || arg1 >= arg2.field4198.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field4198[arg1];
            int var5 = 0;
            byte var6 = 0;
            if (arg0 != 999999999) {
                method1331(null, false);
            }
            while (true) {
                int var7 = var4[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var9 = class137.field2501[var4[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 2) {
                    var9 = class130.field2388[var4[var5++]];
                }
                if (var7 == 3) {
                    var9 = class40.field814[var4[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class232 var12 = class175.method1115(arg0 - 1000022191, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class43.method311(var13, arg0 - 999999999).field253 || class15.field347)) {
                        for (int var14 = 0; var14 < var12.field4248.length; var14++) {
                            if (var13 + 1 == var12.field4248[var14]) {
                                var9 += var12.field4199[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 5) {
                    var9 = class156.field2836[var4[var5++]];
                }
                if (var7 == 6) {
                    var9 = class206.field3648[class130.field2388[var4[var5++]] - 1];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 7) {
                    var9 = class156.field2836[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class228.field3975.field435;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class32.field662[var15]) {
                            var9 += class130.field2388[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class232 var18 = class175.method1115(-22192, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class43.method311(var19, 0).field253 || class15.field347)) {
                        for (int var20 = 0; var20 < var18.field4248.length; var20++) {
                            if (var19 + 1 == var18.field4248[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class37.field778;
                }
                if (var7 == 12) {
                    var9 = class51.field1026;
                }
                if (var7 == 13) {
                    int var21 = class156.field2836[var4[var5++]];
                    int var22 = var4[var5++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var9 = class181.method1140(var23, (byte) -128);
                }
                if (var7 == 18) {
                    var9 = (class228.field3975.field3976 >> 7) + class232.field4188;
                }
                if (var7 == 19) {
                    var9 = (class228.field3975.field4029 >> 7) + class64.field1255;
                }
                if (var7 == 20) {
                    var9 = var4[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var3 += var9;
                    }
                    if (var6 == 1) {
                        var3 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var3 /= var9;
                    }
                    if (var6 == 3) {
                        var3 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZ)V")
    public static final void method1328(byte arg0, boolean arg1) {
        field3717++;
        class159.field2855 = arg1;
        if (arg0 < 114) {
            return;
        }
        if (!class159.field2855) {
            int var25 = class1.field34.method1452(-14498);
            int var26 = class1.field34.method1490((byte) 73);
            int var27 = class1.field34.method1452(-14498);
            int var28 = (class68.field1329 - class1.field34.field4101) / 16;
            class181.field3268 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class181.field3268[var29][var37] = class1.field34.method1442(false);
                }
            }
            int var30 = class1.field34.method1452(-14498);
            boolean var31 = false;
            int var32 = class1.field34.method1489(252);
            class220.field3828 = new int[var28];
            class114.field2035 = new byte[var28][];
            class169.field3078 = new byte[var28][];
            class109.field1936 = new int[var28];
            class102.field1844 = new int[var28];
            if ((var30 / 8 == 48 || var30 / 8 == 49) && var26 / 8 == 48) {
                var31 = true;
            }
            int var33 = 0;
            if (var30 / 8 == 48 && var26 / 8 == 148) {
                var31 = true;
            }
            for (int var34 = (var30 - 6) / 8; var34 <= (var30 + 6) / 8; var34++) {
                for (int var35 = (var26 - 6) / 8; var35 <= (var26 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var31 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class109.field1936[var33] = var36;
                        class220.field3828[var33] = class140.field2548.method1198(25128, class126.method761(new class151[] { class65.field1263, class137.method874(var34, false), class158.field2849, class137.method874(var35, false) }, 10260));
                        class102.field1844[var33] = class140.field2548.method1198(25128, class126.method761(new class151[] { class66.field1278, class137.method874(var34, false), class158.field2849, class137.method874(var35, false) }, 10260));
                        var33++;
                    }
                }
            }
            class202.method1285(var27, -116, var30, var25, var32, var26);
            return;
        }
        int var2 = class1.field34.method1459(255);
        int var3 = class1.field34.method1452(-14498);
        int var4 = class1.field34.method1486((byte) -65);
        class1.field34.method648(false);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class1.field34.method645(1, (byte) 10);
                    if (var24 == 1) {
                        class211.field3706[var5][var22][var23] = class1.field34.method645(26, (byte) 10);
                    } else {
                        class211.field3706[var5][var22][var23] = -1;
                    }
                }
            }
        }
        class1.field34.method644(0);
        int var6 = (class68.field1329 - class1.field34.field4101) / 16;
        class181.field3268 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class181.field3268[var7][var21] = class1.field34.method1442(false);
            }
        }
        int var8 = class1.field34.method1452(-14498);
        int var9 = class1.field34.method1441(0);
        class114.field2035 = new byte[var6][];
        class109.field1936 = new int[var6];
        class220.field3828 = new int[var6];
        class102.field1844 = new int[var6];
        class169.field3078 = new byte[var6][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class211.field3706[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class109.field1936[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class109.field1936[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class220.field3828[var10] = class140.field2548.method1198(25128, class126.method761(new class151[] { class65.field1263, class137.method874(var19, false), class158.field2849, class137.method874(var20, false) }, 10260));
                            class102.field1844[var10] = class140.field2548.method1198(25128, class126.method761(new class151[] { class66.field1278, class137.method874(var19, false), class158.field2849, class137.method874(var20, false) }, 10260));
                            var10++;
                        }
                    }
                }
            }
        }
        class202.method1285(var8, -115, var9, var4, var2, var3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILud;)V")
    public static final void method1329(int arg0, class212 arg1) {
        long var2 = 0L;
        if (arg1.field3715 == 0) {
            var2 = class225.method1413(arg1.field3723, arg1.field3728, arg1.field3713);
        }
        field3714++;
        if (arg1.field3715 == 1) {
            var2 = class111.method669(arg1.field3723, arg1.field3728, arg1.field3713);
        }
        if (arg1.field3715 == 2) {
            var2 = class229.method1448(arg1.field3723, arg1.field3728, arg1.field3713);
        }
        int var4 = 0;
        int var5 = -1;
        if (arg1.field3715 == 3) {
            var2 = class28.method219(arg1.field3723, arg1.field3728, arg1.field3713);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var4 = (int) var2 >> 14 & 0x1F;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field3712 = var6;
        arg1.field3718 = var4;
        arg1.field3721 = var5;
        if (arg0 >= -29) {
            method1330(false, true, 12, false, -120);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZIZI)Lnd;")
    public static final class142 method1330(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field3724++;
        class69 var5 = null;
        if (class232.field4277 != null) {
            var5 = new class69(arg4, class232.field4277, class79.field1529[arg4], 1000000);
        }
        if (arg2 != 1000000) {
            method1329(-110, null);
        }
        return new class142(var5, class166.field3033, arg4, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lgg;Z)V")
    public static final void method1331(class72 arg0, boolean arg1) {
        class162.field2919.method1361(arg0, (byte) 71);
        while (true) {
            class72 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class72[][] var7;
            class72 var65;
            do {
                class72 var64;
                do {
                    class72 var63;
                    do {
                        class72 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class72) class162.field2919.method1355(-12348);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1396);
                                            var3 = var2.field1398;
                                            var4 = var2.field1408;
                                            var5 = var2.field1416;
                                            var6 = var2.field1413;
                                            var7 = class95.field1776[var5];
                                            if (!var2.field1401) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class72 var8 = class95.field1776[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1396) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class66.field1271 && var3 > class170.field3093) {
                                                    class72 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1396 && (var9.field1401 || (var2.field1395 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class66.field1271 && var3 < class178.field3211 - 1) {
                                                    class72 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1396 && (var10.field1401 || (var2.field1395 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class36.field736 && var4 > class164.field2961) {
                                                    class72 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1396 && (var11.field1401 || (var2.field1395 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class36.field736 && var4 < class72.field1418 - 1) {
                                                    class72 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1396 && (var12.field1401 || (var2.field1395 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1401 = false;
                                            if (var2.field1392 != null) {
                                                class72 var13 = var2.field1392;
                                                if (var13.field1415 == null) {
                                                    if (var13.field1403 != null && !class233.method1527(0, var3, var4)) {
                                                        class149.method945(var13.field1403, class228.field4027, class142.field2584, class39.field797, class14.field325, var3, var4);
                                                    }
                                                } else if (!class233.method1527(0, var3, var4)) {
                                                    class171.method1099(var13.field1415, 0, class228.field4027, class142.field2584, class39.field797, class14.field325, var3, var4);
                                                }
                                                class23 var14 = var13.field1412;
                                                if (var14 != null) {
                                                    var14.field518.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var14.field516 - class1.field42, var14.field504 - class116.field2084, var14.field508 - class73.field1426, var14.field503);
                                                }
                                                for (int var15 = 0; var15 < var13.field1397; var15++) {
                                                    class124 var16 = var13.field1405[var15];
                                                    if (var16 != null) {
                                                        var16.field2220.method72(var16.field2217, class228.field4027, class142.field2584, class39.field797, class14.field325, var16.field2226 - class1.field42, var16.field2235 - class116.field2084, var16.field2215 - class73.field1426, var16.field2230);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1415 == null) {
                                                if (var2.field1403 != null && !class233.method1527(var6, var3, var4)) {
                                                    var17 = true;
                                                    class149.method945(var2.field1403, class228.field4027, class142.field2584, class39.field797, class14.field325, var3, var4);
                                                }
                                            } else if (!class233.method1527(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field1415.field3928 != 12345678 || class138.field2510 && var5 <= class9.field136) {
                                                    class171.method1099(var2.field1415, var6, class228.field4027, class142.field2584, class39.field797, class14.field325, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class23 var20 = var2.field1412;
                                            class213 var21 = var2.field1419;
                                            if (var20 != null || var21 != null) {
                                                if (class66.field1271 == var3) {
                                                    var18++;
                                                } else if (class66.field1271 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class36.field736 == var4) {
                                                    var18 += 3;
                                                } else if (class36.field736 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class21.field470[var18];
                                                var2.field1406 = class152.field2750[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field510 & class59.field1184[var18]) == 0) {
                                                    var2.field1393 = 0;
                                                } else if (var20.field510 == 16) {
                                                    var2.field1393 = 3;
                                                    var2.field1394 = field3730[var18];
                                                    var2.field1411 = 3 - var2.field1394;
                                                } else if (var20.field510 == 32) {
                                                    var2.field1393 = 6;
                                                    var2.field1394 = class118.field2132[var18];
                                                    var2.field1411 = 6 - var2.field1394;
                                                } else if (var20.field510 == 64) {
                                                    var2.field1393 = 12;
                                                    var2.field1394 = class217.field3787[var18];
                                                    var2.field1411 = 12 - var2.field1394;
                                                } else {
                                                    var2.field1393 = 9;
                                                    var2.field1394 = class63.field1235[var18];
                                                    var2.field1411 = 9 - var2.field1394;
                                                }
                                                if ((var20.field510 & var19) != 0 && !class225.method1412(var6, var3, var4, var20.field510)) {
                                                    var20.field518.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var20.field516 - class1.field42, var20.field504 - class116.field2084, var20.field508 - class73.field1426, var20.field503);
                                                }
                                                if ((var20.field513 & var19) != 0 && !class225.method1412(var6, var3, var4, var20.field513)) {
                                                    var20.field517.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var20.field516 - class1.field42, var20.field504 - class116.field2084, var20.field508 - class73.field1426, var20.field503);
                                                }
                                            }
                                            if (var21 != null && !class113.method682(var6, var3, var4, var21.field3744.method74())) {
                                                if ((var21.field3746 & var19) != 0) {
                                                    var21.field3744.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var21.field3751 + var21.field3738 - class1.field42, var21.field3737 - class116.field2084, var21.field3747 + var21.field3741 - class73.field1426, var21.field3739);
                                                } else if (var21.field3746 == 256) {
                                                    int var22 = var21.field3751 - class1.field42;
                                                    int var23 = var21.field3737 - class116.field2084;
                                                    int var24 = var21.field3747 - class73.field1426;
                                                    int var25 = var21.field3750;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field3744.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var21.field3738 + var22, var23, var21.field3741 + var24, var21.field3739);
                                                    } else if (var21.field3745 != null) {
                                                        var21.field3745.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var22, var23, var24, var21.field3739);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class73 var28 = var2.field1400;
                                                if (var28 != null) {
                                                    var28.field1423.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var28.field1425 - class1.field42, var28.field1424 - class116.field2084, var28.field1427 - class73.field1426, var28.field1421);
                                                }
                                                class126 var29 = var2.field1407;
                                                if (var29 != null && var29.field2254 == 0) {
                                                    if (var29.field2252 != null) {
                                                        var29.field2252.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var29.field2256 - class1.field42, var29.field2262 - class116.field2084, var29.field2248 - class73.field1426, var29.field2258);
                                                    }
                                                    if (var29.field2260 != null) {
                                                        var29.field2260.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var29.field2256 - class1.field42, var29.field2262 - class116.field2084, var29.field2248 - class73.field1426, var29.field2258);
                                                    }
                                                    if (var29.field2255 != null) {
                                                        var29.field2255.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var29.field2256 - class1.field42, var29.field2262 - class116.field2084, var29.field2248 - class73.field1426, var29.field2258);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field1395;
                                            if (var30 != 0) {
                                                if (var3 < class66.field1271 && (var30 & 0x4) != 0) {
                                                    class72 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field1396) {
                                                        class162.field2919.method1361(var31, (byte) 71);
                                                    }
                                                }
                                                if (var4 < class36.field736 && (var30 & 0x2) != 0) {
                                                    class72 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field1396) {
                                                        class162.field2919.method1361(var32, (byte) 71);
                                                    }
                                                }
                                                if (var3 > class66.field1271 && (var30 & 0x1) != 0) {
                                                    class72 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field1396) {
                                                        class162.field2919.method1361(var33, (byte) 71);
                                                    }
                                                }
                                                if (var4 > class36.field736 && (var30 & 0x8) != 0) {
                                                    class72 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field1396) {
                                                        class162.field2919.method1361(var34, (byte) 71);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1393 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field1397; var36++) {
                                                if (class11.field201 != var2.field1405[var36].field2216 && (var2.field1404[var36] & var2.field1393) == var2.field1394) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class23 var37 = var2.field1412;
                                                if (!class225.method1412(var6, var3, var4, var37.field510)) {
                                                    var37.field518.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var37.field516 - class1.field42, var37.field504 - class116.field2084, var37.field508 - class73.field1426, var37.field503);
                                                }
                                                var2.field1393 = 0;
                                            }
                                        }
                                        if (!var2.field1410) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field1397;
                                            var2.field1410 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class124 var41 = var2.field1405[var40];
                                                if (class11.field201 != var41.field2216) {
                                                    for (int var42 = var41.field2224; var42 <= var41.field2218; var42++) {
                                                        for (int var43 = var41.field2214; var43 <= var41.field2225; var43++) {
                                                            class72 var44 = var7[var42][var43];
                                                            if (var44.field1401) {
                                                                var2.field1410 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field1393 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field2224) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field2218) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field2214) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field2225) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field1393) == var2.field1411) {
                                                                    var2.field1410 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class2.field52[var39++] = var41;
                                                    int var46 = class66.field1271 - var41.field2224;
                                                    int var47 = var41.field2218 - class66.field1271;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class36.field736 - var41.field2214;
                                                    int var49 = var41.field2225 - class36.field736;
                                                    if (var49 > var48) {
                                                        var41.field2228 = var46 + var49;
                                                    } else {
                                                        var41.field2228 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class124 var53 = class2.field52[var52];
                                                    if (class11.field201 != var53.field2216) {
                                                        if (var53.field2228 > var50) {
                                                            var50 = var53.field2228;
                                                            var51 = var52;
                                                        } else if (var53.field2228 == var50) {
                                                            int var54 = var53.field2226 - class1.field42;
                                                            int var55 = var53.field2215 - class73.field1426;
                                                            int var56 = class2.field52[var51].field2226 - class1.field42;
                                                            int var57 = class2.field52[var51].field2215 - class73.field1426;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class124 var58 = class2.field52[var51];
                                                var58.field2216 = class11.field201;
                                                if (!class182.method1148(var6, var58.field2224, var58.field2218, var58.field2214, var58.field2225, var58.field2220.method74())) {
                                                    var58.field2220.method72(var58.field2217, class228.field4027, class142.field2584, class39.field797, class14.field325, var58.field2226 - class1.field42, var58.field2235 - class116.field2084, var58.field2215 - class73.field1426, var58.field2230);
                                                }
                                                for (int var59 = var58.field2224; var59 <= var58.field2218; var59++) {
                                                    for (int var60 = var58.field2214; var60 <= var58.field2225; var60++) {
                                                        class72 var61 = var7[var59][var60];
                                                        if (var61.field1393 != 0) {
                                                            class162.field2919.method1361(var61, (byte) 71);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field1396) {
                                                            class162.field2919.method1361(var61, (byte) 71);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1410) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field1410 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1396);
                            } while (var2.field1393 != 0);
                            if (var3 > class66.field1271 || var3 <= class170.field3093) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field1396);
                        if (var3 < class66.field1271 || var3 >= class178.field3211 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field1396);
                    if (var4 > class36.field736 || var4 <= class164.field2961) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field1396);
                if (var4 < class36.field736 || var4 >= class72.field1418 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field1396);
            var2.field1396 = false;
            class7.field107--;
            class126 var66 = var2.field1407;
            if (var66 != null && var66.field2254 != 0) {
                if (var66.field2252 != null) {
                    var66.field2252.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var66.field2256 - class1.field42, var66.field2262 - class116.field2084 - var66.field2254, var66.field2248 - class73.field1426, var66.field2258);
                }
                if (var66.field2260 != null) {
                    var66.field2260.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var66.field2256 - class1.field42, var66.field2262 - class116.field2084 - var66.field2254, var66.field2248 - class73.field1426, var66.field2258);
                }
                if (var66.field2255 != null) {
                    var66.field2255.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var66.field2256 - class1.field42, var66.field2262 - class116.field2084 - var66.field2254, var66.field2248 - class73.field1426, var66.field2258);
                }
            }
            if (var2.field1406 != 0) {
                class213 var67 = var2.field1419;
                if (var67 != null && !class113.method682(var6, var3, var4, var67.field3744.method74())) {
                    if ((var67.field3746 & var2.field1406) != 0) {
                        var67.field3744.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var67.field3751 + var67.field3738 - class1.field42, var67.field3737 - class116.field2084, var67.field3747 + var67.field3741 - class73.field1426, var67.field3739);
                    } else if (var67.field3746 == 256) {
                        int var68 = var67.field3751 - class1.field42;
                        int var69 = var67.field3737 - class116.field2084;
                        int var70 = var67.field3747 - class73.field1426;
                        int var71 = var67.field3750;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field3744.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var67.field3738 + var68, var69, var67.field3741 + var70, var67.field3739);
                        } else if (var67.field3745 != null) {
                            var67.field3745.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var68, var69, var70, var67.field3739);
                        }
                    }
                }
                class23 var74 = var2.field1412;
                if (var74 != null) {
                    if ((var74.field513 & var2.field1406) != 0 && !class225.method1412(var6, var3, var4, var74.field513)) {
                        var74.field517.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var74.field516 - class1.field42, var74.field504 - class116.field2084, var74.field508 - class73.field1426, var74.field503);
                    }
                    if ((var74.field510 & var2.field1406) != 0 && !class225.method1412(var6, var3, var4, var74.field510)) {
                        var74.field518.method72(0, class228.field4027, class142.field2584, class39.field797, class14.field325, var74.field516 - class1.field42, var74.field504 - class116.field2084, var74.field508 - class73.field1426, var74.field503);
                    }
                }
            }
            if (var5 < class116.field2100 - 1) {
                class72 var75 = class95.field1776[var5 + 1][var3][var4];
                if (var75 != null && var75.field1396) {
                    class162.field2919.method1361(var75, (byte) 71);
                }
            }
            if (var3 < class66.field1271) {
                class72 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field1396) {
                    class162.field2919.method1361(var76, (byte) 71);
                }
            }
            if (var4 < class36.field736) {
                class72 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field1396) {
                    class162.field2919.method1361(var77, (byte) 71);
                }
            }
            if (var3 > class66.field1271) {
                class72 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field1396) {
                    class162.field2919.method1361(var78, (byte) 71);
                }
            }
            if (var4 > class36.field736) {
                class72 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field1396) {
                    class162.field2919.method1361(var79, (byte) 71);
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3726[var1] = var0 - 1;
            var0 += var0;
        }
        field3731 = 0;
        field3734 = 0;
        field3735 = class137.method873(2, "Welt");
        field3736 = class137.method873(2, "huffman");
    }
}
