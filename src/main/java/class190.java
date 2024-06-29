import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class190 extends class253 {

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2731;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "([BI)V", line = 5)
    public final void method1318(byte[] arg0, int arg1) {
        this.field2731 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != 3257) {
            this.method1319(-110);
        }
        this.field2731.position(0);
        this.field2731.put(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)[B", line = 19)
    public final byte[] method1319(int arg0) {
        byte[] var2 = new byte[this.field2731.capacity()];
        this.field2731.position(0);
        this.field2731.get(var2);
        if (arg0 != 64) {
            this.field2731 = (ByteBuffer) null;
        }
        return var2;
    }
}
