import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class90 extends class66 {

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1429;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)[B")
    public final byte[] method460(byte arg0) {
        byte[] var2 = new byte[this.field1429.capacity()];
        if (arg0 != -5) {
            this.field1429 = (ByteBuffer) null;
        }
        this.field1429.position(0);
        this.field1429.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[B)V")
    public final void method461(byte arg0, byte[] arg1) {
        this.field1429 = ByteBuffer.allocateDirect(arg1.length);
        int var3 = 47 % ((arg0 + 50) / 41);
        this.field1429.position(0);
        this.field1429.put(arg1);
    }
}
