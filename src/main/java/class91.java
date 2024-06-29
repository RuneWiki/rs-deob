import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class91 extends class249 {

    @OriginalMember(owner = "client!dd", name = "Gb", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!dd", name = "Hb", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!dd", name = "Ib", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!dd", name = "Jb", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!dd", name = "Kb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!dd", name = "Lb", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!dd", name = "Mb", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!dd", name = "Ob", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!dd", name = "Pb", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!dd", name = "Qb", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!dd", name = "Sb", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!dd", name = "Tb", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!dd", name = "Ub", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!dd", name = "Vb", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!dd", name = "Rb", descriptor = "Laj;")
    public static class151 field1511;

    @OriginalMember(owner = "client!dd", name = "Nb", descriptor = "Lvk;")
    private class159 field1507;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([III[II)V")
    public static final void method629(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        ++field1503;
        if (arg2 > arg4) {
            int var5 = (arg4 - -arg2) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; ++var9) {
                if (~arg3[var9] > ~((1 & var9) + var7)) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method629(arg0, 76, var6 + -1, arg3, arg4);
            method629(arg0, 108, arg2, arg3, var6 + 1);
        }
        if (arg1 < 70) {
            method629((int[]) null, -99, -29, (int[]) null, -102);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)I")
    public final int method630(boolean arg0) {
        ++field1504;
        if (!arg0) {
            method637(83);
        }
        return super.field4182[super.field4160++] - this.field1507.method1186(2034002216) & 255;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(BI)I")
    public final int method631(byte arg0, int arg1) {
        if (arg0 != -12) {
            this.method641(false, -118);
        }
        ++field1513;
        return arg1 * 8 + -this.field1510;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BII)V")
    public final void method632(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 4789) {
            this.method638(-68);
        }
        for (int var5 = 0; var5 < arg2; ++var5) {
            arg1[var5 - -arg0] = (byte) (super.field4182[super.field4160++] + -this.field1507.method1186(2034002216));
        }
        ++field1502;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(IB)I")
    public static final int method633(int arg0, byte arg1) {
        ++field1509;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg1 != 52) {
            return -128;
        } else {
            int var3 = var2 | var2 >>> 2;
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILhg;IB)V")
    public static final void method634(int arg0, int arg1, class207 arg2, int arg3, byte arg4) {
        ++field1508;
        class159.method1187(-659813974);
        class211.method1488(arg3, arg1, arg2.field3484 + arg3, arg2.field3481 + arg1);
        if (class292.field4791 != 2 && class292.field4791 != 5 && class17.field339 != null) {
            int var5;
            int var6;
            int var7;
            int var8;
            if (~class169.field2739 == -5) {
                var5 = class54.field958;
                var6 = (int) class265.field4432 & 2047;
                var7 = 256;
                var8 = class138.field2264;
            } else {
                var6 = (int) class265.field4432 + class314.field5060 & 2047;
                var7 = class286.field4738 + 256;
                var5 = class16.field314.field771;
                var8 = class16.field314.field715;
            }
            int var9 = var8 / 32 + 48;
            int var10 = -(var5 / 32) + 464;
            ((class92) class17.field339).method655(arg3, arg1, arg2.field3484, arg2.field3481, var9, var10, var6, var7, arg2.field3363, arg2.field3359);
            if (class196.field3165 != null) {
                for (int var11 = 0; ~class196.field3165.field4005 < ~var11; ++var11) {
                    if (class196.field3165.field4008[var11] != null && ~(class196.field3165.field4001[var11] >> 28) == ~class182.field2898) {
                        int var12 = (16383 & class196.field3165.field4001[var11] >> 14) - class26.field462;
                        int var13 = (class196.field3165.field4001[var11] & 16383) + -class78.field1313;
                        if (~var12 <= -1 && ~var12 > -105 && ~var13 <= -1 && var13 < 104) {
                            int var14 = var12 * 4 + 2 + -(var8 / 32);
                            int var15 = var13 * 4 + 2 + -(var5 / 32);
                            class29.method187(arg2, arg3, var15, arg1, class196.field3165.field4008[var11].field3327, -12378, var14);
                        }
                    }
                }
            }
            for (int var16 = 0; ~var16 > ~class89.field1460; ++var16) {
                int var51 = class298.field4865[var16] * 4 + 2 + -(var5 / 32);
                int var52 = class167.field2699[var16] * 4 + -(var8 / 32) - -2;
                class1 var53 = class110.method827(class184.field2946[var16], (byte) -76);
                if (var53.field34 != null) {
                    var53 = var53.method22((byte) 117);
                    if (var53 == null || ~var53.field21 == 0) {
                        continue;
                    }
                }
                class29.method187(arg2, arg3, var51, arg1, var53.field21, -12378, var52);
            }
            for (int var17 = 0; ~var17 > -105; ++var17) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    class49 var48 = class125.field2101[class182.field2898][var17][var47];
                    if (var48 != null) {
                        int var49 = var17 * 4 + 2 + -(var8 / 32);
                        int var50 = var47 * 4 + -(var5 / 32) + 2;
                        class29.method186(arg3, -60, var49, arg2, class160.field2614[0], var50, arg1);
                    }
                }
            }
            for (int var18 = 0; ~class303.field4932 < ~var18; ++var18) {
                class307 var43 = class57.field1002[class186.field2972[var18]];
                if (var43 != null && var43.method287((byte) -86)) {
                    class54 var44 = var43.field4960;
                    if (var44 != null && var44.field904 != null) {
                        var44 = var44.method343(-1);
                    }
                    if (var44 != null && var44.field960 && var44.field943) {
                        int var45 = var43.field715 / 32 + -(var8 / 32);
                        int var46 = var43.field771 / 32 + -(var5 / 32);
                        if (~var44.field954 != 0) {
                            class29.method187(arg2, arg3, var46, arg1, var44.field954, -12378, var45);
                        } else {
                            class29.method186(arg3, -102, var45, arg2, class160.field2614[1], var46, arg1);
                        }
                    }
                }
            }
            for (int var19 = 0; class154.field2553 > var19; ++var19) {
                class123 var35 = class15.field300[class162.field2627[var19]];
                if (var35 != null && var35.method287((byte) -86)) {
                    int var36 = var35.field715 / 32 + -(var8 / 32);
                    int var37 = var35.field771 / 32 + -(var5 / 32);
                    boolean var38 = false;
                    for (int var39 = 0; ~class76.field1296 < ~var39; ++var39) {
                        if (var35.field2069.equals(class190.field3040[var39]) && class217.field3659[var39] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var40 = false;
                    for (int var41 = 0; ~var41 > ~class34.field549; ++var41) {
                        if (var35.field2069.equals(class272.field4534[var41].field1343)) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    if (~class16.field314.field2079 != -1 && ~var35.field2079 != -1 && ~class16.field314.field2079 == ~var35.field2079) {
                        var42 = true;
                    }
                    if (var38) {
                        class29.method186(arg3, -57, var36, arg2, class160.field2614[3], var37, arg1);
                    } else if (var40) {
                        class29.method186(arg3, -112, var36, arg2, class160.field2614[5], var37, arg1);
                    } else if (var42) {
                        class29.method186(arg3, -119, var36, arg2, class160.field2614[4], var37, arg1);
                    } else {
                        class29.method186(arg3, -118, var36, arg2, class160.field2614[2], var37, arg1);
                    }
                }
            }
            int var20 = 0;
            class245[] var21 = class250.field4234;
            while (~var20 > ~var21.length) {
                class245 var24 = var21[var20];
                if (var24 != null && var24.field4110 != 0 && ~(class275.field4598 % 20) > -11) {
                    if (var24.field4110 == 1 && ~var24.field4111 <= -1 && class57.field1002.length > var24.field4111) {
                        class307 var25 = class57.field1002[var24.field4111];
                        if (var25 != null) {
                            int var26 = var25.field715 / 32 + -(var8 / 32);
                            int var27 = var25.field771 / 32 + -(var5 / 32);
                            class272.method1920(360000, var24.field4103, -15545, arg1, arg3, var26, arg2, var27);
                        }
                    }
                    if (var24.field4110 == 2) {
                        int var28 = (var24.field4105 - class26.field462) * 4 - var8 / 32 + 2;
                        int var29 = (-class78.field1313 + var24.field4115) * 4 + (2 - var5 / 32);
                        int var30 = var24.field4106 * 4;
                        int var31 = var30 * var30;
                        class272.method1920(var31, var24.field4103, -15545, arg1, arg3, var28, arg2, var29);
                    }
                    if (~var24.field4110 == -11 && ~var24.field4111 <= -1 && var24.field4111 < class15.field300.length) {
                        class123 var32 = class15.field300[var24.field4111];
                        if (var32 != null) {
                            int var33 = var32.field715 / 32 - var8 / 32;
                            int var34 = var32.field771 / 32 + -(var5 / 32);
                            class272.method1920(360000, var24.field4103, -15545, arg1, arg3, var33, arg2, var34);
                        }
                    }
                }
                ++var20;
            }
            if (~class169.field2739 != -5) {
                if (class133.field2194 != 0) {
                    int var22 = class133.field2194 * 4 + 2 - (var8 / 32 + (-(2 * class16.field314.method294((byte) -117)) - -2));
                    int var23 = class163.field2661 * 4 + 2 - var5 / 32 - -(2 * (-1 + class16.field314.method294((byte) -106)));
                    class29.method186(arg3, -120, var22, arg2, class95.field1552[class130.field2149 ? 1 : 0], var23, arg1);
                }
                class211.method1483(arg2.field3484 / 2 + arg3 - 1, arg2.field3481 / 2 + arg1 + -1, 3, 3, 16777215);
            }
        } else {
            class211.method1492(arg3, arg1, 0, arg2.field3363, arg2.field3359);
        }
        class236.field3988[arg0] = true;
        int var54 = -84 / ((61 - arg4) / 52);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
    public class91(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "(I)V")
    public final void method635(int arg0) {
        if (arg0 != -31777) {
            this.method641(true, -15);
        }
        ++field1512;
        this.field1510 = super.field4160 * 8;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "([II)V")
    public final void method636(int[] arg0, int arg1) {
        ++field1501;
        if (arg1 != 2047) {
            this.field1507 = null;
        }
        this.field1507 = new class159(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "(I)V")
    public static void method637(int arg0) {
        if (arg0 == 2) {
            field1511 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "(I)V")
    public final void method638(int arg0) {
        super.field4160 = (this.field1510 - arg0) / 8;
        ++field1514;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I")
    public static final int method639(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field1505;
        if (arg3 != 16383) {
            return -32;
        } else if (var4 == 0) {
            return arg2;
        } else if (~var4 == -2) {
            return arg0;
        } else {
            return var4 == 2 ? -arg2 + 7 : 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(BI)V")
    public final void method640(byte arg0, int arg1) {
        if (arg0 != 97) {
            this.field1507 = null;
        }
        super.field4182[super.field4160++] = (byte) (arg1 + this.field1507.method1186(2034002216));
        ++field1500;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(ZI)I")
    public final int method641(boolean arg0, int arg1) {
        ++field1506;
        int var3 = this.field1510 >> 3;
        int var4 = -(this.field1510 & 7) + 8;
        int var5 = 0;
        this.field1510 += arg1;
        while (var4 < arg1) {
            var5 += (super.field4182[var3++] & class88.field1458[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0) {
            return -120;
        } else {
            int var6;
            if (arg1 != var4) {
                var6 = (super.field4182[var3] >> -arg1 + var4 & class88.field1458[arg1]) + var5;
            } else {
                var6 = (super.field4182[var3] & class88.field1458[var4]) + var5;
            }
            return var6;
        }
    }
}
