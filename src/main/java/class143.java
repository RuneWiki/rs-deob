import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class143 extends class46 {

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2675;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)[B")
    public final byte[] method263(byte arg0) {
        if (arg0 < 9) {
            this.field2675 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field2675.capacity()];
        this.field2675.position(0);
        this.field2675.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BB)V")
    public final void method262(byte[] arg0, byte arg1) {
        this.field2675 = ByteBuffer.allocateDirect(arg0.length);
        this.field2675.position(0);
        if (arg1 <= -61) {
            this.field2675.put(arg0);
        }
    }
}
