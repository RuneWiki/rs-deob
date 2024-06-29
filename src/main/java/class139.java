import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class139 extends class362 {

    @OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
    private int field2363;

    @OriginalMember(owner = "client!qea", name = "A", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!qea", name = "B", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!qea", name = "C", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!qea", name = "D", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!qea", name = "E", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!qea", name = "F", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!qea", name = "G", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!qea", name = "I", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "Lod;")
    public static class534 field2364;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(II)V")
    private final void method1138(int arg0, int arg1) {
        this.field2363 = (arg1 & 16711680) >> 12;
        this.field2372 = arg1 >> 4 & 4080;
        if (arg0 > -117) {
            this.field2372 = 14;
        }
        ++field2371;
        this.field2365 = arg1 << 4 & 4080;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V")
    public static void method1139(boolean arg0) {
        field2364 = null;
        if (arg0) {
            field2364 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([IB[I[ILwda;)V")
    public static final void method1140(int[] arg0, byte arg1, int[] arg2, int[] arg3, class666 arg4) {
        for (int var5 = 0; ~var5 > ~arg3.length; ++var5) {
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            int var9 = arg0[var5];
            for (int var10 = 0; ~var8 != -1 && ~var10 > ~arg4.field5221.length; ++var10) {
                if (~(var8 & 1) != -1) {
                    if (var7 != -1) {
                        class200 var11 = class108.field1696.method1279((byte) 92, var7);
                        int var12 = var11.field3031;
                        class82 var13 = arg4.field5221[var10];
                        if (var13 != null) {
                            if (~var13.field1133 == ~var7) {
                                if (var12 != 0) {
                                    if (var12 == 1) {
                                        var13.field1138 = 0;
                                        var13.field1131 = 0;
                                        var13.field1136 = var9;
                                        var13.field1139 = 1;
                                        var13.field1134 = 0;
                                        if (!arg4.field5229) {
                                            class189.method1394(arg4, 256, var11, 0);
                                        }
                                    } else if (~var12 == -3) {
                                        var13.field1138 = 0;
                                    }
                                } else {
                                    var13 = arg4.field5221[var10] = null;
                                }
                            } else if (~var11.field3038 <= ~class108.field1696.method1279((byte) 92, var13.field1133).field3038) {
                                var13 = arg4.field5221[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class82 var14 = arg4.field5221[var10] = new class82();
                            var14.field1136 = var9;
                            var14.field1138 = 0;
                            var14.field1133 = var7;
                            var14.field1134 = 0;
                            var14.field1131 = 0;
                            var14.field1139 = 1;
                            if (!arg4.field5229) {
                                class189.method1394(arg4, 256, var11, 0);
                            }
                        }
                    } else {
                        arg4.field5221[var10] = null;
                    }
                }
                var8 >>>= 1;
            }
        }
        int var6 = -107 % ((-72 - arg1) / 52);
        ++field2370;
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)V")
    public static final void method1141(int arg0) {
        ++field2366;
        if (class256.field3596 != null) {
            class695.field9619 = new class602();
            class695.field9619.method3410(class256.field3596.field4543.method3566((byte) 122, class464.field6309), class256.field3596, -128, class537.field7296, class256.field3596.field4534);
            class146.field2463 = new Thread(class695.field9619, "");
            class146.field2463.start();
            if (arg0 != 12) {
                method1141(67);
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(II)V")
    public static final void method1142(int arg0, int arg1) {
        ++field2368;
        if (~class753.field10398 != ~arg1) {
            if (arg1 == 13) {
                if (class245.field3476 != null) {
                    class457.method2632(class459.field6232, false);
                } else {
                    class784.method4282(class550.field7473, class459.field6232, 19046, class184.field2862);
                }
            }
            if (arg1 != 13 && class373.field5061 != null) {
                class373.field5061.method917(118);
                class373.field5061 = null;
            }
            if (~arg1 == -4) {
                class22.method148(~class434.field5913 != ~class359.field4911, 1572442825);
            }
            if (arg1 == 7) {
                class484.method2766(class359.field4911 != class33.field559, arg0 + -91);
            }
            if (arg1 != 5) {
                if (arg1 != 6) {
                    if (~arg1 == -10) {
                        if (class245.field3476 != null) {
                            class457.method2632(class459.field6232, false);
                        } else {
                            class784.method4282(class550.field7473, class459.field6232, 19046, class184.field2862);
                        }
                    } else if (arg1 == 12) {
                        if (class245.field3476 == null) {
                            class582.method3343((byte) 124, class184.field2862, class550.field7473);
                        } else {
                            class402.method2406(-1);
                        }
                    }
                } else if (class245.field3476 != null) {
                    class457.method2632(class459.field6232, false);
                } else {
                    class784.method4282(class550.field7473, class459.field6232, arg0 ^ 19044, class184.field2862);
                }
            } else if (class245.field3476 != null) {
                class402.method2406(-1);
            } else {
                class582.method3343((byte) 124, class184.field2862, class550.field7473);
            }
            if (class287.method1837(class753.field10398, (byte) 108)) {
                class527.field7156.field9185 = 2;
                class249.field3517.field9185 = 2;
                class649.field8977.field9185 = 2;
                class735.field10152.field9185 = 2;
                class153.field2523.field9185 = 2;
                class783.field10760.field9185 = 2;
                class713.field9816.field9185 = 2;
            }
            if (class287.method1837(arg1, (byte) 123)) {
                class156.field2545 = 0;
                class488.field6582 = 1;
                class483.field6519 = 1;
                class563.field7983 = 0;
                class56.field799 = 0;
                class656.method3689(true, arg0 ^ -203);
                class527.field7156.field9185 = 1;
                class249.field3517.field9185 = 1;
                class649.field8977.field9185 = 1;
                class735.field10152.field9185 = 1;
                class153.field2523.field9185 = 1;
                class783.field10760.field9185 = 1;
                class713.field9816.field9185 = 1;
            }
            if (arg1 == 11 || ~arg1 == -4) {
                class257.method1681((byte) -126);
            }
            boolean var2 = ~arg1 == -3 || class618.method3488(arg1, 4) || class263.method1720(arg1, 0);
            boolean var3 = class753.field10398 == arg0 || class618.method3488(class753.field10398, 4) || class263.method1720(class753.field10398, 0);
            if (!var2 != !var3) {
                if (var2) {
                    class520.field7058 = class483.field6535;
                    if (class111.field1911.field6761.method925((byte) 55) != 0) {
                        class325.method2065(class483.field6535, class357.field4898, arg0 ^ 3, 0, class111.field1911.field6761.method925((byte) 70), 2, false);
                        class279.method1787(true);
                    } else {
                        class228.method1554(2, 2);
                    }
                    class336.field4527.method15(arg0 + -59, false);
                } else {
                    class228.method1554(2, 2);
                    class336.field4527.method15(-72, true);
                }
            }
            if (class287.method1837(arg1, (byte) 59) || arg1 == 13) {
                class95.field1472.method548();
            }
            class753.field10398 = arg1;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field2369;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 < 57) {
            method1141(-48);
        }
        if (super.field4938.field7848) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class769.field10597; ++var7) {
                var4[var7] = this.field2363;
                var5[var7] = this.field2372;
                var6[var7] = this.field2365;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(I)V")
    private class139(int arg0) {
        super(0, false);
        this.method1138(-120, arg0);
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "()V")
    public class139() {
        this(0);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.method1138(-120, arg0.method767((byte) -120));
        }
        ++field2367;
        if (arg2 != -1) {
            this.field2372 = 64;
        }
    }
}
