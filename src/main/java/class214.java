import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class214 extends class294 {

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3078;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)[B", line = 6)
    public final byte[] method1488(boolean arg0) {
        byte[] var2 = new byte[this.field3078.capacity()];
        this.field3078.position(0);
        if (arg0) {
            this.field3078.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[B)V", line = 19)
    public final void method1489(int arg0, byte[] arg1) {
        this.field3078 = ByteBuffer.allocateDirect(arg1.length);
        this.field3078.position(0);
        if (arg0 < -111) {
            this.field3078.put(arg1);
        }
    }
}
