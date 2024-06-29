import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 extends class235 {

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "[B")
    private byte[] field319;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    public final void method173(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field319[var10001] = var4;
        this.field319[var5] = var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)[B")
    public final byte[] method174(int arg0, int arg1, int arg2) {
        this.field319 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2187((byte) 112, arg2, arg0, arg1);
        return this.field319;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class25() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
