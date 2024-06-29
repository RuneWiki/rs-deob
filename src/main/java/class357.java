import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class357 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lffa;")
    private class197 field5477;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field5478;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BI)V", line = 5)
    public final void method2920(byte[] arg0, int arg1) {
        if (this.field5478 == null || this.field5478.getSize() < arg1) {
            this.field5478 = this.field5477.field2848.method5097(arg1, false);
        }
        this.field5478.method3847(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lffa;[BI)V", line = 12)
    public class357(class197 arg0, byte[] arg1, int arg2) {
        this.field5477 = arg0;
        this.field5478 = this.field5477.field2848.method5097(arg2, false);
        if (arg1 != null) {
            this.field5478.method3847(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lffa;Ljaclib/memory/Buffer;)V", line = 21)
    public class357(class197 arg0, Buffer arg1) {
        this.field5477 = arg0;
        this.field5478 = arg1;
    }
}
