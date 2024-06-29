import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 extends class253 {

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
    public static int field178 = 0;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
    public static int field180 = 0;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "[B")
    private byte[] field177;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBZ)V")
    public final void method172(int arg0, byte arg1, boolean arg2) {
        field176++;
        if (!arg2) {
            this.field177 = null;
        }
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var5 = arg0 * 2;
        int var6 = var5 + 1;
        this.field177[var5] = var4;
        this.field177[var6] = var4;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBII)[B")
    public final byte[] method173(int arg0, byte arg1, int arg2, int arg3) {
        this.field177 = new byte[arg0 * arg2 * arg3 * 2];
        field179++;
        int var5 = -6 % ((14 - arg1) / 44);
        this.method4046(arg3, -4995, arg0, arg2);
        return this.field177;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
    public class16() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
