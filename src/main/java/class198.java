import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class198 extends class76 {

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field3199 = 0;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3193 = "glow2:";

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "Lii;")
    public class263 field3202;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "[B")
    public byte[] field3198;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1455(String arg0, int arg1, String arg2, int arg3, String arg4) {
        if (arg1 == 128) {
            class245.method1756(-1635, arg4, -1, arg2, arg3, arg0);
            ++field3192;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)[B")
    public final byte[] method462(int arg0) {
        ++field3197;
        if (arg0 != 1) {
            return null;
        } else if (super.field1090) {
            throw new RuntimeException();
        } else {
            return this.field3198;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)V")
    public static final void method1456(boolean arg0) {
        ++field3191;
        if (!arg0) {
            field3196 = -92;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)I")
    public final int method461(byte arg0) {
        ++field3200;
        if (super.field1090) {
            return 0;
        } else {
            if (arg0 < 51) {
                field3196 = -94;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
    public static void method1457(byte arg0) {
        field3193 = null;
        if (arg0 != 18) {
            field3193 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZILpi;IIILpc;ZIIII)Lpc;")
    public static final class22 method1458(int arg0, int arg1, boolean arg2, int arg3, class141 arg4, int arg5, int arg6, int arg7, class22 arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field3195;
        long var14 = ((long) arg6 << 48) + ((long) ((arg12 << 16) + arg3 - -(arg0 << 24)) - -((long) arg10 << 32));
        class22 var16 = (class22) class78.field1133.method1553(var14, (byte) -104);
        if (var16 == null) {
            byte var17 = 3;
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19;
            if (arg3 != 1) {
                if (arg3 != 2) {
                    if (~arg3 == -4) {
                        var19 = 15;
                    } else if (arg3 == 4) {
                        var19 = 18;
                    } else {
                        var19 = 21;
                    }
                } else {
                    var19 = 12;
                }
            } else {
                var19 = 9;
            }
            int[][] var20 = new int[var17][var19];
            class173 var21 = new class173(var17 * var19 + 1, var17 * var19 * 2 + -var19, 0);
            int var22 = var21.method1296(0, 0, 0);
            for (int var23 = 0; ~var17 < ~var23; ++var23) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var19 > var32; ++var32) {
                    int var33 = (var32 << 11) / var19;
                    int var34 = class47.field695[var33] * var31 + arg7 >> 16;
                    int var35 = class47.field679[var33] * var30 + arg5 >> 16;
                    var20[var23][var32] = var21.method1296(var35, 0, var34);
                }
            }
            for (int var24 = 0; ~var17 < ~var24; ++var24) {
                int var25 = (var24 * 256 + 128) / var17;
                int var26 = -var25 + 256;
                byte var27 = (byte) (arg0 * var25 + arg12 * var26 >> 8);
                short var28 = (short) ((16515072 & (arg6 & 64512) * var25 + (64512 & arg10) * var26) + ((arg6 & 127) * var25 + (arg10 & 127) * var26 & 32512) + (229376 & (896 & arg6) * var25 + (896 & arg10) * var26) >> 8);
                for (int var29 = 0; ~var29 > ~var19; ++var29) {
                    if (~var24 != -1) {
                        var21.method1280(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var19], var20[var24][(var29 + 1) % var19], (byte) 1, var28, var27);
                        var21.method1280(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var19], var20[var24][var29], (byte) 1, var28, var27);
                    } else {
                        var21.method1280(var22, var20[0][(var29 + 1) % var19], var20[0][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var21.method1293(64, 768, -50, -10, -50);
            class78.field1133.method1551(var16, 0, var14);
        }
        if (arg9) {
            return null;
        } else {
            int var36 = arg3 * 64 + -1;
            int var37 = -var36;
            int var38 = var36;
            int var39 = -var36;
            int var40 = var36;
            int var41 = arg8.method146();
            if (arg2) {
                if (~arg13 < -641 && arg13 < 1408) {
                    var40 = var36 + 128;
                }
                if (~arg13 < -129 && arg13 < 896) {
                    var37 -= 128;
                }
                if (arg13 > 1152 && arg13 < 1920) {
                    var38 = var36 + 128;
                }
                if (~arg13 < -1665 || arg13 < 384) {
                    var39 -= 128;
                }
            }
            int var42 = arg8.method166();
            if (~var37 < ~var41) {
                var41 = var37;
            }
            int var43 = arg8.method140();
            if (~var43 > ~var39) {
                var43 = var39;
            }
            int var44 = arg8.method149();
            if (var38 < var42) {
                var42 = var38;
            }
            if (var40 < var44) {
                var44 = var40;
            }
            class165 var45 = null;
            if (arg4 != null) {
                int var46 = arg4.field2252[arg1];
                var45 = class81.method594(var46 >> 16, 3);
                arg1 = var46 & 65535;
            }
            class22 var47;
            if (var45 == null) {
                var47 = var16.method158(true, true, true);
                var47.method153((-var41 + var42) / 2, 128, (-var43 + var44) / 2);
                var47.method156((var41 + var42) / 2, 0, (var43 + var44) / 2);
            } else {
                var47 = var16.method158(!var45.method1218((byte) 81, arg1), !var45.method1220((byte) -128, arg1), true);
                var47.method153((var42 - var41) / 2, 128, (-var43 + var44) / 2);
                var47.method156((var41 + var42) / 2, 0, (var43 + var44) / 2);
                var47.method148(var45, arg1);
            }
            if (arg13 != 0) {
                var47.method147(arg13);
            }
            class246 var48 = (class246) var47;
            if (~arg11 != ~class129.method930(arg7 - -var43, arg5 + var41, 73, class58.field826) || ~class129.method930(arg7 + var44, arg5 + var42, 76, class58.field826) != ~arg11) {
                for (int var49 = 0; var48.field4065 > var49; ++var49) {
                    var48.field4049[var49] += -arg11 + class129.method930(var48.field4047[var49] + arg7, var48.field4053[var49] + arg5, 92, class58.field826);
                }
                var48.field4061 = false;
            }
            return var47;
        }
    }
}
