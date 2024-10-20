package deob;

@ObfuscatedName("du")
public final class class121 {

    @ObfuscatedName("du.l")
    public static class114 field2038 = new class114();

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.i([BI[BII)I")
    public static int method2377(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class114 var5 = field2038;
        synchronized (field2038) {
            field2038.field1998 = arg2;
            field2038.field1996 = arg4;
            field2038.field1975 = arg0;
            field2038.field1993 = 0;
            field2038.field1972 = arg1;
            field2038.field1977 = 0;
            field2038.field1976 = 0;
            field2038.field1961 = 0;
            field2038.field1973 = 0;
            method2356(field2038);
            int var6 = arg1 - field2038.field1972;
            field2038.field1998 = null;
            field2038.field1975 = null;
            return var6;
        }
    }

    @ObfuscatedName("du.h(Ldg;)V")
    public static void method2355(class114 arg0) {
        byte var1 = arg0.field1974;
        int var2 = arg0.field1997;
        int var3 = arg0.field1983;
        int var4 = arg0.field1981;
        int[] var5 = Statics.field3269;
        int var6 = arg0.field1980;
        byte[] var7 = arg0.field1975;
        int var8 = arg0.field1993;
        int var9 = arg0.field1972;
        int var10 = var9;
        int var11 = arg0.field1968 + 1;
        label66: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label66;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label66;
                        }
                        var7[var8] = var1;
                        var8++;
                        var9--;
                        break;
                    }
                    var7[var8] = var1;
                    var2--;
                    var8++;
                    var9--;
                }
            }
            boolean var12 = true;
            while (var12) {
                var12 = false;
                if (var3 == var11) {
                    var2 = 0;
                    break label66;
                }
                var1 = (byte) var4;
                int var13 = var5[var6];
                byte var14 = (byte) (var13 & 0xFF);
                var6 = var13 >> 8;
                var3++;
                if (var4 != var14) {
                    var4 = var14;
                    if (var9 == 0) {
                        var2 = 1;
                        break label66;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label66;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                }
            }
            var2 = 2;
            int var16 = var5[var6];
            byte var17 = (byte) (var16 & 0xFF);
            var6 = var16 >> 8;
            var3++;
            if (var3 != var11) {
                if (var4 == var17) {
                    var2 = 3;
                    int var18 = var5[var6];
                    byte var19 = (byte) (var18 & 0xFF);
                    var6 = var18 >> 8;
                    var3++;
                    if (var3 != var11) {
                        if (var4 == var19) {
                            int var20 = var5[var6];
                            byte var21 = (byte) (var20 & 0xFF);
                            int var22 = var20 >> 8;
                            var3++;
                            var2 = (var21 & 0xFF) + 4;
                            int var23 = var5[var22];
                            var4 = (byte) (var23 & 0xFF);
                            var6 = var23 >> 8;
                            var3++;
                        } else {
                            var4 = var19;
                        }
                    }
                } else {
                    var4 = var17;
                }
            }
        }
        int var15 = arg0.field1973;
        arg0.field1973 += var10 - var9;
        if (arg0.field1973 < var15) {
        }
        arg0.field1974 = var1;
        arg0.field1997 = var2;
        arg0.field1983 = var3;
        arg0.field1981 = var4;
        Statics.field3269 = var5;
        arg0.field1980 = var6;
        arg0.field1975 = var7;
        arg0.field1993 = var8;
        arg0.field1972 = var9;
    }

    @ObfuscatedName("du.e(Ldg;)V")
    public static void method2356(class114 arg0) {
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        arg0.field1978 = 1;
        if (Statics.field3269 == null) {
            Statics.field3269 = new int[arg0.field1978 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method2376(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method2376(arg0);
                byte var26 = method2376(arg0);
                byte var27 = method2376(arg0);
                byte var28 = method2376(arg0);
                byte var29 = method2376(arg0);
                byte var30 = method2376(arg0);
                byte var31 = method2376(arg0);
                byte var32 = method2376(arg0);
                byte var33 = method2376(arg0);
                byte var34 = method2357(arg0);
                if (var34 != 0) {
                }
                arg0.field1987 = 0;
                byte var35 = method2376(arg0);
                arg0.field1987 = arg0.field1987 << 8 | var35 & 0xFF;
                byte var36 = method2376(arg0);
                arg0.field1987 = arg0.field1987 << 8 | var36 & 0xFF;
                byte var37 = method2376(arg0);
                arg0.field1987 = arg0.field1987 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var39 = method2357(arg0);
                    if (var39 == 1) {
                        arg0.field1999[var38] = true;
                    } else {
                        arg0.field1999[var38] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field1986[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field1999[var41]) {
                        for (int var42 = 0; var42 < 16; var42++) {
                            byte var43 = method2357(arg0);
                            if (var43 == 1) {
                                arg0.field1986[var41 * 16 + var42] = true;
                            }
                        }
                    }
                }
                method2359(arg0);
                int var44 = arg0.field1989 + 2;
                int var45 = method2358(3, arg0);
                int var46 = method2358(15, arg0);
                for (int var47 = 0; var47 < var46; var47++) {
                    int var48 = 0;
                    while (true) {
                        byte var49 = method2357(arg0);
                        if (var49 == 0) {
                            arg0.field1992[var47] = (byte) var48;
                            break;
                        }
                        var48++;
                    }
                }
                byte[] var50 = new byte[6];
                byte var51 = 0;
                while (var51 < var45) {
                    var50[var51] = var51++;
                }
                for (int var52 = 0; var52 < var46; var52++) {
                    byte var53 = arg0.field1992[var52];
                    byte var54 = var50[var53];
                    while (var53 > 0) {
                        var50[var53] = var50[var53 - 1];
                        var53--;
                    }
                    var50[0] = var54;
                    arg0.field1991[var52] = var54;
                }
                for (int var55 = 0; var55 < var45; var55++) {
                    int var56 = method2358(5, arg0);
                    for (int var57 = 0; var57 < var44; var57++) {
                        while (true) {
                            byte var58 = method2357(arg0);
                            if (var58 == 0) {
                                arg0.field1969[var55][var57] = (byte) var56;
                                break;
                            }
                            byte var59 = method2357(arg0);
                            if (var59 == 0) {
                                var56++;
                            } else {
                                var56--;
                            }
                        }
                    }
                }
                for (int var60 = 0; var60 < var45; var60++) {
                    byte var61 = 32;
                    byte var62 = 0;
                    for (int var63 = 0; var63 < var44; var63++) {
                        if (arg0.field1969[var60][var63] > var62) {
                            var62 = arg0.field1969[var60][var63];
                        }
                        if (arg0.field1969[var60][var63] < var61) {
                            var61 = arg0.field1969[var60][var63];
                        }
                    }
                    method2353(arg0.field1994[var60], arg0.field1995[var60], arg0.field1990[var60], arg0.field1969[var60], var61, var62, var44);
                    arg0.field1967[var60] = var61;
                }
                int var64 = arg0.field1989 + 1;
                int var65 = -1;
                byte var66 = 0;
                for (int var67 = 0; var67 <= 255; var67++) {
                    arg0.field1982[var67] = 0;
                }
                int var68 = 4095;
                for (int var69 = 15; var69 >= 0; var69--) {
                    for (int var70 = 15; var70 >= 0; var70--) {
                        arg0.field1970[var68] = (byte) (var69 * 16 + var70);
                        var68--;
                    }
                    arg0.field1971[var69] = var68 + 1;
                }
                int var71 = 0;
                if (var66 == 0) {
                    var65++;
                    var66 = 50;
                    byte var72 = arg0.field1991[var65];
                    var19 = arg0.field1967[var72];
                    var20 = arg0.field1994[var72];
                    var22 = arg0.field1990[var72];
                    var21 = arg0.field1995[var72];
                }
                int var103 = var66 - 1;
                int var73 = var19;
                int var74;
                byte var102;
                for (var74 = method2358(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var102) {
                    var73++;
                    var102 = method2357(arg0);
                }
                int var75 = var22[var74 - var21[var73]];
                while (true) {
                    while (var64 != var75) {
                        if (var75 == 0 || var75 == 1) {
                            int var95 = -1;
                            int var96 = 1;
                            do {
                                if (var75 == 0) {
                                    var95 += var96;
                                } else if (var75 == 1) {
                                    var95 += var96 * 2;
                                }
                                var96 *= 2;
                                if (var103 == 0) {
                                    var65++;
                                    var103 = 50;
                                    byte var97 = arg0.field1991[var65];
                                    var19 = arg0.field1967[var97];
                                    var20 = arg0.field1994[var97];
                                    var22 = arg0.field1990[var97];
                                    var21 = arg0.field1995[var97];
                                }
                                var103--;
                                int var98 = var19;
                                int var99;
                                byte var101;
                                for (var99 = method2358(var19, arg0); var99 > var20[var98]; var99 = var99 << 1 | var101) {
                                    var98++;
                                    var101 = method2357(arg0);
                                }
                                var75 = var22[var99 - var21[var98]];
                            } while (var75 == 0 || var75 == 1);
                            var95++;
                            byte var100 = arg0.field1988[arg0.field1970[arg0.field1971[0]] & 0xFF];
                            arg0.field1982[var100 & 0xFF] += var95;
                            while (var95 > 0) {
                                Statics.field3269[var71] = var100 & 0xFF;
                                var71++;
                                var95--;
                            }
                        } else {
                            int var81 = var75 - 1;
                            byte var83;
                            if (var81 < 16) {
                                int var82 = arg0.field1971[0];
                                var83 = arg0.field1970[var81 + var82];
                                while (var81 > 3) {
                                    int var84 = var81 + var82;
                                    arg0.field1970[var84] = arg0.field1970[var84 - 1];
                                    arg0.field1970[var84 - 1] = arg0.field1970[var84 - 2];
                                    arg0.field1970[var84 - 2] = arg0.field1970[var84 - 3];
                                    arg0.field1970[var84 - 3] = arg0.field1970[var84 - 4];
                                    var81 -= 4;
                                }
                                while (var81 > 0) {
                                    arg0.field1970[var81 + var82] = arg0.field1970[var81 + var82 - 1];
                                    var81--;
                                }
                                arg0.field1970[var82] = var83;
                            } else {
                                int var85 = var81 / 16;
                                int var86 = var81 % 16;
                                int var87 = arg0.field1971[var85] + var86;
                                var83 = arg0.field1970[var87];
                                while (var87 > arg0.field1971[var85]) {
                                    arg0.field1970[var87] = arg0.field1970[var87 - 1];
                                    var87--;
                                }
                                int var10002 = arg0.field1971[var85]++;
                                while (var85 > 0) {
                                    var10002 = arg0.field1971[var85]--;
                                    arg0.field1970[arg0.field1971[var85]] = arg0.field1970[arg0.field1971[var85 - 1] + 16 - 1];
                                    var85--;
                                }
                                var10002 = arg0.field1971[0]--;
                                arg0.field1970[arg0.field1971[0]] = var83;
                                if (arg0.field1971[0] == 0) {
                                    int var88 = 4095;
                                    for (int var89 = 15; var89 >= 0; var89--) {
                                        for (int var90 = 15; var90 >= 0; var90--) {
                                            arg0.field1970[var88] = arg0.field1970[arg0.field1971[var89] + var90];
                                            var88--;
                                        }
                                        arg0.field1971[var89] = var88 + 1;
                                    }
                                }
                            }
                            arg0.field1982[arg0.field1988[var83 & 0xFF] & 0xFF]++;
                            Statics.field3269[var71] = arg0.field1988[var83 & 0xFF] & 0xFF;
                            var71++;
                            if (var103 == 0) {
                                var65++;
                                var103 = 50;
                                byte var91 = arg0.field1991[var65];
                                var19 = arg0.field1967[var91];
                                var20 = arg0.field1994[var91];
                                var22 = arg0.field1990[var91];
                                var21 = arg0.field1995[var91];
                            }
                            var103--;
                            int var92 = var19;
                            int var93;
                            byte var94;
                            for (var93 = method2358(var19, arg0); var93 > var20[var92]; var93 = var93 << 1 | var94) {
                                var92++;
                                var94 = method2357(arg0);
                            }
                            var75 = var22[var93 - var21[var92]];
                        }
                    }
                    arg0.field1997 = 0;
                    arg0.field1974 = 0;
                    arg0.field1984[0] = 0;
                    for (int var76 = 1; var76 <= 256; var76++) {
                        arg0.field1984[var76] = arg0.field1982[var76 - 1];
                    }
                    for (int var77 = 1; var77 <= 256; var77++) {
                        arg0.field1984[var77] += arg0.field1984[var77 - 1];
                    }
                    for (int var78 = 0; var78 < var71; var78++) {
                        byte var79 = (byte) (Statics.field3269[var78] & 0xFF);
                        Statics.field3269[arg0.field1984[var79 & 0xFF]] |= var78 << 8;
                        arg0.field1984[var79 & 0xFF]++;
                    }
                    arg0.field1980 = Statics.field3269[arg0.field1987] >> 8;
                    arg0.field1983 = 0;
                    arg0.field1980 = Statics.field3269[arg0.field1980];
                    arg0.field1981 = (byte) (arg0.field1980 & 0xFF);
                    arg0.field1980 >>= 0x8;
                    arg0.field1983++;
                    arg0.field1968 = var71;
                    method2355(arg0);
                    if (arg0.field1983 == arg0.field1968 + 1 && arg0.field1997 == 0) {
                        var23 = true;
                        break;
                    }
                    var23 = false;
                    break;
                }
            }
            return;
        }
    }

    @ObfuscatedName("du.g(Ldg;)B")
    public static byte method2376(class114 arg0) {
        return (byte) method2358(8, arg0);
    }

    @ObfuscatedName("du.n(Ldg;)B")
    public static byte method2357(class114 arg0) {
        return (byte) method2358(1, arg0);
    }

    @ObfuscatedName("du.u(ILdg;)I")
    public static int method2358(int arg0, class114 arg1) {
        while (arg1.field1977 < arg0) {
            arg1.field1976 = arg1.field1976 << 8 | arg1.field1998[arg1.field1996] & 0xFF;
            arg1.field1977 += 8;
            arg1.field1996++;
            arg1.field1961++;
            if (arg1.field1961 == 0) {
            }
        }
        int var2 = arg1.field1976 >> arg1.field1977 - arg0 & (0x1 << arg0) - 1;
        arg1.field1977 -= arg0;
        return var2;
    }

    @ObfuscatedName("du.d(Ldg;)V")
    public static void method2359(class114 arg0) {
        arg0.field1989 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field1986[var1]) {
                arg0.field1988[arg0.field1989] = (byte) var1;
                arg0.field1989++;
            }
        }
    }

    @ObfuscatedName("du.l([I[I[I[BIII)V")
    public static void method2353(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        for (int var8 = arg4; var8 <= arg5; var8++) {
            for (int var9 = 0; var9 < arg6; var9++) {
                if (arg3[var9] == var8) {
                    arg2[var7] = var9;
                    var7++;
                }
            }
        }
        for (int var10 = 0; var10 < 23; var10++) {
            arg1[var10] = 0;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            arg1[arg3[var11] + 1]++;
        }
        for (int var12 = 1; var12 < 23; var12++) {
            arg1[var12] += arg1[var12 - 1];
        }
        for (int var13 = 0; var13 < 23; var13++) {
            arg0[var13] = 0;
        }
        int var14 = 0;
        for (int var15 = arg4; var15 <= arg5; var15++) {
            int var16 = arg1[var15 + 1] - arg1[var15] + var14;
            arg0[var15] = var16 - 1;
            var14 = var16 << 1;
        }
        for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
            arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
        }
    }
}
