import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class82 extends class119 {

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1050;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)[B", line = 6)
    public final byte[] method480(byte arg0) {
        byte[] var2 = new byte[this.field1050.capacity()];
        this.field1050.position(0);
        if (arg0 != 114) {
            this.field1050 = (ByteBuffer) null;
        }
        this.field1050.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[B)V", line = 21)
    public final void method481(int arg0, byte[] arg1) {
        if (arg0 < 45) {
            this.method480((byte) -13);
        }
        this.field1050 = ByteBuffer.allocateDirect(arg1.length);
        this.field1050.position(0);
        this.field1050.put(arg1);
    }
}
