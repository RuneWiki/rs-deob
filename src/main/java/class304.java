import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class304 extends class289 {

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "[B")
    private byte[] field4276;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
    public final void method1893(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4276[var10001] = (byte) (var4 * 3 >> 5);
        this.field4276[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)[B")
    public final byte[] method2005(int arg0, int arg1, int arg2) {
        this.field4276 = new byte[arg0 * arg1 * arg2 * 2];
        this.method398(arg0, arg1, arg2, -32442);
        return this.field4276;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class304() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
