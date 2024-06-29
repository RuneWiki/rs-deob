import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class560 extends class489 {

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Ldn;")
    public static class438 field8244;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "[B")
    private byte[] field8241;

    static {
        new class180("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIII)[B", line = 6)
    public final byte[] method3271(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 4096) {
            this.method3271(-76, 84, 57, 108);
        }
        field8239++;
        this.field8241 = new byte[arg0 * arg2 * arg3 * 2];
        this.method1777(-77, arg2, arg0, arg3);
        return this.field8241;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIIIII)V", line = 19)
    public static final void method3272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            field8242 = -13;
        }
        if (class565.field8299.field2167 != 0 && arg3 != 0 && class570.field8370 < 50 && arg5 != -1) {
            class250.field3228[class570.field8370++] = new class114((byte) 1, arg5, arg3, arg2, arg0, arg4);
        }
        field8243++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BBI)V", line = 38)
    public final void method2725(byte arg0, byte arg1, int arg2) {
        field8240++;
        if (arg1 <= 115) {
            return;
        }
        int var4 = arg2 * 2;
        int var5 = arg0 & 0xFF;
        int var6 = var4 + 1;
        this.field8241[var4] = (byte) (var5 * 3 >> 5);
        this.field8241[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 54)
    public class560() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 59)
    public static void method3273(boolean arg0) {
        if (!arg0) {
            method3273(true);
        }
        field8244 = null;
    }
}
