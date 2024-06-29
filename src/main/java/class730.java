import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class730 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Lml;")
    private class194 field10439;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field10440;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([BI)V")
    public final void method5321(byte[] arg0, int arg1) {
        if (this.field10440 == null || this.field10440.getSize() < arg1) {
            this.field10440 = this.field10439.field2761.method3189(arg1, false);
        }
        this.field10440.method3146(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lml;[BI)V")
    public class730(class194 arg0, byte[] arg1, int arg2) {
        this.field10439 = arg0;
        this.field10440 = this.field10439.field2761.method3189(arg2, false);
        if (arg1 != null) {
            this.field10440.method3146(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lml;Ljaclib/memory/Buffer;)V")
    public class730(class194 arg0, Buffer arg1) {
        this.field10439 = arg0;
        this.field10440 = arg1;
    }
}
