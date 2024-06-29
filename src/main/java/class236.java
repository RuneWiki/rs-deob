import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class236 extends class144 {

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "[B")
    private byte[] field3943;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method1677(int arg0, int arg1, int arg2) {
        this.field3943 = new byte[arg0 * arg1 * arg2 * 2];
        this.method698(arg1, arg0, arg2, 255);
        return this.field3943;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V", line = 9)
    public final void method1161(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3943[var10001] = (byte) (var4 * 3 >> 5);
        this.field3943[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 16)
    public class236() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
