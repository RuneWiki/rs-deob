import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class90 extends class254 {

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1485;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[B)V", line = 6)
    public final void method705(int arg0, byte[] arg1) {
        this.field1485 = ByteBuffer.allocateDirect(arg1.length);
        this.field1485.position(0);
        if (arg0 != 400) {
            this.method705(44, (byte[]) null);
        }
        this.field1485.put(arg1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)[B", line = 20)
    public final byte[] method706(int arg0) {
        byte[] var2 = new byte[this.field1485.capacity()];
        this.field1485.position(0);
        if (arg0 == 26) {
            this.field1485.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
