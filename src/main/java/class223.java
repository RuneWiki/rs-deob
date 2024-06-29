import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class223 extends class518 {

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[[I")
    public static int[][] field3137 = new int[128][128];

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field3138;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field3141;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public final void method220(int arg0, int arg1, int arg2) {
        ++field3138;
        if (arg1 != 0) {
            this.field3131 = 102;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)V")
    public final void method223(int arg0, byte arg1, int arg2) {
        ++field3135;
        int var4 = this.field3132 * arg2 >> 12;
        int var5 = this.field3140 * arg2 >> 12;
        if (arg1 >= -86) {
            method1456(-15);
        }
        int var6 = this.field3139 * arg0 >> 12;
        int var7 = this.field3131 * arg0 >> 12;
        class289.method1871(super.field7535, var4, var6, 205, var7, var5);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIII)V")
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3140 = arg2;
        this.field3139 = arg1;
        this.field3132 = arg0;
        this.field3131 = arg3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ)V")
    public final void method224(int arg0, int arg1, boolean arg2) {
        ++field3134;
        if (!arg2) {
            method1454(108, (class605) null, 3);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILoa;I)Z")
    public static final boolean method1454(int arg0, class605 arg1, int arg2) {
        ++field3136;
        int var3 = (class90.field1032 + -104) / 2;
        int var4 = (class30.field349 - 104) / 2;
        boolean var5 = true;
        if (arg0 > -64) {
            field3137 = null;
        }
        for (int var6 = var3; ~var6 > ~(var3 + 104); ++var6) {
            for (int var57 = var4; var4 + 104 > var57; ++var57) {
                for (int var58 = arg2; var58 <= 3; ++var58) {
                    if (class582.method3378(var6, (byte) -74, var57, arg2, var58)) {
                        int var59 = var58;
                        if (class647.method3709(var6, var57, -17206)) {
                            var59 = var58 - 1;
                        }
                        if (~var59 <= -1) {
                            var5 &= class166.method960(var6, var59, 28412, var57);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class191.field2507 = arg1.method343(var7, 0, 512, 512, 512);
            class629.method3604(-200);
            int var9 = (228 + (int) (Math.random() * 20.0D) << 8) + ((238 - (-((int) (Math.random() * 20.0D)) - -10) << 16) - 10 - (-238 + -((int) (Math.random() * 20.0D)))) | -16777216;
            int var10 = (-10 + (238 - -((int) (20.0D * Math.random()))) | 1630338816) << 16;
            int var11 = (int) (8.0D * Math.random()) << 8 | (int) (8.0D * Math.random()) << 16 | (int) (8.0D * Math.random());
            boolean[][] var12 = new boolean[class158.field1959 + 1][class158.field1959 + 1];
            for (int var13 = var3; var13 < var3 + 104; var13 += class158.field1959) {
                for (int var36 = var4; var36 < var4 + 104; var36 += class158.field1959) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (var13 > 0) {
                        var37 += 4;
                        var39 = var13 - 1;
                    }
                    int var40 = var36;
                    if (~var36 < -1) {
                        var40 = var36 - 1;
                    }
                    int var41 = class158.field1959 + var13;
                    if (var41 < 104) {
                        ++var41;
                    }
                    int var42 = var36 - -class158.field1959;
                    if (~var42 > -105) {
                        ++var42;
                        var38 += 4;
                    }
                    arg1.method368(0, 0, class158.field1959 * 4 + var37, class158.field1959 * 4 + var38);
                    arg1.method344(-16777216);
                    for (int var43 = arg2; ~var43 >= -4; ++var43) {
                        for (int var50 = 0; class158.field1959 >= var50; ++var50) {
                            for (int var56 = 0; ~class158.field1959 <= ~var56; ++var56) {
                                var12[var50][var56] = class582.method3378(var39 + var50, (byte) -74, var40 + var56, arg2, var43);
                            }
                        }
                        class544.field7780[var43].method260(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class390.field5969) {
                            for (int var51 = -4; class158.field1959 > var51; ++var51) {
                                for (int var52 = -4; ~var52 > ~class158.field1959; ++var52) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 - -var52;
                                    if (~var53 <= ~var3 && var54 >= var4 && class582.method3378(var53, (byte) -74, var54, arg2, var43)) {
                                        int var55 = var43;
                                        if (class647.method3709(var53, var54, -17206)) {
                                            var55 = var43 - 1;
                                        }
                                        if (~var55 <= -1) {
                                            class398.method2542(var54, var55, arg1, var51 * 4 + var37, var10, var53, (byte) 22, var38 + -4 - -((-var52 + class158.field1959) * 4), var9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class390.field5969) {
                        class468 var44 = class14.field120[arg2];
                        for (int var45 = 0; ~class158.field1959 < ~var45; ++var45) {
                            for (int var46 = 0; ~class158.field1959 < ~var46; ++var46) {
                                int var47 = var13 - -var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field6941[var47 - var44.field6949][-var44.field6943 + var48];
                                if ((var49 & 1076101120) != 0) {
                                    arg1.method3524(4, (-var46 + class158.field1959) * 4 + var38 + -4, (byte) 92, -1713569622, 4, var45 * 4 + var37);
                                } else if ((8388608 & var49) != 0) {
                                    arg1.method3521(var45 * 4 + var37, 4, -1713569622, 2, (class158.field1959 - var46) * 4 + var38 - 4);
                                } else if ((33554432 & var49) != 0) {
                                    arg1.method3525(-1713569622, var37 - -(var45 * 4) - -3, (-var46 + class158.field1959) * 4 + var38 + -4, 1, 4);
                                } else if (~(134217728 & var49) == -1) {
                                    if ((536870912 & var49) != 0) {
                                        arg1.method3525(-1713569622, var45 * 4 + var37, (-var46 + class158.field1959) * 4 + var38 - 4, 1, 4);
                                    }
                                } else {
                                    arg1.method3521(var45 * 4 + var37, 4, -1713569622, 2, var38 - -((-var46 + class158.field1959) * 4) + 3 + -4);
                                }
                            }
                        }
                    }
                    arg1.method394(var37, var38, class158.field1959 * 4, class158.field1959 * 4, var11, 2);
                    class191.field2507.method1581((-var3 + var13) * 4 + 48, 464 - (-var4 + var36) * 4 + -(class158.field1959 * 4), class158.field1959 * 4, class158.field1959 * 4, var37, var38);
                }
            }
            arg1.method404();
            arg1.method344(-16777215);
            class410.method2598(120);
            class74.field790 = 0;
            class155.field1923.method718(-124);
            if (!class390.field5969) {
                for (int var14 = var3; var3 + 104 > var14; ++var14) {
                    for (int var20 = var4; ~var20 > ~(var4 + 104); ++var20) {
                        for (int var21 = arg2; var21 <= arg2 - -1 && ~var21 >= -4; ++var21) {
                            if (class582.method3378(var14, (byte) -74, var20, arg2, var21)) {
                                class57 var22 = (class57) class157.method911(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class57) class226.method1473(var21, var14, var20, field3141 != null ? field3141 : (field3141 = method1457("qn")));
                                }
                                if (var22 == null) {
                                    var22 = (class57) class491.method2948(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class57) class458.method2824(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class385 var23 = class575.field8301.method1499(-7532, var22.method89(95));
                                    if (!var23.field5832 || class525.field7616) {
                                        int var24 = var23.field5882;
                                        if (var23.field5793 != null) {
                                            for (int var25 = 0; var23.field5793.length > var25; ++var25) {
                                                if (var23.field5793[var25] != -1) {
                                                    class385 var26 = class575.field8301.method1499(-7532, var23.field5793[var25]);
                                                    if (~var26.field5882 <= -1) {
                                                        var24 = var26.field5882;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class431 var28 = class59.field680.method1014(var24, 5187);
                                                if (var28 != null && var28.field6398) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class14.field120[var21].field6941;
                                                int var32 = class14.field120[var21].field6949;
                                                int var33 = class14.field120[var21].field6943;
                                                for (int var34 = 0; var34 < 10; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && ~var29 < ~var3 && var14 + -3 < var29 && ~(var31[-var32 + var29 - 1][-var33 + var30] & 2883848) == -1) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && ~var29 > ~(var3 + 103) && ~(var14 - -3) < ~var29 && (var31[-var32 + var29 - -1][-var33 + var30] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && var4 < var30 && ~(var20 + -3) > ~var30 && ~(var31[var29 - var32][var30 + -1 + -var33] & 2883842) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && var30 < var4 + -1 + 104 && var30 < var20 + 3 && (var31[-var32 + var29][var30 - (var33 + -1)] & 2883872) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class479.field7051[class74.field790] = var23.field5810;
                                            class197.field2671[class74.field790] = var29;
                                            class310.field4566[class74.field790] = var30;
                                            ++class74.field790;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class561.field8015 != null) {
                    class195.field2652.field2708 = 1;
                    class59.field680.method1013(1024, -120, 64);
                    for (int var15 = 0; var15 < class561.field8015.field1695; ++var15) {
                        int var16 = class561.field8015.field1693[var15];
                        if (~(var16 >> 28) == ~class439.field6548.field1757) {
                            int var17 = ((268430147 & var16) >> 14) + -class287.field3980;
                            int var18 = (var16 & 16383) + -class250.field3549;
                            if (~var17 <= -1 && class90.field1032 > var17 && var18 >= 0 && ~class30.field349 < ~var18) {
                                class155.field1923.method706(new class388(var15), true);
                            } else {
                                class431 var19 = class59.field680.method1014(class561.field8015.field1694[var15], 5187);
                                if (var19.field6428 != null && var19.field6410 + var17 >= 0 && ~class90.field1032 < ~(var17 - -var19.field6391) && ~(var18 - -var19.field6412) <= -1 && class30.field349 > var19.field6402 + var18) {
                                    class155.field1923.method706(new class388(var15), true);
                                }
                            }
                        }
                    }
                    class59.field680.method1013(128, -120, 64);
                    class195.field2652.field2708 = 2;
                    class195.field2652.method1293(-23829);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method1455(int arg0) {
        field3137 = null;
        if (arg0 != -1) {
            field3137 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static final void method1456(int arg0) {
        ++field3133;
        if (arg0 == 6262) {
            class599.field8749 = new class114();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1457(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
