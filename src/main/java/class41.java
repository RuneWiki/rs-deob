import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class41 extends class250 {

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field704;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)[B")
    public final byte[] method275(byte arg0) {
        byte[] var2 = new byte[this.field704.capacity()];
        this.field704.position(0);
        this.field704.get(var2);
        return arg0 > -38 ? (byte[]) null : var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([BB)V")
    public final void method276(byte[] arg0, byte arg1) {
        this.field704 = ByteBuffer.allocateDirect(arg0.length);
        this.field704.position(0);
        this.field704.put(arg0);
        if (arg1 != -102) {
            this.method275((byte) 5);
        }
    }
}
