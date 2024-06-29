import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "Llja;")
    public static class744 field181 = new class744(89, 4);

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "F")
    public static float field185;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "Lhba;")
    public class10 field186;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "Lar;")
    public class712 field187;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hba", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field188;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method175(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 6)
    public final void method170(int arg0) {
        field184++;
        if (arg0 < 20) {
            this.field187 = null;
        }
        if (class46.field613 < 500) {
            this.field186 = class446.field6010;
            this.field187 = null;
            class46.field613++;
            class446.field6010 = this;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V", line = 25)
    public static final void method171(int arg0) {
        class390.field5065.method650(class361.field4490, class118.field1503.field10657.method3370(arg0) == 1 ? class228.field2708 + 256 << 2 : -1, arg0);
        field183++;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BIIIIIII)V", line = 33)
    public static final void method172(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -106) {
            return;
        }
        field182++;
        if (arg1 < 0 || arg3 < 0 || arg1 >= (class596.field8090 - 1) || (class107.field1350 - 1) <= arg3) {
            return;
        }
        if (class107.field1351 == null) {
            return;
        }
        if (arg4 == 0) {
            class238 var8 = (class238) class253.method1504(arg7, arg1, arg3);
            class238 var9 = (class238) class38.method330(arg7, arg1, arg3);
            if (var8 != null && arg2 != 2) {
                if (var8 instanceof class491) {
                    ((class491) var8).field6849.method3104(false, arg5);
                } else {
                    class429.method2549(arg6, var8.method927(arg0 - 24376), arg1, -2, arg3, arg5, arg4, arg2, arg7);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class491)) {
                    class429.method2549(arg6, var9.method927(-24482), arg1, -2, arg3, arg5, arg4, arg2, arg7);
                    return;
                }
                ((class491) var9).field6849.method3104(false, arg5);
                return;
            }
            return;
        }
        if (arg4 == 1) {
            class238 var10 = (class238) class714.method4042(arg7, arg1, arg3);
            if (var10 != null) {
                if (var10 instanceof class440) {
                    ((class440) var10).field5916.method3104(false, arg5);
                    return;
                }
                int var11 = var10.method927(-24482);
                if (arg2 == 4 || arg2 == 5) {
                    class429.method2549(arg6, var11, arg1, -2, arg3, arg5, arg4, 4, arg7);
                } else if (arg2 == 6) {
                    class429.method2549(arg6 + 4, var11, arg1, -2, arg3, arg5, arg4, 4, arg7);
                    return;
                } else if (arg2 == 7) {
                    class429.method2549((arg6 + 2 & 0x3) + 4, var11, arg1, -2, arg3, arg5, arg4, 4, arg7);
                    return;
                } else if (arg2 == 8) {
                    class429.method2549(arg6 + 4, var11, arg1, -2, arg3, arg5, arg4, 4, arg7);
                    class429.method2549((arg6 + 2 & 0x3) + 4, var11, arg1, -2, arg3, arg5, arg4, 4, arg7);
                    return;
                }
                return;
            }
            return;
        }
        if (arg4 != 2) {
            if (arg4 == 3) {
                class238 var12 = (class238) class662.method3720(arg7, arg1, arg3);
                if (var12 != null) {
                    if (!(var12 instanceof class119)) {
                        class429.method2549(arg6, var12.method927(-24482), arg1, arg0 + 104, arg3, arg5, arg4, arg2, arg7);
                        return;
                    }
                    ((class119) var12).field1508.method3104(false, arg5);
                    return;
                }
            }
            return;
        }
        class238 var13 = (class238) class764.method4234(arg7, arg1, arg3, field188 == null ? (field188 = method175("qb")) : field188);
        if (var13 == null) {
            return;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (!(var13 instanceof class132)) {
            class429.method2549(arg6, var13.method927(arg0 - 24376), arg1, -2, arg3, arg5, arg4, arg2, arg7);
            return;
        }
        ((class132) var13).field1634.method3104(false, arg5);
        return;
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V", line = 154)
    public static void method173(int arg0) {
        if (arg0 == -9) {
            field181 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)V", line = 165)
    public static final void method174(int arg0, byte arg1) {
        if (arg1 > -8) {
            field181 = null;
        }
        field180++;
        class714 var2 = class350.method2072((long) arg0, 17, (byte) 114);
        var2.method4044((byte) -128);
    }
}
