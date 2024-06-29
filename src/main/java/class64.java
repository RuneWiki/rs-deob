import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 extends class142 {

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1636;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BI)V")
    public final void method505(byte[] arg0, int arg1) {
        this.field1636 = ByteBuffer.allocateDirect(arg0.length);
        this.field1636.position(0);
        this.field1636.put(arg0);
        if (arg1 <= 69) {
            this.field1636 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)[B")
    public final byte[] method506(int arg0) {
        byte[] var2 = new byte[this.field1636.capacity()];
        this.field1636.position(0);
        if (arg0 == -9056) {
            this.field1636.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
