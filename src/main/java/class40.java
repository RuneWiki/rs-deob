import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class40 extends class119 {

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "[B")
    private byte[] field729;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V", line = 4)
    public final void method348(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field729[var10001] = var4;
        this.field729[var5] = var4;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 10)
    public class40() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)[B", line = 14)
    public final byte[] method349(int arg0, int arg1, int arg2) {
        this.field729 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2069(arg1, arg2, (byte) 63, arg0);
        return this.field729;
    }
}
