import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class399 extends class38 {

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "Z")
    private boolean field5830;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "Z")
    private boolean field5828;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "Lmn;")
    private class247 field5832;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
    private int field5835;

    @OriginalMember(owner = "client!cv", name = "K", descriptor = "I")
    public int field5847;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "I")
    public int field5844;

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    public int field5842;

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
    public int field5846;

    @OriginalMember(owner = "client!cv", name = "X", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!cv", name = "S", descriptor = "I")
    public int field5855;

    @OriginalMember(owner = "client!cv", name = "bb", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
    public int field5833;

    @OriginalMember(owner = "client!cv", name = "cb", descriptor = "I")
    public int field5865;

    @OriginalMember(owner = "client!cv", name = "Y", descriptor = "I")
    public int field5861;

    @OriginalMember(owner = "client!cv", name = "W", descriptor = "I")
    public int field5859;

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
    private int field5838;

    @OriginalMember(owner = "client!cv", name = "ib", descriptor = "Z")
    public boolean field5871;

    @OriginalMember(owner = "client!cv", name = "eb", descriptor = "I")
    public int field5867;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!cv", name = "kb", descriptor = "Z")
    private boolean field5873;

    @OriginalMember(owner = "client!cv", name = "jb", descriptor = "I")
    private int field5872;

    @OriginalMember(owner = "client!cv", name = "gb", descriptor = "I")
    public int field5869;

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!cv", name = "ab", descriptor = "Lnj;")
    private class162 field5863;

    @OriginalMember(owner = "client!cv", name = "nb", descriptor = "I")
    private int field5876;

    @OriginalMember(owner = "client!cv", name = "V", descriptor = "Lnj;")
    private class162 field5858;

    @OriginalMember(owner = "client!cv", name = "Z", descriptor = "Lpu;")
    public class394 field5862;

    @OriginalMember(owner = "client!cv", name = "Q", descriptor = "F")
    private float field5853;

    @OriginalMember(owner = "client!cv", name = "T", descriptor = "F")
    private float field5856;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
    private int field5831;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
    public int field5834;

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
    public int field5839;

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
    public int field5845;

    @OriginalMember(owner = "client!cv", name = "L", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!cv", name = "O", descriptor = "I")
    private int field5851;

    @OriginalMember(owner = "client!cv", name = "P", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!cv", name = "R", descriptor = "I")
    public int field5854;

    @OriginalMember(owner = "client!cv", name = "U", descriptor = "I")
    public int field5857;

    @OriginalMember(owner = "client!cv", name = "db", descriptor = "I")
    public int field5866;

    @OriginalMember(owner = "client!cv", name = "hb", descriptor = "I")
    public int field5870;

    @OriginalMember(owner = "client!cv", name = "M", descriptor = "Ll;")
    private class16 field5849;

    @OriginalMember(owner = "client!cv", name = "mb", descriptor = "Ll;")
    private class16 field5875;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "Ldj;")
    private class228 field5829;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5827;

    @OriginalMember(owner = "client!cv", name = "fb", descriptor = "Z")
    public boolean field5868;

    @OriginalMember(owner = "client!cv", name = "lb", descriptor = "[I")
    public int[] field5874;

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "[Ldc;")
    private class5[] field5841;

    @OriginalMember(owner = "client!cv", name = "T", descriptor = "(IFFFFF)V", line = 3)
    public final void method232(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5844 = (int) (arg1 * 65535.0F);
        this.field5847 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5837 = (int) (arg3 * 65535.0F / var7);
        this.field5852 = (int) (arg4 * 65535.0F / var7);
        this.field5848 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!cv", name = "TA", descriptor = "(IIIII)V", line = 13)
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5842 && arg0 < this.field5869) {
            if (arg1 < this.field5861) {
                arg2 -= this.field5861 - arg1;
                arg1 = this.field5861;
            }
            if (arg1 + arg2 > this.field5859) {
                arg2 = this.field5859 - arg1;
            }
            int var6 = this.field5839 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5839 * var10 + var6;
                        int var12 = this.field5874[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5874[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5839 * var14 + var6;
                        int var16 = this.field5874[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5874[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5874[this.field5839 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "()Z", line = 90)
    public final boolean method308() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "(I)[I", line = 94)
    private final int[] method2404(int arg0) {
        class162 var2 = this.field5858;
        class395 var3;
        synchronized (this.field5858) {
            var3 = (class395) this.field5858.method1073((long) arg0, false);
            if (var3 == null) {
                if (!super.field471.method1652(arg0, 29423)) {
                    return null;
                }
                class166 var5 = super.field471.method1654(101, arg0);
                int var6 = !var5.field2480 && !this.field5873 ? 128 : 64;
                var3 = new class395(arg0, var6, super.field471.method1651(var6, (byte) -87, arg0, true, 0.7F, var6), var5.field2498);
                this.field5858.method1072((long) arg0, var3, false);
            }
        }
        var3.field5788 = true;
        return var3.method2384();
    }

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "(I)V", line = 113)
    public final void method292(int arg0) {
    }

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "(I)V", line = 116)
    public final void method246(int arg0) {
        this.method243(0, 0, this.field5839, this.field5851, arg0, 0);
    }

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "()Z", line = 119)
    public final boolean method261() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;)V", line = 122)
    public class399(int arg0, Canvas arg1, class277 arg2) {
        this(arg0, arg2);
        this.method270(arg1);
        this.method266(arg1);
    }

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "(IIII)V", line = 128)
    public final void method296(int arg0, int arg1, int arg2, int arg3) {
        this.field5857 = arg0;
        this.field5845 = arg1;
        this.field5860 = arg2;
        this.field5865 = arg3;
        this.method2407();
    }

    @OriginalMember(owner = "client!cv", name = "da", descriptor = "([I)V", line = 135)
    public final void method234(int[] arg0) {
        arg0[0] = this.field5842;
        arg0[1] = this.field5861;
        arg0[2] = this.field5869;
        arg0[3] = this.field5859;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIZ)Ll;", line = 142)
    public final class16 method275(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5839 * arg1 + arg0;
        int var8 = this.field5839 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5874[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class119(this, var6, arg2, arg3);
        } else {
            return new class81(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cv", name = "fa", descriptor = "(IIII)V", line = 174)
    public final void method250(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5842 < arg0) {
            this.field5842 = arg0;
        }
        if (this.field5861 < arg1) {
            this.field5861 = arg1;
        }
        if (this.field5869 > arg2) {
            this.field5869 = arg2;
        }
        if (this.field5859 > arg3) {
            this.field5859 = arg3;
        }
        this.method2407();
    }

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "()I", line = 190)
    public final int method272() {
        int var1 = this.field5838;
        this.field5838 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/Runnable;)Ldc;", line = 197)
    public final class5 method2405(Runnable arg0) {
        for (int var2 = 0; var2 < this.field5866; ++var2) {
            if (this.field5841[var2].field45 == arg0) {
                return this.field5841[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(Z)V", line = 209)
    public final void method321(boolean arg0) {
        this.field5873 = arg0;
        this.field5858.method1068(0);
    }

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "()V", line = 213)
    public final void method222() {
        this.field5867 = this.field5836;
        this.field5871 = false;
    }

    @OriginalMember(owner = "client!cv", name = "ia", descriptor = "(II)V", line = 217)
    public final void method311(int arg0, int arg1) {
        this.field5864 = arg0;
        this.field5872 = arg1;
        this.field5840 = this.field5872 - 255;
        this.method2414();
    }

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "()Z", line = 223)
    public final boolean method298() {
        return true;
    }

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "()Z", line = 226)
    public final boolean method314() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "OA", descriptor = "(IIII)V", line = 229)
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5839) {
            arg2 = this.field5839;
        }
        if (arg3 > this.field5851) {
            arg3 = this.field5851;
        }
        this.field5842 = arg0;
        this.field5869 = arg2;
        this.field5861 = arg1;
        this.field5859 = arg3;
        this.method2407();
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II[I[I)Lma;", line = 250)
    public final class10 method258(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class487(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(Z)V", line = 253)
    public final void method247(boolean arg0) {
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "()Z", line = 256)
    public final boolean method223() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lu;)V", line = 258)
    public final void method290(class53 arg0) {
    }

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "()Z", line = 263)
    public final boolean method297() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIF)Ljd;", line = 267)
    public final class153 method323(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "YA", descriptor = "()I", line = 270)
    public final int method237() {
        return this.field5872;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lkq;IIII)Lt;", line = 273)
    public final class471 method231(class419 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class499(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "()Lc;", line = 277)
    public final class122 method280() {
        class5 var1 = this.method2405(Thread.currentThread());
        return var1.field47;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 281)
    public final void method248(int arg0) {
        if (this.field5866 != arg0) {
            this.field5866 = arg0;
            this.field5841 = new class5[this.field5866];
            for (int var2 = 0; var2 < this.field5866; ++var2) {
                this.field5841[var2] = new class5(this);
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(FFF)V", line = 296)
    public final void method254(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "(FF)V", line = 299)
    public final void method245(float arg0, float arg1) {
        this.field5856 = arg0;
        this.field5853 = arg1;
        this.method2414();
    }

    @OriginalMember(owner = "client!cv", name = "UA", descriptor = "(III)V", line = 304)
    public final void method241(int arg0, int arg1, int arg2) {
        this.field5867 = arg0 & 16777215;
        int var4 = this.field5867 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field5867 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field5867 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field5867 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field5868 = false;
        } else {
            this.field5868 = true;
        }
    }

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "()Z", line = 329)
    public final boolean method282() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "()Lc;", line = 332)
    public final class122 method310() {
        return new class394();
    }

    @OriginalMember(owner = "client!cv", name = "JA", descriptor = "(IIIIII)Z", line = 336)
    public final boolean method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field5862.field5774 * arg2 + this.field5862.field5783 * arg0 + this.field5862.field5780 * arg1 >> 15) + this.field5862.field5775;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field5862.field5774 * arg5 + this.field5862.field5783 * arg3 + this.field5862.field5780 * arg4 >> 15) + this.field5862.field5775;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field5864 || var8 >= this.field5864) && (var7 <= this.field5872 || var8 <= this.field5872)) {
            int var9 = ((this.field5862.field5781 * arg2 + this.field5862.field5776 * arg1 + this.field5862.field5773 * arg0 >> 15) + this.field5862.field5777) * this.field5860 / var7;
            int var10 = ((this.field5862.field5781 * arg5 + this.field5862.field5776 * arg4 + this.field5862.field5773 * arg3 >> 15) + this.field5862.field5777) * this.field5860 / var8;
            if (var9 < this.field5834 && var10 < this.field5834 || var9 > this.field5870 && var10 > this.field5870) {
                return false;
            } else {
                int var11 = ((this.field5862.field5782 * arg2 + this.field5862.field5778 * arg0 + this.field5862.field5772 * arg1 >> 15) + this.field5862.field5779) * this.field5865 / var7;
                int var12 = ((this.field5862.field5782 * arg5 + this.field5862.field5778 * arg3 + this.field5862.field5772 * arg4 >> 15) + this.field5862.field5779) * this.field5865 / var8;
                return (var11 >= this.field5850 || var12 >= this.field5850) && (var11 <= this.field5854 || var12 <= this.field5854);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "()Z", line = 365)
    public final boolean method294() {
        return true;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lb;III)V", line = 369)
    public final void method2406(class219 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field3056;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method300(arg1, arg2, var6, arg0.field3058, 1);
        } else {
            if (this.field5876 != var5) {
                class16 var7 = (class16) this.field5863.method1073((long) var5, false);
                if (var7 == null) {
                    int[] var8 = this.method2404(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method2411(var5) ? 64 : 128;
                    var7 = this.method244(var8, 0, var9, var9, var9);
                    this.field5863.method1072((long) var5, var7, false);
                }
                this.field5876 = var5;
                this.field5875 = var7;
            }
            if (this.field5875.method84() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field5875.method94(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field3058, 1);
        }
    }

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "(I)V", line = 411)
    public final void method326(int arg0) {
        this.field5841[arg0].method29((Runnable) null, false);
    }

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "()Z", line = 414)
    public final boolean method301() {
        return true;
    }

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "()V", line = 418)
    private final void method2407() {
        this.field5834 = this.field5842 - this.field5857;
        this.field5870 = this.field5869 - this.field5857;
        this.field5850 = this.field5861 - this.field5845;
        this.field5854 = this.field5859 - this.field5845;
        for (int var1 = 0; var1 < this.field5866; ++var1) {
            class29 var5 = this.field5841[var1].field52;
            var5.field385 = this.field5857 - this.field5842;
            var5.field384 = this.field5845 - this.field5861;
            var5.field383 = this.field5869 - this.field5842;
            var5.field389 = this.field5859 - this.field5861;
        }
        int var2 = this.field5861 * this.field5839 + this.field5842;
        for (int var3 = this.field5861; var3 < this.field5859; ++var3) {
            for (int var4 = 0; var4 < this.field5866; ++var4) {
                this.field5841[var4].field52.field391[var3 - this.field5861] = var2;
            }
            var2 += this.field5839;
        }
    }

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "(I)Z", line = 456)
    public final boolean method2408(int arg0) {
        return super.field471.method1652(arg0, 29423);
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 461)
    public final void method270(Canvas arg0) {
        class228 var2 = (class228) this.field5832.method1492((long) arg0.hashCode(), 6340);
        if (var2 == null) {
            class228 var3 = class50.method441((byte) 81, arg0);
            this.field5832.method1487(-105, (long) arg0.hashCode(), var3);
        }
    }

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "(I)I", line = 470)
    public final int method2409(int arg0) {
        return super.field471.method1654(107, arg0).field2484 & 65535;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(ILga;)V", line = 473)
    private class399(int arg0, class277 arg1) {
        super(arg0, arg1);
        this.field5830 = false;
        this.field5828 = false;
        this.field5832 = new class247(4);
        this.field5835 = 0;
        this.field5847 = 78642;
        this.field5843 = 75518;
        this.field5844 = 45823;
        this.field5842 = 0;
        this.field5846 = 0;
        this.field5860 = 512;
        this.field5855 = 0;
        this.field5864 = 50;
        this.field5833 = 3500;
        this.field5865 = 512;
        this.field5861 = 0;
        this.field5859 = 0;
        this.field5838 = 0;
        this.field5871 = false;
        this.field5867 = 0;
        this.field5836 = 0;
        this.field5873 = false;
        this.field5872 = 3500;
        this.field5869 = 0;
        this.field5840 = this.field5872 - 255;
        this.field5863 = new class162(16);
        this.field5876 = -1;
        this.field5858 = new class162(20);
        this.field5862 = new class394();
        this.method248(1);
        this.method221(0);
        class235.method1450(false, true, 5);
        this.field5828 = true;
    }

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "()Z", line = 482)
    public final boolean method278() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([Lt;Lpn;Lc;[Lii;I)V", line = 486)
    public final void method242(class471[] arg0, class523 arg1, class122 arg2, class387[] arg3, int arg4) {
        class499[] var6 = new class499[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class499) arg0[var7];
            }
        }
        class499 var8 = class499.method2930(this, var6);
        var8.method2924(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!cv", name = "xa", descriptor = "()F", line = 501)
    public final float method271() {
        return this.field5853;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 505)
    public final void method239(Canvas arg0) {
        class228 var2 = (class228) this.field5832.method1492((long) arg0.hashCode(), 6340);
        if (var2 != null) {
            var2.method1565(0);
            class228 var3 = class50.method441((byte) 63, arg0);
            this.field5832.method1487(-42, (long) arg0.hashCode(), var3);
            if (this.field5827 == arg0 && this.field5849 == null) {
                this.field5829 = var3;
                this.field5874 = var3.field3236;
                this.field5839 = var3.field3239;
                this.field5851 = var3.field3238;
                this.method2412();
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)Lu;", line = 524)
    public final class53 method274(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "MA", descriptor = "(I)V", line = 526)
    public final void method269(int arg0) {
    }

    @OriginalMember(owner = "client!cv", name = "O", descriptor = "(IIIIII)V", line = 529)
    public final void method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5842) {
            arg2 -= this.field5842 - arg0;
            arg0 = this.field5842;
        }
        if (arg1 < this.field5861) {
            arg3 -= this.field5861 - arg1;
            arg1 = this.field5861;
        }
        if (arg0 + arg2 > this.field5869) {
            arg2 = this.field5869 - arg0;
        }
        if (arg1 + arg3 > this.field5859) {
            arg3 = this.field5859 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field5869 && arg1 <= this.field5859) {
            int var7 = this.field5839 - arg2;
            int var8 = this.field5839 * arg1 + arg0;
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
                            this.field5874[var24] = arg4;
                            ++var24;
                            this.field5874[var24] = arg4;
                            ++var24;
                            this.field5874[var24] = arg4;
                            ++var24;
                            this.field5874[var24] = arg4;
                            ++var24;
                            this.field5874[var24] = arg4;
                            ++var24;
                            this.field5874[var24] = arg4;
                            ++var24;
                            this.field5874[var24] = arg4;
                            ++var24;
                            this.field5874[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5874[var24] = arg4;
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
                        int var14 = this.field5874[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field5874[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5874[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5874[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "DA", descriptor = "(IIIIII[BII)V", line = 664)
    public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5839 * arg1 + arg0;
            int var15 = this.field5839 - arg2;
            if (arg1 + arg3 > this.field5859) {
                arg3 -= arg1 + arg3 - this.field5859;
            }
            if (arg1 < this.field5861) {
                int var16 = this.field5861 - arg1;
                arg3 -= var16;
                var14 += this.field5839 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field5869) {
                int var17 = arg0 + arg2 - this.field5869;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5842) {
                int var18 = this.field5842 - arg0;
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
                            int var28 = this.field5874[var14];
                            this.field5874[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5874[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5874[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5874[var14++] = arg5;
                        } else {
                            this.field5874[var14++] = arg4;
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

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "()V", line = 838)
    public final void method322() {
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([IIIII)Ll;", line = 842)
    public final class16 method244(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class119(this, arg0, arg1, arg2, arg3, arg4) : new class81(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class119(this, arg0, arg1, arg2, arg3, arg4) : new class81(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([Lt;Lc;[Lii;I)V", line = 878)
    public final void method226(class471[] arg0, class122 arg1, class387[] arg2, int arg3) {
        class499[] var5 = new class499[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class499) arg0[var6];
            }
        }
        class499 var7 = class499.method2930(this, var5);
        var7.method2924(arg1, arg2 != null ? arg2[0] : null, (class523) null, arg3);
    }

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "()Z", line = 893)
    public final boolean method287() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 896)
    public final void method221(int arg0) {
        this.field5841[arg0].method29(Thread.currentThread(), false);
    }

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "(I)Z", line = 900)
    public final boolean method2410(int arg0) {
        return super.field471.method1654(117, arg0).field2494;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIIII)V", line = 903)
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5861 && arg1 < this.field5859) {
            if (arg0 < this.field5842) {
                arg2 -= this.field5842 - arg0;
                arg0 = this.field5842;
            }
            if (arg0 + arg2 > this.field5869) {
                arg2 = this.field5869 - arg0;
            }
            int var6 = this.field5839 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5874[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5874[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5874[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5874[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5874[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "W", descriptor = "()F", line = 975)
    public final float method259() {
        return this.field5856;
    }

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "()I", line = 978)
    public final int method263() {
        return 0;
    }

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "(F)V", line = 981)
    public final void method252(float arg0) {
        this.field5843 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(IIIIII)Lmh;", line = 985)
    public final class444 method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIILma;II)V", line = 989)
    public final void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        class487 var10 = (class487) arg6;
        int[] var11 = var10.field7123;
        int[] var12 = var10.field7124;
        int var13 = this.field5861 > arg8 ? this.field5861 : arg8;
        int var14 = this.field5859 < var11.length + arg8 ? this.field5859 : var11.length + arg8;
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
            if (arg0 < this.field5842) {
                var18 += (this.field5842 - arg0) * var20;
                arg0 = this.field5842;
            }
            if (var21 >= this.field5869) {
                var21 = this.field5869 - 1;
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
                                int var28 = this.field5839 * var25 + arg0;
                                int var29 = this.field5874[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5874[var28] = var23 + var30;
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
                                int var34 = this.field5839 * var31 + arg0;
                                int var35 = this.field5874[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5874[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5874[this.field5839 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5842 && var64 < this.field5869 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5874[this.field5839 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5842 && var50 < this.field5869 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5839 * arg1 + var50;
                        int var54 = this.field5874[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5874[this.field5839 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5842 && var56 < this.field5869 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5839 * arg1 + var56;
                        int var60 = this.field5874[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5874[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "GA", descriptor = "(IIII)V", line = 1227)
    public final void method305(int arg0, int arg1, int arg2, int arg3) {
        this.field5846 = arg0;
        this.field5867 = arg1;
        this.field5855 = arg2;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lpn;)V", line = 1233)
    public final void method316(class523 arg0) {
        class340 var2 = arg0.field7740.field1935;
        for (class340 var3 = var2.field4899; var2 != var3; var3 = var3.field4899) {
            class219 var4 = (class219) var3;
            int var5 = var4.field3050 >> 12;
            int var6 = var4.field3053 >> 12;
            int var7 = var4.field3055 >> 12;
            int var8 = (this.field5862.field5774 * var7 + this.field5862.field5783 * var5 + this.field5862.field5780 * var6 >> 15) + this.field5862.field5775;
            if (var8 >= this.field5864 && var8 <= this.field5840) {
                int var9 = ((this.field5862.field5781 * var7 + this.field5862.field5776 * var6 + this.field5862.field5773 * var5 >> 15) + this.field5862.field5777) * this.field5860 / var8 + this.field5857;
                int var10 = ((this.field5862.field5782 * var7 + this.field5862.field5778 * var5 + this.field5862.field5772 * var6 >> 15) + this.field5862.field5779) * this.field5865 / var8 + this.field5845;
                if (var9 >= this.field5842 && var9 <= this.field5869 && var10 >= this.field5861 && var10 <= this.field5859) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2406(var4, var9, var10, (var4.field3049 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1270)
    public final void method302(Canvas arg0) {
        if (this.field5827 == arg0) {
            this.method266((Canvas) null);
        }
        class228 var2 = (class228) this.field5832.method1492((long) arg0.hashCode(), 6340);
        if (var2 != null) {
            var2.method1565(0);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lmh;)V", line = 1281)
    public final void method315(class444 arg0) {
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1285)
    public final void method266(Canvas arg0) {
        if (arg0 != null) {
            class228 var2 = (class228) this.field5832.method1492((long) arg0.hashCode(), 6340);
            if (var2 != null) {
                this.field5827 = arg0;
                this.field5829 = var2;
                if (this.field5849 == null) {
                    this.field5874 = var2.field3236;
                    this.field5839 = var2.field3239;
                    this.field5851 = var2.field3238;
                    this.method2412();
                    return;
                }
            }
        } else {
            this.field5827 = null;
            this.field5829 = null;
            if (this.field5849 == null) {
                this.field5874 = null;
                this.field5839 = this.field5851 = 1;
                this.method2412();
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIIIII)V", line = 1319)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method293(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method293(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method225(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method225(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5842) {
                    var10 += (this.field5842 - arg0) * var12;
                    arg0 = this.field5842;
                }
                if (var13 >= this.field5869) {
                    var13 = this.field5869 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5861 && var17 < this.field5859) {
                                int var18 = this.field5839 * var17 + arg0;
                                int var19 = this.field5874[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5874[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5861 && var21 < this.field5859) {
                                int var22 = this.field5839 * var21 + arg0;
                                int var23 = this.field5874[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5874[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5861 && var27 < this.field5859) {
                            this.field5874[this.field5839 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5861) {
                    var29 += (this.field5861 - arg1) * var31;
                    arg1 = this.field5861;
                }
                if (var32 >= this.field5859) {
                    var32 = this.field5859 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5842 && var46 < this.field5869) {
                            this.field5874[this.field5839 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5842 && var36 < this.field5869) {
                            int var37 = this.field5839 * arg1 + var36;
                            int var38 = this.field5874[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5874[this.field5839 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5842 && var40 < this.field5869) {
                            int var41 = this.field5839 * arg1 + var40;
                            int var42 = this.field5874[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5874[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "()Z", line = 1532)
    public final boolean method309() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(II)I", line = 1535)
    public final int method288(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "()V", line = 1537)
    public final void method262() {
    }

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "(I)Z", line = 1541)
    public final boolean method2411(int arg0) {
        return this.field5873 || super.field471.method1654(98, arg0).field2480;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lt;Lpn;Lc;Lii;I)V", line = 1550)
    public final void method312(class471 arg0, class523 arg1, class122 arg2, class387 arg3, int arg4) {
        ((class499) arg0).method2924(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIII)V", line = 1552)
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "()V", line = 1557)
    private final void method2412() {
        for (int var1 = 0; var1 < this.field5866; ++var1) {
            this.field5841[var1].method34((byte) -114);
        }
        this.method260();
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIIIIII)V", line = 1566)
    public final void method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class5 var11 = this.method2405(Thread.currentThread());
        class29 var12 = var11.field52;
        var12.field388 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field388 = false;
            var12.field392 = 0;
            var12.field382 = true;
            var12.method173(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field388 = false;
            var12.field392 = 255 - var13;
            var12.field382 = true;
            var12.method173(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field388 = true;
    }

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "()Z", line = 1603)
    public final boolean method249() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "ea", descriptor = "(Lc;)V", line = 1606)
    public final void method299(class122 arg0) {
        this.field5862 = (class394) arg0;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II[[I[[IIII)Lta;", line = 1609)
    public final class142 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class460(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cv", name = "AA", descriptor = "(IIII)V", line = 1615)
    public final void method327(int arg0, int arg1, int arg2, int arg3) {
        this.field5836 = this.field5867;
        this.field5846 = arg0;
        this.field5867 = arg1;
        this.field5855 = arg2;
        this.field5871 = true;
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "()V", line = 1622)
    public final void method260() {
        this.field5842 = 0;
        this.field5861 = 0;
        this.field5869 = this.field5839;
        this.field5859 = this.field5851;
        this.method2407();
    }

    @OriginalMember(owner = "client!cv", name = "IA", descriptor = "()I", line = 1630)
    public final int method313() {
        return 0;
    }

    @OriginalMember(owner = "client!cv", name = "ca", descriptor = "(ILma;II)V", line = 1634)
    public final void method291(int arg0, class10 arg1, int arg2, int arg3) {
        class487 var5 = (class487) arg1;
        int[] var6 = var5.field7123;
        int[] var7 = var5.field7124;
        int var8;
        if (this.field5859 < var6.length + arg3) {
            var8 = this.field5859 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5861 > arg3) {
            var9 = this.field5861 - arg3;
            arg3 = this.field5861;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5839 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5842 > var12) {
                    var13 -= this.field5842 - var12;
                    var12 = this.field5842;
                }
                if (this.field5869 < var12 + var13) {
                    var13 = this.field5869 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5874[var14++] = arg0;
                }
                var10 += this.field5839;
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "()V", line = 1691)
    public final void method229() {
        if (this.field5827 != null && this.field5829 != null) {
            try {
                Graphics var1 = this.field5827.getGraphics();
                this.field5829.method1419(0, (byte) -127, 0, var1);
            } catch (Exception var2) {
                this.field5827.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I[Ljd;)V", line = 1706)
    public final void method255(int arg0, class153[] arg1) {
    }

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "()Z", line = 1709)
    public final boolean method2413() {
        return this.field5830;
    }

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "()V", line = 1712)
    public final void method240() {
        if (this.field5828) {
            class51.method446(false, true, false);
            this.field5828 = false;
        }
        this.field5829 = null;
        this.field5827 = null;
        this.field5832 = null;
        this.field5830 = true;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "()I", line = 1725)
    public final int method224() {
        return this.field5864;
    }

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "()V", line = 1727)
    public final void method320() {
    }

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "()V", line = 1730)
    private final void method2414() {
        if (this.field5853 != 0.0F) {
            float var1 = (float) this.field5872;
            float var2 = (float) this.field5864;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field5856 / (this.field5856 + this.field5853);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field5853;
            this.field5833 = (int) (((float) this.field5872 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field5833 = this.field5872;
        }
    }

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "()V", line = 1751)
    public final void method329() {
    }

    @OriginalMember(owner = "client!cv", name = "NA", descriptor = "(IIIII)V", line = 1754)
    public final void method300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5861) {
            var6 = this.field5861;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5859) {
            var7 = this.field5859;
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
                if (var64 < this.field5842) {
                    var64 = this.field5842;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field5869) {
                    var65 = this.field5869;
                }
                int var66 = this.field5839 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5874[var66++] = arg3;
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
                if (var60 < this.field5842) {
                    var60 = this.field5842;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field5869 - 1) {
                    var61 = this.field5869 - 1;
                }
                int var62 = this.field5839 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5874[var62++] = arg3;
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
                if (var28 < this.field5842) {
                    var28 = this.field5842;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field5869) {
                    var29 = this.field5869;
                }
                int var30 = this.field5839 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5874[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5874[var30++] = var15 + var33;
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
                if (var22 < this.field5842) {
                    var22 = this.field5842;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field5869 - 1) {
                    var23 = this.field5869 - 1;
                }
                int var24 = this.field5839 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5874[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5874[var24++] = var15 + var27;
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
                if (var47 < this.field5842) {
                    var47 = this.field5842;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field5869) {
                    var48 = this.field5869;
                }
                int var49 = this.field5839 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5874[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5874[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5842) {
                    var39 = this.field5842;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field5869 - 1) {
                    var40 = this.field5869 - 1;
                }
                int var41 = this.field5839 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5874[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5874[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIIIII)V", line = 2040)
    public final void method2415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field471.method1654(45, arg5).field2501) {
                if (this.field5876 != arg5) {
                    class16 var10 = (class16) this.field5863.method1073((long) arg5, false);
                    if (var10 == null) {
                        int[] var11 = this.method2404(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method2411(arg5) ? 64 : 128;
                        var10 = this.method244(var11, 0, var12, var12, var12);
                        this.field5863.method1072((long) arg5, var10, false);
                    }
                    this.field5876 = arg5;
                    this.field5875 = var10;
                }
                this.field5875.method94(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method300(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "(I)V", line = 2074)
    public final void method281(int arg0) {
        int var2 = arg0 - this.field5831;
        for (Object var3 = this.field5858.method1071((byte) 68); var3 != null; var3 = this.field5858.method1063(-90)) {
            class395 var4 = (class395) var3;
            if (var4.field5788) {
                var4.field5784 += var2;
                int var5 = var4.field5784 / 20;
                if (var5 > 0) {
                    class166 var6 = super.field471.method1654(41, var4.field5787);
                    var4.method2385(var6.field2488 * var2 * 50 / 1000, var6.field2495 * var2 * 50 / 1000);
                    var4.field5784 -= var5 * 20;
                }
                var4.field5788 = false;
            }
        }
        this.field5831 = arg0;
        this.field5863.method1065((byte) -95, 5);
    }

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "(I)[I", line = 2106)
    public final int[] method2416(int arg0) {
        class162 var2 = this.field5858;
        class395 var3;
        synchronized (this.field5858) {
            var3 = (class395) this.field5858.method1073((long) arg0, false);
            if (var3 == null) {
                if (!super.field471.method1652(arg0, 29423)) {
                    return null;
                }
                class166 var5 = super.field471.method1654(99, arg0);
                int var6 = !var5.field2480 && !this.field5873 ? 128 : 64;
                var3 = new class395(arg0, var6, super.field471.method1650(var6, arg0, true, 0.7F, true, var6), var5.field2498);
                this.field5858.method1072((long) arg0, var3, false);
            }
        }
        var3.field5788 = true;
        return var3.method2384();
    }

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "()Z", line = 2126)
    public final boolean method273() {
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "()V", line = 2129)
    public final void method236() {
        this.field5858.method1068(0);
    }

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "(IIII)[I", line = 2134)
    public final int[] method251(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5839 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5874[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)I", line = 2178)
    public final int method257(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "()Z", line = 2196)
    public final boolean method276() {
        return true;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lft;Z)Ll;", line = 2204)
    public final class16 method265(class4 arg0, boolean arg1) {
        int[] var3 = arg0.field40;
        byte[] var4 = arg0.field34;
        int var5 = arg0.field41;
        int var6 = arg0.field36;
        class32 var11;
        if (arg1 && arg0.field39 == null) {
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
            var11 = new class516(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field39;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class119(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class119(this, var14, var5, var6);
                var11 = new class81(this, var14, var5, var6);
            }
        }
        var11.method97(arg0.field37, arg0.field33, arg0.field38, arg0.field35);
        return var11;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2306)
    public final void method228(Rectangle[] arg0, int arg1) {
        if (this.field5827 != null && this.field5829 != null) {
            try {
                Graphics var3 = this.field5827.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5839 && var5.y <= this.field5851 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5829.method1416(var5.y, var5.height, var5.width, var5.x, var3, 108);
                    }
                }
            } catch (Exception var6) {
                this.field5827.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V", line = 2334)
    public final void method235(boolean arg0) {
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lmh;Lmh;FLmh;)Lmh;", line = 2343)
    public final class444 method277(class444 arg0, class444 arg1, float arg2, class444 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)V", line = 2348)
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class5 var8 = this.method2405(Thread.currentThread());
        class29 var9 = var8.field52;
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
            int var21 = arg0 - var9.method167();
            int var22 = arg1 - var9.method162();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field392 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field392 = 255 - (arg4 >> 24);
            }
            var9.field382 = var23 < 0 || var23 > var9.field383 || var24 < 0 || var24 > var9.field383 || var25 < 0 || var25 > var9.field383;
            var9.method161(var27, var28, var29, var23, var24, var25, arg4);
            var9.field382 = var23 < 0 || var23 > var9.field383 || var24 < 0 || var24 > var9.field383 || var26 < 0 || var26 > var9.field383;
            var9.method161(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!cv", name = "X", descriptor = "(III[I)V", line = 2420)
    public final void method256(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field5862.field5774 * arg2 + this.field5862.field5783 * arg0 + this.field5862.field5780 * arg1 >> 15) + this.field5862.field5775;
        if (var5 >= this.field5864 && var5 <= this.field5872) {
            int var6 = ((this.field5862.field5781 * arg2 + this.field5862.field5776 * arg1 + this.field5862.field5773 * arg0 >> 15) + this.field5862.field5777) * this.field5860 / var5;
            int var7 = ((this.field5862.field5782 * arg2 + this.field5862.field5778 * arg0 + this.field5862.field5772 * arg1 >> 15) + this.field5862.field5779) * this.field5865 / var5;
            if (var6 >= this.field5834 && var6 <= this.field5870 && var7 >= this.field5850 && var7 <= this.field5854) {
                arg3[0] = var6 - this.field5834;
                arg3[1] = var7 - this.field5850;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ldq;[Lft;Z)Lla;", line = 2454)
    public final class315 method324(class490 arg0, class4[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field41;
            var5[var7] = arg1[var7].field36;
            if (arg1[var7].field39 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class430(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class513(this, arg0, arg1, var4, var5);
        } else {
            return new class161(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIII)V", line = 2483)
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method293(arg0, arg1, arg2, arg4, arg5);
        this.method293(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method225(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method225(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!cv", name = "ZA", descriptor = "()I", line = 2493)
    public final int method283() {
        int var1 = this.field5835;
        this.field5835 = 0;
        return var1;
    }
}
