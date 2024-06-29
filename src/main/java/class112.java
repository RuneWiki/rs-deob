import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class112 extends class133 {

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1523;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)[B")
    public final byte[] method776(byte arg0) {
        if (arg0 == -45) {
            byte[] var2 = new byte[this.field1523.capacity()];
            this.field1523.position(0);
            this.field1523.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([BI)V")
    public final void method777(byte[] arg0, int arg1) {
        this.field1523 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 > 76) {
            this.field1523.position(0);
            this.field1523.put(arg0);
        }
    }
}
