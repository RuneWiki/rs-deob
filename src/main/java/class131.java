import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class131 {

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lfk;")
    private class393 field1860 = new class393();

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    private int field1846;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lec;")
    private class129 field1856;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lno;")
    public static class420 field1854 = new class420(64);

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "[Lkp;")
    public static class285[] field1864 = new class285[8];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[Lri;")
    public static class59[] field1865;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JI)V")
    private final void method897(long arg0, int arg1) {
        field1859++;
        class295 var4 = (class295) this.field1856.method886(arg0, 25651);
        int var5 = 70 % ((-arg1 - 20) / 51);
        if (var4 != null) {
            var4.method2467((byte) 125);
            var4.method2783((byte) -122);
            this.field1857++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZLnq;)V")
    public static final void method898(boolean arg0, class268 arg1) {
        field1848++;
        if (arg0) {
            class302.field4171 = arg1;
            class302.field4171.method1739(103, 35);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method899(int arg0) {
        if (arg0 >= -107) {
            this.method904(false, -80L);
        }
        field1855++;
        class295 var2 = (class295) this.field1856.method885(-62);
        while (var2 != null) {
            Object var3 = var2.method1208(121);
            if (var3 != null) {
                return var3;
            }
            class295 var4 = var2;
            var2 = (class295) this.field1856.method881((byte) -68);
            var4.method2467((byte) 93);
            var4.method2783((byte) -122);
            this.field1857++;
        }
        return null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public final void method900(int arg0) {
        for (class295 var2 = (class295) this.field1860.method2482(-76); var2 != null; var2 = (class295) this.field1860.method2476(1)) {
            if (var2.method1209(arg0 ^ 0xFFFFFFF9)) {
                var2.method2467((byte) 117);
                var2.method2783((byte) -122);
                this.field1857++;
            }
        }
        if (arg0 == 0) {
            field1862++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
    public final void method901(int arg0, int arg1) {
        if (arg1 != 12223) {
            field1865 = null;
        }
        field1852++;
        if (class274.field3824 == null) {
            return;
        }
        for (class295 var3 = (class295) this.field1860.method2482(arg1 - 12310); var3 != null; var3 = (class295) this.field1860.method2476(1)) {
            if (var3.method1209(-7)) {
                if (var3.method1208(107) == null) {
                    var3.method2467((byte) 120);
                    var3.method2783((byte) -122);
                    this.field1857++;
                }
            } else if ((long) arg0 < ++var3.field6253) {
                class295 var4 = class274.field3824.method1495(var3, arg1 - 12224);
                this.field1856.method883((byte) -54, var3.field5600, var4);
                class141.method968(var4, var3, -13755);
                var3.method2467((byte) 107);
                var3.method2783((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JBLjava/lang/Object;)V")
    public final void method902(long arg0, byte arg1, Object arg2) {
        field1853++;
        this.method897(arg0, 100);
        if (this.field1857 == 0) {
            class295 var5 = (class295) this.field1860.method2481((byte) -78);
            var5.method2467((byte) 71);
            var5.method2783((byte) -122);
        } else {
            this.field1857--;
        }
        class335 var6 = new class335(arg2);
        this.field1856.method883((byte) -54, arg0, var6);
        this.field1860.method2478(var6, false);
        var6.field6253 = 0L;
        if (arg1 != 112) {
            method898(false, (class268) null);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I")
    public final int method903(byte arg0) {
        int var2 = -41 / ((-arg0 - 75) / 40);
        field1858++;
        return this.field1846;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZJ)Ljava/lang/Object;")
    public final Object method904(boolean arg0, long arg1) {
        field1847++;
        class295 var4 = (class295) this.field1856.method886(arg1, 25651);
        if (var4 == null) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            Object var5 = var4.method1208(106);
            if (var5 == null) {
                var4.method2467((byte) 98);
                var4.method2783((byte) -122);
                this.field1857++;
                return null;
            }
            if (var4.method1209(-7)) {
                class335 var6 = new class335(var5);
                this.field1856.method883((byte) -54, var4.field5600, var6);
                this.field1860.method2478(var6, false);
                var6.field6253 = 0L;
                var4.method2467((byte) -126);
                var4.method2783((byte) -122);
            } else {
                this.field1860.method2478(var4, false);
                var4.field6253 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
    public final void method905(byte arg0) {
        field1849++;
        if (arg0 <= 3) {
            this.field1860 = null;
        }
        this.field1860.method2486(221);
        this.field1856.method888(121);
        this.field1857 = this.field1846;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public static void method906(int arg0) {
        field1865 = null;
        field1854 = null;
        if (arg0 > -72) {
            method898(false, (class268) null);
        }
        field1864 = null;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)I")
    public final int method907(int arg0) {
        field1850++;
        if (arg0 != 971) {
            this.field1860 = null;
        }
        return this.field1857;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method908(int arg0) {
        field1861++;
        if (arg0 != 18603) {
            field1863 = 7;
        }
        class295 var2 = (class295) this.field1856.method881((byte) -68);
        while (var2 != null) {
            Object var3 = var2.method1208(126);
            if (var3 != null) {
                return var3;
            }
            class295 var4 = var2;
            var2 = (class295) this.field1856.method881((byte) -68);
            var4.method2467((byte) -114);
            var4.method2783((byte) -122);
            this.field1857++;
        }
        return null;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)I")
    public final int method909(int arg0) {
        field1851++;
        int var2 = 0;
        int var3 = -52 / ((22 - arg0) / 59);
        for (class295 var4 = (class295) this.field1860.method2482(-48); var4 != null; var4 = (class295) this.field1860.method2476(1)) {
            if (!var4.method1209(-7)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        this.field1846 = arg0;
        this.field1857 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1856 = new class129(var2);
    }
}
