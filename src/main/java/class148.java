import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class148 extends class198 {

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2664;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)[B")
    public final byte[] method908(int arg0) {
        byte[] var2 = new byte[this.field2664.capacity()];
        if (arg0 != 500) {
            this.method908(122);
        }
        this.field2664.position(0);
        this.field2664.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B[B)V")
    public final void method909(byte arg0, byte[] arg1) {
        if (arg0 != -12) {
            this.field2664 = null;
        }
        this.field2664 = ByteBuffer.allocateDirect(arg1.length);
        this.field2664.position(0);
        this.field2664.put(arg1);
    }
}
