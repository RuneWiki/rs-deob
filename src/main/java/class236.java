import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class236 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lkd;")
    private class188 field3796;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field3795;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BI)V", line = 5)
    public final void method1639(byte[] arg0, int arg1) {
        if (this.field3795 == null || this.field3795.field6500 < arg1) {
            this.field3795 = this.field3796.field3029.method2727(arg1);
        }
        this.field3795.method2716(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lkd;[BI)V", line = 12)
    public class236(class188 arg0, byte[] arg1, int arg2) {
        this.field3796 = arg0;
        this.field3795 = this.field3796.field3029.method2727(arg2);
        if (arg1 != null) {
            this.field3795.method2716(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lkd;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class236(class188 arg0, NativeBuffer arg1) {
        this.field3796 = arg0;
        this.field3795 = arg1;
    }
}
