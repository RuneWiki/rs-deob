import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class129 extends class197 {

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1983;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BB)V")
    public final void method855(byte[] arg0, byte arg1) {
        int var3 = -37 % ((18 - arg1) / 50);
        this.field1983 = ByteBuffer.allocateDirect(arg0.length);
        this.field1983.position(0);
        this.field1983.put(arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)[B")
    public final byte[] method856(int arg0) {
        byte[] var2 = new byte[this.field1983.capacity()];
        this.field1983.position(0);
        if (arg0 != 1) {
            this.field1983 = (ByteBuffer) null;
        }
        this.field1983.get(var2);
        return var2;
    }
}
