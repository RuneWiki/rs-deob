import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class81 extends class359 {

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public int field922 = 0;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
    public static boolean field903 = false;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
    public static int[] field906 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[Lre;")
    public static class358[] field917 = new class358[32768];

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Lnj;")
    public class133 field912;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "Lgp;")
    public static class31 field924;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Lnl;")
    public class327 field916;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Lre;")
    public class358 field914;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lgj;")
    public class380 field909;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "Lgj;")
    public class380 field926;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Z")
    public boolean field920;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[I")
    public int[] field910;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public static void method449(byte arg0) {
        field924 = null;
        field917 = null;
        if (arg0 <= 52) {
            field917 = null;
        }
        field906 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method450(boolean arg0, byte[] arg1, int arg2) {
        field927++;
        if (arg1 == null) {
            return null;
        }
        if (arg2 != -12151) {
            method452(true, -16);
        }
        if (arg1.length > 136 && !class110.field1279) {
            try {
                class421 var3 = (class421) Class.forName("gs").getDeclaredConstructor().newInstance();
                var3.method166(arg1, (byte) -51);
                return var3;
            } catch (Throwable var4) {
                class110.field1279 = true;
            }
        }
        return arg0 ? class393.method2516((byte) -126, arg1) : arg1;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 != 11) {
            field903 = false;
        }
        field925++;
        int var2 = this.field915;
        if (this.field916 != null) {
            class327 var3 = this.field916.method2029(arg0 ^ 0xFFFFFFF4);
            if (var3 == null) {
                this.field921 = 0;
                this.field910 = null;
                this.field928 = 0;
                this.field907 = 0;
                this.field905 = 0;
                this.field915 = -1;
            } else {
                this.field910 = var3.field4676;
                this.field921 = var3.field4678;
                this.field915 = var3.field4663;
                this.field907 = var3.field4658 * 128;
                this.field928 = var3.field4673;
                this.field905 = var3.field4647;
            }
        } else if (this.field914 != null) {
            int var4 = class311.method1953(this.field914, 0);
            if (var2 != var4) {
                this.field915 = var4;
                class335 var5 = this.field914.field5229;
                if (var5.field4984 != null) {
                    var5 = var5.method2162(0);
                }
                if (var5 == null) {
                    this.field905 = this.field907 = 0;
                } else {
                    this.field907 = var5.field4975 * 128;
                    this.field905 = var5.field4980;
                }
            }
        } else if (this.field912 != null) {
            this.field915 = class291.method1858((byte) 59, this.field912);
            this.field905 = this.field912.field1829;
            this.field907 = this.field912.field1836 * 128;
        }
        if (this.field915 != var2 && this.field909 != null) {
            class135.field1884.method2807(this.field909);
            this.field909 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
    public static final void method452(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field917 = null;
        }
        for (class81 var2 = (class81) class310.field4420.method1124(-1); var2 != null; var2 = (class81) class310.field4420.method1119(false)) {
            if (var2.field909 != null) {
                class135.field1884.method2807(var2.field909);
                var2.field909 = null;
            }
            if (var2.field926 != null) {
                class135.field1884.method2807(var2.field926);
                var2.field926 = null;
            }
            var2.method2290((byte) 98);
        }
        field913++;
        if (!arg0) {
            return;
        }
        for (class81 var3 = (class81) class182.field2495.method1124(-1); var3 != null; var3 = (class81) class182.field2495.method1119(false)) {
            if (var3.field909 != null) {
                class135.field1884.method2807(var3.field909);
                var3.field909 = null;
            }
            var3.method2290((byte) 98);
        }
        for (class81 var4 = (class81) class201.field2777.method1212(arg1 - 117); var4 != null; var4 = (class81) class201.field2777.method1207(false)) {
            if (var4.field909 != null) {
                class135.field1884.method2807(var4.field909);
                var4.field909 = null;
            }
            var4.method2290((byte) 98);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILjf;IIIII)V")
    public static final void method453(int arg0, int arg1, class119 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2.field1535 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg2.field1458; var11++) {
                for (int var12 = 0; var12 < arg2.field1461; var12++) {
                    int var13 = (arg2.field1445 + 32) * var12 + arg3;
                    int var14 = arg0 + ((arg2.field1421 + 32) * var11);
                    if (var10 < 20) {
                        var13 += arg2.field1479[var10];
                        var14 += arg2.field1573[var10];
                    }
                    if (arg2.field1580[var10] > 0 && (arg5 < var13 + 32 && var13 < arg4 && (var14 + 32) > arg7 && arg1 > var14 || class189.field2571 == arg2 && class217.field2977 == var10)) {
                        if (var9 < var10) {
                            var9 = var10;
                        }
                        if (var8 > var10) {
                            var8 = var10;
                        }
                    }
                    var10++;
                }
            }
            class228.method1469(var8, class218.field2991, (byte) -128, var9, arg2);
        } else if (arg2.field1535 == 5 && arg2.field1597 != -1) {
            class410.method2575((byte) 84, arg2, class218.field2991);
        }
        if (arg6 != -1) {
            field906 = null;
        }
        field923++;
    }
}
