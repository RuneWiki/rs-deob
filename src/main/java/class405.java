import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class405 extends class527 {

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5766;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)[B", line = 6)
    public final byte[] method2383(byte arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field5766.position(arg1);
        this.field5766.get(var4, 0, arg2);
        if (arg0 >= -106) {
            this.method2384(95, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[B)V", line = 19)
    public final void method2384(int arg0, byte[] arg1) {
        this.field5766 = ByteBuffer.allocateDirect(arg1.length);
        this.field5766.position(arg0);
        this.field5766.put(arg1);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)[B", line = 30)
    public final byte[] method2385(int arg0) {
        byte[] var2 = new byte[this.field5766.capacity()];
        if (arg0 >= -79) {
            return (byte[]) null;
        } else {
            this.field5766.position(0);
            this.field5766.get(var2);
            return var2;
        }
    }
}
