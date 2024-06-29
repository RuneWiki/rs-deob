import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class65 extends class238 {

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1107;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[B)V", line = 5)
    public final void method495(int arg0, byte[] arg1) {
        this.field1107 = ByteBuffer.allocateDirect(arg1.length);
        this.field1107.position(arg0);
        this.field1107.put(arg1);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)[B", line = 15)
    public final byte[] method496(int arg0) {
        if (arg0 < 40) {
            this.field1107 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field1107.capacity()];
        this.field1107.position(0);
        this.field1107.get(var2);
        return var2;
    }
}
