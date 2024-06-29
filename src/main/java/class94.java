import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class94 extends class694 {

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field1237 = 0;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    private int field1236 = 4096;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Luc;")
    public static class27 field1235 = new class27(45, 3);

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Lkf;")
    public static class229 field1240 = new class229(1);

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = -23 % ((arg2 - 58) / 63);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1236 = arg1.method743((byte) -128);
            }
        } else {
            this.field1237 = arg1.method743((byte) -66);
        }
        ++field1238;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILql;)V")
    public static final void method687(int arg0, class674 arg1) {
        ++field1232;
        int var2 = arg0;
        arg1.method3733((byte) -111);
        for (int var3 = 0; class64.field851 > var3; ++var3) {
            int var15 = class53.field759[var3];
            if (~(class460.field6510[var15] & 1) == -1) {
                if (var2 > 0) {
                    class460.field6510[var15] = (byte) class266.method1624(class460.field6510[var15], 2);
                    --var2;
                } else {
                    int var16 = arg1.method3726(1, 8);
                    if (~var16 == -1) {
                        var2 = class653.method3631(arg0 + 11, arg1);
                        class460.field6510[var15] = (byte) class266.method1624(class460.field6510[var15], 2);
                    } else {
                        class420.method2396(true, arg1, var15);
                    }
                }
            }
        }
        arg1.method3730(arg0 + -29878);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method3733((byte) -85);
            for (int var4 = 0; var4 < class64.field851; ++var4) {
                int var13 = class53.field759[var4];
                if (~(1 & class460.field6510[var13]) != -1) {
                    if (var2 > 0) {
                        class460.field6510[var13] = (byte) class266.method1624(class460.field6510[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg1.method3726(1, arg0 ^ 8);
                        if (~var14 == -1) {
                            var2 = class653.method3631(11, arg1);
                            class460.field6510[var13] = (byte) class266.method1624(class460.field6510[var13], 2);
                        } else {
                            class420.method2396(true, arg1, var13);
                        }
                    }
                }
            }
            arg1.method3730(arg0 ^ -29878);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method3733((byte) -98);
                for (int var5 = 0; ~class583.field8123 < ~var5; ++var5) {
                    int var11 = class319.field4729[var5];
                    if (~(1 & class460.field6510[var11]) != -1) {
                        if (var2 > 0) {
                            class460.field6510[var11] = (byte) class266.method1624(class460.field6510[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg1.method3726(1, 8);
                            if (var12 == 0) {
                                var2 = class653.method3631(arg0 + 11, arg1);
                                class460.field6510[var11] = (byte) class266.method1624(class460.field6510[var11], 2);
                            } else if (class134.method956(arg1, var11, (byte) -76)) {
                                class460.field6510[var11] = (byte) class266.method1624(class460.field6510[var11], 2);
                            }
                        }
                    }
                }
                arg1.method3730(-29878);
                if (~var2 != -1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg1.method3733((byte) -92);
                    for (int var6 = 0; ~var6 > ~class583.field8123; ++var6) {
                        int var9 = class319.field4729[var6];
                        if (~(class460.field6510[var9] & 1) == -1) {
                            if (~var2 < -1) {
                                --var2;
                                class460.field6510[var9] = (byte) class266.method1624(class460.field6510[var9], 2);
                            } else {
                                int var10 = arg1.method3726(1, 8);
                                if (var10 == 0) {
                                    var2 = class653.method3631(11, arg1);
                                    class460.field6510[var9] = (byte) class266.method1624(class460.field6510[var9], 2);
                                } else if (class134.method956(arg1, var9, (byte) -76)) {
                                    class460.field6510[var9] = (byte) class266.method1624(class460.field6510[var9], 2);
                                }
                            }
                        }
                    }
                    arg1.method3730(-29878);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class583.field8123 = 0;
                        class64.field851 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class460.field6510[var7] = (byte) (class460.field6510[var7] >> 1);
                            class286 var8 = class495.field6821[var7];
                            if (var8 == null) {
                                class319.field4729[class583.field8123++] = var7;
                            } else {
                                class53.field759[class64.field851++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class94() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field1239;
        if (arg0 < 112) {
            this.field1237 = 64;
        }
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int[] var4 = this.method3809(0, arg1, (byte) 35);
            for (int var5 = 0; class465.field6544 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field1237 >= ~var6 && var6 <= this.field1236 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public static void method688(boolean arg0) {
        if (!arg0) {
            method687(22, (class674) null);
        }
        field1235 = null;
        field1240 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static final void method689(byte arg0) {
        ++field1234;
        class207.field3062.method1049((byte) 80);
        class602.field8358.method1164(-8249);
        class472.field6593.method3326((byte) -84);
        class164.field2499.method2019(111);
        class648.field9185.method1496(5);
        class648.field9184.method3061(true);
        class301.field4465.method2760(-1);
        class569.field7652.method2127(-3985);
        class311.field4616.method1188((byte) -111);
        class540.field7344.method3649((byte) -114);
        class310.field4615.method3019((byte) -43);
        class367.field5250.method594(true);
        class536.field7294.method2870(108);
        class210.field3099.method606(22015);
        class324.field4784.method2168(-127);
        class169.field2547.method1948(28946);
        class305.field4492.method1905(-127);
        int var1 = -51 % ((44 - arg0) / 40);
        class546.field7390.method3045(-25009);
        class660.field9275.method1220(41);
        class146.field2170.method3760(82);
        class381.method2203(-100);
        class146.method1022(0);
        class686.method3775(118);
        class477.method2709(-123);
        class99.field1355.method1987(-31085);
        class99.field1351.method1987(-31085);
        class472.field6600.method1987(-31085);
        class528.field7230.method1987(-31085);
        class523.field7118.method1987(-31085);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
    public static final void method690(int arg0, byte arg1) {
        ++field1233;
        if (~class340.field4947 != ~arg0) {
            if (arg0 == 13) {
                if (class690.field9699 != null) {
                    class406.method2316(arg1 ^ -11913, class208.field3075);
                } else {
                    class576.method3162(2, class208.field3075, class374.field5302, class592.field8248);
                }
            }
            if (arg0 != 13 && class162.field2486 != null) {
                class162.field2486.method3127(arg1 + -10);
                class162.field2486 = null;
            }
            if (arg1 != 125) {
                method688(false);
            }
            if (arg0 == 3) {
                class420.method2395(~class677.field9551 != ~class456.field6372, 31);
            }
            if (arg0 == 7) {
                class205.method1363(class677.field9551 != class21.field291, false);
            }
            if (arg0 != 5) {
                if (~arg0 != -7) {
                    if (~arg0 != -10) {
                        if (~arg0 == -13) {
                            if (class690.field9699 == null) {
                                class498.method2786(class592.field8248, arg1 + -7, class374.field5302);
                            } else {
                                class571.method3145(false);
                            }
                        }
                    } else if (class690.field9699 == null) {
                        class576.method3162(2, class208.field3075, class374.field5302, class592.field8248);
                    } else {
                        class406.method2316(-12022, class208.field3075);
                    }
                } else if (class690.field9699 == null) {
                    class576.method3162(arg1 + -123, class208.field3075, class374.field5302, class592.field8248);
                } else {
                    class406.method2316(-12022, class208.field3075);
                }
            } else if (class690.field9699 != null) {
                class571.method3145(false);
            } else {
                class498.method2786(class592.field8248, 106, class374.field5302);
            }
            if (class112.method839(class340.field4947, 85)) {
                class216.field3139.field1844 = 2;
                class18.field268.field1844 = 2;
                class678.field9561.field1844 = 2;
                class641.field9125.field1844 = 2;
                class389.field5462.field1844 = 2;
                class110.field1493.field1844 = 2;
                class466.field6558.field1844 = 2;
            }
            if (class112.method839(arg0, 16)) {
                class437.field6165 = 1;
                class539.field7317 = 1;
                class336.field4907 = 0;
                class388.field5452 = 0;
                class594.field8263 = 0;
                class212.method1390(64, true);
                class216.field3139.field1844 = 1;
                class18.field268.field1844 = 1;
                class678.field9561.field1844 = 1;
                class641.field9125.field1844 = 1;
                class389.field5462.field1844 = 1;
                class110.field1493.field1844 = 1;
                class466.field6558.field1844 = 1;
            }
            if (arg0 == 11 || ~arg0 == -4) {
                class1.method3(8);
            }
            boolean var2 = arg0 == 2 || class283.method1710(arg0, -6060) || class202.method1352(arg0, (byte) -67);
            boolean var3 = class340.field4947 == 2 || class283.method1710(class340.field4947, arg1 ^ -6103) || class202.method1352(class340.field4947, (byte) -112);
            if (!var3 != !var2) {
                if (!var2) {
                    class394.method2247(arg1 ^ -203789999, 2);
                    class232.field3302.method2806(true, (byte) -55);
                } else {
                    class623.field8670 = class318.field4720;
                    if (~class274.field3872.field877 != -1) {
                        class653.method3630(class74.field1027, class318.field4720, class274.field3872.field877, 0, false, 2, (byte) 92);
                    } else {
                        class394.method2247(-203790036, 2);
                    }
                    class232.field3302.method2806(false, (byte) -83);
                }
            }
            if (class112.method839(arg0, 112) || ~arg0 == -14) {
                class630.field8790.method358();
            }
            class340.field4947 = arg0;
        }
    }
}
