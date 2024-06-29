import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class250 {

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "Lep;")
    private class371 field3473;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field3472;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([BI)V", line = 7)
    public final void method1589(byte[] arg0, int arg1) {
        if (this.field3472 == null || this.field3472.getSize() < arg1) {
            this.field3472 = this.field3473.field4949.method2558(arg1, false);
        }
        this.field3472.method2556(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lep;[BI)V", line = 12)
    public class250(class371 arg0, byte[] arg1, int arg2) {
        this.field3473 = arg0;
        this.field3472 = this.field3473.field4949.method2558(arg2, false);
        if (arg1 != null) {
            this.field3472.method2556(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lep;Ljaclib/memory/Buffer;)V", line = 21)
    public class250(class371 arg0, Buffer arg1) {
        this.field3473 = arg0;
        this.field3472 = arg1;
    }
}
