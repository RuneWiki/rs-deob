import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class238 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lvj;")
    private class303 field3434;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field3435;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1557(byte[] arg0, int arg1) {
        if (this.field3435 == null || this.field3435.field6562 < arg1) {
            this.field3435 = this.field3434.field4496.method2636(arg1);
        }
        this.field3435.method2625(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lvj;[BI)V", line = 12)
    public class238(class303 arg0, byte[] arg1, int arg2) {
        this.field3434 = arg0;
        this.field3435 = this.field3434.field4496.method2636(arg2);
        if (arg1 != null) {
            this.field3435.method2625(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lvj;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class238(class303 arg0, NativeBuffer arg1) {
        this.field3434 = arg0;
        this.field3435 = arg1;
    }
}
