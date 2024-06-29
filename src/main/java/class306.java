import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class306 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lqg;")
    private class321 field4377;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field4378;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1929(byte[] arg0, int arg1) {
        if (this.field4378 == null || this.field4378.field6372 < arg1) {
            this.field4378 = this.field4377.field4783.method2658(arg1);
        }
        this.field4378.method2649(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lqg;[BI)V", line = 12)
    public class306(class321 arg0, byte[] arg1, int arg2) {
        this.field4377 = arg0;
        this.field4378 = this.field4377.field4783.method2658(arg2);
        if (arg1 != null) {
            this.field4378.method2649(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lqg;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class306(class321 arg0, NativeBuffer arg1) {
        this.field4377 = arg0;
        this.field4378 = arg1;
    }
}
