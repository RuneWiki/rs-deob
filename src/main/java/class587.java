import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class587 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field8316 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field8314;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field8317;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[Lf;")
    public static class534[] field8315;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lnp;Z)Lkh;")
    public static final class522 method3311(class115 arg0, boolean arg1) {
        field8314++;
        int var2 = arg0.method643((byte) -77);
        return arg1 ? new class522(var2) : null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method3312(boolean arg0) {
        field8315 = null;
        if (!arg0) {
            method3312(true);
        }
        field8316 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method3313(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8313++;
        if (arg7 >= 0 && arg5 >= 0 && (class142.field1574 - 1) > arg7 && class140.field1550 - 1 > arg5) {
            if (class487.field7044 == null) {
                return;
            }
            if (arg2 == 0) {
                class49 var12 = (class49) class578.method3272(arg6, arg7, arg5);
                class49 var13 = (class49) class408.method2278(arg6, arg7, arg5);
                if (var12 != null && arg1 != 2) {
                    if (var12 instanceof class212) {
                        ((class212) var12).field2562.method1789(arg4, 0);
                    } else {
                        class697.method3833(arg2, arg1, arg5, arg6, arg4, var12.method238(arg0 + 6500), arg7, (byte) -124, arg3);
                    }
                }
                if (var13 != null) {
                    if (var13 instanceof class212) {
                        ((class212) var13).field2562.method1789(arg4, 0);
                    } else {
                        class697.method3833(arg2, arg1, arg5, arg6, arg4, var13.method238(arg0 ^ 0x1964), arg7, (byte) -114, arg3);
                    }
                }
            } else if (arg2 == 1) {
                class49 var10 = (class49) class411.method2298(arg6, arg7, arg5);
                if (var10 != null) {
                    if (var10 instanceof class654) {
                        ((class654) var10).field9179.method1789(arg4, 0);
                    } else {
                        int var11 = var10.method238(6518);
                        if (arg1 == 4 || arg1 == 5) {
                            class697.method3833(arg2, 4, arg5, arg6, arg4, var11, arg7, (byte) -128, arg3);
                        } else if (arg1 == 6) {
                            class697.method3833(arg2, 4, arg5, arg6, arg4, var11, arg7, (byte) -122, arg3 + 4);
                        } else if (arg1 == 7) {
                            class697.method3833(arg2, 4, arg5, arg6, arg4, var11, arg7, (byte) -128, (arg3 + 2 & 0x3) + 4);
                        } else if (arg1 == 8) {
                            class697.method3833(arg2, 4, arg5, arg6, arg4, var11, arg7, (byte) -114, arg3 + 4);
                            class697.method3833(arg2, 4, arg5, arg6, arg4, var11, arg7, (byte) -121, (arg3 + 2 & 0x3) + 4);
                        }
                    }
                }
            } else if (arg2 == 2) {
                class49 var8 = (class49) class362.method2121(arg6, arg7, arg5, field8317 == null ? (field8317 = method3314("gda")) : field8317);
                if (var8 != null) {
                    if (arg1 == 11) {
                        arg1 = 10;
                    }
                    if ((var8 instanceof class462)) {
                        ((class462) var8).field6568.method1789(arg4, 0);
                    } else {
                        class697.method3833(arg2, arg1, arg5, arg6, arg4, var8.method238(6518), arg7, (byte) -127, arg3);
                    }
                }
            } else if (arg2 == 3) {
                class49 var9 = (class49) class328.method1845(arg6, arg7, arg5);
                if (var9 != null) {
                    if ((var9 instanceof class706)) {
                        ((class706) var9).field9924.method1789(arg4, arg0 - 18);
                    } else {
                        class697.method3833(arg2, arg1, arg5, arg6, arg4, var9.method238(arg0 + 6500), arg7, (byte) -121, arg3);
                    }
                }
            }
        }
        if (arg0 != 18) {
            field8315 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3314(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
