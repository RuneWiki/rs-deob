import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class99 extends class86 {

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1451;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)[B")
    public final byte[] method658(int arg0) {
        byte[] var2 = new byte[this.field1451.capacity()];
        this.field1451.position(0);
        if (arg0 == -1621) {
            this.field1451.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BB)V")
    public final void method660(byte[] arg0, byte arg1) {
        if (arg1 <= -1) {
            this.field1451 = ByteBuffer.allocateDirect(arg0.length);
            this.field1451.position(0);
            this.field1451.put(arg0);
        }
    }
}
