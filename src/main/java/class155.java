import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class155 extends class11 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2513;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([BI)V", line = 5)
    public final void method67(byte[] arg0, int arg1) {
        this.field2513 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = 120 / ((-arg1 - 79) / 45);
        this.field2513.position(0);
        this.field2513.put(arg0);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)[B", line = 19)
    public final byte[] method68(int arg0) {
        byte[] var2 = new byte[this.field2513.capacity()];
        this.field2513.position(0);
        int var3 = -31 / ((-arg0 - 32) / 57);
        this.field2513.get(var2);
        return var2;
    }
}
