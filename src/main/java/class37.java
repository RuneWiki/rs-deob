import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class37 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field439 = new String[100];

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
    public static boolean field445 = false;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILqm;IZIIIIIIBLuc;II)Luc;", line = 5)
    public static final class201 method218(int arg0, class247 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, class201 arg11, int arg12, int arg13) {
        field444++;
        long var14 = ((long) arg12 << 48) + ((long) arg5 << 32) + (long) (arg2 - (-(arg9 << 16) - (arg0 << 24)));
        class201 var16 = (class201) class345.field5346.method1239((byte) -106, var14);
        if (var16 == null) {
            byte var17;
            if (arg2 == 1) {
                var17 = 9;
            } else if (arg2 == 2) {
                var17 = 12;
            } else if (arg2 == 3) {
                var17 = 15;
            } else if (arg2 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class207 var20 = new class207(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int[][] var21 = new int[var19][var17];
            int var22 = var20.method1415(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class215.field3024[var27] * var24 + arg8 >> 16;
                    int var29 = class215.field3017[var27] * var25 + arg7 >> 16;
                    var21[var23][var26] = var20.method1415(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                short var33 = (short) (((arg5 & 0x380) * var32 + (arg12 & 0x380) * var31 & 0x38000) + ((arg5 & 0x7F) * var32 + (arg12 & 0x7F) * var31 & 0x7F00) + ((arg5 & 0xFC00) * var32 + (arg12 & 0xFC00) * var31 & 0xFC0000) >> 8);
                byte var34 = (byte) (arg0 * var31 + arg9 * var32 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1410(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var33, var34);
                    } else {
                        var20.method1410(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var20.method1410(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var20.method1407(64, 768, -50, -10, -50);
            class345.field5346.method1243(var16, var14, -29282);
        }
        int var36 = arg2 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        if (arg10 >= -2) {
            return (class201) null;
        }
        int var40 = var36;
        int var41 = arg11.method728();
        int var42 = arg11.method721();
        int var43 = arg11.method718();
        if (arg3) {
            if (arg4 > 1152 && arg4 < 1920) {
                var39 = var36 + 128;
            }
            if (arg4 > 1664 || arg4 < 384) {
                var38 -= 128;
            }
            if (arg4 > 128 && arg4 < 896) {
                var37 -= 128;
            }
            if (arg4 > 640 && arg4 < 1408) {
                var40 = var36 + 128;
            }
        }
        if (var38 > var43) {
            var43 = var38;
        }
        if (var41 < var37) {
            var41 = var37;
        }
        int var44 = arg11.method696();
        if (var39 < var42) {
            var42 = var39;
        }
        class115 var45 = null;
        if (var44 > var40) {
            var44 = var40;
        }
        if (arg1 != null) {
            int var46 = arg1.field3734[arg13];
            var45 = class216.method1494(-128, var46 >> 16);
            arg13 = var46 & 0xFFFF;
        }
        class201 var47;
        if (var45 == null) {
            var47 = var16.method707(true, true, true);
            var47.method740((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method688((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method707(!var45.method787(arg13, false), !var45.method785(-8572, arg13), true);
            var47.method740((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method688((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method1380(var45, arg13);
        }
        if (arg4 != 0) {
            var47.method698(arg4);
        }
        if (class250.field3787) {
            class108 var50 = (class108) var47;
            if (arg6 != class184.method1278(class138.field1940, -13660, arg7 + var43, arg8 + var41) || arg6 != class184.method1278(class138.field1940, -13660, arg7 + var44, arg8 + var42)) {
                for (int var51 = 0; var51 < var50.field1442; var51++) {
                    var50.field1427[var51] += class184.method1278(class138.field1940, -13660, var50.field1450[var51] + arg7, var50.field1461[var51] + arg8) - arg6;
                }
                var50.field1430.field2160 = false;
                var50.field1426.field3109 = false;
            }
        } else {
            class333 var48 = (class333) var47;
            if (arg6 != class184.method1278(class138.field1940, -13660, arg7 + var43, arg8 + var41) || arg6 != class184.method1278(class138.field1940, -13660, arg7 + var44, arg8 - -var42)) {
                for (int var49 = 0; var49 < var48.field5109; var49++) {
                    var48.field5091[var49] += class184.method1278(class138.field1940, -13660, var48.field5081[var49] + arg7, var48.field5099[var49] - -arg8) - arg6;
                }
                var48.field5086 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Llc;III)Lbi;", line = 234)
    public static final class91 method219(class175 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 896) {
            method220((float[]) null, 37);
        }
        field440++;
        return class304.method2132((byte) -102, arg1, arg3, arg0) ? class61.method356((byte) -120) : null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([FI)[F", line = 251)
    public static final float[] method220(float[] arg0, int arg1) {
        field441++;
        if (arg0 == null) {
            return null;
        }
        float[] var2 = new float[arg0.length];
        if (arg1 != 3988) {
            field445 = true;
        }
        class86.method510(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lin;", line = 268)
    public static final class161 method221(byte arg0, int arg1) {
        field447++;
        class161 var2 = (class161) class179.field2597.method1239((byte) -92, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field370.method1199(28815, class99.method596(-20, arg1), class79.method465(false, arg1));
        class161 var4 = new class161();
        if (var3 != null) {
            var4.method1064((byte) -80, new class107(var3));
        }
        class179.field2597.method1243(var4, (long) arg1, -29282);
        if (arg0 > -115) {
            field439 = (String[]) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 291)
    public static void method222(int arg0) {
        field439 = null;
        if (arg0 != 0) {
            field442 = -74;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 303)
    public static final void method223(int arg0, int arg1) {
        if (arg1 != 128) {
            method223(-108, 42);
        }
        field446++;
        class286 var2 = (class286) class229.field3337.method1537((long) arg0, -22708);
        if (var2 != null) {
            var2.method2285(true);
        }
    }
}
