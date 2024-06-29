import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class446 extends class206 {

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "Z")
    private boolean field6145;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "Z")
    private boolean field6143;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "Lpt;")
    public class451 field6144;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    private int field6156;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    public int field6163;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    public int field6167;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    private int field6161;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public int field6160;

    @OriginalMember(owner = "client!hr", name = "Z", descriptor = "I")
    public int field6176;

    @OriginalMember(owner = "client!hr", name = "cb", descriptor = "Z")
    private boolean field6179;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public int field6154;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!hr", name = "ib", descriptor = "I")
    private int field6185;

    @OriginalMember(owner = "client!hr", name = "bb", descriptor = "I")
    public int field6178;

    @OriginalMember(owner = "client!hr", name = "Y", descriptor = "I")
    public int field6175;

    @OriginalMember(owner = "client!hr", name = "hb", descriptor = "I")
    public int field6184;

    @OriginalMember(owner = "client!hr", name = "ab", descriptor = "Z")
    public boolean field6177;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
    public int field6166;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public int field6150;

    @OriginalMember(owner = "client!hr", name = "jb", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!hr", name = "mb", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
    public int field6165;

    @OriginalMember(owner = "client!hr", name = "W", descriptor = "I")
    private int field6173;

    @OriginalMember(owner = "client!hr", name = "kb", descriptor = "I")
    public int field6187;

    @OriginalMember(owner = "client!hr", name = "lb", descriptor = "Lsw;")
    private class641 field6188;

    @OriginalMember(owner = "client!hr", name = "nb", descriptor = "I")
    private int field6190;

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "Lsw;")
    private class641 field6170;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "Lhj;")
    public class487 field6151;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "F")
    private float field6162;

    @OriginalMember(owner = "client!hr", name = "fb", descriptor = "F")
    private float field6182;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    private int field6146;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public int field6148;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public int field6157;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
    public int field6159;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "I")
    public int field6164;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    public int field6168;

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "I")
    public int field6169;

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "I")
    public int field6171;

    @OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
    public int field6174;

    @OriginalMember(owner = "client!hr", name = "db", descriptor = "I")
    public int field6180;

    @OriginalMember(owner = "client!hr", name = "gb", descriptor = "I")
    public int field6183;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "Lha;")
    public class52 field6152;

    @OriginalMember(owner = "client!hr", name = "ob", descriptor = "Lha;")
    private class52 field6191;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "Lfk;")
    public class558 field6147;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6142;

    @OriginalMember(owner = "client!hr", name = "eb", descriptor = "Z")
    public boolean field6181;

    @OriginalMember(owner = "client!hr", name = "V", descriptor = "[I")
    public int[] field6172;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "[Lvc;")
    public class263[] field6153;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class309 method1148(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class300(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "()V")
    public final void method1109() {
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1149(Canvas arg0) {
        if (this.field6142 == arg0) {
            this.method274((Canvas) null);
        }
        class558 var2 = (class558) this.field6144.method2645((long) arg0.hashCode(), (byte) -93);
        if (var2 != null) {
            var2.method3187(true);
        }
    }

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field6151.field6808 * arg2 + this.field6151.field6811 * arg1 + this.field6151.field6807 * arg0 >> 15) + this.field6151.field6800;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field6151.field6808 * arg5 + this.field6151.field6811 * arg4 + this.field6151.field6807 * arg3 >> 15) + this.field6151.field6800;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field6149 || var8 >= this.field6149) && (var7 <= this.field6185 || var8 <= this.field6185)) {
            int var9 = ((this.field6151.field6805 * arg2 + this.field6151.field6804 * arg0 + this.field6151.field6801 * arg1 >> 15) + this.field6151.field6802) * this.field6178 / var7;
            int var10 = ((this.field6151.field6805 * arg5 + this.field6151.field6804 * arg3 + this.field6151.field6801 * arg4 >> 15) + this.field6151.field6802) * this.field6178 / var8;
            if (var9 < this.field6169 && var10 < this.field6169 || var9 > this.field6183 && var10 > this.field6183) {
                return false;
            } else {
                int var11 = ((this.field6151.field6806 * arg2 + this.field6151.field6809 * arg0 + this.field6151.field6803 * arg1 >> 15) + this.field6151.field6810) * this.field6189 / var7;
                int var12 = ((this.field6151.field6806 * arg5 + this.field6151.field6809 * arg3 + this.field6151.field6803 * arg4 >> 15) + this.field6151.field6810) * this.field6189 / var8;
                return (var11 >= this.field6159 || var12 >= this.field6159) && (var11 <= this.field6158 || var12 <= this.field6158);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "()Z")
    public final boolean method1100() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)Z")
    public final boolean method2606(int arg0) {
        return super.field2481.method119(-110, arg0).field2650;
    }

    @OriginalMember(owner = "client!hr", name = "xa", descriptor = "()V")
    public final void method1146() {
        this.field6176 = this.field6156;
        this.field6177 = false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lmv;)V")
    public final void method1189(class313 arg0) {
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(IIIIII)V")
    public final void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field6187) {
            arg2 -= this.field6187 - arg0;
            arg0 = this.field6187;
        }
        if (arg1 < this.field6150) {
            arg3 -= this.field6150 - arg1;
            arg1 = this.field6150;
        }
        if (arg0 + arg2 > this.field6184) {
            arg2 = this.field6184 - arg0;
        }
        if (arg1 + arg3 > this.field6167) {
            arg3 = this.field6167 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field6184 && arg1 <= this.field6167) {
            int var7 = this.field6171 - arg2;
            int var8 = this.field6171 * arg1 + arg0;
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
                            this.field6172[var24] = arg4;
                            ++var24;
                            this.field6172[var24] = arg4;
                            ++var24;
                            this.field6172[var24] = arg4;
                            ++var24;
                            this.field6172[var24] = arg4;
                            ++var24;
                            this.field6172[var24] = arg4;
                            ++var24;
                            this.field6172[var24] = arg4;
                            ++var24;
                            this.field6172[var24] = arg4;
                            ++var24;
                            this.field6172[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field6172[var24] = arg4;
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
                        int var14 = this.field6172[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field6172[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field6172[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field6172[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ln;)V")
    private class446(class17 arg0) {
        super(arg0);
        this.field6145 = false;
        this.field6143 = false;
        this.field6144 = new class451(4);
        this.field6156 = 0;
        this.field6163 = 75518;
        this.field6167 = 0;
        this.field6161 = 0;
        this.field6160 = 0;
        this.field6176 = 0;
        this.field6179 = false;
        this.field6154 = 45823;
        this.field6149 = 50;
        this.field6185 = 3500;
        this.field6178 = 512;
        this.field6175 = 78642;
        this.field6184 = 0;
        this.field6177 = false;
        this.field6166 = 3500;
        this.field6150 = 0;
        this.field6186 = 0;
        this.field6189 = 512;
        this.field6165 = this.field6185 - 255;
        this.field6173 = 0;
        this.field6187 = 0;
        this.field6188 = new class641(16);
        this.field6190 = -1;
        this.field6170 = new class641(20);
        this.field6151 = new class487();
        this.method272(1);
        this.method278(0);
        class355.method1997(true, (byte) -73, false);
        this.field6145 = true;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lu;)V")
    public final void method1176(class64 arg0) {
    }

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "()Z")
    public final boolean method1194() {
        return true;
    }

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "()V")
    public void method1166() {
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[Lcba;)V")
    public final void method1193(int arg0, class469[] arg1) {
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
    public void method278(int arg0) {
        this.field6153[arg0].method1470(true, Thread.currentThread());
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class309 arg6, int arg7, int arg8) {
        class300 var10 = (class300) arg6;
        int[] var11 = var10.field3849;
        int[] var12 = var10.field3845;
        int var13 = this.field6150 > arg8 ? this.field6150 : arg8;
        int var14 = this.field6167 < var11.length + arg8 ? this.field6167 : var11.length + arg8;
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
            if (arg0 < this.field6187) {
                var18 += (this.field6187 - arg0) * var20;
                arg0 = this.field6187;
            }
            if (var21 >= this.field6184) {
                var21 = this.field6184 - 1;
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
                                int var28 = this.field6171 * var25 + arg0;
                                int var29 = this.field6172[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field6172[var28] = var23 + var30;
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
                                int var34 = this.field6171 * var31 + arg0;
                                int var35 = this.field6172[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field6172[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field6172[this.field6171 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field6187 && var64 < this.field6184 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field6172[this.field6171 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field6187 && var50 < this.field6184 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field6171 * arg1 + var50;
                        int var54 = this.field6172[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field6172[this.field6171 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field6187 && var56 < this.field6184 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field6171 * arg1 + var56;
                        int var60 = this.field6172[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field6172[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "()F")
    public final float method1167() {
        return this.field6162;
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)V")
    public final void method1163(int arg0) {
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lm;)V")
    public final void method1160(class163 arg0) {
        this.field6151 = (class487) arg0;
    }

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "()Lfd;")
    public final class448 method1172() {
        return new class448(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
    public abstract void method275(int arg0);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lsaa;III)V")
    public final void method2607(class272 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field3534;
        int var7 = arg3 << 1;
        if (var5 == -1) {
            this.method1124(arg1, arg2, arg3, arg0.field3541, 1);
        } else {
            if (this.field6190 != var5) {
                class52 var8 = (class52) this.field6188.method3682(0, (long) var5);
                if (var8 == null) {
                    int[] var9 = this.method2610(var5);
                    if (var9 == null) {
                        return;
                    }
                    int var10 = this.method2611(var5) ? 64 : 128;
                    var8 = this.method1114(var9, 0, var10, var10, var10);
                    this.field6188.method3684(var8, 0, (long) var5);
                }
                this.field6190 = var5;
                this.field6191 = var8;
            }
            ++var7;
            this.field6191.method6(arg1 - arg3, arg2 - arg3, var7, var7, 0, arg0.field3541, 1);
        }
    }

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "(I)Z")
    public final boolean method2608(int arg0) {
        return super.field2481.method118(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "(ILpa;II)V")
    public final void method1180(int arg0, class309 arg1, int arg2, int arg3) {
        class300 var5 = (class300) arg1;
        int[] var6 = var5.field3849;
        int[] var7 = var5.field3845;
        int var8;
        if (this.field6167 < var6.length + arg3) {
            var8 = this.field6167 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field6150 > arg3) {
            var9 = this.field6150 - arg3;
            arg3 = this.field6150;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field6171 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field6187 > var12) {
                    var13 -= this.field6187 - var12;
                    var12 = this.field6187;
                }
                if (this.field6184 < var12 + var13) {
                    var13 = this.field6184 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field6172[var14++] = arg0;
                }
                var10 += this.field6171;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1187(Canvas arg0) {
        class558 var2 = (class558) this.field6144.method2645((long) arg0.hashCode(), (byte) -99);
        if (var2 == null) {
            class558 var3 = class82.method482(arg0, 127);
            this.field6144.method2640(1, (long) arg0.hashCode(), var3);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIII)Lmv;")
    public final class313 method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ldp;Z)Lha;")
    public final class52 method1101(class3 arg0, boolean arg1) {
        int[] var3 = arg0.field13;
        byte[] var4 = arg0.field11;
        int var5 = arg0.field15;
        int var6 = arg0.field14;
        class505 var11;
        if (arg1 && arg0.field9 == null) {
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
            var11 = new class624(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field9;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class1(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class494(this, var14, var5, var6);
            }
        }
        var11.method297(arg0.field12, arg0.field10, arg0.field17, arg0.field16);
        return var11;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method268(Canvas arg0);

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "()Z")
    public final boolean method2609() {
        return this.field6143;
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "()Z")
    public final boolean method1108() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "(I)[I")
    private final int[] method2610(int arg0) {
        class641 var2 = this.field6170;
        class176 var3;
        synchronized (this.field6170) {
            var3 = (class176) this.field6170.method3682(0, (long) arg0);
            if (var3 == null) {
                if (!super.field2481.method118(arg0, (byte) 32)) {
                    return null;
                }
                class217 var5 = super.field2481.method119(-124, arg0);
                int var6 = !var5.field2642 && !this.field6179 ? 128 : 64;
                var3 = new class176(arg0, var6, super.field2481.method116(0.7F, -115, var6, true, var6, arg0), var5.field2645);
                this.field6170.method3684(var3, 0, (long) arg0);
            }
        }
        var3.field2141 = true;
        return var3.method979();
    }

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "(I)Z")
    public final boolean method2611(int arg0) {
        return this.field6179 || super.field2481.method119(-111, arg0).field2642;
    }

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "()Z")
    public final boolean method1169() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field2481.method119(-114, arg5).field2646) {
                if (this.field6190 != arg5) {
                    class52 var10 = (class52) this.field6188.method3682(0, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method2610(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method2611(arg5) ? 64 : 128;
                        var10 = this.method1114(var11, 0, var12, var12, var12);
                        this.field6188.method3684(var10, 0, (long) arg5);
                    }
                    this.field6190 = arg5;
                    this.field6191 = var10;
                }
                this.field6191.method6(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method1124(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "(I)[I")
    public final int[] method2613(int arg0) {
        class641 var2 = this.field6170;
        class176 var3;
        synchronized (this.field6170) {
            var3 = (class176) this.field6170.method3682(0, (long) arg0);
            if (var3 == null) {
                if (!super.field2481.method118(arg0, (byte) 31)) {
                    return null;
                }
                class217 var5 = super.field2481.method119(-117, arg0);
                int var6 = !var5.field2642 && !this.field6179 ? 128 : 64;
                var3 = new class176(arg0, var6, super.field2481.method120(var6, true, 0.7F, arg0, var6, 98), var5.field2645);
                this.field6170.method3684(var3, 0, (long) arg0);
            }
        }
        var3.field2141 = true;
        return var3.method979();
    }

    @OriginalMember(owner = "client!hr", name = "CA", descriptor = "()I")
    public final int method1129() {
        return this.field6185;
    }

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "(IIII)[I")
    public final int[] method1111(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field6171 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field6172[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hr", name = "ra", descriptor = "()F")
    public final float method1186() {
        return this.field6182;
    }

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "()Lm;")
    public final class163 method1150() {
        return new class487();
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIF)Lcba;")
    public final class469 method1134(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
    public final void method1116(boolean arg0) {
        this.field6179 = arg0;
        this.field6170.method3687(1402);
    }

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "(III)V")
    public final void method1120(int arg0, int arg1, int arg2) {
        this.field6176 = arg0 & 16777215;
        int var4 = this.field6176 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field6176 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field6176 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field6176 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field6181 = false;
        } else {
            this.field6181 = true;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)I")
    public final int method1145(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIII)V")
    public final void method1179(int arg0, int arg1, int arg2, int arg3) {
        this.field6164 = arg0;
        this.field6174 = arg1;
        this.field6178 = arg2;
        this.field6189 = arg3;
        this.method269();
    }

    @OriginalMember(owner = "client!hr", name = "IA", descriptor = "(III[I)V")
    public final void method1112(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field6151.field6808 * arg2 + this.field6151.field6811 * arg1 + this.field6151.field6807 * arg0 >> 15) + this.field6151.field6800;
        if (var5 >= this.field6149 && var5 <= this.field6185) {
            int var6 = ((this.field6151.field6805 * arg2 + this.field6151.field6804 * arg0 + this.field6151.field6801 * arg1 >> 15) + this.field6151.field6802) * this.field6178 / var5;
            int var7 = ((this.field6151.field6806 * arg2 + this.field6151.field6809 * arg0 + this.field6151.field6803 * arg1 >> 15) + this.field6151.field6810) * this.field6189 / var5;
            if (var6 >= this.field6169 && var6 <= this.field6183 && var7 >= this.field6159 && var7 <= this.field6158) {
                arg3[0] = var6 - this.field6169;
                arg3[1] = var7 - this.field6159;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lei;IIII)Lr;")
    public abstract class157 method277(class152 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "()V")
    public final void method1117() {
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "()Z")
    public final boolean method1105() {
        return true;
    }

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "(IIII)V")
    public final void method1107(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field6171) {
            arg2 = this.field6171;
        }
        if (arg3 > this.field6155) {
            arg3 = this.field6155;
        }
        this.field6187 = arg0;
        this.field6184 = arg2;
        this.field6150 = arg1;
        this.field6167 = arg3;
        this.method269();
    }

    @OriginalMember(owner = "client!hr", name = "UA", descriptor = "(IIIII)V")
    public final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field6150 && arg1 < this.field6167) {
            if (arg0 < this.field6187) {
                arg2 -= this.field6187 - arg0;
                arg0 = this.field6187;
            }
            if (arg0 + arg2 > this.field6184) {
                arg2 = this.field6184 - arg0;
            }
            int var6 = this.field6171 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6172[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field6172[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field6172[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field6172[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field6172[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([IIIII)Lha;")
    public final class52 method1114(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class1(this, arg0, arg1, arg2, arg3, arg4) : new class494(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class1(this, arg0, arg1, arg2, arg3, arg4) : new class494(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "()V")
    public final void method2614() {
        for (int var1 = 0; var1 < this.field6168; ++var1) {
            this.field6153[var1].method1471(1);
        }
        this.method1182();
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lr;Lka;Lm;Lcf;I)V")
    public final void method1177(class157 arg0, class400 arg1, class163 arg2, class517 arg3, int arg4) {
        ((class73) arg0).method409(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIIIII)V")
    public final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1130(arg0, arg1, arg2, arg4, arg5);
        this.method1130(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1110(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1110(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "(IIII)V")
    public final void method1164(int arg0, int arg1, int arg2, int arg3) {
        this.field6156 = this.field6176;
        this.field6160 = arg0;
        this.field6176 = arg1;
        this.field6186 = arg2;
        this.field6177 = true;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lmv;Lmv;FLmv;)Lmv;")
    public final class313 method1162(class313 arg0, class313 arg1, float arg2, class313 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!hr", name = "ta", descriptor = "(II)V")
    public final void method1184(int arg0, int arg1) {
        this.field6149 = arg0;
        this.field6185 = arg1;
        this.field6165 = this.field6185 - 255;
        this.method2615();
    }

    @OriginalMember(owner = "client!hr", name = "JA", descriptor = "(IIII)V")
    public final void method1159(int arg0, int arg1, int arg2, int arg3) {
        this.field6160 = arg0;
        this.field6176 = arg1;
        this.field6186 = arg2;
    }

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "()Z")
    public final boolean method1190() {
        return true;
    }

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "(IIII)V")
    public final void method1119(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6187 < arg0) {
            this.field6187 = arg0;
        }
        if (this.field6150 < arg1) {
            this.field6150 = arg1;
        }
        if (this.field6184 > arg2) {
            this.field6184 = arg2;
        }
        if (this.field6167 > arg3) {
            this.field6167 = arg3;
        }
        this.method269();
    }

    @OriginalMember(owner = "client!hr", name = "YA", descriptor = "()I")
    public final int method1157() {
        int var1 = this.field6161;
        this.field6161 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1139(Rectangle[] arg0, int arg1) {
        if (this.field6142 != null && this.field6147 != null) {
            try {
                Graphics var3 = this.field6142.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field6171 && var5.y <= this.field6155 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field6147.method227(var5.width, var5.height, var3, var5.y, (byte) 7, var5.x);
                    }
                }
            } catch (Exception var6) {
                this.field6142.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lka;)V")
    public final void method1140(class400 arg0) {
        class412 var2 = arg0.field5256.field5442;
        for (class412 var3 = var2.field5353; var2 != var3; var3 = var3.field5353) {
            class272 var4 = (class272) var3;
            int var5 = var4.field3525 >> 12;
            int var6 = var4.field3535 >> 12;
            int var7 = var4.field3530 >> 12;
            int var8 = (this.field6151.field6808 * var7 + this.field6151.field6811 * var6 + this.field6151.field6807 * var5 >> 15) + this.field6151.field6800;
            if (var8 >= this.field6149 && var8 <= this.field6165) {
                int var9 = ((this.field6151.field6805 * var7 + this.field6151.field6804 * var5 + this.field6151.field6801 * var6 >> 15) + this.field6151.field6802) * this.field6178 / var8 + this.field6164;
                int var10 = ((this.field6151.field6806 * var7 + this.field6151.field6809 * var5 + this.field6151.field6803 * var6 >> 15) + this.field6151.field6810) * this.field6189 / var8 + this.field6174;
                if (var9 >= this.field6187 && var9 <= this.field6184 && var10 >= this.field6150 && var10 <= this.field6167) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2607(var4, var9, var10, (this.field6178 * var4.field3540 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIIIZ)Lha;")
    public final class52 method1161(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field6171 * arg1 + arg0;
        int var8 = this.field6171 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field6172[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class1(this, var6, arg2, arg3);
        } else {
            return new class494(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method274(Canvas arg0);

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "()Lm;")
    public final class163 method1126() {
        class263 var1 = this.method276(Thread.currentThread());
        return var1.field3386;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public abstract void method272(int arg0);

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "()V")
    public final void method1192() {
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(IIIIII)V")
    public final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1130(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1130(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1110(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1110(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field6187) {
                    var10 += (this.field6187 - arg0) * var12;
                    arg0 = this.field6187;
                }
                if (var13 >= this.field6184) {
                    var13 = this.field6184 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field6150 && var17 < this.field6167) {
                                int var18 = this.field6171 * var17 + arg0;
                                int var19 = this.field6172[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field6172[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field6150 && var21 < this.field6167) {
                                int var22 = this.field6171 * var21 + arg0;
                                int var23 = this.field6172[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field6172[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field6150 && var27 < this.field6167) {
                            this.field6172[this.field6171 * var27 + arg0] = arg4;
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
                if (arg1 < this.field6150) {
                    var29 += (this.field6150 - arg1) * var31;
                    arg1 = this.field6150;
                }
                if (var32 >= this.field6167) {
                    var32 = this.field6167 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field6187 && var46 < this.field6184) {
                            this.field6172[this.field6171 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field6187 && var36 < this.field6184) {
                            int var37 = this.field6171 * arg1 + var36;
                            int var38 = this.field6172[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field6172[this.field6171 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field6187 && var40 < this.field6184) {
                            int var41 = this.field6171 * arg1 + var40;
                            int var42 = this.field6172[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field6172[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "()V")
    public abstract void method269();

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "()Z")
    public final boolean method1155() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "(IFFFFF)V")
    public final void method1188(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field6154 = (int) (arg1 * 65535.0F);
        this.field6175 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field6180 = (int) (arg3 * 65535.0F / var7);
        this.field6148 = (int) (arg4 * 65535.0F / var7);
        this.field6157 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lr;Lka;Lm;[Lcf;I)V")
    public abstract void method270(class157[] arg0, class400 arg1, class163 arg2, class517[] arg3, int arg4);

    @OriginalMember(owner = "client!hr", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field6171 * arg1 + arg0;
            int var15 = this.field6171 - arg2;
            if (arg1 + arg3 > this.field6167) {
                arg3 -= arg1 + arg3 - this.field6167;
            }
            if (arg1 < this.field6150) {
                int var16 = this.field6150 - arg1;
                arg3 -= var16;
                var14 += this.field6171 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field6184) {
                int var17 = arg0 + arg2 - this.field6184;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field6187) {
                int var18 = this.field6187 - arg0;
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
                            int var28 = this.field6172[var14];
                            this.field6172[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field6172[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field6172[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field6172[var14++] = arg5;
                        } else {
                            this.field6172[var14++] = arg4;
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

    @OriginalMember(owner = "client!hr", name = "ba", descriptor = "()I")
    public final int method1147() {
        int var1 = this.field6173;
        this.field6173 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public final void method1138(int arg0) {
        int var2 = arg0 - this.field6146;
        for (Object var3 = this.field6170.method3681(0); var3 != null; var3 = this.field6170.method3690(true)) {
            class176 var4 = (class176) var3;
            if (var4.field2141) {
                var4.field2144 += var2;
                int var5 = var4.field2144 / 20;
                if (var5 > 0) {
                    class217 var6 = super.field2481.method119(-124, var4.field2143);
                    var4.method980(var6.field2651 * var2 * 50 / 1000, var6.field2660 * var2 * 50 / 1000);
                    var4.field2144 -= var5 * 20;
                }
                var4.field2141 = false;
            }
        }
        this.field6146 = arg0;
        this.field6188.method3686((byte) 53, 5);
    }

    @OriginalMember(owner = "client!hr", name = "la", descriptor = "(FF)V")
    public final void method1106(float arg0, float arg1) {
        this.field6162 = arg0;
        this.field6182 = arg1;
        this.method2615();
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(Z)V")
    public final void method1185(boolean arg0) {
    }

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "()Z")
    public final boolean method1174() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "()Z")
    public final boolean method1141() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)I")
    public final int method1128(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "()V")
    public final void method1158() {
        if (this.field6145) {
            class475.method2774(false, true, -1);
            this.field6145 = false;
        }
        this.field6147 = null;
        this.field6142 = null;
        this.field6144 = null;
        this.field6143 = true;
    }

    @OriginalMember(owner = "client!hr", name = "Z", descriptor = "(I)V")
    public final void method1156(int arg0) {
        this.method1133(0, 0, this.field6171, this.field6155, arg0, 0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class174 method265(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)V")
    public final void method1181(boolean arg0) {
    }

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "(IIIII)V")
    public final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field6150) {
            var6 = this.field6150;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field6167) {
            var7 = this.field6167;
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
                if (var64 < this.field6187) {
                    var64 = this.field6187;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field6184) {
                    var65 = this.field6184;
                }
                int var66 = this.field6171 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field6172[var66++] = arg3;
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
                if (var60 < this.field6187) {
                    var60 = this.field6187;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field6184 - 1) {
                    var61 = this.field6184 - 1;
                }
                int var62 = this.field6171 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field6172[var62++] = arg3;
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
                if (var28 < this.field6187) {
                    var28 = this.field6187;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field6184) {
                    var29 = this.field6184;
                }
                int var30 = this.field6171 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field6172[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field6172[var30++] = var15 + var33;
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
                if (var22 < this.field6187) {
                    var22 = this.field6187;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field6184 - 1) {
                    var23 = this.field6184 - 1;
                }
                int var24 = this.field6171 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field6172[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field6172[var24++] = var15 + var27;
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
                if (var47 < this.field6187) {
                    var47 = this.field6187;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field6184) {
                    var48 = this.field6184;
                }
                int var49 = this.field6171 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field6172[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field6172[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field6187) {
                    var39 = this.field6187;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field6184 - 1) {
                    var40 = this.field6184 - 1;
                }
                int var41 = this.field6171 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field6172[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field6172[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "(F)V")
    public final void method1165(float arg0) {
        this.field6163 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "()V")
    public final void method1123() {
        if (this.field6142 != null && this.field6147 != null) {
            try {
                Graphics var1 = this.field6142.getGraphics();
                this.field6147.method226(0, 0, var1, (byte) 108);
            } catch (Exception var2) {
                this.field6142.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "()Z")
    public abstract boolean method271();

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "(I)V")
    public final void method1121(int arg0) {
    }

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "()Z")
    public final boolean method1143() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIII)V")
    public final void method1132(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "()V")
    public final void method1182() {
        this.field6187 = 0;
        this.field6150 = 0;
        this.field6184 = this.field6171;
        this.field6167 = this.field6155;
        this.method269();
    }

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "()Z")
    public final boolean method1135() {
        return true;
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "([I)V")
    public final void method1183(int[] arg0) {
        arg0[0] = this.field6187;
        arg0[1] = this.field6150;
        arg0[2] = this.field6184;
        arg0[3] = this.field6167;
    }

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "()V")
    public final void method1137() {
        this.field6170.method3687(1402);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "()Z")
    public final boolean method1104() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(FFF)V")
    public final void method1171(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "(IIIII)V")
    public final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field6187 && arg0 < this.field6184) {
            if (arg1 < this.field6150) {
                arg2 -= this.field6150 - arg1;
                arg1 = this.field6150;
            }
            if (arg1 + arg2 > this.field6167) {
                arg2 = this.field6167 - arg1;
            }
            int var6 = this.field6171 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6171 * var10 + var6;
                        int var12 = this.field6172[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field6172[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field6171 * var14 + var6;
                        int var16 = this.field6172[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field6172[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field6172[this.field6171 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lfc;[Ldp;Z)Lra;")
    public final class90 method1153(class216 arg0, class3[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field15;
            var5[var7] = arg1[var7].field14;
            if (arg1[var7].field9 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class296(this, arg0, arg1, var4, var5);
            } else {
                return new class616(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class432(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "()I")
    public final int method1122() {
        return 0;
    }

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "()V")
    private final void method2615() {
        if (this.field6182 != 0.0F) {
            float var1 = (float) this.field6185;
            float var2 = (float) this.field6149;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field6162 / (this.field6182 + this.field6162);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field6182;
            this.field6166 = (int) (((float) this.field6185 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field6166 = this.field6185;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lvc;")
    public abstract class263 method276(Runnable arg0);

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "()I")
    public final int method1175() {
        return this.field6149;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class446(Canvas arg0, class17 arg1) {
        this(arg1);
        this.method1187(arg0);
        this.method274(arg0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lr;Lm;[Lcf;I)V")
    public abstract void method273(class157[] arg0, class163 arg1, class517[] arg2, int arg3);

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "()Z")
    public final boolean method1173() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "()Z")
    public final boolean method1144() {
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "()I")
    public final int method1127() {
        return 0;
    }

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "()V")
    public final void method1131() {
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)Lu;")
    public final class64 method1191(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "(I)I")
    public final int method2616(int arg0) {
        return super.field2481.method119(-109, arg0).field2641 & 65535;
    }
}
