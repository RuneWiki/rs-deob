import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class154 extends class174 {

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    private int field2161 = 0;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public int field2175 = 50;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public int field2165 = 0;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public int field2171 = 45823;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Z")
    private boolean field2189 = false;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    private int field2177 = 0;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public int field2181 = 75518;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    private int field2185 = 0;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public int field2178 = 512;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public int field2158 = 0;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public int field2191 = 0;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public int field2186 = 0;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public int field2182 = 0;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public int field2195 = 512;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public int field2179 = 0;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field2159 = 3500;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Z")
    private boolean field2176 = false;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
    public int field2202 = 78642;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "Z")
    private boolean field2188 = false;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
    public int field2201 = 0;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    private int field2198 = 3500;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
    public int field2200 = this.field2198 - 255;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "Z")
    public boolean field2199 = false;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "Lfi;")
    private class331 field2193 = new class331(16);

    @OriginalMember(owner = "client!s", name = "O", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2180;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "Lbm;")
    public class60 field2187;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Lfk;")
    private class392 field2192;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "[I")
    public int[] field2166;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "F")
    private float field2174;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "F")
    private float field2183;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    private int field2194;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lkp;")
    public class284 field2170;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "Lod;")
    private class294 field2203;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "Lfi;")
    private class331 field2167;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
    public boolean field2156;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "[Los;")
    private class256[] field2157;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbg;)V")
    public final void method921(class271 arg0) {
        class87 var2 = arg0.field3845.field5888;
        for (class87 var3 = var2.field975; var2 != var3; var3 = var3.field975) {
            class128 var4 = (class128) var3;
            int var5 = var4.field1789 >> 12;
            int var6 = var4.field1792 >> 12;
            int var7 = var4.field1786 >> 12;
            int var8 = (this.field2170.field3984 * var7 + this.field2170.field3986 * var5 + this.field2170.field3985 * var6 >> 15) + this.field2170.field3975;
            if (var8 >= this.field2175 && var8 <= this.field2198) {
                int var9 = ((this.field2170.field3983 * var7 + this.field2170.field3980 * var6 + this.field2170.field3976 * var5 >> 15) + this.field2170.field3977) * this.field2195 / var8 + this.field2190;
                int var10 = ((this.field2170.field3979 * var7 + this.field2170.field3982 * var5 + this.field2170.field3981 * var6 >> 15) + this.field2170.field3978) * this.field2178 / var8 + this.field2173;
                if (var9 >= this.field2191 && var9 <= this.field2165 && var10 >= this.field2179 && var10 <= this.field2182) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method965(var4, var9, var10, (var4.field1794 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "()Lvr;")
    public final class71 method922() {
        return new class284();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()Z")
    public final boolean method923() {
        return this.field2176;
    }

    @OriginalMember(owner = "client!s", name = "B", descriptor = "()V")
    public final void method924() {
        this.field2186 = this.field2177;
        this.field2199 = false;
    }

    @OriginalMember(owner = "client!s", name = "x", descriptor = "()Z")
    public final boolean method925() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[Lvg;)V")
    public final void method926(int arg0, class33[] arg1) {
    }

    @OriginalMember(owner = "client!s", name = "F", descriptor = "()Z")
    public final boolean method927() {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        this.field2158 = arg0;
        this.field2186 = arg1;
        this.field2201 = arg2;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public final void method929(int arg0) {
        this.method995(0, 0, this.field2163, this.field2168, arg0, 0);
    }

    @OriginalMember(owner = "client!s", name = "G", descriptor = "()V")
    public final void method930() {
    }

    @OriginalMember(owner = "client!s", name = "A", descriptor = "()Z")
    public final boolean method931() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIII)[I")
    public final int[] method932(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2163 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2166[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public final void method933(int arg0, int arg1) {
        this.field2186 = arg0 & 16777215;
        int var3 = this.field2186 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field2186 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field2186 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field2186 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field2156 = false;
        } else {
            this.field2156 = true;
        }
    }

    @OriginalMember(owner = "client!s", name = "C", descriptor = "()V")
    public final void method934() {
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "()Z")
    public final boolean method935() {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "k", descriptor = "()F")
    public final float method936() {
        return this.field2183;
    }

    @OriginalMember(owner = "client!s", name = "t", descriptor = "()Z")
    public final boolean method937() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()V")
    private final void method938() {
        this.field2197 = this.field2191 - this.field2190;
        this.field2160 = this.field2165 - this.field2190;
        this.field2184 = this.field2179 - this.field2173;
        this.field2196 = this.field2182 - this.field2173;
        for (int var1 = 0; var1 < this.field2164; ++var1) {
            class445 var5 = this.field2157[var1].field3436;
            var5.field6502 = this.field2190 - this.field2191;
            var5.field6496 = this.field2173 - this.field2179;
            var5.field6497 = this.field2165 - this.field2191;
            var5.field6505 = this.field2182 - this.field2179;
        }
        int var2 = this.field2179 * this.field2163 + this.field2191;
        for (int var3 = this.field2179; var3 < this.field2182; ++var3) {
            for (int var4 = 0; var4 < this.field2164; ++var4) {
                this.field2157[var4].field3436.field6501[var3 - this.field2179] = var2;
            }
            var2 += this.field2163;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2163 * arg1 + arg0;
            int var15 = this.field2163 - arg2;
            if (arg1 + arg3 > this.field2182) {
                arg3 -= arg1 + arg3 - this.field2182;
            }
            if (arg1 < this.field2179) {
                int var16 = this.field2179 - arg1;
                arg3 -= var16;
                var14 += this.field2163 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2165) {
                int var17 = arg0 + arg2 - this.field2165;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2191) {
                int var18 = this.field2191 - arg0;
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
                            int var28 = this.field2166[var14];
                            this.field2166[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2166[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2166[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2166[var14++] = arg5;
                        } else {
                            this.field2166[var14++] = arg4;
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

    @OriginalMember(owner = "client!s", name = "v", descriptor = "()Z")
    public final boolean method940() {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[[I[[IIII)Lac;")
    public final class319 method941(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class328(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!s", name = "s", descriptor = "()V")
    public final void method942() {
        if (this.field2188) {
            class235.method1497(true, true, false);
            this.field2188 = false;
        }
        this.field2180 = null;
        this.field2187 = null;
        this.field2192 = null;
        this.field2176 = true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Lmj;Lbg;Lvr;[Lue;I)V")
    public final void method943(class393[] arg0, class271 arg1, class71 arg2, class127[] arg3, int arg4) {
        class126[] var6 = new class126[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class126) arg0[var7];
            }
        }
        class126 var8 = class126.method739(this, var6);
        var8.method776(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public final void method944(boolean arg0) {
        this.field2189 = arg0;
        this.field2167.method2043(-111);
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(Z)V")
    public final void method945(boolean arg0) {
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        return this.field2189 || this.field2187.method371(arg0, (byte) 96).field4442;
    }

    @OriginalMember(owner = "client!s", name = "n", descriptor = "()V")
    public final void method947() {
        this.field2167.method2043(-26);
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(IIII)V")
    public final void method948(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lvr;)V")
    public final void method949(class71 arg0) {
        this.field2170 = (class284) arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method950(Canvas arg0) {
        this.field2180 = arg0;
        this.method1006();
    }

    @OriginalMember(owner = "client!s", name = "o", descriptor = "()Z")
    public final boolean method951() {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public final void method952(int arg0) {
        if (this.field2164 != arg0) {
            this.field2164 = arg0;
            this.field2157 = new class256[this.field2164];
            for (int var2 = 0; var2 < this.field2164; ++var2) {
                this.field2157[var2] = new class256(this);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII)V")
    public final void method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class256 var8 = this.method976(Thread.currentThread());
        class445 var9 = var8.field3436;
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
            int var21 = arg0 - var9.method2763();
            int var22 = arg1 - var9.method2755();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field6506 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6506 = 255 - (arg4 >> 24);
            }
            var9.field6504 = var23 < 0 || var23 > var9.field6497 || var24 < 0 || var24 > var9.field6497 || var25 < 0 || var25 > var9.field6497;
            var9.method2767(var27, var28, var29, var23, var24, var25, arg4);
            var9.field6504 = var23 < 0 || var23 > var9.field6497 || var24 < 0 || var24 > var9.field6497 || var26 < 0 || var26 > var9.field6497;
            var9.method2767(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!s", name = "z", descriptor = "()I")
    public final int method954() {
        int var1 = this.field2185;
        this.field2185 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lcl;Z)Lkh;")
    public final class11 method955(class145 arg0, boolean arg1) {
        int[] var3 = arg0.field2044;
        byte[] var4 = arg0.field2045;
        int var5 = arg0.field2043;
        int var6 = arg0.field2038;
        class285 var11;
        if (arg1 && arg0.field2042 == null) {
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
            var11 = new class9(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2042;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class129(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class129(this, var14, var5, var6);
                var11 = new class381(this, var14, var5, var6);
            }
        }
        var11.method44(arg0.field2041, arg0.field2046, arg0.field2040, arg0.field2039);
        return var11;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V")
    public final void method956(boolean arg0) {
    }

    @OriginalMember(owner = "client!s", name = "l", descriptor = "()V")
    public final void method957() {
        this.field2191 = 0;
        this.field2179 = 0;
        this.field2165 = this.field2163;
        this.field2182 = this.field2168;
        this.method938();
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(IIIIII)V")
    public final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method972(arg0, arg1, arg2, arg4, arg5);
        this.method972(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method990(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method990(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!s", name = "H", descriptor = "()I")
    public final int method959() {
        return this.field2198;
    }

    @OriginalMember(owner = "client!s", name = "q", descriptor = "()Z")
    public final boolean method960() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public final void method961(int arg0, int arg1, int arg2) {
        this.field2177 = this.field2186;
        this.field2158 = arg0;
        this.field2186 = arg1;
        this.field2201 = arg2;
        this.field2199 = true;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIIII)V")
    public final void method962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2179) {
            var6 = this.field2179;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2182) {
            var7 = this.field2182;
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
                if (var64 < this.field2191) {
                    var64 = this.field2191;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2165) {
                    var65 = this.field2165;
                }
                int var66 = this.field2163 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2166[var66++] = arg3;
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
                if (var60 < this.field2191) {
                    var60 = this.field2191;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2165 - 1) {
                    var61 = this.field2165 - 1;
                }
                int var62 = this.field2163 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2166[var62++] = arg3;
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
                if (var28 < this.field2191) {
                    var28 = this.field2191;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2165) {
                    var29 = this.field2165;
                }
                int var30 = this.field2163 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2166[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2166[var30++] = var15 + var33;
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
                if (var22 < this.field2191) {
                    var22 = this.field2191;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2165 - 1) {
                    var23 = this.field2165 - 1;
                }
                int var24 = this.field2163 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2166[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2166[var24++] = var15 + var27;
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
                if (var47 < this.field2191) {
                    var47 = this.field2191;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2165) {
                    var48 = this.field2165;
                }
                int var49 = this.field2163 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2166[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2166[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2191) {
                    var39 = this.field2191;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2165 - 1) {
                    var40 = this.field2165 - 1;
                }
                int var41 = this.field2163 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2166[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2166[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "w", descriptor = "()Z")
    public final boolean method963() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmj;Lbg;Lvr;Lue;I)V")
    public final void method964(class393 arg0, class271 arg1, class71 arg2, class127 arg3, int arg4) {
        ((class126) arg0).method776(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lfa;III)V")
    public final void method965(class128 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field1788;
        if (var6 == -1) {
            this.method962(arg1, arg2, var5, arg0.field1795, 1);
        } else {
            if (this.field2203 == null || (long) var6 != this.field2203.field5248) {
                this.field2203 = (class294) this.field2193.method2049(-70, (long) var6);
            }
            if (this.field2203 == null) {
                int[] var7 = this.method1005(var6);
                if (var7 == null) {
                    return;
                }
                this.field2203 = new class294();
                this.field2203.field4214 = this.method946(var6);
                int var8 = this.field2203.field4214 ? 64 : 128;
                this.field2203.field4212 = this.method1008(var7, 0, var8, var8, var8);
                this.field2193.method2046((long) var6, 0, this.field2203);
            }
            if (this.field2203.field4214) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field2203.field4212.method46(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field1795, 1);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lnm;[Lcl;Z)Ltc;")
    public final class196 method966(class277 arg0, class145[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2043;
            var5[var7] = arg1[var7].field2038;
            if (arg1[var7].field2042 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class44(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class208(this, arg0, arg1, var4, var5);
        } else {
            return new class161(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)I")
    public final int method967(int arg0) {
        return this.field2187.method371(arg0, (byte) 96).field4451 & 65535;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
    public final void method968(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2163) {
            arg2 = this.field2163;
        }
        if (arg3 > this.field2168) {
            arg3 = this.field2168;
        }
        this.field2191 = arg0;
        this.field2165 = arg2;
        this.field2179 = arg1;
        this.field2182 = arg3;
        this.method938();
    }

    @OriginalMember(owner = "client!s", name = "E", descriptor = "()Z")
    public final boolean method969() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "K", descriptor = "()V")
    public final void method970() {
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(IIII)V")
    public final void method971(int arg0, int arg1, int arg2, int arg3) {
        this.field2190 = arg0;
        this.field2173 = arg1;
        this.field2195 = arg2;
        this.field2178 = arg3;
        this.method938();
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(IIIII)V")
    public final void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2179 && arg1 < this.field2182) {
            if (arg0 < this.field2191) {
                arg2 -= this.field2191 - arg0;
                arg0 = this.field2191;
            }
            if (arg0 + arg2 > this.field2165) {
                arg2 = this.field2165 - arg0;
            }
            int var6 = this.field2163 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2166[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2166[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2166[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2166[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2166[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIIIII)V")
    public final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method972(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method972(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method990(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method990(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2191) {
                    var10 += (this.field2191 - arg0) * var12;
                    arg0 = this.field2191;
                }
                if (var13 >= this.field2165) {
                    var13 = this.field2165 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2179 && var17 < this.field2182) {
                                int var18 = this.field2163 * var17 + arg0;
                                int var19 = this.field2166[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2166[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2179 && var21 < this.field2182) {
                                int var22 = this.field2163 * var21 + arg0;
                                int var23 = this.field2166[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2166[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2179 && var27 < this.field2182) {
                            this.field2166[this.field2163 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2179) {
                    var29 += (this.field2179 - arg1) * var31;
                    arg1 = this.field2179;
                }
                if (var32 >= this.field2182) {
                    var32 = this.field2182 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2191 && var46 < this.field2165) {
                            this.field2166[this.field2163 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2191 && var36 < this.field2165) {
                            int var37 = this.field2163 * arg1 + var36;
                            int var38 = this.field2166[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2166[this.field2163 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2191 && var40 < this.field2165) {
                            int var41 = this.field2163 * arg1 + var40;
                            int var42 = this.field2166[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2166[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!s", name = "j", descriptor = "()Z")
    public final boolean method974() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "p", descriptor = "()Z")
    public final boolean method975() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/Runnable;)Los;")
    public final class256 method976(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2164; ++var2) {
            if (this.field2157[var2].field3432 == arg0) {
                return this.field2157[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!s", name = "J", descriptor = "()V")
    public final void method977() {
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method978(Rectangle[] arg0, int arg1) {
        if (this.field2180 != null && this.field2192 != null) {
            try {
                Graphics var3 = this.field2180.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2163 && var5.y <= this.field2168 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2192.method1958(var5.x, var5.height, var5.width, var3, var5.y, 128);
                    }
                }
            } catch (Exception var6) {
                this.field2180.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "()Z")
    public final boolean method979() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILhm;II)V")
    public final void method980(int arg0, class121 arg1, int arg2, int arg3) {
        class295 var5 = (class295) arg1;
        int[] var6 = var5.field4221;
        int[] var7 = var5.field4222;
        int var8;
        if (this.field2182 < var6.length + arg3) {
            var8 = this.field2182 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2179 > arg3) {
            var9 = this.field2179 - arg3;
            arg3 = this.field2179;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2163 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2191 > var12) {
                    var13 -= this.field2191 - var12;
                    var12 = this.field2191;
                }
                if (this.field2165 < var12 + var13) {
                    var13 = this.field2165 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2166[var14++] = arg0;
                }
                var10 += this.field2163;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(IIIIII)Lbd;")
    public final class38 method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIILhm;II)V")
    public final void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class121 arg6, int arg7, int arg8) {
        class295 var10 = (class295) arg6;
        int[] var11 = var10.field4221;
        int[] var12 = var10.field4222;
        int var13 = this.field2179 > arg8 ? this.field2179 : arg8;
        int var14 = this.field2182 < var11.length + arg8 ? this.field2182 : var11.length + arg8;
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
            if (arg0 < this.field2191) {
                var18 += (this.field2191 - arg0) * var20;
                arg0 = this.field2191;
            }
            if (var21 >= this.field2165) {
                var21 = this.field2165 - 1;
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
                                int var28 = this.field2163 * var25 + arg0;
                                int var29 = this.field2166[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2166[var28] = var23 + var30;
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
                                int var34 = this.field2163 * var31 + arg0;
                                int var35 = this.field2166[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2166[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2166[this.field2163 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2191 && var64 < this.field2165 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2166[this.field2163 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2191 && var50 < this.field2165 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2163 * arg1 + var50;
                        int var54 = this.field2166[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2166[this.field2163 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2191 && var56 < this.field2165 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2163 * arg1 + var56;
                        int var60 = this.field2166[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2166[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIZ)Lkh;")
    public final class11 method983(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2163 * arg1 + arg0;
        int var8 = this.field2163 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2166[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class129(this, var6, arg2, arg3);
        } else {
            return new class381(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Lmj;Lvr;[Lue;I)V")
    public final void method984(class393[] arg0, class71 arg1, class127[] arg2, int arg3) {
        class126[] var5 = new class126[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class126) arg0[var6];
            }
        }
        class126 var7 = class126.method739(this, var5);
        var7.method776(arg1, arg2 != null ? arg2[0] : null, (class271) null, arg3);
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public final void method985(int arg0) {
        this.field2157[arg0].method1599(Thread.currentThread(), (byte) 118);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()V")
    private final void method986() {
        if (this.field2174 != 0.0F) {
            float var1 = (float) this.field2198;
            float var2 = (float) this.field2175;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field2183 / (this.field2183 + this.field2174);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field2174;
            this.field2159 = (int) (((float) this.field2198 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field2159 = this.field2198;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FFF)V")
    public final void method987(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!s", name = "r", descriptor = "()Z")
    public final boolean method988() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "I", descriptor = "()I")
    public final int method989() {
        return 0;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(IIIII)V")
    public final void method990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2191 && arg0 < this.field2165) {
            if (arg1 < this.field2179) {
                arg2 -= this.field2179 - arg1;
                arg1 = this.field2179;
            }
            if (arg1 + arg2 > this.field2182) {
                arg2 = this.field2182 - arg1;
            }
            int var6 = this.field2163 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2163 * var10 + var6;
                        int var12 = this.field2166[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2166[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2163 * var14 + var6;
                        int var16 = this.field2166[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2166[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2166[this.field2163 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Loq;IIII)Lmj;")
    public final class393 method991(class200 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class126(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!s", name = "u", descriptor = "()I")
    public final int method992() {
        return this.field2175;
    }

    @OriginalMember(owner = "client!s", name = "M", descriptor = "()V")
    private final void method993() {
        this.field2167 = new class331(20);
        this.field2170 = new class284();
        class390.method2495(true, false, false);
        this.field2188 = true;
        this.method952(1);
        this.method985(0);
        this.method957();
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "()I")
    public final int method994() {
        return 0;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(IIIIII)V")
    public final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2191) {
            arg2 -= this.field2191 - arg0;
            arg0 = this.field2191;
        }
        if (arg1 < this.field2179) {
            arg3 -= this.field2179 - arg1;
            arg1 = this.field2179;
        }
        if (arg0 + arg2 > this.field2165) {
            arg2 = this.field2165 - arg0;
        }
        if (arg1 + arg3 > this.field2182) {
            arg3 = this.field2182 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2165 && arg1 <= this.field2182) {
            int var7 = this.field2163 - arg2;
            int var8 = this.field2163 * arg1 + arg0;
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
                            this.field2166[var24] = arg4;
                            ++var24;
                            this.field2166[var24] = arg4;
                            ++var24;
                            this.field2166[var24] = arg4;
                            ++var24;
                            this.field2166[var24] = arg4;
                            ++var24;
                            this.field2166[var24] = arg4;
                            ++var24;
                            this.field2166[var24] = arg4;
                            ++var24;
                            this.field2166[var24] = arg4;
                            ++var24;
                            this.field2166[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2166[var24] = arg4;
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
                        int var14 = this.field2166[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field2166[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2166[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2166[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "D", descriptor = "()Z")
    public final boolean method996() {
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lfn;)V")
    public final void method997(class73 arg0) {
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public final void method998(int arg0) {
        this.field2157[arg0].method1599((Runnable) null, (byte) 102);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(F)V")
    public final void method999(float arg0) {
        this.field2181 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!s", name = "j", descriptor = "(I)[I")
    public final int[] method1000(int arg0) {
        class331 var2 = this.field2167;
        class69 var3;
        synchronized (this.field2167) {
            var3 = (class69) this.field2167.method2049(-57, (long) arg0);
            if (var3 == null) {
                if (!this.field2187.method369(arg0, (byte) -100)) {
                    return null;
                }
                class311 var5 = this.field2187.method371(arg0, (byte) 96);
                int var6 = !var5.field4442 && !this.field2189 ? 128 : 64;
                var3 = new class69(arg0, var6, this.field2187.method373(var6, arg0, 0.7F, var6, 8125, true), var5.field4453);
                this.field2167.method2046((long) arg0, 0, var3);
            }
        }
        var3.field780 = true;
        return var3.method407();
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)Lfn;")
    public final class73 method1001(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbd;Lbd;FLbd;)Lbd;")
    public final class38 method1002(class38 arg0, class38 arg1, float arg2, class38 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I)Lhm;")
    public final class121 method1003(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class295(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([I)V")
    public final void method1004(int[] arg0) {
        arg0[0] = this.field2191;
        arg0[1] = this.field2179;
        arg0[2] = this.field2165;
        arg0[3] = this.field2182;
    }

    @OriginalMember(owner = "client!s", name = "k", descriptor = "(I)[I")
    private final int[] method1005(int arg0) {
        class331 var2 = this.field2167;
        class69 var3;
        synchronized (this.field2167) {
            var3 = (class69) this.field2167.method2049(-107, (long) arg0);
            if (var3 == null) {
                if (!this.field2187.method369(arg0, (byte) -100)) {
                    return null;
                }
                class311 var5 = this.field2187.method371(arg0, (byte) 96);
                int var6 = !var5.field4442 && !this.field2189 ? 128 : 64;
                var3 = new class69(arg0, var6, this.field2187.method372(var6, 86, true, arg0, 0.7F, var6), var5.field4453);
                this.field2167.method2046((long) arg0, 0, var3);
            }
        }
        var3.field780 = true;
        return var3.method407();
    }

    @OriginalMember(owner = "client!s", name = "L", descriptor = "()V")
    public final void method1006() {
        this.field2192 = class403.method2554(this.field2180, (byte) 126);
        this.field2166 = this.field2192.field5731;
        this.field2163 = this.field2192.field5732;
        this.field2168 = this.field2192.field5728;
        for (int var1 = 0; var1 < this.field2164; ++var1) {
            this.field2157[var1].method1601(-28749);
        }
        this.method957();
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public final void method1007(int arg0) {
        int var2 = arg0 - this.field2194;
        for (Object var3 = this.field2167.method2051(true); var3 != null; var3 = this.field2167.method2042(77)) {
            class69 var4 = (class69) var3;
            if (var4.field780) {
                var4.field778 += var2;
                int var5 = var4.field778 / 20;
                if (var5 > 0) {
                    class311 var6 = this.field2187.method371(var4.field781, (byte) 96);
                    var4.method408(var6.field4429 * var2 * 50 / 1000, var6.field4441 * var2 * 50 / 1000);
                    var4.field778 -= var5 * 20;
                }
                var4.field780 = false;
            }
        }
        this.field2194 = arg0;
        this.field2193.method2054(94, 5);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([IIIII)Lkh;")
    public final class11 method1008(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class129(this, arg0, arg1, arg2, arg3, arg4) : new class381(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class129(this, arg0, arg1, arg2, arg3, arg4) : new class381(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class256 var11 = this.method976(Thread.currentThread());
        class445 var12 = var11.field3436;
        var12.field6507 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field6507 = false;
            var12.field6506 = 0;
            var12.field6504 = true;
            var12.method2759(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field6507 = false;
            var12.field6506 = 255 - var13;
            var12.field6504 = true;
            var12.method2759(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field6507 = true;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(IIII)V")
    public final void method1010(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2191 < arg0) {
            this.field2191 = arg0;
        }
        if (this.field2179 < arg1) {
            this.field2179 = arg1;
        }
        if (this.field2165 > arg2) {
            this.field2165 = arg2;
        }
        if (this.field2182 > arg3) {
            this.field2182 = arg3;
        }
        this.method938();
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(II)V")
    public final void method1011(int arg0, int arg1) {
        this.field2175 = arg0;
        this.field2198 = arg1;
        this.field2200 = this.field2198 - 255;
        this.method986();
    }

    @OriginalMember(owner = "client!s", name = "l", descriptor = "(I)Z")
    public final boolean method1012(int arg0) {
        return this.field2187.method371(arg0, (byte) 96).field4450;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)I")
    public final int method1013(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!s", name = "m", descriptor = "(I)Z")
    public final boolean method1014(int arg0) {
        return this.field2187.method369(arg0, (byte) -100);
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "()Lvr;")
    public final class71 method1015() {
        class256 var1 = this.method976(Thread.currentThread());
        return var1.field3443;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
    public final int method1016(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FF)V")
    public final void method1017(float arg0, float arg1) {
        this.field2183 = arg0;
        this.field2174 = arg1;
        this.method986();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IFFFFF)V")
    public final void method1018(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2171 = (int) (arg1 * 65535.0F);
        this.field2202 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2162 = (int) (arg3 * 65535.0F / var7);
        this.field2169 = (int) (arg4 * 65535.0F / var7);
        this.field2172 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!s", name = "m", descriptor = "()F")
    public final float method1019() {
        return this.field2174;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[I)V")
    public final void method1020(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field2170.field3984 * arg2 + this.field2170.field3986 * arg0 + this.field2170.field3985 * arg1 >> 15) + this.field2170.field3975;
        if (var5 >= this.field2175 && var5 <= this.field2198) {
            int var6 = ((this.field2170.field3983 * arg2 + this.field2170.field3980 * arg1 + this.field2170.field3976 * arg0 >> 15) + this.field2170.field3977) * this.field2195 / var5;
            int var7 = ((this.field2170.field3979 * arg2 + this.field2170.field3982 * arg0 + this.field2170.field3981 * arg1 >> 15) + this.field2170.field3978) * this.field2178 / var5;
            if (var6 >= this.field2197 && var6 <= this.field2160 && var7 >= this.field2184 && var7 <= this.field2196) {
                arg3[0] = var6 - this.field2197;
                arg3[1] = var7 - this.field2184;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "()I")
    public final int method1021() {
        int var1 = this.field2161;
        this.field2161 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!s", name = "y", descriptor = "()V")
    public final void method1022() {
        if (this.field2180 != null && this.field2192 != null) {
            try {
                Graphics var1 = this.field2180.getGraphics();
                this.field2192.method1959(var1, 0, (byte) -62, 0);
            } catch (Exception var2) {
                this.field2180.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)Z")
    public final boolean method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field2170.field3984 * arg2 + this.field2170.field3986 * arg0 + this.field2170.field3985 * arg1 >> 15) + this.field2170.field3975;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field2170.field3984 * arg5 + this.field2170.field3986 * arg3 + this.field2170.field3985 * arg4 >> 15) + this.field2170.field3975;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field2175 || var8 >= this.field2175) && (var7 <= this.field2198 || var8 <= this.field2198)) {
            int var9 = ((this.field2170.field3983 * arg2 + this.field2170.field3980 * arg1 + this.field2170.field3976 * arg0 >> 15) + this.field2170.field3977) * this.field2195 / var7;
            int var10 = ((this.field2170.field3983 * arg5 + this.field2170.field3980 * arg4 + this.field2170.field3976 * arg3 >> 15) + this.field2170.field3977) * this.field2195 / var8;
            if (var9 < this.field2197 && var10 < this.field2197 || var9 > this.field2160 && var10 > this.field2160) {
                return false;
            } else {
                int var11 = ((this.field2170.field3979 * arg2 + this.field2170.field3982 * arg0 + this.field2170.field3981 * arg1 >> 15) + this.field2170.field3978) * this.field2178 / var7;
                int var12 = ((this.field2170.field3979 * arg5 + this.field2170.field3982 * arg3 + this.field2170.field3981 * arg4 >> 15) + this.field2170.field3978) * this.field2178 / var8;
                return (var11 >= this.field2184 || var12 >= this.field2184) && (var11 <= this.field2196 || var12 <= this.field2196);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbd;)V")
    public final void method1024(class38 arg0) {
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lbm;I)V")
    public class154(Canvas arg0, class60 arg1, int arg2) {
        this.field2180 = arg0;
        this.field2187 = arg1;
        super.field2424 = arg2;
        this.field2192 = class403.method2554(this.field2180, (byte) 114);
        this.field2166 = this.field2192.field5731;
        this.field2163 = this.field2192.field5732;
        this.field2168 = this.field2192.field5728;
        this.method993();
    }
}
