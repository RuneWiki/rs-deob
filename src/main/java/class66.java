import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 extends class32 {

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1369;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)[B")
    public final byte[] method235(int arg0) {
        byte[] var2 = new byte[this.field1369.capacity()];
        this.field1369.position(0);
        if (arg0 == 4500) {
            this.field1369.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B)V")
    public final void method237(int arg0, byte[] arg1) {
        this.field1369 = ByteBuffer.allocateDirect(arg1.length);
        this.field1369.position(0);
        this.field1369.put(arg1);
        if (arg0 != 56) {
            this.field1369 = null;
        }
    }
}
