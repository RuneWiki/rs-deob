import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class587 extends class18 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field8509;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)[B")
    public final byte[] method83(boolean arg0) {
        if (arg0) {
            byte[] var2 = new byte[this.field8509.capacity()];
            this.field8509.position(0);
            this.field8509.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[B)V")
    public final void method85(boolean arg0, byte[] arg1) {
        if (!arg0) {
            this.field8509 = null;
        }
        this.field8509 = ByteBuffer.allocateDirect(arg1.length);
        this.field8509.position(0);
        this.field8509.put(arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[B")
    public final byte[] method87(int arg0, int arg1, int arg2) {
        if (arg0 != -7056) {
            this.method87(66, 73, 15);
        }
        byte[] var4 = new byte[arg2];
        this.field8509.position(arg1);
        this.field8509.get(var4, 0, arg2);
        return var4;
    }
}
