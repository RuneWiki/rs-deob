import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lf;")
    private static class10 field276 = new class10();

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([BI[BII)I", line = 3)
    public static final int method123(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class10 var5 = field276;
        synchronized (field276) {
            field276.field170 = arg2;
            field276.field152 = arg4;
            field276.field179 = arg0;
            field276.field178 = 0;
            field276.field172 = arg1;
            field276.field161 = 0;
            field276.field144 = 0;
            field276.field157 = 0;
            field276.field163 = 0;
            method129(field276);
            int var6 = arg1 - field276.field172;
            field276.field170 = null;
            field276.field179 = null;
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Lf;)V", line = 39)
    private static final void method124(class10 arg0) {
        byte var1 = arg0.field147;
        int var2 = arg0.field145;
        int var3 = arg0.field151;
        int var4 = arg0.field146;
        int[] var5 = class31.field344;
        int var6 = arg0.field154;
        byte[] var7 = arg0.field179;
        int var8 = arg0.field178;
        int var9 = arg0.field172;
        int var10 = var9;
        int var11 = arg0.field180 + 1;
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
        int var15 = arg0.field163;
        arg0.field163 += var10 - var9;
        if (arg0.field163 < var15) {
        }
        arg0.field147 = var1;
        arg0.field145 = var2;
        arg0.field151 = var3;
        arg0.field146 = var4;
        class31.field344 = var5;
        arg0.field154 = var6;
        arg0.field179 = var7;
        arg0.field178 = var8;
        arg0.field172 = var9;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILf;)I", line = 207)
    private static final int method125(int arg0, class10 arg1) {
        while (arg1.field161 < arg0) {
            arg1.field144 = arg1.field144 << 8 | arg1.field170[arg1.field152] & 0xFF;
            arg1.field161 += 8;
            arg1.field152++;
            arg1.field157++;
            if (arg1.field157 == 0) {
            }
        }
        int var2 = arg1.field144 >> arg1.field161 - arg0 & (0x1 << arg0) - 1;
        arg1.field161 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(Lf;)B", line = 231)
    private static final byte method126(class10 arg0) {
        return (byte) method125(1, arg0);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "()V", line = 234)
    public static void method127() {
        field276 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(Lf;)V", line = 240)
    private static final void method128(class10 arg0) {
        arg0.field159 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field175[var1]) {
                arg0.field156[arg0.field159] = (byte) var1;
                arg0.field159++;
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "(Lf;)V", line = 260)
    private static final void method129(class10 arg0) {
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
        arg0.field176 = 1;
        if (class31.field344 == null) {
            class31.field344 = new int[arg0.field176 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method131(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method131(arg0);
                byte var26 = method131(arg0);
                byte var27 = method131(arg0);
                byte var28 = method131(arg0);
                byte var29 = method131(arg0);
                byte var30 = method131(arg0);
                byte var31 = method131(arg0);
                byte var32 = method131(arg0);
                byte var33 = method131(arg0);
                byte var34 = method126(arg0);
                if (var34 != 0) {
                }
                arg0.field164 = 0;
                byte var35 = method131(arg0);
                arg0.field164 = arg0.field164 << 8 | var35 & 0xFF;
                byte var36 = method131(arg0);
                arg0.field164 = arg0.field164 << 8 | var36 & 0xFF;
                byte var37 = method131(arg0);
                arg0.field164 = arg0.field164 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var39 = method126(arg0);
                    if (var39 == 1) {
                        arg0.field171[var38] = true;
                    } else {
                        arg0.field171[var38] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field175[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field171[var41]) {
                        for (int var42 = 0; var42 < 16; var42++) {
                            byte var43 = method126(arg0);
                            if (var43 == 1) {
                                arg0.field175[var41 * 16 + var42] = true;
                            }
                        }
                    }
                }
                method128(arg0);
                int var44 = arg0.field159 + 2;
                int var45 = method125(3, arg0);
                int var46 = method125(15, arg0);
                for (int var47 = 0; var47 < var46; var47++) {
                    int var48 = 0;
                    while (true) {
                        byte var49 = method126(arg0);
                        if (var49 == 0) {
                            arg0.field155[var47] = (byte) var48;
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
                    byte var53 = arg0.field155[var52];
                    byte var54 = var50[var53];
                    while (var53 > 0) {
                        var50[var53] = var50[var53 - 1];
                        var53--;
                    }
                    var50[0] = var54;
                    arg0.field148[var52] = var54;
                }
                for (int var55 = 0; var55 < var45; var55++) {
                    int var56 = method125(5, arg0);
                    for (int var57 = 0; var57 < var44; var57++) {
                        while (true) {
                            byte var58 = method126(arg0);
                            if (var58 == 0) {
                                arg0.field150[var55][var57] = (byte) var56;
                                break;
                            }
                            byte var59 = method126(arg0);
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
                        if (arg0.field150[var60][var63] > var62) {
                            var62 = arg0.field150[var60][var63];
                        }
                        if (arg0.field150[var60][var63] < var61) {
                            var61 = arg0.field150[var60][var63];
                        }
                    }
                    method130(arg0.field165[var60], arg0.field174[var60], arg0.field162[var60], arg0.field150[var60], var61, var62, var44);
                    arg0.field158[var60] = var61;
                }
                int var64 = arg0.field159 + 1;
                int var65 = -1;
                byte var66 = 0;
                for (int var67 = 0; var67 <= 255; var67++) {
                    arg0.field182[var67] = 0;
                }
                int var68 = 4095;
                for (int var69 = 15; var69 >= 0; var69--) {
                    for (int var70 = 15; var70 >= 0; var70--) {
                        arg0.field177[var68] = (byte) (var69 * 16 + var70);
                        var68--;
                    }
                    arg0.field183[var69] = var68 + 1;
                }
                int var71 = 0;
                if (var66 == 0) {
                    var65++;
                    var66 = 50;
                    byte var72 = arg0.field148[var65];
                    var19 = arg0.field158[var72];
                    var20 = arg0.field165[var72];
                    var22 = arg0.field162[var72];
                    var21 = arg0.field174[var72];
                }
                int var102 = var66 - 1;
                int var73 = var19;
                int var74;
                byte var101;
                for (var74 = method125(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var101) {
                    var73++;
                    var101 = method126(arg0);
                }
                int var75 = var22[var74 - var21[var73]];
                while (true) {
                    while (var64 != var75) {
                        if (var75 == 0 || var75 == 1) {
                            int var94 = -1;
                            int var95 = 1;
                            do {
                                if (var75 == 0) {
                                    var94 += var95;
                                } else if (var75 == 1) {
                                    var94 += var95 * 2;
                                }
                                var95 *= 2;
                                if (var102 == 0) {
                                    var65++;
                                    var102 = 50;
                                    byte var96 = arg0.field148[var65];
                                    var19 = arg0.field158[var96];
                                    var20 = arg0.field165[var96];
                                    var22 = arg0.field162[var96];
                                    var21 = arg0.field174[var96];
                                }
                                var102--;
                                int var97 = var19;
                                int var98;
                                byte var100;
                                for (var98 = method125(var19, arg0); var98 > var20[var97]; var98 = var98 << 1 | var100) {
                                    var97++;
                                    var100 = method126(arg0);
                                }
                                var75 = var22[var98 - var21[var97]];
                            } while (var75 == 0 || var75 == 1);
                            var94++;
                            byte var99 = arg0.field156[arg0.field177[arg0.field183[0]] & 0xFF];
                            arg0.field182[var99 & 0xFF] += var94;
                            while (var94 > 0) {
                                class31.field344[var71] = var99 & 0xFF;
                                var71++;
                                var94--;
                            }
                        } else {
                            int var80 = var75 - 1;
                            byte var82;
                            if (var80 < 16) {
                                int var81 = arg0.field183[0];
                                var82 = arg0.field177[var80 + var81];
                                while (var80 > 3) {
                                    int var83 = var80 + var81;
                                    arg0.field177[var83] = arg0.field177[var83 - 1];
                                    arg0.field177[var83 - 1] = arg0.field177[var83 - 2];
                                    arg0.field177[var83 - 2] = arg0.field177[var83 - 3];
                                    arg0.field177[var83 - 3] = arg0.field177[var83 - 4];
                                    var80 -= 4;
                                }
                                while (var80 > 0) {
                                    arg0.field177[var80 + var81] = arg0.field177[var80 + var81 - 1];
                                    var80--;
                                }
                                arg0.field177[var81] = var82;
                            } else {
                                int var84 = var80 / 16;
                                int var85 = var80 % 16;
                                int var86 = arg0.field183[var84] + var85;
                                var82 = arg0.field177[var86];
                                while (var86 > arg0.field183[var84]) {
                                    arg0.field177[var86] = arg0.field177[var86 - 1];
                                    var86--;
                                }
                                int var10002 = arg0.field183[var84]++;
                                while (var84 > 0) {
                                    var10002 = arg0.field183[var84]--;
                                    arg0.field177[arg0.field183[var84]] = arg0.field177[arg0.field183[var84 - 1] + 16 - 1];
                                    var84--;
                                }
                                var10002 = arg0.field183[0]--;
                                arg0.field177[arg0.field183[0]] = var82;
                                if (arg0.field183[0] == 0) {
                                    int var87 = 4095;
                                    for (int var88 = 15; var88 >= 0; var88--) {
                                        for (int var89 = 15; var89 >= 0; var89--) {
                                            arg0.field177[var87] = arg0.field177[arg0.field183[var88] + var89];
                                            var87--;
                                        }
                                        arg0.field183[var88] = var87 + 1;
                                    }
                                }
                            }
                            arg0.field182[arg0.field156[var82 & 0xFF] & 0xFF]++;
                            class31.field344[var71] = arg0.field156[var82 & 0xFF] & 0xFF;
                            var71++;
                            if (var102 == 0) {
                                var65++;
                                var102 = 50;
                                byte var90 = arg0.field148[var65];
                                var19 = arg0.field158[var90];
                                var20 = arg0.field165[var90];
                                var22 = arg0.field162[var90];
                                var21 = arg0.field174[var90];
                            }
                            var102--;
                            int var91 = var19;
                            int var92;
                            byte var93;
                            for (var92 = method125(var19, arg0); var92 > var20[var91]; var92 = var92 << 1 | var93) {
                                var91++;
                                var93 = method126(arg0);
                            }
                            var75 = var22[var92 - var21[var91]];
                        }
                    }
                    arg0.field145 = 0;
                    arg0.field147 = 0;
                    arg0.field149[0] = 0;
                    for (int var76 = 1; var76 <= 256; var76++) {
                        arg0.field149[var76] = arg0.field182[var76 - 1];
                    }
                    for (int var77 = 1; var77 <= 256; var77++) {
                        arg0.field149[var77] += arg0.field149[var77 - 1];
                    }
                    for (int var78 = 0; var78 < var71; var78++) {
                        byte var79 = (byte) (class31.field344[var78] & 0xFF);
                        class31.field344[arg0.field149[var79 & 0xFF]] |= var78 << 8;
                        arg0.field149[var79 & 0xFF]++;
                    }
                    arg0.field154 = class31.field344[arg0.field164] >> 8;
                    arg0.field151 = 0;
                    arg0.field154 = class31.field344[arg0.field154];
                    arg0.field146 = (byte) (arg0.field154 & 0xFF);
                    arg0.field154 >>= 0x8;
                    arg0.field151++;
                    arg0.field180 = var71;
                    method124(arg0);
                    if (arg0.field180 + 1 == arg0.field151 && arg0.field145 == 0) {
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

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([I[I[I[BIII)V", line = 766)
    private static final void method130(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
            int var16 = arg1[var15 + 1] + var14 - arg1[var15];
            arg0[var15] = var16 - 1;
            var14 = var16 << 1;
        }
        for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
            arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
        }
    }

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "(Lf;)B", line = 838)
    private static final byte method131(class10 arg0) {
        return (byte) method125(8, arg0);
    }
}
