import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class170 extends class9 {

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2541;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)[B")
    public final byte[] method109(int arg0) {
        byte[] var2 = new byte[this.field2541.capacity()];
        this.field2541.position(arg0);
        this.field2541.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z[B)V")
    public final void method107(boolean arg0, byte[] arg1) {
        this.field2541 = ByteBuffer.allocateDirect(arg1.length);
        if (!arg0) {
            this.field2541.position(0);
            this.field2541.put(arg1);
        }
    }
}
