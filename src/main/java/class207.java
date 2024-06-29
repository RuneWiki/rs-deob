import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class207 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lvd;")
    private class258 field2997;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field2996;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BI)V")
    public final void method1350(byte[] arg0, int arg1) {
        if (this.field2996 == null || this.field2996.field7047 < arg1) {
            this.field2996 = this.field2997.field3700.method2850(arg1);
        }
        this.field2996.method2845(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lvd;[BI)V")
    public class207(class258 arg0, byte[] arg1, int arg2) {
        this.field2997 = arg0;
        this.field2996 = this.field2997.field3700.method2850(arg2);
        if (arg1 != null) {
            this.field2996.method2845(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lvd;Ljaggl/memory/NativeBuffer;)V")
    public class207(class258 arg0, NativeBuffer arg1) {
        this.field2997 = arg0;
        this.field2996 = arg1;
    }
}
