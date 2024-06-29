import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class4 {

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2709;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[B)V")
    public final void method12(byte arg0, byte[] arg1) {
        this.field2709 = ByteBuffer.allocateDirect(arg1.length);
        this.field2709.position(0);
        this.field2709.put(arg1);
        if (arg0 != -23) {
            this.field2709 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)[B")
    public final byte[] method16(int arg0) {
        byte[] var2 = new byte[this.field2709.capacity()];
        this.field2709.position(0);
        this.field2709.get(var2);
        if (arg0 != -8915) {
            this.method16(-80);
        }
        return var2;
    }
}
