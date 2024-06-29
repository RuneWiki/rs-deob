import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class321 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lrda;")
    private class663 field4581;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field4582;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([BI)V")
    public final void method1951(byte[] arg0, int arg1) {
        if (this.field4582 == null || this.field4582.getSize() < arg1) {
            this.field4582 = this.field4581.field8948.method3729(arg1, false);
        }
        this.field4582.method2766(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lrda;[BI)V")
    public class321(class663 arg0, byte[] arg1, int arg2) {
        this.field4581 = arg0;
        this.field4582 = this.field4581.field8948.method3729(arg2, false);
        if (arg1 != null) {
            this.field4582.method2766(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lrda;Ljaclib/memory/Buffer;)V")
    public class321(class663 arg0, Buffer arg1) {
        this.field4581 = arg0;
        this.field4582 = arg1;
    }
}
