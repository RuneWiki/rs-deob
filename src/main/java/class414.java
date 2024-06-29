import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class414 extends class386 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6005;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method2435(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg1];
        this.field6005.position(arg2);
        this.field6005.get(var4, 0, arg1);
        if (arg0 != 2) {
            this.field6005 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)[B", line = 24)
    public final byte[] method2438(int arg0) {
        byte[] var2 = new byte[this.field6005.capacity()];
        if (arg0 != -3672) {
            this.method2438(78);
        }
        this.field6005.position(0);
        this.field6005.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B[B)V", line = 37)
    public final void method2437(byte arg0, byte[] arg1) {
        this.field6005 = ByteBuffer.allocateDirect(arg1.length);
        this.field6005.position(0);
        if (arg0 != 62) {
            this.method2438(73);
        }
        this.field6005.put(arg1);
    }
}
