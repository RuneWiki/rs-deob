import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class310 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lmv;")
    public static class295 field4568;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 7)
    public static void method1933(int arg0) {
        field4568 = null;
        if (arg0 != -16477) {
            field4568 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)J")
    public abstract long method1934(byte arg0);
}
