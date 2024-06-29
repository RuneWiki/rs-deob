import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class320 extends class303 {

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "[B")
    private byte[] field4888;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method2232(int arg0, int arg1, int arg2) {
        this.field4888 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1006(1023, arg1, arg2, arg0);
        return this.field4888;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V", line = 9)
    public final void method2013(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4888[var10001] = (byte) (var4 * 3 >> 5);
        this.field4888[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 17)
    public class320() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
