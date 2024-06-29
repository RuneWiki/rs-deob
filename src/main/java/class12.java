import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 extends class245 {

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field210;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)[B")
    public final byte[] method109(int arg0) {
        byte[] var2 = new byte[this.field210.capacity()];
        this.field210.position(0);
        if (arg0 != -14208) {
            this.method109(-83);
        }
        this.field210.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([BI)V")
    public final void method110(byte[] arg0, int arg1) {
        if (arg1 == -17527) {
            this.field210 = ByteBuffer.allocateDirect(arg0.length);
            this.field210.position(0);
            this.field210.put(arg0);
        }
    }
}
