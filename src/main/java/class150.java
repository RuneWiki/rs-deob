import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class150 extends class227 {

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "[B")
    private byte[] field2538;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 3)
    public class150() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V", line = 7)
    public final void method1026(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2538[var10001] = (byte) (var4 * 3 >> 5);
        this.field2538[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)[B", line = 14)
    public final byte[] method1027(int arg0, int arg1, int arg2) {
        this.field2538 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1261(arg2, arg1, arg0, (byte) 19);
        return this.field2538;
    }
}
