import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class399 extends class101 {

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "[B")
    private byte[] field5752;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)V")
    public final void method543(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5752[var10001] = (byte) (var4 * 3 >> 5);
        this.field5752[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)[B")
    public final byte[] method2492(int arg0, int arg1, int arg2) {
        this.field5752 = new byte[arg0 * arg1 * arg2 * 2];
        this.method27(-120, arg1, arg2, arg0);
        return this.field5752;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class399() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
