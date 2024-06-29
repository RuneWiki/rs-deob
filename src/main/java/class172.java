import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class172 extends class189 {

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "[B")
    private byte[] field2787;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)V", line = 5)
    public final void method1231(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2787[var10001] = var4;
        this.field2787[var5] = var4;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(III)[B", line = 11)
    public final byte[] method1232(int arg0, int arg1, int arg2) {
        this.field2787 = new byte[arg0 * arg1 * arg2 * 2];
        this.method956(arg0, arg1, arg2, (byte) -86);
        return this.field2787;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 16)
    public class172() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
