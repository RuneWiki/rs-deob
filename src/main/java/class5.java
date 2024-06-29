import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class5 extends class107 {

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field84;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([BB)V", line = 6)
    public final void method79(byte[] arg0, byte arg1) {
        this.field84 = ByteBuffer.allocateDirect(arg0.length);
        this.field84.position(0);
        if (arg1 != 26) {
            this.method79((byte[]) null, (byte) 1);
        }
        this.field84.put(arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)[B", line = 19)
    public final byte[] method80(byte arg0) {
        if (arg0 != 22) {
            this.field84 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field84.capacity()];
        this.field84.position(0);
        this.field84.get(var2);
        return var2;
    }
}
