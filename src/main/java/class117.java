import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class117 extends class235 {

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1758;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[B)V", line = 6)
    public final void method816(int arg0, byte[] arg1) {
        if (arg0 >= -124) {
            this.method817(-58);
        }
        this.field1758 = ByteBuffer.allocateDirect(arg1.length);
        this.field1758.position(0);
        this.field1758.put(arg1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)[B", line = 21)
    public final byte[] method817(int arg0) {
        if (arg0 == -9827) {
            byte[] var2 = new byte[this.field1758.capacity()];
            this.field1758.position(0);
            this.field1758.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
