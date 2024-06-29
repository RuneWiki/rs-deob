import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class166 extends class393 {

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public int field2172 = 0;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "Lrr;")
    public static class199 field2166 = new class199();

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2173 = "Examine";

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public int field2165;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "Lai;")
    public class129 field2179;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "Lvp;")
    public class194 field2167;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "Lhg;")
    public class290 field2160;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Lhg;")
    public class290 field2162;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Lta;")
    public class404 field2185;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "Z")
    public boolean field2171;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "[I")
    public int[] field2183;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)Lco;", line = 11)
    public static final class193 method1031(int arg0, boolean arg1) {
        field2168++;
        class24 var2 = class70.field966;
        class193 var3;
        synchronized (class70.field966) {
            var3 = (class193) class70.field966.method209(126, (long) arg0);
            if (arg1) {
                field2166 = null;
            }
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class402.field5980.method1472(class192.method1191(3676, arg0), class339.method2245(-348018488, arg0), 0);
        class193 var5 = new class193();
        var5.field2737 = arg0;
        if (var4 != null) {
            var5.method1207(-126, new class265(var4));
        }
        var5.method1210(128);
        if (var5.field2706 != -1) {
            var5.method1201(method1031(var5.field2682, false), false, method1031(var5.field2706, arg1));
        }
        if (var5.field2697 != -1) {
            var5.method1197(method1031(var5.field2697, false), method1031(var5.field2749, false), (byte) 100);
        }
        if (!class5.field46 && var5.field2754) {
            var5.field2699 = class24.field436;
            var5.field2753 = class50.field703;
            var5.field2729 = class291.field4204;
            var5.field2715 = false;
            var5.field2724 = null;
            var5.field2683 = 0;
        }
        class24 var6 = class70.field966;
        synchronized (class70.field966) {
            class70.field966.method202(true, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 60)
    public static final void method1032(int arg0, boolean arg1, String arg2) {
        field2169++;
        class256 var3 = class363.method2385(2, arg0, (byte) 1);
        var3.method1614(0);
        var3.field3753 = arg2;
        if (!arg1) {
            field2166 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 74)
    public static final void method1033(String arg0, byte arg1) {
        int var2 = -125 % ((-arg1 - 50) / 54);
        field2177++;
        if (arg0 == null) {
            return;
        }
        String var3 = class295.method1881((byte) 69, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class244.field3409; var4++) {
            String var5 = class295.method1881((byte) 125, class272.field3982[var4]);
            if (var5 != null && var5.equals(var3)) {
                class244.field3409--;
                for (int var6 = var4; var6 < class244.field3409; var6++) {
                    class272.field3982[var6] = class272.field3982[var6 + 1];
                    class374.field5640[var6] = class374.field5640[var6 + 1];
                    class155.field2035[var6] = class155.field2035[var6 + 1];
                    class214.field3052[var6] = class214.field3052[var6 + 1];
                    class41.field645[var6] = class41.field645[var6 + 1];
                }
                class188.field2555 = class381.field5717;
                class358.field5250++;
                class232.field3279.method756(0, 30);
                class232.field3279.method1707(-126, class410.method2668((byte) -127, arg0));
                class232.field3279.method1662(arg0, (byte) -110);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIII)I", line = 127)
    public static final int method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -6459) {
            return 89;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg6 & 0x3;
        field2178++;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 1 + 7 - (arg3 + arg4);
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg2;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 164)
    public static void method1035(int arg0) {
        field2173 = null;
        field2166 = null;
        if (arg0 < 76) {
            method1032(-51, true, (String) null);
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V", line = 186)
    public final void method1036(boolean arg0) {
        if (!arg0) {
            this.field2176 = 10;
        }
        field2181++;
        int var2 = this.field2170;
        if (this.field2185 != null) {
            class404 var5 = this.field2185.method2626(18);
            if (var5 == null) {
                this.field2183 = null;
                this.field2163 = 0;
                this.field2170 = -1;
                this.field2174 = 0;
                this.field2164 = 0;
                this.field2165 = 0;
            } else {
                this.field2163 = var5.field6035 * 128;
                this.field2183 = var5.field6030;
                this.field2174 = var5.field6018;
                this.field2165 = var5.field6042;
                this.field2170 = var5.field6072;
                this.field2164 = var5.field6031;
            }
        } else if (this.field2179 != null) {
            int var3 = class52.method356(18, this.field2179);
            if (var2 != var3) {
                this.field2170 = var3;
                class373 var4 = this.field2179.field1714;
                if (var4.field5576 != null) {
                    var4 = var4.method2469(true);
                }
                if (var4 == null) {
                    this.field2165 = this.field2163 = 0;
                } else {
                    this.field2165 = var4.field5581;
                    this.field2163 = var4.field5606 * 128;
                }
            }
        } else if (this.field2167 != null) {
            this.field2170 = class197.method1231(this.field2167, 10);
            this.field2165 = this.field2167.field2760;
            this.field2163 = this.field2167.field2782 * 128;
        }
        if (this.field2170 != var2 && this.field2162 != null) {
            class405.field6092.method166(this.field2162);
            this.field2162 = null;
        }
    }
}
