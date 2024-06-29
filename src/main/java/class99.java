import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lka;")
    private class70 field2252 = new class70(256);

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lff;")
    private class42 field2276;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lff;")
    private class42 field2251;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lwd;")
    public static class150 field2257 = class2.method9(true, "Icons redrawn");

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lwd;")
    private static class150 field2260 = class2.method9(true, "Dec");

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lwd;")
    private static class150 field2262 = class2.method9(true, "Sep");

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lwd;")
    private static class150 field2263 = class2.method9(true, "Oct");

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lwd;")
    private static class150 field2265 = class2.method9(true, "Mar");

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lwd;")
    private static class150 field2264 = class2.method9(true, "Feb");

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lwd;")
    private static class150 field2268 = class2.method9(true, "Nov");

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lwd;")
    private static class150 field2267 = class2.method9(true, "Apr");

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lwd;")
    private static class150 field2259 = class2.method9(true, "Jul");

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lwd;")
    private static class150 field2255 = class2.method9(true, "Jun");

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Lwd;")
    public static class150 field2273 = class2.method9(true, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lwd;")
    private static class150 field2270 = class2.method9(true, "May");

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lwd;")
    private static class150 field2275 = class2.method9(true, "Jan");

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Lwd;")
    public static class150 field2274 = class2.method9(true, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lwd;")
    private static class150 field2271 = class2.method9(true, "Aug");

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "[Lwd;")
    public static class150[] field2261 = new class150[] { field2275, field2264, field2265, field2267, field2270, field2255, field2259, field2271, field2262, field2263, field2268, field2260 };

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Lwd;")
    public static class150 field2278 = class2.method9(true, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lwd;")
    public static class150 field2280 = class2.method9(true, "@gre@");

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lre;")
    public static class121 field2277;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Z")
    public static boolean field2266;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method682(int arg0) {
        if (class83.field1986 != null) {
            class80 var1 = class83.field1986;
            synchronized (class83.field1986) {
                class83.field1986 = null;
            }
        }
        field2258++;
        if (arg0 < 102) {
            method687(-41, 113, true, null);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method683(int arg0) {
        field2267 = null;
        field2255 = null;
        field2271 = null;
        field2263 = null;
        field2277 = null;
        field2261 = null;
        field2278 = null;
        field2273 = null;
        field2268 = null;
        int var1 = 61 % ((arg0 + 22) / 38);
        field2280 = null;
        field2259 = null;
        field2260 = null;
        field2270 = null;
        field2264 = null;
        field2265 = null;
        field2262 = null;
        field2257 = null;
        field2275 = null;
        field2274 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B[II)Lqe;")
    public final class115 method684(byte arg0, int[] arg1, int arg2) {
        field2269++;
        long var4 = (long) arg2 ^ 0x200000000L;
        class115 var6 = (class115) this.field2252.method534((byte) -119, var4);
        if (var6 != null) {
            return var6;
        } else if (arg1 != null && arg1[0] <= 0) {
            return null;
        } else if (arg0 < 37) {
            return null;
        } else {
            class44 var7 = class44.method342(this.field2251, arg2);
            if (var7 == null) {
                return null;
            }
            class115 var8 = var7.method341();
            this.field2252.method541(var8, var4, false);
            if (arg1 != null) {
                arg1[0] -= var8.field2659.length;
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[II)Lqe;")
    public final class115 method685(int arg0, int[] arg1, int arg2) {
        field2272++;
        long var4 = (long) arg2 ^ 0x300000000L;
        class115 var6 = (class115) this.field2252.method534((byte) -118, var4);
        if (var6 != null) {
            return var6;
        } else if (arg1 == null || arg1[0] > 0) {
            if (arg0 != 0) {
                method683(81);
            }
            class53 var7 = class53.method415(this.field2276, arg2);
            if (var7 == null) {
                return null;
            }
            class115 var8 = var7.method419();
            this.field2252.method541(var8, var4, false);
            if (arg1 != null) {
                arg1[0] -= var8.field2659.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIIIB)Lhb;")
    public static final class51 method686(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2279++;
        long var6 = (long) arg1 + ((long) arg4 << 16) + ((long) arg2 << 40) + ((long) arg3 << 38);
        if (!arg0) {
            class51 var8 = (class51) class38.field1035.method440(var6, 26976);
            if (var8 != null) {
                return var8;
            }
        }
        class21 var9 = class4.method26((byte) 124, arg1);
        if (arg4 > 1 && var9.field535 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field578[var11] <= arg4 && var9.field578[var11] != 0) {
                    var10 = var9.field535[var11];
                }
            }
            if (var10 != -1) {
                var9 = class4.method26((byte) 101, var10);
            }
        }
        if (arg5 <= 79) {
            field2265 = null;
        }
        class13 var12 = var9.method168((byte) 7, 1);
        if (var12 == null) {
            return null;
        }
        class51 var13 = null;
        if (var9.field572 != -1) {
            var13 = method686(true, var9.field555, 0, 1, 10, (byte) 110);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class120.field2775;
        int[] var15 = new int[4];
        int[] var16 = class120.field2771;
        int var17 = class120.field2772;
        class120.method873(var15);
        class51 var18 = new class51(36, 32);
        class120.method879(var18.field1377, 36, 32);
        class120.method878();
        class60.method454();
        class60.method458(16, 16);
        class60.field1526 = false;
        int var19 = var9.field543;
        if (arg0) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class60.field1523[var9.field542] * var19 >> 16;
        int var21 = class60.field1515[var9.field542] * var19 >> 16;
        var12.method104();
        var12.method85(0, var9.field579, var9.field601, var9.field542, var9.field547, var12.field871 / 2 + var20 + var9.field603, var9.field603 + var21);
        if (arg3 >= 1) {
            var18.method400(1);
        }
        if (arg3 >= 2) {
            var18.method400(16777215);
        }
        if (arg2 != 0) {
            var18.method402(arg2);
        }
        class120.method879(var18.field1377, 36, 32);
        if (var9.field572 != -1) {
            var13.method398(0, 0);
        }
        if (!arg0 && (var9.field566 == 1 || arg4 != 1) && arg4 != -1) {
            class86.field2030.method1053(class105.method726(arg4, (byte) -23), 1, 10, 1);
            class86.field2030.method1053(class105.method726(arg4, (byte) -23), 0, 9, 16776960);
        }
        if (!arg0) {
            class38.field1035.method433(var18, var6, (byte) -122);
        }
        class120.method879(var16, var14, var17);
        class120.method868(var15);
        class60.method454();
        class60.field1526 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lff;Lff;)V")
    public class99(class42 arg0, class42 arg1) {
        this.field2276 = arg1;
        this.field2251 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLff;)[Lqd;")
    public static final class114[] method687(int arg0, int arg1, boolean arg2, class42 arg3) {
        field2256++;
        if (class146.method1095(arg3, arg1, (byte) 21, arg0)) {
            if (!arg2) {
                method687(-55, 69, false, null);
            }
            return class2.method10((byte) 111);
        } else {
            return null;
        }
    }
}
