import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class157 {

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Lnv;")
    private class439 field1955;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "J")
    public long field1958;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Lhj;")
    public static class596 field1954 = new class596(4, 7);

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lhj;")
    public static class596 field1957 = new class596(23, 7);

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static void method1108(byte arg0) {
        field1954 = null;
        if (arg0 != 69) {
            method1108((byte) 4);
        }
        field1957 = null;
    }

    @OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1959++;
        this.field1955.method2588(4654, this.field1958);
        super.finalize();
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lnv;J[Lpj;)V")
    public class157(class439 arg0, long arg1, class158[] arg2) {
        this.field1955 = arg0;
        this.field1958 = arg1;
    }
}
