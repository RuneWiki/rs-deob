import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class439 extends class653 {

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6056;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)[B", line = 5)
    public final byte[] method2521(int arg0) {
        if (arg0 != 13949) {
            this.method2522(null, 85);
        }
        byte[] var2 = new byte[this.field6056.capacity()];
        this.field6056.position(0);
        this.field6056.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BI)V", line = 19)
    public final void method2522(byte[] arg0, int arg1) {
        this.field6056 = ByteBuffer.allocateDirect(arg0.length);
        this.field6056.position(0);
        this.field6056.put(arg0);
        if (arg1 != 4) {
            this.method2523(-58, 44, 55);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)[B", line = 32)
    public final byte[] method2523(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field6056.position(arg1);
        this.field6056.get(var4, 0, arg2);
        if (arg0 != 4) {
            this.field6056 = null;
        }
        return var4;
    }
}
