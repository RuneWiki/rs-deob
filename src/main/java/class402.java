import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class402 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lpea;")
    private class641 field5700;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field5699;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BI)V", line = 5)
    public final void method2370(byte[] arg0, int arg1) {
        if (this.field5699 == null || this.field5699.getSize() < arg1) {
            this.field5699 = this.field5700.field8944.method1534(arg1, false);
        }
        this.field5699.method1517(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lpea;[BI)V", line = 12)
    public class402(class641 arg0, byte[] arg1, int arg2) {
        this.field5700 = arg0;
        this.field5699 = this.field5700.field8944.method1534(arg2, false);
        if (arg1 != null) {
            this.field5699.method1517(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lpea;Ljaclib/memory/Buffer;)V", line = 21)
    public class402(class641 arg0, Buffer arg1) {
        this.field5700 = arg0;
        this.field5699 = arg1;
    }
}
