import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class27 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field553 = 0;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lsg;")
    private static class169 field563 = class165.method1060("No response from server)3", 1536);

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lsg;")
    public static class169 field556 = field563;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lsg;")
    public static class169 field551 = class165.method1060("sl_arrows", 1536);

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lsg;")
    private static class169 field559 = class165.method1060("red:", 1536);

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lsg;")
    public static class169 field558 = class165.method1060("<col=ffff00>*V", 1536);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lsg;")
    public static class169 field561 = field559;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lsg;")
    public static class169 field564 = class165.method1060(" <col=ffff00>", 1536);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lsg;")
    public static class169 field554 = field559;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[I")
    public static int[] field552;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method187(int arg0) {
        for (class205 var1 = (class205) class70.field1311.method145(0); var1 != null; var1 = (class205) class70.field1311.method152((byte) -127)) {
            if (var1.field4018 != null) {
                class175.field3425.method1302(var1.field4018);
                var1.field4018 = null;
            }
            if (var1.field4004 != null) {
                class175.field3425.method1302(var1.field4004);
                var1.field4004 = null;
            }
        }
        class70.field1311.method155(0);
        if (arg0 >= -99) {
            field552 = null;
        }
        field562++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method188(int arg0) {
        field563 = null;
        field556 = null;
        field558 = null;
        if (arg0 != 19365) {
            field552 = null;
        }
        field559 = null;
        field552 = null;
        field564 = null;
        field551 = null;
        field554 = null;
        field561 = null;
    }
}
