import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class141 {

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public int field2175 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Z")
    private boolean field2174 = false;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field2169 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2171 = "Allocated memory";

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Z")
    public static boolean field2180 = false;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[Lqk;")
    public static class224[] field2182 = new class224[50];

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field2177 = -1;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    private int field2189;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "J")
    public long field2168;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lfa;")
    public static class273 field2186;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lfa;")
    public static class273 field2192;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[Lh;")
    public static class294[] field2172;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lli;")
    public static final class314 method935(int arg0) {
        field2190++;
        if (arg0 != -29743) {
            method935(-114);
        }
        if (class13.field166 == null) {
            return null;
        }
        for (class314 var1 = (class314) class211.field3385.method133((byte) 124); var1 != null; var1 = (class314) class211.field3385.method133((byte) 124)) {
            class195 var2 = class192.method1334(false, var1.field5051);
            if (var2 != null && var2.field3083 && var2.method1354(true)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)I")
    public static final int method936(boolean arg0, int arg1) {
        if (arg0) {
            field2186 = null;
        }
        field2173++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lma;Z)V")
    public static final void method937(class202 arg0, boolean arg1) {
        field2179++;
        if ((arg0.field3234.length - arg0.field3272) < 1) {
            return;
        }
        int var2 = arg0.method1420((byte) 0);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field3234.length - arg0.field3272 < var3) {
            return;
        }
        class73.field1067 = arg0.method1420((byte) 0);
        if (class73.field1067 < 1) {
            class73.field1067 = 1;
        } else if (class73.field1067 > 4) {
            class73.field1067 = 4;
        }
        class80.method537(arg0.method1420((byte) 0) == 1, -60);
        class208.field3342 = arg0.method1420((byte) 0) == 1;
        class123.field1878 = arg0.method1420((byte) 0) == 1;
        class51.field687 = arg0.method1420((byte) 0) == 1;
        class12.field160 = arg0.method1420((byte) 0) == 1;
        class135.field2113 = arg0.method1420((byte) 0) == 1;
        class182.field2830 = arg0.method1420((byte) 0) == 1;
        class180.field2800 = arg0.method1420((byte) 0) == 1;
        if (arg1) {
            return;
        }
        class163.field2567 = arg0.method1420((byte) 0);
        if (class163.field2567 > 2) {
            class163.field2567 = 2;
        }
        if (var2 >= 2) {
            class272.field4462 = arg0.method1420((byte) 0) == 1;
        } else {
            class272.field4462 = arg0.method1420((byte) 0) == 1;
            arg0.method1420((byte) 0);
        }
        class176.field2746 = arg0.method1420((byte) 0) == 1;
        class143.field2228 = arg0.method1420((byte) 0) == 1;
        class218.field3463 = arg0.method1420((byte) 0);
        if (class218.field3463 > 2) {
            class218.field3463 = 2;
        }
        class230.field3687 = class218.field3463;
        class175.field2740 = arg0.method1420((byte) 0) == 1;
        class11.field145 = arg0.method1420((byte) 0);
        if (class11.field145 > 127) {
            class11.field145 = 127;
        }
        class223.field3550 = arg0.method1420((byte) 0);
        class19.field257 = arg0.method1420((byte) 0);
        if (class19.field257 > 127) {
            class19.field257 = 127;
        }
        if (var2 >= 1) {
            class152.field2373 = arg0.method1419(124);
            class296.field4867 = arg0.method1419(127);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1420((byte) 0);
        }
        if (var2 >= 4) {
            int var4 = arg0.method1420((byte) 0);
            if (class93.field1412 < 96) {
                var4 = 0;
            }
            class77.method504(var4);
        }
        if (var2 >= 5) {
            class51.field689 = arg0.method1440(20404);
        }
        if (var2 >= 6) {
            class258.field4245 = arg0.method1420((byte) 0);
        }
        if (var2 >= 7) {
            class192.field3039 = arg0.method1420((byte) 0) == 1;
        }
        if (var2 >= 8) {
            class74.field1123 = arg0.method1420((byte) 0) == 1;
        }
        if (var2 >= 9) {
            class132.field2028 = arg0.method1420((byte) 0);
        }
        if (var2 >= 10) {
            class241.field3822 = arg0.method1420((byte) 0) != 0;
        }
        if (var2 >= 11) {
            class144.field2261 = arg0.method1420((byte) 0) != 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method938(boolean arg0) {
        if (!arg0) {
            method938(false);
        }
        field2192 = null;
        field2186 = null;
        field2172 = null;
        field2171 = null;
        field2182 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public final void method939(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field2184++;
        this.field2170 = class172.field2658[this.field2189];
        this.field2187 = (int) Math.sqrt((double) (this.field2167 * this.field2167 + this.field2193 * this.field2193 + this.field2178 * this.field2178));
        if (this.field2188 == 0) {
            this.field2188 = 1;
        }
        if (this.field2195 == 0) {
            this.field2168 = 2147483647L;
        } else if (this.field2195 == 1) {
            this.field2168 = (long) (this.field2187 * 8 / this.field2188);
            this.field2168 *= this.field2168;
        } else if (this.field2195 == 2) {
            this.field2168 = (long) (this.field2187 * 8 / this.field2188);
        }
        if (this.field2174) {
            this.field2187 *= -1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILma;)V")
    private final void method940(int arg0, int arg1, class202 arg2) {
        if (arg0 != 1) {
            this.field2189 = 96;
        }
        field2181++;
        if (arg1 == 1) {
            this.field2189 = arg2.method1419(127);
        } else if (arg1 == 2) {
            arg2.method1420((byte) 0);
        } else if (arg1 == 3) {
            this.field2178 = arg2.method1440(20404);
            this.field2193 = arg2.method1440(arg0 + 20403);
            this.field2167 = arg2.method1440(arg0 ^ 0x4FB5);
        } else if (arg1 == 4) {
            this.field2195 = arg2.method1420((byte) 0);
            this.field2188 = arg2.method1440(arg0 + 20403);
        } else if (arg1 == 6) {
            this.field2194 = arg2.method1420((byte) 0);
        } else if (arg1 == 8) {
            this.field2169 = 1;
        } else if (arg1 == 9) {
            this.field2175 = 1;
            return;
        } else if (arg1 == 10) {
            this.field2174 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLma;)V")
    public final void method941(byte arg0, class202 arg1) {
        field2185++;
        while (true) {
            int var3 = arg1.method1420((byte) 0);
            if (var3 == 0) {
                if (arg0 == -3) {
                    return;
                } else {
                    field2177 = 6;
                    return;
                }
            }
            this.method940(arg0 + 4, var3, arg1);
        }
    }
}
