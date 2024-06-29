import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class147 extends class126 {

    @OriginalMember(owner = "client!js", name = "G", descriptor = "[B")
    private byte[] field1876;

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V", line = 3)
    public class147() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method792(int arg0, int arg1, int arg2) {
        this.field1876 = new byte[arg0 * arg1 * arg2 * 2];
        this.method27(27, arg1, arg2, arg0);
        return this.field1876;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)V", line = 13)
    public final void method679(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1876[var10001] = var4;
        this.field1876[var5] = var4;
    }
}
