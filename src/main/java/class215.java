import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class215 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lbi;")
    private class483 field2848;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field2847;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lbi;[BI)V", line = 4)
    public class215(class483 arg0, byte[] arg1, int arg2) {
        this.field2848 = arg0;
        this.field2847 = this.field2848.field6778.method3781(arg2, false);
        if (arg1 != null) {
            this.field2847.method2885(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lbi;Ljaclib/memory/Buffer;)V", line = 13)
    public class215(class483 arg0, Buffer arg1) {
        this.field2848 = arg0;
        this.field2847 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BI)V", line = 22)
    public final void method1374(byte[] arg0, int arg1) {
        if (this.field2847 == null || this.field2847.getSize() < arg1) {
            this.field2847 = this.field2848.field6778.method3781(arg1, false);
        }
        this.field2847.method2885(arg0, 0, 0, arg1);
    }
}
