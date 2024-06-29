import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class29 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    public static int[] field393 = new int[25];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field390 = 0;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Ldt;")
    public static class145 field396 = null;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Z")
    public static boolean field395 = false;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
    public static boolean field391 = false;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field389 = -1;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field397;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method210(int arg0) {
        field396 = null;
        if (arg0 < -116) {
            field393 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field392++;
        if (arg5 >= 0 && arg7 >= 0 && arg5 < class58.field758 - 1 && arg7 < class287.field4181 - 1) {
            if (class330.field4786 == null) {
                return;
            }
            if (arg3 == 0) {
                class106 var8 = (class106) class50.method320(arg1, arg5, arg7);
                class106 var9 = (class106) class143.method896(arg1, arg5, arg7);
                if (var8 != null && arg6 != 2) {
                    if (var8 instanceof class75) {
                        ((class75) var8).field933.method842(arg0, (byte) 51);
                    } else {
                        class420.method2466(arg7, arg1, arg0, arg6, arg3, var8.method106(arg4 + 12176), 32512, arg2, arg5);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class75)) {
                        ((class75) var9).field933.method842(arg0, (byte) 51);
                    } else {
                        class420.method2466(arg7, arg1, arg0, arg6, arg3, var9.method106(12181), 32512, arg2, arg5);
                    }
                }
            } else if (arg3 == 1) {
                class106 var12 = (class106) class271.method1658(arg1, arg5, arg7);
                if (var12 != null) {
                    if (var12 instanceof class335) {
                        ((class335) var12).field4867.method842(arg0, (byte) 51);
                    } else {
                        int var13 = var12.method106(arg4 + 12176);
                        if (arg6 == 4 || arg6 == 5) {
                            class420.method2466(arg7, arg1, arg0, 4, arg3, var13, 32512, arg2, arg5);
                        } else if (arg6 == 6) {
                            class420.method2466(arg7, arg1, arg0, 4, arg3, var13, 32512, arg2 + 4, arg5);
                        } else if (arg6 == 7) {
                            class420.method2466(arg7, arg1, arg0, 4, arg3, var13, 32512, (arg2 + 2 & 0x3) + 4, arg5);
                        } else if (arg6 == 8) {
                            class420.method2466(arg7, arg1, arg0, 4, arg3, var13, 32512, arg2 + 4, arg5);
                            class420.method2466(arg7, arg1, arg0, 4, arg3, var13, 32512, (arg2 + 2 & 0x3) + 4, arg5);
                        }
                    }
                }
            } else if (arg3 == 2) {
                class106 var10 = (class106) class231.method1470(arg1, arg5, arg7, field397 == null ? (field397 = method212("gg")) : field397);
                if (var10 != null) {
                    if (arg6 == 11) {
                        arg6 = 10;
                    }
                    if ((var10 instanceof class50)) {
                        ((class50) var10).field690.method842(arg0, (byte) 51);
                    } else {
                        class420.method2466(arg7, arg1, arg0, arg6, arg3, var10.method106(arg4 ^ 0x2F90), 32512, arg2, arg5);
                    }
                }
            } else if (arg3 == 3) {
                class106 var11 = (class106) class149.method941(arg1, arg5, arg7);
                if (var11 != null) {
                    if (var11 instanceof class230) {
                        ((class230) var11).field3476.method842(arg0, (byte) 51);
                    } else {
                        class420.method2466(arg7, arg1, arg0, arg6, arg3, var11.method106(arg4 + 12176), 32512, arg2, arg5);
                    }
                }
            }
        }
        if (arg4 != 5) {
            field394 = 111;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method212(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
