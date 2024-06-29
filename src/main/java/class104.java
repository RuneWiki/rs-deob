import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class104 extends class340 {

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1381;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z[B)V", line = 9)
    public final void method721(boolean arg0, byte[] arg1) {
        this.field1381 = ByteBuffer.allocateDirect(arg1.length);
        this.field1381.position(0);
        this.field1381.put(arg1);
        if (!arg0) {
            this.field1381 = (ByteBuffer) null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)[B", line = 22)
    public final byte[] method722(byte arg0) {
        byte[] var2 = new byte[this.field1381.capacity()];
        if (arg0 != 19) {
            this.method722((byte) 91);
        }
        this.field1381.position(0);
        this.field1381.get(var2);
        return var2;
    }
}
