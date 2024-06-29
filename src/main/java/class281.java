import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class281 {

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lji;")
    private class622 field3671;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field3670;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1688(byte[] arg0, int arg1) {
        if (this.field3670 == null || this.field3670.getSize() < arg1) {
            this.field3670 = this.field3671.field8572.method1950(arg1, false);
        }
        this.field3670.method125(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lji;[BI)V", line = 12)
    public class281(class622 arg0, byte[] arg1, int arg2) {
        this.field3671 = arg0;
        this.field3670 = this.field3671.field8572.method1950(arg2, false);
        if (arg1 != null) {
            this.field3670.method125(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lji;Ljaclib/memory/Buffer;)V", line = 21)
    public class281(class622 arg0, Buffer arg1) {
        this.field3671 = arg0;
        this.field3670 = arg1;
    }
}
