import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class432 extends class511 {

    @OriginalMember(owner = "client!gs", name = "Kb", descriptor = "I")
    public static int field6002 = 0;

    @OriginalMember(owner = "client!gs", name = "Jb", descriptor = "Ljn;")
    public static class134 field6001 = new class134(48, 3);

    @OriginalMember(owner = "client!gs", name = "Vb", descriptor = "F")
    public static float field6013;

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!gs", name = "Hb", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!gs", name = "Ib", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!gs", name = "Lb", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!gs", name = "Mb", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!gs", name = "Nb", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!gs", name = "Ob", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!gs", name = "Pb", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!gs", name = "Qb", descriptor = "I")
    private int field6008;

    @OriginalMember(owner = "client!gs", name = "Rb", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!gs", name = "Sb", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!gs", name = "Ub", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!gs", name = "Wb", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!gs", name = "Tb", descriptor = "Laia;")
    private class399 field6011;

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V")
    public class432(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "(I)I")
    public final int method2586(int arg0) {
        if (arg0 <= 116) {
            this.method2595(-58, -20);
        }
        ++field6014;
        int var2 = super.field6979[super.field6962++] + -this.field6011.method2454(-20089) & 255;
        return var2 < 128 ? var2 : (255 & super.field6979[super.field6962++] + -this.field6011.method2454(-20089)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "(II)V")
    public final void method2587(int arg0, int arg1) {
        super.field6979[super.field6962++] = (byte) (this.field6011.method2454(-20089) + arg0);
        int var3 = -90 % ((-25 - arg1) / 58);
        ++field6009;
    }

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "(I)V")
    public static final void method2588(int arg0) {
        ++field6005;
        if (class567.field7992 != 0 && class567.field7992 != 5) {
            try {
                short var1;
                if (class687.field9588 != 0) {
                    var1 = 2000;
                } else {
                    var1 = 250;
                }
                if (~(++class179.field2270) < ~var1) {
                    if (class679.field9490 != null) {
                        class679.field9490.method3634(22654);
                        class679.field9490 = null;
                    }
                    if (class687.field9588 >= 3) {
                        class567.field7992 = 0;
                        class349.method2198(13609, -5);
                        return;
                    }
                    if (class531.field7316 != 2) {
                        class367.field5275.method3452(arg0 ^ 100);
                    } else {
                        class735.field10134.method3452(-114);
                    }
                    class567.field7992 = 1;
                    class179.field2270 = 0;
                    ++class687.field9588;
                }
                if (~class567.field7992 == -2) {
                    if (class531.field7316 == 2) {
                        class66.field726 = class735.field10134.method3450(class129.field1674, (byte) -33);
                    } else {
                        class66.field726 = class367.field5275.method3450(class129.field1674, (byte) -28);
                    }
                    class567.field7992 = 2;
                }
                if (~class567.field7992 == -3) {
                    if (~class66.field726.field4970 == -3) {
                        throw new IOException();
                    }
                    if (class66.field726.field4970 != 1) {
                        return;
                    }
                    class679.field9490 = class705.method3981(15000, 53, (Socket) class66.field726.field4975);
                    class66.field726 = null;
                    class128.method881((byte) -38);
                    class116 var2 = class743.method4117(123);
                    var2.field1575.method3005(255, class377.field5403.field4450);
                    class443.method2655(arg0 ^ -11, var2);
                    class581.method3420(arg0 ^ -11);
                    class567.field7992 = 3;
                }
                if (class567.field7992 == 3) {
                    if (!class679.field9490.method3633(1, 10)) {
                        return;
                    }
                    class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
                    int var3 = 255 & class315.field4517.field6979[0];
                    if (var3 != 0) {
                        class567.field7992 = 0;
                        class349.method2198(13609, var3);
                        class679.field9490.method3634(22654);
                        class679.field9490 = null;
                        class339.method2150(arg0 + 27547);
                        return;
                    }
                    class315.field4517.field6962 = 0;
                    class511 var4 = new class511(518);
                    int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D) };
                    var4.method3005(255, 10);
                    var4.method3003(var5[0], -23061);
                    var4.method3003(var5[1], arg0 + -23050);
                    var4.method3003(var5[2], -23061);
                    var4.method3003(var5[3], -23061);
                    var4.method3031(0L, 0);
                    var4.method3037(0, class266.field3866);
                    var4.method3031(class602.field8444, arg0 + 11);
                    var4.method3031(class723.field10018, 0);
                    var4.method3010(class592.field8339, (byte) 95, class459.field6424);
                    class128.method881((byte) -38);
                    class116 var6 = class743.method4117(121);
                    class432 var7 = var6.field1575;
                    if (class531.field7316 == 2) {
                        if (~class664.field9331 != -14) {
                            var7.method3005(arg0 ^ -246, class377.field5413.field4450);
                        } else {
                            var7.method3005(255, class377.field5415.field4450);
                        }
                        var7.method2986(0, -91);
                        int var8 = var7.field6962;
                        var7.method3003(646, arg0 + -23050);
                        var7.method2997((byte) -102, var4.field6979, 0, var4.field6962);
                        int var9 = var7.field6962;
                        var7.method3037(0, class671.field9423);
                        var7.method3005(255, class284.field4094);
                        var7.method3005(255, class647.method3714(-113));
                        var7.method2986(class742.field10226, arg0 + 125);
                        var7.method2986(class249.field3700, arg0 + 109);
                        var7.method3005(255, class688.field9602.field8529.method4329((byte) -98));
                        class581.method3408(-3802, var7);
                        var7.method3037(0, class704.field9801);
                        var7.method3003(class718.field9946, -23061);
                        class511 var10 = class688.field9602.method3508(24);
                        var7.method3005(arg0 ^ -246, var10.field6962);
                        var7.method2997((byte) -120, var10.field6979, 0, var10.field6962);
                        class106.field1247 = true;
                        class511 var11 = new class511(class495.field6813.method2899(-125));
                        class495.field6813.method2897(51, var11);
                        var7.method2997((byte) -29, var11.field6979, 0, var11.field6979.length);
                        var7.method2986(class218.field2994, -17);
                        var7.method3031(class44.field467, 0);
                        var7.method3005(255, class56.field663 != null ? 1 : 0);
                        if (class56.field663 != null) {
                            var7.method3037(0, class56.field663);
                        }
                        var7.method3005(255, class492.method2907(true, "jagtheora") ? 1 : 0);
                        var7.method3005(arg0 + 266, class359.field5181 ? 1 : 0);
                        class652.method3731((byte) 120, var7);
                        var7.method2999(var9, var7.field6962, -30341, var5);
                        var7.method3033(-var8 + var7.field6962, (byte) 112);
                    } else {
                        var7.method3005(arg0 + 266, class377.field5416.field4450);
                        var7.method2986(0, 114);
                        int var12 = var7.field6962;
                        var7.method3003(646, arg0 ^ 23070);
                        var7.method2997((byte) -47, var4.field6979, 0, var4.field6962);
                        int var13 = var7.field6962;
                        var7.method3037(0, class671.field9423);
                        var7.method3005(255, class327.field4603.field10814);
                        var7.method3005(arg0 + 266, class553.field7667);
                        class581.method3408(-3802, var7);
                        var7.method3037(0, class704.field9801);
                        var7.method3003(class718.field9946, arg0 ^ 23070);
                        class652.method3731((byte) 82, var7);
                        var7.method2999(var13, var7.field6962, -30341, var5);
                        var7.method3033(var7.field6962 - var12, (byte) 99);
                    }
                    class443.method2655(0, var6);
                    class581.method3420(0);
                    class84.field1023 = new class399(var5);
                    for (int var14 = 0; ~var14 > -5; ++var14) {
                        var5[var14] += 50;
                    }
                    class315.field4517.method2593((byte) -120, var5);
                    class567.field7992 = 4;
                }
                if (~class567.field7992 == -5) {
                    if (!class679.field9490.method3633(1, arg0 + 21)) {
                        return;
                    }
                    class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
                    int var15 = class315.field4517.field6979[0] & 255;
                    if (var15 != 21) {
                        if (~var15 != -30) {
                            if (~var15 == -2) {
                                class567.field7992 = 5;
                                class349.method2198(13609, var15);
                                return;
                            }
                            if (var15 != 2) {
                                if (~var15 != -16) {
                                    if (var15 == 23 && class687.field9588 < 3) {
                                        class567.field7992 = 1;
                                        class179.field2270 = 0;
                                        ++class687.field9588;
                                        class679.field9490.method3634(22654);
                                        class679.field9490 = null;
                                        return;
                                    }
                                    class567.field7992 = 0;
                                    class349.method2198(13609, var15);
                                    class679.field9490.method3634(arg0 + 22665);
                                    class679.field9490 = null;
                                    class339.method2150(27536);
                                    return;
                                }
                                class179.field2258 = -2;
                                class567.field7992 = 14;
                            } else {
                                class567.field7992 = 8;
                            }
                        } else {
                            class567.field7992 = 13;
                        }
                    } else {
                        class567.field7992 = 7;
                    }
                }
                if (~class567.field7992 == -7) {
                    class128.method881((byte) -38);
                    class116 var16 = class743.method4117(88);
                    class432 var17 = var16.field1575;
                    var17.method2592(class84.field1023, arg0 ^ 29725);
                    var17.method2587(class377.field5420.field4450, 41);
                    class443.method2655(arg0 + 11, var16);
                    class581.method3420(0);
                    class567.field7992 = 4;
                } else if (~class567.field7992 == -8) {
                    if (class679.field9490.method3633(1, ~arg0)) {
                        class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
                        int var18 = class315.field4517.field6979[0] & 255;
                        class486.field6712 = var18 * 50;
                        class567.field7992 = 0;
                        class349.method2198(13609, 21);
                        class679.field9490.method3634(22654);
                        class679.field9490 = null;
                        class339.method2150(arg0 ^ -27547);
                    }
                } else if (class567.field7992 == 13) {
                    if (class679.field9490.method3633(1, arg0 + 21)) {
                        class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
                        class567.field7992 = 0;
                        class47.field524 = 255 & class315.field4517.field6979[0];
                        class349.method2198(arg0 + 13620, 29);
                        class679.field9490.method3634(arg0 ^ -22645);
                        class679.field9490 = null;
                        class339.method2150(27536);
                    }
                } else if (class567.field7992 == 8) {
                    if (class679.field9490.method3633(1, 10)) {
                        class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
                        class567.field7992 = 9;
                        class223.field3113 = class315.field4517.field6979[0] & 255;
                    }
                } else {
                    if (~class567.field7992 == -10) {
                        class432 var19 = class315.field4517;
                        if (~class531.field7316 != -3) {
                            if (!class679.field9490.method3633(class223.field3113, 10)) {
                                return;
                            }
                            class679.field9490.method3640(0, var19.field6979, class223.field3113, -49);
                            var19.field6962 = 0;
                            class597.field8370 = var19.method3013(-126);
                            class664.field9332 = var19.method3013(-96);
                            class19.field127 = ~var19.method3013(arg0 + -107) == -2;
                            class84.field1021 = var19.method3013(22) == 1;
                            class581.field8224 = var19.method3013(67) == 1;
                            class703.field9794 = var19.method3020(true);
                            class777.field10691 = class703.field9794 + (-class683.method3903((byte) 4) - var19.method3021((byte) 107));
                            int var20 = var19.method3013(27);
                            class345.field5011 = (var20 & 2) != 0;
                            class161.field2078 = (1 & var20) != 0;
                            class537.field7425 = var19.method3008(64);
                            class134.field1720 = var19.method3002(-1);
                            class108.field1283 = var19.method3002(-1);
                            class223.field3146 = var19.method3002(-1);
                            class85.field1029 = var19.method3008(arg0 + 75);
                            class531.field7317 = class129.field1674.method4233(0, class85.field1029);
                            class397.field5629 = var19.method3013(-107);
                            class271.field3916 = var19.method3002(arg0 ^ 10);
                            class456.field6382 = var19.method3002(arg0 + 10);
                            class747.field10316 = ~var19.method3013(107) == -2;
                            class724.field10031.field9965 = class724.field10031.field9973 = class231.field3479 = var19.method3018(-1);
                            class507.field6885 = var19.method3013(arg0 ^ 116);
                            class187.field2335 = var19.method3008(64);
                            class199.field2812 = var19.method3013(-119) == 1;
                            class499.field6841 = new class589();
                            class499.field6841.field8306 = var19.method3002(arg0 ^ 10);
                            if (~class499.field6841.field8306 == -65536) {
                                class499.field6841.field8306 = -1;
                            }
                            class499.field6841.field8299 = var19.method3018(arg0 + 10);
                            if (class425.field5937 != class224.field3414) {
                                class499.field6841.field8310 = class499.field6841.field8306 + 40000;
                                class499.field6841.field8302 = class499.field6841.field8306 + 50000;
                            }
                            if (class425.field5937 != class107.field1249 && (class425.field5937 != class273.field3939 || class597.field8370 < 2) && (class735.field10134.method3447(126, class718.field9950) || class735.field10134.method3447(arg0 + 11, class170.field2161))) {
                                class631.method3621((byte) 108);
                            }
                        } else {
                            if (!class679.field9490.method3633(class223.field3113, 10)) {
                                return;
                            }
                            class679.field9490.method3640(0, var19.field6979, class223.field3113, -49);
                            var19.field6962 = 0;
                            class597.field8370 = var19.method3013(arg0 ^ 118);
                            class664.field9332 = var19.method3013(-9);
                            class19.field127 = var19.method3013(-118) == 1;
                            class84.field1021 = ~var19.method3013(arg0 + -111) == -2;
                            class581.field8224 = var19.method3013(82) == 1;
                            class780.field10724 = var19.method3013(-124) == 1;
                            class173.field2193 = var19.method3002(arg0 + 10);
                            class161.field2078 = ~var19.method3013(-101) == -2;
                            class531.field7313 = var19.method2979(arg0 + 75212723);
                            class14.field78 = ~var19.method3013(75) == -2;
                            class390.field5558.method3064(class14.field78, (byte) -117);
                            class35.field367.method3046(class14.field78, 36);
                            class104.field1201.method4317((byte) -118, class14.field78);
                        }
                        if ((!class19.field127 || class581.field8224) && !class161.field2078) {
                            try {
                                class552.method3253(class511.field7007, arg0 + 111, "unzap");
                            } catch (Throwable var26) {
                            }
                        } else {
                            try {
                                class552.method3253(class511.field7007, 117, "zap");
                            } catch (Throwable var27) {
                                if (class529.field7258) {
                                    try {
                                        class511.field7007.getAppletContext().showDocument(new URL(class511.field7007.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var25) {
                                    }
                                }
                            }
                        }
                        if (class425.field5937 == class224.field3414) {
                            try {
                                class552.method3253(class511.field7007, 126, "loggedin");
                            } catch (Throwable var24) {
                            }
                        }
                        if (~class531.field7316 != -3) {
                            class567.field7992 = 0;
                            class349.method2198(13609, 2);
                            class746.method4128(-87);
                            class285.method1884(true, 7);
                            class350.field5090 = null;
                            return;
                        }
                        class567.field7992 = 11;
                    }
                    if (~class567.field7992 == -12) {
                        if (!class679.field9490.method3633(3, 10)) {
                            return;
                        }
                        class679.field9490.method3640(0, class315.field4517.field6979, 3, -49);
                        class567.field7992 = 12;
                    }
                    if (class567.field7992 == 12) {
                        class432 var21 = class315.field4517;
                        var21.field6962 = 0;
                        if (var21.method2594(100)) {
                            if (!class679.field9490.method3633(1, 10)) {
                                return;
                            }
                            class679.field9490.method3640(3, var21.field6979, 1, arg0 ^ 58);
                        }
                        class350.field5090 = class72.method539(11516)[var21.method2586(125)];
                        class179.field2258 = var21.method3002(-1);
                        class567.field7992 = 10;
                    }
                    if (~class567.field7992 == arg0) {
                        if (class679.field9490.method3633(class179.field2258, 10)) {
                            class679.field9490.method3640(0, class315.field4517.field6979, class179.field2258, -49);
                            class315.field4517.field6962 = 0;
                            class567.field7992 = 0;
                            int var22 = class179.field2258;
                            class349.method2198(arg0 + 13620, 2);
                            class175.method1117((byte) -109);
                            class136.method910(arg0 ^ -246, class315.field4517);
                            class728.field10063 = -1;
                            if (class705.field9806 != class350.field5090) {
                                class4.method11((byte) -69);
                            } else {
                                class110.method804(-5639);
                            }
                            if (class315.field4517.field6962 != var22) {
                                throw new RuntimeException("lswp pos:" + class315.field4517.field6962 + " psize:" + var22);
                            } else {
                                class350.field5090 = null;
                            }
                        }
                    } else if (class567.field7992 == 14) {
                        if (~class179.field2258 == 1) {
                            if (!class679.field9490.method3633(2, 10)) {
                                return;
                            }
                            class679.field9490.method3640(0, class315.field4517.field6979, 2, -49);
                            class315.field4517.field6962 = 0;
                            class179.field2258 = class315.field4517.method3002(-1);
                        }
                        if (class679.field9490.method3633(class179.field2258, 10)) {
                            class679.field9490.method3640(0, class315.field4517.field6979, class179.field2258, -49);
                            class315.field4517.field6962 = 0;
                            int var23 = class179.field2258;
                            class567.field7992 = 0;
                            class349.method2198(13609, 15);
                            class677.method3855(false);
                            class136.method910(255, class315.field4517);
                            if (~class315.field4517.field6962 != ~var23) {
                                throw new RuntimeException("lswpr pos:" + class315.field4517.field6962 + " psize:" + var23);
                            } else {
                                class350.field5090 = null;
                            }
                        }
                    }
                }
            } catch (IOException var28) {
                if (class679.field9490 != null) {
                    class679.field9490.method3634(22654);
                    class679.field9490 = null;
                }
                if (~class687.field9588 <= -4) {
                    class567.field7992 = 0;
                    class349.method2198(13609, -4);
                    class339.method2150(27536);
                } else {
                    if (class531.field7316 == 2) {
                        class735.field10134.method3452(-124);
                    } else {
                        class367.field5275.method3452(-128);
                    }
                    class179.field2270 = 0;
                    class567.field7992 = 1;
                    ++class687.field9588;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([BIII)V")
    public final void method2589(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg1; arg2 > var5; ++var5) {
            arg0[arg3 + var5] = (byte) (super.field6979[super.field6962++] + -this.field6011.method2454(class475.method2835(arg1, -20089)));
        }
        ++field6003;
    }

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "(B)V")
    public final void method2590(byte arg0) {
        ++field6010;
        this.field6008 = super.field6962 * 8;
        if (arg0 <= 126) {
            field6002 = -109;
        }
    }

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "(II)I")
    public final int method2591(int arg0, int arg1) {
        ++field6012;
        if (arg0 != -30) {
            return -40;
        } else {
            int var3 = this.field6008 >> 3;
            int var4 = -(7 & this.field6008) + 8;
            int var5 = 0;
            this.field6008 += arg1;
            while (~arg1 < ~var4) {
                var5 += (super.field6979[var3++] & class345.field4990[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 == var4) {
                var6 = (class345.field4990[var4] & super.field6979[var3]) + var5;
            } else {
                var6 = (super.field6979[var3] >> -arg1 + var4 & class345.field4990[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Laia;I)V")
    public final void method2592(class399 arg0, int arg1) {
        if (arg1 != -29720) {
            field6013 = 0.18461671F;
        }
        this.field6011 = arg0;
        ++field6000;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B[I)V")
    private final void method2593(byte arg0, int[] arg1) {
        ++field6007;
        this.field6011 = new class399(arg1);
        if (arg0 >= -119) {
            this.method2594(114);
        }
    }

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "(I)Z")
    public final boolean method2594(int arg0) {
        ++field5999;
        int var2 = super.field6979[super.field6962] - this.field6011.method2456(-92) & 255;
        if (~var2 > -129) {
            return false;
        } else {
            if (arg0 <= 91) {
                this.method2590((byte) -75);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "(II)I")
    public final int method2595(int arg0, int arg1) {
        ++field5998;
        return arg1 < 21 ? 46 : arg0 * 8 + -this.field6008;
    }

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "(B)V")
    public final void method2596(byte arg0) {
        super.field6962 = (this.field6008 - -7) / 8;
        if (arg0 == -33) {
            ++field6006;
        }
    }

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "(I)V")
    public static void method2597(int arg0) {
        field6001 = null;
        if (arg0 != 1) {
            field6002 = -107;
        }
    }
}
