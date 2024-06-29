import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class358 extends class373 {

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4990;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B[B)V")
    public final void method2145(byte arg0, byte[] arg1) {
        if (arg0 > -41) {
            this.field4990 = (ByteBuffer) null;
        }
        this.field4990 = ByteBuffer.allocateDirect(arg1.length);
        this.field4990.position(0);
        this.field4990.put(arg1);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)[B")
    public final byte[] method2146(byte arg0) {
        byte[] var2 = new byte[this.field4990.capacity()];
        this.field4990.position(0);
        this.field4990.get(var2);
        if (arg0 <= 82) {
            this.field4990 = (ByteBuffer) null;
        }
        return var2;
    }
}
