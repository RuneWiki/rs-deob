import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class286 extends class281 {

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "[B")
    private byte[] field4389;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 3)
    public class286() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)[B", line = 6)
    public final byte[] method2026(int arg0, int arg1, int arg2) {
        this.field4389 = new byte[arg0 * arg1 * arg2 * 2];
        this.method180(arg2, arg0, arg1, true);
        return this.field4389;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V", line = 13)
    public final void method2004(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4389[var10001] = (byte) (var4 * 3 >> 5);
        this.field4389[var5] = (byte) (var4 >> 2);
    }
}
