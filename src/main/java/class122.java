import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class122 extends class100 {

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2978;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[B)V")
    public final void method846(int arg0, byte[] arg1) {
        this.field2978 = ByteBuffer.allocateDirect(arg1.length);
        this.field2978.position(0);
        this.field2978.put(arg1);
        if (arg0 != -1) {
            this.field2978 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)[B")
    public final byte[] method849(int arg0) {
        if (arg0 != 0) {
            this.field2978 = null;
        }
        byte[] var2 = new byte[this.field2978.capacity()];
        this.field2978.position(0);
        this.field2978.get(var2);
        return var2;
    }
}
