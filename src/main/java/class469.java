import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class469 {

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lno;")
    private class658 field6285;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field6284;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([BI)V")
    public final void method2644(byte[] arg0, int arg1) {
        if (this.field6284 == null || this.field6284.getSize() < arg1) {
            this.field6284 = this.field6285.field9185.method3467(arg1, false);
        }
        this.field6284.method2584(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lno;[BI)V")
    public class469(class658 arg0, byte[] arg1, int arg2) {
        this.field6285 = arg0;
        this.field6284 = this.field6285.field9185.method3467(arg2, false);
        if (arg1 != null) {
            this.field6284.method2584(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lno;Ljaclib/memory/Buffer;)V")
    public class469(class658 arg0, Buffer arg1) {
        this.field6285 = arg0;
        this.field6284 = arg1;
    }
}
