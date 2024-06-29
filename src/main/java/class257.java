import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class257 extends class18 {

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4420;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)[B", line = 6)
    public final byte[] method119(int arg0) {
        byte[] var2 = new byte[this.field4420.capacity()];
        if (arg0 != 128) {
            this.method116(-56, (byte[]) null);
        }
        this.field4420.position(0);
        this.field4420.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[B)V", line = 21)
    public final void method116(int arg0, byte[] arg1) {
        this.field4420 = ByteBuffer.allocateDirect(arg1.length);
        this.field4420.position(0);
        this.field4420.put(arg1);
        if (arg0 != -1) {
            this.field4420 = (ByteBuffer) null;
        }
    }
}
