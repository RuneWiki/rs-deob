import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 extends class48 {

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3107;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B)V")
    public final void method404(int arg0, byte[] arg1) {
        this.field3107 = ByteBuffer.allocateDirect(arg1.length);
        this.field3107.position(0);
        this.field3107.put(arg1);
        int var3 = 75 / ((-arg0 - 81) / 34);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)[B")
    public final byte[] method405(int arg0) {
        int var2 = 76 / ((arg0 - 39) / 56);
        byte[] var3 = new byte[this.field3107.capacity()];
        this.field3107.position(0);
        this.field3107.get(var3);
        return var3;
    }
}
