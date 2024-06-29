import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public int field2431 = -1;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Ln;")
    public static class90 field2427 = new class90(64);

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Loa;")
    private static class98 field2429 = class38.method349(255, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Loa;")
    public static class98 field2432 = field2429;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lab;")
    public static class3 field2430 = new class3(4096);

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Loa;")
    private static class98 field2436 = class38.method349(255, "Loaded interfaces");

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
    public static volatile boolean field2439 = false;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[I")
    public static int[] field2437 = new int[2000];

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Loa;")
    public static class98 field2435 = class38.method349(255, "Ignorieren");

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Loa;")
    public static class98 field2438 = field2436;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2440 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lqb;")
    public class112 field2423;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lrd;")
    public static class120 field2434;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lkc;")
    public static class72 field2433;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[I")
    public int[] field2428;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[Loa;")
    public class98[] field2421;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method891(boolean arg0) {
        field2427 = null;
        field2437 = null;
        field2438 = null;
        field2434 = null;
        if (arg0) {
            field2433 = null;
        }
        field2430 = null;
        field2433 = null;
        field2429 = null;
        field2435 = null;
        field2436 = null;
        field2432 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method892(int arg0) {
        field2426++;
        if (class97.field2220) {
            class21.method190((byte) -39);
            class97.field2220 = false;
            class123.method974((byte) 42);
            class137.field3332 = true;
            class126.field2793 = true;
            class147.field3584 = true;
            class15.field306 = true;
        }
        class112.method912(600);
        if (class145.field3529 && class49.field1099 == 1) {
            class137.field3332 = true;
        }
        if (class132.field3111 != -1) {
            boolean var1 = class24.method268(class132.field3111, 2047);
            if (var1) {
                class137.field3332 = true;
            }
        }
        if (class1.field18 == 2) {
            class137.field3332 = true;
        }
        if (class36.field879 == 2) {
            class137.field3332 = true;
        }
        if (class137.field3332) {
            class137.field3332 = false;
            class121.method960((byte) -99);
        }
        if (class71.field1462 == -1) {
            class36.field893.field3114 = class67.field1434 - class44.field999 - 77;
            if (class42.field990 > 17 && class42.field990 < 560 && class123.field2749 > 332) {
                class3.method11(77, 0, 463, class67.field1434, class36.field893, class42.field990 - 17, -1, class123.field2749 + -357, (byte) -62);
            }
            int var2 = class67.field1434 - class36.field893.field3114 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (class67.field1434 - 77 < var2) {
                var2 = class67.field1434 - 77;
            }
            if (class44.field999 != var2) {
                class44.field999 = var2;
                class15.field306 = true;
            }
        }
        if (class71.field1462 == -1 && class149.field3691 == 3) {
            int var3 = class71.field1465 * 14 + 7;
            class36.field893.field3114 = class79.field1739;
            if (class42.field990 > 17 && class42.field990 < 560 && class123.field2749 > 332) {
                class3.method11(77, 0, 463, var3, class36.field893, class42.field990 - 17, -1, class123.field2749 + -357, (byte) -62);
            }
            int var4 = class36.field893.field3114;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class79.field1739 != var4) {
                class15.field306 = true;
                class79.field1739 = var4;
            }
        }
        if (class71.field1462 != -1) {
            boolean var5 = class24.method268(class71.field1462, 2047);
            if (var5) {
                class15.field306 = true;
            }
        }
        if (class1.field18 == 3) {
            class15.field306 = true;
        }
        if (class36.field879 == 3) {
            class15.field306 = true;
        }
        if (class39.field945 != null) {
            class15.field306 = true;
        }
        if (class145.field3529 && class49.field1099 == 2) {
            class15.field306 = true;
        }
        if (class15.field306) {
            class15.field306 = false;
            class49.method414(0);
        }
        int var6 = -111 / ((arg0 - 69) / 49);
        class48.method410((byte) -124);
        if (class39.field944 != -1) {
            class147.field3584 = true;
        }
        if (class147.field3584) {
            if (class39.field944 != -1 && class39.field944 == class31.field709) {
                class94.field2147++;
                class39.field944 = -1;
                class132.field3116.method177(6624, 201);
                class132.field3116.method95(class31.field709, true);
            }
            class147.field3584 = false;
            class73.field1524 = true;
            class83.method696(class52.field1163, class31.field709, class119.field2680 % 20 < 10 ? -1 : class39.field944, 0, class132.field3111 == -1);
        }
        if (class126.field2793) {
            class73.field1524 = true;
            class126.field2793 = false;
            class10.method117(class80.field1749, class54.field1193, 16711680, class67.field1433, class97.field2231);
        }
        class141.method1128(class114.field2572, -1, class73.field1536.field3667, class52.field1161, class73.field1536.field3657);
        class52.field1161 = 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILtb;I)Z")
    public static final boolean method893(byte arg0, int arg1, class130 arg2, int arg3) {
        byte[] var4 = arg2.method1058(arg3, 58, arg1);
        field2425++;
        if (arg0 >= -95) {
            method894(100);
        }
        if (var4 == null) {
            return false;
        } else {
            class4.method21((byte) 123, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static final void method894(int arg0) {
        field2422++;
        boolean var1 = true;
        class94.method750(-124, false);
        class1.field12 = 0;
        for (int var2 = 0; var2 < class39.field942.length; var2++) {
            if (class127.field2857[var2] != -1 && class39.field942[var2] == null) {
                class39.field942[var2] = class3.field41.method1058(class127.field2857[var2], 101, 0);
                if (class39.field942[var2] == null) {
                    var1 = false;
                    class1.field12++;
                }
            }
            if (class52.field1162[var2] != -1 && class6.field98[var2] == null) {
                class6.field98[var2] = class3.field41.method1064(0, class52.field1162[var2], class52.field1145[var2], (byte) 0);
                if (class6.field98[var2] == null) {
                    class1.field12++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class37.field916 = 1;
            return;
        }
        boolean var3 = true;
        class113.field2549 = 0;
        for (int var4 = 0; var4 < class39.field942.length; var4++) {
            byte[] var56 = class6.field98[var4];
            if (var56 != null) {
                int var57 = (class71.field1456[var4] >> 8) * 64 - class21.field470;
                int var58 = (class71.field1456[var4] & 0xFF) * 64 - class71.field1479;
                if (class129.field2961) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class127.method1001(var58, -108, var57, var56);
            }
        }
        if (!var3) {
            class37.field916 = 2;
            return;
        }
        if (class37.field916 != 0) {
            class96.method766(true, class54.field1194, class24.field593, -21);
        }
        class21.method190((byte) -39);
        class62.method505((byte) 26);
        class21.method190((byte) -39);
        class138.field3373.method258();
        class21.method190((byte) -39);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class137.field3323[var5].method1198((byte) 35);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class80.field1771[var6][var54][var55] = 0;
                }
            }
        }
        class21.method190((byte) -39);
        class77.method626(4);
        int var7 = class39.field942.length;
        class73.method588((byte) -89);
        class94.method750(arg0 ^ 0x7D, true);
        if (!class129.field2961) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class71.field1456[var8] >> 8) * 64 - class21.field470;
                byte[] var18 = class39.field942[var8];
                int var19 = (class71.field1456[var8] & 0xFF) * 64 - class71.field1479;
                if (var18 != null) {
                    class21.method190((byte) -39);
                    class67.method554((class96.field2199 - 6) * 8, var17, class137.field3323, -65, (class138.field3379 - 6) * 8, var18, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class71.field1456[var9] >> 8) * 64 - class21.field470;
                int var15 = (class71.field1456[var9] & 0xFF) * 64 - class71.field1479;
                byte[] var16 = class39.field942[var9];
                if (var16 == null && class96.field2199 < 800) {
                    class21.method190((byte) -39);
                    class80.method645(true, var15, var14, 64, 64);
                }
            }
            class94.method750(-125, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class6.field98[var10];
                if (var11 != null) {
                    int var12 = (class71.field1456[var10] >> 8) * 64 - class21.field470;
                    int var13 = (class71.field1456[var10] & 0xFF) * 64 - class71.field1479;
                    class21.method190((byte) -39);
                    class25.method272(var13, class138.field3373, var11, var12, true, class137.field3323);
                }
            }
        }
        if (class129.field2961) {
            for (int var20 = 0; var20 < 4; var20++) {
                class21.method190((byte) -39);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class16.field336[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 1 & 0x3;
                            int var42 = (var39 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class71.field1456.length; var43++) {
                                if (class71.field1456[var43] == var42 && class39.field942[var43] != null) {
                                    class108.method896(var35 * 8, false, var41, var38, (var39 & 0x7) * 8, class137.field3323, var34 * 8, (var40 & 0x7) * 8, class39.field942[var43], var20);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class124.method986(var34 * 8, false, var20, var35 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class16.field336[0][var21][var32];
                    if (var33 == -1) {
                        class80.method645(true, var32 * 8, var21 * 8, 8, 8);
                    }
                }
            }
            class94.method750(-125, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class21.method190((byte) -39);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class16.field336[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class71.field1456.length; var31++) {
                                if (class71.field1456[var31] == var30 && class6.field98[var31] != null) {
                                    class126.method994(var23 * 8, var27, var22, class138.field3373, var26, (var29 & 0x7) * 8, arg0, class137.field3323, class6.field98[var31], (var28 & 0x7) * 8, var24 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class94.method750(-122, true);
        class62.method505((byte) -128);
        class21.method190((byte) -39);
        class29.method298((byte) 124, class137.field3323, class138.field3373);
        class94.method750(-128, true);
        int var44 = class80.field1792;
        if (var44 > class114.field2572) {
            var44 = class114.field2572;
        }
        if (class114.field2572 - 1 > var44) {
            int var45 = class114.field2572 - 1;
        }
        if (class94.field2151) {
            class138.field3373.method246(class80.field1792);
        } else {
            class138.field3373.method246(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class6.method27(-108, var46, var53);
            }
        }
        class21.method190((byte) -39);
        class5.method25((byte) 0);
        class17.field360.method734(-224779128);
        if (class96.field2206 != null) {
            class132.field3116.method177(6624, 245);
            class5.field87++;
            class132.field3116.method72((byte) -62, 1057001181);
        }
        if (!class129.field2961) {
            int var47 = (class138.field3379 - 6) / 8;
            int var48 = (class138.field3379 + 6) / 8;
            int var49 = (class96.field2199 - 6) / 8;
            int var50 = (class96.field2199 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var51 > var48 || var52 < var49 || var50 < var52) {
                        class3.field41.method1044((byte) 125, class102.method840(new class98[] { class135.field3292, class132.method1074(var51, (byte) 82), class24.field597, class132.method1074(var52, (byte) 92) }, 10));
                        class3.field41.method1044((byte) 125, class102.method840(new class98[] { class37.field927, class132.method1074(var51, (byte) 122), class24.field597, class132.method1074(var52, (byte) 39) }, arg0 ^ 0xFFFFFFF5));
                    }
                }
            }
        }
        if (class77.field1694 == arg0) {
            class96.method768((byte) 98, 30);
        } else {
            class96.method768((byte) 98, 35);
        }
        class21.method190((byte) -39);
        class48.method409(arg0 + 89);
        class132.field3116.method177(6624, 145);
        class149.method1194(true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLwb;)V")
    public static final void method895(byte arg0, class148 arg1) {
        field2424++;
        if (arg0 < 56 || arg1.field3658 == 0) {
            return;
        }
        if (arg1.field3668 != -1 && arg1.field3668 < 32768) {
            class150 var2 = class38.field935[arg1.field3668];
            if (var2 != null) {
                int var3 = arg1.field3667 - var2.field3667;
                int var4 = arg1.field3657 - var2.field3657;
                if (var4 != 0 || var3 != 0) {
                    arg1.field3652 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3668 >= 32768) {
            int var5 = arg1.field3668 - 32768;
            if (class8.field191 == var5) {
                var5 = 2047;
            }
            class55 var6 = class33.field832[var5];
            if (var6 != null) {
                int var7 = arg1.field3657 - var6.field3657;
                int var8 = arg1.field3667 - var6.field3667;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3652 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3663 != 0 || arg1.field3629 != 0) && (arg1.field3608 == 0 || arg1.field3637 > 0)) {
            int var9 = arg1.field3657 - (arg1.field3663 - class21.field470 - class21.field470) * 64;
            int var10 = arg1.field3667 - (arg1.field3629 - class71.field1479 - class71.field1479) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field3652 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3663 = 0;
            arg1.field3629 = 0;
        }
        int var11 = arg1.field3652 - arg1.field3620 & 0x7FF;
        if (var11 == 0) {
            arg1.field3625 = 0;
            return;
        }
        arg1.field3625++;
        if (var11 > 1024) {
            boolean var12 = true;
            arg1.field3620 -= arg1.field3658;
            if (var11 < arg1.field3658 || var11 > 2048 - arg1.field3658) {
                arg1.field3620 = arg1.field3652;
                var12 = false;
            }
            if (arg1.field3655 == arg1.field3626 && (arg1.field3625 > 25 || var12)) {
                if (arg1.field3616 == -1) {
                    arg1.field3655 = arg1.field3617;
                } else {
                    arg1.field3655 = arg1.field3616;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field3620 += arg1.field3658;
            if (var11 < arg1.field3658 || var11 > 2048 - arg1.field3658) {
                var13 = false;
                arg1.field3620 = arg1.field3652;
            }
            if (arg1.field3655 == arg1.field3626 && (arg1.field3625 > 25 || var13)) {
                if (arg1.field3642 == -1) {
                    arg1.field3655 = arg1.field3617;
                } else {
                    arg1.field3655 = arg1.field3642;
                }
            }
        }
        arg1.field3620 &= 0x7FF;
    }
}
