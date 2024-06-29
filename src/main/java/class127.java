import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class127 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "[I")
    public static int[] field1848 = new int[14];

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Lub;")
    public static class18 field1849 = new class18(512);

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "[I")
    public static int[] field1853 = new int[200];

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "Lvj;")
    public static class304 field1855 = new class304("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "Llk;")
    public static class413 field1852;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 11)
    public static void method915(byte arg0) {
        field1855 = null;
        field1852 = null;
        field1853 = null;
        if (arg0 == 20) {
            field1848 = null;
            field1849 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILqa;Lpc;Lpc;)V", line = 34)
    public static final void method916(int arg0, class162 arg1, class473 arg2, class473 arg3) {
        field1850++;
        class433.field5928 = class321.method1851(class484.field6734, (byte) 31, arg3, 0);
        class30.field508 = arg1.method589(class433.field5928, class134.method937(arg2, class484.field6734, 0), true);
        if (arg0 <= 109) {
            field1853 = null;
        }
        client.field2732 = class321.method1851(class165.field2406, (byte) 78, arg3, 0);
        class302.field3995 = arg1.method589(client.field2732, class134.method937(arg2, class165.field2406, 0), true);
        class173.field2525 = class321.method1851(class37.field585, (byte) 40, arg3, 0);
        class219.field2961 = arg1.method589(class173.field2525, class134.method937(arg2, class37.field585, 0), true);
    }
}
