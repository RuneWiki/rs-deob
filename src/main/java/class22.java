import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class22 extends class173 {

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "[B")
    private byte[] field285;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)[B")
    public final byte[] method158(int arg0, int arg1, int arg2) {
        this.field285 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1593((byte) 66, arg1, arg0, arg2);
        return this.field285;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class22() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    public final void method159(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field285[var10001] = var4;
        this.field285[var5] = var4;
    }
}
