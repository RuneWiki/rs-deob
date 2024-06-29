import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class496 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Laq;")
    private class494 field6806 = new class494(64);

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Lgga;")
    private class513 field6805;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lpf;")
    public static class30 field6807 = new class30();

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(FIFIF)F")
    public static final float method2902(float arg0, int arg1, float arg2, int arg3, float arg4) {
        if (arg1 != -15996) {
            method2902(-1.2680582F, 35, -0.43230224F, 110, 0.40318757F);
        }
        field6802++;
        float[] var5 = class723.field10085[arg3];
        return var5[2] * arg4 + var5[1] * arg0 + var5[0] * arg2;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Lgi;")
    public final class641 method2903(int arg0, byte arg1) {
        field6808++;
        class494 var3 = this.field6806;
        class641 var4;
        synchronized (this.field6806) {
            if (arg1 < 72) {
                method2906(-88, null);
            }
            var4 = (class641) this.field6806.method2882((long) arg0, (byte) -78);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field6805;
        byte[] var6;
        synchronized (this.field6805) {
            var6 = this.field6805.method3019(5, arg0, 67);
        }
        class641 var7 = new class641();
        if (var6 != null) {
            var7.method3636(true, new class431(var6));
        }
        class494 var8 = this.field6806;
        synchronized (this.field6806) {
            this.field6806.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method2904(int arg0) {
        if (arg0 != 64) {
            field6807 = null;
        }
        field6807 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
    public static final void method2905(int arg0, int arg1) {
        field6809++;
        if (class582.field8375 == arg0) {
            class233.field3384.method2799(arg1, arg0 ^ 0xBE64A68C);
        } else {
            class406.field5591 = arg1;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILfm;)V")
    public static final void method2906(int arg0, class281 arg1) {
        if (arg1.field4040 != -1) {
            class98 var2 = class168.field2552.method3287(117, arg1.field4040);
            if (var2 == null || var2.field1402 == null) {
                arg1.field4040 = -1;
                arg1.field4109 = false;
            } else {
                label279: {
                    arg1.field4048++;
                    if (var2.field1402.length > arg1.field4122 && var2.field1388[arg1.field4122] < arg1.field4048) {
                        arg1.field4048 = 1;
                        arg1.field4110++;
                        arg1.field4122++;
                        if (!arg1.field4120) {
                            class324.method1958(var2, (byte) 42, arg1, arg1.field4122);
                        }
                    }
                    if (var2.field1402.length <= arg1.field4122) {
                        arg1.field4122 = 0;
                        arg1.field4048 = 0;
                        if (arg1.field4109) {
                            arg1.field4040 = arg1.method1783(true).method257(-17);
                            if (arg1.field4040 == -1) {
                                arg1.field4109 = false;
                                break label279;
                            }
                            var2 = class168.field2552.method3287(82, arg1.field4040);
                        }
                        if (!arg1.field4120) {
                            class324.method1958(var2, (byte) 42, arg1, arg1.field4122);
                        }
                    }
                    arg1.field4110 = arg1.field4122 + 1;
                    if (var2.field1402 == null) {
                        arg1.field4040 = -1;
                        arg1.field4109 = false;
                    } else if (var2.field1402.length <= arg1.field4110) {
                        arg1.field4110 = 0;
                    }
                }
            }
        }
        field6804++;
        for (int var3 = 0; var3 < arg1.field4043.length; var3++) {
            if (arg1.field4043[var3].field8710 != -1 && class594.field8494 >= arg1.field4043[var3].field8706) {
                class113 var10 = class620.field8760.method1832(-125, arg1.field4043[var3].field8710);
                int var11 = var10.field1628;
                if (var11 == -1) {
                    arg1.field4043[var3].field8710 = -1;
                } else {
                    class98 var12 = class168.field2552.method3287(103, var11);
                    if (var10.field1650) {
                        if (var12.field1412 == 3) {
                            if (arg1.field4140 > 0 && class594.field8494 >= arg1.field4099 && arg1.field4060 < class594.field8494) {
                                arg1.field4043[var3].field8710 = -1;
                                continue;
                            }
                        } else if (var12.field1412 == 1 && arg1.field4140 > 0 && class594.field8494 >= arg1.field4099 && arg1.field4060 < class594.field8494) {
                            arg1.field4043[var3].field8706 = class594.field8494 + 1;
                            continue;
                        }
                    }
                    if (var12 == null || var12.field1402 == null) {
                        arg1.field4043[var3].field8710 = -1;
                    } else {
                        if (arg1.field4043[var3].field8707 < 0) {
                            arg1.field4043[var3].field8707 = 0;
                            if (!arg1.field4120) {
                                class324.method1958(var12, (byte) 42, arg1, 0);
                            }
                        }
                        arg1.field4043[var3].field8709++;
                        if (arg1.field4043[var3].field8707 < var12.field1402.length && arg1.field4043[var3].field8709 > var12.field1388[arg1.field4043[var3].field8707]) {
                            arg1.field4043[var3].field8709 = 1;
                            arg1.field4043[var3].field8707++;
                            if (!arg1.field4120) {
                                class324.method1958(var12, (byte) 42, arg1, arg1.field4043[var3].field8707);
                            }
                        }
                        if (var12.field1402.length <= arg1.field4043[var3].field8707) {
                            if (var10.field1650) {
                                arg1.field4043[var3].field8707 -= var12.field1411;
                                arg1.field4043[var3].field8713++;
                                if (var12.field1393 <= arg1.field4043[var3].field8713) {
                                    arg1.field4043[var3].field8710 = -1;
                                } else if (arg1.field4043[var3].field8707 < 0 || arg1.field4043[var3].field8707 >= var12.field1402.length) {
                                    arg1.field4043[var3].field8710 = -1;
                                } else if (!arg1.field4120) {
                                    class324.method1958(var12, (byte) 42, arg1, arg1.field4043[var3].field8707);
                                }
                            } else {
                                arg1.field4043[var3].field8710 = -1;
                            }
                        }
                        arg1.field4043[var3].field8714 = arg1.field4043[var3].field8707 + 1;
                        if (arg1.field4043[var3].field8714 >= var12.field1402.length) {
                            if (var10.field1650) {
                                arg1.field4043[var3].field8714 -= var12.field1411;
                                if (arg1.field4043[var3].field8713 + 1 >= var12.field1393) {
                                    arg1.field4043[var3].field8714 = -1;
                                } else if (arg1.field4043[var3].field8714 < 0 || var12.field1402.length <= arg1.field4043[var3].field8714) {
                                    arg1.field4043[var3].field8714 = -1;
                                }
                            } else {
                                arg1.field4043[var3].field8714 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4064 != -1 && arg1.field4124 <= 1) {
            class98 var4 = class168.field2552.method3287(107, arg1.field4064);
            if (var4.field1412 == 3) {
                if (arg1.field4140 > 0 && class594.field8494 >= arg1.field4099 && class594.field8494 > arg1.field4060) {
                    arg1.field4088 = null;
                    arg1.field4064 = -1;
                }
            } else if (var4.field1412 == 1 && arg1.field4140 > 0 && class594.field8494 >= arg1.field4099 && arg1.field4060 < class594.field8494) {
                arg1.field4124 = 2;
            }
        }
        if (arg1.field4064 != -1 && arg1.field4124 == 0) {
            class98 var5 = class168.field2552.method3287(85, arg1.field4064);
            if (var5 == null || var5.field1402 == null) {
                arg1.field4088 = null;
                arg1.field4064 = -1;
            } else {
                arg1.field4132++;
                if (var5.field1402.length > arg1.field4114 && var5.field1388[arg1.field4114] < arg1.field4132) {
                    arg1.field4132 = 1;
                    arg1.field4114++;
                    if (!arg1.field4120) {
                        class324.method1958(var5, (byte) 42, arg1, arg1.field4114);
                    }
                }
                if (var5.field1402.length <= arg1.field4114) {
                    arg1.field4114 -= var5.field1411;
                    arg1.field4086++;
                    if (var5.field1393 <= arg1.field4086) {
                        arg1.field4088 = null;
                        arg1.field4064 = -1;
                    } else if (arg1.field4114 < 0 || var5.field1402.length <= arg1.field4114) {
                        arg1.field4064 = -1;
                        arg1.field4088 = null;
                    } else if (!arg1.field4120) {
                        class324.method1958(var5, (byte) 42, arg1, arg1.field4114);
                    }
                }
                arg1.field4080 = arg1.field4114 + 1;
                if (var5.field1402.length <= arg1.field4080) {
                    arg1.field4080 -= var5.field1411;
                    if (var5.field1393 <= (arg1.field4086 + 1)) {
                        arg1.field4080 = -1;
                    } else if (arg1.field4080 < 0 || var5.field1402.length <= arg1.field4080) {
                        arg1.field4080 = -1;
                    }
                }
            }
        }
        if (arg1.field4124 > 0) {
            arg1.field4124--;
        }
        int var6 = 111 / ((-arg0 - 19) / 63);
        for (int var7 = 0; var7 < arg1.field4077.length; var7++) {
            class596 var8 = arg1.field4077[var7];
            if (var8 != null) {
                if (var8.field8520 > 0) {
                    var8.field8520--;
                } else {
                    class98 var9 = class168.field2552.method3287(125, var8.field8518);
                    if (var9 == null || var9.field1402 == null) {
                        arg1.field4077[var7] = null;
                    } else {
                        var8.field8515++;
                        if (var8.field8513 < var9.field1402.length && var8.field8515 > var9.field1388[var8.field8513]) {
                            var8.field8513++;
                            var8.field8515 = 1;
                            if (!arg1.field4120) {
                                class324.method1958(var9, (byte) 42, arg1, var8.field8513);
                            }
                        }
                        if (var8.field8513 >= var9.field1402.length) {
                            var8.field8517++;
                            var8.field8513 -= var9.field1411;
                            if (var9.field1393 <= var8.field8517) {
                                arg1.field4077[var7] = null;
                            } else if (var8.field8513 < 0 || var9.field1402.length <= var8.field8513) {
                                arg1.field4077[var7] = null;
                            } else if (!arg1.field4120) {
                                class324.method1958(var9, (byte) 42, arg1, var8.field8513);
                            }
                        }
                        var8.field8521 = var8.field8513 + 1;
                        if (var8.field8521 >= var9.field1402.length) {
                            var8.field8521 -= var9.field1411;
                            if ((var8.field8517 + 1) >= var9.field1393) {
                                var8.field8521 = -1;
                            } else if (var8.field8521 < 0 || var9.field1402.length <= var8.field8521) {
                                var8.field8521 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class496(class41 arg0, int arg1, class513 arg2) {
        this.field6805 = arg2;
        this.field6805.method3007(-1, 5);
    }
}
