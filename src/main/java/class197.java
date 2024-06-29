import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class197 extends class95 {

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2820;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)[B")
    public final byte[] method525(int arg0) {
        byte[] var2 = new byte[this.field2820.capacity()];
        if (arg0 != 11499) {
            this.field2820 = (ByteBuffer) null;
        }
        this.field2820.position(0);
        this.field2820.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[B)V")
    public final void method529(int arg0, byte[] arg1) {
        if (arg0 == 9811) {
            this.field2820 = ByteBuffer.allocateDirect(arg1.length);
            this.field2820.position(0);
            this.field2820.put(arg1);
        }
    }
}
