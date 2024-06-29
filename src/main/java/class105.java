import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class105 extends class160 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1346;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[B)V", line = 5)
    public final void method611(int arg0, byte[] arg1) {
        this.field1346 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != 27493) {
            this.method611(121, (byte[]) null);
        }
        this.field1346.position(0);
        this.field1346.put(arg1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)[B", line = 18)
    public final byte[] method612(byte arg0) {
        if (arg0 != -122) {
            this.method612((byte) 102);
        }
        byte[] var2 = new byte[this.field1346.capacity()];
        this.field1346.position(0);
        this.field1346.get(var2);
        return var2;
    }
}
