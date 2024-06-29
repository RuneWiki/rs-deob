import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class118 extends class72 {

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2238;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)V")
    public final void method533(int arg0, byte[] arg1) {
        int var3 = 36 % ((4 - arg0) / 55);
        this.field2238 = ByteBuffer.allocateDirect(arg1.length);
        this.field2238.position(0);
        this.field2238.put(arg1);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)[B")
    public final byte[] method529(byte arg0) {
        byte[] var2 = new byte[this.field2238.capacity()];
        this.field2238.position(0);
        if (arg0 == -65) {
            this.field2238.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
