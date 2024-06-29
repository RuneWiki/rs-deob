import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class121 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Z")
    public static boolean field1985 = true;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Z")
    public static boolean field1986 = false;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1988 = 0;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lok;")
    private static class146 field1993 = class235.method1724(-12908, "flash2:");

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lok;")
    public static class146 field1994 = class235.method1724(-12908, "<col=ffb000>");

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lok;")
    public static class146 field1991 = field1993;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lok;")
    public static class146 field1989 = field1993;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Loh;")
    public static class15 field1995;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIII)V", line = 45)
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 1983162704) {
            field1994 = (class146) null;
        }
        field1987++;
        int var9 = arg1 - arg3;
        int var10 = (arg8 - arg6 << 16) / var9;
        int var11 = arg0 - arg5;
        int var12 = (arg4 - arg7 << 16) / var11;
        class43.method306(0, var10, 0, arg7, var12, arg3, (byte) 9, arg0, arg6, arg1, arg5);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z", line = 95)
    public static final boolean method842(boolean arg0) {
        field1992++;
        if (class305.field5226) {
            try {
                class179.field3010.method1084(-107, class232.field3876.field2162);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0) {
            field1985 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 118)
    public static void method843(int arg0) {
        field1989 = null;
        field1993 = null;
        field1991 = null;
        field1994 = null;
        field1995 = null;
        int var1 = 1 / ((-arg0 - 50) / 45);
    }
}
