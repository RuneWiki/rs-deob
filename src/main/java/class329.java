import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class329 extends class214 {

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "[B")
    private byte[] field4472;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1428(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4472[var10001] = (byte) (var4 * 3 >> 5);
        this.field4472[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)[B", line = 11)
    public final byte[] method2002(int arg0, int arg1, int arg2) {
        this.field4472 = new byte[arg0 * arg1 * arg2 * 2];
        this.method292((byte) -31, arg1, arg0, arg2);
        return this.field4472;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 17)
    public class329() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
