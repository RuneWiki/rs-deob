import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class338 extends class199 {

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "[I")
    public static int[] field5286 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "Z")
    public static boolean field5292 = false;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Lpg;")
    public static class320 field5280 = new class320(4);

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Lgm;")
    public static class249 field5287;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Ljava/lang/String;")
    public String field5293;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V", line = 7)
    public static void method2343(int arg0) {
        field5286 = null;
        field5287 = null;
        field5280 = null;
        int var1 = 8 % ((-arg0 - 42) / 56);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILib;)V", line = 18)
    public static final void method2344(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg3.field1912 == arg1 && arg1 != -1) {
            class281 var4 = class133.method948(arg1, (byte) 33);
            int var5 = var4.field4330;
            if (var5 == 1) {
                arg3.field1952 = 0;
                arg3.field1946 = 0;
                arg3.field1880 = 0;
                arg3.field1881 = arg2;
                arg3.field1926 = 1;
                class170.method1231(false, arg3.field1905, arg3.field1868, arg3.field1952, var4, -24255);
            }
            if (var5 == 2) {
                arg3.field1946 = 0;
            }
        } else if (arg1 == -1 || arg3.field1912 == -1 || class133.method948(arg1, (byte) 33).field4344 >= class133.method948(arg3.field1912, (byte) 33).field4344) {
            arg3.field1952 = 0;
            arg3.field1881 = arg2;
            arg3.field1946 = 0;
            arg3.field1926 = 1;
            arg3.field1880 = 0;
            arg3.field1912 = arg1;
            arg3.field1913 = arg3.field1918;
            if (arg3.field1912 != -1) {
                class170.method1231(false, arg3.field1905, arg3.field1868, arg3.field1952, class133.method948(arg3.field1912, (byte) 33), -24255);
            }
        }
        if (arg0 < 19) {
            field5280 = (class320) null;
        }
        field5284++;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)I", line = 75)
    public final int method2345(boolean arg0) {
        if (arg0) {
            return -44;
        } else {
            field5285++;
            return (int) (this.field758 >>> 32 & 0xFFL);
        }
    }

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "(I)J", line = 90)
    public final long method2346(int arg0) {
        field5281++;
        return arg0 == 1 ? Long.MAX_VALUE & this.field2980 : 105L;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(Z)V", line = 102)
    public final void method2347(boolean arg0) {
        field5283++;
        this.field2980 = class102.method743((byte) 98) + 500L | this.field2980 & Long.MIN_VALUE;
        class331.field5156.method1595(arg0, this);
    }

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "(I)I", line = 113)
    public final int method2348(int arg0) {
        field5282++;
        int var2 = -115 % ((arg0 - 48) / 62);
        return (int) this.field758;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIZ)V", line = 122)
    public static final void method2349(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class50.field817 = arg1;
        class267.field4171 = arg2;
        class73.field1197 = arg3;
        class34.field528 = new class142[arg0][class50.field817][class267.field4171];
        class216.field3293 = new int[arg0][class50.field817 + 1][class267.field4171 + 1];
        if (class94.field1516) {
            class184.field2766 = new class127[4][];
        }
        if (arg4) {
            class316.field4940 = new class142[1][class50.field817][class267.field4171];
            class121.field1848 = new int[class50.field817][class267.field4171];
            class119.field1816 = new int[1][class50.field817 + 1][class267.field4171 + 1];
            if (class94.field1516) {
                class19.field254 = new class127[1][];
            }
        } else {
            class316.field4940 = (class142[][][]) null;
            class121.field1848 = (int[][]) null;
            class119.field1816 = (int[][][]) null;
            class19.field254 = (class127[][]) null;
        }
        class298.method2022(false);
        class175.field2650 = new class282[500];
        class206.field3169 = 0;
        class332.field5162 = new class282[500];
        class160.field2412 = 0;
        class201.field3010 = new int[arg0][class50.field817 + 1][class267.field4171 + 1];
        class51.field840 = new class26[5000];
        class65.field1018 = 0;
        class98.field1563 = new class26[100];
        class149.field2256 = new boolean[class73.field1197 + class73.field1197 + 1][class73.field1197 + class73.field1197 + 1];
        class53.field898 = new boolean[class73.field1197 + class73.field1197 + 2][class73.field1197 + class73.field1197 + 2];
        class143.field2220 = new byte[arg0][class50.field817][class267.field4171];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 164)
    public static final int method2350(String arg0, int arg1) {
        if (arg1 != -32216) {
            method2344(-43, -22, -17, (class313) null);
        }
        field5289++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class229.method1619(arg0.charAt(var4), true) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z", line = 191)
    public static final boolean method2351(int arg0, int arg1, int arg2) {
        int var3 = class201.field3010[arg0][arg1][arg2];
        if (-class331.field5159 == var3) {
            return false;
        } else if (class331.field5159 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class216.method1528(var4 + 1, class218.field3321[arg0][arg1][arg2], var5 + 1) && class216.method1528(var4 + 128 - 1, class218.field3321[arg0][arg1 + 1][arg2], var5 + 1) && class216.method1528(var4 + 128 - 1, class218.field3321[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class216.method1528(var4 + 1, class218.field3321[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class201.field3010[arg0][arg1][arg2] = class331.field5159;
                return true;
            } else {
                class201.field3010[arg0][arg1][arg2] = -class331.field5159;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 217)
    public final void method2352(byte arg0) {
        if (arg0 <= 124) {
            return;
        }
        field5294++;
        this.field2980 |= Long.MIN_VALUE;
        if (this.method2346(1) == 0L) {
            class34.field527.method1595(true, this);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)Ljava/lang/String;", line = 240)
    public static final String method2353(int arg0, int arg1) {
        field5291++;
        return arg1 == 22719 ? (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF7563) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF) : (String) null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V", line = 253)
    public class338(int arg0, int arg1) {
        this.field758 = (long) arg1 | (long) arg0 << 32;
    }
}
