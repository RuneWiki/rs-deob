import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class421 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Luq;")
    private class313 field5733;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field5732;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([BI)V")
    public final void method2488(byte[] arg0, int arg1) {
        if (this.field5732 == null || this.field5732.getSize() < arg1) {
            this.field5732 = this.field5733.field4202.method3194(arg1, false);
        }
        this.field5732.method2375(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Luq;[BI)V")
    public class421(class313 arg0, byte[] arg1, int arg2) {
        this.field5733 = arg0;
        this.field5732 = this.field5733.field4202.method3194(arg2, false);
        if (arg1 != null) {
            this.field5732.method2375(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Luq;Ljaclib/memory/Buffer;)V")
    public class421(class313 arg0, Buffer arg1) {
        this.field5733 = arg0;
        this.field5732 = arg1;
    }
}
