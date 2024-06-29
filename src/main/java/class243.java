import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class243 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field3790 = 2048;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field3794 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field3792 = 0;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field3798 = 2048;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    public static int[] field3791 = new int[4096];

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lvl;IZI)V", line = 5)
    private final void method1742(class6 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.method1743(-111, -67, (class6) null);
        }
        field3795++;
        if (arg3 == 1) {
            this.field3794 = arg0.method58(-288140008);
        } else if (arg3 == 2) {
            this.field3798 = arg0.method39((byte) 49);
        } else if (arg3 == 3) {
            this.field3790 = arg0.method39((byte) 39);
        } else if (arg3 == 4) {
            this.field3792 = arg0.method78((byte) -58);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILvl;)V", line = 44)
    public final void method1743(int arg0, int arg1, class6 arg2) {
        while (true) {
            int var4 = arg2.method58(-288140008);
            if (var4 == 0) {
                int var5 = -6 / ((49 - arg1) / 34);
                field3793++;
                return;
            }
            this.method1742(arg2, arg0, true, var4);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIZIILjf;La;IIIII)Ljf;", line = 69)
    public static final class89 method1744(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class89 arg7, class281 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3797++;
        long var14 = ((long) arg0 << 48) + ((long) arg12 << 32) + (long) ((arg10 << 16) + arg6 - -(arg1 << 24));
        class89 var16 = (class89) class9.field169.method1351(var14, 63);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg6 == 1) {
                var18 = 9;
            } else if (arg6 == 2) {
                var18 = 12;
            } else if (arg6 == 3) {
                var18 = 15;
            } else if (arg6 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            class165 var19 = new class165((var17 * var18) + 1, var17 * var18 * 2 + -var18, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int var21 = var19.method1240(0, 0, 0);
            int[][] var22 = new int[var17][var18];
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var20[var23];
                int var25 = var20[var23];
                for (int var26 = 0; var26 < var18; var26++) {
                    int var27 = (var26 << 11) / var18;
                    int var28 = class31.field467[var27] * var25 + arg9 >> 16;
                    int var29 = class31.field451[var27] * var24 + arg2 >> 16;
                    var22[var23][var26] = var19.method1240(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg1 * var31 + arg10 * var32 >> 8);
                short var34 = (short) (((arg0 & 0xFC00) * var31 + (arg12 & 0xFC00) * var32 & 0xFC0000) + ((arg0 & 0x7F) * var31 + (arg12 & 0x7F) * var32 & 0x7F00) + ((arg0 & 0x380) * var31 + (arg12 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var18; var35++) {
                    if (var30 == 0) {
                        var19.method1223(var21, var22[0][(var35 + 1) % var18], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var19.method1223(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var18], var22[var30][(var35 + 1) % var18], (byte) 1, var34, var33);
                        var19.method1223(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var18], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var19.method1226(64, 768, -50, -10, -50);
            class9.field169.method1347(var16, var14, (byte) -57);
        }
        int var36 = arg6 * 64 - 1;
        int var37 = -var36;
        if (arg5 <= 91) {
            return (class89) null;
        }
        int var38 = var36;
        int var39 = var36;
        int var40 = arg7.method408();
        int var41 = -var36;
        if (arg4) {
            if (arg3 > 128 && arg3 < 896) {
                var37 -= 128;
            }
            if (arg3 > 1664 || arg3 < 384) {
                var41 -= 128;
            }
            if (arg3 > 640 && arg3 < 1408) {
                var39 = var36 + 128;
            }
            if (arg3 > 1152 && arg3 < 1920) {
                var38 = var36 + 128;
            }
        }
        if (var40 < var37) {
            var40 = var37;
        }
        class193 var42 = null;
        int var43 = arg7.method383();
        if (var38 < var43) {
            var43 = var38;
        }
        int var44 = arg7.method388();
        int var45 = arg7.method394();
        if (var39 < var45) {
            var45 = var39;
        }
        if (var44 < var41) {
            var44 = var41;
        }
        if (arg8 != null) {
            int var46 = arg8.field4319[arg13];
            var42 = class261.method1874(false, var46 >> 16);
            arg13 = var46 & 0xFFFF;
        }
        class89 var47;
        if (var42 == null) {
            var47 = var16.method381(true, true, true);
            var47.method398((var43 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method407((var40 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method381(!var42.method1428(72, arg13), !var42.method1426(1, arg13), true);
            var47.method398((var43 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method407((var40 + var43) / 2, 0, (var44 + var45) / 2);
            var47.method638(var42, arg13);
        }
        if (arg3 != 0) {
            var47.method401(arg3);
        }
        if (class109.field1458) {
            class217 var48 = (class217) var47;
            if (arg11 != class320.method2245((byte) -79, arg2 + var44, class154.field2392, arg9 + var40) || arg11 != class320.method2245((byte) -66, arg2 + var45, class154.field2392, arg9 + var43)) {
                for (int var49 = 0; var49 < var48.field3412; var49++) {
                    var48.field3436[var49] += class320.method2245((byte) -31, var48.field3424[var49] + arg2, class154.field2392, var48.field3408[var49] + arg9) - arg11;
                }
                var48.field3438.field2545 = false;
                var48.field3435.field1559 = false;
            }
        } else {
            class53 var50 = (class53) var47;
            if (arg11 != class320.method2245((byte) -114, arg2 + var44, class154.field2392, arg9 + var40) || arg11 != class320.method2245((byte) -47, arg2 + var45, class154.field2392, arg9 + var43)) {
                for (int var51 = 0; var51 < var50.field680; var51++) {
                    var50.field698[var51] += class320.method2245((byte) -72, var50.field669[var51] + arg2, class154.field2392, var50.field676[var51] + arg9) - arg11;
                }
                var50.field679 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 296)
    public static void method1745(int arg0) {
        field3791 = null;
        int var1 = -98 / ((arg0 - 40) / 47);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3791[var0] = class202.method1500((byte) -123, var0);
        }
    }
}
