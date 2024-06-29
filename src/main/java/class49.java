import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class49 extends class19 {

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field976;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[B)V")
    public final void method203(int arg0, byte[] arg1) {
        this.field976 = ByteBuffer.allocateDirect(arg1.length);
        this.field976.position(arg0);
        this.field976.put(arg1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)[B")
    public final byte[] method201(byte arg0) {
        byte[] var2 = new byte[this.field976.capacity()];
        this.field976.position(0);
        this.field976.get(var2);
        if (arg0 != -22) {
            this.method201((byte) 83);
        }
        return var2;
    }
}
