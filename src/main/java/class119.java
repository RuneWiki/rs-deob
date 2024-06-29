import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class119 extends class305 {

    @OriginalMember(owner = "client!si", name = "P", descriptor = "[B")
    private byte[] field1835;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method813(int arg0, int arg1, int arg2) {
        this.field1835 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1151(arg1, -57653844, arg2, arg0);
        return this.field1835;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V", line = 9)
    public final void method814(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1835[var10001] = (byte) (var4 * 3 >> 5);
        this.field1835[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 16)
    public class119() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
