import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class206 extends class690 {

    @OriginalMember(owner = "client!km", name = "E", descriptor = "Lqk;")
    public static class1 field2888 = new class1(65, 7);

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "Ll;")
    public static class290 field2895;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "[B")
    private byte[] field2889;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "[I")
    public static int[] field2893;

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
    public class206() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        int var1 = 25 / ((-arg0 - 66) / 51);
        field2895 = null;
        field2893 = null;
        field2888 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BIII)[B")
    public final byte[] method1318(byte arg0, int arg1, int arg2, int arg3) {
        this.field2889 = new byte[arg1 * 2 * arg2 * arg3];
        field2892++;
        this.method1806(arg2, arg1, (byte) -85, arg3);
        if (arg0 >= -31) {
            field2895 = null;
        }
        return this.field2889;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)V")
    public final void method798(int arg0, int arg1, byte arg2) {
        if (arg0 != 11829) {
            method1319(114, (char) 65490);
        }
        field2890++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2889[var10001] = -1;
        this.field2889[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IC)Z")
    public static final boolean method1319(int arg0, char arg1) {
        field2891++;
        if (!(arg0 >= arg1 || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class171.field2172;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }
}
