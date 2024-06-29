import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class59 extends class228 {

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "Loa;")
    public static class99 field987 = class221.method1463(2844, "clignotant3:");

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Loa;")
    private static class99 field984 = class221.method1463(2844, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "Loa;")
    public static class99 field992 = field984;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "Loa;")
    private static class99 field997 = class221.method1463(2844, "Cancel");

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "Loa;")
    public static class99 field988 = field997;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "Loa;")
    public static class99 field998 = class221.method1463(2844, "mapflag");

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "Lgd;")
    public static class74 field991 = new class74(64);

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)Lw;")
    public static final class144 method397(boolean arg0) {
        ++field985;
        class137.field2405 = 0;
        if (arg0) {
            method401(116);
        }
        return class19.method110(true);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
    private class59(int arg0) {
        super(0, true);
        this.field989 = 4096;
        this.field989 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public static final void method398(int arg0) {
        ++field990;
        if (arg0 < 51) {
            method402((class216) null, false);
        }
        if (!class123.field2161 && class161.field2856 != 2) {
            try {
                class82.field1449.method687(class175.field3082, -26001);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            this.method18(67, (class261) null, 23);
        }
        if (arg0 == 0) {
            this.field989 = (arg1.method1693((byte) -101) << 12) / 255;
        }
        ++field995;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class59() {
        this(4096);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            return null;
        } else {
            ++field994;
            int[] var3 = super.field3952.method1262(arg0, 7492);
            if (super.field3952.field3276) {
                class241.method1569(var3, 0, class234.field4046, this.field989);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)V")
    public static final void method399(int arg0, int arg1) {
        ++field993;
        class65 var2 = class152.method1010(arg0, arg1, (byte) -83);
        var2.method426((byte) -112);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public static final void method400(int arg0) {
        if (arg0 >= 9) {
            class106.field1773.method1813(-1);
            ++field999;
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static void method401(int arg0) {
        field991 = null;
        field998 = null;
        field984 = null;
        int var1 = -107 % ((-24 - arg0) / 44);
        field992 = null;
        field988 = null;
        field997 = null;
        field987 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lef;Z)V")
    public static final void method402(class216 arg0, boolean arg1) {
        class34.field617.method536(arg0, (byte) -27);
        while (true) {
            class216 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class216[][] var7;
            class216 var82;
            do {
                class216 var81;
                do {
                    class216 var80;
                    do {
                        class216 var79;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class216) class34.field617.method528(1);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3764);
                                            var3 = var2.field3754;
                                            var4 = var2.field3742;
                                            var5 = var2.field3747;
                                            var6 = var2.field3761;
                                            var7 = class128.field2236[var5];
                                            if (!var2.field3760) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class216 var8 = class128.field2236[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3764) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class62.field1031 && var3 > class171.field3040) {
                                                    class216 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3764 && (var9.field3760 || (var2.field3753 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class62.field1031 && var3 < class138.field2441 - 1) {
                                                    class216 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3764 && (var10.field3760 || (var2.field3753 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class135.field2355 && var4 > class273.field4830) {
                                                    class216 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3764 && (var11.field3760 || (var2.field3753 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class135.field2355 && var4 < class149.field2624 - 1) {
                                                    class216 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3764 && (var12.field3760 || (var2.field3753 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3760 = false;
                                            if (var2.field3740 != null) {
                                                class216 var13 = var2.field3740;
                                                if (var13.field3750 != null) {
                                                    if (!class187.method1281(0, var3, var4)) {
                                                        class273.method1816(var13.field3750, 0, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, false);
                                                    } else {
                                                        class273.method1816(var13.field3750, 0, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, true);
                                                    }
                                                } else if (var13.field3746 != null) {
                                                    if (!class187.method1281(0, var3, var4)) {
                                                        class263.method1761(var13.field3746, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, false);
                                                    } else {
                                                        class263.method1761(var13.field3746, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, true);
                                                    }
                                                }
                                                class167 var14 = var13.field3762;
                                                if (var14 != null) {
                                                    var14.field2988.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var14.field2985 - class260.field4540, var14.field2981 - class240.field4154, var14.field2978 - class163.field2869, var14.field2984, var5, (class136) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field3748; ++var15) {
                                                    class77 var16 = var13.field3743[var15];
                                                    if (var16 != null) {
                                                        var16.field1367.method233(var16.field1373, class247.field4251, class193.field3403, class57.field963, class12.field102, var16.field1363 - class260.field4540, var16.field1359 - class240.field4154, var16.field1369 - class163.field2869, var16.field1372, var5, (class136) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3750 != null) {
                                                if (!class187.method1281(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field3750.field1389 != 12345678 || class281.field4917 && var5 <= class56.field912) {
                                                        class273.method1816(var2.field3750, var6, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, false);
                                                    }
                                                } else {
                                                    class273.method1816(var2.field3750, var6, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, true);
                                                }
                                            } else if (var2.field3746 != null) {
                                                if (!class187.method1281(var6, var3, var4)) {
                                                    var17 = true;
                                                    class263.method1761(var2.field3746, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, false);
                                                } else {
                                                    class263.method1761(var2.field3746, class247.field4251, class193.field3403, class57.field963, class12.field102, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class278 var18 = var2.field3757;
                                                if (var18 != null && (var18.field4889 & 2147483648L) != 0L) {
                                                    var18.field4891.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var18.field4884 - class260.field4540, var18.field4878 - class240.field4154, var18.field4882 - class163.field2869, var18.field4889, var5, (class136) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class167 var21 = var2.field3762;
                                            class62 var22 = var2.field3758;
                                            if (var21 != null || var22 != null) {
                                                if (class62.field1031 == var3) {
                                                    ++var19;
                                                } else if (class62.field1031 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class135.field2355 == var4) {
                                                    var19 += 3;
                                                } else if (class135.field2355 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class29.field539[var19];
                                                var2.field3759 = class56.field921[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2994 & class288.field5035[var19]) != 0) {
                                                    if (var21.field2994 == 16) {
                                                        var2.field3765 = 3;
                                                        var2.field3744 = class172.field3053[var19];
                                                        var2.field3763 = 3 - var2.field3744;
                                                    } else if (var21.field2994 == 32) {
                                                        var2.field3765 = 6;
                                                        var2.field3744 = class287.field5018[var19];
                                                        var2.field3763 = 6 - var2.field3744;
                                                    } else if (var21.field2994 == 64) {
                                                        var2.field3765 = 12;
                                                        var2.field3744 = class71.field1204[var19];
                                                        var2.field3763 = 12 - var2.field3744;
                                                    } else {
                                                        var2.field3765 = 9;
                                                        var2.field3744 = class38.field664[var19];
                                                        var2.field3763 = 9 - var2.field3744;
                                                    }
                                                } else {
                                                    var2.field3765 = 0;
                                                }
                                                if ((var21.field2994 & var20) != 0 && !class2.method10(var6, var3, var4, var21.field2994)) {
                                                    var21.field2988.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var21.field2985 - class260.field4540, var21.field2981 - class240.field4154, var21.field2978 - class163.field2869, var21.field2984, var5, (class136) null);
                                                }
                                                if ((var21.field2976 & var20) != 0 && !class2.method10(var6, var3, var4, var21.field2976)) {
                                                    var21.field2989.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var21.field2985 - class260.field4540, var21.field2981 - class240.field4154, var21.field2978 - class163.field2869, var21.field2984, var5, (class136) null);
                                                }
                                            }
                                            if (var22 != null && !class172.method1157(var6, var3, var4, var22.field1032.method226())) {
                                                if ((var22.field1030 & var20) != 0) {
                                                    var22.field1032.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var22.field1039 - class260.field4540 + var22.field1027, var22.field1035 - class240.field4154, var22.field1028 - class163.field2869 + var22.field1033, var22.field1034, var5, (class136) null);
                                                } else if (var22.field1030 == 256) {
                                                    int var23 = var22.field1039 - class260.field4540;
                                                    int var24 = var22.field1035 - class240.field4154;
                                                    int var25 = var22.field1028 - class163.field2869;
                                                    int var26 = var22.field1038;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field1032.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var22.field1027 + var23, var24, var22.field1033 + var25, var22.field1034, var5, (class136) null);
                                                    } else if (var22.field1029 != null) {
                                                        var22.field1029.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var23, var24, var25, var22.field1034, var5, (class136) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class278 var29 = var2.field3757;
                                                if (var29 != null && (var29.field4889 & 2147483648L) == 0L) {
                                                    var29.field4891.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var29.field4884 - class260.field4540, var29.field4878 - class240.field4154, var29.field4882 - class163.field2869, var29.field4889, var5, (class136) null);
                                                }
                                                class163 var30 = var2.field3756;
                                                if (var30 != null && var30.field2874 == 0) {
                                                    if (var30.field2863 != null) {
                                                        var30.field2863.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var30.field2873 - class260.field4540, var30.field2867 - class240.field4154, var30.field2868 - class163.field2869, var30.field2872, var5, (class136) null);
                                                    }
                                                    if (var30.field2862 != null) {
                                                        var30.field2862.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var30.field2873 - class260.field4540, var30.field2867 - class240.field4154, var30.field2868 - class163.field2869, var30.field2872, var5, (class136) null);
                                                    }
                                                    if (var30.field2875 != null) {
                                                        var30.field2875.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var30.field2873 - class260.field4540, var30.field2867 - class240.field4154, var30.field2868 - class163.field2869, var30.field2872, var5, (class136) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3753;
                                            if (var31 != 0) {
                                                if (var3 < class62.field1031 && (var31 & 4) != 0) {
                                                    class216 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3764) {
                                                        class34.field617.method536(var32, (byte) 105);
                                                    }
                                                }
                                                if (var4 < class135.field2355 && (var31 & 2) != 0) {
                                                    class216 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3764) {
                                                        class34.field617.method536(var33, (byte) -106);
                                                    }
                                                }
                                                if (var3 > class62.field1031 && (var31 & 1) != 0) {
                                                    class216 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3764) {
                                                        class34.field617.method536(var34, (byte) 98);
                                                    }
                                                }
                                                if (var4 > class135.field2355 && (var31 & 8) != 0) {
                                                    class216 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3764) {
                                                        class34.field617.method536(var35, (byte) -109);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3765 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3748; ++var37) {
                                                if (class112.field2022 != var2.field3743[var37].field1355 && (var2.field3755[var37] & var2.field3765) == var2.field3744) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class167 var38 = var2.field3762;
                                                if (!class2.method10(var6, var3, var4, var38.field2994)) {
                                                    var38.field2988.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var38.field2985 - class260.field4540, var38.field2981 - class240.field4154, var38.field2978 - class163.field2869, var38.field2984, var5, (class136) null);
                                                }
                                                var2.field3765 = 0;
                                            }
                                        }
                                        if (!var2.field3741) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3748;
                                            var2.field3741 = false;
                                            int var40 = 0;
                                            label584: for (int var41 = 0; var41 < var39; ++var41) {
                                                class77 var42 = var2.field3743[var41];
                                                if (class112.field2022 != var42.field1355) {
                                                    for (int var43 = var42.field1362; var43 <= var42.field1361; ++var43) {
                                                        for (int var44 = var42.field1357; var44 <= var42.field1371; ++var44) {
                                                            class216 var45 = var7[var43][var44];
                                                            if (var45.field3760) {
                                                                var2.field3741 = true;
                                                                continue label584;
                                                            }
                                                            if (var45.field3765 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1362) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field1361) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1357) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1371) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3765) == var2.field3763) {
                                                                    var2.field3741 = true;
                                                                    continue label584;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class198.field3451[var40++] = var42;
                                                    int var47 = class62.field1031 - var42.field1362;
                                                    int var48 = var42.field1361 - class62.field1031;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class135.field2355 - var42.field1357;
                                                    int var50 = var42.field1371 - class135.field2355;
                                                    if (var50 > var49) {
                                                        var42.field1358 = var47 + var50;
                                                    } else {
                                                        var42.field1358 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class77 var54 = class198.field3451[var53];
                                                    if (class112.field2022 != var54.field1355) {
                                                        if (var54.field1358 > var51) {
                                                            var51 = var54.field1358;
                                                            var52 = var53;
                                                        } else if (var54.field1358 == var51) {
                                                            int var55 = var54.field1363 - class260.field4540;
                                                            int var56 = var54.field1369 - class163.field2869;
                                                            int var57 = class198.field3451[var52].field1363 - class260.field4540;
                                                            int var58 = class198.field3451[var52].field1369 - class163.field2869;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class77 var59 = class198.field3451[var52];
                                                var59.field1355 = class112.field2022;
                                                if (!class28.method238(var6, var59.field1362, var59.field1361, var59.field1357, var59.field1371, var59.field1367.method226())) {
                                                    var59.field1367.method233(var59.field1373, class247.field4251, class193.field3403, class57.field963, class12.field102, var59.field1363 - class260.field4540, var59.field1359 - class240.field4154, var59.field1369 - class163.field2869, var59.field1372, var5, (class136) null);
                                                }
                                                for (int var60 = var59.field1362; var60 <= var59.field1361; ++var60) {
                                                    for (int var61 = var59.field1357; var61 <= var59.field1371; ++var61) {
                                                        class216 var62 = var7[var60][var61];
                                                        if (var62.field3765 != 0) {
                                                            class34.field617.method536(var62, (byte) 87);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3764) {
                                                            class34.field617.method536(var62, (byte) 115);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3741) {
                                                break;
                                            }
                                        } catch (Exception var97) {
                                            var2.field3741 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field3749 != null) {
                                        int var63 = class136.field2378 + class134.field2337;
                                        int var64 = class136.field2376 + class134.field2347;
                                        class64 var65 = var2.field3749.field217;
                                        for (class64 var66 = var65.field1081; var65 != var66; var66 = var66.field1081) {
                                            class148 var67 = (class148) var66;
                                            if (var67.field2602 != null && !var67.field2602.field4282.field2374) {
                                                if ((byte) ((int) (var67.field2602.field4282.field2380 & 255L)) != var2.field3751) {
                                                    var2.field3749 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field2608 >> 12) - class260.field4540;
                                                int var69 = (var67.field2609 >> 12) - class240.field4154;
                                                int var70 = (var67.field2611 >> 12) - class163.field2869;
                                                int var71 = class57.field963 * var70 + class12.field102 * var68 >> 16;
                                                int var72 = class12.field102 * var70 - class57.field963 * var68 >> 16;
                                                int var74 = class193.field3403 * var69 - class247.field4251 * var72 >> 16;
                                                int var75 = class247.field4251 * var69 + class193.field3403 * var72 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    class68.method449(var77, var78, var67.field2602.field4271.field416 >> 2, var67.field2604, var67.field2604 >> 24 & 255);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field3764);
                            } while (var2.field3765 != 0);
                            if (var3 > class62.field1031 || var3 <= class171.field3040) {
                                break;
                            }
                            var79 = var7[var3 - 1][var4];
                        } while (var79 != null && var79.field3764);
                        if (var3 < class62.field1031 || var3 >= class138.field2441 - 1) {
                            break;
                        }
                        var80 = var7[var3 + 1][var4];
                    } while (var80 != null && var80.field3764);
                    if (var4 > class135.field2355 || var4 <= class273.field4830) {
                        break;
                    }
                    var81 = var7[var3][var4 - 1];
                } while (var81 != null && var81.field3764);
                if (var4 < class135.field2355 || var4 >= class149.field2624 - 1) {
                    break;
                }
                var82 = var7[var3][var4 + 1];
            } while (var82 != null && var82.field3764);
            var2.field3764 = false;
            --class54.field881;
            class163 var83 = var2.field3756;
            if (var83 != null && var83.field2874 != 0) {
                if (var83.field2863 != null) {
                    var83.field2863.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var83.field2873 - class260.field4540, var83.field2867 - class240.field4154 - var83.field2874, var83.field2868 - class163.field2869, var83.field2872, var5, (class136) null);
                }
                if (var83.field2862 != null) {
                    var83.field2862.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var83.field2873 - class260.field4540, var83.field2867 - class240.field4154 - var83.field2874, var83.field2868 - class163.field2869, var83.field2872, var5, (class136) null);
                }
                if (var83.field2875 != null) {
                    var83.field2875.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var83.field2873 - class260.field4540, var83.field2867 - class240.field4154 - var83.field2874, var83.field2868 - class163.field2869, var83.field2872, var5, (class136) null);
                }
            }
            if (var2.field3759 != 0) {
                class62 var84 = var2.field3758;
                if (var84 != null && !class172.method1157(var6, var3, var4, var84.field1032.method226())) {
                    if ((var84.field1030 & var2.field3759) != 0) {
                        var84.field1032.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var84.field1039 - class260.field4540 + var84.field1027, var84.field1035 - class240.field4154, var84.field1028 - class163.field2869 + var84.field1033, var84.field1034, var5, (class136) null);
                    } else if (var84.field1030 == 256) {
                        int var85 = var84.field1039 - class260.field4540;
                        int var86 = var84.field1035 - class240.field4154;
                        int var87 = var84.field1028 - class163.field2869;
                        int var88 = var84.field1038;
                        int var89;
                        if (var88 != 1 && var88 != 2) {
                            var89 = var85;
                        } else {
                            var89 = -var85;
                        }
                        int var90;
                        if (var88 != 2 && var88 != 3) {
                            var90 = var87;
                        } else {
                            var90 = -var87;
                        }
                        if (var90 >= var89) {
                            var84.field1032.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var84.field1027 + var85, var86, var84.field1033 + var87, var84.field1034, var5, (class136) null);
                        } else if (var84.field1029 != null) {
                            var84.field1029.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var85, var86, var87, var84.field1034, var5, (class136) null);
                        }
                    }
                }
                class167 var91 = var2.field3762;
                if (var91 != null) {
                    if ((var91.field2976 & var2.field3759) != 0 && !class2.method10(var6, var3, var4, var91.field2976)) {
                        var91.field2989.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var91.field2985 - class260.field4540, var91.field2981 - class240.field4154, var91.field2978 - class163.field2869, var91.field2984, var5, (class136) null);
                    }
                    if ((var91.field2994 & var2.field3759) != 0 && !class2.method10(var6, var3, var4, var91.field2994)) {
                        var91.field2988.method233(0, class247.field4251, class193.field3403, class57.field963, class12.field102, var91.field2985 - class260.field4540, var91.field2981 - class240.field4154, var91.field2978 - class163.field2869, var91.field2984, var5, (class136) null);
                    }
                }
            }
            if (var5 < class13.field128 - 1) {
                class216 var92 = class128.field2236[var5 + 1][var3][var4];
                if (var92 != null && var92.field3764) {
                    class34.field617.method536(var92, (byte) 91);
                }
            }
            if (var3 < class62.field1031) {
                class216 var93 = var7[var3 + 1][var4];
                if (var93 != null && var93.field3764) {
                    class34.field617.method536(var93, (byte) -68);
                }
            }
            if (var4 < class135.field2355) {
                class216 var94 = var7[var3][var4 + 1];
                if (var94 != null && var94.field3764) {
                    class34.field617.method536(var94, (byte) -99);
                }
            }
            if (var3 > class62.field1031) {
                class216 var95 = var7[var3 - 1][var4];
                if (var95 != null && var95.field3764) {
                    class34.field617.method536(var95, (byte) 93);
                }
            }
            if (var4 > class135.field2355) {
                class216 var96 = var7[var3][var4 - 1];
                if (var96 != null && var96.field3764) {
                    class34.field617.method536(var96, (byte) 119);
                }
            }
        }
    }
}
