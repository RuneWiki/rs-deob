import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class302 {

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4220 = new String[] { method2434(method2433(" \u00034%u}")), method2434(method2433(" \u00034%|}")), method2434(method2433(" \u00034%m}")), method2434(method2433(" \u00034%v}")), method2434(method2433(" \u00034%q}")), method2434(method2433(" \u00034%r}")), method2434(method2433(" \u00034%\u007f}")), method2434(method2433(" \u00034%~}")), method2434(method2433(" \u00034%w}")), method2434(method2433(" \u00034%x}")), method2434(method2433(" \u00034%l}")), method2434(method2433(" \u00034%y}")), method2434(method2433(" \u00034%s}")), method2434(method2433(" \u00034%{}")), method2434(method2433(" \u00034%t}")), method2434(method2433(" \u00034%o}")), method2434(method2433(" \u00034%z}")), method2434(method2433(" \u00034%p}")) };

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "[I")
    public static int[] field4219 = new int[3];

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "[I")
    public static int[] field4205 = new int[200];

    @OriginalMember(owner = "client!uda", name = "r", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!uda", name = "p", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public int field4198;

    @OriginalMember(owner = "client!uda", name = "x", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!uda", name = "w", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!uda", name = "v", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!uda", name = "q", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!uda", name = "u", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!uda", name = "s", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!uda", name = "t", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "[[I")
    public int[][] field4202;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)[[[B", line = 4)
    public static final byte[][][] method2415(byte arg0, int arg1) {
        try {
            field4197++;
            byte[][][] var2 = new byte[8][4][];
            int var3 = arg1;
            int var4 = arg1;
            byte[] var5 = new byte[arg1 * arg1];
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
                    if (var12 <= var11) {
                        var9[var10] = -1;
                    }
                    var10++;
                }
            }
            var2[0][1] = var9;
            byte[] var13 = new byte[var3 * var4];
            int var14 = 0;
            for (int var15 = 0; var15 < var4; var15++) {
                for (int var16 = 0; var16 < var3; var16++) {
                    if (var16 >= var15) {
                        var13[var14] = -1;
                    }
                    var14++;
                }
            }
            var2[0][2] = var13;
            byte[] var17 = new byte[var3 * var4];
            int var18 = 0;
            for (int var19 = var4 - 1; var19 >= 0; var19--) {
                for (int var20 = 0; var20 < var3; var20++) {
                    if (var20 >= var19) {
                        var17[var18] = -1;
                    }
                    var18++;
                }
            }
            var2[0][3] = var17;
            int var21 = 0;
            byte[] var22 = new byte[var3 * var4];
            for (int var23 = var4 - 1; var23 >= 0; var23--) {
                for (int var24 = 0; var24 < var3; var24++) {
                    if ((var23 >> 1) >= var24) {
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
                        if (var28 >= (var27 << 1)) {
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
                    if ((var31 >> 1) >= var32) {
                        var30[var29] = -1;
                    }
                    var29++;
                }
            }
            var2[1][2] = var30;
            int var33 = 0;
            byte[] var34 = new byte[var3 * var4];
            for (int var35 = var4 - 1; var35 >= 0; var35--) {
                for (int var36 = var3 - 1; var36 >= 0; var36--) {
                    if ((var35 << 1) <= var36) {
                        var34[var33] = -1;
                    }
                    var33++;
                }
            }
            var2[1][3] = var34;
            byte[] var37 = new byte[var3 * var4];
            int var38 = 0;
            for (int var39 = var4 - 1; var39 >= 0; var39--) {
                for (int var40 = var3 - 1; var40 >= 0; var40--) {
                    if (var40 <= (var39 >> 1)) {
                        var37[var38] = -1;
                    }
                    var38++;
                }
            }
            var2[2][0] = var37;
            int var41 = 0;
            byte[] var42 = new byte[var3 * var4];
            for (int var43 = var4 - 1; var43 >= 0; var43--) {
                for (int var44 = 0; var44 < var3; var44++) {
                    if (var44 >= var43 << 1) {
                        var42[var41] = -1;
                    }
                    var41++;
                }
            }
            var2[2][1] = var42;
            byte[] var45 = new byte[var3 * var4];
            int var46 = 0;
            for (int var47 = 0; var47 < var4; var47++) {
                for (int var48 = 0; var48 < var3; var48++) {
                    if ((var47 >> 1) >= var48) {
                        var45[var46] = -1;
                    }
                    var46++;
                }
            }
            var2[2][2] = var45;
            byte[] var49 = new byte[var3 * var4];
            int var50 = 0;
            for (int var51 = 0; var51 < var4; var51++) {
                for (int var52 = var3 - 1; var52 >= 0; var52--) {
                    if (var51 << 1 <= var52) {
                        var49[var50] = -1;
                    }
                    var50++;
                }
            }
            var2[2][3] = var49;
            byte[] var53 = new byte[var3 * var4];
            int var54 = 0;
            for (int var55 = var4 - 1; var55 >= 0; var55--) {
                for (int var56 = 0; var56 < var3; var56++) {
                    if ((var55 >> 1) <= var56) {
                        var53[var54] = -1;
                    }
                    var54++;
                }
            }
            var2[3][0] = var53;
            int var57 = 0;
            byte[] var58 = new byte[var3 * var4];
            for (int var59 = 0; var59 < var4; var59++) {
                for (int var60 = 0; var60 < var3; var60++) {
                    if ((var59 << 1) >= var60) {
                        var58[var57] = -1;
                    }
                    var57++;
                }
            }
            var2[3][1] = var58;
            byte[] var61 = new byte[var3 * var4];
            int var62 = 0;
            for (int var63 = 0; var63 < var4; var63++) {
                for (int var64 = var3 - 1; var64 >= 0; var64--) {
                    if (var63 >> 1 <= var64) {
                        var61[var62] = -1;
                    }
                    var62++;
                }
            }
            var2[3][2] = var61;
            int var65 = 0;
            byte[] var66 = new byte[var3 * var4];
            for (int var67 = var4 - 1; var67 >= 0; var67--) {
                for (int var68 = var3 - 1; var68 >= 0; var68--) {
                    if (var68 <= (var67 << 1)) {
                        var66[var65] = -1;
                    }
                    var65++;
                }
            }
            var2[3][3] = var66;
            byte[] var69 = new byte[var3 * var4];
            int var70 = 0;
            for (int var71 = var4 - 1; var71 >= 0; var71--) {
                for (int var72 = var3 - 1; var72 >= 0; var72--) {
                    if ((var71 >> 1) <= var72) {
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
                    if (var75 << 1 >= var76) {
                        var73[var74] = -1;
                    }
                    var74++;
                }
            }
            var2[4][1] = var73;
            int var77 = 0;
            byte[] var78 = new byte[var3 * var4];
            for (int var79 = 0; var79 < var4; var79++) {
                for (int var80 = 0; var80 < var3; var80++) {
                    if (var80 >= (var79 >> 1)) {
                        var78[var77] = -1;
                    }
                    var77++;
                }
            }
            var2[4][2] = var78;
            int var81 = 0;
            byte[] var82 = new byte[var3 * var4];
            for (int var83 = 0; var83 < var4; var83++) {
                for (int var84 = var3 - 1; var84 >= 0; var84--) {
                    if (var84 <= (var83 << 1)) {
                        var82[var81] = -1;
                    }
                    var81++;
                }
            }
            var2[4][3] = var82;
            byte[] var85 = new byte[var3 * var4];
            int var86 = 0;
            for (int var87 = 0; var87 < var4; var87++) {
                for (int var88 = 0; var88 < var3; var88++) {
                    if (var3 / 2 >= var88) {
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
                    if (var91 <= (var4 / 2)) {
                        var90[var89] = -1;
                    }
                    var89++;
                }
            }
            var2[5][1] = var90;
            int var93 = 0;
            if (arg0 != -105) {
                return null;
            }
            byte[] var94 = new byte[var3 * var4];
            for (int var95 = 0; var95 < var4; var95++) {
                for (int var96 = 0; var96 < var3; var96++) {
                    if (var3 / 2 <= var96) {
                        var94[var93] = -1;
                    }
                    var93++;
                }
            }
            var2[5][2] = var94;
            int var97 = 0;
            byte[] var98 = new byte[var3 * var4];
            for (int var99 = 0; var99 < var4; var99++) {
                for (int var100 = 0; var100 < var3; var100++) {
                    if ((var4 / 2) <= var99) {
                        var98[var97] = -1;
                    }
                    var97++;
                }
            }
            var2[5][3] = var98;
            int var101 = 0;
            byte[] var102 = new byte[var3 * var4];
            for (int var103 = 0; var103 < var4; var103++) {
                for (int var104 = 0; var104 < var3; var104++) {
                    if (var104 <= (var103 - (var4 / 2))) {
                        var102[var101] = -1;
                    }
                    var101++;
                }
            }
            var2[6][0] = var102;
            int var105 = 0;
            byte[] var106 = new byte[var3 * var4];
            for (int var107 = var4 - 1; var107 >= 0; var107--) {
                for (int var108 = 0; var108 < var3; var108++) {
                    if ((var107 - (var4 / 2)) >= var108) {
                        var106[var105] = -1;
                    }
                    var105++;
                }
            }
            var2[6][1] = var106;
            byte[] var109 = new byte[var3 * var4];
            int var110 = 0;
            for (int var111 = var4 - 1; var111 >= 0; var111--) {
                for (int var112 = var3 - 1; var112 >= 0; var112--) {
                    if ((var111 - (var4 / 2)) >= var112) {
                        var109[var110] = -1;
                    }
                    var110++;
                }
            }
            var2[6][2] = var109;
            int var113 = 0;
            byte[] var114 = new byte[var3 * var4];
            for (int var115 = 0; var115 < var4; var115++) {
                for (int var116 = var3 - 1; var116 >= 0; var116--) {
                    if (var116 <= (var115 - var4 / 2)) {
                        var114[var113] = -1;
                    }
                    var113++;
                }
            }
            var2[6][3] = var114;
            byte[] var117 = new byte[var3 * var4];
            int var118 = 0;
            for (int var119 = 0; var119 < var4; var119++) {
                for (int var120 = 0; var120 < var3; var120++) {
                    if (var120 >= var119 - (var4 / 2)) {
                        var117[var118] = -1;
                    }
                    var118++;
                }
            }
            var2[7][0] = var117;
            byte[] var121 = new byte[var3 * var4];
            int var122 = 0;
            for (int var123 = var4 - 1; var123 >= 0; var123--) {
                for (int var124 = 0; var124 < var3; var124++) {
                    if (var124 >= var123 - (var4 / 2)) {
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
                    if (var128 >= var127 - (var4 / 2)) {
                        var126[var125] = -1;
                    }
                    var125++;
                }
            }
            var2[7][2] = var126;
            byte[] var129 = new byte[var3 * var4];
            int var130 = 0;
            for (int var131 = 0; var131 < var4; var131++) {
                for (int var132 = var3 - 1; var132 >= 0; var132--) {
                    if (var132 >= var131 - (var4 / 2)) {
                        var129[var130] = -1;
                    }
                    var130++;
                }
            }
            var2[7][3] = var129;
            return var2;
        } catch (RuntimeException var134) {
            throw class665.method4799(var134, field4220[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBIIIIIIII)Z", line = 783)
    public final boolean method2416(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field4204++;
            int var11 = arg5 + arg6;
            int var12 = arg7 + arg9;
            int var13 = -37 / ((-arg1 - 22) / 46);
            int var14 = arg3 + arg4;
            int var15 = arg0 + arg8;
            if (arg5 == var14 && (arg2 & 0x2) == 0) {
                int var22 = arg0 < arg9 ? arg9 : arg0;
                int var23 = var12 < var15 ? var12 : var15;
                while (var22 < var23) {
                    if ((this.field4202[var14 - this.field4214 - 1][var22 - this.field4196] & 0x8) == 0) {
                        return true;
                    }
                    var22++;
                }
            } else if (arg4 == var11 && (arg2 & 0x8) == 0) {
                int var16 = arg0 >= arg9 ? arg0 : arg9;
                int var17 = var15 <= var12 ? var15 : var12;
                while (var17 > var16) {
                    if ((this.field4202[arg4 - this.field4214][var16 - this.field4196] & 0x80) == 0) {
                        return true;
                    }
                    var16++;
                }
            } else if (arg9 == var15 && (arg2 & 0x1) == 0) {
                int var20 = arg4 >= arg5 ? arg4 : arg5;
                int var21 = var14 > var11 ? var11 : var14;
                while (var21 > var20) {
                    if ((this.field4202[var20 - this.field4214][var15 - this.field4196 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var20++;
                }
            } else if (arg0 == var12 && (arg2 & 0x4) == 0) {
                int var18 = arg4 >= arg5 ? arg4 : arg5;
                int var19 = var11 < var14 ? var11 : var14;
                while (var18 < var19) {
                    if ((this.field4202[var18 - this.field4214][arg0 - this.field4196] & 0x20) == 0) {
                        return true;
                    }
                    var18++;
                }
            }
            return false;
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field4220[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIZ)V", line = 876)
    public final void method2417(int arg0, int arg1, boolean arg2) {
        try {
            int var6 = arg0 - this.field4196;
            int var7 = arg1 - this.field4214;
            if (arg2) {
                this.method2431(-53, -4, 87, true, -40, false, -57);
            }
            field4210++;
            this.field4202[var7][var6] = class10.method71(this.field4202[var7][var6], 262144);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4220[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V", line = 889)
    public static void method2418(byte arg0) {
        try {
            field4219 = null;
            int var1 = -64 / ((-arg0 - 90) / 32);
            field4205 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4220[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)V", line = 904)
    public final void method2419(byte arg0, int arg1, int arg2) {
        try {
            field4217++;
            int var7 = arg1 - this.field4214;
            int var8 = arg2 - this.field4196;
            int var4 = -32 % ((-arg0 - 17) / 63);
            this.field4202[var7][var8] = class10.method71(this.field4202[var7][var8], 2097152);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4220[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIII)V", line = 926)
    private final void method2420(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg3 == 3) {
                field4207++;
                this.field4202[arg0][arg1] = class434.method3377(this.field4202[arg0][arg1], ~arg2);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4220[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIZIIZII)V", line = 940)
    public final void method2421(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            field4216++;
            int var9 = 256;
            if (arg2) {
                var9 |= 0x20000;
            }
            int var15 = arg0 - this.field4196;
            int var16 = arg7 - this.field4214;
            if (arg1 == 1 || arg1 == 3) {
                int var10 = arg3;
                arg3 = arg6;
                arg6 = var10;
            }
            if (arg5) {
                var9 |= 0x40000000;
            }
            for (int var11 = var16; var11 < arg3 + var16; var11++) {
                if (var11 >= 0 && var11 < this.field4201) {
                    for (int var12 = var15; var12 < (var15 + arg6); var12++) {
                        if (var12 >= 0 && this.field4198 > var12) {
                            this.method2420(var11, var12, var9, arg4 + 7048);
                        }
                    }
                }
            }
            if (arg4 != -7045) {
                method2427(-71, -24, 108, 71, -19, 109, 24, -88);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field4220[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIIZI)Z", line = 996)
    public final boolean method2422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        try {
            if (arg7) {
                method2418((byte) 3);
            }
            field4206++;
            if (arg4 > 1) {
                return class801.method5778(arg4, arg3, arg1, arg4, arg5, arg8, arg0, (byte) 116, arg2) ? true : this.method2416(arg0, (byte) 97, arg6, arg2, arg5, arg3, arg4, arg4, arg8, arg1);
            }
            int var10 = arg2 + arg5 - 1;
            int var11 = arg8 + arg0 - 1;
            if (arg5 <= arg3 && var10 >= arg3 && arg1 >= arg0 && var11 >= arg1) {
                return true;
            } else if ((arg5 - 1) == arg3 && arg1 >= arg0 && var11 >= arg1 && (this.field4202[arg3 - this.field4214][arg1 - this.field4196] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg3 && arg1 >= arg0 && arg1 <= var11 && (this.field4202[arg3 - this.field4214][arg1 - this.field4196] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if (arg0 - 1 == arg1 && arg5 <= arg3 && arg3 <= var10 && (this.field4202[arg3 - this.field4214][arg1 - this.field4196] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg1 && arg5 <= arg3 && var10 >= arg3 && (this.field4202[arg3 - this.field4214][arg1 - this.field4196] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4220[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBI)V", line = 1039)
    public final void method2423(int arg0, byte arg1, int arg2) {
        try {
            field4218++;
            if (arg1 != 62) {
                this.method2425(-74, -74, 104);
            }
            int var7 = arg2 - this.field4196;
            int var6 = arg0 - this.field4214;
            this.field4202[var6][var7] = class434.method3377(this.field4202[var6][var7], -262145);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4220[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIII)Z", line = 1054)
    public final boolean method2424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg3 != 0) {
                this.method2420(-77, 106, -79, 34);
            }
            field4212++;
            if (arg7 == 1) {
                if (arg2 == arg4 && arg0 == arg5) {
                    return true;
                }
            } else if (arg2 >= arg4 && (arg4 + arg7 - 1) >= arg2 && arg5 >= arg5 && arg5 <= arg7 + arg5 - 1) {
                return true;
            }
            int var14 = arg2 - this.field4214;
            int var15 = arg4 - this.field4214;
            int var16 = arg5 - this.field4196;
            int var13 = arg0 - this.field4196;
            if (arg7 == 1) {
                if (arg6 == 0) {
                    if (arg1 == 0) {
                        if (var14 - 1 == var15 && var13 == var16) {
                            return true;
                        }
                        if (var14 == var15 && var16 + 1 == var13 && (this.field4202[var15][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var14 == var15 && (var16 - 1) == var13 && (this.field4202[var15][var13] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 1) {
                        if (var14 == var15 && var16 + 1 == var13) {
                            return true;
                        }
                        if ((var14 - 1) == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var14 + 1 == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0180) == 0) {
                            return true;
                        }
                    } else if (arg1 == 2) {
                        if ((var14 + 1) == var15 && var13 == var16) {
                            return true;
                        }
                        if (var14 == var15 && var16 + 1 == var13 && (this.field4202[var15][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var14 == var15 && var16 - 1 == var13 && (this.field4202[var15][var13] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 3) {
                        if (var14 == var15 && (var16 - 1) == var13) {
                            return true;
                        }
                        if (var14 - 1 == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0108) == 0) {
                            return true;
                        }
                        if ((var14 + 1) == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0180) == 0) {
                            return true;
                        }
                    }
                }
                if (arg6 == 2) {
                    if (arg1 == 0) {
                        if (var14 - 1 == var15 && var13 == var16) {
                            return true;
                        }
                        if (var14 == var15 && (var16 + 1) == var13) {
                            return true;
                        }
                        if (var14 + 1 == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var14 == var15 && var16 - 1 == var13 && (this.field4202[var15][var13] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 1) {
                        if ((var14 - 1) == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var14 == var15 && var16 + 1 == var13) {
                            return true;
                        }
                        if ((var14 + 1) == var15 && var13 == var16) {
                            return true;
                        }
                        if (var14 == var15 && var16 - 1 == var13 && (this.field4202[var15][var13] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 2) {
                        if (var14 - 1 == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var14 == var15 && var16 + 1 == var13 && (this.field4202[var15][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if ((var14 + 1) == var15 && var13 == var16) {
                            return true;
                        }
                        if (var14 == var15 && var16 - 1 == var13) {
                            return true;
                        }
                    } else if (arg1 == 3) {
                        if (var14 - 1 == var15 && var13 == var16) {
                            return true;
                        }
                        if (var14 == var15 && (var16 + 1) == var13 && (this.field4202[var15][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var14 + 1 == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var14 == var15 && var16 - 1 == var13) {
                            return true;
                        }
                    }
                }
                if (arg6 == 9) {
                    if (var14 == var15 && (var16 + 1) == var13 && (this.field4202[var15][var13] & 0x20) == 0) {
                        return true;
                    }
                    if (var14 == var15 && (var16 - 1) == var13 && (this.field4202[var15][var13] & 0x2) == 0) {
                        return true;
                    }
                    if (var14 - 1 == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var14 + 1 == var15 && var13 == var16 && (this.field4202[var15][var13] & 0x80) == 0) {
                        return true;
                    }
                }
            } else {
                int var9 = var15 + arg7 - 1;
                int var10 = var13 + arg7 - 1;
                if (arg6 == 0) {
                    if (arg1 == 0) {
                        if ((var14 - arg7) == var15 && var13 <= var16 && var10 >= var16) {
                            return true;
                        }
                        if (var14 >= var15 && var14 <= var9 && (var16 + 1) == var13 && (this.field4202[var14][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var14 >= var15 && var9 >= var14 && var16 - arg7 == var13 && (this.field4202[var14][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 1) {
                        if (var15 <= var14 && var9 >= var14 && (var16 + 1) == var13) {
                            return true;
                        }
                        if (var14 - arg7 == var15 && var16 >= var13 && var16 <= var10 && (this.field4202[var9][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if ((var14 + 1) == var15 && var16 >= var13 && var10 >= var16 && (this.field4202[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                    } else if (arg1 == 2) {
                        if (var14 + 1 == var15 && var13 <= var16 && var16 <= var10) {
                            return true;
                        }
                        if (var14 >= var15 && var9 >= var14 && (var16 + 1) == var13 && (this.field4202[var14][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var15 <= var14 && var14 <= var9 && (var16 - arg7) == var13 && (this.field4202[var14][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 3) {
                        if (var15 <= var14 && var14 <= var9 && var16 - arg7 == var13) {
                            return true;
                        }
                        if (var14 - arg7 == var15 && var13 <= var16 && var10 >= var16 && (this.field4202[var9][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if ((var14 + 1) == var15 && var13 <= var16 && var16 <= var10 && (this.field4202[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                    }
                }
                if (arg6 == 2) {
                    if (arg1 == 0) {
                        if (var14 - arg7 == var15 && var16 >= var13 && var16 <= var10) {
                            return true;
                        }
                        if (var14 >= var15 && var9 >= var14 && var16 + 1 == var13) {
                            return true;
                        }
                        if ((var14 + 1) == var15 && var16 >= var13 && var16 <= var10 && (this.field4202[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var15 <= var14 && var9 >= var14 && (var16 - arg7) == var13 && (this.field4202[var14][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 1) {
                        if (var14 - arg7 == var15 && var16 >= var13 && var10 >= var16 && (this.field4202[var9][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var14 >= var15 && var9 >= var14 && var16 + 1 == var13) {
                            return true;
                        }
                        if (var14 + 1 == var15 && var16 >= var13 && var16 <= var10) {
                            return true;
                        }
                        if (var14 >= var15 && var14 <= var9 && (var16 - arg7) == var13 && (this.field4202[var14][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg1 == 2) {
                        if (var14 - arg7 == var15 && var16 >= var13 && var10 >= var16 && (this.field4202[var9][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var14 >= var15 && var9 >= var14 && var16 + 1 == var13 && (this.field4202[var14][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var14 + 1 == var15 && var16 >= var13 && var10 >= var16) {
                            return true;
                        }
                        if (var15 <= var14 && var9 >= var14 && (var16 - arg7) == var13) {
                            return true;
                        }
                    } else if (arg1 == 3) {
                        if (var14 - arg7 == var15 && var13 <= var16 && var16 <= var10) {
                            return true;
                        }
                        if (var15 <= var14 && var14 <= var9 && var16 + 1 == var13 && (this.field4202[var14][var13] & 0x2C0120) == 0) {
                            return true;
                        }
                        if ((var14 + 1) == var15 && var16 >= var13 && var10 >= var16 && (this.field4202[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var15 <= var14 && var9 >= var14 && var16 - arg7 == var13) {
                            return true;
                        }
                    }
                }
                if (arg6 == 9) {
                    if (var15 <= var14 && var9 >= var14 && var16 + 1 == var13 && (this.field4202[var14][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var15 <= var14 && var14 <= var9 && (var16 - arg7) == var13 && (this.field4202[var14][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                    if ((var14 - arg7) == var15 && var16 >= var13 && var10 >= var16 && (this.field4202[var9][var16] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var14 + 1 == var15 && var16 >= var13 && var16 <= var10 && (this.field4202[var15][var16] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field4220[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)V", line = 1422)
    public final void method2425(int arg0, int arg1, int arg2) {
        try {
            field4211++;
            int var6 = arg1 - this.field4214;
            int var7 = arg2 - this.field4196;
            this.field4202[var6][var7] = class434.method3377(this.field4202[var6][var7], -2097153);
            if (arg0 != 0) {
                this.field4198 = 52;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4220[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIBI)V", line = 1445)
    private final void method2426(int arg0, int arg1, byte arg2, int arg3) {
        try {
            field4199++;
            this.field4202[arg0][arg3] = class10.method71(this.field4202[arg0][arg3], arg1);
            if (arg2 != 45) {
                method2418((byte) 52);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4220[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(IIIIIIII)V", line = 1459)
    public static final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field4215++;
            int var8 = 0;
            int var9 = arg5;
            int var10 = 0;
            int var11 = arg3 - arg1;
            int var12 = arg5 - arg1;
            int var13 = arg3 * arg3;
            int var14 = arg5 * arg5;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            if (arg6 == 2038540545) {
                int var19 = var16 << 1;
                int var20 = var15 << 1;
                int var21 = arg5 << 1;
                int var22 = var12 << 1;
                int var23 = (1 - var21) * var13 + var17;
                int var24 = var14 - ((var21 - 1) * var18);
                int var25 = (1 - var22) * var15 + var19;
                int var26 = var16 - ((var22 - 1) * var20);
                int var27 = var13 << 2;
                int var28 = var14 << 2;
                int var29 = var15 << 2;
                int var30 = var16 << 2;
                int var31 = var17 * 3;
                int var32 = (var21 - 3) * var18;
                int var33 = var19 * 3;
                int var34 = (var22 - 3) * var20;
                int var35 = var28;
                int var36 = (arg5 - 1) * var27;
                int var37 = var30;
                int var38 = (var12 - 1) * var29;
                int[] var39 = class529.field7682[arg0];
                class576.method4282(arg6 ^ 0x867E56F8, arg4 - arg3, arg2, var39, arg4 - var11);
                class576.method4282(-7, arg4 - var11, arg7, var39, arg4 + var11);
                class576.method4282(-7, arg4 + var11, arg2, var39, arg3 + arg4);
                while (var9 > 0) {
                    boolean var40 = var12 >= var9;
                    if (var40) {
                        if (var25 < 0) {
                            while (var25 < 0) {
                                var26 += var37;
                                var25 += var33;
                                var10++;
                                var33 += var30;
                                var37 += var30;
                            }
                        }
                        if (var26 < 0) {
                            var26 += var37;
                            var25 += var33;
                            var37 += var30;
                            var33 += var30;
                            var10++;
                        }
                        var25 += -var38;
                        var26 += -var34;
                        var38 -= var29;
                        var34 -= var29;
                    }
                    if (var23 < 0) {
                        while (var23 < 0) {
                            var23 += var31;
                            var24 += var35;
                            var35 += var28;
                            var8++;
                            var31 += var28;
                        }
                    }
                    if (var24 < 0) {
                        var24 += var35;
                        var23 += var31;
                        var35 += var28;
                        var8++;
                        var31 += var28;
                    }
                    var23 += -var36;
                    var24 += -var32;
                    var32 -= var27;
                    var9--;
                    var36 -= var27;
                    int var41 = arg0 - var9;
                    int var42 = arg0 + var9;
                    int var43 = arg4 + var8;
                    int var44 = arg4 - var8;
                    if (var40) {
                        int var45 = arg4 + var10;
                        int var46 = arg4 - var10;
                        class576.method4282(-7, var44, arg2, class529.field7682[var41], var46);
                        class576.method4282(-7, var46, arg7, class529.field7682[var41], var45);
                        class576.method4282(-7, var45, arg2, class529.field7682[var41], var43);
                        class576.method4282(-7, var44, arg2, class529.field7682[var42], var46);
                        class576.method4282(-7, var46, arg7, class529.field7682[var42], var45);
                        class576.method4282(-7, var45, arg2, class529.field7682[var42], var43);
                    } else {
                        class576.method4282(arg6 ^ 0x867E56F8, var44, arg2, class529.field7682[var41], var43);
                        class576.method4282(arg6 ^ 0x867E56F8, var44, arg2, class529.field7682[var42], var43);
                    }
                }
            }
        } catch (RuntimeException var48) {
            throw class665.method4799(var48, field4220[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIZIIIZ)V", line = 1627)
    public final void method2428(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        try {
            int var10 = arg3 - this.field4214;
            field4208++;
            int var11 = arg4 - this.field4196;
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method2426(var10, 128, (byte) 45, var11);
                    this.method2426(var10 - 1, 8, (byte) 45, var11);
                }
                if (arg1 == 1) {
                    this.method2426(var10, 2, (byte) 45, var11);
                    this.method2426(var10, 32, (byte) 45, var11 + 1);
                }
                if (arg1 == 2) {
                    this.method2426(var10, 8, (byte) 45, var11);
                    this.method2426(var10 + 1, 128, (byte) 45, var11);
                }
                if (arg1 == 3) {
                    this.method2426(var10, 32, (byte) 45, var11);
                    this.method2426(var10, 2, (byte) 45, var11 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method2426(var10, 1, (byte) 45, var11);
                    this.method2426(var10 - 1, 16, (byte) 45, var11 + 1);
                }
                if (arg1 == 1) {
                    this.method2426(var10, 4, (byte) 45, var11);
                    this.method2426(var10 + 1, 64, (byte) 45, var11 + 1);
                }
                if (arg1 == 2) {
                    this.method2426(var10, 16, (byte) 45, var11);
                    this.method2426(var10 + 1, 1, (byte) 45, var11 - 1);
                }
                if (arg1 == 3) {
                    this.method2426(var10, 64, (byte) 45, var11);
                    this.method2426(var10 - 1, 4, (byte) 45, var11 - 1);
                }
            }
            if (arg0 == arg5) {
                if (arg1 == 0) {
                    this.method2426(var10, 130, (byte) 45, var11);
                    this.method2426(var10 - 1, 8, (byte) 45, var11);
                    this.method2426(var10, 32, (byte) 45, var11 + 1);
                }
                if (arg1 == 1) {
                    this.method2426(var10, 10, (byte) 45, var11);
                    this.method2426(var10, 32, (byte) 45, var11 + 1);
                    this.method2426(var10 + 1, 128, (byte) 45, var11);
                }
                if (arg1 == 2) {
                    this.method2426(var10, 40, (byte) 45, var11);
                    this.method2426(var10 + 1, 128, (byte) 45, var11);
                    this.method2426(var10, 2, (byte) 45, var11 - 1);
                }
                if (arg1 == 3) {
                    this.method2426(var10, 160, (byte) 45, var11);
                    this.method2426(var10, 2, (byte) 45, var11 - 1);
                    this.method2426(var10 - 1, 8, (byte) 45, var11);
                }
            }
            if (arg2) {
                if (arg0 == 0) {
                    if (arg1 == 0) {
                        this.method2426(var10, 65536, (byte) 45, var11);
                        this.method2426(var10 - 1, 4096, (byte) 45, var11);
                    }
                    if (arg1 == 1) {
                        this.method2426(var10, 1024, (byte) 45, var11);
                        this.method2426(var10, 16384, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 2) {
                        this.method2426(var10, 4096, (byte) 45, var11);
                        this.method2426(var10 + 1, 65536, (byte) 45, var11);
                    }
                    if (arg1 == 3) {
                        this.method2426(var10, 16384, (byte) 45, var11);
                        this.method2426(var10, 1024, (byte) 45, var11 - 1);
                    }
                }
                if (arg0 == 1 || arg0 == 3) {
                    if (arg1 == 0) {
                        this.method2426(var10, 512, (byte) 45, var11);
                        this.method2426(var10 - 1, 8192, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 1) {
                        this.method2426(var10, 2048, (byte) 45, var11);
                        this.method2426(var10 + 1, 32768, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 2) {
                        this.method2426(var10, 8192, (byte) 45, var11);
                        this.method2426(var10 + 1, 512, (byte) 45, var11 - 1);
                    }
                    if (arg1 == 3) {
                        this.method2426(var10, 32768, (byte) 45, var11);
                        this.method2426(var10 - 1, 2048, (byte) 45, var11 - 1);
                    }
                }
                if (arg0 == 2) {
                    if (arg1 == 0) {
                        this.method2426(var10, 66560, (byte) 45, var11);
                        this.method2426(var10 - 1, 4096, (byte) 45, var11);
                        this.method2426(var10, 16384, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 1) {
                        this.method2426(var10, 5120, (byte) 45, var11);
                        this.method2426(var10, 16384, (byte) 45, var11 + 1);
                        this.method2426(var10 + 1, 65536, (byte) 45, var11);
                    }
                    if (arg1 == 2) {
                        this.method2426(var10, 20480, (byte) 45, var11);
                        this.method2426(var10 + 1, 65536, (byte) 45, var11);
                        this.method2426(var10, 1024, (byte) 45, var11 - 1);
                    }
                    if (arg1 == 3) {
                        this.method2426(var10, 81920, (byte) 45, var11);
                        this.method2426(var10, 1024, (byte) 45, var11 - 1);
                        this.method2426(var10 - 1, 4096, (byte) 45, var11);
                    }
                }
            }
            if (arg6) {
                if (arg0 == 0) {
                    if (arg1 == 0) {
                        this.method2426(var10, 536870912, (byte) 45, var11);
                        this.method2426(var10 - 1, 33554432, (byte) 45, var11);
                    }
                    if (arg1 == 1) {
                        this.method2426(var10, 8388608, (byte) 45, var11);
                        this.method2426(var10, 134217728, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 2) {
                        this.method2426(var10, 33554432, (byte) 45, var11);
                        this.method2426(var10 + 1, 536870912, (byte) 45, var11);
                    }
                    if (arg1 == 3) {
                        this.method2426(var10, 134217728, (byte) 45, var11);
                        this.method2426(var10, 8388608, (byte) 45, var11 - 1);
                    }
                }
                if (arg0 == 1 || arg0 == 3) {
                    if (arg1 == 0) {
                        this.method2426(var10, 4194304, (byte) 45, var11);
                        this.method2426(var10 - 1, 67108864, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 1) {
                        this.method2426(var10, 16777216, (byte) 45, var11);
                        this.method2426(var10 + 1, 268435456, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 2) {
                        this.method2426(var10, 67108864, (byte) 45, var11);
                        this.method2426(var10 + 1, 4194304, (byte) 45, var11 - 1);
                    }
                    if (arg1 == 3) {
                        this.method2426(var10, 268435456, (byte) 45, var11);
                        this.method2426(var10 - 1, 16777216, (byte) 45, var11 - 1);
                    }
                }
                if (arg0 == 2) {
                    if (arg1 == 0) {
                        this.method2426(var10, 545259520, (byte) 45, var11);
                        this.method2426(var10 - 1, 33554432, (byte) 45, var11);
                        this.method2426(var10, 134217728, (byte) 45, var11 + 1);
                    }
                    if (arg1 == 1) {
                        this.method2426(var10, 41943040, (byte) 45, var11);
                        this.method2426(var10, 134217728, (byte) 45, var11 + 1);
                        this.method2426(var10 + 1, 536870912, (byte) 45, var11);
                    }
                    if (arg1 == 2) {
                        this.method2426(var10, 167772160, (byte) 45, var11);
                        this.method2426(var10 + 1, 536870912, (byte) 45, var11);
                        this.method2426(var10, 8388608, (byte) 45, var11 - 1);
                    }
                    if (arg1 == 3) {
                        this.method2426(var10, 671088640, (byte) 45, var11);
                        this.method2426(var10, 8388608, (byte) 45, var11 - 1);
                        this.method2426(var10 - 1, 33554432, (byte) 45, var11);
                        return;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4220[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIZBZI)V", line = 1935)
    public final void method2429(int arg0, int arg1, int arg2, boolean arg3, byte arg4, boolean arg5, int arg6) {
        try {
            field4213++;
            int var8 = 256;
            if (arg4 >= -51) {
                method2418((byte) 92);
            }
            if (arg3) {
                var8 |= 0x20000;
            }
            if (arg5) {
                var8 |= 0x40000000;
            }
            int var13 = arg0 - this.field4196;
            int var14 = arg6 - this.field4214;
            for (int var9 = var14; var9 < (arg1 + var14); var9++) {
                if (var9 >= 0 && var9 < this.field4201) {
                    for (int var10 = var13; var10 < (var13 + arg2); var10++) {
                        if (var10 >= 0 && var10 < this.field4198) {
                            this.method2426(var9, var8, (byte) 45, var10);
                        }
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field4220[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZIIIIIII)Z", line = 1980)
    public final boolean method2430(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field4203++;
            if (arg6 == 1) {
                if (arg1 == arg5 && arg3 == arg7) {
                    return true;
                }
            } else if (arg1 <= arg5 && arg5 <= (arg1 + arg6 - 1) && arg7 <= arg7 && (arg7 + arg6 - 1) >= arg7) {
                return true;
            }
            int var13 = arg1 - this.field4214;
            int var15 = arg5 - this.field4214;
            int var16 = arg7 - this.field4196;
            if (arg0) {
                return true;
            }
            int var14 = arg3 - this.field4196;
            if (arg6 == 1) {
                if (arg4 == 6 || arg4 == 7) {
                    if (arg4 == 7) {
                        arg2 = arg2 + 2 & 0x3;
                    }
                    if (arg2 == 0) {
                        if ((var15 + 1) == var13 && var14 == var16 && (this.field4202[var13][var14] & 0x80) == 0) {
                            return true;
                        }
                        if (var13 == var15 && (var16 - 1) == var14 && (this.field4202[var13][var14] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 1) {
                        if ((var15 - 1) == var13 && var14 == var16 && (this.field4202[var13][var14] & 0x8) == 0) {
                            return true;
                        }
                        if (var13 == var15 && (var16 - 1) == var14 && (this.field4202[var13][var14] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 2) {
                        if (var15 - 1 == var13 && var14 == var16 && (this.field4202[var13][var14] & 0x8) == 0) {
                            return true;
                        }
                        if (var13 == var15 && (var16 + 1) == var14 && (this.field4202[var13][var14] & 0x20) == 0) {
                            return true;
                        }
                    } else if (arg2 == 3) {
                        if ((var15 + 1) == var13 && var14 == var16 && (this.field4202[var13][var14] & 0x80) == 0) {
                            return true;
                        }
                        if (var13 == var15 && var16 + 1 == var14 && (this.field4202[var13][var14] & 0x20) == 0) {
                            return true;
                        }
                    }
                }
                if (arg4 == 8) {
                    if (var13 == var15 && var16 + 1 == var14 && (this.field4202[var13][var14] & 0x20) == 0) {
                        return true;
                    }
                    if (var13 == var15 && var16 - 1 == var14 && (this.field4202[var13][var14] & 0x2) == 0) {
                        return true;
                    }
                    if (var15 - 1 == var13 && var14 == var16 && (this.field4202[var13][var14] & 0x8) == 0) {
                        return true;
                    }
                    if (var15 + 1 == var13 && var14 == var16 && (this.field4202[var13][var14] & 0x80) == 0) {
                        return true;
                    }
                }
            } else {
                int var9 = var13 + arg6 - 1;
                int var10 = var14 + arg6 - 1;
                if (arg4 == 6 || arg4 == 7) {
                    if (arg4 == 7) {
                        arg2 = arg2 + 2 & 0x3;
                    }
                    if (arg2 == 0) {
                        if (var15 + 1 == var13 && var14 <= var16 && var10 >= var16 && (this.field4202[var13][var16] & 0x80) == 0) {
                            return true;
                        }
                        if (var13 <= var15 && var15 <= var9 && (var16 - arg6) == var14 && (this.field4202[var15][var10] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 1) {
                        if (var15 - arg6 == var13 && var14 <= var16 && var16 <= var10 && (this.field4202[var9][var16] & 0x8) == 0) {
                            return true;
                        }
                        if (var15 >= var13 && var15 <= var9 && (var16 - arg6) == var14 && (this.field4202[var15][var10] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 2) {
                        if ((var15 - arg6) == var13 && var16 >= var14 && var10 >= var16 && (this.field4202[var9][var16] & 0x8) == 0) {
                            return true;
                        }
                        if (var13 <= var15 && var15 <= var9 && var16 + 1 == var14 && (this.field4202[var15][var14] & 0x20) == 0) {
                            return true;
                        }
                    } else if (arg2 == 3) {
                        if ((var15 + 1) == var13 && var14 <= var16 && var10 >= var16 && (this.field4202[var13][var16] & 0x80) == 0) {
                            return true;
                        }
                        if (var15 >= var13 && var15 <= var9 && var16 + 1 == var14 && (this.field4202[var15][var14] & 0x20) == 0) {
                            return true;
                        }
                    }
                }
                if (arg4 == 8) {
                    if (var13 <= var15 && var9 >= var15 && var16 + 1 == var14 && (this.field4202[var15][var14] & 0x20) == 0) {
                        return true;
                    }
                    if (var15 >= var13 && var9 >= var15 && var16 - arg6 == var14 && (this.field4202[var15][var10] & 0x2) == 0) {
                        return true;
                    }
                    if ((var15 - arg6) == var13 && var16 >= var14 && var16 <= var10 && (this.field4202[var9][var16] & 0x8) == 0) {
                        return true;
                    }
                    if ((var15 + 1) == var13 && var14 <= var16 && var16 <= var10 && (this.field4202[var13][var16] & 0x80) == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field4220[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIZIZI)V", line = 2177)
    public final void method2431(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        try {
            int var10 = arg2 - this.field4196;
            field4209++;
            int var11 = arg6 - this.field4214;
            if (arg4 != 134217728) {
                this.method2430(false, -100, 13, 41, -64, 38, 94, 105);
            }
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method2420(var11, var10, 128, 3);
                    this.method2420(var11 - 1, var10, 8, 3);
                }
                if (arg0 == 1) {
                    this.method2420(var11, var10, 2, 3);
                    this.method2420(var11, var10 + 1, 32, 3);
                }
                if (arg0 == 2) {
                    this.method2420(var11, var10, 8, 3);
                    this.method2420(var11 + 1, var10, 128, arg4 ^ 0x8000003);
                }
                if (arg0 == 3) {
                    this.method2420(var11, var10, 32, 3);
                    this.method2420(var11, var10 - 1, 2, 3);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method2420(var11, var10, 1, 3);
                    this.method2420(var11 - 1, var10 - -1, 16, 3);
                }
                if (arg0 == 1) {
                    this.method2420(var11, var10, 4, 3);
                    this.method2420(var11 + 1, var10 + 1, 64, 3);
                }
                if (arg0 == 2) {
                    this.method2420(var11, var10, 16, arg4 - 134217725);
                    this.method2420(var11 + 1, var10 + -1, 1, 3);
                }
                if (arg0 == 3) {
                    this.method2420(var11, var10, 64, arg4 - 134217725);
                    this.method2420(var11 - 1, var10 + -1, 4, 3);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method2420(var11, var10, 130, 3);
                    this.method2420(var11 - 1, var10, 8, arg4 ^ 0x8000003);
                    this.method2420(var11, var10 + 1, 32, 3);
                }
                if (arg0 == 1) {
                    this.method2420(var11, var10, 10, 3);
                    this.method2420(var11, var10 + 1, 32, 3);
                    this.method2420(var11 + 1, var10, 128, arg4 ^ 0x8000003);
                }
                if (arg0 == 2) {
                    this.method2420(var11, var10, 40, 3);
                    this.method2420(var11 + 1, var10, 128, arg4 - 134217725);
                    this.method2420(var11, var10 - 1, 2, arg4 ^ 0x8000003);
                }
                if (arg0 == 3) {
                    this.method2420(var11, var10, 160, 3);
                    this.method2420(var11, var10 - 1, 2, 3);
                    this.method2420(var11 - 1, var10, 8, 3);
                }
            }
            if (arg3) {
                if (arg1 == 0) {
                    if (arg0 == 0) {
                        this.method2420(var11, var10, 65536, 3);
                        this.method2420(var11 - 1, var10, 4096, arg4 ^ 0x8000003);
                    }
                    if (arg0 == 1) {
                        this.method2420(var11, var10, 1024, 3);
                        this.method2420(var11, var10 + 1, 16384, 3);
                    }
                    if (arg0 == 2) {
                        this.method2420(var11, var10, 4096, arg4 - 134217725);
                        this.method2420(var11 + 1, var10, 65536, arg4 ^ 0x8000003);
                    }
                    if (arg0 == 3) {
                        this.method2420(var11, var10, 16384, 3);
                        this.method2420(var11, var10 - 1, 1024, 3);
                    }
                }
                if (arg1 == 1 || arg1 == 3) {
                    if (arg0 == 0) {
                        this.method2420(var11, var10, 512, 3);
                        this.method2420(var11 - 1, var10 + 1, 8192, arg4 ^ 0x8000003);
                    }
                    if (arg0 == 1) {
                        this.method2420(var11, var10, 2048, 3);
                        this.method2420(var11 + 1, var10 + 1, 32768, 3);
                    }
                    if (arg0 == 2) {
                        this.method2420(var11, var10, 8192, 3);
                        this.method2420(var11 + 1, var10 + -1, 512, arg4 ^ 0x8000003);
                    }
                    if (arg0 == 3) {
                        this.method2420(var11, var10, 32768, 3);
                        this.method2420(var11 - 1, var10 + -1, 2048, 3);
                    }
                }
                if (arg1 == 2) {
                    if (arg0 == 0) {
                        this.method2420(var11, var10, 66560, arg4 - 134217725);
                        this.method2420(var11 - 1, var10, 4096, 3);
                        this.method2420(var11, var10 + 1, 16384, arg4 ^ 0x8000003);
                    }
                    if (arg0 == 1) {
                        this.method2420(var11, var10, 5120, 3);
                        this.method2420(var11, var10 + 1, 16384, 3);
                        this.method2420(var11 + 1, var10, 65536, 3);
                    }
                    if (arg0 == 2) {
                        this.method2420(var11, var10, 20480, arg4 ^ 0x8000003);
                        this.method2420(var11 + 1, var10, 65536, 3);
                        this.method2420(var11, var10 - 1, 1024, 3);
                    }
                    if (arg0 == 3) {
                        this.method2420(var11, var10, 81920, arg4 ^ 0x8000003);
                        this.method2420(var11, var10 - 1, 1024, 3);
                        this.method2420(var11 - 1, var10, 4096, 3);
                    }
                }
            }
            if (arg5) {
                if (arg1 == 0) {
                    if (arg0 == 0) {
                        this.method2420(var11, var10, 536870912, 3);
                        this.method2420(var11 - 1, var10, 33554432, 3);
                    }
                    if (arg0 == 1) {
                        this.method2420(var11, var10, 8388608, 3);
                        this.method2420(var11, var10 + 1, 134217728, 3);
                    }
                    if (arg0 == 2) {
                        this.method2420(var11, var10, 33554432, 3);
                        this.method2420(var11 + 1, var10, 536870912, arg4 - 134217725);
                    }
                    if (arg0 == 3) {
                        this.method2420(var11, var10, 134217728, 3);
                        this.method2420(var11, var10 - 1, 8388608, 3);
                    }
                }
                if (arg1 == 1 || arg1 == 3) {
                    if (arg0 == 0) {
                        this.method2420(var11, var10, 4194304, 3);
                        this.method2420(var11 - 1, var10 - -1, 67108864, 3);
                    }
                    if (arg0 == 1) {
                        this.method2420(var11, var10, 16777216, 3);
                        this.method2420(var11 + 1, var10 - -1, 268435456, 3);
                    }
                    if (arg0 == 2) {
                        this.method2420(var11, var10, 67108864, 3);
                        this.method2420(var11 + 1, var10 + -1, 4194304, 3);
                    }
                    if (arg0 == 3) {
                        this.method2420(var11, var10, 268435456, 3);
                        this.method2420(var11 - 1, var10 - 1, 16777216, 3);
                    }
                }
                if (arg1 == 2) {
                    if (arg0 == 0) {
                        this.method2420(var11, var10, 545259520, 3);
                        this.method2420(var11 - 1, var10, 33554432, arg4 - 134217725);
                        this.method2420(var11, var10 + 1, 134217728, 3);
                    }
                    if (arg0 == 1) {
                        this.method2420(var11, var10, 41943040, arg4 - 134217725);
                        this.method2420(var11, var10 + 1, 134217728, 3);
                        this.method2420(var11 + 1, var10, 536870912, 3);
                    }
                    if (arg0 == 2) {
                        this.method2420(var11, var10, 167772160, 3);
                        this.method2420(var11 + 1, var10, 536870912, 3);
                        this.method2420(var11, var10 - 1, 8388608, 3);
                    }
                    if (arg0 == 3) {
                        this.method2420(var11, var10, 671088640, 3);
                        this.method2420(var11, var10 - 1, 8388608, arg4 ^ 0x8000003);
                        this.method2420(var11 - 1, var10, 33554432, 3);
                        return;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4220[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)V", line = 2486)
    public final void method2432(boolean arg0) {
        try {
            for (int var2 = 0; var2 < this.field4201; var2++) {
                for (int var3 = 0; var3 < this.field4198; var3++) {
                    if (var2 == 0 || var3 == 0 || this.field4201 - 5 <= var2 || this.field4198 - 5 <= var3) {
                        this.field4202[var2][var3] = -1;
                    } else {
                        this.field4202[var2][var3] = 2097152;
                    }
                }
            }
            if (!arg0) {
                this.method2431(111, 119, -3, true, -124, true, -53);
            }
            field4200++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4220[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2433(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2434(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
