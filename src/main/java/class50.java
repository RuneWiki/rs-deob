import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class50 extends class37 {

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "[B")
    private byte[] field681;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method378(int arg0, int arg1, int arg2) {
        this.field681 = new byte[arg0 * arg1 * arg2 * 2];
        this.method873(arg1, (byte) -126, arg0, arg2);
        return this.field681;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(IB)V", line = 10)
    public final void method287(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field681[var10001] = var4;
        this.field681[var5] = var4;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 16)
    public class50() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
