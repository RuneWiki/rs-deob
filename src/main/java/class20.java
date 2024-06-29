import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class20 extends class28 {

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "[B")
    private byte[] field271;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V", line = 5)
    public final void method142(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field271[var10001] = (byte) (var4 * 3 >> 5);
        this.field271[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)[B", line = 12)
    public final byte[] method143(int arg0, int arg1, int arg2) {
        this.field271 = new byte[arg0 * arg1 * arg2 * 2];
        this.method213(arg0, arg2, -586576148, arg1);
        return this.field271;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 17)
    public class20() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
