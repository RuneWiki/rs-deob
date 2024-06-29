import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class113 {

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1643;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)V")
    public final void method553(int arg0, byte[] arg1) {
        if (arg0 != -8) {
            this.method553(121, null);
        }
        this.field1643 = ByteBuffer.allocateDirect(arg1.length);
        this.field1643.position(0);
        this.field1643.put(arg1);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)[B")
    public final byte[] method554(int arg0) {
        byte[] var2 = new byte[this.field1643.capacity()];
        if (arg0 > -115) {
            this.field1643 = null;
        }
        this.field1643.position(0);
        this.field1643.get(var2);
        return var2;
    }
}
