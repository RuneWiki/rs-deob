import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 extends class1 {

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2746;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[B)V")
    public final void method1(int arg0, byte[] arg1) {
        this.field2746 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != 26278) {
            this.method2(12);
        }
        this.field2746.position(0);
        this.field2746.put(arg1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)[B")
    public final byte[] method2(int arg0) {
        byte[] var2 = new byte[this.field2746.capacity()];
        this.field2746.position(arg0);
        this.field2746.get(var2);
        return var2;
    }
}
