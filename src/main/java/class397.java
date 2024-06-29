import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class397 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Lgk;")
    private class463 field5289;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field5288;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([BI)V", line = 5)
    public final void method2366(byte[] arg0, int arg1) {
        if (this.field5288 == null || this.field5288.field6935 < arg1) {
            this.field5288 = this.field5289.field6694.method2845(arg1);
        }
        this.field5288.method2841(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lgk;[BI)V", line = 12)
    public class397(class463 arg0, byte[] arg1, int arg2) {
        this.field5289 = arg0;
        this.field5288 = this.field5289.field6694.method2845(arg2);
        if (arg1 != null) {
            this.field5288.method2841(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lgk;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class397(class463 arg0, NativeBuffer arg1) {
        this.field5289 = arg0;
        this.field5288 = arg1;
    }
}
