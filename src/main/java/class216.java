import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class216 extends class531 {

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3196;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)[B")
    public final byte[] method1502(int arg0) {
        byte[] var2 = new byte[this.field3196.capacity()];
        if (arg0 <= 123) {
            this.field3196 = null;
        }
        this.field3196.position(0);
        this.field3196.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([BI)V")
    public final void method1503(byte[] arg0, int arg1) {
        this.field3196 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != -14) {
            this.field3196 = null;
        }
        this.field3196.position(0);
        this.field3196.put(arg0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)[B")
    public final byte[] method1504(int arg0, int arg1, int arg2) {
        this.field3196.position(arg1);
        byte[] var4 = new byte[arg0];
        if (arg2 >= -116) {
            return (byte[]) null;
        } else {
            this.field3196.get(var4, 0, arg0);
            return var4;
        }
    }
}
