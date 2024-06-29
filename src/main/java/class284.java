import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class284 extends class123 {

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "[B")
    private byte[] field4718;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V", line = 4)
    public final void method822(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field4718[var10001] = var4;
        this.field4718[var5] = var4;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)[B", line = 10)
    public final byte[] method1894(int arg0, int arg1, int arg2) {
        this.field4718 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1756(-97, arg1, arg0, arg2);
        return this.field4718;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 16)
    public class284() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
