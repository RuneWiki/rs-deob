import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class716 extends class134 {

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    public int field10054;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "F")
    public static float field10051;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(DI)V", line = 5)
    public static final void method3995(double arg0, int arg1) {
        class541.field7790.method1028(class624.field8947);
        field10053++;
        if (arg1 != 22080) {
            method3998(-56, false, 99, (byte) 72);
        }
        class541.field7790.method1033(0, 0, (int) arg0);
        class574.field8144.method339(class541.field7790);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Llha;ILlha;)V", line = 21)
    public static final void method3996(class623 arg0, int arg1, class623 arg2) {
        if (arg0.field8927 != null) {
            arg0.method3562((byte) -48);
        }
        field10050++;
        arg0.field8927 = arg2;
        if (arg1 == -4874) {
            arg0.field8923 = arg2.field8923;
            arg0.field8927.field8923 = arg0;
            arg0.field8923.field8927 = arg0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V", line = 39)
    public class716() {
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 42)
    public static final void method3997(byte arg0) {
        for (int var1 = 0; var1 < class306.field3815; var1++) {
            class590 var3 = class313.field3888[var1];
            boolean var4 = false;
            if (var3.field8310 == null) {
                var3.field8313--;
                if (var3.field8313 < (var3.method3381(103) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field8324 == 1 && var3.field8317 == null) {
                        var3.field8317 = class273.method1619(class296.field3674, var3.field8326, 0);
                        if (var3.field8317 == null) {
                            continue;
                        }
                        var3.field8313 += var3.field8317.method1620();
                    } else if (var3.method3381(119) && (var3.field8322 == null || var3.field8323 == null)) {
                        if (var3.field8322 == null) {
                            var3.field8322 = class571.method3311(class88.field921, var3.field8326);
                        }
                        if (var3.field8322 == null) {
                            continue;
                        }
                        if (var3.field8323 == null) {
                            var3.field8323 = var3.field8322.method3321(new int[] { 22050 });
                            if (var3.field8323 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field8313 < 0) {
                        int var5 = 8192;
                        int var6;
                        if (var3.field8327 == 0) {
                            var6 = var3.field8315 * (var3.field8324 == 3 ? class654.field9334.field9860.method1500(104) : class654.field9334.field9828.method1500(94)) >> 2;
                        } else {
                            int var7 = (var3.field8327 & 0x3AA8059) >> 24;
                            if (class90.field937.field4628 == var7) {
                                int var8 = var3.field8327 & 0xFF << 9;
                                int var9 = class90.field937.method1128(-1) << 8;
                                int var10 = (var3.field8327 & 0xFFBC3D) >> 16;
                                int var11 = (var10 << 9) + var9 + 256 - class90.field937.field4635;
                                int var12 = var3.field8327 >> 8 & 0xFF;
                                int var13 = (var12 << 9) + var9 + 256 - class90.field937.field4629;
                                int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                if (var8 < var14) {
                                    var3.field8313 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var6 = (var8 - var14) * class654.field9334.field9861.method1500(-125) * var3.field8315 / var8 >> 2;
                                if (var3.field8325 != null && var3.field8325 instanceof class340) {
                                    class340 var15 = (class340) var3.field8325;
                                    short var16 = var15.field4387;
                                    short var17 = var15.field4395;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class152.field1670 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (8192 - var14) / 4096 + 8192;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var6 = 0;
                            }
                        }
                        if (var6 > 0) {
                            class548 var20 = null;
                            if (var3.field8324 == 1) {
                                var20 = var3.field8317.method1618().method3221(class638.field9168);
                            } else if (var3.method3381(-79)) {
                                var20 = var3.field8323;
                            }
                            class95 var21 = var3.field8310 = class95.method666(var20, var3.field8321, var6, var5);
                            var21.method656(var3.field8318 - 1);
                            class597.field8470.method1689(var21);
                        }
                    }
                }
            } else if (!var3.field8310.method863(122)) {
                var4 = true;
            }
            if (var4) {
                class306.field3815--;
                for (int var22 = var1; var22 < class306.field3815; var22++) {
                    class313.field3888[var22] = class313.field3888[var22 + 1];
                }
                var1--;
            }
        }
        if (arg0 > 0) {
            method3997((byte) 117);
        }
        field10049++;
        if (class533.field7714 && !class435.method2715(15194)) {
            if (class654.field9334.field9831.method1500(79) != 0 && class326.field4223 != -1) {
                if (class184.field2208 == null) {
                    class294.method1748(15251, class654.field9334.field9831.method1500(-127), false, class464.field6622, 0, class326.field4223);
                } else {
                    class245.method1485(128, class654.field9334.field9831.method1500(109), class184.field2208, 0, false, class464.field6622, class326.field4223);
                }
            }
            class533.field7714 = false;
            class184.field2208 = null;
        } else if (class654.field9334.field9831.method1500(92) != 0 && class326.field4223 != -1 && !class435.method2715(15194)) {
            class266.field3308++;
            class249 var2 = class289.method1715(class205.field2421, 106, class41.field470);
            var2.field3016.method1421(class326.field4223, -20798);
            class510.method3017(var2, 111);
            class326.field4223 = -1;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V", line = 260)
    public class716(int arg0) {
        this.field10054 = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZIB)V", line = 268)
    public static final void method3998(int arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 < 13) {
            method3997((byte) 50);
        }
        field10052++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class332.field4303 = arg2;
        class277.field3387 = arg0;
        class54.field556 = arg1;
    }
}
