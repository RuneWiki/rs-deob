import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class119 extends class107 {

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lvc;")
    private static class137 field2772 = class45.method325("Enter your username (V password)3", -46);

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Lvc;")
    public static class137 field2779 = class45.method325("Lade Wordpack )2 ", -46);

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field2780 = -1;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lvc;")
    private static class137 field2776 = class45.method325("Take", -46);

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Lvc;")
    public static class137 field2781 = field2772;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "Lvc;")
    private static class137 field2785 = class45.method325("Your account has been disabled)3", -46);

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lvc;")
    public static class137 field2774 = field2776;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Lvc;")
    public static class137 field2786 = class45.method325("titlebutton", -46);

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Lvc;")
    public static class137 field2791 = class45.method325("backvmid3", -46);

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Lvc;")
    public static class137 field2789 = field2785;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "Lvc;")
    private static class137 field2788 = class45.method325("yellow:", -46);

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field2790 = 0;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lvc;")
    public static class137 field2777 = field2788;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Lvc;")
    public class137 field2787;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lwe;")
    public static class145 field2773;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method904(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        field2784++;
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg3 - arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg4;
        } else {
            int var9 = -41 % ((arg5 - 25) / 51);
            return arg3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static void method905(int arg0) {
        field2781 = null;
        field2779 = null;
        if (arg0 > -97) {
            method904(-40, 33, 4, 124, 12, (byte) 67, 16);
        }
        field2786 = null;
        field2785 = null;
        field2788 = null;
        field2776 = null;
        field2774 = null;
        field2777 = null;
        field2789 = null;
        field2791 = null;
        field2772 = null;
        field2773 = null;
    }
}
