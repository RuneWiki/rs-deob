import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class140 extends class259 {

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "[B")
    private byte[] field2137;

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V", line = 3)
    public class140() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)V", line = 8)
    public final void method1101(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2137[var10001] = (byte) (var4 * 3 >> 5);
        this.field2137[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)[B", line = 15)
    public final byte[] method1102(int arg0, int arg1, int arg2) {
        this.field2137 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1579(arg1, 19136, arg0, arg2);
        return this.field2137;
    }
}
