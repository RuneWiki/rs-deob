import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class50 extends class444 {

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field756;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)[B")
    public final byte[] method376(int arg0, int arg1, int arg2) {
        this.field756.position(arg2);
        byte[] var4 = new byte[arg1];
        this.field756.get(var4, arg0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B[B)V")
    public final void method377(byte arg0, byte[] arg1) {
        this.field756 = ByteBuffer.allocateDirect(arg1.length);
        int var3 = 65 % ((50 - arg0) / 43);
        this.field756.position(0);
        this.field756.put(arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)[B")
    public final byte[] method378(byte arg0) {
        byte[] var2 = new byte[this.field756.capacity()];
        int var3 = -7 / ((-arg0 - 36) / 50);
        this.field756.position(0);
        this.field756.get(var2);
        return var2;
    }
}
