import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class81 extends class112 {

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1467;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)[B")
    public final byte[] method591(int arg0) {
        if (arg0 < 80) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field1467.capacity()];
            this.field1467.position(0);
            this.field1467.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BB)V")
    public final void method592(byte[] arg0, byte arg1) {
        this.field1467 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = 34 % ((arg1 - 26) / 62);
        this.field1467.position(0);
        this.field1467.put(arg0);
    }
}
