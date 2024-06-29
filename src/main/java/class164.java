import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class164 extends class231 {

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[B")
    private byte[] field2321;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)[B")
    public final byte[] method1165(int arg0, int arg1, int arg2) {
        this.field2321 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1786(arg0, arg2, arg1, -122);
        return this.field2321;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)V")
    public final void method1166(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2321[var10001] = var4;
        this.field2321[var5] = var4;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class164() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
