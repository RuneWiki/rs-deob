import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class93 extends class235 {

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1461;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)[B")
    public final byte[] method704(int arg0) {
        byte[] var2 = new byte[this.field1461.capacity()];
        int var3 = -75 / ((arg0 + 29) / 35);
        this.field1461.position(0);
        this.field1461.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([BZ)V")
    public final void method705(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field1461 = ByteBuffer.allocateDirect(arg0.length);
            this.field1461.position(0);
            this.field1461.put(arg0);
        }
    }
}
