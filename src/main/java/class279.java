import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class279 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Los;")
    private class468 field4145;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field4146;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1757(byte[] arg0, int arg1) {
        if (this.field4146 == null || this.field4146.getSize() < arg1) {
            this.field4146 = this.field4145.field6964.method3320(arg1, false);
        }
        this.field4146.method2380(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Los;[BI)V", line = 12)
    public class279(class468 arg0, byte[] arg1, int arg2) {
        this.field4145 = arg0;
        this.field4146 = this.field4145.field6964.method3320(arg2, false);
        if (arg1 != null) {
            this.field4146.method2380(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Los;Ljaclib/memory/Buffer;)V", line = 21)
    public class279(class468 arg0, Buffer arg1) {
        this.field4145 = arg0;
        this.field4146 = arg1;
    }
}
