import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class372 extends class371 {

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "[I")
    private int[] field5389 = new int[257];

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "J")
    public static long field5382 = 0L;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "Lqu;")
    public static class364 field5393 = new class364(36, 8);

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "Lqp;")
    public static class586 field5395 = new class586(79, 3);

    @OriginalMember(owner = "client!bn", name = "Y", descriptor = "D")
    public static double field5396 = -1.0D;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "[Lha;")
    public static class116[] field5384;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "[[I")
    private int[][] field5386;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            this.method2267((byte) 29);
        }
        ++field5381;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632) {
            int[] var4 = this.method2260((byte) -121, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class41.field455 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5389[var9];
                var5[var8] = class637.method3693(var10, 16711680) >> 12;
                var6[var8] = class637.method3693(65280, var10) >> 4;
                var7[var8] = class637.method3693(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)Z")
    public static final boolean method2266(int arg0) {
        ++field5392;
        if (arg0 != 0) {
            method2266(-127);
        }
        return class487.field7385 > 0;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
    private final void method2267(byte arg0) {
        ++field5387;
        if (arg0 != 52) {
            this.method2267((byte) -39);
        }
        int var2 = this.field5386.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && ~this.field5386[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field5386[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field5386[var4];
                    if (~var4 >= -1) {
                        var10 = var11[2];
                        var9 = var11[1];
                        var8 = var11[3];
                    } else {
                        int[] var12 = this.field5386[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field5389[var3] = class313.method1926(var15, class313.method1926(var16 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final void method212(int arg0) {
        if (this.field5386 == null) {
            this.method2272(1, 1);
        }
        ++field5390;
        if (arg0 != -19103) {
            this.field5386 = null;
        }
        this.method2267((byte) 52);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method2268(int arg0, short[] arg1, int arg2) {
        if (arg0 != 1065049863) {
            return null;
        } else {
            ++field5391;
            short[] var3 = new short[arg2];
            class473.method2879(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILn;Lqa;)V")
    public static final void method2269(int arg0, class472 arg1, class167 arg2) {
        ++field5388;
        if (class113.field1419 != null) {
            if (class436.field6426 < 10) {
                if (!class113.field1415.method3476(100, class113.field1419.field647)) {
                    class436.field6426 = class308.field4493.method3471(class113.field1419.field647, arg0 ^ 1493) / 10;
                    return;
                }
                class488.method2957(2020);
                class436.field6426 = 10;
            }
            if (~class436.field6426 == -11) {
                class113.field1434 = class113.field1419.field634 >> 6 << 6;
                class113.field1445 = class113.field1419.field638 >> 6 << 6;
                class113.field1438 = (class113.field1419.field631 >> 6 << 6) - -64 + -class113.field1445;
                class113.field1439 = (class113.field1419.field640 >> 6 << 6) - class113.field1434 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class113.field1419.method268(var3, (class239.field3493.field3464 >> 7) + class584.field8677, class239.field3493.field3457, -26161, (class239.field3493.field3463 >> 7) + class424.field6061)) {
                    var4 = var3[1] + -class113.field1445;
                    var5 = var3[2] + -class113.field1434;
                }
                if (!class404.field5808 && ~var4 <= -1 && ~var4 > ~class113.field1438 && ~var5 <= -1 && ~class113.field1439 < ~var5) {
                    int var6 = var5 + -5 + (int) (10.0D * Math.random());
                    int var7 = var4 + -5 + (int) (Math.random() * 10.0D);
                    class296.field4338 = var7;
                    class527.field7824 = var6;
                } else if (~class536.field7932 != 0 && ~class15.field133 != 0) {
                    class113.field1419.method274(var3, class15.field133, class536.field7932, -71);
                    class404.field5808 = false;
                    class15.field133 = -1;
                    class536.field7932 = -1;
                    if (var3 != null) {
                        class527.field7824 = var3[2] + -class113.field1434;
                        class296.field4338 = var3[1] - class113.field1445;
                    }
                } else {
                    class113.field1419.method274(var3, 16383 & class113.field1419.field649, (268420156 & class113.field1419.field649) >> 14, -117);
                    class296.field4338 = var3[1] + -class113.field1445;
                    class527.field7824 = var3[2] + -class113.field1434;
                }
                if (class113.field1419.field648 == 37) {
                    class113.field1426 = 3.0F;
                    class113.field1433 = 3.0F;
                } else if (~class113.field1419.field648 != -51) {
                    if (class113.field1419.field648 == 75) {
                        class113.field1426 = 6.0F;
                        class113.field1433 = 6.0F;
                    } else if (class113.field1419.field648 != 100) {
                        if (class113.field1419.field648 != 200) {
                            class113.field1426 = 8.0F;
                            class113.field1433 = 8.0F;
                        } else {
                            class113.field1426 = 16.0F;
                            class113.field1433 = 16.0F;
                        }
                    } else {
                        class113.field1426 = 8.0F;
                        class113.field1433 = 8.0F;
                    }
                } else {
                    class113.field1426 = 4.0F;
                    class113.field1433 = 4.0F;
                }
                class113.field1430 = (int) class113.field1426 >> 1;
                class113.field1427 = class604.method3514(arg0 + -1493, class113.field1430);
                class424.method2511(-1);
                class113.method687();
                class34.field391 = new class419();
                class113.field1425 += (int) (Math.random() * 5.0D) + -2;
                if (class113.field1425 < -8) {
                    class113.field1425 = -8;
                }
                if (~class113.field1425 < -9) {
                    class113.field1425 = 8;
                }
                class113.field1424 += (int) (Math.random() * 5.0D) + -2;
                if (~class113.field1424 > 15) {
                    class113.field1424 = -16;
                }
                if (class113.field1424 > 16) {
                    class113.field1424 = 16;
                }
                class113.method679(arg1, class113.field1425 >> 2 << 10, class113.field1424 >> 1);
                class113.field1420.method1217(1024, 256, -119);
                class113.field1418.method1718(256, 256, 126);
                class113.field1421.method2010(4096, true);
                class23.field200.method2976(true, 256);
                class436.field6426 = 20;
            } else if (~class436.field6426 == -21) {
                class151.method885((byte) -89, true);
                class113.method666(arg2, class113.field1425, class113.field1424);
                class436.field6426 = 60;
                class151.method885((byte) -124, true);
                class304.method1879(0);
            } else if (~class436.field6426 == -61) {
                if (class113.field1415.method3463(class113.field1419.field647 + "_staticelements", 46)) {
                    if (!class113.field1415.method3476(100, class113.field1419.field647 + "_staticelements")) {
                        return;
                    }
                    class113.field1431 = class97.method559(class113.field1419.field647 + "_staticelements", class113.field1415, (byte) -123, class306.field4467);
                } else {
                    class113.field1431 = new class191(0);
                }
                class113.method667();
                class436.field6426 = 70;
                class151.method885((byte) -96, true);
                class304.method1879(arg0 + -1493);
            } else if (~class436.field6426 == -71) {
                class292.field4277 = new class440(arg2, 11, true, class110.field1401);
                class436.field6426 = 73;
                class151.method885((byte) -114, true);
                class304.method1879(arg0 + -1493);
            } else if (~class436.field6426 == -74) {
                class325.field4809 = new class440(arg2, 12, true, class110.field1401);
                class436.field6426 = 76;
                class151.method885((byte) -74, true);
                class304.method1879(0);
            } else if (class436.field6426 == 76) {
                class576.field8507 = new class440(arg2, 14, true, class110.field1401);
                class436.field6426 = 79;
                class151.method885((byte) -111, true);
                class304.method1879(arg0 + -1493);
            } else if (~class436.field6426 == -80) {
                class328.field4851 = new class440(arg2, 17, true, class110.field1401);
                class436.field6426 = 82;
                class151.method885((byte) -84, true);
                class304.method1879(0);
            } else if (class436.field6426 == 82) {
                class71.field833 = new class440(arg2, 19, true, class110.field1401);
                class436.field6426 = 85;
                class151.method885((byte) -83, true);
                class304.method1879(arg0 + -1493);
            } else if (class436.field6426 == 85) {
                class523.field7755 = new class440(arg2, 22, true, class110.field1401);
                class436.field6426 = 88;
                class151.method885((byte) -75, true);
                class304.method1879(arg0 + -1493);
            } else if (~class436.field6426 == -89) {
                class150.field1925 = new class440(arg2, 26, true, class110.field1401);
                class436.field6426 = 91;
                class151.method885((byte) -95, true);
                class304.method1879(0);
            } else {
                if (arg0 != 1493) {
                    field5393 = null;
                }
                class377.field5543 = new class440(arg2, 30, true, class110.field1401);
                class436.field6426 = 100;
                class151.method885((byte) -74, true);
                class304.method1879(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(Z)V")
    public static void method2270(boolean arg0) {
        field5393 = null;
        if (!arg0) {
            field5395 = null;
            field5384 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
    public static final void method2271(int arg0, int arg1, int arg2) {
        if (class580.field8539 != arg0) {
            if (class580.field8539 == 2) {
                class318.method1998(arg1, arg2, 16);
            }
        } else {
            class34.method168(arg2, class468.field6924, (byte) -92, arg1);
        }
        ++field5383;
        class468.field6924 = null;
        class580.field8539 = 0;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
    public class372() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
    private final void method2272(int arg0, int arg1) {
        ++field5394;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field5386 = new int[4][4];
                                this.field5386[0][2] = 4096;
                                this.field5386[0][0] = 2048;
                                this.field5386[0][3] = 0;
                                this.field5386[0][1] = 0;
                                this.field5386[1][0] = 2867;
                                this.field5386[1][3] = 0;
                                this.field5386[1][1] = 4096;
                                this.field5386[1][2] = 4096;
                                this.field5386[2][1] = 4096;
                                this.field5386[2][3] = 0;
                                this.field5386[2][2] = 4096;
                                this.field5386[2][0] = 3276;
                                this.field5386[3][3] = 0;
                                this.field5386[3][0] = 4096;
                                this.field5386[3][1] = 4096;
                                this.field5386[3][2] = 0;
                            } else {
                                this.field5386 = new int[16][4];
                                this.field5386[0][2] = 192;
                                this.field5386[0][3] = 321;
                                this.field5386[0][0] = 0;
                                this.field5386[0][1] = 80;
                                this.field5386[1][0] = 155;
                                this.field5386[1][3] = 562;
                                this.field5386[1][2] = 449;
                                this.field5386[1][1] = 321;
                                this.field5386[2][3] = 803;
                                this.field5386[2][0] = 389;
                                this.field5386[2][2] = 690;
                                this.field5386[2][1] = 578;
                                this.field5386[3][0] = 671;
                                this.field5386[3][1] = 947;
                                this.field5386[3][2] = 995;
                                this.field5386[3][3] = 1140;
                                this.field5386[4][1] = 1285;
                                this.field5386[4][2] = 1397;
                                this.field5386[4][0] = 897;
                                this.field5386[4][3] = 1509;
                                this.field5386[5][2] = 1429;
                                this.field5386[5][1] = 1525;
                                this.field5386[5][0] = 1175;
                                this.field5386[5][3] = 1413;
                                this.field5386[6][3] = 1333;
                                this.field5386[6][1] = 1734;
                                this.field5386[6][0] = 1368;
                                this.field5386[6][2] = 1461;
                                this.field5386[7][0] = 1507;
                                this.field5386[7][2] = 1525;
                                this.field5386[7][3] = 1702;
                                this.field5386[7][1] = 1413;
                                this.field5386[8][1] = 1108;
                                this.field5386[8][2] = 1590;
                                this.field5386[8][3] = 2056;
                                this.field5386[8][0] = 1736;
                                this.field5386[9][2] = 2056;
                                this.field5386[9][0] = 2088;
                                this.field5386[9][1] = 1766;
                                this.field5386[9][3] = 2666;
                                this.field5386[10][3] = 3276;
                                this.field5386[10][2] = 2586;
                                this.field5386[10][1] = 2409;
                                this.field5386[10][0] = 2355;
                                this.field5386[11][1] = 3116;
                                this.field5386[11][2] = 3148;
                                this.field5386[11][0] = 2691;
                                this.field5386[11][3] = 3228;
                                this.field5386[12][2] = 3710;
                                this.field5386[12][3] = 3196;
                                this.field5386[12][1] = 3806;
                                this.field5386[12][0] = 3031;
                                this.field5386[13][1] = 3437;
                                this.field5386[13][0] = 3522;
                                this.field5386[13][2] = 3421;
                                this.field5386[13][3] = 3019;
                                this.field5386[14][1] = 3116;
                                this.field5386[14][0] = 3727;
                                this.field5386[14][3] = 3228;
                                this.field5386[14][2] = 3148;
                                this.field5386[15][1] = 2377;
                                this.field5386[15][2] = 2505;
                                this.field5386[15][3] = 2746;
                                this.field5386[15][0] = 4096;
                            }
                        } else {
                            this.field5386 = new int[6][4];
                            this.field5386[0][2] = 0;
                            this.field5386[0][0] = 0;
                            this.field5386[0][1] = 0;
                            this.field5386[0][3] = 0;
                            this.field5386[1][2] = 0;
                            this.field5386[1][0] = 1843;
                            this.field5386[1][3] = 1493;
                            this.field5386[1][1] = 0;
                            this.field5386[2][1] = 0;
                            this.field5386[2][2] = 0;
                            this.field5386[2][3] = 2939;
                            this.field5386[2][0] = 2457;
                            this.field5386[3][2] = 1124;
                            this.field5386[3][3] = 3565;
                            this.field5386[3][0] = 2781;
                            this.field5386[3][1] = 0;
                            this.field5386[4][2] = 3084;
                            this.field5386[4][0] = 3481;
                            this.field5386[4][3] = 4031;
                            this.field5386[4][1] = 546;
                            this.field5386[5][1] = 4096;
                            this.field5386[5][0] = 4096;
                            this.field5386[5][2] = 4096;
                            this.field5386[5][3] = 4096;
                        }
                    } else {
                        this.field5386 = new int[7][4];
                        this.field5386[0][0] = 0;
                        this.field5386[0][2] = 0;
                        this.field5386[0][3] = 4096;
                        this.field5386[0][1] = 0;
                        this.field5386[1][1] = 0;
                        this.field5386[1][3] = 4096;
                        this.field5386[1][2] = 4096;
                        this.field5386[1][0] = 663;
                        this.field5386[2][3] = 0;
                        this.field5386[2][2] = 4096;
                        this.field5386[2][1] = 0;
                        this.field5386[2][0] = 1363;
                        this.field5386[3][3] = 0;
                        this.field5386[3][2] = 4096;
                        this.field5386[3][0] = 2048;
                        this.field5386[3][1] = 4096;
                        this.field5386[4][0] = 2727;
                        this.field5386[4][2] = 0;
                        this.field5386[4][3] = 0;
                        this.field5386[4][1] = 4096;
                        this.field5386[5][1] = 4096;
                        this.field5386[5][2] = 0;
                        this.field5386[5][3] = 4096;
                        this.field5386[5][0] = 3411;
                        this.field5386[6][0] = 4096;
                        this.field5386[6][1] = 0;
                        this.field5386[6][3] = 4096;
                        this.field5386[6][2] = 0;
                    }
                } else {
                    this.field5386 = new int[8][4];
                    this.field5386[0][2] = 2602;
                    this.field5386[0][0] = 0;
                    this.field5386[0][3] = 2361;
                    this.field5386[0][1] = 2650;
                    this.field5386[1][1] = 2313;
                    this.field5386[1][3] = 1558;
                    this.field5386[1][2] = 1799;
                    this.field5386[1][0] = 2867;
                    this.field5386[2][3] = 1413;
                    this.field5386[2][0] = 3072;
                    this.field5386[2][2] = 1734;
                    this.field5386[2][1] = 2618;
                    this.field5386[3][2] = 1220;
                    this.field5386[3][1] = 2296;
                    this.field5386[3][0] = 3276;
                    this.field5386[3][3] = 947;
                    this.field5386[4][0] = 3481;
                    this.field5386[4][1] = 2072;
                    this.field5386[4][3] = 722;
                    this.field5386[4][2] = 963;
                    this.field5386[5][0] = 3686;
                    this.field5386[5][3] = 1766;
                    this.field5386[5][2] = 2152;
                    this.field5386[5][1] = 2730;
                    this.field5386[6][0] = 3891;
                    this.field5386[6][1] = 2232;
                    this.field5386[6][3] = 915;
                    this.field5386[6][2] = 1060;
                    this.field5386[7][0] = 4096;
                    this.field5386[7][3] = 1140;
                    this.field5386[7][1] = 1686;
                    this.field5386[7][2] = 1413;
                }
            } else {
                this.field5386 = new int[2][4];
                this.field5386[0][3] = 0;
                this.field5386[0][2] = 0;
                this.field5386[0][1] = 0;
                this.field5386[0][0] = 0;
                this.field5386[1][2] = 4096;
                this.field5386[1][0] = 4096;
                this.field5386[1][3] = 4096;
                this.field5386[1][1] = 4096;
            }
        }
        if (arg0 != 1) {
            this.field5389 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = 73 / ((-15 - arg1) / 39);
        ++field5385;
        if (~arg0 == -1) {
            int var5 = arg2.method2561((byte) -45);
            if (var5 != 0) {
                this.method2272(1, var5);
            } else {
                this.field5386 = new int[arg2.method2561((byte) 114)][4];
                for (int var6 = 0; ~this.field5386.length < ~var6; ++var6) {
                    this.field5386[var6][0] = arg2.method2620(15);
                    this.field5386[var6][1] = arg2.method2561((byte) -95) << 4;
                    this.field5386[var6][2] = arg2.method2561((byte) -73) << 4;
                    this.field5386[var6][3] = arg2.method2561((byte) -120) << 4;
                }
            }
        }
    }
}
