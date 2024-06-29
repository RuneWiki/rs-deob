import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class177 extends class333 {

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "[B")
    private byte[] field2674;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1227(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2674[var10001] = var4;
        this.field2674[var5] = var4;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 11)
    public class177() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)[B", line = 14)
    public final byte[] method1228(int arg0, int arg1, int arg2) {
        this.field2674 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1642((byte) -95, arg2, arg0, arg1);
        return this.field2674;
    }
}
