import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class229 extends class146 {

    @OriginalMember(owner = "client!p", name = "L", descriptor = "[B")
    private byte[] field3253;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)[B", line = 4)
    public final byte[] method1594(int arg0, int arg1, int arg2) {
        this.field3253 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1990((byte) 34, arg2, arg1, arg0);
        return this.field3253;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IB)V", line = 10)
    public final void method1052(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3253[var10001] = (byte) (var4 * 3 >> 5);
        this.field3253[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 17)
    public class229() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
