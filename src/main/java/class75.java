import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class11 {

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1898;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)[B")
    public final byte[] method122(byte arg0) {
        byte[] var2 = new byte[this.field1898.capacity()];
        this.field1898.position(0);
        if (arg0 >= -11) {
            this.field1898 = null;
        }
        this.field1898.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BB)V")
    public final void method124(byte[] arg0, byte arg1) {
        this.field1898 = ByteBuffer.allocateDirect(arg0.length);
        this.field1898.position(0);
        this.field1898.put(arg0);
        if (arg1 != -9) {
            this.field1898 = null;
        }
    }
}
