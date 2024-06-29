import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class184 extends class246 {

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3379;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BB)V")
    public final void method1321(byte[] arg0, byte arg1) {
        this.field3379 = ByteBuffer.allocateDirect(arg0.length);
        this.field3379.position(0);
        if (arg1 <= 85) {
            this.field3379 = (ByteBuffer) null;
        }
        this.field3379.put(arg0);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)[B")
    public final byte[] method1322(byte arg0) {
        if (arg0 != -118) {
            this.field3379 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field3379.capacity()];
        this.field3379.position(0);
        this.field3379.get(var2);
        return var2;
    }
}
