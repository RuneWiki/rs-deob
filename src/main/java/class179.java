import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class179 extends class25 {

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2938;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BB)V", line = 6)
    public final void method180(byte[] arg0, byte arg1) {
        this.field2938 = ByteBuffer.allocateDirect(arg0.length);
        this.field2938.position(0);
        if (arg1 < 10) {
            this.method180((byte[]) null, (byte) -108);
        }
        this.field2938.put(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)[B", line = 22)
    public final byte[] method187(int arg0) {
        byte[] var2 = new byte[this.field2938.capacity()];
        this.field2938.position(arg0);
        this.field2938.get(var2);
        return var2;
    }
}
