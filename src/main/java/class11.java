import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "Lbaa;")
    private class523 field147;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "Ldaa;")
    public static class11 field149 = new class11(0, 3, class523.field7253);

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "Ldaa;")
    public static class11 field151 = new class11(1, 3, class523.field7253);

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "Ldaa;")
    public static class11 field152 = new class11(2, 4, class523.field7249);

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "Ldaa;")
    public static class11 field153 = new class11(3, 1, class523.field7253);

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "Ldaa;")
    public static class11 field154 = new class11(4, 2, class523.field7253);

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "Ldaa;")
    public static class11 field155 = new class11(5, 3, class523.field7253);

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "Ldaa;")
    public static class11 field156 = new class11(6, 4, class523.field7253);

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field157 = class149.method1172(16, 119);

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "Loaa;")
    public static class290 field158 = new class290(8, 0, 4, 1);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!daa", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field142++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[[[B", line = 14)
    public static final byte[][][] method64(int arg0, int arg1) {
        field144++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        if (arg1 != 12871) {
            field154 = null;
        }
        var2[0][2] = var12;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if ((var19 >> 1) >= var128) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var21 < var20.length) {
                    if (var127 >= var22 << 1) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= var25 >> 1) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= (var37 >> 1)) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= (var40 << 1)) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= (var43 >> 1)) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= var46 << 1) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= var49 >> 1) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= var52 << 1) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var55 >> 1 <= var116) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if ((var58 << 1) >= var115) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if ((var64 << 1) >= var113) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var3 / 2 >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= (var3 / 2)) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= var4 / 2) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var79 - var4 / 2) >= var108) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= var82 - var4 / 2) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var85 - (var4 / 2)) >= var106) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if ((var88 - (var4 / 2)) >= var105) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var91 - (var4 / 2)) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if ((var94 - var4 / 2) <= var103) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var97 - (var4 / 2))) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= var100 - (var4 / 2)) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V", line = 786)
    public static void method65(int arg0) {
        field149 = null;
        field156 = null;
        field154 = null;
        field158 = null;
        field153 = null;
        field155 = null;
        if (arg0 == -27327) {
            field152 = null;
            field151 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)Ldaa;", line = 809)
    public static final class11 method66(int arg0, int arg1) {
        field150++;
        int var2 = -44 / ((-arg1 - 47) / 45);
        if (arg0 == 0) {
            return field149;
        } else if (arg0 == 1) {
            return field151;
        } else if (arg0 == 2) {
            return field152;
        } else if (arg0 == 3) {
            return field153;
        } else if (arg0 == 4) {
            return field154;
        } else if (arg0 == 5) {
            return field155;
        } else if (arg0 == 6) {
            return field156;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLdb;II)V", line = 879)
    public static final void method67(byte arg0, class324 arg1, int arg2, int arg3) {
        field143++;
        if (arg1 == null || class528.field7301.field2642 == arg1) {
            return;
        }
        int var4 = arg1.field4499;
        int var5 = arg1.field4504;
        int var6 = arg1.field4505;
        int var7 = (int) arg1.field4502;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field4502;
        if (var6 == 19) {
            if (class476.field6653 > 0 && class117.field1992.method1346(82, -125) && class117.field1992.method1346(81, -126)) {
                class570.method3300(class367.field5236 + var5, 2, class58.field1147.field5926, class221.field3177 + var4);
            } else {
                class564 var10 = class423.method2594(var5, var4, (byte) -110, var7);
                if (var7 == 1) {
                    var10.field7778.method1526(false, -1);
                    var10.field7778.method1526(false, -1);
                    var10.field7778.method1485((byte) 107, (int) class451.field6366);
                    var10.field7778.method1526(false, 57);
                    var10.field7778.method1526(false, class28.field748);
                    var10.field7778.method1526(false, class548.field7552);
                    var10.field7778.method1526(false, 89);
                    var10.field7778.method1485((byte) 107, class58.field1147.field5922);
                    var10.field7778.method1485((byte) 107, class58.field1147.field5933);
                    var10.field7778.method1526(false, 63);
                } else {
                    class675.field9197 = arg2;
                    class327.field4548 = arg3;
                    class362.field5205 = 0;
                    class282.field3944 = 1;
                }
                class167.method1260(123, var10);
                class137.method1116(true, var4, var5, (byte) -120, 1, 0, 1, -4, 0);
            }
        }
        if (var6 == 4) {
            class675.field9197 = arg2;
            class282.field3944 = 2;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class569.field7818++;
            class564 var11 = class227.method1594(class21.field333, class72.field1320, -113);
            var11.field7778.method1497(4325, class367.field5236 + var5);
            var11.field7778.method1483(120, class221.field3177 + var4);
            var11.field7778.method1518((byte) 117, class117.field1992.method1346(82, -122) ? 1 : 0);
            var11.field7778.method1497(4325, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class167.method1260(117, var11);
            class604.method3436(var5, var8, var4, 51);
        }
        if (var6 == 1008) {
            class282.field3944 = 2;
            class675.field9197 = arg2;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class751 var12 = (class751) class86.field1546.method1465((long) var7, -6008);
            if (var12 != null) {
                class9 var13 = var12.field10510;
                class334 var14 = var13.field126;
                if (var14.field4694 != null) {
                    var14 = var14.method2110(class390.field5635, -1);
                }
                if (var14 != null) {
                    class359.field5181++;
                    class564 var15 = class227.method1594(class434.field6200, class72.field1320, -111);
                    var15.field7778.method1485((byte) 107, var14.field4661);
                    class167.method1260(-99, var15);
                }
            }
        }
        if (var6 == 48) {
            class598 var16 = class49.field1040[var7];
            if (var16 != null) {
                class362.field5205 = 0;
                class675.field9197 = arg2;
                class327.field4548 = arg3;
                class194.field2867++;
                class282.field3944 = 2;
                class564 var17 = class227.method1594(class161.field2577, class72.field1320, -126);
                var17.field7778.method1483(81, var7);
                var17.field7778.method1526(false, class117.field1992.method1346(82, -126) ? 1 : 0);
                class167.method1260(116, var17);
                class137.method1116(true, var16.field5746[0], var16.field5743[0], (byte) -89, var16.method2457((byte) 106), 0, var16.method2457((byte) 43), -2, 0);
            }
        }
        if (var6 == 49) {
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class282.field3944 = 2;
            class675.field9197 = arg2;
            class201.field2914++;
            class564 var18 = class227.method1594(class386.field5598, class72.field1320, -107);
            var18.field7778.method1501(class221.field3177 + var4, (byte) 3);
            var18.field7778.method1483(-107, var7);
            var18.field7778.method1501(class44.field980, (byte) 3);
            var18.field7778.method1485((byte) 107, class367.field5236 + var5);
            var18.field7778.method1526(false, class117.field1992.method1346(82, -126) ? 1 : 0);
            var18.field7778.method1483(90, class173.field2690);
            var18.field7778.method1484(class406.field5949, (byte) 44);
            class167.method1260(120, var18);
            class161.method1233(1, var5, var4);
        }
        if (var6 == 6) {
            class378 var19 = class751.method4199(var4, (byte) -54, var5);
            if (var19 != null) {
                class191.method1374((byte) 71, var19);
            }
        }
        if (var6 == 5) {
            class362.field5205 = 0;
            class425.field6122++;
            class327.field4548 = arg3;
            class282.field3944 = 2;
            class675.field9197 = arg2;
            class564 var20 = class227.method1594(class387.field5608, class72.field1320, -110);
            var20.field7778.method1485((byte) 107, class367.field5236 + var5);
            var20.field7778.method1483(-110, class221.field3177 + var4);
            var20.field7778.method1522((byte) -44, class117.field1992.method1346(82, -122) ? 1 : 0);
            var20.field7778.method1483(97, var7);
            class167.method1260(118, var20);
            class161.method1233(1, var5, var4);
        }
        if (var6 == 46) {
            class751 var21 = (class751) class86.field1546.method1465((long) var7, -6008);
            if (var21 != null) {
                class362.field5205 = 0;
                class186.field2793++;
                class327.field4548 = arg3;
                class282.field3944 = 2;
                class675.field9197 = arg2;
                class9 var22 = var21.field10510;
                class564 var23 = class227.method1594(class121.field2074, class72.field1320, -96);
                var23.field7778.method1501(var7, (byte) 3);
                var23.field7778.method1543((byte) 124, class117.field1992.method1346(82, -121) ? 1 : 0);
                class167.method1260(117, var23);
                class137.method1116(true, var22.field5746[0], var22.field5743[0], (byte) -100, var22.method2457((byte) 68), 0, var22.method2457((byte) 106), -2, 0);
            }
        }
        if (var6 == 11) {
            class598 var24 = class49.field1040[var7];
            if (var24 != null) {
                class362.field5205 = 0;
                class551.field7596++;
                class675.field9197 = arg2;
                class282.field3944 = 2;
                class327.field4548 = arg3;
                class564 var25 = class227.method1594(class280.field3928, class72.field1320, -94);
                var25.field7778.method1497(4325, var7);
                var25.field7778.method1522((byte) -108, class117.field1992.method1346(82, -124) ? 1 : 0);
                class167.method1260(119, var25);
                class137.method1116(true, var24.field5746[0], var24.field5743[0], (byte) -128, var24.method2457((byte) 53), 0, var24.method2457((byte) 110), -2, 0);
            }
        }
        if (var6 == 59) {
            class327.field4548 = arg3;
            class675.field9197 = arg2;
            class362.field5205 = 0;
            class250.field3604++;
            class282.field3944 = 2;
            class564 var26 = class227.method1594(class515.field7171, class72.field1320, -83);
            var26.field7778.method1543((byte) 86, class117.field1992.method1346(82, -121) ? 1 : 0);
            var26.field7778.method1483(31, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var26.field7778.method1483(-104, class221.field3177 + var4);
            var26.field7778.method1501(class367.field5236 + var5, (byte) 3);
            class167.method1260(119, var26);
            class604.method3436(var5, var8, var4, 93);
        }
        if (var6 == 30) {
            class751 var27 = (class751) class86.field1546.method1465((long) var7, -6008);
            if (var27 != null) {
                class362.field5205 = 0;
                class675.field9197 = arg2;
                class327.field4548 = arg3;
                class9 var28 = var27.field10510;
                class282.field3944 = 2;
                class54.field1105++;
                class564 var29 = class227.method1594(class461.field6494, class72.field1320, -119);
                var29.field7778.method1497(4325, class44.field980);
                var29.field7778.method1539((byte) 108, class406.field5949);
                var29.field7778.method1501(var7, (byte) 3);
                var29.field7778.method1543((byte) -89, class117.field1992.method1346(82, -127) ? 1 : 0);
                var29.field7778.method1483(-116, class173.field2690);
                class167.method1260(122, var29);
                class137.method1116(true, var28.field5746[0], var28.field5743[0], (byte) -107, var28.method2457((byte) 88), 0, var28.method2457((byte) 108), -2, 0);
            }
        }
        if (var6 == 12) {
            if (class476.field6653 > 0 && class117.field1992.method1346(82, -127) && class117.field1992.method1346(81, -126)) {
                class570.method3300(class367.field5236 + var5, 2, class58.field1147.field5926, class221.field3177 + var4);
            } else {
                class675.field9197 = arg2;
                class327.field4548 = arg3;
                class291.field4081++;
                class362.field5205 = 0;
                class282.field3944 = 1;
                class564 var30 = class227.method1594(class637.field8756, class72.field1320, -123);
                var30.field7778.method1483(101, class221.field3177 + var4);
                var30.field7778.method1485((byte) 107, class367.field5236 + var5);
                class167.method1260(6, var30);
            }
        }
        if (var6 == 1001) {
            class675.field9197 = arg2;
            class154.field2508++;
            class282.field3944 = 2;
            class362.field5205 = 0;
            class327.field4548 = arg3;
            class564 var31 = class227.method1594(class201.field2916, class72.field1320, -115);
            var31.field7778.method1485((byte) 107, var7);
            class167.method1260(-60, var31);
        }
        if (var6 == 51) {
            class598 var32 = class49.field1040[var7];
            if (var32 != null) {
                class327.field4548 = arg3;
                class282.field3944 = 2;
                class559.field7739++;
                class362.field5205 = 0;
                class675.field9197 = arg2;
                class564 var33 = class227.method1594(class684.field9266, class72.field1320, -93);
                var33.field7778.method1497(4325, class44.field980);
                var33.field7778.method1501(var7, (byte) 3);
                var33.field7778.method1501(class173.field2690, (byte) 3);
                var33.field7778.method1504(class406.field5949, -4086);
                var33.field7778.method1522((byte) -89, class117.field1992.method1346(82, -127) ? 1 : 0);
                class167.method1260(-33, var33);
                class137.method1116(true, var32.field5746[0], var32.field5743[0], (byte) -88, var32.method2457((byte) 44), 0, var32.method2457((byte) 110), -2, 0);
            }
        }
        if (var6 == 45) {
            class598 var34 = class49.field1040[var7];
            if (var34 != null) {
                class362.field5205 = 0;
                class675.field9197 = arg2;
                class661.field9038++;
                class282.field3944 = 2;
                class327.field4548 = arg3;
                class564 var35 = class227.method1594(class105.field1856, class72.field1320, -84);
                var35.field7778.method1518((byte) -125, class117.field1992.method1346(82, -126) ? 1 : 0);
                var35.field7778.method1501(var7, (byte) 3);
                class167.method1260(30, var35);
                class137.method1116(true, var34.field5746[0], var34.field5743[0], (byte) -91, var34.method2457((byte) 70), 0, var34.method2457((byte) 125), -2, 0);
            }
        }
        if (var6 == 1007) {
            class282.field3944 = 2;
            class705.field9559++;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class675.field9197 = arg2;
            class564 var36 = class227.method1594(class65.field1249, class72.field1320, -112);
            var36.field7778.method1501(class367.field5236 + var5, (byte) 3);
            var36.field7778.method1543((byte) -96, class117.field1992.method1346(82, -125) ? 1 : 0);
            var36.field7778.method1497(4325, class221.field3177 + var4);
            var36.field7778.method1483(68, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class167.method1260(-68, var36);
            class604.method3436(var5, var8, var4, 25);
        }
        if (var6 == 23) {
            class598 var37 = class49.field1040[var7];
            if (var37 != null) {
                class282.field3944 = 2;
                class708.field9600++;
                class362.field5205 = 0;
                class327.field4548 = arg3;
                class675.field9197 = arg2;
                class564 var38 = class227.method1594(class684.field9264, class72.field1320, -113);
                var38.field7778.method1485((byte) 107, var7);
                var38.field7778.method1543((byte) 60, class117.field1992.method1346(82, -121) ? 1 : 0);
                class167.method1260(118, var38);
                class137.method1116(true, var37.field5746[0], var37.field5743[0], (byte) -106, var37.method2457((byte) 45), 0, var37.method2457((byte) 63), -2, 0);
            }
        }
        if (var6 == 16 && class647.field8909 == null) {
            class618.method3502(var5, false, var4);
            class647.field8909 = class751.method4199(var4, (byte) -54, var5);
            class296.method1945(-9343, class647.field8909);
        }
        if (var6 == 8) {
            class598 var39 = class49.field1040[var7];
            if (var39 != null) {
                class675.field9197 = arg2;
                class327.field4548 = arg3;
                class282.field3944 = 2;
                class639.field8782++;
                class362.field5205 = 0;
                class564 var40 = class227.method1594(class296.field4154, class72.field1320, -84);
                var40.field7778.method1526(false, class117.field1992.method1346(82, -128) ? 1 : 0);
                var40.field7778.method1483(-99, var7);
                class167.method1260(127, var40);
                class137.method1116(true, var39.field5746[0], var39.field5743[0], (byte) -106, var39.method2457((byte) 100), 0, var39.method2457((byte) 99), -2, 0);
            }
        }
        if (var6 == 21) {
            class675.field9197 = arg2;
            class616.field8413++;
            class362.field5205 = 0;
            class282.field3944 = 2;
            class327.field4548 = arg3;
            class564 var41 = class227.method1594(class261.field3744, class72.field1320, -107);
            var41.field7778.method1485((byte) 107, var7);
            var41.field7778.method1485((byte) 107, class221.field3177 + var4);
            var41.field7778.method1485((byte) 107, class367.field5236 + var5);
            var41.field7778.method1518((byte) 120, class117.field1992.method1346(82, -123) ? 1 : 0);
            class167.method1260(120, var41);
            class161.method1233(1, var5, var4);
        }
        if (var6 == 15) {
            class282.field3944 = 1;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class675.field9197 = arg2;
            client.field4235++;
            class564 var42 = class227.method1594(class386.field5600, class72.field1320, -127);
            var42.field7778.method1501(class221.field3177 + var4, (byte) 3);
            var42.field7778.method1483(-85, class173.field2690);
            var42.field7778.method1501(class44.field980, (byte) 3);
            var42.field7778.method1539((byte) 127, class406.field5949);
            var42.field7778.method1483(-84, class367.field5236 + var5);
            class167.method1260(-62, var42);
            class137.method1116(true, var4, var5, (byte) -91, 1, 0, 1, -4, 0);
        }
        if (var6 == 60) {
            class751 var43 = (class751) class86.field1546.method1465((long) var7, -6008);
            if (var43 != null) {
                class316.field4367++;
                class362.field5205 = 0;
                class327.field4548 = arg3;
                class675.field9197 = arg2;
                class9 var44 = var43.field10510;
                class282.field3944 = 2;
                class564 var45 = class227.method1594(class274.field3855, class72.field1320, -123);
                var45.field7778.method1485((byte) 107, var7);
                var45.field7778.method1522((byte) -67, class117.field1992.method1346(82, -122) ? 1 : 0);
                class167.method1260(119, var45);
                class137.method1116(true, var44.field5746[0], var44.field5743[0], (byte) -111, var44.method2457((byte) 65), 0, var44.method2457((byte) 42), -2, 0);
            }
        }
        if (var6 == 2) {
            class362.field5205 = 0;
            class282.field3944 = 2;
            class261.field3743++;
            class327.field4548 = arg3;
            class675.field9197 = arg2;
            class564 var46 = class227.method1594(class225.field3212, class72.field1320, -105);
            var46.field7778.method1485((byte) 107, class173.field2690);
            var46.field7778.method1497(4325, class221.field3177 + var4);
            var46.field7778.method1496(-128, class406.field5949);
            var46.field7778.method1483(-82, class367.field5236 + var5);
            var46.field7778.method1518((byte) -74, class117.field1992.method1346(82, -125) ? 1 : 0);
            var46.field7778.method1501(class44.field980, (byte) 3);
            var46.field7778.method1501((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 3);
            class167.method1260(117, var46);
            class604.method3436(var5, var8, var4, 4);
        }
        if (var6 == 58) {
            class598 var47 = class49.field1040[var7];
            if (var47 != null) {
                class362.field5205 = 0;
                class675.field9197 = arg2;
                class327.field4548 = arg3;
                class282.field3944 = 2;
                class266.field3775++;
                class564 var48 = class227.method1594(class195.field2874, class72.field1320, -90);
                var48.field7778.method1526(false, class117.field1992.method1346(82, -121) ? 1 : 0);
                var48.field7778.method1483(52, var7);
                class167.method1260(-127, var48);
                class137.method1116(true, var47.field5746[0], var47.field5743[0], (byte) -93, var47.method2457((byte) 119), 0, var47.method2457((byte) 54), -2, 0);
            }
        }
        if (var6 == 17) {
            class598 var49 = class49.field1040[var7];
            if (var49 != null) {
                class282.field3944 = 2;
                class675.field9197 = arg2;
                class407.field5951++;
                class327.field4548 = arg3;
                class362.field5205 = 0;
                class564 var50 = class227.method1594(class160.field2565, class72.field1320, -113);
                var50.field7778.method1526(false, class117.field1992.method1346(82, -126) ? 1 : 0);
                var50.field7778.method1485((byte) 107, var7);
                class167.method1260(121, var50);
                class137.method1116(true, var49.field5746[0], var49.field5743[0], (byte) -123, var49.method2457((byte) 96), 0, var49.method2457((byte) 97), -2, 0);
            }
        }
        if (var6 == 47) {
            class327.field4548 = arg3;
            class282.field3944 = 2;
            class362.field5205 = 0;
            class693.field9375++;
            class675.field9197 = arg2;
            class564 var51 = class227.method1594(class548.field7551, class72.field1320, -81);
            var51.field7778.method1485((byte) 107, var7);
            var51.field7778.method1483(106, var4 + class221.field3177);
            var51.field7778.method1526(false, class117.field1992.method1346(82, -128) ? 1 : 0);
            var51.field7778.method1497(4325, var5 + class367.field5236);
            class167.method1260(116, var51);
            class161.method1233(1, var5, var4);
        }
        if (var6 == 3) {
            class256.field3706++;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class282.field3944 = 2;
            class675.field9197 = arg2;
            class564 var52 = class227.method1594(class172.field2684, class72.field1320, -98);
            var52.field7778.method1518((byte) -83, class117.field1992.method1346(82, -128) ? 1 : 0);
            var52.field7778.method1497(4325, class221.field3177 + var4);
            var52.field7778.method1501(class367.field5236 + var5, (byte) 3);
            var52.field7778.method1485((byte) 107, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class167.method1260(127, var52);
            class604.method3436(var5, var8, var4, 63);
        }
        if (var6 == 20) {
            class751 var53 = (class751) class86.field1546.method1465((long) var7, -6008);
            if (var53 != null) {
                class282.field3944 = 2;
                class327.field4548 = arg3;
                class675.field9197 = arg2;
                class9 var54 = var53.field10510;
                class362.field5205 = 0;
                class222.field3182++;
                class564 var55 = class227.method1594(class501.field6998, class72.field1320, -81);
                var55.field7778.method1497(4325, var7);
                var55.field7778.method1543((byte) -119, class117.field1992.method1346(82, -123) ? 1 : 0);
                class167.method1260(-85, var55);
                class137.method1116(true, var54.field5746[0], var54.field5743[0], (byte) -121, var54.method2457((byte) 99), 0, var54.method2457((byte) 99), -2, 0);
            }
        }
        if (arg0 <= 97) {
            return;
        }
        if (var6 == 1010) {
            class282.field3944 = 2;
            class161.field2579++;
            class675.field9197 = arg2;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class564 var56 = class227.method1594(class690.field9320, class72.field1320, -96);
            var56.field7778.method1485((byte) 107, var7);
            class167.method1260(125, var56);
        }
        if (var6 == 22) {
            class282.field3944 = 2;
            class362.field5205 = 0;
            class675.field9197 = arg2;
            class327.field4548 = arg3;
            class462.field6502++;
            class564 var57 = class227.method1594(class601.field8250, class72.field1320, -117);
            var57.field7778.method1518((byte) -101, class117.field1992.method1346(82, -125) ? 1 : 0);
            var57.field7778.method1483(-69, class221.field3177 + var4);
            var57.field7778.method1501(class367.field5236 + var5, (byte) 3);
            var57.field7778.method1485((byte) 107, var7);
            class167.method1260(116, var57);
            class161.method1233(1, var5, var4);
        }
        if (var6 == 50) {
            class327.field4548 = arg3;
            class282.field3944 = 2;
            class362.field5205 = 0;
            class675.field9197 = arg2;
            class559.field7739++;
            class564 var58 = class227.method1594(class684.field9266, class72.field1320, -127);
            var58.field7778.method1497(4325, class44.field980);
            var58.field7778.method1501(class58.field1147.field5716, (byte) 3);
            var58.field7778.method1501(class173.field2690, (byte) 3);
            var58.field7778.method1504(class406.field5949, -4086);
            var58.field7778.method1522((byte) -29, class117.field1992.method1346(82, -121) ? 1 : 0);
            class167.method1260(-40, var58);
        }
        if (var6 == 18 || var6 == 1011) {
            class397.method2485(var4, arg1.field4498, (byte) 5, var7, var5);
        }
        if (var6 == 13) {
            class378 var59 = class751.method4199(var4, (byte) -54, var5);
            if (var59 != null) {
                class236.method1643(-2049);
                class331 var60 = client.method1975(var59);
                class501.method2952(var60.field4623, var60.method2105(14), var59, (byte) 21);
                class133.field2242 = class616.method3497(0, var59);
                class133.field2241 = var59.field5428 + "<col=ffffff>";
                if (class133.field2242 == null) {
                    class133.field2242 = "Null";
                }
            }
            return;
        }
        if (var6 == 1009 || var6 == 1012 || var6 == 1002 || var6 == 1003 || var6 == 1006) {
            class690.method3855(var6, var4, var7, -1007);
        }
        if (var6 == 25) {
            class751 var61 = (class751) class86.field1546.method1465((long) var7, -6008);
            if (var61 != null) {
                class282.field3944 = 2;
                class675.field9197 = arg2;
                class105.field1852++;
                class9 var62 = var61.field10510;
                class327.field4548 = arg3;
                class362.field5205 = 0;
                class564 var63 = class227.method1594(class340.field4786, class72.field1320, -125);
                var63.field7778.method1526(false, class117.field1992.method1346(82, -125) ? 1 : 0);
                var63.field7778.method1501(var7, (byte) 3);
                class167.method1260(-37, var63);
                class137.method1116(true, var62.field5746[0], var62.field5743[0], (byte) -85, var62.method2457((byte) 124), 0, var62.method2457((byte) 84), -2, 0);
            }
        }
        if (var6 == 57) {
            class598 var64 = class49.field1040[var7];
            if (var64 != null) {
                class282.field3944 = 2;
                class675.field9197 = arg2;
                class605.field8303++;
                class362.field5205 = 0;
                class327.field4548 = arg3;
                class564 var65 = class227.method1594(class749.field10380, class72.field1320, -115);
                var65.field7778.method1483(-88, var7);
                var65.field7778.method1543((byte) -111, class117.field1992.method1346(82, -127) ? 1 : 0);
                class167.method1260(125, var65);
                class137.method1116(true, var64.field5746[0], var64.field5743[0], (byte) -98, var64.method2457((byte) 83), 0, var64.method2457((byte) 91), -2, 0);
            }
        }
        if (var6 == 9) {
            class238.field3483++;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class282.field3944 = 2;
            class675.field9197 = arg2;
            class564 var66 = class227.method1594(class350.field4880, class72.field1320, -125);
            var66.field7778.method1483(-96, class367.field5236 + var5);
            var66.field7778.method1497(4325, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var66.field7778.method1501(var4 + class221.field3177, (byte) 3);
            var66.field7778.method1543((byte) -91, class117.field1992.method1346(82, -127) ? 1 : 0);
            class167.method1260(118, var66);
            class604.method3436(var5, var8, var4, 24);
        }
        if (var6 == 44) {
            class751 var67 = (class751) class86.field1546.method1465((long) var7, -6008);
            if (var67 != null) {
                class9 var68 = var67.field10510;
                class675.field9197 = arg2;
                class362.field5205 = 0;
                class327.field4548 = arg3;
                class282.field3944 = 2;
                class192.field2841++;
                class564 var69 = class227.method1594(class88.field1570, class72.field1320, -117);
                var69.field7778.method1485((byte) 107, var7);
                var69.field7778.method1526(false, class117.field1992.method1346(82, -124) ? 1 : 0);
                class167.method1260(-25, var69);
                class137.method1116(true, var68.field5746[0], var68.field5743[0], (byte) -107, var68.method2457((byte) 104), 0, var68.method2457((byte) 50), -2, 0);
            }
        }
        if (var6 == 10) {
            class282.field3944 = 2;
            class327.field4548 = arg3;
            class362.field5205 = 0;
            class756.field10557++;
            class675.field9197 = arg2;
            class564 var70 = class227.method1594(class567.field7804, class72.field1320, -91);
            var70.field7778.method1483(-108, var5 + class367.field5236);
            var70.field7778.method1483(-70, var7);
            var70.field7778.method1501(class221.field3177 + var4, (byte) 3);
            var70.field7778.method1522((byte) -70, class117.field1992.method1346(82, -128) ? 1 : 0);
            class167.method1260(-22, var70);
            class161.method1233(1, var5, var4);
        }
        if (class184.field2785) {
            class236.method1643(-2049);
        }
        if (class253.field3655 != null && class746.field10326 == 0) {
            class296.method1945(-9343, class253.field3655);
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(IILbaa;)V", line = 1675)
    private class11(int arg0, int arg1, class523 arg2) {
        this.field148 = arg1;
        this.field147 = arg2;
        this.field146 = arg0;
        this.field145 = this.field147.field7244 * this.field148;
        if (this.field146 >= 16) {
            throw new RuntimeException();
        }
    }
}
