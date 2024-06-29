import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class95 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Luj;")
    public static class156 field1461 = new class156();

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lob;")
    public static class294 field1463;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field1464;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[[B")
    public static byte[][] field1465;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 14)
    public static void method646(int arg0) {
        field1461 = null;
        if (arg0 != -1) {
            method646(-119);
        }
        field1464 = null;
        field1465 = (byte[][]) null;
        field1463 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBIIIII)V", line = 29)
    public static final void method647(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1462++;
        if (arg0 == arg4) {
            class164.method1039(arg3, arg2 - 569653500, arg7, arg1, arg6, arg4, arg5);
            return;
        }
        if (arg2 != 98) {
            field1464 = (int[]) null;
        }
        if (class79.field1226 <= (arg5 - arg4) && class59.field957 >= arg5 + arg4 && class108.field1650 <= arg3 - arg0 && class236.field3800 >= arg0 + arg3) {
            class196.method1258(arg4, arg7, (byte) 116, arg5, arg6, arg1, arg0, arg3);
        } else {
            class153.method980(arg6, arg5, arg0, -52, arg1, arg3, arg4, arg7);
        }
    }
}
