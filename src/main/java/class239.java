import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class239 extends class137 {

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "[B")
    private byte[] field3150;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)[B")
    public final byte[] method1530(int arg0, int arg1, int arg2) {
        this.field3150 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1680(1, arg0, arg2, arg1);
        return this.field3150;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class239() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V")
    public final void method883(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3150[var10001] = (byte) (var4 * 3 >> 5);
        this.field3150[var5] = (byte) (var4 * 3 >> 5);
    }
}
