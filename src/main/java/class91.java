import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class91 extends class238 {

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1425;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)[B", line = 7)
    public final byte[] method671(byte arg0) {
        byte[] var2 = new byte[this.field1425.capacity()];
        this.field1425.position(0);
        if (arg0 != 89) {
            this.field1425 = (ByteBuffer) null;
        }
        this.field1425.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[B)V", line = 20)
    public final void method672(int arg0, byte[] arg1) {
        this.field1425 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != -22232) {
            this.method671((byte) -40);
        }
        this.field1425.position(0);
        this.field1425.put(arg1);
    }
}
