import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class724 extends class243 {

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    private int field10111 = -1;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field10114 = 0;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    public static int field10115;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
    public int field10118;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    public int field10119;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cp", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field10120;

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "[I")
    public int[] field10110;

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class724() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(FBFF)F")
    public static final float method4064(float arg0, byte arg1, float arg2, float arg3) {
        ++field10116;
        int var4 = -124 % ((-31 - arg1) / 48);
        return (arg2 - arg0) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[[I")
    public int[][] method2(int arg0, int arg1) {
        ++field10113;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335 && this.method4066(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field10119 * (class676.field9444 != this.field10118 ? this.field10118 * arg1 / class676.field9444 : arg1);
            if (~class687.field9628 == ~this.field10119) {
                for (int var8 = 0; var8 < class687.field9628; ++var8) {
                    int var9 = this.field10110[var7++];
                    var6[var8] = class321.method1919(4080, var9 << 4);
                    var5[var8] = class321.method1919(4080, var9 >> 4);
                    var4[var8] = class321.method1919(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class687.field9628; ++var10) {
                    int var11 = this.field10119 * var10 / class687.field9628;
                    int var12 = this.field10110[var7 + var11];
                    var6[var10] = class321.method1919(4080, var12 << 4);
                    var5[var10] = class321.method1919(var12, 65280) >> 4;
                    var4[var10] = class321.method1919(4080, var12 >> 12);
                }
            }
        }
        if (arg0 >= -76) {
            this.field10118 = -123;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I")
    public final int method1459(byte arg0) {
        ++field10117;
        if (arg0 > -119) {
            field10114 = 39;
        }
        return this.field10111;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
    public final void method1456(int arg0) {
        super.method1456((short) arg0);
        ++field10115;
        this.field10110 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lha;II)Z")
    public static final boolean method4065(class60 arg0, int arg1, int arg2) {
        ++field10112;
        int var3 = (class272.field3589 + -104) / 2;
        int var4 = (class3.field26 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~var6 > ~(var3 + 104); ++var6) {
            for (int var57 = var4; ~(var4 + 104) < ~var57; ++var57) {
                for (int var58 = arg1; var58 <= 3; ++var58) {
                    if (class351.method2038(var57, var58, var6, arg1, arg2 ^ 8894)) {
                        int var59 = var58;
                        if (class669.method3767(var57, (byte) -92, var6)) {
                            var59 = var58 - 1;
                        }
                        if (~var59 <= -1) {
                            var5 &= class488.method2748(var6, var59, (byte) 112, var57);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                var7[var8] = -16777216;
            }
            class480.field6631 = arg0.method351(-7962, 0, 512, 512, var7, 512);
            class733.method4102(0);
            int var9 = -16777216 | 238 + (int) (20.0D * Math.random()) - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 16)) + (238 + (int) (20.0D * Math.random()) - 10 << 8);
            int var10 = -16777216 | -10 + (int) (Math.random() * 20.0D) + 238 << 16;
            int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (8.0D * Math.random()) << 16;
            boolean[][] var12 = new boolean[class698.field9829 + 1 - -2][class698.field9829 - -2 + 1];
            for (int var13 = var3; ~(var3 + 104) < ~var13; var13 += class698.field9829) {
                for (int var36 = var4; var36 < var4 + 104; var36 += class698.field9829) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (var13 > 0) {
                        var37 += 4;
                        var39 = var13 - 1;
                    }
                    int var40 = var36;
                    if (var36 > 0) {
                        var40 = var36 - 1;
                    }
                    int var41 = class698.field9829 + var13;
                    if (~var41 > -105) {
                        ++var41;
                    }
                    int var42 = class698.field9829 + var36;
                    if (var42 < 104) {
                        var38 += 4;
                        ++var42;
                    }
                    arg0.method426(0, 0, class698.field9829 * 4 + var37, class698.field9829 * 4 + var38);
                    arg0.method402(-16777216);
                    for (int var43 = arg1; ~var43 >= -4; ++var43) {
                        for (int var50 = 0; class698.field9829 >= var50; ++var50) {
                            for (int var56 = 0; ~class698.field9829 <= ~var56; ++var56) {
                                var12[var50][var56] = class351.method2038(var40 - -var56, var43, var39 - -var50, arg1, 107);
                            }
                        }
                        class86.field1182[var43].method1533(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class178.field2181) {
                            for (int var51 = -4; ~class698.field9829 < ~var51; ++var51) {
                                for (int var52 = -4; ~var52 > ~class698.field9829; ++var52) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 + var52;
                                    if (var3 <= var53 && var4 <= var54 && class351.method2038(var54, var43, var53, arg1, 56)) {
                                        int var55 = var43;
                                        if (class669.method3767(var54, (byte) -101, var53)) {
                                            var55 = var43 - 1;
                                        }
                                        if (var55 >= 0) {
                                            class201.method1111(var55, var51 * 4 + var37, var54, var10, arg0, (class698.field9829 - var52) * 4 + var38 + -4, true, var53, var9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class178.field2181) {
                        class298 var44 = class171.field2130[arg1];
                        for (int var45 = 0; ~var45 > ~class698.field9829; ++var45) {
                            for (int var46 = 0; class698.field9829 > var46; ++var46) {
                                int var47 = var13 - -var45;
                                int var48 = var36 - -var46;
                                int var49 = var44.field3994[-var44.field3999 + var47][-var44.field4003 + var48];
                                if ((1076101120 & var49) == 0) {
                                    if (~(8388608 & var49) != -1) {
                                        arg0.method359(22294, 4, -1713569622, (class698.field9829 - var46) * 4 + (var38 - 4), var45 * 4 + var37);
                                    } else if ((33554432 & var49) == 0) {
                                        if ((var49 & 134217728) != 0) {
                                            arg0.method359(22294, 4, -1713569622, (-var46 + class698.field9829) * 4 + var38 + -4 - -3, var45 * 4 + var37);
                                        } else if (~(var49 & 536870912) != -1) {
                                            arg0.method361(arg2 + -460, (-var46 + class698.field9829) * 4 + var38 + -4, var45 * 4 + var37, -1713569622, 4);
                                        }
                                    } else {
                                        arg0.method361(8479, var38 - (-((-var46 + class698.field9829) * 4) - -4), var45 * 4 + 3 + var37, -1713569622, 4);
                                    }
                                } else {
                                    arg0.method368(4, 4, (-var46 + class698.field9829) * 4 + var38 + -4, -1713569622, (byte) -66, var45 * 4 + var37);
                                }
                            }
                        }
                    }
                    arg0.method447(var37, var38, class698.field9829 * 4, class698.field9829 * 4, var11, 2);
                    class480.field6631.method662((-var3 + var13) * 4 + 48, 464 - (-var4 + var36) * 4 + -(class698.field9829 * 4), class698.field9829 * 4, class698.field9829 * 4, var37, var38);
                }
            }
            arg0.method406();
            arg0.method402(-16777215);
            if (arg2 != 8939) {
                method4065((class60) null, 43, 57);
            }
            class340.method2004(2);
            class3.field33 = 0;
            class110.field1462.method728((byte) 47);
            if (!class178.field2181) {
                for (int var14 = var3; var14 < var3 + 104; ++var14) {
                    for (int var20 = var4; ~var20 > ~(var4 - -104); ++var20) {
                        for (int var21 = arg1; ~(arg1 + 1) <= ~var21 && ~var21 >= -4; ++var21) {
                            if (class351.method2038(var20, var21, var14, arg1, arg2 + -9060)) {
                                class722 var22 = (class722) class531.method2936(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class722) class300.method1797(var21, var14, var20, field10120 != null ? field10120 : (field10120 = method4067("rl")));
                                }
                                if (var22 == null) {
                                    var22 = (class722) class537.method2958(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class722) class278.method1659(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class685 var23 = class707.field9894.method4109(var22.method680(30472), (byte) 119);
                                    if (!var23.field9527 || class262.field3431) {
                                        int var24 = var23.field9566;
                                        if (var23.field9528 != null) {
                                            for (int var25 = 0; ~var25 > ~var23.field9528.length; ++var25) {
                                                if (var23.field9528[var25] != -1) {
                                                    class685 var26 = class707.field9894.method4109(var23.field9528[var25], (byte) 119);
                                                    if (~var26.field9566 <= -1) {
                                                        var24 = var26.field9566;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class292 var28 = class224.field2894.method1647(-70, var24);
                                                if (var28 != null && var28.field3899) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class171.field2130[var21].field3994;
                                                int var32 = class171.field2130[var21].field3999;
                                                int var33 = class171.field2130[var21].field4003;
                                                for (int var34 = 0; var34 < 10; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && ~var3 > ~var29 && ~(var14 + -3) > ~var29 && ~(var31[var29 + -1 + -var32][-var33 + var30] & 2883848) == -1) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && ~var29 > ~(var3 + 104 + -1) && var29 < var14 + 3 && (2883968 & var31[-var32 + 1 + var29][var30 - var33]) == 0) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && ~var30 < ~var4 && var30 > var20 - 3 && ~(var31[var29 - var32][-var33 + -1 + var30] & 2883842) == -1) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && ~var30 > ~(var4 + 103) && ~var30 > ~(var20 - -3) && ~(var31[-var32 + var29][var30 - var33 + 1] & 2883872) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class262.field3432[class3.field33] = var23.field9541;
                                            class37.field388[class3.field33] = var29;
                                            class348.field4631[class3.field33] = var30;
                                            ++class3.field33;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class330.field4451 != null) {
                    client.field4109.field7039 = 1;
                    class224.field2894.method1649(64, -30502, 1024);
                    for (int var15 = 0; ~class330.field4451.field1744 < ~var15; ++var15) {
                        int var16 = class330.field4451.field1740[var15];
                        if (~(var16 >> 28) == ~class653.field9086.field2175) {
                            int var17 = (var16 >> 14 & 16383) + -class99.field1313;
                            int var18 = (var16 & 16383) + -class133.field1704;
                            if (~var17 <= -1 && ~class272.field3589 < ~var17 && ~var18 <= -1 && ~class3.field26 < ~var18) {
                                class110.field1462.method725(new class629(var15), -20911);
                            } else {
                                class292 var19 = class224.field2894.method1647(-25, class330.field4451.field1745[var15]);
                                if (var19.field3903 != null && var19.field3881 + var17 >= 0 && class272.field3589 > var19.field3878 + var17 && var19.field3900 + var18 >= 0 && ~class3.field26 < ~(var19.field3883 + var18)) {
                                    class110.field1462.method725(new class629(var15), -20911);
                                }
                            }
                        }
                    }
                    class224.field2894.method1649(64, -30502, 128);
                    client.field4109.field7039 = 2;
                    client.field4109.method2900((byte) -120);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field10111 = arg1.method3402((byte) 127);
        }
        if (arg2 >= -92) {
            this.field10111 = -74;
        }
        ++field10109;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Z")
    public final boolean method4066(int arg0) {
        ++field10108;
        if (this.field10110 != null) {
            return true;
        } else if (this.field10111 >= 0) {
            class204 var2 = ~class626.field8756 <= -1 ? class204.method1129(class211.field2530, class626.field8756, this.field10111) : class204.method1127(class211.field2530, this.field10111);
            var2.method1136();
            this.field10110 = var2.method1130();
            this.field10118 = var2.field2419;
            this.field10119 = var2.field2421;
            return true;
        } else {
            if (arg0 != -1) {
                this.method4066(22);
            }
            return false;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4067(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
