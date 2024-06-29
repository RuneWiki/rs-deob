import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class132 extends class245 {

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[B")
    private byte[] field2236;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method1017(int arg0, int arg1, int arg2) {
        this.field2236 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2272(1714362860, arg0, arg2, arg1);
        return this.field2236;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V", line = 9)
    public final void method1018(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2236[var10001] = (byte) (var4 * 3 >> 5);
        this.field2236[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 17)
    public class132() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
