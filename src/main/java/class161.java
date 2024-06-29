import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class161 {

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[[I")
    public static int[][] field2315 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Z")
    public static boolean field2312 = false;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[[I")
    public static int[][] field2313;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1109(int arg0, int arg1, int arg2) {
        if (arg0 >= -51) {
            method1111(52);
        }
        field2314++;
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 15)
    public static final void method1110(int arg0, int arg1) {
        field2316++;
        class191 var2 = class6.method38(arg1, -127, arg0);
        var2.method1284((byte) -97);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 28)
    public static void method1111(int arg0) {
        if (arg0 == 6) {
            field2313 = null;
            field2315 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)Z", line = 39)
    public static final boolean method1112(int arg0, int arg1, int arg2) {
        field2310++;
        if (arg2 != -1) {
            field2315 = null;
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Llt;IBLbga;IILr;Lsp;)V", line = 62)
    public static final void method1113(class627 arg0, int arg1, byte arg2, class324 arg3, int arg4, int arg5, class166 arg6, class588 arg7) {
        field2311++;
        if (arg2 < 91) {
            return;
        }
        int var8 = arg0.field8773 - (arg4 / 2) - 5;
        int var9 = arg1 + 2;
        if (arg7.field8228 != 0) {
            arg6.method1150(arg4 + 10, var9, var8, -1, arg7.field8228, arg1 + arg3.method2038() * arg5 + 1 - var9);
        }
        if (arg7.field8232 != 0) {
            arg6.method1149(arg4 + 10, -4, arg7.field8232, var9, arg5 * arg3.method2038() + arg1 + 1 - var9, var8);
        }
        int var10 = arg7.field8239;
        if (arg0.field8778 && arg7.field8234 != -1) {
            var10 = arg7.field8234;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            String var12 = class32.field508[var11];
            if (var11 < arg5 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method2035(arg6, var12, arg0.field8773, arg1, var10, true);
            arg1 += arg3.method2038();
        }
    }
}
