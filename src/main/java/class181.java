import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class181 extends class547 {

    @OriginalMember(owner = "client!wfa", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field2555;

    @OriginalMember(owner = "client!wfa", name = "F", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!wfa", name = "G", descriptor = "[J")
    public static long[] field2561 = new long[100];

    @OriginalMember(owner = "client!wfa", name = "B", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!wfa", name = "C", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!wfa", name = "E", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!wfa", name = "H", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!wfa", name = "I", descriptor = "I")
    public static int field2563;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wfa", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field2564;

    @OriginalMember(owner = "client!wfa", name = "D", descriptor = "[[Lvg;")
    public static class49[][] field2558;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "(B)Z")
    public final boolean method1160(byte arg0) {
        if (arg0 != -41) {
            method1223(117, 50, -46, null, 54, null, -86, 105, 110);
        }
        field2562++;
        return false;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field2558 = null;
        if (arg0 >= -55) {
            field2560 = 111;
        }
        field2561 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IILqaa;)V")
    public static final void method1221(int arg0, int arg1, class26 arg2) {
        class580.field8173 = 0;
        if (arg0 >= -123) {
            method1222(79, 94, -55, 106, -16, -88, -20, -108);
        }
        field2563++;
        class564.field7948 = false;
        class229.method1583(arg2, true);
        class54.method591(484960808, arg2);
        if (class564.field7948) {
            System.out.println("---endgpp---");
        }
        if (arg2.field9761 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field9761 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -18892) {
            method1222(71, 127, -71, 5, 80, 18, 84, -110);
        }
        field2559++;
        if (arg2 < 0 || arg5 < 0 || class199.field2812 - 1 <= arg2 || (class232.field3611 - 1) <= arg5) {
            return;
        }
        if (class153.field2210 == null) {
            return;
        }
        if (arg3 == 0) {
            class614 var8 = (class614) class149.method1061(arg4, arg2, arg5);
            class614 var9 = (class614) class495.method2867(arg4, arg2, arg5);
            if (var8 != null && arg1 != 2) {
                if ((var8 instanceof class564)) {
                    ((class564) var8).field7959.method83(arg6, 124);
                } else {
                    class162.method1115(arg5, arg1, arg4, arg6, arg2, var8.method1179(true), arg3, (byte) 123, arg7);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class564)) {
                    class162.method1115(arg5, arg1, arg4, arg6, arg2, var9.method1179(true), arg3, (byte) 125, arg7);
                    return;
                }
                ((class564) var9).field7959.method83(arg6, 127);
                return;
            }
            return;
        }
        if (arg3 == 1) {
            class614 var10 = (class614) class98.method797(arg4, arg2, arg5);
            if (var10 != null) {
                if (var10 instanceof class594) {
                    ((class594) var10).field8409.method83(arg6, 127);
                    return;
                }
                int var11 = var10.method1179(true);
                if (arg1 == 4 || arg1 == 5) {
                    class162.method1115(arg5, 4, arg4, arg6, arg2, var11, arg3, (byte) 123, arg7);
                } else if (arg1 == 6) {
                    class162.method1115(arg5, 4, arg4, arg6, arg2, var11, arg3, (byte) 121, arg7 + 4);
                    return;
                } else if (arg1 == 7) {
                    class162.method1115(arg5, 4, arg4, arg6, arg2, var11, arg3, (byte) 122, (arg7 + 2 & 0x3) + 4);
                    return;
                } else if (arg1 == 8) {
                    class162.method1115(arg5, 4, arg4, arg6, arg2, var11, arg3, (byte) 122, arg7 + 4);
                    class162.method1115(arg5, 4, arg4, arg6, arg2, var11, arg3, (byte) 122, (arg7 + 2 & 0x3) + 4);
                    return;
                }
                return;
            }
            return;
        }
        if (arg3 != 2) {
            if (arg3 == 3) {
                class614 var12 = (class614) class124.method946(arg4, arg2, arg5);
                if (var12 != null) {
                    if (!(var12 instanceof class619)) {
                        class162.method1115(arg5, arg1, arg4, arg6, arg2, var12.method1179(true), arg3, (byte) 123, arg7);
                        return;
                    }
                    ((class619) var12).field8647.method83(arg6, 123);
                    return;
                }
            }
            return;
        }
        class614 var13 = (class614) class349.method2155(arg4, arg2, arg5, field2564 == null ? (field2564 = method1224("rda")) : field2564);
        if (var13 == null) {
            return;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (var13 instanceof class172) {
            ((class172) var13).field2461.method83(arg6, 123);
            return;
        }
        class162.method1115(arg5, arg1, arg4, arg6, arg2, var13.method1179(true), arg3, (byte) 127, arg7);
        return;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III[BI[BIII)V")
    public static final void method1223(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        if (arg1 < 105) {
            field2560 = -80;
        }
        field2556++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg5[arg0++]);
                int var14 = arg8++;
                arg3[var14] = (byte) (arg3[var14] - arg5[arg0++]);
                int var15 = arg8++;
                arg3[var15] = (byte) (arg3[var15] - arg5[arg0++]);
                int var16 = arg8++;
                arg3[var16] = (byte) (arg3[var16] - arg5[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg5[arg0++]);
            }
            arg0 += arg2;
            arg8 += arg6;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1161(byte arg0) {
        field2557++;
        if (arg0 <= 21) {
            field2558 = null;
        }
        return this.field2555;
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class181(Object arg0, int arg1) {
        super(arg1);
        this.field2555 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1224(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
