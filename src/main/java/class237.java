import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class237 extends class405 {

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lgf;")
    public static class232 field3418 = new class232();

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field3420;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field3421;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
    public static final boolean method1515(int arg0, int arg1, int arg2) {
        if (arg0 != -30193) {
            method1517(60, -74, 105, -46, 100, 82, -56, 67);
        }
        ++field3416;
        return (458752 & arg2) != 0 | class573.method3412(arg1, (byte) -43, arg2) || class47.method294(arg1, arg2, 1119090531);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public static void method1516(byte arg0) {
        if (arg0 != 36) {
            field3418 = null;
        }
        field3418 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3417;
        if (arg6 == 4) {
            if (~arg7 <= -1 && ~arg1 <= -1 && class146.field2125 - 1 > arg7 && ~(class410.field5609 + -1) < ~arg1) {
                if (class420.field5697 == null) {
                    return;
                }
                if (~arg2 == -1) {
                    class231 var8 = (class231) class169.method1205(arg3, arg7, arg1);
                    class231 var9 = (class231) class36.method225(arg3, arg7, arg1);
                    if (var8 != null && ~arg4 != -3) {
                        if (!(var8 instanceof class43)) {
                            class604.method3560(arg3, var8.method183(-19248), arg2, 32, arg5, arg4, arg7, arg1, arg0);
                        } else {
                            ((class43) var8).field516.method2833(arg0, -1);
                        }
                    }
                    if (var9 != null) {
                        if (!(var9 instanceof class43)) {
                            class604.method3560(arg3, var9.method183(arg6 ^ -19244), arg2, arg6 ^ -88, arg5, arg4, arg7, arg1, arg0);
                            return;
                        }
                        ((class43) var9).field516.method2833(arg0, arg6 ^ -5);
                        return;
                    }
                    return;
                }
                if (arg2 == 1) {
                    class231 var10 = (class231) class420.method2476(arg3, arg7, arg1);
                    if (var10 != null) {
                        if (var10 instanceof class354) {
                            ((class354) var10).field4827.method2833(arg0, arg6 + -5);
                            return;
                        }
                        int var11 = var10.method183(arg6 + -19252);
                        if (arg4 != 4 && arg4 != 5) {
                            if (~arg4 == -7) {
                                class604.method3560(arg3, var11, arg2, arg6 + 32, arg5 + 4, 4, arg7, arg1, arg0);
                                return;
                            }
                            if (~arg4 != -8) {
                                if (arg4 == 8) {
                                    class604.method3560(arg3, var11, arg2, 96, arg5 + 4, 4, arg7, arg1, arg0);
                                    class604.method3560(arg3, var11, arg2, arg6 + 31, (3 & arg5 + 2) + 4, 4, arg7, arg1, arg0);
                                    return;
                                }
                            } else {
                                class604.method3560(arg3, var11, arg2, 91, (arg5 - -2 & 3) + 4, 4, arg7, arg1, arg0);
                            }
                            return;
                        }
                        class604.method3560(arg3, var11, arg2, 95, arg5, 4, arg7, arg1, arg0);
                        return;
                    }
                    return;
                }
                if (~arg2 == -3) {
                    class231 var12 = (class231) class624.method3650(arg3, arg7, arg1, field3421 != null ? field3421 : (field3421 = method1519("up")));
                    if (var12 != null) {
                        if (~arg4 == -12) {
                            arg4 = 10;
                        }
                        if (!(var12 instanceof class584)) {
                            class604.method3560(arg3, var12.method183(arg6 ^ -19244), arg2, arg6 + -120, arg5, arg4, arg7, arg1, arg0);
                            return;
                        }
                        ((class584) var12).field8579.method2833(arg0, arg6 ^ -5);
                        return;
                    }
                    return;
                }
                if (arg2 == 3) {
                    class231 var13 = (class231) class440.method2560(arg3, arg7, arg1);
                    if (var13 != null) {
                        if (!(var13 instanceof class312)) {
                            class604.method3560(arg3, var13.method183(arg6 ^ -19244), arg2, 99, arg5, arg4, arg7, arg1, arg0);
                            return;
                        }
                        ((class312) var13).field4306.method2833(arg0, -1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Luj;")
    public static final class323 method1518(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3050;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FZ)V")
    public final void method1439(float arg0, boolean arg1) {
        super.field5546 = arg0;
        if (arg1) {
            method1518(4, 115, -64);
        }
        ++field3419;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)V")
    public final void method1437(byte arg0, int arg1, int arg2, int arg3) {
        ++field3420;
        super.field5533 = arg3;
        int var5 = -95 / ((-59 - arg0) / 53);
        super.field5536 = arg1;
        super.field5537 = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIF)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1519(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
