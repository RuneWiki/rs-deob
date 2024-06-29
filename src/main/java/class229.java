import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class229 extends class242 {

    @OriginalMember(owner = "client!je", name = "A", descriptor = "[B")
    private byte[] field3120;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1471(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3120[var10001] = var4;
        this.field3120[var5] = var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)[B", line = 11)
    public final byte[] method1472(int arg0, int arg1, int arg2) {
        this.field3120 = new byte[arg0 * arg1 * arg2 * 2];
        this.method573(1, arg2, arg1, arg0);
        return this.field3120;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 16)
    public class229() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
