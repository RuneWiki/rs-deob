import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class384 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Leea;")
    private class131 field5475;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field5474;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BI)V", line = 6)
    public final void method2435(byte[] arg0, int arg1) {
        if (this.field5474 == null || this.field5474.getSize() < arg1) {
            this.field5474 = this.field5475.field1788.method3649(arg1, false);
        }
        this.field5474.method2899(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Leea;[BI)V", line = 12)
    public class384(class131 arg0, byte[] arg1, int arg2) {
        this.field5475 = arg0;
        this.field5474 = this.field5475.field1788.method3649(arg2, false);
        if (arg1 != null) {
            this.field5474.method2899(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Leea;Ljaclib/memory/Buffer;)V", line = 21)
    public class384(class131 arg0, Buffer arg1) {
        this.field5475 = arg0;
        this.field5474 = arg1;
    }
}
