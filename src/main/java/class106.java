import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class106 {

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Llj;")
    private class565 field1488;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1487;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([BI)V", line = 7)
    public final void method777(byte[] arg0, int arg1) {
        if (this.field1487 == null || this.field1487.getSize() < arg1) {
            this.field1487 = this.field1488.field7835.method3474(arg1, false);
        }
        this.field1487.method2548(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Llj;[BI)V", line = 12)
    public class106(class565 arg0, byte[] arg1, int arg2) {
        this.field1488 = arg0;
        this.field1487 = this.field1488.field7835.method3474(arg2, false);
        if (arg1 != null) {
            this.field1487.method2548(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Llj;Ljaclib/memory/Buffer;)V", line = 21)
    public class106(class565 arg0, Buffer arg1) {
        this.field1488 = arg0;
        this.field1487 = arg1;
    }
}
