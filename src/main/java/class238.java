import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class238 extends class419 {

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[B")
    private byte[] field3300;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1585(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3300[var10001] = var4;
        this.field3300[var5] = var4;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)[B", line = 11)
    public final byte[] method1586(int arg0, int arg1, int arg2) {
        this.field3300 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1579(arg1, 19136, arg0, arg2);
        return this.field3300;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 16)
    public class238() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
