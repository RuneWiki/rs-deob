import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class103 extends class114 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1525;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)[B", line = 6)
    public final byte[] method880(byte arg0) {
        byte[] var2 = new byte[this.field1525.capacity()];
        if (arg0 == -109) {
            this.field1525.position(0);
            this.field1525.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BB)V", line = 21)
    public final void method881(byte[] arg0, byte arg1) {
        if (arg1 > 0) {
            this.field1525 = ByteBuffer.allocateDirect(arg0.length);
            this.field1525.position(0);
            this.field1525.put(arg0);
        }
    }
}
