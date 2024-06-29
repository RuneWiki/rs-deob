import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class185 extends class337 {

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2566;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[B)V", line = 6)
    public final void method1221(int arg0, byte[] arg1) {
        this.field2566 = ByteBuffer.allocateDirect(arg1.length);
        this.field2566.position(arg0);
        this.field2566.put(arg1);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)[B", line = 16)
    public final byte[] method1222(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field2566.position(arg0);
        this.field2566.get(var4, arg1, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)[B", line = 29)
    public final byte[] method1223(byte arg0) {
        if (arg0 == 59) {
            byte[] var2 = new byte[this.field2566.capacity()];
            this.field2566.position(0);
            this.field2566.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
