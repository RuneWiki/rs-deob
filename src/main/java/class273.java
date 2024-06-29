import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class273 extends class48 {

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3624;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([BZ)V")
    public final void method342(byte[] arg0, boolean arg1) {
        this.field3624 = ByteBuffer.allocateDirect(arg0.length);
        this.field3624.position(0);
        if (arg1) {
            this.field3624.put(arg0);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)[B")
    public final byte[] method341(byte arg0) {
        if (arg0 == 80) {
            byte[] var2 = new byte[this.field3624.capacity()];
            this.field3624.position(0);
            this.field3624.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
