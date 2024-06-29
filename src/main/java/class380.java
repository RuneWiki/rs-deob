import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class380 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "J")
    public static long field5398 = -1L;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "F")
    public static float field5401;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    private int field5404;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public final void method2419(int arg0) {
        this.field5403 &= 0x3FFF;
        field5396++;
        if (arg0 >= 0) {
            this.field5403 = -109;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lbr;ZI)V")
    public static final void method2420(class223 arg0, boolean arg1, int arg2) {
        field5399++;
        int var3 = arg0.field3186 == 0 ? arg0.field3250 : arg0.field3186;
        int var4 = arg0.field3289 == arg2 ? arg0.field3282 : arg0.field3289;
        class83.method486(var4, false, arg1, arg0.field3227, var3, class186.field2657[arg0.field3227 >> 16]);
        if (arg0.field3246 != null) {
            class83.method486(var4, false, arg1, arg0.field3227, var3, arg0.field3246);
        }
        class253 var5 = (class253) class318.field4662.method1373((long) arg0.field3227, -31);
        if (var5 != null) {
            class125.method750(arg1, -1, var5.field3746, var3, var4);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public final void method2421(int arg0, int arg1) {
        this.field5404 = 0;
        field5405++;
        this.field5403 = arg1;
        if (arg0 != 15789) {
            this.method2419(2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ltj;Ltj;ILtj;Lmn;)Z")
    public static final boolean method2422(class108 arg0, class108 arg1, int arg2, class108 arg3, class206 arg4) {
        class213.field3014 = arg4;
        field5400++;
        class323.field4704 = arg1;
        class390.field5484 = arg0;
        class181.field2548 = arg3;
        return arg2 == 2744;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
    public static final void method2423(byte arg0, int arg1) {
        field5406++;
        int var2 = 71 % ((arg0 + 36) / 36);
        class24.field305.method91(4, arg1);
        class381.field5408.method91(4, arg1);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static final void method2424(int arg0) {
        class70.field933.method193((byte) -112);
        field5395++;
        for (int var1 = 0; var1 < 32; var1++) {
            class355.field5141[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class235.field3464[var2] = 0L;
        }
        class355.field5144 = 0;
        if (arg0 != 9356) {
            method2420((class223) null, false, -40);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)Z")
    public final boolean method2425(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -6543) {
            field5401 = 0.8714083F;
        }
        field5402++;
        int var5 = this.field5404;
        if (this.field5403 == arg1 && this.field5404 == 0) {
            return false;
        }
        boolean var8;
        if (this.field5404 == 0) {
            if (this.field5403 < arg1 && (this.field5403 + arg2) >= arg1 || arg1 < this.field5403 && arg1 >= this.field5403 - arg2) {
                this.field5403 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field5404 > 0 && arg1 > this.field5403) {
            int var6 = this.field5404 * this.field5404 / (arg2 * 2);
            int var7 = this.field5403 + var6;
            if (var7 < arg1 && var7 >= this.field5403) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field5404 < 0 && arg1 < this.field5403) {
            int var9 = this.field5404 * this.field5404 / (arg2 * 2);
            int var10 = this.field5403 - var9;
            if (var10 > arg1 && var10 <= this.field5403) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg1 <= this.field5403) {
                this.field5404 -= arg2;
                if (arg0 != 0 && this.field5404 < -arg0) {
                    this.field5404 = -arg0;
                }
            } else {
                this.field5404 += arg2;
                if (arg0 != 0 && arg0 < this.field5404) {
                    this.field5404 = arg0;
                }
            }
            if (this.field5404 != var5) {
                int var11 = this.field5404 * this.field5404 / (arg2 * 2);
                if (arg1 > this.field5403) {
                    if ((this.field5403 + var11) > arg1) {
                        this.field5404 = var5;
                    }
                } else if (arg1 < this.field5403 && (this.field5403 - var11) < arg1) {
                    this.field5404 = var5;
                }
            }
        } else if (this.field5404 > 0) {
            this.field5404 -= arg2;
            if (this.field5404 < 0) {
                this.field5404 = 0;
            }
        } else {
            this.field5404 += arg2;
            if (this.field5404 > 0) {
                this.field5404 = 0;
            }
        }
        this.field5403 += this.field5404 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)I")
    public final int method2426(int arg0) {
        field5397++;
        int var2 = 37 % ((-arg0 - 26) / 51);
        return this.field5403 & 0x3FFF;
    }
}
