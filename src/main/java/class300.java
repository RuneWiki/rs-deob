import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class300 extends class3 {

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    private int field4952 = 20;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    private int field4946 = 1365;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    private int field4956 = 0;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "I")
    private int field4957 = 0;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "[S")
    public static short[] field4949 = new short[500];

    @OriginalMember(owner = "client!go", name = "R", descriptor = "Lil;")
    public static class4 field4955 = new class4(512);

    @OriginalMember(owner = "client!go", name = "V", descriptor = "Z")
    public static boolean field4959 = false;

    @OriginalMember(owner = "client!go", name = "W", descriptor = "Lq;")
    public static class199 field4960 = new class199();

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!go", name = "X", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method2110(boolean arg0) {
        if (!arg0) {
            field4961 = 7;
        }
        field4954++;
        if (class236.field3735 < 0) {
            class179.field2785 = -1;
            class32.field488 = -1;
            class236.field3735 = 0;
        }
        if (class236.field3735 > class88.field1263) {
            class179.field2785 = -1;
            class32.field488 = -1;
            class236.field3735 = class88.field1263;
        }
        if (class125.field1873 < 0) {
            class32.field488 = -1;
            class125.field1873 = 0;
            class179.field2785 = -1;
        }
        if (class88.field1262 < class125.field1873) {
            class179.field2785 = -1;
            class32.field488 = -1;
            class125.field1873 = class88.field1262;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)Lmn;", line = 59)
    public static final class167 method2111(int arg0, int arg1, int arg2, int arg3) {
        field4947++;
        class167 var4 = new class167();
        var4.field2629 = arg2;
        var4.field2631 = arg3;
        class218.field3363.method37(false, var4, (long) arg1);
        class13.method100(-60, arg3);
        if (arg0 >= -4) {
            method2114(122, -108);
        }
        class264 var5 = class94.method629(5386, arg1);
        if (var5 != null) {
            class218.method1472((byte) 118, var5);
        }
        if (class172.field2695 != null) {
            class218.method1472((byte) 113, class172.field2695);
            class172.field2695 = null;
        }
        int var6 = class117.field1701;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class165.method1149(field4949[var7], true)) {
                class39.method311((byte) -65, var7);
            }
        }
        if (class117.field1701 == 1) {
            class286.field4681 = false;
            class279.method1986(class2.field7, class265.field4362, class53.field800, class235.field3732, 27960);
        } else {
            class279.method1986(class2.field7, class265.field4362, class53.field800, class235.field3732, 27960);
            int var8 = class31.field471.method1216(class242.field3821);
            for (int var9 = 0; var9 < class117.field1701; var9++) {
                int var10 = class31.field471.method1216(client.method895(var9, 27003));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class235.field3732 = var8 + 8;
            class265.field4362 = (class98.field1408 ? 26 : 22) + class117.field1701 * 15;
        }
        if (var5 != null) {
            class209.method1423(-29561, var5, false);
        }
        class65.method457(-86, arg3);
        if (class345.field5538 != -1) {
            class160.method1134(1, (byte) -70, class345.field5538);
        }
        return var4;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V", line = 145)
    public static void method2112(int arg0) {
        field4949 = null;
        field4960 = null;
        field4955 = null;
        if (arg0 != 255) {
            method2112(-30);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lnm;Lnm;BIZ)Ldb;", line = 157)
    public static final class146 method2113(class221 arg0, class221 arg1, byte arg2, int arg3, boolean arg4) {
        field4951++;
        int var5 = 119 / ((45 - arg2) / 55);
        boolean var6 = true;
        int[] var7 = arg1.method1515((byte) 103, arg3);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg1.method1511(arg3, var7[var8], -98);
            if (var9 == null) {
                var6 = false;
            } else {
                int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
                byte[] var11;
                if (arg4) {
                    var11 = arg0.method1511(0, var10, -128);
                } else {
                    var11 = arg0.method1511(var10, 0, -126);
                }
                if (var11 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class146(arg1, arg0, arg3, arg4);
        } catch (Exception var13) {
            return null;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(II)V", line = 214)
    public static final void method2114(int arg0, int arg1) {
        class211 var2 = class17.method115(8, arg1, 4086);
        field4948++;
        if (arg0 != -29823) {
            field4955 = (class4) null;
        }
        var2.method1435((byte) -2);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([IIIIII)V", line = 226)
    public static final void method2115(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class50 var6 = class264.field4230[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class20 var7 = var6.field754;
        if (var7 != null) {
            int var8 = var7.field232;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class316 var10 = var6.field740;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field5219;
        int var12 = var10.field5207;
        int var13 = var10.field5217;
        int var14 = var10.field5218;
        int[] var15 = class167.field2632[var11];
        int[] var16 = class345.field5534[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 318)
    public class300() {
        super(0, true);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lfh;IZ)V", line = 334)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field4958++;
        if (arg1 == 0) {
            this.field4946 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field4952 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field4956 = arg0.method2250(-1613178296);
        } else if (arg1 == 3) {
            this.field4957 = arg0.method2250(-1613178296);
        }
        if (arg2) {
            this.method14((class313) null, 118, true);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[I", line = 390)
    public final int[] method25(byte arg0, int arg1) {
        field4953++;
        if (arg0 <= 57) {
            return (int[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            for (int var4 = 0; var4 < class326.field5342; var4++) {
                int var5 = (class163.field2591[var4] << 12) / this.field4946 + this.field4956;
                int var6 = var5;
                int var7 = var5;
                int var8 = (class159.field2546[arg1] << 12) / this.field4946 + this.field4957;
                int var9 = var8;
                int var10 = var8 * var8 >> 12;
                int var11 = var8;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var10 + var12 < 16384 && var13 < this.field4952) {
                    var13++;
                    var9 = (var7 * var9 >> 12) * 2 + var11;
                    var7 = var12 + var6 - var10;
                    var12 = var7 * var7 >> 12;
                    var10 = var9 * var9 >> 12;
                }
                var3[var4] = (this.field4952 - 1) > var13 ? (var13 << 12) / this.field4952 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIIIIII)V", line = 458)
    public static final void method2116(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class39.field586 = 0;
        for (int var7 = -1; var7 < class38.field561 + class294.field4892; var7++) {
            class287 var8;
            if (var7 == -1) {
                var8 = class329.field5388;
            } else if (var7 < class38.field561) {
                var8 = class130.field1984[class150.field2410[var7]];
            } else {
                var8 = class329.field5377[class243.field3843[var7 - class38.field561]];
            }
            if (var8 != null && var8.method310((byte) -12)) {
                if (var8 instanceof class233) {
                    class139 var9 = ((class233) var8).field3702;
                    if (var9.field2229 != null) {
                        var9 = var9.method987(-1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class38.field561 <= var7) {
                    class139 var15 = ((class233) var8).field3702;
                    if (var15.field2229 != null) {
                        var15 = var15.method987(-1);
                    }
                    if (var15.field2207 >= 0 && var15.field2207 < class104.field1509.length) {
                        int var16;
                        if (var15.field2198 == -1) {
                            var16 = var8.method2031(false) + 15;
                        } else {
                            var16 = var15.field2198 + 15;
                        }
                        class104.method692(arg5, var16, arg3 >> 1, arg4 >> 1, arg6, var8, -5837);
                        if (class7.field85 > -1) {
                            class104.field1509[var15.field2207].method945(arg1 + class7.field85 - 12, class246.field3915 + arg2 + -30);
                        }
                    }
                    int var17 = 0;
                    class281[] var18 = class165.field2602;
                    while (var17 < var18.length) {
                        class281 var19 = var18[var17];
                        if (var19 != null && var19.field4622 == 1 && class243.field3843[var7 - class38.field561] == var19.field4628 && class58.field875 % 20 < 10) {
                            int var20;
                            if (var15.field2198 == -1) {
                                var20 = var8.method2031(false) + 15;
                            } else {
                                var20 = var15.field2198 + 15;
                            }
                            class104.method692(arg5, var20, arg3 >> 1, arg4 >> 1, arg6, var8, -5837);
                            if (class7.field85 > -1) {
                                class243.field3837[var19.field4619].method945(class7.field85 + arg1 - 12, class246.field3915 - 28 + arg2);
                            }
                        }
                        var17++;
                    }
                } else {
                    int var10 = 30;
                    class39 var11 = (class39) var8;
                    if (var11.field588 != -1 || var11.field594 != -1) {
                        class104.method692(arg5, var8.method2031(!arg0) + 15, arg3 >> 1, arg4 >> 1, arg6, var8, -5837);
                        if (class7.field85 > -1) {
                            if (var11.field588 != -1) {
                                class171.field2664[var11.field588].method945(class7.field85 + arg1 - 12, -var10 + arg2 + class246.field3915);
                                var10 += 25;
                            }
                            if (var11.field594 != -1) {
                                class104.field1509[var11.field594].method945(class7.field85 + arg1 - 12, -var10 + class246.field3915 + arg2);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class281[] var12 = class165.field2602;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class281 var14 = var12[var13];
                            if (var14 != null && var14.field4622 == 10 && class150.field2410[var7] == var14.field4628) {
                                class104.method692(arg5, var8.method2031(false) + 15, arg3 >> 1, arg4 >> 1, arg6, var8, -5837);
                                if (class7.field85 > -1) {
                                    class243.field3837[var14.field4619].method945(class7.field85 + arg1 - 12, arg2 - -class246.field3915 + -var10);
                                }
                            }
                        }
                    }
                }
                if (var8.field4793 != null && (class38.field561 <= var7 || class320.field5270 == 0 || class320.field5270 == 3 || class320.field5270 == 1 && class142.method1002(((class39) var8).field597, 64))) {
                    class104.method692(arg5, var8.method2031(false), arg3 >> 1, arg4 >> 1, arg6, var8, -5837);
                    if (class7.field85 > -1 && class99.field1434 > class39.field586) {
                        class99.field1446[class39.field586] = class31.field471.method1216(var8.field4793) / 2;
                        class99.field1445[class39.field586] = class31.field471.field2724;
                        class99.field1444[class39.field586] = class7.field85;
                        class99.field1441[class39.field586] = class246.field3915;
                        class99.field1442[class39.field586] = var8.field4737;
                        class99.field1432[class39.field586] = var8.field4699;
                        class99.field1437[class39.field586] = var8.field4728;
                        class99.field1430[class39.field586] = var8.field4793;
                        class39.field586++;
                    }
                }
                if (class58.field875 < var8.field4705) {
                    class289 var21 = class105.field1521[0];
                    class289 var22 = class105.field1521[1];
                    int var26;
                    if (var8 instanceof class233) {
                        class233 var23 = (class233) var8;
                        class289[] var24 = (class289[]) ((class289[]) class79.field1170.method652((long) var23.field3702.field2210, false));
                        if (var24 == null) {
                            var24 = class256.method1821(class69.field1073, 0, var23.field3702.field2210, (byte) 102);
                            if (var24 != null) {
                                class79.field1170.method642(var24, (long) var23.field3702.field2210, -104);
                            }
                        }
                        class139 var25 = var23.field3702;
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        if (var25.field2198 == -1) {
                            var26 = var8.method2031(false);
                        } else {
                            var26 = var25.field2198;
                        }
                    } else {
                        var26 = var8.method2031(false);
                    }
                    class104.method692(arg5, var21.field4811 + var26 + 10, arg3 >> 1, arg4 >> 1, arg6, var8, -5837);
                    if (class7.field85 > -1) {
                        int var27 = class7.field85 + arg1 - (var21.field4802 >> 1);
                        int var28 = class246.field3915 + arg2 - 3;
                        var21.method945(var27, var28);
                        int var29 = var8.field4781 * var21.field4802 / 255;
                        int var30 = var21.field4811;
                        if (class245.field3886) {
                            class335.method2370(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class317.method2277(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method945(var27, var28);
                        if (class245.field3886) {
                            class335.method2375(arg1, arg2, arg1 + arg4, arg2 + arg3);
                        } else {
                            class317.method2273(arg1, arg2, arg1 + arg4, arg2 + arg3);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class58.field875 < var8.field4709[var31]) {
                        int var34;
                        if (var8 instanceof class233) {
                            class233 var32 = (class233) var8;
                            class139 var33 = var32.field3702;
                            if (var33.field2198 == -1) {
                                var34 = var8.method2031(false) / 2;
                            } else {
                                var34 = var33.field2198 / 2;
                            }
                        } else {
                            var34 = var8.method2031(false) / 2;
                        }
                        class104.method692(arg5, var34, arg3 >> 1, arg4 >> 1, arg6, var8, -5837);
                        if (class7.field85 > -1) {
                            if (var31 == 1) {
                                class246.field3915 -= 20;
                            }
                            if (var31 == 2) {
                                class246.field3915 -= 10;
                                class7.field85 -= 15;
                            }
                            if (var31 == 3) {
                                class246.field3915 -= 10;
                                class7.field85 += 15;
                            }
                            class195.field2990[var8.field4708[var31]].method945(class7.field85 + arg1 - 12, class246.field3915 + arg2 - 12);
                            class302.field4967.method1222(Integer.toString(var8.field4748[var31]), class7.field85 + arg1 - 1, arg2 - -3 + class246.field3915, 16777215, 0);
                        }
                    }
                }
            }
        }
        field4944++;
        for (int var35 = 0; var35 < class39.field586; var35++) {
            int var36 = class99.field1444[var35];
            int var37 = class99.field1446[var35];
            int var38 = class99.field1441[var35];
            int var39 = class99.field1445[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var38 + 2) > (class99.field1441[var41] - class99.field1445[var41]) && (class99.field1441[var41] + 2) > (var38 - var39) && var36 - var37 < class99.field1446[var41] + class99.field1444[var41] && var36 + var37 > class99.field1444[var41] + -class99.field1446[var41] && var38 > (class99.field1441[var41] - class99.field1445[var41])) {
                        var40 = true;
                        var38 = class99.field1441[var41] - class99.field1445[var41];
                    }
                }
            }
            class7.field85 = class99.field1444[var35];
            class246.field3915 = class99.field1441[var35] = var38;
            String var42 = class99.field1430[var35];
            if (class86.field1242 == 0) {
                int var43 = 16776960;
                if (class99.field1442[var35] < 6) {
                    var43 = class150.field2422[class99.field1442[var35]];
                }
                if (class99.field1442[var35] == 6) {
                    var43 = (class253.field4021 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class99.field1442[var35] == 7) {
                    var43 = (class253.field4021 % 20) < 10 ? 255 : 65535;
                }
                if (class99.field1442[var35] == 8) {
                    var43 = class253.field4021 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class99.field1442[var35] == 9) {
                    int var44 = 150 - class99.field1437[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 - 50) * 327680;
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class99.field1442[var35] == 10) {
                    int var45 = 150 - class99.field1437[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 33095935 - var45 * 327680;
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 255 - ((var45 + -100) * 5) - 32768000;
                    }
                }
                if (class99.field1442[var35] == 11) {
                    int var46 = 150 - class99.field1437[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - (var46 * 327680);
                    }
                }
                if (class99.field1432[var35] == 0) {
                    class31.field471.method1222(var42, class7.field85 + arg1, arg2 - -class246.field3915, var43, 0);
                }
                if (class99.field1432[var35] == 1) {
                    class31.field471.method1226(var42, class7.field85 + arg1, class246.field3915 + arg2, var43, 0, class253.field4021);
                }
                if (class99.field1432[var35] == 2) {
                    class31.field471.method1229(var42, class7.field85 + arg1, class246.field3915 + arg2, var43, 0, class253.field4021);
                }
                if (class99.field1432[var35] == 3) {
                    class31.field471.method1230(var42, class7.field85 + arg1, class246.field3915 + arg2, var43, 0, class253.field4021, 150 - class99.field1437[var35]);
                }
                if (class99.field1432[var35] == 4) {
                    int var47 = (150 - class99.field1437[var35]) * (class31.field471.method1216(var42) + 100) / 150;
                    if (class245.field3886) {
                        class335.method2370(class7.field85 + arg1 - 50, arg2, class7.field85 + arg1 + 50, arg2 + arg3);
                    } else {
                        class317.method2277(arg1 + class7.field85 - 50, arg2, arg1 + class7.field85 + 50, arg2 + arg3);
                    }
                    class31.field471.method1232(var42, arg1 + class7.field85 + 50 - var47, arg2 - -class246.field3915, var43, 0);
                    if (class245.field3886) {
                        class335.method2375(arg1, arg2, arg1 + arg4, arg2 + arg3);
                    } else {
                        class317.method2273(arg1, arg2, arg1 + arg4, arg2 - -arg3);
                    }
                }
                if (class99.field1432[var35] == 5) {
                    int var48 = 150 - class99.field1437[var35];
                    if (class245.field3886) {
                        class335.method2370(arg1, class246.field3915 + arg2 - class31.field471.field2724 - 1, arg1 + arg4, arg2 + class246.field3915 + 5);
                    } else {
                        class317.method2277(arg1, class246.field3915 + arg2 - class31.field471.field2724 - 1, arg1 - -arg4, class246.field3915 + arg2 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class31.field471.method1222(var42, class7.field85 + arg1, class246.field3915 + arg2 + var49, var43, 0);
                    if (class245.field3886) {
                        class335.method2375(arg1, arg2, arg1 + arg4, arg2 + arg3);
                    } else {
                        class317.method2273(arg1, arg2, arg1 + arg4, arg2 + arg3);
                    }
                }
            } else {
                class31.field471.method1222(var42, class7.field85 + arg1, class246.field3915 + arg2, 16776960, 0);
            }
        }
        if (!arg0) {
            field4955 = (class4) null;
        }
    }
}
