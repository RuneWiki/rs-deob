import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class288 extends class264 {

    @OriginalMember(owner = "client!up", name = "t", descriptor = "[I")
    public static int[] field4398 = new int[25];

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public static int field4397 = 0;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field4400 = 0;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        int var2 = -58 % ((arg0 - 1) / 41);
        ++field4391;
        super.field3733 = this.method663((byte) -38);
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public static void method1921(int arg0) {
        field4398 = null;
        if (arg0 != 0) {
            method1922((class66) null, (byte) 99, -39, (class302) null);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lha;BILjfa;)V")
    public static final void method1922(class66 arg0, byte arg1, int arg2, class302 arg3) {
        ++field4399;
        if (class338.field5020 != null && ~arg3.field4538 <= ~arg2) {
            for (int var4 = 0; ~class338.field5020.length < ~var4; ++var4) {
                if (~class338.field5020[var4] != 999999 && (class338.field5020[var4] >= arg3.field4526[0] || class338.field5020[var4] >= arg3.field4526[1] || class338.field5020[var4] >= arg3.field4526[2] || class338.field5020[var4] >= arg3.field4526[3]) && (arg3.field4532[0] <= class243.field3471[var4] || class243.field3471[var4] >= arg3.field4532[1] || ~arg3.field4532[2] >= ~class243.field3471[var4] || arg3.field4532[3] <= class243.field3471[var4]) && (arg3.field4532[0] >= class289.field4411[var4] || class289.field4411[var4] <= arg3.field4532[1] || ~class289.field4411[var4] >= ~arg3.field4532[2] || arg3.field4532[3] >= class289.field4411[var4]) && (~arg3.field4537[0] >= ~class458.field6565[var4] || ~class458.field6565[var4] <= ~arg3.field4537[1] || ~class458.field6565[var4] <= ~arg3.field4537[2] || ~arg3.field4537[3] >= ~class458.field6565[var4]) && (arg3.field4537[0] >= class761.field10493[var4] || ~arg3.field4537[1] <= ~class761.field10493[var4] || arg3.field4537[2] >= class761.field10493[var4] || arg3.field4537[3] >= class761.field10493[var4])) {
                    return;
                }
            }
        }
        if (arg3.field4536 == 1) {
            int var5 = -class282.field4335 + class76.field1016 + arg3.field4539;
            if (~var5 <= -1 && ~var5 >= ~(class76.field1016 + class76.field1016)) {
                int var6 = arg3.field4534 - -class76.field1016 + -class301.field4521;
                if (~var6 > -1) {
                    var6 = 0;
                } else if (var6 > class76.field1016 + class76.field1016) {
                    return;
                }
                int var7 = -class301.field4521 + class76.field1016 + arg3.field4530;
                if (~(class76.field1016 - -class76.field1016) <= ~var7) {
                    if (var7 < 0) {
                        return;
                    }
                } else {
                    var7 = class76.field1016 + class76.field1016;
                }
                boolean var8 = false;
                while (var7 >= var6) {
                    if (class457.field6551[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (-arg3.field4532[0] + class544.field7647);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class433.field6155)) {
                        if (class350.method2212(0, false, arg3)) {
                            if (class350.method2212(1, false, arg3)) {
                                if (class350.method2212(2, false, arg3)) {
                                    if (class350.method2212(3, false, arg3)) {
                                        class487.field6897[class546.field7709++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (arg3.field4536 == 2) {
            int var10 = arg3.field4534 - class301.field4521 + class76.field1016;
            if (var10 >= 0 && var10 <= class76.field1016 - -class76.field1016) {
                int var11 = -class282.field4335 + arg3.field4539 + class76.field1016;
                if (var11 < 0) {
                    var11 = 0;
                } else if (~(class76.field1016 + class76.field1016) > ~var11) {
                    return;
                }
                int var12 = -class282.field4335 + arg3.field4528 + class76.field1016;
                if (var12 <= class76.field1016 - -class76.field1016) {
                    if (~var12 > -1) {
                        return;
                    }
                } else {
                    var12 = class76.field1016 - -class76.field1016;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class457.field6551[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (-arg3.field4537[0] + class752.field10424);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class433.field6155)) {
                        if (class350.method2212(0, false, arg3)) {
                            if (class350.method2212(1, false, arg3)) {
                                if (class350.method2212(2, false, arg3)) {
                                    if (class350.method2212(3, false, arg3)) {
                                        class487.field6897[class546.field7709++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (arg3.field4536 != 16 && ~arg3.field4536 != -9) {
            if (arg3.field4536 != 4) {
                if (arg1 != 108) {
                    field4400 = -74;
                }
            } else {
                float var15 = (float) (arg3.field4526[0] + -class102.field1284);
                if (!((float) class634.field8943 >= var15)) {
                    int var16 = -class301.field4521 + class76.field1016 + arg3.field4534;
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (~var16 < ~(class76.field1016 + class76.field1016)) {
                        return;
                    }
                    int var17 = class76.field1016 + arg3.field4530 + -class301.field4521;
                    if (~var17 < ~(class76.field1016 + class76.field1016)) {
                        var17 = class76.field1016 - -class76.field1016;
                    } else if (~var17 > -1) {
                        return;
                    }
                    int var18 = class76.field1016 + arg3.field4539 + -class282.field4335;
                    if (~var18 <= -1) {
                        if (~var18 < ~(class76.field1016 - -class76.field1016)) {
                            return;
                        }
                    } else {
                        var18 = 0;
                    }
                    int var19 = -class282.field4335 + class76.field1016 + arg3.field4528;
                    if (~(class76.field1016 + class76.field1016) > ~var19) {
                        var19 = class76.field1016 + class76.field1016;
                    } else if (~var19 > -1) {
                        return;
                    }
                    boolean var20 = false;
                    label296: for (int var21 = var18; var19 >= var21; ++var21) {
                        for (int var22 = var16; var22 <= var17; ++var22) {
                            if (class457.field6551[var21][var22]) {
                                var20 = true;
                                break label296;
                            }
                        }
                    }
                    if (var20) {
                        if (class350.method2212(0, false, arg3)) {
                            if (class350.method2212(1, false, arg3)) {
                                if (class350.method2212(2, false, arg3)) {
                                    if (class350.method2212(3, false, arg3)) {
                                        class487.field6897[class546.field7709++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int var23 = arg3.field4539 - (-class76.field1016 + class282.field4335);
            if (var23 >= 0 && var23 <= class76.field1016 - -class76.field1016) {
                int var24 = -class301.field4521 + arg3.field4534 + class76.field1016;
                if (~var24 <= -1 && ~(class76.field1016 - -class76.field1016) <= ~var24) {
                    if (class457.field6551[var23][var24]) {
                        float var25 = (float) (-arg3.field4532[0] + class544.field7647);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (-arg3.field4537[0] + class752.field10424);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!((float) class433.field6155 > var25) || !((float) class433.field6155 > var26)) {
                            if (class350.method2212(0, false, arg3)) {
                                if (class350.method2212(1, false, arg3)) {
                                    if (class350.method2212(2, false, arg3)) {
                                        if (class350.method2212(3, false, arg3)) {
                                            class487.field6897[class546.field7709++] = arg3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field4394;
        if (arg0 != -38) {
            field4400 = -12;
        }
        return super.field3731.method3633(arg0 ^ -106) ? 1 : 0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BLwq;)V")
    public static final void method1923(byte arg0, class176 arg1) {
        if (class433.field6163 == arg1.field2610) {
            class397.field5653[arg1.field2512] = true;
        }
        ++field4393;
        if (arg0 != -19) {
            method1923((byte) 56, (class176) null);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lmfa;)V")
    public class288(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
    public static final int method1924(byte arg0) {
        ++field4390;
        int var1 = -119 / ((arg0 - 81) / 43);
        return class463.field6612 == 1 ? class745.field10372 : class377.field5425;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(B)I")
    public final int method1925(byte arg0) {
        ++field4389;
        if (arg0 > -31) {
            field4398 = null;
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        ++field4396;
        super.field3733 = arg1;
        if (arg0 >= -114) {
            field4397 = -35;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "()V")
    public static final void method1926() {
        for (int var0 = class197.field2884; var0 < class456.field6545; ++var0) {
            for (int var1 = 0; var1 < class151.field2074; ++var1) {
                for (int var2 = 0; var2 < class12.field249; ++var2) {
                    class379 var3 = class378.field5427[var0][var1][var2];
                    if (var3 != null) {
                        class719 var4 = var3.field5439;
                        class719 var5 = var3.field5430;
                        if (var4 != null && var4.method244(-84)) {
                            class123.method906(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method244(-111)) {
                                class123.method906(var5, var0, var1, var2, 1, 1);
                                var5.method242(0, var4, class711.field10005, (byte) 0, 0, 0, false);
                                var5.method240(-1);
                            }
                            var4.method240(-1);
                        }
                        for (class393 var6 = var3.field5437; var6 != null; var6 = var6.field5574) {
                            class778 var8 = var6.field5578;
                            if (var8 != null && var8.method244(-124)) {
                                class123.method906(var8, var0, var1, var2, var8.field10727 - var8.field10733 + 1, var8.field10736 - var8.field10730 + 1);
                                var8.method240(-1);
                            }
                        }
                        class736 var7 = var3.field5446;
                        if (var7 != null && var7.method244(-101)) {
                            class737.method4125(var7, var0, var1, var2);
                            var7.method240(-1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(ILmfa;)V")
    public class288(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(II)V")
    public static final void method1927(int arg0, int arg1) {
        ++field4392;
        class651.field9175 = arg0;
        class387 var2 = class583.field8255;
        synchronized (class583.field8255) {
            class583.field8255.method2364(1);
            if (arg1 != 3) {
                field4397 = 97;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field4395;
        if (arg0 != 112) {
            method1926();
        }
        return 3;
    }
}
