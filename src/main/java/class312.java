import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class312 extends class141 {

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5298;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method1050(int arg0) {
        if (arg0 < 74) {
            this.field5298 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field5298.capacity()];
        this.field5298.position(0);
        this.field5298.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BI)V", line = 20)
    public final void method1051(byte[] arg0, int arg1) {
        this.field5298 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != 27438) {
            this.method1051((byte[]) null, 25);
        }
        this.field5298.position(0);
        this.field5298.put(arg0);
    }
}
