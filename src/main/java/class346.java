import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class346 extends class274 {

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5087;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([BI)V", line = 5)
    public final void method1768(byte[] arg0, int arg1) {
        this.field5087 = ByteBuffer.allocateDirect(arg0.length);
        this.field5087.position(0);
        if (arg1 != 32281) {
            this.method1764((byte) 99);
        }
        this.field5087.put(arg0);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)[B", line = 18)
    public final byte[] method1764(byte arg0) {
        byte[] var2 = new byte[this.field5087.capacity()];
        this.field5087.position(0);
        this.field5087.get(var2);
        return arg0 >= -77 ? (byte[]) null : var2;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IBI)[B", line = 36)
    public final byte[] method1766(int arg0, byte arg1, int arg2) {
        this.field5087.position(arg0);
        if (arg1 != -40) {
            this.method1768(null, 4);
        }
        byte[] var4 = new byte[arg2];
        this.field5087.get(var4, 0, arg2);
        return var4;
    }
}
