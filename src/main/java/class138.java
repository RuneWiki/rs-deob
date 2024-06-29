import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class138 extends class70 {

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3438;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
    public final void method583(byte[] arg0, int arg1) {
        this.field3438 = ByteBuffer.allocateDirect(arg0.length);
        this.field3438.position(0);
        if (arg1 != 1) {
            this.field3438 = null;
        }
        this.field3438.put(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)[B")
    public final byte[] method588(int arg0) {
        byte[] var2 = new byte[this.field3438.capacity()];
        this.field3438.position(0);
        int var3 = 94 / ((77 - arg0) / 36);
        this.field3438.get(var2);
        return var2;
    }
}
