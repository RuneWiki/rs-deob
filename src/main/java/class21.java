import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class21 extends class233 {

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "[B")
    private byte[] field270;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)[B", line = 4)
    public final byte[] method165(int arg0, int arg1, int arg2) {
        this.field270 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1151(arg1, -57653844, arg2, arg0);
        return this.field270;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 9)
    public class21() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)V", line = 13)
    public final void method166(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field270[var10001] = var4;
        this.field270[var5] = var4;
    }
}
