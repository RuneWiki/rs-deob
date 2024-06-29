import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class499 extends class474 {

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field7498;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)[B")
    public final byte[] method2951(int arg0) {
        byte[] var2 = new byte[this.field7498.capacity()];
        this.field7498.position(0);
        if (arg0 != 100) {
            this.method2955(3, 46, -50);
        }
        this.field7498.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I[B)V")
    public final void method2952(int arg0, byte[] arg1) {
        this.field7498 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != -12352) {
            this.method2951(81);
        }
        this.field7498.position(0);
        this.field7498.put(arg1);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)[B")
    public final byte[] method2955(int arg0, int arg1, int arg2) {
        if (arg1 >= -8) {
            return (byte[]) null;
        } else {
            byte[] var4 = new byte[arg2];
            this.field7498.position(arg0);
            this.field7498.get(var4, 0, arg2);
            return var4;
        }
    }
}
