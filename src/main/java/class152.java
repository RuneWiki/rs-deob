import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class152 extends class222 {

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    private int field2295;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    private int field2287;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field2285 = 0;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lfe;")
    public static class248 field2279 = new class248(64);

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field2296 = 50;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "[I")
    public static int[] field2300 = new int[field2296];

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "[I")
    public static int[] field2294 = new int[field2296];

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "[I")
    public static int[] field2302 = new int[field2296];

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field2298 = new String[field2296];

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
    public static int[] field2301 = new int[field2296];

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "[I")
    public static int[] field2303 = new int[field2296];

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
    public static int[] field2297 = new int[field2296];

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2299 = "Loaded config";

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
    public static int[] field2304 = new int[field2296];

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V", line = 6)
    public static final void method1092(boolean arg0) {
        if (arg0) {
            class158.field2367 = class38.field460;
            class294.field4502 = class318.field4797;
            class145.field2199 = class81.field1139;
        } else {
            class158.field2367 = class241.field3585;
            class294.field4502 = class55.field690;
            class145.field2199 = class209.field3152;
        }
        class183.field2743 = class158.field2367.length;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 31)
    public static void method1093(int arg0) {
        field2301 = null;
        if (arg0 != -16209) {
            field2292 = -128;
        }
        field2298 = null;
        field2299 = null;
        field2279 = null;
        field2300 = null;
        field2304 = null;
        field2303 = null;
        field2294 = null;
        field2302 = null;
        field2297 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V", line = 60)
    public final void method1035(int arg0, int arg1, int arg2) {
        field2280++;
        int var4 = this.field2295 * arg1 >> 12;
        int var5 = this.field2288 * arg1 >> 12;
        int var6 = this.field2278 * arg0 >> 12;
        int var7 = this.field2290 * arg1 >> 12;
        int var8 = this.field2289 * arg0 >> 12;
        int var9 = this.field2287 * arg0 >> 12;
        int var10 = this.field2286 * arg1 >> 12;
        if (arg2 == 0) {
            int var11 = this.field2293 * arg0 >> 12;
            client.method912(var10, var11, var8, var7, 13, var9, var5, this.field3381, var4, var6);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZ)V", line = 88)
    public final void method1042(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field2284++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V", line = 98)
    public final void method1037(int arg0, int arg1, int arg2) {
        field2291++;
        if (arg2 > -66) {
            field2299 = (String) null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 111)
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2295 = arg0;
        this.field2278 = arg1;
        this.field2290 = arg4;
        this.field2286 = arg6;
        this.field2289 = arg3;
        this.field2287 = arg5;
        this.field2288 = arg2;
        this.field2293 = arg7;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqg;I)I", line = 127)
    public static final int method1094(class195 arg0, int arg1) {
        field2281++;
        int var2 = arg0.field2940;
        class242 var3 = arg0.method699(0);
        if (arg1 != -1753104468) {
            method1092(true);
        }
        if (arg0.field1507 == var3.field3597) {
            var2 = arg0.field2917;
        } else if (arg0.field1507 == var3.field3603 || arg0.field1507 == var3.field3604 || arg0.field1507 == var3.field3600 || arg0.field1507 == var3.field3607) {
            var2 = arg0.field2931;
        } else if (arg0.field1507 == var3.field3601 || arg0.field1507 == var3.field3621 || arg0.field1507 == var3.field3628 || arg0.field1507 == var3.field3611) {
            var2 = arg0.field2913;
        }
        return var2;
    }
}
