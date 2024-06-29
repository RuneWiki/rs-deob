import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class161 extends class51 {

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "[B")
    private byte[] field2515;

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 4)
    public class161() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)[B", line = 7)
    public final byte[] method1093(int arg0, int arg1, int arg2) {
        this.field2515 = new byte[arg0 * arg1 * arg2 * 2];
        this.method419(-98, arg0, arg2, arg1);
        return this.field2515;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V", line = 13)
    public final void method370(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2515[var10001] = (byte) (var4 * 3 >> 5);
        this.field2515[var5] = (byte) (var4 >> 2);
    }
}
