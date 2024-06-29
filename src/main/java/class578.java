import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class578 extends class98 {

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Z")
    private boolean field8456;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Z")
    private boolean field8461;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lmo;")
    private class482 field8457;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public int field8470;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public int field8477;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public int field8476;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public int field8467;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public int field8474;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    private int field8462;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public int field8481;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public int field8483;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public int field8472;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
    public int field8489;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    public int field8486;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    private int field8484;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "Z")
    private boolean field8496;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    public int field8495;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Ljn;")
    private class117 field8464;

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
    private int field8498;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Ljn;")
    private class117 field8475;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "Ljw;")
    public class428 field8479;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    private int field8458;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    private int field8463;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public int field8465;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public int field8469;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public int field8471;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public int field8478;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public int field8480;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    private int field8482;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public int field8485;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
    public int field8487;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    private int field8488;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public int field8490;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public int field8492;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public int field8493;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
    public int field8494;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "Lf;")
    private class257 field8473;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "Lf;")
    private class257 field8497;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Lpba;")
    private class49 field8460;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8459;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "[I")
    public int[] field8466;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "[I")
    public int[] field8468;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "[Lqm;")
    private class439[] field8491;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)I", line = 3)
    public final int method3344(int arg0) {
        return super.field1459.method2359(-124, arg0).field5223 & 65535;
    }

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "(I)[I", line = 7)
    private final int[] method3345(int arg0) {
        class117 var2 = this.field8475;
        class20 var3;
        synchronized (this.field8475) {
            var3 = (class20) this.field8475.method941((long) arg0, 0);
            if (var3 == null) {
                if (!super.field1459.method2363((byte) -128, arg0)) {
                    return null;
                }
                class377 var5 = super.field1459.method2359(-124, arg0);
                int var6 = !var5.field5222 && !this.field8496 ? 128 : 64;
                var3 = new class20(arg0, var6, super.field1459.method2365(var6, arg0, true, -86, 0.7F, var6), var5.field5216);
                this.field8475.method949((long) arg0, true, var3);
            }
        }
        var3.field277 = true;
        return var3.method208();
    }

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "()V", line = 26)
    public final void method128() {
    }

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "()V", line = 31)
    public final void method821() {
        for (int var1 = 0; var1 < this.field8491.length; ++var1) {
            this.field8491[var1].field6323 = this.field8491[var1].field6314;
            this.field8491[var1].field6317 = false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)Le;", line = 46)
    public final class698 method783(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(IIIIII)Lpa;", line = 49)
    public final class587 method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "DA", descriptor = "()I", line = 55)
    public final int method144() {
        int var1 = this.field8484;
        this.field8484 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIII)Lf;", line = 61)
    public final class257 method806(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class100(this, arg0, arg1, arg2, arg3, arg4) : new class58(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class100(this, arg0, arg1, arg2, arg3, arg4) : new class58(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(IIIII)V", line = 97)
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field8467) {
            var6 = this.field8467;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field8495) {
            var7 = this.field8495;
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
                if (var64 < this.field8489) {
                    var64 = this.field8489;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field8474) {
                    var65 = this.field8474;
                }
                int var66 = this.field8485 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field8466[var66++] = arg3;
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
                if (var60 < this.field8489) {
                    var60 = this.field8489;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field8474 - 1) {
                    var61 = this.field8474 - 1;
                }
                int var62 = this.field8485 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field8466[var62++] = arg3;
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
                if (var28 < this.field8489) {
                    var28 = this.field8489;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field8474) {
                    var29 = this.field8474;
                }
                int var30 = this.field8485 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field8466[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field8466[var30++] = var15 + var33;
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
                if (var22 < this.field8489) {
                    var22 = this.field8489;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field8474 - 1) {
                    var23 = this.field8474 - 1;
                }
                int var24 = this.field8485 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field8466[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field8466[var24++] = var15 + var27;
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
                if (var47 < this.field8489) {
                    var47 = this.field8489;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field8474) {
                    var48 = this.field8474;
                }
                int var49 = this.field8485 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field8466[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field8466[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field8489) {
                    var39 = this.field8489;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field8474 - 1) {
                    var40 = this.field8474 - 1;
                }
                int var41 = this.field8485 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field8466[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field8466[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "()Z", line = 384)
    public final boolean method95() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "YA", descriptor = "(IIII)V", line = 388)
    public final void method809(int arg0, int arg1, int arg2, int arg3) {
        class439 var5 = this.method3353(Thread.currentThread());
        var5.field6315 = arg0;
        var5.field6323 = arg1;
        var5.field6324 = arg2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 396)
    public final void method751(int arg0) {
        this.field8465 = arg0;
        this.field8491 = new class439[this.field8465];
        for (int var2 = 0; var2 < this.field8465; ++var2) {
            this.field8491[var2] = new class439(this);
        }
    }

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "(I)Z", line = 410)
    public final boolean method3346(int arg0) {
        return super.field1459.method2359(-122, arg0).field5219;
    }

    @OriginalMember(owner = "client!ve", name = "pa", descriptor = "(III)V", line = 415)
    public final void method763(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8491.length; ++var4) {
            class439 var5 = this.field8491[var4];
            var5.field6323 = arg0 & 16777215;
            int var6 = var5.field6323 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field6323 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field6323 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field6323 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field6320 = false;
            } else {
                var5.field6320 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "da", descriptor = "(IIII)V", line = 447)
    public final void method771(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field8485) {
            arg2 = this.field8485;
        }
        if (arg3 > this.field8463) {
            arg3 = this.field8463;
        }
        this.field8489 = arg0;
        this.field8474 = arg2;
        this.field8467 = arg1;
        this.field8495 = arg3;
        this.method3354();
    }

    @OriginalMember(owner = "client!ve", name = "ZA", descriptor = "(Z)V", line = 467)
    public final void method770(boolean arg0) {
        class439 var2 = this.method3353(Thread.currentThread());
        var2.field6312 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)V", line = 472)
    public final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class439 var8 = this.method3353(Thread.currentThread());
        class159 var9 = var8.field6335;
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
            int var23 = arg0 - var9.method1187();
            int var24 = arg1 - var9.method1192();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field2577 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2577 = 255 - (arg4 >>> 24);
            }
            this.method770(false);
            var9.field2584 = var25 < 0 || var25 > var9.field2593 || var26 < 0 || var26 > var9.field2593 || var27 < 0 || var27 > var9.field2593;
            var9.method1203(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field2584 = var25 < 0 || var25 > var9.field2593 || var27 < 0 || var27 > var9.field2593 || var28 < 0 || var28 > var9.field2593;
            var9.method1203(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method770(true);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 546)
    public final void method800(Canvas arg0) {
        class49 var2 = (class49) this.field8457.method2818(-22803, (long) arg0.hashCode());
        if (var2 == null) {
            class49 var3 = class344.method2063(true, arg0);
            this.field8457.method2816(var3, (long) arg0.hashCode(), false);
        }
    }

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "()Z", line = 555)
    public final boolean method786() {
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)I", line = 558)
    public final int method754(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V", line = 561)
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIIIIIIII)V", line = 564)
    public final void method3347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field1459.method2359(-124, arg6).field5232) {
                if (this.field8498 != arg6) {
                    class257 var11 = (class257) this.field8464.method941((long) arg6, 0);
                    if (var11 == null) {
                        int[] var12 = this.method3345(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3351(arg6) ? 64 : 128;
                        var11 = this.method806(var12, 0, var13, var13, var13);
                        this.field8464.method949((long) arg6, true, var11);
                    }
                    this.field8498 = arg6;
                    this.field8497 = var11;
                }
                ((class2) this.field8497).method10(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method3356(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[I[I)Lua;", line = 597)
    public final class591 method748(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class184(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "(IIIIII)Z", line = 601)
    public final boolean method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field8479.field6100 + (float) arg0 * this.field8479.field6127 + (float) arg1 * this.field8479.field6117 + this.field8479.field6123;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field8479.field6100 + (float) arg3 * this.field8479.field6127 + (float) arg4 * this.field8479.field6117 + this.field8479.field6123;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field8476) || !(var8 < (float) this.field8476)) && (!(var7 > (float) this.field8483) || !(var8 > (float) this.field8483))) {
            int var9 = (int) (((float) arg2 * this.field8479.field6107 + (float) arg0 * this.field8479.field6119 + (float) arg1 * this.field8479.field6101 + this.field8479.field6124) * (float) this.field8486 / var7);
            int var10 = (int) (((float) arg5 * this.field8479.field6107 + (float) arg3 * this.field8479.field6119 + (float) arg4 * this.field8479.field6101 + this.field8479.field6124) * (float) this.field8486 / var8);
            if (var9 < this.field8478 && var10 < this.field8478 || var9 > this.field8469 && var10 > this.field8469) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field8479.field6105 + (float) arg0 * this.field8479.field6126 + (float) arg1 * this.field8479.field6125 + this.field8479.field6097) * (float) this.field8472 / var7);
                int var12 = (int) (((float) arg5 * this.field8479.field6105 + (float) arg3 * this.field8479.field6126 + (float) arg4 * this.field8479.field6125 + this.field8479.field6097) * (float) this.field8472 / var8);
                return (var11 >= this.field8490 || var12 >= this.field8490) && (var11 <= this.field8492 || var12 <= this.field8492);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "ja", descriptor = "(I)V", line = 630)
    public final void method118(int arg0) {
        this.method824(0, 0, this.field8485, this.field8463, arg0, 0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)V", line = 634)
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method741(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method741(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method817(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method817(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field8489) {
                    var10 += (this.field8489 - arg0) * var12;
                    arg0 = this.field8489;
                }
                if (var13 >= this.field8474) {
                    var13 = this.field8474 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field8467 && var17 < this.field8495) {
                                int var18 = this.field8485 * var17 + arg0;
                                int var19 = this.field8466[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field8466[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field8467 && var21 < this.field8495) {
                                int var22 = this.field8485 * var21 + arg0;
                                int var23 = this.field8466[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field8466[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field8467 && var27 < this.field8495) {
                            this.field8466[this.field8485 * var27 + arg0] = arg4;
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
                if (arg1 < this.field8467) {
                    var29 += (this.field8467 - arg1) * var31;
                    arg1 = this.field8467;
                }
                if (var32 >= this.field8495) {
                    var32 = this.field8495 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field8489 && var46 < this.field8474) {
                            this.field8466[this.field8485 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field8489 && var36 < this.field8474) {
                            int var37 = this.field8485 * arg1 + var36;
                            int var38 = this.field8466[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field8466[this.field8485 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field8489 && var40 < this.field8474) {
                            int var41 = this.field8485 * arg1 + var40;
                            int var42 = this.field8466[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field8466[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lpa;)V", line = 846)
    public final void method744(class587 arg0) {
    }

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "()V", line = 851)
    private final void method3348() {
        for (int var1 = 0; var1 < this.field8465; ++var1) {
            this.field8491[var1].method2566(-58);
        }
        this.method805();
    }

    @OriginalMember(owner = "client!ve", name = "la", descriptor = "(IIII)V", line = 859)
    public final void method819(int arg0, int arg1, int arg2, int arg3) {
        this.field8493 = arg0;
        this.field8480 = arg1;
        this.field8486 = arg2;
        this.field8472 = arg3;
        this.method3354();
    }

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "()I", line = 867)
    public final int method796() {
        int var1 = this.field8462;
        this.field8462 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "()Z", line = 872)
    public final boolean method757() {
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 876)
    public final void method808(Canvas arg0) {
        class49 var2 = (class49) this.field8457.method2818(-22803, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2549((byte) -51);
            class49 var3 = class344.method2063(true, arg0);
            this.field8457.method2816(var3, (long) arg0.hashCode(), false);
            if (this.field8459 == arg0 && this.field8473 == null) {
                this.field8460 = var3;
                this.field8466 = var3.field641;
                this.field8485 = var3.field643;
                this.field8463 = var3.field638;
                if (this.field8488 != this.field8485 || this.field8482 != this.field8463) {
                    this.field8488 = this.field8485;
                    this.field8482 = this.field8463;
                    this.field8468 = new int[this.field8488 * this.field8482];
                }
                this.method3348();
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "()I", line = 902)
    public final int method746() {
        return this.field8483;
    }

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "()Lq;", line = 906)
    public final class152 method777() {
        class439 var1 = this.method3353(Thread.currentThread());
        return var1.field6316;
    }

    @OriginalMember(owner = "client!ve", name = "IA", descriptor = "(IIIIII[BII)V", line = 910)
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field8485 * arg1 + arg0;
            int var15 = this.field8485 - arg2;
            if (arg1 + arg3 > this.field8495) {
                arg3 -= arg1 + arg3 - this.field8495;
            }
            if (arg1 < this.field8467) {
                int var16 = this.field8467 - arg1;
                arg3 -= var16;
                var14 += this.field8485 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field8474) {
                int var17 = arg0 + arg2 - this.field8474;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field8489) {
                int var18 = this.field8489 - arg0;
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
                            int var28 = this.field8466[var14];
                            this.field8466[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field8466[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field8466[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field8466[var14++] = arg5;
                        } else {
                            this.field8466[var14++] = arg4;
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

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "()V", line = 1085)
    public final void method105() {
        if (this.field8456) {
            class487.method2849(34037, true, false);
            this.field8456 = false;
        }
        this.field8460 = null;
        this.field8459 = null;
        this.field8457 = null;
        this.field8461 = true;
    }

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "()V", line = 1097)
    public final void method776() {
        this.field8475.method936(-97);
        this.field8464.method936(-55);
    }

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "()I", line = 1101)
    public final int method802() {
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIZ)Lf;", line = 1105)
    public final class257 method749(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field8485 * arg1 + arg0;
        int var8 = this.field8485 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field8466[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class100(this, var6, arg2, arg3);
        } else {
            return new class58(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIII)V", line = 1139)
    public final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class439 var11 = this.method3353(Thread.currentThread());
        class159 var12 = var11.field6335;
        var12.field2583 = false;
        int var13 = arg0 - this.field8478;
        int var14 = arg2 - this.field8478;
        int var15 = arg4 - this.field8478;
        int var16 = arg1 - this.field8490;
        int var17 = arg3 - this.field8490;
        int var18 = arg5 - this.field8490;
        var12.field2584 = var13 < 0 || var13 > var12.field2593 || var14 < 0 || var14 > var12.field2593 || var15 < 0 || var15 > var12.field2593;
        var12.field2576 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field2577 = 255 - var19;
                var12.field2578 = false;
                var12.method1197(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field2577 = 128;
                var12.field2578 = true;
                var12.method1197(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field2577 = 0;
            var12.field2578 = false;
            var12.method1197(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field2583 = true;
        var12.field2576 = false;
    }

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "()V", line = 1181)
    public final void method102() {
    }

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "()Z", line = 1184)
    public final boolean method778() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "()Z", line = 1187)
    public final boolean method785() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "VA", descriptor = "(IFFFFF)V", line = 1191)
    public final void method756(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field8481 = (int) (arg1 * 65535.0F);
        this.field8477 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field8487 = (int) (arg3 * 65535.0F / var7);
        this.field8471 = (int) (arg4 * 65535.0F / var7);
        this.field8494 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ve", name = "BA", descriptor = "()I", line = 1200)
    public final int method820() {
        return this.field8476;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIF)Lam;", line = 1203)
    public final class289 method784(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "(I)[I", line = 1208)
    public final int[] method3349(int arg0) {
        class117 var2 = this.field8475;
        class20 var3;
        synchronized (this.field8475) {
            var3 = (class20) this.field8475.method941((long) arg0, 0);
            if (var3 == null) {
                if (!super.field1459.method2363((byte) -126, arg0)) {
                    return null;
                }
                class377 var5 = super.field1459.method2359(-125, arg0);
                int var6 = !var5.field5222 && !this.field8496 ? 128 : 64;
                var3 = new class20(arg0, var6, super.field1459.method2360(var6, true, arg0, (byte) 118, 0.7F, var6), var5.field5216);
                this.field8475.method949((long) arg0, true, var3);
            }
        }
        var3.field277 = true;
        return var3.method208();
    }

    @OriginalMember(owner = "client!ve", name = "ra", descriptor = "(F)V", line = 1228)
    public final void method794(float arg0) {
        this.field8470 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIIII)V", line = 1231)
    public final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method741(arg0, arg1, arg2, arg4, arg5);
        this.method741(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method817(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method817(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)Lf;", line = 1237)
    public final class257 method825(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class100(this, arg0, arg1) : new class58(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "()Z", line = 1243)
    public final boolean method3350() {
        return this.field8461;
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)V", line = 1248)
    public final void method147(int arg0) {
        int var2 = arg0 - this.field8458;
        for (Object var3 = this.field8475.method937(-19431); var3 != null; var3 = this.field8475.method940(-122)) {
            class20 var4 = (class20) var3;
            if (var4.field277) {
                var4.field276 += var2;
                int var5 = var4.field276 / 20;
                if (var5 > 0) {
                    class377 var6 = super.field1459.method2359(-126, var4.field279);
                    var4.method210(var6.field5220 * var2 * 50 / 1000, var6.field5224 * var2 * 50 / 1000);
                    var4.field276 -= var5 * 20;
                }
                var4.field277 = false;
            }
        }
        this.field8458 = arg0;
        this.field8464.method939(28093, 5);
        this.field8475.method939(28093, 5);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqg;)V", line = 1281)
    public final void method737(class272 arg0) {
        class439 var2 = this.method3353(Thread.currentThread());
        class264 var3 = arg0.field3898.field392;
        for (class264 var4 = var3.field3793; var3 != var4; var4 = var4.field3793) {
            class193 var5 = (class193) var4;
            int var6 = var5.field2998 >> 12;
            int var7 = var5.field2994 >> 12;
            int var8 = var5.field2992 >> 12;
            float var9 = (float) var8 * this.field8479.field6100 + (float) var6 * this.field8479.field6127 + (float) var7 * this.field8479.field6117 + this.field8479.field6123;
            if (!(var9 < (float) this.field8476) && !(var9 > (float) var2.field6321)) {
                int var10 = (int) (((float) var8 * this.field8479.field6107 + (float) var6 * this.field8479.field6119 + (float) var7 * this.field8479.field6101 + this.field8479.field6124) * (float) this.field8486 / var9) + this.field8493;
                int var11 = (int) (((float) var8 * this.field8479.field6105 + (float) var6 * this.field8479.field6126 + (float) var7 * this.field8479.field6125 + this.field8479.field6097) * (float) this.field8472 / var9) + this.field8480;
                if (var10 >= this.field8489 && var10 <= this.field8474 && var11 >= this.field8467 && var11 <= this.field8495) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method3355(var5, var10, var11, (int) var9, (int) ((float) (this.field8486 * var5.field2987 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "FA", descriptor = "(ILua;II)V", line = 1320)
    public final void method780(int arg0, class591 arg1, int arg2, int arg3) {
        class184 var5 = (class184) arg1;
        int[] var6 = var5.field2917;
        int[] var7 = var5.field2919;
        int var8;
        if (this.field8495 < var6.length + arg3) {
            var8 = this.field8495 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field8467 > arg3) {
            var9 = this.field8467 - arg3;
            arg3 = this.field8467;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field8485 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field8489 > var12) {
                    var13 -= this.field8489 - var12;
                    var12 = this.field8489;
                }
                if (this.field8474 < var12 + var13) {
                    var13 = this.field8474 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field8466[var14++] = arg0;
                }
                var10 += this.field8485;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "()Z", line = 1377)
    public final boolean method767() {
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "(I)Z", line = 1380)
    public final boolean method3351(int arg0) {
        return this.field8496 || super.field1459.method2359(-122, arg0).field5222;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 1386)
    public class578(Canvas arg0, class615 arg1) {
        this(arg1);
        this.method800(arg0);
        this.method758(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "()Lq;", line = 1391)
    public final class152 method812() {
        return new class428();
    }

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "()V", line = 1394)
    public final void method87() throws class300 {
        if (this.field8459 != null && this.field8460 != null) {
            try {
                Graphics var1 = this.field8459.getGraphics();
                this.field8460.method390(0, var1, 0, true);
            } catch (Exception var2) {
                this.field8459.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(IIII)[I", line = 1411)
    public final int[] method133(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field8485 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field8466[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lq;)V", line = 1438)
    public final void method755(class152 arg0) {
        this.field8479 = (class428) arg0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqg;I)V", line = 1442)
    public final void method799(class272 arg0, int arg1) {
        class439 var3 = this.method3353(Thread.currentThread());
        class264 var4 = arg0.field3898.field392;
        for (class264 var5 = var4.field3793; var4 != var5; var5 = var5.field3793) {
            class193 var6 = (class193) var5;
            int var7 = var6.field2998 >> 12;
            int var8 = var6.field2994 >> 12;
            int var9 = var6.field2992 >> 12;
            float var10 = (float) var9 * this.field8479.field6100 + (float) var7 * this.field8479.field6127 + (float) var8 * this.field8479.field6117 + this.field8479.field6123;
            if (!(var10 < (float) this.field8476) && !(var10 > (float) var3.field6321)) {
                int var11 = (int) (((float) var9 * this.field8479.field6107 + (float) var7 * this.field8479.field6119 + (float) var8 * this.field8479.field6101 + this.field8479.field6124) * (float) this.field8486 / (float) arg1) + this.field8493;
                int var12 = (int) (((float) var9 * this.field8479.field6105 + (float) var7 * this.field8479.field6126 + (float) var8 * this.field8479.field6125 + this.field8479.field6097) * (float) this.field8472 / (float) arg1) + this.field8480;
                if (var11 >= this.field8489 && var11 <= this.field8474 && var12 >= this.field8467 && var12 <= this.field8495) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method3355(var6, var11, var12, (int) var10, (this.field8486 * var6.field2987 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 1479)
    public final void method97(boolean arg0) {
    }

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "()Z", line = 1482)
    public final boolean method798() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 1485)
    public final class682 method768(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class321(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ve", name = "MA", descriptor = "(III[I)V", line = 1489)
    public final void method787(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field8479.field6100 + (float) arg0 * this.field8479.field6127 + (float) arg1 * this.field8479.field6117 + this.field8479.field6123;
        if (!(var5 < (float) this.field8476) && !(var5 > (float) this.field8483)) {
            int var6 = (int) (((float) arg2 * this.field8479.field6107 + (float) arg0 * this.field8479.field6119 + (float) arg1 * this.field8479.field6101 + this.field8479.field6124) * (float) this.field8486 / var5);
            int var7 = (int) (((float) arg2 * this.field8479.field6105 + (float) arg0 * this.field8479.field6126 + (float) arg1 * this.field8479.field6125 + this.field8479.field6097) * (float) this.field8472 / var5);
            arg3[0] = var6 - this.field8478;
            arg3[1] = var7 - this.field8490;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "JA", descriptor = "()V", line = 1505)
    public final void method805() {
        this.field8489 = 0;
        this.field8467 = 0;
        this.field8474 = this.field8485;
        this.field8495 = this.field8463;
        this.method3354();
    }

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "(I)Z", line = 1514)
    public final boolean method3352(int arg0) {
        return super.field1459.method2363((byte) -118, arg0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lcr;IIII)Lda;", line = 1517)
    public final class397 method795(class163 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class139(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Runnable;)Lqm;", line = 1522)
    public final class439 method3353(Runnable arg0) {
        for (int var2 = 0; var2 < this.field8465; ++var2) {
            if (this.field8491[var2].field6319 == arg0) {
                return this.field8491[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "()Z", line = 1534)
    public final boolean method801() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "()[I", line = 1537)
    public final int[] method826() {
        return new int[] { this.field8493, this.field8480, this.field8486, this.field8472 };
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "()Z", line = 1540)
    public final boolean method766() {
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "()Z", line = 1543)
    public final boolean method100() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([I)V", line = 1546)
    public final void method769(int[] arg0) {
        arg0[0] = this.field8485;
        arg0[1] = this.field8463;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lf;Z)V", line = 1550)
    public final void method68(class257 arg0, boolean arg1) {
        if (arg0 instanceof class58) {
            class58 var3 = (class58) arg0;
            this.field8485 = var3.field8;
            this.field8463 = var3.field26;
            this.field8466 = var3.field862;
            this.field8473 = arg0;
        } else {
            if (!(arg0 instanceof class100)) {
                throw new RuntimeException();
            }
            class100 var4 = (class100) arg0;
            this.field8485 = var4.field8;
            this.field8463 = var4.field26;
            this.field8466 = var4.field1484;
            this.field8473 = arg0;
        }
        this.method3348();
    }

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "()V", line = 1576)
    private final void method3354() {
        this.field8478 = this.field8489 - this.field8493;
        this.field8469 = this.field8474 - this.field8493;
        this.field8490 = this.field8467 - this.field8480;
        this.field8492 = this.field8495 - this.field8480;
        for (int var1 = 0; var1 < this.field8465; ++var1) {
            class159 var5 = this.field8491[var1].field6335;
            var5.field2579 = this.field8493 - this.field8489;
            var5.field2587 = this.field8480 - this.field8467;
            var5.field2593 = this.field8474 - this.field8489;
            var5.field2592 = this.field8495 - this.field8467;
        }
        int var2 = this.field8485 * this.field8467 + this.field8489;
        for (int var3 = this.field8467; var3 < this.field8495; ++var3) {
            for (int var4 = 0; var4 < this.field8465; ++var4) {
                this.field8491[var4].field6335.field2582[var3 - this.field8467] = var2;
            }
            var2 += this.field8485;
        }
    }

    @OriginalMember(owner = "client!ve", name = "AA", descriptor = "(III[I)V", line = 1615)
    public final void method810(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field8479.field6100 + (float) arg0 * this.field8479.field6127 + (float) arg1 * this.field8479.field6117 + this.field8479.field6123;
        if (!(var5 < (float) this.field8476) && !(var5 > (float) this.field8483)) {
            int var6 = (int) (((float) arg2 * this.field8479.field6107 + (float) arg0 * this.field8479.field6119 + (float) arg1 * this.field8479.field6101 + this.field8479.field6124) * (float) this.field8486 / var5);
            int var7 = (int) (((float) arg2 * this.field8479.field6105 + (float) arg0 * this.field8479.field6126 + (float) arg1 * this.field8479.field6125 + this.field8479.field6097) * (float) this.field8472 / var5);
            if (var6 >= this.field8478 && var6 <= this.field8469 && var7 >= this.field8490 && var7 <= this.field8492) {
                arg3[0] = var6 - this.field8478;
                arg3[1] = var7 - this.field8490;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "CA", descriptor = "(IIII)V", line = 1641)
    public final void method760(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field8491.length; ++var5) {
            this.field8491[var5].field6314 = this.field8491[var5].field6323;
            this.field8491[var5].field6315 = arg0;
            this.field8491[var5].field6323 = arg1;
            this.field8491[var5].field6324 = arg2;
            this.field8491[var5].field6317 = true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "oa", descriptor = "([I)V", line = 1655)
    public final void method764(int[] arg0) {
        arg0[0] = this.field8489;
        arg0[1] = this.field8467;
        arg0[2] = this.field8474;
        arg0[3] = this.field8495;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1661)
    public final void method758(Canvas arg0) {
        if (arg0 != null) {
            class49 var2 = (class49) this.field8457.method2818(-22803, (long) arg0.hashCode());
            if (var2 != null) {
                this.field8459 = arg0;
                this.field8460 = var2;
                if (this.field8473 == null) {
                    this.field8466 = var2.field641;
                    this.field8485 = var2.field643;
                    this.field8463 = var2.field638;
                    if (this.field8488 != this.field8485 || this.field8482 != this.field8463) {
                        this.field8488 = this.field8485;
                        this.field8482 = this.field8463;
                        this.field8468 = new int[this.field8488 * this.field8482];
                    }
                    this.method3348();
                    return;
                }
            }
        } else {
            this.field8459 = null;
            this.field8460 = null;
            if (this.field8473 == null) {
                this.field8466 = null;
                this.field8485 = this.field8463 = 1;
                this.field8488 = this.field8482 = 1;
                this.method3348();
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "va", descriptor = "(I)V", line = 1702)
    public final void method781(int arg0) {
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIILua;II)V", line = 1706)
    public final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        class184 var10 = (class184) arg6;
        int[] var11 = var10.field2917;
        int[] var12 = var10.field2919;
        int var13 = this.field8467 > arg8 ? this.field8467 : arg8;
        int var14 = this.field8495 < var11.length + arg8 ? this.field8495 : var11.length + arg8;
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
            if (arg0 < this.field8489) {
                var18 += (this.field8489 - arg0) * var20;
                arg0 = this.field8489;
            }
            if (var21 >= this.field8474) {
                var21 = this.field8474 - 1;
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
                                int var28 = this.field8485 * var25 + arg0;
                                int var29 = this.field8466[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field8466[var28] = var23 + var30;
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
                                int var34 = this.field8485 * var31 + arg0;
                                int var35 = this.field8466[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field8466[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field8466[this.field8485 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field8489 && var64 < this.field8474 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field8466[this.field8485 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field8489 && var50 < this.field8474 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field8485 * arg1 + var50;
                        int var54 = this.field8466[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field8466[this.field8485 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field8489 && var56 < this.field8474 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field8485 * arg1 + var56;
                        int var60 = this.field8466[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field8466[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lll;[Lfda;Z)Lla;", line = 1946)
    public final class395 method804(class490 arg0, class628[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8936;
            var5[var7] = arg1[var7].field8940;
            if (arg1[var7].field8934 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class46(this, arg0, arg1, var4, var5);
            } else {
                return new class574(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class380(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lfa;)V", line = 1983)
    private class578(class615 arg0) {
        super(arg0);
        this.field8456 = false;
        this.field8461 = false;
        this.field8457 = new class482(4);
        this.field8470 = 75518;
        this.field8477 = 78642;
        this.field8476 = 50;
        this.field8467 = 0;
        this.field8474 = 0;
        this.field8462 = 0;
        this.field8481 = 45823;
        this.field8483 = 3500;
        this.field8472 = 512;
        this.field8489 = 0;
        this.field8486 = 512;
        this.field8484 = 0;
        this.field8496 = false;
        this.field8495 = 0;
        this.field8464 = new class117(16);
        this.field8498 = -1;
        this.field8475 = new class117(256);
        this.field8479 = new class428();
        this.method751(1);
        this.method807(0);
        class12.method62(false, true, (byte) 113);
        this.field8456 = true;
        this.field8458 = (int) class254.method1619(true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1997)
    public final void method93(Rectangle[] arg0, int arg1) throws class300 {
        if (this.field8459 != null && this.field8460 != null) {
            try {
                Graphics var3 = this.field8459.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field8485 && var5.y <= this.field8463 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field8460.method387(var5.height, var5.x, var5.width, 91, var3, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field8459.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lpa;Lpa;FLpa;)Lpa;", line = 2026)
    public final class587 method83(class587 arg0, class587 arg1, float arg2, class587 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "(IIIIII)V", line = 2029)
    public final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field8489) {
            arg2 -= this.field8489 - arg0;
            arg0 = this.field8489;
        }
        if (arg1 < this.field8467) {
            arg3 -= this.field8467 - arg1;
            arg1 = this.field8467;
        }
        if (arg0 + arg2 > this.field8474) {
            arg2 = this.field8474 - arg0;
        }
        if (arg1 + arg3 > this.field8495) {
            arg3 = this.field8495 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field8474 && arg1 <= this.field8495) {
            int var7 = this.field8485 - arg2;
            int var8 = this.field8485 * arg1 + arg0;
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
                            this.field8466[var24] = arg4;
                            ++var24;
                            this.field8466[var24] = arg4;
                            ++var24;
                            this.field8466[var24] = arg4;
                            ++var24;
                            this.field8466[var24] = arg4;
                            ++var24;
                            this.field8466[var24] = arg4;
                            ++var24;
                            this.field8466[var24] = arg4;
                            ++var24;
                            this.field8466[var24] = arg4;
                            ++var24;
                            this.field8466[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field8466[var24] = arg4;
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
                        int var14 = this.field8466[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field8466[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field8466[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field8466[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V", line = 2164)
    public final void method807(int arg0) {
        this.field8491[arg0].method2568(Thread.currentThread(), 15855);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V", line = 2167)
    public final void method774(int arg0) {
        this.field8491[arg0].method2568((Runnable) null, 15855);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "()Z", line = 2170)
    public final boolean method742() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 2173)
    public final void method752(int arg0) {
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ldg;IIII)V", line = 2177)
    private final void method3355(class193 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field2995;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method3356(arg1, arg2, arg3, arg4, arg0.field2996, 1);
        } else {
            if (this.field8498 != var6) {
                class257 var9 = (class257) this.field8464.method941((long) var6, 0);
                if (var9 == null) {
                    int[] var10 = this.method3345(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3351(var6) ? 64 : 128;
                    var9 = this.method806(var10, 0, var11, var11, var11);
                    this.field8464.method949((long) var6, true, var9);
                }
                this.field8498 = var6;
                this.field8497 = var9;
            }
            ++var8;
            ((class2) this.field8497).method10(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field2996, 1, 1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "()Lsr;", line = 2215)
    public final class568 method77() {
        return new class568(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFF)V", line = 2217)
    public final void method80(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()V", line = 2219)
    public final void method137() {
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()Z", line = 2222)
    public final boolean method739() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2225)
    public final void method803(Canvas arg0) {
        if (this.field8459 == arg0) {
            this.method758((Canvas) null);
        }
        class49 var2 = (class49) this.field8457.method2818(-22803, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2549((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "()V", line = 2234)
    public final void method67() {
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Le;)V", line = 2238)
    public final void method822(class698 arg0) {
    }

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "()Z", line = 2242)
    public final boolean method814() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "()V", line = 2245)
    public final void method88() {
        if (this.field8459 != null) {
            this.field8466 = this.field8460.field641;
            this.field8485 = this.field8460.field643;
            this.field8463 = this.field8460.field638;
        } else {
            this.field8485 = 1;
            this.field8463 = 1;
            this.field8466 = null;
        }
        this.field8473 = null;
        this.method3348();
    }

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "()Z", line = 2263)
    public final boolean method816() {
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "XA", descriptor = "(IIIII)V", line = 2266)
    public final void method741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field8467 && arg1 < this.field8495) {
            if (arg0 < this.field8489) {
                arg2 -= this.field8489 - arg0;
                arg0 = this.field8489;
            }
            if (arg0 + arg2 > this.field8474) {
                arg2 = this.field8474 - arg0;
            }
            int var6 = this.field8485 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field8466[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field8466[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field8466[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field8466[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field8466[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "(IIII)V", line = 2338)
    public final void method818(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8489 < arg0) {
            this.field8489 = arg0;
        }
        if (this.field8467 < arg1) {
            this.field8467 = arg1;
        }
        if (this.field8474 > arg2) {
            this.field8474 = arg2;
        }
        if (this.field8495 > arg3) {
            this.field8495 = arg3;
        }
        this.method3354();
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()Lq;", line = 2353)
    public final class152 method740() {
        return this.field8479;
    }

    @OriginalMember(owner = "client!ve", name = "ya", descriptor = "()V", line = 2356)
    public final void method138() {
        if (this.field8489 == 0 && this.field8485 == this.field8474 && this.field8467 == 0 && this.field8495 == this.field8463) {
            int var1 = this.field8468.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field8468[var3++] = Integer.MAX_VALUE;
                this.field8468[var3++] = Integer.MAX_VALUE;
                this.field8468[var3++] = Integer.MAX_VALUE;
                this.field8468[var3++] = Integer.MAX_VALUE;
                this.field8468[var3++] = Integer.MAX_VALUE;
                this.field8468[var3++] = Integer.MAX_VALUE;
                this.field8468[var3++] = Integer.MAX_VALUE;
                this.field8468[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field8468[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field8474 - this.field8489;
            int var5 = this.field8495 - this.field8467;
            int var6 = this.field8485 - var4;
            int var7 = this.field8485 * this.field8467 + this.field8489;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field8468[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "(IIIII)V", line = 2436)
    public final void method817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field8489 && arg0 < this.field8474) {
            if (arg1 < this.field8467) {
                arg2 -= this.field8467 - arg1;
                arg1 = this.field8467;
            }
            if (arg1 + arg2 > this.field8495) {
                arg2 = this.field8495 - arg1;
            }
            int var6 = this.field8485 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field8485 * var10 + var6;
                        int var12 = this.field8466[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field8466[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field8485 * var14 + var6;
                        int var16 = this.field8466[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field8466[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field8466[this.field8485 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "GA", descriptor = "(II)V", line = 2513)
    public final void method765(int arg0, int arg1) {
        class439 var3 = this.method3353(Thread.currentThread());
        this.field8476 = arg0;
        this.field8483 = arg1;
        var3.field6321 = this.field8483 - 255;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I", line = 2519)
    public final int method738(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()I", line = 2522)
    public final int method775() {
        return 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfda;Z)Lf;", line = 2526)
    public final class257 method772(class628 arg0, boolean arg1) {
        int[] var3 = arg0.field8938;
        byte[] var4 = arg0.field8939;
        int var5 = arg0.field8936;
        int var6 = arg0.field8940;
        class2 var11;
        if (arg1 && arg0.field8934 == null) {
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
            var11 = new class575(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field8934;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class100(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class58(this, var14, var5, var6);
            }
        }
        var11.method7(arg0.field8933, arg0.field8935, arg0.field8932, arg0.field8937);
        return var11;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V", line = 2629)
    public final void method793(boolean arg0) {
        this.field8496 = arg0;
        this.field8475.method936(-114);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(IIIIII)V", line = 2633)
    private final void method3356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field8467) {
            var8 = this.field8467;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field8495) {
            var9 = this.field8495;
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
                if (var66 < this.field8489) {
                    var66 = this.field8489;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field8474) {
                    var67 = this.field8474;
                }
                int var68 = this.field8485 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field8468[var68]) {
                        this.field8466[var68] = arg4;
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
                if (var62 < this.field8489) {
                    var62 = this.field8489;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field8474 - 1) {
                    var63 = this.field8474 - 1;
                }
                int var64 = this.field8485 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field8468[var64]) {
                        this.field8466[var64] = arg4;
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
                if (var30 < this.field8489) {
                    var30 = this.field8489;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field8474) {
                    var31 = this.field8474;
                }
                int var32 = this.field8485 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field8468[var32]) {
                        int var34 = this.field8466[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field8466[var32] = var17 + var35;
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
                if (var24 < this.field8489) {
                    var24 = this.field8489;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field8474 - 1) {
                    var25 = this.field8474 - 1;
                }
                int var26 = this.field8485 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field8468[var26]) {
                        int var28 = this.field8466[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field8466[var26] = var17 + var29;
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
                if (var49 < this.field8489) {
                    var49 = this.field8489;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field8474) {
                    var50 = this.field8474;
                }
                int var51 = this.field8485 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field8468[var51]) {
                        int var53 = this.field8466[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field8466[var51] = var54 - var56 | var56 - (var56 >>> 8);
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
                if (var41 < this.field8489) {
                    var41 = this.field8489;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field8474 - 1) {
                    var42 = this.field8474 - 1;
                }
                int var43 = this.field8485 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field8468[var43]) {
                        int var45 = this.field8466[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field8466[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[Lam;)V", line = 3026)
    public final void method823(int arg0, class289[] arg1) {
    }
}
