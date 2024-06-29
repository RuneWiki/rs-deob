import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class220 extends class4 {

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public int field3408 = 0;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Z")
    public boolean field3413 = false;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lhi;")
    private class26 field3401 = new class26();

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    private int field3419 = 0;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Llh;")
    public class58 field3416 = new class58();

    @OriginalMember(owner = "client!te", name = "N", descriptor = "Z")
    private boolean field3424 = false;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    private int field3431 = 0;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[Lbm;")
    public class130[] field3403;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "J")
    private long field3398;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3406 = 0;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field3397 = 0;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Z")
    private static boolean field3411 = false;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lsb;")
    public static class131 field3407 = new class131(8);

    @OriginalMember(owner = "client!te", name = "E", descriptor = "[Z")
    private static boolean[] field3415 = new boolean[8];

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field3414 = 2;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    private static int field3417 = 0;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "[Z")
    private static boolean[] field3418 = new boolean[8];

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "J")
    public long field3402;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "J")
    private long field3410;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lhi;")
    private static class26 field3405;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[Lbm;")
    public static class130[] field3404;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
    public static final void method1430(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Leb;Z[I[I[I)V")
    private final void method1431(class35[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3415[var6] = false;
        }
        label82: for (class145 var7 = (class145) this.field3401.method167(-16992); var7 != null; var7 = (class145) this.field3401.method170((byte) 28)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field1987) {
                        field3415[var12] = true;
                        var7.field1991 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field1993 == 0) {
                    var7.method20(false);
                    this.field3419--;
                } else {
                    var7.field1991 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field3419 != 8; var8++) {
            if (!field3415[var8]) {
                class145 var9 = new class145(arg0[var8], this, this.field3402);
                this.field3401.method169(var9, 64);
                this.field3419++;
                field3415[var8] = true;
            }
        }
        for (class145 var10 = (class145) this.field3401.method167(-16992); var10 != null; var10 = (class145) this.field3401.method170((byte) 28)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field3415[var11] && arg0[var11] == var10.field1987) {
                    var10.method905(arg4[var10.field1987.field526], arg2[var10.field1987.field525], 1134303504, arg4[var10.field1987.field528], arg3[var10.field1987.field526], arg2[var10.field1987.field526], arg3[var10.field1987.field525], arg3[var10.field1987.field528], arg2[var10.field1987.field528], arg4[var10.field1987.field525]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)V")
    private final void method1432(int arg0, int arg1) {
        for (class134 var3 = (class134) this.field3416.method369((byte) -81); var3 != null; var3 = (class134) this.field3416.method362(false)) {
            var3.field1853 = this.field3422 + var3.field1848;
            var3.field1852 = this.field3432 + var3.field1855;
            var3.field1851 = this.field3427 + var3.field1841;
            if (this.field3421 == 0) {
                var3.field1854 = var3.field1844.field791.field4715;
                var3.field1850 = var3.field1844.field791.field4700;
            } else {
                int var4 = var3.field1844.field791.field4715;
                int var5 = var3.field1844.field791.field4700;
                var3.field1854 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field1850 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
    public static void method1433() {
        field3405 = null;
        field3404 = null;
        field3407 = null;
        field3415 = null;
        field3418 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()V")
    public static final void method1434() {
        field3407 = new class131(8);
        field3417 = 0;
        for (class220 var0 = (class220) field3405.method167(-16992); var0 != null; var0 = (class220) field3405.method170((byte) 28)) {
            var0.method1444();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(J)V")
    public static final void method1435(long arg0) {
        field3397 = field3412;
        field3399 = 0;
        field3412 = 0;
        long var2 = class299.method2006(9594);
        for (class220 var4 = (class220) field3405.method167(-16992); var4 != null; var4 = (class220) field3405.method170((byte) 28)) {
            if (var4.method1437(arg0)) {
                field3399++;
            }
        }
        if (field3411 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field3405.method171(-24626) + ", running: " + field3399 + ". Particles: " + field3412 + ". Time taken: " + (class299.method2006(9594) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lnh;)V")
    public static final void method1436(class305 arg0) {
        field3406 = 0;
        field3409 = 0;
        field3405 = new class26();
        field3404 = new class130[1024];
        class281.method1823(arg0, (byte) -6);
        class116.method741(2, arg0);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(J)Z")
    private final boolean method1437(long arg0) {
        long var3;
        if (this.field3398 > this.field3410) {
            var3 = this.field3398;
        } else {
            var3 = this.field3410;
        }
        int var5 = (int) (this.field3402 - var3);
        if (var5 > 750) {
            this.method1444();
            return false;
        }
        if (this.field3410 > 0L) {
            this.field3433 = this.field3422 - (this.field3434 << 6) >> 7;
            this.field3428 = ((this.field3434 << 6) + this.field3422 >> 7) - 1;
            this.field3423 = this.field3427 - (this.field3420 << 6) >> 7;
            this.field3425 = ((this.field3420 << 6) + this.field3427 >> 7) - 1;
            this.field3426 = this.field3432;
            if (this.field3430 < 3) {
                this.field3429 = class185.field2812[this.field3430 + 1][this.field3433][this.field3423] + class185.field2812[this.field3430 + 1][this.field3428][this.field3423] + class185.field2812[this.field3430 + 1][this.field3433][this.field3425] + class185.field2812[this.field3430 + 1][this.field3428][this.field3425] >> 2;
            } else {
                this.field3429 = this.field3426 - 1024;
            }
            int var6 = class118.field1697[this.field3421];
            int var7 = class118.field1690[this.field3421];
            this.method1432(var6, var7);
            if (this.field3424) {
                class145 var8 = (class145) this.field3401.method167(-16992);
                while (true) {
                    if (var8 == null) {
                        this.field3424 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2004.field3977; var9++) {
                        var8.method907(1, true, this.field3402, var7, -47, var6);
                    }
                    var8 = (class145) this.field3401.method170((byte) 28);
                }
            }
            int var10 = (int) (arg0 - this.field3402);
            for (class145 var11 = (class145) this.field3401.method167(-16992); var11 != null; var11 = (class145) this.field3401.method170((byte) 28)) {
                var11.method907(var10, var5 < 10, arg0, var7, -59, var6);
            }
        }
        this.field3402 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V")
    public final void method1438() {
        this.field3424 = true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
    public final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1442(arg0, arg1, class272.field4343 + arg2, class191.field2892 + arg3, class107.field1525 + arg4);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()I")
    public final int method1440() {
        if (this.field3433 == this.field3428 && this.field3425 == this.field3423) {
            return 92;
        }
        int var1 = this.field3433 << 7;
        int var2 = (this.field3428 << 7) + 128;
        int var3 = this.field3423 << 7;
        int var4 = (this.field3425 << 7) + 128;
        int var5 = this.field3422 - var1;
        int var6 = var2 - this.field3422;
        if (var5 > var6) {
            int var7 = this.field3427 - var3;
            int var8 = var4 - this.field3427;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field3427 - var3;
            int var10 = var4 - this.field3427;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "()I")
    public static final int method1441() {
        return field3414;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIII)V")
    public final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3413) {
            return;
        }
        if (this.field3421 != arg0) {
            for (class145 var6 = (class145) this.field3401.method167(-16992); var6 != null; var6 = (class145) this.field3401.method170((byte) 28)) {
                var6.field1986 = true;
            }
        }
        this.field3410 = this.field3402;
        this.field3421 = arg0;
        this.field3430 = arg1;
        this.field3422 = arg2;
        this.field3432 = arg3;
        this.field3427 = arg4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Leb;[Loe;Z[I[I[I)V")
    public final void method1443(class35[] arg0, class57[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field3413) {
            this.method1431(arg0, arg2, arg3, arg4, arg5);
            this.method1446(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "()V")
    public final void method1444() {
        this.field3413 = true;
        for (class134 var1 = (class134) this.field3416.method369((byte) -82); var1 != null; var1 = (class134) this.field3416.method362(false)) {
            if (var1.field1844.field791.field4699 == 1) {
                var1.method819((byte) -12);
            }
        }
        this.field3403 = new class130[8192];
        this.field3408 = 0;
        this.field3401 = new class26();
        this.field3419 = 0;
        this.field3416 = new class58();
        this.field3431 = 0;
        this.method20(false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method1445(int arg0) {
        field3414 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Loe;Z[I[I[I)V")
    private final void method1446(class57[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3418[var6] = false;
        }
        label91: for (class134 var7 = (class134) this.field3416.method369((byte) -94); var7 != null; var7 = (class134) this.field3416.method362(false)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field1844) {
                        field3418[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method962(128);
                this.field3431--;
                if (var7.method820(-127)) {
                    var7.method819((byte) -12);
                    field3417--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field3431 != 8; var8++) {
            if (!field3418[var8]) {
                class134 var9 = null;
                if (arg0[var8].field791.field4699 == 1 && field3417 < 32) {
                    var9 = new class134(arg0[var8], this);
                    field3407.method835(var9, (long) arg0[var8].field791.field4706, true);
                    field3417++;
                }
                if (var9 == null) {
                    var9 = new class134(arg0[var8], this);
                }
                this.field3416.method370((byte) -22, var9);
                this.field3431++;
                field3418[var8] = true;
            }
        }
        for (class134 var10 = (class134) this.field3416.method369((byte) -76); var10 != null; var10 = (class134) this.field3416.method362(false)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field3418[var11] && arg0[var11] == var10.field1844) {
                    var10.method843((byte) -103, arg2[var10.field1844.field793], arg4[var10.field1844.field793], arg3[var10.field1844.field793]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(III)V")
    public class220(int arg0, int arg1, int arg2) {
        this.field3434 = arg1;
        this.field3420 = arg2;
        this.field3403 = new class130[8192];
        this.field3398 = (long) arg0;
        this.field3424 = true;
        field3405.method169(this, 64);
    }

    static {
        new class215(131056);
    }
}
