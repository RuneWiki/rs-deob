import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OGTHSEHL")
public class class41 {

    @OriginalMember(owner = "client!OGTHSEHL", name = "a", descriptor = "LNLVEZGMS;")
    private static class40 field1299 = new class40();

    @OriginalMember(owner = "client!OGTHSEHL", name = "a", descriptor = "([BI[BII)I")
    public static int method370(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class40 var5 = field1299;
        synchronized (field1299) {
            field1299.field1260 = arg2;
            field1299.field1261 = arg4;
            field1299.field1265 = arg0;
            field1299.field1266 = 0;
            field1299.field1262 = arg3;
            field1299.field1267 = arg1;
            field1299.field1274 = 0;
            field1299.field1273 = 0;
            field1299.field1263 = 0;
            field1299.field1264 = 0;
            field1299.field1268 = 0;
            field1299.field1269 = 0;
            field1299.field1276 = 0;
            method372(field1299);
            int var6 = arg1 - field1299.field1267;
            if (class71.field1729) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!OGTHSEHL", name = "a", descriptor = "(LNLVEZGMS;)V")
    private static void method371(class40 arg0) {
        byte var1 = arg0.field1270;
        int var2 = arg0.field1271;
        int var3 = arg0.field1281;
        int var4 = arg0.field1279;
        int[] var5 = class40.field1284;
        int var6 = arg0.field1278;
        byte[] var7 = arg0.field1265;
        int var8 = arg0.field1266;
        int var9 = arg0.field1267;
        int var10 = var9;
        int var11 = arg0.field1298 + 1;
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
        int var23 = arg0.field1268;
        arg0.field1268 += var10 - var9;
        if (arg0.field1268 < var23) {
            arg0.field1269++;
        }
        arg0.field1270 = var1;
        arg0.field1271 = var2;
        arg0.field1281 = var3;
        arg0.field1279 = var4;
        class40.field1284 = var5;
        arg0.field1278 = var6;
        arg0.field1265 = var7;
        arg0.field1266 = var8;
        arg0.field1267 = var9;
    }

    @OriginalMember(owner = "client!OGTHSEHL", name = "b", descriptor = "(LNLVEZGMS;)V")
    private static void method372(class40 arg0) {
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
        arg0.field1275 = 1;
        if (class40.field1284 == null) {
            class40.field1284 = new int[arg0.field1275 * 100000];
        }
        boolean var24 = true;
        while (true) {
            while (var24) {
                byte var25 = method373(arg0);
                if (var25 == 23) {
                    return;
                }
                byte var26 = method373(arg0);
                byte var27 = method373(arg0);
                byte var28 = method373(arg0);
                byte var29 = method373(arg0);
                byte var30 = method373(arg0);
                arg0.field1276++;
                byte var31 = method373(arg0);
                byte var32 = method373(arg0);
                byte var33 = method373(arg0);
                byte var34 = method373(arg0);
                byte var35 = method374(arg0);
                if (var35 == 0) {
                    arg0.field1272 = false;
                } else {
                    arg0.field1272 = true;
                }
                if (arg0.field1272) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field1277 = 0;
                byte var36 = method373(arg0);
                arg0.field1277 = arg0.field1277 << 8 | var36 & 0xFF;
                byte var37 = method373(arg0);
                arg0.field1277 = arg0.field1277 << 8 | var37 & 0xFF;
                byte var38 = method373(arg0);
                arg0.field1277 = arg0.field1277 << 8 | var38 & 0xFF;
                for (int var39 = 0; var39 < 16; var39++) {
                    byte var103 = method374(arg0);
                    if (var103 == 1) {
                        arg0.field1287[var39] = true;
                    } else {
                        arg0.field1287[var39] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field1286[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field1287[var41]) {
                        for (int var101 = 0; var101 < 16; var101++) {
                            byte var102 = method374(arg0);
                            if (var102 == 1) {
                                arg0.field1286[var41 * 16 + var101] = true;
                            }
                        }
                    }
                }
                method376(arg0);
                int var42 = arg0.field1285 + 2;
                int var43 = method375(3, arg0);
                int var44 = method375(15, arg0);
                for (int var45 = 0; var45 < var44; var45++) {
                    int var99 = 0;
                    while (true) {
                        byte var100 = method374(arg0);
                        if (var100 == 0) {
                            arg0.field1292[var45] = (byte) var99;
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
                    byte var97 = arg0.field1292[var48];
                    byte var98 = var46[var97];
                    while (var97 > 0) {
                        var46[var97] = var46[var97 - 1];
                        var97--;
                    }
                    var46[0] = var98;
                    arg0.field1291[var48] = var98;
                }
                for (int var49 = 0; var49 < var43; var49++) {
                    int var93 = method375(5, arg0);
                    for (int var94 = 0; var94 < var42; var94++) {
                        while (true) {
                            byte var95 = method374(arg0);
                            if (var95 == 0) {
                                arg0.field1293[var49][var94] = (byte) var93;
                                break;
                            }
                            byte var96 = method374(arg0);
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
                        if (arg0.field1293[var50][var92] > var91) {
                            var91 = arg0.field1293[var50][var92];
                        }
                        if (arg0.field1293[var50][var92] < var90) {
                            var90 = arg0.field1293[var50][var92];
                        }
                    }
                    method377(arg0.field1294[var50], arg0.field1295[var50], arg0.field1296[var50], arg0.field1293[var50], var90, var91, var42);
                    arg0.field1297[var50] = var90;
                }
                int var51 = arg0.field1285 + 1;
                int var52 = arg0.field1275 * 100000;
                int var53 = -1;
                byte var54 = 0;
                for (int var55 = 0; var55 <= 255; var55++) {
                    arg0.field1280[var55] = 0;
                }
                int var56 = 4095;
                for (int var57 = 15; var57 >= 0; var57--) {
                    for (int var89 = 15; var89 >= 0; var89--) {
                        arg0.field1289[var56] = (byte) (var57 * 16 + var89);
                        var56--;
                    }
                    arg0.field1290[var57] = var56 + 1;
                }
                int var58 = 0;
                if (var54 == 0) {
                    var53++;
                    var54 = 50;
                    byte var59 = arg0.field1291[var53];
                    var20 = arg0.field1297[var59];
                    var21 = arg0.field1294[var59];
                    var23 = arg0.field1296[var59];
                    var22 = arg0.field1295[var59];
                }
                int var104 = var54 - 1;
                int var60 = var20;
                int var61;
                byte var62;
                for (var61 = method375(var20, arg0); var61 > var21[var60]; var61 = var61 << 1 | var62) {
                    var60++;
                    var62 = method374(arg0);
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
                                    byte var80 = arg0.field1291[var53];
                                    var20 = arg0.field1297[var80];
                                    var21 = arg0.field1294[var80];
                                    var23 = arg0.field1296[var80];
                                    var22 = arg0.field1295[var80];
                                }
                                var104--;
                                int var81 = var20;
                                int var82;
                                byte var83;
                                for (var82 = method375(var20, arg0); var82 > var21[var81]; var82 = var82 << 1 | var83) {
                                    var81++;
                                    var83 = method374(arg0);
                                }
                                var63 = var23[var82 - var22[var81]];
                            } while (var63 == 0 || var63 == 1);
                            var78++;
                            byte var84 = arg0.field1288[arg0.field1289[arg0.field1290[0]] & 0xFF];
                            arg0.field1280[var84 & 0xFF] += var78;
                            while (var78 > 0) {
                                class40.field1284[var58] = var84 & 0xFF;
                                var58++;
                                var78--;
                            }
                        } else {
                            int var64 = var63 - 1;
                            byte var66;
                            if (var64 < 16) {
                                int var65 = arg0.field1290[0];
                                var66 = arg0.field1289[var64 + var65];
                                while (var64 > 3) {
                                    int var67 = var64 + var65;
                                    arg0.field1289[var67] = arg0.field1289[var67 - 1];
                                    arg0.field1289[var67 - 1] = arg0.field1289[var67 - 2];
                                    arg0.field1289[var67 - 2] = arg0.field1289[var67 - 3];
                                    arg0.field1289[var67 - 3] = arg0.field1289[var67 - 4];
                                    var64 -= 4;
                                }
                                while (var64 > 0) {
                                    arg0.field1289[var64 + var65] = arg0.field1289[var64 + var65 - 1];
                                    var64--;
                                }
                                arg0.field1289[var65] = var66;
                            } else {
                                int var68 = var64 / 16;
                                int var69 = var64 % 16;
                                int var70 = arg0.field1290[var68] + var69;
                                var66 = arg0.field1289[var70];
                                while (var70 > arg0.field1290[var68]) {
                                    arg0.field1289[var70] = arg0.field1289[var70 - 1];
                                    var70--;
                                }
                                int var10002 = arg0.field1290[var68]++;
                                while (var68 > 0) {
                                    var10002 = arg0.field1290[var68]--;
                                    arg0.field1289[arg0.field1290[var68]] = arg0.field1289[arg0.field1290[var68 - 1] + 16 - 1];
                                    var68--;
                                }
                                var10002 = arg0.field1290[0]--;
                                arg0.field1289[arg0.field1290[0]] = var66;
                                if (arg0.field1290[0] == 0) {
                                    int var71 = 4095;
                                    for (int var72 = 15; var72 >= 0; var72--) {
                                        for (int var73 = 15; var73 >= 0; var73--) {
                                            arg0.field1289[var71] = arg0.field1289[arg0.field1290[var72] + var73];
                                            var71--;
                                        }
                                        arg0.field1290[var72] = var71 + 1;
                                    }
                                }
                            }
                            arg0.field1280[arg0.field1288[var66 & 0xFF] & 0xFF]++;
                            class40.field1284[var58] = arg0.field1288[var66 & 0xFF] & 0xFF;
                            var58++;
                            if (var104 == 0) {
                                var53++;
                                var104 = 50;
                                byte var74 = arg0.field1291[var53];
                                var20 = arg0.field1297[var74];
                                var21 = arg0.field1294[var74];
                                var23 = arg0.field1296[var74];
                                var22 = arg0.field1295[var74];
                            }
                            var104--;
                            int var75 = var20;
                            int var76;
                            byte var77;
                            for (var76 = method375(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
                                var75++;
                                var77 = method374(arg0);
                            }
                            var63 = var23[var76 - var22[var75]];
                        }
                    }
                    arg0.field1271 = 0;
                    arg0.field1270 = 0;
                    arg0.field1282[0] = 0;
                    for (int var85 = 1; var85 <= 256; var85++) {
                        arg0.field1282[var85] = arg0.field1280[var85 - 1];
                    }
                    for (int var86 = 1; var86 <= 256; var86++) {
                        arg0.field1282[var86] += arg0.field1282[var86 - 1];
                    }
                    for (int var87 = 0; var87 < var58; var87++) {
                        byte var88 = (byte) (class40.field1284[var87] & 0xFF);
                        class40.field1284[arg0.field1282[var88 & 0xFF]] |= var87 << 8;
                        arg0.field1282[var88 & 0xFF]++;
                    }
                    arg0.field1278 = class40.field1284[arg0.field1277] >> 8;
                    arg0.field1281 = 0;
                    arg0.field1278 = class40.field1284[arg0.field1278];
                    arg0.field1279 = (byte) (arg0.field1278 & 0xFF);
                    arg0.field1278 >>= 0x8;
                    arg0.field1281++;
                    arg0.field1298 = var58;
                    method371(arg0);
                    if (arg0.field1298 + 1 == arg0.field1281 && arg0.field1271 == 0) {
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

    @OriginalMember(owner = "client!OGTHSEHL", name = "c", descriptor = "(LNLVEZGMS;)B")
    private static byte method373(class40 arg0) {
        return (byte) method375(8, arg0);
    }

    @OriginalMember(owner = "client!OGTHSEHL", name = "d", descriptor = "(LNLVEZGMS;)B")
    private static byte method374(class40 arg0) {
        return (byte) method375(1, arg0);
    }

    @OriginalMember(owner = "client!OGTHSEHL", name = "a", descriptor = "(ILNLVEZGMS;)I")
    private static int method375(int arg0, class40 arg1) {
        while (arg1.field1274 < arg0) {
            arg1.field1273 = arg1.field1273 << 8 | arg1.field1260[arg1.field1261] & 0xFF;
            arg1.field1274 += 8;
            arg1.field1261++;
            arg1.field1262--;
            arg1.field1263++;
            if (arg1.field1263 == 0) {
                arg1.field1264++;
            }
        }
        int var2 = arg1.field1273 >> arg1.field1274 - arg0 & (0x1 << arg0) - 1;
        arg1.field1274 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!OGTHSEHL", name = "e", descriptor = "(LNLVEZGMS;)V")
    private static void method376(class40 arg0) {
        arg0.field1285 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field1286[var1]) {
                arg0.field1288[arg0.field1285] = (byte) var1;
                arg0.field1285++;
            }
        }
    }

    @OriginalMember(owner = "client!OGTHSEHL", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method377(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
