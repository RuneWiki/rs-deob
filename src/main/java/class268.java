import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class268 extends class253 {

    @OriginalMember(owner = "client!of", name = "V", descriptor = "[B")
    private byte[] field4535;

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 4)
    public class268() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)[B", line = 7)
    public final byte[] method1807(int arg0, int arg1, int arg2) {
        this.field4535 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1756(-110, arg1, arg0, arg2);
        return this.field4535;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V", line = 13)
    public final void method1717(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4535[var10001] = (byte) (var4 * 3 >> 5);
        this.field4535[var5] = (byte) (var4 >> 2);
    }
}
