import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class95 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lrs;")
    private class166 field1416;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1415;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lrs;[BI)V")
    public class95(class166 arg0, byte[] arg1, int arg2) {
        this.field1416 = arg0;
        this.field1415 = this.field1416.field2754.method2591(arg2, false);
        if (arg1 != null) {
            this.field1415.method2587(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lrs;Ljaclib/memory/Buffer;)V")
    public class95(class166 arg0, Buffer arg1) {
        this.field1416 = arg0;
        this.field1415 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([BI)V")
    public final void method788(byte[] arg0, int arg1) {
        if (this.field1415 == null || this.field1415.getSize() < arg1) {
            this.field1415 = this.field1416.field2754.method2591(arg1, false);
        }
        this.field1415.method2587(arg0, 0, 0, arg1);
    }
}
