import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class531 extends class695 {

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
    private boolean field6900 = false;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
    public static final void method2823(int arg0) {
        for (int var1 = 0; ~var1 > ~class202.field2639; ++var1) {
            class64 var3 = class47.field666[var1];
            boolean var4 = false;
            if (var3.field881 != null) {
                if (!var3.field881.method2440(14)) {
                    var4 = true;
                }
            } else {
                --var3.field875;
                if (~var3.field875 > ~(!var3.method537((byte) 112) ? -10 : -1500)) {
                    var4 = true;
                } else {
                    if (var3.field870 == 1 && var3.field871 == null) {
                        var3.field871 = class664.method3633(class63.field864, var3.field872, 0);
                        if (var3.field871 == null) {
                            continue;
                        }
                        var3.field875 += var3.field871.method3634();
                    } else if (var3.method537((byte) -107) && (var3.field876 == null || var3.field879 == null)) {
                        if (var3.field876 == null) {
                            var3.field876 = class73.method589(class680.field9375, var3.field872);
                        }
                        if (var3.field876 == null) {
                            continue;
                        }
                        if (var3.field879 == null) {
                            var3.field879 = var3.field876.method581(new int[] { 22050 });
                            if (var3.field879 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field875 < 0) {
                        int var5;
                        if (var3.field880 == 0) {
                            var5 = var3.field866 * (~var3.field870 == -4 ? class260.field3509.field1280 : class260.field3509.field1289) >> 8;
                        } else {
                            int var6 = var3.field880 >> 24 & 3;
                            if (~class233.field3130.field508 != ~var6) {
                                var5 = 0;
                            } else {
                                int var7 = (var3.field880 & 255) << 9;
                                int var8 = (16741273 & var3.field880) >> 16;
                                int var9 = (var8 << 9) + 256 + -class233.field3130.field506;
                                if (~var9 > -1) {
                                    var9 = -var9;
                                }
                                int var10 = (var3.field880 & 65280) >> 8;
                                int var11 = (var10 << 9) + -class233.field3130.field503 + 256;
                                if (~var11 > -1) {
                                    var11 = -var11;
                                }
                                int var12 = var9 + -512 + var11;
                                if (var7 < var12) {
                                    var3.field875 = -99999;
                                    continue;
                                }
                                if (~var12 > -1) {
                                    var12 = 0;
                                }
                                var5 = (var7 - var12) * class260.field3509.field1285 * var3.field866 / var7 >> 8;
                            }
                        }
                        if (~var5 < -1) {
                            class430 var13 = null;
                            if (var3.field870 != 1) {
                                if (var3.method537((byte) 92)) {
                                    var13 = var3.field879;
                                }
                            } else {
                                var13 = var3.field871.method3635().method2469(class648.field9026);
                            }
                            class137 var14 = var3.field881 = class137.method994(var13, 100, var5);
                            var14.method1012(var3.field869 + -1);
                            class690.field9426.method2240(var14);
                        }
                    }
                }
            }
            if (var4) {
                --class202.field2639;
                for (int var15 = var1; class202.field2639 > var15; ++var15) {
                    class47.field666[var15] = class47.field666[var15 + 1];
                }
                --var1;
            }
        }
        ++field6901;
        if (arg0 != -21938) {
            method2823(41);
        }
        if (class60.field823 && !class193.method1268((byte) 88)) {
            if (~class260.field3509.field1276 != -1 && class166.field2085 != -1) {
                class597.method3247(class260.field3509.field1276, 8364, class6.field53, false, 0, class166.field2085);
            }
            class60.field823 = false;
        } else if (class260.field3509.field1276 != 0 && class166.field2085 != -1 && !class193.method1268((byte) 127)) {
            ++class144.field1883;
            class11 var2 = class130.method931(class649.field9035, (byte) 54, class569.field7427);
            var2.field114.method2353(class166.field2085, (byte) -93);
            class100.method760(var2, 107);
            class166.field2085 = -1;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
    public final void method495(int arg0, boolean arg1) {
        ++field6902;
        if (arg0 == 1) {
            super.field9493.method3105(class510.field6687, true, class219.field2875);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)Z")
    public final boolean method494(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field6905;
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V")
    public final void method498(boolean arg0, byte arg1) {
        ++field6903;
        class342 var3 = super.field9493.method3073(-5);
        if (var3 != null && arg0) {
            super.field9493.method3088((byte) 91, 1);
            super.field9493.method3091(true, var3);
            super.field9493.method183((byte) 95, class522.field6809);
            super.field9493.method3088((byte) 91, 1);
            super.field9493.method3105(class510.field6687, true, class456.field5976);
            super.field9493.method206(false, class243.field3260, true, 2, 23798);
            super.field9493.method3143(4, class697.field9582, 0);
            class131 var4 = super.field9493.method3125((byte) -79);
            var4.method936(super.field9493.method3092(-27998), 0);
            super.field9493.method3140(30604, class234.field3135);
            super.field9493.method3088((byte) 91, 0);
            this.field6900 = true;
        } else {
            super.field9493.method3143(4, class697.field9582, 0);
        }
        if (arg1 > -82) {
            this.method498(true, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lfc;)V")
    public class531(class575 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnm;ZI)V")
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        super.field9493.method3091(true, arg0);
        if (!arg1) {
            ++field6909;
            super.field9493.method3072((byte) -57, arg2);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    public final void method491(int arg0) {
        if (arg0 < 38) {
            field6906 = 54;
        }
        if (this.field6900) {
            super.field9493.method3088((byte) 91, 1);
            super.field9493.method183((byte) 19, class141.field1863);
            super.field9493.method3105(class219.field2875, true, class219.field2875);
            super.field9493.method3115(2, 0, class425.field5511);
            super.field9493.method3143(4, class61.field833, 0);
            super.field9493.method3114(15);
            super.field9493.method3091(true, (class391) null);
            super.field9493.method3088((byte) 91, 0);
            this.field6900 = false;
        } else {
            super.field9493.method3143(4, class61.field833, 0);
        }
        ++field6908;
        super.field9493.method3105(class219.field2875, true, class219.field2875);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
    public final void method489(int arg0, int arg1, int arg2) {
        if (arg2 < 69) {
            this.method489(126, 87, -38);
        }
        ++field6907;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII[BB)Z")
    public static final boolean method2824(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte arg6) {
        ++field6910;
        int var7 = arg1 % arg4;
        int var8;
        if (~var7 == -1) {
            var8 = 0;
        } else {
            var8 = -var7 + arg4;
        }
        int var9 = -((arg4 - 1 + arg3) / arg4);
        if (arg6 <= 5) {
            return false;
        } else {
            int var10 = -((arg1 + arg4 + -1) / arg4);
            for (int var11 = var9; ~var11 > -1; ++var11) {
                for (int var12 = var10; var12 < 0; ++var12) {
                    if (~arg5[arg0] == -1) {
                        return true;
                    }
                    arg0 += arg4;
                }
                int var13 = arg0 - var8;
                if (arg5[var13 + -1] == 0) {
                    return true;
                }
                arg0 = arg2 + var13;
            }
            return false;
        }
    }
}
