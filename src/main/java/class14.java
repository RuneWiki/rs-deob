import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class198 {

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field204;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)[B")
    public final byte[] method106(byte arg0) {
        byte[] var2 = new byte[this.field204.capacity()];
        this.field204.position(0);
        this.field204.get(var2);
        return arg0 == 117 ? var2 : (byte[]) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B[B)V")
    public final void method107(byte arg0, byte[] arg1) {
        this.field204 = ByteBuffer.allocateDirect(arg1.length);
        this.field204.position(0);
        if (arg0 >= -122) {
            this.field204 = (ByteBuffer) null;
        }
        this.field204.put(arg1);
    }
}
