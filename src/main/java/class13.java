import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class13 extends class301 {

    @OriginalMember(owner = "client!n", name = "C", descriptor = "[B")
    private byte[] field135;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
    public final void method97(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field135[var10001] = (byte) (var4 * 3 >> 5);
        this.field135[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class13() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)[B")
    public final byte[] method98(int arg0, int arg1, int arg2) {
        this.field135 = new byte[arg0 * arg1 * arg2 * 2];
        this.method573(1, arg2, arg1, arg0);
        return this.field135;
    }
}
