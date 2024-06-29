import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class392 extends class238 {

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5135;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BB)V", line = 5)
    public final void method1508(byte[] arg0, byte arg1) {
        if (arg1 <= -69) {
            this.field5135 = ByteBuffer.allocateDirect(arg0.length);
            this.field5135.position(0);
            this.field5135.put(arg0);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBI)[B", line = 18)
    public final byte[] method1512(int arg0, byte arg1, int arg2) {
        if (arg1 != -58) {
            this.field5135 = null;
        }
        byte[] var4 = new byte[arg2];
        this.field5135.position(arg0);
        this.field5135.get(var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)[B", line = 32)
    public final byte[] method1509(int arg0) {
        byte[] var2 = new byte[this.field5135.capacity()];
        this.field5135.position(arg0);
        this.field5135.get(var2);
        return var2;
    }
}
