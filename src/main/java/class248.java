import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class248 extends class323 {

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3446;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B[B)V", line = 5)
    public final void method1633(byte arg0, byte[] arg1) {
        this.field3446 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 == 1) {
            this.field3446.position(0);
            this.field3446.put(arg1);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)[B", line = 19)
    public final byte[] method1634(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field3446.position(arg1);
        if (arg0 <= 37) {
            return (byte[]) null;
        } else {
            this.field3446.get(var4, 0, arg2);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)[B", line = 33)
    public final byte[] method1635(byte arg0) {
        byte[] var2 = new byte[this.field3446.capacity()];
        this.field3446.position(0);
        if (arg0 > -4) {
            this.field3446 = null;
        }
        this.field3446.get(var2);
        return var2;
    }
}
