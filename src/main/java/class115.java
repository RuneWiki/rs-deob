import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public int field3003 = -1;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
    public static int[] field3011 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lfc;")
    public static class39 field3002 = class90.method774("Wir vermuten)1 dass Ihr Konto gestohlen wurde", -97);

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lp;")
    public static class104 field3008 = new class104(64);

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lfc;")
    private static class39 field3013 = class90.method774("Your ignore list is full)3 Max of 100 hit", -80);

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field3017 = 1;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lfc;")
    public static class39 field3016 = class90.method774("Mitglieder)2Welt", -92);

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lfc;")
    private static class39 field3023 = class90.method774("wishes to duel with you)3", -86);

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lfc;")
    public static class39 field3019 = field3023;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lfc;")
    public static class39 field3020 = class90.method774("Benutzen", -104);

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Lfc;")
    private static class39 field3024 = class90.method774("Ok", -111);

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Lfc;")
    public static class39 field3025 = field3013;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lfc;")
    public static class39 field3021 = field3024;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Laa;")
    public static class2 field3022 = new class2();

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Luc;")
    public static class139 field3015;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lue;")
    public static class141 field3014;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lde;")
    public class27 field3004;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Ljb;")
    public static class64 field3018;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
    public int[] field3007;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "[I")
    public static int[] field3026;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[Lfc;")
    public class39[] field3006;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIB)I", line = 3)
    public static final int method1001(int arg0, int arg1, byte arg2) {
        class1 var3 = (class1) class78.field1773.method995(false, (long) arg1);
        field3010++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= -58) {
            return 5;
        } else if (arg0 >= 0 && var3.field29.length > arg0) {
            return var3.field29[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 62)
    public static final void method1002(int arg0, int arg1, int arg2) {
        field3005++;
        long var3 = (long) ((arg1 << 16) + arg0);
        if (arg2 != -1446144656) {
            field3019 = null;
        }
        class92 var5 = (class92) class42.field1138.method995(false, var3);
        if (var5 != null) {
            class151.field3748.method522(-117, var5);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 81)
    public static void method1003(int arg0) {
        field3016 = null;
        if (arg0 != 0) {
            method1003(-32);
        }
        field3002 = null;
        field3019 = null;
        field3011 = null;
        field3026 = null;
        field3014 = null;
        field3023 = null;
        field3020 = null;
        field3008 = null;
        field3024 = null;
        field3015 = null;
        field3021 = null;
        field3013 = null;
        field3018 = null;
        field3025 = null;
        field3022 = null;
    }
}
