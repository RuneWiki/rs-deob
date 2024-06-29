import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class199 extends class92 {

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3688;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BI)V")
    public final void method570(byte[] arg0, int arg1) {
        this.field3688 = ByteBuffer.allocateDirect(arg0.length);
        this.field3688.position(0);
        if (arg1 != -1222) {
            this.field3688 = null;
        }
        this.field3688.put(arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)[B")
    public final byte[] method572(byte arg0) {
        if (arg0 >= -37) {
            this.method570(null, -44);
        }
        byte[] var2 = new byte[this.field3688.capacity()];
        this.field3688.position(0);
        this.field3688.get(var2);
        return var2;
    }
}
