import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class526 {

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field6681 = -1;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "Lwm;")
    public static class30 field6686;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "Lfl;")
    public static class545 field6688;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hha", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field6689;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "[B")
    public byte[] field6687;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "[S")
    public short[] field6682;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "[S")
    public short[] field6683;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "[S")
    public short[] field6684;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2891(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IZIIIIII)V", line = 11)
    public static final void method2889(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6685++;
        if (arg1) {
            field6681 = 81;
        }
        if (arg0 < 0 || arg5 < 0 || arg0 >= class240.field3280 - 1 || arg5 >= class276.field3602 - 1) {
            return;
        }
        if (class28.field252 == null) {
            return;
        }
        if (arg6 == 0) {
            class274 var8 = (class274) class127.method741(arg2, arg0, arg5);
            class274 var9 = (class274) class558.method3028(arg2, arg0, arg5);
            if (var8 != null && arg3 != 2) {
                if ((var8 instanceof class219)) {
                    ((class219) var8).field2986.method3448(false, arg4);
                } else {
                    class216.method1422(arg6, arg3, var8.method1010(-6546), arg4, arg7, arg0, 17393, arg2, arg5);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class219)) {
                    class216.method1422(arg6, arg3, var9.method1010(-6546), arg4, arg7, arg0, 17393, arg2, arg5);
                    return;
                }
                ((class219) var9).field2986.method3448(false, arg4);
                return;
            }
            return;
        }
        if (arg6 == 1) {
            class274 var10 = (class274) class14.method60(arg2, arg0, arg5);
            if (var10 != null) {
                if (!(var10 instanceof class572)) {
                    int var11 = var10.method1010(-6546);
                    if (arg3 != 4 && arg3 != 5) {
                        if (arg3 == 6) {
                            class216.method1422(arg6, 4, var11, arg4, arg7 + 4, arg0, 17393, arg2, arg5);
                            return;
                        }
                        if (arg3 == 7) {
                            class216.method1422(arg6, 4, var11, arg4, (arg7 + 2 & 0x3) + 4, arg0, 17393, arg2, arg5);
                        } else if (arg3 == 8) {
                            class216.method1422(arg6, 4, var11, arg4, arg7 + 4, arg0, 17393, arg2, arg5);
                            class216.method1422(arg6, 4, var11, arg4, (arg7 + 2 & 0x3) + 4, arg0, 17393, arg2, arg5);
                            return;
                        }
                        return;
                    }
                    class216.method1422(arg6, 4, var11, arg4, arg7, arg0, 17393, arg2, arg5);
                    return;
                }
                ((class572) var10).field7231.method3448(false, arg4);
                return;
            }
            return;
        }
        if (arg6 != 2) {
            if (arg6 == 3) {
                class274 var12 = (class274) class740.method4019(arg2, arg0, arg5);
                if (var12 != null) {
                    if (!(var12 instanceof class158)) {
                        class216.method1422(arg6, arg3, var12.method1010(-6546), arg4, arg7, arg0, 17393, arg2, arg5);
                        return;
                    }
                    ((class158) var12).field2042.method3448(false, arg4);
                    return;
                }
            }
            return;
        }
        class274 var13 = (class274) class238.method1571(arg2, arg0, arg5, field6689 == null ? (field6689 = method2891("aia")) : field6689);
        if (var13 == null) {
            return;
        }
        if (arg3 == 11) {
            arg3 = 10;
        }
        if (var13 instanceof class396) {
            ((class396) var13).field5216.method3448(false, arg4);
            return;
        }
        class216.method1422(arg6, arg3, var13.method1010(-6546), arg4, arg7, arg0, 17393, arg2, arg5);
        return;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V", line = 131)
    public static void method2890(boolean arg0) {
        field6688 = null;
        field6686 = null;
        if (arg0) {
            field6681 = 109;
        }
    }
}
