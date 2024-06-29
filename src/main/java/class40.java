import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class40 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIILwi;IIZIIIIILoh;I)Lwi;", line = 8)
    public static final class221 method328(boolean arg0, int arg1, int arg2, class221 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class281 arg12, int arg13) {
        field609++;
        long var14 = ((long) arg2 << 48) + ((long) ((arg7 << 24) + (arg9 << 16) + arg11) + ((long) arg5 << 32));
        class221 var16 = (class221) class217.field3298.method2179(false, var14);
        if (var16 == null) {
            byte var17;
            if (arg11 == 1) {
                var17 = 9;
            } else if (arg11 == 2) {
                var17 = 12;
            } else if (arg11 == 3) {
                var17 = 15;
            } else if (arg11 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class42 var20 = new class42((var17 * var18) + 1, var17 * 2 * var18 + -var17, 0);
            int var21 = var20.method361(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg8 + (class15.field204[var27] * var24) >> 16;
                    int var29 = class15.field216[var27] * var25 + arg4 >> 16;
                    var22[var23][var26] = var20.method361(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg7 * var31 + arg9 * var32 >> 8);
                short var34 = (short) (((arg2 & 0x380) * var31 + (arg5 & 0x380) * var32 & 0x38000) + ((arg2 & 0x7F) * var31 + (arg5 & 0x7F) * var32 & 0x7F00) + ((arg2 & 0xFC00) * var31 + (arg5 & 0xFC00) * var32 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method359(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method359(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method359(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method341(64, 768, -50, -10, -50);
            class217.field3298.method2173(var16, true, var14);
        }
        int var36 = arg11 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg6) {
            if (arg13 > 1664 || arg13 < 384) {
                var38 -= 128;
            }
            if (arg13 > 640 && arg13 < 1408) {
                var39 = var36 + 128;
            }
            if (arg13 > 128 && arg13 < 896) {
                var37 -= 128;
            }
            if (arg13 > 1152 && arg13 < 1920) {
                var40 = var36 + 128;
            }
        }
        int var41 = arg3.method173();
        int var42 = arg3.method205();
        int var43 = arg3.method172();
        if (var41 < var37) {
            var41 = var37;
        }
        if (var38 > var43) {
            var43 = var38;
        }
        class75 var44 = null;
        if (var40 < var42) {
            var42 = var40;
        }
        int var45 = arg3.method175();
        if (var45 > var39) {
            var45 = var39;
        }
        if (arg12 != null) {
            int var46 = arg12.field4326[arg10];
            var44 = class268.method1850(var46 >> 16, arg0);
            arg10 = var46 & 0xFFFF;
        }
        class221 var47;
        if (var44 == null) {
            var47 = var16.method191(true, true, true);
            var47.method210((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method160((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method191(!var44.method551(arg10, (byte) -97), !var44.method549(arg10, 0), true);
            var47.method210((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method160((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method1574(var44, arg10);
        }
        if (arg13 != 0) {
            var47.method185(arg13);
        }
        if (class94.field1516) {
            class21 var50 = (class21) var47;
            if (arg1 != class320.method2181(arg8 + var41, arg4 - -var43, -123, class205.field3101) || class320.method2181(arg8 + var42, arg4 + var45, -67, class205.field3101) != arg1) {
                for (int var51 = 0; var51 < var50.field303; var51++) {
                    var50.field299[var51] += class320.method2181(var50.field310[var51] + arg8, var50.field305[var51] + arg4, -120, class205.field3101) - arg1;
                }
                var50.field314.field552 = false;
                var50.field285.field5347 = false;
            }
        } else {
            class66 var48 = (class66) var47;
            if (class320.method2181(arg8 + var41, arg4 - -var43, -51, class205.field3101) != arg1 || arg1 != class320.method2181(arg8 + var42, arg4 + var45, -127, class205.field3101)) {
                for (int var49 = 0; var49 < var48.field1028; var49++) {
                    var48.field1051[var49] += class320.method2181(var48.field1045[var49] + arg8, var48.field1054[var49] + arg4, -85, class205.field3101) - arg1;
                }
                var48.field1033 = false;
            }
        }
        if (!arg0) {
            method329(-81, false);
        }
        return var47;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)[B", line = 241)
    public static final synchronized byte[] method329(int arg0, boolean arg1) {
        field610++;
        if (arg0 == 100 && class17.field237 > 0) {
            byte[] var2 = class39.field603[--class17.field237];
            class39.field603[class17.field237] = null;
            return var2;
        } else if (arg0 == 5000 && class205.field3083 > 0) {
            byte[] var3 = class7.field88[--class205.field3083];
            class7.field88[class205.field3083] = null;
            return var3;
        } else if (!arg1) {
            return (byte[]) null;
        } else if (arg0 == 30000 && class30.field439 > 0) {
            byte[] var4 = class276.field4261[--class30.field439];
            class276.field4261[class30.field439] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 284)
    public static final void method330(int arg0) {
        field608++;
        if (class1.field2 != -1) {
            class81.method582(class1.field2, 0, -1, -1);
            class1.field2 = -1;
        }
        if (arg0 != 21894) {
            method330(28);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Z", line = 307)
    public static final boolean method331(int arg0) {
        field605++;
        if (class225.field3583 == 0) {
            return arg0 == 4 ? class160.field2416.method1942(arg0 + 120) : false;
        } else {
            return true;
        }
    }
}
