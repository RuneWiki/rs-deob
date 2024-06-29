import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class5 {

    @OriginalMember(owner = "client!af", name = "L", descriptor = "[I")
    public int[] field210 = new int[1];

    @OriginalMember(owner = "client!af", name = "T", descriptor = "[I")
    public int[] field218 = new int[] { -1 };

    @OriginalMember(owner = "client!af", name = "P", descriptor = "[I")
    public static int[] field214 = new int[500];

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "Lhe;")
    public static class54 field208 = class6.method58("<col=ff3000>", false);

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lhe;")
    public static class54 field220 = class6.method58(" )2> ", false);

    @OriginalMember(owner = "client!af", name = "H", descriptor = "Lib;")
    public static class58 field206 = new class58(5000);

    @OriginalMember(owner = "client!af", name = "X", descriptor = "Lhe;")
    private static class54 field222 = class6.method58("go back to the main RuneScape webpage", false);

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Lhe;")
    public static class54 field221 = field222;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "Leb;")
    public static class31 field213;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "Leb;")
    public static class31 field215;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILda;)V")
    public static final void method63(int arg0, class23 arg1) {
        field207++;
        arg1.field650 = false;
        if (arg1.field649 != null) {
            arg1.field649.field771 = 0;
        }
        for (class23 var2 = arg1.method104(); var2 != null; var2 = arg1.method135()) {
            method63(-19798, var2);
        }
        if (arg0 != -19798) {
            field213 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method64(byte arg0) {
        field215 = null;
        field221 = null;
        field206 = null;
        if (arg0 != 95) {
            method64((byte) -93);
        }
        field220 = null;
        field222 = null;
        field208 = null;
        field213 = null;
        field214 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Z")
    public static final boolean method65(int arg0) {
        field219++;
        if (class83.field2051 == 0) {
            int var1 = -8 / ((44 - arg0) / 42);
            return class1.field5.method137((byte) -25);
        } else {
            return true;
        }
    }
}
