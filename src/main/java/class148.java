import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class148 extends class178 {

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2607;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B[B)V")
    public final void method967(byte arg0, byte[] arg1) {
        this.field2607 = ByteBuffer.allocateDirect(arg1.length);
        this.field2607.position(0);
        this.field2607.put(arg1);
        if (arg0 <= 85) {
            this.method967((byte) 37, null);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)[B")
    public final byte[] method968(boolean arg0) {
        byte[] var2 = new byte[this.field2607.capacity()];
        this.field2607.position(0);
        this.field2607.get(var2);
        if (arg0) {
            this.field2607 = null;
        }
        return var2;
    }
}
