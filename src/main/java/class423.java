import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class423 extends class195 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "[B")
    private byte[] field5737;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class423() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V")
    public final void method1117(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5737[var10001] = (byte) (var4 * 3 >> 5);
        this.field5737[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)[B")
    public final byte[] method2503(int arg0, int arg1, int arg2) {
        this.field5737 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1595(arg2, arg1, (byte) 127, arg0);
        return this.field5737;
    }
}
