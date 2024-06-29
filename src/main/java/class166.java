import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class166 extends class238 {

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[S")
    public static short[] field2433 = new short[256];

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
    public static int[] field2439;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Ldt;")
    public static final class145 method1028(int arg0, int arg1) {
        field2438++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class112.field1421[var2] == null || class112.field1421[var2][var3] == null) {
            boolean var4 = class78.method452(var2, -3192);
            if (!var4) {
                return null;
            }
        }
        if (arg1 <= 70) {
            method1030((byte) -35);
        }
        return class112.field1421[var2][var3];
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    public static final void method1029(int arg0, int arg1) {
        field2436++;
        class489 var2 = class116.method731(-625541408, 16, arg0);
        if (arg1 != 0) {
            field2437 = -113;
        }
        var2.method2861(-229012000);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    public static final void method1030(byte arg0) {
        field2434++;
        if (arg0 < 109) {
            field2439 = null;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class58.field758; var2++) {
            for (int var3 = 0; var3 < class287.field4181; var3++) {
                if (class321.method2053(var3, (byte) 127, class330.field4786, var1, true, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
    public static void method1031(boolean arg0) {
        if (arg0) {
            field2437 = -1;
        }
        field2439 = null;
        field2433 = null;
    }

    static {
        new class326("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field2439 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
        field2440 = -1;
    }
}
