import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class93 extends class297 {

    @OriginalMember(owner = "client!be", name = "W", descriptor = "[B")
    private byte[] field1472;

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 3)
    public class93() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V", line = 7)
    public final void method665(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1472[var10001] = (byte) (var4 * 3 >> 5);
        this.field1472[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(III)[B", line = 15)
    public final byte[] method666(int arg0, int arg1, int arg2) {
        this.field1472 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1610(arg0, arg1, (byte) 111, arg2);
        return this.field1472;
    }
}
