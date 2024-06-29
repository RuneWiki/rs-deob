import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class25 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lna;")
    private class211 field279;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field278;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([BI)V")
    public final void method152(byte[] arg0, int arg1) {
        if (this.field278 == null || this.field278.field219 < arg1) {
            this.field278 = this.field279.field3480.method121(arg1);
        }
        this.field278.method110(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lna;[BI)V")
    public class25(class211 arg0, byte[] arg1, int arg2) {
        this.field279 = arg0;
        this.field278 = this.field279.field3480.method121(arg2);
        if (arg1 != null) {
            this.field278.method110(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lna;Ljaggl/memory/NativeBuffer;)V")
    public class25(class211 arg0, NativeBuffer arg1) {
        this.field279 = arg0;
        this.field278 = arg1;
    }
}
