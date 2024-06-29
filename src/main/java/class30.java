import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class30 extends class20 {

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "[B")
    private byte[] field477;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V", line = 4)
    public final void method222(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field477[var10001] = (byte) (var4 * 3 >> 5);
        this.field477[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 11)
    public class30() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)[B", line = 15)
    public final byte[] method333(int arg0, int arg1, int arg2) {
        this.field477 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1050(0, arg1, arg0, arg2);
        return this.field477;
    }
}
