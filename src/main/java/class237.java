import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class237 extends class14 {

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3791;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([BI)V", line = 5)
    public final void method78(byte[] arg0, int arg1) {
        this.field3791 = ByteBuffer.allocateDirect(arg0.length);
        this.field3791.position(0);
        this.field3791.put(arg0);
        if (arg1 >= -117) {
            this.field3791 = (ByteBuffer) null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)[B", line = 19)
    public final byte[] method80(byte arg0) {
        byte[] var2 = new byte[this.field3791.capacity()];
        this.field3791.position(0);
        if (arg0 != 125) {
            this.method80((byte) 38);
        }
        this.field3791.get(var2);
        return var2;
    }
}
