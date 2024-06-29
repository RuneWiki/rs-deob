import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class133 extends class60 {

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field2117 = -2;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Lea;")
    public static class217 field2112;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "Ltk;")
    public static class266 field2119;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIILeh;IJ)Z", line = 3)
    public static final boolean method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class179 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class75.method596(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V", line = 17)
    public static final void method1028(byte arg0) {
        if (arg0 != -91) {
            field2114 = -55;
        }
        class100.field1595++;
        field2115++;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(II)V", line = 37)
    public class133(int arg0, int arg1) {
        this.field2113 = arg0;
        this.field2111 = arg1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 47)
    public static void method1029(int arg0) {
        if (arg0 > -37) {
            field2112 = (class217) null;
        }
        field2112 = null;
        field2119 = null;
    }
}
