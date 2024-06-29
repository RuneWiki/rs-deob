import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class59 extends class70 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1028;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)[B")
    public final byte[] method396(int arg0) {
        byte[] var2 = new byte[this.field1028.capacity()];
        this.field1028.position(0);
        if (arg0 == 2006780792) {
            this.field1028.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[B)V")
    public final void method397(int arg0, byte[] arg1) {
        this.field1028 = ByteBuffer.allocateDirect(arg1.length);
        this.field1028.position(arg0);
        this.field1028.put(arg1);
    }
}
