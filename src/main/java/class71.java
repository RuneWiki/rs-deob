import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class71 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lbv;")
    private class282 field974;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field975;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)V", line = 5)
    public final void method482(byte[] arg0, int arg1) {
        if (this.field975 == null || this.field975.field293 < arg1) {
            this.field975 = this.field974.field4084.method159(arg1);
        }
        this.field975.method150(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lbv;[BI)V", line = 12)
    public class71(class282 arg0, byte[] arg1, int arg2) {
        this.field974 = arg0;
        this.field975 = this.field974.field4084.method159(arg2);
        if (arg1 != null) {
            this.field975.method150(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lbv;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class71(class282 arg0, NativeBuffer arg1) {
        this.field974 = arg0;
        this.field975 = arg1;
    }
}
