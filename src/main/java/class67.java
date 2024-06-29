import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class class67 extends class208 {

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "Z")
    private boolean field816;

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "Z")
    private boolean field817;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "Llb;")
    public class465 field815;

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!aw", name = "cb", descriptor = "Z")
    public boolean field851;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!aw", name = "Z", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "client!aw", name = "fb", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!aw", name = "U", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!aw", name = "ab", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!aw", name = "eb", descriptor = "Z")
    private boolean field853;

    @OriginalMember(owner = "client!aw", name = "Y", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "client!aw", name = "V", descriptor = "Lwf;")
    private class117 field844;

    @OriginalMember(owner = "client!aw", name = "mb", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "Lwf;")
    private class117 field836;

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "Lba;")
    public class326 field819;

    @OriginalMember(owner = "client!aw", name = "db", descriptor = "F")
    private float field852;

    @OriginalMember(owner = "client!aw", name = "kb", descriptor = "F")
    private float field859;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!aw", name = "Q", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!aw", name = "R", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!aw", name = "T", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!aw", name = "X", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!aw", name = "bb", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!aw", name = "gb", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!aw", name = "ib", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "Lha;")
    public class53 field828;

    @OriginalMember(owner = "client!aw", name = "lb", descriptor = "Lha;")
    private class53 field860;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "Lie;")
    public class6 field813;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "Ljava/awt/Canvas;")
    public Canvas field812;

    @OriginalMember(owner = "client!aw", name = "hb", descriptor = "Z")
    public boolean field856;

    @OriginalMember(owner = "client!aw", name = "jb", descriptor = "[I")
    public int[] field858;

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "[Lrk;")
    public class30[] field827;

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Ln;)V", line = 3)
    private class67(class17 arg0) {
        super(arg0);
        this.field816 = false;
        this.field817 = false;
        this.field815 = new class465(4);
        this.field825 = 512;
        this.field830 = 45823;
        this.field820 = 0;
        this.field835 = 0;
        this.field838 = 0;
        this.field831 = 0;
        this.field824 = 0;
        this.field851 = false;
        this.field832 = 0;
        this.field848 = 78642;
        this.field826 = 3500;
        this.field841 = 3500;
        this.field854 = 0;
        this.field829 = 75518;
        this.field837 = this.field841 - 255;
        this.field843 = 512;
        this.field845 = 50;
        this.field849 = 0;
        this.field853 = false;
        this.field847 = 0;
        this.field833 = 0;
        this.field844 = new class117(16);
        this.field861 = -1;
        this.field836 = new class117(20);
        this.field819 = new class326();
        this.method502(1);
        this.method459(0);
        class582.method3473(true, false, -3);
        this.field817 = true;
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V", line = 11)
    public final void method419(int arg0) {
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 14)
    public class67(Canvas arg0, class17 arg1) {
        this(arg1);
        this.method515(arg0);
        this.method444(arg0);
    }

    @OriginalMember(owner = "client!aw", name = "YA", descriptor = "()I", line = 21)
    public final int method420() {
        int var1 = this.field820;
        this.field820 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!aw", name = "Z", descriptor = "(I)V", line = 26)
    public final void method421(int arg0) {
        this.method498(0, 0, this.field823, this.field846, arg0, 0);
    }

    @OriginalMember(owner = "client!aw", name = "la", descriptor = "(FF)V", line = 29)
    public final void method422(float arg0, float arg1) {
        this.field859 = arg0;
        this.field852 = arg1;
        this.method468();
    }

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "()Z", line = 34)
    public final boolean method423() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(IIIIII)Lqba;", line = 37)
    public final class345 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lqba;)V", line = 40)
    public final void method426(class345 arg0) {
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lsi;III)V", line = 44)
    public final void method427(class480 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field6828;
        int var7 = arg3 << 1;
        if (var5 == -1) {
            this.method482(arg1, arg2, arg3, arg0.field6825, 1);
        } else {
            if (this.field861 != var5) {
                class53 var8 = (class53) this.field844.method842(0, (long) var5);
                if (var8 == null) {
                    int[] var9 = this.method490(var5);
                    if (var9 == null) {
                        return;
                    }
                    int var10 = this.method447(var5) ? 64 : 128;
                    var8 = this.method466(var9, 0, var10, var10, var10);
                    this.field844.method835((byte) 116, (long) var5, var8);
                }
                this.field861 = var5;
                this.field860 = var8;
            }
            ++var7;
            this.field860.method314(arg1 - arg3, arg2 - arg3, var7, var7, 0, arg0.field6825, 1);
        }
    }

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "()Lm;", line = 83)
    public final class165 method428() {
        class30 var1 = this.method505(Thread.currentThread());
        return var1.field338;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I[Lnm;)V", line = 87)
    public final void method429(int arg0, class405[] arg1) {
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "()Z", line = 90)
    public final boolean method430() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "([I)V", line = 93)
    public final void method431(int[] arg0) {
        arg0[0] = this.field838;
        arg0[1] = this.field824;
        arg0[2] = this.field831;
        arg0[3] = this.field835;
    }

    @OriginalMember(owner = "client!aw", name = "UA", descriptor = "(IIIII)V", line = 99)
    public final void method432(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field824 && arg1 < this.field835) {
            if (arg0 < this.field838) {
                arg2 -= this.field838 - arg0;
                arg0 = this.field838;
            }
            if (arg0 + arg2 > this.field831) {
                arg2 = this.field831 - arg0;
            }
            int var6 = this.field823 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field858[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field858[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field858[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field858[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field858[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "()V", line = 170)
    public final void method433() {
    }

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "()Z", line = 173)
    public final boolean method434() {
        return true;
    }

    @OriginalMember(owner = "client!aw", name = "CA", descriptor = "()I", line = 176)
    public final int method435() {
        return this.field841;
    }

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "()V", line = 178)
    public final void method436() {
    }

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "()Z", line = 181)
    public final boolean method437() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "()Z", line = 184)
    public final boolean method438() {
        return true;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lqba;Lqba;FLqba;)Lqba;", line = 187)
    public final class345 method439(class345 arg0, class345 arg1, float arg2, class345 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!aw", name = "xa", descriptor = "()V", line = 190)
    public final void method440() {
        this.field854 = this.field833;
        this.field851 = false;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIILpa;II)V", line = 195)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class311 arg6, int arg7, int arg8) {
        class467 var10 = (class467) arg6;
        int[] var11 = var10.field6577;
        int[] var12 = var10.field6581;
        int var13 = this.field824 > arg8 ? this.field824 : arg8;
        int var14 = this.field835 < var11.length + arg8 ? this.field835 : var11.length + arg8;
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
            if (arg0 < this.field838) {
                var18 += (this.field838 - arg0) * var20;
                arg0 = this.field838;
            }
            if (var21 >= this.field831) {
                var21 = this.field831 - 1;
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
                                int var28 = this.field823 * var25 + arg0;
                                int var29 = this.field858[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field858[var28] = var23 + var30;
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
                                int var34 = this.field823 * var31 + arg0;
                                int var35 = this.field858[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field858[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field858[this.field823 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field838 && var64 < this.field831 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field858[this.field823 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field838 && var50 < this.field831 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field823 * arg1 + var50;
                        int var54 = this.field858[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field858[this.field823 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field838 && var56 < this.field831 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field823 * arg1 + var56;
                        int var60 = this.field858[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field858[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIZ)Lha;", line = 434)
    public final class53 method442(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field823 * arg1 + arg0;
        int var8 = this.field823 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field858[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class407(this, var6, arg2, arg3);
        } else {
            return new class294(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "(IIII)V", line = 466)
    public final void method443(int arg0, int arg1, int arg2, int arg3) {
        this.field833 = this.field854;
        this.field849 = arg0;
        this.field854 = arg1;
        this.field847 = arg2;
        this.field851 = true;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIII)V", line = 475)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method432(arg0, arg1, arg2, arg4, arg5);
        this.method432(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method446(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method446(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(IIIII)V", line = 481)
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field838 && arg0 < this.field831) {
            if (arg1 < this.field824) {
                arg2 -= this.field824 - arg1;
                arg1 = this.field824;
            }
            if (arg1 + arg2 > this.field835) {
                arg2 = this.field835 - arg1;
            }
            int var6 = this.field823 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field823 * var10 + var6;
                        int var12 = this.field858[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field858[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field823 * var14 + var6;
                        int var16 = this.field858[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field858[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field858[this.field823 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "(I)Z", line = 557)
    public final boolean method447(int arg0) {
        return this.field853 || super.field3092.method110(arg0, (byte) 100).field6651;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lu;)V", line = 563)
    public final void method448(class65 arg0) {
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Z)V", line = 565)
    public final void method449(boolean arg0) {
    }

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "()F", line = 568)
    public final float method450() {
        return this.field859;
    }

    @OriginalMember(owner = "client!aw", name = "ta", descriptor = "(II)V", line = 571)
    public final void method451(int arg0, int arg1) {
        this.field845 = arg0;
        this.field841 = arg1;
        this.field837 = this.field841 - 255;
        this.method468();
    }

    @OriginalMember(owner = "client!aw", name = "JA", descriptor = "(IIII)V", line = 581)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        this.field849 = arg0;
        this.field854 = arg1;
        this.field847 = arg2;
    }

    @OriginalMember(owner = "client!aw", name = "U", descriptor = "()I", line = 586)
    public final int method454() {
        return 0;
    }

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)Lu;", line = 590)
    public final class65 method455(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "(IIII)[I", line = 594)
    public final int[] method456(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field823 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field858[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "()Z", line = 619)
    public final boolean method457() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V", line = 623)
    public void method459(int arg0) {
        this.field827[arg0].method204(false, Thread.currentThread());
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V", line = 628)
    public final void method460(boolean arg0) {
    }

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "(ILpa;II)V", line = 634)
    public final void method462(int arg0, class311 arg1, int arg2, int arg3) {
        class467 var5 = (class467) arg1;
        int[] var6 = var5.field6577;
        int[] var7 = var5.field6581;
        int var8;
        if (this.field835 < var6.length + arg3) {
            var8 = this.field835 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field824 > arg3) {
            var9 = this.field824 - arg3;
            arg3 = this.field824;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field823 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field838 > var12) {
                    var13 -= this.field838 - var12;
                    var12 = this.field838;
                }
                if (this.field831 < var12 + var13) {
                    var13 = this.field831 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field858[var14++] = arg0;
                }
                var10 += this.field823;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "(I)V", line = 690)
    public final void method463(int arg0) {
    }

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "()Z", line = 693)
    public final boolean method464() {
        return true;
    }

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "()V", line = 695)
    public void method465() {
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([IIIII)Lha;", line = 699)
    public final class53 method466(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class407(this, arg0, arg1, arg2, arg3, arg4) : new class294(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class407(this, arg0, arg1, arg2, arg3, arg4) : new class294(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "()V", line = 735)
    private final void method468() {
        if (this.field852 != 0.0F) {
            float var1 = (float) this.field841;
            float var2 = (float) this.field845;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field859 / (this.field859 + this.field852);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field852;
            this.field826 = (int) (((float) this.field841 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field826 = this.field841;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIF)Lnm;", line = 758)
    public final class405 method469(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(FFF)V", line = 760)
    public final void method470(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "()Z", line = 763)
    public final boolean method471() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "ra", descriptor = "()F", line = 766)
    public final float method472() {
        return this.field852;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "()V", line = 771)
    public final void method473() {
        if (this.field817) {
            class437.method2550(false, true, 19357);
            this.field817 = false;
        }
        this.field813 = null;
        this.field812 = null;
        this.field815 = null;
        this.field816 = true;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lqm;Z)Lha;", line = 785)
    public final class53 method474(class126 arg0, boolean arg1) {
        int[] var3 = arg0.field1772;
        byte[] var4 = arg0.field1773;
        int var5 = arg0.field1767;
        int var6 = arg0.field1771;
        class281 var11;
        if (arg1 && arg0.field1769 == null) {
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
            var11 = new class269(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1769;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class407(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class294(this, var14, var5, var6);
            }
        }
        var11.method324(arg0.field1766, arg0.field1770, arg0.field1765, arg0.field1768);
        return var11;
    }

    @OriginalMember(owner = "client!aw", name = "IA", descriptor = "(III[I)V", line = 889)
    public final void method475(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field819.field4496 * arg2 + this.field819.field4488 * arg0 + this.field819.field4487 * arg1 >> 15) + this.field819.field4489;
        if (var5 >= this.field845 && var5 <= this.field841) {
            int var6 = ((this.field819.field4492 * arg2 + this.field819.field4498 * arg1 + this.field819.field4493 * arg0 >> 15) + this.field819.field4490) * this.field843 / var5;
            int var7 = ((this.field819.field4494 * arg2 + this.field819.field4495 * arg0 + this.field819.field4491 * arg1 >> 15) + this.field819.field4497) * this.field825 / var5;
            if (var6 >= this.field842 && var6 <= this.field857 && var7 >= this.field855 && var7 <= this.field840) {
                arg3[0] = var6 - this.field842;
                arg3[1] = var7 - this.field855;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "(I)I", line = 914)
    public final int method476(int arg0) {
        return super.field3092.method110(arg0, (byte) 111).field6642 & 65535;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 917)
    public final void method477(Canvas arg0) {
        if (this.field812 == arg0) {
            this.method444((Canvas) null);
        }
        class6 var2 = (class6) this.field815.method2799((long) arg0.hashCode(), true);
        if (var2 != null) {
            var2.method2457(-8422);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)I", line = 927)
    public final int method478(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "()V", line = 930)
    public final void method479() {
        this.field838 = 0;
        this.field824 = 0;
        this.field831 = this.field823;
        this.field835 = this.field846;
        this.method425();
    }

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "()Lcr;", line = 937)
    public final class493 method480() {
        return new class493(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(IIIIII)V", line = 941)
    public final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method432(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method432(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method446(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method446(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field838) {
                    var10 += (this.field838 - arg0) * var12;
                    arg0 = this.field838;
                }
                if (var13 >= this.field831) {
                    var13 = this.field831 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field824 && var17 < this.field835) {
                                int var18 = this.field823 * var17 + arg0;
                                int var19 = this.field858[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field858[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field824 && var21 < this.field835) {
                                int var22 = this.field823 * var21 + arg0;
                                int var23 = this.field858[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field858[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field824 && var27 < this.field835) {
                            this.field858[this.field823 * var27 + arg0] = arg4;
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
                if (arg1 < this.field824) {
                    var29 += (this.field824 - arg1) * var31;
                    arg1 = this.field824;
                }
                if (var32 >= this.field835) {
                    var32 = this.field835 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field838 && var46 < this.field831) {
                            this.field858[this.field823 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field838 && var36 < this.field831) {
                            int var37 = this.field823 * arg1 + var36;
                            int var38 = this.field858[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field858[this.field823 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field838 && var40 < this.field831) {
                            int var41 = this.field823 * arg1 + var40;
                            int var42 = this.field858[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field858[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "(IIIII)V", line = 1155)
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field824) {
            var6 = this.field824;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field835) {
            var7 = this.field835;
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
                if (var64 < this.field838) {
                    var64 = this.field838;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field831) {
                    var65 = this.field831;
                }
                int var66 = this.field823 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field858[var66++] = arg3;
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
                if (var60 < this.field838) {
                    var60 = this.field838;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field831 - 1) {
                    var61 = this.field831 - 1;
                }
                int var62 = this.field823 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field858[var62++] = arg3;
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
                if (var28 < this.field838) {
                    var28 = this.field838;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field831) {
                    var29 = this.field831;
                }
                int var30 = this.field823 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field858[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field858[var30++] = var15 + var33;
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
                if (var22 < this.field838) {
                    var22 = this.field838;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field831 - 1) {
                    var23 = this.field831 - 1;
                }
                int var24 = this.field823 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field858[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field858[var24++] = var15 + var27;
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
                if (var47 < this.field838) {
                    var47 = this.field838;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field831) {
                    var48 = this.field831;
                }
                int var49 = this.field823 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field858[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field858[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field838) {
                    var39 = this.field838;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field831 - 1) {
                    var40 = this.field831 - 1;
                }
                int var41 = this.field823 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field858[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field858[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lm;)V", line = 1441)
    public final void method483(class165 arg0) {
        this.field819 = (class326) arg0;
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V", line = 1445)
    public final void method484(int arg0) {
        int var2 = arg0 - this.field814;
        for (Object var3 = this.field836.method843(0); var3 != null; var3 = this.field836.method845(0)) {
            class421 var4 = (class421) var3;
            if (var4.field5705) {
                var4.field5703 += var2;
                int var5 = var4.field5703 / 20;
                if (var5 > 0) {
                    class471 var6 = super.field3092.method110(var4.field5700, (byte) 119);
                    var4.method2480(var6.field6656 * var2 * 50 / 1000, var6.field6661 * var2 * 50 / 1000);
                    var4.field5703 -= var5 * 20;
                }
                var4.field5705 = false;
            }
        }
        this.field814 = arg0;
        this.field844.method834(5, 0);
    }

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "()V", line = 1476)
    public final void method485() {
        this.field836.method837(126);
    }

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "()Z", line = 1479)
    public final boolean method486() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "()Z", line = 1482)
    public final boolean method487() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lrd;)V", line = 1486)
    public final void method488(class283 arg0) {
        class613 var2 = arg0.field3959.field2700;
        for (class613 var3 = var2.field9070; var2 != var3; var3 = var3.field9070) {
            class480 var4 = (class480) var3;
            int var5 = var4.field6826 >> 12;
            int var6 = var4.field6824 >> 12;
            int var7 = var4.field6815 >> 12;
            int var8 = (this.field819.field4496 * var7 + this.field819.field4488 * var5 + this.field819.field4487 * var6 >> 15) + this.field819.field4489;
            if (var8 >= this.field845 && var8 <= this.field837) {
                int var9 = ((this.field819.field4492 * var7 + this.field819.field4498 * var6 + this.field819.field4493 * var5 >> 15) + this.field819.field4490) * this.field843 / var8 + this.field850;
                int var10 = ((this.field819.field4494 * var7 + this.field819.field4495 * var5 + this.field819.field4491 * var6 >> 15) + this.field819.field4497) * this.field825 / var8 + this.field821;
                if (var9 >= this.field838 && var9 <= this.field831 && var10 >= this.field824 && var10 <= this.field835) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method427(var4, var9, var10, (this.field843 * var4.field6829 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "(III)V", line = 1522)
    public final void method489(int arg0, int arg1, int arg2) {
        this.field854 = arg0 & 16777215;
        int var4 = this.field854 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field854 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field854 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field854 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field856 = false;
        } else {
            this.field856 = true;
        }
    }

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "(I)[I", line = 1547)
    private final int[] method490(int arg0) {
        class117 var2 = this.field836;
        class421 var3;
        synchronized (this.field836) {
            var3 = (class421) this.field836.method842(0, (long) arg0);
            if (var3 == null) {
                if (!super.field3092.method109(arg0, 1680)) {
                    return null;
                }
                class471 var5 = super.field3092.method110(arg0, (byte) 97);
                int var6 = !var5.field6651 && !this.field853 ? 128 : 64;
                var3 = new class421(arg0, var6, super.field3092.method111(var6, true, var6, 6925, arg0, 0.7F), var5.field6652);
                this.field836.method835((byte) 123, (long) arg0, var3);
            }
        }
        var3.field5705 = true;
        return var3.method2479();
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Llg;[Lqm;Z)Lra;", line = 1569)
    public final class92 method492(class352 arg0, class126[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1767;
            var5[var7] = arg1[var7].field1771;
            if (arg1[var7].field1769 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class147(this, arg0, arg1, var4, var5);
            } else {
                return new class445(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class34(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "()V", line = 1609)
    public final void method493() throws class416 {
        if (this.field812 != null && this.field813 != null) {
            try {
                Graphics var1 = this.field812.getGraphics();
                this.field813.method17(0, (byte) 97, 0, var1);
            } catch (Exception var2) {
                this.field812.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "(I)Z", line = 1625)
    public final boolean method494(int arg0) {
        return super.field3092.method109(arg0, 1680);
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(Z)V", line = 1628)
    public final void method495(boolean arg0) {
        this.field853 = arg0;
        this.field836.method837(127);
    }

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "(IIIIII)Z", line = 1633)
    public final boolean method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field819.field4496 * arg2 + this.field819.field4488 * arg0 + this.field819.field4487 * arg1 >> 15) + this.field819.field4489;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field819.field4496 * arg5 + this.field819.field4488 * arg3 + this.field819.field4487 * arg4 >> 15) + this.field819.field4489;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field845 || var8 >= this.field845) && (var7 <= this.field841 || var8 <= this.field841)) {
            int var9 = ((this.field819.field4492 * arg2 + this.field819.field4498 * arg1 + this.field819.field4493 * arg0 >> 15) + this.field819.field4490) * this.field843 / var7;
            int var10 = ((this.field819.field4492 * arg5 + this.field819.field4498 * arg4 + this.field819.field4493 * arg3 >> 15) + this.field819.field4490) * this.field843 / var8;
            if (var9 < this.field842 && var10 < this.field842 || var9 > this.field857 && var10 > this.field857) {
                return false;
            } else {
                int var11 = ((this.field819.field4494 * arg2 + this.field819.field4495 * arg0 + this.field819.field4491 * arg1 >> 15) + this.field819.field4497) * this.field825 / var7;
                int var12 = ((this.field819.field4494 * arg5 + this.field819.field4495 * arg3 + this.field819.field4491 * arg4 >> 15) + this.field819.field4497) * this.field825 / var8;
                return (var11 >= this.field855 || var12 >= this.field855) && (var11 <= this.field840 || var12 <= this.field840);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "()Z", line = 1662)
    public final boolean method497() {
        return true;
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(IIIIII)V", line = 1665)
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field838) {
            arg2 -= this.field838 - arg0;
            arg0 = this.field838;
        }
        if (arg1 < this.field824) {
            arg3 -= this.field824 - arg1;
            arg1 = this.field824;
        }
        if (arg0 + arg2 > this.field831) {
            arg2 = this.field831 - arg0;
        }
        if (arg1 + arg3 > this.field835) {
            arg3 = this.field835 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field831 && arg1 <= this.field835) {
            int var7 = this.field823 - arg2;
            int var8 = this.field823 * arg1 + arg0;
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
                            this.field858[var24] = arg4;
                            ++var24;
                            this.field858[var24] = arg4;
                            ++var24;
                            this.field858[var24] = arg4;
                            ++var24;
                            this.field858[var24] = arg4;
                            ++var24;
                            this.field858[var24] = arg4;
                            ++var24;
                            this.field858[var24] = arg4;
                            ++var24;
                            this.field858[var24] = arg4;
                            ++var24;
                            this.field858[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field858[var24] = arg4;
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
                        int var14 = this.field858[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field858[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field858[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field858[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "(F)V", line = 1802)
    public final void method500(float arg0) {
        this.field829 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "()V", line = 1804)
    public final void method501() {
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "()V", line = 1809)
    public final void method504() {
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)V", line = 1813)
    public final void method506(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "()Z", line = 1817)
    public final boolean method508() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "()V", line = 1823)
    public final void method509() {
        for (int var1 = 0; var1 < this.field839; ++var1) {
            this.field827[var1].method206(-120);
        }
        this.method479();
    }

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "(IIII)V", line = 1831)
    public final void method510(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field823) {
            arg2 = this.field823;
        }
        if (arg3 > this.field846) {
            arg3 = this.field846;
        }
        this.field838 = arg0;
        this.field831 = arg2;
        this.field824 = arg1;
        this.field835 = arg3;
        this.method425();
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lr;Lrd;Lm;Lpr;I)V", line = 1850)
    public final void method511(class159 arg0, class283 arg1, class165 arg2, class381 arg3, int arg4) {
        ((class71) arg0).method562(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "(IIII)V", line = 1853)
    public final void method512(int arg0, int arg1, int arg2, int arg3) {
        if (this.field838 < arg0) {
            this.field838 = arg0;
        }
        if (this.field824 < arg1) {
            this.field824 = arg1;
        }
        if (this.field831 > arg2) {
            this.field831 = arg2;
        }
        if (this.field835 > arg3) {
            this.field835 = arg3;
        }
        this.method425();
    }

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "()I", line = 1868)
    public final int method513() {
        return 0;
    }

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "(I)Z", line = 1871)
    public final boolean method514(int arg0) {
        return super.field3092.method110(arg0, (byte) 114).field6658;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1877)
    public final void method515(Canvas arg0) {
        class6 var2 = (class6) this.field815.method2799((long) arg0.hashCode(), true);
        if (var2 == null) {
            class6 var3 = class440.method2561(arg0, (byte) -123);
            this.field815.method2797(-4234, var3, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(IIII)V", line = 1886)
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        this.field850 = arg0;
        this.field821 = arg1;
        this.field843 = arg2;
        this.field825 = arg3;
        this.method425();
    }

    @OriginalMember(owner = "client!aw", name = "za", descriptor = "(IIIIII[BII)V", line = 1893)
    public final void method517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field823 * arg1 + arg0;
            int var15 = this.field823 - arg2;
            if (arg1 + arg3 > this.field835) {
                arg3 -= arg1 + arg3 - this.field835;
            }
            if (arg1 < this.field824) {
                int var16 = this.field824 - arg1;
                arg3 -= var16;
                var14 += this.field823 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field831) {
                int var17 = arg0 + arg2 - this.field831;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field838) {
                int var18 = this.field838 - arg0;
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
                            int var28 = this.field858[var14];
                            this.field858[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field858[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field858[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field858[var14++] = arg5;
                        } else {
                            this.field858[var14++] = arg4;
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

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIIIII)V", line = 2071)
    public final void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field3092.method110(arg5, (byte) 106).field6653) {
                if (this.field861 != arg5) {
                    class53 var10 = (class53) this.field844.method842(0, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method490(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method447(arg5) ? 64 : 128;
                        var10 = this.method466(var11, 0, var12, var12, var12);
                        this.field844.method835((byte) 121, (long) arg5, var10);
                    }
                    this.field861 = arg5;
                    this.field860 = var10;
                }
                this.field860.method314(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method482(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "()Z", line = 2104)
    public final boolean method519() {
        return this.field816;
    }

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "(IFFFFF)V", line = 2107)
    public final void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field830 = (int) (arg1 * 65535.0F);
        this.field848 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field834 = (int) (arg3 * 65535.0F / var7);
        this.field818 = (int) (arg4 * 65535.0F / var7);
        this.field822 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "(I)[I", line = 2117)
    public final int[] method521(int arg0) {
        class117 var2 = this.field836;
        class421 var3;
        synchronized (this.field836) {
            var3 = (class421) this.field836.method842(0, (long) arg0);
            if (var3 == null) {
                if (!super.field3092.method109(arg0, 1680)) {
                    return null;
                }
                class471 var5 = super.field3092.method110(arg0, (byte) 117);
                int var6 = !var5.field6651 && !this.field853 ? 128 : 64;
                var3 = new class421(arg0, var6, super.field3092.method113(var6, true, -4074, var6, 0.7F, arg0), var5.field6652);
                this.field836.method835((byte) 116, (long) arg0, var3);
            }
        }
        var3.field5705 = true;
        return var3.method2479();
    }

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "()Lm;", line = 2138)
    public final class165 method522() {
        return new class326();
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "()I", line = 2143)
    public final int method524() {
        return this.field845;
    }

    @OriginalMember(owner = "client!aw", name = "ba", descriptor = "()I", line = 2147)
    public final int method525() {
        int var1 = this.field832;
        this.field832 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II[I[I)Lpa;", line = 2152)
    public final class311 method526(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class467(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "()Z", line = 2155)
    public final boolean method527() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(II)I", line = 2167)
    public final int method528(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2178)
    public final void method529(Rectangle[] arg0, int arg1) throws class416 {
        if (this.field812 != null && this.field813 != null) {
            try {
                Graphics var3 = this.field812.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field823 && var5.y <= this.field846 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field813.method16(var5.x, var5.y, var5.height, var3, var5.width, (byte) -46);
                    }
                }
            } catch (Exception var6) {
                this.field812.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "()Z", line = 2210)
    public final boolean method530() {
        return false;
    }

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "()V")
    public abstract void method425();

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method444(Canvas arg0);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([Lr;Lrd;Lm;[Lpr;I)V")
    public abstract void method452(class159[] arg0, class283 arg1, class165 arg2, class381[] arg3, int arg4);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class176 method458(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public abstract void method461(int arg0);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lfd;IIII)Lr;")
    public abstract class159 method491(class451 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "()Z")
    public abstract boolean method499();

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "(I)V")
    public abstract void method502(int arg0);

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method503(Canvas arg0);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lrk;")
    public abstract class30 method505(Runnable arg0);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([Lr;Lm;[Lpr;I)V")
    public abstract void method507(class159[] arg0, class165 arg1, class381[] arg2, int arg3);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);
}
