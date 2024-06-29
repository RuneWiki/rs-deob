import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class214 extends class637 {

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3131;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)[B", line = 6)
    public final byte[] method1476(byte arg0) {
        byte[] var2 = new byte[this.field3131.capacity()];
        this.field3131.position(0);
        this.field3131.get(var2);
        if (arg0 != -56) {
            this.field3131 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([BB)V", line = 19)
    public final void method1477(byte[] arg0, byte arg1) {
        if (arg1 != -70) {
            this.method1476((byte) 91);
        }
        this.field3131 = ByteBuffer.allocateDirect(arg0.length);
        this.field3131.position(0);
        this.field3131.put(arg0);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)[B", line = 34)
    public final byte[] method1478(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg1];
        this.field3131.position(arg2);
        this.field3131.get(var4, 0, arg1);
        if (arg0 != -2049) {
            this.field3131 = null;
        }
        return var4;
    }
}
