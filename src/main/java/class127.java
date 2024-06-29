import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class127 extends class416 {

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "[I")
    public static int[] field2091 = new int[4];

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "Lro;")
    public static class2 field2095 = new class2();

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "D")
    public static double field2098;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "Lon;")
    public static class340 field2094;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "Ljava/lang/String;")
    public String field2090;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([SIB)[S")
    public static final short[] method1001(short[] arg0, int arg1, byte arg2) {
        if (arg2 != 103) {
            field2091 = null;
        }
        ++field2096;
        short[] var3 = new short[arg1];
        class335.method2022(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public final void method1002(int arg0) {
        super.field5747 = 500L + class375.method2193(116) | Long.MIN_VALUE & super.field5747;
        ++field2101;
        class597.field7800.method4050(this, -128);
        if (arg0 >= -38) {
            this.field2097 = 125;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
    public final int method1003(int arg0) {
        ++field2089;
        if (arg0 > -86) {
            this.method1010(-42);
        }
        return (int) (255L & super.field8680 >>> 32);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method1004(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class5.field125 = 0;
        class503.field6749 = 0;
        ++class418.field5771;
        if ((arg5 & 2) == 0) {
            for (class256 var8 = class496.field6694[var7]; var8 != null; var8 = var8.field3513) {
                if (!class506.method2847(var8, arg0, arg1, arg2, arg3)) {
                    class27.method252(var8);
                    if (var8.field3509 != -1) {
                        class195.field2932[class5.field125++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (class256 var9 = class8.field162[var7]; var9 != null; var9 = var9.field3513) {
                if (!class506.method2847(var9, arg0, arg1, arg2, arg3)) {
                    class27.method252(var9);
                    if (var9.field3509 != -1) {
                        class567.field7462[class503.field6749++] = var9;
                    }
                }
            }
            for (class256 var10 = class15.field214[var7]; var10 != null; var10 = var10.field3513) {
                if (!class506.method2847(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method801(false)) {
                        class27.method252(var10);
                        if (var10.field3509 != -1) {
                            class567.field7462[class503.field6749++] = var10;
                        }
                    } else {
                        class27.method252(var10);
                        if (var10.field3509 != -1) {
                            class195.field2932[class5.field125++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class197.field2980; ++var11) {
                    if (!class506.method2847(class43.field572[var11], arg0, arg1, arg2, arg3)) {
                        class27.method252(class43.field572[var11]);
                        if (class43.field572[var11].field3509 != -1) {
                            if (class43.field572[var11].method801(false)) {
                                class567.field7462[class503.field6749++] = class43.field572[var11];
                            } else {
                                class195.field2932[class5.field125++] = class43.field572[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class5.field125 > 0) {
            class373.method2187(class195.field2932, 0, class5.field125 - 1);
            for (int var12 = 0; var12 < class5.field125; ++var12) {
                class635.method3487(class195.field2932[var12], true, arg6);
            }
        }
        if (class88.field1068) {
            class184.field2781.method460(0, (class87[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class375.field5197; var13 < class225.field3201; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class672.field9269.length;
                    if (class672.field9269.length + class601.field7891 > class735.field10163) {
                        var14 -= class672.field9269.length + class601.field7891 - class735.field10163;
                    }
                    int var15 = class672.field9269[0].length;
                    if (class672.field9269[0].length + class675.field9363 > class143.field2290) {
                        var15 -= class672.field9269[0].length + class675.field9363 - class143.field2290;
                    }
                    boolean[][] var16 = class48.field604;
                    if (class430.field5926) {
                        if (class260.field3627) {
                            var16 = class204.field3053[var13];
                        }
                        for (int var17 = class704.field9770; var17 < var14; ++var17) {
                            int var18 = class601.field7891 + var17 - class704.field9770;
                            for (int var19 = class678.field9462; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class672.field9269[var17][var19]) {
                                    int var20 = class675.field9363 + var19 - class678.field9462;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class660.field8718[var21][var18][var20] != null && class660.field8718[var21][var18][var20].field9730 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class336.method2023((byte) -126, var13, var18, var20)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class260.field3627) {
                        if (arg4 >= 0) {
                            class507.field6771[var13].method1741(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class507.field6771[var13].method1749(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class361.field5091; ++var22) {
                            class289.field4110[var22].method993(-1, new class759(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class507.field6771[var13].method1741(class458.field6258, class610.field8134, class183.field2779, class48.field604, false, arg4, arg5);
                    } else {
                        class507.field6771[var13].method1749(class458.field6258, class610.field8134, class183.field2779, class48.field604, false, arg5);
                    }
                } else {
                    int var23 = class672.field9269.length;
                    if (class672.field9269.length + class601.field7891 > class735.field10163) {
                        var23 -= class672.field9269.length + class601.field7891 - class735.field10163;
                    }
                    int var24 = class672.field9269[0].length;
                    if (class672.field9269[0].length + class675.field9363 > class143.field2290) {
                        var24 -= class672.field9269[0].length + class675.field9363 - class143.field2290;
                    }
                    boolean[][] var25 = class48.field604;
                    if (class430.field5926) {
                        if (class260.field3627) {
                            var25 = class204.field3053[var13];
                        }
                        for (int var26 = class704.field9770; var26 < var23; ++var26) {
                            int var27 = class601.field7891 + var26 - class704.field9770;
                            for (int var28 = class678.field9462; var28 < var24; ++var28) {
                                if (class672.field9269[var26][var28] && !class336.method2023((byte) -120, var13, var27, class675.field9363 + var28 - class678.field9462)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class260.field3627) {
                        if (arg4 >= 0) {
                            class507.field6771[var13].method1741(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class507.field6771[var13].method1749(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class361.field5091; ++var29) {
                            class289.field4110[var29].method993(-1, new class759(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class507.field6771[var13].method1741(class458.field6258, class610.field8134, class183.field2779, class48.field604, true, arg4, arg5);
                    } else {
                        class507.field6771[var13].method1749(class458.field6258, class610.field8134, class183.field2779, class48.field604, true, arg5);
                    }
                }
            }
        }
        if (class503.field6749 > 0) {
            class270.method1626(class567.field7462, 0, class503.field6749 - 1);
            for (int var30 = 0; var30 < class503.field6749; ++var30) {
                class635.method3487(class567.field7462[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field2095 = null;
        field2094 = null;
        field2091 = null;
        if (arg0 != 71) {
            method1004(false, (byte[][][]) null, 15, (byte) 87, 76, 54, true);
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
    public static final void method1006(int arg0) {
        if (arg0 <= -45) {
            if (~class192.field2899.toLowerCase().indexOf("microsoft") == 0) {
                class536.field7065[59] = 57;
                if (class192.field2882 == null) {
                    class536.field7065[222] = 59;
                    class536.field7065[192] = 58;
                } else {
                    class536.field7065[192] = 28;
                    class536.field7065[520] = 59;
                    class536.field7065[222] = 58;
                }
                class536.field7065[92] = 74;
                class536.field7065[61] = 27;
                class536.field7065[45] = 26;
                class536.field7065[91] = 42;
                class536.field7065[47] = 73;
                class536.field7065[93] = 43;
                class536.field7065[44] = 71;
                class536.field7065[46] = 72;
            } else {
                class536.field7065[190] = 72;
                class536.field7065[187] = 27;
                class536.field7065[223] = 28;
                class536.field7065[221] = 43;
                class536.field7065[186] = 57;
                class536.field7065[191] = 73;
                class536.field7065[192] = 58;
                class536.field7065[189] = 26;
                class536.field7065[220] = 74;
                class536.field7065[188] = 71;
                class536.field7065[222] = 59;
                class536.field7065[219] = 42;
            }
            ++field2088;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Z")
    public static final boolean method1007(int arg0, byte arg1) {
        if (arg1 != 99) {
            field2095 = null;
        }
        ++field2100;
        return arg0 == 48 || arg0 == 25 || arg0 == 1003 || arg0 == 17 || arg0 == 30;
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(Z)J")
    public final long method1008(boolean arg0) {
        if (!arg0) {
            this.field2092 = -56;
        }
        ++field2087;
        return Long.MAX_VALUE & super.field5747;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
    public final int method1009(byte arg0) {
        ++field2102;
        if (arg0 != 81) {
            this.method1002(17);
        }
        return (int) super.field8680;
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
    public final void method1010(int arg0) {
        super.field5747 |= Long.MIN_VALUE;
        if (arg0 == 614) {
            ++field2093;
            if (this.method1008(true) == 0L) {
                class384.field5376.method4050(this, -126);
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
    public class127(int arg0, int arg1) {
        super.field8680 = (long) arg0 << 32 | (long) arg1;
    }
}
