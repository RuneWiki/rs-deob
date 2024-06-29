import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class308 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lvj;")
    private class422 field3799;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field3798;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BI)V")
    public final void method1769(byte[] arg0, int arg1) {
        if (this.field3798 == null || this.field3798.getSize() < arg1) {
            this.field3798 = this.field3799.field5820.method3462(arg1, false);
        }
        this.field3798.method2506(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lvj;[BI)V")
    public class308(class422 arg0, byte[] arg1, int arg2) {
        this.field3799 = arg0;
        this.field3798 = this.field3799.field5820.method3462(arg2, false);
        if (arg1 != null) {
            this.field3798.method2506(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lvj;Ljaclib/memory/Buffer;)V")
    public class308(class422 arg0, Buffer arg1) {
        this.field3799 = arg0;
        this.field3798 = arg1;
    }
}
