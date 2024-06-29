import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class170 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Z")
    public boolean field2225;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public boolean field2226;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "[Lida;")
    public static class249[] field2232;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIF[BFFLmm;FFBII)V")
    public static final void method1146(int arg0, int arg1, int arg2, float arg3, byte[] arg4, float arg5, float arg6, class294 arg7, float arg8, float arg9, byte arg10, int arg11, int arg12) {
        field2230++;
        int var13 = -93 / ((arg10 - 41) / 50);
        for (int var14 = 0; var14 < arg12; var14++) {
            class206.method1353(arg2, arg0, arg5, var14, arg12, arg4, 1, arg3, arg8, arg6, arg11, arg9, arg1, arg7);
            arg2 += arg1 * arg11;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1147(int arg0) {
        field2232 = null;
        if (arg0 != 100) {
            field2232 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
    public static final void method1148(int arg0, int arg1) {
        field2231++;
        if (class780.field10712 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class157.field2106 == null) {
                class96.method755(class340.field4758, class115.field1558, class669.field8960, 40);
            } else {
                class314.method2009(class340.field4758, (byte) 124);
            }
        }
        if (arg0 != 13 && class192.field2500 != null) {
            class192.field2500.method138(-62);
            class192.field2500 = null;
        }
        if (arg0 == 3) {
            class303.method1953(class420.field6053 != class227.field2935, 50);
        }
        if (arg0 == 7) {
            class782.method4292(class250.field3501 != class227.field2935, (byte) -40);
        }
        if (arg1 != -11239) {
            field2232 = null;
        }
        if (arg0 == 5) {
            if (class157.field2106 == null) {
                class360.method2281(class115.field1558, -1, class669.field8960);
            } else {
                class138.method957((byte) -92);
            }
        } else if (arg0 == 6) {
            if (class157.field2106 == null) {
                class96.method755(class340.field4758, class115.field1558, class669.field8960, arg1 + 11336);
            } else {
                class314.method2009(class340.field4758, (byte) 125);
            }
        } else if (arg0 == 9) {
            if (class157.field2106 == null) {
                class96.method755(class340.field4758, class115.field1558, class669.field8960, 111);
            } else {
                class314.method2009(class340.field4758, (byte) 125);
            }
        } else if (arg0 == 12) {
            if (class157.field2106 == null) {
                class360.method2281(class115.field1558, -1, class669.field8960);
            } else {
                class138.method957((byte) -92);
            }
        }
        if (class729.method4031((byte) -116, class780.field10712)) {
            class677.field9085.field2259 = 2;
            class187.field2451.field2259 = 2;
            class415.field5995.field2259 = 2;
            class204.field2634.field2259 = 2;
            class16.field162.field2259 = 2;
            class755.field10224.field2259 = 2;
            class291.field4154.field2259 = 2;
        }
        if (class729.method4031((byte) -97, arg0)) {
            class290.field4150 = 0;
            class15.field152 = 1;
            class292.field4166 = 1;
            class493.field6947 = 0;
            class441.field6340 = 0;
            class525.method3048((byte) -9, true);
            class677.field9085.field2259 = 1;
            class187.field2451.field2259 = 1;
            class415.field5995.field2259 = 1;
            class204.field2634.field2259 = 1;
            class16.field162.field2259 = 1;
            class755.field10224.field2259 = 1;
            class291.field4154.field2259 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class353.method2244(2);
        }
        boolean var2 = arg0 == 2 || class235.method1490((byte) 54, arg0) || class586.method3297(true, arg0);
        boolean var3 = class780.field10712 == 2 || class235.method1490((byte) 54, class780.field10712) || class586.method3297(true, class780.field10712);
        if (var2 != var3) {
            if (var2) {
                class264.field3886 = class552.field7619;
                if (class125.field1721.field5185.method1871(43) == 0) {
                    class15.method88(2, 3684);
                } else {
                    class434.method2604(false, 0, 2, class66.field917, class552.field7619, class125.field1721.field5185.method1871(43), 1);
                    class542.method3131(true);
                }
                class479.field6732.method64(false, false);
            } else {
                class15.method88(2, 3684);
                class479.field6732.method64(true, false);
            }
        }
        if (class729.method4031((byte) -93, arg0) || arg0 == 13) {
            class375.field5490.method482();
        }
        class780.field10712 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZIIII)V")
    public static final void method1149(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg2 != 3777) {
            method1146(68, 88, -100, -2.4082944F, null, -1.1036698F, 0.36037087F, null, 1.6310065F, -1.6777964F, (byte) -41, 73, 32);
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field2224++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class108.field1518 - class775.field10668) * var6 / 100 + class775.field10668;
        if (var7 < class791.field10858) {
            var7 = class791.field10858;
        } else if (class164.field2189 < var7) {
            var7 = class164.field2189;
        }
        int var8 = arg3 * var7 * 512 / (arg5 * 334);
        if (class612.field8278 > var8) {
            short var9 = class612.field8278;
            var7 = arg5 * var9 * 334 / (arg3 * 512);
            if (var7 > class164.field2189) {
                var7 = class164.field2189;
                int var10 = var7 * 512 * arg3 / (var9 * 334);
                int var11 = (arg5 - var10) / 2;
                if (arg1) {
                    class375.field5490.method526();
                    class375.field5490.method529(arg3, arg0, var11, arg4, -16777216, 1);
                    class375.field5490.method529(arg3, arg0, var11, arg5 + arg4 - var11, -16777216, 1);
                }
                arg4 += var11;
                arg5 -= var11 * 2;
            }
        } else if (class157.field2112 < var8) {
            short var12 = class157.field2112;
            var7 = var12 * 334 * arg5 / (arg3 * 512);
            if (var7 < class791.field10858) {
                var7 = class791.field10858;
                int var13 = arg5 * var12 * 334 / (var7 * 512);
                int var14 = (arg3 - var13) / 2;
                if (arg1) {
                    class375.field5490.method526();
                    class375.field5490.method529(var14, arg0, arg5, arg4, -16777216, 1);
                    class375.field5490.method529(var14, arg0 + arg3 - var14, arg5, arg4, -16777216, arg2 ^ 0xEC0);
                }
                arg3 -= var14 * 2;
                arg0 += var14;
            }
        }
        class239.field3170 = arg0;
        class628.field8507 = arg3 * var7 / 334;
        class698.field9255 = (short) arg3;
        class539.field7458 = (short) arg5;
        class419.field6024 = arg4;
    }
}
