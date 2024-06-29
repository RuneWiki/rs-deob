import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class52 extends class207 {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field798;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method473(int arg0) {
        byte[] var2 = new byte[this.field798.capacity()];
        if (arg0 != -1) {
            this.field798 = (ByteBuffer) null;
        }
        this.field798.position(0);
        this.field798.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BB)V", line = 19)
    public final void method474(byte[] arg0, byte arg1) {
        this.field798 = ByteBuffer.allocateDirect(arg0.length);
        int var3 = -93 % ((-arg1 - 81) / 41);
        this.field798.position(0);
        this.field798.put(arg0);
    }
}
