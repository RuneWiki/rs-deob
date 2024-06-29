import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends class24 {

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "[Lse;")
    public class91[] field1971 = new class91[5];

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "[I")
    public int[] field1977 = new int[5];

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public int field1987 = 0;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Luf;")
    private static class168 field1953 = class148.method1019(-1720, "Use");

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Luf;")
    public static class168 field1957 = field1953;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1954 = 0;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field1976 = -2;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field1978 = 0;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Luf;")
    public static class168 field1960 = class148.method1019(-1720, "<)4col> x");

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "Luf;")
    private static class168 field1968 = class148.method1019(-1720, "Attack");

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "Luf;")
    public static class168 field1984 = class148.method1019(-1720, "(U0a )2 in: ");

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Luf;")
    public static class168 field1955 = field1968;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lsb;")
    public class127 field1982;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Lac;")
    public class130 field1986;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "Lij;")
    public class264 field1973;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lmf;")
    public class28 field1981;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "Ltg;")
    public class292 field1969;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "Lok;")
    public class40 field1979;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Lde;")
    public class4 field1963;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Z")
    public boolean field1962;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Z")
    public boolean field1964;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "Z")
    public boolean field1975;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 4)
    public static final void method896(int arg0, Component arg1) {
        arg1.addMouseListener(class159.field2509);
        field1959++;
        if (arg0 != 0) {
            field1968 = (class168) null;
        }
        arg1.addMouseMotionListener(class159.field2509);
        arg1.addFocusListener(class159.field2509);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 19)
    public static void method897(int arg0) {
        field1957 = null;
        if (arg0 <= 60) {
            return;
        }
        field1953 = null;
        field1968 = null;
        field1955 = null;
        field1960 = null;
        field1984 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)V", line = 47)
    public static final void method898(int arg0, long arg1) {
        field1989++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class107.field1642 < 100 || class36.field418 == 1) || class107.field1642 >= 200) {
            class266.method1850(0, class282.field4733, class182.field2934, -102);
            return;
        }
        class168 var3 = class69.method388(arg1, (byte) 104).method1216(-32471);
        for (int var4 = 0; var4 < class107.field1642; var4++) {
            if (class61.field793[var4] == arg1) {
                class266.method1850(0, class134.method938((byte) -126, new class168[] { var3, class128.field1990 }), class182.field2934, -55);
                return;
            }
        }
        for (int var5 = 0; var5 < class149.field2302; var5++) {
            if (class201.field3311[var5] == arg1) {
                class266.method1850(0, class134.method938((byte) -125, new class168[] { class288.field4853, var3, class83.field1249 }), class182.field2934, 82);
                return;
            }
        }
        if (arg0 != 27814) {
            method901(-52, (byte) 65, -83, 84, 46);
        }
        if (var3.method1170(class266.field4489.field658, (byte) -33)) {
            class266.method1850(0, class297.field5026, class182.field2934, -88);
            return;
        }
        class1.field3++;
        class142.field2192[class107.field1642] = var3;
        class61.field793[class107.field1642] = arg1;
        class237.field3782[class107.field1642] = 0;
        class15.field162[class107.field1642] = class182.field2934;
        class22.field274[class107.field1642] = 0;
        class27.field335[class107.field1642] = false;
        class285.field4828 = class9.field116;
        class107.field1642++;
        class249.field4262.method726(225, 2138389379);
        class249.field4262.method1053(arg1, arg0 - 16567);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(III)V", line = 123)
    public class127(int arg0, int arg1, int arg2) {
        this.field1985 = this.field1980 = arg0;
        this.field1961 = arg1;
        this.field1967 = arg2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBIIIIII)V", line = 147)
    public static final void method899(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1974++;
        if (arg1 != -65) {
            method897(83);
        }
        if (class150.field2331 <= arg5 && class65.field874 >= arg3 && class9.field112 <= arg2 && class44.field538 >= arg0) {
            class91.method645(0, arg2, arg4, arg5, arg3, arg0, arg6, arg7);
        } else {
            class140.method968(arg0, arg4, arg6, arg7, arg5, arg2, arg3, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)Lwh;", line = 181)
    public static final class240 method900(int arg0, int arg1, int arg2, int arg3) {
        field1966++;
        class240 var4 = new class240();
        var4.field3892 = arg1;
        var4.field3898 = arg0;
        class26.field319.method490(var4, (long) arg2, true);
        class27.method141((byte) -88, arg0);
        class242 var5 = class130.method910((byte) -99, arg2);
        if (var5 != null) {
            client.method2011((byte) -59, var5);
        }
        if (class94.field1507 != null) {
            client.method2011((byte) -59, class94.field1507);
            class94.field1507 = null;
        }
        class121.field1888 = false;
        class22.field275 = 0;
        method901(class20.field242, (byte) 98, class110.field1727, class131.field2031, class79.field1124);
        if (var5 != null) {
            class149.method1028(28, var5, false);
        }
        class133.method929(-10917, arg0);
        if (~class19.field221 != arg3) {
            class28.method149(class19.field221, 1, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBIII)V", line = 243)
    public static final void method901(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 91) {
            field1956 = -90;
        }
        for (int var5 = 0; var5 < class227.field3685; var5++) {
            if (arg0 < class69.field915[var5] + class204.field3346[var5] && (arg0 + arg4) > class204.field3346[var5] && (class256.field4357[var5] + class82.field1168[var5]) > arg3 && class256.field4357[var5] < (arg3 + arg2)) {
                class214.field3495[var5] = true;
            }
        }
        field1958++;
    }
}
