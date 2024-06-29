import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Ldf;")
    private static class40 field392 = new class40();

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BI[BII)I")
    public static final int method138(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class40 var5 = field392;
        synchronized (field392) {
            field392.field837 = arg2;
            field392.field833 = arg4;
            field392.field824 = arg0;
            field392.field803 = 0;
            field392.field831 = arg1;
            field392.field807 = 0;
            field392.field809 = 0;
            field392.field835 = 0;
            field392.field834 = 0;
            method143(field392);
            int var6 = arg1 - field392.field831;
            field392.field837 = null;
            field392.field824 = null;
            return var6;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ldf;)V")
    private static final void method139(class40 arg0) {
        arg0.field813 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field816[var1]) {
                arg0.field805[arg0.field813] = (byte) var1;
                arg0.field813++;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Ldf;)V")
    private static final void method140(class40 arg0) {
        byte var1 = arg0.field839;
        int var2 = arg0.field812;
        int var3 = arg0.field841;
        int var4 = arg0.field840;
        int[] var5 = class69.field1368;
        int var6 = arg0.field802;
        byte[] var7 = arg0.field824;
        int var8 = arg0.field803;
        int var9 = arg0.field831;
        int var10 = var9;
        int var11 = arg0.field808 + 1;
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
        int var23 = arg0.field834;
        arg0.field834 += var10 - var9;
        arg0.field839 = var1;
        arg0.field812 = var2;
        arg0.field841 = var3;
        arg0.field840 = var4;
        class69.field1368 = var5;
        arg0.field802 = var6;
        arg0.field824 = var7;
        arg0.field803 = var8;
        arg0.field831 = var9;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(Ldf;)B")
    private static final byte method141(class40 arg0) {
        return (byte) method145(1, arg0);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(Ldf;)B")
    private static final byte method142(class40 arg0) {
        return (byte) method145(8, arg0);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(Ldf;)V")
    private static final void method143(class40 arg0) {
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
        arg0.field822 = 1;
        if (class69.field1368 == null) {
            class69.field1368 = new int[arg0.field822 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method142(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method142(arg0);
                byte var26 = method142(arg0);
                byte var27 = method142(arg0);
                byte var28 = method142(arg0);
                byte var29 = method142(arg0);
                byte var30 = method142(arg0);
                byte var31 = method142(arg0);
                byte var32 = method142(arg0);
                byte var33 = method142(arg0);
                byte var34 = method141(arg0);
                arg0.field810 = 0;
                byte var35 = method142(arg0);
                arg0.field810 = arg0.field810 << 8 | var35 & 0xFF;
                byte var36 = method142(arg0);
                arg0.field810 = arg0.field810 << 8 | var36 & 0xFF;
                byte var37 = method142(arg0);
                arg0.field810 = arg0.field810 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var101 = method141(arg0);
                    if (var101 == 1) {
                        arg0.field838[var38] = true;
                    } else {
                        arg0.field838[var38] = false;
                    }
                }
                for (int var39 = 0; var39 < 256; var39++) {
                    arg0.field816[var39] = false;
                }
                for (int var40 = 0; var40 < 16; var40++) {
                    if (arg0.field838[var40]) {
                        for (int var99 = 0; var99 < 16; var99++) {
                            byte var100 = method141(arg0);
                            if (var100 == 1) {
                                arg0.field816[var40 * 16 + var99] = true;
                            }
                        }
                    }
                }
                method139(arg0);
                int var41 = arg0.field813 + 2;
                int var42 = method145(3, arg0);
                int var43 = method145(15, arg0);
                for (int var44 = 0; var44 < var43; var44++) {
                    int var97 = 0;
                    while (true) {
                        byte var98 = method141(arg0);
                        if (var98 == 0) {
                            arg0.field818[var44] = (byte) var97;
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
                    byte var95 = arg0.field818[var47];
                    byte var96 = var45[var95];
                    while (var95 > 0) {
                        var45[var95] = var45[var95 - 1];
                        var95--;
                    }
                    var45[0] = var96;
                    arg0.field806[var47] = var96;
                }
                for (int var48 = 0; var48 < var42; var48++) {
                    int var91 = method145(5, arg0);
                    for (int var92 = 0; var92 < var41; var92++) {
                        while (true) {
                            byte var93 = method141(arg0);
                            if (var93 == 0) {
                                arg0.field828[var48][var92] = (byte) var91;
                                break;
                            }
                            byte var94 = method141(arg0);
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
                        if (arg0.field828[var49][var90] > var89) {
                            var89 = arg0.field828[var49][var90];
                        }
                        if (arg0.field828[var49][var90] < var88) {
                            var88 = arg0.field828[var49][var90];
                        }
                    }
                    method144(arg0.field820[var49], arg0.field804[var49], arg0.field815[var49], arg0.field828[var49], var88, var89, var41);
                    arg0.field832[var49] = var88;
                }
                int var50 = arg0.field813 + 1;
                int var51 = -1;
                byte var52 = 0;
                for (int var53 = 0; var53 <= 255; var53++) {
                    arg0.field827[var53] = 0;
                }
                int var54 = 4095;
                for (int var55 = 15; var55 >= 0; var55--) {
                    for (int var87 = 15; var87 >= 0; var87--) {
                        arg0.field842[var54] = (byte) (var55 * 16 + var87);
                        var54--;
                    }
                    arg0.field845[var55] = var54 + 1;
                }
                int var56 = 0;
                if (var52 == 0) {
                    var51++;
                    var52 = 50;
                    byte var57 = arg0.field806[var51];
                    var19 = arg0.field832[var57];
                    var20 = arg0.field820[var57];
                    var22 = arg0.field815[var57];
                    var21 = arg0.field804[var57];
                }
                int var102 = var52 - 1;
                int var58 = var19;
                int var59;
                byte var60;
                for (var59 = method145(var19, arg0); var59 > var20[var58]; var59 = var59 << 1 | var60) {
                    var58++;
                    var60 = method141(arg0);
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
                                    byte var78 = arg0.field806[var51];
                                    var19 = arg0.field832[var78];
                                    var20 = arg0.field820[var78];
                                    var22 = arg0.field815[var78];
                                    var21 = arg0.field804[var78];
                                }
                                var102--;
                                int var79 = var19;
                                int var80;
                                byte var81;
                                for (var80 = method145(var19, arg0); var80 > var20[var79]; var80 = var80 << 1 | var81) {
                                    var79++;
                                    var81 = method141(arg0);
                                }
                                var61 = var22[var80 - var21[var79]];
                            } while (var61 == 0 || var61 == 1);
                            var76++;
                            byte var82 = arg0.field805[arg0.field842[arg0.field845[0]] & 0xFF];
                            arg0.field827[var82 & 0xFF] += var76;
                            while (var76 > 0) {
                                class69.field1368[var56] = var82 & 0xFF;
                                var56++;
                                var76--;
                            }
                        } else {
                            int var62 = var61 - 1;
                            byte var64;
                            if (var62 < 16) {
                                int var63 = arg0.field845[0];
                                var64 = arg0.field842[var62 + var63];
                                while (var62 > 3) {
                                    int var65 = var62 + var63;
                                    arg0.field842[var65] = arg0.field842[var65 - 1];
                                    arg0.field842[var65 - 1] = arg0.field842[var65 - 2];
                                    arg0.field842[var65 - 2] = arg0.field842[var65 - 3];
                                    arg0.field842[var65 - 3] = arg0.field842[var65 - 4];
                                    var62 -= 4;
                                }
                                while (var62 > 0) {
                                    arg0.field842[var62 + var63] = arg0.field842[var62 + var63 - 1];
                                    var62--;
                                }
                                arg0.field842[var63] = var64;
                            } else {
                                int var66 = var62 / 16;
                                int var67 = var62 % 16;
                                int var68 = arg0.field845[var66] + var67;
                                var64 = arg0.field842[var68];
                                while (var68 > arg0.field845[var66]) {
                                    arg0.field842[var68] = arg0.field842[var68 - 1];
                                    var68--;
                                }
                                int var10002 = arg0.field845[var66]++;
                                while (var66 > 0) {
                                    var10002 = arg0.field845[var66]--;
                                    arg0.field842[arg0.field845[var66]] = arg0.field842[arg0.field845[var66 - 1] + 16 - 1];
                                    var66--;
                                }
                                var10002 = arg0.field845[0]--;
                                arg0.field842[arg0.field845[0]] = var64;
                                if (arg0.field845[0] == 0) {
                                    int var69 = 4095;
                                    for (int var70 = 15; var70 >= 0; var70--) {
                                        for (int var71 = 15; var71 >= 0; var71--) {
                                            arg0.field842[var69] = arg0.field842[arg0.field845[var70] + var71];
                                            var69--;
                                        }
                                        arg0.field845[var70] = var69 + 1;
                                    }
                                }
                            }
                            arg0.field827[arg0.field805[var64 & 0xFF] & 0xFF]++;
                            class69.field1368[var56] = arg0.field805[var64 & 0xFF] & 0xFF;
                            var56++;
                            if (var102 == 0) {
                                var51++;
                                var102 = 50;
                                byte var72 = arg0.field806[var51];
                                var19 = arg0.field832[var72];
                                var20 = arg0.field820[var72];
                                var22 = arg0.field815[var72];
                                var21 = arg0.field804[var72];
                            }
                            var102--;
                            int var73 = var19;
                            int var74;
                            byte var75;
                            for (var74 = method145(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var75) {
                                var73++;
                                var75 = method141(arg0);
                            }
                            var61 = var22[var74 - var21[var73]];
                        }
                    }
                    arg0.field812 = 0;
                    arg0.field839 = 0;
                    arg0.field819[0] = 0;
                    for (int var83 = 1; var83 <= 256; var83++) {
                        arg0.field819[var83] = arg0.field827[var83 - 1];
                    }
                    for (int var84 = 1; var84 <= 256; var84++) {
                        arg0.field819[var84] += arg0.field819[var84 - 1];
                    }
                    for (int var85 = 0; var85 < var56; var85++) {
                        byte var86 = (byte) (class69.field1368[var85] & 0xFF);
                        class69.field1368[arg0.field819[var86 & 0xFF]] |= var85 << 8;
                        arg0.field819[var86 & 0xFF]++;
                    }
                    arg0.field802 = class69.field1368[arg0.field810] >> 8;
                    arg0.field841 = 0;
                    arg0.field802 = class69.field1368[arg0.field802];
                    arg0.field840 = (byte) (arg0.field802 & 0xFF);
                    arg0.field802 >>= 0x8;
                    arg0.field841++;
                    arg0.field808 = var56;
                    method140(arg0);
                    if (arg0.field808 + 1 == arg0.field841 && arg0.field812 == 0) {
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

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([I[I[I[BIII)V")
    private static final void method144(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILdf;)I")
    private static final int method145(int arg0, class40 arg1) {
        while (arg1.field807 < arg0) {
            arg1.field809 = arg1.field809 << 8 | arg1.field837[arg1.field833] & 0xFF;
            arg1.field807 += 8;
            arg1.field833++;
            arg1.field835++;
        }
        int var2 = arg1.field809 >> arg1.field807 - arg0 & (0x1 << arg0) - 1;
        arg1.field807 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
    public static void method146() {
        field392 = null;
    }
}
