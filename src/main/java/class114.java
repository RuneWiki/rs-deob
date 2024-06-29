import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class114 extends class193 {

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1977;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[B)V")
    public final void method812(int arg0, byte[] arg1) {
        if (arg0 < -97) {
            this.field1977 = ByteBuffer.allocateDirect(arg1.length);
            this.field1977.position(0);
            this.field1977.put(arg1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)[B")
    public final byte[] method813(int arg0) {
        byte[] var2 = new byte[this.field1977.capacity()];
        this.field1977.position(arg0);
        this.field1977.get(var2);
        return var2;
    }
}
