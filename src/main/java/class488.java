import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class488 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lnq;")
    private class325 field7221;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field7222;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BI)V", line = 5)
    public final void method2920(byte[] arg0, int arg1) {
        if (this.field7222 == null || this.field7222.field6731 < arg1) {
            this.field7222 = this.field7221.field4896.method2734(arg1);
        }
        this.field7222.method2722(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lnq;[BI)V", line = 12)
    public class488(class325 arg0, byte[] arg1, int arg2) {
        this.field7221 = arg0;
        this.field7222 = this.field7221.field4896.method2734(arg2);
        if (arg1 != null) {
            this.field7222.method2722(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lnq;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class488(class325 arg0, NativeBuffer arg1) {
        this.field7221 = arg0;
        this.field7222 = arg1;
    }
}
