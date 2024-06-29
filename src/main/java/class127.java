import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class127 extends class92 {

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
    private int field2534 = 0;

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "Z")
    private boolean field2538 = false;

    @OriginalMember(owner = "client!o", name = "Bb", descriptor = "I")
    private int field2544 = 0;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!o", name = "Gb", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    private int field2527;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    private int field2523;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "I")
    public int field2536;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!o", name = "Hb", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!o", name = "Ab", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!o", name = "Fb", descriptor = "Lwf;")
    private class205 field2548;

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "Ltd;")
    public static class176 field2539 = new class176(5);

    @OriginalMember(owner = "client!o", name = "xb", descriptor = "[Led;")
    public static class43[] field2540 = new class43[100];

    @OriginalMember(owner = "client!o", name = "Db", descriptor = "Led;")
    public static class43 field2546 = class191.method1219("blinken1:", false);

    @OriginalMember(owner = "client!o", name = "X", descriptor = "D")
    public double field2514;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "D")
    private double field2515;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "D")
    private double field2520;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "D")
    private double field2525;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "D")
    private double field2529;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "D")
    public double field2530;

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "D")
    public double field2537;

    @OriginalMember(owner = "client!o", name = "Cb", descriptor = "D")
    private double field2545;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    private int field2519;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!o", name = "yb", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!o", name = "Eb", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(IB)V")
    public final void method815(int arg0, byte arg1) {
        this.field2538 = true;
        int var3 = 61 % ((80 - arg1) / 41);
        this.field2530 += (double) arg0 * this.field2529;
        this.field2537 += (double) arg0 * this.field2525;
        field2533++;
        this.field2514 += this.field2545 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2515;
        this.field2515 += (double) arg0 * this.field2545;
        this.field2517 = (int) (Math.atan2(this.field2529, this.field2525) * 325.949D) + 1024 & 0x7FF;
        this.field2519 = (int) (Math.atan2(this.field2515, this.field2520) * 325.949D) & 0x7FF;
        if (this.field2548 == null) {
            return;
        }
        this.field2544 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2548.field3991[this.field2534] >= this.field2544) {
                        return;
                    }
                    this.field2544 -= this.field2548.field3991[this.field2534];
                    this.field2534++;
                } while (this.field2548.field3996.length > this.field2534);
                this.field2534 -= this.field2548.field4006;
            } while (this.field2534 >= 0 && this.field2534 < this.field2548.field3996.length);
            this.field2534 = 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIIII)V")
    public final void method816(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2538) {
            double var6 = (double) (arg4 - this.field2523);
            double var8 = (double) (arg3 - this.field2531);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2514 = this.field2527;
            this.field2537 = (double) this.field2543 * var8 / var10 + (double) this.field2531;
            this.field2530 = (double) this.field2543 * var6 / var10 + (double) this.field2523;
        }
        double var12 = (double) (this.field2518 + arg2 - arg0);
        this.field2525 = ((double) arg3 - this.field2537) / var12;
        this.field2529 = ((double) arg4 - this.field2530) / var12;
        this.field2520 = Math.sqrt(this.field2529 * this.field2529 + this.field2525 * this.field2525);
        field2547++;
        if (!this.field2538) {
            this.field2515 = -this.field2520 * Math.tan((double) this.field2535 * 0.02454369D);
        }
        this.field2545 = ((double) arg1 - this.field2514 - this.field2515 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public static void method817(boolean arg0) {
        field2540 = null;
        field2546 = null;
        if (arg0) {
            field2540 = null;
        }
        field2539 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    public static int method818(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Lcg;")
    public static final class28 method819(int arg0, int arg1) {
        field2516++;
        class28 var2 = (class28) class30.field568.method1106(100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 61 / ((arg0 - 36) / 53);
        byte[] var4 = class206.field4036.method367(3, arg1, (byte) -34);
        class28 var5 = new class28();
        if (var4 != null) {
            var5.method135(true, new class89(var4));
        }
        class30.field568.method1107((long) arg1, var5, -106);
        return var5;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)Lwe;")
    public static final class204 method820(int arg0, int arg1) {
        field2521++;
        class204 var2 = (class204) class71.field1399.method1106(100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class128.field2553.method367(arg1, 0, (byte) -34);
        if (var3 == null) {
            return null;
        }
        class204 var4 = new class204();
        class89 var5 = new class89(var3);
        var5.field1727 = var5.field1769.length - 12;
        int var6 = var5.method545(-7436);
        int var7 = 0;
        var4.field3981 = var5.method555(-1113627096);
        var4.field3968 = var5.method555(-1113627096);
        var4.field3973 = var5.method555(-1113627096);
        var4.field3978 = var5.method555(-1113627096);
        var5.field1727 = 0;
        var4.field3969 = var5.method562(-97);
        var4.field3976 = new int[var6];
        var4.field3974 = new int[var6];
        var4.field3972 = new class43[var6];
        while (var5.field1727 < var5.field1769.length - 12) {
            int var8 = var5.method555(-1113627096);
            if (var8 == 3) {
                var4.field3972[var7] = var5.method541(936);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3974[var7] = var5.method538((byte) 110);
            } else {
                var4.field3974[var7] = var5.method545(-7436);
            }
            var4.field3976[var7++] = var8;
        }
        if (arg0 <= 39) {
            method819(65, 91);
        }
        class71.field1399.method1107((long) arg1, var4, 25);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)Lw;")
    public final class199 method593(int arg0) {
        class194 var2 = class16.method70(-1, this.field2549);
        if (arg0 != 6) {
            this.field2517 = 80;
        }
        field2541++;
        class199 var3 = var2.method1237(-115, this.field2534);
        if (var3 == null) {
            return null;
        } else {
            var3.method1300(this.field2519);
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)I")
    public static final int method821(int arg0, byte arg1, int arg2) {
        class174 var3 = (class174) class90.field1792.method75((long) arg2, -70);
        field2528++;
        if (var3 == null) {
            return 0;
        } else {
            int var4 = -46 % ((60 - arg1) / 34);
            return arg0 >= 0 && var3.field3468.length > arg0 ? var3.field3468[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BI)[B")
    public static final byte[] method822(byte[] arg0, int arg1) {
        if (arg1 != -24334) {
            return null;
        }
        field2526++;
        class89 var2 = new class89(arg0);
        int var3 = var2.method538((byte) -66);
        int var4 = var2.method545(-7436);
        if (var4 < 0 || class191.field3720 != 0 && var4 > class191.field3720) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method534(0, var4, 31070, var5);
            return var5;
        } else {
            int var6 = var2.method545(-7436);
            if (var6 < 0 || class191.field3720 != 0 && var6 > class191.field3720) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class190.method1211(var7, var6, arg0, var4, 9);
            } else {
                class52.field1049.method988(var2, var7, 31);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2522 = arg9;
        this.field2532 = arg10;
        this.field2549 = arg0;
        this.field2531 = arg3;
        this.field2527 = arg4;
        this.field2538 = false;
        this.field2523 = arg2;
        this.field2536 = arg1;
        this.field2535 = arg7;
        this.field2550 = arg5;
        this.field2543 = arg8;
        this.field2518 = arg6;
        int var12 = class16.method70(-1, this.field2549).field3781;
        if (var12 == -1) {
            this.field2548 = null;
        } else {
            this.field2548 = class175.method1101(var12, true);
        }
    }
}
