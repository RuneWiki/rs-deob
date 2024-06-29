import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class137 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lnv;")
    private class417 field1555;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1556;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BI)V")
    public final void method873(byte[] arg0, int arg1) {
        if (this.field1556 == null || this.field1556.getSize() < arg1) {
            this.field1556 = this.field1555.field5918.method3806(arg1, false);
        }
        this.field1556.method2917(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lnv;[BI)V")
    public class137(class417 arg0, byte[] arg1, int arg2) {
        this.field1555 = arg0;
        this.field1556 = this.field1555.field5918.method3806(arg2, false);
        if (arg1 != null) {
            this.field1556.method2917(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lnv;Ljaclib/memory/Buffer;)V")
    public class137(class417 arg0, Buffer arg1) {
        this.field1555 = arg0;
        this.field1556 = arg1;
    }
}
