import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nf")
public class class127 {

    @OriginalMember(owner = "nf", name = "h", descriptor = "Z")
    public boolean field2454 = true;

    @OriginalMember(owner = "nf", name = "o", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "nf", name = "m", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "nf", name = "e", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "nf", name = "j", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "nf", name = "a", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "nf", name = "l", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "nf", name = "d", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "nf", name = "b", descriptor = "Llf;")
    public static class109 field2448 = class35.method275("Suche nach Updates )2 ", 2);

    @OriginalMember(owner = "nf", name = "f", descriptor = "Llf;")
    private static class109 field2452 = class35.method275("Login server offline)3", 2);

    @OriginalMember(owner = "nf", name = "g", descriptor = "Llf;")
    public static class109 field2453 = field2452;

    @OriginalMember(owner = "nf", name = "p", descriptor = "Llf;")
    private static class109 field2462 = class35.method275("Take", 2);

    @OriginalMember(owner = "nf", name = "q", descriptor = "Llf;")
    public static class109 field2463 = class35.method275("Keine Antwort vom Server)3", 2);

    @OriginalMember(owner = "nf", name = "n", descriptor = "Llf;")
    public static class109 field2460 = field2462;

    @OriginalMember(owner = "nf", name = "c", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "nf", name = "i", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "nf", name = "k", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "nf", name = "r", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "nf", name = "a", descriptor = "(BIIII)V")
    public static final void method920(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2464++;
        int var5 = -15 % ((arg0 - 22) / 32);
        if (class199.field3812 == 1) {
            client.field682[class90.field1858 / 100].method704(class60.field1185 - 8, class145.field2801 + -8);
        }
        if (class199.field3812 == 2) {
            client.field682[class90.field1858 / 100 + 4].method704(class60.field1185 - 8, class145.field2801 + -8);
        }
        class171.method1150(115);
        if (!class131.field2528) {
            return;
        }
        int var6 = arg2 + 20;
        int var7 = arg1 + 512 - 5;
        class92.field1891.method129(class36.method279(new class109[] { class145.field2804, class52.method345((byte) 85, class147.field2826) }, -50), var7, var6, 16776960, -1);
        int var11 = var6 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = 16776960;
        int var10 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var10 > 32768 && class181.field3420) {
            var9 = 16711680;
        }
        if (var10 > 65536 && !class181.field3420) {
            var9 = 16711680;
        }
        class92.field1891.method129(class36.method279(new class109[] { class6.field93, class52.method345((byte) 85, var10), class104.field2059 }, 123), var7, var11, var9, -1);
        var6 = var11 + 15;
    }

    @OriginalMember(owner = "nf", name = "a", descriptor = "(Z)Ldf;")
    public static final class37 method921(boolean arg0) {
        field2455++;
        class37 var1 = new class37();
        var1.field802 = class10.field166[0];
        var1.field806 = class69.field1345[0];
        var1.field808 = class168.field3114;
        if (!arg0) {
            method922(-7);
        }
        var1.field805 = class116.field2298;
        var1.field807 = class202.field3976[0];
        var1.field801 = class21.field481[0];
        var1.field803 = class160.field2992[0];
        var1.field804 = class51.field1036;
        class69.method444(-98);
        return var1;
    }

    @OriginalMember(owner = "nf", name = "a", descriptor = "(I)V")
    public static void method922(int arg0) {
        field2462 = null;
        field2448 = null;
        if (arg0 == 512) {
            field2453 = null;
            field2463 = null;
            field2460 = null;
            field2452 = null;
        }
    }

    @OriginalMember(owner = "nf", name = "a", descriptor = "(IIIILka;Lka;IIJ)V")
    public static final void method923(int arg0, int arg1, int arg2, int arg3, class95 arg4, class95 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class12 var10 = new class12();
        var10.field183 = arg8;
        var10.field186 = arg1 * 128 + 64;
        var10.field184 = arg2 * 128 + 64;
        var10.field176 = arg3;
        var10.field188 = arg4;
        var10.field190 = arg5;
        var10.field177 = arg6;
        var10.field187 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class78.field1550[var11][arg1][arg2] == null) {
                class78.field1550[var11][arg1][arg2] = new class3(var11, arg1, arg2);
            }
        }
        class78.field1550[arg0][arg1][arg2].field31 = var10;
    }

    @OriginalMember(owner = "nf", name = "a", descriptor = "(II)V")
    public static final void method924(int arg0, int arg1) {
        field2457++;
        if (class185.method1253(false, arg1)) {
            class179.method1220(-1682905504, -1, class169.field3146[arg1]);
            if (arg0 <= 99) {
                method924(4, 127);
            }
        }
    }

    @OriginalMember(owner = "nf", name = "a", descriptor = "(B)V")
    public static final void method925(byte arg0) {
        int var1 = class46.field957.method123(class184.field3465);
        field2449++;
        for (int var2 = 0; var2 < class149.field2882; var2++) {
            int var6 = class46.field957.method123(class114.method843(var2, (byte) -126));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class149.field2882 * 15 + 21;
        class111.field2190 = var1;
        class51.field1041 = true;
        if (arg0 >= -109) {
            field2463 = null;
        }
        int var4 = class129.field2511 - var1 / 2;
        if (var4 + var1 > 765) {
            var4 = 765 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class128.field2471 = class149.field2882 * 15 + 22;
        int var5 = class67.field1310;
        class104.field2050 = var4;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class105.field2093 = var5;
    }

    @OriginalMember(owner = "nf", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2461 = arg4;
        this.field2459 = arg3;
        this.field2451 = arg2;
        this.field2456 = arg0;
        this.field2447 = arg1;
        this.field2458 = arg5;
        this.field2454 = arg6;
    }
}
