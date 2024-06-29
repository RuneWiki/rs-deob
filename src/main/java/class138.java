import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class138 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "J")
    public static long field2132 = 0L;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "[Lvf;")
    public static class89[] field2136 = new class89[14];

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lkn;")
    public static class52 field2140 = new class52(128);

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "[Lvf;")
    public static class89[] field2145 = new class89[14];

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "[Lvi;")
    public static class114[] field2146 = new class114[4];

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
    public static boolean field2147 = false;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "F")
    public static float field2144;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Z")
    public static boolean field2137;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "[I")
    public static int[] field2143;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[Luc;")
    public static class130[] field2134;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 9)
    public static void method938(int arg0) {
        field2134 = null;
        if (arg0 != 4) {
            return;
        }
        field2136 = null;
        field2140 = null;
        field2143 = null;
        field2145 = null;
        field2146 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z[S[Ljava/lang/String;)V", line = 54)
    public static final void method939(boolean arg0, short[] arg1, String[] arg2) {
        class311.method2139(0, arg1, arg2, arg2.length - 1, 0);
        field2138++;
        if (arg0) {
            field2140 = (class52) null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IC)Z", line = 74)
    public static final boolean method940(int arg0, char arg1) {
        field2142++;
        if (arg0 != -49) {
            method938(-27);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V", line = 152)
    public static final void method941(int arg0, String arg1, int arg2, String arg3) {
        class169.field2581 = arg1;
        class170.field2584 = arg3;
        class249.field3912 = arg2;
        field2141++;
        if (class170.field2584.equals("") || class169.field2581.equals("")) {
            class51.field728 = 3;
        } else if (class19.field259 == -1) {
            class51.field728 = -3;
            class219.field3492 = arg0;
            class220.field3502 = 1;
            class47.field669 = 0;
            class303 var4 = new class303(128);
            var4.method2034(-49, 10);
            var4.method2013((int) (Math.random() * 9.9999999E7D), -84);
            var4.method2023(class108.method723(class170.field2584, arg0 ^ 0xFFFFFFC7), -64);
            var4.method2013((int) (Math.random() * 9.9999999E7D), arg0 ^ 0xFFFFFF83);
            var4.method2057(-121, class169.field2581);
            var4.method2013((int) (Math.random() * 9.9999999E7D), -90);
            var4.method2024(32069, class44.field623, class52.field738);
            class265.field4095.field4679 = 0;
            class265.field4095.method2034(-112, 24);
            class265.field4095.method2034(-104, var4.field4679 + 2);
            class265.field4095.method2044(1247686728, 538);
            class265.field4095.method2060(var4.field4716, -1927867096, var4.field4679, 0);
        } else {
            class268.method1776(0);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBLwf;)Lph;", line = 199)
    public static final class79 method942(int arg0, byte arg1, class306 arg2) {
        if (arg1 != -89) {
            method939(true, (short[]) null, (String[]) null);
        }
        field2139++;
        return class46.method317((byte) 47, arg2, arg0) ? class6.method35((byte) -57) : null;
    }
}
