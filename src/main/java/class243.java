import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class243 extends class31 {

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "[B")
    private byte[] field4047;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)[B", line = 4)
    public final byte[] method1724(int arg0, int arg1, int arg2) {
        this.field4047 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2123(arg0, -28, arg1, arg2);
        return this.field4047;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 9)
    public class243() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)V", line = 13)
    public final void method237(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4047[var10001] = var4;
        this.field4047[var5] = var4;
    }
}
