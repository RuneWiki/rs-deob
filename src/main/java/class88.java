import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class88 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lrga;")
    public static class280 field1232 = new class280(32, -1);

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field1236 = 0;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Lnw;")
    public static class347 field1235 = new class347();

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 3)
    public static void method501(int arg0) {
        field1235 = null;
        if (arg0 > -56) {
            method503(93);
        }
        field1232 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lhv;II)Z", line = 14)
    public static final boolean method502(class199 arg0, int arg1, int arg2) {
        field1233++;
        class192.field2395.method906(arg0.field2523[arg1], arg0.field2511[arg1], arg0.field2515[arg1], class378.field4789);
        int var3 = class378.field4789[2];
        if (var3 < 50) {
            return false;
        } else {
            arg0.field2519[arg1] = (short) (class378.field4789[arg2] * class80.field1084 / var3 + class201.field2543);
            arg0.field2522[arg1] = (short) (class378.field4789[1] * class117.field1518 / var3 + class395.field4969);
            arg0.field2513[arg1] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 35)
    public static final void method503(int arg0) {
        field1234++;
        if (!class301.field3698.method135(class651.field9191, 101) && class667.field9402 != class476.field6039) {
            class560.method3075(11, arg0 ^ 0x20B, false, class313.field4036, class285.field3532);
            return;
        }
        if (arg0 != 11) {
            method502(null, -49, -113);
        }
        class702.method3939(class32.field452, arg0 + 99);
        if (class56.field798 != class476.field6039) {
            class512.method2766(-106);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILql;III)V", line = 57)
    public static final void method504(int arg0, int arg1, class164 arg2, int arg3, int arg4, int arg5) {
        field1230++;
        if (arg2.field2149 == -1 && arg2.field2164 == null) {
            return;
        }
        int var6 = arg1;
        if (arg2.field2159 < arg3) {
            var6 = arg3 + arg1 - arg2.field2159;
        } else if (arg2.field2162 > arg3) {
            var6 = arg2.field2162 + arg1 - arg3;
        }
        int var7 = class301.field3698.field6644 * arg2.field2169 >> 8;
        if (arg2.field2158 < arg4) {
            var6 += arg4 - arg2.field2158;
        } else if (arg2.field2150 > arg4) {
            var6 += arg2.field2150 - arg4;
        }
        if (arg2.field2153 == 0 || (var6 - 256) > arg2.field2153 || class301.field3698.field6644 == 0 || arg2.field2166 != arg5) {
            if (arg2.field2170 != null) {
                class480.field6387.method1295(arg2.field2170);
                arg2.field2147 = null;
                arg2.field2151 = null;
                arg2.field2170 = null;
            }
            if (arg2.field2156 != null) {
                class480.field6387.method1295(arg2.field2156);
                arg2.field2156 = null;
                arg2.field2168 = null;
                arg2.field2171 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field2153 - var6) * var7 / arg2.field2153;
        if (arg2.field2170 != null) {
            arg2.field2170.method2830(var8);
        } else if (arg2.field2149 >= 0) {
            if (arg2.field2157) {
                if (arg2.field2151 == null) {
                    arg2.field2151 = class416.method2214(class472.field5993, arg2.field2149);
                }
                if (arg2.field2151 != null) {
                    if (arg2.field2147 == null) {
                        arg2.field2147 = arg2.field2151.method2216(new int[] { 22050 });
                    }
                    if (arg2.field2147 != null) {
                        class519 var12 = class519.method2811(arg2.field2147, 100, var8);
                        var12.method2841(-1);
                        class480.field6387.method1296(var12);
                        arg2.field2170 = var12;
                    }
                }
            } else {
                class211 var9 = class211.method1258(class533.field7189, arg2.field2149, 0);
                if (var9 != null) {
                    class555 var10 = var9.method1260().method3059(class584.field8166);
                    class519 var11 = class519.method2811(var10, 100, var8);
                    var11.method2841(-1);
                    class480.field6387.method1296(var11);
                    arg2.field2170 = var11;
                }
            }
        }
        if (arg2.field2156 != null) {
            arg2.field2156.method2830(var8);
            if (!arg2.field2156.method1873(116)) {
                arg2.field2168 = null;
                arg2.field2156 = null;
                arg2.field2171 = null;
                return;
            }
            return;
        }
        if (arg2.field2164 == null || (arg2.field2163 -= arg0) > 0) {
            return;
        }
        if (!arg2.field2144) {
            int var15 = (int) (Math.random() * (double) arg2.field2164.length);
            class211 var16 = class211.method1258(class533.field7189, arg2.field2164[var15], 0);
            if (var16 == null) {
                return;
            }
            class555 var17 = var16.method1260().method3059(class584.field8166);
            class519 var18 = class519.method2811(var17, 100, var8);
            var18.method2841(0);
            class480.field6387.method1296(var18);
            arg2.field2156 = var18;
            arg2.field2163 = arg2.field2148 + ((int) (Math.random() * (double) (arg2.field2145 - arg2.field2148)));
            return;
        }
        if (arg2.field2168 == null) {
            int var13 = (int) ((double) arg2.field2164.length * Math.random());
            arg2.field2168 = class416.method2214(class472.field5993, arg2.field2164[var13]);
        }
        if (arg2.field2168 == null) {
            return;
        }
        if (arg2.field2171 == null) {
            arg2.field2171 = arg2.field2168.method2216(new int[] { 22050 });
        }
        if (arg2.field2171 == null) {
            return;
        }
        class519 var14 = class519.method2811(arg2.field2171, 100, var8);
        var14.method2841(0);
        class480.field6387.method1296(var14);
        arg2.field2163 = (int) ((double) (arg2.field2145 - arg2.field2148) * Math.random()) + arg2.field2148;
        arg2.field2156 = var14;
        return;
    }
}
