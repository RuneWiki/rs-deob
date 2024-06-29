import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 {

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public int field943 = 0;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public int field945 = 0;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lu;")
    public static class135 field922 = class87.method676((byte) -99, "(U");

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lu;")
    private static class135 field920 = class87.method676((byte) -76, "Login limit exceeded)3");

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lu;")
    public static class135 field928 = class87.method676((byte) -75, " (X");

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lu;")
    private static class135 field927 = class87.method676((byte) -85, "Loading ignore list");

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lu;")
    public static class135 field921 = field920;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lu;")
    public static class135 field929 = class87.method676((byte) -101, ")1j");

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Lu;")
    public static class135 field938 = class87.method676((byte) -112, "*6n");

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lu;")
    public static class135 field917 = class87.method676((byte) -101, "lila:");

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lu;")
    public static class135 field925 = field927;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field942 = 1;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "J")
    public static long field931;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lvb;")
    public class143 field918;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lg;")
    public static class43 field924;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[Lae;")
    public static class6[] field937;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method300(int arg0) {
        field924 = null;
        field929 = null;
        field927 = null;
        int var1 = 47 % ((65 - arg0) / 40);
        field917 = null;
        field921 = null;
        field922 = null;
        field928 = null;
        field937 = null;
        field925 = null;
        field920 = null;
        field938 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lve;I)Lu;")
    public static final class135 method301(class146 arg0, int arg1) {
        field936++;
        if (class105.method853(class23.method196(arg0, (byte) -127), (byte) -124) == 0) {
            return null;
        }
        if (arg1 != -5338) {
            field925 = null;
        }
        if (arg0.field3648 == null || arg0.field3648.method1086((byte) -95).method1063(-64) == 0) {
            return class82.field1920 ? class82.field1933 : null;
        } else {
            return arg0.field3648;
        }
    }
}
