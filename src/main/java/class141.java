import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class141 extends class104 {

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2820;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)[B")
    public final byte[] method712(int arg0) {
        if (arg0 <= 97) {
            this.field2820 = null;
        }
        byte[] var2 = new byte[this.field2820.capacity()];
        this.field2820.position(0);
        this.field2820.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([BI)V")
    public final void method710(byte[] arg0, int arg1) {
        this.field2820 = ByteBuffer.allocateDirect(arg0.length);
        this.field2820.position(0);
        this.field2820.put(arg0);
        if (arg1 > -3) {
            this.method712(-99);
        }
    }
}
