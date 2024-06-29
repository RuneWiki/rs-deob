import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class171 {

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "Lok;")
    private class228 field2439;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field2438;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "([BI)V")
    public final void method1170(byte[] arg0, int arg1) {
        if (this.field2438 == null || this.field2438.getSize() < arg1) {
            this.field2438 = this.field2439.field3406.method3468(arg1, false);
        }
        this.field2438.method2661(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lok;[BI)V")
    public class171(class228 arg0, byte[] arg1, int arg2) {
        this.field2439 = arg0;
        this.field2438 = this.field2439.field3406.method3468(arg2, false);
        if (arg1 != null) {
            this.field2438.method2661(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lok;Ljaclib/memory/Buffer;)V")
    public class171(class228 arg0, Buffer arg1) {
        this.field2439 = arg0;
        this.field2438 = arg1;
    }
}
