import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class237 extends class191 {

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "[B")
    private byte[] field3718;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)[B", line = 3)
    public final byte[] method1688(int arg0, int arg1, int arg2) {
        this.field3718 = new byte[arg0 * arg1 * arg2 * 2];
        this.method180(arg2, arg0, arg1, true);
        return this.field3718;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 8)
    public class237() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)V", line = 13)
    public final void method1411(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3718[var10001] = var4;
        this.field3718[var5] = var4;
    }
}
