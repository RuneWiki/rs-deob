import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class692 extends class530 {

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "Lpaa;")
    public static class712 field9684 = null;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "Z")
    public static boolean field9685 = false;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "[I")
    public static int[] field9687 = new int[5];

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIILha;IILka;IIILec;)Lka;", line = 7)
    public static final class283 method3934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class545 arg6, int arg7, int arg8, class283 arg9, int arg10, int arg11, int arg12, class103 arg13) {
        ++field9679;
        if (arg9 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg13 != null) {
                int var15 = var14 | arg13.method696(false, -1, -16365, arg12);
                var14 = var15 & -513;
            }
            if (arg11 != 768) {
                field9684 = null;
            }
            long var16 = ((long) arg5 << 48) + ((long) arg8 << 32) + (long) ((arg3 << 24) + arg0 - -(arg10 << 16));
            class538 var18 = class585.field8426;
            class283 var19;
            synchronized (class585.field8426) {
                var19 = (class283) class585.field8426.method3200(var16, -19983);
            }
            if (var19 == null || arg6.method2105(var19.method1135(), var14) != 0) {
                if (var19 != null) {
                    var14 = arg6.method2101(var14, var19.method1135());
                }
                byte var20;
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        var20 = 12;
                    } else if (arg0 != 3) {
                        if (arg0 == 4) {
                            var20 = 18;
                        } else {
                            var20 = 21;
                        }
                    } else {
                        var20 = 15;
                    }
                } else {
                    var20 = 9;
                }
                byte var21 = 3;
                int[] var22 = new int[] { 64, 96, 128 };
                class64 var23 = new class64(var20 * var21 + 1, var20 * var21 * 2 - var20, 0);
                int var24 = var23.method415(0, 0, 0, true);
                int[][] var25 = new int[var21][var20];
                for (int var26 = 0; ~var26 > ~var21; ++var26) {
                    int var27 = var22[var26];
                    int var28 = var22[var26];
                    for (int var29 = 0; ~var20 < ~var29; ++var29) {
                        int var30 = (var29 << 14) / var20;
                        int var31 = class231.field3217[var30] * var27 >> 14;
                        int var32 = class231.field3218[var30] * var28 >> 14;
                        var25[var26][var29] = var23.method415(0, var32, var31, true);
                    }
                }
                for (int var33 = 0; var33 < var21; ++var33) {
                    int var34 = (var33 * 256 + 128) / var21;
                    int var35 = -var34 + 256;
                    byte var36 = (byte) (arg3 * var34 + arg10 * var35 >> 8);
                    short var37 = (short) ((16515072 & (arg5 & 64512) * var34 + (arg8 & 64512) * var35) + ((arg5 & 127) * var34 + (127 & arg8) * var35 & 32512) + ((896 & arg5) * var34 + (896 & arg8) * var35 & 229376) >> 8);
                    for (int var38 = 0; var38 < var20; ++var38) {
                        if (~var33 != -1) {
                            var23.method421((short) -1, (byte) -1, var37, (byte) -80, (byte) 1, var25[var33][(var38 - -1) % var20], var36, var25[var33 + -1][var38], var25[var33 + -1][(var38 + 1) % var20]);
                            var23.method421((short) -1, (byte) -1, var37, (byte) -80, (byte) 1, var25[var33][var38], var36, var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20]);
                        } else {
                            var23.method421((short) -1, (byte) -1, var37, (byte) -80, (byte) 1, var25[0][var38], var36, var24, var25[0][(var38 + 1) % var20]);
                        }
                    }
                }
                var19 = arg6.method2222(var23, var14, class639.field9077, 64, 768);
                class538 var39 = class585.field8426;
                synchronized (class585.field8426) {
                    class585.field8426.method3199((byte) 78, var19, var16);
                }
            }
            int var40 = arg9.method1114();
            int var41 = arg9.method1169();
            int var42 = arg9.method1128();
            int var43 = arg9.method1136();
            class154 var44 = null;
            if (arg13 != null) {
                int var45 = arg13.field1472[arg12];
                var44 = class274.field3684.method1883(arg11 ^ 893, var45 >> 16);
                arg12 = var45 & 65535;
            }
            class283 var46;
            if (var44 == null) {
                var46 = var19.method1147((byte) 3, var14, true);
                var46.method1161(var41 - var40 >> 1, 128, -var42 + var43 >> 1);
                var46.method1117(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            } else {
                var46 = var19.method1147((byte) 3, var14, true);
                var46.method1161(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                var46.method1117(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                var46.method1689(arg11 + -768, var44, arg12);
            }
            if (~arg4 != -1) {
                var46.method1165(arg4);
            }
            if (arg1 != 0) {
                var46.method1167(arg1);
            }
            if (arg7 != 0) {
                var46.method1117(0, arg7, 0);
            }
            return var46;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I", line = 176)
    public final int method3935(int arg0) {
        ++field9682;
        if (arg0 != 0) {
            field9685 = true;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BZ)V", line = 188)
    public static final void method3936(byte arg0, boolean arg1) {
        if (arg0 == -70) {
            if (arg1) {
                if (class312.field4004 != -1) {
                    class295.method1736(class312.field4004, -1);
                }
                for (class14 var2 = (class14) class426.field5894.method1382(27901); var2 != null; var2 = (class14) class426.field5894.method1383(false)) {
                    if (!var2.method3064(arg0 + 10413)) {
                        var2 = (class14) class426.field5894.method1382(arg0 + 27971);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class197.method1325(var2, (byte) 98, false, true);
                }
                class312.field4004 = -1;
                class426.field5894 = new class209(8);
                class77.method471(true);
                class312.field4004 = class711.field9918;
                class636.method3700(false, 1);
                class330.method1918(7);
                class318.method1836(class312.field4004);
            }
            ++field9677;
            class457.field6283 = true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I", line = 234)
    public final int method74(int arg0) {
        if (arg0 != 0) {
            return 93;
        } else {
            ++field9678;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I", line = 245)
    public final int method75(int arg0, int arg1) {
        ++field9686;
        int var3 = -91 / ((arg1 - 63) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(ILah;)V", line = 257)
    public class692(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V", line = 260)
    public final void method73(boolean arg0) {
        if (super.field7419 != 1 && super.field7419 != 0) {
            super.field7419 = this.method74(0);
        }
        ++field9683;
        if (!arg0) {
            field9685 = true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 273)
    public static void method3937(byte arg0) {
        field9687 = null;
        if (arg0 < -31) {
            field9684 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBII)V", line = 287)
    public static final void method3938(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = class674.field9500.field5121.method3216(arg1 + 68) * arg3 >> 8;
        ++field9688;
        if (arg2 == -1 && !class105.field1538) {
            class23.method128(arg1 ^ 70);
        } else if (arg2 != -1 && (class555.field7841 != arg2 || !class475.method2820((byte) -90)) && ~var4 != -1 && !class105.field1538) {
            class202.method1359(class76.field1047, true, arg0, var4, false, 0, arg2);
            class637.method3701(-4198);
        }
        if (~class555.field7841 != ~arg2) {
            class306.field3970 = null;
        }
        if (arg1 != -68) {
            method3934(58, 46, -122, -96, 91, 13, (class545) null, 44, 124, (class283) null, 108, -13, 31, (class103) null);
        }
        class555.field7841 = arg2;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lah;)V", line = 323)
    public class692(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)V", line = 326)
    public final void method70(int arg0, int arg1) {
        ++field9681;
        if (arg1 < -38) {
            super.field7419 = arg0;
        }
    }
}
