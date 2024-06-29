import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class171 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lod;")
    private class349 field2532;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field2533;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lod;[BI)V")
    public class171(class349 arg0, byte[] arg1, int arg2) {
        this.field2532 = arg0;
        this.field2533 = this.field2532.field5230.method2646(arg2);
        if (arg1 != null) {
            this.field2533.method2635(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lod;Ljaggl/memory/NativeBuffer;)V")
    public class171(class349 arg0, NativeBuffer arg1) {
        this.field2532 = arg0;
        this.field2533 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BI)V")
    public final void method1179(byte[] arg0, int arg1) {
        if (this.field2533 == null || this.field2533.field6552 < arg1) {
            this.field2533 = this.field2532.field5230.method2646(arg1);
        }
        this.field2533.method2635(arg0, 0, arg1);
    }
}
