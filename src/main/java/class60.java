import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class60 extends class123 {

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    private int field1146 = 1;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    private int field1141 = 1;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "[I")
    public static int[] field1140 = new int[1000];

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
    public static int field1144 = -1;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "Leb;")
    public static class230 field1137 = class68.method589(0, "Versteckt");

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "Z")
    public static boolean field1149 = false;

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "Leb;")
    private static class230 field1145 = class68.method589(0, "flash1:");

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "Leb;")
    public static class230 field1139 = field1145;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "Leb;")
    public static class230 field1151 = field1145;

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "Leb;")
    public static class230 field1152 = class68.method589(0, ": ");

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "Lv;")
    public static class147 field1132 = new class147(50);

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "Leb;")
    public static class230 field1153 = class68.method589(0, "<col=ffffff>");

    @OriginalMember(owner = "client!oc", name = "wb", descriptor = "Leb;")
    private static class230 field1157 = class68.method589(0, "Loaded sprites");

    @OriginalMember(owner = "client!oc", name = "xb", descriptor = "Leb;")
    private static class230 field1158 = class68.method589(0, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!oc", name = "ub", descriptor = "Leb;")
    public static class230 field1155 = field1157;

    @OriginalMember(owner = "client!oc", name = "vb", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!oc", name = "yb", descriptor = "Leb;")
    public static class230 field1159 = field1158;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!oc", name = "tb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field1142;
        int[] var3 = super.field2160.method1323((byte) -113, arg0);
        int var4 = 88 % ((-24 - arg1) / 57);
        if (super.field2160.field3243) {
            int var5 = this.field1146 - -this.field1146 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field1141 - -this.field1141 - -1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg0 - this.field1146; this.field1146 + arg0 >= var10; ++var10) {
                int[] var14 = this.method965(0, class79.field1431 & var10, (byte) 33);
                int[] var15 = new int[class140.field2505];
                int var16 = 0;
                for (int var17 = -this.field1141; var17 <= this.field1141; ++var17) {
                    var16 += var14[class217.field3743 & var17];
                }
                int var18 = 0;
                while (~class140.field2505 < ~var18) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[-this.field1141 + var18 & class217.field3743];
                    ++var18;
                    var16 = var14[class217.field3743 & this.field1141 + var18] + var19;
                }
                var9[-arg0 + var10 + this.field1146] = var15;
            }
            for (int var11 = 0; ~var11 > ~class140.field2505; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            return null;
        } else {
            int[][] var3 = super.field2152.method1106(arg0, -7034);
            ++field1148;
            if (super.field2152.field2616) {
                int var4 = this.field1141 + this.field1141 - -1;
                int var5 = this.field1146 + this.field1146 - -1;
                int var6 = 65536 / var5;
                int[][][] var7 = new int[var5][][];
                int var8 = 65536 / var4;
                for (int var9 = -this.field1146 + arg0; ~var9 >= ~(this.field1146 + arg0); ++var9) {
                    int[][] var19 = this.method960(0, var9 & class79.field1431, (byte) -41);
                    int var20 = 0;
                    int[][] var21 = new int[3][class140.field2505];
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field1141; ~this.field1141 <= ~var27; ++var27) {
                        int var37 = class217.field3743 & var27;
                        var20 += var24[var37];
                        var23 += var26[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var21[0];
                    int[] var29 = var21[2];
                    int[] var30 = var21[1];
                    int var31 = 0;
                    while (~var31 > ~class140.field2505) {
                        var28[var31] = var8 * var20 >> 16;
                        var30[var31] = var8 * var22 >> 16;
                        var29[var31] = var8 * var23 >> 16;
                        int var32 = -this.field1141 + var31 & class217.field3743;
                        ++var31;
                        int var33 = var20 - var24[var32];
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = this.field1141 + var31 & class217.field3743;
                        var22 = var25[var36] + var34;
                        var23 = var26[var36] + var35;
                        var20 = var24[var36] + var33;
                    }
                    var7[-arg0 + var9 - -this.field1146] = var21;
                }
                int[] var10 = var3[1];
                int[] var11 = var3[0];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class140.field2505 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var5 > var17; ++var17) {
                        int[][] var18 = var7[var17];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                    }
                    var11[var13] = var6 * var14 >> 16;
                    var10[var13] = var6 * var15 >> 16;
                    var12[var13] = var6 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLka;)Leb;")
    public static final class230 method507(byte arg0, class245 arg1) {
        ++field1143;
        if (arg0 >= -111) {
            method510(-102);
        }
        if (class95.method810(client.method1167(arg1), -128) == 0) {
            return null;
        } else if (arg1.field4246 != null && arg1.field4246.method1628(12348).method1635(-112) != 0) {
            return arg1.field4246;
        } else {
            return class271.field4786 ? class117.field2098 : null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBIII)V")
    public static final void method508(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (~arg1 >= ~class259.field4587 && class15.field345 <= arg4) {
            boolean var6;
            if (arg0 < class78.field1404) {
                arg0 = class78.field1404;
                var6 = false;
            } else if (arg0 <= class42.field769) {
                var6 = true;
            } else {
                var6 = false;
                arg0 = class42.field769;
            }
            boolean var7;
            if (arg3 >= class78.field1404) {
                if (~arg3 >= ~class42.field769) {
                    var7 = true;
                } else {
                    arg3 = class42.field769;
                    var7 = false;
                }
            } else {
                var7 = false;
                arg3 = class78.field1404;
            }
            if (~arg1 <= ~class15.field345) {
                class182.method1311(arg5, arg3, true, class66.field1254[arg1++], arg0);
            } else {
                arg1 = class15.field345;
            }
            if (class259.field4587 < arg4) {
                arg4 = class259.field4587;
            } else {
                class182.method1311(arg5, arg3, true, class66.field1254[arg4--], arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg1; arg4 >= var8; ++var8) {
                    int[] var9 = class66.field1254[var8];
                    var9[arg0] = var9[arg3] = arg5;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg1; ~var10 >= ~arg4; ++var10) {
                        class66.field1254[var10][arg3] = arg5;
                    }
                }
            } else {
                for (int var11 = arg1; var11 <= arg4; ++var11) {
                    class66.field1254[var11][arg0] = arg5;
                }
            }
        }
        if (arg2 != 104) {
            field1145 = null;
        }
        ++field1150;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2147 = arg1.method200(arg2 + -1876195533) == 1;
                }
            } else {
                this.field1146 = arg1.method200(255);
            }
        } else {
            this.field1141 = arg1.method200(255);
        }
        ++field1136;
        if (arg2 != 1876195788) {
            field1155 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public static final void method509(int arg0) {
        int var1 = 84 / ((-28 - arg0) / 52);
        class91.field1647 = 0;
        class109.field1961 = 2;
        class61.field1180 = 0;
        class30.field559 = 0;
        class178.field3126 = 0;
        class112.field2009 = null;
        ++field1134;
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    public static final void method510(int arg0) {
        ++field1138;
        if (arg0 <= 104) {
            field1145 = null;
        }
        if (~class259.field4572 == -122) {
            int var1 = class183.field3182.method173(-100);
            int var2 = class183.field3182.method196(-112);
            int var3 = class183.field3182.method167(-1);
            int var4 = (var3 >> 4 & 7) + class144.field2574;
            int var5 = (var3 & 7) + class214.field3702;
            int var6 = class183.field3182.method196(-96);
            if (~var4 <= -1 && ~var5 <= -1 && var4 < 104 && var5 < 104 && ~class33.field615 != ~var6) {
                class88 var7 = new class88();
                var7.field1536 = var2;
                var7.field1528 = var1;
                if (class237.field4090[class124.field2174][var4][var5] == null) {
                    class237.field4090[class124.field2174][var4][var5] = new class98();
                }
                class237.field4090[class124.field2174][var4][var5].method843(-5, new class196(var7));
                class144.method1096(var4, -99999999, var5);
            }
        } else if (class259.field4572 == 254) {
            int var8 = class183.field3182.method200(255);
            int var9 = class144.field2574 - -(7 & var8 >> 4);
            int var10 = class214.field3702 - -(var8 & 7);
            int var11 = class183.field3182.method161(4);
            int var12 = class183.field3182.method200(255);
            int var13 = class183.field3182.method161(4);
            if (var9 >= 0 && ~var10 <= -1 && var9 < 104 && var10 < 104) {
                int var14 = var9 * 128 + 64;
                int var15 = var10 * 128 + 64;
                class153 var16 = new class153(var11, class124.field2174, var14, var15, class37.method333(var15, 1637367879, class124.field2174, var14) + -var12, var13, class259.field4584);
                class123.field2144.method843(-5, new class149(var16));
            }
        } else if (class259.field4572 == 57) {
            int var17 = class183.field3182.method200(255);
            int var18 = ((124 & var17) >> 4) + class144.field2574;
            int var19 = (7 & var17) + class214.field3702;
            int var20 = class183.field3182.method161(4);
            int var21 = class183.field3182.method200(255);
            int var22 = var21 & 7;
            if (var20 == 65535) {
                var20 = -1;
            }
            int var23 = var21 >> 4 & 15;
            int var24 = class183.field3182.method200(255);
            if (~var18 <= -1 && ~var19 <= -1 && var18 < 104 && ~var19 > -105) {
                int var25 = var23 + 1;
                if (-var25 + var18 <= class56.field1033.field2296[0] && ~(var18 + var25) <= ~class56.field1033.field2296[0] && ~(var19 - var25) >= ~class56.field1033.field2253[0] && ~class56.field1033.field2253[0] >= ~(var19 + var25) && ~class231.field4020 != -1 && var22 > 0 && ~class17.field386 > -51 && ~var20 != 0) {
                    class88.field1526[class17.field386] = var20;
                    class179.field3144[class17.field386] = var22;
                    class110.field1982[class17.field386] = var24;
                    class190.field3361[class17.field386] = null;
                    class26.field491[class17.field386] = (var18 << 16) + (var19 << 8) + var23;
                    ++class17.field386;
                }
            }
        } else if (~class259.field4572 == -72) {
            int var26 = class183.field3182.method200(255);
            int var27 = (var26 >> 4 & 7) + class144.field2574;
            int var28 = (var26 & 7) + class214.field3702;
            int var29 = class183.field3182.method161(4);
            int var30 = class183.field3182.method161(4);
            int var31 = class183.field3182.method161(4);
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && ~var28 > -105) {
                class98 var32 = class237.field4090[class124.field2174][var27][var28];
                if (var32 != null) {
                    for (class196 var33 = (class196) var32.method839(128); var33 != null; var33 = (class196) var32.method834((byte) 82)) {
                        class88 var34 = var33.field3516;
                        if ((var29 & 32767) == var34.field1528 && var34.field1536 == var30) {
                            var34.field1536 = var31;
                            break;
                        }
                    }
                    class144.method1096(var27, -99999999, var28);
                }
            }
        } else if (class259.field4572 == 229) {
            int var35 = class183.field3182.method167(-1);
            int var36 = var35 >> 2;
            int var37 = var35 & 3;
            int var38 = class149.field2664[var36];
            int var39 = class183.field3182.method200(255);
            int var40 = (var39 >> 4 & 7) + class144.field2574;
            int var41 = (var39 & 7) + class214.field3702;
            int var42 = class183.field3182.method196(-86);
            if (~var40 <= -1 && ~var41 <= -1 && ~var40 > -105 && var41 < 104) {
                class204.method1432(0, var40, var37, var36, var38, -9911, -1, var41, class124.field2174, var42);
            }
        } else if (class259.field4572 == 252) {
            int var43 = class183.field3182.method162((byte) 5);
            int var44 = (7 & var43 >> 4) + class144.field2574;
            int var45 = class214.field3702 - -(7 & var43);
            int var46 = class183.field3182.method200(255);
            int var47 = var46 & 3;
            int var48 = var46 >> 2;
            int var49 = class149.field2664[var48];
            if (~var44 <= -1 && var45 >= 0 && ~var44 > -105 && ~var45 > -105) {
                class204.method1432(0, var44, var47, var48, var49, -9911, -1, var45, class124.field2174, -1);
            }
        } else if (~class259.field4572 == -36) {
            int var50 = class183.field3182.method162((byte) 5);
            int var51 = ((var50 & 121) >> 4) + class144.field2574;
            int var52 = (var50 & 7) + class214.field3702;
            int var53 = class183.field3182.method196(-104);
            if (~var51 <= -1 && ~var52 <= -1 && ~var51 > -105 && ~var52 > -105) {
                class98 var54 = class237.field4090[class124.field2174][var51][var52];
                if (var54 != null) {
                    for (class196 var55 = (class196) var54.method839(128); var55 != null; var55 = (class196) var54.method834((byte) 82)) {
                        if (~(var53 & 32767) == ~var55.field3516.field1528) {
                            var55.method518(86);
                            break;
                        }
                    }
                    if (var54.method839(128) == null) {
                        class237.field4090[class124.field2174][var51][var52] = null;
                    }
                    class144.method1096(var51, -99999999, var52);
                }
            }
        } else {
            if (~class259.field4572 == -94) {
                int var56 = class183.field3182.method168((byte) 88);
                int var57 = var56 >> 2;
                int var58 = class149.field2664[var57];
                byte var59 = class183.field3182.method183((byte) -110);
                byte var60 = class183.field3182.method198(false);
                int var61 = class183.field3182.method196(-110);
                int var62 = class183.field3182.method196(-94);
                int var63 = class183.field3182.method173(-123);
                byte var64 = class183.field3182.method201(128);
                int var65 = var56 & 3;
                int var66 = class183.field3182.method200(255);
                int var67 = (7 & var66) + class214.field3702;
                int var68 = (7 & var66 >> 4) + class144.field2574;
                byte var69 = class183.field3182.method183((byte) 118);
                int var70 = class183.field3182.method161(4);
                class260 var71;
                if (~class33.field615 != ~var61) {
                    var71 = class230.field4011[var61];
                } else {
                    var71 = class56.field1033;
                }
                if (var71 != null) {
                    class194 var72 = class251.method1776(var62, 65280);
                    int var73;
                    int var74;
                    if (~var65 != -2 && ~var65 != -4) {
                        var73 = var72.field3476;
                        var74 = var72.field3500;
                    } else {
                        var74 = var72.field3476;
                        var73 = var72.field3500;
                    }
                    int var75 = var68 - -(var74 >> 1);
                    int var76 = var68 - -(var74 + 1 >> 1);
                    int var77 = (var73 >> 1) + var67;
                    int var78 = var67 - -(var73 - -1 >> 1);
                    int[][] var79 = class106.field1912[class124.field2174];
                    int[][] var80 = null;
                    if (class124.field2174 < 3) {
                        var80 = class106.field1912[class124.field2174 + 1];
                    }
                    int var81 = var79[var75][var77] + var79[var76][var78] + var79[var76][var77] + var79[var75][var78] >> 2;
                    int var82 = (var68 << 7) + (var74 << 6);
                    int var83 = (var67 << 7) - -(var73 << 6);
                    class248 var84 = var72.method1380(var72.field3438, false, false, var65, (class69) null, var80, var81, var79, var83, var57, var82);
                    if (var84 != null) {
                        class204.method1432(var63 + 1, var68, 0, 0, var58, -9911, var70 - -1, var67, class124.field2174, -1);
                        var71.field4601 = var81;
                        var71.field4598 = var67 * 128 + var73 * 64;
                        var71.field4605 = class259.field4584 + var70;
                        var71.field4628 = var68 * 128 + var74 * 64;
                        var71.field4594 = (class257) var84.field4401;
                        var71.field4609 = class259.field4584 + var63;
                        if (var59 < var69) {
                            byte var85 = var69;
                            var69 = var59;
                            var59 = var85;
                        }
                        if (var64 > var60) {
                            byte var86 = var64;
                            var64 = var60;
                            var60 = var86;
                        }
                        var71.field4592 = var64 + var67;
                        var71.field4604 = var59 + var68;
                        var71.field4590 = var68 + var69;
                        var71.field4595 = var60 + var67;
                    }
                }
            }
            if (class259.field4572 == 209) {
                int var87 = class183.field3182.method200(255);
                int var88 = (var87 >> 4 & 15) + class144.field2574 * 2;
                int var89 = class214.field3702 * 2 - -(15 & var87);
                int var90 = class183.field3182.method198(false) + var88;
                int var91 = class183.field3182.method198(false) + var89;
                int var92 = class183.field3182.method178(-1);
                int var93 = class183.field3182.method161(4);
                int var94 = 4 * class183.field3182.method200(255);
                int var95 = class183.field3182.method200(255) * 4;
                int var96 = class183.field3182.method161(4);
                int var97 = class183.field3182.method161(4);
                int var98 = class183.field3182.method200(255);
                int var99 = class183.field3182.method200(255);
                if (var88 >= 0 && var89 >= 0 && var88 < 208 && var89 < 208 && var90 >= 0 && ~var91 <= -1 && ~var90 > -209 && var91 < 208 && ~var93 != -65536) {
                    int var100 = var88 * 64;
                    int var101 = var91 * 64;
                    int var102 = var89 * 64;
                    class58 var103 = new class58(var93, class124.field2174, var100, var102, class37.method333(var102, 1637367879, class124.field2174, var100) + -var94, class259.field4584 + var96, class259.field4584 + var97, var98, var99, var92, var95);
                    int var104 = var90 * 64;
                    var103.method501(108, var101, var104, class259.field4584 + var96, -var95 + class37.method333(var101, 1637367879, class124.field2174, var104));
                    class37.field690.method843(-5, new class96(var103));
                }
            } else if (~class259.field4572 == -238) {
                int var105 = class183.field3182.method173(-120);
                int var106 = class183.field3182.method151(70);
                int var107 = class183.field3182.method200(255);
                int var108 = class214.field3702 - -(7 & var107);
                int var109 = class144.field2574 - -(7 & var107 >> 4);
                if (~var109 <= -1 && var108 >= 0 && var109 < 104 && ~var108 > -105) {
                    class88 var110 = new class88();
                    var110.field1528 = var106;
                    var110.field1536 = var105;
                    if (class237.field4090[class124.field2174][var109][var108] == null) {
                        class237.field4090[class124.field2174][var109][var108] = new class98();
                    }
                    class237.field4090[class124.field2174][var109][var108].method843(-5, new class196(var110));
                    class144.method1096(var109, -99999999, var108);
                }
            } else if (~class259.field4572 == -63) {
                int var111 = class183.field3182.method200(255);
                int var112 = (7 & var111) + class214.field3702;
                int var113 = (var111 >> 4 & 7) + class144.field2574;
                int var114 = class183.field3182.method198(false) + var113;
                int var115 = class183.field3182.method198(false) + var112;
                int var116 = class183.field3182.method178(-1);
                int var117 = class183.field3182.method161(4);
                int var118 = 4 * class183.field3182.method200(255);
                int var119 = class183.field3182.method200(255) * 4;
                int var120 = class183.field3182.method161(4);
                int var121 = class183.field3182.method161(4);
                int var122 = class183.field3182.method200(255);
                int var123 = class183.field3182.method200(255);
                if (var113 >= 0 && var112 >= 0 && var113 < 104 && ~var112 > -105 && ~var114 <= -1 && ~var115 <= -1 && ~var114 > -105 && ~var115 > -105 && var117 != 65535) {
                    int var124 = var113 * 128 + 64;
                    int var125 = var115 * 128 + 64;
                    int var126 = var112 * 128 - -64;
                    class58 var127 = new class58(var117, class124.field2174, var124, var126, class37.method333(var126, 1637367879, class124.field2174, var124) + -var118, class259.field4584 + var120, var121 - -class259.field4584, var122, var123, var116, var119);
                    int var128 = var114 * 128 + 64;
                    var127.method501(-112, var125, var128, var120 - -class259.field4584, class37.method333(var125, 1637367879, class124.field2174, var128) + -var119);
                    class37.field690.method843(-5, new class96(var127));
                }
            } else if (~class259.field4572 == -208) {
                int var129 = class183.field3182.method168((byte) 120);
                int var130 = var129 >> 2;
                int var131 = class149.field2664[var130];
                int var132 = 3 & var129;
                int var133 = class183.field3182.method167(-1);
                int var134 = (7 & var133) + class214.field3702;
                int var135 = class144.field2574 - -((115 & var133) >> 4);
                int var136 = class183.field3182.method161(4);
                if (~var136 == -65536) {
                    var136 = -1;
                }
                class128.method1004(var130, -10407, var135, class124.field2174, var136, var134, var131, var132);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(II)I")
    public static final int method511(int arg0, int arg1) {
        ++field1135;
        return ~arg1 == arg0 ? -1 : class38.method344(arg1, (byte) -45);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILtj;)I")
    public static final int method512(int arg0, class260 arg1) {
        ++field1147;
        if (arg0 != 2183) {
            return -128;
        } else {
            int var2 = arg1.field4593;
            if (~arg1.field2305 != ~arg1.field2282) {
                if (~arg1.field2282 == ~arg1.field2250) {
                    var2 = arg1.field4612;
                }
            } else {
                var2 = arg1.field4615;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;Z)Leb;")
    public static final class230 method513(String arg0, boolean arg1) {
        ++field1133;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        if (!arg1) {
            method514(34);
        }
        class230 var3 = new class230();
        var3.field3988 = var2;
        var3.field3990 = 0;
        for (int var4 = 0; ~var4 > ~var2.length; ++var4) {
            if (var2[var4] != 0) {
                var2[var3.field3990++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1151 = null;
        field1153 = null;
        field1159 = null;
        field1158 = null;
        field1140 = null;
        field1137 = null;
        field1155 = null;
        field1157 = null;
        field1132 = null;
        field1145 = null;
        if (arg0 >= 96) {
            field1139 = null;
            field1152 = null;
        }
    }
}
