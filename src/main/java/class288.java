import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class288 extends class166 {

    @OriginalMember(owner = "client!am", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4457;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z[B)V", line = 5)
    public final void method1262(boolean arg0, byte[] arg1) {
        this.field4457 = ByteBuffer.allocateDirect(arg1.length);
        this.field4457.position(0);
        this.field4457.put(arg1);
        if (arg0) {
            this.method1262(false, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)[B", line = 18)
    public final byte[] method1260(int arg0) {
        int var2 = -27 % ((-arg0 - 68) / 44);
        byte[] var3 = new byte[this.field4457.capacity()];
        this.field4457.position(0);
        this.field4457.get(var3);
        return var3;
    }
}
