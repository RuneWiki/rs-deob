import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class478 {

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "Lck;")
    private class733 field6193;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field6194;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([BI)V", line = 5)
    public final void method2685(byte[] arg0, int arg1) {
        if (this.field6194 == null || this.field6194.getSize() < arg1) {
            this.field6194 = this.field6193.field9806.method2532(arg1, false);
        }
        this.field6194.method2529(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lck;[BI)V", line = 12)
    public class478(class733 arg0, byte[] arg1, int arg2) {
        this.field6193 = arg0;
        this.field6194 = this.field6193.field9806.method2532(arg2, false);
        if (arg1 != null) {
            this.field6194.method2529(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lck;Ljaclib/memory/Buffer;)V", line = 21)
    public class478(class733 arg0, Buffer arg1) {
        this.field6193 = arg0;
        this.field6194 = arg1;
    }
}
