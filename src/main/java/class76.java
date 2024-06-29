import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class76 extends class40 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field790;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)V", line = 7)
    public final void method211(int arg0, byte[] arg1) {
        this.field790 = ByteBuffer.allocateDirect(arg1.length);
        this.field790.position(0);
        this.field790.put(arg1);
        if (arg0 >= -113) {
            this.method209(true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)[B", line = 20)
    public final byte[] method207(int arg0, int arg1, int arg2) {
        if (arg0 > -101) {
            this.field790 = null;
        }
        this.field790.position(arg1);
        byte[] var4 = new byte[arg2];
        this.field790.get(var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)[B", line = 34)
    public final byte[] method209(boolean arg0) {
        if (arg0) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field790.capacity()];
            this.field790.position(0);
            this.field790.get(var2);
            return var2;
        }
    }
}
