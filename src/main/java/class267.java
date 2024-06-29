import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class267 extends class223 {

    @OriginalMember(owner = "client!le", name = "K", descriptor = "[B")
    private byte[] field4294;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 3)
    public class267() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)[B", line = 6)
    public final byte[] method1837(int arg0, int arg1, int arg2) {
        this.field4294 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1971(arg2, arg1, arg0, 23471);
        return this.field4294;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V", line = 13)
    public final void method1628(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4294[var10001] = (byte) (var4 * 3 >> 5);
        this.field4294[var5] = (byte) (var4 >> 2);
    }
}
