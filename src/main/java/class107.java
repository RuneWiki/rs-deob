import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class107 extends class299 {

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1561;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method746(int arg0, int arg1, int arg2) {
        this.field1561.position(arg1);
        if (arg2 != -13759) {
            this.method748((byte) -40, null);
        }
        byte[] var4 = new byte[arg0];
        this.field1561.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)[B", line = 20)
    public final byte[] method747(byte arg0) {
        byte[] var2 = new byte[this.field1561.capacity()];
        this.field1561.position(0);
        this.field1561.get(var2);
        if (arg0 != 55) {
            this.method748((byte) 73, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B[B)V", line = 33)
    public final void method748(byte arg0, byte[] arg1) {
        this.field1561 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 > -98) {
            this.field1561 = null;
        }
        this.field1561.position(0);
        this.field1561.put(arg1);
    }
}
