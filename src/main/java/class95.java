import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    public static int[] field2243 = new int[500];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lr;")
    private static class118 field2244 = class153.method1136(90, "scroll:");

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lke;")
    public static class74 field2249 = null;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lr;")
    public static class118 field2250 = field2244;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lr;")
    public static class118 field2241 = null;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lr;")
    public static class118 field2255 = class153.method1136(96, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lr;")
    public static class118 field2254 = field2244;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lr;")
    public static class118 field2256 = class153.method1136(87, "mapmarker");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lvf;")
    public static class152 field2247;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)[Lvd;")
    public static final class150[] method745(int arg0) {
        class150[] var1 = new class150[field2246];
        field2245++;
        int var2 = 0;
        if (arg0 != 600) {
            method747((byte) 13, 77);
        }
        while (var2 < field2246) {
            class150 var3 = new class150();
            var3.field3369 = class106.field2476;
            var3.field3368 = class105.field2458;
            var3.field3363 = class153.field3467[var2];
            var3.field3365 = class54.field1293[var2];
            var3.field3366 = class65.field1488[var2];
            var3.field3364 = class56.field1313[var2];
            byte[] var4 = class74.field1830[var2];
            int var5 = var3.field3366 * var3.field3364;
            var3.field3367 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field3367[var6] = class127.field2904[class79.method669(var4[var6], 255)];
            }
            var1[var2] = var3;
            var2++;
        }
        class97.method755((byte) 105);
        return var1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method746(byte arg0) {
        field2254 = null;
        field2249 = null;
        field2244 = null;
        field2255 = null;
        if (arg0 > -125) {
            method749((byte) -71);
        }
        field2250 = null;
        field2243 = null;
        field2241 = null;
        field2256 = null;
        field2247 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)Lr;")
    public static final class118 method747(byte arg0, int arg1) {
        if (arg0 > -29) {
            return null;
        } else {
            field2251++;
            return class126.field2876[arg1].method935(-89) <= 0 ? class144.field3250[arg1] : class144.method1066(true, new class118[] { class144.field3250[arg1], class85.field2097, class126.field2876[arg1] });
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[Lr;)Lr;")
    public static final class118 method748(int arg0, int arg1, int arg2, class118[] arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class113.field2636;
            }
            var4 += arg3[arg1 + var5].field2743;
        }
        field2242++;
        int var6 = -81 % ((arg0 + 13) / 39);
        byte[] var7 = new byte[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < arg2; var9++) {
            class118 var11 = arg3[arg1 + var9];
            class57.method504(var11.field2746, 0, var7, var8, var11.field2743);
            var8 += var11.field2743;
        }
        class118 var10 = new class118();
        var10.field2746 = var7;
        var10.field2743 = var4;
        return var10;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static final void method749(byte arg0) {
        Object var1 = class84.field2020;
        synchronized (class84.field2020) {
            if (class35.field874 == 0) {
                field2247.method1128(-17306, new class94(), 5);
            }
            class35.field874 = 600;
        }
        field2248++;
        if (arg0 != -111) {
            method745(86);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lr;I)V")
    public static final void method750(class118 arg0, int arg1) {
        field2253++;
        if (class99.field2294 == null) {
            return;
        }
        long var2 = arg0.method925(0);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class99.field2294.length && class99.field2294[var4].field2295 != var2) {
            var4++;
        }
        if (class99.field2294.length > var4 && class99.field2294[var4] != null) {
            class1.field22.method722(arg1, (byte) -128);
            class100.field2308++;
            class1.field22.method824(class99.field2294[var4].field2295, true);
        }
    }
}
