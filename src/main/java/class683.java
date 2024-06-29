import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class683 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field9463 = 1;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "Lok;")
    public static class266 field9464 = new class266();

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field9466 = 1406;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lip;")
    public static class735 field9465 = new class735();

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field9462;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field9467;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method3858(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field9462++;
        if (arg0 >= 0 && arg1 >= 0 && arg0 < (class768.field10571 - 1) && class350.field4898 - 1 > arg1) {
            if (class767.field10562 == null) {
                return;
            }
            if (arg3 == 0) {
                class484 var12 = (class484) class335.method2132(arg5, arg0, arg1);
                class484 var13 = (class484) class85.method646(arg5, arg0, arg1);
                if (var12 != null && arg2 != 2) {
                    if (var12 instanceof class216) {
                        ((class216) var12).field3352.method3814(arg7, arg4 ^ 0xFFFFFF9A);
                    } else {
                        class754.method4196(arg5, arg1, arg7, arg2, -2, arg3, var12.method1483(24853), arg6, arg0);
                    }
                }
                if (var13 != null) {
                    if ((var13 instanceof class216)) {
                        ((class216) var13).field3352.method3814(arg7, 67);
                    } else {
                        class754.method4196(arg5, arg1, arg7, arg2, -2, arg3, var13.method1483(24853), arg6, arg0);
                    }
                }
            } else if (arg3 == 1) {
                class484 var10 = (class484) class26.method241(arg5, arg0, arg1);
                if (var10 != null) {
                    if (var10 instanceof class715) {
                        ((class715) var10).field9918.method3814(arg7, 98);
                    } else {
                        int var11 = var10.method1483(arg4 + 24889);
                        if (arg2 == 4 || arg2 == 5) {
                            class754.method4196(arg5, arg1, arg7, 4, -2, arg3, var11, arg6, arg0);
                        } else if (arg2 == 6) {
                            class754.method4196(arg5, arg1, arg7, 4, arg4 ^ 0x22, arg3, var11, arg6 + 4, arg0);
                        } else if (arg2 == 7) {
                            class754.method4196(arg5, arg1, arg7, 4, -2, arg3, var11, (arg6 + 2 & 0x3) + 4, arg0);
                        } else if (arg2 == 8) {
                            class754.method4196(arg5, arg1, arg7, 4, -2, arg3, var11, arg6 + 4, arg0);
                            class754.method4196(arg5, arg1, arg7, 4, arg4 + 34, arg3, var11, (arg6 + 2 & 0x3) + 4, arg0);
                        }
                    }
                }
            } else if (arg3 == 2) {
                class484 var8 = (class484) class537.method3227(arg5, arg0, arg1, field9467 == null ? (field9467 = method3860("nq")) : field9467);
                if (var8 != null) {
                    if (arg2 == 11) {
                        arg2 = 10;
                    }
                    if (var8 instanceof class291) {
                        ((class291) var8).field4262.method3814(arg7, arg4 ^ 0xFFFFFFB6);
                    } else {
                        class754.method4196(arg5, arg1, arg7, arg2, -2, arg3, var8.method1483(24853), arg6, arg0);
                    }
                }
            } else if (arg3 == 3) {
                class484 var9 = (class484) class266.method1725(arg5, arg0, arg1);
                if (var9 != null) {
                    if (var9 instanceof class583) {
                        ((class583) var9).field8233.method3814(arg7, arg4 + 109);
                    } else {
                        class754.method4196(arg5, arg1, arg7, arg2, -2, arg3, var9.method1483(24853), arg6, arg0);
                    }
                }
            }
        }
        if (arg4 != -36) {
            method3858(-39, 1, 121, 28, (byte) 96, 77, -96, 68);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public static void method3859(byte arg0) {
        field9464 = null;
        if (arg0 < 5) {
            method3858(-34, -6, 1, -100, (byte) -61, 16, -36, -65);
        }
        field9465 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3860(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
