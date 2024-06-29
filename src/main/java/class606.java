import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class606 extends class667 {

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field8644;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)[B", line = 5)
    public final byte[] method3548(int arg0) {
        if (arg0 != -9673) {
            this.method3549(-47, -41, -22);
        }
        byte[] var2 = new byte[this.field8644.capacity()];
        this.field8644.position(0);
        this.field8644.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)[B", line = 21)
    public final byte[] method3549(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg0];
        if (arg2 <= 112) {
            return (byte[]) null;
        } else {
            this.field8644.position(arg1);
            this.field8644.get(var4, 0, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[B)V", line = 34)
    public final void method3550(int arg0, byte[] arg1) {
        this.field8644 = ByteBuffer.allocateDirect(arg1.length);
        this.field8644.position(0);
        if (arg0 != 2) {
            this.method3548(-29);
        }
        this.field8644.put(arg1);
    }
}
