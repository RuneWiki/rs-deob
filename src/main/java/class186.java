import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class186 extends class135 {

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3431;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)[B")
    public final byte[] method936(int arg0) {
        byte[] var2 = new byte[this.field3431.capacity()];
        this.field3431.position(arg0);
        this.field3431.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BZ)V")
    public final void method933(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field3431 = ByteBuffer.allocateDirect(arg0.length);
            this.field3431.position(0);
            this.field3431.put(arg0);
        }
    }
}
