import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class112 extends class46 {

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2162;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)[B")
    public final byte[] method307(int arg0) {
        if (arg0 < 91) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field2162.capacity()];
            this.field2162.position(0);
            this.field2162.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BI)V")
    public final void method309(byte[] arg0, int arg1) {
        this.field2162 = ByteBuffer.allocateDirect(arg0.length);
        this.field2162.position(arg1);
        this.field2162.put(arg0);
    }
}
