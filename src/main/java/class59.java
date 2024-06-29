import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 extends class105 {

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1195;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)[B")
    public final byte[] method416(byte arg0) {
        if (arg0 > -2) {
            this.field1195 = null;
        }
        byte[] var2 = new byte[this.field1195.capacity()];
        this.field1195.position(0);
        this.field1195.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B)V")
    public final void method417(int arg0, byte[] arg1) {
        if (arg0 != 64) {
            this.field1195 = null;
        }
        this.field1195 = ByteBuffer.allocateDirect(arg1.length);
        this.field1195.position(0);
        this.field1195.put(arg1);
    }
}
