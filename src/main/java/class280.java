import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class280 extends class253 {

    @OriginalMember(owner = "client!l", name = "T", descriptor = "[B")
    private byte[] field4843;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method1992(int arg0, int arg1, int arg2) {
        this.field4843 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1157(arg2, 0, arg0, arg1);
        return this.field4843;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 8)
    public class280() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V", line = 13)
    public final void method1815(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4843[var10001] = (byte) (var4 * 3 >> 5);
        this.field4843[var5] = (byte) (var4 >> 2);
    }
}
