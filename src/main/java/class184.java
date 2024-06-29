import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class184 extends class35 {

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "[B")
    private byte[] field3252;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 3)
    public class184() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)V", line = 8)
    public final void method241(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3252[var10001] = (byte) (var4 * 3 >> 5);
        this.field3252[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)[B", line = 15)
    public final byte[] method1345(int arg0, int arg1, int arg2) {
        this.field3252 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1986(arg1, 0, arg0, arg2);
        return this.field3252;
    }
}
