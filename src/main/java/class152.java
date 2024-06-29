import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class152 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Ldp;")
    public static class3 field2141;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILnb;IILgn;ILwm;IZIII)Lgn;", line = 3)
    public static final class456 method895(int arg0, int arg1, int arg2, int arg3, class181 arg4, int arg5, int arg6, class456 arg7, int arg8, class364 arg9, int arg10, boolean arg11, int arg12, int arg13, int arg14) {
        field2142++;
        if (arg7 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg4 != null) {
            int var16 = var15 | arg4.method1062(arg0, false, -1, 65535);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg10 << 32) + ((long) ((arg1 << 24) + (arg2 << 16) + arg5) + ((long) arg6 << 48));
        class76 var19 = class480.field6631;
        class456 var20;
        synchronized (class480.field6631) {
            var20 = (class456) class480.field6631.method493((byte) 19, var17);
        }
        if (var20 == null || arg9.method2103(var20.method1863(), var15) != 0) {
            if (var20 != null) {
                var15 = arg9.method1979(var15, var20.method1863());
            }
            byte var21;
            if (arg5 == 1) {
                var21 = 9;
            } else if (arg5 == 2) {
                var21 = 12;
            } else if (arg5 == 3) {
                var21 = 15;
            } else if (arg5 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class284 var24 = new class284(var21 * var22 + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method1613(1, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class364.field4994[var31] * var28 >> 15;
                    int var33 = class364.field4992[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1613(1, 0, var32, var33);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg1 * var35 + arg2 * var36 >> 8);
                short var38 = (short) (((arg6 & 0x7F) * var35 + (arg10 & 0x7F) * var36 & 0x7F00) + ((arg6 & 0x380) * var35 + (arg10 & 0x380) * var36 & 0x38000) + ((arg6 & 0xFC00) * var35 + (arg10 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1607(var38, var25, var37, -5321, var26[0][(var39 + 1) % var21], (byte) 1, var26[0][var39], (short) -1, (byte) -1);
                    } else {
                        var24.method1607(var38, var26[var34 - 1][var39], var37, -5321, var26[var34 - 1][(var39 + 1) % var21], (byte) 1, var26[var34][(var39 + 1) % var21], (short) -1, (byte) -1);
                        var24.method1607(var38, var26[var34 - 1][var39], var37, -5321, var26[var34][(var39 + 1) % var21], (byte) 1, var26[var34][var39], (short) -1, (byte) -1);
                    }
                }
            }
            var20 = arg9.method2094(var24, var15, class317.field4183, 64, 768);
            class76 var40 = class480.field6631;
            synchronized (class480.field6631) {
                class480.field6631.method505(var17, var20, 94);
            }
        }
        int var41 = arg5 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg11) {
            if (arg8 > 1024 && arg8 < 7168) {
                var42 -= 128;
            }
            if (arg8 > 5120 && arg8 < 11264) {
                var45 = var41 + 128;
            }
            if (arg8 > 13312 || arg8 < 3072) {
                var43 -= 128;
            }
            if (arg8 > 9216 && arg8 < 15360) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg7.method1900();
        int var47 = arg7.method1858();
        int var48 = arg7.method1853();
        if (var43 > var48) {
            var48 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg7.method1873();
        if (var45 < var49) {
            var49 = var45;
        }
        if (arg14 <= 47) {
            method897(-88);
        }
        class134 var50 = null;
        if (arg4 != null) {
            int var51 = arg4.field2468[arg0];
            var50 = class395.field5477.method263(-16777216, var51 >> 16);
            arg0 = var51 & 0xFFFF;
        }
        class456 var52;
        if (var50 == null) {
            var52 = var20.method1893((byte) 3, var15, true);
            var52.method1876((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1866((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1893((byte) 3, var15, true);
            var52.method1876((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1866((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2678(var50, (byte) 106, arg0);
        }
        if (arg13 != 0) {
            var52.method1885(arg13);
        }
        if (arg3 != 0) {
            var52.method1846(arg3);
        }
        if (arg12 != 0) {
            var52.method1866(0, arg12, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 215)
    public static void method896(int arg0) {
        if (arg0 == 2) {
            field2141 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 229)
    public static final void method897(int arg0) {
        if (class259.field3433 != null) {
            class259.field3433.method852(54);
        }
        if (arg0 != -13044) {
            field2141 = null;
        }
        field2140++;
        if (class98.field1434 != null) {
            class98.field1434.method852(-72);
        }
        class178.method1017(true, 2, 22050, class488.field6789.field6672);
        class259.field3433 = class164.method958((byte) -72, 0, class251.field3359, class28.field378, 22050);
        class259.field3433.method854(0, class299.field3997);
        class98.field1434 = class164.method958((byte) -72, 1, class251.field3359, class28.field378, 2048);
        class98.field1434.method854(arg0 + 13044, class181.field2494);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Ljava/lang/String;", line = 252)
    public static final String method898(int arg0, int arg1, int arg2) {
        field2138++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else {
            if (arg0 != 64512) {
                field2137 = -60;
            }
            if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)I", line = 300)
    public static final int method899(int arg0, int arg1, int arg2) {
        if (arg0 >= -43) {
            method898(-112, -1, 10);
        }
        field2143++;
        return arg1 == 1 || arg1 == 3 ? class104.field1509[arg2 & 0x3] : class351.field4870[arg2 & 0x3];
    }
}
