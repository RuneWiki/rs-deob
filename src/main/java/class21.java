import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class21 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lpg;")
    private class333 field295;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field296;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BI)V")
    public final void method134(byte[] arg0, int arg1) {
        if (this.field296 == null || this.field296.field6932 < arg1) {
            this.field296 = this.field295.field4730.method2846(arg1);
        }
        this.field296.method2842(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lpg;[BI)V")
    public class21(class333 arg0, byte[] arg1, int arg2) {
        this.field295 = arg0;
        this.field296 = this.field295.field4730.method2846(arg2);
        if (arg1 != null) {
            this.field296.method2842(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lpg;Ljaggl/memory/NativeBuffer;)V")
    public class21(class333 arg0, NativeBuffer arg1) {
        this.field295 = arg0;
        this.field296 = arg1;
    }
}
