import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class100 extends class232 {

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "[B")
    private byte[] field1338;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)[B", line = 4)
    public final byte[] method696(int arg0, int arg1, int arg2) {
        this.field1338 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1140(arg0, arg2, arg1, -127);
        return this.field1338;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 9)
    public class100() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V", line = 13)
    public final void method697(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1338[var10001] = var4;
        this.field1338[var5] = var4;
    }
}
