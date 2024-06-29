import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class389 {

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "[I")
    private int[] field5815 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Llr;")
    public static class311 field5816 = new class311(7500);

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "Ldc;")
    public static class302 field5826 = new class302();

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "Lrba;")
    public static class102 field5824;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Lqi;")
    public class621 field5814;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
    private int[] field5810;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "[S")
    private short[] field5811;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "[S")
    private short[] field5818;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "[S")
    private short[] field5820;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "[S")
    private short[] field5825;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lak;", line = 9)
    public final class677 method2395(byte arg0) {
        field5822++;
        if (this.field5810 == null) {
            return null;
        }
        class677[] var2 = new class677[this.field5810.length];
        class295 var3 = this.field5814.field8988;
        synchronized (this.field5814.field8988) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field5810.length) {
                    int var5 = 95 % ((arg0 + 40) / 48);
                    break;
                }
                var2[var4] = class177.method1208(-29831, this.field5810[var4], this.field5814.field8988, 0);
                var4++;
            }
        }
        for (int var6 = 0; var6 < this.field5810.length; var6++) {
            if (var2[var6].field9563 < 13) {
                var2[var6].method3807(0, 2);
            }
        }
        class677 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class677(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field5811 != null) {
            for (int var8 = 0; var8 < this.field5811.length; var8++) {
                var7.method3797(this.field5811[var8], 13174, this.field5825[var8]);
            }
        }
        if (this.field5820 != null) {
            for (int var9 = 0; var9 < this.field5820.length; var9++) {
                var7.method3803(0, this.field5820[var9], this.field5818[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIBII)V", line = 84)
    public static final void method2396(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5812++;
        if (arg0 == arg1) {
            class201.method1304(arg1, arg4, arg5, 25221, arg2);
            return;
        }
        if (class175.field2455 <= (arg4 - arg1) && class375.field5631 >= arg1 + arg4 && (arg2 - arg0) >= class323.field4704 && (arg0 + arg2) <= class148.field2106) {
            class49.method296(arg2, arg4, arg5, arg0, true, arg1);
        } else {
            class295.method1821(arg5, arg2, 119, arg0, arg4, arg1);
        }
        if (arg3 > -114) {
            field5826 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 108)
    public static void method2397(byte arg0) {
        field5826 = null;
        if (arg0 != 118) {
            method2396(-15, 119, 41, (byte) 121, 1, -51);
        }
        field5816 = null;
        field5824 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)Z", line = 126)
    public final boolean method2398(int arg0) {
        if (arg0 < 20) {
            return false;
        }
        field5813++;
        if (this.field5810 == null) {
            return true;
        }
        boolean var2 = true;
        class295 var3 = this.field5814.field8988;
        synchronized (this.field5814.field8988) {
            for (int var4 = 0; var4 < this.field5810.length; var4++) {
                if (!this.field5814.field8988.method1843((byte) 119, this.field5810[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lgk;Z)V", line = 163)
    public final void method2399(class540 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                if (!arg1) {
                    field5826 = null;
                }
                field5809++;
                return;
            }
            this.method2402(arg0, -126, var3);
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)Lak;", line = 185)
    public final class677 method2400(byte arg0) {
        field5819++;
        class677[] var2 = new class677[5];
        int var3 = 0;
        if (arg0 <= 13) {
            field5816 = null;
        }
        class295 var4 = this.field5814.field8988;
        synchronized (this.field5814.field8988) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field5815[var5] != -1) {
                    var2[var3++] = class177.method1208(-29831, this.field5815[var5], this.field5814.field8988, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field9563 < 13) {
                var2[var6].method3807(0, 2);
            }
        }
        class677 var7 = new class677(var2, var3);
        if (this.field5811 != null) {
            for (int var8 = 0; var8 < this.field5811.length; var8++) {
                var7.method3797(this.field5811[var8], 13174, this.field5825[var8]);
            }
        }
        if (this.field5820 != null) {
            for (int var9 = 0; var9 < this.field5820.length; var9++) {
                var7.method3803(0, this.field5820[var9], this.field5818[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)Z", line = 254)
    public final boolean method2401(byte arg0) {
        field5817++;
        boolean var2 = true;
        if (arg0 != 112) {
            this.field5818 = null;
        }
        class295 var3 = this.field5814.field8988;
        synchronized (this.field5814.field8988) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field5815[var4] != -1 && !this.field5814.field8988.method1843((byte) 120, this.field5815[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lgk;II)V", line = 283)
    private final void method2402(class540 arg0, int arg1, int arg2) {
        int var4 = -40 % ((-arg1 - 68) / 40);
        field5823++;
        if (arg2 == 1) {
            arg0.method3115(29871);
        } else if (arg2 == 2) {
            int var9 = arg0.method3115(29871);
            this.field5810 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5810[var10] = arg0.method3169(26488);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var5 = arg0.method3115(29871);
                this.field5811 = new short[var5];
                this.field5825 = new short[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field5811[var6] = (short) arg0.method3169(26488);
                    this.field5825[var6] = (short) arg0.method3169(26488);
                }
                return;
            }
            if (arg2 == 41) {
                int var7 = arg0.method3115(29871);
                this.field5820 = new short[var7];
                this.field5818 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field5820[var8] = (short) arg0.method3169(26488);
                    this.field5818[var8] = (short) arg0.method3169(26488);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field5815[arg2 - 60] = arg0.method3169(26488);
                return;
            }
            return;
        }
    }
}
