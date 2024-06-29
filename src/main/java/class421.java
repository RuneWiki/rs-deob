import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class421 extends class521 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5547;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)[B")
    public final byte[] method2436(byte arg0) {
        int var2 = -84 / ((arg0 - 35) / 63);
        byte[] var3 = new byte[this.field5547.capacity()];
        this.field5547.position(0);
        this.field5547.get(var3);
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B)V")
    public final void method2437(int arg0, byte[] arg1) {
        this.field5547 = ByteBuffer.allocateDirect(arg1.length);
        this.field5547.position(0);
        this.field5547.put(arg1);
        if (arg0 != -21654) {
            this.method2437(63, null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZI)[B")
    public final byte[] method2438(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method2437(-78, null);
        }
        byte[] var4 = new byte[arg0];
        this.field5547.position(arg2);
        this.field5547.get(var4, 0, arg0);
        return var4;
    }
}
