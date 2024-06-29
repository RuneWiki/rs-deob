import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class262 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[[I")
    private int[][] field4017;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field4018 = 0;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Lho;")
    public static class215 field4021;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lud;B)V", line = 10)
    public static final void method1924(class91 arg0, byte arg1) {
        field4015++;
        arg0.field1383 = false;
        if (arg0.field1350 != -1) {
            class93 var2 = class126.method1091((byte) 44, arg0.field1350);
            if (var2 == null || var2.field1428 == null) {
                arg0.field1350 = -1;
            } else {
                arg0.field1309++;
                if (arg0.field1299 < var2.field1428.length && arg0.field1309 > var2.field1429[arg0.field1299]) {
                    arg0.field1299++;
                    arg0.field1309 = 1;
                    arg0.field1293++;
                    class335.method2358(arg0.field1359, arg0.field1299, var2, class173.field2746 == arg0, arg0.field1286, true);
                }
                if (var2.field1428.length <= arg0.field1299) {
                    arg0.field1299 = 0;
                    arg0.field1309 = 0;
                    class335.method2358(arg0.field1359, arg0.field1299, var2, class173.field2746 == arg0, arg0.field1286, true);
                }
                arg0.field1293 = arg0.field1299 + 1;
                if (arg0.field1293 >= var2.field1428.length) {
                    arg0.field1293 = 0;
                }
            }
        }
        if (arg0.field1297 != -1 && arg0.field1330 <= class360.field5718) {
            class281 var3 = class292.method2110(arg0.field1297, (byte) 20);
            int var4 = var3.field4343;
            if (var4 == -1) {
                arg0.field1297 = -1;
            } else {
                label318: {
                    class93 var5 = class126.method1091((byte) 34, var4);
                    if (var3.field4351) {
                        if (var5.field1422 == 3) {
                            if (arg0.field1294 > 0 && arg0.field1384 <= class360.field5718 && arg0.field1377 < class360.field5718) {
                                arg0.field1297 = -1;
                                break label318;
                            }
                        } else if (var5.field1422 == 1 && arg0.field1294 > 0 && class360.field5718 >= arg0.field1384 && arg0.field1377 < class360.field5718) {
                            arg0.field1330 = class360.field5718 + 1;
                            break label318;
                        }
                    }
                    if (var5 == null || var5.field1428 == null) {
                        arg0.field1297 = -1;
                    } else {
                        if (arg0.field1326 < 0) {
                            arg0.field1326 = 0;
                            class335.method2358(arg0.field1359, 0, var5, class173.field2746 == arg0, arg0.field1286, true);
                        }
                        arg0.field1392++;
                        if (arg0.field1326 < var5.field1428.length && arg0.field1392 > var5.field1429[arg0.field1326]) {
                            arg0.field1392 = 1;
                            arg0.field1326++;
                            class335.method2358(arg0.field1359, arg0.field1326, var5, class173.field2746 == arg0, arg0.field1286, true);
                        }
                        if (arg0.field1326 >= var5.field1428.length) {
                            if (var3.field4351) {
                                arg0.field1326 -= var5.field1430;
                                arg0.field1338++;
                                if (var5.field1426 <= arg0.field1338) {
                                    arg0.field1297 = -1;
                                } else if (arg0.field1326 >= 0 && arg0.field1326 < var5.field1428.length) {
                                    class335.method2358(arg0.field1359, arg0.field1326, var5, class173.field2746 == arg0, arg0.field1286, true);
                                } else {
                                    arg0.field1297 = -1;
                                }
                            } else {
                                arg0.field1297 = -1;
                            }
                        }
                        arg0.field1355 = arg0.field1326 + 1;
                        if (var5.field1428.length <= arg0.field1355) {
                            if (var3.field4351) {
                                arg0.field1355 -= var5.field1430;
                                if (var5.field1426 <= arg0.field1338 + 1) {
                                    arg0.field1355 = -1;
                                } else if (arg0.field1355 < 0 || arg0.field1355 >= var5.field1428.length) {
                                    arg0.field1355 = -1;
                                }
                            } else {
                                arg0.field1355 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1343 != -1 && arg0.field1302 <= 1) {
            class93 var6 = class126.method1091((byte) 81, arg0.field1343);
            if (var6.field1422 == 3) {
                if (arg0.field1294 > 0 && arg0.field1384 <= class360.field5718 && arg0.field1377 < class360.field5718) {
                    arg0.field1343 = -1;
                }
            } else if (var6.field1422 == 1 && arg0.field1294 > 0 && class360.field5718 >= arg0.field1384 && arg0.field1377 < class360.field5718) {
                arg0.field1302 = 2;
            }
        }
        if (arg0.field1343 != -1 && arg0.field1302 == 0) {
            class93 var7 = class126.method1091((byte) 45, arg0.field1343);
            if (var7 == null || var7.field1428 == null) {
                arg0.field1343 = -1;
            } else {
                arg0.field1369++;
                if (var7.field1428.length > arg0.field1329 && arg0.field1369 > var7.field1429[arg0.field1329]) {
                    arg0.field1329++;
                    arg0.field1369 = 1;
                    class335.method2358(arg0.field1359, arg0.field1329, var7, class173.field2746 == arg0, arg0.field1286, true);
                }
                if (arg0.field1329 >= var7.field1428.length) {
                    arg0.field1332++;
                    arg0.field1329 -= var7.field1430;
                    if (var7.field1426 <= arg0.field1332) {
                        arg0.field1343 = -1;
                    } else if (arg0.field1329 >= 0 && var7.field1428.length > arg0.field1329) {
                        class335.method2358(arg0.field1359, arg0.field1329, var7, class173.field2746 == arg0, arg0.field1286, true);
                    } else {
                        arg0.field1343 = -1;
                    }
                }
                arg0.field1310 = arg0.field1329 + 1;
                if (arg0.field1310 >= var7.field1428.length) {
                    arg0.field1310 -= var7.field1430;
                    if ((arg0.field1332 + 1) >= var7.field1426) {
                        arg0.field1310 = -1;
                    } else if (arg0.field1310 < 0 || var7.field1428.length <= arg0.field1310) {
                        arg0.field1310 = -1;
                    }
                }
                arg0.field1383 = var7.field1407;
            }
        }
        if (arg0.field1302 > 0) {
            arg0.field1302--;
        }
        for (int var8 = 0; var8 < arg0.field1331.length; var8++) {
            class349 var9 = arg0.field1331[var8];
            if (var9 != null) {
                if (var9.field5543 > 0) {
                    var9.field5543--;
                } else {
                    class93 var10 = class126.method1091((byte) 23, var9.field5542);
                    if (var10 == null || var10.field1428 == null) {
                        arg0.field1331[var8] = null;
                    } else {
                        var9.field5547++;
                        if (var9.field5535 < var10.field1428.length && var10.field1429[var9.field5535] < var9.field5547) {
                            var9.field5535++;
                            var9.field5547 = 1;
                            class335.method2358(arg0.field1359, var9.field5535, var10, class173.field2746 == arg0, arg0.field1286, true);
                        }
                        if (var9.field5535 >= var10.field1428.length) {
                            var9.field5535 -= var10.field1430;
                            var9.field5541++;
                            if (var9.field5541 >= var10.field1426) {
                                arg0.field1331[var8] = null;
                            } else if (var9.field5535 >= 0 && var9.field5535 < var10.field1428.length) {
                                class335.method2358(arg0.field1359, var9.field5535, var10, class173.field2746 == arg0, arg0.field1286, true);
                            } else {
                                arg0.field1331[var8] = null;
                            }
                        }
                        var9.field5539 = var9.field5535 + 1;
                        if (var10.field1428.length <= var9.field5539) {
                            var9.field5539 -= var10.field1430;
                            if (var10.field1426 <= var9.field5541 + 1) {
                                var9.field5539 = -1;
                            } else if (var9.field5539 < 0 || var10.field1428.length <= var9.field5539) {
                                var9.field5539 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 71) {
            field4021 = (class215) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V", line = 314)
    public class262(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class119.method1012(arg1, arg0, -127);
            int var4 = arg1 / var3;
            this.field4012 = var4;
            int var5 = arg0 / var3;
            this.field4014 = var5;
            this.field4017 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4017[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I", line = 377)
    public final int method1925(int arg0, int arg1) {
        if (this.field4017 != null) {
            arg1 = (int) ((long) this.field4012 * (long) arg1 / (long) this.field4014);
        }
        field4019++;
        int var3 = -97 % ((3 - arg0) / 45);
        return arg1;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)I", line = 392)
    public final int method1926(int arg0, int arg1) {
        if (this.field4017 != null) {
            arg0 = (int) ((long) this.field4012 * (long) arg0 / (long) this.field4014) + 6;
        }
        if (arg1 < 4) {
            field4020 = 22;
        }
        field4016++;
        return arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z[B)[B", line = 406)
    public final byte[] method1927(boolean arg0, byte[] arg1) {
        if (this.field4017 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4012 / (long) this.field4014) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field4017[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var6 + var10] += var9[var10] * var8;
                }
                int var11 = this.field4012 + var5;
                int var12 = var11 / this.field4014;
                var6 += var12;
                var5 = var11 - this.field4014 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        field4013++;
        return arg0 ? arg1 : (byte[]) null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 476)
    public static void method1928(byte arg0) {
        int var1 = -8 / ((arg0 - 62) / 48);
        field4021 = null;
    }
}
