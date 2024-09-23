import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WLDGGJJE")
public class class57 {

    @OriginalMember(owner = "WLDGGJJE", name = "a", descriptor = "LRBCDFWXD;")
    private static class45 field1548 = new class45();

    @OriginalMember(owner = "WLDGGJJE", name = "a", descriptor = "([BI[BII)I")
    public static int method538(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class45 var5 = field1548;
        synchronized (field1548) {
            field1548.field1298 = arg2;
            field1548.field1299 = arg4;
            field1548.field1303 = arg0;
            field1548.field1304 = 0;
            field1548.field1300 = arg3;
            field1548.field1305 = arg1;
            field1548.field1312 = 0;
            field1548.field1311 = 0;
            field1548.field1301 = 0;
            field1548.field1302 = 0;
            field1548.field1306 = 0;
            field1548.field1307 = 0;
            field1548.field1314 = 0;
            method540(field1548);
            int var6 = arg1 - field1548.field1305;
            if (class34.field1089) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "WLDGGJJE", name = "a", descriptor = "(LRBCDFWXD;)V")
    private static void method539(class45 arg0) {
        byte var1 = arg0.field1308;
        int var2 = arg0.field1309;
        int var3 = arg0.field1319;
        int var4 = arg0.field1317;
        int[] var5 = class45.field1322;
        int var6 = arg0.field1316;
        byte[] var7 = arg0.field1303;
        int var8 = arg0.field1304;
        int var9 = arg0.field1305;
        int var10 = var9;
        int var11 = arg0.field1336 + 1;
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
        int var23 = arg0.field1306;
        arg0.field1306 += var10 - var9;
        if (arg0.field1306 < var23) {
            arg0.field1307++;
        }
        arg0.field1308 = var1;
        arg0.field1309 = var2;
        arg0.field1319 = var3;
        arg0.field1317 = var4;
        class45.field1322 = var5;
        arg0.field1316 = var6;
        arg0.field1303 = var7;
        arg0.field1304 = var8;
        arg0.field1305 = var9;
    }

    @OriginalMember(owner = "WLDGGJJE", name = "b", descriptor = "(LRBCDFWXD;)V")
    private static void method540(class45 arg0) {
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
        arg0.field1313 = 1;
        if (class45.field1322 == null) {
            class45.field1322 = new int[arg0.field1313 * 100000];
        }
        boolean var24 = true;
        while (true) {
            while (var24) {
                byte var25 = method541(arg0);
                if (var25 == 23) {
                    return;
                }
                byte var26 = method541(arg0);
                byte var27 = method541(arg0);
                byte var28 = method541(arg0);
                byte var29 = method541(arg0);
                byte var30 = method541(arg0);
                arg0.field1314++;
                byte var31 = method541(arg0);
                byte var32 = method541(arg0);
                byte var33 = method541(arg0);
                byte var34 = method541(arg0);
                byte var35 = method542(arg0);
                if (var35 == 0) {
                    arg0.field1310 = false;
                } else {
                    arg0.field1310 = true;
                }
                if (arg0.field1310) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field1315 = 0;
                byte var36 = method541(arg0);
                arg0.field1315 = arg0.field1315 << 8 | var36 & 0xFF;
                byte var37 = method541(arg0);
                arg0.field1315 = arg0.field1315 << 8 | var37 & 0xFF;
                byte var38 = method541(arg0);
                arg0.field1315 = arg0.field1315 << 8 | var38 & 0xFF;
                for (int var39 = 0; var39 < 16; var39++) {
                    byte var103 = method542(arg0);
                    if (var103 == 1) {
                        arg0.field1325[var39] = true;
                    } else {
                        arg0.field1325[var39] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field1324[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field1325[var41]) {
                        for (int var101 = 0; var101 < 16; var101++) {
                            byte var102 = method542(arg0);
                            if (var102 == 1) {
                                arg0.field1324[var41 * 16 + var101] = true;
                            }
                        }
                    }
                }
                method544(arg0);
                int var42 = arg0.field1323 + 2;
                int var43 = method543(3, arg0);
                int var44 = method543(15, arg0);
                for (int var45 = 0; var45 < var44; var45++) {
                    int var99 = 0;
                    while (true) {
                        byte var100 = method542(arg0);
                        if (var100 == 0) {
                            arg0.field1330[var45] = (byte) var99;
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
                    byte var97 = arg0.field1330[var48];
                    byte var98 = var46[var97];
                    while (var97 > 0) {
                        var46[var97] = var46[var97 - 1];
                        var97--;
                    }
                    var46[0] = var98;
                    arg0.field1329[var48] = var98;
                }
                for (int var49 = 0; var49 < var43; var49++) {
                    int var93 = method543(5, arg0);
                    for (int var94 = 0; var94 < var42; var94++) {
                        while (true) {
                            byte var95 = method542(arg0);
                            if (var95 == 0) {
                                arg0.field1331[var49][var94] = (byte) var93;
                                break;
                            }
                            byte var96 = method542(arg0);
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
                        if (arg0.field1331[var50][var92] > var91) {
                            var91 = arg0.field1331[var50][var92];
                        }
                        if (arg0.field1331[var50][var92] < var90) {
                            var90 = arg0.field1331[var50][var92];
                        }
                    }
                    method545(arg0.field1332[var50], arg0.field1333[var50], arg0.field1334[var50], arg0.field1331[var50], var90, var91, var42);
                    arg0.field1335[var50] = var90;
                }
                int var51 = arg0.field1323 + 1;
                int var52 = arg0.field1313 * 100000;
                int var53 = -1;
                byte var54 = 0;
                for (int var55 = 0; var55 <= 255; var55++) {
                    arg0.field1318[var55] = 0;
                }
                int var56 = 4095;
                for (int var57 = 15; var57 >= 0; var57--) {
                    for (int var89 = 15; var89 >= 0; var89--) {
                        arg0.field1327[var56] = (byte) (var57 * 16 + var89);
                        var56--;
                    }
                    arg0.field1328[var57] = var56 + 1;
                }
                int var58 = 0;
                if (var54 == 0) {
                    var53++;
                    var54 = 50;
                    byte var59 = arg0.field1329[var53];
                    var20 = arg0.field1335[var59];
                    var21 = arg0.field1332[var59];
                    var23 = arg0.field1334[var59];
                    var22 = arg0.field1333[var59];
                }
                int var104 = var54 - 1;
                int var60 = var20;
                int var61;
                byte var62;
                for (var61 = method543(var20, arg0); var61 > var21[var60]; var61 = var61 << 1 | var62) {
                    var60++;
                    var62 = method542(arg0);
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
                                    byte var80 = arg0.field1329[var53];
                                    var20 = arg0.field1335[var80];
                                    var21 = arg0.field1332[var80];
                                    var23 = arg0.field1334[var80];
                                    var22 = arg0.field1333[var80];
                                }
                                var104--;
                                int var81 = var20;
                                int var82;
                                byte var83;
                                for (var82 = method543(var20, arg0); var82 > var21[var81]; var82 = var82 << 1 | var83) {
                                    var81++;
                                    var83 = method542(arg0);
                                }
                                var63 = var23[var82 - var22[var81]];
                            } while (var63 == 0 || var63 == 1);
                            var78++;
                            byte var84 = arg0.field1326[arg0.field1327[arg0.field1328[0]] & 0xFF];
                            arg0.field1318[var84 & 0xFF] += var78;
                            while (var78 > 0) {
                                class45.field1322[var58] = var84 & 0xFF;
                                var58++;
                                var78--;
                            }
                        } else {
                            int var64 = var63 - 1;
                            byte var66;
                            if (var64 < 16) {
                                int var65 = arg0.field1328[0];
                                var66 = arg0.field1327[var64 + var65];
                                while (var64 > 3) {
                                    int var67 = var64 + var65;
                                    arg0.field1327[var67] = arg0.field1327[var67 - 1];
                                    arg0.field1327[var67 - 1] = arg0.field1327[var67 - 2];
                                    arg0.field1327[var67 - 2] = arg0.field1327[var67 - 3];
                                    arg0.field1327[var67 - 3] = arg0.field1327[var67 - 4];
                                    var64 -= 4;
                                }
                                while (var64 > 0) {
                                    arg0.field1327[var64 + var65] = arg0.field1327[var64 + var65 - 1];
                                    var64--;
                                }
                                arg0.field1327[var65] = var66;
                            } else {
                                int var68 = var64 / 16;
                                int var69 = var64 % 16;
                                int var70 = arg0.field1328[var68] + var69;
                                var66 = arg0.field1327[var70];
                                while (var70 > arg0.field1328[var68]) {
                                    arg0.field1327[var70] = arg0.field1327[var70 - 1];
                                    var70--;
                                }
                                int var10002 = arg0.field1328[var68]++;
                                while (var68 > 0) {
                                    var10002 = arg0.field1328[var68]--;
                                    arg0.field1327[arg0.field1328[var68]] = arg0.field1327[arg0.field1328[var68 - 1] + 16 - 1];
                                    var68--;
                                }
                                var10002 = arg0.field1328[0]--;
                                arg0.field1327[arg0.field1328[0]] = var66;
                                if (arg0.field1328[0] == 0) {
                                    int var71 = 4095;
                                    for (int var72 = 15; var72 >= 0; var72--) {
                                        for (int var73 = 15; var73 >= 0; var73--) {
                                            arg0.field1327[var71] = arg0.field1327[arg0.field1328[var72] + var73];
                                            var71--;
                                        }
                                        arg0.field1328[var72] = var71 + 1;
                                    }
                                }
                            }
                            arg0.field1318[arg0.field1326[var66 & 0xFF] & 0xFF]++;
                            class45.field1322[var58] = arg0.field1326[var66 & 0xFF] & 0xFF;
                            var58++;
                            if (var104 == 0) {
                                var53++;
                                var104 = 50;
                                byte var74 = arg0.field1329[var53];
                                var20 = arg0.field1335[var74];
                                var21 = arg0.field1332[var74];
                                var23 = arg0.field1334[var74];
                                var22 = arg0.field1333[var74];
                            }
                            var104--;
                            int var75 = var20;
                            int var76;
                            byte var77;
                            for (var76 = method543(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
                                var75++;
                                var77 = method542(arg0);
                            }
                            var63 = var23[var76 - var22[var75]];
                        }
                    }
                    arg0.field1309 = 0;
                    arg0.field1308 = 0;
                    arg0.field1320[0] = 0;
                    for (int var85 = 1; var85 <= 256; var85++) {
                        arg0.field1320[var85] = arg0.field1318[var85 - 1];
                    }
                    for (int var86 = 1; var86 <= 256; var86++) {
                        arg0.field1320[var86] += arg0.field1320[var86 - 1];
                    }
                    for (int var87 = 0; var87 < var58; var87++) {
                        byte var88 = (byte) (class45.field1322[var87] & 0xFF);
                        class45.field1322[arg0.field1320[var88 & 0xFF]] |= var87 << 8;
                        arg0.field1320[var88 & 0xFF]++;
                    }
                    arg0.field1316 = class45.field1322[arg0.field1315] >> 8;
                    arg0.field1319 = 0;
                    arg0.field1316 = class45.field1322[arg0.field1316];
                    arg0.field1317 = (byte) (arg0.field1316 & 0xFF);
                    arg0.field1316 >>= 0x8;
                    arg0.field1319++;
                    arg0.field1336 = var58;
                    method539(arg0);
                    if (arg0.field1336 + 1 == arg0.field1319 && arg0.field1309 == 0) {
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

    @OriginalMember(owner = "WLDGGJJE", name = "c", descriptor = "(LRBCDFWXD;)B")
    private static byte method541(class45 arg0) {
        return (byte) method543(8, arg0);
    }

    @OriginalMember(owner = "WLDGGJJE", name = "d", descriptor = "(LRBCDFWXD;)B")
    private static byte method542(class45 arg0) {
        return (byte) method543(1, arg0);
    }

    @OriginalMember(owner = "WLDGGJJE", name = "a", descriptor = "(ILRBCDFWXD;)I")
    private static int method543(int arg0, class45 arg1) {
        while (arg1.field1312 < arg0) {
            arg1.field1311 = arg1.field1311 << 8 | arg1.field1298[arg1.field1299] & 0xFF;
            arg1.field1312 += 8;
            arg1.field1299++;
            arg1.field1300--;
            arg1.field1301++;
            if (arg1.field1301 == 0) {
                arg1.field1302++;
            }
        }
        int var2 = arg1.field1311 >> arg1.field1312 - arg0 & (0x1 << arg0) - 1;
        arg1.field1312 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "WLDGGJJE", name = "e", descriptor = "(LRBCDFWXD;)V")
    private static void method544(class45 arg0) {
        arg0.field1323 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field1324[var1]) {
                arg0.field1326[arg0.field1323] = (byte) var1;
                arg0.field1323++;
            }
        }
    }

    @OriginalMember(owner = "WLDGGJJE", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method545(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
