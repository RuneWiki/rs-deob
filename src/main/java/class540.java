import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class540 extends class67 {

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field7751;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)[B")
    public final byte[] method461(int arg0) {
        byte[] var2 = new byte[this.field7751.capacity()];
        this.field7751.position(0);
        this.field7751.get(var2);
        return arg0 == 5 ? var2 : (byte[]) null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[B)V")
    public final void method460(int arg0, byte[] arg1) {
        if (arg0 != 3256) {
            this.field7751 = null;
        }
        this.field7751 = ByteBuffer.allocateDirect(arg1.length);
        this.field7751.position(0);
        this.field7751.put(arg1);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)[B")
    public final byte[] method462(int arg0, int arg1, int arg2) {
        this.field7751.position(arg1);
        if (arg0 > -26) {
            this.field7751 = null;
        }
        byte[] var4 = new byte[arg2];
        this.field7751.get(var4, 0, arg2);
        return var4;
    }
}
