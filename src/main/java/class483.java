import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class483 extends class165 {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
    private boolean field6739;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Z")
    private boolean field6743;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lwaa;")
    private class652 field6744;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    private int field6746;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public int field6753;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    private int field6748;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field6749;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    public int field6770;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public int field6766;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Z")
    private boolean field6769;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public int field6772;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public int field6771;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public int field6763;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public int field6776;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lmq;")
    private class472 field6750;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    private int field6780;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Lmq;")
    private class472 field6758;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Lae;")
    public class228 field6757;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    private int field6740;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public int field6745;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field6747;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public int field6752;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public int field6754;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public int field6755;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public int field6756;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public int field6759;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    private int field6764;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public int field6767;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    private int field6773;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public int field6774;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public int field6777;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    private int field6778;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Lih;")
    private class649 field6742;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "Lf;")
    private class701 field6768;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "Lf;")
    private class701 field6781;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6741;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "[I")
    public int[] field6751;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "[I")
    public int[] field6760;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "[Lqr;")
    private class59[] field6775;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "()Z", line = 3)
    public final boolean method299() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "(IIIIII)Z", line = 9)
    public final boolean method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field6757.field2969 + (float) arg0 * this.field6757.field2960 + (float) arg1 * this.field6757.field2949 + this.field6757.field2952;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field6757.field2969 + (float) arg3 * this.field6757.field2960 + (float) arg4 * this.field6757.field2949 + this.field6757.field2952;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field6762) || !(var8 < (float) this.field6762)) && (!(var7 > (float) this.field6765) || !(var8 > (float) this.field6765))) {
            int var9 = (int) (((float) arg2 * this.field6757.field2965 + (float) arg0 * this.field6757.field2953 + (float) arg1 * this.field6757.field2943 + this.field6757.field2951) * (float) this.field6772 / var7);
            int var10 = (int) (((float) arg5 * this.field6757.field2965 + (float) arg3 * this.field6757.field2953 + (float) arg4 * this.field6757.field2943 + this.field6757.field2951) * (float) this.field6772 / var8);
            if (var9 < this.field6759 && var10 < this.field6759 || var9 > this.field6754 && var10 > this.field6754) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field6757.field2942 + (float) arg0 * this.field6757.field2957 + (float) arg1 * this.field6757.field2962 + this.field6757.field2954) * (float) this.field6771 / var7);
                int var12 = (int) (((float) arg5 * this.field6757.field2942 + (float) arg3 * this.field6757.field2957 + (float) arg4 * this.field6757.field2962 + this.field6757.field2954) * (float) this.field6771 / var8);
                return (var11 >= this.field6767 || var12 >= this.field6767) && (var11 <= this.field6756 || var12 <= this.field6756);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "()[I", line = 38)
    public final int[] method264() {
        return new int[] { this.field6777, this.field6774, this.field6772, this.field6771 };
    }

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "()V", line = 40)
    public final void method283() {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Runnable;)Lqr;", line = 45)
    public final class59 method2816(Runnable arg0) {
        for (int var2 = 0; var2 < this.field6779; ++var2) {
            if (this.field6775[var2].field940 == arg0) {
                return this.field6775[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "()V", line = 59)
    public final void method291() {
        for (int var1 = 0; var1 < this.field6775.length; ++var1) {
            this.field6775[var1].field927 = this.field6775[var1].field930;
            this.field6775[var1].field929 = false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)Lcaa;", line = 70)
    public final class275 method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIII)V", line = 76)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class59 var11 = this.method2816(Thread.currentThread());
        class211 var12 = var11.field965;
        var12.field2558 = false;
        int var13 = arg0 - this.field6759;
        int var14 = arg2 - this.field6759;
        int var15 = arg4 - this.field6759;
        int var16 = arg1 - this.field6767;
        int var17 = arg3 - this.field6767;
        int var18 = arg5 - this.field6767;
        var12.field2572 = var13 < 0 || var13 > var12.field2573 || var14 < 0 || var14 > var12.field2573 || var15 < 0 || var15 > var12.field2573;
        var12.field2569 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field2563 = 255 - var19;
                var12.field2562 = false;
                var12.method1257(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field2563 = 128;
                var12.field2562 = true;
                var12.method1257(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field2563 = 0;
            var12.field2562 = false;
            var12.method1257(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field2558 = true;
        var12.field2569 = false;
    }

    @OriginalMember(owner = "client!cb", name = "MA", descriptor = "(III[I)V", line = 120)
    public final void method322(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field6757.field2969 + (float) arg0 * this.field6757.field2960 + (float) arg1 * this.field6757.field2949 + this.field6757.field2952;
        if (!(var5 < (float) this.field6762) && !(var5 > (float) this.field6765)) {
            int var6 = (int) (((float) arg2 * this.field6757.field2965 + (float) arg0 * this.field6757.field2953 + (float) arg1 * this.field6757.field2943 + this.field6757.field2951) * (float) this.field6772 / var5);
            int var7 = (int) (((float) arg2 * this.field6757.field2942 + (float) arg0 * this.field6757.field2957 + (float) arg1 * this.field6757.field2962 + this.field6757.field2954) * (float) this.field6771 / var5);
            arg3[0] = var6 - this.field6759;
            arg3[1] = var7 - this.field6767;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIILua;II)V", line = 137)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class616 arg6, int arg7, int arg8) {
        class676 var10 = (class676) arg6;
        int[] var11 = var10.field9691;
        int[] var12 = var10.field9694;
        int var13 = this.field6761 > arg8 ? this.field6761 : arg8;
        int var14 = this.field6776 < var11.length + arg8 ? this.field6776 : var11.length + arg8;
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
            if (arg0 < this.field6763) {
                var18 += (this.field6763 - arg0) * var20;
                arg0 = this.field6763;
            }
            if (var21 >= this.field6749) {
                var21 = this.field6749 - 1;
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
                                int var28 = this.field6755 * var25 + arg0;
                                int var29 = this.field6751[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field6751[var28] = var23 + var30;
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
                                int var34 = this.field6755 * var31 + arg0;
                                int var35 = this.field6751[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field6751[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field6751[this.field6755 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field6763 && var64 < this.field6749 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field6751[this.field6755 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field6763 && var50 < this.field6749 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field6755 * arg1 + var50;
                        int var54 = this.field6751[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field6751[this.field6755 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field6763 && var56 < this.field6749 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field6755 * arg1 + var56;
                        int var60 = this.field6751[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field6751[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()Z", line = 375)
    public final boolean method215() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)Z", line = 378)
    public final boolean method2817(int arg0) {
        return super.field2023.method395(arg0, 28576);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 381)
    public class483(Canvas arg0, class212 arg1) {
        this(arg1);
        this.method257(arg0);
        this.method294(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "()Lq;", line = 386)
    public final class394 method238() {
        return this.field6757;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 389)
    public final class37 method220(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class453(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V", line = 391)
    public final void method296(boolean arg0) {
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Le;", line = 394)
    public final class493 method210(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lfa;)V", line = 1060)
    private class483(class212 arg0) {
        super(arg0);
        this.field6739 = false;
        this.field6743 = false;
        this.field6744 = new class652(4);
        this.field6746 = 0;
        this.field6753 = 45823;
        this.field6748 = 0;
        this.field6761 = 0;
        this.field6762 = 50;
        this.field6765 = 3500;
        this.field6749 = 0;
        this.field6770 = 78642;
        this.field6766 = 75518;
        this.field6769 = false;
        this.field6772 = 512;
        this.field6771 = 512;
        this.field6763 = 0;
        this.field6776 = 0;
        this.field6750 = new class472(16);
        this.field6780 = -1;
        this.field6758 = new class472(256);
        this.field6757 = new class228();
        this.method252(1);
        this.method222(0);
        class357.method2012(true, false, (byte) 54);
        this.field6743 = true;
        this.field6740 = (int) class301.method1787((byte) 103);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 401)
    public final void method240(Rectangle[] arg0, int arg1) throws class365 {
        if (this.field6741 != null && this.field6742 != null) {
            try {
                Graphics var3 = this.field6741.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field6755 && var5.y <= this.field6764 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field6742.method950(var5.height, var5.y, var5.x, var3, var5.width, 42);
                    }
                }
            } catch (Exception var6) {
                this.field6741.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 431)
    public final void method257(Canvas arg0) {
        class649 var2 = (class649) this.field6744.method3678((long) arg0.hashCode(), -125);
        if (var2 == null) {
            class649 var3 = class664.method3750(114, arg0);
            this.field6744.method3670((long) arg0.hashCode(), var3, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!cb", name = "FA", descriptor = "(ILua;II)V", line = 443)
    public final void method245(int arg0, class616 arg1, int arg2, int arg3) {
        class676 var5 = (class676) arg1;
        int[] var6 = var5.field9691;
        int[] var7 = var5.field9694;
        int var8;
        if (this.field6776 < var6.length + arg3) {
            var8 = this.field6776 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field6761 > arg3) {
            var9 = this.field6761 - arg3;
            arg3 = this.field6761;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field6755 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field6763 > var12) {
                    var13 -= this.field6763 - var12;
                    var12 = this.field6763;
                }
                if (this.field6749 < var12 + var13) {
                    var13 = this.field6749 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field6751[var14++] = arg0;
                }
                var10 += this.field6755;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I", line = 500)
    public final int method306(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cb", name = "va", descriptor = "(I)V", line = 503)
    public final void method312(int arg0) {
    }

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "()V", line = 508)
    private final void method2818() {
        for (int var1 = 0; var1 < this.field6779; ++var1) {
            this.field6775[var1].method590(true);
        }
        this.method249();
    }

    @OriginalMember(owner = "client!cb", name = "GA", descriptor = "(II)V", line = 517)
    public final void method297(int arg0, int arg1) {
        class59 var3 = this.method2816(Thread.currentThread());
        this.field6762 = arg0;
        this.field6765 = arg1;
        var3.field938 = this.field6765 - 255;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Le;)V", line = 522)
    public final void method265(class493 arg0) {
    }

    @OriginalMember(owner = "client!cb", name = "BA", descriptor = "()I", line = 525)
    public final int method260() {
        return this.field6762;
    }

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "()V", line = 528)
    public final void method293() throws class365 {
        if (this.field6741 != null && this.field6742 != null) {
            try {
                Graphics var1 = this.field6741.getGraphics();
                this.field6742.method952(var1, 0, 0, (byte) -31);
            } catch (Exception var2) {
                this.field6741.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lso;)V", line = 545)
    public final void method228(class436 arg0) {
        class59 var2 = this.method2816(Thread.currentThread());
        class589 var3 = arg0.field6248.field1611;
        for (class589 var4 = var3.field8537; var3 != var4; var4 = var4.field8537) {
            class29 var5 = (class29) var4;
            int var6 = var5.field624 >> 12;
            int var7 = var5.field623 >> 12;
            int var8 = var5.field625 >> 12;
            float var9 = (float) var8 * this.field6757.field2969 + (float) var6 * this.field6757.field2960 + (float) var7 * this.field6757.field2949 + this.field6757.field2952;
            if (!(var9 < (float) this.field6762) && !(var9 > (float) var2.field938)) {
                int var10 = (int) (((float) var8 * this.field6757.field2965 + (float) var6 * this.field6757.field2953 + (float) var7 * this.field6757.field2943 + this.field6757.field2951) * (float) this.field6772 / var9) + this.field6777;
                int var11 = (int) (((float) var8 * this.field6757.field2942 + (float) var6 * this.field6757.field2957 + (float) var7 * this.field6757.field2962 + this.field6757.field2954) * (float) this.field6771 / var9) + this.field6774;
                if (var10 >= this.field6763 && var10 <= this.field6749 && var11 >= this.field6761 && var11 <= this.field6776) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method2822(var5, var10, var11, (int) var9, (int) ((float) (this.field6772 * var5.field622 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z", line = 583)
    public final boolean method211() {
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "(I)[I", line = 588)
    public final int[] method2819(int arg0) {
        class472 var2 = this.field6758;
        class179 var3;
        synchronized (this.field6758) {
            var3 = (class179) this.field6758.method2766(-123, (long) arg0);
            if (var3 == null) {
                if (!super.field2023.method395(arg0, 28576)) {
                    return null;
                }
                class352 var5 = super.field2023.method397(arg0, (byte) -126);
                int var6 = !var5.field4708 && !this.field6769 ? 128 : 64;
                var3 = new class179(arg0, var6, super.field2023.method400(var6, true, var6, (byte) -73, arg0, 0.7F), var5.field4709);
                this.field6758.method2772(var3, true, (long) arg0);
            }
        }
        var3.field2202 = true;
        return var3.method1116();
    }

    @OriginalMember(owner = "client!cb", name = "pa", descriptor = "(III)V", line = 610)
    public final void method273(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6775.length; ++var4) {
            class59 var5 = this.field6775[var4];
            var5.field927 = arg0 & 16777215;
            int var6 = var5.field927 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field927 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field927 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field927 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field942 = false;
            } else {
                var5.field942 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(IIIII)V", line = 642)
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field6761) {
            var6 = this.field6761;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field6776) {
            var7 = this.field6776;
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
                if (var64 < this.field6763) {
                    var64 = this.field6763;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field6749) {
                    var65 = this.field6749;
                }
                int var66 = this.field6755 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field6751[var66++] = arg3;
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
                if (var60 < this.field6763) {
                    var60 = this.field6763;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field6749 - 1) {
                    var61 = this.field6749 - 1;
                }
                int var62 = this.field6755 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field6751[var62++] = arg3;
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
                if (var28 < this.field6763) {
                    var28 = this.field6763;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field6749) {
                    var29 = this.field6749;
                }
                int var30 = this.field6755 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field6751[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field6751[var30++] = var15 + var33;
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
                if (var22 < this.field6763) {
                    var22 = this.field6763;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field6749 - 1) {
                    var23 = this.field6749 - 1;
                }
                int var24 = this.field6755 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field6751[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field6751[var24++] = var15 + var27;
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
                if (var47 < this.field6763) {
                    var47 = this.field6763;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field6749) {
                    var48 = this.field6749;
                }
                int var49 = this.field6755 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field6751[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field6751[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field6763) {
                    var39 = this.field6763;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field6749 - 1) {
                    var40 = this.field6749 - 1;
                }
                int var41 = this.field6755 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field6751[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field6751[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "()V", line = 928)
    public final void method227() {
    }

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "()V", line = 931)
    private final void method2820() {
        this.field6759 = this.field6763 - this.field6777;
        this.field6754 = this.field6749 - this.field6777;
        this.field6767 = this.field6761 - this.field6774;
        this.field6756 = this.field6776 - this.field6774;
        for (int var1 = 0; var1 < this.field6779; ++var1) {
            class211 var5 = this.field6775[var1].field965;
            var5.field2564 = this.field6777 - this.field6763;
            var5.field2559 = this.field6774 - this.field6761;
            var5.field2573 = this.field6749 - this.field6763;
            var5.field2575 = this.field6776 - this.field6761;
        }
        int var2 = this.field6761 * this.field6755 + this.field6763;
        for (int var3 = this.field6761; var3 < this.field6776; ++var3) {
            for (int var4 = 0; var4 < this.field6779; ++var4) {
                this.field6775[var4].field965.field2566[var3 - this.field6761] = var2;
            }
            var2 += this.field6755;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V", line = 970)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class59 var8 = this.method2816(Thread.currentThread());
        class211 var9 = var8.field965;
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
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method1273();
            int var24 = arg1 - var9.method1268();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field2563 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2563 = 255 - (arg4 >>> 24);
            }
            this.method309(false);
            var9.field2572 = var25 < 0 || var25 > var9.field2573 || var26 < 0 || var26 > var9.field2573 || var27 < 0 || var27 > var9.field2573;
            var9.method1263(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field2572 = var25 < 0 || var25 > var9.field2573 || var27 < 0 || var27 > var9.field2573 || var28 < 0 || var28 > var9.field2573;
            var9.method1263(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method309(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "()V", line = 1043)
    public final void method250() {
        if (this.field6741 != null) {
            this.field6751 = this.field6742.field9210;
            this.field6755 = this.field6742.field9206;
            this.field6764 = this.field6742.field9209;
        } else {
            this.field6755 = 1;
            this.field6764 = 1;
            this.field6751 = null;
        }
        this.field6768 = null;
        this.method2818();
    }

    @OriginalMember(owner = "client!cb", name = "YA", descriptor = "(IIII)V", line = 1071)
    public final void method261(int arg0, int arg1, int arg2, int arg3) {
        class59 var5 = this.method2816(Thread.currentThread());
        var5.field935 = arg0;
        var5.field927 = arg1;
        var5.field934 = arg2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIF)Lul;", line = 1079)
    public final class530 method243(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lso;I)V", line = 1083)
    public final void method223(class436 arg0, int arg1) {
        class59 var3 = this.method2816(Thread.currentThread());
        class589 var4 = arg0.field6248.field1611;
        for (class589 var5 = var4.field8537; var4 != var5; var5 = var5.field8537) {
            class29 var6 = (class29) var5;
            int var7 = var6.field624 >> 12;
            int var8 = var6.field623 >> 12;
            int var9 = var6.field625 >> 12;
            float var10 = (float) var9 * this.field6757.field2969 + (float) var7 * this.field6757.field2960 + (float) var8 * this.field6757.field2949 + this.field6757.field2952;
            if (!(var10 < (float) this.field6762) && !(var10 > (float) var3.field938)) {
                int var11 = (int) (((float) var9 * this.field6757.field2965 + (float) var7 * this.field6757.field2953 + (float) var8 * this.field6757.field2943 + this.field6757.field2951) * (float) this.field6772 / (float) arg1) + this.field6777;
                int var12 = (int) (((float) var9 * this.field6757.field2942 + (float) var7 * this.field6757.field2957 + (float) var8 * this.field6757.field2962 + this.field6757.field2954) * (float) this.field6771 / (float) arg1) + this.field6774;
                if (var11 >= this.field6763 && var11 <= this.field6749 && var12 >= this.field6761 && var12 <= this.field6776) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method2822(var6, var11, var12, (int) var10, (this.field6772 * var6.field622 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)[I", line = 1122)
    private final int[] method2821(int arg0) {
        class472 var2 = this.field6758;
        class179 var3;
        synchronized (this.field6758) {
            var3 = (class179) this.field6758.method2766(-122, (long) arg0);
            if (var3 == null) {
                if (!super.field2023.method395(arg0, 28576)) {
                    return null;
                }
                class352 var5 = super.field2023.method397(arg0, (byte) 69);
                int var6 = !var5.field4708 && !this.field6769 ? 128 : 64;
                var3 = new class179(arg0, var6, super.field2023.method392(true, var6, arg0, var6, -121, 0.7F), var5.field4709);
                this.field6758.method2772(var3, true, (long) arg0);
            }
        }
        var3.field2202 = true;
        return var3.method1116();
    }

    @OriginalMember(owner = "client!cb", name = "oa", descriptor = "([I)V", line = 1142)
    public final void method251(int[] arg0) {
        arg0[0] = this.field6763;
        arg0[1] = this.field6761;
        arg0[2] = this.field6749;
        arg0[3] = this.field6776;
    }

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "()V", line = 1148)
    public final void method286() {
        if (this.field6743) {
            class54.method567(true, true, false);
            this.field6743 = false;
        }
        this.field6742 = null;
        this.field6741 = null;
        this.field6744 = null;
        this.field6739 = true;
    }

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "()Lq;", line = 1160)
    public final class394 method305() {
        return new class228();
    }

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "(IIIIII)V", line = 1164)
    public final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field6763) {
            arg2 -= this.field6763 - arg0;
            arg0 = this.field6763;
        }
        if (arg1 < this.field6761) {
            arg3 -= this.field6761 - arg1;
            arg1 = this.field6761;
        }
        if (arg0 + arg2 > this.field6749) {
            arg2 = this.field6749 - arg0;
        }
        if (arg1 + arg3 > this.field6776) {
            arg3 = this.field6776 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field6749 && arg1 <= this.field6776) {
            int var7 = this.field6755 - arg2;
            int var8 = this.field6755 * arg1 + arg0;
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
                            this.field6751[var24] = arg4;
                            ++var24;
                            this.field6751[var24] = arg4;
                            ++var24;
                            this.field6751[var24] = arg4;
                            ++var24;
                            this.field6751[var24] = arg4;
                            ++var24;
                            this.field6751[var24] = arg4;
                            ++var24;
                            this.field6751[var24] = arg4;
                            ++var24;
                            this.field6751[var24] = arg4;
                            ++var24;
                            this.field6751[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field6751[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field6751[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field6751[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field6751[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field6751[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 1299)
    public final void method307(int arg0) {
        this.field6775[arg0].method592((byte) -8, (Runnable) null);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Lul;)V", line = 1302)
    public final void method284(int arg0, class530[] arg1) {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I[I)Lua;", line = 1305)
    public final class616 method213(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class676(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "()Z", line = 1308)
    public final boolean method237() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "()Lik;", line = 1313)
    public final class191 method314() {
        return new class191(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lmca;IIII)V", line = 1317)
    private final void method2822(class29 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field626;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2824(arg1, arg2, arg3, arg4, arg0.field618, 1);
        } else {
            if (this.field6780 != var6) {
                class701 var9 = (class701) this.field6750.method2766(-128, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method2821(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2826(var6) ? 64 : 128;
                    var9 = this.method311(var10, 0, var11, var11, var11);
                    this.field6750.method2772(var9, true, (long) var6);
                }
                this.field6780 = var6;
                this.field6781 = var9;
            }
            ++var8;
            ((class135) this.field6781).method9(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field618, 1, 1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 1355)
    public final void method295(boolean arg0) {
        this.field6769 = arg0;
        this.field6758.method2776(false);
    }

    @OriginalMember(owner = "client!cb", name = "ra", descriptor = "(F)V", line = 1359)
    public final void method239(float arg0) {
        this.field6766 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "(IIIII)V", line = 1362)
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field6763 && arg0 < this.field6749) {
            if (arg1 < this.field6761) {
                arg2 -= this.field6761 - arg1;
                arg1 = this.field6761;
            }
            if (arg1 + arg2 > this.field6776) {
                arg2 = this.field6776 - arg1;
            }
            int var6 = this.field6755 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6755 * var10 + var6;
                        int var12 = this.field6751[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field6751[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field6755 * var14 + var6;
                        int var16 = this.field6751[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field6751[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field6751[this.field6755 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZ)Lf;", line = 1439)
    public final class701 method304(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class2(this, arg0, arg1) : new class41(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!cb", name = "DA", descriptor = "()I", line = 1447)
    public final int method327() {
        int var1 = this.field6748;
        this.field6748 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIII)V", line = 1452)
    public final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method290(arg0, arg1, arg2, arg4, arg5);
        this.method290(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method310(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method310(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1458)
    public final void method256(Canvas arg0) {
        if (this.field6741 == arg0) {
            this.method294((Canvas) null);
        }
        class649 var2 = (class649) this.field6744.method3678((long) arg0.hashCode(), -119);
        if (var2 != null) {
            var2.method3045(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lkk;IIII)Lda;", line = 1469)
    public final class55 method274(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class11(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "JA", descriptor = "()V", line = 1472)
    public final void method249() {
        this.field6763 = 0;
        this.field6761 = 0;
        this.field6749 = this.field6755;
        this.field6776 = this.field6764;
        this.method2820();
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V", line = 1479)
    public final void method252(int arg0) {
        this.field6779 = arg0;
        this.field6775 = new class59[this.field6779];
        for (int var2 = 0; var2 < this.field6779; ++var2) {
            this.field6775[var2] = new class59(this);
        }
    }

    @OriginalMember(owner = "client!cb", name = "AA", descriptor = "(III[I)V", line = 1493)
    public final void method329(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field6757.field2969 + (float) arg0 * this.field6757.field2960 + (float) arg1 * this.field6757.field2949 + this.field6757.field2952;
        if (!(var5 < (float) this.field6762) && !(var5 > (float) this.field6765)) {
            int var6 = (int) (((float) arg2 * this.field6757.field2965 + (float) arg0 * this.field6757.field2953 + (float) arg1 * this.field6757.field2943 + this.field6757.field2951) * (float) this.field6772 / var5);
            int var7 = (int) (((float) arg2 * this.field6757.field2942 + (float) arg0 * this.field6757.field2957 + (float) arg1 * this.field6757.field2962 + this.field6757.field2954) * (float) this.field6771 / var5);
            if (var6 >= this.field6759 && var6 <= this.field6754 && var7 >= this.field6767 && var7 <= this.field6756) {
                arg3[0] = var6 - this.field6759;
                arg3[1] = var7 - this.field6767;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "()I", line = 1517)
    public final int method287() {
        return this.field6765;
    }

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "(IIII)V", line = 1520)
    public final void method300(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6763 < arg0) {
            this.field6763 = arg0;
        }
        if (this.field6761 < arg1) {
            this.field6761 = arg1;
        }
        if (this.field6749 > arg2) {
            this.field6749 = arg2;
        }
        if (this.field6776 > arg3) {
            this.field6776 = arg3;
        }
        this.method2820();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(FFF)V", line = 1535)
    public final void method255(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "()V", line = 1537)
    public final void method321() {
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1542)
    public final void method275(Canvas arg0) {
        class649 var2 = (class649) this.field6744.method3678((long) arg0.hashCode(), -128);
        if (var2 != null) {
            var2.method3045(true);
            class649 var3 = class664.method3750(-26, arg0);
            this.field6744.method3670((long) arg0.hashCode(), var3, (byte) 127);
            if (this.field6741 == arg0 && this.field6768 == null) {
                this.field6742 = var3;
                this.field6751 = var3.field9210;
                this.field6755 = var3.field9206;
                this.field6764 = var3.field9209;
                if (this.field6773 != this.field6755 || this.field6778 != this.field6764) {
                    this.field6773 = this.field6755;
                    this.field6778 = this.field6764;
                    this.field6760 = new int[this.field6778 * this.field6773];
                }
                this.method2818();
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "la", descriptor = "(IIII)V", line = 1568)
    public final void method301(int arg0, int arg1, int arg2, int arg3) {
        this.field6777 = arg0;
        this.field6774 = arg1;
        this.field6772 = arg2;
        this.field6771 = arg3;
        this.method2820();
    }

    @OriginalMember(owner = "client!cb", name = "XA", descriptor = "(IIIII)V", line = 1576)
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field6761 && arg1 < this.field6776) {
            if (arg0 < this.field6763) {
                arg2 -= this.field6763 - arg0;
                arg0 = this.field6763;
            }
            if (arg0 + arg2 > this.field6749) {
                arg2 = this.field6749 - arg0;
            }
            int var6 = this.field6755 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6751[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field6751[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field6751[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field6751[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field6751[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "()Z", line = 1648)
    public final boolean method225() {
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "ZA", descriptor = "(Z)V", line = 1652)
    public final void method309(boolean arg0) {
        class59 var2 = this.method2816(Thread.currentThread());
        var2.field932 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "da", descriptor = "(IIII)V", line = 1656)
    public final void method292(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field6755) {
            arg2 = this.field6755;
        }
        if (arg3 > this.field6764) {
            arg3 = this.field6764;
        }
        this.field6763 = arg0;
        this.field6749 = arg2;
        this.field6761 = arg1;
        this.field6776 = arg3;
        this.method2820();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1675)
    public final void method294(Canvas arg0) {
        if (arg0 != null) {
            class649 var2 = (class649) this.field6744.method3678((long) arg0.hashCode(), -122);
            if (var2 != null) {
                this.field6741 = arg0;
                this.field6742 = var2;
                if (this.field6768 == null) {
                    this.field6751 = var2.field9210;
                    this.field6755 = var2.field9206;
                    this.field6764 = var2.field9209;
                    if (this.field6773 != this.field6755 || this.field6778 != this.field6764) {
                        this.field6773 = this.field6755;
                        this.field6778 = this.field6764;
                        this.field6760 = new int[this.field6778 * this.field6773];
                    }
                    this.method2818();
                    return;
                }
            }
        } else {
            this.field6741 = null;
            this.field6742 = null;
            if (this.field6768 == null) {
                this.field6751 = null;
                this.field6755 = this.field6764 = 1;
                this.field6773 = this.field6778 = 1;
                this.method2818();
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V", line = 1716)
    public final void method230(int arg0) {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()Z", line = 1719)
    public final boolean method269() {
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "ya", descriptor = "()V", line = 1725)
    public final void method246() {
        if (this.field6763 == 0 && this.field6755 == this.field6749 && this.field6761 == 0 && this.field6776 == this.field6764) {
            int var1 = this.field6760.length;
            int var2 = var1 - var1 & 7;
            int var3 = 0;
            while (var3 < var2) {
                this.field6760[var3++] = Integer.MAX_VALUE;
                this.field6760[var3++] = Integer.MAX_VALUE;
                this.field6760[var3++] = Integer.MAX_VALUE;
                this.field6760[var3++] = Integer.MAX_VALUE;
                this.field6760[var3++] = Integer.MAX_VALUE;
                this.field6760[var3++] = Integer.MAX_VALUE;
                this.field6760[var3++] = Integer.MAX_VALUE;
                this.field6760[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field6760[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field6749 - this.field6763;
            int var5 = this.field6776 - this.field6761;
            int var6 = this.field6755 - var4;
            int var7 = this.field6761 * this.field6755 + this.field6763;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field6760[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "()Z", line = 1805)
    public final boolean method318() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()V", line = 1808)
    public final void method302() {
        this.field6758.method2776(false);
        this.field6750.method2776(false);
    }

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "()I", line = 1813)
    public final int method289() {
        int var1 = this.field6746;
        this.field6746 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIIIIIII)V", line = 1818)
    public final void method2823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field2023.method397(arg6, (byte) -121).field4706) {
                if (this.field6780 != arg6) {
                    class701 var11 = (class701) this.field6750.method2766(-127, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method2821(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2826(arg6) ? 64 : 128;
                        var11 = this.method311(var12, 0, var13, var13, var13);
                        this.field6750.method2772(var11, true, (long) arg6);
                    }
                    this.field6780 = arg6;
                    this.field6781 = var11;
                }
                ((class135) this.field6781).method9(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method2824(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "()Z", line = 1852)
    public final boolean method233() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "()Lq;", line = 1856)
    public final class394 method315() {
        class59 var1 = this.method2816(Thread.currentThread());
        return var1.field939;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(IIIIII)V", line = 1860)
    private final void method2824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field6761) {
            var8 = this.field6761;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field6776) {
            var9 = this.field6776;
        }
        int var10 = var8;
        int var11 = arg3 * arg3;
        int var12 = 0;
        int var13 = arg1 - var8;
        int var14 = var13 * var13;
        int var15 = var14 - var13;
        if (arg1 > var9) {
            arg1 = var9;
        }
        int var16 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var16 == 255) {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var66 = arg0 - var12 + 1;
                if (var66 < this.field6763) {
                    var66 = this.field6763;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field6749) {
                    var67 = this.field6749;
                }
                int var68 = this.field6755 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field6760[var68]) {
                        this.field6751[var68] = arg4;
                    }
                    ++var68;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var57 = arg3;
            int var58 = var10 - arg1;
            int var59 = var58 * var58 + var11;
            int var60 = var59 - arg3;
            int var61 = var59 - var58;
            while (var10 < var9) {
                while (var61 > var11 && var60 > var11) {
                    var61 -= var57-- + var57;
                    var60 -= var57 + var57;
                }
                int var62 = arg0 - var57;
                if (var62 < this.field6763) {
                    var62 = this.field6763;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field6749 - 1) {
                    var63 = this.field6749 - 1;
                }
                int var64 = this.field6755 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field6760[var64]) {
                        this.field6751[var64] = arg4;
                    }
                    ++var64;
                }
                ++var10;
                var61 += var58 + var58;
                var60 += var58++ + var58;
            }
        } else if (arg5 == 1) {
            int var17 = (var16 << 24) + ((arg4 & 16711935) * var16 >> 8 & 16711935) + ((arg4 & 65280) * var16 >> 8 & 65280);
            int var18 = 256 - var16;
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var30 = arg0 - var12 + 1;
                if (var30 < this.field6763) {
                    var30 = this.field6763;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field6749) {
                    var31 = this.field6749;
                }
                int var32 = this.field6755 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field6760[var32]) {
                        int var34 = this.field6751[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field6751[var32] = var17 + var35;
                    }
                    ++var32;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var19 = arg3;
            int var20 = -var13;
            int var21 = var20 * var20 + var11;
            int var22 = var21 - arg3;
            int var23 = var21 - var20;
            while (var10 < var9) {
                while (var23 > var11 && var22 > var11) {
                    var23 -= var19-- + var19;
                    var22 -= var19 + var19;
                }
                int var24 = arg0 - var19;
                if (var24 < this.field6763) {
                    var24 = this.field6763;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field6749 - 1) {
                    var25 = this.field6749 - 1;
                }
                int var26 = this.field6755 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field6760[var26]) {
                        int var28 = this.field6751[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field6751[var26] = var17 + var29;
                    }
                    ++var26;
                }
                ++var10;
                var23 += var20 + var20;
                var22 += var20++ + var20;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var49 = arg0 - var12 + 1;
                if (var49 < this.field6763) {
                    var49 = this.field6763;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field6749) {
                    var50 = this.field6749;
                }
                int var51 = this.field6755 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field6760[var51]) {
                        int var53 = this.field6751[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field6751[var51] = var54 - var56 | var56 - (var56 >>> 8);
                    }
                    ++var51;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var36 = arg3;
            int var37 = -var13;
            int var38 = var37 * var37 + var11;
            int var39 = var38 - arg3;
            int var40 = var38 - var37;
            while (var10 < var9) {
                while (var40 > var11 && var39 > var11) {
                    var40 -= var36-- + var36;
                    var39 -= var36 + var36;
                }
                int var41 = arg0 - var36;
                if (var41 < this.field6763) {
                    var41 = this.field6763;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field6749 - 1) {
                    var42 = this.field6749 - 1;
                }
                int var43 = this.field6755 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field6760[var43]) {
                        int var45 = this.field6751[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field6751[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V", line = 2177)
    public final void method222(int arg0) {
        this.field6775[arg0].method592((byte) -8, Thread.currentThread());
    }

    @OriginalMember(owner = "client!cb", name = "VA", descriptor = "(IFFFFF)V", line = 2180)
    public final void method236(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field6753 = (int) (arg1 * 65535.0F);
        this.field6770 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field6747 = (int) (arg3 * 65535.0F / var7);
        this.field6745 = (int) (arg4 * 65535.0F / var7);
        this.field6752 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lpga;Z)Lf;", line = 2190)
    public final class701 method216(class495 arg0, boolean arg1) {
        int[] var3 = arg0.field6905;
        byte[] var4 = arg0.field6907;
        int var5 = arg0.field6899;
        int var6 = arg0.field6906;
        class135 var11;
        if (arg1 && arg0.field6902 == null) {
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
            var11 = new class157(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field6902;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class2(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class41(this, var14, var5, var6);
            }
        }
        var11.method894(arg0.field6901, arg0.field6900, arg0.field6903, arg0.field6904);
        return var11;
    }

    @OriginalMember(owner = "client!cb", name = "ja", descriptor = "(I)V", line = 2293)
    public final void method323(int arg0) {
        this.method248(0, 0, this.field6755, this.field6764, arg0, 0);
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(IIII)[I", line = 2298)
    public final int[] method325(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field6755 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field6751[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIZ)Lf;", line = 2324)
    public final class701 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field6755 * arg1 + arg0;
        int var8 = this.field6755 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field6751[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class2(this, var6, arg2, arg3);
        } else {
            return new class41(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIIII)Lf;", line = 2357)
    public final class701 method311(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class2(this, arg0, arg1, arg2, arg3, arg4) : new class41(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class2(this, arg0, arg1, arg2, arg3, arg4) : new class41(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "()Z", line = 2392)
    public final boolean method224() {
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()Z", line = 2395)
    public final boolean method218() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lgda;[Lpga;Z)Lla;", line = 2399)
    public final class419 method258(class50 arg0, class495[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6899;
            var5[var7] = arg1[var7].field6906;
            if (arg1[var7].field6902 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class294(this, arg0, arg1, var4, var5);
            } else {
                return new class369(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class250(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)Z", line = 2436)
    public final boolean method2825(int arg0) {
        return super.field2023.method397(arg0, (byte) -122).field4705;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)I", line = 2439)
    public final int method271(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lf;Z)V", line = 2442)
    public final void method241(class701 arg0, boolean arg1) {
        if (arg0 instanceof class41) {
            class41 var3 = (class41) arg0;
            this.field6755 = var3.field1700;
            this.field6764 = var3.field1696;
            this.field6751 = var3.field756;
            this.field6768 = arg0;
        } else {
            if (!(arg0 instanceof class2)) {
                throw new RuntimeException();
            }
            class2 var4 = (class2) arg0;
            this.field6755 = var4.field1700;
            this.field6764 = var4.field1696;
            this.field6751 = var4.field8;
            this.field6768 = arg0;
        }
        this.method2818();
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()I", line = 2468)
    public final int method214() {
        return 0;
    }

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "()Z", line = 2471)
    public final boolean method226() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "()Z", line = 2474)
    public final boolean method247() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "()V", line = 2476)
    public final void method328() {
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "()Z", line = 2479)
    public final boolean method317() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()I", line = 2482)
    public final int method232() {
        return 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 2486)
    public final void method263(int arg0) {
        int var2 = arg0 - this.field6740;
        for (Object var3 = this.field6758.method2768(30860); var3 != null; var3 = this.field6758.method2779(-110)) {
            class179 var4 = (class179) var3;
            if (var4.field2202) {
                var4.field2206 += var2;
                int var5 = var4.field2206 / 20;
                if (var5 > 0) {
                    class352 var6 = super.field2023.method397(var4.field2204, (byte) 110);
                    var4.method1118(var6.field4695 * var2 * 50 / 1000, var6.field4699 * var2 * 50 / 1000);
                    var4.field2206 -= var5 * 20;
                }
                var4.field2202 = false;
            }
        }
        this.field6740 = arg0;
        this.field6750.method2777(5, 32);
        this.field6758.method2777(5, 67);
    }

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)Z", line = 2518)
    public final boolean method2826(int arg0) {
        return this.field6769 || super.field2023.method397(arg0, (byte) -121).field4708;
    }

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "()Z", line = 2526)
    public final boolean method2827() {
        return this.field6739;
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "(I)I", line = 2529)
    public final int method2828(int arg0) {
        return super.field2023.method397(arg0, (byte) 107).field4713 & 65535;
    }

    @OriginalMember(owner = "client!cb", name = "IA", descriptor = "(IIIIII[BII)V", line = 2540)
    public final void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field6755 * arg1 + arg0;
            int var15 = this.field6755 - arg2;
            if (arg1 + arg3 > this.field6776) {
                arg3 -= arg1 + arg3 - this.field6776;
            }
            if (arg1 < this.field6761) {
                int var16 = this.field6761 - arg1;
                arg3 -= var16;
                var14 += this.field6755 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field6749) {
                int var17 = arg0 + arg2 - this.field6749;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field6763) {
                int var18 = this.field6763 - arg0;
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
                            int var28 = this.field6751[var14];
                            this.field6751[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field6751[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field6751[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field6751[var14++] = arg5;
                        } else {
                            this.field6751[var14++] = arg4;
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

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([I)V", line = 2724)
    public final void method319(int[] arg0) {
        arg0[0] = this.field6755;
        arg0[1] = this.field6764;
    }

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "()Z", line = 2728)
    public final boolean method316() {
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lcaa;)V", line = 2731)
    public final void method277(class275 arg0) {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lcaa;Lcaa;FLcaa;)Lcaa;", line = 2737)
    public final class275 method313(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIIII)V", line = 2741)
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method290(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method290(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method310(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method310(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field6763) {
                    var10 += (this.field6763 - arg0) * var12;
                    arg0 = this.field6763;
                }
                if (var13 >= this.field6749) {
                    var13 = this.field6749 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field6761 && var17 < this.field6776) {
                                int var18 = this.field6755 * var17 + arg0;
                                int var19 = this.field6751[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field6751[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field6761 && var21 < this.field6776) {
                                int var22 = this.field6755 * var21 + arg0;
                                int var23 = this.field6751[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field6751[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field6761 && var27 < this.field6776) {
                            this.field6751[this.field6755 * var27 + arg0] = arg4;
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
                if (arg1 < this.field6761) {
                    var29 += (this.field6761 - arg1) * var31;
                    arg1 = this.field6761;
                }
                if (var32 >= this.field6776) {
                    var32 = this.field6776 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field6763 && var46 < this.field6749) {
                            this.field6751[this.field6755 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field6763 && var36 < this.field6749) {
                            int var37 = this.field6755 * arg1 + var36;
                            int var38 = this.field6751[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field6751[this.field6755 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field6763 && var40 < this.field6749) {
                            int var41 = this.field6755 * arg1 + var40;
                            int var42 = this.field6751[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field6751[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!cb", name = "CA", descriptor = "(IIII)V", line = 2967)
    public final void method229(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field6775.length; ++var5) {
            this.field6775[var5].field930 = this.field6775[var5].field927;
            this.field6775[var5].field935 = arg0;
            this.field6775[var5].field927 = arg1;
            this.field6775[var5].field934 = arg2;
            this.field6775[var5].field929 = true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lq;)V", line = 2981)
    public final void method262(class394 arg0) {
        this.field6757 = (class228) arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V", line = 2986)
    public final void method254(int arg0, int arg1, int arg2, int arg3) {
    }
}
