import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class282 extends class29 {

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3585;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)[B", line = 6)
    public final byte[] method178(byte arg0) {
        byte[] var2 = new byte[this.field3585.capacity()];
        if (arg0 >= -81) {
            this.method182((byte) 11, -108, 29);
        }
        this.field3585.position(0);
        this.field3585.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BII)[B", line = 20)
    public final byte[] method182(byte arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg1];
        if (arg0 == 41) {
            this.field3585.position(arg2);
            this.field3585.get(var4, 0, arg1);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "([BB)V", line = 34)
    public final void method180(byte[] arg0, byte arg1) {
        this.field3585 = ByteBuffer.allocateDirect(arg0.length);
        this.field3585.position(0);
        if (arg1 >= -119) {
            this.method182((byte) 43, 84, 110);
        }
        this.field3585.put(arg0);
    }
}
