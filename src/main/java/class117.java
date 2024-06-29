import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class117 extends class71 {

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Lud;")
    public static class279 field2121 = class130.method1024("http:)4)4", 255);

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lud;")
    public static class279 field2128 = class130.method1024("leuchten3:", 255);

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lud;")
    public static class279 field2126 = class130.method1024("::rebuild", 255);

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lud;")
    public static class279 field2130 = class130.method1024("unzap", 255);

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Lud;")
    public static class279 field2131 = class130.method1024("<col=ffff00>", 255);

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Lud;")
    public static class279 field2132 = class130.method1024("Fps:", 255);

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "S")
    public static short field2124 = 256;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Lud;")
    private static class279 field2127 = class130.method1024("Your ignore list is full)3 Max of 100 users)3", 255);

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lud;")
    public static class279 field2125 = field2127;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZIIZ)Lok;", line = 7)
    public static final class149 method938(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field2119++;
        class120 var5 = null;
        if (class74.field1461 != null) {
            var5 = new class120(arg3, class74.field1461, class37.field820[arg3], 1000000);
        }
        class252.field4501[arg3] = class314.field5537.method1323(class180.field3255, arg3, false, var5);
        if (arg4) {
            class252.field4501[arg3].method1654(14405);
        }
        if (arg2 != Integer.MAX_VALUE) {
            field2121 = (class279) null;
        }
        return new class149(class252.field4501[arg3], arg1, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V", line = 29)
    public static void method939(int arg0) {
        field2121 = null;
        field2125 = null;
        field2127 = null;
        if (arg0 != -32702) {
            field2134 = -34;
        }
        field2128 = null;
        field2131 = null;
        field2130 = null;
        field2132 = null;
        field2126 = null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 48)
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILgf;II)V", line = 52)
    public static final void method940(int arg0, class8 arg1, int arg2, int arg3) {
        if (arg1.field259 == 0) {
            arg1.field264 = arg1.field327;
        } else if (arg1.field259 == 1) {
            arg1.field264 = (arg2 - arg1.field297) / 2 + arg1.field327;
        } else if (arg1.field259 == 2) {
            arg1.field264 = arg2 - arg1.field297 - arg1.field327;
        } else if (arg1.field259 == 3) {
            arg1.field264 = arg1.field327 * arg2 >> 14;
        } else if (arg1.field259 == 4) {
            arg1.field264 = (arg1.field327 * arg2 >> 14) + (arg2 - arg1.field297) / 2;
        } else {
            arg1.field264 = arg2 - (arg1.field327 * arg2 >> 14) - arg1.field297;
        }
        field2118++;
        if (arg1.field197 == 0) {
            arg1.field167 = arg1.field158;
        } else if (arg1.field197 == 1) {
            arg1.field167 = (arg0 - arg1.field220) / 2 + arg1.field158;
        } else if (arg1.field197 == 2) {
            arg1.field167 = arg0 - arg1.field220 - arg1.field158;
        } else if (arg1.field197 == 3) {
            arg1.field167 = arg1.field158 * arg0 >> 14;
        } else if (arg1.field197 == 4) {
            arg1.field167 = (arg1.field158 * arg0 >> 14) + (arg0 - arg1.field220) / 2;
        } else {
            arg1.field167 = arg0 - (arg1.field158 * arg0 >> 14) - arg1.field220;
        }
        if (arg3 >= -77) {
            method945(69, -99, (byte) -7, 107);
        }
        if (!class205.field3641 || !(client.method1798(arg1).field4372 != 0 || arg1.field201 == 0)) {
            return;
        }
        if (arg1.field264 < 0) {
            arg1.field264 = 0;
        } else if (arg2 < arg1.field264 + arg1.field297) {
            arg1.field264 = arg2 - arg1.field297;
        }
        if (arg1.field167 < 0) {
            arg1.field167 = 0;
        } else if (arg1.field220 + arg1.field167 > arg0) {
            arg1.field167 = arg0 - arg1.field220;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I", line = 125)
    public static final int method941(int arg0, int arg1) {
        if (arg0 < 82) {
            field2121 = (class279) null;
        }
        field2120++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZ)I", line = 151)
    private final int method942(int arg0, int arg1, boolean arg2) {
        field2123++;
        if (arg2) {
            method941(-9, -21);
        }
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return 4096 - ((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V", line = 178)
    public static final void method943(int arg0, int arg1) {
        class309.field5487 = arg0 / arg1;
        field2133++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)[I", line = 193)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 > -69) {
            field2132 = (class279) null;
        }
        field2135++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = class200.field3574[arg0];
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                var3[var5] = this.method942(var4, class133.field2424[var5], false) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)I", line = 230)
    public static final int method944(int arg0, int arg1) {
        field2129++;
        if (arg1 <= 75) {
            method940(-59, (class8) null, 47, 84);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBI)V", line = 262)
    public static final void method945(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = 99 % ((arg2 - 43) / 41);
        class104 var5 = class293.method2085(9, arg3, false);
        var5.method879(0);
        var5.field1965 = arg1;
        var5.field1966 = arg0;
        field2122++;
    }
}
