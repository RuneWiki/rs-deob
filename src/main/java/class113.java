import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 extends class96 {

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2693;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BI)V")
    public final void method789(byte[] arg0, int arg1) {
        if (arg1 != 19954) {
            this.method792(false);
        }
        this.field2693 = ByteBuffer.allocateDirect(arg0.length);
        this.field2693.position(0);
        this.field2693.put(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)[B")
    public final byte[] method792(boolean arg0) {
        if (arg0) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field2693.capacity()];
            this.field2693.position(0);
            this.field2693.get(var2);
            return var2;
        }
    }
}
