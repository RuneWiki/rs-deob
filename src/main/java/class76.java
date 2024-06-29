import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class76 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Ljj;")
    private class66 field1393;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1392;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BI)V", line = 7)
    public final void method723(byte[] arg0, int arg1) {
        if (this.field1392 == null || this.field1392.getSize() < arg1) {
            this.field1392 = this.field1393.field1133.method3233(arg1, false);
        }
        this.field1392.method2410(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljj;[BI)V", line = 12)
    public class76(class66 arg0, byte[] arg1, int arg2) {
        this.field1393 = arg0;
        this.field1392 = this.field1393.field1133.method3233(arg2, false);
        if (arg1 != null) {
            this.field1392.method2410(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljj;Ljaclib/memory/Buffer;)V", line = 21)
    public class76(class66 arg0, Buffer arg1) {
        this.field1393 = arg0;
        this.field1392 = arg1;
    }
}
