import java.awt.Font;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class277 {

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "Lcb;")
    private class544 field3857;

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "[Z")
    private boolean[] field3862;

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "[[I")
    private int[][] field3855;

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "Ljo;")
    public static class351 field3852 = new class351(41, 3);

    @OriginalMember(owner = "client!tia", name = "q", descriptor = "Lke;")
    public static class622 field3865 = new class622(43, -2);

    @OriginalMember(owner = "client!tia", name = "t", descriptor = "Z")
    public static boolean field3868 = false;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!tia", name = "p", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!tia", name = "r", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "Lcb;")
    public static class544 field3850;

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field3851;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lpi;IIIIZ)V", line = 4)
    public static final void method1795(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3858++;
        class455 var6 = null;
        for (class455 var7 = (class455) class110.field1360.method2508((byte) 120); var7 != null; var7 = (class455) class110.field1360.method2505((byte) -55)) {
            if (var7.field6524 == arg1 && var7.field6529 == arg4 && var7.field6523 == arg3 && var7.field6525 == arg2) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class455();
            var6.field6529 = arg4;
            var6.field6523 = arg3;
            var6.field6524 = arg1;
            var6.field6525 = arg2;
            class110.field1360.method2510(var6, !arg5);
        }
        var6.field6530 = arg0;
        var6.field6532 = false;
        var6.field6528 = arg5;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIB)V", line = 45)
    public static final void method1796(int arg0, int arg1, byte arg2) {
        if (arg2 < 68) {
            method1796(126, -94, (byte) -59);
        }
        field3854++;
        class713 var3 = class259.field3639[arg0][arg1];
        if (var3 != null) {
            class411.field5801 = var3.field10056;
            class230.field3335 = var3.field10052;
            class725.field10161 = var3.field10064;
        }
        class459.method2738(0);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Z)V", line = 71)
    public static void method1797(boolean arg0) {
        field3852 = null;
        field3851 = null;
        field3865 = null;
        if (!arg0) {
            method1797(true);
        }
        field3850 = null;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)Z", line = 89)
    public final boolean method1798(int arg0) {
        field3856++;
        if (arg0 != -9899) {
            field3864 = -115;
        }
        return this.field3859 != -1;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lub;", line = 101)
    public final class22 method1799(int arg0, int arg1) {
        field3853++;
        byte[] var3 = this.field3857.method3150(arg0, -121, 1);
        class22 var4 = new class22();
        if (arg1 <= 87) {
            return null;
        } else {
            var4.method167(new class120(var3), (byte) 121);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V", line = 117)
    public static final void method1800(int arg0) {
        field3861++;
        class483.field6864.method3926(5, false);
        class32.field438.method4157((byte) 119, 5);
        class176.field2677.method138(true, 5);
        class496.field7061.method329(5, (byte) -25);
        class21.field322.method1459(50, 5);
        class526.field7490.method3562(5, true);
        class203.field2975.method1930(5, 256);
        class87.field1131.method1549(5, (byte) -116);
        class324.field4862.method3268(5, arg0 + 9384);
        class266.field3756.method2804(5, 0);
        class511.field7304.method1001(5, true);
        class549.field7742.method3805(5, 0);
        class247.field3521.method3712((byte) 89, 5);
        class386.field5496.method3217((byte) -121, 5);
        class788.field10824.method1613(5, arg0 ^ 0x84083);
        class488.field6906.method1605(5, arg0 ^ 0x1600);
        class684.field9714.method3108(5, 22039);
        class510.field7302.method585(5, arg0 - 11652);
        class276.field3842.method2183(5, 64);
        class604.field8501.method1998(arg0 ^ 0x22, 5);
        class729.field10195.method562(5, (byte) -46);
        class162.field2384.method1416(5, -24656);
        if (arg0 != 3) {
            return;
        }
        class733.method4102(5, -101);
        class757.method4181(arg0 - 11059, 50);
        class201.method1446(50, (byte) -51);
        class604.method3486(5, (byte) 18);
        class449.method2696(-8012, 5);
        class421.field5920.method2366(5, 115);
        class338.field5013.method2366(5, 119);
        class626.field8831.method2366(5, 114);
        class688.field9745.method2366(5, arg0 + 108);
        class353.field5145.method2366(5, 112);
    }

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)V", line = 159)
    public static final void method1801(int arg0) {
        class458.field6558 = new class472[50];
        if (arg0 == -19834) {
            class636.field8961 = 0;
            field3863++;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BI)[[[B", line = 171)
    public static final byte[][][] method1802(byte arg0, int arg1) {
        field3849++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        int var5 = 110 / ((28 - arg0) / 51);
        byte[] var6 = new byte[arg1 * arg1];
        int var7 = 0;
        for (int var8 = 0; var8 < var4; var8++) {
            for (int var133 = 0; var133 < var3; var133++) {
                if (var133 <= var8) {
                    var6[var7] = -1;
                }
                var7++;
            }
        }
        var2[0][0] = var6;
        int var9 = 0;
        byte[] var10 = new byte[var3 * var4];
        for (int var11 = var4 - 1; var11 >= 0; var11--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var132 <= var11) {
                    var10[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var10;
        int var12 = 0;
        byte[] var13 = new byte[var3 * var4];
        for (int var14 = 0; var14 < var4; var14++) {
            for (int var131 = 0; var131 < var3; var131++) {
                if (var14 <= var131) {
                    var13[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var13;
        byte[] var15 = new byte[var3 * var4];
        int var16 = 0;
        for (int var17 = var4 - 1; var17 >= 0; var17--) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var17 <= var130) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        var2[0][3] = var15;
        int var18 = 0;
        byte[] var19 = new byte[var3 * var4];
        for (int var20 = var4 - 1; var20 >= 0; var20--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if ((var20 >> 1) >= var129) {
                    var19[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var19;
        byte[] var21 = new byte[var3 * var4];
        int var22 = 0;
        for (int var23 = 0; var23 < var4; var23++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var22 >= 0 && var22 < var21.length) {
                    if ((var23 << 1) <= var128) {
                        var21[var22] = -1;
                    }
                    var22++;
                } else {
                    var22++;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var24 = new byte[var3 * var4];
        int var25 = 0;
        for (int var26 = 0; var26 < var4; var26++) {
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if (var127 <= (var26 >> 1)) {
                    var24[var25] = -1;
                }
                var25++;
            }
        }
        var2[1][2] = var24;
        int var27 = 0;
        byte[] var28 = new byte[var3 * var4];
        for (int var29 = var4 - 1; var29 >= 0; var29--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 >= var29 << 1) {
                    var28[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var28;
        byte[] var30 = new byte[var3 * var4];
        int var31 = 0;
        for (int var32 = var4 - 1; var32 >= 0; var32--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 <= var32 >> 1) {
                    var30[var31] = -1;
                }
                var31++;
            }
        }
        var2[2][0] = var30;
        int var33 = 0;
        byte[] var34 = new byte[var3 * var4];
        for (int var35 = var4 - 1; var35 >= 0; var35--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if (var35 << 1 <= var124) {
                    var34[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var34;
        int var36 = 0;
        byte[] var37 = new byte[var3 * var4];
        for (int var38 = 0; var38 < var4; var38++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var38 >> 1 >= var123) {
                    var37[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var37;
        byte[] var39 = new byte[var3 * var4];
        int var40 = 0;
        for (int var41 = 0; var41 < var4; var41++) {
            for (int var122 = var3 - 1; var122 >= 0; var122--) {
                if ((var41 << 1) <= var122) {
                    var39[var40] = -1;
                }
                var40++;
            }
        }
        var2[2][3] = var39;
        byte[] var42 = new byte[var3 * var4];
        int var43 = 0;
        for (int var44 = var4 - 1; var44 >= 0; var44--) {
            for (int var121 = 0; var121 < var3; var121++) {
                if (var44 >> 1 <= var121) {
                    var42[var43] = -1;
                }
                var43++;
            }
        }
        var2[3][0] = var42;
        int var45 = 0;
        byte[] var46 = new byte[var3 * var4];
        for (int var47 = 0; var47 < var4; var47++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var47 << 1 >= var120) {
                    var46[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var46;
        int var48 = 0;
        byte[] var49 = new byte[var3 * var4];
        for (int var50 = 0; var50 < var4; var50++) {
            for (int var119 = var3 - 1; var119 >= 0; var119--) {
                if ((var50 >> 1) <= var119) {
                    var49[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var49;
        byte[] var51 = new byte[var3 * var4];
        int var52 = 0;
        for (int var53 = var4 - 1; var53 >= 0; var53--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 <= (var53 << 1)) {
                    var51[var52] = -1;
                }
                var52++;
            }
        }
        var2[3][3] = var51;
        int var54 = 0;
        byte[] var55 = new byte[var3 * var4];
        for (int var56 = var4 - 1; var56 >= 0; var56--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var56 >> 1 <= var117) {
                    var55[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var55;
        int var57 = 0;
        byte[] var58 = new byte[var3 * var4];
        for (int var59 = var4 - 1; var59 >= 0; var59--) {
            for (int var116 = 0; var116 < var3; var116++) {
                if (var59 << 1 >= var116) {
                    var58[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var58;
        int var60 = 0;
        byte[] var61 = new byte[var3 * var4];
        for (int var62 = 0; var62 < var4; var62++) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 >= (var62 >> 1)) {
                    var61[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var61;
        int var63 = 0;
        byte[] var64 = new byte[var3 * var4];
        for (int var65 = 0; var65 < var4; var65++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if ((var65 << 1) >= var114) {
                    var64[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var64;
        byte[] var66 = new byte[var3 * var4];
        int var67 = 0;
        for (int var68 = 0; var68 < var4; var68++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if ((var3 / 2) >= var113) {
                    var66[var67] = -1;
                }
                var67++;
            }
        }
        var2[5][0] = var66;
        byte[] var69 = new byte[var3 * var4];
        int var70 = 0;
        for (int var71 = 0; var71 < var4; var71++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var4 / 2 >= var71) {
                    var69[var70] = -1;
                }
                var70++;
            }
        }
        var2[5][1] = var69;
        int var72 = 0;
        byte[] var73 = new byte[var3 * var4];
        for (int var74 = 0; var74 < var4; var74++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if ((var3 / 2) <= var111) {
                    var73[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var73;
        byte[] var75 = new byte[var3 * var4];
        int var76 = 0;
        for (int var77 = 0; var77 < var4; var77++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var77 >= var4 / 2) {
                    var75[var76] = -1;
                }
                var76++;
            }
        }
        var2[5][3] = var75;
        int var78 = 0;
        byte[] var79 = new byte[var3 * var4];
        for (int var80 = 0; var80 < var4; var80++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var109 <= (var80 - (var4 / 2))) {
                    var79[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var79;
        byte[] var81 = new byte[var3 * var4];
        int var82 = 0;
        for (int var83 = var4 - 1; var83 >= 0; var83--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var83 - (var4 / 2) >= var108) {
                    var81[var82] = -1;
                }
                var82++;
            }
        }
        var2[6][1] = var81;
        byte[] var84 = new byte[var3 * var4];
        int var85 = 0;
        for (int var86 = var4 - 1; var86 >= 0; var86--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if (var86 - (var4 / 2) >= var107) {
                    var84[var85] = -1;
                }
                var85++;
            }
        }
        var2[6][2] = var84;
        byte[] var87 = new byte[var3 * var4];
        int var88 = 0;
        for (int var89 = 0; var89 < var4; var89++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var89 - (var4 / 2))) {
                    var87[var88] = -1;
                }
                var88++;
            }
        }
        var2[6][3] = var87;
        int var90 = 0;
        byte[] var91 = new byte[var3 * var4];
        for (int var92 = 0; var92 < var4; var92++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if (var105 >= var92 - (var4 / 2)) {
                    var91[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var91;
        int var93 = 0;
        byte[] var94 = new byte[var3 * var4];
        for (int var95 = var4 - 1; var95 >= 0; var95--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var95 - (var4 / 2) <= var104) {
                    var94[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var94;
        byte[] var96 = new byte[var3 * var4];
        int var97 = 0;
        for (int var98 = var4 - 1; var98 >= 0; var98--) {
            for (int var103 = var3 - 1; var103 >= 0; var103--) {
                if ((var98 - (var4 / 2)) <= var103) {
                    var96[var97] = -1;
                }
                var97++;
            }
        }
        var2[7][2] = var96;
        int var99 = 0;
        byte[] var100 = new byte[var3 * var4];
        for (int var101 = 0; var101 < var4; var101++) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var101 - (var4 / 2))) {
                    var100[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var100;
        return var2;
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(BI)[I", line = 953)
    public final int[] method1803(byte arg0, int arg1) {
        field3860++;
        if (arg1 < 0 || this.field3855.length <= arg1) {
            return this.field3859 == -1 ? new int[0] : new int[] { this.field3859 };
        } else if (this.field3862[arg1] && this.field3855[arg1].length > 1) {
            int var3 = this.field3859 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field3855[arg1].length];
            class42.method289(this.field3855[arg1], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class425.method2530(-79, var5.length - var3, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            if (arg0 <= 67) {
                method1801(-88);
            }
            return var5;
        } else {
            return this.field3855[arg1];
        }
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 998)
    public class277(class106 arg0, int arg1, class544 arg2) {
        this.field3857 = arg2;
        this.field3857.method3147(1, 82);
        class120 var4 = new class120(this.field3857.method3150(0, 36, 0));
        int var5 = var4.method842(2384);
        if (var5 > 3) {
            this.field3855 = new int[0][];
            this.field3862 = new boolean[0];
            this.field3859 = -1;
        } else {
            int var6 = var4.method842(2384);
            class527[] var7 = class546.method3176((byte) -118);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method842(2384);
                    if (var7[var9].field7495 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method842(2384);
                int var12 = var4.method842(2384);
                if (var5 <= 2) {
                    this.field3859 = -1;
                } else {
                    this.field3859 = var4.method838(true);
                }
                this.field3862 = new boolean[var12 + 1];
                this.field3855 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method842(2384);
                    this.field3862[var15] = var4.method842(2384) == 1;
                    int var16 = var4.method898((byte) -118);
                    if (this.field3859 == -1) {
                        this.field3855[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field3855[var15][var17] = var4.method898((byte) -126);
                        }
                    } else {
                        this.field3855[var15] = new int[var16 + 1];
                        this.field3855[var15][0] = this.field3859;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field3855[var15][var18 + 1] = var4.method898((byte) -89);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field3855[var14] == null) {
                        if (this.field3859 == -1) {
                            this.field3855[var14] = new int[0];
                        } else {
                            this.field3855[var14] = new int[] { this.field3859 };
                        }
                    }
                }
            } else {
                this.field3859 = -1;
                this.field3855 = new int[0][];
                this.field3862 = new boolean[0];
            }
        }
    }
}
