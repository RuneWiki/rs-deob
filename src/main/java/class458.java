import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class458 {

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "Lhk;")
    private class111 field6230;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field6229;

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lhk;[BI)V", line = 4)
    public class458(class111 arg0, byte[] arg1, int arg2) {
        this.field6230 = arg0;
        this.field6229 = this.field6230.field1935.method3898(arg2, false);
        if (arg1 != null) {
            this.field6229.method2933(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "([BI)V", line = 16)
    public final void method2637(byte[] arg0, int arg1) {
        if (this.field6229 == null || this.field6229.getSize() < arg1) {
            this.field6229 = this.field6230.field1935.method3898(arg1, false);
        }
        this.field6229.method2933(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lhk;Ljaclib/memory/Buffer;)V", line = 21)
    public class458(class111 arg0, Buffer arg1) {
        this.field6230 = arg0;
        this.field6229 = arg1;
    }
}
