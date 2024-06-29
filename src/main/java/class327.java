import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class327 {

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "Lej;")
    public static class106 field4363 = new class106();

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field4366;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bga", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field4367;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1906(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/awt/Canvas;Lfa;B)Lr;", line = 3)
    public static final class165 method1903(Canvas arg0, class212 arg1, byte arg2) {
        if (arg2 <= 117) {
            return null;
        } else {
            field4365++;
            return new class18(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIIIIII)V", line = 16)
    public static final void method1904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -9) {
            method1905(-119);
        }
        field4362++;
        if (arg1 < 0 || arg2 < 0 || class473.field6604 - 1 <= arg1 || (class205.field2465 - 1) <= arg2) {
            return;
        }
        if (class281.field3808 == null) {
            return;
        }
        if (arg5 == 0) {
            class691 var8 = (class691) class511.method3030(arg4, arg1, arg2);
            class691 var9 = (class691) class692.method3904(arg4, arg1, arg2);
            if (var8 != null && arg6 != 2) {
                if ((var8 instanceof class170)) {
                    ((class170) var8).field2067.method3040(-108, arg3);
                } else {
                    class21.method342(var8.method1072(4378), arg5, arg6, arg2, 3, arg3, arg1, arg4, arg0);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class170)) {
                    class21.method342(var9.method1072(4378), arg5, arg6, arg2, 3, arg3, arg1, arg4, arg0);
                    return;
                }
                ((class170) var9).field2067.method3040(arg7 - 117, arg3);
                return;
            }
            return;
        }
        if (arg5 != 1) {
            if (arg5 == 2) {
                class691 var11 = (class691) class564.method3296(arg4, arg1, arg2, field4367 == null ? (field4367 = method1906("pn")) : field4367);
                if (var11 == null) {
                    return;
                }
                if (arg6 == 11) {
                    arg6 = 10;
                }
                if (!(var11 instanceof class532)) {
                    class21.method342(var11.method1072(4378), arg5, arg6, arg2, 3, arg3, arg1, arg4, arg0);
                    return;
                }
                ((class532) var11).field7761.method3040(-120, arg3);
            } else if (arg5 == 3) {
                class691 var10 = (class691) class403.method2429(arg4, arg1, arg2);
                if (var10 != null) {
                    if (!(var10 instanceof class440)) {
                        class21.method342(var10.method1072(arg7 ^ 0xFFFFEEED), arg5, arg6, arg2, 3, arg3, arg1, arg4, arg0);
                        return;
                    }
                    ((class440) var10).field6277.method3040(-103, arg3);
                    return;
                }
            }
            return;
        }
        class691 var12 = (class691) class168.method1059(arg4, arg1, arg2);
        if (var12 == null) {
            return;
        }
        if (var12 instanceof class466) {
            ((class466) var12).field6503.method3040(65, arg3);
            return;
        }
        int var13 = var12.method1072(4378);
        if (arg6 != 4 && arg6 != 5) {
            if (arg6 == 6) {
                class21.method342(var13, arg5, 4, arg2, 3, arg3, arg1, arg4, arg0 + 4);
            } else if (arg6 == 7) {
                class21.method342(var13, arg5, 4, arg2, 3, arg3, arg1, arg4, (arg0 + 2 & 0x3) + 4);
                return;
            } else if (arg6 == 8) {
                class21.method342(var13, arg5, 4, arg2, 3, arg3, arg1, arg4, arg0 + 4);
                class21.method342(var13, arg5, 4, arg2, 3, arg3, arg1, arg4, (arg0 + 2 & 0x3) + 4);
                return;
            }
            return;
        }
        class21.method342(var13, arg5, 4, arg2, 3, arg3, arg1, arg4, arg0);
        return;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 136)
    public static void method1905(int arg0) {
        field4363 = null;
        if (arg0 > -39) {
            method1903(null, null, (byte) -53);
        }
    }
}
