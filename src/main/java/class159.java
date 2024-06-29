import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class159 extends class6 {

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2886;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[B)V")
    public final void method39(int arg0, byte[] arg1) {
        this.field2886 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 == 100) {
            this.field2886.position(0);
            this.field2886.put(arg1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)[B")
    public final byte[] method40(int arg0) {
        if (arg0 != 100) {
            this.field2886 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field2886.capacity()];
        this.field2886.position(0);
        this.field2886.get(var2);
        return var2;
    }
}
