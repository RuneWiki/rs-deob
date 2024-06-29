import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class369 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lhc;")
    public static class368 field5110 = new class368("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    public static int[] field5113 = new int[] { 0, 0, 2, 8, 0, 3, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, -2, 8, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, -2, 0, 6, 0, 0, 3, 0, 0, 6, 0, 0, 0, 0, 0, 0, -2, 0, 10, 1, 0, 0, 0, 0, 0, 0, -1, 2, 15, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 10, 0, 6, -2, 0, 0, 0, 0, 0, 0, 12, 6, 0, -1, 0, 0, 0, 0, 0, 8, 0, 4, 0, 12, 11, 0, 0, -1, -1, 0, 3, 7, 6, 0, 8, 0, 6, 0, 0, -1, 3, -2, 0, 6, 12, 0, 0, 5, 2, 0, 0, 0, 7, -2, 0, 0, -2, -2, 0, 0, 0, -2, 0, 0, 3, 0, 0, 9, 0, 0, -2, 17, 0, 0, 28, 0, 0, 8, 0, -2, 4, 12, -1, 0, 2, 2, 0, 14, 0, -1, 0, 0, 1, 0, 8, 0, 0, 0, 10, -1, 1, 0, 0, 0, 0, 0, 3, 6, 3, -1, 0, 7, 6, 5, 4, 0, 1, 3, 0, 0, 7, 0, 6, 8, 0, -1, 8, 6, 0, 0, 0, -1, 0, 20, 0, 0, 8, 0, 0, 0, 1, 0, 0, -1, 0, -1, 0, 8, 0, 0, 0, 0, 12, 0, 0, 15, 0, -1, 10, 0, -1, -1, 0, 6, 0, 2, 0, 0, -1, 0, 5, 0, 0, 14, 0, 0, 0 };

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    public static int[] field5114 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    public static int[] field5115 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field5116 = 0;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lqb;")
    public static class86 field5112 = new class86(0, 0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V")
    public static final void method2318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class143.field2090 <= arg1 && arg1 <= class42.field543) {
            int var5 = class294.method1789(arg4, (byte) -5, class430.field6003, class80.field1119);
            int var6 = class294.method1789(arg0, (byte) -5, class430.field6003, class80.field1119);
            class442.method2742(var5, var6, false, arg1, arg3);
        }
        if (arg2 == 0) {
            field5108++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method2319(byte arg0) {
        field5110 = null;
        field5114 = null;
        if (arg0 != -65) {
            method2319((byte) -86);
        }
        field5115 = null;
        field5113 = null;
        field5112 = null;
    }
}
