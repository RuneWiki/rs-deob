import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class587 extends class117 {

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "[B")
    private byte[] field8216;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZI)V", line = 3)
    public final void method903(byte arg0, boolean arg1, int arg2) {
        field8214++;
        int var4 = arg2 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field8216[var10001] = (byte) (var5 * 3 >> 5);
        this.field8216[var6] = (byte) (var5 * 3 >> 5);
        if (!arg1) {
            this.field8216 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(IIII)[B", line = 21)
    public final byte[] method3322(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -61 / ((arg0 - 29) / 33);
        field8215++;
        this.field8216 = new byte[arg1 * arg2 * arg3 * 2];
        this.method3724(arg2, arg1, arg3, -1029882484);
        return this.field8216;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 35)
    public class587() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
