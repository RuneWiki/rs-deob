import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class58 extends class39 {

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "[B")
    private byte[] field921;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(III)[B", line = 3)
    public final byte[] method392(int arg0, int arg1, int arg2) {
        this.field921 = new byte[arg0 * arg1 * arg2 * 2];
        this.method727(arg2, arg0, arg1, false);
        return this.field921;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 8)
    public class58() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V", line = 13)
    public final void method309(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field921[var10001] = (byte) (var4 * 3 >> 5);
        this.field921[var5] = (byte) (var4 >> 2);
    }
}
