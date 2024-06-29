import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class8 {

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field971;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)[B")
    public final byte[] method38(byte arg0) {
        byte[] var2 = new byte[this.field971.capacity()];
        this.field971.position(0);
        if (arg0 >= -65) {
            return (byte[]) null;
        } else {
            this.field971.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B)V")
    public final void method41(int arg0, byte[] arg1) {
        this.field971 = ByteBuffer.allocateDirect(arg1.length);
        this.field971.position(0);
        if (arg0 == 6566) {
            this.field971.put(arg1);
        }
    }
}
