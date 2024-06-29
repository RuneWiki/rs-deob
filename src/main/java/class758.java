import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class758 {

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    private int field10550 = 0;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field10543;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[Ltq;")
    public class626[] field10537;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Lmp;")
    public static class758 field10539 = new class758(64);

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field10544;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field10545;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "J")
    private long field10541;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "Ltq;")
    private class626 field10542;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "Ltq;")
    private class626 field10554;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Ltq;)I")
    public final int method4201(int arg0, class626[] arg1) {
        field10538++;
        int var3 = 0;
        if (arg0 <= 101) {
            this.field10550 = 115;
        }
        for (int var4 = 0; var4 < this.field10543; var4++) {
            class626 var5 = this.field10537[var4];
            for (class626 var6 = var5.field8990; var6 != var5; var6 = var6.field8990) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method4202(int arg0) {
        field10539 = null;
        if (arg0 != 0) {
            method4213();
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZJ)Ltq;")
    public final class626 method4203(boolean arg0, long arg1) {
        if (!arg0) {
            return null;
        }
        this.field10541 = arg1;
        field10548++;
        class626 var4 = this.field10537[(int) ((long) (this.field10543 - 1) & arg1)];
        for (this.field10542 = var4.field8990; this.field10542 != var4; this.field10542 = this.field10542.field8990) {
            if (this.field10542.field8991 == arg1) {
                class626 var5 = this.field10542;
                this.field10542 = this.field10542.field8990;
                return var5;
            }
        }
        this.field10542 = null;
        return null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public final void method4204(byte arg0) {
        int var2 = 125 % ((33 - arg0) / 32);
        for (int var3 = 0; var3 < this.field10543; var3++) {
            class626 var4 = this.field10537[var3];
            while (true) {
                class626 var5 = var4.field8990;
                if (var4 == var5) {
                    break;
                }
                var5.method3617(1);
            }
        }
        field10547++;
        this.field10554 = null;
        this.field10542 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
    public static final void method4205(int arg0, int arg1) {
        field10545++;
        class354 var2 = class501.method3012(arg1, arg0, 2145997216);
        var2.method2216(0);
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)I")
    public final int method4206(int arg0) {
        field10540++;
        if (arg0 != -1) {
            this.method4209(false);
        }
        return this.field10543;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Ltq;")
    public final class626 method4207(int arg0) {
        field10546++;
        if (this.field10550 > 0 && this.field10537[this.field10550 - 1] != this.field10554) {
            class626 var2 = this.field10554;
            this.field10554 = var2.field8990;
            return var2;
        }
        while (this.field10543 > this.field10550) {
            class626 var3 = this.field10537[this.field10550++].field8990;
            if (this.field10537[this.field10550 - 1] != var3) {
                this.field10554 = var3.field8990;
                return var3;
            }
        }
        return arg0 == 9356 ? null : null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)I")
    public final int method4208(boolean arg0) {
        field10551++;
        int var2 = 0;
        int var3 = 0;
        if (arg0) {
            return 14;
        }
        while (var3 < this.field10543) {
            class626 var4 = this.field10537[var3];
            class626 var5 = var4.field8990;
            while (var4 != var5) {
                var5 = var5.field8990;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(I)V")
    public class758(int arg0) {
        this.field10543 = arg0;
        this.field10537 = new class626[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class626 var3 = this.field10537[var2] = new class626();
            var3.field8989 = var3;
            var3.field8990 = var3;
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(Z)Ltq;")
    public final class626 method4209(boolean arg0) {
        this.field10550 = 0;
        if (arg0) {
            return null;
        } else {
            field10549++;
            return this.method4207(9356);
        }
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)Ltq;")
    public final class626 method4210(int arg0) {
        field10552++;
        if (this.field10542 == null) {
            return null;
        }
        if (arg0 >= -125) {
            this.field10554 = null;
        }
        class626 var2 = this.field10537[(int) (this.field10541 & (long) (this.field10543 - 1))];
        while (this.field10542 != var2) {
            if (this.field10542.field8991 == this.field10541) {
                class626 var3 = this.field10542;
                this.field10542 = this.field10542.field8990;
                return var3;
            }
            this.field10542 = this.field10542.field8990;
        }
        this.field10542 = null;
        return null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ltq;BJ)V")
    public final void method4211(class626 arg0, byte arg1, long arg2) {
        if (arg0.field8989 != null) {
            arg0.method3617(1);
        }
        field10553++;
        class626 var5 = this.field10537[(int) ((long) (this.field10543 - 1) & arg2)];
        arg0.field8989 = var5.field8989;
        arg0.field8990 = var5;
        arg0.field8989.field8990 = arg0;
        arg0.field8991 = arg2;
        if (arg1 <= 10) {
            this.field10543 = 90;
        }
        arg0.field8990.field8989 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIILjava/lang/String;Lha;I)V")
    public static final void method4212(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, class58 arg6, int arg7) {
        field10544++;
        if (class118.field1859 == null || class427.field5963 == null) {
            if (class501.field7161.method1472(-25711, class534.field7544) && class501.field7161.method1472(-25711, class158.field2365)) {
                class118.field1859 = arg6.method637(class55.method502(class501.field7161, class534.field7544, 0), true);
                class55 var8 = class55.method502(class501.field7161, class158.field2365, 0);
                class427.field5963 = arg6.method637(var8, true);
                var8.method504();
                class512.field7314 = arg6.method637(var8, true);
            } else {
                arg6.method630(arg2, arg7, arg0, arg4, 255 - class78.field1467 << 24 | class668.field9371, 1);
            }
        }
        if (class118.field1859 != null && class427.field5963 != null) {
            int var9 = (arg0 - (class427.field5963.method93() * 2)) / class118.field1859.method93();
            for (int var10 = 0; var10 < var9; var10++) {
                class118.field1859.method4135(arg2 - (-class427.field5963.method93() - class118.field1859.method93() * var10), arg7);
            }
            class427.field5963.method4135(arg2, arg7);
            class512.field7314.method4135(arg2 + (arg0 - class512.field7314.method93()), arg7);
        }
        class537.field7568.method665(arg7 + 14, arg5, -1, arg2 + 3, arg1 ^ 0xFFA50A, class92.field1615 | 0xFF000000);
        if (arg1 != -23286) {
            field10539 = null;
        }
        arg6.method630(arg2, arg4 + arg7, arg0, arg3 - arg4, class668.field9371 | -class78.field1467 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V")
    public static final void method4213() {
        class349.method2197(1, class749.field10470);
    }
}
