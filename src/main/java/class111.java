import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class111 extends class134 {

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "[B")
    private byte[] field1758;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V", line = 4)
    public final void method780(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1758[var10001] = var4;
        this.field1758[var5] = var4;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 10)
    public class111() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)[B", line = 13)
    public final byte[] method781(int arg0, int arg1, int arg2) {
        this.field1758 = new byte[arg0 * arg1 * arg2 * 2];
        this.method419(-95, arg0, arg2, arg1);
        return this.field1758;
    }
}
