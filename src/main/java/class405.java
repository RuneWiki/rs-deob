import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class405 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Len;")
    private class289 field5724;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field5723;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BI)V", line = 6)
    public final void method2314(byte[] arg0, int arg1) {
        if (this.field5723 == null || this.field5723.getSize() < arg1) {
            this.field5723 = this.field5724.field4222.method3413(arg1, false);
        }
        this.field5723.method2562(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Len;[BI)V", line = 12)
    public class405(class289 arg0, byte[] arg1, int arg2) {
        this.field5724 = arg0;
        this.field5723 = this.field5724.field4222.method3413(arg2, false);
        if (arg1 != null) {
            this.field5723.method2562(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Len;Ljaclib/memory/Buffer;)V", line = 21)
    public class405(class289 arg0, Buffer arg1) {
        this.field5724 = arg0;
        this.field5723 = arg1;
    }
}
