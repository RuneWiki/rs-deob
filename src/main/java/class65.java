import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class65 extends class109 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1275;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)[B")
    public final byte[] method440(int arg0) {
        if (arg0 >= -80) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field1275.capacity()];
            this.field1275.position(0);
            this.field1275.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BZ)V")
    public final void method441(byte[] arg0, boolean arg1) {
        this.field1275 = ByteBuffer.allocateDirect(arg0.length);
        this.field1275.position(0);
        this.field1275.put(arg0);
        if (!arg1) {
            this.method441((byte[]) null, true);
        }
    }
}
