import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class663 {

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Llf;")
    private class250 field8910;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field8911;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([BI)V")
    public final void method3664(byte[] arg0, int arg1) {
        if (this.field8911 == null || this.field8911.getSize() < arg1) {
            this.field8911 = this.field8910.field3518.method3794(arg1, false);
        }
        this.field8911.method2976(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Llf;[BI)V")
    public class663(class250 arg0, byte[] arg1, int arg2) {
        this.field8910 = arg0;
        this.field8911 = this.field8910.field3518.method3794(arg2, false);
        if (arg1 != null) {
            this.field8911.method2976(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Llf;Ljaclib/memory/Buffer;)V")
    public class663(class250 arg0, Buffer arg1) {
        this.field8910 = arg0;
        this.field8911 = arg1;
    }
}
