import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class261 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lda;")
    private static class24 field4608 = new class24();

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lda;)V")
    private static final void method1758(class24 arg0) {
        byte var1 = arg0.field345;
        int var2 = arg0.field343;
        int var3 = arg0.field331;
        int var4 = arg0.field352;
        int[] var5 = class234.field4035;
        int var6 = arg0.field333;
        byte[] var7 = arg0.field314;
        int var8 = arg0.field321;
        int var9 = arg0.field338;
        int var10 = var9;
        int var11 = arg0.field348 + 1;
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
        int var23 = arg0.field316;
        arg0.field316 += var10 - var9;
        arg0.field345 = var1;
        arg0.field343 = var2;
        arg0.field331 = var3;
        arg0.field352 = var4;
        class234.field4035 = var5;
        arg0.field333 = var6;
        arg0.field314 = var7;
        arg0.field321 = var8;
        arg0.field338 = var9;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lda;)B")
    private static final byte method1759(class24 arg0) {
        return (byte) method1764(8, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BI[BII)I")
    public static final int method1760(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class24 var5 = field4608;
        synchronized (field4608) {
            field4608.field347 = arg2;
            field4608.field318 = arg4;
            field4608.field314 = arg0;
            field4608.field321 = 0;
            field4608.field338 = arg1;
            field4608.field346 = 0;
            field4608.field350 = 0;
            field4608.field341 = 0;
            field4608.field316 = 0;
            method1763(field4608);
            int var6 = arg1 - field4608.field338;
            field4608.field347 = null;
            field4608.field314 = null;
            return var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(Lda;)B")
    private static final byte method1761(class24 arg0) {
        return (byte) method1764(1, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(Lda;)V")
    private static final void method1762(class24 arg0) {
        arg0.field319 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field344[var1]) {
                arg0.field322[arg0.field319] = (byte) var1;
                arg0.field319++;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(Lda;)V")
    private static final void method1763(class24 arg0) {
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
        arg0.field340 = 1;
        if (class234.field4035 == null) {
            class234.field4035 = new int[arg0.field340 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method1759(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method1759(arg0);
                byte var26 = method1759(arg0);
                byte var27 = method1759(arg0);
                byte var28 = method1759(arg0);
                byte var29 = method1759(arg0);
                byte var30 = method1759(arg0);
                byte var31 = method1759(arg0);
                byte var32 = method1759(arg0);
                byte var33 = method1759(arg0);
                byte var34 = method1761(arg0);
                arg0.field326 = 0;
                byte var35 = method1759(arg0);
                arg0.field326 = arg0.field326 << 8 | var35 & 0xFF;
                byte var36 = method1759(arg0);
                arg0.field326 = arg0.field326 << 8 | var36 & 0xFF;
                byte var37 = method1759(arg0);
                arg0.field326 = arg0.field326 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var101 = method1761(arg0);
                    if (var101 == 1) {
                        arg0.field328[var38] = true;
                    } else {
                        arg0.field328[var38] = false;
                    }
                }
                for (int var39 = 0; var39 < 256; var39++) {
                    arg0.field344[var39] = false;
                }
                for (int var40 = 0; var40 < 16; var40++) {
                    if (arg0.field328[var40]) {
                        for (int var99 = 0; var99 < 16; var99++) {
                            byte var100 = method1761(arg0);
                            if (var100 == 1) {
                                arg0.field344[var40 * 16 + var99] = true;
                            }
                        }
                    }
                }
                method1762(arg0);
                int var41 = arg0.field319 + 2;
                int var42 = method1764(3, arg0);
                int var43 = method1764(15, arg0);
                for (int var44 = 0; var44 < var43; var44++) {
                    int var97 = 0;
                    while (true) {
                        byte var98 = method1761(arg0);
                        if (var98 == 0) {
                            arg0.field337[var44] = (byte) var97;
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
                    byte var95 = arg0.field337[var47];
                    byte var96 = var45[var95];
                    while (var95 > 0) {
                        var45[var95] = var45[var95 - 1];
                        var95--;
                    }
                    var45[0] = var96;
                    arg0.field320[var47] = var96;
                }
                for (int var48 = 0; var48 < var42; var48++) {
                    int var91 = method1764(5, arg0);
                    for (int var92 = 0; var92 < var41; var92++) {
                        while (true) {
                            byte var93 = method1761(arg0);
                            if (var93 == 0) {
                                arg0.field351[var48][var92] = (byte) var91;
                                break;
                            }
                            byte var94 = method1761(arg0);
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
                        if (arg0.field351[var49][var90] > var89) {
                            var89 = arg0.field351[var49][var90];
                        }
                        if (arg0.field351[var49][var90] < var88) {
                            var88 = arg0.field351[var49][var90];
                        }
                    }
                    method1765(arg0.field336[var49], arg0.field335[var49], arg0.field311[var49], arg0.field351[var49], var88, var89, var41);
                    arg0.field339[var49] = var88;
                }
                int var50 = arg0.field319 + 1;
                int var51 = -1;
                byte var52 = 0;
                for (int var53 = 0; var53 <= 255; var53++) {
                    arg0.field342[var53] = 0;
                }
                int var54 = 4095;
                for (int var55 = 15; var55 >= 0; var55--) {
                    for (int var87 = 15; var87 >= 0; var87--) {
                        arg0.field330[var54] = (byte) (var55 * 16 + var87);
                        var54--;
                    }
                    arg0.field334[var55] = var54 + 1;
                }
                int var56 = 0;
                if (var52 == 0) {
                    var51++;
                    var52 = 50;
                    byte var57 = arg0.field320[var51];
                    var19 = arg0.field339[var57];
                    var20 = arg0.field336[var57];
                    var22 = arg0.field311[var57];
                    var21 = arg0.field335[var57];
                }
                int var102 = var52 - 1;
                int var58 = var19;
                int var59;
                byte var60;
                for (var59 = method1764(var19, arg0); var59 > var20[var58]; var59 = var59 << 1 | var60) {
                    var58++;
                    var60 = method1761(arg0);
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
                                    byte var78 = arg0.field320[var51];
                                    var19 = arg0.field339[var78];
                                    var20 = arg0.field336[var78];
                                    var22 = arg0.field311[var78];
                                    var21 = arg0.field335[var78];
                                }
                                var102--;
                                int var79 = var19;
                                int var80;
                                byte var81;
                                for (var80 = method1764(var19, arg0); var80 > var20[var79]; var80 = var80 << 1 | var81) {
                                    var79++;
                                    var81 = method1761(arg0);
                                }
                                var61 = var22[var80 - var21[var79]];
                            } while (var61 == 0 || var61 == 1);
                            var76++;
                            byte var82 = arg0.field322[arg0.field330[arg0.field334[0]] & 0xFF];
                            arg0.field342[var82 & 0xFF] += var76;
                            while (var76 > 0) {
                                class234.field4035[var56] = var82 & 0xFF;
                                var56++;
                                var76--;
                            }
                        } else {
                            int var62 = var61 - 1;
                            byte var64;
                            if (var62 < 16) {
                                int var63 = arg0.field334[0];
                                var64 = arg0.field330[var62 + var63];
                                while (var62 > 3) {
                                    int var65 = var62 + var63;
                                    arg0.field330[var65] = arg0.field330[var65 - 1];
                                    arg0.field330[var65 - 1] = arg0.field330[var65 - 2];
                                    arg0.field330[var65 - 2] = arg0.field330[var65 - 3];
                                    arg0.field330[var65 - 3] = arg0.field330[var65 - 4];
                                    var62 -= 4;
                                }
                                while (var62 > 0) {
                                    arg0.field330[var62 + var63] = arg0.field330[var62 + var63 - 1];
                                    var62--;
                                }
                                arg0.field330[var63] = var64;
                            } else {
                                int var66 = var62 / 16;
                                int var67 = var62 % 16;
                                int var68 = arg0.field334[var66] + var67;
                                var64 = arg0.field330[var68];
                                while (var68 > arg0.field334[var66]) {
                                    arg0.field330[var68] = arg0.field330[var68 - 1];
                                    var68--;
                                }
                                int var10002 = arg0.field334[var66]++;
                                while (var66 > 0) {
                                    var10002 = arg0.field334[var66]--;
                                    arg0.field330[arg0.field334[var66]] = arg0.field330[arg0.field334[var66 - 1] + 16 - 1];
                                    var66--;
                                }
                                var10002 = arg0.field334[0]--;
                                arg0.field330[arg0.field334[0]] = var64;
                                if (arg0.field334[0] == 0) {
                                    int var69 = 4095;
                                    for (int var70 = 15; var70 >= 0; var70--) {
                                        for (int var71 = 15; var71 >= 0; var71--) {
                                            arg0.field330[var69] = arg0.field330[arg0.field334[var70] + var71];
                                            var69--;
                                        }
                                        arg0.field334[var70] = var69 + 1;
                                    }
                                }
                            }
                            arg0.field342[arg0.field322[var64 & 0xFF] & 0xFF]++;
                            class234.field4035[var56] = arg0.field322[var64 & 0xFF] & 0xFF;
                            var56++;
                            if (var102 == 0) {
                                var51++;
                                var102 = 50;
                                byte var72 = arg0.field320[var51];
                                var19 = arg0.field339[var72];
                                var20 = arg0.field336[var72];
                                var22 = arg0.field311[var72];
                                var21 = arg0.field335[var72];
                            }
                            var102--;
                            int var73 = var19;
                            int var74;
                            byte var75;
                            for (var74 = method1764(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var75) {
                                var73++;
                                var75 = method1761(arg0);
                            }
                            var61 = var22[var74 - var21[var73]];
                        }
                    }
                    arg0.field343 = 0;
                    arg0.field345 = 0;
                    arg0.field329[0] = 0;
                    for (int var83 = 1; var83 <= 256; var83++) {
                        arg0.field329[var83] = arg0.field342[var83 - 1];
                    }
                    for (int var84 = 1; var84 <= 256; var84++) {
                        arg0.field329[var84] += arg0.field329[var84 - 1];
                    }
                    for (int var85 = 0; var85 < var56; var85++) {
                        byte var86 = (byte) (class234.field4035[var85] & 0xFF);
                        class234.field4035[arg0.field329[var86 & 0xFF]] |= var85 << 8;
                        arg0.field329[var86 & 0xFF]++;
                    }
                    arg0.field333 = class234.field4035[arg0.field326] >> 8;
                    arg0.field331 = 0;
                    arg0.field333 = class234.field4035[arg0.field333];
                    arg0.field352 = (byte) (arg0.field333 & 0xFF);
                    arg0.field333 >>= 0x8;
                    arg0.field331++;
                    arg0.field348 = var56;
                    method1758(arg0);
                    if (arg0.field348 + 1 == arg0.field331 && arg0.field343 == 0) {
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

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILda;)I")
    private static final int method1764(int arg0, class24 arg1) {
        while (arg1.field346 < arg0) {
            arg1.field350 = arg1.field350 << 8 | arg1.field347[arg1.field318] & 0xFF;
            arg1.field346 += 8;
            arg1.field318++;
            arg1.field341++;
        }
        int var2 = arg1.field350 >> arg1.field346 - arg0 & (0x1 << arg0) - 1;
        arg1.field346 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([I[I[I[BIII)V")
    private static final void method1765(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
    public static void method1766() {
        field4608 = null;
    }
}
