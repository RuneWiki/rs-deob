import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class250 extends class175 {

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4250;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B[B)V", line = 5)
    public final void method1156(byte arg0, byte[] arg1) {
        if (arg0 > 110) {
            this.field4250 = ByteBuffer.allocateDirect(arg1.length);
            this.field4250.position(0);
            this.field4250.put(arg1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)[B", line = 18)
    public final byte[] method1157(byte arg0) {
        byte[] var2 = new byte[this.field4250.capacity()];
        this.field4250.position(0);
        this.field4250.get(var2);
        if (arg0 < 13) {
            this.method1156((byte) 48, (byte[]) null);
        }
        return var2;
    }
}
