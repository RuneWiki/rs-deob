import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class221 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field3525 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public static int[] field3518;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 7)
    public static void method1607(int arg0) {
        field3518 = null;
        if (arg0 != 0) {
            field3525 = -26;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)Z", line = 16)
    public static final boolean method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class93.field1443[arg0][var8][var9] == -class247.field3937) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class84.field1282[arg0][arg1][arg3] + arg5;
            if (!class52.method354(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class52.method354(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class52.method354(var10, var12, var14)) {
                return false;
            } else if (class52.method354(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class296.method2065(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class52.method354(var6 + 1, class84.field1282[arg0][arg1][arg3] + arg5, var7 + 1) && class52.method354(var6 + 128 - 1, class84.field1282[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class52.method354(var6 + 128 - 1, class84.field1282[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class52.method354(var6 + 1, class84.field1282[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lkb;II)Z", line = 83)
    public static final boolean method1609(class39 arg0, int arg1, int arg2) {
        field3520++;
        if (arg1 != 5282) {
            return true;
        }
        byte[] var3 = arg0.method274((byte) -56, arg2);
        if (var3 == null) {
            return false;
        } else {
            class129.method887(false, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 107)
    public static final void method1610(int arg0) {
        for (class125 var1 = (class125) class119.field1831.method1807((byte) 52); var1 != null; var1 = (class125) class119.field1831.method1808(18051)) {
            if (var1.field1874 == -1) {
                var1.field1862 = 0;
                class334.method2301(var1, -128);
            } else {
                var1.method465((byte) -122);
            }
        }
        if (arg0 <= 113) {
            method1608(-92, -39, 127, -121, -75, -32);
        }
        field3524++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BIII)I", line = 133)
    public static final int method1611(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field3519++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (arg0 == 37) {
            return var4 == 2 ? 1023 - arg2 : -arg3 + 1023;
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I", line = 164)
    public static final int method1612(int arg0, int arg1, int arg2) {
        field3526++;
        if (arg1 > -9) {
            return 77;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILc;II)V", line = 202)
    public static final void method1613(int arg0, class320 arg1, int arg2, int arg3) {
        if (arg3 != 24299) {
            return;
        }
        field3522++;
        if (arg1.field1968 == arg2 && arg2 != -1) {
            class80 var4 = class37.method236(arg2, 20254);
            int var5 = var4.field1207;
            if (var5 == 1) {
                arg1.field2023 = 0;
                arg1.field2002 = arg0;
                arg1.field1955 = 0;
                arg1.field1948 = 0;
                arg1.field1960 = 1;
                class253.method1789(19080, arg1.field1944, var4, arg1.field1948, arg1.field1980, class13.field159 == arg1);
            }
            if (var5 == 2) {
                arg1.field2023 = 0;
            }
        } else if (arg2 == -1 || arg1.field1968 == -1 || class37.method236(arg2, arg3 - 4045).field1197 >= class37.method236(arg1.field1968, 20254).field1197) {
            arg1.field1968 = arg2;
            arg1.field1960 = 1;
            arg1.field2023 = 0;
            arg1.field1948 = 0;
            arg1.field2001 = arg1.field1951;
            arg1.field2002 = arg0;
            arg1.field1955 = 0;
            if (arg1.field1968 != -1) {
                class253.method1789(19080, arg1.field1944, class37.method236(arg1.field1968, 20254), arg1.field1948, arg1.field1980, class13.field159 == arg1);
            }
        }
    }
}
