import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class176 extends class20 {

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "[B")
    private byte[] field2851;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V", line = 4)
    public final void method98(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2851[var10001] = var4;
        this.field2851[var5] = var4;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)[B", line = 11)
    public final byte[] method1268(int arg0, int arg1, int arg2) {
        this.field2851 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1151(arg1, arg0, 101, arg2);
        return this.field2851;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 16)
    public class176() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
