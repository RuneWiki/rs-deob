import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class241 extends class30 {

    @OriginalMember(owner = "client!id", name = "K", descriptor = "[B")
    private byte[] field3387;

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class241() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)[B")
    public final byte[] method1492(int arg0, int arg1, int arg2) {
        this.field3387 = new byte[arg0 * arg1 * arg2 * 2];
        this.method538(arg2, false, arg1, arg0);
        return this.field3387;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
    public final void method257(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3387[var10001] = var4;
        this.field3387[var5] = var4;
    }
}
