import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class66 {

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "Lcv;")
    public static class264 field868 = new class264();

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Ljj;")
    public static class398 field872 = new class398(57, 11);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([BBIIII)V")
    public static final void method393(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field870++;
        if (arg5 >= arg4) {
            return;
        }
        int var6 = arg3 + arg5;
        int var7 = arg4 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg5 & 0x3;
                if (arg1 >= -29) {
                    field868 = null;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var6++] = 1;
                }
            }
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V")
    public static final void method394(int arg0, boolean arg1) {
        class292.field3909 = new int[arg0];
        field867++;
        class293.field3916 = new int[arg0];
        class197.field2603 = new int[arg0];
        class175.field2204 = new int[arg0];
        class225.field2933 = new int[arg0];
        if (!arg1) {
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ldga;Ljava/lang/String;Z)I")
    public static final int method395(class138 arg0, String arg1, boolean arg2) {
        field871++;
        int var3 = arg0.field1745;
        byte[] var4 = class622.method3402(arg1, -126);
        arg0.method953(var4.length, (byte) -67);
        arg0.field1745 += class664.field9420.method866(0, var4.length, arg0.field1745, 2068802211, var4, arg0.field1712);
        if (!arg2) {
            method398(null, true, false);
        }
        return arg0.field1745 - var3;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V")
    public static void method396(boolean arg0) {
        field872 = null;
        field868 = null;
        if (!arg0) {
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZILefa;ZLefa;)I")
    public static final int method397(boolean arg0, int arg1, class40 arg2, boolean arg3, class40 arg4) {
        field866++;
        if (arg1 == 1) {
            int var5 = arg4.field7583;
            int var6 = arg2.field7583;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class313.method2027(arg4.method246(1).field7846, class350.field5121, 0, arg2.method246(1).field7846);
        } else if (arg0) {
            return 77;
        } else if (arg1 == 3) {
            if (arg4.field527.equals("-")) {
                if (arg2.field527.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field527.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class313.method2027(arg4.field527, class350.field5121, 0, arg2.field527);
            }
        } else if (arg1 == 4) {
            if (arg4.method3107(-26022)) {
                return arg2.method3107(-26022) ? 0 : 1;
            } else if (arg2.method3107(-26022)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg4.method3108(3)) {
                return arg2.method3108(3) ? 0 : 1;
            } else if (arg2.method3108(3)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg4.method3111((byte) -109)) {
                return arg2.method3111((byte) 106) ? 0 : 1;
            } else if (arg2.method3111((byte) 85)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 7) {
            if (arg4.method3105((byte) 67)) {
                return arg2.method3105((byte) 105) ? 0 : 1;
            } else if (arg2.method3105((byte) 102)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 8) {
            int var7 = arg4.field532;
            int var8 = arg2.field532;
            if (arg3) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg4.field528 - arg2.field528;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method398(String arg0, boolean arg1, boolean arg2) {
        field869++;
        class691.method3828(-1, (byte) -11, -1, arg1, arg0);
        if (arg2) {
            method394(-75, false);
        }
    }
}
