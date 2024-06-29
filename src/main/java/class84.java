import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class84 extends class47 {

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1527;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)[B")
    public final byte[] method260(int arg0) {
        byte[] var2 = new byte[this.field1527.capacity()];
        if (arg0 != 255) {
            this.method260(27);
        }
        this.field1527.position(0);
        this.field1527.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BB)V")
    public final void method263(byte[] arg0, byte arg1) {
        if (arg1 < -5) {
            this.field1527 = ByteBuffer.allocateDirect(arg0.length);
            this.field1527.position(0);
            this.field1527.put(arg0);
        }
    }
}
