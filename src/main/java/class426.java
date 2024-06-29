import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class426 extends class384 {

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "[B")
    private byte[] field6187;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)[B")
    public final byte[] method2669(int arg0, int arg1, int arg2) {
        this.field6187 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2367(arg2, (byte) 77, arg0, arg1);
        return this.field6187;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class426() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    public final void method2434(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field6187[var10001] = (byte) (var4 * 3 >> 5);
        this.field6187[var5] = (byte) (var4 * 3 >> 5);
    }
}
