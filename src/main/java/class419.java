import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class419 extends class198 {

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5887;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIZ)[B")
    public final byte[] method1098(int arg0, int arg1, boolean arg2) {
        byte[] var4 = new byte[arg1];
        this.field5887.position(arg0);
        this.field5887.get(var4, 0, arg1);
        if (arg2) {
            this.field5887 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)[B")
    public final byte[] method1099(boolean arg0) {
        if (arg0) {
            this.field5887 = null;
        }
        byte[] var2 = new byte[this.field5887.capacity()];
        this.field5887.position(0);
        this.field5887.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B[B)V")
    public final void method1097(byte arg0, byte[] arg1) {
        this.field5887 = ByteBuffer.allocateDirect(arg1.length);
        this.field5887.position(0);
        int var3 = 2 / ((arg0 + 47) / 48);
        this.field5887.put(arg1);
    }
}
