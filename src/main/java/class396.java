import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class396 extends class90 {

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "Z")
    private boolean field5764 = false;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    public int field5768 = 78642;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public int field5762 = 0;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "I")
    public int field5784 = 512;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "Z")
    public boolean field5766 = false;

    @OriginalMember(owner = "client!jn", name = "U", descriptor = "I")
    private int field5789 = 0;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "Z")
    private boolean field5783 = false;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public int field5775 = 50;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "I")
    private int field5780 = 0;

    @OriginalMember(owner = "client!jn", name = "bb", descriptor = "I")
    public int field5796 = 0;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    public int field5782 = 75518;

    @OriginalMember(owner = "client!jn", name = "fb", descriptor = "Z")
    private boolean field5800 = false;

    @OriginalMember(owner = "client!jn", name = "X", descriptor = "I")
    public int field5792 = 0;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    private int field5770 = 0;

    @OriginalMember(owner = "client!jn", name = "Z", descriptor = "I")
    public int field5794 = 45823;

    @OriginalMember(owner = "client!jn", name = "eb", descriptor = "I")
    public int field5799 = 3500;

    @OriginalMember(owner = "client!jn", name = "V", descriptor = "I")
    public int field5790 = 0;

    @OriginalMember(owner = "client!jn", name = "ab", descriptor = "I")
    public int field5795 = 0;

    @OriginalMember(owner = "client!jn", name = "ib", descriptor = "I")
    public int field5803 = 0;

    @OriginalMember(owner = "client!jn", name = "lb", descriptor = "I")
    public int field5806 = 0;

    @OriginalMember(owner = "client!jn", name = "kb", descriptor = "I")
    public int field5805 = 512;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    private int field5771 = 3500;

    @OriginalMember(owner = "client!jn", name = "Y", descriptor = "I")
    public int field5793 = this.field5771 - 255;

    @OriginalMember(owner = "client!jn", name = "hb", descriptor = "Lfg;")
    private class18 field5802 = new class18(16);

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5769;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "Lcj;")
    public class181 field5781;

    @OriginalMember(owner = "client!jn", name = "cb", descriptor = "Lpc;")
    private class34 field5797;

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "[I")
    public int[] field5788;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
    public int field5785;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    private int field5774;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "F")
    private float field5773;

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "F")
    private float field5786;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public int field5763;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public int field5765;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
    public int field5767;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    public int field5772;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    private int field5776;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "I")
    public int field5777;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "I")
    public int field5779;

    @OriginalMember(owner = "client!jn", name = "W", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!jn", name = "db", descriptor = "I")
    public int field5798;

    @OriginalMember(owner = "client!jn", name = "nb", descriptor = "I")
    public int field5808;

    @OriginalMember(owner = "client!jn", name = "gb", descriptor = "Lfg;")
    private class18 field5801;

    @OriginalMember(owner = "client!jn", name = "jb", descriptor = "Lol;")
    public class335 field5804;

    @OriginalMember(owner = "client!jn", name = "ob", descriptor = "Lwb;")
    private class42 field5809;

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "Z")
    public boolean field5787;

    @OriginalMember(owner = "client!jn", name = "mb", descriptor = "[Lsj;")
    private class73[] field5807;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)Z")
    public final boolean method2510(int arg0) {
        return this.field5781.method1415((byte) 95, arg0);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(FF)V")
    public final void method693(float arg0, float arg1) {
        this.field5786 = arg0;
        this.field5773 = arg1;
        this.method2513();
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
    public final void method706(int arg0) {
        this.method681(0, 0, this.field5785, this.field5774, arg0, 0);
    }

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "()V")
    public final void method722() {
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILrn;II)V")
    public final void method766(int arg0, class134 arg1, int arg2, int arg3) {
        class185 var5 = (class185) arg1;
        int[] var6 = var5.field2720;
        int[] var7 = var5.field2725;
        int var8;
        if (this.field5806 < var6.length + arg3) {
            var8 = this.field5806 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5796 > arg3) {
            var9 = this.field5796 - arg3;
            arg3 = this.field5796;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5785 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5803 > var12) {
                    var13 -= this.field5803 - var12;
                    var12 = this.field5803;
                }
                if (this.field5790 < var12 + var13) {
                    var13 = this.field5790 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5788[var14++] = arg0;
                }
                var10 += this.field5785;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(IIII)[I")
    public final int[] method695(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5785 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5788[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[Luc;)V")
    public final void method755(int arg0, class59[] arg1) {
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "()Z")
    public final boolean method668() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIIIII)Lqi;")
    public final class207 method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(Z)V")
    public final void method731(boolean arg0) {
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIZ)Lof;")
    public final class421 method686(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5785 * arg1 + arg0;
        int var8 = this.field5785 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5788[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class404(this, var6, arg2, arg3);
        } else {
            return new class65(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(IIIII)V")
    public final void method729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5796 && arg1 < this.field5806) {
            if (arg0 < this.field5803) {
                arg2 -= this.field5803 - arg0;
                arg0 = this.field5803;
            }
            if (arg0 + arg2 > this.field5790) {
                arg2 = this.field5790 - arg0;
            }
            int var6 = this.field5785 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5788[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5788[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5788[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5788[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5788[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "()Z")
    public final boolean method683() {
        return true;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
    public final void method672(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5803 < arg0) {
            this.field5803 = arg0;
        }
        if (this.field5796 < arg1) {
            this.field5796 = arg1;
        }
        if (this.field5790 > arg2) {
            this.field5790 = arg2;
        }
        if (this.field5806 > arg3) {
            this.field5806 = arg3;
        }
        this.method2515();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(FFF)V")
    public final void method726(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "(I)V")
    public final void method758(int arg0) {
        this.field5807[arg0].method585(Thread.currentThread(), true);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lhb;Z)Lof;")
    public final class421 method734(class344 arg0, boolean arg1) {
        int[] var3 = arg0.field4858;
        byte[] var4 = arg0.field4862;
        int var5 = arg0.field4859;
        int var6 = arg0.field4863;
        class189 var11;
        if (arg1 && arg0.field4860 == null) {
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
            var11 = new class401(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4860;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class404(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class404(this, var14, var5, var6);
                var11 = new class65(this, var14, var5, var6);
            }
        }
        var11.method1468(arg0.field4866, arg0.field4865, arg0.field4861, arg0.field4864);
        return var11;
    }

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "()V")
    public final void method751() {
        this.field5803 = 0;
        this.field5796 = 0;
        this.field5790 = this.field5785;
        this.field5806 = this.field5774;
        this.method2515();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V")
    private final void method2511() {
        this.field5801 = new class18(20);
        this.field5804 = new class335();
        class369.method2350((byte) -90, true, false);
        this.field5783 = true;
        this.method732(1);
        this.method758(0);
        this.method751();
    }

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "()I")
    public final int method757() {
        return 0;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Loe;")
    public final class229 method703(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public final void method676(boolean arg0) {
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lps;III)V")
    public final void method2512(class394 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field5751;
        if (var6 == -1) {
            this.method750(arg1, arg2, var5, arg0.field5757, 1);
        } else {
            if (this.field5809 == null || (long) var6 != this.field5809.field499) {
                this.field5809 = (class42) this.field5802.method103(0, (long) var6);
            }
            if (this.field5809 == null) {
                int[] var7 = this.method2520(var6);
                if (var7 == null) {
                    return;
                }
                this.field5809 = new class42();
                this.field5809.field638 = this.method2519(var6);
                int var8 = this.field5809.field638 ? 64 : 128;
                this.field5809.field639 = this.method715(var7, 0, var8, var8, var8);
                this.field5802.method113(this.field5809, 0, (long) var6);
            }
            if (this.field5809.field638) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field5809.field639.method494(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field5757, 1);
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V")
    public final void method738(int arg0, int arg1) {
        this.field5775 = arg0;
        this.field5771 = arg1;
        this.field5793 = this.field5771 - 255;
        this.method2513();
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)V")
    public final void method745(int arg0) {
        int var2 = arg0 - this.field5776;
        for (Object var3 = this.field5801.method102(true); var3 != null; var3 = this.field5801.method111(77)) {
            class25 var4 = (class25) var3;
            if (var4.field375) {
                var4.field370 += var2;
                int var5 = var4.field370 / 20;
                if (var5 > 0) {
                    class200 var6 = this.field5781.method1412(var4.field372, (byte) -119);
                    var4.method212(var6.field2911 * var2 * 50 / 1000, var6.field2929 * var2 * 50 / 1000);
                    var4.field370 -= var5 * 20;
                }
                var4.field375 = false;
            }
        }
        this.field5776 = arg0;
        this.field5802.method104(5, (byte) -34);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[[I[[IIII)Lnc;")
    public final class126 method727(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class96(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "()Z")
    public final boolean method705() {
        return true;
    }

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "()I")
    public final int method740() {
        int var1 = this.field5770;
        this.field5770 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "()I")
    public final int method744() {
        return this.field5775;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()V")
    private final void method2513() {
        if (this.field5773 != 0.0F) {
            float var1 = (float) this.field5771;
            float var2 = (float) this.field5775;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field5786 / (this.field5786 + this.field5773);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field5773;
            this.field5799 = (int) (((float) this.field5771 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field5799 = this.field5771;
        }
    }

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "()V")
    public final void method742() {
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIII)V")
    public final void method680(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "()Z")
    public final boolean method670() {
        return true;
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(IIIII)V")
    public final void method750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5796) {
            var6 = this.field5796;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5806) {
            var7 = this.field5806;
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
                if (var64 < this.field5803) {
                    var64 = this.field5803;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field5790) {
                    var65 = this.field5790;
                }
                int var66 = this.field5785 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5788[var66++] = arg3;
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
                if (var60 < this.field5803) {
                    var60 = this.field5803;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field5790 - 1) {
                    var61 = this.field5790 - 1;
                }
                int var62 = this.field5785 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5788[var62++] = arg3;
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
                if (var28 < this.field5803) {
                    var28 = this.field5803;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field5790) {
                    var29 = this.field5790;
                }
                int var30 = this.field5785 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5788[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5788[var30++] = var15 + var33;
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
                if (var22 < this.field5803) {
                    var22 = this.field5803;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field5790 - 1) {
                    var23 = this.field5790 - 1;
                }
                int var24 = this.field5785 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5788[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5788[var24++] = var15 + var27;
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
                if (var47 < this.field5803) {
                    var47 = this.field5803;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field5790) {
                    var48 = this.field5790;
                }
                int var49 = this.field5785 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5788[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5788[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5803) {
                    var39 = this.field5803;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field5790 - 1) {
                    var40 = this.field5790 - 1;
                }
                int var41 = this.field5785 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5788[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5788[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(IIII)V")
    public final void method704(int arg0, int arg1, int arg2, int arg3) {
        this.field5767 = arg0;
        this.field5772 = arg1;
        this.field5805 = arg2;
        this.field5784 = arg3;
        this.method2515();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([Lrc;Lpo;[Ltc;I)V")
    public final void method756(class100[] arg0, class202 arg1, class290[] arg2, int arg3) {
        class433[] var5 = new class433[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class433) arg0[var6];
            }
        }
        class433 var7 = class433.method2701(this, var5);
        var7.method2693(arg1, arg2 != null ? arg2[0] : null, (class30) null, arg3);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lbs;[Lhb;Z)Lpi;")
    public final class220 method765(class186 arg0, class344[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4859;
            var5[var7] = arg1[var7].field4863;
            if (arg1[var7].field4860 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class43(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class353(this, arg0, arg1, var4, var5);
        } else {
            return new class410(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lqi;)V")
    public final void method678(class207 arg0) {
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Loe;)V")
    public final void method767(class229 arg0) {
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[I[I)Lrn;")
    public final class134 method674(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class185(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "()Z")
    public final boolean method697() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class73 var11 = this.method2517(Thread.currentThread());
        class434 var12 = var11.field1221;
        var12.field6334 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field6334 = false;
            var12.field6328 = 0;
            var12.field6329 = true;
            var12.method2713(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field6334 = false;
            var12.field6328 = 255 - var13;
            var12.field6329 = true;
            var12.method2713(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field6334 = true;
    }

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "()Z")
    public final boolean method716() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(F)V")
    public final void method699(float arg0) {
        this.field5782 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "()I")
    public final int method671() {
        return 0;
    }

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "()Lpo;")
    public final class202 method748() {
        return new class335();
    }

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "()V")
    public final void method749() {
        if (this.field5769 != null && this.field5797 != null) {
            try {
                Graphics var1 = this.field5769.getGraphics();
                this.field5797.method247(106, 0, 0, var1);
            } catch (Exception var2) {
                this.field5769.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lhe;)V")
    public final void method753(class30 arg0) {
        class297 var2 = arg0.field428.field1857;
        for (class297 var3 = var2.field4393; var2 != var3; var3 = var3.field4393) {
            class394 var4 = (class394) var3;
            int var5 = var4.field5750 >> 12;
            int var6 = var4.field5748 >> 12;
            int var7 = var4.field5760 >> 12;
            int var8 = (this.field5804.field4805 * var7 + this.field5804.field4798 * var5 + this.field5804.field4794 * var6 >> 15) + this.field5804.field4804;
            if (var8 >= this.field5775 && var8 <= this.field5771) {
                int var9 = ((this.field5804.field4799 * var7 + this.field5804.field4802 * var6 + this.field5804.field4795 * var5 >> 15) + this.field5804.field4803) * this.field5805 / var8 + this.field5767;
                int var10 = ((this.field5804.field4796 * var7 + this.field5804.field4801 * var5 + this.field5804.field4800 * var6 >> 15) + this.field5804.field4797) * this.field5784 / var8 + this.field5772;
                if (var9 >= this.field5803 && var9 <= this.field5790 && var10 >= this.field5796 && var10 <= this.field5806) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2512(var4, var9, var10, (var4.field5752 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public final void method701(int arg0) {
        this.field5807[arg0].method585((Runnable) null, true);
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "()Z")
    public final boolean method2514() {
        return this.field5764;
    }

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "()V")
    public final void method684() {
        this.field5797 = class280.method1990((byte) -86, this.field5769);
        this.field5788 = this.field5797.field489;
        this.field5785 = this.field5797.field495;
        this.field5774 = this.field5797.field492;
        for (int var1 = 0; var1 < this.field5777; ++var1) {
            this.field5807[var1].method579((byte) -87);
        }
        this.method751();
    }

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "()Z")
    public final boolean method760() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
    public final int method677(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "()Z")
    public final boolean method763() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "()Z")
    public final boolean method694() {
        return true;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Leb;IIII)Lrc;")
    public final class100 method735(class382 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class433(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "()Z")
    public final boolean method707() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "()V")
    private final void method2515() {
        this.field5808 = this.field5803 - this.field5767;
        this.field5763 = this.field5790 - this.field5767;
        this.field5791 = this.field5796 - this.field5772;
        this.field5779 = this.field5806 - this.field5772;
        for (int var1 = 0; var1 < this.field5777; ++var1) {
            class434 var5 = this.field5807[var1].field1221;
            var5.field6337 = this.field5767 - this.field5803;
            var5.field6336 = this.field5772 - this.field5796;
            var5.field6339 = this.field5790 - this.field5803;
            var5.field6332 = this.field5806 - this.field5796;
        }
        int var2 = this.field5796 * this.field5785 + this.field5803;
        for (int var3 = this.field5796; var3 < this.field5806; ++var3) {
            for (int var4 = 0; var4 < this.field5777; ++var4) {
                this.field5807[var4].field1221.field6330[var3 - this.field5796] = var2;
            }
            var2 += this.field5785;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIII)V")
    public final void method696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class73 var8 = this.method2517(Thread.currentThread());
        class434 var9 = var8.field1221;
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
            int var21 = arg0 - var9.method2721();
            int var22 = arg1 - var9.method2720();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field6328 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6328 = 255 - (arg4 >> 24);
            }
            var9.field6329 = var23 < 0 || var23 > var9.field6339 || var24 < 0 || var24 > var9.field6339 || var25 < 0 || var25 > var9.field6339;
            var9.method2717(var27, var28, var29, var23, var24, var25, arg4);
            var9.field6329 = var23 < 0 || var23 > var9.field6339 || var24 < 0 || var24 > var9.field6339 || var26 < 0 || var26 > var9.field6339;
            var9.method2717(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "()F")
    public final float method689() {
        return this.field5773;
    }

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "()Z")
    public final boolean method730() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "(I)[I")
    public final int[] method2516(int arg0) {
        class18 var2 = this.field5801;
        class25 var3;
        synchronized (this.field5801) {
            var3 = (class25) this.field5801.method103(0, (long) arg0);
            if (var3 == null) {
                if (!this.field5781.method1415((byte) 123, arg0)) {
                    return null;
                }
                class200 var5 = this.field5781.method1412(arg0, (byte) -114);
                int var6 = !var5.field2931 && !this.field5800 ? 128 : 64;
                var3 = new class25(arg0, var6, this.field5781.method1413(var6, arg0, var6, 0.7F, true, false), var5.field2910);
                this.field5801.method113(var3, 0, (long) arg0);
            }
        }
        var3.field375 = true;
        return var3.method211();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5785 * arg1 + arg0;
            int var15 = this.field5785 - arg2;
            if (arg1 + arg3 > this.field5806) {
                arg3 -= arg1 + arg3 - this.field5806;
            }
            if (arg1 < this.field5796) {
                int var16 = this.field5796 - arg1;
                arg3 -= var16;
                var14 += this.field5785 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field5790) {
                int var17 = arg0 + arg2 - this.field5790;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5803) {
                int var18 = this.field5803 - arg0;
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
                            int var28 = this.field5788[var14];
                            this.field5788[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5788[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5788[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5788[var14++] = arg5;
                        } else {
                            this.field5788[var14++] = arg4;
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

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V")
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5803 && arg0 < this.field5790) {
            if (arg1 < this.field5796) {
                arg2 -= this.field5796 - arg1;
                arg1 = this.field5796;
            }
            if (arg1 + arg2 > this.field5806) {
                arg2 = this.field5806 - arg1;
            }
            int var6 = this.field5785 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5785 * var10 + var6;
                        int var12 = this.field5788[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5788[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5785 * var14 + var6;
                        int var16 = this.field5788[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5788[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5788[this.field5785 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lqi;Lqi;FLqi;)Lqi;")
    public final class207 method710(class207 arg0, class207 arg1, float arg2, class207 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "()Z")
    public final boolean method700() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "()V")
    public final void method682() {
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field5804.field4805 * arg2 + this.field5804.field4798 * arg0 + this.field5804.field4794 * arg1 >> 15) + this.field5804.field4804;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field5804.field4805 * arg5 + this.field5804.field4798 * arg3 + this.field5804.field4794 * arg4 >> 15) + this.field5804.field4804;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field5775 || var8 >= this.field5775) && (var7 <= this.field5771 || var8 <= this.field5771)) {
            int var9 = ((this.field5804.field4799 * arg2 + this.field5804.field4802 * arg1 + this.field5804.field4795 * arg0 >> 15) + this.field5804.field4803) * this.field5805 / var7;
            int var10 = ((this.field5804.field4799 * arg5 + this.field5804.field4802 * arg4 + this.field5804.field4795 * arg3 >> 15) + this.field5804.field4803) * this.field5805 / var8;
            if (var9 < this.field5808 && var10 < this.field5808 || var9 > this.field5763 && var10 > this.field5763) {
                return false;
            } else {
                int var11 = ((this.field5804.field4796 * arg2 + this.field5804.field4801 * arg0 + this.field5804.field4800 * arg1 >> 15) + this.field5804.field4797) * this.field5784 / var7;
                int var12 = ((this.field5804.field4796 * arg5 + this.field5804.field4801 * arg3 + this.field5804.field4800 * arg4 >> 15) + this.field5804.field4797) * this.field5784 / var8;
                return (var11 >= this.field5791 || var12 >= this.field5791) && (var11 <= this.field5779 || var12 <= this.field5779);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I")
    public final int method713(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "()Z")
    public final boolean method724() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lrc;Lhe;Lpo;Ltc;I)V")
    public final void method698(class100 arg0, class30 arg1, class202 arg2, class290 arg3, int arg4) {
        ((class433) arg0).method2693(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "()V")
    public final void method764() {
        this.field5801.method106((byte) -114);
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(IIII)V")
    public final void method752(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5785) {
            arg2 = this.field5785;
        }
        if (arg3 > this.field5774) {
            arg3 = this.field5774;
        }
        this.field5803 = arg0;
        this.field5790 = arg2;
        this.field5796 = arg1;
        this.field5806 = arg3;
        this.method2515();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method728(Rectangle[] arg0, int arg1) {
        if (this.field5769 != null && this.field5797 != null) {
            try {
                Graphics var3 = this.field5769.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5785 && var5.y <= this.field5774 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5797.method250(-114, var3, var5.y, var5.x, var5.height, var5.width);
                    }
                }
            } catch (Exception var6) {
                this.field5769.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        this.field5789 = this.field5795;
        this.field5792 = arg0;
        this.field5795 = arg1;
        this.field5762 = arg2;
        this.field5766 = true;
    }

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "()V")
    public final void method741() {
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)V")
    public final void method732(int arg0) {
        if (this.field5777 != arg0) {
            this.field5777 = arg0;
            this.field5807 = new class73[this.field5777];
            for (int var2 = 0; var2 < this.field5777; ++var2) {
                this.field5807[var2] = new class73(this);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method725(Canvas arg0) {
        this.field5769 = arg0;
        this.method684();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/Runnable;)Lsj;")
    public final class73 method2517(Runnable arg0) {
        for (int var2 = 0; var2 < this.field5777; ++var2) {
            if (this.field5807[var2].field1225 == arg0) {
                return this.field5807[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "()V")
    public final void method761() {
        this.field5795 = this.field5789;
        this.field5766 = false;
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(IIIIII)V")
    public final void method762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method729(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method729(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method675(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method675(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5803) {
                    var10 += (this.field5803 - arg0) * var12;
                    arg0 = this.field5803;
                }
                if (var13 >= this.field5790) {
                    var13 = this.field5790 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5796 && var17 < this.field5806) {
                                int var18 = this.field5785 * var17 + arg0;
                                int var19 = this.field5788[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5788[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5796 && var21 < this.field5806) {
                                int var22 = this.field5785 * var21 + arg0;
                                int var23 = this.field5788[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5788[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5796 && var27 < this.field5806) {
                            this.field5788[this.field5785 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5796) {
                    var29 += (this.field5796 - arg1) * var31;
                    arg1 = this.field5796;
                }
                if (var32 >= this.field5806) {
                    var32 = this.field5806 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5803 && var46 < this.field5790) {
                            this.field5788[this.field5785 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5803 && var36 < this.field5790) {
                            int var37 = this.field5785 * arg1 + var36;
                            int var38 = this.field5788[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5788[this.field5785 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5803 && var40 < this.field5790) {
                            int var41 = this.field5785 * arg1 + var40;
                            int var42 = this.field5788[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5788[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "()F")
    public final float method759() {
        return this.field5786;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIII)V")
    public final void method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5803) {
            arg2 -= this.field5803 - arg0;
            arg0 = this.field5803;
        }
        if (arg1 < this.field5796) {
            arg3 -= this.field5796 - arg1;
            arg1 = this.field5796;
        }
        if (arg0 + arg2 > this.field5790) {
            arg2 = this.field5790 - arg0;
        }
        if (arg1 + arg3 > this.field5806) {
            arg3 = this.field5806 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field5790 && arg1 <= this.field5806) {
            int var7 = this.field5785 - arg2;
            int var8 = this.field5785 * arg1 + arg0;
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
                            this.field5788[var24] = arg4;
                            ++var24;
                            this.field5788[var24] = arg4;
                            ++var24;
                            this.field5788[var24] = arg4;
                            ++var24;
                            this.field5788[var24] = arg4;
                            ++var24;
                            this.field5788[var24] = arg4;
                            ++var24;
                            this.field5788[var24] = arg4;
                            ++var24;
                            this.field5788[var24] = arg4;
                            ++var24;
                            this.field5788[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5788[var24] = arg4;
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
                        int var14 = this.field5788[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field5788[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5788[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5788[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
    public final void method714(boolean arg0) {
        this.field5800 = arg0;
        this.field5801.method106((byte) -115);
    }

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "()I")
    public final int method737() {
        int var1 = this.field5780;
        this.field5780 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "()I")
    public final int method702() {
        return this.field5771;
    }

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "()Z")
    public final boolean method747() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "()Z")
    public final boolean method743() {
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([Lrc;Lhe;Lpo;[Ltc;I)V")
    public final void method690(class100[] arg0, class30 arg1, class202 arg2, class290[] arg3, int arg4) {
        class433[] var6 = new class433[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class433) arg0[var7];
            }
        }
        class433 var8 = class433.method2701(this, var6);
        var8.method2693(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIILrn;II)V")
    public final void method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, int arg7, int arg8) {
        class185 var10 = (class185) arg6;
        int[] var11 = var10.field2720;
        int[] var12 = var10.field2725;
        int var13 = this.field5796 > arg8 ? this.field5796 : arg8;
        int var14 = this.field5806 < var11.length + arg8 ? this.field5806 : var11.length + arg8;
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
            if (arg0 < this.field5803) {
                var18 += (this.field5803 - arg0) * var20;
                arg0 = this.field5803;
            }
            if (var21 >= this.field5790) {
                var21 = this.field5790 - 1;
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
                                int var28 = this.field5785 * var25 + arg0;
                                int var29 = this.field5788[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5788[var28] = var23 + var30;
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
                                int var34 = this.field5785 * var31 + arg0;
                                int var35 = this.field5788[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5788[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5788[this.field5785 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5803 && var64 < this.field5790 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5788[this.field5785 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5803 && var50 < this.field5790 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5785 * arg1 + var50;
                        int var54 = this.field5788[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5788[this.field5785 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5803 && var56 < this.field5790 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5785 * arg1 + var56;
                        int var60 = this.field5788[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5788[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IFFFFF)V")
    public final void method712(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5794 = (int) (arg1 * 65535.0F);
        this.field5768 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5778 = (int) (arg3 * 65535.0F / var7);
        this.field5798 = (int) (arg4 * 65535.0F / var7);
        this.field5765 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "()Lpo;")
    public final class202 method709() {
        class73 var1 = this.method2517(Thread.currentThread());
        return var1.field1217;
    }

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "(I)I")
    public final int method2518(int arg0) {
        return this.field5781.method1412(arg0, (byte) -82).field2918 & 65535;
    }

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "(I)Z")
    public final boolean method2519(int arg0) {
        return this.field5800 || this.field5781.method1412(arg0, (byte) -70).field2931;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III[I)V")
    public final void method746(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field5804.field4805 * arg2 + this.field5804.field4798 * arg0 + this.field5804.field4794 * arg1 >> 15) + this.field5804.field4804;
        if (var5 >= this.field5775 && var5 <= this.field5771) {
            int var6 = ((this.field5804.field4799 * arg2 + this.field5804.field4802 * arg1 + this.field5804.field4795 * arg0 >> 15) + this.field5804.field4803) * this.field5805 / var5;
            int var7 = ((this.field5804.field4796 * arg2 + this.field5804.field4801 * arg0 + this.field5804.field4800 * arg1 >> 15) + this.field5804.field4797) * this.field5784 / var5;
            if (var6 >= this.field5808 && var6 <= this.field5763 && var7 >= this.field5791 && var7 <= this.field5779) {
                arg3[0] = var6 - this.field5808;
                arg3[1] = var7 - this.field5791;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(IIIIII)V")
    public final void method711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method729(arg0, arg1, arg2, arg4, arg5);
        this.method729(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method675(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method675(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(II)V")
    public final void method754(int arg0, int arg1) {
        this.field5795 = arg0 & 16777215;
        int var3 = this.field5795 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field5795 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field5795 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field5795 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field5787 = false;
        } else {
            this.field5787 = true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
    public final void method717(int arg0, int arg1, int arg2) {
        this.field5792 = arg0;
        this.field5795 = arg1;
        this.field5762 = arg2;
    }

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "(I)[I")
    private final int[] method2520(int arg0) {
        class18 var2 = this.field5801;
        class25 var3;
        synchronized (this.field5801) {
            var3 = (class25) this.field5801.method103(0, (long) arg0);
            if (var3 == null) {
                if (!this.field5781.method1415((byte) 104, arg0)) {
                    return null;
                }
                class200 var5 = this.field5781.method1412(arg0, (byte) -107);
                int var6 = !var5.field2931 && !this.field5800 ? 128 : 64;
                var3 = new class25(arg0, var6, this.field5781.method1411(arg0, (byte) -90, var6, 0.7F, var6, true), var5.field2910);
                this.field5801.method113(var3, 0, (long) arg0);
            }
        }
        var3.field375 = true;
        return var3.method211();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([I)V")
    public final void method708(int[] arg0) {
        arg0[0] = this.field5803;
        arg0[1] = this.field5796;
        arg0[2] = this.field5790;
        arg0[3] = this.field5806;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lpo;)V")
    public final void method673(class202 arg0) {
        this.field5804 = (class335) arg0;
    }

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "(I)Z")
    public final boolean method2521(int arg0) {
        return this.field5781.method1412(arg0, (byte) -125).field2914;
    }

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "()V")
    public final void method688() {
        if (this.field5783) {
            class19.method127(false, false, true);
            this.field5783 = false;
        }
        this.field5769 = null;
        this.field5781 = null;
        this.field5797 = null;
        this.field5764 = true;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([IIIII)Lof;")
    public final class421 method715(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class404(this, arg0, arg1, arg2, arg3, arg4) : new class65(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class404(this, arg0, arg1, arg2, arg3, arg4) : new class65(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lcj;I)V")
    public class396(Canvas arg0, class181 arg1, int arg2) {
        this.field5769 = arg0;
        this.field5781 = arg1;
        super.field1431 = arg2;
        this.field5797 = class280.method1990((byte) -86, this.field5769);
        this.field5788 = this.field5797.field489;
        this.field5785 = this.field5797.field495;
        this.field5774 = this.field5797.field492;
        this.method2511();
    }
}
