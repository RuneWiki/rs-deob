import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class205 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lbd;")
    public static class162 field3459 = class17.method142(0, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lbd;")
    public static class162 field3460 = class17.method142(0, "mem=");

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lob;")
    public static class78 field3464 = null;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lob;")
    public static class78 field3458;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 4)
    public static void method1518(byte arg0) {
        field3460 = null;
        field3458 = null;
        if (arg0 == -67) {
            field3459 = null;
            field3464 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 33)
    public static final int method1519(int arg0) {
        field3463++;
        return arg0 == 128 ? class305.field5141 : 90;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIILrk;IJ)Z", line = 52)
    public static final boolean method1520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class255 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class188.method1409(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 73)
    public static final void method1521(int arg0) {
        class23.field370 = null;
        field3461++;
        class279.field4701 = null;
        if (arg0 != 18547) {
            field3460 = (class162) null;
        }
        class223.field3728 = null;
    }
}
