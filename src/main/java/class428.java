import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class428 extends class91 {

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6406;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)[B")
    public final byte[] method527(int arg0, int arg1, int arg2) {
        if (arg0 >= -30) {
            this.method529(null, true);
        }
        byte[] var4 = new byte[arg2];
        this.field6406.position(arg1);
        this.field6406.get(var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([BZ)V")
    public final void method529(byte[] arg0, boolean arg1) {
        this.field6406 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1) {
            this.field6406 = null;
        }
        this.field6406.position(0);
        this.field6406.put(arg0);
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)[B")
    public final byte[] method531(int arg0) {
        if (arg0 != -50) {
            this.field6406 = null;
        }
        byte[] var2 = new byte[this.field6406.capacity()];
        this.field6406.position(0);
        this.field6406.get(var2);
        return var2;
    }
}
