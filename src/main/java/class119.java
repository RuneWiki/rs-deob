import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class119 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1684 = 52;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[Lph;")
    public static class386[] field1683 = new class386[14];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lir;")
    public static class19 field1682;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZIIIII)V", line = 5)
    public static final void method818(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            method818(59, 1, false, 56, 3, -2, -47, 100);
        }
        field1681++;
        if (class154.field2161 <= arg5 && arg0 <= class233.field3350 && arg1 >= class290.field4058 && arg7 <= class442.field6212) {
            class85.method613(arg5, arg3, 4096, arg6, arg1, arg0, arg7, arg4);
        } else {
            class240.method1633(arg0, arg7, arg5, arg4, arg1, arg6, (byte) 16, arg3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 40)
    public static void method819(byte arg0) {
        if (arg0 < -119) {
            field1683 = null;
            field1682 = null;
        }
    }
}
