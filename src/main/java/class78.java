import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class78 extends class412 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field959;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)[B", line = 7)
    public final byte[] method499(byte arg0) {
        byte[] var2 = new byte[this.field959.capacity()];
        this.field959.position(0);
        int var3 = -21 / ((90 - arg0) / 32);
        this.field959.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I[B)V", line = 19)
    public final void method500(int arg0, byte[] arg1) {
        this.field959 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != 4787) {
            this.field959 = (ByteBuffer) null;
        }
        this.field959.position(0);
        this.field959.put(arg1);
    }
}
