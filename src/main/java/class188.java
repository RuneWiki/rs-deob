import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class188 extends class15 {

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "[B")
    private byte[] field3156;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method1297(int arg0, int arg1, int arg2) {
        this.field3156 = new byte[arg0 * arg1 * arg2 * 2];
        this.method727(arg2, arg0, arg1, false);
        return this.field3156;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 8)
    public class188() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)V", line = 12)
    public final void method86(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3156[var10001] = var4;
        this.field3156[var5] = var4;
    }
}
