import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class51 extends class12 {

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field833;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method100(int arg0) {
        byte[] var2 = new byte[this.field833.capacity()];
        if (arg0 != 10751) {
            this.field833 = (ByteBuffer) null;
        }
        this.field833.position(0);
        this.field833.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BZ)V", line = 21)
    public final void method98(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field833 = ByteBuffer.allocateDirect(arg0.length);
            this.field833.position(0);
            this.field833.put(arg0);
        }
    }
}
