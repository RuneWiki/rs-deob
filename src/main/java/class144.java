import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class144 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Lkga;")
    private class506 field1791;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1792;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([BI)V")
    public final void method936(byte[] arg0, int arg1) {
        if (this.field1792 == null || this.field1792.getSize() < arg1) {
            this.field1792 = this.field1791.field7262.method3569(arg1, false);
        }
        this.field1792.method2668(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lkga;[BI)V")
    public class144(class506 arg0, byte[] arg1, int arg2) {
        this.field1791 = arg0;
        this.field1792 = this.field1791.field7262.method3569(arg2, false);
        if (arg1 != null) {
            this.field1792.method2668(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lkga;Ljaclib/memory/Buffer;)V")
    public class144(class506 arg0, Buffer arg1) {
        this.field1791 = arg0;
        this.field1792 = arg1;
    }
}
