import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class331 {

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lkw;")
    private class346 field4495;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field4494;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([BI)V")
    public final void method2038(byte[] arg0, int arg1) {
        if (this.field4494 == null || this.field4494.getSize() < arg1) {
            this.field4494 = this.field4495.field4972.method2568(arg1, false);
        }
        this.field4494.method2566(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lkw;[BI)V")
    public class331(class346 arg0, byte[] arg1, int arg2) {
        this.field4495 = arg0;
        this.field4494 = this.field4495.field4972.method2568(arg2, false);
        if (arg1 != null) {
            this.field4494.method2566(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lkw;Ljaclib/memory/Buffer;)V")
    public class331(class346 arg0, Buffer arg1) {
        this.field4495 = arg0;
        this.field4494 = arg1;
    }
}
