import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class294 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4050 = -1;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ldi;")
    public static class83 field4049 = new class83(36, 3);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4053 = 0;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lmg;")
    public static class101 field4051;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Luf;")
    public static class312 field4052;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 17)
    public static void method1736(int arg0) {
        field4052 = null;
        field4049 = null;
        field4051 = null;
        if (arg0 != 0) {
            field4051 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI)V")
    public abstract void method1187(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1185(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1186(int arg0, byte arg1, int arg2);
}
