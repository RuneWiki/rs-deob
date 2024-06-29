import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class133 {

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field2165 = -1;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lmh;")
    public static class62 field2164 = class201.method1405(true, " )2>");

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lmh;")
    public static class62 field2159 = class201.method1405(true, "blinken2:");

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2166 = -1;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2163 = 0;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lmh;")
    private static class62 field2162 = class201.method1405(true, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lmh;")
    public static class62 field2168 = field2162;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lga;")
    public static class147 field2174;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1006(int arg0) {
        field2170++;
        class229.field3984.method1392(0);
        if (arg0 < 98) {
            field2166 = 40;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIIILhj;)V", line = 15)
    public static final void method1007(boolean arg0, int arg1, int arg2, int arg3, int arg4, class114 arg5) {
        field2160++;
        if (arg5.field1912 == -1 && arg5.field1904 == null) {
            return;
        }
        int var6 = 0;
        if (arg5.field1914 < arg1) {
            var6 += arg1 - arg5.field1914;
        } else if (arg5.field1910 > arg1) {
            var6 += arg5.field1910 - arg1;
        }
        if (arg3 > arg5.field1890) {
            var6 += arg3 - arg5.field1890;
        } else if (arg3 < arg5.field1916) {
            var6 += arg5.field1916 - arg3;
        }
        if (!arg0) {
            return;
        }
        if (arg5.field1888 == 0 || (var6 - 64) > arg5.field1888 || class114.field1902 == 0 || arg5.field1897 != arg4) {
            if (arg5.field1898 != null) {
                class27.field331.method132(arg5.field1898);
                arg5.field1898 = null;
            }
            if (arg5.field1905 != null) {
                class27.field331.method132(arg5.field1905);
                arg5.field1905 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field1888 - var6) * class114.field1902 / arg5.field1888;
        if (arg5.field1898 != null) {
            arg5.field1898.method995(var7);
        } else if (arg5.field1912 >= 0) {
            class223 var8 = class223.method1584(class272.field4629, arg5.field1912, 0);
            if (var8 != null) {
                class9 var9 = var8.method1587().method39(class22.field238);
                class132 var10 = class132.method992(var9, 100, var7);
                var10.method1005(-1);
                class27.field331.method128(var10);
                arg5.field1898 = var10;
            }
        }
        if (arg5.field1905 != null) {
            arg5.field1905.method995(var7);
            if (!arg5.field1905.method1448(-6543)) {
                arg5.field1905 = null;
            }
        } else if (arg5.field1904 != null && (arg5.field1894 -= arg2) <= 0) {
            int var11 = (int) (Math.random() * (double) arg5.field1904.length);
            class223 var12 = class223.method1584(class272.field4629, arg5.field1904[var11], 0);
            if (var12 != null) {
                class9 var13 = var12.method1587().method39(class22.field238);
                class132 var14 = class132.method992(var13, 100, var7);
                var14.method1005(0);
                class27.field331.method128(var14);
                arg5.field1894 = arg5.field1891 + ((int) (Math.random() * (double) (arg5.field1917 - arg5.field1891)));
                arg5.field1905 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 140)
    public static void method1008(int arg0) {
        field2168 = null;
        field2159 = null;
        field2174 = null;
        field2162 = null;
        field2164 = null;
        if (arg0 != -1) {
            method1009(true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 198)
    public static final void method1009(boolean arg0) {
        class1.field2.method1395((byte) -43);
        field2157++;
        if (arg0) {
            field2168 = (class62) null;
        }
    }
}
