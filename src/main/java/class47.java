import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class47 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lrh;")
    private static class161 field861 = new class161();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lrh;)B")
    private static final byte method293(class161 arg0) {
        return (byte) method299(1, arg0);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lrh;)V")
    private static final void method294(class161 arg0) {
        byte var1 = arg0.field3074;
        int var2 = arg0.field3069;
        int var3 = arg0.field3071;
        int var4 = arg0.field3067;
        int[] var5 = class176.field3434;
        int var6 = arg0.field3073;
        byte[] var7 = arg0.field3066;
        int var8 = arg0.field3075;
        int var9 = arg0.field3059;
        int var10 = var9;
        int var11 = arg0.field3061 + 1;
        label63: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label63;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label63;
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
                    break label63;
                }
                var1 = (byte) var4;
                int var21 = var5[var6];
                byte var22 = (byte) (var21 & 0xFF);
                var6 = var21 >> 8;
                var3++;
                if (var4 != var22) {
                    var4 = var22;
                    if (var9 == 0) {
                        var2 = 1;
                        break label63;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label63;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                }
            }
            var2 = 2;
            int var13 = var5[var6];
            byte var14 = (byte) (var13 & 0xFF);
            var6 = var13 >> 8;
            var3++;
            if (var3 != var11) {
                if (var4 == var14) {
                    var2 = 3;
                    int var15 = var5[var6];
                    byte var16 = (byte) (var15 & 0xFF);
                    var6 = var15 >> 8;
                    var3++;
                    if (var3 != var11) {
                        if (var4 == var16) {
                            int var17 = var5[var6];
                            byte var18 = (byte) (var17 & 0xFF);
                            int var19 = var17 >> 8;
                            var3++;
                            var2 = (var18 & 0xFF) + 4;
                            int var20 = var5[var19];
                            var4 = (byte) (var20 & 0xFF);
                            var6 = var20 >> 8;
                            var3++;
                        } else {
                            var4 = var16;
                        }
                    }
                } else {
                    var4 = var14;
                }
            }
        }
        int var23 = arg0.field3085;
        arg0.field3085 += var10 - var9;
        arg0.field3074 = var1;
        arg0.field3069 = var2;
        arg0.field3071 = var3;
        arg0.field3067 = var4;
        class176.field3434 = var5;
        arg0.field3073 = var6;
        arg0.field3066 = var7;
        arg0.field3075 = var8;
        arg0.field3059 = var9;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BI[BII)I")
    public static final int method295(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class161 var5 = field861;
        synchronized (field861) {
            field861.field3093 = arg2;
            field861.field3058 = arg4;
            field861.field3066 = arg0;
            field861.field3075 = 0;
            field861.field3059 = arg1;
            field861.field3090 = 0;
            field861.field3083 = 0;
            field861.field3064 = 0;
            field861.field3085 = 0;
            method296(field861);
            int var6 = arg1 - field861.field3059;
            field861.field3093 = null;
            field861.field3066 = null;
            return var6;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Lrh;)V")
    private static final void method296(class161 arg0) {
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
        arg0.field3091 = 1;
        if (class176.field3434 == null) {
            class176.field3434 = new int[arg0.field3091 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method300(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method300(arg0);
                byte var26 = method300(arg0);
                byte var27 = method300(arg0);
                byte var28 = method300(arg0);
                byte var29 = method300(arg0);
                byte var30 = method300(arg0);
                byte var31 = method300(arg0);
                byte var32 = method300(arg0);
                byte var33 = method300(arg0);
                byte var34 = method293(arg0);
                arg0.field3079 = 0;
                byte var35 = method300(arg0);
                arg0.field3079 = arg0.field3079 << 8 | var35 & 0xFF;
                byte var36 = method300(arg0);
                arg0.field3079 = arg0.field3079 << 8 | var36 & 0xFF;
                byte var37 = method300(arg0);
                arg0.field3079 = arg0.field3079 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var101 = method293(arg0);
                    if (var101 == 1) {
                        arg0.field3062[var38] = true;
                    } else {
                        arg0.field3062[var38] = false;
                    }
                }
                for (int var39 = 0; var39 < 256; var39++) {
                    arg0.field3088[var39] = false;
                }
                for (int var40 = 0; var40 < 16; var40++) {
                    if (arg0.field3062[var40]) {
                        for (int var99 = 0; var99 < 16; var99++) {
                            byte var100 = method293(arg0);
                            if (var100 == 1) {
                                arg0.field3088[var40 * 16 + var99] = true;
                            }
                        }
                    }
                }
                method301(arg0);
                int var41 = arg0.field3078 + 2;
                int var42 = method299(3, arg0);
                int var43 = method299(15, arg0);
                for (int var44 = 0; var44 < var43; var44++) {
                    int var97 = 0;
                    while (true) {
                        byte var98 = method293(arg0);
                        if (var98 == 0) {
                            arg0.field3065[var44] = (byte) var97;
                            break;
                        }
                        var97++;
                    }
                }
                byte[] var45 = new byte[6];
                byte var46 = 0;
                while (var46 < var42) {
                    var45[var46] = var46++;
                }
                for (int var47 = 0; var47 < var43; var47++) {
                    byte var95 = arg0.field3065[var47];
                    byte var96 = var45[var95];
                    while (var95 > 0) {
                        var45[var95] = var45[var95 - 1];
                        var95--;
                    }
                    var45[0] = var96;
                    arg0.field3082[var47] = var96;
                }
                for (int var48 = 0; var48 < var42; var48++) {
                    int var91 = method299(5, arg0);
                    for (int var92 = 0; var92 < var41; var92++) {
                        while (true) {
                            byte var93 = method293(arg0);
                            if (var93 == 0) {
                                arg0.field3072[var48][var92] = (byte) var91;
                                break;
                            }
                            byte var94 = method293(arg0);
                            if (var94 == 0) {
                                var91++;
                            } else {
                                var91--;
                            }
                        }
                    }
                }
                for (int var49 = 0; var49 < var42; var49++) {
                    byte var88 = 32;
                    byte var89 = 0;
                    for (int var90 = 0; var90 < var41; var90++) {
                        if (arg0.field3072[var49][var90] > var89) {
                            var89 = arg0.field3072[var49][var90];
                        }
                        if (arg0.field3072[var49][var90] < var88) {
                            var88 = arg0.field3072[var49][var90];
                        }
                    }
                    method298(arg0.field3092[var49], arg0.field3060[var49], arg0.field3077[var49], arg0.field3072[var49], var88, var89, var41);
                    arg0.field3070[var49] = var88;
                }
                int var50 = arg0.field3078 + 1;
                int var51 = -1;
                byte var52 = 0;
                for (int var53 = 0; var53 <= 255; var53++) {
                    arg0.field3084[var53] = 0;
                }
                int var54 = 4095;
                for (int var55 = 15; var55 >= 0; var55--) {
                    for (int var87 = 15; var87 >= 0; var87--) {
                        arg0.field3068[var54] = (byte) (var55 * 16 + var87);
                        var54--;
                    }
                    arg0.field3087[var55] = var54 + 1;
                }
                int var56 = 0;
                if (var52 == 0) {
                    var51++;
                    var52 = 50;
                    byte var57 = arg0.field3082[var51];
                    var19 = arg0.field3070[var57];
                    var20 = arg0.field3092[var57];
                    var22 = arg0.field3077[var57];
                    var21 = arg0.field3060[var57];
                }
                int var102 = var52 - 1;
                int var58 = var19;
                int var59;
                byte var60;
                for (var59 = method299(var19, arg0); var59 > var20[var58]; var59 = var59 << 1 | var60) {
                    var58++;
                    var60 = method293(arg0);
                }
                int var61 = var22[var59 - var21[var58]];
                while (true) {
                    while (var50 != var61) {
                        if (var61 == 0 || var61 == 1) {
                            int var76 = -1;
                            int var77 = 1;
                            do {
                                if (var61 == 0) {
                                    var76 += var77;
                                } else if (var61 == 1) {
                                    var76 += var77 * 2;
                                }
                                var77 *= 2;
                                if (var102 == 0) {
                                    var51++;
                                    var102 = 50;
                                    byte var78 = arg0.field3082[var51];
                                    var19 = arg0.field3070[var78];
                                    var20 = arg0.field3092[var78];
                                    var22 = arg0.field3077[var78];
                                    var21 = arg0.field3060[var78];
                                }
                                var102--;
                                int var79 = var19;
                                int var80;
                                byte var81;
                                for (var80 = method299(var19, arg0); var80 > var20[var79]; var80 = var80 << 1 | var81) {
                                    var79++;
                                    var81 = method293(arg0);
                                }
                                var61 = var22[var80 - var21[var79]];
                            } while (var61 == 0 || var61 == 1);
                            var76++;
                            byte var82 = arg0.field3089[arg0.field3068[arg0.field3087[0]] & 0xFF];
                            arg0.field3084[var82 & 0xFF] += var76;
                            while (var76 > 0) {
                                class176.field3434[var56] = var82 & 0xFF;
                                var56++;
                                var76--;
                            }
                        } else {
                            int var62 = var61 - 1;
                            byte var64;
                            if (var62 < 16) {
                                int var63 = arg0.field3087[0];
                                var64 = arg0.field3068[var62 + var63];
                                while (var62 > 3) {
                                    int var65 = var62 + var63;
                                    arg0.field3068[var65] = arg0.field3068[var65 - 1];
                                    arg0.field3068[var65 - 1] = arg0.field3068[var65 - 2];
                                    arg0.field3068[var65 - 2] = arg0.field3068[var65 - 3];
                                    arg0.field3068[var65 - 3] = arg0.field3068[var65 - 4];
                                    var62 -= 4;
                                }
                                while (var62 > 0) {
                                    arg0.field3068[var62 + var63] = arg0.field3068[var62 + var63 - 1];
                                    var62--;
                                }
                                arg0.field3068[var63] = var64;
                            } else {
                                int var66 = var62 / 16;
                                int var67 = var62 % 16;
                                int var68 = arg0.field3087[var66] + var67;
                                var64 = arg0.field3068[var68];
                                while (var68 > arg0.field3087[var66]) {
                                    arg0.field3068[var68] = arg0.field3068[var68 - 1];
                                    var68--;
                                }
                                int var10002 = arg0.field3087[var66]++;
                                while (var66 > 0) {
                                    var10002 = arg0.field3087[var66]--;
                                    arg0.field3068[arg0.field3087[var66]] = arg0.field3068[arg0.field3087[var66 - 1] + 16 - 1];
                                    var66--;
                                }
                                var10002 = arg0.field3087[0]--;
                                arg0.field3068[arg0.field3087[0]] = var64;
                                if (arg0.field3087[0] == 0) {
                                    int var69 = 4095;
                                    for (int var70 = 15; var70 >= 0; var70--) {
                                        for (int var71 = 15; var71 >= 0; var71--) {
                                            arg0.field3068[var69] = arg0.field3068[arg0.field3087[var70] + var71];
                                            var69--;
                                        }
                                        arg0.field3087[var70] = var69 + 1;
                                    }
                                }
                            }
                            arg0.field3084[arg0.field3089[var64 & 0xFF] & 0xFF]++;
                            class176.field3434[var56] = arg0.field3089[var64 & 0xFF] & 0xFF;
                            var56++;
                            if (var102 == 0) {
                                var51++;
                                var102 = 50;
                                byte var72 = arg0.field3082[var51];
                                var19 = arg0.field3070[var72];
                                var20 = arg0.field3092[var72];
                                var22 = arg0.field3077[var72];
                                var21 = arg0.field3060[var72];
                            }
                            var102--;
                            int var73 = var19;
                            int var74;
                            byte var75;
                            for (var74 = method299(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var75) {
                                var73++;
                                var75 = method293(arg0);
                            }
                            var61 = var22[var74 - var21[var73]];
                        }
                    }
                    arg0.field3069 = 0;
                    arg0.field3074 = 0;
                    arg0.field3063[0] = 0;
                    for (int var83 = 1; var83 <= 256; var83++) {
                        arg0.field3063[var83] = arg0.field3084[var83 - 1];
                    }
                    for (int var84 = 1; var84 <= 256; var84++) {
                        arg0.field3063[var84] += arg0.field3063[var84 - 1];
                    }
                    for (int var85 = 0; var85 < var56; var85++) {
                        byte var86 = (byte) (class176.field3434[var85] & 0xFF);
                        class176.field3434[arg0.field3063[var86 & 0xFF]] |= var85 << 8;
                        arg0.field3063[var86 & 0xFF]++;
                    }
                    arg0.field3073 = class176.field3434[arg0.field3079] >> 8;
                    arg0.field3071 = 0;
                    arg0.field3073 = class176.field3434[arg0.field3073];
                    arg0.field3067 = (byte) (arg0.field3073 & 0xFF);
                    arg0.field3073 >>= 0x8;
                    arg0.field3071++;
                    arg0.field3061 = var56;
                    method294(arg0);
                    if (arg0.field3061 + 1 == arg0.field3071 && arg0.field3069 == 0) {
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    public static void method297() {
        field861 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([I[I[I[BIII)V")
    private static final void method298(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        for (int var8 = arg4; var8 <= arg5; var8++) {
            for (int var17 = 0; var17 < arg6; var17++) {
                if (arg3[var17] == var8) {
                    arg2[var7] = var17;
                    var7++;
                }
            }
        }
        for (int var9 = 0; var9 < 23; var9++) {
            arg1[var9] = 0;
        }
        for (int var10 = 0; var10 < arg6; var10++) {
            arg1[arg3[var10] + 1]++;
        }
        for (int var11 = 1; var11 < 23; var11++) {
            arg1[var11] += arg1[var11 - 1];
        }
        for (int var12 = 0; var12 < 23; var12++) {
            arg0[var12] = 0;
        }
        int var13 = 0;
        for (int var14 = arg4; var14 <= arg5; var14++) {
            int var16 = arg1[var14 + 1] + var13 - arg1[var14];
            arg0[var14] = var16 - 1;
            var13 = var16 << 1;
        }
        for (int var15 = arg4 + 1; var15 <= arg5; var15++) {
            arg1[var15] = (arg0[var15 - 1] + 1 << 1) - arg1[var15];
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILrh;)I")
    private static final int method299(int arg0, class161 arg1) {
        while (arg1.field3090 < arg0) {
            arg1.field3083 = arg1.field3083 << 8 | arg1.field3093[arg1.field3058] & 0xFF;
            arg1.field3090 += 8;
            arg1.field3058++;
            arg1.field3064++;
        }
        int var2 = arg1.field3083 >> arg1.field3090 - arg0 & (0x1 << arg0) - 1;
        arg1.field3090 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(Lrh;)B")
    private static final byte method300(class161 arg0) {
        return (byte) method299(8, arg0);
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(Lrh;)V")
    private static final void method301(class161 arg0) {
        arg0.field3078 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field3088[var1]) {
                arg0.field3089[arg0.field3078] = (byte) var1;
                arg0.field3078++;
            }
        }
    }
}
