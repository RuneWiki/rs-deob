import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class554 extends class711 {

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field7351;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)[B", line = 10)
    public final byte[] method3065(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg0];
        this.field7351.position(arg1);
        this.field7351.get(var4, 0, arg0);
        if (arg2 != 14342) {
            this.field7351 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)[B", line = 23)
    public final byte[] method3066(boolean arg0) {
        if (arg0) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field7351.capacity()];
            this.field7351.position(0);
            this.field7351.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B[B)V", line = 37)
    public final void method3067(byte arg0, byte[] arg1) {
        this.field7351 = ByteBuffer.allocateDirect(arg1.length);
        this.field7351.position(0);
        this.field7351.put(arg1);
        if (arg0 <= 48) {
            this.method3065(75, -18, 93);
        }
    }
}
