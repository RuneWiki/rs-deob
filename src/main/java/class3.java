import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Lbo;")
    private class511 field107;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field108;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([BI)V", line = 5)
    public final void method21(byte[] arg0, int arg1) {
        if (this.field108 == null || this.field108.field6016 < arg1) {
            this.field108 = this.field107.field7402.method2531(arg1);
        }
        this.field108.method2519(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lbo;[BI)V", line = 12)
    public class3(class511 arg0, byte[] arg1, int arg2) {
        this.field107 = arg0;
        this.field108 = this.field107.field7402.method2531(arg2);
        if (arg1 != null) {
            this.field108.method2519(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lbo;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class3(class511 arg0, NativeBuffer arg1) {
        this.field107 = arg0;
        this.field108 = arg1;
    }
}
