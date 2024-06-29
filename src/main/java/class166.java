import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class166 extends class154 {

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "[B")
    private byte[] field2612;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method1102(int arg0, int arg1, int arg2) {
        this.field2612 = new byte[arg0 * arg1 * arg2 * 2];
        this.method577(103, arg1, arg2, arg0);
        return this.field2612;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 8)
    public class166() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V", line = 13)
    public final void method1033(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2612[var10001] = (byte) (var4 * 3 >> 5);
        this.field2612[var5] = (byte) (var4 >> 2);
    }
}
