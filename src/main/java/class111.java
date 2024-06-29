import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class111 {

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "J")
    public long field1549;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lwh;")
    private class148 field1552;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Lvd;")
    public static class39 field1553;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Lql;")
    public static class738 field1551;

    @OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field1548++;
        this.field1552.method1077(this.field1549, (byte) -103);
        super.finalize();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZII)Z", line = 14)
    public static final boolean method833(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method834(-64);
        }
        field1550++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lwh;J[Lwj;)V", line = 30)
    public class111(class148 arg0, long arg1, class396[] arg2) {
        this.field1549 = arg1;
        this.field1552 = arg0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 42)
    public static void method834(int arg0) {
        field1551 = null;
        if (arg0 != 2048) {
            method834(-96);
        }
        field1553 = null;
    }
}
