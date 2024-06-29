import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class89 extends class274 {

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1216;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B)V")
    public final void method630(int arg0, byte[] arg1) {
        if (arg0 != -1) {
            this.method630(-119, (byte[]) null);
        }
        this.field1216 = ByteBuffer.allocateDirect(arg1.length);
        this.field1216.position(0);
        this.field1216.put(arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)[B")
    public final byte[] method631(byte arg0) {
        byte[] var2 = new byte[this.field1216.capacity()];
        if (arg0 != -84) {
            this.method630(71, (byte[]) null);
        }
        this.field1216.position(0);
        this.field1216.get(var2);
        return var2;
    }
}
