import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class48 extends class76 {

    @OriginalMember(owner = "client!cha", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field704;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIZ)[B")
    public final byte[] method538(int arg0, int arg1, boolean arg2) {
        byte[] var4 = new byte[arg0];
        if (!arg2) {
            this.method540(null, -109);
        }
        this.field704.position(arg1);
        this.field704.get(var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)[B")
    public final byte[] method539(byte arg0) {
        if (arg0 < 46) {
            this.method538(33, -124, true);
        }
        byte[] var2 = new byte[this.field704.capacity()];
        this.field704.position(0);
        this.field704.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "([BI)V")
    public final void method540(byte[] arg0, int arg1) {
        this.field704 = ByteBuffer.allocateDirect(arg0.length);
        this.field704.position(0);
        this.field704.put(arg0);
        int var3 = -10 / ((-arg1 - 32) / 32);
    }
}
