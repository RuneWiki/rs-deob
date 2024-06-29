import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class129 extends class258 {

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2380;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)[B")
    public final byte[] method837(boolean arg0) {
        if (!arg0) {
            this.method838(false, (byte[]) null);
        }
        byte[] var2 = new byte[this.field2380.capacity()];
        this.field2380.position(0);
        this.field2380.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z[B)V")
    public final void method838(boolean arg0, byte[] arg1) {
        this.field2380 = ByteBuffer.allocateDirect(arg1.length);
        if (!arg0) {
            this.field2380.position(0);
            this.field2380.put(arg1);
        }
    }
}
