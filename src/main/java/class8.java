import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 extends class127 {

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "[B")
    private byte[] field82;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 3)
    public class8() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)[B", line = 6)
    public final byte[] method49(int arg0, int arg1, int arg2) {
        this.field82 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1861(arg0, arg1, arg2, -4096);
        return this.field82;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V", line = 12)
    public final void method50(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field82[var10001] = (byte) (var4 * 3 >> 5);
        this.field82[var5] = (byte) (var4 >> 2);
    }
}
