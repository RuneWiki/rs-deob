import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class303 extends class252 {

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "[B")
    private byte[] field5186;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method2121(int arg0, int arg1, int arg2) {
        this.field5186 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1933(-32247, arg2, arg1, arg0);
        return this.field5186;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)V", line = 9)
    public final void method1805(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5186[var10001] = var4;
        this.field5186[var5] = var4;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 15)
    public class303() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
