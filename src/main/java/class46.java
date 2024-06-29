import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class46 extends class42 {

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!hc", name = "wb", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!hc", name = "zb", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!hc", name = "tb", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "Lne;")
    private class85 field1021;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lae;")
    public static class6 field1020 = class64.method474(120, "::fpson");

    @OriginalMember(owner = "client!hc", name = "ub", descriptor = "Lae;")
    private static class6 field1036 = class64.method474(107, "Please wait)3)3)3");

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "Lae;")
    public static class6 field1030 = field1036;

    @OriginalMember(owner = "client!hc", name = "xb", descriptor = "Lae;")
    public static class6 field1039 = field1036;

    @OriginalMember(owner = "client!hc", name = "vb", descriptor = "Lae;")
    public static class6 field1037 = class64.method474(106, "mod_icons");

    @OriginalMember(owner = "client!hc", name = "sb", descriptor = "[I")
    public static int[] field1034 = new int[2000];

    @OriginalMember(owner = "client!hc", name = "qb", descriptor = "Lae;")
    public static class6 field1032 = class64.method474(125, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "Lae;")
    private static class6 field1024 = class64.method474(121, "yellow:");

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lae;")
    public static class6 field1025 = field1024;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!hc", name = "rb", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lq;")
    public static class101 field1026;

    @OriginalMember(owner = "client!hc", name = "yb", descriptor = "[I")
    public static int[] field1040;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V", line = 57)
    public static void method370(int arg0) {
        field1034 = null;
        field1025 = null;
        field1026 = null;
        field1020 = null;
        field1037 = null;
        if (arg0 < 13) {
            method370(47);
        }
        field1039 = null;
        field1040 = null;
        field1030 = null;
        field1036 = null;
        field1024 = null;
        field1032 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIIILr;I)V", line = 78)
    public static final void method371(byte arg0, int arg1, int arg2, int arg3, class107 arg4, int arg5) {
        field1033++;
        class96 var6 = new class96();
        var6.field2286 = arg3 * 128;
        var6.field2281 = arg1 * 128;
        if (arg0 >= -32) {
            return;
        }
        int var7 = arg4.field2546;
        var6.field2268 = arg4.field2509;
        var6.field2276 = arg5;
        var6.field2280 = arg4.field2554;
        var6.field2301 = arg4.field2515 * 128;
        var6.field2287 = arg4.field2542;
        var6.field2293 = arg4.field2525;
        int var8 = arg4.field2516;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg4.field2546;
            var7 = arg4.field2516;
        }
        var6.field2292 = (arg3 + var8) * 128;
        var6.field2288 = (arg1 + var7) * 128;
        if (arg4.field2559 != null) {
            var6.field2282 = arg4;
            var6.method799(-106);
        }
        class7.field155.method785((byte) 63, var6);
        if (var6.field2268 != null) {
            var6.field2296 = var6.field2280 + (int) ((double) (var6.field2293 - var6.field2280) * Math.random());
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)Lv;", line = 125)
    public final class131 method3(boolean arg0) {
        if (this.field1021 != null) {
            int var2 = class5.field61 - this.field1023;
            if (var2 > 100 && this.field1021.field2056 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field1021.field2043[this.field1018]) {
                            break label42;
                        }
                        var2 -= this.field1021.field2043[this.field1018];
                        this.field1018++;
                    } while (this.field1018 < this.field1021.field2049.length);
                    this.field1018 -= this.field1021.field2056;
                } while (this.field1018 >= 0 && this.field1018 < this.field1021.field2049.length);
                this.field1021 = null;
            }
            this.field1023 = class5.field61 - var2;
        }
        field1027++;
        class107 var3 = class80.method687(this.field1022, (byte) 121);
        if (var3.field2559 != null) {
            var3 = var3.method900(0);
        }
        if (arg0) {
            return var3 == null ? null : var3.method904(this.field1029, this.field1031, this.field1018, this.field1035, this.field1038, 105, this.field1041, this.field1021, this.field1019);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIZLgd;)V", line = 191)
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class42 arg9) {
        this.field1022 = arg0;
        this.field1031 = arg5;
        this.field1038 = arg4;
        this.field1029 = arg6;
        this.field1041 = arg2;
        this.field1035 = arg1;
        this.field1019 = arg3;
        if (arg7 != -1) {
            this.field1021 = class35.method314(arg7, (byte) 54);
            this.field1018 = 0;
            this.field1023 = class5.field61 - 1;
            if (this.field1021.field2042 == 0 && arg9 != null && arg9 instanceof class46) {
                class46 var11 = (class46) arg9;
                if (this.field1021 == var11.field1021) {
                    this.field1023 = var11.field1023;
                    this.field1018 = var11.field1018;
                    return;
                }
            }
            if (arg8 && this.field1021.field2056 != -1) {
                this.field1018 = (int) ((double) this.field1021.field2049.length * Math.random());
                this.field1023 -= (int) ((double) this.field1021.field2043[this.field1018] * Math.random());
                return;
            }
        }
    }
}
