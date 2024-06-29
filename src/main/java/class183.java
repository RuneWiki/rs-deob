import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class183 extends class1 {

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3601;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)V")
    public final void method4(int arg0, byte[] arg1) {
        this.field3601 = ByteBuffer.allocateDirect(arg1.length);
        this.field3601.position(arg0);
        this.field3601.put(arg1);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)[B")
    public final byte[] method1(byte arg0) {
        byte[] var2 = new byte[this.field3601.capacity()];
        this.field3601.position(0);
        this.field3601.get(var2);
        if (arg0 < 106) {
            this.method1((byte) -59);
        }
        return var2;
    }
}
