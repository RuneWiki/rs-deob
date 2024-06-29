import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class33 extends class28 {

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field690;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)[B")
    public final byte[] method268(boolean arg0) {
        byte[] var2 = new byte[this.field690.capacity()];
        this.field690.position(0);
        if (arg0) {
            this.field690 = null;
        }
        this.field690.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[B)V")
    public final void method269(byte arg0, byte[] arg1) {
        this.field690 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 >= -46) {
            this.method268(true);
        }
        this.field690.position(0);
        this.field690.put(arg1);
    }
}
