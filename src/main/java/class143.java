import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class143 extends class147 {

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "[B")
    private byte[] field2092;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 4)
    public class143() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)[B", line = 7)
    public final byte[] method912(int arg0, int arg1, int arg2) {
        this.field2092 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1277(arg0, arg2, arg1, (byte) -32);
        return this.field2092;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V", line = 13)
    public final void method913(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2092[var10001] = var4;
        this.field2092[var5] = var4;
    }
}
