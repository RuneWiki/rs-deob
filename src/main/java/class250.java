import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class250 extends class126 {

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "[B")
    private byte[] field3686;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
    public class250() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)[B")
    public final byte[] method1638(int arg0, int arg1, int arg2) {
        this.field3686 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1598(arg1, arg0, (byte) 107, arg2);
        return this.field3686;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
    public final void method887(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3686[var10001] = (byte) (var4 * 3 >> 5);
        this.field3686[var5] = (byte) (var4 * 3 >> 5);
    }
}
