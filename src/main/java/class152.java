import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class152 extends class223 {

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field2245 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field2248 = 0;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "Lnf;")
    public static class162 field2249 = new class162(16);

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field2251 = new String[100];

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "[Lel;")
    public static class213[] field2242;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIIIZILha;IBI)V")
    public static final void method1098(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class31 arg8, int arg9, byte arg10, int arg11) {
        ++field2246;
        if (arg3 >= 0 && arg3 < 104 && arg11 >= 0 && arg11 < 104) {
            if (!arg0 && !arg6) {
                client.field2390[arg4][arg3][arg11] = 0;
            }
            while (true) {
                int var12 = arg8.method265(-115);
                if (var12 == 0) {
                    if (arg0) {
                        class233.field3684[0][arg1 + arg3][arg5 + arg11] = class303.field4876[0][arg1 + arg3][arg11 - -arg5];
                    } else if (arg4 == 0) {
                        class233.field3684[0][arg1 + arg3][arg5 + arg11] = -class262.method1761(arg2 + 556238, arg9 + 932731, 35) * 8;
                    } else {
                        class233.field3684[arg4][arg1 + arg3][arg5 + arg11] = class233.field3684[arg4 - 1][arg1 + arg3][arg5 + arg11] + -240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg8.method265(-88);
                    if (!arg0) {
                        if (~var13 == -2) {
                            var13 = 0;
                        }
                        if (arg4 == 0) {
                            class233.field3684[0][arg1 + arg3][arg11 - -arg5] = -var13 * 8;
                        } else {
                            class233.field3684[arg4][arg1 + arg3][arg11 - -arg5] = class233.field3684[arg4 - 1][arg3 - -arg1][arg5 + arg11] + -(var13 * 8);
                        }
                    } else {
                        class233.field3684[0][arg1 + arg3][arg11 - -arg5] = class303.field4876[0][arg3 - -arg1][arg5 + arg11] - -(var13 * 8);
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg6) {
                        arg8.method265(-92);
                    } else {
                        class188.field2951[arg4][arg3][arg11] = arg8.method266(-129);
                        class195.field3063[arg4][arg3][arg11] = (byte) ((var12 + -2) / 4);
                        class292.field4526[arg4][arg3][arg11] = (byte) class118.method863(var12 + -2 + arg7, 3);
                    }
                } else if (var12 <= 81) {
                    if (!arg0 && !arg6) {
                        client.field2390[arg4][arg3][arg11] = (byte) (var12 - 49);
                    }
                } else if (!arg6) {
                    class82.field1242[arg4][arg3][arg11] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg8.method265(-125);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg8.method265(-102);
                    break;
                }
                if (~var14 >= -50) {
                    arg8.method265(-105);
                }
            }
        }
        if (arg10 < 76) {
            field2245 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)I")
    private final int method1099(int arg0, int arg1, int arg2) {
        int var4 = arg0 * 57 + arg1;
        if (arg2 != 262144) {
            return 92;
        } else {
            ++field2243;
            int var5 = var4 << 1 ^ var4;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 < 14) {
            return null;
        } else {
            ++field2244;
            int[] var3 = super.field3588.method1611(0, arg1);
            if (super.field3588.field3722) {
                int var4 = class307.field4925[arg1];
                for (int var5 = 0; ~var5 > ~class250.field4008; ++var5) {
                    var3[var5] = this.method1099(var4, class106.field1662[var5], 262144) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLel;IIILcc;I)V")
    public static final void method1100(boolean arg0, class213 arg1, int arg2, int arg3, int arg4, class222 arg5, int arg6) {
        ++field2239;
        if (arg1 != null) {
            int var7 = 2047 & (int) class50.field818 + class67.field1057;
            int var8 = arg3 * arg3 + arg6 * arg6;
            int var9 = Math.max(arg5.field3408 / 2, arg5.field3561 / 2) + 10;
            if (var8 <= var9 * var9) {
                if (!arg0) {
                    field2247 = 33;
                }
                int var10 = class224.field3597[var7];
                int var11 = var10 * 256 / (class285.field4487 - -256);
                int var12 = class224.field3601[var7];
                int var13 = var12 * 256 / (class285.field4487 + 256);
                int var14 = arg3 * var11 + arg6 * var13 >> 16;
                int var15 = arg6 * var11 - arg3 * var13 >> 16;
                ((class51) arg1).method432(arg5.field3408 / 2 + arg2 + var14 + -(arg1.field3272 / 2), arg5.field3561 / 2 + arg4 + -(arg1.field3267 / 2) + -var15, arg5.field3452, arg5.field3523);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
    public static void method1101(byte arg0) {
        field2249 = null;
        field2245 = null;
        if (arg0 != 11) {
            field2251 = null;
        }
        field2242 = null;
        field2251 = null;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V")
    public static final void method1102(byte arg0) {
        ++field2240;
        int var1 = -47 % ((arg0 - 64) / 50);
        if (~class23.field382 == -31) {
            class248.method1679(25, 2);
        }
    }
}
