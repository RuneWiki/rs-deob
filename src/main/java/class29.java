import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class29 extends class421 {

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field269;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([BB)V")
    public final void method166(byte[] arg0, byte arg1) {
        this.field269 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 > -30) {
            this.method166((byte[]) null, (byte) 28);
        }
        this.field269.position(0);
        this.field269.put(arg0);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)[B")
    public final byte[] method167(int arg0) {
        byte[] var2 = new byte[this.field269.capacity()];
        this.field269.position(0);
        if (arg0 != -24746) {
            this.field269 = (ByteBuffer) null;
        }
        this.field269.get(var2);
        return var2;
    }
}
