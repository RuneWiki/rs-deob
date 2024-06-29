import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DKFTTKQA")
public class class9 {

    @OriginalMember(owner = "client!DKFTTKQA", name = "a", descriptor = "LFQNHUIBP;")
    private static class18 field623 = new class18();

    @OriginalMember(owner = "client!DKFTTKQA", name = "a", descriptor = "([BI[BII)I")
    public static int method177(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class18 var5 = field623;
        synchronized (field623) {
            field623.field740 = arg2;
            field623.field741 = arg4;
            field623.field745 = arg0;
            field623.field746 = 0;
            field623.field742 = arg3;
            field623.field747 = arg1;
            field623.field754 = 0;
            field623.field753 = 0;
            field623.field743 = 0;
            field623.field744 = 0;
            field623.field748 = 0;
            field623.field749 = 0;
            field623.field756 = 0;
            method179(field623);
            int var6 = arg1 - field623.field747;
            if (class3.field51) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!DKFTTKQA", name = "a", descriptor = "(LFQNHUIBP;)V")
    private static void method178(class18 arg0) {
        byte var1 = arg0.field750;
        int var2 = arg0.field751;
        int var3 = arg0.field761;
        int var4 = arg0.field759;
        int[] var5 = class18.field764;
        int var6 = arg0.field758;
        byte[] var7 = arg0.field745;
        int var8 = arg0.field746;
        int var9 = arg0.field747;
        int var10 = var9;
        int var11 = arg0.field778 + 1;
        label67: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label67;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label67;
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
                    break label67;
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
                        break label67;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label67;
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
        int var23 = arg0.field748;
        arg0.field748 += var10 - var9;
        if (arg0.field748 < var23) {
            arg0.field749++;
        }
        arg0.field750 = var1;
        arg0.field751 = var2;
        arg0.field761 = var3;
        arg0.field759 = var4;
        class18.field764 = var5;
        arg0.field758 = var6;
        arg0.field745 = var7;
        arg0.field746 = var8;
        arg0.field747 = var9;
    }

    @OriginalMember(owner = "client!DKFTTKQA", name = "b", descriptor = "(LFQNHUIBP;)V")
    private static void method179(class18 arg0) {
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
        boolean var19 = false;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        arg0.field755 = 1;
        if (class18.field764 == null) {
            class18.field764 = new int[arg0.field755 * 100000];
        }
        boolean var24 = true;
        while (true) {
            while (var24) {
                byte var25 = method180(arg0);
                if (var25 == 23) {
                    return;
                }
                byte var26 = method180(arg0);
                byte var27 = method180(arg0);
                byte var28 = method180(arg0);
                byte var29 = method180(arg0);
                byte var30 = method180(arg0);
                arg0.field756++;
                byte var31 = method180(arg0);
                byte var32 = method180(arg0);
                byte var33 = method180(arg0);
                byte var34 = method180(arg0);
                byte var35 = method181(arg0);
                if (var35 == 0) {
                    arg0.field752 = false;
                } else {
                    arg0.field752 = true;
                }
                if (arg0.field752) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field757 = 0;
                byte var36 = method180(arg0);
                arg0.field757 = arg0.field757 << 8 | var36 & 0xFF;
                byte var37 = method180(arg0);
                arg0.field757 = arg0.field757 << 8 | var37 & 0xFF;
                byte var38 = method180(arg0);
                arg0.field757 = arg0.field757 << 8 | var38 & 0xFF;
                for (int var39 = 0; var39 < 16; var39++) {
                    byte var103 = method181(arg0);
                    if (var103 == 1) {
                        arg0.field767[var39] = true;
                    } else {
                        arg0.field767[var39] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field766[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field767[var41]) {
                        for (int var101 = 0; var101 < 16; var101++) {
                            byte var102 = method181(arg0);
                            if (var102 == 1) {
                                arg0.field766[var41 * 16 + var101] = true;
                            }
                        }
                    }
                }
                method183(arg0);
                int var42 = arg0.field765 + 2;
                int var43 = method182(3, arg0);
                int var44 = method182(15, arg0);
                for (int var45 = 0; var45 < var44; var45++) {
                    int var99 = 0;
                    while (true) {
                        byte var100 = method181(arg0);
                        if (var100 == 0) {
                            arg0.field772[var45] = (byte) var99;
                            break;
                        }
                        var99++;
                    }
                }
                byte[] var46 = new byte[6];
                byte var47 = 0;
                while (var47 < var43) {
                    var46[var47] = var47++;
                }
                for (int var48 = 0; var48 < var44; var48++) {
                    byte var97 = arg0.field772[var48];
                    byte var98 = var46[var97];
                    while (var97 > 0) {
                        var46[var97] = var46[var97 - 1];
                        var97--;
                    }
                    var46[0] = var98;
                    arg0.field771[var48] = var98;
                }
                for (int var49 = 0; var49 < var43; var49++) {
                    int var93 = method182(5, arg0);
                    for (int var94 = 0; var94 < var42; var94++) {
                        while (true) {
                            byte var95 = method181(arg0);
                            if (var95 == 0) {
                                arg0.field773[var49][var94] = (byte) var93;
                                break;
                            }
                            byte var96 = method181(arg0);
                            if (var96 == 0) {
                                var93++;
                            } else {
                                var93--;
                            }
                        }
                    }
                }
                for (int var50 = 0; var50 < var43; var50++) {
                    byte var90 = 32;
                    byte var91 = 0;
                    for (int var92 = 0; var92 < var42; var92++) {
                        if (arg0.field773[var50][var92] > var91) {
                            var91 = arg0.field773[var50][var92];
                        }
                        if (arg0.field773[var50][var92] < var90) {
                            var90 = arg0.field773[var50][var92];
                        }
                    }
                    method184(arg0.field774[var50], arg0.field775[var50], arg0.field776[var50], arg0.field773[var50], var90, var91, var42);
                    arg0.field777[var50] = var90;
                }
                int var51 = arg0.field765 + 1;
                int var52 = arg0.field755 * 100000;
                int var53 = -1;
                byte var54 = 0;
                for (int var55 = 0; var55 <= 255; var55++) {
                    arg0.field760[var55] = 0;
                }
                int var56 = 4095;
                for (int var57 = 15; var57 >= 0; var57--) {
                    for (int var89 = 15; var89 >= 0; var89--) {
                        arg0.field769[var56] = (byte) (var57 * 16 + var89);
                        var56--;
                    }
                    arg0.field770[var57] = var56 + 1;
                }
                int var58 = 0;
                if (var54 == 0) {
                    var53++;
                    var54 = 50;
                    byte var59 = arg0.field771[var53];
                    var20 = arg0.field777[var59];
                    var21 = arg0.field774[var59];
                    var23 = arg0.field776[var59];
                    var22 = arg0.field775[var59];
                }
                int var104 = var54 - 1;
                int var60 = var20;
                int var61;
                byte var62;
                for (var61 = method182(var20, arg0); var61 > var21[var60]; var61 = var61 << 1 | var62) {
                    var60++;
                    var62 = method181(arg0);
                }
                int var63 = var23[var61 - var22[var60]];
                while (true) {
                    while (var51 != var63) {
                        if (var63 == 0 || var63 == 1) {
                            int var78 = -1;
                            int var79 = 1;
                            do {
                                if (var63 == 0) {
                                    var78 += var79;
                                } else if (var63 == 1) {
                                    var78 += var79 * 2;
                                }
                                var79 *= 2;
                                if (var104 == 0) {
                                    var53++;
                                    var104 = 50;
                                    byte var80 = arg0.field771[var53];
                                    var20 = arg0.field777[var80];
                                    var21 = arg0.field774[var80];
                                    var23 = arg0.field776[var80];
                                    var22 = arg0.field775[var80];
                                }
                                var104--;
                                int var81 = var20;
                                int var82;
                                byte var83;
                                for (var82 = method182(var20, arg0); var82 > var21[var81]; var82 = var82 << 1 | var83) {
                                    var81++;
                                    var83 = method181(arg0);
                                }
                                var63 = var23[var82 - var22[var81]];
                            } while (var63 == 0 || var63 == 1);
                            var78++;
                            byte var84 = arg0.field768[arg0.field769[arg0.field770[0]] & 0xFF];
                            arg0.field760[var84 & 0xFF] += var78;
                            while (var78 > 0) {
                                class18.field764[var58] = var84 & 0xFF;
                                var58++;
                                var78--;
                            }
                        } else {
                            int var64 = var63 - 1;
                            byte var66;
                            if (var64 < 16) {
                                int var65 = arg0.field770[0];
                                var66 = arg0.field769[var64 + var65];
                                while (var64 > 3) {
                                    int var67 = var64 + var65;
                                    arg0.field769[var67] = arg0.field769[var67 - 1];
                                    arg0.field769[var67 - 1] = arg0.field769[var67 - 2];
                                    arg0.field769[var67 - 2] = arg0.field769[var67 - 3];
                                    arg0.field769[var67 - 3] = arg0.field769[var67 - 4];
                                    var64 -= 4;
                                }
                                while (var64 > 0) {
                                    arg0.field769[var64 + var65] = arg0.field769[var64 + var65 - 1];
                                    var64--;
                                }
                                arg0.field769[var65] = var66;
                            } else {
                                int var68 = var64 / 16;
                                int var69 = var64 % 16;
                                int var70 = arg0.field770[var68] + var69;
                                var66 = arg0.field769[var70];
                                while (var70 > arg0.field770[var68]) {
                                    arg0.field769[var70] = arg0.field769[var70 - 1];
                                    var70--;
                                }
                                int var10002 = arg0.field770[var68]++;
                                while (var68 > 0) {
                                    var10002 = arg0.field770[var68]--;
                                    arg0.field769[arg0.field770[var68]] = arg0.field769[arg0.field770[var68 - 1] + 16 - 1];
                                    var68--;
                                }
                                var10002 = arg0.field770[0]--;
                                arg0.field769[arg0.field770[0]] = var66;
                                if (arg0.field770[0] == 0) {
                                    int var71 = 4095;
                                    for (int var72 = 15; var72 >= 0; var72--) {
                                        for (int var73 = 15; var73 >= 0; var73--) {
                                            arg0.field769[var71] = arg0.field769[arg0.field770[var72] + var73];
                                            var71--;
                                        }
                                        arg0.field770[var72] = var71 + 1;
                                    }
                                }
                            }
                            arg0.field760[arg0.field768[var66 & 0xFF] & 0xFF]++;
                            class18.field764[var58] = arg0.field768[var66 & 0xFF] & 0xFF;
                            var58++;
                            if (var104 == 0) {
                                var53++;
                                var104 = 50;
                                byte var74 = arg0.field771[var53];
                                var20 = arg0.field777[var74];
                                var21 = arg0.field774[var74];
                                var23 = arg0.field776[var74];
                                var22 = arg0.field775[var74];
                            }
                            var104--;
                            int var75 = var20;
                            int var76;
                            byte var77;
                            for (var76 = method182(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
                                var75++;
                                var77 = method181(arg0);
                            }
                            var63 = var23[var76 - var22[var75]];
                        }
                    }
                    arg0.field751 = 0;
                    arg0.field750 = 0;
                    arg0.field762[0] = 0;
                    for (int var85 = 1; var85 <= 256; var85++) {
                        arg0.field762[var85] = arg0.field760[var85 - 1];
                    }
                    for (int var86 = 1; var86 <= 256; var86++) {
                        arg0.field762[var86] += arg0.field762[var86 - 1];
                    }
                    for (int var87 = 0; var87 < var58; var87++) {
                        byte var88 = (byte) (class18.field764[var87] & 0xFF);
                        class18.field764[arg0.field762[var88 & 0xFF]] |= var87 << 8;
                        arg0.field762[var88 & 0xFF]++;
                    }
                    arg0.field758 = class18.field764[arg0.field757] >> 8;
                    arg0.field761 = 0;
                    arg0.field758 = class18.field764[arg0.field758];
                    arg0.field759 = (byte) (arg0.field758 & 0xFF);
                    arg0.field758 >>= 0x8;
                    arg0.field761++;
                    arg0.field778 = var58;
                    method178(arg0);
                    if (arg0.field778 + 1 == arg0.field761 && arg0.field751 == 0) {
                        var24 = true;
                        break;
                    }
                    var24 = false;
                    break;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!DKFTTKQA", name = "c", descriptor = "(LFQNHUIBP;)B")
    private static byte method180(class18 arg0) {
        return (byte) method182(8, arg0);
    }

    @OriginalMember(owner = "client!DKFTTKQA", name = "d", descriptor = "(LFQNHUIBP;)B")
    private static byte method181(class18 arg0) {
        return (byte) method182(1, arg0);
    }

    @OriginalMember(owner = "client!DKFTTKQA", name = "a", descriptor = "(ILFQNHUIBP;)I")
    private static int method182(int arg0, class18 arg1) {
        while (arg1.field754 < arg0) {
            arg1.field753 = arg1.field753 << 8 | arg1.field740[arg1.field741] & 0xFF;
            arg1.field754 += 8;
            arg1.field741++;
            arg1.field742--;
            arg1.field743++;
            if (arg1.field743 == 0) {
                arg1.field744++;
            }
        }
        int var2 = arg1.field753 >> arg1.field754 - arg0 & (0x1 << arg0) - 1;
        arg1.field754 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!DKFTTKQA", name = "e", descriptor = "(LFQNHUIBP;)V")
    private static void method183(class18 arg0) {
        arg0.field765 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field766[var1]) {
                arg0.field768[arg0.field765] = (byte) var1;
                arg0.field765++;
            }
        }
    }

    @OriginalMember(owner = "client!DKFTTKQA", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method184(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
}
