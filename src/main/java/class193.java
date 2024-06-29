import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class193 extends class538 {

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2737;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)[B", line = 6)
    public final byte[] method1224(int arg0, byte arg1, int arg2) {
        if (arg1 < 17) {
            this.method1226((byte) -117);
        }
        byte[] var4 = new byte[arg0];
        this.field2737.position(arg2);
        this.field2737.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B[B)V", line = 21)
    public final void method1225(byte arg0, byte[] arg1) {
        if (arg0 != 122) {
            this.field2737 = null;
        }
        this.field2737 = ByteBuffer.allocateDirect(arg1.length);
        this.field2737.position(0);
        this.field2737.put(arg1);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)[B", line = 36)
    public final byte[] method1226(byte arg0) {
        if (arg0 != 101) {
            this.field2737 = null;
        }
        byte[] var2 = new byte[this.field2737.capacity()];
        this.field2737.position(0);
        this.field2737.get(var2);
        return var2;
    }
}
