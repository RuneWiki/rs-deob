import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class99 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Laj;")
    private static class71 field1408 = new class71(16);

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "[B")
    private static byte[] field1412 = new byte[1];

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field1414 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[S")
    private static short[] field1415 = new short[1];

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field1417 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lfi;")
    public static class166 field1416 = new class166();

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "F")
    public static float field1419;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "F")
    public static float field1420;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lgs;")
    public static class40 field1409;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lrk;")
    public static class427 field1410;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Laj;")
    private static class71 field1426;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Llq;")
    public static class75 field1411;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "[B")
    private static byte[] field1424;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "[B")
    private static byte[] field1425;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "[B")
    private static byte[] field1427;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "[B")
    private static byte[] field1433;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "[B")
    private static byte[] field1442;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "[I")
    private static int[] field1423;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[S")
    private static short[] field1430;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "[S")
    private static short[] field1440;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[[[B")
    public static byte[][][] field1413;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[[[Ltd;")
    private static class107[][][] field1421;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpe;Ltj;IIII)V", line = 3)
    private static final void method827(class391 arg0, class430 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6122 = ((arg1.field6124 - field1441) * arg2 + arg4 >> 16) + field1429;
        arg1.field6114 = field1431 - ((arg1.field6120 - field1422) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([B[B[SII)V", line = 8)
    private static final void method828(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field1435];
        int[] var6 = new int[field1435];
        int[] var7 = new int[field1435];
        int[] var8 = new int[field1435];
        int[] var9 = new int[field1435];
        for (int var10 = -5; var10 < field1434; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field1435; var13++) {
                int var10002;
                if (var11 < field1434) {
                    int var28 = arg0[field1434 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class101 var29 = class447.method2790(var28 - 1, -115);
                        var5[var13] += var29.field1492;
                        var6[var13] += var29.field1501;
                        var7[var13] += var29.field1489;
                        var8[var13] += var29.field1502;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field1434 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class101 var31 = class447.method2790(var30 - 1, -73);
                        var5[var13] -= var31.field1492;
                        var6[var13] -= var31.field1501;
                        var7[var13] -= var31.field1489;
                        var8[var13] -= var31.field1502;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field1435; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field1435) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field1434 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field1434 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class263.method1696(var15 / var18, 70, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field1434 * var19 + var10;
                            int var27 = class417.field5848[class40.method394((byte) 73, class413.method2557(var25, 96, (byte) -86)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 154)
    public static final void method829() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field1411.field1116; var1++) {
            boolean var2 = field1409.method390(var0, 63, field1411.field1121[var1] >> 28 & 0x3, field1411.field1121[var1] & 0x3FFF, field1411.field1121[var1] >> 14 & 0x3FFF);
            if (var2) {
                class430 var3 = new class430(field1411.field1117[var1]);
                var3.field6124 = var0[1] - field1436;
                var3.field6120 = var0[2] - field1438;
                field1416.method1249(var3, (byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpe;II)V", line = 177)
    public static final void method830(class391 arg0, int arg1, int arg2) {
        class289 var3 = new class289(field1410.method2637(field1409.field618, "area", (byte) -30));
        int var4 = var3.method1861((byte) -72);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1861((byte) -72);
        }
        int var7 = var3.method1861((byte) -72);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1861((byte) -72);
        }
        while (true) {
            while (var3.field3938 < var3.field3882.length) {
                if (var3.method1861((byte) -72) == 0) {
                    int var22 = var3.method1861((byte) -72);
                    int var23 = var3.method1861((byte) -72);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field1436;
                            int var27 = var23 * 64 + var25 - field1438;
                            method848(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1861((byte) -72);
                    int var29 = var3.method1861((byte) -72);
                    int var30 = var3.method1861((byte) -72);
                    int var31 = var3.method1861((byte) -72);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field1436;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field1438;
                            method848(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field1433 = new byte[field1435 * field1434];
            field1430 = new short[field1435 * field1434];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field1435 * field1434];
                for (int var13 = 0; var13 < field1421[var11].length; var13++) {
                    for (int var19 = 0; var19 < field1421[var11][0].length; var19++) {
                        class107 var20 = field1421[var11][var13][var19];
                        if (var20 != null) {
                            for (class281 var21 = (class281) var20.method891(20838); var21 != null; var21 = (class281) var20.method898(64)) {
                                var12[(var19 * 64 + var21.field3754) * field1434 + var13 * 64 + var21.field3760] = (byte) var21.field3758;
                            }
                        }
                    }
                }
                method828(var12, field1433, field1430, arg1, arg2);
                for (int var14 = 0; var14 < field1421[var11].length; var14++) {
                    for (int var15 = 0; var15 < field1421[var11][0].length; var15++) {
                        class107 var16 = field1421[var11][var14][var15];
                        if (var16 != null) {
                            for (class281 var17 = (class281) var16.method891(20838); var17 != null; var17 = (class281) var16.method898(64)) {
                                int var18 = (var15 * 64 + var17.field3754) * field1434 + var14 * 64 + var17.field3760;
                                var17.field3758 = (field1433[var18] & 0xFF) << 16 | field1430[var18] & 0xFFFF;
                                if (var17.field3758 != 0) {
                                    var17.field3758 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method828(field1427, field1433, field1430, arg1, arg2);
            field1427 = null;
            method837();
            return;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lbo;", line = 356)
    public static final class355 method831(int arg0, int arg1) {
        class355 var2 = new class355();
        for (class40 var3 = (class40) field1408.method608(-24); var3 != null; var3 = (class40) field1408.method606((byte) 76)) {
            if (var3.field623 && var3.method391(arg0, arg1, 125)) {
                var2.method2244(11310, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lrk;)V", line = 371)
    public static final void method832(class427 arg0) {
        field1410 = arg0;
        field1408.method607(0);
        int var1 = field1410.method2643("details", -1);
        int[] var2 = field1410.method2641(var1, -124);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class40 var4 = class150.method1148(-120, var1, var2[var3], field1410);
            field1408.method612((long) var4.field613, -1, var4);
        }
        class134.method1073(false, (byte) -117, true);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)Lgs;", line = 393)
    public static final class40 method833(int arg0, int arg1) {
        for (class40 var2 = (class40) field1408.method608(74); var2 != null; var2 = (class40) field1408.method606((byte) 68)) {
            if (var2.field623 && var2.method391(arg0, arg1, 119)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpg;III)I", line = 406)
    private static final int method834(class112 arg0, int arg1, int arg2, int arg3) {
        class36 var4 = class382.method2374(arg1, -86);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field546;
        if (var5 >= 0 && arg0.method917((byte) 84, var5).field1708) {
            var5 = -1;
        }
        int var9;
        if (var4.field564 >= 0) {
            int var6 = var4.field564;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class417.field5848[class40.method394((byte) 123, class126.method985(96, 2, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class417.field5848[class40.method394((byte) 117, class126.method985(96, 2, arg0.method917((byte) 101, var5).field1707)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field550 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field550;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class417.field5848[class40.method394((byte) 114, class126.method985(96, 2, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpe;IIII)Lfi;", line = 468)
    private static final class166 method835(class391 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class430 var5 = (class430) field1416.method1240((byte) -110); var5 != null; var5 = (class430) field1416.method1245(1)) {
            method827(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field1416;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpe;)V", line = 479)
    public static final void method836(class391 arg0) {
        int var1 = field1439 - field1441;
        int var2 = field1432 - field1422;
        int var3 = (field1428 - field1429 << 16) / var1;
        int var4 = (field1431 - field1437 << 16) / var2;
        method839(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()V", line = 493)
    private static final void method837() {
        for (int var0 = 0; var0 < field1434; var0++) {
            for (int var9 = 0; var9 < field1435; var9++) {
                int var10 = field1440[field1434 * var9 + var0] & 0xFFFF;
                if (var10 != 0) {
                    if (var10 == 65535) {
                        class9 var11 = (class9) field1426.method614(-126, (long) (var0 << 16 | var9));
                        if (var11 != null) {
                            for (int var12 = 0; var12 < var11.field75.length; var12++) {
                                class372 var13 = class10.method53(var11.field75[var12] & 0xFFFF, true);
                                if (var13.field5214 != -1) {
                                    class430 var14 = new class430(var13.field5214);
                                    var14.field6124 = var0;
                                    var14.field6120 = var9;
                                    field1416.method1249(var14, (byte) -115);
                                }
                            }
                        }
                    } else {
                        class372 var15 = class10.method53(var10 - 1, true);
                        if (var15.field5214 != -1) {
                            class430 var16 = new class430(var15.field5214);
                            var16.field6124 = var0;
                            var16.field6120 = var9;
                            field1416.method1249(var16, (byte) -116);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field1421[0].length; var2++) {
                for (int var3 = 0; var3 < field1421[0][0].length; var3++) {
                    class107 var4 = field1421[var1][var2][var3];
                    if (var4 != null) {
                        for (class281 var5 = (class281) var4.method891(20838); var5 != null; var5 = (class281) var4.method898(64)) {
                            if (var5.field3756 != null) {
                                for (int var6 = 0; var6 < var5.field3756.length; var6++) {
                                    class372 var7 = class10.method53(var5.field3756[var6] & 0xFFFF, true);
                                    if (var7.field5214 != -1) {
                                        class430 var8 = new class430(var7.field5214);
                                        var8.field6124 = ((field1436 >> 6) + var2) * 64 + var5.field3760 - field1436;
                                        var8.field6120 = ((field1438 >> 6) + var3) * 64 + var5.field3754 - field1438;
                                        field1416.method1249(var8, (byte) -127);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lpe;)Lfi;", line = 620)
    public static final class166 method838(class391 arg0) {
        int var1 = field1439 - field1441;
        int var2 = field1432 - field1422;
        int var3 = (field1428 - field1429 << 16) / var1;
        int var4 = (field1431 - field1437 << 16) / var2;
        return method835(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lpe;IIII)V", line = 631)
    private static final void method839(class391 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1439 - field1441;
        int var6 = field1432 - field1422;
        if (field1439 < field1434) {
            var5++;
        }
        if (field1432 < field1435) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field1429;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field1429;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field1441 + var7;
                if (var52 >= 0 && var52 < field1434) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field1431 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field1431 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field1422 + var53;
                            int var58 = field1434 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field1435) {
                                var59 = (field1433[var58] & 0xFF) << 16 | field1430[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field1442[var58] & 0xFF;
                                var61 = field1440[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field1409.field614 != -1) {
                                    var62 = field1409.field614 | 0xFF000000;
                                } else if ((field1441 + var7 & 0x4) == (field1432 + var53 & 0x4)) {
                                    var62 = field1423[class212.field2937 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method95(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method843(arg0, var49, var54, var51, var56, var59, var60, field1424[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class9 var63 = (class9) field1426.method614(-99, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method843(arg0, var49, var54, var51, var56, var59, var60, field1424[var58], var63.field75, var63.field76, true);
                                }
                            } else {
                                field1415[0] = (short) (var61 - 1);
                                field1412[0] = field1425[var58];
                                method843(arg0, var49, var54, var51, var56, var59, var60, field1424[var58], field1415, field1412, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field1431 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field1431 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field1409.field614 != -1) {
                            var68 = field1409.field614 | 0xFF000000;
                        } else if ((field1441 + var7 & 0x4) == (field1432 + var64 & 0x4)) {
                            var68 = field1423[class212.field2937 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method95(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field1429;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field1429;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field1441 + var8;
                if (var41 >= 0 && var41 < field1434) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field1431 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field1431 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field1422 + var42;
                            if (var46 >= 0 && var46 < field1435) {
                                int var47 = field1440[field1434 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method847(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class9 var48 = (class9) field1426.method614(-100, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method847(arg0, var38, var43, var40, var45, var48.field75, var48.field76);
                                    }
                                } else {
                                    field1415[0] = (short) (var47 - 1);
                                    field1412[0] = field1425[field1434 * var46 + var41];
                                    method847(arg0, var38, var43, var40, var45, field1415, field1412);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field1441 >> 6;
        int var10 = field1422 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field1439 >> 6;
        int var12 = field1432 >> 6;
        if (var11 >= field1421[0].length) {
            var11 = field1421[0].length - 1;
        }
        if (var12 >= field1421[0][0].length) {
            var12 = field1421[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class107 var28 = field1421[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field1436 >> 6) + var14) * 64;
                        int var30 = ((field1438 >> 6) + var27) * 64;
                        for (class281 var31 = (class281) var28.method891(20838); var31 != null; var31 = (class281) var28.method898(64)) {
                            int var32 = var31.field3760 + var29 - field1436 - field1441;
                            int var33 = var31.field3754 + var30 - field1438 - field1422;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field1429;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field1429;
                            int var36 = field1431 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field1431 - (arg2 * var33 + arg4 >> 16);
                            method843(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3758, var31.field3755 & 0xFF, var31.field3757, var31.field3756, var31.field3759, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class107 var17 = field1421[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field1436 >> 6) + var15) * 64;
                        int var19 = ((field1438 >> 6) + var16) * 64;
                        for (class281 var20 = (class281) var17.method891(20838); var20 != null; var20 = (class281) var17.method898(64)) {
                            int var21 = var20.field3760 + var18 - field1436 - field1441;
                            int var22 = var20.field3754 + var19 - field1438 - field1422;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field1429;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field1429;
                            int var25 = field1431 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field1431 - (arg2 * var22 + arg4 >> 16);
                            method847(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3756, var20.field3759);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 973)
    public static final void method840(int arg0) {
        field1409 = (class40) field1408.method614(-124, (long) arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIII)V", line = 976)
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1441 = arg0 - field1436;
        field1432 = arg1 - field1438;
        field1439 = arg2 - field1436;
        field1422 = arg3 - field1438;
        field1429 = arg4;
        field1437 = arg5;
        field1428 = arg6;
        field1431 = arg7;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "()V", line = 986)
    public static void method842() {
        field1409 = null;
        field1410 = null;
        field1408 = null;
        field1413 = null;
        field1415 = null;
        field1412 = null;
        field1411 = null;
        field1416 = null;
        field1423 = null;
        field1427 = null;
        field1433 = null;
        field1430 = null;
        field1442 = null;
        field1424 = null;
        field1440 = null;
        field1425 = null;
        field1426 = null;
        field1421 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpe;IIIIIII[S[BZ)V", line = 1006)
    private static final void method843(class391 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method95(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field1423[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method95(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class415.method2571(arg1, field1423[arg6], var12, arg7 >> 6 & 0x3, arg2, arg4, field1413, var11, field1418, arg0, arg3, arg5, (byte) -23);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class372 var18 = class10.method53(arg8[var16] & 0xFFFF, true);
                if (var18.field5161 == -1) {
                    int var19 = -3355444;
                    if (var18.field5204 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method192(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method259(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method192(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method259(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method192(arg1, arg2, arg4, -1, 0);
                            arg0.method259(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method192(var14, arg2, arg4, -1, 0);
                            arg0.method259(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method192(var14, arg2, arg4, -1, 0);
                            arg0.method259(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method192(arg1, arg2, arg4, -1, 0);
                            arg0.method259(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method259(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method259(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method259(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method259(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method259(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method259(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpg;II)V", line = 1175)
    public static final void method844(class112 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class57.field918; var3++) {
            field1423[var3 + 1] = method834(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "()V", line = 1185)
    public static final void method845() {
        field1427 = null;
        field1433 = null;
        field1430 = null;
        field1442 = null;
        field1424 = null;
        field1440 = null;
        field1425 = null;
        field1426 = null;
        field1421 = null;
        field1423 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)Lgs;", line = 1205)
    public static final class40 method846(int arg0) {
        return (class40) field1408.method614(-99, (long) arg0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpe;IIII[S[B)V", line = 1208)
    private static final void method847(class391 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class372 var8 = class10.method53(arg5[var7] & 0xFFFF, true);
            int var9 = var8.field5161;
            if (var9 != -1) {
                class38 var10 = class372.method2330(var9, 34);
                class80 var11 = var10.method377(var8.field5190 ? var8.field5207 : false, (byte) 119, var8.field5173 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method740() >> 2;
                    int var13 = arg4 * var11.method739() >> 2;
                    if (var10.field574) {
                        int var14 = var8.field5206;
                        int var15 = var8.field5147;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field580 == 0) {
                            var11.method729(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method726(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field580 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lpe;Lap;IIII[I[I)V", line = 1271)
    private static final void method848(class391 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1861((byte) -72);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1861((byte) -72);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field1427[field1434 * arg5 + arg4] = (byte) var11;
                    field1442[field1434 * arg5 + arg4] = 0;
                } else {
                    field1442[field1434 * arg5 + arg4] = (byte) var11;
                    field1424[field1434 * arg5 + arg4] = 0;
                    field1427[field1434 * arg5 + arg4] = arg1.method1868((byte) -123);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1861((byte) -72);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1861((byte) -72);
                var18 = arg1.method1861((byte) -72);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1861((byte) -72);
            }
            if (var15 == 0) {
                field1427[field1434 * arg5 + arg4] = (byte) var16;
                field1442[field1434 * arg5 + arg4] = (byte) var17;
                field1424[field1434 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field1440[field1434 * arg5 + arg4] = (short) (arg1.method1853(97) + 1);
                    field1425[field1434 * arg5 + arg4] = arg1.method1868((byte) -123);
                } else if (var19 > 1) {
                    field1440[field1434 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1853(-89);
                        var21[var22] = arg1.method1868((byte) -120);
                    }
                    field1426.method612((long) (arg4 << 16 | arg5), -1, new class9(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1853(-79);
                        var24[var25] = arg1.method1868((byte) -127);
                    }
                }
                if (field1421[var15 - 1][arg2 - (field1436 >> 6)][arg3 - (field1438 >> 6)] == null) {
                    field1421[var15 - 1][arg2 - (field1436 >> 6)][arg3 - (field1438 >> 6)] = new class107();
                }
                class281 var26 = new class281(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field1421[var15 - 1][arg2 - (field1436 >> 6)][arg3 - (field1438 >> 6)].method901(false, var26);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "()V", line = 1405)
    public static final void method849() {
        field1427 = new byte[field1435 * field1434];
        field1442 = new byte[field1435 * field1434];
        field1424 = new byte[field1435 * field1434];
        field1440 = new short[field1435 * field1434];
        field1425 = new byte[field1435 * field1434];
        field1426 = new class71(1024);
        field1421 = new class107[3][field1434 >> 6][field1435 >> 6];
        field1423 = new int[class57.field918 + 1];
    }
}
