import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class621 {

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "Lqj;")
    private class548 field8674;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field8673;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([BI)V", line = 5)
    public final void method3406(byte[] arg0, int arg1) {
        if (this.field8673 == null || this.field8673.getSize() < arg1) {
            this.field8673 = this.field8674.field7481.method3414(arg1, false);
        }
        this.field8673.method2304(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lqj;[BI)V", line = 12)
    public class621(class548 arg0, byte[] arg1, int arg2) {
        this.field8674 = arg0;
        this.field8673 = this.field8674.field7481.method3414(arg2, false);
        if (arg1 != null) {
            this.field8673.method2304(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lqj;Ljaclib/memory/Buffer;)V", line = 21)
    public class621(class548 arg0, Buffer arg1) {
        this.field8674 = arg0;
        this.field8673 = arg1;
    }
}
