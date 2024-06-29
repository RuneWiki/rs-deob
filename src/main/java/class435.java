import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class435 extends class38 {

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Z")
    private boolean field6175;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "Z")
    private boolean field6177;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Lek;")
    private class352 field6179;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public int field6196;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "Z")
    private boolean field6190;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public int field6203;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public int field6181;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public int field6211;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public int field6207;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    private int field6209;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public int field6193;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public int field6213;

    @OriginalMember(owner = "client!ji", name = "jb", descriptor = "I")
    private int field6216;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    public int field6214;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    private int field6208;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    private int field6198;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "Z")
    public boolean field6185;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!ji", name = "ob", descriptor = "I")
    public int field6221;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!ji", name = "pb", descriptor = "I")
    public int field6222;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public int field6210;

    @OriginalMember(owner = "client!ji", name = "mb", descriptor = "Ljk;")
    private class449 field6219;

    @OriginalMember(owner = "client!ji", name = "rb", descriptor = "I")
    private int field6224;

    @OriginalMember(owner = "client!ji", name = "nb", descriptor = "Ljk;")
    private class449 field6220;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "Lco;")
    public class77 field6191;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "F")
    private float field6197;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "F")
    private float field6205;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    private int field6178;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public int field6182;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public int field6184;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public int field6195;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public int field6200;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public int field6201;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public int field6202;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public int field6204;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public int field6206;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
    public int field6215;

    @OriginalMember(owner = "client!ji", name = "kb", descriptor = "I")
    private int field6217;

    @OriginalMember(owner = "client!ji", name = "lb", descriptor = "I")
    public int field6218;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "Ll;")
    private class16 field6187;

    @OriginalMember(owner = "client!ji", name = "qb", descriptor = "Ll;")
    private class16 field6223;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Lng;")
    private class228 field6176;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6180;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Z")
    public boolean field6183;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "[I")
    public int[] field6188;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "[Lcb;")
    private class362[] field6212;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "()Z")
    public final boolean method360() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class143 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class358(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public final void method336(int arg0) {
        if (this.field6202 != arg0) {
            this.field6202 = arg0;
            this.field6212 = new class362[this.field6202];
            for (int var2 = 0; var2 < this.field6202; ++var2) {
                this.field6212[var2] = new class362(this);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        class377 var10 = (class377) arg6;
        int[] var11 = var10.field4956;
        int[] var12 = var10.field4954;
        int var13 = this.field6210 > arg8 ? this.field6210 : arg8;
        int var14 = this.field6207 < var11.length + arg8 ? this.field6207 : var11.length + arg8;
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
            if (arg0 < this.field6222) {
                var18 += (this.field6222 - arg0) * var20;
                arg0 = this.field6222;
            }
            if (var21 >= this.field6211) {
                var21 = this.field6211 - 1;
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
                                int var28 = this.field6206 * var25 + arg0;
                                int var29 = this.field6188[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field6188[var28] = var23 + var30;
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
                                int var34 = this.field6206 * var31 + arg0;
                                int var35 = this.field6188[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field6188[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field6188[this.field6206 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field6222 && var64 < this.field6211 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field6188[this.field6206 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field6222 && var50 < this.field6211 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field6206 * arg1 + var50;
                        int var54 = this.field6188[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field6188[this.field6206 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field6222 && var56 < this.field6211 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field6206 * arg1 + var56;
                        int var60 = this.field6188[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field6188[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "TA", descriptor = "(IIIII)V")
    public final void method321(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field6222 && arg0 < this.field6211) {
            if (arg1 < this.field6210) {
                arg2 -= this.field6210 - arg1;
                arg1 = this.field6210;
            }
            if (arg1 + arg2 > this.field6207) {
                arg2 = this.field6207 - arg1;
            }
            int var6 = this.field6206 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6206 * var10 + var6;
                        int var12 = this.field6188[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field6188[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field6206 * var14 + var6;
                        int var16 = this.field6188[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field6188[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field6188[this.field6206 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([Lt;Lc;[Lvs;I)V")
    public final void method335(class474[] arg0, class123 arg1, class419[] arg2, int arg3) {
        class388[] var5 = new class388[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class388) arg0[var6];
            }
        }
        class388 var7 = class388.method2210(this, var5);
        var7.method2199(arg1, arg2 != null ? arg2[0] : null, (class517) null, arg3);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.field6212[arg0].method2081(Thread.currentThread(), 8191);
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "()Z")
    public final boolean method297() {
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "()Z")
    public final boolean method2543() {
        return this.field6177;
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)Z")
    public final boolean method2544(int arg0) {
        return super.field502.method1642(arg0, 125).field1783;
    }

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "(I)V")
    public final void method325(int arg0) {
        this.method308(0, 0, this.field6206, this.field6217, arg0, 0);
    }

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "()V")
    public final void method309() {
        if (this.field6175) {
            class466.method2811(true, false, (byte) -49);
            this.field6175 = false;
        }
        this.field6176 = null;
        this.field6180 = null;
        this.field6179 = null;
        this.field6177 = true;
    }

    @OriginalMember(owner = "client!ji", name = "ca", descriptor = "(ILma;II)V")
    public final void method324(int arg0, class10 arg1, int arg2, int arg3) {
        class377 var5 = (class377) arg1;
        int[] var6 = var5.field4956;
        int[] var7 = var5.field4954;
        int var8;
        if (this.field6207 < var6.length + arg3) {
            var8 = this.field6207 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field6210 > arg3) {
            var9 = this.field6210 - arg3;
            arg3 = this.field6210;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field6206 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field6222 > var12) {
                    var13 -= this.field6222 - var12;
                    var12 = this.field6222;
                }
                if (this.field6211 < var12 + var13) {
                    var13 = this.field6211 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field6188[var14++] = arg0;
                }
                var10 += this.field6206;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()V")
    public final void method288() {
        if (this.field6180 != null && this.field6176 != null) {
            try {
                Graphics var1 = this.field6180.getGraphics();
                this.field6176.method1385(28525, var1, 0, 0);
            } catch (Exception var2) {
                this.field6180.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "()Z")
    public final boolean method368() {
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "()Lc;")
    public final class123 method369() {
        class362 var1 = this.method2549(Thread.currentThread());
        return var1.field4673;
    }

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "()V")
    private final void method2545() {
        for (int var1 = 0; var1 < this.field6202; ++var1) {
            this.field6212[var1].method2077(120);
        }
        this.method318();
    }

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "(III[I)V")
    public final void method270(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field6191.field999 * arg2 + this.field6191.field997 * arg0 + this.field6191.field1005 * arg1 >> 15) + this.field6191.field995;
        if (var5 >= this.field6221 && var5 <= this.field6208) {
            int var6 = ((this.field6191.field994 * arg2 + this.field6191.field1002 * arg1 + this.field6191.field1001 * arg0 >> 15) + this.field6191.field1003) * this.field6192 / var5;
            int var7 = ((this.field6191.field1004 * arg2 + this.field6191.field998 * arg1 + this.field6191.field996 * arg0 >> 15) + this.field6191.field1000) * this.field6196 / var5;
            if (var6 >= this.field6218 && var6 <= this.field6204 && var7 >= this.field6199 && var7 <= this.field6215) {
                arg3[0] = var6 - this.field6218;
                arg3[1] = var7 - this.field6199;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
    public final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class362 var8 = this.method2549(Thread.currentThread());
        class408 var9 = var8.field4665;
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
            int var21 = arg0 - var9.method2418();
            int var22 = arg1 - var9.method2408();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field5836 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5836 = 255 - (arg4 >> 24);
            }
            var9.field5830 = var23 < 0 || var23 > var9.field5826 || var24 < 0 || var24 > var9.field5826 || var25 < 0 || var25 > var9.field5826;
            var9.method2410(var27, var28, var29, var23, var24, var25, arg4);
            var9.field5830 = var23 < 0 || var23 > var9.field5826 || var24 < 0 || var24 > var9.field5826 || var26 < 0 || var26 > var9.field5826;
            var9.method2410(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!ji", name = "ZA", descriptor = "()I")
    public final int method367() {
        int var1 = this.field6216;
        this.field6216 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfm;)V")
    public final void method351(class517 arg0) {
        class169 var2 = arg0.field7487.field3985;
        for (class169 var3 = var2.field2165; var2 != var3; var3 = var3.field2165) {
            class45 var4 = (class45) var3;
            int var5 = var4.field536 >> 12;
            int var6 = var4.field535 >> 12;
            int var7 = var4.field530 >> 12;
            int var8 = (this.field6191.field999 * var7 + this.field6191.field997 * var5 + this.field6191.field1005 * var6 >> 15) + this.field6191.field995;
            if (var8 >= this.field6221 && var8 <= this.field6186) {
                int var9 = ((this.field6191.field994 * var7 + this.field6191.field1002 * var6 + this.field6191.field1001 * var5 >> 15) + this.field6191.field1003) * this.field6192 / var8 + this.field6195;
                int var10 = ((this.field6191.field1004 * var7 + this.field6191.field998 * var6 + this.field6191.field996 * var5 >> 15) + this.field6191.field1000) * this.field6196 / var8 + this.field6200;
                if (var9 >= this.field6222 && var9 <= this.field6211 && var10 >= this.field6210 && var10 <= this.field6207) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2555(var4, var9, var10, (var4.field534 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public final void method280(boolean arg0) {
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field502.method1642(arg5, -58).field1775) {
                if (this.field6224 != arg5) {
                    class16 var10 = (class16) this.field6219.method2647(-109, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method2550(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method2552(arg5) ? 64 : 128;
                        var10 = this.method299(var11, 0, var12, var12, var12);
                        this.field6219.method2635((long) arg5, -26591, var10);
                    }
                    this.field6224 = arg5;
                    this.field6223 = var10;
                }
                this.field6223.method135(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method331(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "()Z")
    public final boolean method363() {
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)[I")
    public final int[] method2547(int arg0) {
        class449 var2 = this.field6220;
        class30 var3;
        synchronized (this.field6220) {
            var3 = (class30) this.field6220.method2647(-107, (long) arg0);
            if (var3 == null) {
                if (!super.field502.method1638(-15, arg0)) {
                    return null;
                }
                class139 var5 = super.field502.method1642(arg0, 121);
                int var6 = !var5.field1773 && !this.field6190 ? 128 : 64;
                var3 = new class30(arg0, var6, super.field502.method1641(true, 13724, var6, 0.7F, var6, arg0), var5.field1793);
                this.field6220.method2635((long) arg0, -26591, var3);
            }
        }
        var3.field402 = true;
        return var3.method220();
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILga;)V")
    private class435(int arg0, class278 arg1) {
        super(arg0, arg1);
        this.field6175 = false;
        this.field6177 = false;
        this.field6179 = new class352(4);
        this.field6189 = 0;
        this.field6196 = 512;
        this.field6192 = 512;
        this.field6190 = false;
        this.field6203 = 0;
        this.field6181 = 0;
        this.field6211 = 0;
        this.field6207 = 0;
        this.field6209 = 0;
        this.field6193 = 3500;
        this.field6213 = 45823;
        this.field6216 = 0;
        this.field6214 = 75518;
        this.field6208 = 3500;
        this.field6198 = 0;
        this.field6185 = false;
        this.field6194 = 78642;
        this.field6221 = 50;
        this.field6186 = this.field6208 - 255;
        this.field6222 = 0;
        this.field6210 = 0;
        this.field6219 = new class449(16);
        this.field6224 = -1;
        this.field6220 = new class449(20);
        this.field6191 = new class77();
        this.method336(1);
        this.method279(0);
        class102.method773(true, false, 31207);
        this.field6175 = true;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIIII)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method301(arg0, arg1, arg2, arg4, arg5);
        this.method301(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method321(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method321(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)I")
    public final int method2548(int arg0) {
        return super.field502.method1642(arg0, 124).field1795 & 65535;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lu;)V")
    public final void method276(class53 arg0) {
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Runnable;)Lcb;")
    public final class362 method2549(Runnable arg0) {
        for (int var2 = 0; var2 < this.field6202; ++var2) {
            if (this.field6212[var2].field4671 == arg0) {
                return this.field6212[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "NA", descriptor = "(IIIII)V")
    public final void method331(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field6210) {
            var6 = this.field6210;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field6207) {
            var7 = this.field6207;
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
                if (var64 < this.field6222) {
                    var64 = this.field6222;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field6211) {
                    var65 = this.field6211;
                }
                int var66 = this.field6206 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field6188[var66++] = arg3;
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
                if (var60 < this.field6222) {
                    var60 = this.field6222;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field6211 - 1) {
                    var61 = this.field6211 - 1;
                }
                int var62 = this.field6206 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field6188[var62++] = arg3;
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
                if (var28 < this.field6222) {
                    var28 = this.field6222;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field6211) {
                    var29 = this.field6211;
                }
                int var30 = this.field6206 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field6188[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field6188[var30++] = var15 + var33;
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
                if (var22 < this.field6222) {
                    var22 = this.field6222;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field6211 - 1) {
                    var23 = this.field6211 - 1;
                }
                int var24 = this.field6206 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field6188[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field6188[var24++] = var15 + var27;
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
                if (var47 < this.field6222) {
                    var47 = this.field6222;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field6211) {
                    var48 = this.field6211;
                }
                int var49 = this.field6206 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field6188[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field6188[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field6222) {
                    var39 = this.field6222;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field6211 - 1) {
                    var40 = this.field6211 - 1;
                }
                int var41 = this.field6206 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field6188[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field6188[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "(I)[I")
    private final int[] method2550(int arg0) {
        class449 var2 = this.field6220;
        class30 var3;
        synchronized (this.field6220) {
            var3 = (class30) this.field6220.method2647(-116, (long) arg0);
            if (var3 == null) {
                if (!super.field502.method1638(-117, arg0)) {
                    return null;
                }
                class139 var5 = super.field502.method1642(arg0, 125);
                int var6 = !var5.field1773 && !this.field6190 ? 128 : 64;
                var3 = new class30(arg0, var6, super.field502.method1640(var6, 0.7F, var6, (byte) -24, true, arg0), var5.field1793);
                this.field6220.method2635((long) arg0, -26591, var3);
            }
        }
        var3.field402 = true;
        return var3.method220();
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)V")
    public final void method346(boolean arg0) {
        this.field6190 = arg0;
        this.field6220.method2642(0);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)I")
    public final int method370(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "()V")
    private final void method2551() {
        if (this.field6197 != 0.0F) {
            float var1 = (float) this.field6208;
            float var2 = (float) this.field6221;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field6205 / (this.field6205 + this.field6197);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field6197;
            this.field6193 = (int) (((float) this.field6208 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field6193 = this.field6208;
        }
    }

    @OriginalMember(owner = "client!ji", name = "xa", descriptor = "()F")
    public final float method333() {
        return this.field6197;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()I")
    public final int method268() {
        return this.field6221;
    }

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "()V")
    public final void method352() {
        this.field6220.method2642(0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[I[I)Lma;")
    public final class10 method290(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class377(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ji", name = "JA", descriptor = "(IIIIII)Z")
    public final boolean method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field6191.field999 * arg2 + this.field6191.field997 * arg0 + this.field6191.field1005 * arg1 >> 15) + this.field6191.field995;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field6191.field999 * arg5 + this.field6191.field997 * arg3 + this.field6191.field1005 * arg4 >> 15) + this.field6191.field995;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field6221 || var8 >= this.field6221) && (var7 <= this.field6208 || var8 <= this.field6208)) {
            int var9 = ((this.field6191.field994 * arg2 + this.field6191.field1002 * arg1 + this.field6191.field1001 * arg0 >> 15) + this.field6191.field1003) * this.field6192 / var7;
            int var10 = ((this.field6191.field994 * arg5 + this.field6191.field1002 * arg4 + this.field6191.field1001 * arg3 >> 15) + this.field6191.field1003) * this.field6192 / var8;
            if (var9 < this.field6218 && var10 < this.field6218 || var9 > this.field6204 && var10 > this.field6204) {
                return false;
            } else {
                int var11 = ((this.field6191.field1004 * arg2 + this.field6191.field998 * arg1 + this.field6191.field996 * arg0 >> 15) + this.field6191.field1000) * this.field6196 / var7;
                int var12 = ((this.field6191.field1004 * arg5 + this.field6191.field998 * arg4 + this.field6191.field996 * arg3 >> 15) + this.field6191.field1000) * this.field6196 / var8;
                return (var11 >= this.field6199 || var12 >= this.field6199) && (var11 <= this.field6215 || var12 <= this.field6215);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "(IIIIII)V")
    public final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field6222) {
            arg2 -= this.field6222 - arg0;
            arg0 = this.field6222;
        }
        if (arg1 < this.field6210) {
            arg3 -= this.field6210 - arg1;
            arg1 = this.field6210;
        }
        if (arg0 + arg2 > this.field6211) {
            arg2 = this.field6211 - arg0;
        }
        if (arg1 + arg3 > this.field6207) {
            arg3 = this.field6207 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field6211 && arg1 <= this.field6207) {
            int var7 = this.field6206 - arg2;
            int var8 = this.field6206 * arg1 + arg0;
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
                            this.field6188[var24] = arg4;
                            ++var24;
                            this.field6188[var24] = arg4;
                            ++var24;
                            this.field6188[var24] = arg4;
                            ++var24;
                            this.field6188[var24] = arg4;
                            ++var24;
                            this.field6188[var24] = arg4;
                            ++var24;
                            this.field6188[var24] = arg4;
                            ++var24;
                            this.field6188[var24] = arg4;
                            ++var24;
                            this.field6188[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field6188[var24] = arg4;
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
                        int var14 = this.field6188[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field6188[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field6188[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field6188[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "(I)Z")
    public final boolean method2552(int arg0) {
        return this.field6190 || super.field502.method1642(arg0, 122).field1773;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIF)Lku;")
    public final class256 method295(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()V")
    public final void method318() {
        this.field6222 = 0;
        this.field6210 = 0;
        this.field6211 = this.field6206;
        this.field6207 = this.field6217;
        this.method2554();
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(FF)V")
    public final void method338(float arg0, float arg1) {
        this.field6205 = arg0;
        this.field6197 = arg1;
        this.method2551();
    }

    @OriginalMember(owner = "client!ji", name = "MA", descriptor = "(I)V")
    public final void method305(int arg0) {
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(FFF)V")
    public final void method348(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "(IIII)[I")
    public final int[] method341(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field6206 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field6188[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "(I)Z")
    public final boolean method2553(int arg0) {
        return super.field502.method1638(-71, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "da", descriptor = "([I)V")
    public final void method267(int[] arg0) {
        arg0[0] = this.field6222;
        arg0[1] = this.field6210;
        arg0[2] = this.field6211;
        arg0[3] = this.field6207;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[Lku;)V")
    public final void method311(int arg0, class256[] arg1) {
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
    public final int method307(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lkc;)V")
    public final void method294(class87 arg0) {
    }

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "()V")
    public final void method313() {
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method277(Canvas arg0) {
        if (this.field6180 == arg0) {
            this.method342((Canvas) null);
        }
        class228 var2 = (class228) this.field6179.method2022(-1, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2165(16225);
        }
    }

    @OriginalMember(owner = "client!ji", name = "ia", descriptor = "(II)V")
    public final void method274(int arg0, int arg1) {
        this.field6221 = arg0;
        this.field6208 = arg1;
        this.field6186 = this.field6208 - 255;
        this.method2551();
    }

    @OriginalMember(owner = "client!ji", name = "YA", descriptor = "()I")
    public final int method306() {
        return this.field6208;
    }

    @OriginalMember(owner = "client!ji", name = "OA", descriptor = "(IIII)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field6206) {
            arg2 = this.field6206;
        }
        if (arg3 > this.field6217) {
            arg3 = this.field6217;
        }
        this.field6222 = arg0;
        this.field6211 = arg2;
        this.field6210 = arg1;
        this.field6207 = arg3;
        this.method2554();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIII)Lkc;")
    public final class87 method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqv;Z)Ll;")
    public final class16 method345(class311 arg0, boolean arg1) {
        int[] var3 = arg0.field3981;
        byte[] var4 = arg0.field3979;
        int var5 = arg0.field3974;
        int var6 = arg0.field3980;
        class167 var11;
        if (arg1 && arg0.field3977 == null) {
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
            var11 = new class246(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field3977;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class217(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class217(this, var14, var5, var6);
                var11 = new class182(this, var14, var5, var6);
            }
        }
        var11.method133(arg0.field3976, arg0.field3978, arg0.field3973, arg0.field3975);
        return var11;
    }

    @OriginalMember(owner = "client!ji", name = "fa", descriptor = "(IIII)V")
    public final void method334(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6222 < arg0) {
            this.field6222 = arg0;
        }
        if (this.field6210 < arg1) {
            this.field6210 = arg1;
        }
        if (this.field6211 > arg2) {
            this.field6211 = arg2;
        }
        if (this.field6207 > arg3) {
            this.field6207 = arg3;
        }
        this.method2554();
    }

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        this.field6195 = arg0;
        this.field6200 = arg1;
        this.field6192 = arg2;
        this.field6196 = arg3;
        this.method2554();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class362 var11 = this.method2549(Thread.currentThread());
        class408 var12 = var11.field4665;
        var12.field5831 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field5831 = false;
            var12.field5836 = 0;
            var12.field5830 = true;
            var12.method2417(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field5831 = false;
            var12.field5836 = 255 - var13;
            var12.field5830 = true;
            var12.method2417(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field5831 = true;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class16 method296(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field6206 * arg1 + arg0;
        int var8 = this.field6206 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field6188[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class217(this, var6, arg2, arg3);
        } else {
            return new class182(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ji", name = "ea", descriptor = "(Lc;)V")
    public final void method287(class123 arg0) {
        this.field6191 = (class77) arg0;
    }

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "()Z")
    public final boolean method374() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method342(Canvas arg0) {
        if (arg0 != null) {
            class228 var2 = (class228) this.field6179.method2022(-1, (long) arg0.hashCode());
            if (var2 != null) {
                this.field6180 = arg0;
                this.field6176 = var2;
                if (this.field6187 == null) {
                    this.field6188 = var2.field2920;
                    this.field6206 = var2.field2917;
                    this.field6217 = var2.field2918;
                    this.method2545();
                    return;
                }
            }
        } else {
            this.field6180 = null;
            this.field6176 = null;
            if (this.field6187 == null) {
                this.field6188 = null;
                this.field6206 = this.field6217 = 1;
                this.method2545();
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "()V")
    public final void method365() {
    }

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "()V")
    public final void method329() {
        this.field6203 = this.field6198;
        this.field6185 = false;
    }

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "()Z")
    public final boolean method354() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "GA", descriptor = "(IIII)V")
    public final void method357(int arg0, int arg1, int arg2, int arg3) {
        this.field6189 = arg0;
        this.field6203 = arg1;
        this.field6181 = arg2;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public final void method285(int arg0) {
        this.field6212[arg0].method2081((Runnable) null, 8191);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method301(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method301(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method321(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method321(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field6222) {
                    var10 += (this.field6222 - arg0) * var12;
                    arg0 = this.field6222;
                }
                if (var13 >= this.field6211) {
                    var13 = this.field6211 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field6210 && var17 < this.field6207) {
                                int var18 = this.field6206 * var17 + arg0;
                                int var19 = this.field6188[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field6188[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field6210 && var21 < this.field6207) {
                                int var22 = this.field6206 * var21 + arg0;
                                int var23 = this.field6188[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field6188[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field6210 && var27 < this.field6207) {
                            this.field6188[this.field6206 * var27 + arg0] = arg4;
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
                if (arg1 < this.field6210) {
                    var29 += (this.field6210 - arg1) * var31;
                    arg1 = this.field6210;
                }
                if (var32 >= this.field6207) {
                    var32 = this.field6207 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field6222 && var46 < this.field6211) {
                            this.field6188[this.field6206 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field6222 && var36 < this.field6211) {
                            int var37 = this.field6206 * arg1 + var36;
                            int var38 = this.field6188[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field6188[this.field6206 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field6222 && var40 < this.field6211) {
                            int var41 = this.field6206 * arg1 + var40;
                            int var42 = this.field6188[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field6188[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "()Lc;")
    public final class123 method371() {
        return new class77();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([Lt;Lfm;Lc;[Lvs;I)V")
    public final void method310(class474[] arg0, class517 arg1, class123 arg2, class419[] arg3, int arg4) {
        class388[] var6 = new class388[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class388) arg0[var7];
            }
        }
        class388 var8 = class388.method2210(this, var6);
        var8.method2199(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public final void method359(int arg0) {
        int var2 = arg0 - this.field6178;
        for (Object var3 = this.field6220.method2641((byte) 102); var3 != null; var3 = this.field6220.method2638(-55)) {
            class30 var4 = (class30) var3;
            if (var4.field402) {
                var4.field405 += var2;
                int var5 = var4.field405 / 20;
                if (var5 > 0) {
                    class139 var6 = super.field502.method1642(var4.field400, 122);
                    var4.method222(var6.field1791 * var2 * 50 / 1000, var6.field1789 * var2 * 50 / 1000);
                    var4.field405 -= var5 * 20;
                }
                var4.field402 = false;
            }
        }
        this.field6178 = arg0;
        this.field6219.method2648(false, 5);
    }

    @OriginalMember(owner = "client!ji", name = "IA", descriptor = "()I")
    public final int method286() {
        return 0;
    }

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "()I")
    public final int method314() {
        return 0;
    }

    @OriginalMember(owner = "client!ji", name = "AA", descriptor = "(IIII)V")
    public final void method317(int arg0, int arg1, int arg2, int arg3) {
        this.field6198 = this.field6203;
        this.field6189 = arg0;
        this.field6203 = arg1;
        this.field6181 = arg2;
        this.field6185 = true;
    }

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "(F)V")
    public final void method282(float arg0) {
        this.field6214 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "()V")
    private final void method2554() {
        this.field6218 = this.field6222 - this.field6195;
        this.field6204 = this.field6211 - this.field6195;
        this.field6199 = this.field6210 - this.field6200;
        this.field6215 = this.field6207 - this.field6200;
        for (int var1 = 0; var1 < this.field6202; ++var1) {
            class408 var5 = this.field6212[var1].field4665;
            var5.field5834 = this.field6195 - this.field6222;
            var5.field5832 = this.field6200 - this.field6210;
            var5.field5826 = this.field6211 - this.field6222;
            var5.field5833 = this.field6207 - this.field6210;
        }
        int var2 = this.field6210 * this.field6206 + this.field6222;
        for (int var3 = this.field6210; var3 < this.field6207; ++var3) {
            for (int var4 = 0; var4 < this.field6202; ++var4) {
                this.field6212[var4].field4665.field5829[var3 - this.field6210] = var2;
            }
            var2 += this.field6206;
        }
    }

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "()Z")
    public final boolean method322() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "()Z")
    public final boolean method293() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIII)Ll;")
    public final class16 method299(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class217(this, arg0, arg1, arg2, arg3, arg4) : new class182(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class217(this, arg0, arg1, arg2, arg3, arg4) : new class182(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lbd;III)V")
    public final void method2555(class45 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field532;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method331(arg1, arg2, var6, arg0.field529, 1);
        } else {
            if (this.field6224 != var5) {
                class16 var7 = (class16) this.field6219.method2647(-105, (long) var5);
                if (var7 == null) {
                    int[] var8 = this.method2550(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method2552(var5) ? 64 : 128;
                    var7 = this.method299(var8, 0, var9, var9, var9);
                    this.field6219.method2635((long) var5, -26591, var7);
                }
                this.field6224 = var5;
                this.field6223 = var7;
            }
            if (this.field6223.method148() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field6223.method135(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field529, 1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method315(Canvas arg0) {
        class228 var2 = (class228) this.field6179.method2022(-1, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2165(16225);
            class228 var3 = class227.method1378(arg0, (byte) -116);
            this.field6179.method2019((byte) -35, var3, (long) arg0.hashCode());
            if (this.field6180 == arg0 && this.field6187 == null) {
                this.field6176 = var3;
                this.field6188 = var3.field2920;
                this.field6206 = var3.field2917;
                this.field6217 = var3.field2918;
                this.method2545();
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "()Z")
    public final boolean method339() {
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "(IFFFFF)V")
    public final void method328(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field6213 = (int) (arg1 * 65535.0F);
        this.field6194 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field6182 = (int) (arg3 * 65535.0F / var7);
        this.field6184 = (int) (arg4 * 65535.0F / var7);
        this.field6201 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method319(Rectangle[] arg0, int arg1) {
        if (this.field6180 != null && this.field6176 != null) {
            try {
                Graphics var3 = this.field6180.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field6206 && var5.y <= this.field6217 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field6176.method1389(var5.x, 255, var5.y, var3, var5.width, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field6180.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)Lu;")
    public final class53 method347(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "()I")
    public final int method298() {
        int var1 = this.field6209;
        this.field6209 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
    public final void method284(boolean arg0) {
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method271(Canvas arg0) {
        class228 var2 = (class228) this.field6179.method2022(-1, (long) arg0.hashCode());
        if (var2 == null) {
            class228 var3 = class227.method1378(arg0, (byte) -116);
            this.field6179.method2019((byte) -79, var3, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()Z")
    public final boolean method281() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lt;Lfm;Lc;Lvs;I)V")
    public final void method366(class474 arg0, class517 arg1, class123 arg2, class419 arg3, int arg4) {
        ((class388) arg0).method2199(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "()F")
    public final float method278() {
        return this.field6205;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V")
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field6210 && arg1 < this.field6207) {
            if (arg0 < this.field6222) {
                arg2 -= this.field6222 - arg0;
                arg0 = this.field6222;
            }
            if (arg0 + arg2 > this.field6211) {
                arg2 = this.field6211 - arg0;
            }
            int var6 = this.field6206 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6188[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field6188[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field6188[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field6188[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field6188[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public final void method332(int arg0) {
    }

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "()Z")
    public final boolean method362() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lmb;IIII)Lt;")
    public final class474 method361(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class388(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "()Z")
    public final boolean method316() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lli;[Lqv;Z)Lla;")
    public final class316 method300(class297 arg0, class311[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field3974;
            var5[var7] = arg1[var7].field3980;
            if (arg1[var7].field3977 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class134(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class224(this, arg0, arg1, var4, var5);
        } else {
            return new class7(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lkc;Lkc;FLkc;)Lkc;")
    public final class87 method273(class87 arg0, class87 arg1, float arg2, class87 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "()Z")
    public final boolean method289() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "()Z")
    public final boolean method304() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "DA", descriptor = "(IIIIII[BII)V")
    public final void method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field6206 * arg1 + arg0;
            int var15 = this.field6206 - arg2;
            if (arg1 + arg3 > this.field6207) {
                arg3 -= arg1 + arg3 - this.field6207;
            }
            if (arg1 < this.field6210) {
                int var16 = this.field6210 - arg1;
                arg3 -= var16;
                var14 += this.field6206 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field6211) {
                int var17 = arg0 + arg2 - this.field6211;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field6222) {
                int var18 = this.field6222 - arg0;
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
                            int var28 = this.field6188[var14];
                            this.field6188[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field6188[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field6188[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field6188[var14++] = arg5;
                        } else {
                            this.field6188[var14++] = arg4;
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

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
    public final void method272() {
    }

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "()Z")
    public final boolean method356() {
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "UA", descriptor = "(III)V")
    public final void method343(int arg0, int arg1, int arg2) {
        this.field6203 = arg0 & 16777215;
        int var4 = this.field6203 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field6203 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field6203 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field6203 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field6183 = false;
        } else {
            this.field6183 = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;)V")
    public class435(int arg0, Canvas arg1, class278 arg2) {
        this(arg0, arg2);
        this.method271(arg1);
        this.method342(arg1);
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "()V")
    public final void method302() {
    }
}
