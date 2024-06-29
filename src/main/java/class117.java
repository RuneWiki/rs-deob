import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class117 {

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "Lgd;")
    private class346 field1864;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    private int field1853;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    private int field1849;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Lmo;")
    private class482 field1854;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Lvh;")
    public static class125 field1860 = new class125(16, -1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[Lpi;")
    public static class302[] field1847;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "[Lrea;")
    public static class32[] field1867;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLtt;)V", line = 4)
    private final void method935(boolean arg0, class475 arg1) {
        if (arg1 != null) {
            arg1.method2549((byte) -41);
            arg1.method1113(32730);
            this.field1853 += arg1.field6811;
        }
        field1858++;
        if (!arg0) {
            method938(-45, null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 21)
    public final void method936(int arg0) {
        field1852++;
        this.field1864.method2103((byte) -42);
        this.field1854.method2821(1);
        if (arg0 <= -33) {
            this.field1853 = this.field1849;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 34)
    public final Object method937(int arg0) {
        field1866++;
        class475 var2 = (class475) this.field1854.method2815(0);
        if (arg0 != -19431) {
            this.field1854 = null;
        }
        while (var2 != null) {
            Object var3 = var2.method373(true);
            if (var3 != null) {
                return var3;
            }
            class475 var4 = var2;
            var2 = (class475) this.field1854.method2814(arg0 + 19435);
            var4.method2549((byte) -114);
            var4.method1113(arg0 ^ 0xFFFFCBC3);
            this.field1853 += var4.field6811;
        }
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILi;)V", line = 68)
    public static final void method938(int arg0, class682 arg1) {
        class687.field9745[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 74)
    public final void method939(int arg0, int arg1) {
        if (arg0 != 28093) {
            return;
        }
        if (class152.field2543 != null) {
            for (class475 var3 = (class475) this.field1864.method2112((byte) 121); var3 != null; var3 = (class475) this.field1864.method2109(-121)) {
                if (var3.method374(0)) {
                    if (var3.method373(true) == null) {
                        var3.method2549((byte) 77);
                        var3.method1113(32730);
                        this.field1853++;
                    }
                } else if (++var3.field2469 > (long) arg1) {
                    class475 var4 = class152.field2543.method2523(var3, 6);
                    this.field1854.method2816(var4, var3.field6265, false);
                    class114.method925(69, var3, var4);
                    var3.method2549((byte) 99);
                    var3.method1113(32730);
                }
            }
        }
        field1861++;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 124)
    public final Object method940(int arg0) {
        if (arg0 > -70) {
            this.field1854 = null;
        }
        field1856++;
        class475 var2 = (class475) this.field1854.method2814(4);
        while (var2 != null) {
            Object var3 = var2.method373(true);
            if (var3 != null) {
                return var3;
            }
            class475 var4 = var2;
            var2 = (class475) this.field1854.method2814(4);
            var4.method2549((byte) -55);
            var4.method1113(32730);
            this.field1853 += var4.field6811;
        }
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 157)
    public final Object method941(long arg0, int arg1) {
        field1855++;
        class475 var4 = (class475) this.field1854.method2818(-22803, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method373(true);
        if (var5 == null) {
            var4.method2549((byte) 117);
            var4.method1113(32730);
            this.field1853 += var4.field6811;
            return null;
        }
        if (var4.method374(arg1)) {
            class47 var6 = new class47(var5, var4.field6811);
            this.field1854.method2816(var6, var4.field6265, false);
            this.field1864.method2107(true, var6);
            var6.field2469 = 0L;
            var4.method2549((byte) 28);
            var4.method1113(32730);
        } else {
            this.field1864.method2107(true, var4);
            var4.field2469 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I)V", line = 198)
    public class117(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(JI)V", line = 203)
    private final void method942(long arg0, int arg1) {
        field1859++;
        class475 var4 = (class475) this.field1854.method2818(arg1 + 4404, arg0);
        if (arg1 != -27207) {
            this.field1849 = 7;
        }
        this.method935(true, var4);
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V", line = 218)
    public static void method943(int arg0) {
        field1847 = null;
        if (arg0 >= -115) {
            field1867 = null;
        }
        field1867 = null;
        field1860 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/Object;JII)V", line = 231)
    public final void method944(Object arg0, long arg1, int arg2, int arg3) {
        field1862++;
        if (this.field1849 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method942(arg1, -27207);
        this.field1853 -= arg2;
        while (this.field1853 < 0) {
            class475 var7 = (class475) this.field1864.method2105(-4488);
            this.method935(true, var7);
        }
        class47 var6 = new class47(arg0, arg2);
        this.field1854.method2816(var6, arg1, false);
        if (arg3 != 1) {
            this.method942(-27L, 2);
        }
        this.field1864.method2107(true, var6);
        var6.field2469 = 0L;
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)I", line = 264)
    public final int method945(int arg0) {
        field1857++;
        if (arg0 != 0) {
            this.field1853 = -66;
        }
        return this.field1849;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V", line = 275)
    public static final void method946(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field1851++;
        class117 var2 = class603.field8668;
        synchronized (class603.field8668) {
            class603.field8668.method939(28093, arg0);
        }
        class117 var3 = class45.field602;
        synchronized (class45.field602) {
            class45.field602.method939(28093, arg0);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLek;)Lgaa;", line = 296)
    public static final class433 method947(boolean arg0, class465 arg1) {
        field1863++;
        int var2 = arg1.method2705(-36);
        class186 var3 = class405.method2437((byte) -110)[arg1.method2705(-79)];
        class409 var4 = class113.method919(arg0)[arg1.method2705(-51)];
        int var5 = arg1.method2744(-1);
        if (arg0) {
            method938(-54, null);
        }
        int var6 = arg1.method2744(-1);
        int var7 = arg1.method2755((byte) -119);
        int var8 = arg1.method2755((byte) -66);
        int var9 = arg1.method2691((byte) -67);
        int var10 = arg1.method2691((byte) -67);
        int var11 = arg1.method2691((byte) -67);
        boolean var12 = arg1.method2705(-111) == 1;
        return new class433(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(II)V", line = 406)
    public class117(int arg0, int arg1) {
        this.field1864 = new class346();
        this.field1853 = arg0;
        this.field1849 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1854 = new class482(var3);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)I", line = 333)
    public final int method948(boolean arg0) {
        field1865++;
        return arg0 ? -46 : this.field1853;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(JZLjava/lang/Object;)V", line = 344)
    public final void method949(long arg0, boolean arg1, Object arg2) {
        field1850++;
        if (!arg1) {
            this.method944(null, 100L, 126, -114);
        }
        this.method944(arg2, arg0, 1, 1);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 355)
    public final void method950(byte arg0) {
        for (class475 var2 = (class475) this.field1864.method2112((byte) 42); var2 != null; var2 = (class475) this.field1864.method2109(-89)) {
            if (var2.method374(0)) {
                var2.method2549((byte) 65);
                var2.method1113(32730);
                this.field1853 += var2.field6811;
            }
        }
        int var3 = 100 / ((arg0 + 72) / 50);
        field1846++;
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)I", line = 379)
    public final int method951(int arg0) {
        field1848++;
        if (arg0 != -1) {
            field1847 = null;
        }
        int var2 = 0;
        for (class475 var3 = (class475) this.field1864.method2112((byte) 121); var3 != null; var3 = (class475) this.field1864.method2109(-124)) {
            if (!var3.method374(0)) {
                var2++;
            }
        }
        return var2;
    }
}
