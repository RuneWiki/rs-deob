import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class214 extends class166 {

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "Z")
    private boolean field2976;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "Z")
    private boolean field2977;

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "Lkea;")
    private class213 field2979;

    @OriginalMember(owner = "client!tea", name = "D", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "I")
    private int field2987;

    @OriginalMember(owner = "client!tea", name = "H", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!tea", name = "J", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!tea", name = "T", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!tea", name = "ab", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!tea", name = "X", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!tea", name = "Z", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!tea", name = "bb", descriptor = "Z")
    private boolean field3013;

    @OriginalMember(owner = "client!tea", name = "F", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!tea", name = "Q", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!tea", name = "W", descriptor = "Lmf;")
    private class382 field3008;

    @OriginalMember(owner = "client!tea", name = "eb", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!tea", name = "E", descriptor = "Lmf;")
    private class382 field2991;

    @OriginalMember(owner = "client!tea", name = "U", descriptor = "Lg;")
    public class140 field3006;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    private int field2978;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!tea", name = "C", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!tea", name = "G", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!tea", name = "I", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!tea", name = "L", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!tea", name = "N", descriptor = "I")
    private int field2999;

    @OriginalMember(owner = "client!tea", name = "P", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!tea", name = "R", descriptor = "I")
    private int field3003;

    @OriginalMember(owner = "client!tea", name = "S", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!tea", name = "Y", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!tea", name = "cb", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!tea", name = "db", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "Lsf;")
    private class483 field2980;

    @OriginalMember(owner = "client!tea", name = "V", descriptor = "Lf;")
    private class702 field3007;

    @OriginalMember(owner = "client!tea", name = "fb", descriptor = "Lf;")
    private class702 field3017;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2975;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "[I")
    public int[] field2986;

    @OriginalMember(owner = "client!tea", name = "M", descriptor = "[I")
    public int[] field2998;

    @OriginalMember(owner = "client!tea", name = "O", descriptor = "[Lgn;")
    private class651[] field3000;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "(I)[I", line = 4)
    public final int[] method1414(int arg0) {
        class382 var2 = this.field2991;
        class687 var3;
        synchronized (this.field2991) {
            var3 = (class687) this.field2991.method2287(1, (long) arg0);
            if (var3 == null) {
                if (!super.field2384.method1383(arg0, -45)) {
                    return null;
                }
                class159 var5 = super.field2384.method1386(arg0, -6514);
                int var6 = !var5.field2304 && !this.field3013 ? 128 : 64;
                var3 = new class687(arg0, var6, super.field2384.method1381(var6, arg0, 0.7F, var6, -92, true), var5.field2288);
                this.field2991.method2291(var3, (long) arg0, 1);
            }
        }
        var3.field9679 = true;
        return var3.method3790();
    }

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "()Z", line = 24)
    public final boolean method108() {
        return true;
    }

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "(I)V", line = 27)
    public final void method113(int arg0) {
        this.field2984 = arg0;
        this.field3000 = new class651[this.field2984];
        for (int var2 = 0; var2 < this.field2984; ++var2) {
            this.field3000[var2] = new class651(this);
        }
    }

    @OriginalMember(owner = "client!tea", name = "VA", descriptor = "(IFFFFF)V", line = 40)
    public final void method185(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2990 = (int) (arg1 * 65535.0F);
        this.field2985 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2993 = (int) (arg3 * 65535.0F / var7);
        this.field2989 = (int) (arg4 * 65535.0F / var7);
        this.field2995 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Luq;[Lfg;Z)Lla;", line = 51)
    public final class416 method128(class146 arg0, class113[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1706;
            var5[var7] = arg1[var7].field1708;
            if (arg1[var7].field1701 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class694(this, arg0, arg1, var4, var5);
            } else {
                return new class469(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class11(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lag;IIII)V", line = 93)
    private final void method1415(class635 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field8990;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1416(arg1, arg2, arg3, arg4, arg0.field8986, 1);
        } else {
            if (this.field3016 != var6) {
                class702 var9 = (class702) this.field3008.method2287(1, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1425(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1417(var6) ? 64 : 128;
                    var9 = this.method209(var10, 0, var11, var11, var11);
                    this.field3008.method2291(var9, (long) var6, 1);
                }
                this.field3016 = var6;
                this.field3017 = var9;
            }
            ++var8;
            ((class314) this.field3017).method1985(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field8986, 1, 1);
        }
    }

    @OriginalMember(owner = "client!tea", name = "XA", descriptor = "(IIIII)V", line = 131)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2982 && arg1 < this.field2992) {
            if (arg0 < this.field3002) {
                arg2 -= this.field3002 - arg0;
                arg0 = this.field3002;
            }
            if (arg0 + arg2 > this.field2983) {
                arg2 = this.field2983 - arg0;
            }
            int var6 = this.field3004 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2998[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2998[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2998[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2998[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2998[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "IA", descriptor = "(IIIIII[BII)V", line = 203)
    public final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field3004 * arg1 + arg0;
            int var15 = this.field3004 - arg2;
            if (arg1 + arg3 > this.field2992) {
                arg3 -= arg1 + arg3 - this.field2992;
            }
            if (arg1 < this.field2982) {
                int var16 = this.field2982 - arg1;
                arg3 -= var16;
                var14 += this.field3004 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2983) {
                int var17 = arg0 + arg2 - this.field2983;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field3002) {
                int var18 = this.field3002 - arg0;
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
                            int var28 = this.field2998[var14];
                            this.field2998[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2998[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2998[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2998[var14++] = arg5;
                        } else {
                            this.field2998[var14++] = arg4;
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

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(Z)V", line = 378)
    public final void method125(boolean arg0) {
        this.field3013 = arg0;
        this.field2991.method2285((byte) -75);
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "(IIIIII)V", line = 382)
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method202(arg0, arg1, arg2, arg4, arg5);
        this.method202(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method103(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method103(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lf;Z)V", line = 388)
    public final void method188(class702 arg0, boolean arg1) {
        if (arg0 instanceof class400) {
            class400 var3 = (class400) arg0;
            this.field3004 = var3.field4639;
            this.field2999 = var3.field4649;
            this.field2998 = var3.field5903;
            this.field3007 = arg0;
        } else {
            if (!(arg0 instanceof class507)) {
                throw new RuntimeException();
            }
            class507 var4 = (class507) arg0;
            this.field3004 = var4.field4639;
            this.field2999 = var4.field4649;
            this.field2998 = var4.field7170;
            this.field3007 = arg0;
        }
        this.method1423();
    }

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "()Z", line = 415)
    public final boolean method127() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "pa", descriptor = "(III)V", line = 421)
    public final void method122(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3000.length; ++var4) {
            class651 var5 = this.field3000[var4];
            var5.field9124 = arg0 & 16777215;
            int var6 = var5.field9124 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field9124 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field9124 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field9124 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field9130 = false;
            } else {
                var5.field9130 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "da", descriptor = "(IIII)V", line = 453)
    public final void method168(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field3004) {
            arg2 = this.field3004;
        }
        if (arg3 > this.field2999) {
            arg3 = this.field2999;
        }
        this.field3002 = arg0;
        this.field2983 = arg2;
        this.field2982 = arg1;
        this.field2992 = arg3;
        this.method1419();
    }

    @OriginalMember(owner = "client!tea", name = "ZA", descriptor = "(Z)V", line = 473)
    public final void method178(boolean arg0) {
        class651 var2 = this.method1422(Thread.currentThread());
        var2.field9113 = arg0;
    }

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "()[I", line = 477)
    public final int[] method145() {
        return new int[] { this.field2997, this.field3014, this.field3009, this.field2994 };
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lvi;)V", line = 481)
    public final void method156(class499 arg0) {
        class651 var2 = this.method1422(Thread.currentThread());
        class389 var3 = arg0.field7068.field8273;
        for (class389 var4 = var3.field5773; var3 != var4; var4 = var4.field5773) {
            class635 var5 = (class635) var4;
            int var6 = var5.field8982 >> 12;
            int var7 = var5.field8988 >> 12;
            int var8 = var5.field8987 >> 12;
            float var9 = (float) var8 * this.field3006.field2060 + (float) var6 * this.field3006.field2050 + (float) var7 * this.field3006.field2073 + this.field3006.field2079;
            if (!(var9 < (float) this.field3012) && !(var9 > (float) var2.field9129)) {
                int var10 = (int) (((float) var8 * this.field3006.field2059 + (float) var6 * this.field3006.field2054 + (float) var7 * this.field3006.field2057 + this.field3006.field2048) * (float) this.field3009 / var9) + this.field2997;
                int var11 = (int) (((float) var8 * this.field3006.field2068 + (float) var6 * this.field3006.field2078 + (float) var7 * this.field3006.field2052 + this.field3006.field2070) * (float) this.field2994 / var9) + this.field3014;
                if (var10 >= this.field3002 && var10 <= this.field2983 && var11 >= this.field2982 && var11 <= this.field2992) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1415(var5, var10, var11, (int) var9, (int) ((float) (this.field3009 * var5.field8989 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "(IIIIII)V", line = 519)
    private final void method1416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field2982) {
            var8 = this.field2982;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field2992) {
            var9 = this.field2992;
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
                if (var66 < this.field3002) {
                    var66 = this.field3002;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field2983) {
                    var67 = this.field2983;
                }
                int var68 = this.field3004 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field2986[var68]) {
                        this.field2998[var68] = arg4;
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
                if (var62 < this.field3002) {
                    var62 = this.field3002;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field2983 - 1) {
                    var63 = this.field2983 - 1;
                }
                int var64 = this.field3004 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field2986[var64]) {
                        this.field2998[var64] = arg4;
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
                if (var30 < this.field3002) {
                    var30 = this.field3002;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field2983) {
                    var31 = this.field2983;
                }
                int var32 = this.field3004 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field2986[var32]) {
                        int var34 = this.field2998[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field2998[var32] = var17 + var35;
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
                if (var24 < this.field3002) {
                    var24 = this.field3002;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field2983 - 1) {
                    var25 = this.field2983 - 1;
                }
                int var26 = this.field3004 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field2986[var26]) {
                        int var28 = this.field2998[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field2998[var26] = var17 + var29;
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
                if (var49 < this.field3002) {
                    var49 = this.field3002;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field2983) {
                    var50 = this.field2983;
                }
                int var51 = this.field3004 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field2986[var51]) {
                        int var53 = this.field2998[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field2998[var51] = var54 - var56 | var56 - (var56 >>> 8);
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
                if (var41 < this.field3002) {
                    var41 = this.field3002;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field2983 - 1) {
                    var42 = this.field2983 - 1;
                }
                int var43 = this.field3004 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field2986[var43]) {
                        int var45 = this.field2998[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field2998[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)I", line = 836)
    public final int method172(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "(IIIIII)V", line = 840)
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method202(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method202(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method103(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method103(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field3002) {
                    var10 += (this.field3002 - arg0) * var12;
                    arg0 = this.field3002;
                }
                if (var13 >= this.field2983) {
                    var13 = this.field2983 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2982 && var17 < this.field2992) {
                                int var18 = this.field3004 * var17 + arg0;
                                int var19 = this.field2998[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2998[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2982 && var21 < this.field2992) {
                                int var22 = this.field3004 * var21 + arg0;
                                int var23 = this.field2998[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2998[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2982 && var27 < this.field2992) {
                            this.field2998[this.field3004 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2982) {
                    var29 += (this.field2982 - arg1) * var31;
                    arg1 = this.field2982;
                }
                if (var32 >= this.field2992) {
                    var32 = this.field2992 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field3002 && var46 < this.field2983) {
                            this.field2998[this.field3004 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field3002 && var36 < this.field2983) {
                            int var37 = this.field3004 * arg1 + var36;
                            int var38 = this.field2998[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2998[this.field3004 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field3002 && var40 < this.field2983) {
                            int var41 = this.field3004 * arg1 + var40;
                            int var42 = this.field2998[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2998[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!tea", name = "ja", descriptor = "(I)V", line = 1053)
    public final void method139(int arg0) {
        this.method114(0, 0, this.field3004, this.field2999, arg0, 0);
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1057)
    public final void method124(Canvas arg0) {
        class483 var2 = (class483) this.field2979.method1405((long) arg0.hashCode(), (byte) -100);
        if (var2 == null) {
            class483 var3 = class487.method2831(arg0, (byte) -107);
            this.field2979.method1403((byte) -18, var3, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1066)
    public final void method198(Rectangle[] arg0, int arg1) throws class621 {
        if (this.field2975 != null && this.field2980 != null) {
            try {
                Graphics var3 = this.field2975.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field3004 && var5.y <= this.field2999 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2980.method1661(true, var5.x, var5.width, var3, var5.height, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field2975.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)V", line = 1097)
    public final void method163(int arg0) {
        this.field3000[arg0].method3602((Runnable) null, true);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "()Z", line = 1101)
    public final boolean method106() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "MA", descriptor = "(III[I)V", line = 1105)
    public final void method214(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3006.field2060 + (float) arg0 * this.field3006.field2050 + (float) arg1 * this.field3006.field2073 + this.field3006.field2079;
        if (!(var5 < (float) this.field3012) && !(var5 > (float) this.field3011)) {
            int var6 = (int) (((float) arg2 * this.field3006.field2059 + (float) arg0 * this.field3006.field2054 + (float) arg1 * this.field3006.field2057 + this.field3006.field2048) * (float) this.field3009 / var5);
            int var7 = (int) (((float) arg2 * this.field3006.field2068 + (float) arg0 * this.field3006.field2078 + (float) arg1 * this.field3006.field2052 + this.field3006.field2070) * (float) this.field2994 / var5);
            arg3[0] = var6 - this.field2981;
            arg3[1] = var7 - this.field3001;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "(I)Z", line = 1121)
    public final boolean method1417(int arg0) {
        return this.field3013 || super.field2384.method1386(arg0, -6514).field2304;
    }

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "(IIIII)V", line = 1127)
    public final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field3002 && arg0 < this.field2983) {
            if (arg1 < this.field2982) {
                arg2 -= this.field2982 - arg1;
                arg1 = this.field2982;
            }
            if (arg1 + arg2 > this.field2992) {
                arg2 = this.field2992 - arg1;
            }
            int var6 = this.field3004 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field3004 * var10 + var6;
                        int var12 = this.field2998[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2998[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field3004 * var14 + var6;
                        int var16 = this.field2998[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2998[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2998[this.field3004 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "()Z", line = 1203)
    public final boolean method186() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "()V", line = 1206)
    public final void method150() {
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIII)V", line = 1208)
    public final void method176(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "()Z", line = 1211)
    public final boolean method129() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "()Lq;", line = 1215)
    public final class391 method100() {
        return new class140();
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1219)
    public final void method182(Canvas arg0) {
        class483 var2 = (class483) this.field2979.method1405((long) arg0.hashCode(), (byte) -110);
        if (var2 != null) {
            var2.method3678(-1);
            class483 var3 = class487.method2831(arg0, (byte) -109);
            this.field2979.method1403((byte) -18, var3, (long) arg0.hashCode());
            if (this.field2975 == arg0 && this.field3007 == null) {
                this.field2980 = var3;
                this.field2998 = var3.field6867;
                this.field3004 = var3.field6872;
                this.field2999 = var3.field6868;
                if (this.field3004 != this.field3003 || this.field3010 != this.field2999) {
                    this.field3003 = this.field3004;
                    this.field3010 = this.field2999;
                    this.field2986 = new int[this.field3010 * this.field3003];
                }
                this.method1423();
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "()Lis;", line = 1246)
    public final class463 method140() {
        return new class463(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 1249)
    public class214(Canvas arg0, class209 arg1) {
        this(arg1);
        this.method124(arg0);
        this.method143(arg0);
    }

    @OriginalMember(owner = "client!tea", name = "oa", descriptor = "([I)V", line = 1254)
    public final void method204(int[] arg0) {
        arg0[0] = this.field3002;
        arg0[1] = this.field2982;
        arg0[2] = this.field2983;
        arg0[3] = this.field2992;
    }

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "(I)Z", line = 1260)
    public final boolean method1418(int arg0) {
        return super.field2384.method1386(arg0, -6514).field2289;
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)V", line = 1262)
    public final void method101(int arg0) {
    }

    @OriginalMember(owner = "client!tea", name = "va", descriptor = "(I)V", line = 1265)
    public final void method154(int arg0) {
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljba;Ljba;FLjba;)Ljba;", line = 1268)
    public final class363 method190(class363 arg0, class363 arg1, float arg2, class363 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1271)
    public final void method111(Canvas arg0) {
        if (this.field2975 == arg0) {
            this.method143((Canvas) null);
        }
        class483 var2 = (class483) this.field2979.method1405((long) arg0.hashCode(), (byte) -16);
        if (var2 != null) {
            var2.method3678(-1);
        }
    }

    @OriginalMember(owner = "client!tea", name = "w", descriptor = "()I", line = 1281)
    public final int method173() {
        return 0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIILua;II)V", line = 1285)
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        class699 var10 = (class699) arg6;
        int[] var11 = var10.field9887;
        int[] var12 = var10.field9889;
        int var13 = this.field2982 > arg8 ? this.field2982 : arg8;
        int var14 = this.field2992 < var11.length + arg8 ? this.field2992 : var11.length + arg8;
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
            if (arg0 < this.field3002) {
                var18 += (this.field3002 - arg0) * var20;
                arg0 = this.field3002;
            }
            if (var21 >= this.field2983) {
                var21 = this.field2983 - 1;
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
                                int var28 = this.field3004 * var25 + arg0;
                                int var29 = this.field2998[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2998[var28] = var23 + var30;
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
                                int var34 = this.field3004 * var31 + arg0;
                                int var35 = this.field2998[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2998[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2998[this.field3004 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field3002 && var64 < this.field2983 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2998[this.field3004 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field3002 && var50 < this.field2983 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field3004 * arg1 + var50;
                        int var54 = this.field2998[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2998[this.field3004 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field3002 && var56 < this.field2983 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field3004 * arg1 + var56;
                        int var60 = this.field2998[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2998[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "O", descriptor = "(IIIIII)Z", line = 1524)
    public final boolean method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field3006.field2060 + (float) arg0 * this.field3006.field2050 + (float) arg1 * this.field3006.field2073 + this.field3006.field2079;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3006.field2060 + (float) arg3 * this.field3006.field2050 + (float) arg4 * this.field3006.field2073 + this.field3006.field2079;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field3012) || !(var8 < (float) this.field3012)) && (!(var7 > (float) this.field3011) || !(var8 > (float) this.field3011))) {
            int var9 = (int) (((float) arg2 * this.field3006.field2059 + (float) arg0 * this.field3006.field2054 + (float) arg1 * this.field3006.field2057 + this.field3006.field2048) * (float) this.field3009 / var7);
            int var10 = (int) (((float) arg5 * this.field3006.field2059 + (float) arg3 * this.field3006.field2054 + (float) arg4 * this.field3006.field2057 + this.field3006.field2048) * (float) this.field3009 / var8);
            if (var9 < this.field2981 && var10 < this.field2981 || var9 > this.field2988 && var10 > this.field2988) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field3006.field2068 + (float) arg0 * this.field3006.field2078 + (float) arg1 * this.field3006.field2052 + this.field3006.field2070) * (float) this.field2994 / var7);
                int var12 = (int) (((float) arg5 * this.field3006.field2068 + (float) arg3 * this.field3006.field2078 + (float) arg4 * this.field3006.field2052 + this.field3006.field2070) * (float) this.field2994 / var8);
                return (var11 >= this.field3001 || var12 >= this.field3001) && (var11 <= this.field3015 || var12 <= this.field3015);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tea", name = "D", descriptor = "()V", line = 1553)
    private final void method1419() {
        this.field2981 = this.field3002 - this.field2997;
        this.field2988 = this.field2983 - this.field2997;
        this.field3001 = this.field2982 - this.field3014;
        this.field3015 = this.field2992 - this.field3014;
        for (int var1 = 0; var1 < this.field2984; ++var1) {
            class579 var5 = this.field3000[var1].field9165;
            var5.field8164 = this.field2997 - this.field3002;
            var5.field8154 = this.field3014 - this.field2982;
            var5.field8159 = this.field2983 - this.field3002;
            var5.field8167 = this.field2992 - this.field2982;
        }
        int var2 = this.field3004 * this.field2982 + this.field3002;
        for (int var3 = this.field2982; var3 < this.field2992; ++var3) {
            for (int var4 = 0; var4 < this.field2984; ++var4) {
                this.field3000[var4].field9165.field8157[var3 - this.field2982] = var2;
            }
            var2 += this.field3004;
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(IIIIIIIIII)V", line = 1591)
    public final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field2384.method1386(arg6, -6514).field2305) {
                if (this.field3016 != arg6) {
                    class702 var11 = (class702) this.field3008.method2287(1, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1425(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1417(arg6) ? 64 : 128;
                        var11 = this.method209(var12, 0, var13, var13, var13);
                        this.field3008.method2291(var11, (long) arg6, 1);
                    }
                    this.field3016 = arg6;
                    this.field3017 = var11;
                }
                ((class314) this.field3017).method1985(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1416(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "()Z", line = 1624)
    public final boolean method162() {
        return true;
    }

    @OriginalMember(owner = "client!tea", name = "U", descriptor = "()I", line = 1628)
    public final int method115() {
        return this.field3011;
    }

    @OriginalMember(owner = "client!tea", name = "E", descriptor = "()Z", line = 1632)
    public final boolean method1421() {
        return this.field2977;
    }

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "()Z", line = 1635)
    public final boolean method166() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljba;)V", line = 1637)
    public final void method116(class363 arg0) {
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Llm;IIII)Lda;", line = 1640)
    public final class55 method171(class461 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class659(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!tea", name = "CA", descriptor = "(IIII)V", line = 1645)
    public final void method133(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field3000.length; ++var5) {
            this.field3000[var5].field9114 = this.field3000[var5].field9124;
            this.field3000[var5].field9127 = arg0;
            this.field3000[var5].field9124 = arg1;
            this.field3000[var5].field9126 = arg2;
            this.field3000[var5].field9118 = true;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/Runnable;)Lgn;", line = 1660)
    public final class651 method1422(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2984; ++var2) {
            if (this.field3000[var2].field9117 == arg0) {
                return this.field3000[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([IIIII)Lf;", line = 1674)
    public final class702 method209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class507(this, arg0, arg1, arg2, arg3, arg4) : new class400(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class507(this, arg0, arg1, arg2, arg3, arg4) : new class400(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 1709)
    public final class37 method215(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class155(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tea", name = "F", descriptor = "()V", line = 1714)
    private final void method1423() {
        for (int var1 = 0; var1 < this.field2984; ++var1) {
            this.field3000[var1].method3599(-117);
        }
        this.method152();
    }

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "()V", line = 1722)
    public final void method213() {
        if (this.field2975 != null) {
            this.field2998 = this.field2980.field6867;
            this.field3004 = this.field2980.field6872;
            this.field2999 = this.field2980.field6868;
        } else {
            this.field3004 = 1;
            this.field2999 = 1;
            this.field2998 = null;
        }
        this.field3007 = null;
        this.method1423();
    }

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "()V", line = 1739)
    public final void method158() {
        if (this.field2976) {
            class618.method3427(true, false, -127);
            this.field2976 = false;
        }
        this.field2980 = null;
        this.field2975 = null;
        this.field2979 = null;
        this.field2977 = true;
    }

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "(I)I", line = 1751)
    public final int method1424(int arg0) {
        return super.field2384.method1386(arg0, -6514).field2283 & 65535;
    }

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "()Z", line = 1754)
    public final boolean method148() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "la", descriptor = "(IIII)V", line = 1758)
    public final void method184(int arg0, int arg1, int arg2, int arg3) {
        this.field2997 = arg0;
        this.field3014 = arg1;
        this.field3009 = arg2;
        this.field2994 = arg3;
        this.method1419();
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V", line = 1764)
    public final void method179(boolean arg0) {
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Le;)V", line = 1766)
    public final void method196(class492 arg0) {
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIZ)Lf;", line = 1771)
    public final class702 method136(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field3004 * arg1 + arg0;
        int var8 = this.field3004 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2998[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class507(this, var6, arg2, arg3);
        } else {
            return new class400(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lfa;)V", line = 1868)
    private class214(class209 arg0) {
        super(arg0);
        this.field2976 = false;
        this.field2977 = false;
        this.field2979 = new class213(4);
        this.field2990 = 45823;
        this.field2985 = 78642;
        this.field2987 = 0;
        this.field2994 = 512;
        this.field2983 = 0;
        this.field2982 = 0;
        this.field2996 = 0;
        this.field3005 = 75518;
        this.field3012 = 50;
        this.field3009 = 512;
        this.field3011 = 3500;
        this.field3013 = false;
        this.field2992 = 0;
        this.field3002 = 0;
        this.field3008 = new class382(16);
        this.field3016 = -1;
        this.field2991 = new class382(256);
        this.field3006 = new class140();
        this.method113(1);
        this.method135(0);
        class489.method2838(true, false, (byte) 58);
        this.field2976 = true;
        this.field2978 = (int) class490.method2840(true);
    }

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "()Z", line = 1806)
    public final boolean method216() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([I)V", line = 1810)
    public final void method208(int[] arg0) {
        arg0[0] = this.field3004;
        arg0[1] = this.field2999;
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)V", line = 1814)
    public final void method135(int arg0) {
        this.field3000[arg0].method3602(Thread.currentThread(), true);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[I[I)Lua;", line = 1817)
    public final class617 method164(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class699(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIIIII)V", line = 1822)
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class651 var11 = this.method1422(Thread.currentThread());
        class579 var12 = var11.field9165;
        var12.field8158 = false;
        int var13 = arg0 - this.field2981;
        int var14 = arg2 - this.field2981;
        int var15 = arg4 - this.field2981;
        int var16 = arg1 - this.field3001;
        int var17 = arg3 - this.field3001;
        int var18 = arg5 - this.field3001;
        var12.field8169 = var13 < 0 || var13 > var12.field8159 || var14 < 0 || var14 > var12.field8159 || var15 < 0 || var15 > var12.field8159;
        var12.field8162 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field8160 = 255 - var19;
                var12.field8165 = false;
                var12.method3291(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field8160 = 128;
                var12.field8165 = true;
                var12.method3291(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field8160 = 0;
            var12.field8165 = false;
            var12.method3291(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field8158 = true;
        var12.field8162 = false;
    }

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "()V", line = 1864)
    public final void method183() {
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIII)Ljba;", line = 1878)
    public final class363 method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "()I", line = 1881)
    public final int method147() {
        return 0;
    }

    @OriginalMember(owner = "client!tea", name = "J", descriptor = "(IIIIII)V", line = 1884)
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field3002) {
            arg2 -= this.field3002 - arg0;
            arg0 = this.field3002;
        }
        if (arg1 < this.field2982) {
            arg3 -= this.field2982 - arg1;
            arg1 = this.field2982;
        }
        if (arg0 + arg2 > this.field2983) {
            arg2 = this.field2983 - arg0;
        }
        if (arg1 + arg3 > this.field2992) {
            arg3 = this.field2992 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2983 && arg1 <= this.field2992) {
            int var7 = this.field3004 - arg2;
            int var8 = this.field3004 * arg1 + arg0;
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
                            this.field2998[var24] = arg4;
                            ++var24;
                            this.field2998[var24] = arg4;
                            ++var24;
                            this.field2998[var24] = arg4;
                            ++var24;
                            this.field2998[var24] = arg4;
                            ++var24;
                            this.field2998[var24] = arg4;
                            ++var24;
                            this.field2998[var24] = arg4;
                            ++var24;
                            this.field2998[var24] = arg4;
                            ++var24;
                            this.field2998[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2998[var24] = arg4;
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
                        int var14 = this.field2998[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field2998[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2998[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2998[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "(IIII)[I", line = 2020)
    public final int[] method193(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field3004 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2998[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lvi;I)V", line = 2046)
    public final void method165(class499 arg0, int arg1) {
        class651 var3 = this.method1422(Thread.currentThread());
        class389 var4 = arg0.field7068.field8273;
        for (class389 var5 = var4.field5773; var4 != var5; var5 = var5.field5773) {
            class635 var6 = (class635) var5;
            int var7 = var6.field8982 >> 12;
            int var8 = var6.field8988 >> 12;
            int var9 = var6.field8987 >> 12;
            float var10 = (float) var9 * this.field3006.field2060 + (float) var7 * this.field3006.field2050 + (float) var8 * this.field3006.field2073 + this.field3006.field2079;
            if (!(var10 < (float) this.field3012) && !(var10 > (float) var3.field9129)) {
                int var11 = (int) (((float) var9 * this.field3006.field2059 + (float) var7 * this.field3006.field2054 + (float) var8 * this.field3006.field2057 + this.field3006.field2048) * (float) this.field3009 / (float) arg1) + this.field2997;
                int var12 = (int) (((float) var9 * this.field3006.field2068 + (float) var7 * this.field3006.field2078 + (float) var8 * this.field3006.field2052 + this.field3006.field2070) * (float) this.field2994 / (float) arg1) + this.field3014;
                if (var11 >= this.field3002 && var11 <= this.field2983 && var12 >= this.field2982 && var12 <= this.field2992) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1415(var6, var11, var12, (int) var10, (this.field3009 * var6.field8989 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIII)V", line = 2086)
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class651 var8 = this.method1422(Thread.currentThread());
        class579 var9 = var8.field9165;
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
            int var23 = arg0 - var9.method3310();
            int var24 = arg1 - var9.method3297();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field8160 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field8160 = 255 - (arg4 >>> 24);
            }
            var9.field8169 = var25 < 0 || var25 > var9.field8159 || var26 < 0 || var26 > var9.field8159 || var27 < 0 || var27 > var9.field8159;
            var9.method3303(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field8169 = var25 < 0 || var25 > var9.field8159 || var27 < 0 || var27 > var9.field8159 || var28 < 0 || var28 > var9.field8159;
            var9.method3303(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "()V", line = 2157)
    public final void method174() {
    }

    @OriginalMember(owner = "client!tea", name = "DA", descriptor = "()I", line = 2161)
    public final int method192() {
        int var1 = this.field2996;
        this.field2996 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!tea", name = "BA", descriptor = "()I", line = 2166)
    public final int method110() {
        return this.field3012;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lfg;Z)Lf;", line = 2170)
    public final class702 method138(class113 arg0, boolean arg1) {
        int[] var3 = arg0.field1702;
        byte[] var4 = arg0.field1709;
        int var5 = arg0.field1706;
        int var6 = arg0.field1708;
        class314 var11;
        if (arg1 && arg0.field1701 == null) {
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
            var11 = new class350(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1701;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class507(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class400(this, var14, var5, var6);
            }
        }
        var11.method935(arg0.field1704, arg0.field1707, arg0.field1705, arg0.field1703);
        return var11;
    }

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "()Z", line = 2273)
    public final boolean method167() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "ra", descriptor = "(F)V", line = 2277)
    public final void method132(float arg0) {
        this.field3005 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "()Z", line = 2280)
    public final boolean method109() {
        return true;
    }

    @OriginalMember(owner = "client!tea", name = "x", descriptor = "()Z", line = 2283)
    public final boolean method123() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "ya", descriptor = "()V", line = 2286)
    public final void method194() {
        if (this.field3002 == 0 && this.field3004 == this.field2983 && this.field2982 == 0 && this.field2999 == this.field2992) {
            int var1 = this.field2986.length;
            int var2 = var1 - var1 & 7;
            int var3 = 0;
            while (var3 < var2) {
                this.field2986[var3++] = Integer.MAX_VALUE;
                this.field2986[var3++] = Integer.MAX_VALUE;
                this.field2986[var3++] = Integer.MAX_VALUE;
                this.field2986[var3++] = Integer.MAX_VALUE;
                this.field2986[var3++] = Integer.MAX_VALUE;
                this.field2986[var3++] = Integer.MAX_VALUE;
                this.field2986[var3++] = Integer.MAX_VALUE;
                this.field2986[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field2986[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field2983 - this.field3002;
            int var5 = this.field2992 - this.field2982;
            int var6 = this.field3004 - var4;
            int var7 = this.field3004 * this.field2982 + this.field3002;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field2986[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "(I)[I", line = 2368)
    private final int[] method1425(int arg0) {
        class382 var2 = this.field2991;
        class687 var3;
        synchronized (this.field2991) {
            var3 = (class687) this.field2991.method2287(1, (long) arg0);
            if (var3 == null) {
                if (!super.field2384.method1383(arg0, -84)) {
                    return null;
                }
                class159 var5 = super.field2384.method1386(arg0, -6514);
                int var6 = !var5.field2304 && !this.field3013 ? 128 : 64;
                var3 = new class687(arg0, var6, super.field2384.method1384(true, var6, var6, arg0, 0.7F, (byte) 125), var5.field2288);
                this.field2991.method2291(var3, (long) arg0, 1);
            }
        }
        var3.field9679 = true;
        return var3.method3790();
    }

    @OriginalMember(owner = "client!tea", name = "YA", descriptor = "(IIII)V", line = 2389)
    public final void method195(int arg0, int arg1, int arg2, int arg3) {
        class651 var5 = this.method1422(Thread.currentThread());
        var5.field9127 = arg0;
        var5.field9124 = arg1;
        var5.field9126 = arg2;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIF)Lrc;", line = 2397)
    public final class498 method181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "(IIIII)V", line = 2400)
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2982) {
            var6 = this.field2982;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2992) {
            var7 = this.field2992;
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
                if (var64 < this.field3002) {
                    var64 = this.field3002;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2983) {
                    var65 = this.field2983;
                }
                int var66 = this.field3004 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2998[var66++] = arg3;
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
                if (var60 < this.field3002) {
                    var60 = this.field3002;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2983 - 1) {
                    var61 = this.field2983 - 1;
                }
                int var62 = this.field3004 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2998[var62++] = arg3;
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
                if (var28 < this.field3002) {
                    var28 = this.field3002;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2983) {
                    var29 = this.field2983;
                }
                int var30 = this.field3004 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2998[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2998[var30++] = var15 + var33;
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
                if (var22 < this.field3002) {
                    var22 = this.field3002;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2983 - 1) {
                    var23 = this.field2983 - 1;
                }
                int var24 = this.field3004 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2998[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2998[var24++] = var15 + var27;
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
                if (var47 < this.field3002) {
                    var47 = this.field3002;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2983) {
                    var48 = this.field2983;
                }
                int var49 = this.field3004 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2998[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2998[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field3002) {
                    var39 = this.field3002;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2983 - 1) {
                    var40 = this.field2983 - 1;
                }
                int var41 = this.field3004 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2998[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2998[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "()Lq;", line = 2687)
    public final class391 method153() {
        return this.field3006;
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "()Z", line = 2690)
    public final boolean method104() {
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(FFF)V", line = 2692)
    public final void method205(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(II)I", line = 2695)
    public final int method160(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tea", name = "FA", descriptor = "(ILua;II)V", line = 2699)
    public final void method169(int arg0, class617 arg1, int arg2, int arg3) {
        class699 var5 = (class699) arg1;
        int[] var6 = var5.field9887;
        int[] var7 = var5.field9889;
        int var8;
        if (this.field2992 < var6.length + arg3) {
            var8 = this.field2992 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2982 > arg3) {
            var9 = this.field2982 - arg3;
            arg3 = this.field2982;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field3004 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field3002 > var12) {
                    var13 -= this.field3002 - var12;
                    var12 = this.field3002;
                }
                if (this.field2983 < var12 + var13) {
                    var13 = this.field2983 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2998[var14++] = arg0;
                }
                var10 += this.field3004;
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "AA", descriptor = "(III[I)V", line = 2758)
    public final void method197(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3006.field2060 + (float) arg0 * this.field3006.field2050 + (float) arg1 * this.field3006.field2073 + this.field3006.field2079;
        if (!(var5 < (float) this.field3012) && !(var5 > (float) this.field3011)) {
            int var6 = (int) (((float) arg2 * this.field3006.field2059 + (float) arg0 * this.field3006.field2054 + (float) arg1 * this.field3006.field2057 + this.field3006.field2048) * (float) this.field3009 / var5);
            int var7 = (int) (((float) arg2 * this.field3006.field2068 + (float) arg0 * this.field3006.field2078 + (float) arg1 * this.field3006.field2052 + this.field3006.field2070) * (float) this.field2994 / var5);
            if (var6 >= this.field2981 && var6 <= this.field2988 && var7 >= this.field3001 && var7 <= this.field3015) {
                arg3[0] = var6 - this.field2981;
                arg3[1] = var7 - this.field3001;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)Le;", line = 2782)
    public final class492 method120(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!tea", name = "JA", descriptor = "()V", line = 2786)
    public final void method152() {
        this.field3002 = 0;
        this.field2982 = 0;
        this.field2983 = this.field3004;
        this.field2992 = this.field2999;
        this.method1419();
    }

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "()Z", line = 2793)
    public final boolean method161() {
        return true;
    }

    @OriginalMember(owner = "client!tea", name = "L", descriptor = "()V", line = 2798)
    public final void method121() {
        for (int var1 = 0; var1 < this.field3000.length; ++var1) {
            this.field3000[var1].field9124 = this.field3000[var1].field9114;
            this.field3000[var1].field9118 = false;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lq;)V", line = 2808)
    public final void method155(class391 arg0) {
        this.field3006 = (class140) arg0;
    }

    @OriginalMember(owner = "client!tea", name = "GA", descriptor = "(II)V", line = 2812)
    public final void method142(int arg0, int arg1) {
        class651 var3 = this.method1422(Thread.currentThread());
        this.field3012 = arg0;
        this.field3011 = arg1;
        var3.field9129 = this.field3011 - 255;
    }

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "(I)Z", line = 2818)
    public final boolean method1426(int arg0) {
        return super.field2384.method1383(arg0, -94);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIZ)Lf;", line = 2821)
    public final class702 method175(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class507(this, arg0, arg1) : new class400(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "()V", line = 2827)
    public final void method210() {
        this.field2991.method2285((byte) -89);
        this.field3008.method2285((byte) -76);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[Lrc;)V", line = 2830)
    public final void method134(int arg0, class498[] arg1) {
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2833)
    public final void method143(Canvas arg0) {
        if (arg0 != null) {
            class483 var2 = (class483) this.field2979.method1405((long) arg0.hashCode(), (byte) -93);
            if (var2 != null) {
                this.field2975 = arg0;
                this.field2980 = var2;
                if (this.field3007 == null) {
                    this.field2998 = var2.field6867;
                    this.field3004 = var2.field6872;
                    this.field2999 = var2.field6868;
                    if (this.field3004 != this.field3003 || this.field3010 != this.field2999) {
                        this.field3003 = this.field3004;
                        this.field3010 = this.field2999;
                        this.field2986 = new int[this.field3010 * this.field3003];
                    }
                    this.method1423();
                    return;
                }
            }
        } else {
            this.field2975 = null;
            this.field2980 = null;
            if (this.field3007 == null) {
                this.field2998 = null;
                this.field3004 = this.field2999 = 1;
                this.field3003 = this.field3010 = 1;
                this.method1423();
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "C", descriptor = "()V", line = 2874)
    public final void method157() {
    }

    @OriginalMember(owner = "client!tea", name = "V", descriptor = "(IIII)V", line = 2877)
    public final void method107(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3002 < arg0) {
            this.field3002 = arg0;
        }
        if (this.field2982 < arg1) {
            this.field2982 = arg1;
        }
        if (this.field2983 > arg2) {
            this.field2983 = arg2;
        }
        if (this.field2992 > arg3) {
            this.field2992 = arg3;
        }
        this.method1419();
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V", line = 2894)
    public final void method151(int arg0) {
        int var2 = arg0 - this.field2978;
        for (Object var3 = this.field2991.method2282(52); var3 != null; var3 = this.field2991.method2280(7)) {
            class687 var4 = (class687) var3;
            if (var4.field9679) {
                var4.field9680 += var2;
                int var5 = var4.field9680 / 20;
                if (var5 > 0) {
                    class159 var6 = super.field2384.method1386(var4.field9682, -6514);
                    var4.method3789(var6.field2298 * var2 * 50 / 1000, var6.field2293 * var2 * 50 / 1000);
                    var4.field9680 -= var5 * 20;
                }
                var4.field9679 = false;
            }
        }
        this.field2978 = arg0;
        this.field3008.method2290(false, 5);
        this.field2991.method2290(false, 5);
    }

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "()Lq;", line = 2930)
    public final class391 method130() {
        class651 var1 = this.method1422(Thread.currentThread());
        return var1.field9131;
    }

    @OriginalMember(owner = "client!tea", name = "T", descriptor = "()I", line = 2935)
    public final int method200() {
        int var1 = this.field2987;
        this.field2987 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "()V", line = 2940)
    public final void method203() throws class621 {
        if (this.field2975 != null && this.field2980 != null) {
            try {
                Graphics var1 = this.field2975.getGraphics();
                this.field2980.method1660(0, -31536, 0, var1);
            } catch (Exception var2) {
                this.field2975.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }
}
