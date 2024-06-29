import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class39 extends class13 {

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "[I")
    private int[] field552 = new int[257];

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field557 = -1;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "Lno;")
    public static class420 field562 = new class420(16);

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "Lbj;")
    public static class131 field570 = new class131(64);

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "[I")
    public static int[] field571 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "Lko;")
    public static class294 field572;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "[[I")
    private int[][] field554;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    private final void method359(int arg0) {
        ++field566;
        if (arg0 == 1) {
            int var2 = this.field554.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && this.field554[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 <= var4) {
                        int[] var7 = this.field554[var2 - 1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field554[var4];
                        if (var4 > 0) {
                            int[] var12 = this.field554[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                            int var14 = 4096 - var13;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                            var9 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        } else {
                            var8 = var11[2];
                            var9 = var11[3];
                            var10 = var11[1];
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (var17 >= 0) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var16 >= 0) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    this.field552[var3] = class393.method2487(var15, class393.method2487(var16 << 8, var17 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)V")
    private final void method360(int arg0, int arg1) {
        ++field560;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field554 = new int[4][4];
                                this.field554[0][1] = 0;
                                this.field554[0][0] = 2048;
                                this.field554[0][2] = 4096;
                                this.field554[0][3] = 0;
                                this.field554[1][0] = 2867;
                                this.field554[1][2] = 4096;
                                this.field554[1][1] = 4096;
                                this.field554[1][3] = 0;
                                this.field554[2][1] = 4096;
                                this.field554[2][2] = 4096;
                                this.field554[2][0] = 3276;
                                this.field554[2][3] = 0;
                                this.field554[3][2] = 0;
                                this.field554[3][3] = 0;
                                this.field554[3][1] = 4096;
                                this.field554[3][0] = 4096;
                            } else {
                                this.field554 = new int[16][4];
                                this.field554[0][2] = 192;
                                this.field554[0][1] = 80;
                                this.field554[0][0] = 0;
                                this.field554[0][3] = 321;
                                this.field554[1][0] = 155;
                                this.field554[1][3] = 562;
                                this.field554[1][2] = 449;
                                this.field554[1][1] = 321;
                                this.field554[2][1] = 578;
                                this.field554[2][0] = 389;
                                this.field554[2][3] = 803;
                                this.field554[2][2] = 690;
                                this.field554[3][3] = 1140;
                                this.field554[3][1] = 947;
                                this.field554[3][0] = 671;
                                this.field554[3][2] = 995;
                                this.field554[4][0] = 897;
                                this.field554[4][2] = 1397;
                                this.field554[4][3] = 1509;
                                this.field554[4][1] = 1285;
                                this.field554[5][2] = 1429;
                                this.field554[5][1] = 1525;
                                this.field554[5][3] = 1413;
                                this.field554[5][0] = 1175;
                                this.field554[6][0] = 1368;
                                this.field554[6][3] = 1333;
                                this.field554[6][1] = 1734;
                                this.field554[6][2] = 1461;
                                this.field554[7][3] = 1702;
                                this.field554[7][1] = 1413;
                                this.field554[7][0] = 1507;
                                this.field554[7][2] = 1525;
                                this.field554[8][3] = 2056;
                                this.field554[8][2] = 1590;
                                this.field554[8][1] = 1108;
                                this.field554[8][0] = 1736;
                                this.field554[9][2] = 2056;
                                this.field554[9][3] = 2666;
                                this.field554[9][1] = 1766;
                                this.field554[9][0] = 2088;
                                this.field554[10][3] = 3276;
                                this.field554[10][2] = 2586;
                                this.field554[10][0] = 2355;
                                this.field554[10][1] = 2409;
                                this.field554[11][2] = 3148;
                                this.field554[11][1] = 3116;
                                this.field554[11][3] = 3228;
                                this.field554[11][0] = 2691;
                                this.field554[12][3] = 3196;
                                this.field554[12][1] = 3806;
                                this.field554[12][0] = 3031;
                                this.field554[12][2] = 3710;
                                this.field554[13][0] = 3522;
                                this.field554[13][2] = 3421;
                                this.field554[13][3] = 3019;
                                this.field554[13][1] = 3437;
                                this.field554[14][2] = 3148;
                                this.field554[14][3] = 3228;
                                this.field554[14][1] = 3116;
                                this.field554[14][0] = 3727;
                                this.field554[15][0] = 4096;
                                this.field554[15][2] = 2505;
                                this.field554[15][3] = 2746;
                                this.field554[15][1] = 2377;
                            }
                        } else {
                            this.field554 = new int[6][4];
                            this.field554[0][3] = 0;
                            this.field554[0][0] = 0;
                            this.field554[0][2] = 0;
                            this.field554[0][1] = 0;
                            this.field554[1][3] = 1493;
                            this.field554[1][1] = 0;
                            this.field554[1][2] = 0;
                            this.field554[1][0] = 1843;
                            this.field554[2][2] = 0;
                            this.field554[2][0] = 2457;
                            this.field554[2][1] = 0;
                            this.field554[2][3] = 2939;
                            this.field554[3][2] = 1124;
                            this.field554[3][0] = 2781;
                            this.field554[3][1] = 0;
                            this.field554[3][3] = 3565;
                            this.field554[4][1] = 546;
                            this.field554[4][2] = 3084;
                            this.field554[4][3] = 4031;
                            this.field554[4][0] = 3481;
                            this.field554[5][0] = 4096;
                            this.field554[5][1] = 4096;
                            this.field554[5][3] = 4096;
                            this.field554[5][2] = 4096;
                        }
                    } else {
                        this.field554 = new int[7][4];
                        this.field554[0][3] = 4096;
                        this.field554[0][2] = 0;
                        this.field554[0][0] = 0;
                        this.field554[0][1] = 0;
                        this.field554[1][3] = 4096;
                        this.field554[1][2] = 4096;
                        this.field554[1][0] = 663;
                        this.field554[1][1] = 0;
                        this.field554[2][2] = 4096;
                        this.field554[2][3] = 0;
                        this.field554[2][0] = 1363;
                        this.field554[2][1] = 0;
                        this.field554[3][0] = 2048;
                        this.field554[3][2] = 4096;
                        this.field554[3][3] = 0;
                        this.field554[3][1] = 4096;
                        this.field554[4][2] = 0;
                        this.field554[4][3] = 0;
                        this.field554[4][0] = 2727;
                        this.field554[4][1] = 4096;
                        this.field554[5][3] = 4096;
                        this.field554[5][2] = 0;
                        this.field554[5][1] = 4096;
                        this.field554[5][0] = 3411;
                        this.field554[6][0] = 4096;
                        this.field554[6][2] = 0;
                        this.field554[6][1] = 0;
                        this.field554[6][3] = 4096;
                    }
                } else {
                    this.field554 = new int[8][4];
                    this.field554[0][1] = 2650;
                    this.field554[0][3] = 2361;
                    this.field554[0][2] = 2602;
                    this.field554[0][0] = 0;
                    this.field554[1][1] = 2313;
                    this.field554[1][0] = 2867;
                    this.field554[1][2] = 1799;
                    this.field554[1][3] = 1558;
                    this.field554[2][3] = 1413;
                    this.field554[2][2] = 1734;
                    this.field554[2][0] = 3072;
                    this.field554[2][1] = 2618;
                    this.field554[3][3] = 947;
                    this.field554[3][0] = 3276;
                    this.field554[3][1] = 2296;
                    this.field554[3][2] = 1220;
                    this.field554[4][3] = 722;
                    this.field554[4][0] = 3481;
                    this.field554[4][2] = 963;
                    this.field554[4][1] = 2072;
                    this.field554[5][1] = 2730;
                    this.field554[5][2] = 2152;
                    this.field554[5][3] = 1766;
                    this.field554[5][0] = 3686;
                    this.field554[6][3] = 915;
                    this.field554[6][2] = 1060;
                    this.field554[6][0] = 3891;
                    this.field554[6][1] = 2232;
                    this.field554[7][3] = 1140;
                    this.field554[7][1] = 1686;
                    this.field554[7][0] = 4096;
                    this.field554[7][2] = 1413;
                }
            } else {
                this.field554 = new int[2][4];
                this.field554[0][0] = 0;
                this.field554[0][2] = 0;
                this.field554[0][3] = 0;
                this.field554[0][1] = 0;
                this.field554[1][0] = 4096;
                this.field554[1][2] = 4096;
                this.field554[1][1] = 4096;
                this.field554[1][3] = 4096;
            }
        }
        if (arg0 != 13478) {
            field557 = 23;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lnq;Lnq;IZI)V")
    public static final void method361(class268 arg0, class268 arg1, int arg2, boolean arg3, int arg4) {
        ++field551;
        class12.field247 = arg0;
        int var5 = 53 % ((arg4 - 47) / 34);
        class155.field2188 = arg3;
        class250.field3540 = arg2;
        class108.field1560 = arg1;
        int var6 = class12.field247.method1742(-1) + -1;
        class346.field4728 = class12.field247.method1739(56, var6) + var6 * 256;
        class77.field1103 = new String[] { null, null, class337.field4627.method2763(118, class250.field3540), null, null };
        class20.field372 = new String[] { null, null, null, null, class346.field4721.method2763(79, class250.field3540) };
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Lcf;")
    public static final class361 method362(byte arg0, int arg1) {
        ++field563;
        class361 var2 = (class361) class328.field4540.method904(false, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class30.field494.method1745(arg1, (byte) -121, 4);
            class361 var4 = new class361();
            if (var3 != null) {
                var4.method2322(-18913, new class11(var3), arg1);
            }
            var4.method2321(0, arg1);
            class328.field4540.method902((long) arg1, (byte) 112, var4);
            if (arg0 != 3) {
                method363(-31);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public static final void method363(int arg0) {
        ++field569;
        for (int var1 = -1; ~class26.field467 < ~var1; ++var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class66.field974[var1];
            }
            class134 var3 = class381.field5447[var2];
            if (var3 != null) {
                class260.method1709(var3.method942(false), var3, -47);
            }
        }
        if (arg0 <= 125) {
            method363(-20);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILg;)V")
    public static final void method364(int arg0, class87 arg1) {
        if (arg0 != 1461) {
            field573 = 64;
        }
        ++field556;
        if (!class271.field3762) {
            arg1.method2467((byte) -122);
            --class90.field1260;
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)I")
    public static final int method365(byte arg0) {
        ++field561;
        if (arg0 < 109) {
            field568 = 71;
        }
        return class178.field2456;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
    public static void method366(int arg0) {
        field562 = null;
        field571 = null;
        field572 = null;
        if (arg0 == 6) {
            field570 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field564;
        if (arg0 != -27832) {
            this.field552 = null;
        }
        int[][] var3 = super.field256.method1930(arg1, (byte) 107);
        if (super.field256.field4154) {
            int[] var4 = this.method223(0, -11541, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class269.field3751 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field552[var9];
                var5[var8] = class387.method2454(var10, 16711680) >> 12;
                var6[var8] = class387.method2454(4080, var10 >> 4);
                var7[var8] = class387.method2454(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class39() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (this.field554 == null) {
            this.method360(13478, 1);
        }
        ++field555;
        this.method359(1);
        int var2 = -6 / ((arg0 - 2) / 51);
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(B)V")
    public static final void method367(byte arg0) {
        ++field565;
        if (arg0 != -64) {
            field562 = null;
        }
        if (~class446.field6250 == -11) {
            class139.method958(28, false);
        }
        if (~class446.field6250 == -31) {
            class139.method958(25, false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 <= 50) {
            method365((byte) -32);
        }
        ++field567;
        if (~arg2 == -1) {
            int var4 = arg0.method172((byte) 52);
            if (var4 != 0) {
                this.method360(13478, var4);
            } else {
                this.field554 = new int[arg0.method172((byte) 52)][4];
                for (int var5 = 0; ~this.field554.length < ~var5; ++var5) {
                    this.field554[var5][0] = arg0.method174(255);
                    this.field554[var5][1] = arg0.method172((byte) 52) << 4;
                    this.field554[var5][2] = arg0.method172((byte) 52) << 4;
                    this.field554[var5][3] = arg0.method172((byte) 52) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLoo;)I")
    public static final int method368(boolean arg0, class374 arg1) {
        ++field559;
        if (arg1.field5313 == 0) {
            return 0;
        } else {
            if (~arg1.field5275 != 0 && ~arg1.field5275 > -32769) {
                class198 var2 = class98.field1358[arg1.field5275];
                if (var2 != null) {
                    int var3 = arg1.field6262 - var2.field6262;
                    int var4 = -var2.field6266 + arg1.field6266;
                    if (~var3 != -1 || var4 != 0) {
                        arg1.method2385(15141, 16383 & (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D));
                    }
                }
            }
            if (~arg1.field5275 <= -32769) {
                int var5 = arg1.field5275 + -32768;
                if (class40.field588 == var5) {
                    var5 = 2047;
                }
                class134 var6 = class381.field5447[var5];
                if (var6 != null) {
                    int var7 = -var6.field6262 + arg1.field6262;
                    int var8 = -var6.field6266 + arg1.field6266;
                    if (~var7 != -1 || ~var8 != -1) {
                        arg1.method2385(15141, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)));
                    }
                }
            }
            if ((arg1.field5281 != 0 || arg1.field5258 != 0) && (arg1.field5344 == 0 || arg1.field5339 > 0)) {
                int var9 = -((arg1.field5281 - class212.field2968 + -class212.field2968) * 64) + arg1.field6262;
                int var10 = -((-class447.field6269 + arg1.field5258 + -class447.field6269) * 64) + arg1.field6266;
                if (~var9 != -1 || var10 != 0) {
                    arg1.method2385(15141, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var9, (double) var10)));
                }
                arg1.field5281 = 0;
                arg1.field5258 = 0;
            }
            return !arg0 ? 81 : arg1.method2390(-90);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IJLuo;)V")
    public static final void method369(int arg0, long arg1, class345 arg2) {
        ++field553;
        class302.field4167 = 0;
        class370.field5201 = class274.field3820;
        class274.field3820 = 0;
        if (arg0 < 80) {
            field572 = null;
        }
        long var4 = class385.method2442(-6631);
        for (class313 var6 = (class313) class21.field380.method1005(-1); var6 != null; var6 = (class313) class21.field380.method1012((byte) -94)) {
            if (var6.method2023(arg2, arg1)) {
                ++class302.field4167;
            }
        }
        if (class277.field3880 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class21.field380.method1004(0) + ", running: " + class302.field4167 + ". Particles: " + class274.field3820 + ". Time taken: " + (class385.method2442(-6631) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)Z")
    public static final boolean method370(int arg0, int arg1) {
        ++field558;
        if (~arg0 != -5 && ~arg0 != -12 && ~arg0 != -16 && arg0 != 58 && arg0 != 45) {
            if (~arg0 != -23 && arg0 != 1010) {
                if (arg1 != 1010) {
                    field571 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
