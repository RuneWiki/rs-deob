import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class371 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Ldia;")
    private class246 field5375;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field5374;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)V")
    public final void method2304(byte[] arg0, int arg1) {
        if (this.field5374 == null || this.field5374.getSize() < arg1) {
            this.field5374 = this.field5375.field3533.method3913(arg1, false);
        }
        this.field5374.method2980(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ldia;[BI)V")
    public class371(class246 arg0, byte[] arg1, int arg2) {
        this.field5375 = arg0;
        this.field5374 = this.field5375.field3533.method3913(arg2, false);
        if (arg1 != null) {
            this.field5374.method2980(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ldia;Ljaclib/memory/Buffer;)V")
    public class371(class246 arg0, Buffer arg1) {
        this.field5375 = arg0;
        this.field5374 = arg1;
    }
}
