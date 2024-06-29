import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class395 extends class424 {

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "[I")
    private int[] field5481 = new int[257];

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field5489 = 0;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field5486 = 0;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "[[I")
    private int[][] field5483;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(IB)V")
    private final void method2452(int arg0, byte arg1) {
        if (arg1 > -97) {
            this.method2452(-42, (byte) 16);
        }
        ++field5490;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field5483 = new int[4][4];
                                    this.field5483[0][1] = 0;
                                    this.field5483[0][0] = 2048;
                                    this.field5483[0][2] = 4096;
                                    this.field5483[0][3] = 0;
                                    this.field5483[1][2] = 4096;
                                    this.field5483[1][0] = 2867;
                                    this.field5483[1][3] = 0;
                                    this.field5483[1][1] = 4096;
                                    this.field5483[2][1] = 4096;
                                    this.field5483[2][0] = 3276;
                                    this.field5483[2][3] = 0;
                                    this.field5483[2][2] = 4096;
                                    this.field5483[3][0] = 4096;
                                    this.field5483[3][1] = 4096;
                                    this.field5483[3][2] = 0;
                                    this.field5483[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field5483 = new int[16][4];
                                this.field5483[0][3] = 321;
                                this.field5483[0][1] = 80;
                                this.field5483[0][2] = 192;
                                this.field5483[0][0] = 0;
                                this.field5483[1][3] = 562;
                                this.field5483[1][2] = 449;
                                this.field5483[1][0] = 155;
                                this.field5483[1][1] = 321;
                                this.field5483[2][1] = 578;
                                this.field5483[2][2] = 690;
                                this.field5483[2][3] = 803;
                                this.field5483[2][0] = 389;
                                this.field5483[3][3] = 1140;
                                this.field5483[3][2] = 995;
                                this.field5483[3][1] = 947;
                                this.field5483[3][0] = 671;
                                this.field5483[4][2] = 1397;
                                this.field5483[4][3] = 1509;
                                this.field5483[4][0] = 897;
                                this.field5483[4][1] = 1285;
                                this.field5483[5][0] = 1175;
                                this.field5483[5][1] = 1525;
                                this.field5483[5][2] = 1429;
                                this.field5483[5][3] = 1413;
                                this.field5483[6][2] = 1461;
                                this.field5483[6][3] = 1333;
                                this.field5483[6][0] = 1368;
                                this.field5483[6][1] = 1734;
                                this.field5483[7][0] = 1507;
                                this.field5483[7][3] = 1702;
                                this.field5483[7][1] = 1413;
                                this.field5483[7][2] = 1525;
                                this.field5483[8][0] = 1736;
                                this.field5483[8][1] = 1108;
                                this.field5483[8][2] = 1590;
                                this.field5483[8][3] = 2056;
                                this.field5483[9][3] = 2666;
                                this.field5483[9][2] = 2056;
                                this.field5483[9][1] = 1766;
                                this.field5483[9][0] = 2088;
                                this.field5483[10][3] = 3276;
                                this.field5483[10][0] = 2355;
                                this.field5483[10][2] = 2586;
                                this.field5483[10][1] = 2409;
                                this.field5483[11][3] = 3228;
                                this.field5483[11][1] = 3116;
                                this.field5483[11][0] = 2691;
                                this.field5483[11][2] = 3148;
                                this.field5483[12][3] = 3196;
                                this.field5483[12][2] = 3710;
                                this.field5483[12][1] = 3806;
                                this.field5483[12][0] = 3031;
                                this.field5483[13][2] = 3421;
                                this.field5483[13][0] = 3522;
                                this.field5483[13][3] = 3019;
                                this.field5483[13][1] = 3437;
                                this.field5483[14][0] = 3727;
                                this.field5483[14][1] = 3116;
                                this.field5483[14][2] = 3148;
                                this.field5483[14][3] = 3228;
                                this.field5483[15][1] = 2377;
                                this.field5483[15][2] = 2505;
                                this.field5483[15][0] = 4096;
                                this.field5483[15][3] = 2746;
                            }
                        } else {
                            this.field5483 = new int[6][4];
                            this.field5483[0][1] = 0;
                            this.field5483[0][3] = 0;
                            this.field5483[0][0] = 0;
                            this.field5483[0][2] = 0;
                            this.field5483[1][1] = 0;
                            this.field5483[1][3] = 1493;
                            this.field5483[1][0] = 1843;
                            this.field5483[1][2] = 0;
                            this.field5483[2][1] = 0;
                            this.field5483[2][2] = 0;
                            this.field5483[2][0] = 2457;
                            this.field5483[2][3] = 2939;
                            this.field5483[3][3] = 3565;
                            this.field5483[3][2] = 1124;
                            this.field5483[3][1] = 0;
                            this.field5483[3][0] = 2781;
                            this.field5483[4][3] = 4031;
                            this.field5483[4][1] = 546;
                            this.field5483[4][2] = 3084;
                            this.field5483[4][0] = 3481;
                            this.field5483[5][0] = 4096;
                            this.field5483[5][2] = 4096;
                            this.field5483[5][1] = 4096;
                            this.field5483[5][3] = 4096;
                        }
                    } else {
                        this.field5483 = new int[7][4];
                        this.field5483[0][1] = 0;
                        this.field5483[0][0] = 0;
                        this.field5483[0][3] = 4096;
                        this.field5483[0][2] = 0;
                        this.field5483[1][3] = 4096;
                        this.field5483[1][1] = 0;
                        this.field5483[1][2] = 4096;
                        this.field5483[1][0] = 663;
                        this.field5483[2][2] = 4096;
                        this.field5483[2][3] = 0;
                        this.field5483[2][1] = 0;
                        this.field5483[2][0] = 1363;
                        this.field5483[3][3] = 0;
                        this.field5483[3][0] = 2048;
                        this.field5483[3][2] = 4096;
                        this.field5483[3][1] = 4096;
                        this.field5483[4][0] = 2727;
                        this.field5483[4][2] = 0;
                        this.field5483[4][1] = 4096;
                        this.field5483[4][3] = 0;
                        this.field5483[5][0] = 3411;
                        this.field5483[5][2] = 0;
                        this.field5483[5][3] = 4096;
                        this.field5483[5][1] = 4096;
                        this.field5483[6][1] = 0;
                        this.field5483[6][2] = 0;
                        this.field5483[6][3] = 4096;
                        this.field5483[6][0] = 4096;
                    }
                } else {
                    this.field5483 = new int[8][4];
                    this.field5483[0][0] = 0;
                    this.field5483[0][1] = 2650;
                    this.field5483[0][3] = 2361;
                    this.field5483[0][2] = 2602;
                    this.field5483[1][3] = 1558;
                    this.field5483[1][0] = 2867;
                    this.field5483[1][2] = 1799;
                    this.field5483[1][1] = 2313;
                    this.field5483[2][2] = 1734;
                    this.field5483[2][1] = 2618;
                    this.field5483[2][3] = 1413;
                    this.field5483[2][0] = 3072;
                    this.field5483[3][3] = 947;
                    this.field5483[3][0] = 3276;
                    this.field5483[3][1] = 2296;
                    this.field5483[3][2] = 1220;
                    this.field5483[4][0] = 3481;
                    this.field5483[4][1] = 2072;
                    this.field5483[4][2] = 963;
                    this.field5483[4][3] = 722;
                    this.field5483[5][0] = 3686;
                    this.field5483[5][2] = 2152;
                    this.field5483[5][3] = 1766;
                    this.field5483[5][1] = 2730;
                    this.field5483[6][3] = 915;
                    this.field5483[6][2] = 1060;
                    this.field5483[6][1] = 2232;
                    this.field5483[6][0] = 3891;
                    this.field5483[7][3] = 1140;
                    this.field5483[7][1] = 1686;
                    this.field5483[7][0] = 4096;
                    this.field5483[7][2] = 1413;
                }
            } else {
                this.field5483 = new int[2][4];
                this.field5483[0][1] = 0;
                this.field5483[0][0] = 0;
                this.field5483[0][3] = 0;
                this.field5483[0][2] = 0;
                this.field5483[1][0] = 4096;
                this.field5483[1][2] = 4096;
                this.field5483[1][3] = 4096;
                this.field5483[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
    public static final void method2453(int arg0) {
        ++class273.field3725;
        class88.field1232.method1151(arg0, (byte) 107);
        ++field5488;
        class88.field1232.method2280(0, 1537846408);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 != -48) {
            field5489 = 20;
        }
        ++field5484;
        if (arg2 == 0) {
            int var4 = arg0.method2306((byte) 60);
            if (~var4 != -1) {
                this.method2452(var4, (byte) -107);
            } else {
                this.field5483 = new int[arg0.method2306((byte) 28)][4];
                for (int var5 = 0; ~var5 > ~this.field5483.length; ++var5) {
                    this.field5483[var5][0] = arg0.method2297(arg1 + 13400);
                    this.field5483[var5][1] = arg0.method2306((byte) 63) << 4;
                    this.field5483[var5][2] = arg0.method2306((byte) 97) << 4;
                    this.field5483[var5][3] = arg0.method2306((byte) 111) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2454(String arg0, boolean arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        ++field5479;
        System.exit(1);
        if (!arg1) {
            field5489 = 34;
        }
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
    private final void method2455(int arg0) {
        ++field5487;
        int var2 = -111 / ((19 - arg0) / 55);
        int var3 = this.field5483.length;
        if (var3 > 0) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var7 < var3 && ~var6 <= ~this.field5483[var7][0]; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (~var5 > ~var3) {
                    int[] var8 = this.field5483[var5];
                    if (var5 <= 0) {
                        var9 = var8[3];
                        var10 = var8[2];
                        var11 = var8[1];
                    } else {
                        int[] var12 = this.field5483[var5 + -1];
                        int var13 = (-var12[0] + var6 << 12) / (var8[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var8[3] * var13 - -(var12[3] * var14) >> 12;
                        var10 = var8[2] * var13 + var12[2] * var14 >> 12;
                        var11 = var8[1] * var13 - -(var12[1] * var14) >> 12;
                    }
                } else {
                    int[] var15 = this.field5483[var3 + -1];
                    var10 = var15[2];
                    var11 = var15[1];
                    var9 = var15[3];
                }
                int var16 = var9 >> 4;
                int var17 = var11 >> 4;
                int var18 = var10 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var18 <= -1) {
                    if (~var18 < -256) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field5481[var4] = class431.method2655(var16, class431.method2655(var17 << 16, var18 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field5491;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[] var4 = this.method2621(0, -114, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class303.field4135; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5481[var9];
                var5[var8] = class187.method1301(var10, 16711680) >> 12;
                var6[var8] = class187.method1301(var10 >> 4, 4080);
                var7[var8] = class187.method1301(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (arg0 != 3) {
            field5492 = 95;
        }
        ++field5482;
        if (this.field5483 == null) {
            this.method2452(1, (byte) -123);
        }
        this.method2455(arg0 ^ -114);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
    public static final void method2456(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; ++var9) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method2456(2, arg1, arg2, arg3, var6 + -1);
            method2456(2, arg1, var6 + 1, arg3, arg4);
        }
        if (arg0 == 2) {
            ++field5485;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    public static final void method2457() {
        class447.field6344 = 0;
        label191: for (int var0 = 0; var0 < class249.field3494; ++var0) {
            class186 var1 = class150.field2178[var0];
            if (class348.field4698 != null) {
                for (int var2 = 0; var2 < class348.field4698.length; ++var2) {
                    if (class348.field4698[var2] != -1000000 && (var1.field2674 <= class348.field4698[var2] || var1.field2677 <= class348.field4698[var2]) && (var1.field2691 <= class144.field2107[var2] || var1.field2689 <= class144.field2107[var2]) && (var1.field2691 >= class183.field2570[var2] || var1.field2689 >= class183.field2570[var2]) && (var1.field2688 <= class24.field310[var2] || var1.field2681 <= class24.field310[var2]) && (var1.field2688 >= class276.field3763[var2] || var1.field2681 >= class276.field3763[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2695 == 1) {
                int var3 = var1.field2699 - class58.field750 + class244.field3440;
                if (var3 >= 0 && var3 <= class244.field3440 + class244.field3440) {
                    int var4 = var1.field2682 - class446.field6253 + class244.field3440;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2684 - class446.field6253 + class244.field3440;
                    if (var5 > class244.field3440 + class244.field3440) {
                        var5 = class244.field3440 + class244.field3440;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class6.field62[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class136.field2023 - var1.field2691;
                        if (var7 > 32) {
                            var1.field2693 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2693 = 2;
                            var7 = -var7;
                        }
                        var1.field2685 = (var1.field2688 - class373.field5175 << 8) / var7;
                        var1.field2687 = (var1.field2681 - class373.field5175 << 8) / var7;
                        var1.field2676 = (var1.field2674 - class416.field5769 << 8) / var7;
                        var1.field2679 = (var1.field2677 - class416.field5769 << 8) / var7;
                        class273.field3723[class447.field6344++] = var1;
                    }
                }
            } else if (var1.field2695 == 2) {
                int var8 = var1.field2682 - class446.field6253 + class244.field3440;
                if (var8 >= 0 && var8 <= class244.field3440 + class244.field3440) {
                    int var9 = var1.field2699 - class58.field750 + class244.field3440;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2678 - class58.field750 + class244.field3440;
                    if (var10 > class244.field3440 + class244.field3440) {
                        var10 = class244.field3440 + class244.field3440;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class6.field62[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class373.field5175 - var1.field2688;
                        if (var12 > 32) {
                            var1.field2693 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2693 = 4;
                            var12 = -var12;
                        }
                        var1.field2683 = (var1.field2691 - class136.field2023 << 8) / var12;
                        var1.field2696 = (var1.field2689 - class136.field2023 << 8) / var12;
                        var1.field2676 = (var1.field2674 - class416.field5769 << 8) / var12;
                        var1.field2679 = (var1.field2677 - class416.field5769 << 8) / var12;
                        class273.field3723[class447.field6344++] = var1;
                    }
                }
            } else if (var1.field2695 == 4) {
                int var13 = var1.field2674 - class416.field5769;
                if (var13 > 128) {
                    int var14 = var1.field2682 - class446.field6253 + class244.field3440;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2684 - class446.field6253 + class244.field3440;
                    if (var15 > class244.field3440 + class244.field3440) {
                        var15 = class244.field3440 + class244.field3440;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2699 - class58.field750 + class244.field3440;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2678 - class58.field750 + class244.field3440;
                        if (var17 > class244.field3440 + class244.field3440) {
                            var17 = class244.field3440 + class244.field3440;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class6.field62[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2693 = 5;
                            var1.field2683 = (var1.field2691 - class136.field2023 << 8) / var13;
                            var1.field2696 = (var1.field2689 - class136.field2023 << 8) / var13;
                            var1.field2685 = (var1.field2688 - class373.field5175 << 8) / var13;
                            var1.field2687 = (var1.field2681 - class373.field5175 << 8) / var13;
                            class273.field3723[class447.field6344++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class177.field2531 = 0;
        ++field5480;
        for (int var7 = -1; ~(class53.field674 + class11.field86) < ~var7; ++var7) {
            class233 var31 = null;
            class185 var32;
            if (var7 < 0) {
                var32 = class359.field4970;
            } else if (var7 >= class11.field86) {
                var32 = class428.field5951[class228.field3187[var7 - class11.field86]];
                var31 = ((class419) var32).field5807;
                if (var31.field3327 != null) {
                    var31 = var31.method1524((byte) 108);
                    if (var31 == null) {
                        continue;
                    }
                }
            } else {
                var32 = class87.field1227[class18.field243[var7]];
            }
            if (var32.field2645 >= 0) {
                class269.method1707(arg5 >> 1, arg6, var32.method1281(0), arg3 >> 1, var32, true, arg1);
                if (~class282.field3840[0] <= -1) {
                    if (var32.field2589 != null && (~class11.field86 >= ~var7 || field5489 == 0 || field5489 == 3 || field5489 == 1 && class300.method1826((byte) -121, ((class423) var32).field5869)) && ~class177.field2531 > ~class216.field3020) {
                        class216.field3022[class177.field2531] = class280.field3810.method2419(var32.field2589, (byte) -120) / 2;
                        class216.field3028[class177.field2531] = class282.field3840[0];
                        class216.field3019[class177.field2531] = class282.field3840[1];
                        class216.field3027[class177.field2531] = var32.field2581;
                        class216.field3026[class177.field2531] = var32.field2631;
                        class216.field3023[class177.field2531] = var32.field2598;
                        class216.field3024[class177.field2531] = var32.field2589;
                        ++class177.field2531;
                    }
                    class77 var33 = class344.field4644[0];
                    int var34 = class282.field3840[1] + arg4 + -Math.max(class280.field3810.field5406, var33.method631());
                    if (!var32.field2600 && var32.field2585 > class246.field3467) {
                        class77 var35 = class344.field4644[1];
                        if (var32 instanceof class419) {
                            class419 var36 = (class419) var32;
                            class77[] var37 = (class77[]) class446.field6251.method2529(0, (long) var36.field5807.field3286);
                            if (var37 == null) {
                                class96[] var38 = class96.method748(class112.field1726, var36.field5807.field3286, 0);
                                if (var38 != null) {
                                    var37 = new class77[var38.length];
                                    for (int var39 = 0; var39 < var38.length; ++var39) {
                                        var37[var39] = class354.field4765.method199(var38[var39], true);
                                    }
                                    class446.field6251.method2527(35, (long) var36.field5807.field3286, var37);
                                }
                            }
                            if (var37 != null && var37.length == 2) {
                                var33 = var37[0];
                                var35 = var37[1];
                            }
                        }
                        int var40 = class282.field3840[0] + arg2 - (var33.method628() >> 1);
                        var33.method616(var40, var34);
                        int var41 = var33.method628() * var32.field2610 / 255;
                        class354.field4765.method206(var40, var34, var40 + var41, var34 - -var33.method631());
                        var35.method616(var40, var34);
                        class354.field4765.method227(arg2, arg4, arg2 + arg5, arg3 + arg4);
                    }
                    var34 -= 2;
                    if (!var32.field2600) {
                        if (class246.field3467 < var32.field2630) {
                            class77 var42 = class134.field2005[!var32.field2632 ? 0 : 2];
                            class77 var43 = class134.field2005[var32.field2632 ? 3 : 1];
                            boolean var44 = true;
                            int var45;
                            if (var32 instanceof class419) {
                                var45 = var31.field3309;
                                if (~var45 == 0) {
                                    var45 = var32.method1283((byte) -59).field773;
                                }
                            } else {
                                var45 = var32.method1283((byte) -74).field773;
                            }
                            if (~var45 != 0) {
                                class77[] var46 = (class77[]) class416.field5767.method2529(0, (long) var45);
                                if (var46 == null) {
                                    class96[] var47 = class96.method748(class112.field1726, var45, 0);
                                    if (var47 != null) {
                                        var46 = new class77[var47.length];
                                        for (int var48 = 0; var47.length > var48; ++var48) {
                                            var46[var48] = class354.field4765.method199(var47[var48], true);
                                        }
                                        class416.field5767.method2527(-127, (long) var45, var46);
                                    }
                                }
                                if (var46 != null && var46.length == 4) {
                                    var43 = var46[!var32.field2632 ? 1 : 3];
                                    var42 = var46[var32.field2632 ? 2 : 0];
                                }
                            }
                            int var49 = -class246.field3467 + var32.field2630;
                            int var50;
                            if (var49 <= var32.field2608) {
                                var50 = var42.method628();
                            } else {
                                int var51 = var49 - var32.field2608;
                                int var52 = ~var32.field2577 == -1 ? 0 : (-var51 + var32.field2614) / var32.field2577 * var32.field2577;
                                var50 = var42.method628() * var52 / var32.field2614;
                            }
                            int var53 = var42.method631();
                            var34 -= var53;
                            int var54 = arg2 + class282.field3840[0] + -(var42.method628() >> 1);
                            var42.method616(var54, var34);
                            class354.field4765.method206(var54, var34, var50 + var54, var34 + var53);
                            var43.method616(var54, var34);
                            var34 -= 2;
                            class354.field4765.method227(arg2, arg4, arg2 + arg5, arg3 + arg4);
                        }
                        if (var7 < class11.field86) {
                            class423 var55 = (class423) var32;
                            if (var55.field5884 != -1) {
                                var34 -= 25;
                                class361.field4987[var55.field5884].method616(arg2 - (-class282.field3840[0] + 12), var34);
                                var34 -= 2;
                            }
                            if (var55.field5879 != -1) {
                                var34 -= 25;
                                class90.field1259[var55.field5879].method616(arg2 - -class282.field3840[0] + -12, var34);
                                var34 -= 2;
                            }
                        } else if (var31.field3304 >= 0 && var31.field3304 < class90.field1259.length) {
                            class77 var56 = class90.field1259[var31.field3304];
                            var34 -= 25;
                            var56.method616(class282.field3840[0] + arg2 + -(var56.method628() >> 1), var34);
                            var34 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var32 instanceof class423)) {
                        int var57 = 0;
                        class418[] var58 = class273.field3733;
                        for (int var59 = 0; var58.length > var59; ++var59) {
                            class418 var61 = var58[var59];
                            if (var61 != null && var61.field5792 == 1 && ~class228.field3187[-class11.field86 + var7] == ~var61.field5786) {
                                class77 var62 = class191.field2751[var61.field5789];
                                if (~var57 > ~var62.method631()) {
                                    var57 = var62.method631();
                                }
                                if (~(class246.field3467 % 20) > -11) {
                                    var62.method616(class282.field3840[0] + -12 + arg2, -var62.method631() + var34);
                                }
                            }
                        }
                        if (var57 > 0) {
                            var10000 = var34 - (var57 + 2);
                        }
                    } else if (~var7 <= -1) {
                        int var63 = 0;
                        class418[] var64 = class273.field3733;
                        for (int var65 = 0; ~var65 > ~var64.length; ++var65) {
                            class418 var67 = var64[var65];
                            if (var67 != null && ~var67.field5792 == -11 && class18.field243[var7] == var67.field5786) {
                                class77 var68 = class191.field2751[var67.field5789];
                                if (~var68.method631() < ~var63) {
                                    var63 = var68.method631();
                                }
                                var68.method616(class282.field3840[0] + arg2 - 12, var34 - var68.method631());
                            }
                        }
                        if (~var63 < -1) {
                            var10000 = var34 - (var63 - -2);
                        }
                    }
                    for (int var69 = 0; var69 < 4; ++var69) {
                        if (var32.field2611[var69] > class246.field3467) {
                            int var70 = var32.method1281(0) / 2;
                            class269.method1707(arg5 >> 1, arg6, var70, arg3 >> 1, var32, true, arg1);
                            if (class282.field3840[0] > -1) {
                                if (~var69 == -2) {
                                    class282.field3840[1] -= 20;
                                }
                                if (~var69 == -3) {
                                    class282.field3840[1] -= 10;
                                    class282.field3840[0] -= 15;
                                }
                                if (~var69 == -4) {
                                    class282.field3840[1] -= 10;
                                    class282.field3840[0] += 15;
                                }
                                class221.field3104[var32.field2641[var69]].method616(arg2 - -class282.field3840[0] - 12, arg4 - -class282.field3840[1] - 12);
                                class52.field669.method484(0, Integer.toString(var32.field2580[var69]), -1, arg2 - (-class282.field3840[0] - -1), class282.field3840[1] + 3 + arg4, -121);
                            }
                        }
                    }
                }
            }
        }
        int var8 = 96 / ((-30 - arg0) / 36);
        for (int var9 = 0; class389.field5416 > var9; ++var9) {
            int var27 = class26.field326[var9];
            class185 var28;
            if (~var27 <= -2049) {
                var28 = class428.field5951[var27 + -2048];
            } else {
                var28 = class87.field1227[var27];
            }
            int var29 = class341.field4614[var9];
            class185 var30;
            if (~var29 <= -2049) {
                var30 = class428.field5951[var29 + -2048];
            } else {
                var30 = class87.field1227[var29];
            }
            class229.method1500(arg2, var30, --var28.field2591, arg3, var28, 15294, arg6, arg1, arg5, arg4);
        }
        int var10 = class280.field3810.field5419 + class280.field3810.field5406 + 2;
        for (int var11 = 0; ~var11 > ~class177.field2531; ++var11) {
            int var12 = class216.field3028[var11];
            int var13 = class216.field3019[var11];
            int var14 = class216.field3022[var11];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var26 = 0; var26 < var11; ++var26) {
                    if (~(class216.field3019[var26] + -var10) > ~(var13 + 2) && class216.field3019[var26] - -2 > -var10 + var13 && ~(class216.field3028[var26] + class216.field3022[var26]) < ~(-var14 + var12) && var12 + var14 > class216.field3028[var26] - class216.field3022[var26] && class216.field3019[var26] + -var10 < var13) {
                        var15 = true;
                        var13 = class216.field3019[var26] - var10;
                    }
                }
            }
            class216.field3019[var11] = var13;
            String var16 = class216.field3024[var11];
            if (~class444.field6231 == -1) {
                int var17 = 16776960;
                if (class216.field3027[var11] < 6) {
                    var17 = class342.field4620[class216.field3027[var11]];
                }
                if (class216.field3027[var11] == 6) {
                    var17 = ~(class368.field5106 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (class216.field3027[var11] == 7) {
                    var17 = class368.field5106 % 20 < 10 ? 255 : 65535;
                }
                if (~class216.field3027[var11] == -9) {
                    var17 = class368.field5106 % 20 >= 10 ? 8454016 : 45056;
                }
                if (~class216.field3027[var11] == -10) {
                    int var18 = -class216.field3023[var11] + 150;
                    if (~var18 <= -51) {
                        if (~var18 > -101) {
                            var17 = 33160960 - var18 * 327680;
                        } else if (var18 < 150) {
                            var17 = (var18 + -100) * 5 + 65280;
                        }
                    } else {
                        var17 = var18 * 1280 + 16711680;
                    }
                }
                if (~class216.field3027[var11] == -11) {
                    int var19 = -class216.field3023[var11] + 150;
                    if (var19 >= 50) {
                        if (~var19 <= -101) {
                            if (~var19 > -151) {
                                var17 = var19 * 327680 + -((var19 - 100) * 5) + -32767745;
                            }
                        } else {
                            var17 = -((var19 - 50) * 327680) + 16711935;
                        }
                    } else {
                        var17 = 16711680 - -(var19 * 5);
                    }
                }
                if (class216.field3027[var11] == 11) {
                    int var20 = -class216.field3023[var11] + 150;
                    if (var20 >= 50) {
                        if (var20 < 100) {
                            var17 = 65280 - -(var20 * 327685) - 16384250;
                        } else if (var20 < 150) {
                            var17 = -((var20 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var17 = -(var20 * 327685) + 16777215;
                    }
                }
                int var21 = -16777216 | var17;
                if (~class216.field3026[var11] == -1) {
                    class269.field3685.method484(-16777216, var16, var21, arg2 + var12, arg4 + var13, 99);
                }
                if (class216.field3026[var11] == 1) {
                    class269.field3685.method493(arg4 - -var13, var16, 0, -16777216, var21, class368.field5106, arg2 - -var12);
                }
                if (~class216.field3026[var11] == -3) {
                    class269.field3685.method487(arg2 + var12, (byte) 67, class368.field5106, var21, arg4 + var13, var16, -16777216);
                }
                if (~class216.field3026[var11] == -4) {
                    class269.field3685.method497(var21, arg4 - -var13, (byte) 120, -16777216, var16, class368.field5106, arg2 + var12, -class216.field3023[var11] + 150);
                }
                if (~class216.field3026[var11] == -5) {
                    int var22 = (-class216.field3023[var11] + 150) * (class280.field3810.method2419(var16, (byte) -115) + 100) / 150;
                    class354.field4765.method206(arg2 - (-var12 + 50), arg4, arg2 + var12 + 50, arg3 + arg4);
                    class269.field3685.method486(arg2 + var12 + 50 - var22, var21, (byte) 44, arg4 + var13, -16777216, var16);
                    class354.field4765.method227(arg2, arg4, arg2 + arg5, arg3 + arg4);
                }
                if (~class216.field3026[var11] == -6) {
                    int var23 = -class216.field3023[var11] + 150;
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (~var23 < -126) {
                        var24 = var23 + -125;
                    }
                    int var25 = class280.field3810.field5419 + class280.field3810.field5406;
                    class354.field4765.method206(arg2, -var25 + -1 + arg4 - -var13, arg2 + arg5, arg4 + var13 + 5);
                    class269.field3685.method484(-16777216, var16, var21, arg2 + var12, arg4 + var13 - -var24, 87);
                    class354.field4765.method227(arg2, arg4, arg2 + arg5, arg3 + arg4);
                }
            } else {
                class269.field3685.method484(-16777216, var16, -256, arg2 + var12, arg4 + var13, -81);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class395() {
        super(1, false);
    }

    static {
        new class368("Ok", "Okay", "OK", "Ok");
    }
}
