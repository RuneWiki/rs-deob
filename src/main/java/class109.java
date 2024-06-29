import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class109 extends class200 {

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1721;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method716(int arg0) {
        byte[] var2 = new byte[this.field1721.capacity()];
        this.field1721.position(0);
        this.field1721.get(var2);
        int var3 = -60 % ((arg0) / 34);
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([BI)V", line = 19)
    public final void method717(byte[] arg0, int arg1) {
        this.field1721 = ByteBuffer.allocateDirect(arg0.length);
        this.field1721.position(0);
        if (arg1 < 70) {
            this.method716(-74);
        }
        this.field1721.put(arg0);
    }
}
