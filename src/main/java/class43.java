import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class43 extends class126 {

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "[B")
    private byte[] field598;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 4)
    public class43() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)V", line = 8)
    public final void method261(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field598[var10001] = var4;
        this.field598[var5] = var4;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)[B", line = 14)
    public final byte[] method262(int arg0, int arg1, int arg2) {
        this.field598 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1861(arg0, arg1, arg2, -4096);
        return this.field598;
    }
}
