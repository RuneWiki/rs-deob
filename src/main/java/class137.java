import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class137 extends class31 {

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "[B")
    private byte[] field2122;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method951(int arg0, int arg1, int arg2) {
        this.field2122 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1151(arg1, arg0, -79, arg2);
        return this.field2122;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V", line = 9)
    public final void method154(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2122[var10001] = (byte) (var4 * 3 >> 5);
        this.field2122[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 17)
    public class137() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
