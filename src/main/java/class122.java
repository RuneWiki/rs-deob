import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class122 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lqfa;")
    private class106 field1902;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1903;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([BI)V")
    public final void method930(byte[] arg0, int arg1) {
        if (this.field1903 == null || this.field1903.getSize() < arg1) {
            this.field1903 = this.field1902.field1435.method3939(arg1, false);
        }
        this.field1903.method3078(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lqfa;[BI)V")
    public class122(class106 arg0, byte[] arg1, int arg2) {
        this.field1902 = arg0;
        this.field1903 = this.field1902.field1435.method3939(arg2, false);
        if (arg1 != null) {
            this.field1903.method3078(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lqfa;Ljaclib/memory/Buffer;)V")
    public class122(class106 arg0, Buffer arg1) {
        this.field1902 = arg0;
        this.field1903 = arg1;
    }
}
