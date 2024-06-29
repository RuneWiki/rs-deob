import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class189 extends class110 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3359;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)[B")
    public final byte[] method744(byte arg0) {
        if (arg0 > -80) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field3359.capacity()];
            this.field3359.position(0);
            this.field3359.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B[B)V")
    public final void method745(byte arg0, byte[] arg1) {
        this.field3359 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 >= -105) {
            this.field3359 = null;
        }
        this.field3359.position(0);
        this.field3359.put(arg1);
    }
}
