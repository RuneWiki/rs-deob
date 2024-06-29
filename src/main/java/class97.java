import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class97 extends class34 {

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1418;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)[B")
    public final byte[] method177(int arg0) {
        if (arg0 < 2) {
            this.method179(-33, null);
        }
        byte[] var2 = new byte[this.field1418.capacity()];
        this.field1418.position(0);
        this.field1418.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[B)V")
    public final void method179(int arg0, byte[] arg1) {
        this.field1418 = ByteBuffer.allocateDirect(arg1.length);
        this.field1418.position(0);
        if (arg0 > 68) {
            this.field1418.put(arg1);
        }
    }
}
