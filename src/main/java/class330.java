import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class330 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
    public static boolean field4462 = false;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Llga;")
    public static class663 field4458 = new class663(8);

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lsea;")
    public static class648 field4459;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method1958(int arg0, int arg1, int arg2) {
        int var3 = 81 / ((arg0 - 56) / 36);
        field4463++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 19)
    public static void method1959(int arg0) {
        field4458 = null;
        field4459 = null;
        if (arg0 > -42) {
            method1961(32, 37, -78);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIIIIIIILr;[[[BI)V", line = 41)
    public static final void method1960(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class166 arg10, byte[][][] arg11, int arg12) {
        field4461++;
        if (arg5 == 0 || arg3 == 0) {
            return;
        }
        if (!arg0) {
            method1958(110, -121, -80);
        }
        if (arg5 == 9) {
            arg5 = 1;
            arg12 = arg12 + 1 & 0x3;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg12 = arg12 + 3 & 0x3;
        }
        if (arg5 == 11) {
            arg5 = 8;
            arg12 = arg12 + 3 & 0x3;
        }
        arg10.method126(arg6, arg2, arg9, arg1, arg8, arg7, arg11[arg5 - 1][arg12], arg3, arg4);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)V", line = 83)
    public static final void method1961(int arg0, int arg1, int arg2) {
        field4460++;
        class51 var3 = class703.method3938(-1989279584, 0, 15);
        var3.method402((byte) 85);
        var3.field603 = arg0;
        var3.field605 = arg2;
        if (arg1 != 8) {
            field4458 = null;
        }
    }
}
