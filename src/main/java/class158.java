import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class158 extends class65 {

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2750;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[B)V")
    public final void method459(int arg0, byte[] arg1) {
        if (arg0 == -1) {
            this.field2750 = ByteBuffer.allocateDirect(arg1.length);
            this.field2750.position(0);
            this.field2750.put(arg1);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)[B")
    public final byte[] method454(int arg0) {
        if (arg0 != 20256) {
            this.method459(-125, (byte[]) null);
        }
        byte[] var2 = new byte[this.field2750.capacity()];
        this.field2750.position(0);
        this.field2750.get(var2);
        return var2;
    }
}
