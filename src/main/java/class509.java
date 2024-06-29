import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class509 extends class318 {

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "Z")
    private boolean field7691;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Z")
    private boolean field7690;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "Lke;")
    private class407 field7694;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public int field7701;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public int field7698;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "Z")
    public boolean field7707;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public int field7713;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
    public int field7697;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
    public int field7700;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public int field7709;

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
    private int field7717;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "I")
    public int field7703;

    @OriginalMember(owner = "client!lo", name = "V", descriptor = "I")
    private int field7721;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public int field7715;

    @OriginalMember(owner = "client!lo", name = "Z", descriptor = "I")
    public int field7725;

    @OriginalMember(owner = "client!lo", name = "X", descriptor = "I")
    public int field7723;

    @OriginalMember(owner = "client!lo", name = "bb", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!lo", name = "eb", descriptor = "I")
    public int field7730;

    @OriginalMember(owner = "client!lo", name = "fb", descriptor = "I")
    public int field7731;

    @OriginalMember(owner = "client!lo", name = "ab", descriptor = "Z")
    private boolean field7726;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!lo", name = "ib", descriptor = "I")
    private int field7734;

    @OriginalMember(owner = "client!lo", name = "gb", descriptor = "I")
    public int field7732;

    @OriginalMember(owner = "client!lo", name = "kb", descriptor = "I")
    private int field7736;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "Lrp;")
    private class288 field7712;

    @OriginalMember(owner = "client!lo", name = "lb", descriptor = "I")
    private int field7737;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "Lrp;")
    private class288 field7716;

    @OriginalMember(owner = "client!lo", name = "S", descriptor = "Ljr;")
    public class68 field7718;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "F")
    private float field7706;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "F")
    private float field7710;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    private int field7689;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
    public int field7702;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    public int field7704;

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
    public int field7705;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public int field7711;

    @OriginalMember(owner = "client!lo", name = "U", descriptor = "I")
    private int field7720;

    @OriginalMember(owner = "client!lo", name = "W", descriptor = "I")
    public int field7722;

    @OriginalMember(owner = "client!lo", name = "cb", descriptor = "I")
    public int field7728;

    @OriginalMember(owner = "client!lo", name = "db", descriptor = "I")
    public int field7729;

    @OriginalMember(owner = "client!lo", name = "hb", descriptor = "I")
    public int field7733;

    @OriginalMember(owner = "client!lo", name = "jb", descriptor = "I")
    public int field7735;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "Lig;")
    private class154 field7695;

    @OriginalMember(owner = "client!lo", name = "mb", descriptor = "Lig;")
    private class154 field7738;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "Lpr;")
    private class296 field7693;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7692;

    @OriginalMember(owner = "client!lo", name = "T", descriptor = "Z")
    public boolean field7719;

    @OriginalMember(owner = "client!lo", name = "Y", descriptor = "[I")
    public int[] field7724;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "[Lcg;")
    private class86[] field7699;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "()I")
    public final int method1960() {
        return 0;
    }

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "()V")
    private final void method3042() {
        for (int var1 = 0; var1 < this.field7722; ++var1) {
            this.field7699[var1].method609((byte) 4);
        }
        this.method1966();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(F)V")
    public final void method1995(float arg0) {
        this.field7727 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(IIII)V")
    public final void method1931(int arg0, int arg1, int arg2, int arg3) {
        this.field7735 = arg0;
        this.field7733 = arg1;
        this.field7700 = arg2;
        this.field7697 = arg3;
        this.method3043();
    }

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "()Z")
    public final boolean method1926() {
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "()F")
    public final float method1984() {
        return this.field7710;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
    public final void method1907(int arg0) {
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(IIII)V")
    public final void method1977(int arg0, int arg1, int arg2, int arg3) {
        this.field7715 = arg0;
        this.field7714 = arg1;
        this.field7725 = arg2;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([I)V")
    public final void method1936(int[] arg0) {
        arg0[0] = this.field7723;
        arg0[1] = this.field7731;
        arg0[2] = this.field7698;
        arg0[3] = this.field7703;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)V")
    public final void method1895(boolean arg0) {
    }

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "()V")
    public final void method1945() {
        this.field7716.method1761(-108);
    }

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "()F")
    public final float method1968() {
        return this.field7706;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(FFF)V")
    public final void method1933(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "()V")
    public final void method1954() {
    }

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "()Z")
    public final boolean method1934() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "()Z")
    public final boolean method1967() {
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "()V")
    private final void method3043() {
        this.field7696 = this.field7723 - this.field7735;
        this.field7702 = this.field7698 - this.field7735;
        this.field7704 = this.field7731 - this.field7733;
        this.field7705 = this.field7703 - this.field7733;
        for (int var1 = 0; var1 < this.field7722; ++var1) {
            class210 var5 = this.field7699[var1].field1441;
            var5.field3270 = this.field7735 - this.field7723;
            var5.field3275 = this.field7733 - this.field7731;
            var5.field3274 = this.field7698 - this.field7723;
            var5.field3264 = this.field7703 - this.field7731;
        }
        int var2 = this.field7731 * this.field7711 + this.field7723;
        for (int var3 = this.field7731; var3 < this.field7703; ++var3) {
            for (int var4 = 0; var4 < this.field7722; ++var4) {
                this.field7699[var4].field1441.field3267[var3 - this.field7731] = var2;
            }
            var2 += this.field7711;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
    public final void method1947(int arg0, int arg1, int arg2) {
        this.field7714 = arg0 & 16777215;
        int var4 = this.field7714 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field7714 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field7714 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field7714 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field7719 = false;
        } else {
            this.field7719 = true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1901(Canvas arg0) {
        class296 var2 = (class296) this.field7694.method2409(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1121(false);
            class296 var3 = class500.method3005(arg0, false);
            this.field7694.method2413((long) arg0.hashCode(), -1, var3);
            if (this.field7692 == arg0 && this.field7695 == null) {
                this.field7693 = var3;
                this.field7724 = var3.field4493;
                this.field7711 = var3.field4491;
                this.field7720 = var3.field4498;
                this.method3042();
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(IIIIII)V")
    public final void method1971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field7723) {
            arg2 -= this.field7723 - arg0;
            arg0 = this.field7723;
        }
        if (arg1 < this.field7731) {
            arg3 -= this.field7731 - arg1;
            arg1 = this.field7731;
        }
        if (arg0 + arg2 > this.field7698) {
            arg2 = this.field7698 - arg0;
        }
        if (arg1 + arg3 > this.field7703) {
            arg3 = this.field7703 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7698 && arg1 <= this.field7703) {
            int var7 = this.field7711 - arg2;
            int var8 = this.field7711 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field7724[var24] = arg4;
                            ++var24;
                            this.field7724[var24] = arg4;
                            ++var24;
                            this.field7724[var24] = arg4;
                            ++var24;
                            this.field7724[var24] = arg4;
                            ++var24;
                            this.field7724[var24] = arg4;
                            ++var24;
                            this.field7724[var24] = arg4;
                            ++var24;
                            this.field7724[var24] = arg4;
                            ++var24;
                            this.field7724[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field7724[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = (var9 << 24) + ((arg4 & 16711935) * var9 >> 8 & 16711935) + ((arg4 & 65280) * var9 >> 8 & 65280);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field7724[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field7724[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field7724[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field7724[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([Lcd;Lql;[Lni;I)V")
    public final void method1978(class198[] arg0, class496 arg1, class346[] arg2, int arg3) {
        class354[] var5 = new class354[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class354) arg0[var6];
            }
        }
        class354 var7 = class354.method2159(this, var5);
        var7.method2172(arg1, arg2 != null ? arg2[0] : null, (class372) null, arg3);
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(IIII)V")
    public final void method1987(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "(I)Z")
    public final boolean method3044(int arg0) {
        return super.field4784.method59(arg0, 21645).field739;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "()Z")
    public final boolean method1903() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "()V")
    public final void method1966() {
        this.field7723 = 0;
        this.field7731 = 0;
        this.field7698 = this.field7711;
        this.field7703 = this.field7720;
        this.method3043();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([IIIII)Lig;")
    public final class154 method1924(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class385(this, arg0, arg1, arg2, arg3, arg4) : new class79(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class385(this, arg0, arg1, arg2, arg3, arg4) : new class79(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "()Z")
    public final boolean method1949() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "(I)Z")
    public final boolean method3045(int arg0) {
        return super.field4784.method61(arg0, (byte) -81);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lpt;)V")
    public final void method1961(class353 arg0) {
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lql;)V")
    public final void method1921(class496 arg0) {
        this.field7718 = (class68) arg0;
    }

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "()Z")
    public final boolean method1962() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/Runnable;)Lcg;")
    public final class86 method3046(Runnable arg0) {
        for (int var2 = 0; var2 < this.field7722; ++var2) {
            if (this.field7699[var2].field1444 == arg0) {
                return this.field7699[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "()Z")
    public final boolean method1981() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "()V")
    public final void method1964() {
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILvl;)V")
    private class509(int arg0, class11 arg1) {
        super(arg0, arg1);
        this.field7691 = false;
        this.field7690 = false;
        this.field7694 = new class407(4);
        this.field7701 = 78642;
        this.field7698 = 0;
        this.field7707 = false;
        this.field7713 = 45823;
        this.field7697 = 512;
        this.field7700 = 512;
        this.field7709 = 50;
        this.field7717 = 0;
        this.field7703 = 0;
        this.field7721 = 0;
        this.field7715 = 0;
        this.field7725 = 0;
        this.field7723 = 0;
        this.field7727 = 75518;
        this.field7730 = 3500;
        this.field7731 = 0;
        this.field7726 = false;
        this.field7714 = 0;
        this.field7734 = 3500;
        this.field7732 = this.field7734 - 255;
        this.field7736 = 0;
        this.field7712 = new class288(16);
        this.field7737 = -1;
        this.field7716 = new class288(20);
        this.field7718 = new class68();
        this.method1979(1);
        this.method1902(0);
        class239.method1433(-101, false, true);
        this.field7690 = true;
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "()V")
    public final void method1909() {
    }

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "(I)I")
    public final int method3047(int arg0) {
        return super.field4784.method59(arg0, 21645).field737 & 65535;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIZ)Lig;")
    public final class154 method1930(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field7711 * arg1 + arg0;
        int var8 = this.field7711 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field7724[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class385(this, var6, arg2, arg3);
        } else {
            return new class79(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V")
    public final void method1965(int arg0) {
        this.method1971(0, 0, this.field7711, this.field7720, arg0, 0);
    }

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "()Z")
    public final boolean method1942() {
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)V")
    public final void method1956(int arg0) {
        int var2 = arg0 - this.field7689;
        for (Object var3 = this.field7716.method1751((byte) -122); var3 != null; var3 = this.field7716.method1756(-1219)) {
            class242 var4 = (class242) var3;
            if (var4.field3638) {
                var4.field3642 += var2;
                int var5 = var4.field3642 / 20;
                if (var5 > 0) {
                    class48 var6 = super.field4784.method59(var4.field3641, 21645);
                    var4.method1451(var6.field740 * var2 * 50 / 1000, var6.field744 * var2 * 50 / 1000);
                    var4.field3642 -= var5 * 20;
                }
                var4.field3638 = false;
            }
        }
        this.field7689 = arg0;
        this.field7712.method1760(5, 30398);
    }

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "()Lql;")
    public final class496 method1976() {
        class86 var1 = this.method3046(Thread.currentThread());
        return var1.field1439;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1937(Canvas arg0) {
        if (arg0 != null) {
            class296 var2 = (class296) this.field7694.method2409(false, (long) arg0.hashCode());
            if (var2 != null) {
                this.field7692 = arg0;
                this.field7693 = var2;
                if (this.field7695 == null) {
                    this.field7724 = var2.field4493;
                    this.field7711 = var2.field4491;
                    this.field7720 = var2.field4498;
                    this.method3042();
                    return;
                }
            }
        } else {
            this.field7692 = null;
            this.field7693 = null;
            if (this.field7695 == null) {
                this.field7724 = null;
                this.field7711 = this.field7720 = 1;
                this.method3042();
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1970(Canvas arg0) {
        if (this.field7692 == arg0) {
            this.method1937((Canvas) null);
        }
        class296 var2 = (class296) this.field7694.method2409(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1121(false);
        }
    }

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "()I")
    public final int method1955() {
        return this.field7709;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIII)Llf;")
    public final class151 method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIILbe;II)V")
    public final void method1896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class28 arg6, int arg7, int arg8) {
        class388 var10 = (class388) arg6;
        int[] var11 = var10.field5622;
        int[] var12 = var10.field5618;
        int var13 = this.field7731 > arg8 ? this.field7731 : arg8;
        int var14 = this.field7703 < var11.length + arg8 ? this.field7703 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field7723) {
                var18 += (this.field7723 - arg0) * var20;
                arg0 = this.field7723;
            }
            if (var21 >= this.field7698) {
                var21 = this.field7698 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field7711 * var25 + arg0;
                                int var29 = this.field7724[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field7724[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field7711 * var31 + arg0;
                                int var35 = this.field7724[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field7724[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field7724[this.field7711 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field7723 && var64 < this.field7698 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field7724[this.field7711 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field7723 && var50 < this.field7698 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field7711 * arg1 + var50;
                        int var54 = this.field7724[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field7724[this.field7711 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field7723 && var56 < this.field7698 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field7711 * arg1 + var56;
                        int var60 = this.field7724[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field7724[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "(I)V")
    public final void method1979(int arg0) {
        if (this.field7722 != arg0) {
            this.field7722 = arg0;
            this.field7699 = new class86[this.field7722];
            for (int var2 = 0; var2 < this.field7722; ++var2) {
                this.field7699[var2] = new class86(this);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(IIII)V")
    public final void method1940(int arg0, int arg1, int arg2, int arg3) {
        this.field7717 = this.field7714;
        this.field7715 = arg0;
        this.field7714 = arg1;
        this.field7725 = arg2;
        this.field7707 = true;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
    public final void method1891(int arg0, int arg1) {
        this.field7709 = arg0;
        this.field7734 = arg1;
        this.field7732 = this.field7734 - 255;
        this.method3051();
    }

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "()V")
    public final void method1990() {
        if (this.field7690) {
            class277.method1685(false, true, true);
            this.field7690 = false;
        }
        this.field7693 = null;
        this.field7692 = null;
        this.field7694 = null;
        this.field7691 = true;
    }

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "()Z")
    public final boolean method3048() {
        return this.field7691;
    }

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "(I)Z")
    public final boolean method3049(int arg0) {
        return this.field7726 || super.field4784.method59(arg0, 21645).field735;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lfd;Z)Lig;")
    public final class154 method1952(class351 arg0, boolean arg1) {
        int[] var3 = arg0.field5169;
        byte[] var4 = arg0.field5173;
        int var5 = arg0.field5166;
        int var6 = arg0.field5168;
        class430 var11;
        if (arg1 && arg0.field5174 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class417(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field5174;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class385(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class385(this, var14, var5, var6);
                var11 = new class79(this, var14, var5, var6);
            }
        }
        var11.method992(arg0.field5170, arg0.field5171, arg0.field5172, arg0.field5167);
        return var11;
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)Lpt;")
    public final class353 method1928(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[I)V")
    public final void method1932(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field7718.field1100 * arg2 + this.field7718.field1106 * arg0 + this.field7718.field1102 * arg1 >> 15) + this.field7718.field1101;
        if (var5 >= this.field7709 && var5 <= this.field7734) {
            int var6 = ((this.field7718.field1105 * arg2 + this.field7718.field1107 * arg0 + this.field7718.field1097 * arg1 >> 15) + this.field7718.field1104) * this.field7700 / var5;
            int var7 = ((this.field7718.field1098 * arg2 + this.field7718.field1108 * arg1 + this.field7718.field1103 * arg0 >> 15) + this.field7718.field1099) * this.field7697 / var5;
            if (var6 >= this.field7696 && var6 <= this.field7702 && var7 >= this.field7704 && var7 <= this.field7705) {
                arg3[0] = var6 - this.field7696;
                arg3[1] = var7 - this.field7704;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "(IIIIII)V")
    public final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1963(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1963(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1959(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1959(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field7723) {
                    var10 += (this.field7723 - arg0) * var12;
                    arg0 = this.field7723;
                }
                if (var13 >= this.field7698) {
                    var13 = this.field7698 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field7731 && var17 < this.field7703) {
                                int var18 = this.field7711 * var17 + arg0;
                                int var19 = this.field7724[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field7724[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field7731 && var21 < this.field7703) {
                                int var22 = this.field7711 * var21 + arg0;
                                int var23 = this.field7724[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field7724[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field7731 && var27 < this.field7703) {
                            this.field7724[this.field7711 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field7731) {
                    var29 += (this.field7731 - arg1) * var31;
                    arg1 = this.field7731;
                }
                if (var32 >= this.field7703) {
                    var32 = this.field7703 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field7723 && var46 < this.field7698) {
                            this.field7724[this.field7711 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field7723 && var36 < this.field7698) {
                            int var37 = this.field7711 * arg1 + var36;
                            int var38 = this.field7724[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field7724[this.field7711 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field7723 && var40 < this.field7698) {
                            int var41 = this.field7711 * arg1 + var40;
                            int var42 = this.field7724[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field7724[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
    public final void method1910(int arg0) {
        this.field7699[arg0].method606(12, (Runnable) null);
    }

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "()Z")
    public final boolean method1975() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(IIIII)V")
    public final void method1959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field7723 && arg0 < this.field7698) {
            if (arg1 < this.field7731) {
                arg2 -= this.field7731 - arg1;
                arg1 = this.field7731;
            }
            if (arg1 + arg2 > this.field7703) {
                arg2 = this.field7703 - arg1;
            }
            int var6 = this.field7711 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7711 * var10 + var6;
                        int var12 = this.field7724[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field7724[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field7711 * var14 + var6;
                        int var16 = this.field7724[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field7724[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field7724[this.field7711 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIII)V")
    public final void method1972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class86 var8 = this.method3046(Thread.currentThread());
        class210 var9 = var8.field1441;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var17 = arg5 * var16 >> 17;
            int var18 = arg5 * var16 + 1 >> 17;
            int var19 = arg5 * var15 >> 17;
            int var20 = arg5 * var15 + 1 >> 17;
            int var21 = arg0 - var9.method1290();
            int var22 = arg1 - var9.method1281();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field3272 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3272 = 255 - (arg4 >> 24);
            }
            var9.field3266 = var23 < 0 || var23 > var9.field3274 || var24 < 0 || var24 > var9.field3274 || var25 < 0 || var25 > var9.field3274;
            var9.method1288(var27, var28, var29, var23, var24, var25, arg4);
            var9.field3266 = var23 < 0 || var23 > var9.field3274 || var24 < 0 || var24 > var9.field3274 || var26 < 0 || var26 > var9.field3274;
            var9.method1288(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(IIII)V")
    public final void method1982(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7711) {
            arg2 = this.field7711;
        }
        if (arg3 > this.field7720) {
            arg3 = this.field7720;
        }
        this.field7723 = arg0;
        this.field7698 = arg2;
        this.field7731 = arg1;
        this.field7703 = arg3;
        this.method3043();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method1939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field7711 * arg1 + arg0;
            int var15 = this.field7711 - arg2;
            if (arg1 + arg3 > this.field7703) {
                arg3 -= arg1 + arg3 - this.field7703;
            }
            if (arg1 < this.field7731) {
                int var16 = this.field7731 - arg1;
                arg3 -= var16;
                var14 += this.field7711 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field7698) {
                int var17 = arg0 + arg2 - this.field7698;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field7723) {
                int var18 = this.field7723 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field7724[var14];
                            this.field7724[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field7724[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field7724[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field7724[var14++] = arg5;
                        } else {
                            this.field7724[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IFFFFF)V")
    public final void method1941(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field7713 = (int) (arg1 * 65535.0F);
        this.field7701 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field7708 = (int) (arg3 * 65535.0F / var7);
        this.field7729 = (int) (arg4 * 65535.0F / var7);
        this.field7728 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(IIIIII)V")
    public final void method1918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1963(arg0, arg1, arg2, arg4, arg5);
        this.method1963(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1959(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1959(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lwr;IIII)Lcd;")
    public final class198 method1908(class303 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class354(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "(I)[I")
    private final int[] method3050(int arg0) {
        class288 var2 = this.field7716;
        class242 var3;
        synchronized (this.field7716) {
            var3 = (class242) this.field7716.method1752(0, (long) arg0);
            if (var3 == null) {
                if (!super.field4784.method61(arg0, (byte) -76)) {
                    return null;
                }
                class48 var5 = super.field4784.method59(arg0, 21645);
                int var6 = !var5.field735 && !this.field7726 ? 128 : 64;
                var3 = new class242(arg0, var6, super.field4784.method58(var6, 0.7F, true, arg0, var6, 19907), var5.field725);
                this.field7716.method1758(1, var3, (long) arg0);
            }
        }
        var3.field3638 = true;
        return var3.method1452();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)[I")
    public final int[] method1899(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field7711 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field7724[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "()Z")
    public final boolean method1893() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1904(Canvas arg0) {
        class296 var2 = (class296) this.field7694.method2409(false, (long) arg0.hashCode());
        if (var2 == null) {
            class296 var3 = class500.method3005(arg0, false);
            this.field7694.method2413((long) arg0.hashCode(), -1, var3);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public final void method1902(int arg0) {
        this.field7699[arg0].method606(12, Thread.currentThread());
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(IIIII)V")
    public final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field7731 && arg1 < this.field7703) {
            if (arg0 < this.field7723) {
                arg2 -= this.field7723 - arg0;
                arg0 = this.field7723;
            }
            if (arg0 + arg2 > this.field7698) {
                arg2 = this.field7698 - arg0;
            }
            int var6 = this.field7711 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7724[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field7724[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field7724[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field7724[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field7724[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "()V")
    public final void method1915() {
        if (this.field7692 != null && this.field7693 != null) {
            try {
                Graphics var1 = this.field7692.getGraphics();
                this.field7693.method1518(var1, 107, 0, 0);
            } catch (Exception var2) {
                this.field7692.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public final void method1892(boolean arg0) {
        this.field7726 = arg0;
        this.field7716.method1761(-123);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)I")
    public final int method1944(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "()Z")
    public final boolean method1911() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "()Z")
    public final boolean method1905() {
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILbe;II)V")
    public final void method1994(int arg0, class28 arg1, int arg2, int arg3) {
        class388 var5 = (class388) arg1;
        int[] var6 = var5.field5622;
        int[] var7 = var5.field5618;
        int var8;
        if (this.field7703 < var6.length + arg3) {
            var8 = this.field7703 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field7731 > arg3) {
            var9 = this.field7731 - arg3;
            arg3 = this.field7731;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field7711 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field7723 > var12) {
                    var13 -= this.field7723 - var12;
                    var12 = this.field7723;
                }
                if (this.field7698 < var12 + var13) {
                    var13 = this.field7698 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field7724[var14++] = arg0;
                }
                var10 += this.field7711;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(IIII)V")
    public final void method1948(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7723 < arg0) {
            this.field7723 = arg0;
        }
        if (this.field7731 < arg1) {
            this.field7731 = arg1;
        }
        if (this.field7698 > arg2) {
            this.field7698 = arg2;
        }
        if (this.field7703 > arg3) {
            this.field7703 = arg3;
        }
        this.method3043();
    }

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "()Lql;")
    public final class496 method1925() {
        return new class68();
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(II)I")
    public final int method1951(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "()I")
    public final int method1897() {
        int var1 = this.field7721;
        this.field7721 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class86 var11 = this.method3046(Thread.currentThread());
        class210 var12 = var11.field1441;
        var12.field3273 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field3273 = false;
            var12.field3272 = 0;
            var12.field3266 = true;
            var12.method1292(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field3273 = false;
            var12.field3272 = 255 - var13;
            var12.field3266 = true;
            var12.method1292(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field3273 = true;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIF)Lki;")
    public final class480 method1894(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[Lki;)V")
    public final void method1916(int arg0, class480[] arg1) {
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(Z)V")
    public final void method1917(boolean arg0) {
    }

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "()V")
    public final void method1992() {
    }

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "()V")
    private final void method3051() {
        if (this.field7706 != 0.0F) {
            float var1 = (float) this.field7734;
            float var2 = (float) this.field7709;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field7710 / (this.field7710 + this.field7706);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field7706;
            this.field7730 = (int) (((float) this.field7734 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field7730 = this.field7734;
        }
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(IIIII)V")
    public final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field7731) {
            var6 = this.field7731;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field7703) {
            var7 = this.field7703;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field7723) {
                    var64 = this.field7723;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field7698) {
                    var65 = this.field7698;
                }
                int var66 = this.field7711 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field7724[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field7723) {
                    var60 = this.field7723;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field7698 - 1) {
                    var61 = this.field7698 - 1;
                }
                int var62 = this.field7711 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field7724[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field7723) {
                    var28 = this.field7723;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field7698) {
                    var29 = this.field7698;
                }
                int var30 = this.field7711 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field7724[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field7724[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field7723) {
                    var22 = this.field7723;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field7698 - 1) {
                    var23 = this.field7698 - 1;
                }
                int var24 = this.field7711 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field7724[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field7724[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field7723) {
                    var47 = this.field7723;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field7698) {
                    var48 = this.field7698;
                }
                int var49 = this.field7711 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field7724[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field7724[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field7723) {
                    var39 = this.field7723;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field7698 - 1) {
                    var40 = this.field7698 - 1;
                }
                int var41 = this.field7711 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field7724[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field7724[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "()Z")
    public final boolean method1969() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "()Z")
    public final boolean method1988() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II[[I[[IIII)Lfo;")
    public final class343 method1919(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class44(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "(I)[I")
    public final int[] method3052(int arg0) {
        class288 var2 = this.field7716;
        class242 var3;
        synchronized (this.field7716) {
            var3 = (class242) this.field7716.method1752(0, (long) arg0);
            if (var3 == null) {
                if (!super.field4784.method61(arg0, (byte) -123)) {
                    return null;
                }
                class48 var5 = super.field4784.method59(arg0, 21645);
                int var6 = !var5.field735 && !this.field7726 ? 128 : 64;
                var3 = new class242(arg0, var6, super.field4784.method60(var6, true, arg0, 0.7F, 101, var6), var5.field725);
                this.field7716.method1758(1, var3, (long) arg0);
            }
        }
        var3.field3638 = true;
        return var3.method1452();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lpa;III)V")
    public final void method3053(class239 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field3604;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method1980(arg1, arg2, var6, arg0.field3598, 1);
        } else {
            if (this.field7737 != var5) {
                class154 var7 = (class154) this.field7712.method1752(0, (long) var5);
                if (var7 == null) {
                    int[] var8 = this.method3050(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method3049(var5) ? 64 : 128;
                    var7 = this.method1924(var8, 0, var9, var9, var9);
                    this.field7712.method1758(1, var7, (long) var5);
                }
                this.field7737 = var5;
                this.field7738 = var7;
            }
            if (this.field7738.method988() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field7738.method572(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field3598, 1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lvl;)V")
    public class509(int arg0, Canvas arg1, class11 arg2) {
        this(arg0, arg2);
        this.method1904(arg1);
        this.method1937(arg1);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(FF)V")
    public final void method1993(float arg0, float arg1) {
        this.field7710 = arg0;
        this.field7706 = arg1;
        this.method3051();
    }

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "()I")
    public final int method1929() {
        int var1 = this.field7736;
        this.field7736 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Llf;)V")
    public final void method1914(class151 arg0) {
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Llf;Llf;FLlf;)Llf;")
    public final class151 method1985(class151 arg0, class151 arg1, float arg2, class151 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1957(Rectangle[] arg0, int arg1) {
        if (this.field7692 != null && this.field7693 != null) {
            try {
                Graphics var3 = this.field7692.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field7711 && var5.y <= this.field7720 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field7693.method1522(var5.y, var3, var5.width, var5.height, (byte) 54, var5.x);
                    }
                }
            } catch (Exception var6) {
                this.field7692.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "()I")
    public final int method1890() {
        return this.field7734;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([Lcd;Lii;Lql;[Lni;I)V")
    public final void method1913(class198[] arg0, class372 arg1, class496 arg2, class346[] arg3, int arg4) {
        class354[] var6 = new class354[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class354) arg0[var7];
            }
        }
        class354 var8 = class354.method2159(this, var6);
        var8.method2172(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lpm;[Lfd;Z)Lwn;")
    public final class488 method1888(class396 arg0, class351[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field5166;
            var5[var7] = arg1[var7].field5168;
            if (arg1[var7].field5174 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class445(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class124(this, arg0, arg1, var4, var5);
        } else {
            return new class136(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lii;)V")
    public final void method1900(class372 arg0) {
        class374 var2 = arg0.field5447.field2654;
        for (class374 var3 = var2.field5456; var2 != var3; var3 = var3.field5456) {
            class239 var4 = (class239) var3;
            int var5 = var4.field3596 >> 12;
            int var6 = var4.field3609 >> 12;
            int var7 = var4.field3601 >> 12;
            int var8 = (this.field7718.field1100 * var7 + this.field7718.field1106 * var5 + this.field7718.field1102 * var6 >> 15) + this.field7718.field1101;
            if (var8 >= this.field7709 && var8 <= this.field7732) {
                int var9 = ((this.field7718.field1105 * var7 + this.field7718.field1107 * var5 + this.field7718.field1097 * var6 >> 15) + this.field7718.field1104) * this.field7700 / var8 + this.field7735;
                int var10 = ((this.field7718.field1098 * var7 + this.field7718.field1108 * var6 + this.field7718.field1103 * var5 >> 15) + this.field7718.field1099) * this.field7697 / var8 + this.field7733;
                if (var9 >= this.field7723 && var9 <= this.field7698 && var10 >= this.field7731 && var10 <= this.field7703) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method3053(var4, var9, var10, (var4.field3606 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lcd;Lii;Lql;Lni;I)V")
    public final void method1983(class198 arg0, class372 arg1, class496 arg2, class346 arg3, int arg4) {
        ((class354) arg0).method2172(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "()V")
    public final void method1958() {
        this.field7714 = this.field7717;
        this.field7707 = false;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(IIIIII)Z")
    public final boolean method1923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field7718.field1100 * arg2 + this.field7718.field1106 * arg0 + this.field7718.field1102 * arg1 >> 15) + this.field7718.field1101;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field7718.field1100 * arg5 + this.field7718.field1106 * arg3 + this.field7718.field1102 * arg4 >> 15) + this.field7718.field1101;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field7709 || var8 >= this.field7709) && (var7 <= this.field7734 || var8 <= this.field7734)) {
            int var9 = ((this.field7718.field1105 * arg2 + this.field7718.field1107 * arg0 + this.field7718.field1097 * arg1 >> 15) + this.field7718.field1104) * this.field7700 / var7;
            int var10 = ((this.field7718.field1105 * arg5 + this.field7718.field1107 * arg3 + this.field7718.field1097 * arg4 >> 15) + this.field7718.field1104) * this.field7700 / var8;
            if (var9 < this.field7696 && var10 < this.field7696 || var9 > this.field7702 && var10 > this.field7702) {
                return false;
            } else {
                int var11 = ((this.field7718.field1098 * arg2 + this.field7718.field1108 * arg1 + this.field7718.field1103 * arg0 >> 15) + this.field7718.field1099) * this.field7697 / var7;
                int var12 = ((this.field7718.field1098 * arg5 + this.field7718.field1108 * arg4 + this.field7718.field1103 * arg3 >> 15) + this.field7718.field1099) * this.field7697 / var8;
                return (var11 >= this.field7704 || var12 >= this.field7704) && (var11 <= this.field7705 || var12 <= this.field7705);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method3054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field4784.method59(arg5, 21645).field733) {
                if (this.field7737 != arg5) {
                    class154 var10 = (class154) this.field7712.method1752(0, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method3050(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method3049(arg5) ? 64 : 128;
                        var10 = this.method1924(var11, 0, var12, var12, var12);
                        this.field7712.method1758(1, var10, (long) arg5);
                    }
                    this.field7737 = arg5;
                    this.field7738 = var10;
                }
                this.field7738.method572(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method1980(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V")
    public final void method1912(int arg0) {
    }

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "()I")
    public final int method1986() {
        return 0;
    }

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "()Z")
    public final boolean method1953() {
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II[I[I)Lbe;")
    public final class28 method1927(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class388(arg0, arg1, arg2, arg3);
    }
}
