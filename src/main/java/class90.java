import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class90 extends class43 {

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1312;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BB)V", line = 5)
    public final void method321(byte[] arg0, byte arg1) {
        this.field1312 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != -97) {
            this.method321((byte[]) null, (byte) 119);
        }
        this.field1312.position(0);
        this.field1312.put(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)[B", line = 21)
    public final byte[] method320(int arg0) {
        if (arg0 != 32) {
            this.field1312 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field1312.capacity()];
        this.field1312.position(0);
        this.field1312.get(var2);
        return var2;
    }
}
