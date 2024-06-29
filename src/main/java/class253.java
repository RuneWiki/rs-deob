import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class253 extends class141 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4525;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)[B")
    public final byte[] method1084(int arg0) {
        byte[] var2 = new byte[this.field4525.capacity()];
        this.field4525.position(0);
        if (arg0 == 32470) {
            this.field4525.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)V")
    public final void method1083(int arg0, byte[] arg1) {
        this.field4525 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 > -64) {
            this.method1083(-18, (byte[]) null);
        }
        this.field4525.position(0);
        this.field4525.put(arg1);
    }
}
