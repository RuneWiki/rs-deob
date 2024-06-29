import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class188 extends class118 {

    @OriginalMember(owner = "client!co", name = "B", descriptor = "Z")
    private boolean field2174 = false;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    public int field2187 = 0;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    private int field2168 = 0;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public int field2167 = 0;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public int field2171 = 512;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public int field2169 = 50;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public int field2184 = 78642;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    public int field2183 = 0;

    @OriginalMember(owner = "client!co", name = "Y", descriptor = "Z")
    private boolean field2196 = false;

    @OriginalMember(owner = "client!co", name = "Z", descriptor = "I")
    private int field2197 = 0;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "I")
    private int field2192 = 0;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "I")
    public int field2193 = 75518;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "I")
    public int field2185 = 45823;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "I")
    public int field2186 = 0;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public int field2175 = 0;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "Z")
    public boolean field2190 = false;

    @OriginalMember(owner = "client!co", name = "mb", descriptor = "I")
    private int field2210 = 3500;

    @OriginalMember(owner = "client!co", name = "jb", descriptor = "I")
    public int field2207 = 0;

    @OriginalMember(owner = "client!co", name = "kb", descriptor = "I")
    public int field2208 = this.field2210 - 255;

    @OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
    public int field2198 = 3500;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public int field2176 = 512;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    public int field2180 = 0;

    @OriginalMember(owner = "client!co", name = "nb", descriptor = "Z")
    private boolean field2211 = false;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "Lhq;")
    private class365 field2178 = new class365(16);

    @OriginalMember(owner = "client!co", name = "z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2172;

    @OriginalMember(owner = "client!co", name = "eb", descriptor = "Lgd;")
    public class172 field2202;

    @OriginalMember(owner = "client!co", name = "bb", descriptor = "Llo;")
    private class318 field2199;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "[I")
    public int[] field2188;

    @OriginalMember(owner = "client!co", name = "W", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    private int field2179;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "F")
    private float field2177;

    @OriginalMember(owner = "client!co", name = "fb", descriptor = "F")
    private float field2203;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    private int field2173;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!co", name = "R", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!co", name = "X", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!co", name = "cb", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!co", name = "hb", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!co", name = "ib", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!co", name = "lb", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!co", name = "ob", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!co", name = "db", descriptor = "Ljo;")
    public class331 field2201;

    @OriginalMember(owner = "client!co", name = "pb", descriptor = "Lhq;")
    private class365 field2213;

    @OriginalMember(owner = "client!co", name = "qb", descriptor = "Llq;")
    private class5 field2214;

    @OriginalMember(owner = "client!co", name = "gb", descriptor = "Z")
    public boolean field2204;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "[Lde;")
    private class8[] field2182;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lts;)V")
    public final void method717(class33 arg0) {
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "()I")
    public final int method699() {
        int var1 = this.field2197;
        this.field2197 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!co", name = "u", descriptor = "()I")
    public final int method751() {
        return this.field2210;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(IIII)V")
    public final void method766(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!co", name = "L", descriptor = "()I")
    public final int method788() {
        return 0;
    }

    @OriginalMember(owner = "client!co", name = "f", descriptor = "(IIIIII)Z")
    public final boolean method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field2201.field4508 * arg2 + this.field2201.field4516 * arg0 + this.field2201.field4511 * arg1 >> 15) + this.field2201.field4514;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field2201.field4508 * arg5 + this.field2201.field4516 * arg3 + this.field2201.field4511 * arg4 >> 15) + this.field2201.field4514;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field2169 || var8 >= this.field2169) && (var7 <= this.field2210 || var8 <= this.field2210)) {
            int var9 = ((this.field2201.field4512 * arg2 + this.field2201.field4518 * arg0 + this.field2201.field4513 * arg1 >> 15) + this.field2201.field4507) * this.field2171 / var7;
            int var10 = ((this.field2201.field4512 * arg5 + this.field2201.field4518 * arg3 + this.field2201.field4513 * arg4 >> 15) + this.field2201.field4507) * this.field2171 / var8;
            if (var9 < this.field2189 && var10 < this.field2189 || var9 > this.field2200 && var10 > this.field2200) {
                return false;
            } else {
                int var11 = ((this.field2201.field4509 * arg2 + this.field2201.field4515 * arg0 + this.field2201.field4510 * arg1 >> 15) + this.field2201.field4517) * this.field2176 / var7;
                int var12 = ((this.field2201.field4509 * arg5 + this.field2201.field4515 * arg3 + this.field2201.field4510 * arg4 >> 15) + this.field2201.field4517) * this.field2176 / var8;
                return (var11 >= this.field2195 || var12 >= this.field2195) && (var11 <= this.field2181 || var12 <= this.field2181);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II[I[I)Lem;")
    public final class423 method786(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class80(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(II)V")
    public final void method752(int arg0, int arg1) {
        this.field2175 = arg0 & 16777215;
        int var3 = this.field2175 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field2175 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field2175 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field2175 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field2204 = false;
        } else {
            this.field2204 = true;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lfa;[Liq;Z)Lak;")
    public final class31 method747(class347 arg0, class132[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1507;
            var5[var7] = arg1[var7].field1509;
            if (arg1[var7].field1501 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class110(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class351(this, arg0, arg1, var4, var5);
        } else {
            return new class21(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
    public final void method743(int arg0) {
        this.field2182[arg0].method38((Runnable) null, (byte) 28);
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(IIIII)V")
    public final void method709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2187 && arg1 < this.field2207) {
            if (arg0 < this.field2183) {
                arg2 -= this.field2183 - arg0;
                arg0 = this.field2183;
            }
            if (arg0 + arg2 > this.field2186) {
                arg2 = this.field2186 - arg0;
            }
            int var6 = this.field2194 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2188[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2188[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2188[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2188[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2188[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(III)V")
    public final void method712(int arg0, int arg1, int arg2) {
        this.field2180 = arg0;
        this.field2175 = arg1;
        this.field2167 = arg2;
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(IIII)V")
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        this.field2170 = arg0;
        this.field2212 = arg1;
        this.field2171 = arg2;
        this.field2176 = arg3;
        this.method1169();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "()Z")
    public final boolean method1158() {
        return this.field2174;
    }

    @OriginalMember(owner = "client!co", name = "y", descriptor = "()Z")
    public final boolean method762() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
    public final void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class8 var8 = this.method1160(Thread.currentThread());
        class13 var9 = var8.field78;
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
            int var21 = arg0 - var9.method72();
            int var22 = arg1 - var9.method76();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field169 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field169 = 255 - (arg4 >> 24);
            }
            var9.field165 = var23 < 0 || var23 > var9.field159 || var24 < 0 || var24 > var9.field159 || var25 < 0 || var25 > var9.field159;
            var9.method75(var27, var28, var29, var23, var24, var25, arg4);
            var9.field165 = var23 < 0 || var23 > var9.field159 || var24 < 0 || var24 > var9.field159 || var26 < 0 || var26 > var9.field159;
            var9.method75(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "()V")
    private final void method1159() {
        this.field2213 = new class365(20);
        this.field2201 = new class331();
        class220.method1339(true, false, 0);
        this.field2196 = true;
        this.method695(1);
        this.method759(0);
        this.method732();
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(II)V")
    public final void method750(int arg0, int arg1) {
        this.field2169 = arg0;
        this.field2210 = arg1;
        this.field2208 = this.field2210 - 255;
        this.method1161();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lge;Lsk;Lwr;Lfi;I)V")
    public final void method729(class386 arg0, class291 arg1, class450 arg2, class34 arg3, int arg4) {
        ((class400) arg0).method2474(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
    public final void method728(int arg0) {
        this.method789(0, 0, this.field2194, this.field2179, arg0, 0);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIILem;II)V")
    public final void method702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class423 arg6, int arg7, int arg8) {
        class80 var10 = (class80) arg6;
        int[] var11 = var10.field978;
        int[] var12 = var10.field971;
        int var13 = this.field2187 > arg8 ? this.field2187 : arg8;
        int var14 = this.field2207 < var11.length + arg8 ? this.field2207 : var11.length + arg8;
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
            if (arg0 < this.field2183) {
                var18 += (this.field2183 - arg0) * var20;
                arg0 = this.field2183;
            }
            if (var21 >= this.field2186) {
                var21 = this.field2186 - 1;
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
                                int var28 = this.field2194 * var25 + arg0;
                                int var29 = this.field2188[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2188[var28] = var23 + var30;
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
                                int var34 = this.field2194 * var31 + arg0;
                                int var35 = this.field2188[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2188[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2188[this.field2194 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2183 && var64 < this.field2186 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2188[this.field2194 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2183 && var50 < this.field2186 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2194 * arg1 + var50;
                        int var54 = this.field2188[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2188[this.field2194 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2183 && var56 < this.field2186 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2194 * arg1 + var56;
                        int var60 = this.field2188[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2188[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "o", descriptor = "()V")
    public final void method727() {
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public final void method706(int arg0) {
        int var2 = arg0 - this.field2173;
        for (Object var3 = this.field2213.method2287(0); var3 != null; var3 = this.field2213.method2292(9754)) {
            class410 var4 = (class410) var3;
            if (var4.field5657) {
                var4.field5655 += var2;
                int var5 = var4.field5655 / 20;
                if (var5 > 0) {
                    class358 var6 = this.field2202.method960(var4.field5659, (byte) -40);
                    var4.method2544(var6.field4853 * var2 * 50 / 1000, var6.field4850 * var2 * 50 / 1000);
                    var4.field5655 -= var5 * 20;
                }
                var4.field5657 = false;
            }
        }
        this.field2173 = arg0;
        this.field2178.method2286(5, (byte) 36);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/Runnable;)Lde;")
    public final class8 method1160(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2191; ++var2) {
            if (this.field2182[var2].field77 == arg0) {
                return this.field2182[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "()V")
    private final void method1161() {
        if (this.field2177 != 0.0F) {
            float var1 = (float) this.field2210;
            float var2 = (float) this.field2169;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field2203 / (this.field2203 + this.field2177);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field2177;
            this.field2198 = (int) (((float) this.field2210 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field2198 = this.field2210;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IFFFFF)V")
    public final void method737(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2185 = (int) (arg1 * 65535.0F);
        this.field2184 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2206 = (int) (arg3 * 65535.0F / var7);
        this.field2205 = (int) (arg4 * 65535.0F / var7);
        this.field2209 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2194 * arg1 + arg0;
            int var15 = this.field2194 - arg2;
            if (arg1 + arg3 > this.field2207) {
                arg3 -= arg1 + arg3 - this.field2207;
            }
            if (arg1 < this.field2187) {
                int var16 = this.field2187 - arg1;
                arg3 -= var16;
                var14 += this.field2194 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2186) {
                int var17 = arg0 + arg2 - this.field2186;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2183) {
                int var18 = this.field2183 - arg0;
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
                            int var28 = this.field2188[var14];
                            this.field2188[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2188[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2188[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2188[var14++] = arg5;
                        } else {
                            this.field2188[var14++] = arg4;
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

    @OriginalMember(owner = "client!co", name = "G", descriptor = "()I")
    public final int method778() {
        int var1 = this.field2192;
        this.field2192 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!co", name = "J", descriptor = "()Z")
    public final boolean method783() {
        return true;
    }

    @OriginalMember(owner = "client!co", name = "j", descriptor = "()Z")
    public final boolean method711() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lac;)V")
    public final void method724(class197 arg0) {
    }

    @OriginalMember(owner = "client!co", name = "q", descriptor = "()V")
    public final void method732() {
        this.field2183 = 0;
        this.field2187 = 0;
        this.field2186 = this.field2194;
        this.field2207 = this.field2179;
        this.method1169();
    }

    @OriginalMember(owner = "client!co", name = "E", descriptor = "()I")
    public final int method775() {
        return 0;
    }

    @OriginalMember(owner = "client!co", name = "i", descriptor = "(I)Z")
    public final boolean method1162(int arg0) {
        return this.field2211 || this.field2202.method960(arg0, (byte) -40).field4856;
    }

    @OriginalMember(owner = "client!co", name = "j", descriptor = "(I)I")
    public final int method1163(int arg0) {
        return this.field2202.method960(arg0, (byte) -40).field4864 & 65535;
    }

    @OriginalMember(owner = "client!co", name = "k", descriptor = "(I)[I")
    public final int[] method1164(int arg0) {
        class365 var2 = this.field2213;
        class410 var3;
        synchronized (this.field2213) {
            var3 = (class410) this.field2213.method2295((long) arg0, (byte) 74);
            if (var3 == null) {
                if (!this.field2202.method963(arg0, true)) {
                    return null;
                }
                class358 var5 = this.field2202.method960(arg0, (byte) -40);
                int var6 = !var5.field4856 && !this.field2211 ? 128 : 64;
                var3 = new class410(arg0, var6, this.field2202.method965(127, var6, arg0, 0.7F, var6, true), var5.field4848);
                this.field2213.method2294(var3, (byte) 86, (long) arg0);
            }
        }
        var3.field5657 = true;
        return var3.method2545();
    }

    @OriginalMember(owner = "client!co", name = "f", descriptor = "()V")
    public final void method694() {
        this.field2213.method2298(0);
    }

    @OriginalMember(owner = "client!co", name = "K", descriptor = "()Z")
    public final boolean method785() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "D", descriptor = "()I")
    public final int method771() {
        return this.field2169;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lbp;III)V")
    public final void method1165(class56 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field645;
        if (var6 == -1) {
            this.method719(arg1, arg2, var5, arg0.field641, 1);
        } else {
            if (this.field2214 == null || (long) var6 != this.field2214.field505) {
                this.field2214 = (class5) this.field2178.method2295((long) var6, (byte) 74);
            }
            if (this.field2214 == null) {
                int[] var7 = this.method1167(var6);
                if (var7 == null) {
                    return;
                }
                this.field2214 = new class5();
                this.field2214.field34 = this.method1162(var6);
                int var8 = this.field2214.field34 ? 64 : 128;
                this.field2214.field35 = this.method703(var7, 0, var8, var8, var8);
                this.field2178.method2294(this.field2214, (byte) 28, (long) var6);
            }
            if (this.field2214.field34) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field2214.field35.method163(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field641, 1);
        }
    }

    @OriginalMember(owner = "client!co", name = "z", descriptor = "()F")
    public final float method764() {
        return this.field2177;
    }

    @OriginalMember(owner = "client!co", name = "v", descriptor = "()V")
    public final void method757() {
        if (this.field2172 != null && this.field2199 != null) {
            try {
                Graphics var1 = this.field2172.getGraphics();
                this.field2199.method1600(0, 0, var1, true);
            } catch (Exception var2) {
                this.field2172.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(FF)V")
    public final void method773(float arg0, float arg1) {
        this.field2203 = arg0;
        this.field2177 = arg1;
        this.method1161();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
    public final int method707(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!co", name = "p", descriptor = "()V")
    public final void method730() {
        if (this.field2196) {
            class365.method2297((byte) 57, true, false);
            this.field2196 = false;
        }
        this.field2172 = null;
        this.field2202 = null;
        this.field2199 = null;
        this.field2174 = true;
    }

    @OriginalMember(owner = "client!co", name = "h", descriptor = "()Z")
    public final boolean method708() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "l", descriptor = "(I)Z")
    public final boolean method1166(int arg0) {
        return this.field2202.method960(arg0, (byte) -40).field4854;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(IIII)V")
    public final void method774(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2194) {
            arg2 = this.field2194;
        }
        if (arg3 > this.field2179) {
            arg3 = this.field2179;
        }
        this.field2183 = arg0;
        this.field2186 = arg2;
        this.field2187 = arg1;
        this.field2207 = arg3;
        this.method1169();
    }

    @OriginalMember(owner = "client!co", name = "m", descriptor = "(I)[I")
    private final int[] method1167(int arg0) {
        class365 var2 = this.field2213;
        class410 var3;
        synchronized (this.field2213) {
            var3 = (class410) this.field2213.method2295((long) arg0, (byte) 74);
            if (var3 == null) {
                if (!this.field2202.method963(arg0, true)) {
                    return null;
                }
                class358 var5 = this.field2202.method960(arg0, (byte) -40);
                int var6 = !var5.field4856 && !this.field2211 ? 128 : 64;
                var3 = new class410(arg0, var6, this.field2202.method964(arg0, var6, -22968, 0.7F, var6, true), var5.field4848);
                this.field2213.method2294(var3, (byte) 92, (long) arg0);
            }
        }
        var3.field5657 = true;
        return var3.method2545();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method713(Rectangle[] arg0, int arg1) {
        if (this.field2172 != null && this.field2199 != null) {
            try {
                Graphics var3 = this.field2172.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2194 && var5.y <= this.field2179 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2199.method1599(var5.y, 0, var5.x, var5.height, var5.width, var3);
                    }
                }
            } catch (Exception var6) {
                this.field2172.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!co", name = "I", descriptor = "()Z")
    public final boolean method781() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)V")
    public final void method755(boolean arg0) {
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class8 var11 = this.method1160(Thread.currentThread());
        class13 var12 = var11.field78;
        var12.field164 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field164 = false;
            var12.field169 = 0;
            var12.field165 = true;
            var12.method70(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field164 = false;
            var12.field169 = 255 - var13;
            var12.field165 = true;
            var12.method70(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field164 = true;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILem;II)V")
    public final void method704(int arg0, class423 arg1, int arg2, int arg3) {
        class80 var5 = (class80) arg1;
        int[] var6 = var5.field978;
        int[] var7 = var5.field971;
        int var8;
        if (this.field2207 < var6.length + arg3) {
            var8 = this.field2207 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2187 > arg3) {
            var9 = this.field2187 - arg3;
            arg3 = this.field2187;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2194 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2183 > var12) {
                    var13 -= this.field2183 - var12;
                    var12 = this.field2183;
                }
                if (this.field2186 < var12 + var13) {
                    var13 = this.field2186 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2188[var14++] = arg0;
                }
                var10 += this.field2194;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "B", descriptor = "()Lwr;")
    public final class450 method769() {
        return new class331();
    }

    @OriginalMember(owner = "client!co", name = "f", descriptor = "(I)Lac;")
    public final class197 method758(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)I")
    public final int method721(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([I)V")
    public final void method722(int[] arg0) {
        arg0[0] = this.field2183;
        arg0[1] = this.field2187;
        arg0[2] = this.field2186;
        arg0[3] = this.field2207;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([IIIII)Lc;")
    public final class436 method703(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class216(this, arg0, arg1, arg2, arg3, arg4) : new class45(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class216(this, arg0, arg1, arg2, arg3, arg4) : new class45(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!co", name = "n", descriptor = "(I)Z")
    public final boolean method1168(int arg0) {
        return this.field2202.method963(arg0, true);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(F)V")
    public final void method688(float arg0) {
        this.field2193 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(IIII)V")
    public final void method768(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2183 < arg0) {
            this.field2183 = arg0;
        }
        if (this.field2187 < arg1) {
            this.field2187 = arg1;
        }
        if (this.field2186 > arg2) {
            this.field2186 = arg2;
        }
        if (this.field2207 > arg3) {
            this.field2207 = arg3;
        }
        this.method1169();
    }

    @OriginalMember(owner = "client!co", name = "r", descriptor = "()V")
    public final void method735() {
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public final void method690(boolean arg0) {
    }

    @OriginalMember(owner = "client!co", name = "l", descriptor = "()Z")
    public final boolean method723() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "i", descriptor = "()V")
    public final void method710() {
        this.field2175 = this.field2168;
        this.field2190 = false;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "()Z")
    public final boolean method689() {
        return true;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    public final void method686(int arg0, int arg1, int arg2) {
        this.field2168 = this.field2175;
        this.field2180 = arg0;
        this.field2175 = arg1;
        this.field2167 = arg2;
        this.field2190 = true;
    }

    @OriginalMember(owner = "client!co", name = "M", descriptor = "()V")
    private final void method1169() {
        this.field2189 = this.field2183 - this.field2170;
        this.field2200 = this.field2186 - this.field2170;
        this.field2195 = this.field2187 - this.field2212;
        this.field2181 = this.field2207 - this.field2212;
        for (int var1 = 0; var1 < this.field2191; ++var1) {
            class13 var5 = this.field2182[var1].field78;
            var5.field168 = this.field2170 - this.field2183;
            var5.field163 = this.field2212 - this.field2187;
            var5.field159 = this.field2186 - this.field2183;
            var5.field166 = this.field2207 - this.field2187;
        }
        int var2 = this.field2194 * this.field2187 + this.field2183;
        for (int var3 = this.field2187; var3 < this.field2207; ++var3) {
            for (int var4 = 0; var4 < this.field2191; ++var4) {
                this.field2182[var4].field78.field162[var3 - this.field2187] = var2;
            }
            var2 += this.field2194;
        }
    }

    @OriginalMember(owner = "client!co", name = "t", descriptor = "()Lwr;")
    public final class450 method742() {
        class8 var1 = this.method1160(Thread.currentThread());
        return var1.field69;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lsk;)V")
    public final void method738(class291 arg0) {
        class143 var2 = arg0.field3847.field879;
        for (class143 var3 = var2.field1677; var2 != var3; var3 = var3.field1677) {
            class56 var4 = (class56) var3;
            int var5 = var4.field650 >> 12;
            int var6 = var4.field646 >> 12;
            int var7 = var4.field643 >> 12;
            int var8 = (this.field2201.field4508 * var7 + this.field2201.field4516 * var5 + this.field2201.field4511 * var6 >> 15) + this.field2201.field4514;
            if (var8 >= this.field2169 && var8 <= this.field2210) {
                int var9 = ((this.field2201.field4512 * var7 + this.field2201.field4518 * var5 + this.field2201.field4513 * var6 >> 15) + this.field2201.field4507) * this.field2171 / var8 + this.field2170;
                int var10 = ((this.field2201.field4509 * var7 + this.field2201.field4515 * var5 + this.field2201.field4510 * var6 >> 15) + this.field2201.field4517) * this.field2176 / var8 + this.field2212;
                if (var9 >= this.field2183 && var9 <= this.field2186 && var10 >= this.field2187 && var10 <= this.field2207) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1165(var4, var9, var10, (var4.field640 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "H", descriptor = "()Z")
    public final boolean method779() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(IIIIII)V")
    public final void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method709(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method709(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method696(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method696(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2183) {
                    var10 += (this.field2183 - arg0) * var12;
                    arg0 = this.field2183;
                }
                if (var13 >= this.field2186) {
                    var13 = this.field2186 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2187 && var17 < this.field2207) {
                                int var18 = this.field2194 * var17 + arg0;
                                int var19 = this.field2188[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2188[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2187 && var21 < this.field2207) {
                                int var22 = this.field2194 * var21 + arg0;
                                int var23 = this.field2188[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2188[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2187 && var27 < this.field2207) {
                            this.field2188[this.field2194 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2187) {
                    var29 += (this.field2187 - arg1) * var31;
                    arg1 = this.field2187;
                }
                if (var32 >= this.field2207) {
                    var32 = this.field2207 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2183 && var46 < this.field2186) {
                            this.field2188[this.field2194 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2183 && var36 < this.field2186) {
                            int var37 = this.field2194 * arg1 + var36;
                            int var38 = this.field2188[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2188[this.field2194 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2183 && var40 < this.field2186) {
                            int var41 = this.field2194 * arg1 + var40;
                            int var42 = this.field2188[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2188[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(IIIII)V")
    public final void method719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2187) {
            var6 = this.field2187;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2207) {
            var7 = this.field2207;
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
                if (var64 < this.field2183) {
                    var64 = this.field2183;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2186) {
                    var65 = this.field2186;
                }
                int var66 = this.field2194 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2188[var66++] = arg3;
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
                if (var60 < this.field2183) {
                    var60 = this.field2183;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2186 - 1) {
                    var61 = this.field2186 - 1;
                }
                int var62 = this.field2194 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2188[var62++] = arg3;
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
                if (var28 < this.field2183) {
                    var28 = this.field2183;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2186) {
                    var29 = this.field2186;
                }
                int var30 = this.field2194 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2188[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2188[var30++] = var15 + var33;
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
                if (var22 < this.field2183) {
                    var22 = this.field2183;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2186 - 1) {
                    var23 = this.field2186 - 1;
                }
                int var24 = this.field2194 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2188[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2188[var24++] = var15 + var27;
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
                if (var47 < this.field2183) {
                    var47 = this.field2183;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2186) {
                    var48 = this.field2186;
                }
                int var49 = this.field2194 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2188[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2188[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2183) {
                    var39 = this.field2183;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2186 - 1) {
                    var40 = this.field2186 - 1;
                }
                int var41 = this.field2194 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2188[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2188[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)[I")
    public final int[] method756(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2194 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2188[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(IIIIII)Lts;")
    public final class33 method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II[[I[[IIII)Lip;")
    public final class279 method715(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class166(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method693(Canvas arg0) {
        this.field2172 = arg0;
        this.method776();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIZ)Lc;")
    public final class436 method767(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2194 * arg1 + arg0;
        int var8 = this.field2194 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2188[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class216(this, var6, arg2, arg3);
        } else {
            return new class45(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(Z)V")
    public final void method787(boolean arg0) {
        this.field2211 = arg0;
        this.field2213.method2298(0);
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
    public final void method759(int arg0) {
        this.field2182[arg0].method38(Thread.currentThread(), (byte) 28);
    }

    @OriginalMember(owner = "client!co", name = "x", descriptor = "()Z")
    public final boolean method761() {
        return true;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public final void method695(int arg0) {
        if (this.field2191 != arg0) {
            this.field2191 = arg0;
            this.field2182 = new class8[this.field2191];
            for (int var2 = 0; var2 < this.field2191; ++var2) {
                this.field2182[var2] = new class8(this);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Lsi;)V")
    public final void method784(int arg0, class92[] arg1) {
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Liq;Z)Lc;")
    public final class436 method697(class132 arg0, boolean arg1) {
        int[] var3 = arg0.field1505;
        byte[] var4 = arg0.field1503;
        int var5 = arg0.field1507;
        int var6 = arg0.field1509;
        class47 var11;
        if (arg1 && arg0.field1501 == null) {
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
            var11 = new class26(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1501;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class216(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class216(this, var14, var5, var6);
                var11 = new class45(this, var14, var5, var6);
            }
        }
        var11.method232(arg0.field1506, arg0.field1508, arg0.field1502, arg0.field1504);
        return var11;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lwr;)V")
    public final void method749(class450 arg0) {
        this.field2201 = (class331) arg0;
    }

    @OriginalMember(owner = "client!co", name = "A", descriptor = "()V")
    public final void method765() {
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(IIIIII)V")
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2183) {
            arg2 -= this.field2183 - arg0;
            arg0 = this.field2183;
        }
        if (arg1 < this.field2187) {
            arg3 -= this.field2187 - arg1;
            arg1 = this.field2187;
        }
        if (arg0 + arg2 > this.field2186) {
            arg2 = this.field2186 - arg0;
        }
        if (arg1 + arg3 > this.field2207) {
            arg3 = this.field2207 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2186 && arg1 <= this.field2207) {
            int var7 = this.field2194 - arg2;
            int var8 = this.field2194 * arg1 + arg0;
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
                            this.field2188[var24] = arg4;
                            ++var24;
                            this.field2188[var24] = arg4;
                            ++var24;
                            this.field2188[var24] = arg4;
                            ++var24;
                            this.field2188[var24] = arg4;
                            ++var24;
                            this.field2188[var24] = arg4;
                            ++var24;
                            this.field2188[var24] = arg4;
                            ++var24;
                            this.field2188[var24] = arg4;
                            ++var24;
                            this.field2188[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2188[var24] = arg4;
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
                        int var14 = this.field2188[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field2188[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2188[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2188[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
    public final void method696(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2183 && arg0 < this.field2186) {
            if (arg1 < this.field2187) {
                arg2 -= this.field2187 - arg1;
                arg1 = this.field2187;
            }
            if (arg1 + arg2 > this.field2207) {
                arg2 = this.field2207 - arg1;
            }
            int var6 = this.field2194 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2194 * var10 + var6;
                        int var12 = this.field2188[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2188[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2194 * var14 + var6;
                        int var16 = this.field2188[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2188[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2188[this.field2194 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(FFF)V")
    public final void method777(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "()Z")
    public final boolean method692() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "w", descriptor = "()F")
    public final float method760() {
        return this.field2203;
    }

    @OriginalMember(owner = "client!co", name = "s", descriptor = "()Z")
    public final boolean method740() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "k", descriptor = "()Z")
    public final boolean method714() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "C", descriptor = "()Z")
    public final boolean method770() {
        return true;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lhf;IIII)Lge;")
    public final class386 method701(class402 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class400(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(IIIIII)V")
    public final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method709(arg0, arg1, arg2, arg4, arg5);
        this.method709(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method696(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method696(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!co", name = "n", descriptor = "()Z")
    public final boolean method726() {
        return false;
    }

    @OriginalMember(owner = "client!co", name = "F", descriptor = "()V")
    public final void method776() {
        this.field2199 = class275.method1730((byte) -63, this.field2172);
        this.field2188 = this.field2199.field4283;
        this.field2194 = this.field2199.field4280;
        this.field2179 = this.field2199.field4281;
        for (int var1 = 0; var1 < this.field2191; ++var1) {
            this.field2182[var1].method40(10);
        }
        this.method732();
    }

    @OriginalMember(owner = "client!co", name = "m", descriptor = "()V")
    public final void method725() {
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III[I)V")
    public final void method718(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field2201.field4508 * arg2 + this.field2201.field4516 * arg0 + this.field2201.field4511 * arg1 >> 15) + this.field2201.field4514;
        if (var5 >= this.field2169 && var5 <= this.field2210) {
            int var6 = ((this.field2201.field4512 * arg2 + this.field2201.field4518 * arg0 + this.field2201.field4513 * arg1 >> 15) + this.field2201.field4507) * this.field2171 / var5;
            int var7 = ((this.field2201.field4509 * arg2 + this.field2201.field4515 * arg0 + this.field2201.field4510 * arg1 >> 15) + this.field2201.field4517) * this.field2176 / var5;
            if (var6 >= this.field2189 && var6 <= this.field2200 && var7 >= this.field2195 && var7 <= this.field2181) {
                arg3[0] = var6 - this.field2189;
                arg3[1] = var7 - this.field2195;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([Lge;Lwr;[Lfi;I)V")
    public final void method746(class386[] arg0, class450 arg1, class34[] arg2, int arg3) {
        class400[] var5 = new class400[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class400) arg0[var6];
            }
        }
        class400 var7 = class400.method2480(this, var5);
        var7.method2474(arg1, arg2 != null ? arg2[0] : null, (class291) null, arg3);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([Lge;Lsk;Lwr;[Lfi;I)V")
    public final void method720(class386[] arg0, class291 arg1, class450 arg2, class34[] arg3, int arg4) {
        class400[] var6 = new class400[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class400) arg0[var7];
            }
        }
        class400 var8 = class400.method2480(this, var6);
        var8.method2474(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lts;Lts;FLts;)Lts;")
    public final class33 method687(class33 arg0, class33 arg1, float arg2, class33 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lgd;I)V")
    public class188(Canvas arg0, class172 arg1, int arg2) {
        this.field2172 = arg0;
        this.field2202 = arg1;
        super.field1360 = arg2;
        this.field2199 = class275.method1730((byte) -63, this.field2172);
        this.field2188 = this.field2199.field4283;
        this.field2194 = this.field2199.field4280;
        this.field2179 = this.field2199.field4281;
        this.method1159();
    }
}
