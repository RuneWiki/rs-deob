import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class8 extends class601 {

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "Lrg;")
    public static class557 field80 = new class557();

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "Ljava/lang/String;")
    public static String field81 = null;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "[Lro;")
    public static class526[] field82 = new class526[14];

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        ++field79;
        if (arg1 != 22) {
            this.method41((byte) -79);
        }
        if (super.field8137.method2161(0)) {
            return 3;
        } else {
            return arg0 != 0 && super.field8137.field4752.method62(0) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(ILqea;)V")
    public class8(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V")
    public static final void method37(boolean arg0) {
        ++field73;
        class402.method2512((byte) 53, 2, ~class332.field4707.field4778.method2193(0) == -2, 22050);
        class221.field2991 = class489.method2965((byte) 108, class570.field7875, 0, 22050, class159.field2227);
        class714.method4013(class38.method203(111, (class261) null), 512, true);
        if (arg0) {
            method46((byte) -74);
        }
        class264.field3869 = class489.method2965((byte) 117, class570.field7875, 1, 2048, class159.field2227);
        class483.field6739 = new class50();
        class264.field3869.method3157(class483.field6739, 256);
        class746.field10250 = new class476(22050, class718.field9998);
        class512.method3059(-1);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IJI)Ljava/lang/String;")
    public static final String method38(int arg0, long arg1, int arg2) {
        ++field78;
        class569.method3335(25856, arg1);
        int var4 = class614.field8252.get(5);
        int var5 = class614.field8252.get(2);
        if (arg0 != -14655) {
            method44(false, -11, -50);
        }
        int var6 = class614.field8252.get(1);
        int var7 = class614.field8252.get(11);
        int var8 = class614.field8252.get(12);
        return arg2 == 3 ? class460.method2802((byte) 71, arg2, arg1) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class696.field9693[arg2][var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZIIIII)V")
    public static final void method39(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field76;
        if (class137.field1948 == null) {
            class129.field1802.method3249(arg4, 125, arg1, arg5, -16777216, arg3);
        } else if (~class388.field5601.field4410 <= -1 && class277.field4036 * 512 > class388.field5601.field4410 && ~class388.field5601.field4418 <= -1 && class667.field9202 * 512 > class388.field5601.field4418) {
            ++class428.field5973;
            if (class388.field5601 != null && ~(class388.field5601.field4410 + -(256 * (-1 + class388.field5601.method662((byte) 15))) >> 9) == ~class486.field6806 && class388.field5601.field4418 + 256 + -(256 * class388.field5601.method662((byte) 15)) >> 9 == class171.field2378) {
                class486.field6806 = -1;
                class171.field2378 = -1;
                class744.method4143((byte) -53);
            }
            class382.method2393((byte) -110);
            if (!arg0) {
                class550.method3265(arg2 + -717339750);
            }
            class527.method3131(arg2 ^ -717339722);
            class612.method3469(arg1, (byte) -128, arg5, true, arg4, arg3);
            int var6 = class220.field2976;
            int var7 = class54.field783;
            int var8 = class6.field54;
            int var9 = class473.field6558;
            class3.field30 = class3.field27;
            if (~class720.field10023 != -2) {
                if (~class720.field10023 == -5) {
                    int var10 = (int) class589.field8028;
                    if (class302.field4268 >> 8 > var10) {
                        var10 = class302.field4268 >> 8;
                    }
                    if (class396.field5692[4] && var10 < class548.field7627[4] + 128) {
                        var10 = class548.field7627[4] + 128;
                    }
                    int var11 = (int) class596.field8093 & 16383;
                    class11.method52(class316.field4388, var10, class737.method4102((byte) 19, class43.field532, class544.field7541, class96.field1331) + -200, (var10 >> 3) * 3 + 600 << 2, class357.field5123, 53, var11, var8);
                } else if (class720.field10023 == 5) {
                    class651.method3643((byte) -38, var8);
                }
            } else {
                int var12 = (int) class589.field8028;
                if (class302.field4268 >> 8 > var12) {
                    var12 = class302.field4268 >> 8;
                }
                if (class396.field5692[4] && class548.field7627[4] + 128 > var12) {
                    var12 = class548.field7627[4] + 128;
                }
                int var13 = 16383 & (int) class596.field8093 - -class299.field4240;
                class11.method52(class316.field4388, var12, -200 + class737.method4102((byte) 19, class388.field5601.field4410, class388.field5601.field4418, class96.field1331), (var12 >> 3) * 3 + 600 << 2, class357.field5123, 5, var13, var8);
            }
            int var14 = class671.field9282;
            int var15 = class206.field2702;
            int var16 = class123.field1680;
            int var17 = class25.field318;
            int var18 = class230.field3118;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class396.field5692[var19]) {
                    int var22 = (int) ((double) (-class559.field7784[var19]) + Math.random() * (double) (class559.field7784[var19] * 2 - -1) + Math.sin((double) class134.field1905[var19] / 100.0D * (double) class257.field3726[var19]) * (double) class548.field7627[var19]);
                    if (var19 == 3) {
                        class230.field3118 = class230.field3118 + var22 & 16383;
                    }
                    if (var19 == 2) {
                        class123.field1680 += var22 << 2;
                    }
                    if (~var19 == -1) {
                        class671.field9282 += var22 << 2;
                    }
                    if (~var19 == -5) {
                        class25.field318 += var22;
                        if (class25.field318 < 1024) {
                            class25.field318 = 1024;
                        } else if (~class25.field318 < -3073) {
                            class25.field318 = 3072;
                        }
                    }
                    if (~var19 == -2) {
                        class206.field2702 += var22 << 2;
                    }
                }
            }
            if (class671.field9282 < 0) {
                class671.field9282 = 0;
            }
            if (~class123.field1680 > -1) {
                class123.field1680 = 0;
            }
            if (~((class61.field877 << 9) + -1) > ~class671.field9282) {
                class671.field9282 = (class61.field877 << 9) - 1;
            }
            if (class123.field1680 > (class713.field9959 << 9) + -1) {
                class123.field1680 = (class713.field9959 << 9) - 1;
            }
            class32.method178((byte) -61);
            class152.method964(-112);
            class129.field1802.method1544(var7, var9, var6 + var7, var8 + var9);
            class360.method2296(true, (byte) -104);
            if (!class222.field3009) {
                class129.field1802.method346();
                int var20 = class523.field7273;
                if (class359.field5138 == null) {
                    class129.field1802.method273(var20);
                } else {
                    class359.field5138.method3395(class25.field318, var7, 0, var9, var6, var20, class129.field1802, var8, class456.field6323 << 3, class230.field3118);
                }
            } else {
                class724.method4047((byte) -125, class523.field7273);
                if (~class3.field30 != ~class24.field311) {
                    class569.field7870 = true;
                }
                class24.field311 = class3.field30;
            }
            class11.method51(arg2 + -717339835);
            class243.field3618.method875(class671.field9282, class206.field2702, class123.field1680, 16383 & -class25.field318, 16383 & -class230.field3118, -class118.field1556 & 16383);
            class129.field1802.method1444(class243.field3618);
            class129.field1802.method1421(var6 / 2 + var7, var8 / 2 + var9, class487.field6813 << 1, class487.field6813 << 1);
            class263.method1801(var8 / 2 + var9, var6 / 2 + var7, class487.field6813 << 1, (byte) -3, class487.field6813 << 1);
            class191.method1183(class671.field9282, -class230.field3118 & 16383, arg2 + -717339731, class123.field1680, 16383 & -class25.field318, -class118.field1556 & 16383, class206.field2702);
            byte var21 = ~class332.field4707.field4793.method2460(0) == -3 ? (byte) class428.field5973 : 1;
            if (!class222.field3009) {
                class383.method2402(class483.field6741, class671.field9282, class206.field2702, class123.field1680, class343.field4884, class724.field10047, client.field6237, class147.field2055, class563.field7819, class92.field1282, class388.field5601.field4408 + 1, var21, class388.field5601.field4410 >> 9, class388.field5601.field4418 >> 9, class332.field4707.field4799.method2307(arg2 + -717339721) == 0, true, !class301.field4261 ? -1 : class3.field30, 0, false);
            } else {
                class25.method143((byte) 31, -class25.field318 & 16383, -class118.field1556 & 16383, 16383 & -class230.field3118);
                class383.method2403(class671.field9282, class123.field1680, class343.field4884, class388.field5601.field4408 - -1, class724.field10047, client.field6237, class92.field1282, class388.field5601.field4410 >> 9, true, 122, class3.field30, class147.field2055, class563.field7819, var21, class388.field5601.field4418 >> 9, class332.field4707.field4799.method2307(0) == 0, class483.field6741, class206.field2702);
            }
            class11.method51(98);
            if (class102.field1401 == 10) {
                class611.method3467(var7, var8, 256, var9, 256, var6, true);
                class186.method1164(256, var9, var8, 0, 256, var7, var6);
                class666.method3766(var9, 256, var7, var6, 256, var8, arg2 ^ -1726543608);
                class66.method531(var6, var7, -16426, var9, var8);
            }
            class462.method2828();
            class25.field318 = var17;
            class230.field3118 = var18;
            class123.field1680 = var16;
            class206.field2702 = var15;
            class671.field9282 = var14;
            if (class364.field5188 && class396.field5689.method1930(96) == 0) {
                class364.field5188 = false;
            }
            if (class364.field5188) {
                class129.field1802.method3249(var7, arg2 + -717339597, var8, var6, -16777216, var9);
                class743.method4138(false, class272.field3950, class155.field2131.method978(class120.field1576, (byte) -108), class524.field7280, class129.field1802, (byte) -56);
            }
            class360.method2296(false, (byte) -77);
            if (arg2 != 717339721) {
                field80 = null;
            }
        } else {
            class129.field1802.method3249(arg4, arg2 + -717339729, arg1, arg5, -16777216, arg3);
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)I")
    public final int method40(int arg0) {
        ++field75;
        if (arg0 != 0) {
            field80 = null;
        }
        return super.field8131;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        if (super.field8137.method2161(0)) {
            super.field8131 = 0;
        }
        int var2 = 24 % ((arg0 - 59) / 33);
        ++field77;
        if (super.field8131 < 0 && super.field8131 > 2) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)Z")
    public final boolean method42(int arg0) {
        if (arg0 != 2048) {
            this.method36(-108, (byte) 28);
        }
        ++field72;
        return !super.field8137.method2161(0);
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = -14 % ((arg0 - 22) / 34);
        ++field71;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lqea;)V")
    public class8(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZII)Z")
    public static final boolean method44(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method44(true, -38, 64);
        }
        ++field74;
        return (540800 & arg2) != 0;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            this.method45(39);
        }
        ++field70;
        return 1;
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)V")
    public static void method46(byte arg0) {
        if (arg0 < 101) {
            method44(false, -59, 115);
        }
        field81 = null;
        field80 = null;
        field82 = null;
    }
}
