import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class445 extends class190 {

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6417;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([BZ)V", line = 6)
    public final void method1267(byte[] arg0, boolean arg1) {
        this.field6417 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1) {
            this.method1268(62);
        }
        this.field6417.position(0);
        this.field6417.put(arg0);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)[B", line = 22)
    public final byte[] method1268(int arg0) {
        byte[] var2 = new byte[this.field6417.capacity()];
        this.field6417.position(arg0);
        this.field6417.get(var2);
        return var2;
    }
}
