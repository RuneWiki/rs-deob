import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 extends class100 {

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "[B")
    private byte[] field37;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)V", line = 4)
    public final void method17(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field37[var10001] = var4;
        this.field37[var5] = var4;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 10)
    public class3() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)[B", line = 14)
    public final byte[] method18(int arg0, int arg1, int arg2) {
        this.field37 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1430(6960, arg0, arg2, arg1);
        return this.field37;
    }
}
