import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class103 extends class168 {

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1504;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z[B)V")
    public final void method774(boolean arg0, byte[] arg1) {
        this.field1504 = ByteBuffer.allocateDirect(arg1.length);
        this.field1504.position(0);
        if (arg0) {
            this.method774(true, (byte[]) null);
        }
        this.field1504.put(arg1);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)[B")
    public final byte[] method775(int arg0) {
        byte[] var2 = new byte[this.field1504.capacity()];
        this.field1504.position(0);
        this.field1504.get(var2);
        if (arg0 != -150) {
            this.method774(false, (byte[]) null);
        }
        return var2;
    }
}
