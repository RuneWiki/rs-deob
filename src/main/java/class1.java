import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class228 {

    @OriginalMember(owner = "client!wf", name = "yb", descriptor = "Ljava/lang/String;")
    public static String field1 = "flash3:";

    @OriginalMember(owner = "client!wf", name = "Kb", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!wf", name = "Ib", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "Jb", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!wf", name = "Lb", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!wf", name = "Mb", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!wf", name = "Nb", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!wf", name = "Ob", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!wf", name = "Pb", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!wf", name = "zb", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "Rb", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!wf", name = "Tb", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!wf", name = "Ab", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "Bb", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "Cb", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "Db", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "Fb", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!wf", name = "Gb", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "Hb", descriptor = "Llm;")
    public static class347 field10;

    @OriginalMember(owner = "client!wf", name = "Qb", descriptor = "Llm;")
    public static class347 field19;

    @OriginalMember(owner = "client!wf", name = "Sb", descriptor = "Lqd;")
    private class3 field21;

    @OriginalMember(owner = "client!wf", name = "Eb", descriptor = "[Lcq;")
    public static class67[] field7;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lwm;B)V")
    public static final void method1(class298 arg0, byte arg1) {
        ++field20;
        boolean var2 = false;
        if (~class28.field418 != ~arg0.field4322 && ~arg0.field4290 != 0 && ~arg0.field4332 == -1) {
            class12 var3 = class33.method221((byte) 102, arg0.field4290);
            if (var3.field196 || var3.field176[arg0.field4300] < arg0.field4291 + 1) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg0.field4345 + arg0.field4322;
            int var5 = class28.field418 - arg0.field4345;
            int var6 = arg0.field4306 * 128 - -(arg0.method168(-123) * 64);
            int var7 = arg0.field4284 * 128 - -(arg0.method168(-113) * 64);
            int var8 = arg0.field4325 * 128 + 64 * arg0.method168(-117);
            int var9 = arg0.field4268 * 128 - -(64 * arg0.method168(-119));
            arg0.field734 = ((-var5 + var4) * var7 + var5 * var9) / var4;
            arg0.field740 = ((-var5 + var4) * var6 + var5 * var8) / var4;
        }
        arg0.field4358 = 0;
        if (arg1 <= 101) {
            method2((byte) 38);
        }
        if (arg0.field4295 == 0) {
            arg0.method2047(8192, (byte) -124);
        }
        if (~arg0.field4295 == -2) {
            arg0.method2047(12288, (byte) -123);
        }
        if (arg0.field4295 == 2) {
            arg0.method2047(0, (byte) -121);
        }
        if (arg0.field4295 == 3) {
            arg0.method2047(4096, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "(B)V")
    public static final void method2(byte arg0) {
        ++field6;
        class407.method2621(class16.field224, 15);
        ++class396.field5871;
        if (class69.field887 && class218.field2881) {
            int var1 = -94 % ((arg0 - 36) / 34);
            int var2 = class124.field1728;
            int var3 = var2 - class218.field2886;
            int var4 = class323.field4747;
            if (~class71.field996 < ~var3) {
                var3 = class71.field996;
            }
            int var5 = var4 - class252.field3471;
            if (~class302.field4446 < ~var5) {
                var5 = class302.field4446;
            }
            if (class71.field996 + class179.field2370.field5773 < class16.field224.field5773 + var3) {
                var3 = class71.field996 + class179.field2370.field5773 + -class16.field224.field5773;
            }
            if (~(class302.field4446 - -class179.field2370.field5672) > ~(var5 - -class16.field224.field5672)) {
                var5 = -class16.field224.field5672 + class302.field4446 + class179.field2370.field5672;
            }
            int var6 = -class56.field758 + var3;
            int var7 = -class319.field4666 + var5;
            int var8 = class16.field224.field5765;
            if (class16.field224.field5807 < class396.field5871 && (~var8 > ~var6 || ~var6 > ~(-var8) || var7 > var8 || -var8 > var7)) {
                class376.field5486 = true;
            }
            int var9 = var3 - class71.field996 - -class179.field2370.field5742;
            int var10 = -class302.field4446 + class179.field2370.field5764 + var5;
            if (class16.field224.field5661 != null && class376.field5486) {
                class192 var11 = new class192();
                var11.field2566 = class16.field224;
                var11.field2583 = var9;
                var11.field2578 = class16.field224.field5661;
                var11.field2568 = var10;
                class123.method783(var11);
            }
            if (class129.field1788 == 0) {
                if (!class376.field5486) {
                    if ((class88.field1232 == 1 || class194.method1163(false)) && class212.field2844 > 2) {
                        class432.method2736(0, 2);
                    } else if (class308.method2095(-22199)) {
                        class432.method2736(0, 1);
                    }
                } else {
                    if (class16.field224.field5747 != null) {
                        class192 var12 = new class192();
                        var12.field2583 = var9;
                        var12.field2568 = var10;
                        var12.field2565 = class244.field3258;
                        var12.field2566 = class16.field224;
                        var12.field2578 = class16.field224.field5747;
                        class123.method783(var12);
                    }
                    if (class244.field3258 != null && client.method1532(class16.field224) != null) {
                        class346.method2249(class244.field3258.field5649, true, class16.field224.field5698, class244.field3258.field5698, class16.field224.field5649);
                    }
                }
                class16.field224 = null;
            }
        } else {
            if (class396.field5871 > 1) {
                class16.field224 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)I")
    public final int method3(int arg0, boolean arg1) {
        if (!arg1) {
            return -40;
        } else {
            ++field2;
            return arg0 * 8 + -this.field8;
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field22;
        int var3 = this.field8 >> 3;
        int var4 = -(7 & this.field8) + 8;
        this.field8 += arg0;
        if (arg1 != 25) {
            return -34;
        } else {
            int var5 = 0;
            while (arg0 > var4) {
                var5 += (class249.field3414[var4] & super.field3040[var3++]) << arg0 - var4;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg0 == ~var4) {
                var6 = (super.field3040[var3] & class249.field3414[var4]) + var5;
            } else {
                var6 = (super.field3040[var3] >> -arg0 + var4 & class249.field3414[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "(II)V")
    public final void method5(int arg0, int arg1) {
        if (arg0 != -6445) {
            method2((byte) 58);
        }
        super.field3040[super.field3029++] = (byte) (this.field21.method23(0) + arg1);
        ++field18;
    }

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "(B)I")
    public final int method6(byte arg0) {
        if (arg0 != -25) {
            this.method3(-22, true);
        }
        ++field9;
        return super.field3040[super.field3029++] + -this.field21.method23(0) & 255;
    }

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "(I)V")
    public final void method7(int arg0) {
        ++field17;
        if (arg0 <= 86) {
            this.method6((byte) 110);
        }
        super.field3029 = (this.field8 - -7) / 8;
    }

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "(I)V")
    public static final void method8(int arg0) {
        ++field14;
        int var1 = 0;
        if (class211.field2801) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        class365.method2385(12, var1);
        class41.method294(var1, -128);
        class55.method377(arg0 ^ 119, var1);
        class229.method1382(250, var1);
        class144.method919(var1, -71);
        class356.method2338(var1, 0);
        class388.method2494(var1, -67);
        class219.method1284(var1, 8);
        class398.method2563(var1, (byte) 67);
        if (~class70.field932 == arg0) {
            class232.method1391(arg0 ^ 19, 28);
        } else if (class70.field932 == 30) {
            class232.method1391(-26, 25);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lii;BLrc;)I")
    public static final int method9(class405 arg0, byte arg1, class100 arg2) {
        ++field16;
        if (arg2.field1407 == -1) {
            if (arg2.field1410 != -1) {
                class444 var3 = class328.field4780.method186(arg0.method1720() ? arg2.field1410 : arg2.field1395, -9590);
                if (!var3.field6494) {
                    return var3.field6504;
                }
            }
            int var4 = 48 / ((64 - arg1) / 48);
            return arg2.field1393;
        } else {
            return arg2.field1407;
        }
    }

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "(I)V")
    public static final void method10(int arg0) {
        ++field12;
        if (arg0 != 81) {
            field10 = null;
        }
        if (class404.field6009 && class30.field437[81] && class212.field2844 > 2) {
            class211.method1257(arg0 + 28820, (class212) class321.field4726.field663.field641.field641);
        } else {
            class211.method1257(arg0 ^ 28852, (class212) class321.field4726.field663.field641);
        }
    }

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "(B)V")
    public final void method11(byte arg0) {
        this.field8 = super.field3029 * 8;
        if (arg0 < 84) {
            method8(-9);
        }
        ++field15;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([II)V")
    public final void method12(int[] arg0, int arg1) {
        ++field5;
        if (arg1 >= -93) {
            method2((byte) 112);
        }
        this.field21 = new class3(arg0);
    }

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "(B)V")
    public static final void method13(byte arg0) {
        if (arg0 == -31) {
            ++field4;
            class237.field3160.method1141(arg0 + 287);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIB[B)V")
    public final void method14(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field11;
        if (arg2 > -30) {
            field13 = 24;
        }
        for (int var5 = 0; arg0 > var5; ++var5) {
            arg3[var5 - -arg1] = (byte) (super.field3040[super.field3029++] + -this.field21.method23(0));
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
    public static void method15(boolean arg0) {
        if (arg0) {
            field19 = null;
        }
        field10 = null;
        field7 = null;
        field19 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "(I)V")
    public static final void method16(int arg0) {
        ++field3;
        if (!class62.field820) {
            if (arg0 != -26767) {
                field13 = -117;
            }
            class8.method63((byte) -48, class92.field1299);
            if (class99.field1387 != null) {
                class8.method63((byte) -48, class99.field1387);
            }
            class62.field820 = true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
    public class1(int arg0) {
        super(arg0);
    }
}
