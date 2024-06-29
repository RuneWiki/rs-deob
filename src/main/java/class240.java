import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class240 extends class40 {

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "[I")
    private int[] field3544 = new int[257];

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "Lpm;")
    public static class349 field3533 = new class349("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Z")
    public static volatile boolean field3543 = true;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field3547 = 100;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "[[I")
    private int[][] field3542;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lhl;I)V", line = 3)
    public static final void method1632(class311 arg0, int arg1) {
        arg0.field4550 = false;
        ++field3537;
        if (~arg0.field4537 != 0) {
            class183 var2 = class110.method671(-21965, arg0.field4537);
            if (var2 != null && var2.field2609 != null) {
                label302: {
                    ++arg0.field4506;
                    if (var2.field2609.length > arg0.field4520 && arg0.field4506 > var2.field2600[arg0.field4520]) {
                        ++arg0.field4520;
                        arg0.field4506 = 1;
                        ++arg0.field4519;
                        class47.method311(arg0.field4463, arg0.field4466, arg0.field4520, true, class181.field2555 == arg0, var2);
                    }
                    if (~arg0.field4520 <= ~var2.field2609.length) {
                        arg0.field4520 = 0;
                        arg0.field4506 = 0;
                        if (arg0.field4513) {
                            arg0.field4537 = arg0.method2093(-1498200479).method12(-4);
                            if (arg0.field4537 == -1) {
                                arg0.field4513 = false;
                                break label302;
                            }
                            var2 = class110.method671(-21965, arg0.field4537);
                        }
                        class47.method311(arg0.field4463, arg0.field4466, arg0.field4520, true, class181.field2555 == arg0, var2);
                    }
                    arg0.field4519 = arg0.field4520 + 1;
                    if (~var2.field2609.length >= ~arg0.field4519) {
                        arg0.field4519 = 0;
                    }
                }
            } else {
                arg0.field4537 = -1;
                arg0.field4513 = false;
            }
        }
        if (arg0.field4578 != -1 && ~class34.field434 <= ~arg0.field4518) {
            class135 var3 = class209.method1486(arg0.field4578, 11);
            int var4 = var3.field2078;
            if (~var4 != 0) {
                label304: {
                    class183 var5 = class110.method671(-21965, var4);
                    if (var3.field2068) {
                        if (var5.field2610 != 3) {
                            if (~var5.field2610 == -2 && ~arg0.field4589 < -1 && class34.field434 >= arg0.field4562 && arg0.field4521 < class34.field434) {
                                arg0.field4518 = class34.field434 - -1;
                                break label304;
                            }
                        } else if (~arg0.field4589 < -1 && class34.field434 >= arg0.field4562 && ~arg0.field4521 > ~class34.field434) {
                            arg0.field4578 = -1;
                            break label304;
                        }
                    }
                    if (var5 != null && var5.field2609 != null) {
                        if (arg0.field4577 < 0) {
                            arg0.field4577 = 0;
                            class47.method311(arg0.field4463, arg0.field4466, 0, true, class181.field2555 == arg0, var5);
                        }
                        ++arg0.field4552;
                        if (arg0.field4577 < var5.field2609.length && ~var5.field2600[arg0.field4577] > ~arg0.field4552) {
                            arg0.field4552 = 1;
                            ++arg0.field4577;
                            class47.method311(arg0.field4463, arg0.field4466, arg0.field4577, true, class181.field2555 == arg0, var5);
                        }
                        if (var5.field2609.length <= arg0.field4577) {
                            if (!var3.field2068) {
                                arg0.field4578 = -1;
                            } else {
                                ++arg0.field4546;
                                arg0.field4577 -= var5.field2587;
                                if (arg0.field4546 >= var5.field2605) {
                                    arg0.field4578 = -1;
                                } else if (arg0.field4577 >= 0 && arg0.field4577 < var5.field2609.length) {
                                    class47.method311(arg0.field4463, arg0.field4466, arg0.field4577, true, class181.field2555 == arg0, var5);
                                } else {
                                    arg0.field4578 = -1;
                                }
                            }
                        }
                        arg0.field4586 = arg0.field4577 - -1;
                        if (var5.field2609.length <= arg0.field4586) {
                            if (var3.field2068) {
                                arg0.field4586 -= var5.field2587;
                                if (~var5.field2605 < ~(arg0.field4546 + 1)) {
                                    if (arg0.field4586 < 0 || arg0.field4586 >= var5.field2609.length) {
                                        arg0.field4586 = -1;
                                    }
                                } else {
                                    arg0.field4586 = -1;
                                }
                            } else {
                                arg0.field4586 = -1;
                            }
                        }
                    } else {
                        arg0.field4578 = -1;
                    }
                }
            } else {
                arg0.field4578 = -1;
            }
        }
        if (~arg0.field4558 != arg1 && arg0.field4535 <= 1) {
            class183 var6 = class110.method671(-21965, arg0.field4558);
            if (var6.field2610 == 3) {
                if (arg0.field4589 > 0 && arg0.field4562 <= class34.field434 && ~class34.field434 < ~arg0.field4521) {
                    arg0.field4558 = -1;
                }
            } else if (var6.field2610 == 1 && ~arg0.field4589 < -1 && ~arg0.field4562 >= ~class34.field434 && ~class34.field434 < ~arg0.field4521) {
                arg0.field4535 = 2;
            }
        }
        if (arg0.field4558 != -1 && arg0.field4535 == 0) {
            class183 var7 = class110.method671(-21965, arg0.field4558);
            if (var7 != null && var7.field2609 != null) {
                ++arg0.field4547;
                if (arg0.field4566 < var7.field2609.length && arg0.field4547 > var7.field2600[arg0.field4566]) {
                    arg0.field4547 = 1;
                    ++arg0.field4566;
                    class47.method311(arg0.field4463, arg0.field4466, arg0.field4566, true, class181.field2555 == arg0, var7);
                }
                if (~arg0.field4566 <= ~var7.field2609.length) {
                    ++arg0.field4564;
                    arg0.field4566 -= var7.field2587;
                    if (~var7.field2605 < ~arg0.field4564) {
                        if (arg0.field4566 >= 0 && var7.field2609.length > arg0.field4566) {
                            class47.method311(arg0.field4463, arg0.field4466, arg0.field4566, true, class181.field2555 == arg0, var7);
                        } else {
                            arg0.field4558 = -1;
                        }
                    } else {
                        arg0.field4558 = -1;
                    }
                }
                arg0.field4575 = arg0.field4566 - -1;
                if (~var7.field2609.length >= ~arg0.field4575) {
                    arg0.field4575 -= var7.field2587;
                    if (arg0.field4564 + 1 < var7.field2605) {
                        if (arg0.field4575 < 0 || ~arg0.field4575 <= ~var7.field2609.length) {
                            arg0.field4575 = -1;
                        }
                    } else {
                        arg0.field4575 = -1;
                    }
                }
                arg0.field4550 = var7.field2602;
            } else {
                arg0.field4558 = -1;
            }
        }
        if (arg0.field4535 > 0) {
            --arg0.field4535;
        }
        for (int var8 = 0; var8 < arg0.field4541.length; ++var8) {
            class142 var9 = arg0.field4541[var8];
            if (var9 != null) {
                if (~var9.field2150 < -1) {
                    --var9.field2150;
                } else {
                    class183 var10 = class110.method671(-21965, var9.field2147);
                    if (var10 != null && var10.field2609 != null) {
                        ++var9.field2148;
                        if (var10.field2609.length > var9.field2155 && ~var10.field2600[var9.field2155] > ~var9.field2148) {
                            var9.field2148 = 1;
                            ++var9.field2155;
                            class47.method311(arg0.field4463, arg0.field4466, var9.field2155, true, class181.field2555 == arg0, var10);
                        }
                        if (~var10.field2609.length >= ~var9.field2155) {
                            var9.field2155 -= var10.field2587;
                            ++var9.field2152;
                            if (~var9.field2152 <= ~var10.field2605) {
                                arg0.field4541[var8] = null;
                            } else if (var9.field2155 >= 0 && ~var9.field2155 > ~var10.field2609.length) {
                                class47.method311(arg0.field4463, arg0.field4466, var9.field2155, true, class181.field2555 == arg0, var10);
                            } else {
                                arg0.field4541[var8] = null;
                            }
                        }
                        var9.field2149 = var9.field2155 + 1;
                        if (~var9.field2149 <= ~var10.field2609.length) {
                            var9.field2149 -= var10.field2587;
                            if (var9.field2152 - -1 >= var10.field2605) {
                                var9.field2149 = -1;
                            } else if (~var9.field2149 > -1 || ~var10.field2609.length >= ~var9.field2149) {
                                var9.field2149 = -1;
                            }
                        }
                    } else {
                        arg0.field4541[var8] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 322)
    public class240() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IB)V", line = 327)
    private final void method1633(int arg0, byte arg1) {
        if (arg1 != -11) {
            this.field3544 = null;
        }
        ++field3532;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field3542 = new int[4][4];
                                    this.field3542[0][3] = 0;
                                    this.field3542[0][0] = 2048;
                                    this.field3542[0][1] = 0;
                                    this.field3542[0][2] = 4096;
                                    this.field3542[1][1] = 4096;
                                    this.field3542[1][0] = 2867;
                                    this.field3542[1][3] = 0;
                                    this.field3542[1][2] = 4096;
                                    this.field3542[2][0] = 3276;
                                    this.field3542[2][1] = 4096;
                                    this.field3542[2][3] = 0;
                                    this.field3542[2][2] = 4096;
                                    this.field3542[3][0] = 4096;
                                    this.field3542[3][3] = 0;
                                    this.field3542[3][2] = 0;
                                    this.field3542[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field3542 = new int[16][4];
                                this.field3542[0][3] = 321;
                                this.field3542[0][2] = 192;
                                this.field3542[0][1] = 80;
                                this.field3542[0][0] = 0;
                                this.field3542[1][1] = 321;
                                this.field3542[1][3] = 562;
                                this.field3542[1][2] = 449;
                                this.field3542[1][0] = 155;
                                this.field3542[2][3] = 803;
                                this.field3542[2][1] = 578;
                                this.field3542[2][2] = 690;
                                this.field3542[2][0] = 389;
                                this.field3542[3][3] = 1140;
                                this.field3542[3][2] = 995;
                                this.field3542[3][0] = 671;
                                this.field3542[3][1] = 947;
                                this.field3542[4][1] = 1285;
                                this.field3542[4][0] = 897;
                                this.field3542[4][2] = 1397;
                                this.field3542[4][3] = 1509;
                                this.field3542[5][0] = 1175;
                                this.field3542[5][2] = 1429;
                                this.field3542[5][1] = 1525;
                                this.field3542[5][3] = 1413;
                                this.field3542[6][0] = 1368;
                                this.field3542[6][2] = 1461;
                                this.field3542[6][1] = 1734;
                                this.field3542[6][3] = 1333;
                                this.field3542[7][1] = 1413;
                                this.field3542[7][2] = 1525;
                                this.field3542[7][0] = 1507;
                                this.field3542[7][3] = 1702;
                                this.field3542[8][2] = 1590;
                                this.field3542[8][1] = 1108;
                                this.field3542[8][3] = 2056;
                                this.field3542[8][0] = 1736;
                                this.field3542[9][3] = 2666;
                                this.field3542[9][0] = 2088;
                                this.field3542[9][1] = 1766;
                                this.field3542[9][2] = 2056;
                                this.field3542[10][1] = 2409;
                                this.field3542[10][3] = 3276;
                                this.field3542[10][2] = 2586;
                                this.field3542[10][0] = 2355;
                                this.field3542[11][1] = 3116;
                                this.field3542[11][2] = 3148;
                                this.field3542[11][3] = 3228;
                                this.field3542[11][0] = 2691;
                                this.field3542[12][2] = 3710;
                                this.field3542[12][0] = 3031;
                                this.field3542[12][1] = 3806;
                                this.field3542[12][3] = 3196;
                                this.field3542[13][2] = 3421;
                                this.field3542[13][3] = 3019;
                                this.field3542[13][0] = 3522;
                                this.field3542[13][1] = 3437;
                                this.field3542[14][3] = 3228;
                                this.field3542[14][1] = 3116;
                                this.field3542[14][0] = 3727;
                                this.field3542[14][2] = 3148;
                                this.field3542[15][0] = 4096;
                                this.field3542[15][3] = 2746;
                                this.field3542[15][1] = 2377;
                                this.field3542[15][2] = 2505;
                            }
                        } else {
                            this.field3542 = new int[6][4];
                            this.field3542[0][3] = 0;
                            this.field3542[0][0] = 0;
                            this.field3542[0][2] = 0;
                            this.field3542[0][1] = 0;
                            this.field3542[1][1] = 0;
                            this.field3542[1][2] = 0;
                            this.field3542[1][3] = 1493;
                            this.field3542[1][0] = 1843;
                            this.field3542[2][1] = 0;
                            this.field3542[2][3] = 2939;
                            this.field3542[2][2] = 0;
                            this.field3542[2][0] = 2457;
                            this.field3542[3][2] = 1124;
                            this.field3542[3][3] = 3565;
                            this.field3542[3][1] = 0;
                            this.field3542[3][0] = 2781;
                            this.field3542[4][0] = 3481;
                            this.field3542[4][2] = 3084;
                            this.field3542[4][3] = 4031;
                            this.field3542[4][1] = 546;
                            this.field3542[5][2] = 4096;
                            this.field3542[5][1] = 4096;
                            this.field3542[5][3] = 4096;
                            this.field3542[5][0] = 4096;
                        }
                    } else {
                        this.field3542 = new int[7][4];
                        this.field3542[0][1] = 0;
                        this.field3542[0][2] = 0;
                        this.field3542[0][0] = 0;
                        this.field3542[0][3] = 4096;
                        this.field3542[1][3] = 4096;
                        this.field3542[1][1] = 0;
                        this.field3542[1][2] = 4096;
                        this.field3542[1][0] = 663;
                        this.field3542[2][0] = 1363;
                        this.field3542[2][2] = 4096;
                        this.field3542[2][3] = 0;
                        this.field3542[2][1] = 0;
                        this.field3542[3][2] = 4096;
                        this.field3542[3][0] = 2048;
                        this.field3542[3][1] = 4096;
                        this.field3542[3][3] = 0;
                        this.field3542[4][2] = 0;
                        this.field3542[4][0] = 2727;
                        this.field3542[4][1] = 4096;
                        this.field3542[4][3] = 0;
                        this.field3542[5][1] = 4096;
                        this.field3542[5][3] = 4096;
                        this.field3542[5][2] = 0;
                        this.field3542[5][0] = 3411;
                        this.field3542[6][1] = 0;
                        this.field3542[6][3] = 4096;
                        this.field3542[6][0] = 4096;
                        this.field3542[6][2] = 0;
                    }
                } else {
                    this.field3542 = new int[8][4];
                    this.field3542[0][2] = 2602;
                    this.field3542[0][0] = 0;
                    this.field3542[0][3] = 2361;
                    this.field3542[0][1] = 2650;
                    this.field3542[1][1] = 2313;
                    this.field3542[1][2] = 1799;
                    this.field3542[1][3] = 1558;
                    this.field3542[1][0] = 2867;
                    this.field3542[2][2] = 1734;
                    this.field3542[2][3] = 1413;
                    this.field3542[2][0] = 3072;
                    this.field3542[2][1] = 2618;
                    this.field3542[3][1] = 2296;
                    this.field3542[3][0] = 3276;
                    this.field3542[3][2] = 1220;
                    this.field3542[3][3] = 947;
                    this.field3542[4][1] = 2072;
                    this.field3542[4][2] = 963;
                    this.field3542[4][3] = 722;
                    this.field3542[4][0] = 3481;
                    this.field3542[5][0] = 3686;
                    this.field3542[5][3] = 1766;
                    this.field3542[5][1] = 2730;
                    this.field3542[5][2] = 2152;
                    this.field3542[6][2] = 1060;
                    this.field3542[6][3] = 915;
                    this.field3542[6][1] = 2232;
                    this.field3542[6][0] = 3891;
                    this.field3542[7][3] = 1140;
                    this.field3542[7][0] = 4096;
                    this.field3542[7][2] = 1413;
                    this.field3542[7][1] = 1686;
                }
            } else {
                this.field3542 = new int[2][4];
                this.field3542[0][1] = 0;
                this.field3542[0][3] = 0;
                this.field3542[0][2] = 0;
                this.field3542[0][0] = 0;
                this.field3542[1][3] = 4096;
                this.field3542[1][1] = 4096;
                this.field3542[1][2] = 4096;
                this.field3542[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(B)V", line = 578)
    private final void method1634(byte arg0) {
        ++field3535;
        if (arg0 == -33) {
            int var2 = this.field3542.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && var5 >= this.field3542[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var2 < ~var4) {
                        int[] var7 = this.field3542[var4];
                        if (var4 > 0) {
                            int[] var8 = this.field3542[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                            int var10 = 4096 - var9;
                            var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                            var12 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                            var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                        } else {
                            var13 = var7[2];
                            var11 = var7[1];
                            var12 = var7[3];
                        }
                    } else {
                        int[] var14 = this.field3542[var2 + -1];
                        var12 = var14[3];
                        var13 = var14[2];
                        var11 = var14[1];
                    }
                    int var15 = var12 >> 4;
                    int var16 = var11 >> 4;
                    int var17 = var13 >> 4;
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~var16 <= -1) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field3544[var3] = class332.method2176(var15, class332.method2176(var16 << 16, var17 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V", line = 680)
    public static final void method1635(int arg0, int arg1, int arg2, int arg3) {
        ++field3534;
        class276 var4 = class264.method1816((byte) -128, arg2, 9);
        if (arg0 >= -120) {
            field3547 = -52;
        }
        var4.method1876((byte) -117);
        var4.field3984 = arg3;
        var4.field3986 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([II[III)V", line = 696)
    public static final void method1636(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg1 == 15232) {
            if (~arg4 < ~arg3) {
                int var5 = (arg3 - -arg4) / 2;
                int var6 = arg3;
                int var7 = arg0[var5];
                arg0[var5] = arg0[arg4];
                arg0[arg4] = var7;
                int var8 = arg2[var5];
                arg2[var5] = arg2[arg4];
                arg2[arg4] = var8;
                for (int var9 = arg3; ~var9 > ~arg4; ++var9) {
                    if (~(var7 - -(1 & var9)) < ~arg0[var9]) {
                        int var10 = arg0[var9];
                        arg0[var9] = arg0[var6];
                        arg0[var6] = var10;
                        int var11 = arg2[var9];
                        arg2[var9] = arg2[var6];
                        arg2[var6++] = var11;
                    }
                }
                arg0[arg4] = arg0[var6];
                arg0[var6] = var7;
                arg2[arg4] = arg2[var6];
                arg2[var6] = var8;
                method1636(arg0, 15232, arg2, arg3, var6 + -1);
                method1636(arg0, 15232, arg2, var6 + 1, arg4);
            }
            ++field3546;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 752)
    public static final void method1637(int arg0) {
        class1.field2.method98(0);
        int var1 = 71 % ((arg0 - 49) / 50);
        ++field3539;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 762)
    public static void method1638(int arg0) {
        if (arg0 >= 100) {
            field3533 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V", line = 772)
    public static final void method1639(int arg0) {
        class245.method1701(class327.field4749, (byte) -94);
        ++field3548;
        ++class13.field186;
        if (class51.field666 && class346.field5032) {
            int var1 = class270.field3949.method536(0);
            int var2 = class270.field3949.method543(7);
            int var3 = var2 - class447.field6384;
            int var4 = var1 - class129.field1817;
            if (class13.field186 > class327.field4749.field3335) {
                int var5 = var4 - class74.field955;
                int var6 = -class442.field6323 + var3;
                if (~class327.field4749.field3330 > ~var5 || ~var5 > ~(-class327.field4749.field3330) || class327.field4749.field3330 < var6 || ~(-class327.field4749.field3330) < ~var6) {
                    class94.field1197 = true;
                }
            }
            if (~var4 > ~class260.field3843) {
                var4 = class260.field3843;
            }
            if (~var3 > ~class79.field1019) {
                var3 = class79.field1019;
            }
            if (~(class260.field3843 - -class363.field5212.field3250) > ~(var4 - -class327.field4749.field3250)) {
                var4 = class260.field3843 - (-class363.field5212.field3250 + class327.field4749.field3250);
            }
            if (~(class79.field1019 + class363.field5212.field3282) > ~(var3 - -class327.field4749.field3282)) {
                var3 = -class327.field4749.field3282 + class79.field1019 + class363.field5212.field3282;
            }
            int var7 = class363.field5212.field3341 + var4 + -class260.field3843;
            int var8 = -class79.field1019 + var3 + class363.field5212.field3240;
            if (class327.field4749.field3296 != null && class94.field1197) {
                class79 var9 = new class79();
                var9.field1011 = var7;
                var9.field1024 = var8;
                var9.field1018 = class327.field4749;
                var9.field1028 = class327.field4749.field3296;
                class424.method2655(var9);
            }
            int var10 = -104 % ((arg0 - -1) / 57);
            if (!class270.field3949.method540(4)) {
                if (!class94.field1197) {
                    if ((~class335.field4856 == -2 || class311.method2096(2)) && class381.field5412 > 2) {
                        class397.method2491(class74.field955 + class129.field1817, class447.field6384 + class442.field6323, (byte) 124, 2);
                    } else if (class415.method2614(0)) {
                        class397.method2491(class74.field955 + class129.field1817, class447.field6384 + class442.field6323, (byte) -63, 0);
                    }
                } else {
                    if (class327.field4749.field3287 != null) {
                        class79 var11 = new class79();
                        var11.field1022 = class247.field3690;
                        var11.field1018 = class327.field4749;
                        var11.field1011 = var7;
                        var11.field1028 = class327.field4749.field3287;
                        var11.field1024 = var8;
                        class424.method2655(var11);
                    }
                    if (class247.field3690 != null && client.method1176(class327.field4749) != null) {
                        class289.method1970(class247.field3690, class327.field4749, (byte) 31);
                    }
                }
                class327.field4749 = null;
            }
        } else {
            if (class13.field186 > 1) {
                class327.field4749 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(B)V", line = 885)
    public final void method39(byte arg0) {
        ++field3531;
        if (arg0 == -23) {
            if (this.field3542 == null) {
                this.method1633(1, (byte) -11);
            }
            this.method1634((byte) -33);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/awt/Component;)Lio;", line = 908)
    public static final class252 method1640(boolean arg0, Component arg1) {
        ++field3541;
        if (arg0) {
            field3533 = null;
        }
        return new class352(arg1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZII)V", line = 928)
    public static final void method1641(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class199.field2842 = 0L;
        ++field3538;
        int var5 = class436.method2717(false);
        if (~arg1 == arg4 || ~var5 == -4) {
            arg2 = true;
        }
        if (!class59.field786.method976()) {
            arg2 = true;
        }
        class147.method1086(arg0, arg1, arg4 ^ -772, arg3, arg2, var5);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I", line = 947)
    public final int[][] method112(int arg0, int arg1) {
        ++field3540;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[] var4 = this.method266((byte) -116, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class410.field5886 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3544[var9];
                var5[var8] = class209.method1483(16711680, var10) >> 12;
                var6[var8] = class209.method1483(var10, 65280) >> 4;
                var7[var8] = class209.method1483(var10, 255) << 4;
            }
        }
        if (arg0 != 1) {
            field3543 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V", line = 1007)
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class166.field2376 = 0;
        if (arg1 == 1) {
            ++field3545;
            for (int var7 = -1; var7 < class334.field4847 + class229.field3396; ++var7) {
                class346 var30 = null;
                class311 var31;
                if (var7 < 0) {
                    var31 = class181.field2555;
                } else if (class334.field4847 > var7) {
                    var31 = class243.field3596[class26.field323[var7]];
                } else {
                    var31 = class442.field6317[class431.field6169[var7 - class334.field4847]];
                    var30 = ((class446) var31).field6375;
                    if (var30.field5023 != null) {
                        var30 = var30.method2273(arg1 ^ -2);
                        if (var30 == null) {
                            continue;
                        }
                    }
                }
                if (var31.field4530 >= 0) {
                    class399.method2502(var31.method2090((byte) -71), arg0 >> 1, arg4 >> 1, (byte) -84, var31, arg3, arg5);
                    if (class212.field3004[0] >= 0) {
                        if (var31.field4507 != null && (var7 >= class334.field4847 || ~class352.field5093 == -1 || ~class352.field5093 == -4 || class352.field5093 == 1 && class406.method2548(((class128) var31).field1790, (byte) -84)) && ~class190.field2750 < ~class166.field2376) {
                            class190.field2738[class166.field2376] = class70.field934.method1309((byte) 125, var31.field4507) / 2;
                            class190.field2735[class166.field2376] = class212.field3004[0];
                            class190.field2740[class166.field2376] = class212.field3004[1];
                            class190.field2718[class166.field2376] = var31.field4533;
                            class190.field2761[class166.field2376] = var31.field4560;
                            class190.field2721[class166.field2376] = var31.field4531;
                            class190.field2745[class166.field2376] = var31.field4507;
                            ++class166.field2376;
                        }
                        class256 var32 = class451.field6467[0];
                        int var33 = class212.field3004[1] + arg2 + -Math.max(class70.field934.field2574, var32.method80());
                        if (!var31.field4529 && class34.field434 < var31.field4579) {
                            class256 var34 = class451.field6467[1];
                            if (var31 instanceof class446) {
                                class446 var35 = (class446) var31;
                                class256[] var36 = (class256[]) class105.field1347.method99(true, (long) var35.field6375.field5013);
                                if (var36 == null) {
                                    class337[] var37 = class337.method2215(class15.field216, var35.field6375.field5013, 0);
                                    if (var37 != null) {
                                        var36 = new class256[var37.length];
                                        for (int var38 = 0; ~var37.length < ~var38; ++var38) {
                                            var36[var38] = class59.field786.method870(var37[var38], true);
                                        }
                                        class105.field1347.method90(var36, (long) var35.field6375.field5013, 0);
                                    }
                                }
                                if (var36 != null && var36.length == 2) {
                                    var32 = var36[0];
                                    var34 = var36[1];
                                }
                            }
                            int var39 = class212.field3004[0] + arg6 - (var32.method87() >> 1);
                            var32.method1772(var39, var33);
                            int var40 = var32.method87() * var31.field4565 / 255;
                            class59.field786.method1004(var39, var33, var39 + var40, var33 + var32.method80());
                            var34.method1772(var39, var33);
                            class59.field786.method937(arg6, arg2, arg4 + arg6, arg0 + arg2);
                        }
                        var33 -= 2;
                        if (!var31.field4529) {
                            if (class34.field434 < var31.field4576) {
                                class256 var41 = class358.field5177[var31.field4511 ? 2 : 0];
                                class256 var42 = class358.field5177[var31.field4511 ? 3 : 1];
                                boolean var43 = true;
                                int var44;
                                if (!(var31 instanceof class446)) {
                                    var44 = var31.method2093(-1498200479).field42;
                                } else {
                                    var44 = var30.field4987;
                                    if (~var44 == 0) {
                                        var44 = var31.method2093(-1498200479).field42;
                                    }
                                }
                                if (var44 != -1) {
                                    class256[] var45 = (class256[]) class353.field5120.method99(true, (long) var44);
                                    if (var45 == null) {
                                        class337[] var46 = class337.method2215(class15.field216, var44, 0);
                                        if (var46 != null) {
                                            var45 = new class256[var46.length];
                                            for (int var47 = 0; var47 < var46.length; ++var47) {
                                                var45[var47] = class59.field786.method870(var46[var47], true);
                                            }
                                            class353.field5120.method90(var45, (long) var44, arg1 + -1);
                                        }
                                    }
                                    if (var45 != null && ~var45.length == -5) {
                                        var42 = var45[!var31.field4511 ? 1 : 3];
                                        var41 = var45[!var31.field4511 ? 0 : 2];
                                    }
                                }
                                int var48 = -class34.field434 + var31.field4576;
                                int var49;
                                if (~var48 >= ~var31.field4571) {
                                    var49 = var41.method87();
                                } else {
                                    int var50 = var48 - var31.field4571;
                                    int var51 = var31.field4583 != 0 ? (-var50 + var31.field4539) / var31.field4583 * var31.field4583 : 0;
                                    var49 = var41.method87() * var51 / var31.field4539;
                                }
                                int var52 = var41.method80();
                                var33 -= var52;
                                int var53 = class212.field3004[0] + arg6 - (var41.method87() >> 1);
                                var41.method1772(var53, var33);
                                class59.field786.method1004(var53, var33, var49 + var53, var33 + var52);
                                var42.method1772(var53, var33);
                                class59.field786.method937(arg6, arg2, arg4 + arg6, arg0 + arg2);
                                var33 -= 2;
                            }
                            if (~var7 <= ~class334.field4847) {
                                if (~var30.field4992 <= -1 && var30.field4992 < class252.field3740.length) {
                                    var33 -= 25;
                                    class256 var54 = class252.field3740[var30.field4992];
                                    var54.method1772(class212.field3004[0] + arg6 + -(var54.method87() >> 1), var33);
                                    var33 -= 2;
                                }
                            } else {
                                class128 var55 = (class128) var31;
                                if (~var55.field1815 != 0) {
                                    var33 -= 25;
                                    class374.field5322[var55.field1815].method1772(arg6 - 12 + class212.field3004[0], var33);
                                    var33 -= 2;
                                }
                                if (~var55.field1787 != 0) {
                                    var33 -= 25;
                                    class252.field3740[var55.field1787].method1772(class212.field3004[0] + arg6 - 12, var33);
                                    var33 -= 2;
                                }
                            }
                        }
                        int var10000;
                        if (!(var31 instanceof class128)) {
                            int var56 = 0;
                            class136[] var57 = class209.field2990;
                            for (int var58 = 0; ~var57.length < ~var58; ++var58) {
                                class136 var60 = var57[var58];
                                if (var60 != null && ~var60.field2097 == -2 && ~class431.field6169[-class334.field4847 + var7] == ~var60.field2101) {
                                    class256 var61 = class70.field928[var60.field2100];
                                    if (~var61.method80() < ~var56) {
                                        var56 = var61.method80();
                                    }
                                    if (~(class34.field434 % 20) > -11) {
                                        var61.method1772(class212.field3004[0] + arg6 + -12, -var61.method80() + var33);
                                    }
                                }
                            }
                            if (var56 > 0) {
                                var10000 = var33 - (var56 + 2);
                            }
                        } else if (var7 >= 0) {
                            int var62 = 0;
                            class136[] var63 = class209.field2990;
                            for (int var64 = 0; ~var64 > ~var63.length; ++var64) {
                                class136 var66 = var63[var64];
                                if (var66 != null && ~var66.field2097 == -11 && ~class26.field323[var7] == ~var66.field2101) {
                                    class256 var67 = class70.field928[var66.field2100];
                                    if (var62 < var67.method80()) {
                                        var62 = var67.method80();
                                    }
                                    var67.method1772(arg6 - -class212.field3004[0] + -12, var33 - var67.method80());
                                }
                            }
                            if (var62 > 0) {
                                var10000 = var33 - (var62 + 2);
                            }
                        }
                        for (int var68 = 0; var68 < 4; ++var68) {
                            if (~class34.field434 > ~var31.field4509[var68]) {
                                int var69 = var31.method2090((byte) -71) / 2;
                                class399.method2502(var69, arg0 >> 1, arg4 >> 1, (byte) 107, var31, arg3, arg5);
                                if (class212.field3004[0] > -1) {
                                    if (~var68 == -2) {
                                        class212.field3004[1] -= 20;
                                    }
                                    if (~var68 == -3) {
                                        class212.field3004[1] -= 10;
                                        class212.field3004[0] -= 15;
                                    }
                                    if (var68 == 3) {
                                        class212.field3004[0] += 15;
                                        class212.field3004[1] -= 10;
                                    }
                                    class431.field6174[var31.field4555[var68]].method1772(class212.field3004[0] + arg6 + -12, arg2 - -class212.field3004[1] - 12);
                                    class32.field409.method2194(-21811, -1, arg2 - -class212.field3004[1] + 3, Integer.toString(var31.field4508[var68]), 0, arg6 + -1 + class212.field3004[0]);
                                }
                            }
                        }
                    }
                }
            }
            for (int var8 = 0; ~class452.field6489 < ~var8; ++var8) {
                int var26 = class342.field4958[var8];
                class311 var27;
                if (~var26 > -2049) {
                    var27 = class243.field3596[var26];
                } else {
                    var27 = class442.field6317[var26 + -2048];
                }
                int var28 = class136.field2108[var8];
                class311 var29;
                if (~var28 > -2049) {
                    var29 = class243.field3596[var28];
                } else {
                    var29 = class442.field6317[var28 - 2048];
                }
                class230.method1598(var29, arg4, arg3, arg2, (byte) 13, arg6, arg5, var27, --var27.field4526, arg0);
            }
            int var9 = class70.field934.field2575 + class70.field934.field2574 - -2;
            for (int var10 = 0; var10 < class166.field2376; ++var10) {
                int var11 = class190.field2735[var10];
                int var12 = class190.field2740[var10];
                int var13 = class190.field2738[var10];
                boolean var14 = true;
                while (var14) {
                    var14 = false;
                    for (int var25 = 0; ~var10 < ~var25; ++var25) {
                        if (class190.field2740[var25] - var9 < var12 + 2 && class190.field2740[var25] + 2 > -var9 + var12 && ~(-var13 + var11) > ~(class190.field2738[var25] + class190.field2735[var25]) && ~(var11 + var13) < ~(class190.field2735[var25] + -class190.field2738[var25]) && class190.field2740[var25] + -var9 < var12) {
                            var14 = true;
                            var12 = class190.field2740[var25] + -var9;
                        }
                    }
                }
                class190.field2740[var10] = var12;
                String var15 = class190.field2745[var10];
                if (class8.field115 == 0) {
                    int var16 = 16776960;
                    if (class190.field2718[var10] < 6) {
                        var16 = class386.field5456[class190.field2718[var10]];
                    }
                    if (class190.field2718[var10] == 6) {
                        var16 = class265.field3897 % 20 >= 10 ? 16776960 : 16711680;
                    }
                    if (class190.field2718[var10] == 7) {
                        var16 = ~(class265.field3897 % 20) > -11 ? 255 : 65535;
                    }
                    if (~class190.field2718[var10] == -9) {
                        var16 = ~(class265.field3897 % 20) <= -11 ? 8454016 : 45056;
                    }
                    if (class190.field2718[var10] == 9) {
                        int var17 = -class190.field2721[var10] + 150;
                        if (~var17 > -51) {
                            var16 = 16711680 - -(var17 * 1280);
                        } else if (~var17 <= -101) {
                            if (var17 < 150) {
                                var16 = (var17 - 100) * 5 + 65280;
                            }
                        } else {
                            var16 = -((var17 + -50) * 327680) + 16776960;
                        }
                    }
                    if (~class190.field2718[var10] == -11) {
                        int var18 = -class190.field2721[var10] + 150;
                        if (~var18 <= -51) {
                            if (var18 < 100) {
                                var16 = 16711935 - (var18 + -50) * 327680;
                            } else if (~var18 > -151) {
                                var16 = (var18 + -100) * 327680 + -(var18 * 5) + 500 + 255;
                            }
                        } else {
                            var16 = var18 * 5 + 16711680;
                        }
                    }
                    if (~class190.field2718[var10] == -12) {
                        int var19 = 150 - class190.field2721[var10];
                        if (var19 < 50) {
                            var16 = -(var19 * 327685) + 16777215;
                        } else if (~var19 <= -101) {
                            if (~var19 > -151) {
                                var16 = -(var19 * 327680) + 49545215;
                            }
                        } else {
                            var16 = (var19 + -50) * 327685 + 65280;
                        }
                    }
                    int var20 = var16 | -16777216;
                    if (~class190.field2761[var10] == -1) {
                        class154.field2285.method2194(-21811, var20, arg2 + var12, var15, -16777216, arg6 + var11);
                    }
                    if (class190.field2761[var10] == 1) {
                        class154.field2285.method2205(var20, arg6 + var11, -16777216, var15, (byte) -74, class265.field3897, arg2 + var12);
                    }
                    if (class190.field2761[var10] == 2) {
                        class154.field2285.method2202(-16777216, var15, arg6 + var11, var20, class265.field3897, 2, arg2 + var12);
                    }
                    if (~class190.field2761[var10] == -4) {
                        class154.field2285.method2199(var15, -class190.field2721[var10] + 150, -25029, arg2 + var12, class265.field3897, var20, -16777216, arg6 - -var11);
                    }
                    if (class190.field2761[var10] == 4) {
                        int var21 = (-class190.field2721[var10] + 150) * (100 + class70.field934.method1309((byte) 125, var15)) / 150;
                        class59.field786.method1004(arg6 - 50 + var11, arg2, arg6 + 50 + var11, arg0 + arg2);
                        class154.field2285.method2197(var20, -16777216, -var21 + var11 + arg6 + 50, (byte) 26, var15, arg2 - -var12);
                        class59.field786.method937(arg6, arg2, arg4 + arg6, arg0 + arg2);
                    }
                    if (class190.field2761[var10] == 5) {
                        int var22 = -class190.field2721[var10] + 150;
                        int var23 = 0;
                        if (var22 < 25) {
                            var23 = var22 - 25;
                        } else if (var22 > 125) {
                            var23 = var22 + -125;
                        }
                        int var24 = class70.field934.field2574 - -class70.field934.field2575;
                        class59.field786.method1004(arg6, -var24 + -1 + arg2 + var12, arg6 - -arg4, arg2 + var12 + 5);
                        class154.field2285.method2194(arg1 + -21812, var20, arg2 - -var12 - -var23, var15, -16777216, arg6 + var11);
                        class59.field786.method937(arg6, arg2, arg4 + arg6, arg0 + arg2);
                    }
                } else {
                    class154.field2285.method2194(-21811, -256, arg2 + var12, var15, -16777216, arg6 + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILlf;)V", line = 1559)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field3536;
        if (arg1 > 79) {
            if (~arg0 == -1) {
                int var4 = arg2.method837(true);
                if (~var4 != -1) {
                    this.method1633(var4, (byte) -11);
                } else {
                    this.field3542 = new int[arg2.method837(true)][4];
                    for (int var5 = 0; ~this.field3542.length < ~var5; ++var5) {
                        this.field3542[var5][0] = arg2.method798(false);
                        this.field3542[var5][1] = arg2.method837(true) << 4;
                        this.field3542[var5][2] = arg2.method837(true) << 4;
                        this.field3542[var5][3] = arg2.method837(true) << 4;
                    }
                }
            }
        }
    }
}
