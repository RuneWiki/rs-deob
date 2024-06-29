import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class34 extends class247 {

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "[B")
    private byte[] field401;

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 3)
    public class34() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method191(int arg0, int arg1, int arg2) {
        this.field401 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1990((byte) 34, arg2, arg1, arg0);
        return this.field401;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(IB)V", line = 13)
    public final void method192(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field401[var10001] = var4;
        this.field401[var5] = var4;
    }
}
