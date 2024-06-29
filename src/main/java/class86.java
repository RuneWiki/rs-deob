import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class86 extends class13 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field905;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)[B")
    public final byte[] method62(byte arg0) {
        if (arg0 != 44) {
            this.method62((byte) 54);
        }
        byte[] var2 = new byte[this.field905.capacity()];
        this.field905.position(0);
        this.field905.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIB)[B")
    public final byte[] method61(int arg0, int arg1, byte arg2) {
        this.field905.position(arg1);
        byte[] var4 = new byte[arg0];
        if (arg2 != 118) {
            this.method61(104, -117, (byte) 63);
        }
        this.field905.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[B)V")
    public final void method60(int arg0, byte[] arg1) {
        this.field905 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 >= 113) {
            this.field905.position(0);
            this.field905.put(arg1);
        }
    }
}
