import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class88 extends class315 {

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1623;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)[B", line = 6)
    public final byte[] method632(byte arg0) {
        if (arg0 < 57) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field1623.capacity()];
            this.field1623.position(0);
            this.field1623.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B[B)V", line = 20)
    public final void method633(byte arg0, byte[] arg1) {
        this.field1623 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 >= -77) {
            this.method633((byte) -119, (byte[]) null);
        }
        this.field1623.position(0);
        this.field1623.put(arg1);
    }
}
