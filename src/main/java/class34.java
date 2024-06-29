import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[[B")
    public static byte[][] field900 = new byte[250][];

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lic;")
    public static class59 field904 = class59.method433(0, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Llf;")
    public static class82 field898 = new class82(64);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lic;")
    public static class59 field905 = class59.method433(0, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Z")
    public static boolean field907 = false;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lic;")
    private static class59 field915 = class59.method433(0, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lic;")
    public static class59 field906 = field915;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lic;")
    private static class59 field908 = class59.method433(0, "Error connecting to server)3");

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lic;")
    public static class59 field911 = class59.method433(0, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field909 = 0;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field913 = 0;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field914 = 0;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lic;")
    public static class59 field910 = field908;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
    public static int[] field918;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwd;Lic;I)I")
    public static final int method265(class157 arg0, class59 arg1, int arg2) {
        if (arg2 != 64) {
            method266(-8, -106);
        }
        int var3 = arg0.field3457;
        field903++;
        arg0.method1164(124, arg1.field1418);
        arg0.field3457 += class151.field3284.method276(arg1.field1418, arg0.field3473, arg0.field3457, arg1.field1448, false, 0);
        return arg0.field3457 - var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public static final void method266(int arg0, int arg1) {
        if (arg0 == arg1 && !class63.field1625) {
            class100.method808(arg0 ^ 0xFFFFFFFE);
        } else if (arg1 != -1 && class81.field2004 != arg1 && class49.field1242 != 0 && !class63.field1625) {
            class137.method1044(arg1, class73.field1832, class49.field1242, 2, true, false, 0);
        }
        field901++;
        class81.field2004 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method267(int arg0) {
        field910 = null;
        if (arg0 != -1) {
            method267(61);
        }
        field906 = null;
        field908 = null;
        field911 = null;
        field905 = null;
        field918 = null;
        field904 = null;
        field898 = null;
        field900 = null;
        field915 = null;
    }
}
