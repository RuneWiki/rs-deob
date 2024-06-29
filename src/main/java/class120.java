import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class120 extends class152 {

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Lfe;")
    public class74 field2255;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field2263 = 3353893;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Lhh;")
    public static class163 field2256 = class137.method1065("", 17);

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "Lhh;")
    public static class163 field2265 = class137.method1065("null", 17);

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lhh;")
    public static class163 field2253 = class137.method1065(")3runescape)3com)4l=", 17);

    @OriginalMember(owner = "client!be", name = "K", descriptor = "Lec;")
    public static class182 field2260 = new class182();

    @OriginalMember(owner = "client!be", name = "T", descriptor = "Lhh;")
    public static class163 field2268 = class137.method1065("Art", 17);

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "[I")
    public static int[] field2262;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "[[Z")
    public static boolean[][] field2267;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Llg;")
    public static final class99 method939(int arg0, int arg1) {
        field2259++;
        class99 var2 = (class99) class100.field1930.method114((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class20.field326.method973(class220.method1557(false, arg1), true, class205.method1456(arg0 ^ 0xFFFFA671, arg1));
        class99 var4 = new class99();
        var4.field1882 = arg1;
        if (var3 != null) {
            var4.method795(new class81(var3), arg0 ^ 0xFFFFA657);
        }
        var4.method805((byte) -117);
        if (arg0 != 22952) {
            method943(-4, -79, 30, -16);
        }
        if (var4.field1858 != -1) {
            var4.method799(method939(22952, var4.field1891), method939(22952, var4.field1858), (byte) -76);
        }
        if (var4.field1922 != -1) {
            var4.method802(method939(22952, var4.field1911), method939(arg0, var4.field1922), (byte) 10);
        }
        if (!class21.field345 && var4.field1866) {
            var4.field1923 = 0;
            var4.field1909 = false;
            var4.field1884 = null;
            var4.field1903 = class234.field4188;
            var4.field1907 = null;
        }
        class100.field1930.method117(var4, false, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lta;IIIII)V")
    public static final void method940(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class7.field126 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class58.field948) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class106.field2033 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class144 var14 = class259.field4542[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class228.field4107[var11][var12 + 1][var13] + class228.field4107[var11][var12][var13] + class228.field4107[var11][var12][var13 + 1] + class228.field4107[var11][var12 + 1][var13 + 1]) / 4 - (class228.field4107[arg1][arg2 + 1][arg3] + class228.field4107[arg1][arg2][arg3] + class228.field4107[arg1][arg2][arg3 + 1] + class228.field4107[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class159 var16 = var14.field2731;
                                    if (var16 != null) {
                                        if (var16.field2930.method295()) {
                                            arg0.method306(var16.field2930, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2932 != null && var16.field2932.method295()) {
                                            arg0.method306(var16.field2932, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2741; var17++) {
                                        class132 var18 = var14.field2746[var17];
                                        if (var18 != null && var18.field2558.method295() && (var18.field2555 == var12 || var7 == var12) && (var18.field2550 == var13 || var9 == var13)) {
                                            int var19 = var18.field2565 + 1 - var18.field2555;
                                            int var20 = var18.field2551 + 1 - var18.field2550;
                                            arg0.method306(var18.field2558, (var18.field2555 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2550 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Lph;")
    public static final class63 method941(int arg0, int arg1) {
        field2257++;
        class63 var2 = (class63) class210.field3813.method114((long) arg0, arg1 - 3697);
        if (var2 != null) {
            return var2;
        }
        class63 var3 = class147.method1107((byte) -109, class135.field2619, false, arg0, class63.field1069);
        if (var3 != null) {
            class210.field3813.method117(var3, false, (long) arg0);
        }
        if (arg1 != 3697) {
            method946(-18);
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
    public static final Object method942(byte[] arg0, boolean arg1, byte arg2) {
        field2254++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class244.field4312) {
            try {
                class72 var3 = (class72) Class.forName("rf").getDeclaredConstructor().newInstance();
                var3.method533(-53, arg0);
                return var3;
            } catch (Throwable var5) {
                class244.field4312 = true;
            }
        }
        int var4 = -109 % ((arg2 - 57) / 46);
        return arg1 ? class103.method820(arg0, (byte) -108) : arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
    public static final void method943(int arg0, int arg1, int arg2, int arg3) {
        field2266++;
        if (arg2 == 29862) {
            class163 var4 = class145.method1101(arg2 - 29862, new class163[] { class258.field4515, class136.method1061(arg1, (byte) 101), class52.field876, class136.method1061(arg3 >> 6, (byte) 112), class52.field876, class136.method1061(arg0 >> 6, (byte) 119), class52.field876, class136.method1061(arg3 & 0x3F, (byte) 105), class52.field876, class136.method1061(arg0 & 0x3F, (byte) 101) });
            var4.method1204((byte) -85);
            class13.method91(var4, arg2 ^ 0x7B56);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lfe;)V")
    public class120(class74 arg0) {
        this.field2255 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
    public static final void method944(byte arg0) {
        field2269++;
        if (class191.field3494 != null) {
            class9 var1 = class191.field3494;
            synchronized (class191.field3494) {
                class191.field3494 = null;
            }
        }
        if (arg0 != -96) {
            method939(104, 27);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Z")
    public static final boolean method945(int arg0, boolean arg1) {
        field2261++;
        if (!arg1) {
            method945(-111, true);
        }
        return (arg0 & 0x19C41C) >> 20 != 0;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2260 = null;
        field2253 = null;
        field2268 = null;
        field2267 = null;
        field2265 = null;
        field2262 = null;
        field2256 = null;
        if (arg0 <= 113) {
            field2263 = -71;
        }
    }
}
