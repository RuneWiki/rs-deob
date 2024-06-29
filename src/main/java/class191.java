import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class191 extends class318 {

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2901;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)[B", line = 6)
    public final byte[] method1308(int arg0) {
        byte[] var2 = new byte[this.field2901.capacity()];
        this.field2901.position(0);
        int var3 = 64 % ((arg0 - 30) / 36);
        this.field2901.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[B)V", line = 18)
    public final void method1309(int arg0, byte[] arg1) {
        this.field2901 = ByteBuffer.allocateDirect(arg1.length);
        this.field2901.position(0);
        if (arg0 != 1) {
            this.method1308(74);
        }
        this.field2901.put(arg1);
    }
}
