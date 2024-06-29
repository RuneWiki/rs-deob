import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class633 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Llea;")
    private class573 field8947;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field8946;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)V")
    public final void method3612(byte[] arg0, int arg1) {
        if (this.field8946 == null || this.field8946.getSize() < arg1) {
            this.field8946 = this.field8947.field8135.method2247(arg1, false);
        }
        this.field8946.method236(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Llea;[BI)V")
    public class633(class573 arg0, byte[] arg1, int arg2) {
        this.field8947 = arg0;
        this.field8946 = this.field8947.field8135.method2247(arg2, false);
        if (arg1 != null) {
            this.field8946.method236(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Llea;Ljaclib/memory/Buffer;)V")
    public class633(class573 arg0, Buffer arg1) {
        this.field8947 = arg0;
        this.field8946 = arg1;
    }
}
