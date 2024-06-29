import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class584 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ljaa;")
    private class576 field7849;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field7848;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([BI)V")
    public final void method3242(byte[] arg0, int arg1) {
        if (this.field7848 == null || this.field7848.getSize() < arg1) {
            this.field7848 = this.field7849.field7591.method3516(arg1, false);
        }
        this.field7848.method2480(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljaa;[BI)V")
    public class584(class576 arg0, byte[] arg1, int arg2) {
        this.field7849 = arg0;
        this.field7848 = this.field7849.field7591.method3516(arg2, false);
        if (arg1 != null) {
            this.field7848.method2480(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljaa;Ljaclib/memory/Buffer;)V")
    public class584(class576 arg0, Buffer arg1) {
        this.field7849 = arg0;
        this.field7848 = arg1;
    }
}
