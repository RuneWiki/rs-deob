import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class12 extends class112 {

    @OriginalMember(owner = "client!an", name = "T", descriptor = "[B")
    private byte[] field168;

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 3)
    public class12() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(III)[B", line = 6)
    public final byte[] method73(int arg0, int arg1, int arg2) {
        this.field168 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1986(arg1, 0, arg0, arg2);
        return this.field168;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)V", line = 12)
    public final void method74(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field168[var10001] = var4;
        this.field168[var5] = var4;
    }
}
