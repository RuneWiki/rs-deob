import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class389 extends class240 {

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5684;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)[B", line = 6)
    public final byte[] method1617(byte arg0) {
        if (arg0 != -46) {
            this.field5684 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field5684.capacity()];
        this.field5684.position(0);
        this.field5684.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BB)V", line = 20)
    public final void method1620(byte[] arg0, byte arg1) {
        this.field5684 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != -106) {
            this.field5684 = (ByteBuffer) null;
        }
        this.field5684.position(0);
        this.field5684.put(arg0);
    }
}
