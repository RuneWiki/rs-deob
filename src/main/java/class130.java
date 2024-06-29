import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class130 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lef;")
    private class338 field1916;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field1915;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lef;[BI)V", line = 4)
    public class130(class338 arg0, byte[] arg1, int arg2) {
        this.field1916 = arg0;
        this.field1915 = this.field1916.field4742.method2602(arg2);
        if (arg1 != null) {
            this.field1915.method2589(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V", line = 16)
    public final void method895(byte[] arg0, int arg1) {
        if (this.field1915 == null || this.field1915.field6460 < arg1) {
            this.field1915 = this.field1916.field4742.method2602(arg1);
        }
        this.field1915.method2589(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lef;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class130(class338 arg0, NativeBuffer arg1) {
        this.field1916 = arg0;
        this.field1915 = arg1;
    }
}
