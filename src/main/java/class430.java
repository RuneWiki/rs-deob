import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class430 extends class377 {

    @OriginalMember(owner = "client!maa", name = "P", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!maa", name = "R", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!maa", name = "Q", descriptor = "[B")
    private byte[] field5691;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBI)V", line = 6)
    public final void method2070(int arg0, byte arg1, int arg2) {
        field5692++;
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        if (arg0 > -50) {
            this.method2305(true, 120, 77, 38);
        }
        this.field5691[var4++] = (byte) (var5 * 3 >> 5);
        this.field5691[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V", line = 25)
    public class430() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZIII)[B", line = 28)
    public final byte[] method2305(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.method2305(false, 120, 6, 41);
        }
        field5690++;
        this.field5691 = new byte[arg1 * arg3 * arg2 * 2];
        this.method2940((byte) 28, arg1, arg3, arg2);
        return this.field5691;
    }
}
