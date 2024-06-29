import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class57 {

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1316;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[B)V")
    public final void method462(int arg0, byte[] arg1) {
        if (arg0 < 70) {
            this.field1316 = null;
        }
        this.field1316 = ByteBuffer.allocateDirect(arg1.length);
        this.field1316.position(0);
        this.field1316.put(arg1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)[B")
    public final byte[] method459(int arg0) {
        byte[] var2 = new byte[this.field1316.capacity()];
        if (arg0 <= 50) {
            this.method459(-76);
        }
        this.field1316.position(0);
        this.field1316.get(var2);
        return var2;
    }
}
