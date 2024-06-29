import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class94 {

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "Lpc;")
    private class700 field1238;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field1237;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "([BI)V", line = 7)
    public final void method828(byte[] arg0, int arg1) {
        if (this.field1237 == null || this.field1237.getSize() < arg1) {
            this.field1237 = this.field1238.field9725.method3977(arg1, false);
        }
        this.field1237.method3069(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lpc;[BI)V", line = 12)
    public class94(class700 arg0, byte[] arg1, int arg2) {
        this.field1238 = arg0;
        this.field1237 = this.field1238.field9725.method3977(arg2, false);
        if (arg1 != null) {
            this.field1237.method3069(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lpc;Ljaclib/memory/Buffer;)V", line = 21)
    public class94(class700 arg0, Buffer arg1) {
        this.field1238 = arg0;
        this.field1237 = arg1;
    }
}
