import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class10 extends class68 {

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field202;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BB)V")
    public final void method85(byte[] arg0, byte arg1) {
        this.field202 = ByteBuffer.allocateDirect(arg0.length);
        this.field202.position(0);
        this.field202.put(arg0);
        if (arg1 != -99) {
            this.method85((byte[]) null, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)[B")
    public final byte[] method86(boolean arg0) {
        byte[] var2 = new byte[this.field202.capacity()];
        if (arg0) {
            this.method86(false);
        }
        this.field202.position(0);
        this.field202.get(var2);
        return var2;
    }
}
