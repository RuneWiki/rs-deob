import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class119 {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lhc;")
    public static class171 field2141 = new class171(30);

    @OriginalMember(owner = "client!el", name = "h", descriptor = "[[B")
    public static byte[][] field2145 = new byte[250][];

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Ldg;")
    public static class317 field2144 = new class317();

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field2147 = 10;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field2146 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Lhc;")
    public static class171 field2148 = new class171(200);

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Ldg;")
    public static class317 field2149 = new class317();

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Lud;")
    private static class279 field2150 = class130.method1024("Loading title screen )2 ", 255);

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Lud;")
    public static class279 field2151 = field2150;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Z")
    public static boolean field2153 = true;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lig;")
    public static class175 field2143;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Lom;")
    public static class70 field2152;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 6)
    public static void method946(int arg0) {
        field2145 = (byte[][]) null;
        if (arg0 != 17) {
            field2148 = (class171) null;
        }
        field2148 = null;
        field2152 = null;
        field2143 = null;
        field2144 = null;
        field2150 = null;
        field2149 = null;
        field2141 = null;
        field2151 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLok;)Z", line = 26)
    public static final boolean method947(boolean arg0, class149 arg1) {
        field2140++;
        if (arg1.method1186(class217.field3844, -22698)) {
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Z", line = 42)
    public static final boolean method948(int arg0, int arg1) {
        field2138++;
        if (arg0 > -35) {
            method949((String) null, -96, (String) null, (String) null);
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 66)
    public static final String method949(String arg0, int arg1, String arg2, String arg3) {
        field2139++;
        if (arg1 != 0) {
            field2152 = (class70) null;
        }
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, var4 + arg2.length())) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg3.length());
        }
        return arg0;
    }
}
