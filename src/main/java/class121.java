import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class121 {

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lnf;")
    public static class162 field1829 = new class162(64);

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1830 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lud;")
    public static class2 field1832 = new class2();

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Loe;")
    public class147 field1828;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lub;")
    public static class92 field1823;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
    public int[] field1824;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
    public static int[] field1833;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method913(boolean arg0) {
        field1829 = null;
        field1832 = null;
        if (!arg0) {
            field1830 = null;
            field1823 = null;
            field1833 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
    public static final int method914(int arg0, byte arg1) {
        if (arg1 != 55) {
            method913(false);
        }
        field1826++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BZ)V")
    public static final void method915(byte arg0, boolean arg1) {
        for (class80 var2 = (class80) class58.field922.method6(-122); var2 != null; var2 = (class80) class58.field922.method11((byte) 24)) {
            if (var2.field1220 != null) {
                class83.field1251.method243(var2.field1220);
                var2.field1220 = null;
            }
            if (var2.field1219 != null) {
                class83.field1251.method243(var2.field1219);
                var2.field1219 = null;
            }
            var2.method995((byte) 89);
        }
        field1821++;
        if (arg0 < 75) {
            method913(true);
        }
        if (!arg1) {
            return;
        }
        for (class80 var3 = (class80) field1832.method6(-119); var3 != null; var3 = (class80) field1832.method11((byte) 125)) {
            if (var3.field1220 != null) {
                class83.field1251.method243(var3.field1220);
                var3.field1220 = null;
            }
            var3.method995((byte) -123);
        }
        for (class80 var4 = (class80) class193.field3023.method2049(0); var4 != null; var4 = (class80) class193.field3023.method2047(-128)) {
            if (var4.field1220 != null) {
                class83.field1251.method243(var4.field1220);
                var4.field1220 = null;
            }
            var4.method995((byte) -112);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method916(byte arg0) {
        field1825++;
        class250.field4009.method1172((byte) 125);
        if (arg0 != 114) {
            field1832 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
    public static final void method917(short[] arg0, String[] arg1, int arg2) {
        class234.method1605(arg0, 0, arg1.length - 1, arg1, true);
        field1822++;
        if (arg2 > -2) {
            field1819 = -9;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Z")
    public static final boolean method918(byte arg0) {
        field1820++;
        try {
            if (class105.field1640 == 2) {
                if (class290.field4513 == null) {
                    class290.field4513 = class302.method2024(class220.field3361, class246.field3912, class74.field1140);
                    if (class290.field4513 == null) {
                        return false;
                    }
                }
                if (class153.field2262 == null) {
                    class153.field2262 = new class104(class252.field4034, class135.field2018);
                }
                if (class236.field3728.method147(class214.field3288, class290.field4513, class153.field2262, 22050, -16257)) {
                    class236.field3728.method168((byte) 94);
                    class236.field3728.method150(-11182, class270.field4277);
                    class236.field3728.method145(true, class290.field4513, class108.field1682);
                    class153.field2262 = null;
                    class105.field1640 = 0;
                    class220.field3361 = null;
                    class290.field4513 = null;
                    return true;
                }
            }
            if (arg0 != -18) {
                method917((short[]) null, (String[]) null, 33);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class236.field3728.method179((byte) -13);
            class153.field2262 = null;
            class105.field1640 = 0;
            class290.field4513 = null;
            class220.field3361 = null;
        }
        return false;
    }
}
