import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class260 extends class16 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4220;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)[B")
    public final byte[] method83(boolean arg0) {
        if (arg0) {
            this.field4220 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field4220.capacity()];
        this.field4220.position(0);
        this.field4220.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([BZ)V")
    public final void method86(byte[] arg0, boolean arg1) {
        this.field4220 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1) {
            this.field4220.position(0);
            this.field4220.put(arg0);
        }
    }
}
