import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class181 extends class20 {

    @OriginalMember(owner = "client!efa", name = "O", descriptor = "[C")
    public static char[] field2417 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!efa", name = "K", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!efa", name = "L", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!efa", name = "N", descriptor = "Lvu;")
    public static class337 field2416;

    @OriginalMember(owner = "client!efa", name = "M", descriptor = "[B")
    private byte[] field2415;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZBI)V")
    public final void method121(boolean arg0, byte arg1, int arg2) {
        field2414++;
        if (!arg0) {
            field2416 = null;
        }
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        int var6 = var4 + 1;
        this.field2415[var4] = -1;
        this.field2415[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field2416 = null;
        if (arg0 != 8) {
            field2416 = null;
        }
        field2417 = null;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
    public class181() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIZ)[B")
    public final byte[] method1142(int arg0, int arg1, int arg2, boolean arg3) {
        this.field2415 = new byte[arg0 * arg1 * arg2 * 2];
        field2413++;
        this.method2625(arg1, arg2, arg3, arg0);
        return this.field2415;
    }
}
