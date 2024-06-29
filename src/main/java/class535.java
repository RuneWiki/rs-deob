import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class535 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Ltt;")
    private class249 field7858;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field7857;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BI)V", line = 6)
    public final void method3152(byte[] arg0, int arg1) {
        if (this.field7857 == null || this.field7857.field7079 < arg1) {
            this.field7857 = this.field7858.field3928.method2920(arg1);
        }
        this.field7857.method2917(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ltt;[BI)V", line = 12)
    public class535(class249 arg0, byte[] arg1, int arg2) {
        this.field7858 = arg0;
        this.field7857 = this.field7858.field3928.method2920(arg2);
        if (arg1 != null) {
            this.field7857.method2917(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ltt;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class535(class249 arg0, NativeBuffer arg1) {
        this.field7858 = arg0;
        this.field7857 = arg1;
    }
}
