import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class122 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lmh;")
    private class537 field1520;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1519;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BI)V")
    public final void method707(byte[] arg0, int arg1) {
        if (this.field1519 == null || this.field1519.getSize() < arg1) {
            this.field1519 = this.field1520.field7733.method3336(arg1, false);
        }
        this.field1519.method2339(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lmh;[BI)V")
    public class122(class537 arg0, byte[] arg1, int arg2) {
        this.field1520 = arg0;
        this.field1519 = this.field1520.field7733.method3336(arg2, false);
        if (arg1 != null) {
            this.field1519.method2339(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lmh;Ljaclib/memory/Buffer;)V")
    public class122(class537 arg0, Buffer arg1) {
        this.field1520 = arg0;
        this.field1519 = arg1;
    }
}
