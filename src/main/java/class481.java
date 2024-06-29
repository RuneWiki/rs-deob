import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class481 extends class124 {

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field6744;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([BI)V", line = 7)
    public final void method713(byte[] arg0, int arg1) {
        this.field6744 = ByteBuffer.allocateDirect(arg0.length);
        this.field6744.position(0);
        this.field6744.put(arg0);
        if (arg1 != 4818) {
            this.field6744 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)[B", line = 20)
    public final byte[] method711(int arg0) {
        byte[] var2 = new byte[this.field6744.capacity()];
        this.field6744.position(arg0);
        this.field6744.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)[B", line = 30)
    public final byte[] method712(int arg0, int arg1, int arg2) {
        if (arg1 > -21) {
            this.field6744 = null;
        }
        this.field6744.position(arg0);
        byte[] var4 = new byte[arg2];
        this.field6744.get(var4, 0, arg2);
        return var4;
    }
}
