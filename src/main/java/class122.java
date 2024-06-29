import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class122 extends class16 {

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2274;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B[B)V")
    public final void method122(byte arg0, byte[] arg1) {
        if (arg0 < 84) {
            this.method122((byte) 98, null);
        }
        this.field2274 = ByteBuffer.allocateDirect(arg1.length);
        this.field2274.position(0);
        this.field2274.put(arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)[B")
    public final byte[] method123(byte arg0) {
        byte[] var2 = new byte[this.field2274.capacity()];
        this.field2274.position(0);
        if (arg0 <= 58) {
            return (byte[]) null;
        } else {
            this.field2274.get(var2);
            return var2;
        }
    }
}
