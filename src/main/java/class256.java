import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class256 {

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3982 = new String[] { method2174(method2173("_Z\u0015\nK\u0002")), method2174(method2173("_Z\u0015\nH\u0002")), method2174(method2173("~dN\u0004")), method2174(method2173("_Z\u0015\nN\u0002")), method2174(method2173("_Z\u0015\nO\u0002")), method2174(method2173("_Z\u0015\nJ\u0002")), method2174(method2173("_Z\u0015\nM\u0002")), method2174(method2173("_Z\u0015\nI\u0002")) };

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "Lwia;")
    public static class790 field3979 = new class790(4, 18);

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(BI)Ljd;")
    public static final class242 method2166(byte arg0, int arg1) {
        try {
            field3981++;
            class242 var2 = (class242) class205.field3171.method1558((byte) 96, (long) arg1);
            if (arg0 != 87) {
                field3979 = null;
            }
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class396.field5931.method3632(0, arg1, 84);
            class242 var4 = new class242();
            if (var3 != null) {
                var4.method2064(new class163(var3), -3988);
            }
            var4.method2065(116);
            class205.field3171.method1556((long) arg1, var4, 1);
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3982[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIII)I")
    public static final int method2167(int arg0, int arg1, int arg2, int arg3) {
        try {
            field3976++;
            if (class712.field10330 < 100) {
                return -2;
            }
            int var4 = -2;
            if (arg2 < 109) {
                return -20;
            }
            int var5 = Integer.MAX_VALUE;
            int var6 = arg3 - class161.field2171;
            int var7 = arg0 - class161.field2167;
            for (class131 var8 = (class131) class161.field2158.method3863((byte) 64); var8 != null; var8 = (class131) class161.field2158.method3862(-353)) {
                if (arg1 == var8.field1532) {
                    int var9 = var8.field1534;
                    int var10 = var8.field1536;
                    int var11 = var10 + class161.field2167 | class161.field2171 + var9 << 14;
                    int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                    if (var4 < 0 || var5 > var12) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            return var4;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field3982[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
    public static final void method2168(int arg0) {
        try {
            if (arg0 > -10) {
                method2167(-127, -1, -44, -49);
            }
            field3980++;
            for (class753 var1 = (class753) class195.field2615.method971(347); var1 != null; var1 = (class753) class195.field2615.method973(true)) {
                if (var1.field10955.method914((byte) -52)) {
                    class744.method5423(63, var1.field10964);
                } else {
                    var1.field10955.method3091((byte) 58);
                    try {
                        var1.field10955.method911(-117);
                    } catch (Exception var6) {
                        class618.method4603((byte) 123, field3982[2] + var1.field10964, var6);
                        class744.method5423(63, var1.field10964);
                    }
                    if (!var1.field10958 && !var1.field10956) {
                        class20 var3 = var1.field10955.method912((byte) 115);
                        if (var3 != null) {
                            class415 var4 = var3.method136((byte) -105);
                            if (var4 != null) {
                                var4.method3218(0, var1.field10957);
                                class594.field8714.method4981(var4);
                                var1.field10958 = true;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3982[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
    public static void method2169(int arg0) {
        try {
            field3979 = null;
            if (arg0 <= 85) {
                field3979 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3982[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)[[[B")
    public static final byte[][][] method2170(int arg0, int arg1) {
        try {
            field3977++;
            byte[][][] var2 = new byte[8][4][];
            int var3 = arg0;
            int var4 = arg0;
            byte[] var5 = new byte[arg0 * arg0];
            int var6 = 0;
            for (int var7 = 0; var7 < var4; var7++) {
                for (int var8 = 0; var8 < var3; var8++) {
                    if (var7 >= var8) {
                        var5[var6] = -1;
                    }
                    var6++;
                }
            }
            var2[0][0] = var5;
            byte[] var9 = new byte[var3 * var4];
            int var10 = 0;
            for (int var11 = var4 - 1; var11 >= 0; var11--) {
                for (int var12 = 0; var12 < var4; var12++) {
                    if (var11 >= var12) {
                        var9[var10] = -1;
                    }
                    var10++;
                }
            }
            var2[0][1] = var9;
            int var13 = 0;
            byte[] var14 = new byte[var3 * var4];
            for (int var15 = 0; var15 < var4; var15++) {
                for (int var16 = 0; var16 < var3; var16++) {
                    if (var15 <= var16) {
                        var14[var13] = -1;
                    }
                    var13++;
                }
            }
            var2[0][2] = var14;
            int var17 = 0;
            byte[] var18 = new byte[var3 * var4];
            for (int var19 = var4 - 1; var19 >= 0; var19--) {
                for (int var20 = 0; var20 < var3; var20++) {
                    if (var19 <= var20) {
                        var18[var17] = -1;
                    }
                    var17++;
                }
            }
            var2[0][3] = var18;
            int var21 = 0;
            byte[] var22 = new byte[var3 * var4];
            for (int var23 = var4 - 1; var23 >= 0; var23--) {
                for (int var24 = 0; var24 < var3; var24++) {
                    if (var24 <= (var23 >> 1)) {
                        var22[var21] = -1;
                    }
                    var21++;
                }
            }
            var2[1][0] = var22;
            int var25 = 0;
            byte[] var26 = new byte[var3 * var4];
            for (int var27 = 0; var27 < var4; var27++) {
                for (int var28 = 0; var28 < var3; var28++) {
                    if (var25 >= 0 && var26.length > var25) {
                        if (var27 << 1 <= var28) {
                            var26[var25] = -1;
                        }
                        var25++;
                    } else {
                        var25++;
                    }
                }
            }
            var2[1][1] = var26;
            int var29 = 0;
            byte[] var30 = new byte[var3 * var4];
            for (int var31 = 0; var31 < var4; var31++) {
                for (int var32 = var3 - 1; var32 >= 0; var32--) {
                    if (var32 <= var31 >> 1) {
                        var30[var29] = -1;
                    }
                    var29++;
                }
            }
            var2[1][2] = var30;
            byte[] var33 = new byte[var3 * var4];
            int var34 = 0;
            for (int var35 = var4 - 1; var35 >= 0; var35--) {
                for (int var36 = var3 - 1; var36 >= 0; var36--) {
                    if (var36 >= (var35 << 1)) {
                        var33[var34] = -1;
                    }
                    var34++;
                }
            }
            var2[1][3] = var33;
            int var37 = 0;
            byte[] var38 = new byte[var3 * var4];
            for (int var39 = var4 - 1; var39 >= 0; var39--) {
                for (int var40 = var3 - 1; var40 >= 0; var40--) {
                    if (var40 <= (var39 >> 1)) {
                        var38[var37] = -1;
                    }
                    var37++;
                }
            }
            var2[2][0] = var38;
            int var41 = 0;
            byte[] var42 = new byte[var3 * var4];
            for (int var43 = arg1 + var4; var43 >= 0; var43--) {
                for (int var44 = 0; var44 < var3; var44++) {
                    if (var43 << 1 <= var44) {
                        var42[var41] = -1;
                    }
                    var41++;
                }
            }
            var2[2][1] = var42;
            int var45 = 0;
            byte[] var46 = new byte[var3 * var4];
            for (int var47 = 0; var47 < var4; var47++) {
                for (int var48 = 0; var48 < var3; var48++) {
                    if ((var47 >> 1) >= var48) {
                        var46[var45] = -1;
                    }
                    var45++;
                }
            }
            var2[2][2] = var46;
            int var49 = 0;
            byte[] var50 = new byte[var3 * var4];
            for (int var51 = 0; var51 < var4; var51++) {
                for (int var52 = var3 - 1; var52 >= 0; var52--) {
                    if ((var51 << 1) <= var52) {
                        var50[var49] = -1;
                    }
                    var49++;
                }
            }
            var2[2][3] = var50;
            int var53 = 0;
            byte[] var54 = new byte[var3 * var4];
            for (int var55 = var4 - 1; var55 >= 0; var55--) {
                for (int var56 = 0; var56 < var3; var56++) {
                    if (var56 >= var55 >> 1) {
                        var54[var53] = -1;
                    }
                    var53++;
                }
            }
            var2[3][0] = var54;
            int var57 = 0;
            byte[] var58 = new byte[var3 * var4];
            for (int var59 = 0; var59 < var4; var59++) {
                for (int var60 = 0; var60 < var3; var60++) {
                    if (var60 <= (var59 << 1)) {
                        var58[var57] = -1;
                    }
                    var57++;
                }
            }
            var2[3][1] = var58;
            int var61 = 0;
            byte[] var62 = new byte[var3 * var4];
            for (int var63 = 0; var63 < var4; var63++) {
                for (int var64 = var3 - 1; var64 >= 0; var64--) {
                    if (var64 >= var63 >> 1) {
                        var62[var61] = -1;
                    }
                    var61++;
                }
            }
            var2[3][2] = var62;
            byte[] var65 = new byte[var3 * var4];
            int var66 = 0;
            for (int var67 = var4 - 1; var67 >= 0; var67--) {
                for (int var68 = var3 - 1; var68 >= 0; var68--) {
                    if (var68 <= var67 << 1) {
                        var65[var66] = -1;
                    }
                    var66++;
                }
            }
            var2[3][3] = var65;
            byte[] var69 = new byte[var3 * var4];
            int var70 = 0;
            for (int var71 = var4 - 1; var71 >= 0; var71--) {
                for (int var72 = var3 - 1; var72 >= 0; var72--) {
                    if (var72 >= var71 >> 1) {
                        var69[var70] = -1;
                    }
                    var70++;
                }
            }
            var2[4][0] = var69;
            byte[] var73 = new byte[var3 * var4];
            int var74 = 0;
            for (int var75 = var4 - 1; var75 >= 0; var75--) {
                for (int var76 = 0; var76 < var3; var76++) {
                    if (var76 <= var75 << 1) {
                        var73[var74] = -1;
                    }
                    var74++;
                }
            }
            var2[4][1] = var73;
            byte[] var77 = new byte[var3 * var4];
            int var78 = 0;
            for (int var79 = 0; var79 < var4; var79++) {
                for (int var80 = 0; var80 < var3; var80++) {
                    if ((var79 >> 1) <= var80) {
                        var77[var78] = -1;
                    }
                    var78++;
                }
            }
            var2[4][2] = var77;
            byte[] var81 = new byte[var3 * var4];
            int var82 = 0;
            for (int var83 = 0; var83 < var4; var83++) {
                for (int var84 = var3 - 1; var84 >= 0; var84--) {
                    if (var83 << 1 >= var84) {
                        var81[var82] = -1;
                    }
                    var82++;
                }
            }
            var2[4][3] = var81;
            byte[] var85 = new byte[var3 * var4];
            int var86 = 0;
            for (int var87 = 0; var87 < var4; var87++) {
                for (int var88 = 0; var88 < var3; var88++) {
                    if ((var3 / 2) >= var88) {
                        var85[var86] = -1;
                    }
                    var86++;
                }
            }
            var2[5][0] = var85;
            int var89 = 0;
            byte[] var90 = new byte[var3 * var4];
            for (int var91 = 0; var91 < var4; var91++) {
                for (int var92 = 0; var92 < var3; var92++) {
                    if (var91 <= var4 / 2) {
                        var90[var89] = -1;
                    }
                    var89++;
                }
            }
            var2[5][1] = var90;
            byte[] var93 = new byte[var3 * var4];
            int var94 = 0;
            for (int var95 = 0; var95 < var4; var95++) {
                for (int var96 = 0; var96 < var3; var96++) {
                    if (var96 >= (var3 / 2)) {
                        var93[var94] = -1;
                    }
                    var94++;
                }
            }
            var2[5][2] = var93;
            int var97 = 0;
            byte[] var98 = new byte[var3 * var4];
            for (int var99 = 0; var99 < var4; var99++) {
                for (int var100 = 0; var100 < var3; var100++) {
                    if (var4 / 2 <= var99) {
                        var98[var97] = -1;
                    }
                    var97++;
                }
            }
            var2[5][3] = var98;
            byte[] var101 = new byte[var3 * var4];
            int var102 = 0;
            for (int var103 = 0; var103 < var4; var103++) {
                for (int var104 = 0; var104 < var3; var104++) {
                    if (var103 - (var4 / 2) >= var104) {
                        var101[var102] = -1;
                    }
                    var102++;
                }
            }
            var2[6][0] = var101;
            byte[] var105 = new byte[var3 * var4];
            int var106 = 0;
            for (int var107 = var4 - 1; var107 >= 0; var107--) {
                for (int var108 = 0; var108 < var3; var108++) {
                    if (var107 - (var4 / 2) >= var108) {
                        var105[var106] = -1;
                    }
                    var106++;
                }
            }
            var2[6][1] = var105;
            byte[] var109 = new byte[var3 * var4];
            int var110 = 0;
            for (int var111 = var4 - 1; var111 >= 0; var111--) {
                for (int var112 = var3 - 1; var112 >= 0; var112--) {
                    if ((var111 - var4 / 2) >= var112) {
                        var109[var110] = -1;
                    }
                    var110++;
                }
            }
            var2[6][2] = var109;
            byte[] var113 = new byte[var3 * var4];
            int var114 = 0;
            for (int var115 = 0; var115 < var4; var115++) {
                for (int var116 = var3 - 1; var116 >= 0; var116--) {
                    if (var116 <= (var115 - (var4 / 2))) {
                        var113[var114] = -1;
                    }
                    var114++;
                }
            }
            var2[6][3] = var113;
            int var117 = 0;
            byte[] var118 = new byte[var3 * var4];
            for (int var119 = 0; var119 < var4; var119++) {
                for (int var120 = 0; var120 < var3; var120++) {
                    if ((var119 - (var4 / 2)) <= var120) {
                        var118[var117] = -1;
                    }
                    var117++;
                }
            }
            var2[7][0] = var118;
            byte[] var121 = new byte[var3 * var4];
            int var122 = 0;
            for (int var123 = var4 - 1; var123 >= 0; var123--) {
                for (int var124 = 0; var124 < var3; var124++) {
                    if (var124 >= (var123 - (var4 / 2))) {
                        var121[var122] = -1;
                    }
                    var122++;
                }
            }
            var2[7][1] = var121;
            int var125 = 0;
            byte[] var126 = new byte[var3 * var4];
            for (int var127 = var4 - 1; var127 >= 0; var127--) {
                for (int var128 = var3 - 1; var128 >= 0; var128--) {
                    if ((var127 - (var4 / 2)) <= var128) {
                        var126[var125] = -1;
                    }
                    var125++;
                }
            }
            var2[7][2] = var126;
            int var129 = 0;
            byte[] var130 = new byte[var3 * var4];
            for (int var131 = 0; var131 < var4; var131++) {
                for (int var132 = var3 - 1; var132 >= 0; var132--) {
                    if (var132 >= (var131 - var4 / 2)) {
                        var130[var129] = -1;
                    }
                    var129++;
                }
            }
            var2[7][3] = var130;
            return var2;
        } catch (RuntimeException var134) {
            throw class759.method5498(var134, field3982[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field3978++;
            if ((class184.field2545[0][arg4][arg2] & arg0) != 0) {
                return true;
            } else if ((class184.field2545[arg1][arg4][arg2] & 0x10) == 0) {
                return arg3 == class5.method35(-95, arg1, arg4, arg2);
            } else {
                return false;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3982[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)I")
    public static final int method2172(int arg0, int arg1) {
        try {
            if (arg1 != 0) {
                method2172(-74, -88);
            }
            field3975++;
            return arg0 >>> 7;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3982[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2173(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xC);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2174(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
