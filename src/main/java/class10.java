import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class131 {

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field170;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BB)V")
    public final void method60(byte[] arg0, byte arg1) {
        this.field170 = ByteBuffer.allocateDirect(arg0.length);
        this.field170.position(0);
        if (arg1 > -87) {
            this.method60(null, (byte) -43);
        }
        this.field170.put(arg0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)[B")
    public final byte[] method61(byte arg0) {
        if (arg0 != 84) {
            this.field170 = null;
        }
        byte[] var2 = new byte[this.field170.capacity()];
        this.field170.position(0);
        this.field170.get(var2);
        return var2;
    }
}
