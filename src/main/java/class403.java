import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class403 {

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "Loea;")
    private class594 field5626;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field5625;

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Loea;[BI)V", line = 4)
    public class403(class594 arg0, byte[] arg1, int arg2) {
        this.field5626 = arg0;
        this.field5625 = this.field5626.field8543.method3758(arg2, false);
        if (arg1 != null) {
            this.field5625.method2905(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Loea;Ljaclib/memory/Buffer;)V", line = 13)
    public class403(class594 arg0, Buffer arg1) {
        this.field5626 = arg0;
        this.field5625 = arg1;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "([BI)V", line = 22)
    public final void method2483(byte[] arg0, int arg1) {
        if (this.field5625 == null || this.field5625.getSize() < arg1) {
            this.field5625 = this.field5626.field8543.method3758(arg1, false);
        }
        this.field5625.method2905(arg0, 0, 0, arg1);
    }
}
