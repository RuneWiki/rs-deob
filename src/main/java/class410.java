import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class410 extends class238 {

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public int field5751;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "Z")
    public boolean field5747;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public int field5749;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lwf;")
    public static class79 field5748 = new class79(53, 3);

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "Ldk;")
    public static class326 field5753 = new class326("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "[I")
    public static int[] field5755 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "Lea;")
    public static class353 field5756 = new class353("stellardawn", 1);

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "Lb;")
    public static class201 field5758;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Z")
    public static boolean field5752;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5754++;
        class157 var7 = (class157) class212.field3208.method1449(111);
        if (arg6 != -16709) {
            method2424(80, -62, 78, -36, -13, 125, -13);
        }
        while (var7 != null) {
            if (var7.field2343 <= class353.field5090) {
                var7.method738((byte) -2);
            } else {
                class38.method253((byte) -103, (var7.field2341 << 7) + 64, arg1 >> 1, arg5 >> 1, arg2, arg4, var7.field2335, (var7.field2331 << 7) + 64, var7.field2340 * 2);
                class491.field6928.method1596(0, var7.field2336, var7.field2330 | 0xFF000000, 0, class421.field5882[1] + arg0, class421.field5882[0] + arg3);
            }
            var7 = (class157) class212.field3208.method1450(arg6 + 16709);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method2425(int arg0) {
        field5758 = null;
        field5753 = null;
        field5755 = null;
        field5748 = null;
        field5756 = null;
        if (arg0 != 16383) {
            field5758 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IC)Z")
    public static final boolean method2426(int arg0, char arg1) {
        field5746++;
        if (arg0 != 48) {
            method2426(102, '\\');
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIZ)V")
    public class410(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5745 = arg2;
        this.field5750 = arg1;
        this.field5751 = arg4;
        this.field5757 = arg0;
        this.field5747 = arg5;
        this.field5749 = arg3;
    }
}
