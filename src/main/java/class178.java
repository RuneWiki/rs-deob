import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class178 extends class171 {

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2689;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)[B")
    public final byte[] method1051(byte arg0) {
        byte[] var2 = new byte[this.field2689.capacity()];
        if (arg0 != 100) {
            this.field2689 = (ByteBuffer) null;
        }
        this.field2689.position(0);
        this.field2689.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B[B)V")
    public final void method1053(byte arg0, byte[] arg1) {
        this.field2689 = ByteBuffer.allocateDirect(arg1.length);
        this.field2689.position(0);
        this.field2689.put(arg1);
        if (arg0 != 79) {
            this.method1051((byte) -38);
        }
    }
}
