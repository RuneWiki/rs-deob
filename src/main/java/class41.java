import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class41 extends class624 {

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "[B")
    private byte[] field536;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "[Lxa;")
    public static class424[] field535;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIII)[B", line = 3)
    public final byte[] method248(int arg0, int arg1, int arg2, int arg3) {
        field537++;
        this.field536 = new byte[arg2 * arg3 * arg0 * 2];
        this.method3645(arg2, arg3, arg0, -23747);
        if (arg1 <= 19) {
            method250(-99);
        }
        return this.field536;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBB)V", line = 18)
    public final void method249(int arg0, byte arg1, byte arg2) {
        field534++;
        if (arg1 != 97) {
            field535 = null;
        }
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var6 = var4 + 1;
        this.field536[var4] = (byte) (var5 * 3 >> 5);
        this.field536[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 36)
    public class41() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 41)
    public static void method250(int arg0) {
        field535 = null;
        if (arg0 != -14522) {
            method250(-111);
        }
    }
}
