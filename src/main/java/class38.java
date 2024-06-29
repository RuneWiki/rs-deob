import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class38 extends class137 {

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field738;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)[B")
    public final byte[] method245(int arg0) {
        byte[] var2 = new byte[this.field738.capacity()];
        this.field738.position(0);
        this.field738.get(var2);
        if (arg0 < 62) {
            this.method246(true, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z[B)V")
    public final void method246(boolean arg0, byte[] arg1) {
        this.field738 = ByteBuffer.allocateDirect(arg1.length);
        this.field738.position(0);
        if (arg0) {
            this.field738.put(arg1);
        }
    }
}
