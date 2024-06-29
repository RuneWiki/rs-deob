import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class146 extends class299 {

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Z")
    private boolean field2134;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Z")
    private boolean field2136;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Lvg;")
    private class56 field2137;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "Z")
    private boolean field2153;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!qf", name = "nb", descriptor = "I")
    private int field2180;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!qf", name = "lb", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!qf", name = "mb", descriptor = "Z")
    public boolean field2179;

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
    private int field2171;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
    private int field2173;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Ld;")
    private class242 field2145;

    @OriginalMember(owner = "client!qf", name = "pb", descriptor = "I")
    private int field2182;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "Ld;")
    private class242 field2163;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Llc;")
    public class526 field2154;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "F")
    private float field2165;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "F")
    private float field2170;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    private int field2144;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!qf", name = "kb", descriptor = "I")
    public int field2177;

    @OriginalMember(owner = "client!qf", name = "ob", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Lgq;")
    private class244 field2139;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lo;")
    private class363 field2169;

    @OriginalMember(owner = "client!qf", name = "qb", descriptor = "Lo;")
    private class363 field2183;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2138;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Z")
    public boolean field2160;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "[I")
    public int[] field2142;

    @OriginalMember(owner = "client!qf", name = "jb", descriptor = "[Lmh;")
    private class112[] field2176;

    @OriginalMember(owner = "client!qf", name = "va", descriptor = "()V", line = 3)
    public final void method577() {
        this.field2162 = 0;
        this.field2147 = 0;
        this.field2156 = this.field2177;
        this.field2143 = this.field2144;
        this.method1037();
    }

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "(IFFFFF)V", line = 10)
    public final void method596(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2150 = (int) (arg1 * 65535.0F);
        this.field2167 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2146 = (int) (arg3 * 65535.0F / var7);
        this.field2161 = (int) (arg4 * 65535.0F / var7);
        this.field2148 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "(IIIIII)V", line = 22)
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2162) {
            arg2 -= this.field2162 - arg0;
            arg0 = this.field2162;
        }
        if (arg1 < this.field2147) {
            arg3 -= this.field2147 - arg1;
            arg1 = this.field2147;
        }
        if (arg0 + arg2 > this.field2156) {
            arg2 = this.field2156 - arg0;
        }
        if (arg1 + arg3 > this.field2143) {
            arg3 = this.field2143 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2156 && arg1 <= this.field2143) {
            int var7 = this.field2177 - arg2;
            int var8 = this.field2177 * arg1 + arg0;
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
                            this.field2142[var24] = arg4;
                            ++var24;
                            this.field2142[var24] = arg4;
                            ++var24;
                            this.field2142[var24] = arg4;
                            ++var24;
                            this.field2142[var24] = arg4;
                            ++var24;
                            this.field2142[var24] = arg4;
                            ++var24;
                            this.field2142[var24] = arg4;
                            ++var24;
                            this.field2142[var24] = arg4;
                            ++var24;
                            this.field2142[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2142[var24] = arg4;
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
                        int var14 = this.field2142[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field2142[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2142[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2142[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "aa", descriptor = "()F", line = 157)
    public final float method575() {
        return this.field2170;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V", line = 161)
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class112 var8 = this.method1038(Thread.currentThread());
        class233 var9 = var8.field1675;
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
            int var21 = arg0 - var9.method1573();
            int var22 = arg1 - var9.method1576();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field3505 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3505 = 255 - (arg4 >> 24);
            }
            var9.field3496 = var23 < 0 || var23 > var9.field3504 || var24 < 0 || var24 > var9.field3504 || var25 < 0 || var25 > var9.field3504;
            var9.method1579(var27, var28, var29, var23, var24, var25, arg4);
            var9.field3496 = var23 < 0 || var23 > var9.field3504 || var24 < 0 || var24 > var9.field3504 || var26 < 0 || var26 > var9.field3504;
            var9.method1579(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)[I", line = 232)
    public final int[] method1034(int arg0) {
        class242 var2 = this.field2163;
        class140 var3;
        synchronized (this.field2163) {
            var3 = (class140) this.field2163.method1634((long) arg0, 64);
            if (var3 == null) {
                if (!super.field4588.method936(arg0, (byte) -119)) {
                    return null;
                }
                class420 var5 = super.field4588.method938(28923, arg0);
                int var6 = !var5.field6170 && !this.field2153 ? 128 : 64;
                var3 = new class140(arg0, var6, super.field4588.method939(var6, -8507, arg0, var6, true, 0.7F), var5.field6159);
                this.field2163.method1623((long) arg0, 17621, var3);
            }
        }
        var3.field2098 = true;
        return var3.method1017();
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIII)Lbn;", line = 252)
    public final class307 method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 255)
    public final void method549(int arg0) {
        this.field2176[arg0].method864(Thread.currentThread(), (byte) -120);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lrr;Z)Lo;", line = 259)
    public final class363 method574(class309 arg0, boolean arg1) {
        int[] var3 = arg0.field4709;
        byte[] var4 = arg0.field4711;
        int var5 = arg0.field4713;
        int var6 = arg0.field4717;
        class60 var11;
        if (arg1 && arg0.field4715 == null) {
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
            var11 = new class170(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4715;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class257(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class257(this, var14, var5, var6);
                var11 = new class189(this, var14, var5, var6);
            }
        }
        var11.method400(arg0.field4716, arg0.field4712, arg0.field4714, arg0.field4710);
        return var11;
    }

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "()V", line = 363)
    private final void method1035() {
        for (int var1 = 0; var1 < this.field2174; ++var1) {
            this.field2176[var1].method862(30714);
        }
        this.method577();
    }

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "()Z", line = 371)
    public final boolean method1036() {
        return this.field2134;
    }

    @OriginalMember(owner = "client!qf", name = "ma", descriptor = "(IIIII)V", line = 374)
    public final void method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2147 && arg1 < this.field2143) {
            if (arg0 < this.field2162) {
                arg2 -= this.field2162 - arg0;
                arg0 = this.field2162;
            }
            if (arg0 + arg2 > this.field2156) {
                arg2 = this.field2156 - arg0;
            }
            int var6 = this.field2177 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2142[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2142[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2142[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2142[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2142[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "()V", line = 446)
    private final void method1037() {
        this.field2181 = this.field2162 - this.field2149;
        this.field2175 = this.field2156 - this.field2149;
        this.field2159 = this.field2147 - this.field2141;
        this.field2151 = this.field2143 - this.field2141;
        for (int var1 = 0; var1 < this.field2174; ++var1) {
            class233 var5 = this.field2176[var1].field1675;
            var5.field3501 = this.field2149 - this.field2162;
            var5.field3498 = this.field2141 - this.field2147;
            var5.field3504 = this.field2156 - this.field2162;
            var5.field3500 = this.field2143 - this.field2147;
        }
        int var2 = this.field2177 * this.field2147 + this.field2162;
        for (int var3 = this.field2147; var3 < this.field2143; ++var3) {
            for (int var4 = 0; var4 < this.field2174; ++var4) {
                this.field2176[var4].field1675.field3495[var3 - this.field2147] = var2;
            }
            var2 += this.field2177;
        }
    }

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "()V", line = 488)
    public final void method585() {
        this.field2140 = this.field2180;
        this.field2179 = false;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V", line = 492)
    public final void method530() {
        if (this.field2138 != null && this.field2139 != null) {
            try {
                Graphics var1 = this.field2138.getGraphics();
                this.field2139.method384((byte) 124, 0, var1, 0);
            } catch (Exception var2) {
                this.field2138.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "()Z", line = 508)
    public final boolean method573() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V", line = 510)
    public final void method595(int arg0) {
    }

    @OriginalMember(owner = "client!qf", name = "SA", descriptor = "(Lc;)V", line = 513)
    public final void method582(class517 arg0) {
        this.field2154 = (class526) arg0;
    }

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "()Z", line = 516)
    public final boolean method510() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Ln;", line = 519)
    public final class393 method605(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "()V", line = 523)
    public final void method556() {
        if (this.field2136) {
            class487.method2945(true, false, (byte) -60);
            this.field2136 = false;
        }
        this.field2139 = null;
        this.field2138 = null;
        this.field2137 = null;
        this.field2134 = true;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()Z", line = 535)
    public final boolean method528() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(IIIIII)V", line = 538)
    public final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method566(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method566(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method548(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method548(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2162) {
                    var10 += (this.field2162 - arg0) * var12;
                    arg0 = this.field2162;
                }
                if (var13 >= this.field2156) {
                    var13 = this.field2156 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2147 && var17 < this.field2143) {
                                int var18 = this.field2177 * var17 + arg0;
                                int var19 = this.field2142[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2142[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2147 && var21 < this.field2143) {
                                int var22 = this.field2177 * var21 + arg0;
                                int var23 = this.field2142[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2142[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2147 && var27 < this.field2143) {
                            this.field2142[this.field2177 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2147) {
                    var29 += (this.field2147 - arg1) * var31;
                    arg1 = this.field2147;
                }
                if (var32 >= this.field2143) {
                    var32 = this.field2143 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2162 && var46 < this.field2156) {
                            this.field2142[this.field2177 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2162 && var36 < this.field2156) {
                            int var37 = this.field2177 * arg1 + var36;
                            int var38 = this.field2142[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2142[this.field2177 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2162 && var40 < this.field2156) {
                            int var41 = this.field2177 * arg1 + var40;
                            int var42 = this.field2142[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2142[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!qf", name = "ba", descriptor = "(IIII)V", line = 751)
    public final void method571(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2177) {
            arg2 = this.field2177;
        }
        if (arg3 > this.field2144) {
            arg3 = this.field2144;
        }
        this.field2162 = arg0;
        this.field2156 = arg2;
        this.field2147 = arg1;
        this.field2143 = arg3;
        this.method1037();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Runnable;)Lmh;", line = 772)
    public final class112 method1038(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2174; ++var2) {
            if (this.field2176[var2].field1677 == arg0) {
                return this.field2176[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "HA", descriptor = "(IIII)V", line = 785)
    public final void method599(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2162 < arg0) {
            this.field2162 = arg0;
        }
        if (this.field2147 < arg1) {
            this.field2147 = arg1;
        }
        if (this.field2156 > arg2) {
            this.field2156 = arg2;
        }
        if (this.field2143 > arg3) {
            this.field2143 = arg3;
        }
        this.method1037();
    }

    @OriginalMember(owner = "client!qf", name = "JA", descriptor = "(F)V", line = 800)
    public final void method502(float arg0) {
        this.field2157 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!qf", name = "da", descriptor = "(FF)V", line = 803)
    public final void method606(float arg0, float arg1) {
        this.field2165 = arg0;
        this.field2170 = arg1;
        this.method1040();
    }

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "()V", line = 809)
    public final void method580() {
        this.field2163.method1637((byte) 13);
    }

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "()Lc;", line = 813)
    public final class517 method538() {
        class112 var1 = this.method1038(Thread.currentThread());
        return var1.field1673;
    }

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "()Lc;", line = 817)
    public final class517 method496() {
        return new class526();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V", line = 820)
    public final void method561(int arg0, int arg1, int arg2, int arg3) {
        this.field2152 = arg0;
        this.field2140 = arg1;
        this.field2158 = arg2;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ILl;)V", line = 1303)
    private class146(int arg0, class127 arg1) {
        super(arg0, arg1);
        this.field2134 = false;
        this.field2136 = false;
        this.field2137 = new class56(4);
        this.field2143 = 0;
        this.field2150 = 45823;
        this.field2157 = 75518;
        this.field2162 = 0;
        this.field2155 = 3500;
        this.field2153 = false;
        this.field2147 = 0;
        this.field2158 = 0;
        this.field2172 = 512;
        this.field2164 = this.field2155 - 255;
        this.field2167 = 78642;
        this.field2156 = 0;
        this.field2180 = 0;
        this.field2140 = 0;
        this.field2178 = 50;
        this.field2179 = false;
        this.field2171 = 0;
        this.field2168 = 3500;
        this.field2166 = 512;
        this.field2173 = 0;
        this.field2152 = 0;
        this.field2145 = new class242(16);
        this.field2182 = -1;
        this.field2163 = new class242(20);
        this.field2154 = new class526();
        this.method504(1);
        this.method549(0);
        class488.method2946(false, true, false);
        this.field2136 = true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([IIIII)Lo;", line = 830)
    public final class363 method520(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class257(this, arg0, arg1, arg2, arg3, arg4) : new class189(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class257(this, arg0, arg1, arg2, arg3, arg4) : new class189(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lij;III)V", line = 866)
    public final void method1039(class471 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field6918;
        int var7 = arg3 << 1;
        if (var5 == -1) {
            this.method565(arg1, arg2, arg3, arg0.field6908, 1);
        } else {
            if (this.field2182 != var5) {
                class363 var8 = (class363) this.field2145.method1634((long) var5, 64);
                if (var8 == null) {
                    int[] var9 = this.method1041(var5);
                    if (var9 == null) {
                        return;
                    }
                    int var10 = this.method1046(var5) ? 64 : 128;
                    var8 = this.method520(var9, 0, var10, var10, var10);
                    this.field2145.method1623((long) var5, 17621, var8);
                }
                this.field2182 = var5;
                this.field2183 = var8;
            }
            this.field2183.method395(arg1 - arg3, arg2 - arg3, var7, var7, 0, arg0.field6908, 1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()V", line = 902)
    public final void method499() {
    }

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "()Z", line = 905)
    public final boolean method515() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "ya", descriptor = "(I)V", line = 907)
    public final void method500(int arg0) {
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()Z", line = 910)
    public final boolean method553() {
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "()V", line = 913)
    private final void method1040() {
        if (this.field2170 != 0.0F) {
            float var1 = (float) this.field2155;
            float var2 = (float) this.field2178;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field2165 / (this.field2170 + this.field2165);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field2170;
            this.field2168 = (int) (((float) this.field2155 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field2168 = this.field2155;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Le;Lvm;Lc;Lwg;I)V", line = 934)
    public final void method584(class289 arg0, class320 arg1, class517 arg2, class41 arg3, int arg4) {
        ((class72) arg0).method663(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)[I", line = 938)
    private final int[] method1041(int arg0) {
        class242 var2 = this.field2163;
        class140 var3;
        synchronized (this.field2163) {
            var3 = (class140) this.field2163.method1634((long) arg0, 64);
            if (var3 == null) {
                if (!super.field4588.method936(arg0, (byte) -119)) {
                    return null;
                }
                class420 var5 = super.field4588.method938(28923, arg0);
                int var6 = !var5.field6170 && !this.field2153 ? 128 : 64;
                var3 = new class140(arg0, var6, super.field4588.method937(arg0, -15746, var6, true, var6, 0.7F), var5.field6159);
                this.field2163.method1623((long) arg0, 17621, var3);
            }
        }
        var3.field2098 = true;
        return var3.method1017();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIII)V", line = 958)
    public final void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field4588.method938(28923, arg5).field6161) {
                if (this.field2182 != arg5) {
                    class363 var10 = (class363) this.field2145.method1634((long) arg5, 64);
                    if (var10 == null) {
                        int[] var11 = this.method1041(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method1046(arg5) ? 64 : 128;
                        var10 = this.method520(var11, 0, var12, var12, var12);
                        this.field2145.method1623((long) arg5, 17621, var10);
                    }
                    this.field2182 = arg5;
                    this.field2183 = var10;
                }
                this.field2183.method395(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method565(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([Le;Lc;[Lwg;I)V", line = 992)
    public final void method603(class289[] arg0, class517 arg1, class41[] arg2, int arg3) {
        class72[] var5 = new class72[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class72) arg0[var6];
            }
        }
        class72 var7 = class72.method626(this, var5);
        var7.method663(arg1, arg2 != null ? arg2[0] : null, (class320) null, arg3);
    }

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "(III[I)V", line = 1009)
    public final void method592(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field2154.field7706 * arg2 + this.field2154.field7712 * arg0 + this.field2154.field7710 * arg1 >> 15) + this.field2154.field7704;
        if (var5 >= this.field2178 && var5 <= this.field2155) {
            int var6 = ((this.field2154.field7708 * arg2 + this.field2154.field7711 * arg1 + this.field2154.field7705 * arg0 >> 15) + this.field2154.field7707) * this.field2172 / var5;
            int var7 = ((this.field2154.field7701 * arg2 + this.field2154.field7703 * arg1 + this.field2154.field7702 * arg0 >> 15) + this.field2154.field7709) * this.field2166 / var5;
            if (var6 >= this.field2181 && var6 <= this.field2175 && var7 >= this.field2159 && var7 <= this.field2151) {
                arg3[0] = var6 - this.field2181;
                arg3[1] = var7 - this.field2159;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "(IIIIII[BII)V", line = 1033)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2177 * arg1 + arg0;
            int var15 = this.field2177 - arg2;
            if (arg1 + arg3 > this.field2143) {
                arg3 -= arg1 + arg3 - this.field2143;
            }
            if (arg1 < this.field2147) {
                int var16 = this.field2147 - arg1;
                arg3 -= var16;
                var14 += this.field2177 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2156) {
                int var17 = arg0 + arg2 - this.field2156;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2162) {
                int var18 = this.field2162 - arg0;
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
                            int var28 = this.field2142[var14];
                            this.field2142[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2142[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2142[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2142[var14++] = arg5;
                        } else {
                            this.field2142[var14++] = arg4;
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

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 1208)
    public final void method591(boolean arg0) {
        this.field2153 = arg0;
        this.field2163.method1637((byte) 13);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1214)
    public final void method518(Canvas arg0) {
        class244 var2 = (class244) this.field2137.method358((byte) 8, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method947((byte) 93);
            class244 var3 = class438.method2712(arg0, 0);
            this.field2137.method357(var3, 1, (long) arg0.hashCode());
            if (this.field2138 == arg0 && this.field2169 == null) {
                this.field2139 = var3;
                this.field2142 = var3.field3684;
                this.field2177 = var3.field3687;
                this.field2144 = var3.field3685;
                this.method1035();
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)I", line = 1234)
    public final int method1043(int arg0) {
        return super.field4588.method938(28923, arg0).field6160 & 65535;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;)V", line = 1237)
    public class146(int arg0, Canvas arg1, class127 arg2) {
        this(arg0, arg2);
        this.method539(arg1);
        this.method507(arg1);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 1242)
    public final void method504(int arg0) {
        if (this.field2174 != arg0) {
            this.field2174 = arg0;
            this.field2176 = new class112[this.field2174];
            for (int var2 = 0; var2 < this.field2174; ++var2) {
                this.field2176[var2] = new class112(this);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V", line = 1258)
    public final void method597(boolean arg0) {
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1262)
    public final void method539(Canvas arg0) {
        class244 var2 = (class244) this.field2137.method358((byte) 36, (long) arg0.hashCode());
        if (var2 == null) {
            class244 var3 = class438.method2712(arg0, 0);
            this.field2137.method357(var3, 1, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V", line = 1272)
    public final void method594(int arg0) {
        int var2 = arg0 - this.field2135;
        for (Object var3 = this.field2163.method1639(0); var3 != null; var3 = this.field2163.method1628(true)) {
            class140 var4 = (class140) var3;
            if (var4.field2098) {
                var4.field2101 += var2;
                int var5 = var4.field2101 / 20;
                if (var5 > 0) {
                    class420 var6 = super.field4588.method938(28923, var4.field2099);
                    var4.method1016(var6.field6166 * var2 * 50 / 1000, var6.field6154 * var2 * 50 / 1000);
                    var4.field2101 -= var5 * 20;
                }
                var4.field2098 = false;
            }
        }
        this.field2135 = arg0;
        this.field2145.method1631(5, (byte) -19);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIF)Lrd;", line = 1312)
    public final class344 method569(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "(I)Z", line = 1315)
    public final boolean method1044(int arg0) {
        return super.field4588.method936(arg0, (byte) -119);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 1318)
    public final void method525(int arg0) {
        this.field2176[arg0].method864((Runnable) null, (byte) -120);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lfe;IIII)Le;", line = 1322)
    public final class289 method554(class153 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class72(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "(III)V", line = 1325)
    public final void method534(int arg0, int arg1, int arg2) {
        this.field2140 = arg0 & 16777215;
        int var4 = this.field2140 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field2140 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field2140 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field2140 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field2160 = false;
        } else {
            this.field2160 = true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "ra", descriptor = "(ILta;II)V", line = 1351)
    public final void method604(int arg0, class340 arg1, int arg2, int arg3) {
        class176 var5 = (class176) arg1;
        int[] var6 = var5.field2706;
        int[] var7 = var5.field2709;
        int var8;
        if (this.field2143 < var6.length + arg3) {
            var8 = this.field2143 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2147 > arg3) {
            var9 = this.field2147 - arg3;
            arg3 = this.field2147;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2177 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2162 > var12) {
                    var13 -= this.field2162 - var12;
                    var12 = this.field2162;
                }
                if (this.field2156 < var12 + var13) {
                    var13 = this.field2156 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2142[var14++] = arg0;
                }
                var10 += this.field2177;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[Lrd;)V", line = 1407)
    public final void method519(int arg0, class344[] arg1) {
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lbn;)V", line = 1409)
    public final void method526(class307 arg0) {
    }

    @OriginalMember(owner = "client!qf", name = "GA", descriptor = "(IIII)V", line = 1412)
    public final void method541(int arg0, int arg1, int arg2, int arg3) {
        this.field2149 = arg0;
        this.field2141 = arg1;
        this.field2172 = arg2;
        this.field2166 = arg3;
        this.method1037();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1419)
    public final void method501(Rectangle[] arg0, int arg1) {
        if (this.field2138 != null && this.field2139 != null) {
            try {
                Graphics var3 = this.field2138.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2177 && var5.y <= this.field2144 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2139.method381(var5.y, var5.x, var3, false, var5.width, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field2138.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "()Z", line = 1448)
    public final boolean method570() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "MA", descriptor = "([I)V", line = 1451)
    public final void method545(int[] arg0) {
        arg0[0] = this.field2162;
        arg0[1] = this.field2147;
        arg0[2] = this.field2156;
        arg0[3] = this.field2143;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(FFF)V", line = 1456)
    public final void method517(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "()V", line = 1458)
    public final void method503() {
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 1461)
    public final class11 method540(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class113(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "()Z", line = 1464)
    public final boolean method522() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "()I", line = 1467)
    public final int method547() {
        return this.field2155;
    }

    @OriginalMember(owner = "client!qf", name = "IA", descriptor = "(IIIII)V", line = 1470)
    public final void method548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2162 && arg0 < this.field2156) {
            if (arg1 < this.field2147) {
                arg2 -= this.field2147 - arg1;
                arg1 = this.field2147;
            }
            if (arg1 + arg2 > this.field2143) {
                arg2 = this.field2143 - arg1;
            }
            int var6 = this.field2177 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2177 * var10 + var6;
                        int var12 = this.field2142[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2142[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2177 * var14 + var6;
                        int var16 = this.field2142[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2142[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2142[this.field2177 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "()I", line = 1546)
    public final int method572() {
        return 0;
    }

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "()F", line = 1549)
    public final float method498() {
        return this.field2165;
    }

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "()Z", line = 1552)
    public final boolean method560() {
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "(IIII)V", line = 1555)
    public final void method511(int arg0, int arg1, int arg2, int arg3) {
        this.field2180 = this.field2140;
        this.field2152 = arg0;
        this.field2140 = arg1;
        this.field2158 = arg2;
        this.field2179 = true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lap;[Lrr;Z)Lla;", line = 1564)
    public final class310 method542(class29 arg0, class309[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4713;
            var5[var7] = arg1[var7].field4717;
            if (arg1[var7].field4715 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class273(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class418(this, arg0, arg1, var4, var5);
        } else {
            return new class219(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[I[I)Lta;", line = 1593)
    public final class340 method516(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class176(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "()Z", line = 1596)
    public final boolean method563() {
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V", line = 1600)
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method566(arg0, arg1, arg2, arg4, arg5);
        this.method566(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method548(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method548(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V", line = 1605)
    public final void method523(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qf", name = "sa", descriptor = "(IIII)[I", line = 1609)
    public final int[] method587(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2177 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2142[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "(I)V", line = 1634)
    public final void method567(int arg0) {
        this.method506(0, 0, this.field2177, this.field2144, arg0, 0);
    }

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "()V", line = 1636)
    public final void method527() {
    }

    @OriginalMember(owner = "client!qf", name = "VA", descriptor = "(IIIIII)Z", line = 1640)
    public final boolean method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field2154.field7706 * arg2 + this.field2154.field7712 * arg0 + this.field2154.field7710 * arg1 >> 15) + this.field2154.field7704;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field2154.field7706 * arg5 + this.field2154.field7712 * arg3 + this.field2154.field7710 * arg4 >> 15) + this.field2154.field7704;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field2178 || var8 >= this.field2178) && (var7 <= this.field2155 || var8 <= this.field2155)) {
            int var9 = ((this.field2154.field7708 * arg2 + this.field2154.field7711 * arg1 + this.field2154.field7705 * arg0 >> 15) + this.field2154.field7707) * this.field2172 / var7;
            int var10 = ((this.field2154.field7708 * arg5 + this.field2154.field7711 * arg4 + this.field2154.field7705 * arg3 >> 15) + this.field2154.field7707) * this.field2172 / var8;
            if (var9 < this.field2181 && var10 < this.field2181 || var9 > this.field2175 && var10 > this.field2175) {
                return false;
            } else {
                int var11 = ((this.field2154.field7701 * arg2 + this.field2154.field7703 * arg1 + this.field2154.field7702 * arg0 >> 15) + this.field2154.field7709) * this.field2166 / var7;
                int var12 = ((this.field2154.field7701 * arg5 + this.field2154.field7703 * arg4 + this.field2154.field7702 * arg3 >> 15) + this.field2154.field7709) * this.field2166 / var8;
                return (var11 >= this.field2159 || var12 >= this.field2159) && (var11 <= this.field2151 || var12 <= this.field2151);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIILta;II)V", line = 1670)
    public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class340 arg6, int arg7, int arg8) {
        class176 var10 = (class176) arg6;
        int[] var11 = var10.field2706;
        int[] var12 = var10.field2709;
        int var13 = this.field2147 > arg8 ? this.field2147 : arg8;
        int var14 = this.field2143 < var11.length + arg8 ? this.field2143 : var11.length + arg8;
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
            if (arg0 < this.field2162) {
                var18 += (this.field2162 - arg0) * var20;
                arg0 = this.field2162;
            }
            if (var21 >= this.field2156) {
                var21 = this.field2156 - 1;
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
                                int var28 = this.field2177 * var25 + arg0;
                                int var29 = this.field2142[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2142[var28] = var23 + var30;
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
                                int var34 = this.field2177 * var31 + arg0;
                                int var35 = this.field2142[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2142[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2142[this.field2177 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2162 && var64 < this.field2156 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2142[this.field2177 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2162 && var50 < this.field2156 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2177 * arg1 + var50;
                        int var54 = this.field2142[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2142[this.field2177 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2162 && var56 < this.field2156 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2177 * arg1 + var56;
                        int var60 = this.field2142[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2142[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvm;)V", line = 1909)
    public final void method588(class320 arg0) {
        class354 var2 = arg0.field4847.field3169;
        for (class354 var3 = var2.field5238; var2 != var3; var3 = var3.field5238) {
            class471 var4 = (class471) var3;
            int var5 = var4.field6911 >> 12;
            int var6 = var4.field6919 >> 12;
            int var7 = var4.field6920 >> 12;
            int var8 = (this.field2154.field7706 * var7 + this.field2154.field7712 * var5 + this.field2154.field7710 * var6 >> 15) + this.field2154.field7704;
            if (var8 >= this.field2178 && var8 <= this.field2164) {
                int var9 = ((this.field2154.field7708 * var7 + this.field2154.field7711 * var6 + this.field2154.field7705 * var5 >> 15) + this.field2154.field7707) * this.field2172 / var8 + this.field2149;
                int var10 = ((this.field2154.field7701 * var7 + this.field2154.field7703 * var6 + this.field2154.field7702 * var5 >> 15) + this.field2154.field7709) * this.field2166 / var8 + this.field2141;
                if (var9 >= this.field2162 && var9 <= this.field2156 && var10 >= this.field2147 && var10 <= this.field2143) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1039(var4, var9, var10, (this.field2172 * var4.field6910 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "AA", descriptor = "()I", line = 1945)
    public final int method537() {
        return this.field2178;
    }

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "()Z", line = 1948)
    public final boolean method581() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "()Z", line = 1951)
    public final boolean method562() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "()I", line = 1957)
    public final int method513() {
        int var1 = this.field2173;
        this.field2173 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZ)Lo;", line = 1963)
    public final class363 method601(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2177 * arg1 + arg0;
        int var8 = this.field2177 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2142[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class257(this, var6, arg2, arg3);
        } else {
            return new class189(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1995)
    public final void method536(Canvas arg0) {
        if (this.field2138 == arg0) {
            this.method507((Canvas) null);
        }
        class244 var2 = (class244) this.field2137.method358((byte) 87, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method947((byte) 102);
        }
    }

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "()V", line = 2004)
    public final void method593() {
    }

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "()Z", line = 2007)
    public final boolean method568() {
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "OA", descriptor = "()I", line = 2011)
    public final int method590() {
        int var1 = this.field2171;
        this.field2171 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "()Z", line = 2016)
    public final boolean method521() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([Le;Lvm;Lc;[Lwg;I)V", line = 2020)
    public final void method531(class289[] arg0, class320 arg1, class517 arg2, class41[] arg3, int arg4) {
        class72[] var6 = new class72[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class72) arg0[var7];
            }
        }
        class72 var8 = class72.method626(this, var6);
        var8.method663(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "()Z", line = 2036)
    public final boolean method508() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "(I)Z", line = 2039)
    public final boolean method1045(int arg0) {
        return super.field4588.method938(28923, arg0).field6175;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)V", line = 2042)
    public final void method514(int arg0, int arg1) {
        this.field2178 = arg0;
        this.field2155 = arg1;
        this.field2164 = this.field2155 - 255;
        this.method1040();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIII)V", line = 2049)
    public final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class112 var11 = this.method1038(Thread.currentThread());
        class233 var12 = var11.field1675;
        var12.field3503 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field3503 = false;
            var12.field3505 = 0;
            var12.field3496 = true;
            var12.method1574(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field3503 = false;
            var12.field3505 = 255 - var13;
            var12.field3496 = true;
            var12.method1574(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field3503 = true;
    }

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "(I)Z", line = 2085)
    public final boolean method1046(int arg0) {
        return this.field2153 || super.field4588.method938(28923, arg0).field6170;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lbn;Lbn;FLbn;)Lbn;", line = 2092)
    public final class307 method550(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "()Z", line = 2098)
    public final boolean method544() {
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V", line = 2100)
    public final void method509(boolean arg0) {
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I", line = 2103)
    public final int method557(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qf", name = "pa", descriptor = "()I", line = 2106)
    public final int method543() {
        return 0;
    }

    @OriginalMember(owner = "client!qf", name = "ZA", descriptor = "(IIIII)V", line = 2109)
    public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2147) {
            var6 = this.field2147;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2143) {
            var7 = this.field2143;
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
                if (var64 < this.field2162) {
                    var64 = this.field2162;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2156) {
                    var65 = this.field2156;
                }
                int var66 = this.field2177 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2142[var66++] = arg3;
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
                if (var60 < this.field2162) {
                    var60 = this.field2162;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2156 - 1) {
                    var61 = this.field2156 - 1;
                }
                int var62 = this.field2177 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2142[var62++] = arg3;
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
                if (var28 < this.field2162) {
                    var28 = this.field2162;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2156) {
                    var29 = this.field2156;
                }
                int var30 = this.field2177 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2142[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2142[var30++] = var15 + var33;
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
                if (var22 < this.field2162) {
                    var22 = this.field2162;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2156 - 1) {
                    var23 = this.field2156 - 1;
                }
                int var24 = this.field2177 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2142[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2142[var24++] = var15 + var27;
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
                if (var47 < this.field2162) {
                    var47 = this.field2162;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2156) {
                    var48 = this.field2156;
                }
                int var49 = this.field2177 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2142[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2142[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2162) {
                    var39 = this.field2162;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2156 - 1) {
                    var40 = this.field2156 - 1;
                }
                int var41 = this.field2177 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2142[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2142[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I", line = 2396)
    public final int method589(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ln;)V", line = 2399)
    public final void method535(class393 arg0) {
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2402)
    public final void method507(Canvas arg0) {
        if (arg0 != null) {
            class244 var2 = (class244) this.field2137.method358((byte) 41, (long) arg0.hashCode());
            if (var2 != null) {
                this.field2138 = arg0;
                this.field2139 = var2;
                if (this.field2169 == null) {
                    this.field2142 = var2.field3684;
                    this.field2177 = var2.field3687;
                    this.field2144 = var2.field3685;
                    this.method1035();
                    return;
                }
            }
        } else {
            this.field2138 = null;
            this.field2139 = null;
            if (this.field2169 == null) {
                this.field2142 = null;
                this.field2177 = this.field2144 = 1;
                this.method1035();
            }
        }
    }
}
