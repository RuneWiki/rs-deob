import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class331 extends class70 {

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "[B")
    private byte[] field5405;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 3)
    public class331() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)[B", line = 6)
    public final byte[] method2358(int arg0, int arg1, int arg2) {
        this.field5405 = new byte[arg0 * arg1 * arg2 * 2];
        this.method58(arg2, arg0, (byte) 74, arg1);
        return this.field5405;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IB)V", line = 13)
    public final void method487(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5405[var10001] = (byte) (var4 * 3 >> 5);
        this.field5405[var5] = (byte) (var4 >> 2);
    }
}
