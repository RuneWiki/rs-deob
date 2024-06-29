import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class378 extends OutputStream {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field5078;

    // $FF: synthetic field
    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field5079;

    // $FF: synthetic method
    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2219(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public static final void method2218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5078++;
        if (arg3 <= 115 || arg7 < 0 || arg5 < 0 || arg7 >= (class34.field530 - 1) || arg5 >= class34.field531 - 1) {
            return;
        }
        if (class703.field9899 == null) {
            return;
        }
        if (arg1 == 0) {
            class532 var8 = (class532) class219.method1390(arg6, arg7, arg5);
            class532 var9 = (class532) class93.method736(arg6, arg7, arg5);
            if (var8 != null && arg0 != 2) {
                if ((var8 instanceof class653)) {
                    ((class653) var8).field8826.method504(arg2, (byte) -120);
                } else {
                    class585.method3217(arg1, arg2, arg0, arg5, arg6, -100, arg4, var8.method146(false), arg7);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class653)) {
                    class585.method3217(arg1, arg2, arg0, arg5, arg6, -87, arg4, var9.method146(false), arg7);
                    return;
                }
                ((class653) var9).field8826.method504(arg2, (byte) -115);
                return;
            }
            return;
        }
        if (arg1 == 1) {
            class532 var10 = (class532) class74.method581(arg6, arg7, arg5);
            if (var10 != null) {
                if (!(var10 instanceof class558)) {
                    int var11 = var10.method146(false);
                    if (arg0 != 4 && arg0 != 5) {
                        if (arg0 == 6) {
                            class585.method3217(arg1, arg2, 4, arg5, arg6, -93, arg4 + 4, var11, arg7);
                        } else if (arg0 == 7) {
                            class585.method3217(arg1, arg2, 4, arg5, arg6, -124, (arg4 + 2 & 0x3) + 4, var11, arg7);
                            return;
                        } else if (arg0 == 8) {
                            class585.method3217(arg1, arg2, 4, arg5, arg6, -74, arg4 + 4, var11, arg7);
                            class585.method3217(arg1, arg2, 4, arg5, arg6, -77, (arg4 + 2 & 0x3) + 4, var11, arg7);
                            return;
                        }
                        return;
                    }
                    class585.method3217(arg1, arg2, 4, arg5, arg6, -122, arg4, var11, arg7);
                    return;
                }
                ((class558) var10).field7406.method504(arg2, (byte) -115);
                return;
            }
            return;
        }
        if (arg1 == 2) {
            class532 var12 = (class532) class503.method2793(arg6, arg7, arg5, field5079 == null ? (field5079 = method2219("qi")) : field5079);
            if (var12 != null) {
                if (arg0 == 11) {
                    arg0 = 10;
                }
                if (!(var12 instanceof class479)) {
                    class585.method3217(arg1, arg2, arg0, arg5, arg6, -93, arg4, var12.method146(false), arg7);
                    return;
                }
                ((class479) var12).field6389.method504(arg2, (byte) -108);
                return;
            }
            return;
        }
        if (arg1 != 3) {
            return;
        }
        class532 var13 = (class532) class34.method269(arg6, arg7, arg5);
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class396) {
            ((class396) var13).field5261.method504(arg2, (byte) -124);
            return;
        }
        class585.method3217(arg1, arg2, arg0, arg5, arg6, -74, arg4, var13.method146(false), arg7);
        return;
    }

    @OriginalMember(owner = "client!we", name = "write", descriptor = "(I)V", line = 128)
    public final void write(int arg0) throws IOException {
        field5077++;
        throw new IOException();
    }
}
