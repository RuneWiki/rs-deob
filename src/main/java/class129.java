import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class129 extends class152 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "[I")
    public int[] field1894;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    public int[] field1897;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lgd;")
    public static class206 field1895 = new class206("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "D")
    public static double field1898 = -1.0D;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
    public static boolean field1900 = false;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lmc;")
    public static class78 field1899 = new class78(26, 7);

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Ls;")
    public static class169 field1901 = new class169(2, 5);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 3)
    public static void method792(boolean arg0) {
        field1899 = null;
        field1901 = null;
        field1895 = null;
        if (arg0) {
            field1901 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(II[I[I)V", line = 25)
    public class129(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1894 = arg2;
        this.field1897 = arg3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILct;)V", line = 43)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, class88 arg4) {
        field1896++;
        for (class279 var5 = (class279) class192.field2607.method652((byte) 37); var5 != null; var5 = (class279) class192.field2607.method653(36)) {
            if (var5.field3705 == arg0 && arg1 * 128 == var5.field3697 && arg2 * 128 == var5.field3713 && var5.field3710.field1298 == arg4.field1298) {
                if (var5.field3706 != null) {
                    class181.field2494.method2204(var5.field3706);
                    var5.field3706 = null;
                }
                if (var5.field3694 != null) {
                    class181.field2494.method2204(var5.field3694);
                    var5.field3694 = null;
                }
                var5.method2614((byte) -83);
                return;
            }
        }
        if (arg3 <= 17) {
            field1900 = false;
        }
    }
}
