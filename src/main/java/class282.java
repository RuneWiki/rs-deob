import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class282 extends class232 {

    @OriginalMember(owner = "client!te", name = "E", descriptor = "[B")
    private byte[] field4861;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 4)
    public class282() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(III)[B", line = 7)
    public final byte[] method1963(int arg0, int arg1, int arg2) {
        this.field4861 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1856((byte) 110, arg2, arg0, arg1);
        return this.field4861;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V", line = 13)
    public final void method1595(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4861[var10001] = var4;
        this.field4861[var5] = var4;
    }
}
