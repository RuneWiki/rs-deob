import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends class50 {

    @OriginalMember(owner = "client!lf", name = "Ab", descriptor = "Z")
    private boolean field2045 = false;

    @OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
    private int field2054 = 0;

    @OriginalMember(owner = "client!lf", name = "Kb", descriptor = "I")
    private int field2055 = 0;

    @OriginalMember(owner = "client!lf", name = "Lb", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!lf", name = "ub", descriptor = "I")
    private int field2039;

    @OriginalMember(owner = "client!lf", name = "Tb", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!lf", name = "Pb", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!lf", name = "Mb", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!lf", name = "Bb", descriptor = "I")
    private int field2046;

    @OriginalMember(owner = "client!lf", name = "Gb", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!lf", name = "Fb", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "Lgd;")
    private class46 field2030;

    @OriginalMember(owner = "client!lf", name = "Eb", descriptor = "Ljd;")
    public static class66 field2049 = new class66();

    @OriginalMember(owner = "client!lf", name = "Qb", descriptor = "Lua;")
    public static class140 field2061 = new class140();

    @OriginalMember(owner = "client!lf", name = "Sb", descriptor = "Lid;")
    private static class60 field2063 = class11.method72("Too many incorrect logins from your address)3", (byte) -72);

    @OriginalMember(owner = "client!lf", name = "Yb", descriptor = "Lid;")
    public static class60 field2069 = class11.method72("scrollbar", (byte) -60);

    @OriginalMember(owner = "client!lf", name = "Xb", descriptor = "Lid;")
    private static class60 field2068 = class11.method72("Connecting to update server", (byte) -58);

    @OriginalMember(owner = "client!lf", name = "Vb", descriptor = "Lid;")
    public static class60 field2066 = field2063;

    @OriginalMember(owner = "client!lf", name = "Ub", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!lf", name = "Rb", descriptor = "Lid;")
    public static class60 field2062 = class11.method72(":assistreq:", (byte) 123);

    @OriginalMember(owner = "client!lf", name = "Wb", descriptor = "Lid;")
    public static class60 field2067 = field2068;

    @OriginalMember(owner = "client!lf", name = "mb", descriptor = "D")
    private double field2031;

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "D")
    public double field2032;

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "D")
    public double field2033;

    @OriginalMember(owner = "client!lf", name = "rb", descriptor = "D")
    private double field2036;

    @OriginalMember(owner = "client!lf", name = "xb", descriptor = "D")
    private double field2042;

    @OriginalMember(owner = "client!lf", name = "yb", descriptor = "D")
    public double field2043;

    @OriginalMember(owner = "client!lf", name = "Hb", descriptor = "D")
    private double field2052;

    @OriginalMember(owner = "client!lf", name = "Ob", descriptor = "D")
    private double field2059;

    @OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
    private int field2037;

    @OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!lf", name = "Cb", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!lf", name = "Ib", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public static void method688(int arg0) {
        field2061 = null;
        field2063 = null;
        field2068 = null;
        field2049 = null;
        field2066 = null;
        field2062 = null;
        if (arg0 != -1024) {
            method688(61);
        }
        field2069 = null;
        field2067 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBLid;IILid;)V")
    public static final void method689(int arg0, int arg1, byte arg2, class60 arg3, int arg4, int arg5, class60 arg6) {
        int var7 = 29 / ((65 - arg2) / 41);
        field2053++;
        if (class135.field3067 || class80.field1956 >= 500) {
            return;
        }
        class64.field1590[class80.field1956] = arg6;
        class80.field1995[class80.field1956] = arg3;
        class90.field2249[class80.field1956] = arg1;
        class151.field3385[class80.field1956] = arg0;
        class56.field1406[class80.field1956] = arg4;
        class69.field1653[class80.field1956] = arg5;
        class80.field1956++;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)Lka;")
    public final class70 method1(int arg0) {
        class121 var2 = class13.method81(21299, this.field2058);
        class70 var3 = var2.method940(31710, this.field2054);
        field2035++;
        int var4 = 46 % ((-arg0 - 1) / 43);
        if (var3 == null) {
            return null;
        } else {
            var3.method543(this.field2037);
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)I")
    public static final int method690(int arg0, int arg1, boolean arg2) {
        field2040++;
        if (!arg2) {
            method691(null, false, null, null, null);
        }
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lid;ZLie;Lid;Lie;)Lh;")
    public static final class49 method691(class60 arg0, boolean arg1, class61 arg2, class60 arg3, class61 arg4) {
        if (arg1) {
            return null;
        } else {
            field2041++;
            int var5 = arg2.method482(13975, arg3);
            int var6 = arg2.method464((byte) -113, arg0, var5);
            return class140.method1091(var6, arg4, arg2, var5, -17444);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public final void method692(int arg0, int arg1) {
        this.field2032 += (double) arg1 * this.field2031;
        this.field2045 = true;
        if (arg0 != 15417) {
            return;
        }
        this.field2043 += (double) arg1 * this.field2059;
        field2044++;
        this.field2033 += this.field2036 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2052;
        this.field2052 += (double) arg1 * this.field2036;
        this.field2047 = (int) (Math.atan2(this.field2059, this.field2031) * 325.949D) + 1024 & 0x7FF;
        this.field2037 = (int) (Math.atan2(this.field2052, this.field2042) * 325.949D) & 0x7FF;
        if (this.field2030 == null) {
            return;
        }
        this.field2055 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2030.field1196[this.field2054] >= this.field2055) {
                        return;
                    }
                    this.field2055 -= this.field2030.field1196[this.field2054];
                    this.field2054++;
                } while (this.field2030.field1218.length > this.field2054);
                this.field2054 -= this.field2030.field1209;
            } while (this.field2054 >= 0 && this.field2030.field1218.length > this.field2054);
            this.field2054 = 0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public final void method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -4) {
            method688(-28);
        }
        field2038++;
        if (!this.field2045) {
            double var6 = (double) (arg4 - this.field2060);
            double var8 = (double) (arg0 - this.field2039);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2043 = (double) this.field2051 * var6 / var10 + (double) this.field2060;
            this.field2032 = (double) this.field2051 * var8 / var10 + (double) this.field2039;
            this.field2033 = this.field2046;
        }
        double var12 = (double) (this.field2064 + 1 - arg2);
        this.field2059 = ((double) arg4 - this.field2043) / var12;
        this.field2031 = ((double) arg0 - this.field2032) / var12;
        this.field2042 = Math.sqrt(this.field2059 * this.field2059 + this.field2031 * this.field2031);
        if (!this.field2045) {
            this.field2052 = -this.field2042 * Math.tan((double) this.field2050 * 0.02454369D);
        }
        this.field2036 = ((double) arg1 - this.field2033 - this.field2052 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2056 = arg9;
        this.field2039 = arg3;
        this.field2064 = arg6;
        this.field2060 = arg2;
        this.field2058 = arg0;
        this.field2057 = arg5;
        this.field2046 = arg4;
        this.field2051 = arg8;
        this.field2048 = arg1;
        this.field2045 = false;
        this.field2034 = arg10;
        this.field2050 = arg7;
        int var12 = class13.method81(21299, this.field2058).field2785;
        if (var12 == -1) {
            this.field2030 = null;
        } else {
            this.field2030 = class44.method344(var12, (byte) -105);
        }
    }
}
