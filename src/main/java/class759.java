import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class759 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Ldw;")
    private class664 field10578;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field10577;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([BI)V")
    public final void method4209(byte[] arg0, int arg1) {
        if (this.field10577 == null || this.field10577.getSize() < arg1) {
            this.field10577 = this.field10578.field9010.method2623(arg1, false);
        }
        this.field10577.method2620(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ldw;[BI)V")
    public class759(class664 arg0, byte[] arg1, int arg2) {
        this.field10578 = arg0;
        this.field10577 = this.field10578.field9010.method2623(arg2, false);
        if (arg1 != null) {
            this.field10577.method2620(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ldw;Ljaclib/memory/Buffer;)V")
    public class759(class664 arg0, Buffer arg1) {
        this.field10578 = arg0;
        this.field10577 = arg1;
    }
}
