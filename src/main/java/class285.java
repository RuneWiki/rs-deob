import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class285 {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Lbl;")
    private class442 field4316;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field4317;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1739(byte[] arg0, int arg1) {
        if (this.field4317 == null || this.field4317.field6071 < arg1) {
            this.field4317 = this.field4316.field6690.method2490(arg1);
        }
        this.field4317.method2480(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lbl;[BI)V", line = 12)
    public class285(class442 arg0, byte[] arg1, int arg2) {
        this.field4316 = arg0;
        this.field4317 = this.field4316.field6690.method2490(arg2);
        if (arg1 != null) {
            this.field4317.method2480(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lbl;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class285(class442 arg0, NativeBuffer arg1) {
        this.field4316 = arg0;
        this.field4317 = arg1;
    }
}
