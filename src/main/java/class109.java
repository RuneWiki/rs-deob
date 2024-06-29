import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 extends class82 {

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2641;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B)V")
    public final void method625(int arg0, byte[] arg1) {
        int var3 = -99 / ((12 - arg0) / 59);
        this.field2641 = ByteBuffer.allocateDirect(arg1.length);
        this.field2641.position(0);
        this.field2641.put(arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)[B")
    public final byte[] method626(boolean arg0) {
        if (arg0) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[this.field2641.capacity()];
            this.field2641.position(0);
            this.field2641.get(var2);
            return var2;
        }
    }
}
