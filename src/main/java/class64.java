import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class64 extends class11 {

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "[B")
    private byte[] field798;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class64() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)[B")
    public final byte[] method341(int arg0, int arg1, int arg2) {
        this.field798 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1848(arg1, arg2, (byte) -44, arg0);
        return this.field798;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V")
    public final void method72(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field798[var10001] = (byte) (var4 * 3 >> 5);
        this.field798[var5] = (byte) (var4 * 3 >> 5);
    }
}
