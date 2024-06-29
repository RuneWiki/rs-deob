import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class683 {

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "Lag;")
    private class469 field9684;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field9683;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([BI)V")
    public final void method3877(byte[] arg0, int arg1) {
        if (this.field9683 == null || this.field9683.getSize() < arg1) {
            this.field9683 = this.field9684.field6398.method3428(arg1, false);
        }
        this.field9683.method2437(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lag;[BI)V")
    public class683(class469 arg0, byte[] arg1, int arg2) {
        this.field9684 = arg0;
        this.field9683 = this.field9684.field6398.method3428(arg2, false);
        if (arg1 != null) {
            this.field9683.method2437(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lag;Ljaclib/memory/Buffer;)V")
    public class683(class469 arg0, Buffer arg1) {
        this.field9684 = arg0;
        this.field9683 = arg1;
    }
}
