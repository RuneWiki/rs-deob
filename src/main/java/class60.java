import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class60 {

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lbt;")
    private class33 field1079;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field1080;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([BI)V", line = 5)
    public final void method510(byte[] arg0, int arg1) {
        if (this.field1080 == null || this.field1080.field6447 < arg1) {
            this.field1080 = this.field1079.field623.method2654(arg1);
        }
        this.field1080.method2644(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lbt;[BI)V", line = 12)
    public class60(class33 arg0, byte[] arg1, int arg2) {
        this.field1079 = arg0;
        this.field1080 = this.field1079.field623.method2654(arg2);
        if (arg1 != null) {
            this.field1080.method2644(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lbt;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class60(class33 arg0, NativeBuffer arg1) {
        this.field1079 = arg0;
        this.field1080 = arg1;
    }
}
