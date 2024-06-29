import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class296 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lck;")
    private static class91 field4546 = new class91();

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lck;)V", line = 8)
    private static final void method1938(class91 arg0) {
        byte var1 = arg0.field1392;
        int var2 = arg0.field1400;
        int var3 = arg0.field1406;
        int var4 = arg0.field1401;
        int[] var5 = class148.field2338;
        int var6 = arg0.field1384;
        byte[] var7 = arg0.field1414;
        int var8 = arg0.field1403;
        int var9 = arg0.field1413;
        int var10 = var9;
        int var11 = arg0.field1389 + 1;
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
        int var15 = arg0.field1394;
        arg0.field1394 += var10 - var9;
        if (arg0.field1394 < var15) {
        }
        arg0.field1392 = var1;
        arg0.field1400 = var2;
        arg0.field1406 = var3;
        arg0.field1401 = var4;
        class148.field2338 = var5;
        arg0.field1384 = var6;
        arg0.field1414 = var7;
        arg0.field1403 = var8;
        arg0.field1413 = var9;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 165)
    public static void method1939() {
        field4546 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lck;)V", line = 182)
    private static final void method1940(class91 arg0) {
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
        arg0.field1411 = 1;
        if (class148.field2338 == null) {
            class148.field2338 = new int[arg0.field1411 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method1943(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method1943(arg0);
                byte var26 = method1943(arg0);
                byte var27 = method1943(arg0);
                byte var28 = method1943(arg0);
                byte var29 = method1943(arg0);
                byte var30 = method1943(arg0);
                byte var31 = method1943(arg0);
                byte var32 = method1943(arg0);
                byte var33 = method1943(arg0);
                byte var34 = method1946(arg0);
                if (var34 != 0) {
                }
                arg0.field1405 = 0;
                byte var35 = method1943(arg0);
                arg0.field1405 = arg0.field1405 << 8 | var35 & 0xFF;
                byte var36 = method1943(arg0);
                arg0.field1405 = arg0.field1405 << 8 | var36 & 0xFF;
                byte var37 = method1943(arg0);
                arg0.field1405 = arg0.field1405 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var39 = method1946(arg0);
                    if (var39 == 1) {
                        arg0.field1385[var38] = true;
                    } else {
                        arg0.field1385[var38] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field1409[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field1385[var41]) {
                        for (int var42 = 0; var42 < 16; var42++) {
                            byte var43 = method1946(arg0);
                            if (var43 == 1) {
                                arg0.field1409[var41 * 16 + var42] = true;
                            }
                        }
                    }
                }
                method1941(arg0);
                int var44 = arg0.field1390 + 2;
                int var45 = method1945(3, arg0);
                int var46 = method1945(15, arg0);
                for (int var47 = 0; var47 < var46; var47++) {
                    int var48 = 0;
                    while (true) {
                        byte var49 = method1946(arg0);
                        if (var49 == 0) {
                            arg0.field1387[var47] = (byte) var48;
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
                    byte var53 = arg0.field1387[var52];
                    byte var54 = var50[var53];
                    while (var53 > 0) {
                        var50[var53] = var50[var53 - 1];
                        var53--;
                    }
                    var50[0] = var54;
                    arg0.field1407[var52] = var54;
                }
                for (int var55 = 0; var55 < var45; var55++) {
                    int var56 = method1945(5, arg0);
                    for (int var57 = 0; var57 < var44; var57++) {
                        while (true) {
                            byte var58 = method1946(arg0);
                            if (var58 == 0) {
                                arg0.field1397[var55][var57] = (byte) var56;
                                break;
                            }
                            byte var59 = method1946(arg0);
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
                        if (arg0.field1397[var60][var63] > var62) {
                            var62 = arg0.field1397[var60][var63];
                        }
                        if (arg0.field1397[var60][var63] < var61) {
                            var61 = arg0.field1397[var60][var63];
                        }
                    }
                    method1942(arg0.field1396[var60], arg0.field1398[var60], arg0.field1408[var60], arg0.field1397[var60], var61, var62, var44);
                    arg0.field1391[var60] = var61;
                }
                int var64 = arg0.field1390 + 1;
                int var65 = -1;
                byte var66 = 0;
                for (int var67 = 0; var67 <= 255; var67++) {
                    arg0.field1395[var67] = 0;
                }
                int var68 = 4095;
                for (int var69 = 15; var69 >= 0; var69--) {
                    for (int var70 = 15; var70 >= 0; var70--) {
                        arg0.field1410[var68] = (byte) (var69 * 16 + var70);
                        var68--;
                    }
                    arg0.field1388[var69] = var68 + 1;
                }
                int var71 = 0;
                if (var66 == 0) {
                    var65++;
                    var66 = 50;
                    byte var72 = arg0.field1407[var65];
                    var19 = arg0.field1391[var72];
                    var20 = arg0.field1396[var72];
                    var22 = arg0.field1408[var72];
                    var21 = arg0.field1398[var72];
                }
                int var102 = var66 - 1;
                int var73 = var19;
                int var74;
                byte var101;
                for (var74 = method1945(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var101) {
                    var73++;
                    var101 = method1946(arg0);
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
                                    byte var96 = arg0.field1407[var65];
                                    var19 = arg0.field1391[var96];
                                    var20 = arg0.field1396[var96];
                                    var22 = arg0.field1408[var96];
                                    var21 = arg0.field1398[var96];
                                }
                                var102--;
                                int var97 = var19;
                                int var98;
                                byte var100;
                                for (var98 = method1945(var19, arg0); var98 > var20[var97]; var98 = var98 << 1 | var100) {
                                    var97++;
                                    var100 = method1946(arg0);
                                }
                                var75 = var22[var98 - var21[var97]];
                            } while (var75 == 0 || var75 == 1);
                            var94++;
                            byte var99 = arg0.field1402[arg0.field1410[arg0.field1388[0]] & 0xFF];
                            arg0.field1395[var99 & 0xFF] += var94;
                            while (var94 > 0) {
                                class148.field2338[var71] = var99 & 0xFF;
                                var71++;
                                var94--;
                            }
                        } else {
                            int var80 = var75 - 1;
                            byte var82;
                            if (var80 < 16) {
                                int var81 = arg0.field1388[0];
                                var82 = arg0.field1410[var80 + var81];
                                while (var80 > 3) {
                                    int var83 = var80 + var81;
                                    arg0.field1410[var83] = arg0.field1410[var83 - 1];
                                    arg0.field1410[var83 - 1] = arg0.field1410[var83 - 2];
                                    arg0.field1410[var83 - 2] = arg0.field1410[var83 - 3];
                                    arg0.field1410[var83 - 3] = arg0.field1410[var83 - 4];
                                    var80 -= 4;
                                }
                                while (var80 > 0) {
                                    arg0.field1410[var80 + var81] = arg0.field1410[var80 + var81 - 1];
                                    var80--;
                                }
                                arg0.field1410[var81] = var82;
                            } else {
                                int var84 = var80 / 16;
                                int var85 = var80 % 16;
                                int var86 = arg0.field1388[var84] + var85;
                                var82 = arg0.field1410[var86];
                                while (var86 > arg0.field1388[var84]) {
                                    arg0.field1410[var86] = arg0.field1410[var86 - 1];
                                    var86--;
                                }
                                int var10002 = arg0.field1388[var84]++;
                                while (var84 > 0) {
                                    var10002 = arg0.field1388[var84]--;
                                    arg0.field1410[arg0.field1388[var84]] = arg0.field1410[arg0.field1388[var84 - 1] + 16 - 1];
                                    var84--;
                                }
                                var10002 = arg0.field1388[0]--;
                                arg0.field1410[arg0.field1388[0]] = var82;
                                if (arg0.field1388[0] == 0) {
                                    int var87 = 4095;
                                    for (int var88 = 15; var88 >= 0; var88--) {
                                        for (int var89 = 15; var89 >= 0; var89--) {
                                            arg0.field1410[var87] = arg0.field1410[arg0.field1388[var88] + var89];
                                            var87--;
                                        }
                                        arg0.field1388[var88] = var87 + 1;
                                    }
                                }
                            }
                            arg0.field1395[arg0.field1402[var82 & 0xFF] & 0xFF]++;
                            class148.field2338[var71] = arg0.field1402[var82 & 0xFF] & 0xFF;
                            var71++;
                            if (var102 == 0) {
                                var65++;
                                var102 = 50;
                                byte var90 = arg0.field1407[var65];
                                var19 = arg0.field1391[var90];
                                var20 = arg0.field1396[var90];
                                var22 = arg0.field1408[var90];
                                var21 = arg0.field1398[var90];
                            }
                            var102--;
                            int var91 = var19;
                            int var92;
                            byte var93;
                            for (var92 = method1945(var19, arg0); var92 > var20[var91]; var92 = var92 << 1 | var93) {
                                var91++;
                                var93 = method1946(arg0);
                            }
                            var75 = var22[var92 - var21[var91]];
                        }
                    }
                    arg0.field1400 = 0;
                    arg0.field1392 = 0;
                    arg0.field1399[0] = 0;
                    for (int var76 = 1; var76 <= 256; var76++) {
                        arg0.field1399[var76] = arg0.field1395[var76 - 1];
                    }
                    for (int var77 = 1; var77 <= 256; var77++) {
                        arg0.field1399[var77] += arg0.field1399[var77 - 1];
                    }
                    for (int var78 = 0; var78 < var71; var78++) {
                        byte var79 = (byte) (class148.field2338[var78] & 0xFF);
                        class148.field2338[arg0.field1399[var79 & 0xFF]] |= var78 << 8;
                        arg0.field1399[var79 & 0xFF]++;
                    }
                    arg0.field1384 = class148.field2338[arg0.field1405] >> 8;
                    arg0.field1406 = 0;
                    arg0.field1384 = class148.field2338[arg0.field1384];
                    arg0.field1401 = (byte) (arg0.field1384 & 0xFF);
                    arg0.field1384 >>= 0x8;
                    arg0.field1406++;
                    arg0.field1389 = var71;
                    method1938(arg0);
                    if (arg0.field1389 + 1 == arg0.field1406 && arg0.field1400 == 0) {
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

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Lck;)V", line = 691)
    private static final void method1941(class91 arg0) {
        arg0.field1390 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field1409[var1]) {
                arg0.field1402[arg0.field1390] = (byte) var1;
                arg0.field1390++;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([I[I[I[BIII)V", line = 711)
    private static final void method1942(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(Lck;)B", line = 777)
    private static final byte method1943(class91 arg0) {
        return (byte) method1945(8, arg0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BI[BII)I", line = 783)
    public static final int method1944(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class91 var5 = field4546;
        synchronized (field4546) {
            field4546.field1393 = arg2;
            field4546.field1416 = arg4;
            field4546.field1414 = arg0;
            field4546.field1403 = 0;
            field4546.field1413 = arg1;
            field4546.field1415 = 0;
            field4546.field1383 = 0;
            field4546.field1404 = 0;
            field4546.field1394 = 0;
            method1940(field4546);
            int var6 = arg1 - field4546.field1413;
            field4546.field1393 = null;
            field4546.field1414 = null;
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILck;)I", line = 813)
    private static final int method1945(int arg0, class91 arg1) {
        while (arg1.field1415 < arg0) {
            arg1.field1383 = arg1.field1383 << 8 | arg1.field1393[arg1.field1416] & 0xFF;
            arg1.field1415 += 8;
            arg1.field1416++;
            arg1.field1404++;
            if (arg1.field1404 == 0) {
            }
        }
        int var2 = arg1.field1383 >> arg1.field1415 - arg0 & (0x1 << arg0) - 1;
        arg1.field1415 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(Lck;)B", line = 837)
    private static final byte method1946(class91 arg0) {
        return (byte) method1945(1, arg0);
    }
}
