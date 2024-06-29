import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class499 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lug;")
    private class395 field7225;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field7226;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)V")
    public final void method3008(byte[] arg0, int arg1) {
        if (this.field7226 == null || this.field7226.field6322 < arg1) {
            this.field7226 = this.field7225.field5499.method2602(arg1);
        }
        this.field7226.method2594(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lug;[BI)V")
    public class499(class395 arg0, byte[] arg1, int arg2) {
        this.field7225 = arg0;
        this.field7226 = this.field7225.field5499.method2602(arg2);
        if (arg1 != null) {
            this.field7226.method2594(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lug;Ljaggl/memory/NativeBuffer;)V")
    public class499(class395 arg0, NativeBuffer arg1) {
        this.field7225 = arg0;
        this.field7226 = arg1;
    }
}
