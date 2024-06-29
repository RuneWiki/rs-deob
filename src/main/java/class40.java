import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class40 extends class449 {

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "[B")
    private byte[] field499;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
    public final void method226(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field499[var10001] = var4;
        this.field499[var5] = var4;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)[B")
    public final byte[] method227(int arg0, int arg1, int arg2) {
        this.field499 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1848(arg1, arg2, (byte) -105, arg0);
        return this.field499;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class40() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
