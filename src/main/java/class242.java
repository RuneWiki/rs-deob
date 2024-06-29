import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class242 extends class23 {

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3780;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)[B", line = 6)
    public final byte[] method242(int arg0) {
        if (arg0 == -31971) {
            byte[] var2 = new byte[this.field3780.capacity()];
            this.field3780.position(0);
            this.field3780.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B[B)V", line = 22)
    public final void method237(byte arg0, byte[] arg1) {
        this.field3780 = ByteBuffer.allocateDirect(arg1.length);
        this.field3780.position(0);
        if (arg0 < -115) {
            this.field3780.put(arg1);
        }
    }
}
