import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class26 extends class140 {

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field464;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)[B")
    public final byte[] method198(int arg0) {
        if (arg0 != -9106) {
            this.field464 = null;
        }
        byte[] var2 = new byte[this.field464.capacity()];
        this.field464.position(0);
        this.field464.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[B)V")
    public final void method199(byte arg0, byte[] arg1) {
        this.field464 = ByteBuffer.allocateDirect(arg1.length);
        this.field464.position(0);
        this.field464.put(arg1);
        if (arg0 != -89) {
            this.method198(-7);
        }
    }
}
