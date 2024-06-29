import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class227 extends class434 {

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3230;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)[B")
    public final byte[] method1521(byte arg0) {
        byte[] var2 = new byte[this.field3230.capacity()];
        this.field3230.position(0);
        if (arg0 <= 115) {
            return (byte[]) null;
        } else {
            this.field3230.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "([BI)V")
    public final void method1522(byte[] arg0, int arg1) {
        this.field3230 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != 7) {
            this.method1523(-36, (byte) -31, -36);
        }
        this.field3230.position(0);
        this.field3230.put(arg0);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1523(int arg0, byte arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        if (arg1 != 41) {
            this.field3230 = null;
        }
        this.field3230.position(arg0);
        this.field3230.get(var4, 0, arg2);
        return var4;
    }
}
