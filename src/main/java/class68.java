import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class68 extends class103 {

    @OriginalMember(owner = "client!k", name = "rb", descriptor = "I")
    private int field1403 = 0;

    @OriginalMember(owner = "client!k", name = "Db", descriptor = "Z")
    private boolean field1415 = false;

    @OriginalMember(owner = "client!k", name = "Ib", descriptor = "I")
    private int field1420 = 0;

    @OriginalMember(owner = "client!k", name = "Vb", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!k", name = "zb", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!k", name = "Kb", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!k", name = "xb", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!k", name = "Ob", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!k", name = "Cb", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!k", name = "yb", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!k", name = "Qb", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!k", name = "Ub", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client!k", name = "Rb", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!k", name = "ub", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!k", name = "vb", descriptor = "Lwc;")
    private class143 field1407;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field1394 = 0;

    @OriginalMember(owner = "client!k", name = "Ab", descriptor = "Lvc;")
    public static class137 field1412 = class45.method325("Fertigkeit)2", -46);

    @OriginalMember(owner = "client!k", name = "nb", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!k", name = "Eb", descriptor = "I")
    public static int field1416 = 0;

    @OriginalMember(owner = "client!k", name = "Bb", descriptor = "Z")
    public static boolean field1413 = false;

    @OriginalMember(owner = "client!k", name = "Jb", descriptor = "Lvc;")
    private static class137 field1421 = class45.method325("Loaded config", -46);

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "[J")
    public static long[] field1395 = new long[200];

    @OriginalMember(owner = "client!k", name = "Tb", descriptor = "Lvc;")
    public static class137 field1431 = class45.method325("Bitte warten Sie)3)3)3", -46);

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "Lvc;")
    public static class137 field1397 = field1421;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "D")
    private double field1392;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "D")
    public double field1393;

    @OriginalMember(owner = "client!k", name = "wb", descriptor = "D")
    private double field1408;

    @OriginalMember(owner = "client!k", name = "Fb", descriptor = "D")
    public double field1417;

    @OriginalMember(owner = "client!k", name = "Hb", descriptor = "D")
    private double field1419;

    @OriginalMember(owner = "client!k", name = "Lb", descriptor = "D")
    private double field1423;

    @OriginalMember(owner = "client!k", name = "Mb", descriptor = "D")
    public double field1424;

    @OriginalMember(owner = "client!k", name = "Pb", descriptor = "D")
    private double field1427;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!k", name = "ob", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!k", name = "pb", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!k", name = "sb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!k", name = "Gb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!k", name = "Nb", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!k", name = "Sb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!k", name = "qb", descriptor = "J")
    public static long field1402;

    @OriginalMember(owner = "client!k", name = "mb", descriptor = "Ln;")
    public static class86 field1398;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I")
    public static final int method480(int arg0, int arg1, int arg2, int arg3) {
        field1396++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg0 != 40) {
                method480(-94, 63, 58, 49);
            }
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Lwc;")
    public static final class143 method481(int arg0, int arg1) {
        field1401++;
        class143 var2 = (class143) class38.field842.method758((long) arg1, (byte) -86);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field2995.method668(12, arg0 ^ 0xFFFFFF2A, arg1);
        class143 var4 = new class143();
        if (arg0 != 0) {
            method485((byte) -33);
        }
        if (var3 != null) {
            var4.method1105(-1, new class109(var3));
        }
        var4.method1101((byte) 69);
        class38.field842.method760(var4, arg0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)V")
    public final void method482(int arg0, byte arg1) {
        this.field1417 += (double) arg0 * this.field1419;
        if (arg1 != -85) {
            this.method38(false);
        }
        field1400++;
        this.field1415 = true;
        this.field1393 += this.field1408 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1427;
        this.field1424 += (double) arg0 * this.field1392;
        this.field1427 += (double) arg0 * this.field1408;
        this.field1425 = (int) (Math.atan2(this.field1419, this.field1392) * 325.949D) + 1024 & 0x7FF;
        this.field1405 = (int) (Math.atan2(this.field1427, this.field1423) * 325.949D) & 0x7FF;
        if (this.field1407 == null) {
            return;
        }
        this.field1403 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1407.field3382[this.field1420] >= this.field1403) {
                        return;
                    }
                    this.field1403 -= this.field1407.field3382[this.field1420];
                    this.field1420++;
                } while (this.field1407.field3395.length > this.field1420);
                this.field1420 -= this.field1407.field3369;
            } while (this.field1420 >= 0 && this.field1420 < this.field1407.field3395.length);
            this.field1420 = 0;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZII)V")
    public final void method483(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field1415) {
            double var6 = (double) (arg1 - this.field1414);
            double var8 = (double) (arg3 - this.field1433);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1424 = (double) this.field1432 * var8 / var10 + (double) this.field1433;
            this.field1393 = this.field1406;
            this.field1417 = (double) this.field1432 * var6 / var10 + (double) this.field1414;
        }
        double var12 = (double) (this.field1428 + 1 - arg0);
        this.field1392 = ((double) arg3 - this.field1424) / var12;
        field1418++;
        this.field1419 = ((double) arg1 - this.field1417) / var12;
        this.field1423 = Math.sqrt(this.field1419 * this.field1419 + this.field1392 * this.field1392);
        if (!this.field1415) {
            this.field1427 = -this.field1423 * Math.tan((double) this.field1411 * 0.02454369D);
        }
        if (arg2) {
            this.field1408 = ((double) arg4 - this.field1393 - this.field1427 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    public static void method484(int arg0) {
        field1412 = null;
        field1395 = null;
        field1421 = null;
        field1398 = null;
        if (arg0 != -568) {
            method481(12, -79);
        }
        field1431 = null;
        field1397 = null;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(B)V")
    public static final void method485(byte arg0) {
        class93.field2192 = true;
        field1391++;
        class21.method179(0);
        if (class69.field1462) {
            class42.field925.method1146(class45.field1001, 239, 40, 0);
            class42.field925.method1146(class88.method666(-1, new class137[] { class45.field1012, class85.field1936 }), 239, 60, 128);
        } else if (class92.field2185 == 1) {
            class42.field925.method1146(class40.field903, 239, 40, 0);
            class42.field925.method1146(class88.method666(-46, new class137[] { class45.field992, class85.field1936 }), 239, 60, 128);
        } else if (class92.field2185 == 2) {
            class42.field925.method1146(class36.field789, 239, 40, 0);
            class42.field925.method1146(class88.method666(116, new class137[] { class45.field992, class85.field1936 }), 239, 60, 128);
        } else if (class92.field2185 == 3) {
            if (class45.field996 != class45.field992) {
                class7.method45(class45.field992, 0);
                class45.field996 = class45.field992;
            }
            class145 var1 = class75.field1695;
            class62.method455(0, 0, 463, 77);
            for (int var2 = 0; var2 < class38.field847; var2++) {
                int var3 = var2 * 14 + 18 - class115.field2736;
                if (var3 > 0 && var3 < 110) {
                    var1.method1146(class6.field116[var2], 239, var3, 0);
                }
            }
            class62.method458();
            if (class38.field847 > 5) {
                class114.method887(-7519, 77, 463, class115.field2736, class38.field847 * 14 + 7, 0);
            }
            if (class45.field992.method997(123) == 0) {
                class42.field925.method1146(class1.field21, 239, 40, 255);
            } else if (class38.field847 == 0) {
                class42.field925.method1146(class10.field205, 239, 40, 0);
            }
            var1.method1146(class88.method666(113, new class137[] { class45.field992, class85.field1936 }), 239, 90, 0);
            class62.method453(0, 77, 479, 0);
        } else if (class92.field2185 == 4) {
            class42.field925.method1146(class45.field1009, 239, 40, 0);
            class42.field925.method1146(class88.method666(110, new class137[] { class45.field992, class85.field1936 }), 239, 60, 128);
        } else if (class58.field1247 != null) {
            class42.field925.method1134(class58.field1247, 10, 20, 459, 40, 0, false, 1, 1, 0);
            class42.field925.method1146(class71.field1504, 239, 80, 128);
        } else if (class73.field1543 != -1) {
            boolean var19 = class28.method222(479, 0, 96, 0, -9037, 2, class73.field1543);
            if (!var19) {
                class80.field1825 = true;
            }
        } else if (class10.field221 == -1) {
            int var5 = 0;
            class145 var6 = class75.field1695;
            class62.method455(0, 0, 463, 77);
            for (int var7 = 0; var7 < 100; var7++) {
                if (class37.field810[var7] != null) {
                    int var9 = class37.field830[var7];
                    class137 var10 = class12.field274[var7];
                    int var11 = class40.field912 + 70 - var5 * 14;
                    byte var12 = 0;
                    if (var10 != null && var10.method1014(class59.field1266, (byte) 45)) {
                        var10 = var10.method1035(1, 5);
                        var12 = 1;
                    }
                    if (var10 != null && var10.method1014(class84.field1907, (byte) 20)) {
                        var12 = 2;
                        var10 = var10.method1035(1, 5);
                    }
                    if (var9 == 0) {
                        var5++;
                        if (var11 > 0 && var11 < 110) {
                            var6.method1131(class37.field810[var7], 4, var11, 0);
                        }
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class21.field453 == 0 || class21.field453 == 1 && class19.method169(-1, var10))) {
                        if (var11 > 0 && var11 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class86.field2047[0].method394(var13, var11 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class86.field2047[1].method394(var13, var11 - 12);
                                var13 += 14;
                            }
                            var6.method1131(class88.method666(125, new class137[] { var10, class92.field2182 }), var13, var11, 0);
                            int var14 = var13 + var6.method1130(var10) + 8;
                            var6.method1131(class37.field810[var7], var14, var11, 255);
                        }
                        var5++;
                    }
                    if ((var9 == 3 || var9 == 7) && class7.field145 == 0 && (var9 == 7 || class71.field1510 == 0 || class71.field1510 == 1 && class19.method169(-1, var10))) {
                        var5++;
                        if (var11 > 0 && var11 < 110) {
                            byte var15 = 4;
                            var6.method1131(class104.field2413, var15, var11, 0);
                            int var16 = var15 + var6.method1130(class104.field2413);
                            int var17 = var16 + var6.method1136(32);
                            if (var12 == 1) {
                                class86.field2047[0].method394(var17, var11 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class86.field2047[1].method394(var17, var11 - 12);
                                var17 += 14;
                            }
                            var6.method1131(class88.method666(-17, new class137[] { var10, class92.field2182 }), var17, var11, 0);
                            int var18 = var17 + var6.method1130(var10) + 8;
                            var6.method1131(class37.field810[var7], var18, var11, 8388608);
                        }
                    }
                    if (var9 == 4 && (class110.field2606 == 0 || class110.field2606 == 1 && class19.method169(-1, var10))) {
                        var5++;
                        if (var11 > 0 && var11 < 110) {
                            var6.method1131(class88.method666(121, new class137[] { var10, class70.field1485, class37.field810[var7] }), 4, var11, 8388736);
                        }
                    }
                    if (var9 == 5 && class7.field145 == 0 && class71.field1510 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var6.method1131(class37.field810[var7], 4, var11, 8388608);
                        }
                        var5++;
                    }
                    if (var9 == 6 && class7.field145 == 0 && class71.field1510 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var6.method1131(class88.method666(113, new class137[] { class34.field732, class70.field1485, var10, class92.field2182 }), 4, var11, 0);
                            var6.method1131(class37.field810[var7], var6.method1130(class88.method666(-123, new class137[] { class34.field732, class70.field1485, var10 })) + 12, var11, 8388608);
                        }
                        var5++;
                    }
                    if (var9 == 8 && (class110.field2606 == 0 || class110.field2606 == 1 && class19.method169(-1, var10))) {
                        if (var11 > 0 && var11 < 110) {
                            var6.method1131(class88.method666(126, new class137[] { var10, class70.field1485, class37.field810[var7] }), 4, var11, 8270336);
                        }
                        var5++;
                    }
                }
            }
            class62.method458();
            class78.field1733 = var5 * 14 + 7;
            if (class78.field1733 < 78) {
                class78.field1733 = 78;
            }
            class114.method887(-7519, 77, 463, class78.field1733 - class40.field912 - 77, class78.field1733, 0);
            class137 var8;
            if (class104.field2412 == null || class104.field2412.field2909 == null) {
                var8 = class115.field2732;
            } else {
                var8 = class104.field2412.field2909;
            }
            var6.method1131(class88.method666(-79, new class137[] { var8, class92.field2182 }), 4, 90, 0);
            var6.method1131(class88.method666(-16, new class137[] { class45.field993, class85.field1936 }), var6.method1130(class88.method666(-81, new class137[] { var8, class78.field1745 })) + 6, 90, 255);
            class62.method453(0, 77, 479, 0);
        } else {
            boolean var4 = class28.method222(479, 0, 96, 0, -9037, 3, class10.field221);
            if (!var4) {
                class80.field1825 = true;
            }
        }
        if (class77.field1718 && class107.field2486 == 2) {
            class106.method773((byte) -113);
        }
        client.method187(-21226);
        if (arg0 > -47) {
            field1421 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Lbf;")
    public final class14 method38(boolean arg0) {
        field1404++;
        if (!arg0) {
            return null;
        }
        class108 var2 = class128.method957(this.field1429, 13);
        class14 var3 = var2.method790((byte) -109, this.field1420);
        if (var3 == null) {
            return null;
        } else {
            var3.method105(this.field1405);
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1433 = arg3;
        this.field1411 = arg7;
        this.field1422 = arg9;
        this.field1409 = arg5;
        this.field1426 = arg10;
        this.field1414 = arg2;
        this.field1410 = arg1;
        this.field1428 = arg6;
        this.field1432 = arg8;
        this.field1429 = arg0;
        this.field1415 = false;
        this.field1406 = arg4;
        int var12 = class128.method957(this.field1429, 13).field2501;
        if (var12 == -1) {
            this.field1407 = null;
        } else {
            this.field1407 = method481(0, var12);
        }
    }
}
