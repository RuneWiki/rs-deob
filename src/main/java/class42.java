import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ORIOOKBU")
public class class42 {

    @OriginalMember(owner = "ORIOOKBU", name = "a", descriptor = "LBUBYKDEH;")
    private static class7 field1093 = new class7();

    @OriginalMember(owner = "ORIOOKBU", name = "a", descriptor = "([BI[BII)I")
    public static int method396(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class7 var5 = field1093;
        synchronized (field1093) {
            field1093.field138 = arg2;
            field1093.field139 = arg4;
            field1093.field143 = arg0;
            field1093.field144 = 0;
            field1093.field140 = arg3;
            field1093.field145 = arg1;
            field1093.field152 = 0;
            field1093.field151 = 0;
            field1093.field141 = 0;
            field1093.field142 = 0;
            field1093.field146 = 0;
            field1093.field147 = 0;
            field1093.field154 = 0;
            method398(field1093);
            int var6 = arg1 - field1093.field145;
            if (class62.field1590) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "ORIOOKBU", name = "a", descriptor = "(LBUBYKDEH;)V")
    private static void method397(class7 arg0) {
        byte var1 = arg0.field148;
        int var2 = arg0.field149;
        int var3 = arg0.field159;
        int var4 = arg0.field157;
        int[] var5 = class7.field162;
        int var6 = arg0.field156;
        byte[] var7 = arg0.field143;
        int var8 = arg0.field144;
        int var9 = arg0.field145;
        int var10 = var9;
        int var11 = arg0.field176 + 1;
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
        int var23 = arg0.field146;
        arg0.field146 += var10 - var9;
        if (arg0.field146 < var23) {
            arg0.field147++;
        }
        arg0.field148 = var1;
        arg0.field149 = var2;
        arg0.field159 = var3;
        arg0.field157 = var4;
        class7.field162 = var5;
        arg0.field156 = var6;
        arg0.field143 = var7;
        arg0.field144 = var8;
        arg0.field145 = var9;
    }

    @OriginalMember(owner = "ORIOOKBU", name = "b", descriptor = "(LBUBYKDEH;)V")
    private static void method398(class7 arg0) {
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
        arg0.field153 = 1;
        if (class7.field162 == null) {
            class7.field162 = new int[arg0.field153 * 100000];
        }
        boolean var24 = true;
        while (true) {
            while (var24) {
                byte var25 = method399(arg0);
                if (var25 == 23) {
                    return;
                }
                byte var26 = method399(arg0);
                byte var27 = method399(arg0);
                byte var28 = method399(arg0);
                byte var29 = method399(arg0);
                byte var30 = method399(arg0);
                arg0.field154++;
                byte var31 = method399(arg0);
                byte var32 = method399(arg0);
                byte var33 = method399(arg0);
                byte var34 = method399(arg0);
                byte var35 = method400(arg0);
                if (var35 == 0) {
                    arg0.field150 = false;
                } else {
                    arg0.field150 = true;
                }
                if (arg0.field150) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field155 = 0;
                byte var36 = method399(arg0);
                arg0.field155 = arg0.field155 << 8 | var36 & 0xFF;
                byte var37 = method399(arg0);
                arg0.field155 = arg0.field155 << 8 | var37 & 0xFF;
                byte var38 = method399(arg0);
                arg0.field155 = arg0.field155 << 8 | var38 & 0xFF;
                for (int var39 = 0; var39 < 16; var39++) {
                    byte var103 = method400(arg0);
                    if (var103 == 1) {
                        arg0.field165[var39] = true;
                    } else {
                        arg0.field165[var39] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field164[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field165[var41]) {
                        for (int var101 = 0; var101 < 16; var101++) {
                            byte var102 = method400(arg0);
                            if (var102 == 1) {
                                arg0.field164[var41 * 16 + var101] = true;
                            }
                        }
                    }
                }
                method402(arg0);
                int var42 = arg0.field163 + 2;
                int var43 = method401(3, arg0);
                int var44 = method401(15, arg0);
                for (int var45 = 0; var45 < var44; var45++) {
                    int var99 = 0;
                    while (true) {
                        byte var100 = method400(arg0);
                        if (var100 == 0) {
                            arg0.field170[var45] = (byte) var99;
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
                    byte var97 = arg0.field170[var48];
                    byte var98 = var46[var97];
                    while (var97 > 0) {
                        var46[var97] = var46[var97 - 1];
                        var97--;
                    }
                    var46[0] = var98;
                    arg0.field169[var48] = var98;
                }
                for (int var49 = 0; var49 < var43; var49++) {
                    int var93 = method401(5, arg0);
                    for (int var94 = 0; var94 < var42; var94++) {
                        while (true) {
                            byte var95 = method400(arg0);
                            if (var95 == 0) {
                                arg0.field171[var49][var94] = (byte) var93;
                                break;
                            }
                            byte var96 = method400(arg0);
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
                        if (arg0.field171[var50][var92] > var91) {
                            var91 = arg0.field171[var50][var92];
                        }
                        if (arg0.field171[var50][var92] < var90) {
                            var90 = arg0.field171[var50][var92];
                        }
                    }
                    method403(arg0.field172[var50], arg0.field173[var50], arg0.field174[var50], arg0.field171[var50], var90, var91, var42);
                    arg0.field175[var50] = var90;
                }
                int var51 = arg0.field163 + 1;
                int var52 = arg0.field153 * 100000;
                int var53 = -1;
                byte var54 = 0;
                for (int var55 = 0; var55 <= 255; var55++) {
                    arg0.field158[var55] = 0;
                }
                int var56 = 4095;
                for (int var57 = 15; var57 >= 0; var57--) {
                    for (int var89 = 15; var89 >= 0; var89--) {
                        arg0.field167[var56] = (byte) (var57 * 16 + var89);
                        var56--;
                    }
                    arg0.field168[var57] = var56 + 1;
                }
                int var58 = 0;
                if (var54 == 0) {
                    var53++;
                    var54 = 50;
                    byte var59 = arg0.field169[var53];
                    var20 = arg0.field175[var59];
                    var21 = arg0.field172[var59];
                    var23 = arg0.field174[var59];
                    var22 = arg0.field173[var59];
                }
                int var104 = var54 - 1;
                int var60 = var20;
                int var61;
                byte var62;
                for (var61 = method401(var20, arg0); var61 > var21[var60]; var61 = var61 << 1 | var62) {
                    var60++;
                    var62 = method400(arg0);
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
                                    byte var80 = arg0.field169[var53];
                                    var20 = arg0.field175[var80];
                                    var21 = arg0.field172[var80];
                                    var23 = arg0.field174[var80];
                                    var22 = arg0.field173[var80];
                                }
                                var104--;
                                int var81 = var20;
                                int var82;
                                byte var83;
                                for (var82 = method401(var20, arg0); var82 > var21[var81]; var82 = var82 << 1 | var83) {
                                    var81++;
                                    var83 = method400(arg0);
                                }
                                var63 = var23[var82 - var22[var81]];
                            } while (var63 == 0 || var63 == 1);
                            var78++;
                            byte var84 = arg0.field166[arg0.field167[arg0.field168[0]] & 0xFF];
                            arg0.field158[var84 & 0xFF] += var78;
                            while (var78 > 0) {
                                class7.field162[var58] = var84 & 0xFF;
                                var58++;
                                var78--;
                            }
                        } else {
                            int var64 = var63 - 1;
                            byte var66;
                            if (var64 < 16) {
                                int var65 = arg0.field168[0];
                                var66 = arg0.field167[var64 + var65];
                                while (var64 > 3) {
                                    int var67 = var64 + var65;
                                    arg0.field167[var67] = arg0.field167[var67 - 1];
                                    arg0.field167[var67 - 1] = arg0.field167[var67 - 2];
                                    arg0.field167[var67 - 2] = arg0.field167[var67 - 3];
                                    arg0.field167[var67 - 3] = arg0.field167[var67 - 4];
                                    var64 -= 4;
                                }
                                while (var64 > 0) {
                                    arg0.field167[var64 + var65] = arg0.field167[var64 + var65 - 1];
                                    var64--;
                                }
                                arg0.field167[var65] = var66;
                            } else {
                                int var68 = var64 / 16;
                                int var69 = var64 % 16;
                                int var70 = arg0.field168[var68] + var69;
                                var66 = arg0.field167[var70];
                                while (var70 > arg0.field168[var68]) {
                                    arg0.field167[var70] = arg0.field167[var70 - 1];
                                    var70--;
                                }
                                int var10002 = arg0.field168[var68]++;
                                while (var68 > 0) {
                                    var10002 = arg0.field168[var68]--;
                                    arg0.field167[arg0.field168[var68]] = arg0.field167[arg0.field168[var68 - 1] + 16 - 1];
                                    var68--;
                                }
                                var10002 = arg0.field168[0]--;
                                arg0.field167[arg0.field168[0]] = var66;
                                if (arg0.field168[0] == 0) {
                                    int var71 = 4095;
                                    for (int var72 = 15; var72 >= 0; var72--) {
                                        for (int var73 = 15; var73 >= 0; var73--) {
                                            arg0.field167[var71] = arg0.field167[arg0.field168[var72] + var73];
                                            var71--;
                                        }
                                        arg0.field168[var72] = var71 + 1;
                                    }
                                }
                            }
                            arg0.field158[arg0.field166[var66 & 0xFF] & 0xFF]++;
                            class7.field162[var58] = arg0.field166[var66 & 0xFF] & 0xFF;
                            var58++;
                            if (var104 == 0) {
                                var53++;
                                var104 = 50;
                                byte var74 = arg0.field169[var53];
                                var20 = arg0.field175[var74];
                                var21 = arg0.field172[var74];
                                var23 = arg0.field174[var74];
                                var22 = arg0.field173[var74];
                            }
                            var104--;
                            int var75 = var20;
                            int var76;
                            byte var77;
                            for (var76 = method401(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
                                var75++;
                                var77 = method400(arg0);
                            }
                            var63 = var23[var76 - var22[var75]];
                        }
                    }
                    arg0.field149 = 0;
                    arg0.field148 = 0;
                    arg0.field160[0] = 0;
                    for (int var85 = 1; var85 <= 256; var85++) {
                        arg0.field160[var85] = arg0.field158[var85 - 1];
                    }
                    for (int var86 = 1; var86 <= 256; var86++) {
                        arg0.field160[var86] += arg0.field160[var86 - 1];
                    }
                    for (int var87 = 0; var87 < var58; var87++) {
                        byte var88 = (byte) (class7.field162[var87] & 0xFF);
                        class7.field162[arg0.field160[var88 & 0xFF]] |= var87 << 8;
                        arg0.field160[var88 & 0xFF]++;
                    }
                    arg0.field156 = class7.field162[arg0.field155] >> 8;
                    arg0.field159 = 0;
                    arg0.field156 = class7.field162[arg0.field156];
                    arg0.field157 = (byte) (arg0.field156 & 0xFF);
                    arg0.field156 >>= 0x8;
                    arg0.field159++;
                    arg0.field176 = var58;
                    method397(arg0);
                    if (arg0.field176 + 1 == arg0.field159 && arg0.field149 == 0) {
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

    @OriginalMember(owner = "ORIOOKBU", name = "c", descriptor = "(LBUBYKDEH;)B")
    private static byte method399(class7 arg0) {
        return (byte) method401(8, arg0);
    }

    @OriginalMember(owner = "ORIOOKBU", name = "d", descriptor = "(LBUBYKDEH;)B")
    private static byte method400(class7 arg0) {
        return (byte) method401(1, arg0);
    }

    @OriginalMember(owner = "ORIOOKBU", name = "a", descriptor = "(ILBUBYKDEH;)I")
    private static int method401(int arg0, class7 arg1) {
        while (arg1.field152 < arg0) {
            arg1.field151 = arg1.field151 << 8 | arg1.field138[arg1.field139] & 0xFF;
            arg1.field152 += 8;
            arg1.field139++;
            arg1.field140--;
            arg1.field141++;
            if (arg1.field141 == 0) {
                arg1.field142++;
            }
        }
        int var2 = arg1.field151 >> arg1.field152 - arg0 & (0x1 << arg0) - 1;
        arg1.field152 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "ORIOOKBU", name = "e", descriptor = "(LBUBYKDEH;)V")
    private static void method402(class7 arg0) {
        arg0.field163 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field164[var1]) {
                arg0.field166[arg0.field163] = (byte) var1;
                arg0.field163++;
            }
        }
    }

    @OriginalMember(owner = "ORIOOKBU", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method403(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
