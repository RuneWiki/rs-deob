import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class188 {

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    private int field2538 = 0;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[Lm;")
    public class189[] field2523;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "J")
    private long field2536;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lm;")
    private class189 field2534;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Lm;")
    private class189 field2537;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lm;")
    public final class189 method1174(int arg0) {
        field2525++;
        if (arg0 != 0) {
            method1182((byte) -41, null);
        }
        if (this.field2534 == null) {
            return null;
        }
        class189 var2 = this.field2523[(int) (this.field2536 & (long) (this.field2526 - 1))];
        while (this.field2534 != var2) {
            if (this.field2534.field2546 == this.field2536) {
                class189 var3 = this.field2534;
                this.field2534 = this.field2534.field2543;
                return var3;
            }
            this.field2534 = this.field2534.field2543;
        }
        this.field2534 = null;
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public final void method1175(byte arg0) {
        field2528++;
        if (arg0 < 67) {
            return;
        }
        for (int var2 = 0; var2 < this.field2526; var2++) {
            class189 var3 = this.field2523[var2];
            while (true) {
                class189 var4 = var3.field2543;
                if (var3 == var4) {
                    break;
                }
                var4.method1185(-31);
            }
        }
        this.field2537 = null;
        this.field2534 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)Lm;")
    public final class189 method1176(int arg0) {
        this.field2538 = 0;
        if (arg0 == 24490) {
            field2535++;
            return this.method1178((byte) 71);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I")
    public final int method1177(int arg0) {
        field2532++;
        int var2 = -113 % ((2 - arg0) / 34);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2526; var4++) {
            class189 var5 = this.field2523[var4];
            for (class189 var6 = var5.field2543; var6 != var5; var6 = var6.field2543) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Lm;")
    public final class189 method1178(byte arg0) {
        field2530++;
        if (this.field2538 > 0 && this.field2523[this.field2538 - 1] != this.field2537) {
            class189 var2 = this.field2537;
            this.field2537 = var2.field2543;
            return var2;
        }
        if (arg0 != 71) {
            this.method1175((byte) -104);
        }
        while (this.field2538 < this.field2526) {
            class189 var3 = this.field2523[this.field2538++].field2543;
            if (this.field2523[this.field2538 - 1] != var3) {
                this.field2537 = var3.field2543;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(JLm;B)V")
    public final void method1179(long arg0, class189 arg1, byte arg2) {
        if (arg1.field2545 != null) {
            arg1.method1185(arg2 - 16);
        }
        field2527++;
        if (arg2 != -26) {
            return;
        }
        class189 var5 = this.field2523[(int) (arg0 & (long) (this.field2526 - 1))];
        arg1.field2543 = var5;
        arg1.field2545 = var5.field2545;
        arg1.field2545.field2543 = arg1;
        arg1.field2546 = arg0;
        arg1.field2543.field2545 = arg1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BJ)Lm;")
    public final class189 method1180(byte arg0, long arg1) {
        field2531++;
        this.field2536 = arg1;
        class189 var4 = this.field2523[(int) ((long) (this.field2526 - 1) & arg1)];
        if (arg0 != 26) {
            this.field2538 = 88;
        }
        for (this.field2534 = var4.field2543; this.field2534 != var4; this.field2534 = this.field2534.field2543) {
            if (this.field2534.field2546 == arg1) {
                class189 var5 = this.field2534;
                this.field2534 = this.field2534.field2543;
                return var5;
            }
        }
        this.field2534 = null;
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([Lm;I)I")
    public final int method1181(class189[] arg0, int arg1) {
        field2529++;
        if (arg1 != -1) {
            this.field2526 = 88;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2526; var4++) {
            class189 var5 = this.field2523[var4];
            for (class189 var6 = var5.field2543; var6 != var5; var6 = var6.field2543) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLee;)Llaa;")
    public static final class119 method1182(byte arg0, class675 arg1) {
        if (arg0 != 57) {
            method1182((byte) 112, null);
        }
        field2524++;
        return new class119(arg1.method3706((byte) 66), arg1.method3706((byte) -123), arg1.method3706((byte) -88), arg1.method3706((byte) -84), arg1.method3756(false), arg1.method3756(false), arg1.method3750((byte) 35));
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)I")
    public final int method1183(int arg0) {
        if (arg0 != 0) {
            this.method1179(45L, null, (byte) -45);
        }
        field2533++;
        return this.field2526;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V")
    public class188(int arg0) {
        this.field2523 = new class189[arg0];
        this.field2526 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2523[var2] = new class189();
            var3.field2545 = var3;
            var3.field2543 = var3;
        }
    }
}
