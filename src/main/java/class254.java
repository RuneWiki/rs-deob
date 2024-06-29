import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class254 extends class11 {

    @OriginalMember(owner = "client!of", name = "L", descriptor = "[B")
    private byte[] field3749;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V", line = 4)
    public final void method156(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3749[var10001] = var4;
        this.field3749[var5] = var4;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)[B", line = 10)
    public final byte[] method1758(int arg0, int arg1, int arg2) {
        this.field3749 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2387(arg2, arg1, (byte) -26, arg0);
        return this.field3749;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 16)
    public class254() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
