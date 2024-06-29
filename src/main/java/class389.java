import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class389 extends class437 {

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public int field5809 = 78642;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public int field5796 = 0;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    private int field5802 = 3500;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    private int field5803 = 0;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    private int field5813 = 0;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public int field5808 = 512;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public int field5806 = 45823;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public int field5807 = 0;

    @OriginalMember(owner = "client!cs", name = "V", descriptor = "I")
    public int field5823 = 75518;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public int field5817 = 0;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "Z")
    private boolean field5804 = false;

    @OriginalMember(owner = "client!cs", name = "U", descriptor = "I")
    public int field5822 = 3500;

    @OriginalMember(owner = "client!cs", name = "S", descriptor = "I")
    public int field5820 = this.field5802 - 255;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "Z")
    private boolean field5811 = false;

    @OriginalMember(owner = "client!cs", name = "fb", descriptor = "I")
    public int field5833 = 0;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "Z")
    private boolean field5797 = false;

    @OriginalMember(owner = "client!cs", name = "ab", descriptor = "Z")
    public boolean field5828 = false;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public int field5815 = 50;

    @OriginalMember(owner = "client!cs", name = "Z", descriptor = "I")
    private int field5827 = 0;

    @OriginalMember(owner = "client!cs", name = "kb", descriptor = "I")
    public int field5838 = 0;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public int field5799 = 0;

    @OriginalMember(owner = "client!cs", name = "mb", descriptor = "I")
    public int field5840 = 512;

    @OriginalMember(owner = "client!cs", name = "lb", descriptor = "I")
    public int field5839 = 0;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "Lwe;")
    private class24 field5814 = new class24(16);

    @OriginalMember(owner = "client!cs", name = "hb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5835;

    @OriginalMember(owner = "client!cs", name = "nb", descriptor = "Lfl;")
    public class386 field5841;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "Le;")
    private class97 field5816;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "[I")
    public int[] field5798;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public int field5801;

    @OriginalMember(owner = "client!cs", name = "ib", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "F")
    private float field5805;

    @OriginalMember(owner = "client!cs", name = "gb", descriptor = "F")
    private float field5834;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public int field5810;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "I")
    public int field5819;

    @OriginalMember(owner = "client!cs", name = "T", descriptor = "I")
    public int field5821;

    @OriginalMember(owner = "client!cs", name = "W", descriptor = "I")
    public int field5824;

    @OriginalMember(owner = "client!cs", name = "X", descriptor = "I")
    public int field5825;

    @OriginalMember(owner = "client!cs", name = "Y", descriptor = "I")
    private int field5826;

    @OriginalMember(owner = "client!cs", name = "bb", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!cs", name = "db", descriptor = "I")
    public int field5831;

    @OriginalMember(owner = "client!cs", name = "eb", descriptor = "I")
    public int field5832;

    @OriginalMember(owner = "client!cs", name = "jb", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!cs", name = "ob", descriptor = "I")
    public int field5842;

    @OriginalMember(owner = "client!cs", name = "cb", descriptor = "Lue;")
    public class131 field5830;

    @OriginalMember(owner = "client!cs", name = "pb", descriptor = "Ltm;")
    private class188 field5843;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "Lwe;")
    private class24 field5800;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "Z")
    public boolean field5818;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "[Lna;")
    private class50[] field5812;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII)V")
    public final void method2057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2093(arg0, arg1, arg2, arg4, arg5);
        this.method2093(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method2190(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method2190(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "(I)Z")
    public final boolean method2534(int arg0) {
        return this.field5811 || this.field5841.method1760(-19907, arg0).field2281;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
    public final void method2114(int arg0, int arg1, int arg2) {
        this.field5803 = this.field5817;
        this.field5807 = arg0;
        this.field5817 = arg1;
        this.field5799 = arg2;
        this.field5828 = true;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)I")
    public final int method2132(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "(I)[I")
    public final int[] method2535(int arg0) {
        class24 var2 = this.field5800;
        class298 var3;
        synchronized (this.field5800) {
            var3 = (class298) this.field5800.method209(119, (long) arg0);
            if (var3 == null) {
                if (!this.field5841.method1756(false, arg0)) {
                    return null;
                }
                class175 var5 = this.field5841.method1760(-19907, arg0);
                int var6 = !var5.field2281 && !this.field5811 ? 128 : 64;
                var3 = new class298(arg0, var6, this.field5841.method1757(0.7F, var6, arg0, var6, false, true), var5.field2275);
                this.field5800.method202(true, var3, (long) arg0);
            }
        }
        var3.field4281 = true;
        return var3.method1892();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIZ)Lqa;")
    public final class243 method2173(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5801 * arg1 + arg0;
        int var8 = this.field5801 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5798[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class3(this, var6, arg2, arg3);
        } else {
            return new class338(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "()Z")
    public final boolean method2183() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "()V")
    public final void method2067() {
        if (this.field5835 != null && this.field5816 != null) {
            try {
                Graphics var1 = this.field5835.getGraphics();
                this.field5816.method634(0, 0, 32, var1);
            } catch (Exception var2) {
                this.field5835.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "()I")
    public final int method2032() {
        int var1 = this.field5827;
        this.field5827 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIIIIII)V")
    public final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class50 var8 = this.method2537(Thread.currentThread());
        class254 var9 = var8.field704;
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
            int var21 = arg0 - var9.method1584();
            int var22 = arg1 - var9.method1585();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field3692 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3692 = 255 - (arg4 >> 24);
            }
            var9.field3693 = var23 < 0 || var23 > var9.field3698 || var24 < 0 || var24 > var9.field3698 || var25 < 0 || var25 > var9.field3698;
            var9.method1590(var27, var28, var29, var23, var24, var25, arg4);
            var9.field3693 = var23 < 0 || var23 > var9.field3698 || var24 < 0 || var24 > var9.field3698 || var26 < 0 || var26 > var9.field3698;
            var9.method1590(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ln;Z)Lqa;")
    public final class243 method2166(class25 arg0, boolean arg1) {
        int[] var3 = arg0.field443;
        byte[] var4 = arg0.field445;
        int var5 = arg0.field442;
        int var6 = arg0.field438;
        class270 var11;
        if (arg1 && arg0.field441 == null) {
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
            var11 = new class62(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field441;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class3(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class3(this, var14, var5, var6);
                var11 = new class338(this, var14, var5, var6);
            }
        }
        var11.method1089(arg0.field444, arg0.field437, arg0.field439, arg0.field440);
        return var11;
    }

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "()Z")
    public final boolean method2112() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(FFF)V")
    public final void method2128(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lao;)V")
    public final void method2059(class116 arg0) {
        this.field5830 = (class131) arg0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
    private final void method2536() {
        this.field5800 = new class24(20);
        this.field5830 = new class131();
        class203.method1285(-105, true, false);
        this.field5797 = true;
        this.method2133(1);
        this.method2161(0);
        this.method2034();
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIIII)V")
    public final void method2093(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5833 && arg1 < this.field5796) {
            if (arg0 < this.field5838) {
                arg2 -= this.field5838 - arg0;
                arg0 = this.field5838;
            }
            if (arg0 + arg2 > this.field5839) {
                arg2 = this.field5839 - arg0;
            }
            int var6 = this.field5801 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5798[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5798[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5798[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5798[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5798[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/Runnable;)Lna;")
    public final class50 method2537(Runnable arg0) {
        for (int var2 = 0; var2 < this.field5821; ++var2) {
            if (this.field5812[var2].field694 == arg0) {
                return this.field5812[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "()Lao;")
    public final class116 method2060() {
        return new class131();
    }

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "()Z")
    public final boolean method2150() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II[[I[[IIII)Lgm;")
    public final class337 method2153(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class113(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "(I)[I")
    private final int[] method2538(int arg0) {
        class24 var2 = this.field5800;
        class298 var3;
        synchronized (this.field5800) {
            var3 = (class298) this.field5800.method209(119, (long) arg0);
            if (var3 == null) {
                if (!this.field5841.method1756(false, arg0)) {
                    return null;
                }
                class175 var5 = this.field5841.method1760(-19907, arg0);
                int var6 = !var5.field2281 && !this.field5811 ? 128 : 64;
                var3 = new class298(arg0, var6, this.field5841.method1758(var6, arg0, true, -11047, 0.7F, var6), var5.field2275);
                this.field5800.method202(true, var3, (long) arg0);
            }
        }
        var3.field4281 = true;
        return var3.method1892();
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIII)V")
    public final void method2155(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5801) {
            arg2 = this.field5801;
        }
        if (arg3 > this.field5836) {
            arg3 = this.field5836;
        }
        this.field5838 = arg0;
        this.field5839 = arg2;
        this.field5833 = arg1;
        this.field5796 = arg3;
        this.method2539();
    }

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "()Z")
    public final boolean method2056() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(IIII)V")
    public final void method2074(int arg0, int arg1, int arg2, int arg3) {
        this.field5825 = arg0;
        this.field5837 = arg1;
        this.field5840 = arg2;
        this.field5808 = arg3;
        this.method2539();
    }

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "()F")
    public final float method2091() {
        return this.field5834;
    }

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "()V")
    public final void method2054() {
        this.field5817 = this.field5803;
        this.field5828 = false;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "()V")
    private final void method2539() {
        this.field5829 = this.field5838 - this.field5825;
        this.field5810 = this.field5839 - this.field5825;
        this.field5832 = this.field5833 - this.field5837;
        this.field5831 = this.field5796 - this.field5837;
        for (int var1 = 0; var1 < this.field5821; ++var1) {
            class254 var5 = this.field5812[var1].field704;
            var5.field3695 = this.field5825 - this.field5838;
            var5.field3694 = this.field5837 - this.field5833;
            var5.field3698 = this.field5839 - this.field5838;
            var5.field3697 = this.field5796 - this.field5833;
        }
        int var2 = this.field5833 * this.field5801 + this.field5838;
        for (int var3 = this.field5833; var3 < this.field5796; ++var3) {
            for (int var4 = 0; var4 < this.field5821; ++var4) {
                this.field5812[var4].field704.field3702[var3 - this.field5833] = var2;
            }
            var2 += this.field5801;
        }
    }

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "()I")
    public final int method2110() {
        return 0;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(II)V")
    public final void method2102(int arg0, int arg1) {
        this.field5817 = arg0 & 16777215;
        int var3 = this.field5817 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field5817 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field5817 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field5817 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field5818 = false;
        } else {
            this.field5818 = true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "()Z")
    public final boolean method2146() {
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "()V")
    public final void method2170() {
    }

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "()I")
    public final int method2182() {
        return this.field5815;
    }

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)Lqm;")
    public final class288 method2105(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public final void method2161(int arg0) {
        this.field5812[arg0].method349(Thread.currentThread(), 113);
    }

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "()V")
    public final void method2130() {
        this.field5800.method212(-95);
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(IIIII)V")
    public final void method2116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5833) {
            var6 = this.field5833;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5796) {
            var7 = this.field5796;
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
                if (var64 < this.field5838) {
                    var64 = this.field5838;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field5839) {
                    var65 = this.field5839;
                }
                int var66 = this.field5801 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5798[var66++] = arg3;
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
                if (var60 < this.field5838) {
                    var60 = this.field5838;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field5839 - 1) {
                    var61 = this.field5839 - 1;
                }
                int var62 = this.field5801 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5798[var62++] = arg3;
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
                if (var28 < this.field5838) {
                    var28 = this.field5838;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field5839) {
                    var29 = this.field5839;
                }
                int var30 = this.field5801 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5798[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5798[var30++] = var15 + var33;
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
                if (var22 < this.field5838) {
                    var22 = this.field5838;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field5839 - 1) {
                    var23 = this.field5839 - 1;
                }
                int var24 = this.field5801 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5798[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5798[var24++] = var15 + var27;
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
                if (var47 < this.field5838) {
                    var47 = this.field5838;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field5839) {
                    var48 = this.field5839;
                }
                int var49 = this.field5801 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5798[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5798[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5838) {
                    var39 = this.field5838;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field5839 - 1) {
                    var40 = this.field5839 - 1;
                }
                int var41 = this.field5801 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5798[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5798[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "()V")
    public final void method2033() {
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)V")
    public final void method2041(int arg0, int arg1, int arg2) {
        this.field5807 = arg0;
        this.field5817 = arg1;
        this.field5799 = arg2;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(F)V")
    public final void method2063(float arg0) {
        this.field5823 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Llc;)V")
    public final void method2083(class125 arg0) {
        class59 var2 = arg0.field1666.field5020;
        for (class59 var3 = var2.field859; var2 != var3; var3 = var3.field859) {
            class58 var4 = (class58) var3;
            int var5 = var4.field840 >> 12;
            int var6 = var4.field844 >> 12;
            int var7 = var4.field836 >> 12;
            int var8 = (this.field5830.field1756 * var7 + this.field5830.field1759 * var5 + this.field5830.field1757 * var6 >> 15) + this.field5830.field1755;
            if (var8 >= this.field5815 && var8 <= this.field5802) {
                int var9 = ((this.field5830.field1754 * var7 + this.field5830.field1753 * var5 + this.field5830.field1751 * var6 >> 15) + this.field5830.field1762) * this.field5840 / var8 + this.field5825;
                int var10 = ((this.field5830.field1758 * var7 + this.field5830.field1761 * var5 + this.field5830.field1752 * var6 >> 15) + this.field5830.field1760) * this.field5808 / var8 + this.field5837;
                if (var9 >= this.field5838 && var9 <= this.field5839 && var10 >= this.field5833 && var10 <= this.field5796) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2543(var4, var9, var10, (var4.field835 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III[I)V")
    public final void method2143(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field5830.field1756 * arg2 + this.field5830.field1759 * arg0 + this.field5830.field1757 * arg1 >> 15) + this.field5830.field1755;
        if (var5 >= this.field5815 && var5 <= this.field5802) {
            int var6 = ((this.field5830.field1754 * arg2 + this.field5830.field1753 * arg0 + this.field5830.field1751 * arg1 >> 15) + this.field5830.field1762) * this.field5840 / var5;
            int var7 = ((this.field5830.field1758 * arg2 + this.field5830.field1761 * arg0 + this.field5830.field1752 * arg1 >> 15) + this.field5830.field1760) * this.field5808 / var5;
            if (var6 >= this.field5829 && var6 <= this.field5810 && var7 >= this.field5832 && var7 <= this.field5831) {
                arg3[0] = var6 - this.field5829;
                arg3[1] = var7 - this.field5832;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "()V")
    public final void method2025() {
        if (this.field5797) {
            class288.method1821(false, true, -1);
            this.field5797 = false;
        }
        this.field5835 = null;
        this.field5841 = null;
        this.field5816 = null;
        this.field5804 = true;
    }

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "()Z")
    public final boolean method2051() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
    public final void method2190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5838 && arg0 < this.field5839) {
            if (arg1 < this.field5833) {
                arg2 -= this.field5833 - arg1;
                arg1 = this.field5833;
            }
            if (arg1 + arg2 > this.field5796) {
                arg2 = this.field5796 - arg1;
            }
            int var6 = this.field5801 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5801 * var10 + var6;
                        int var12 = this.field5798[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5798[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5801 * var14 + var6;
                        int var16 = this.field5798[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5798[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5798[this.field5801 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
    public final void method2064(boolean arg0) {
        this.field5811 = arg0;
        this.field5800.method212(-85);
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(IIII)V")
    public final void method2163(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5838 < arg0) {
            this.field5838 = arg0;
        }
        if (this.field5833 < arg1) {
            this.field5833 = arg1;
        }
        if (this.field5839 > arg2) {
            this.field5839 = arg2;
        }
        if (this.field5796 > arg3) {
            this.field5796 = arg3;
        }
        this.method2539();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II[I[I)Lsn;")
    public final class449 method2169(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class35(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "()V")
    public final void method2104() {
        this.field5816 = class219.method1361(this.field5835, (byte) -125);
        this.field5798 = this.field5816.field1321;
        this.field5801 = this.field5816.field1327;
        this.field5836 = this.field5816.field1325;
        for (int var1 = 0; var1 < this.field5821; ++var1) {
            this.field5812[var1].method351(13232);
        }
        this.method2034();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIILsn;II)V")
    public final void method2042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class449 arg6, int arg7, int arg8) {
        class35 var10 = (class35) arg6;
        int[] var11 = var10.field568;
        int[] var12 = var10.field577;
        int var13 = this.field5833 > arg8 ? this.field5833 : arg8;
        int var14 = this.field5796 < var11.length + arg8 ? this.field5796 : var11.length + arg8;
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
            if (arg0 < this.field5838) {
                var18 += (this.field5838 - arg0) * var20;
                arg0 = this.field5838;
            }
            if (var21 >= this.field5839) {
                var21 = this.field5839 - 1;
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
                                int var28 = this.field5801 * var25 + arg0;
                                int var29 = this.field5798[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5798[var28] = var23 + var30;
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
                                int var34 = this.field5801 * var31 + arg0;
                                int var35 = this.field5798[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5798[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5798[this.field5801 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5838 && var64 < this.field5839 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5798[this.field5801 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5838 && var50 < this.field5839 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5801 * arg1 + var50;
                        int var54 = this.field5798[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5798[this.field5801 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5838 && var56 < this.field5839 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5801 * arg1 + var56;
                        int var60 = this.field5798[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5798[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "()Z")
    public final boolean method2069() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method2045(Canvas arg0) {
        this.field5835 = arg0;
        this.method2104();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method2113(Rectangle[] arg0, int arg1) {
        if (this.field5835 != null && this.field5816 != null) {
            try {
                Graphics var3 = this.field5835.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5801 && var5.y <= this.field5836 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5816.method636(var5.height, var5.width, (byte) -100, var3, var5.x, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field5835.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "(IIIIII)Z")
    public final boolean method2145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field5830.field1756 * arg2 + this.field5830.field1759 * arg0 + this.field5830.field1757 * arg1 >> 15) + this.field5830.field1755;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field5830.field1756 * arg5 + this.field5830.field1759 * arg3 + this.field5830.field1757 * arg4 >> 15) + this.field5830.field1755;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field5815 || var8 >= this.field5815) && (var7 <= this.field5802 || var8 <= this.field5802)) {
            int var9 = ((this.field5830.field1754 * arg2 + this.field5830.field1753 * arg0 + this.field5830.field1751 * arg1 >> 15) + this.field5830.field1762) * this.field5840 / var7;
            int var10 = ((this.field5830.field1754 * arg5 + this.field5830.field1753 * arg3 + this.field5830.field1751 * arg4 >> 15) + this.field5830.field1762) * this.field5840 / var8;
            if (var9 < this.field5829 && var10 < this.field5829 || var9 > this.field5810 && var10 > this.field5810) {
                return false;
            } else {
                int var11 = ((this.field5830.field1758 * arg2 + this.field5830.field1761 * arg0 + this.field5830.field1752 * arg1 >> 15) + this.field5830.field1760) * this.field5808 / var7;
                int var12 = ((this.field5830.field1758 * arg5 + this.field5830.field1761 * arg3 + this.field5830.field1752 * arg4 >> 15) + this.field5830.field1760) * this.field5808 / var8;
                return (var11 >= this.field5832 || var12 >= this.field5832) && (var11 <= this.field5831 || var12 <= this.field5831);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "()Z")
    public final boolean method2172() {
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lm;IIII)Lqc;")
    public final class95 method2164(class180 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class366(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V")
    public final void method2133(int arg0) {
        if (this.field5821 != arg0) {
            this.field5821 = arg0;
            this.field5812 = new class50[this.field5821];
            for (int var2 = 0; var2 < this.field5821; ++var2) {
                this.field5812[var2] = new class50(this);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(IIIIII)V")
    public final void method2030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method2093(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method2093(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method2190(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method2190(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5838) {
                    var10 += (this.field5838 - arg0) * var12;
                    arg0 = this.field5838;
                }
                if (var13 >= this.field5839) {
                    var13 = this.field5839 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5833 && var17 < this.field5796) {
                                int var18 = this.field5801 * var17 + arg0;
                                int var19 = this.field5798[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5798[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5833 && var21 < this.field5796) {
                                int var22 = this.field5801 * var21 + arg0;
                                int var23 = this.field5798[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5798[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5833 && var27 < this.field5796) {
                            this.field5798[this.field5801 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5833) {
                    var29 += (this.field5833 - arg1) * var31;
                    arg1 = this.field5833;
                }
                if (var32 >= this.field5796) {
                    var32 = this.field5796 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5838 && var46 < this.field5839) {
                            this.field5798[this.field5801 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5838 && var36 < this.field5839) {
                            int var37 = this.field5801 * arg1 + var36;
                            int var38 = this.field5798[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5798[this.field5801 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5838 && var40 < this.field5839) {
                            int var41 = this.field5801 * arg1 + var40;
                            int var42 = this.field5798[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5798[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lj;Lj;FLj;)Lj;")
    public final class269 method2027(class269 arg0, class269 arg1, float arg2, class269 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "()V")
    public final void method2108() {
    }

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "(I)Z")
    public final boolean method2540(int arg0) {
        return this.field5841.method1756(false, arg0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method2065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5801 * arg1 + arg0;
            int var15 = this.field5801 - arg2;
            if (arg1 + arg3 > this.field5796) {
                arg3 -= arg1 + arg3 - this.field5796;
            }
            if (arg1 < this.field5833) {
                int var16 = this.field5833 - arg1;
                arg3 -= var16;
                var14 += this.field5801 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field5839) {
                int var17 = arg0 + arg2 - this.field5839;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5838) {
                int var18 = this.field5838 - arg0;
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
                            int var28 = this.field5798[var14];
                            this.field5798[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5798[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5798[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5798[var14++] = arg5;
                        } else {
                            this.field5798[var14++] = arg4;
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

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "(I)I")
    public final int method2541(int arg0) {
        return this.field5841.method1760(-19907, arg0).field2295 & 65535;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "()Z")
    public final boolean method2542() {
        return this.field5804;
    }

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "()Z")
    public final boolean method2147() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "(I)V")
    public final void method2031(int arg0) {
        int var2 = arg0 - this.field5826;
        for (Object var3 = this.field5800.method206(-129); var3 != null; var3 = this.field5800.method213(-128)) {
            class298 var4 = (class298) var3;
            if (var4.field4281) {
                var4.field4280 += var2;
                int var5 = var4.field4280 / 20;
                if (var5 > 0) {
                    class175 var6 = this.field5841.method1760(-19907, var4.field4283);
                    var4.method1890(var6.field2282 * var2 * 50 / 1000, var6.field2276 * var2 * 50 / 1000);
                    var4.field4280 -= var5 * 20;
                }
                var4.field4281 = false;
            }
        }
        this.field5826 = arg0;
        this.field5814.method215(0, 5);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIIIII)V")
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5838) {
            arg2 -= this.field5838 - arg0;
            arg0 = this.field5838;
        }
        if (arg1 < this.field5833) {
            arg3 -= this.field5833 - arg1;
            arg1 = this.field5833;
        }
        if (arg0 + arg2 > this.field5839) {
            arg2 = this.field5839 - arg0;
        }
        if (arg1 + arg3 > this.field5796) {
            arg3 = this.field5796 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field5839 && arg1 <= this.field5796) {
            int var7 = this.field5801 - arg2;
            int var8 = this.field5801 * arg1 + arg0;
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
                            this.field5798[var24] = arg4;
                            ++var24;
                            this.field5798[var24] = arg4;
                            ++var24;
                            this.field5798[var24] = arg4;
                            ++var24;
                            this.field5798[var24] = arg4;
                            ++var24;
                            this.field5798[var24] = arg4;
                            ++var24;
                            this.field5798[var24] = arg4;
                            ++var24;
                            this.field5798[var24] = arg4;
                            ++var24;
                            this.field5798[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5798[var24] = arg4;
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
                        int var14 = this.field5798[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field5798[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5798[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5798[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lj;)V")
    public final void method2047(class269 arg0) {
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([I)V")
    public final void method2101(int[] arg0) {
        arg0[0] = this.field5838;
        arg0[1] = this.field5833;
        arg0[2] = this.field5839;
        arg0[3] = this.field5796;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V")
    public final void method2077(boolean arg0) {
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lfi;[Ln;Z)Ldr;")
    public final class213 method2179(class165 arg0, class25[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field442;
            var5[var7] = arg1[var7].field438;
            if (arg1[var7].field441 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class98(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class286(this, arg0, arg1, var4, var5);
        } else {
            return new class43(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "()I")
    public final int method2092() {
        int var1 = this.field5813;
        this.field5813 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "()Z")
    public final boolean method2165() {
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "()V")
    public final void method2174() {
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lea;III)V")
    public final void method2543(class58 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field832;
        if (var6 == -1) {
            this.method2116(arg1, arg2, var5, arg0.field839, 1);
        } else {
            if (this.field5843 == null || (long) var6 != this.field5843.field5903) {
                this.field5843 = (class188) this.field5814.method209(120, (long) var6);
            }
            if (this.field5843 == null) {
                int[] var7 = this.method2538(var6);
                if (var7 == null) {
                    return;
                }
                this.field5843 = new class188();
                this.field5843.field2550 = this.method2534(var6);
                int var8 = this.field5843.field2550 ? 64 : 128;
                this.field5843.field2548 = this.method2158(var7, 0, var8, var8, var8);
                this.field5814.method202(true, this.field5843, (long) var6);
            }
            if (this.field5843.field2550) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field5843.field2548.method32(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field839, 1);
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(IIII)V")
    public final void method2123(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "()Lao;")
    public final class116 method2026() {
        class50 var1 = this.method2537(Thread.currentThread());
        return var1.field700;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([Lqc;Lao;[Lnp;I)V")
    public final void method2080(class95[] arg0, class116 arg1, class206[] arg2, int arg3) {
        class366[] var5 = new class366[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class366) arg0[var6];
            }
        }
        class366 var7 = class366.method2419(this, var5);
        var7.method2413(arg1, arg2 != null ? arg2[0] : null, (class125) null, arg3);
    }

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "()V")
    public final void method2034() {
        this.field5838 = 0;
        this.field5833 = 0;
        this.field5839 = this.field5801;
        this.field5796 = this.field5836;
        this.method2539();
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(IIIIII)Lj;")
    public final class269 method2178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(II)V")
    public final void method2097(int arg0, int arg1) {
        this.field5815 = arg0;
        this.field5802 = arg1;
        this.field5820 = this.field5802 - 255;
        this.method2545();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lqc;Llc;Lao;Lnp;I)V")
    public final void method2162(class95 arg0, class125 arg1, class116 arg2, class206 arg3, int arg4) {
        ((class366) arg0).method2413(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "()Z")
    public final boolean method2122() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "(I)Z")
    public final boolean method2544(int arg0) {
        return this.field5841.method1760(-19907, arg0).field2274;
    }

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "()Z")
    public final boolean method2176() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)[I")
    public final int[] method2119(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5801 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5798[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "()Z")
    public final boolean method2073() {
        return true;
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)V")
    public final void method2118(int arg0) {
        this.method2188(0, 0, this.field5801, this.field5836, arg0, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[Lfe;)V")
    public final void method2151(int arg0, class403[] arg1) {
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
    public final void method2120(int arg0) {
        this.field5812[arg0].method349((Runnable) null, -112);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([IIIII)Lqa;")
    public final class243 method2158(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class3(this, arg0, arg1, arg2, arg3, arg4) : new class338(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class3(this, arg0, arg1, arg2, arg3, arg4) : new class338(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "()I")
    public final int method2099() {
        return this.field5802;
    }

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "()I")
    public final int method2039() {
        return 0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
    public final int method2068(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "()V")
    private final void method2545() {
        if (this.field5805 != 0.0F) {
            float var1 = (float) this.field5802;
            float var2 = (float) this.field5815;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field5834 / (this.field5834 + this.field5805);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field5805;
            this.field5822 = (int) (((float) this.field5802 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field5822 = this.field5802;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class50 var11 = this.method2537(Thread.currentThread());
        class254 var12 = var11.field704;
        var12.field3696 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field3696 = false;
            var12.field3692 = 0;
            var12.field3693 = true;
            var12.method1597(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field3696 = false;
            var12.field3692 = 255 - var13;
            var12.field3693 = true;
            var12.method1597(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field3696 = true;
    }

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "()Z")
    public final boolean method2086() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "()Z")
    public final boolean method2089() {
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lqm;)V")
    public final void method2138(class288 arg0) {
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IFFFFF)V")
    public final void method2139(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5806 = (int) (arg1 * 65535.0F);
        this.field5809 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5824 = (int) (arg3 * 65535.0F / var7);
        this.field5842 = (int) (arg4 * 65535.0F / var7);
        this.field5819 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "()F")
    public final float method2177() {
        return this.field5805;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(FF)V")
    public final void method2107(float arg0, float arg1) {
        this.field5834 = arg0;
        this.field5805 = arg1;
        this.method2545();
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
    public final void method2167(boolean arg0) {
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILsn;II)V")
    public final void method2106(int arg0, class449 arg1, int arg2, int arg3) {
        class35 var5 = (class35) arg1;
        int[] var6 = var5.field568;
        int[] var7 = var5.field577;
        int var8;
        if (this.field5796 < var6.length + arg3) {
            var8 = this.field5796 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5833 > arg3) {
            var9 = this.field5833 - arg3;
            arg3 = this.field5833;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5801 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5838 > var12) {
                    var13 -= this.field5838 - var12;
                    var12 = this.field5838;
                }
                if (this.field5839 < var12 + var13) {
                    var13 = this.field5839 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5798[var14++] = arg0;
                }
                var10 += this.field5801;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([Lqc;Llc;Lao;[Lnp;I)V")
    public final void method2081(class95[] arg0, class125 arg1, class116 arg2, class206[] arg3, int arg4) {
        class366[] var6 = new class366[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class366) arg0[var7];
            }
        }
        class366 var8 = class366.method2419(this, var6);
        var8.method2413(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfl;I)V")
    public class389(Canvas arg0, class386 arg1, int arg2) {
        this.field5835 = arg0;
        this.field5841 = arg1;
        super.field6424 = arg2;
        this.field5816 = class219.method1361(this.field5835, (byte) 127);
        this.field5798 = this.field5816.field1321;
        this.field5801 = this.field5816.field1327;
        this.field5836 = this.field5816.field1325;
        this.method2536();
    }
}
