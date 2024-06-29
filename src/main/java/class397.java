import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class397 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
    public int[] field5354;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[I")
    public int[] field5357;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lcu;")
    public static class145 field5352 = new class145(60, -1);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "F")
    public static float field5355;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(CZ)Z", line = 7)
    public static final boolean method2318(char arg0, boolean arg1) {
        if (arg1) {
            method2319(45, 34, 84, -85, 22, 8);
        }
        field5351++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method2319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class154.field2244.field7767 != 0 && arg5 != 0 && class104.field1527 < 50 && arg1 != -1) {
            class520.field7703[class104.field1527++] = new class231((byte) 1, arg1, arg5, arg0, arg2, arg3);
        }
        if (arg4 == 23839) {
            field5353++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V", line = 44)
    public class397(int arg0) {
        this.field5356 = arg0;
        this.field5354 = new int[this.field5356];
        this.field5357 = new int[this.field5356];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 54)
    public static void method2320(int arg0) {
        field5352 = null;
        if (arg0 != 3465) {
            method2320(121);
        }
    }
}
