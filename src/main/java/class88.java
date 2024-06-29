import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1945 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lp;")
    public static class104 field1944 = new class104();

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lje;")
    public static class67 field1950 = class85.method592(255, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lje;")
    public static class67 field1952 = class85.method592(255, "mapback");

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lje;")
    private static class67 field1953 = class85.method592(255, "Location");

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lje;")
    public static class67 field1951 = field1953;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lje;")
    public static class67 field1954 = class85.method592(255, "weiss:");

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)I")
    public static final int method610(int arg0, int arg1, int arg2, int arg3) {
        field1943++;
        int var4 = 256 - arg0;
        return arg2 == -156490936 ? (-16711936 & (arg1 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg0) + ((arg1 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg0 & 0xFF0000) >> 8 : -49;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method611(int arg0) {
        field1944 = null;
        field1952 = null;
        field1953 = null;
        field1951 = null;
        field1954 = null;
        field1950 = null;
        if (arg0 >= -97) {
            field1950 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILta;)V")
    public static final void method612(int arg0, class133 arg1) {
        field1946++;
        if (arg1.field2967 == 0) {
            return;
        }
        if (arg1.field2988 != -1 && arg1.field2988 < 32768) {
            class24 var2 = class152.field3479[arg1.field2988];
            if (var2 != null) {
                int var3 = arg1.field2963 - var2.field2963;
                int var4 = arg1.field2957 - var2.field2957;
                if (var4 != 0 || var3 != 0) {
                    arg1.field2972 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2988 >= 32768) {
            int var5 = arg1.field2988 - 32768;
            if (class68.field1362 == var5) {
                var5 = 2047;
            }
            class83 var6 = class85.field1885[var5];
            if (var6 != null) {
                int var7 = arg1.field2957 - var6.field2957;
                int var8 = arg1.field2963 - var6.field2963;
                if (var7 != 0 || var8 != 0) {
                    arg1.field2972 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2970 != 0 || arg1.field2994 != 0) && (arg1.field2947 == 0 || arg1.field2934 > 0)) {
            int var9 = arg1.field2957 - (arg1.field2970 - class130.field2863 - class130.field2863) * 64;
            int var10 = arg1.field2963 - (arg1.field2994 - class35.field647 - class35.field647) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field2972 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2970 = 0;
            arg1.field2994 = 0;
        }
        if (arg0 != 64) {
            field1945 = 19;
        }
        int var11 = arg1.field2972 - arg1.field2992 & 0x7FF;
        if (var11 == 0) {
            arg1.field2936 = 0;
            return;
        }
        arg1.field2936++;
        if (var11 <= 1024) {
            arg1.field2992 += arg1.field2967;
            boolean var12 = true;
            if (arg1.field2967 > var11 || var11 > 2048 - arg1.field2967) {
                var12 = false;
                arg1.field2992 = arg1.field2972;
            }
            if (arg1.field2960 == arg1.field2954 && (arg1.field2936 > 25 || var12)) {
                if (arg1.field2997 == -1) {
                    arg1.field2960 = arg1.field2935;
                } else {
                    arg1.field2960 = arg1.field2997;
                }
            }
        } else {
            arg1.field2992 -= arg1.field2967;
            boolean var13 = true;
            if (var11 < arg1.field2967 || 2048 - arg1.field2967 < var11) {
                var13 = false;
                arg1.field2992 = arg1.field2972;
            }
            if (arg1.field2960 == arg1.field2954 && (arg1.field2936 > 25 || var13)) {
                if (arg1.field2984 == -1) {
                    arg1.field2960 = arg1.field2935;
                } else {
                    arg1.field2960 = arg1.field2984;
                }
            }
        }
        arg1.field2992 &= 0x7FF;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lje;")
    public static final class67 method613(int arg0, byte arg1) {
        field1948++;
        if (arg1 >= -68) {
            field1945 = 65;
        }
        return class49.method314(new class67[] { class60.method420(arg0 >> 24 & 0xFF, 28498), class147.field3377, class60.method420(arg0 >> 16 & 0xFF, 28498), class147.field3377, class60.method420(arg0 >> 8 & 0xFF, 28498), class147.field3377, class60.method420(arg0 & 0xFF, 28498) }, 0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lje;Lje;II)V")
    public static final void method614(class67 arg0, class67 arg1, int arg2, int arg3) {
        field1947++;
        class68.method497(arg3, null, arg1, -1, arg0);
        if (arg2 <= 53) {
            field1950 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method615(int arg0, int arg1) {
        field1949++;
        class117 var2 = (class117) class79.field1705.method1119(28254, (long) arg0);
        if (var2 != null) {
            var2.method115(26851);
            if (arg1 != 255) {
                method615(46, -81);
            }
        }
    }
}
