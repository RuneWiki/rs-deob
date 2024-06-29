import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class423 extends class64 {

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5920;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)[B")
    public final byte[] method395(boolean arg0) {
        if (arg0) {
            this.field5920 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field5920.capacity()];
        this.field5920.position(0);
        this.field5920.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BB)V")
    public final void method397(byte[] arg0, byte arg1) {
        this.field5920 = ByteBuffer.allocateDirect(arg0.length);
        this.field5920.position(0);
        this.field5920.put(arg0);
        int var3 = 20 % ((-arg1 - 60) / 47);
    }
}
