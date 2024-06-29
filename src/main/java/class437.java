import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class437 extends class299 {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6378;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)[B")
    public final byte[] method1863(boolean arg0) {
        byte[] var2 = new byte[this.field6378.capacity()];
        if (arg0) {
            this.field6378.position(0);
            this.field6378.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([BI)V")
    public final void method1866(byte[] arg0, int arg1) {
        this.field6378 = ByteBuffer.allocateDirect(arg0.length);
        this.field6378.position(arg1);
        this.field6378.put(arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)[B")
    public final byte[] method1864(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg1];
        this.field6378.position(arg0);
        if (arg2 >= -107) {
            this.field6378 = null;
        }
        this.field6378.get(var4, 0, arg1);
        return var4;
    }
}
