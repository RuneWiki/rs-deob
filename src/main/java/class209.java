import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class209 extends class560 {

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3184;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1460(int arg0, byte arg1, int arg2) {
        this.field3184.position(arg0);
        if (arg1 == 65) {
            byte[] var4 = new byte[arg2];
            this.field3184.get(var4, 0, arg2);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)[B")
    public final byte[] method1461(int arg0) {
        byte[] var2 = new byte[this.field3184.capacity()];
        if (arg0 == -1) {
            this.field3184.position(0);
            this.field3184.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([BZ)V")
    public final void method1462(byte[] arg0, boolean arg1) {
        this.field3184 = ByteBuffer.allocateDirect(arg0.length);
        this.field3184.position(0);
        if (!arg1) {
            this.field3184.put(arg0);
        }
    }
}
