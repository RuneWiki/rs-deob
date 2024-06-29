import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class464 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lsa;")
    private static class124 field6496 = new class124();

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lsa;)V")
    private static final void method2718(class124 arg0) {
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
        arg0.field1553 = 1;
        if (class84.field1030 == null) {
            class84.field1030 = new int[arg0.field1553 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method2722(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method2722(arg0);
                byte var26 = method2722(arg0);
                byte var27 = method2722(arg0);
                byte var28 = method2722(arg0);
                byte var29 = method2722(arg0);
                byte var30 = method2722(arg0);
                byte var31 = method2722(arg0);
                byte var32 = method2722(arg0);
                byte var33 = method2722(arg0);
                byte var34 = method2723(arg0);
                arg0.field1563 = 0;
                byte var35 = method2722(arg0);
                arg0.field1563 = arg0.field1563 << 8 | var35 & 0xFF;
                byte var36 = method2722(arg0);
                arg0.field1563 = arg0.field1563 << 8 | var36 & 0xFF;
                byte var37 = method2722(arg0);
                arg0.field1563 = arg0.field1563 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var101 = method2723(arg0);
                    if (var101 == 1) {
                        arg0.field1532[var38] = true;
                    } else {
                        arg0.field1532[var38] = false;
                    }
                }
                for (int var39 = 0; var39 < 256; var39++) {
                    arg0.field1539[var39] = false;
                }
                for (int var40 = 0; var40 < 16; var40++) {
                    if (arg0.field1532[var40]) {
                        for (int var99 = 0; var99 < 16; var99++) {
                            byte var100 = method2723(arg0);
                            if (var100 == 1) {
                                arg0.field1539[var40 * 16 + var99] = true;
                            }
                        }
                    }
                }
                method2720(arg0);
                int var41 = arg0.field1538 + 2;
                int var42 = method2724(3, arg0);
                int var43 = method2724(15, arg0);
                for (int var44 = 0; var44 < var43; var44++) {
                    int var97 = 0;
                    while (true) {
                        byte var98 = method2723(arg0);
                        if (var98 == 0) {
                            arg0.field1529[var44] = (byte) var97;
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
                    byte var95 = arg0.field1529[var47];
                    byte var96 = var45[var95];
                    while (var95 > 0) {
                        var45[var95] = var45[var95 - 1];
                        var95--;
                    }
                    var45[0] = var96;
                    arg0.field1548[var47] = var96;
                }
                for (int var48 = 0; var48 < var42; var48++) {
                    int var91 = method2724(5, arg0);
                    for (int var92 = 0; var92 < var41; var92++) {
                        while (true) {
                            byte var93 = method2723(arg0);
                            if (var93 == 0) {
                                arg0.field1549[var48][var92] = (byte) var91;
                                break;
                            }
                            byte var94 = method2723(arg0);
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
                        if (arg0.field1549[var49][var90] > var89) {
                            var89 = arg0.field1549[var49][var90];
                        }
                        if (arg0.field1549[var49][var90] < var88) {
                            var88 = arg0.field1549[var49][var90];
                        }
                    }
                    method2719(arg0.field1554[var49], arg0.field1543[var49], arg0.field1531[var49], arg0.field1549[var49], var88, var89, var41);
                    arg0.field1558[var49] = var88;
                }
                int var50 = arg0.field1538 + 1;
                int var51 = -1;
                byte var52 = 0;
                for (int var53 = 0; var53 <= 255; var53++) {
                    arg0.field1533[var53] = 0;
                }
                int var54 = 4095;
                for (int var55 = 15; var55 >= 0; var55--) {
                    for (int var87 = 15; var87 >= 0; var87--) {
                        arg0.field1540[var54] = (byte) (var55 * 16 + var87);
                        var54--;
                    }
                    arg0.field1530[var55] = var54 + 1;
                }
                int var56 = 0;
                if (var52 == 0) {
                    var51++;
                    var52 = 50;
                    byte var57 = arg0.field1548[var51];
                    var19 = arg0.field1558[var57];
                    var20 = arg0.field1554[var57];
                    var22 = arg0.field1531[var57];
                    var21 = arg0.field1543[var57];
                }
                int var102 = var52 - 1;
                int var58 = var19;
                int var59;
                byte var60;
                for (var59 = method2724(var19, arg0); var59 > var20[var58]; var59 = var59 << 1 | var60) {
                    var58++;
                    var60 = method2723(arg0);
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
                                    byte var78 = arg0.field1548[var51];
                                    var19 = arg0.field1558[var78];
                                    var20 = arg0.field1554[var78];
                                    var22 = arg0.field1531[var78];
                                    var21 = arg0.field1543[var78];
                                }
                                var102--;
                                int var79 = var19;
                                int var80;
                                byte var81;
                                for (var80 = method2724(var19, arg0); var80 > var20[var79]; var80 = var80 << 1 | var81) {
                                    var79++;
                                    var81 = method2723(arg0);
                                }
                                var61 = var22[var80 - var21[var79]];
                            } while (var61 == 0 || var61 == 1);
                            var76++;
                            byte var82 = arg0.field1535[arg0.field1540[arg0.field1530[0]] & 0xFF];
                            arg0.field1533[var82 & 0xFF] += var76;
                            while (var76 > 0) {
                                class84.field1030[var56] = var82 & 0xFF;
                                var56++;
                                var76--;
                            }
                        } else {
                            int var62 = var61 - 1;
                            byte var64;
                            if (var62 < 16) {
                                int var63 = arg0.field1530[0];
                                var64 = arg0.field1540[var62 + var63];
                                while (var62 > 3) {
                                    int var65 = var62 + var63;
                                    arg0.field1540[var65] = arg0.field1540[var65 - 1];
                                    arg0.field1540[var65 - 1] = arg0.field1540[var65 - 2];
                                    arg0.field1540[var65 - 2] = arg0.field1540[var65 - 3];
                                    arg0.field1540[var65 - 3] = arg0.field1540[var65 - 4];
                                    var62 -= 4;
                                }
                                while (var62 > 0) {
                                    arg0.field1540[var62 + var63] = arg0.field1540[var62 + var63 - 1];
                                    var62--;
                                }
                                arg0.field1540[var63] = var64;
                            } else {
                                int var66 = var62 / 16;
                                int var67 = var62 % 16;
                                int var68 = arg0.field1530[var66] + var67;
                                var64 = arg0.field1540[var68];
                                while (var68 > arg0.field1530[var66]) {
                                    arg0.field1540[var68] = arg0.field1540[var68 - 1];
                                    var68--;
                                }
                                int var10002 = arg0.field1530[var66]++;
                                while (var66 > 0) {
                                    var10002 = arg0.field1530[var66]--;
                                    arg0.field1540[arg0.field1530[var66]] = arg0.field1540[arg0.field1530[var66 - 1] + 16 - 1];
                                    var66--;
                                }
                                var10002 = arg0.field1530[0]--;
                                arg0.field1540[arg0.field1530[0]] = var64;
                                if (arg0.field1530[0] == 0) {
                                    int var69 = 4095;
                                    for (int var70 = 15; var70 >= 0; var70--) {
                                        for (int var71 = 15; var71 >= 0; var71--) {
                                            arg0.field1540[var69] = arg0.field1540[arg0.field1530[var70] + var71];
                                            var69--;
                                        }
                                        arg0.field1530[var70] = var69 + 1;
                                    }
                                }
                            }
                            arg0.field1533[arg0.field1535[var64 & 0xFF] & 0xFF]++;
                            class84.field1030[var56] = arg0.field1535[var64 & 0xFF] & 0xFF;
                            var56++;
                            if (var102 == 0) {
                                var51++;
                                var102 = 50;
                                byte var72 = arg0.field1548[var51];
                                var19 = arg0.field1558[var72];
                                var20 = arg0.field1554[var72];
                                var22 = arg0.field1531[var72];
                                var21 = arg0.field1543[var72];
                            }
                            var102--;
                            int var73 = var19;
                            int var74;
                            byte var75;
                            for (var74 = method2724(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var75) {
                                var73++;
                                var75 = method2723(arg0);
                            }
                            var61 = var22[var74 - var21[var73]];
                        }
                    }
                    arg0.field1537 = 0;
                    arg0.field1534 = 0;
                    arg0.field1550[0] = 0;
                    for (int var83 = 1; var83 <= 256; var83++) {
                        arg0.field1550[var83] = arg0.field1533[var83 - 1];
                    }
                    for (int var84 = 1; var84 <= 256; var84++) {
                        arg0.field1550[var84] += arg0.field1550[var84 - 1];
                    }
                    for (int var85 = 0; var85 < var56; var85++) {
                        byte var86 = (byte) (class84.field1030[var85] & 0xFF);
                        class84.field1030[arg0.field1550[var86 & 0xFF]] |= var85 << 8;
                        arg0.field1550[var86 & 0xFF]++;
                    }
                    arg0.field1541 = class84.field1030[arg0.field1563] >> 8;
                    arg0.field1527 = 0;
                    arg0.field1541 = class84.field1030[arg0.field1541];
                    arg0.field1565 = (byte) (arg0.field1541 & 0xFF);
                    arg0.field1541 >>= 0x8;
                    arg0.field1527++;
                    arg0.field1556 = var56;
                    method2725(arg0);
                    if (arg0.field1556 + 1 == arg0.field1527 && arg0.field1537 == 0) {
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

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([I[I[I[BIII)V")
    private static final void method2719(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Lsa;)V")
    private static final void method2720(class124 arg0) {
        arg0.field1538 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field1539[var1]) {
                arg0.field1535[arg0.field1538] = (byte) var1;
                arg0.field1538++;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([BI[BII)I")
    public static final int method2721(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class124 var5 = field6496;
        synchronized (field6496) {
            field6496.field1536 = arg2;
            field6496.field1528 = arg4;
            field6496.field1557 = arg0;
            field6496.field1552 = 0;
            field6496.field1544 = arg1;
            field6496.field1526 = 0;
            field6496.field1562 = 0;
            field6496.field1545 = 0;
            field6496.field1547 = 0;
            method2718(field6496);
            int var6 = arg1 - field6496.field1544;
            field6496.field1536 = null;
            field6496.field1557 = null;
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(Lsa;)B")
    private static final byte method2722(class124 arg0) {
        return (byte) method2724(8, arg0);
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(Lsa;)B")
    private static final byte method2723(class124 arg0) {
        return (byte) method2724(1, arg0);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILsa;)I")
    private static final int method2724(int arg0, class124 arg1) {
        while (arg1.field1526 < arg0) {
            arg1.field1562 = arg1.field1562 << 8 | arg1.field1536[arg1.field1528] & 0xFF;
            arg1.field1526 += 8;
            arg1.field1528++;
            arg1.field1545++;
        }
        int var2 = arg1.field1562 >> arg1.field1526 - arg0 & (0x1 << arg0) - 1;
        arg1.field1526 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(Lsa;)V")
    private static final void method2725(class124 arg0) {
        byte var1 = arg0.field1534;
        int var2 = arg0.field1537;
        int var3 = arg0.field1527;
        int var4 = arg0.field1565;
        int[] var5 = class84.field1030;
        int var6 = arg0.field1541;
        byte[] var7 = arg0.field1557;
        int var8 = arg0.field1552;
        int var9 = arg0.field1544;
        int var10 = var9;
        int var11 = arg0.field1556 + 1;
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
        int var23 = arg0.field1547;
        arg0.field1547 += var10 - var9;
        arg0.field1534 = var1;
        arg0.field1537 = var2;
        arg0.field1527 = var3;
        arg0.field1565 = var4;
        class84.field1030 = var5;
        arg0.field1541 = var6;
        arg0.field1557 = var7;
        arg0.field1552 = var8;
        arg0.field1544 = var9;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
    public static void method2726() {
        field6496 = null;
    }
}
