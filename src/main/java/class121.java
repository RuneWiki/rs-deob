import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lv;")
    public static class146 field2807 = class159.method1226((byte) -37, "compass");

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lv;")
    public static class146 field2816 = class159.method1226((byte) -37, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lv;")
    public static class146 field2805 = class159.method1226((byte) -37, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lv;")
    private static class146 field2810 = class159.method1226((byte) -37, "wishes to duel with you)3");

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lv;")
    public static class146 field2808 = class159.method1226((byte) -37, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[[B")
    public static byte[][] field2814 = new byte[1000][];

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lv;")
    public static class146 field2813 = field2810;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lv;")
    public static class146 field2820 = class159.method1226((byte) -37, ": ");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method915(byte arg0) {
        field2817++;
        for (class82 var1 = (class82) class108.field2578.method1138(25852); var1 != null; var1 = (class82) class108.field2578.method1142(1)) {
            if (class148.field3428 != var1.field1986 || var1.field1982) {
                var1.method217(-1264);
            } else if (class94.field2229 >= var1.field1999) {
                var1.method622(class1.field16, (byte) -67);
                if (var1.field1982) {
                    var1.method217(-1264);
                } else {
                    class66.field1496.method1189(var1.field1986, var1.field2007, var1.field1997, var1.field1981, 60, var1, 0, -1, false);
                }
            }
        }
        int var2 = 88 % ((-arg0 - 9) / 36);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
    public static final int method916(byte arg0, int arg1) {
        if (arg0 > -70) {
            field2811 = -9;
        }
        field2806++;
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lv;")
    public static final class146 method917(int arg0, int arg1) {
        field2809++;
        class146 var2 = class75.method564(false, arg1);
        for (int var3 = var2.method1080(-1) - 3; var3 > 0; var3 -= 3) {
            var2 = class71.method509(new class146[] { var2.method1105(var3, -120, 0), class73.field1702, var2.method1103(true, var3) }, (byte) 89);
        }
        if (var2.method1080(-1) > 9) {
            return class71.method509(new class146[] { class150.field3462, var2.method1105(var2.method1080(-1) - 8, -111, 0), class122.field2823, class30.field621, var2, class9.field173 }, (byte) 52);
        } else if (var2.method1080(-1) > 6) {
            return class71.method509(new class146[] { class152.field3495, var2.method1105(var2.method1080(-1) - 4, -47, 0), class122.field2833, class30.field621, var2, class9.field173 }, (byte) 64);
        } else {
            int var4 = 64 / ((-arg0 - 35) / 42);
            return class71.method509(new class146[] { class68.field1556, var2, class13.field222 }, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static final void method918(boolean arg0) {
        field2818++;
        class8.field155.method1050(true);
        class115.field2668.method1050(true);
        if (arg0) {
            method918(false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2814 = null;
        field2820 = null;
        field2816 = null;
        int var1 = 126 / ((16 - arg0) / 46);
        field2810 = null;
        field2807 = null;
        field2808 = null;
        field2813 = null;
        field2805 = null;
    }
}
