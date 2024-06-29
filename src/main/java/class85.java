import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class85 extends class225 {

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1581;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)[B")
    public final byte[] method576(int arg0) {
        byte[] var2 = new byte[this.field1581.capacity()];
        this.field1581.position(0);
        if (arg0 != -71) {
            this.method577((byte[]) null, -13);
        }
        this.field1581.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BI)V")
    public final void method577(byte[] arg0, int arg1) {
        this.field1581 = ByteBuffer.allocateDirect(arg0.length);
        this.field1581.position(0);
        this.field1581.put(arg0);
        if (arg1 < 63) {
            this.field1581 = (ByteBuffer) null;
        }
    }
}
