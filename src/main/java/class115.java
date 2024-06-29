import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class115 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "J")
    public long field1486;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Llm;")
    private class337 field1489;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lae;")
    public static class40 field1487 = new class40();

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method636(int arg0) {
        field1487 = null;
        if (arg0 != 32165) {
            method636(115);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Llm;J[Lcb;)V")
    public class115(class337 arg0, long arg1, class80[] arg2) {
        this.field1486 = arg1;
        this.field1489 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1485++;
        this.field1489.method1895(true, this.field1486);
        super.finalize();
    }
}
