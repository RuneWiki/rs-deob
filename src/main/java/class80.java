import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class80 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "J")
    public long field1079;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Llm;")
    private class337 field1082;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lrga;")
    public static class280 field1083 = new class280(27, 8);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field1085 = -1;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1082.method1895(true, this.field1079);
        field1081++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Llm;JI)V")
    public class80(class337 arg0, long arg1, int arg2) {
        this.field1079 = arg1;
        this.field1082 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
    public static final boolean method467(int arg0, int arg1) {
        class70.field942 = arg0 + 1 & arg1;
        class173.field2259 = true;
        field1080++;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method468(int arg0) {
        field1083 = null;
        if (arg0 != 65535) {
            method467(123, 75);
        }
    }
}
