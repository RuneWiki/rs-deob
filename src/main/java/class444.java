import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class444 {

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "Lkfa;")
    private class382 field6424;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field6425;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([BI)V", line = 6)
    public final void method2590(byte[] arg0, int arg1) {
        if (this.field6425 == null || this.field6425.getSize() < arg1) {
            this.field6425 = this.field6424.field5455.method2026(arg1, false);
        }
        this.field6425.method227(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lkfa;[BI)V", line = 12)
    public class444(class382 arg0, byte[] arg1, int arg2) {
        this.field6424 = arg0;
        this.field6425 = this.field6424.field5455.method2026(arg2, false);
        if (arg1 != null) {
            this.field6425.method227(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lkfa;Ljaclib/memory/Buffer;)V", line = 21)
    public class444(class382 arg0, Buffer arg1) {
        this.field6424 = arg0;
        this.field6425 = arg1;
    }
}
