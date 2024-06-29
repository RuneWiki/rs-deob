import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class346 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lrl;")
    private class487 field4997;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field4998;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BI)V", line = 7)
    public final void method2083(byte[] arg0, int arg1) {
        if (this.field4998 == null || this.field4998.field6239 < arg1) {
            this.field4998 = this.field4997.field7318.method2519(arg1);
        }
        this.field4998.method2509(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lrl;[BI)V", line = 12)
    public class346(class487 arg0, byte[] arg1, int arg2) {
        this.field4997 = arg0;
        this.field4998 = this.field4997.field7318.method2519(arg2);
        if (arg1 != null) {
            this.field4998.method2509(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lrl;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class346(class487 arg0, NativeBuffer arg1) {
        this.field4997 = arg0;
        this.field4998 = arg1;
    }
}
