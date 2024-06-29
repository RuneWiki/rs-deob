import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class655 extends class230 {

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field9212;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z[B)V", line = 6)
    public final void method1580(boolean arg0, byte[] arg1) {
        if (!arg0) {
            this.field9212 = ByteBuffer.allocateDirect(arg1.length);
            this.field9212.position(0);
            this.field9212.put(arg1);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)[B", line = 22)
    public final byte[] method1578(int arg0) {
        byte[] var2 = new byte[this.field9212.capacity()];
        if (arg0 != -2) {
            this.method1578(-110);
        }
        this.field9212.position(0);
        this.field9212.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)[B", line = 36)
    public final byte[] method1579(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            this.field9212.position(arg1);
            byte[] var4 = new byte[arg0];
            this.field9212.get(var4, 0, arg0);
            return var4;
        } else {
            return (byte[]) null;
        }
    }
}
