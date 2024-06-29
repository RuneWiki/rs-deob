import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class567 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lac;")
    private class541 field7999;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field8000;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BI)V")
    public final void method3191(byte[] arg0, int arg1) {
        if (this.field8000 == null || this.field8000.getSize() < arg1) {
            this.field8000 = this.field7999.field7534.method3778(arg1, false);
        }
        this.field8000.method2739(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lac;[BI)V")
    public class567(class541 arg0, byte[] arg1, int arg2) {
        this.field7999 = arg0;
        this.field8000 = this.field7999.field7534.method3778(arg2, false);
        if (arg1 != null) {
            this.field8000.method2739(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lac;Ljaclib/memory/Buffer;)V")
    public class567(class541 arg0, Buffer arg1) {
        this.field7999 = arg0;
        this.field8000 = arg1;
    }
}
