import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class649 {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Lad;")
    private class362 field9373;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field9374;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([BI)V")
    public final void method3711(byte[] arg0, int arg1) {
        if (this.field9374 == null || this.field9374.getSize() < arg1) {
            this.field9374 = this.field9373.field5353.method3408(arg1, false);
        }
        this.field9374.method2635(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lad;[BI)V")
    public class649(class362 arg0, byte[] arg1, int arg2) {
        this.field9373 = arg0;
        this.field9374 = this.field9373.field5353.method3408(arg2, false);
        if (arg1 != null) {
            this.field9374.method2635(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lad;Ljaclib/memory/Buffer;)V")
    public class649(class362 arg0, Buffer arg1) {
        this.field9373 = arg0;
        this.field9374 = arg1;
    }
}
