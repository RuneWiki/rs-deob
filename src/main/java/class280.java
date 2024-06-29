import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class280 extends class322 {

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "Z")
    private boolean field3812 = false;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public int field3815 = 75518;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public int field3825 = 50;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    public int field3832 = 45823;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
    public int field3830 = 512;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "Z")
    private boolean field3816 = false;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public int field3804 = 0;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public int field3827 = 0;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "Z")
    public boolean field3820 = false;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
    public int field3843 = 0;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
    private int field3841 = 0;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    private int field3810 = 3500;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    private int field3835 = 0;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public int field3829 = 0;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public int field3823 = 3500;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "I")
    public int field3842 = 0;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public int field3811 = 512;

    @OriginalMember(owner = "client!hm", name = "hb", descriptor = "I")
    public int field3846 = 0;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public int field3818 = this.field3810 - 255;

    @OriginalMember(owner = "client!hm", name = "gb", descriptor = "I")
    public int field3845 = 0;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "Z")
    private boolean field3833 = false;

    @OriginalMember(owner = "client!hm", name = "ib", descriptor = "I")
    private int field3847 = 0;

    @OriginalMember(owner = "client!hm", name = "jb", descriptor = "I")
    public int field3848 = 78642;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "Lph;")
    private class114 field3828 = new class114(16);

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3822;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "Lal;")
    public class369 field3817;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Lup;")
    private class441 field3806;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "[I")
    public int[] field3802;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    private int field3808;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "F")
    private float field3814;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "F")
    private float field3819;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    private int field3809;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public int field3834;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "I")
    public int field3836;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
    public int field3837;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "Lph;")
    private class114 field3838;

    @OriginalMember(owner = "client!hm", name = "kb", descriptor = "Lgp;")
    private class259 field3849;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "Ltc;")
    public class290 field3839;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "Z")
    public boolean field3813;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "[Lbg;")
    private class373[] field3821;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "()V")
    public final void method1551() {
        this.field3842 = this.field3847;
        this.field3820 = false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[[I[[IIII)Lbl;")
    public final class54 method1552(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class157(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[I)V")
    public final void method1553(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field3839.field3951 * arg2 + this.field3839.field3948 * arg0 + this.field3839.field3943 * arg1 >> 15) + this.field3839.field3947;
        if (var5 >= this.field3825 && var5 <= this.field3810) {
            int var6 = ((this.field3839.field3946 * arg2 + this.field3839.field3944 * arg0 + this.field3839.field3941 * arg1 >> 15) + this.field3839.field3945) * this.field3830 / var5;
            int var7 = ((this.field3839.field3949 * arg2 + this.field3839.field3950 * arg1 + this.field3839.field3942 * arg0 >> 15) + this.field3839.field3952) * this.field3811 / var5;
            if (var6 >= this.field3826 && var6 <= this.field3836 && var7 >= this.field3824 && var7 <= this.field3807) {
                arg3[0] = var6 - this.field3826;
                arg3[1] = var7 - this.field3824;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
    private final void method1554() {
        if (this.field3819 != 0.0F) {
            float var1 = (float) this.field3810;
            float var2 = (float) this.field3825;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field3814 / (this.field3819 + this.field3814);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field3819;
            this.field3823 = (int) (((float) this.field3810 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field3823 = this.field3810;
        }
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "()V")
    public final void method1555() {
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lra;III)V")
    public final void method1556(class370 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field5170;
        if (var6 == -1) {
            this.method1604(arg1, arg2, var5, arg0.field5177, 1);
        } else {
            if (this.field3849 == null || (long) var6 != this.field3849.field4510) {
                this.field3849 = (class259) this.field3828.method616(-36, (long) var6);
            }
            if (this.field3849 == null) {
                int[] var7 = this.method1565(var6);
                if (var7 == null) {
                    return;
                }
                this.field3849 = new class259();
                this.field3849.field3517 = this.method1626(var6);
                int var8 = this.field3849.field3517 ? 64 : 128;
                this.field3849.field3521 = this.method1637(var7, 0, var8, var8, var8);
                this.field3828.method615((byte) -117, (long) var6, this.field3849);
            }
            if (this.field3849.field3517) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field3849.field3521.method110(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field5177, 1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "()Z")
    public final boolean method1557() {
        return true;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Z)V")
    public final void method1558(boolean arg0) {
        this.field3812 = arg0;
        this.field3838.method613(true);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([Ljn;Lhc;Lib;[Lpf;I)V")
    public final void method1559(class396[] arg0, class366 arg1, class247 arg2, class447[] arg3, int arg4) {
        class400[] var6 = new class400[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class400) arg0[var7];
            }
        }
        class400 var8 = class400.method2498(this, var6);
        var8.method2516(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(FFF)V")
    public final void method1560(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lmc;)V")
    public final void method1561(class316 arg0) {
    }

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "()Z")
    public final boolean method1562() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "()Z")
    public final boolean method1563() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "()F")
    public final float method1564() {
        return this.field3814;
    }

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)[I")
    private final int[] method1565(int arg0) {
        class114 var2 = this.field3838;
        class325 var3;
        synchronized (this.field3838) {
            var3 = (class325) this.field3838.method616(-4, (long) arg0);
            if (var3 == null) {
                if (!this.field3817.method1665(arg0, (byte) -125)) {
                    return null;
                }
                class75 var5 = this.field3817.method1660(arg0, (byte) -89);
                int var6 = !var5.field825 && !this.field3812 ? 128 : 64;
                var3 = new class325(arg0, var6, this.field3817.method1659(0.7F, arg0, true, var6, var6, 21196), var5.field840);
                this.field3838.method615((byte) -106, (long) arg0, var3);
            }
        }
        var3.field4336 = true;
        return var3.method1870();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILgo;II)V")
    public final void method1566(int arg0, class175 arg1, int arg2, int arg3) {
        class410 var5 = (class410) arg1;
        int[] var6 = var5.field5931;
        int[] var7 = var5.field5934;
        int var8;
        if (this.field3804 < var6.length + arg3) {
            var8 = this.field3804 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field3846 > arg3) {
            var9 = this.field3846 - arg3;
            arg3 = this.field3846;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field3803 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field3843 > var12) {
                    var13 -= this.field3843 - var12;
                    var12 = this.field3843;
                }
                if (this.field3845 < var12 + var13) {
                    var13 = this.field3845 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field3802[var14++] = arg0;
                }
                var10 += this.field3803;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "()I")
    public final int method1567() {
        return 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(F)V")
    public final void method1568(float arg0) {
        this.field3815 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIZ)Llg;")
    public final class20 method1569(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field3803 * arg1 + arg0;
        int var8 = this.field3803 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field3802[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class33(this, var6, arg2, arg3);
        } else {
            return new class239(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "()Z")
    public final boolean method1570() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
    public final void method1571(boolean arg0) {
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(Z)V")
    public final void method1572(boolean arg0) {
    }

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "()I")
    public final int method1573() {
        int var1 = this.field3841;
        this.field3841 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1574(Rectangle[] arg0, int arg1) {
        if (this.field3822 != null && this.field3806 != null) {
            try {
                Graphics var3 = this.field3822.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field3803 && var5.y <= this.field3808 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field3806.method475(var5.height, var5.x, var5.y, var5.width, var3, -14212);
                    }
                }
            } catch (Exception var6) {
                this.field3822.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(IIIIII)V")
    public final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1591(arg0, arg1, arg2, arg4, arg5);
        this.method1591(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1644(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1644(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "(I)Z")
    public final boolean method1576(int arg0) {
        return this.field3817.method1660(arg0, (byte) -88).field834;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
    private final void method1577() {
        this.field3826 = this.field3843 - this.field3831;
        this.field3836 = this.field3845 - this.field3831;
        this.field3824 = this.field3846 - this.field3844;
        this.field3807 = this.field3804 - this.field3844;
        for (int var1 = 0; var1 < this.field3805; ++var1) {
            class431 var5 = this.field3821[var1].field5210;
            var5.field6331 = this.field3831 - this.field3843;
            var5.field6322 = this.field3844 - this.field3846;
            var5.field6330 = this.field3845 - this.field3843;
            var5.field6325 = this.field3804 - this.field3846;
        }
        int var2 = this.field3846 * this.field3803 + this.field3843;
        for (int var3 = this.field3846; var3 < this.field3804; ++var3) {
            for (int var4 = 0; var4 < this.field3805; ++var4) {
                this.field3821[var4].field5210.field6327[var3 - this.field3846] = var2;
            }
            var2 += this.field3803;
        }
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)V")
    public final void method1578(int arg0) {
        this.method1614(0, 0, this.field3803, this.field3808, arg0, 0);
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V")
    public final void method1579(int arg0) {
        int var2 = arg0 - this.field3809;
        for (Object var3 = this.field3838.method605((byte) -85); var3 != null; var3 = this.field3838.method609(0)) {
            class325 var4 = (class325) var3;
            if (var4.field4336) {
                var4.field4332 += var2;
                int var5 = var4.field4332 / 20;
                if (var5 > 0) {
                    class75 var6 = this.field3817.method1660(var4.field4335, (byte) -94);
                    var4.method1871(var6.field835 * var2 * 50 / 1000, var6.field845 * var2 * 50 / 1000);
                    var4.field4332 -= var5 * 20;
                }
                var4.field4336 = false;
            }
        }
        this.field3809 = arg0;
        this.field3828.method614(-127, 5);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(IIII)V")
    public final void method1580(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3843 < arg0) {
            this.field3843 = arg0;
        }
        if (this.field3846 < arg1) {
            this.field3846 = arg1;
        }
        if (this.field3845 > arg2) {
            this.field3845 = arg2;
        }
        if (this.field3804 > arg3) {
            this.field3804 = arg3;
        }
        this.method1577();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([Ljn;Lib;[Lpf;I)V")
    public final void method1581(class396[] arg0, class247 arg1, class447[] arg2, int arg3) {
        class400[] var5 = new class400[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class400) arg0[var6];
            }
        }
        class400 var7 = class400.method2498(this, var5);
        var7.method2516(arg1, arg2 != null ? arg2[0] : null, (class366) null, arg3);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lue;)V")
    public final void method1582(class130 arg0) {
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(FF)V")
    public final void method1583(float arg0, float arg1) {
        this.field3814 = arg0;
        this.field3819 = arg1;
        this.method1554();
    }

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "()V")
    public final void method1584() {
        this.field3843 = 0;
        this.field3846 = 0;
        this.field3845 = this.field3803;
        this.field3804 = this.field3808;
        this.method1577();
    }

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "()Z")
    public final boolean method1585() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "()Lib;")
    public final class247 method1586() {
        return new class290();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IFFFFF)V")
    public final void method1587(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field3832 = (int) (arg1 * 65535.0F);
        this.field3848 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field3837 = (int) (arg3 * 65535.0F / var7);
        this.field3840 = (int) (arg4 * 65535.0F / var7);
        this.field3834 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
    public final void method1588(int arg0) {
        this.field3821[arg0].method2247((Runnable) null, (byte) 95);
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(IIII)V")
    public final void method1589(int arg0, int arg1, int arg2, int arg3) {
        this.field3831 = arg0;
        this.field3844 = arg1;
        this.field3830 = arg2;
        this.field3811 = arg3;
        this.method1577();
    }

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "()I")
    public final int method1590() {
        return 0;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIIII)V")
    public final void method1591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field3846 && arg1 < this.field3804) {
            if (arg0 < this.field3843) {
                arg2 -= this.field3843 - arg0;
                arg0 = this.field3843;
            }
            if (arg0 + arg2 > this.field3845) {
                arg2 = this.field3845 - arg0;
            }
            int var6 = this.field3803 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3802[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field3802[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field3802[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field3802[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field3802[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(IIIIII)V")
    public final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1591(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1591(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1644(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1644(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field3843) {
                    var10 += (this.field3843 - arg0) * var12;
                    arg0 = this.field3843;
                }
                if (var13 >= this.field3845) {
                    var13 = this.field3845 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field3846 && var17 < this.field3804) {
                                int var18 = this.field3803 * var17 + arg0;
                                int var19 = this.field3802[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field3802[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field3846 && var21 < this.field3804) {
                                int var22 = this.field3803 * var21 + arg0;
                                int var23 = this.field3802[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field3802[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field3846 && var27 < this.field3804) {
                            this.field3802[this.field3803 * var27 + arg0] = arg4;
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
                if (arg1 < this.field3846) {
                    var29 += (this.field3846 - arg1) * var31;
                    arg1 = this.field3846;
                }
                if (var32 >= this.field3804) {
                    var32 = this.field3804 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field3843 && var46 < this.field3845) {
                            this.field3802[this.field3803 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field3843 && var36 < this.field3845) {
                            int var37 = this.field3803 * arg1 + var36;
                            int var38 = this.field3802[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field3802[this.field3803 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field3843 && var40 < this.field3845) {
                            int var41 = this.field3803 * arg1 + var40;
                            int var42 = this.field3802[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field3802[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[I[I)Lgo;")
    public final class175 method1593(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class410(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field3839.field3951 * arg2 + this.field3839.field3948 * arg0 + this.field3839.field3943 * arg1 >> 15) + this.field3839.field3947;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field3839.field3951 * arg5 + this.field3839.field3948 * arg3 + this.field3839.field3943 * arg4 >> 15) + this.field3839.field3947;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field3825 || var8 >= this.field3825) && (var7 <= this.field3810 || var8 <= this.field3810)) {
            int var9 = ((this.field3839.field3946 * arg2 + this.field3839.field3944 * arg0 + this.field3839.field3941 * arg1 >> 15) + this.field3839.field3945) * this.field3830 / var7;
            int var10 = ((this.field3839.field3946 * arg5 + this.field3839.field3944 * arg3 + this.field3839.field3941 * arg4 >> 15) + this.field3839.field3945) * this.field3830 / var8;
            if (var9 < this.field3826 && var10 < this.field3826 || var9 > this.field3836 && var10 > this.field3836) {
                return false;
            } else {
                int var11 = ((this.field3839.field3949 * arg2 + this.field3839.field3950 * arg1 + this.field3839.field3942 * arg0 >> 15) + this.field3839.field3952) * this.field3811 / var7;
                int var12 = ((this.field3839.field3949 * arg5 + this.field3839.field3950 * arg4 + this.field3839.field3942 * arg3 >> 15) + this.field3839.field3952) * this.field3811 / var8;
                return (var11 >= this.field3824 || var12 >= this.field3824) && (var11 <= this.field3807 || var12 <= this.field3807);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)Lue;")
    public final class130 method1595(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "()I")
    public final int method1596() {
        int var1 = this.field3835;
        this.field3835 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field3803 * arg1 + arg0;
            int var15 = this.field3803 - arg2;
            if (arg1 + arg3 > this.field3804) {
                arg3 -= arg1 + arg3 - this.field3804;
            }
            if (arg1 < this.field3846) {
                int var16 = this.field3846 - arg1;
                arg3 -= var16;
                var14 += this.field3803 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field3845) {
                int var17 = arg0 + arg2 - this.field3845;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field3843) {
                int var18 = this.field3843 - arg0;
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
                            int var28 = this.field3802[var14];
                            this.field3802[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field3802[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field3802[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field3802[var14++] = arg5;
                        } else {
                            this.field3802[var14++] = arg4;
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

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "()Z")
    public final boolean method1598() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "()V")
    public final void method1599() {
        if (this.field3833) {
            class418.method2597(false, (byte) -119, true);
            this.field3833 = false;
        }
        this.field3822 = null;
        this.field3817 = null;
        this.field3806 = null;
        this.field3816 = true;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
    public final void method1600(int arg0, int arg1) {
        this.field3825 = arg0;
        this.field3810 = arg1;
        this.field3818 = this.field3810 - 255;
        this.method1554();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljp;[Lv;Z)Lwm;")
    public final class298 method1601(class402 arg0, class241[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field3282;
            var5[var7] = arg1[var7].field3280;
            if (arg1[var7].field3281 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class79(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class100(this, arg0, arg1, var4, var5);
        } else {
            return new class13(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lmc;Lmc;FLmc;)Lmc;")
    public final class316 method1602(class316 arg0, class316 arg1, float arg2, class316 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(II)V")
    public final void method1603(int arg0, int arg1) {
        this.field3842 = arg0 & 16777215;
        int var3 = this.field3842 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field3842 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field3842 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field3842 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field3813 = false;
        } else {
            this.field3813 = true;
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(IIIII)V")
    public final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field3846) {
            var6 = this.field3846;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field3804) {
            var7 = this.field3804;
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
                if (var64 < this.field3843) {
                    var64 = this.field3843;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field3845) {
                    var65 = this.field3845;
                }
                int var66 = this.field3803 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field3802[var66++] = arg3;
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
                if (var60 < this.field3843) {
                    var60 = this.field3843;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field3845 - 1) {
                    var61 = this.field3845 - 1;
                }
                int var62 = this.field3803 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field3802[var62++] = arg3;
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
                if (var28 < this.field3843) {
                    var28 = this.field3843;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field3845) {
                    var29 = this.field3845;
                }
                int var30 = this.field3803 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field3802[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field3802[var30++] = var15 + var33;
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
                if (var22 < this.field3843) {
                    var22 = this.field3843;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field3845 - 1) {
                    var23 = this.field3845 - 1;
                }
                int var24 = this.field3803 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field3802[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field3802[var24++] = var15 + var27;
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
                if (var47 < this.field3843) {
                    var47 = this.field3843;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field3845) {
                    var48 = this.field3845;
                }
                int var49 = this.field3803 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field3802[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field3802[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field3843) {
                    var39 = this.field3843;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field3845 - 1) {
                    var40 = this.field3845 - 1;
                }
                int var41 = this.field3803 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field3802[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field3802[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "()V")
    public final void method1605() {
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/Runnable;)Lbg;")
    public final class373 method1606(Runnable arg0) {
        for (int var2 = 0; var2 < this.field3805; ++var2) {
            if (this.field3821[var2].field5206 == arg0) {
                return this.field3821[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[Lfs;)V")
    public final void method1607(int arg0, class349[] arg1) {
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIIIII)Lmc;")
    public final class316 method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "()V")
    public final void method1609() {
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()Z")
    public final boolean method1610() {
        return this.field3816;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lib;)V")
    public final void method1611(class247 arg0) {
        this.field3839 = (class290) arg0;
    }

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "()Z")
    public final boolean method1612() {
        return true;
    }

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "()V")
    public final void method1613() {
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII)V")
    public final void method1614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field3843) {
            arg2 -= this.field3843 - arg0;
            arg0 = this.field3843;
        }
        if (arg1 < this.field3846) {
            arg3 -= this.field3846 - arg1;
            arg1 = this.field3846;
        }
        if (arg0 + arg2 > this.field3845) {
            arg2 = this.field3845 - arg0;
        }
        if (arg1 + arg3 > this.field3804) {
            arg3 = this.field3804 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field3845 && arg1 <= this.field3804) {
            int var7 = this.field3803 - arg2;
            int var8 = this.field3803 * arg1 + arg0;
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
                            this.field3802[var24] = arg4;
                            ++var24;
                            this.field3802[var24] = arg4;
                            ++var24;
                            this.field3802[var24] = arg4;
                            ++var24;
                            this.field3802[var24] = arg4;
                            ++var24;
                            this.field3802[var24] = arg4;
                            ++var24;
                            this.field3802[var24] = arg4;
                            ++var24;
                            this.field3802[var24] = arg4;
                            ++var24;
                            this.field3802[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field3802[var24] = arg4;
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
                        int var14 = this.field3802[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field3802[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field3802[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field3802[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIILgo;II)V")
    public final void method1615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class175 arg6, int arg7, int arg8) {
        class410 var10 = (class410) arg6;
        int[] var11 = var10.field5931;
        int[] var12 = var10.field5934;
        int var13 = this.field3846 > arg8 ? this.field3846 : arg8;
        int var14 = this.field3804 < var11.length + arg8 ? this.field3804 : var11.length + arg8;
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
            if (arg0 < this.field3843) {
                var18 += (this.field3843 - arg0) * var20;
                arg0 = this.field3843;
            }
            if (var21 >= this.field3845) {
                var21 = this.field3845 - 1;
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
                                int var28 = this.field3803 * var25 + arg0;
                                int var29 = this.field3802[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field3802[var28] = var23 + var30;
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
                                int var34 = this.field3803 * var31 + arg0;
                                int var35 = this.field3802[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field3802[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field3802[this.field3803 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field3843 && var64 < this.field3845 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field3802[this.field3803 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field3843 && var50 < this.field3845 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field3803 * arg1 + var50;
                        int var54 = this.field3802[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field3802[this.field3803 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field3843 && var56 < this.field3845 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field3803 * arg1 + var56;
                        int var60 = this.field3802[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field3802[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(IIII)V")
    public final void method1616(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "()I")
    public final int method1617() {
        return this.field3825;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V")
    public final void method1618(int arg0) {
        this.field3821[arg0].method2247(Thread.currentThread(), (byte) 95);
    }

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "()Z")
    public final boolean method1619() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(II)I")
    public final int method1620(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "()I")
    public final int method1621() {
        return this.field3810;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljn;Lhc;Lib;Lpf;I)V")
    public final void method1622(class396 arg0, class366 arg1, class247 arg2, class447 arg3, int arg4) {
        ((class400) arg0).method2516(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "()V")
    public final void method1623() {
        this.field3838.method613(true);
    }

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "()Z")
    public final boolean method1624() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "()Z")
    public final boolean method1625() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "(I)Z")
    public final boolean method1626(int arg0) {
        return this.field3812 || this.field3817.method1660(arg0, (byte) -74).field825;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
    public final void method1627(int arg0) {
        if (this.field3805 != arg0) {
            this.field3805 = arg0;
            this.field3821 = new class373[this.field3805];
            for (int var2 = 0; var2 < this.field3805; ++var2) {
                this.field3821[var2] = new class373(this);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "(I)Z")
    public final boolean method1628(int arg0) {
        return this.field3817.method1665(arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([I)V")
    public final void method1629(int[] arg0) {
        arg0[0] = this.field3843;
        arg0[1] = this.field3846;
        arg0[2] = this.field3845;
        arg0[3] = this.field3804;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(III)V")
    public final void method1630(int arg0, int arg1, int arg2) {
        this.field3827 = arg0;
        this.field3842 = arg1;
        this.field3829 = arg2;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
    public final void method1631(int arg0, int arg1, int arg2) {
        this.field3847 = this.field3842;
        this.field3827 = arg0;
        this.field3842 = arg1;
        this.field3829 = arg2;
        this.field3820 = true;
    }

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "()Z")
    public final boolean method1632() {
        return true;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lv;Z)Llg;")
    public final class20 method1633(class241 arg0, boolean arg1) {
        int[] var3 = arg0.field3284;
        byte[] var4 = arg0.field3285;
        int var5 = arg0.field3282;
        int var6 = arg0.field3280;
        class343 var11;
        if (arg1 && arg0.field3281 == null) {
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
            var11 = new class120(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field3281;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class33(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class33(this, var14, var5, var6);
                var11 = new class239(this, var14, var5, var6);
            }
        }
        var11.method108(arg0.field3278, arg0.field3283, arg0.field3279, arg0.field3277);
        return var11;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(II)I")
    public final int method1634(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lhc;)V")
    public final void method1635(class366 arg0) {
        class428 var2 = arg0.field5126.field2098;
        for (class428 var3 = var2.field6280; var2 != var3; var3 = var3.field6280) {
            class370 var4 = (class370) var3;
            int var5 = var4.field5175 >> 12;
            int var6 = var4.field5173 >> 12;
            int var7 = var4.field5165 >> 12;
            int var8 = (this.field3839.field3951 * var7 + this.field3839.field3948 * var5 + this.field3839.field3943 * var6 >> 15) + this.field3839.field3947;
            if (var8 >= this.field3825 && var8 <= this.field3810) {
                int var9 = ((this.field3839.field3946 * var7 + this.field3839.field3944 * var5 + this.field3839.field3941 * var6 >> 15) + this.field3839.field3945) * this.field3830 / var8 + this.field3831;
                int var10 = ((this.field3839.field3949 * var7 + this.field3839.field3950 * var6 + this.field3839.field3942 * var5 >> 15) + this.field3839.field3952) * this.field3811 / var8 + this.field3844;
                if (var9 >= this.field3843 && var9 <= this.field3845 && var10 >= this.field3846 && var10 <= this.field3804) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1556(var4, var9, var10, (var4.field5168 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "()Z")
    public final boolean method1636() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([IIIII)Llg;")
    public final class20 method1637(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class33(this, arg0, arg1, arg2, arg3, arg4) : new class239(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class33(this, arg0, arg1, arg2, arg3, arg4) : new class239(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "()V")
    public final void method1638() {
        this.field3806 = class195.method1054(this.field3822, (byte) -46);
        this.field3802 = this.field3806.field6443;
        this.field3803 = this.field3806.field6440;
        this.field3808 = this.field3806.field6438;
        for (int var1 = 0; var1 < this.field3805; ++var1) {
            this.field3821[var1].method2246(true);
        }
        this.method1584();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class373 var11 = this.method1606(Thread.currentThread());
        class431 var12 = var11.field5210;
        var12.field6328 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field6328 = false;
            var12.field6334 = 0;
            var12.field6323 = true;
            var12.method2665(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field6328 = false;
            var12.field6334 = 255 - var13;
            var12.field6323 = true;
            var12.method2665(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field6328 = true;
    }

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "(I)I")
    public final int method1640(int arg0) {
        return this.field3817.method1660(arg0, (byte) -76).field827 & 65535;
    }

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "()F")
    public final float method1641() {
        return this.field3819;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)[I")
    public final int[] method1642(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field3803 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field3802[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "()Z")
    public final boolean method1643() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(IIIII)V")
    public final void method1644(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field3843 && arg0 < this.field3845) {
            if (arg1 < this.field3846) {
                arg2 -= this.field3846 - arg1;
                arg1 = this.field3846;
            }
            if (arg1 + arg2 > this.field3804) {
                arg2 = this.field3804 - arg1;
            }
            int var6 = this.field3803 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3803 * var10 + var6;
                        int var12 = this.field3802[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field3802[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field3803 * var14 + var6;
                        int var16 = this.field3802[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field3802[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field3802[this.field3803 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "()V")
    private final void method1645() {
        this.field3838 = new class114(20);
        this.field3839 = new class290();
        class67.method382(120, false, true);
        this.field3833 = true;
        this.method1627(1);
        this.method1618(0);
        this.method1584();
    }

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "()V")
    public final void method1646() {
        if (this.field3822 != null && this.field3806 != null) {
            try {
                Graphics var1 = this.field3822.getGraphics();
                this.field3806.method479(0, var1, -23932, 0);
            } catch (Exception var2) {
                this.field3822.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "(I)[I")
    public final int[] method1647(int arg0) {
        class114 var2 = this.field3838;
        class325 var3;
        synchronized (this.field3838) {
            var3 = (class325) this.field3838.method616(124, (long) arg0);
            if (var3 == null) {
                if (!this.field3817.method1665(arg0, (byte) -125)) {
                    return null;
                }
                class75 var5 = this.field3817.method1660(arg0, (byte) -116);
                int var6 = !var5.field825 && !this.field3812 ? 128 : 64;
                var3 = new class325(arg0, var6, this.field3817.method1662(true, var6, var6, 28861, 0.7F, arg0), var5.field840);
                this.field3838.method615((byte) -117, (long) arg0, var3);
            }
        }
        var3.field4336 = true;
        return var3.method1870();
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)V")
    public final void method1648(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field3803) {
            arg2 = this.field3803;
        }
        if (arg3 > this.field3808) {
            arg3 = this.field3808;
        }
        this.field3843 = arg0;
        this.field3845 = arg2;
        this.field3846 = arg1;
        this.field3804 = arg3;
        this.method1577();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1649(Canvas arg0) {
        this.field3822 = arg0;
        this.method1638();
    }

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "()Lib;")
    public final class247 method1650() {
        class373 var1 = this.method1606(Thread.currentThread());
        return var1.field5208;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lpe;IIII)Ljn;")
    public final class396 method1651(class390 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class400(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII)V")
    public final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class373 var8 = this.method1606(Thread.currentThread());
        class431 var9 = var8.field5210;
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
            int var21 = arg0 - var9.method2669();
            int var22 = arg1 - var9.method2667();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field6334 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6334 = 255 - (arg4 >> 24);
            }
            var9.field6323 = var23 < 0 || var23 > var9.field6330 || var24 < 0 || var24 > var9.field6330 || var25 < 0 || var25 > var9.field6330;
            var9.method2673(var27, var28, var29, var23, var24, var25, arg4);
            var9.field6323 = var23 < 0 || var23 > var9.field6330 || var24 < 0 || var24 > var9.field6330 || var26 < 0 || var26 > var9.field6330;
            var9.method2673(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "()Z")
    public final boolean method1653() {
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "()Z")
    public final boolean method1654() {
        return true;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lal;I)V")
    public class280(Canvas arg0, class369 arg1, int arg2) {
        this.field3822 = arg0;
        this.field3817 = arg1;
        super.field4307 = arg2;
        this.field3806 = class195.method1054(this.field3822, (byte) -51);
        this.field3802 = this.field3806.field6443;
        this.field3803 = this.field3806.field6440;
        this.field3808 = this.field3806.field6438;
        this.method1645();
    }
}
