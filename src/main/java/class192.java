import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class192 extends class120 {

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3793;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)[B")
    public final byte[] method818(byte arg0) {
        byte[] var2 = new byte[this.field3793.capacity()];
        if (arg0 != 94) {
            this.field3793 = null;
        }
        this.field3793.position(0);
        this.field3793.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[B)V")
    public final void method816(int arg0, byte[] arg1) {
        this.field3793 = ByteBuffer.allocateDirect(arg1.length);
        this.field3793.position(0);
        if (arg0 == 8) {
            this.field3793.put(arg1);
        }
    }
}
