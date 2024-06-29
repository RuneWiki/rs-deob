import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class105 extends class67 {

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "[B")
    private byte[] field1778;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(IB)V", line = 4)
    public final void method575(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1778[var10001] = var4;
        this.field1778[var5] = var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)[B", line = 11)
    public final byte[] method826(int arg0, int arg1, int arg2) {
        this.field1778 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1157(arg2, 0, arg0, arg1);
        return this.field1778;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 16)
    public class105() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
