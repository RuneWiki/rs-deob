import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class278 extends class65 {

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "[B")
    private byte[] field4611;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)[B", line = 4)
    public final byte[] method1915(int arg0, int arg1, int arg2) {
        this.field4611 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1430(6960, arg0, arg2, arg1);
        return this.field4611;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V", line = 10)
    public final void method489(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4611[var10001] = (byte) (var4 * 3 >> 5);
        this.field4611[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 17)
    public class278() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
