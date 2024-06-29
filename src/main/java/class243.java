import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class243 {

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Lfd;")
    private class365 field3583;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field3584;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BI)V")
    public final void method1600(byte[] arg0, int arg1) {
        if (this.field3584 == null || this.field3584.field6512 < arg1) {
            this.field3584 = this.field3583.field5305.method2681(arg1);
        }
        this.field3584.method2670(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lfd;[BI)V")
    public class243(class365 arg0, byte[] arg1, int arg2) {
        this.field3583 = arg0;
        this.field3584 = this.field3583.field5305.method2681(arg2);
        if (arg1 != null) {
            this.field3584.method2670(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lfd;Ljaggl/memory/NativeBuffer;)V")
    public class243(class365 arg0, NativeBuffer arg1) {
        this.field3583 = arg0;
        this.field3584 = arg1;
    }
}
