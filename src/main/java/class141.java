import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class141 extends class152 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1960;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)[B", line = 7)
    public final byte[] method1090(int arg0) {
        byte[] var2 = new byte[this.field1960.capacity()];
        if (arg0 != -9747) {
            this.field1960 = (ByteBuffer) null;
        }
        this.field1960.position(0);
        this.field1960.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[B)V", line = 23)
    public final void method1091(int arg0, byte[] arg1) {
        this.field1960 = ByteBuffer.allocateDirect(arg1.length);
        this.field1960.position(arg0);
        this.field1960.put(arg1);
    }
}
