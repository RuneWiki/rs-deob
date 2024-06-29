import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class575 extends class413 {

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "Lqw;")
    public class84 field7833 = new class84();

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "Ldp;")
    public class3 field7839 = new class3();

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "Ltga;")
    private class64 field7836;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "Ljb;")
    public static class519 field7835 = new class519(113, 6);

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "Ljb;")
    public static class519 field7840 = new class519(19, -1);

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 3)
    public final void method17(int arg0) {
        this.field7839.method17(arg0);
        field7830++;
        for (class518 var2 = (class518) this.field7833.method679((byte) -86); var2 != null; var2 = (class518) this.field7833.method681(-75)) {
            if (!this.field7836.method395(var2, true)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field7215) {
                        this.method3262(var3, var2, (byte) 77);
                        var2.field7215 -= var3;
                        break;
                    }
                    this.method3262(var2.field7215, var2, (byte) 114);
                    var3 -= var2.field7215;
                } while (!this.field7836.method394(var3, 0, 101, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILew;B)V", line = 39)
    private final void method3262(int arg0, class518 arg1, byte arg2) {
        field7832++;
        if (arg2 < 66) {
            this.field7833 = null;
        }
        if ((this.field7836.field876[arg1.field7197] & 0x4) != 0 && arg1.field7212 < 0) {
            int var4 = this.field7836.field819[arg1.field7197] / class624.field8419;
            int var5 = (var4 + 1048575 - arg1.field7195) / var4;
            arg1.field7195 = arg0 * var4 + arg1.field7195 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field7836.field853[arg1.field7197] == 0) {
                    arg1.field7211 = class296.method1925(arg1.field7217, arg1.field7211.method1910(), arg1.field7211.method1906(), arg1.field7211.method1939());
                } else {
                    arg1.field7211 = class296.method1925(arg1.field7217, arg1.field7211.method1910(), 0, arg1.field7211.method1939());
                    this.field7836.method411(arg1.field7199.field7877[arg1.field7216] < 0, arg1, (byte) -78);
                }
                if (arg1.field7199.field7877[arg1.field7216] < 0) {
                    arg1.field7211.method1907(-1);
                }
                arg0 = arg1.field7195 / var4;
            }
        }
        arg1.field7211.method17(arg0);
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "()I", line = 84)
    public final int method24() {
        field7834++;
        return 0;
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "()Lpp;", line = 92)
    public final class413 method15() {
        field7837++;
        class518 var1 = (class518) this.field7833.method679((byte) -86);
        if (var1 == null) {
            return null;
        } else if (var1.field7211 == null) {
            return this.method13();
        } else {
            return var1.field7211;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "()Lpp;", line = 109)
    public final class413 method13() {
        field7838++;
        class518 var1;
        do {
            var1 = (class518) this.field7833.method681(-88);
            if (var1 == null) {
                return null;
            }
        } while (var1.field7211 == null);
        return var1.field7211;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "([III)V", line = 129)
    public final void method18(int[] arg0, int arg1, int arg2) {
        field7831++;
        this.field7839.method18(arg0, arg1, arg2);
        for (class518 var4 = (class518) this.field7833.method679((byte) -86); var4 != null; var4 = (class518) this.field7833.method681(-115)) {
            if (!this.field7836.method395(var4, true)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field7215 >= var6) {
                        this.method3263(var5 + var6, var6, var4, (byte) -95, var5, arg0);
                        var4.field7215 -= var6;
                        break;
                    }
                    this.method3263(var5 + var6, var4.field7215, var4, (byte) -85, var5, arg0);
                    var6 -= var4.field7215;
                    var5 += var4.field7215;
                } while (!this.field7836.method394(var6, var5, -11, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Ltga;)V", line = 254)
    public class575(class64 arg0) {
        this.field7836 = arg0;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILew;BI[I)V", line = 176)
    private final void method3263(int arg0, int arg1, class518 arg2, byte arg3, int arg4, int[] arg5) {
        if ((this.field7836.field876[arg2.field7197] & 0x4) != 0 && arg2.field7212 < 0) {
            int var7 = this.field7836.field819[arg2.field7197] / class624.field8419;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field7195) / var7;
                if (arg1 < var8) {
                    arg2.field7195 += arg1 * var7;
                    break;
                }
                arg2.field7211.method18(arg5, arg4, var8);
                arg2.field7195 += var7 * var8 - 1048576;
                arg1 -= var8;
                arg4 += var8;
                int var9 = class624.field8419 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class296 var11 = arg2.field7211;
                if (this.field7836.field853[arg2.field7197] == 0) {
                    arg2.field7211 = class296.method1925(arg2.field7217, var11.method1910(), var11.method1906(), var11.method1939());
                } else {
                    arg2.field7211 = class296.method1925(arg2.field7217, var11.method1910(), 0, var11.method1939());
                    this.field7836.method411(arg2.field7199.field7877[arg2.field7216] < 0, arg2, (byte) -106);
                    arg2.field7211.method1937(var9, var11.method1906());
                }
                if (arg2.field7199.field7877[arg2.field7216] < 0) {
                    arg2.field7211.method1907(-1);
                }
                var11.method1911(var9);
                var11.method18(arg5, arg4, arg0 - arg4);
                if (var11.method1922()) {
                    this.field7839.method21(var11);
                }
            }
        }
        if (arg3 <= -13) {
            field7829++;
            arg2.field7211.method18(arg5, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V", line = 238)
    public static void method3264(int arg0) {
        int var1 = -18 % ((-arg0 - 32) / 48);
        field7835 = null;
        field7840 = null;
    }
}
