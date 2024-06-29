import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class281 extends class170 {

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4259;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)[B")
    public final byte[] method1115(byte arg0) {
        byte[] var2 = new byte[this.field4259.capacity()];
        this.field4259.position(0);
        this.field4259.get(var2);
        int var3 = 57 / ((-arg0 - 67) / 52);
        return var2;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BI)V")
    public final void method1116(byte[] arg0, int arg1) {
        this.field4259 = ByteBuffer.allocateDirect(arg0.length);
        this.field4259.position(0);
        if (arg1 >= -23) {
            this.field4259 = (ByteBuffer) null;
        }
        this.field4259.put(arg0);
    }
}
