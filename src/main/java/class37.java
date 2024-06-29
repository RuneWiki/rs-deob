import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Laf;")
    public static class7 field927 = class48.method406(40, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Laf;")
    private static class7 field928 = class48.method406(40, "Loading title screen )2 ");

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[I")
    public static int[] field924 = new int[32];

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Laf;")
    private static class7 field934 = class48.method406(40, "level)2");

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Laf;")
    public static class7 field937 = field928;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Laf;")
    public static class7 field940 = field934;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Laf;")
    public static class7 field939 = class48.method406(40, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Laf;")
    public static class7 field941 = class48.method406(40, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field944 = 0;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Laf;")
    public static class7 field942 = class48.method406(40, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "B")
    public static byte field945;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lod;")
    public class101 field938;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method327(int arg0) {
        field924 = null;
        field927 = null;
        if (arg0 != -19681) {
            field937 = null;
        }
        field937 = null;
        field941 = null;
        field940 = null;
        field939 = null;
        field934 = null;
        field928 = null;
        field942 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lof;")
    public static final class103 method328(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field931++;
        if (class52.field1251[var2] == null || class52.field1251[var2][var3] == null) {
            boolean var4 = class9.method106(var2, (byte) 107);
            if (!var4) {
                return null;
            }
        }
        return class52.field1251[var2][var3];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILcd;B)V")
    public static final void method329(int arg0, class19 arg1, byte arg2) {
        field943++;
        if (class155.field3611 < arg1.field483) {
            class147.method1183(arg1, arg2 - 8838);
        } else if (class155.field3611 <= arg1.field486) {
            class38.method331(arg1, (byte) -12);
        } else {
            class136.method1111(arg2 ^ 0x7F, arg1);
        }
        if (arg2 != 127) {
            method330((byte) -87);
        }
        if (arg1.field505 < 128 || arg1.field491 < 128 || arg1.field505 >= 13184 || arg1.field491 >= 13184) {
            arg1.field478 = -1;
            arg1.field505 = arg1.field493[0] * 128 + arg1.field473 * 64;
            arg1.field469 = -1;
            arg1.field486 = 0;
            arg1.field491 = arg1.field509[0] * 128 + arg1.field473 * 64;
            arg1.field483 = 0;
            arg1.method179(0);
        }
        if (class21.field531 == arg1 && (arg1.field505 < 1536 || arg1.field491 < 1536 || arg1.field505 >= 11776 || arg1.field491 >= 11776)) {
            arg1.field483 = 0;
            arg1.field478 = -1;
            arg1.field505 = arg1.field493[0] * 128 + arg1.field473 * 64;
            arg1.field491 = arg1.field509[0] * 128 + arg1.field473 * 64;
            arg1.field486 = 0;
            arg1.field469 = -1;
            arg1.method179(0);
        }
        class133.method1078(arg1, arg2 ^ 0x58C9);
        class155.method1213(arg1, 88);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lqc;")
    public static final class114 method330(byte arg0) {
        field932++;
        class114 var1 = new class114();
        var1.field2726 = class12.field310;
        var1.field2724 = class82.field1879[0];
        var1.field2725 = class51.field1234[0];
        var1.field2729 = class27.field697;
        var1.field2727 = class136.field3249;
        var1.field2723 = class127.field3059[0];
        var1.field2728 = class84.field1990[0];
        var1.field2722 = class86.field2005[0];
        if (arg0 >= -35) {
            field939 = null;
        }
        class53.method429(-91);
        return var1;
    }
}
