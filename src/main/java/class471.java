import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class471 extends class158 {

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6612;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method1080(int arg0) {
        byte[] var2 = new byte[this.field6612.capacity()];
        this.field6612.position(0);
        this.field6612.get(var2);
        if (arg0 <= 76) {
            this.method1081((byte) -120, (byte[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B[B)V", line = 20)
    public final void method1081(byte arg0, byte[] arg1) {
        this.field6612 = ByteBuffer.allocateDirect(arg1.length);
        this.field6612.position(0);
        this.field6612.put(arg1);
        if (arg0 != 2) {
            this.method1080(13);
        }
    }
}
