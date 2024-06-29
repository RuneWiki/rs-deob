import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lda;")
    private class44 field98;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field99;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
    public final void method42(byte[] arg0, int arg1) {
        if (this.field99 == null || this.field99.field6585 < arg1) {
            this.field99 = this.field98.field809.method2653(arg1);
        }
        this.field99.method2643(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lda;[BI)V")
    public class6(class44 arg0, byte[] arg1, int arg2) {
        this.field98 = arg0;
        this.field99 = this.field98.field809.method2653(arg2);
        if (arg1 != null) {
            this.field99.method2643(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lda;Ljaggl/memory/NativeBuffer;)V")
    public class6(class44 arg0, NativeBuffer arg1) {
        this.field98 = arg0;
        this.field99 = arg1;
    }
}
