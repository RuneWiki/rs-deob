import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class242 extends class63 {

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3904;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)[B")
    public final byte[] method446(int arg0) {
        byte[] var2 = new byte[this.field3904.capacity()];
        int var3 = 57 / ((38 - arg0) / 43);
        this.field3904.position(0);
        this.field3904.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([BZ)V")
    public final void method448(byte[] arg0, boolean arg1) {
        this.field3904 = ByteBuffer.allocateDirect(arg0.length);
        this.field3904.position(0);
        if (!arg1) {
            this.field3904 = (ByteBuffer) null;
        }
        this.field3904.put(arg0);
    }
}
