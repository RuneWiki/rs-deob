import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class593 extends class474 {

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8331;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
    public static void method3395(int arg0) {
        if (arg0 != 0) {
            field8331 = null;
        }
        field8331 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLha;ILbg;)V")
    public static final void method3396(byte arg0, class544 arg1, int arg2, class328 arg3) {
        ++field8334;
        if (class603.field8538 != null && ~arg3.field4828 <= ~arg2) {
            for (int var4 = 0; ~class603.field8538.length < ~var4; ++var4) {
                if (class603.field8538[var4] != -1000000 && (~arg3.field4832[0] >= ~class603.field8538[var4] || ~arg3.field4832[1] >= ~class603.field8538[var4] || arg3.field4832[2] <= class603.field8538[var4] || arg3.field4832[3] <= class603.field8538[var4]) && (class541.field7718[var4] >= arg3.field4839[0] || ~arg3.field4839[1] >= ~class541.field7718[var4] || ~arg3.field4839[2] >= ~class541.field7718[var4] || ~arg3.field4839[3] >= ~class541.field7718[var4]) && (class705.field9954[var4] <= arg3.field4839[0] || class705.field9954[var4] <= arg3.field4839[1] || ~arg3.field4839[2] <= ~class705.field9954[var4] || ~arg3.field4839[3] <= ~class705.field9954[var4]) && (class110.field1723[var4] >= arg3.field4835[0] || class110.field1723[var4] >= arg3.field4835[1] || ~arg3.field4835[2] >= ~class110.field1723[var4] || class110.field1723[var4] >= arg3.field4835[3]) && (~class670.field9491[var4] >= ~arg3.field4835[0] || arg3.field4835[1] >= class670.field9491[var4] || class670.field9491[var4] <= arg3.field4835[2] || ~class670.field9491[var4] >= ~arg3.field4835[3])) {
                    return;
                }
            }
        }
        if (~arg3.field4850 == -2) {
            int var5 = -class336.field4923 + class155.field2405 + arg3.field4833;
            if (var5 >= 0 && var5 <= class155.field2405 + class155.field2405) {
                int var6 = class155.field2405 + arg3.field4846 + -class63.field996;
                if (~var6 <= -1) {
                    if (~(class155.field2405 - -class155.field2405) > ~var6) {
                        return;
                    }
                } else {
                    var6 = 0;
                }
                int var7 = -class63.field996 + class155.field2405 + arg3.field4847;
                if (~(class155.field2405 - -class155.field2405) > ~var7) {
                    var7 = class155.field2405 + class155.field2405;
                } else if (~var7 > -1) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class52.field838[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (-arg3.field4839[0] + class551.field7856);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class40.field713)) {
                        if (class753.method4196(arg3, 0, 116)) {
                            if (class753.method4196(arg3, 1, -124)) {
                                if (class753.method4196(arg3, 2, -101)) {
                                    if (class753.method4196(arg3, 3, 119)) {
                                        class573.field8132[class644.field9188++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (~arg3.field4850 == -3) {
            int var10 = arg3.field4846 - (-class155.field2405 + class63.field996);
            if (var10 >= 0 && ~(class155.field2405 - -class155.field2405) <= ~var10) {
                int var11 = class155.field2405 + arg3.field4833 + -class336.field4923;
                if (var11 >= 0) {
                    if (class155.field2405 + class155.field2405 < var11) {
                        return;
                    }
                } else {
                    var11 = 0;
                }
                int var12 = -class336.field4923 + arg3.field4849 + class155.field2405;
                if (~var12 >= ~(class155.field2405 + class155.field2405)) {
                    if (~var12 > -1) {
                        return;
                    }
                } else {
                    var12 = class155.field2405 - -class155.field2405;
                }
                boolean var13 = false;
                while (~var11 >= ~var12) {
                    if (class52.field838[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (-arg3.field4835[0] + class703.field9940);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class40.field713 > var14)) {
                        if (class753.method4196(arg3, 0, 87)) {
                            if (class753.method4196(arg3, 1, -112)) {
                                if (class753.method4196(arg3, 2, 116)) {
                                    if (class753.method4196(arg3, 3, -114)) {
                                        class573.field8132[class644.field9188++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (~arg3.field4850 != -17 && ~arg3.field4850 != -9) {
            if (arg0 > -24) {
                field8331 = null;
            }
            if (arg3.field4850 == 4) {
                float var15 = (float) (arg3.field4832[0] + -class364.field5572);
                if (!((float) class377.field5676 >= var15)) {
                    int var16 = -class63.field996 + class155.field2405 + arg3.field4846;
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (~(class155.field2405 + class155.field2405) > ~var16) {
                        return;
                    }
                    int var17 = -class63.field996 + arg3.field4847 + class155.field2405;
                    if (~(class155.field2405 + class155.field2405) > ~var17) {
                        var17 = class155.field2405 - -class155.field2405;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = arg3.field4833 - class336.field4923 + class155.field2405;
                    if (~var18 <= -1) {
                        if (class155.field2405 + class155.field2405 < var18) {
                            return;
                        }
                    } else {
                        var18 = 0;
                    }
                    int var19 = class155.field2405 + arg3.field4849 + -class336.field4923;
                    if (var19 > class155.field2405 + class155.field2405) {
                        var19 = class155.field2405 + class155.field2405;
                    } else if (~var19 > -1) {
                        return;
                    }
                    boolean var20 = false;
                    label296: for (int var21 = var18; var19 >= var21; ++var21) {
                        for (int var22 = var16; var17 >= var22; ++var22) {
                            if (class52.field838[var21][var22]) {
                                var20 = true;
                                break label296;
                            }
                        }
                    }
                    if (var20) {
                        if (class753.method4196(arg3, 0, -118)) {
                            if (class753.method4196(arg3, 1, 90)) {
                                if (class753.method4196(arg3, 2, 83)) {
                                    if (class753.method4196(arg3, 3, -109)) {
                                        class573.field8132[class644.field9188++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int var23 = -class336.field4923 + class155.field2405 + arg3.field4833;
            if (~var23 <= -1 && ~(class155.field2405 + class155.field2405) <= ~var23) {
                int var24 = class155.field2405 + arg3.field4846 + -class63.field996;
                if (~var24 <= -1 && class155.field2405 - -class155.field2405 >= var24) {
                    if (class52.field838[var23][var24]) {
                        float var25 = (float) (-arg3.field4839[0] + class551.field7856);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class703.field9940 - arg3.field4835[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!(var25 < (float) class40.field713) || !((float) class40.field713 > var26)) {
                            if (class753.method4196(arg3, 0, 112)) {
                                if (class753.method4196(arg3, 1, -102)) {
                                    if (class753.method4196(arg3, 2, -115)) {
                                        if (class753.method4196(arg3, 3, 51)) {
                                            class573.field8132[class644.field9188++] = arg3;
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

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3397(int arg0, String arg1) {
        ++field8333;
        if (!arg1.equals("")) {
            ++class683.field9659;
            if (arg0 == -15583) {
                class540 var2 = class257.method1732(true, class582.field8232, class655.field9332);
                var2.field7707.method1926(class16.method101(-55, arg1), 65280);
                var2.field7707.method1931(arg0 + 15710, arg1);
                class756.method4211(var2, arg0 ^ -15536);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != -256) {
            return null;
        } else {
            ++field8332;
            int[][] var3 = super.field3545.method2996((byte) 123, arg0);
            if (super.field3545.field7147 && this.method2882((byte) -117)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field6882 * super.field6882;
                for (int var8 = 0; var8 < class626.field8787; ++var8) {
                    int var9 = super.field6872[var8 % super.field6880 + var7];
                    var6[var8] = class636.method3603(var9 << 4, 4080);
                    var5[var8] = class636.method3603(var9, 65280) >> 4;
                    var4[var8] = class636.method3603(var9, 16711680) >> 12;
                }
            }
            return var3;
        }
    }
}
