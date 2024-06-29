import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class470 extends class59 {

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "[B")
    private byte[] field6622;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 3)
    public class470() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V", line = 8)
    public final void method526(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field6622[var10001] = var4;
        this.field6622[var5] = var4;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)[B", line = 14)
    public final byte[] method2795(int arg0, int arg1, int arg2) {
        this.field6622 = new byte[arg0 * arg1 * arg2 * 2];
        this.method65(arg2, arg1, arg0, (byte) 89);
        return this.field6622;
    }
}
