import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class350 extends class13 {

    @OriginalMember(owner = "client!si", name = "P", descriptor = "[B")
    private byte[] field5594;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V", line = 4)
    public final void method135(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5594[var10001] = (byte) (var4 * 3 >> 5);
        this.field5594[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)[B", line = 12)
    public final byte[] method2497(int arg0, int arg1, int arg2) {
        this.field5594 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2123(arg0, -28, arg1, arg2);
        return this.field5594;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 17)
    public class350() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
