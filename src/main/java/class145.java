import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class145 extends class222 {

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    private int field2196;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    private int field2192;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    private int field2198;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "Z")
    public static boolean field2191 = false;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "Lf;")
    public static class329 field2197 = null;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "[[I")
    public static int[][] field2201 = new int[104][104];

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2200 = null;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "[[Ljf;")
    public static class86[][] field2199;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2190++;
        if (arg2 != 1908) {
            field2191 = false;
        }
        if (class72.method463(-126, arg1)) {
            client.method904(class278.field4231[arg1], -1, arg3, arg5, arg0, arg7, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V", line = 29)
    public final void method1035(int arg0, int arg1, int arg2) {
        field2186++;
        int var4 = this.field2196 * arg1 >> 12;
        if (arg2 != 0) {
            method1034(-15, 58, 96, -115, -116, -41, -29, 55);
        }
        int var5 = this.field2198 * arg1 >> 12;
        int var6 = this.field2185 * arg0 >> 12;
        int var7 = this.field2192 * arg0 >> 12;
        class41.method275((byte) 98, var6, var5, this.field3381, var4, this.field3382, var7);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)Lre;", line = 46)
    public static final class263 method1036(boolean arg0) {
        field2189++;
        class263 var1 = new class263(34);
        var1.method1813(46, 11);
        var1.method1813(114, class272.field4167);
        var1.method1813(75, class212.field3227 ? 1 : 0);
        var1.method1813(-78, client.field1945 ? 1 : 0);
        var1.method1813(-120, class170.field2549 ? 1 : 0);
        var1.method1813(84, class151.field2274 ? 1 : 0);
        var1.method1813(-114, class97.field1467 ? 1 : 0);
        var1.method1813(76, class210.field3171 ? 1 : 0);
        var1.method1813(-107, class233.field3506 ? 1 : 0);
        var1.method1813(-89, class130.field2019 ? 1 : 0);
        var1.method1813(33, class284.field4298);
        var1.method1813(118, class292.field4447 ? 1 : 0);
        var1.method1813(98, class45.field569 ? 1 : 0);
        var1.method1813(70, class197.field2968 ? 1 : 0);
        var1.method1813(125, class157.field2348);
        var1.method1813(-88, class178.field2630 ? 1 : 0);
        if (arg0) {
            field2193 = -54;
        }
        var1.method1813(-108, class287.field4341);
        var1.method1813(-94, class115.field1760);
        var1.method1813(111, class272.field4183);
        var1.method1823(class91.field1360, (byte) -66);
        var1.method1823(class204.field3064, (byte) -85);
        var1.method1813(-109, class18.method117());
        var1.method1815(75, class294.field4499);
        var1.method1813(-116, class144.field2175);
        var1.method1813(-76, class309.field4704 ? 1 : 0);
        var1.method1813(-126, class131.field2025 ? 1 : 0);
        var1.method1813(-112, class19.field231);
        var1.method1813(51, class179.field2656 ? 1 : 0);
        var1.method1813(-80, class36.field442 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIIIIII)V", line = 86)
    public class145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2196 = arg2;
        this.field2192 = arg1;
        this.field2185 = arg3;
        this.field2198 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)V", line = 101)
    public final void method1037(int arg0, int arg1, int arg2) {
        field2184++;
        int var4 = this.field2196 * arg0 >> 12;
        if (arg2 > -66) {
            this.method1037(-111, -99, -25);
        }
        int var5 = this.field2192 * arg1 >> 12;
        int var6 = this.field2198 * arg0 >> 12;
        int var7 = this.field2185 * arg1 >> 12;
        class300.method2085(var4, this.field3380, var5, (byte) -102, var7, this.field3381, var6, this.field3382);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)V", line = 123)
    public static final void method1038(int arg0, int arg1, byte arg2) {
        class168 var3 = class274.method1934(arg2 ^ 0xFFFFFFE8, arg1);
        if (arg2 != -127) {
            field2201 = (int[][]) ((int[][]) null);
        }
        field2187++;
        int var4 = var3.field2515;
        int var5 = var3.field2524;
        int var6 = var3.field2523;
        int var7 = class87.field1286[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class292.method2044(var4, arg0 << var5 & var8 | ~var8 & class185.field2763[var4], true);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lgg;I)I", line = 151)
    public static final int method1039(class69 arg0, int arg1) {
        class58 var2 = arg0.field914;
        field2188++;
        if (var2.field756 != null) {
            var2 = var2.method390(-118);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 <= 105) {
            return 47;
        }
        int var3 = var2.field749;
        class242 var4 = arg0.method699(0);
        if (arg0.field1507 == var4.field3597) {
            var3 = var2.field784;
        } else if (arg0.field1507 == var4.field3603 || arg0.field1507 == var4.field3604 || arg0.field1507 == var4.field3600 || arg0.field1507 == var4.field3607) {
            var3 = var2.field735;
        } else if (arg0.field1507 == var4.field3601 || arg0.field1507 == var4.field3621 || arg0.field1507 == var4.field3628 || arg0.field1507 == var4.field3611) {
            var3 = var2.field758;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 192)
    public static void method1040(byte arg0) {
        field2199 = (class86[][]) null;
        int var1 = 7 / ((75 - arg0) / 33);
        field2201 = (int[][]) null;
        field2200 = null;
        field2197 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lf;B)Ljava/lang/String;", line = 205)
    public static final String method1041(class329 arg0, byte arg1) {
        field2202++;
        if (client.method902(arg0).method138((byte) 77) == 0) {
            return null;
        } else if (arg0.field5077 == null || arg0.field5077.trim().length() == 0) {
            return class250.field3733 ? "Hidden-use" : null;
        } else if (arg1 == -84) {
            return arg0.field5077;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZ)V", line = 230)
    public final void method1042(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1034(49, 106, -57, 92, 101, -122, 121, -97);
        }
        field2194++;
        int var4 = this.field2198 * arg0 >> 12;
        int var5 = this.field2185 * arg1 >> 12;
        int var6 = this.field2192 * arg1 >> 12;
        int var7 = this.field2196 * arg0 >> 12;
        class54.method355(this.field3380, var5, var6, (byte) -76, var4, var7);
    }
}
