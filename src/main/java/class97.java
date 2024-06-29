import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class27 {

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2062;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)[B")
    public final byte[] method241(int arg0) {
        byte[] var2 = new byte[this.field2062.capacity()];
        this.field2062.position(0);
        this.field2062.get(var2);
        if (arg0 != -9731) {
            this.method241(-4);
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[B)V")
    public final void method242(int arg0, byte[] arg1) {
        this.field2062 = ByteBuffer.allocateDirect(arg1.length);
        this.field2062.position(0);
        this.field2062.put(arg1);
        if (arg0 != 500) {
            this.method241(23);
        }
    }
}
