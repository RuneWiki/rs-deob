import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class195 extends class497 {

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
    private boolean field2904;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Z")
    private boolean field2905;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lru;")
    private class177 field2906;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Z")
    private boolean field2924;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Z")
    public boolean field2913;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    private int field2938;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    private int field2937;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    private int field2944;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Lof;")
    private class328 field2928;

    @OriginalMember(owner = "client!f", name = "mb", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "Lof;")
    private class328 field2932;

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "Laf;")
    public class26 field2951;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "F")
    private float field2923;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "F")
    private float field2946;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "Lo;")
    private class139 field2931;

    @OriginalMember(owner = "client!f", name = "lb", descriptor = "Lo;")
    private class139 field2952;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lkb;")
    private class343 field2908;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2909;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "Z")
    public boolean field2926;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "[I")
    public int[] field2940;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "[Lfu;")
    private class50[] field2920;

    @OriginalMember(owner = "client!f", name = "va", descriptor = "()V")
    public final void method1228() {
        this.field2914 = 0;
        this.field2919 = 0;
        this.field2942 = this.field2950;
        this.field2916 = this.field2930;
        this.method1336();
    }

    @OriginalMember(owner = "client!f", name = "p", descriptor = "()Z")
    public final boolean method1229() {
        return this.field2905;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1230(Canvas arg0) {
        if (arg0 != null) {
            class343 var2 = (class343) this.field2906.method1122((byte) 59, (long) arg0.hashCode());
            if (var2 != null) {
                this.field2909 = arg0;
                this.field2908 = var2;
                if (this.field2931 == null) {
                    this.field2940 = var2.field5347;
                    this.field2950 = var2.field5345;
                    this.field2930 = var2.field5346;
                    this.method1247();
                    return;
                }
            }
        } else {
            this.field2909 = null;
            this.field2908 = null;
            if (this.field2931 == null) {
                this.field2940 = null;
                this.field2950 = this.field2930 = 1;
                this.method1247();
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "m", descriptor = "()Lc;")
    public final class205 method1231() {
        class50 var1 = this.method1272(Thread.currentThread());
        return var1.field632;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([IIIII)Lo;")
    public final class139 method1232(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class265(this, arg0, arg1, arg2, arg3, arg4) : new class430(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class265(this, arg0, arg1, arg2, arg3, arg4) : new class430(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!f", name = "B", descriptor = "()Z")
    public final boolean method1233() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method1234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field7480.method1366(arg5, (byte) 102).field7269) {
                if (this.field2953 != arg5) {
                    class139 var10 = (class139) this.field2928.method2191((byte) -73, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method1320(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method1331(arg5) ? 64 : 128;
                        var10 = this.method1232(var11, 0, var12, var12, var12);
                        this.field2928.method2188(-123, (long) arg5, var10);
                    }
                    this.field2953 = arg5;
                    this.field2952 = var10;
                }
                this.field2952.method630(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method1235(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "ZA", descriptor = "(IIIII)V")
    public final void method1235(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2919) {
            var6 = this.field2919;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2916) {
            var7 = this.field2916;
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
                if (var64 < this.field2914) {
                    var64 = this.field2914;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2942) {
                    var65 = this.field2942;
                }
                int var66 = this.field2950 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2940[var66++] = arg3;
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
                if (var60 < this.field2914) {
                    var60 = this.field2914;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2942 - 1) {
                    var61 = this.field2942 - 1;
                }
                int var62 = this.field2950 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2940[var62++] = arg3;
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
                if (var28 < this.field2914) {
                    var28 = this.field2914;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2942) {
                    var29 = this.field2942;
                }
                int var30 = this.field2950 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2940[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2940[var30++] = var15 + var33;
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
                if (var22 < this.field2914) {
                    var22 = this.field2914;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2942 - 1) {
                    var23 = this.field2942 - 1;
                }
                int var24 = this.field2950 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2940[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2940[var24++] = var15 + var27;
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
                if (var47 < this.field2914) {
                    var47 = this.field2914;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2942) {
                    var48 = this.field2942;
                }
                int var49 = this.field2950 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2940[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2940[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2914) {
                    var39 = this.field2914;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2942 - 1) {
                    var40 = this.field2942 - 1;
                }
                int var41 = this.field2950 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2940[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2940[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class223 method1236(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class515(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!f", name = "MA", descriptor = "([I)V")
    public final void method1237(int[] arg0) {
        arg0[0] = this.field2914;
        arg0[1] = this.field2919;
        arg0[2] = this.field2942;
        arg0[3] = this.field2916;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()Z")
    public final boolean method1238() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "()Z")
    public final boolean method1239() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Z)V")
    public final void method1240(boolean arg0) {
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "()Z")
    public final boolean method1241() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[Las;)V")
    public final void method1242(int arg0, class415[] arg1) {
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1243(Rectangle[] arg0, int arg1) {
        if (this.field2909 != null && this.field2908 != null) {
            try {
                Graphics var3 = this.field2909.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2950 && var5.y <= this.field2930 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2908.method528(var5.x, var5.height, var5.width, var3, var5.y, -58);
                    }
                }
            } catch (Exception var6) {
                this.field2909.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public final void method1244(int arg0) {
    }

    @OriginalMember(owner = "client!f", name = "n", descriptor = "()V")
    public final void method1245() {
        this.field2912 = this.field2938;
        this.field2913 = false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Laq;[Lok;Z)Lla;")
    public final class299 method1246(class340 arg0, class175[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2576;
            var5[var7] = arg1[var7].field2577;
            if (arg1[var7].field2572 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class458(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class370(this, arg0, arg1, var4, var5);
        } else {
            return new class11(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!f", name = "D", descriptor = "()V")
    private final void method1247() {
        for (int var1 = 0; var1 < this.field2945; ++var1) {
            this.field2920[var1].method357(8191);
        }
        this.method1228();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lwu;III)V")
    public final void method1248(class113 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field1591;
        int var7 = arg3 << 1;
        if (var5 == -1) {
            this.method1235(arg1, arg2, arg3, arg0.field1584, 1);
        } else {
            if (this.field2953 != var5) {
                class139 var8 = (class139) this.field2928.method2191((byte) -73, (long) var5);
                if (var8 == null) {
                    int[] var9 = this.method1320(var5);
                    if (var9 == null) {
                        return;
                    }
                    int var10 = this.method1331(var5) ? 64 : 128;
                    var8 = this.method1232(var9, 0, var10, var10, var10);
                    this.field2928.method2188(-123, (long) var5, var8);
                }
                this.field2953 = var5;
                this.field2952 = var8;
            }
            this.field2952.method630(arg1 - arg3, arg2 - arg3, var7, var7, 0, arg0.field1584, 1);
        }
    }

    @OriginalMember(owner = "client!f", name = "B", descriptor = "(IFFFFF)V")
    public final void method1249(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2921 = (int) (arg1 * 65535.0F);
        this.field2915 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2941 = (int) (arg3 * 65535.0F / var7);
        this.field2943 = (int) (arg4 * 65535.0F / var7);
        this.field2910 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
    public final void method1250(boolean arg0) {
    }

    @OriginalMember(owner = "client!f", name = "sa", descriptor = "(IIII)[I")
    public final int[] method1251(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2950 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2940[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmt;)V")
    public final void method1252(class321 arg0) {
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1253(Canvas arg0) {
        class343 var2 = (class343) this.field2906.method1122((byte) 59, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3149(58);
            class343 var3 = class100.method677(arg0, -1);
            this.field2906.method1127(var3, (byte) 95, (long) arg0.hashCode());
            if (this.field2909 == arg0 && this.field2931 == null) {
                this.field2908 = var3;
                this.field2940 = var3.field5347;
                this.field2950 = var3.field5345;
                this.field2930 = var3.field5346;
                this.method1247();
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "y", descriptor = "()Lc;")
    public final class205 method1254() {
        return new class26();
    }

    @OriginalMember(owner = "client!f", name = "l", descriptor = "()V")
    public final void method1255() {
        if (this.field2909 != null && this.field2908 != null) {
            try {
                Graphics var1 = this.field2909.getGraphics();
                this.field2908.method529(var1, 0, 0, 0);
            } catch (Exception var2) {
                this.field2909.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!f", name = "j", descriptor = "()Z")
    public final boolean method1256() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
    public final void method1257(int arg0, int arg1) {
        this.field2925 = arg0;
        this.field2937 = arg1;
        this.field2935 = this.field2937 - 255;
        this.method1303();
    }

    @OriginalMember(owner = "client!f", name = "pa", descriptor = "()I")
    public final int method1258() {
        return 0;
    }

    @OriginalMember(owner = "client!f", name = "r", descriptor = "()I")
    public final int method1259() {
        return this.field2937;
    }

    @OriginalMember(owner = "client!f", name = "P", descriptor = "(IIIIII)V")
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2914) {
            arg2 -= this.field2914 - arg0;
            arg0 = this.field2914;
        }
        if (arg1 < this.field2919) {
            arg3 -= this.field2919 - arg1;
            arg1 = this.field2919;
        }
        if (arg0 + arg2 > this.field2942) {
            arg2 = this.field2942 - arg0;
        }
        if (arg1 + arg3 > this.field2916) {
            arg3 = this.field2916 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2942 && arg1 <= this.field2916) {
            int var7 = this.field2950 - arg2;
            int var8 = this.field2950 * arg1 + arg0;
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
                            this.field2940[var24] = arg4;
                            ++var24;
                            this.field2940[var24] = arg4;
                            ++var24;
                            this.field2940[var24] = arg4;
                            ++var24;
                            this.field2940[var24] = arg4;
                            ++var24;
                            this.field2940[var24] = arg4;
                            ++var24;
                            this.field2940[var24] = arg4;
                            ++var24;
                            this.field2940[var24] = arg4;
                            ++var24;
                            this.field2940[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2940[var24] = arg4;
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
                        int var14 = this.field2940[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field2940[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2940[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2940[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "IA", descriptor = "(IIIII)V")
    public final void method1261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2914 && arg0 < this.field2942) {
            if (arg1 < this.field2919) {
                arg2 -= this.field2919 - arg1;
                arg1 = this.field2919;
            }
            if (arg1 + arg2 > this.field2916) {
                arg2 = this.field2916 - arg1;
            }
            int var6 = this.field2950 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2950 * var10 + var6;
                        int var12 = this.field2940[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2940[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2950 * var14 + var6;
                        int var16 = this.field2940[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2940[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2940[this.field2950 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIII)V")
    public final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1332(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1332(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1261(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1261(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2914) {
                    var10 += (this.field2914 - arg0) * var12;
                    arg0 = this.field2914;
                }
                if (var13 >= this.field2942) {
                    var13 = this.field2942 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2919 && var17 < this.field2916) {
                                int var18 = this.field2950 * var17 + arg0;
                                int var19 = this.field2940[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2940[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2919 && var21 < this.field2916) {
                                int var22 = this.field2950 * var21 + arg0;
                                int var23 = this.field2940[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2940[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2919 && var27 < this.field2916) {
                            this.field2940[this.field2950 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2919) {
                    var29 += (this.field2919 - arg1) * var31;
                    arg1 = this.field2919;
                }
                if (var32 >= this.field2916) {
                    var32 = this.field2916 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2914 && var46 < this.field2942) {
                            this.field2940[this.field2950 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2914 && var36 < this.field2942) {
                            int var37 = this.field2950 * arg1 + var36;
                            int var38 = this.field2940[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2940[this.field2950 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2914 && var40 < this.field2942) {
                            int var41 = this.field2950 * arg1 + var40;
                            int var42 = this.field2940[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2940[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!f", name = "k", descriptor = "(I)I")
    public final int method1263(int arg0) {
        return super.field7480.method1366(arg0, (byte) 17).field7281 & 65535;
    }

    @OriginalMember(owner = "client!f", name = "q", descriptor = "()V")
    public final void method1264() {
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final void method1265(int arg0) {
        this.field2920[arg0].method359((byte) 108, Thread.currentThread());
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()Z")
    public final boolean method1266() {
        return true;
    }

    @OriginalMember(owner = "client!f", name = "w", descriptor = "()Z")
    public final boolean method1267() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "T", descriptor = "()F")
    public final float method1268() {
        return this.field2923;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class50 var11 = this.method1272(Thread.currentThread());
        class351 var12 = var11.field630;
        var12.field5466 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field5466 = false;
            var12.field5469 = 0;
            var12.field5477 = true;
            var12.method2321(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field5466 = false;
            var12.field5469 = 255 - var13;
            var12.field5477 = true;
            var12.method2321(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field5466 = true;
    }

    @OriginalMember(owner = "client!f", name = "l", descriptor = "(I)[I")
    public final int[] method1270(int arg0) {
        class328 var2 = this.field2932;
        class505 var3;
        synchronized (this.field2932) {
            var3 = (class505) this.field2932.method2191((byte) -73, (long) arg0);
            if (var3 == null) {
                if (!super.field7480.method1364((byte) 53, arg0)) {
                    return null;
                }
                class476 var5 = super.field7480.method1366(arg0, (byte) 43);
                int var6 = !var5.field7295 && !this.field2924 ? 128 : 64;
                var3 = new class505(arg0, var6, super.field7480.method1367(true, 0.7F, arg0, var6, -25218, var6), var5.field7286);
                this.field2932.method2188(-124, (long) arg0, var3);
            }
        }
        var3.field7554 = true;
        return var3.method3069();
    }

    @OriginalMember(owner = "client!f", name = "K", descriptor = "(IIIIII[BII)V")
    public final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2950 * arg1 + arg0;
            int var15 = this.field2950 - arg2;
            if (arg1 + arg3 > this.field2916) {
                arg3 -= arg1 + arg3 - this.field2916;
            }
            if (arg1 < this.field2919) {
                int var16 = this.field2919 - arg1;
                arg3 -= var16;
                var14 += this.field2950 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2942) {
                int var17 = arg0 + arg2 - this.field2942;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2914) {
                int var18 = this.field2914 - arg0;
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
                            int var28 = this.field2940[var14];
                            this.field2940[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2940[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2940[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2940[var14++] = arg5;
                        } else {
                            this.field2940[var14++] = arg4;
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Runnable;)Lfu;")
    public final class50 method1272(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2945; ++var2) {
            if (this.field2920[var2].field629 == arg0) {
                return this.field2920[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!f", name = "VA", descriptor = "(IIIIII)Z")
    public final boolean method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field2951.field290 * arg2 + this.field2951.field286 * arg1 + this.field2951.field283 * arg0 >> 15) + this.field2951.field287;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field2951.field290 * arg5 + this.field2951.field286 * arg4 + this.field2951.field283 * arg3 >> 15) + this.field2951.field287;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field2925 || var8 >= this.field2925) && (var7 <= this.field2937 || var8 <= this.field2937)) {
            int var9 = ((this.field2951.field280 * arg2 + this.field2951.field289 * arg1 + this.field2951.field282 * arg0 >> 15) + this.field2951.field281) * this.field2917 / var7;
            int var10 = ((this.field2951.field280 * arg5 + this.field2951.field289 * arg4 + this.field2951.field282 * arg3 >> 15) + this.field2951.field281) * this.field2917 / var8;
            if (var9 < this.field2936 && var10 < this.field2936 || var9 > this.field2927 && var10 > this.field2927) {
                return false;
            } else {
                int var11 = ((this.field2951.field285 * arg2 + this.field2951.field288 * arg1 + this.field2951.field284 * arg0 >> 15) + this.field2951.field291) * this.field2918 / var7;
                int var12 = ((this.field2951.field285 * arg5 + this.field2951.field288 * arg4 + this.field2951.field284 * arg3 >> 15) + this.field2951.field291) * this.field2918 / var8;
                return (var11 >= this.field2948 || var12 >= this.field2948) && (var11 <= this.field2922 || var12 <= this.field2922);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public final void method1274(int arg0) {
        if (this.field2945 != arg0) {
            this.field2945 = arg0;
            this.field2920 = new class50[this.field2945];
            for (int var2 = 0; var2 < this.field2945; ++var2) {
                this.field2920[var2] = new class50(this);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()Z")
    public final boolean method1275() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "()I")
    public final int method1276() {
        int var1 = this.field2939;
        this.field2939 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "GA", descriptor = "(IIII)V")
    public final void method1277(int arg0, int arg1, int arg2, int arg3) {
        this.field2947 = arg0;
        this.field2933 = arg1;
        this.field2917 = arg2;
        this.field2918 = arg3;
        this.method1336();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lok;Z)Lo;")
    public final class139 method1278(class175 arg0, boolean arg1) {
        int[] var3 = arg0.field2571;
        byte[] var4 = arg0.field2574;
        int var5 = arg0.field2576;
        int var6 = arg0.field2577;
        class245 var11;
        if (arg1 && arg0.field2572 == null) {
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
            var11 = new class158(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2572;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class265(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class265(this, var14, var5, var6);
                var11 = new class430(this, var14, var5, var6);
            }
        }
        var11.method627(arg0.field2575, arg0.field2579, arg0.field2573, arg0.field2578);
        return var11;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()Z")
    public final boolean method1279() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V")
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class50 var8 = this.method1272(Thread.currentThread());
        class351 var9 = var8.field630;
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
            int var21 = arg0 - var9.method2330();
            int var22 = arg1 - var9.method2326();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field5469 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5469 = 255 - (arg4 >> 24);
            }
            var9.field5477 = var23 < 0 || var23 > var9.field5471 || var24 < 0 || var24 > var9.field5471 || var25 < 0 || var25 > var9.field5471;
            var9.method2324(var27, var28, var29, var23, var24, var25, arg4);
            var9.field5477 = var23 < 0 || var23 > var9.field5471 || var24 < 0 || var24 > var9.field5471 || var26 < 0 || var26 > var9.field5471;
            var9.method2324(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1282(Canvas arg0) {
        class343 var2 = (class343) this.field2906.method1122((byte) 59, (long) arg0.hashCode());
        if (var2 == null) {
            class343 var3 = class100.method677(arg0, -1);
            this.field2906.method1127(var3, (byte) 34, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!f", name = "x", descriptor = "()Z")
    public final boolean method1283() {
        return true;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIIIII)V")
    public final void method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1332(arg0, arg1, arg2, arg4, arg5);
        this.method1332(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1261(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1261(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Ln;")
    public final class517 method1285(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmt;Lmt;FLmt;)Lmt;")
    public final class321 method1286(class321 arg0, class321 arg1, float arg2, class321 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public final void method1287(int arg0) {
        int var2 = arg0 - this.field2907;
        for (Object var3 = this.field2932.method2190(-15680); var3 != null; var3 = this.field2932.method2201(true)) {
            class505 var4 = (class505) var3;
            if (var4.field7554) {
                var4.field7558 += var2;
                int var5 = var4.field7558 / 20;
                if (var5 > 0) {
                    class476 var6 = super.field7480.method1366(var4.field7559, (byte) 30);
                    var4.method3070(var6.field7272 * var2 * 50 / 1000, var6.field7279 * var2 * 50 / 1000);
                    var4.field7558 -= var5 * 20;
                }
                var4.field7554 = false;
            }
        }
        this.field2907 = arg0;
        this.field2928.method2202(0, 5);
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public final void method1288(int arg0) {
        this.field2920[arg0].method359((byte) 108, (Runnable) null);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([Le;Lc;[Lkk;I)V")
    public final void method1289(class536[] arg0, class205 arg1, class182[] arg2, int arg3) {
        class44[] var5 = new class44[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class44) arg0[var6];
            }
        }
        class44 var7 = class44.method300(this, var5);
        var7.method284(arg1, arg2 != null ? arg2[0] : null, (class519) null, arg3);
    }

    @OriginalMember(owner = "client!f", name = "HA", descriptor = "(IIII)V")
    public final void method1290(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2914 < arg0) {
            this.field2914 = arg0;
        }
        if (this.field2919 < arg1) {
            this.field2919 = arg1;
        }
        if (this.field2942 > arg2) {
            this.field2942 = arg2;
        }
        if (this.field2916 > arg3) {
            this.field2916 = arg3;
        }
        this.method1336();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Le;Ldm;Lc;Lkk;I)V")
    public final void method1291(class536 arg0, class519 arg1, class205 arg2, class182 arg3, int arg4) {
        ((class44) arg0).method284(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public final void method1292(boolean arg0) {
        this.field2924 = arg0;
        this.field2932.method2189(false);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILl;)V")
    private class195(int arg0, class199 arg1) {
        super(arg0, arg1);
        this.field2904 = false;
        this.field2905 = false;
        this.field2906 = new class177(4);
        this.field2917 = 512;
        this.field2911 = 0;
        this.field2916 = 0;
        this.field2914 = 0;
        this.field2925 = 50;
        this.field2924 = false;
        this.field2915 = 78642;
        this.field2913 = false;
        this.field2918 = 512;
        this.field2919 = 0;
        this.field2938 = 0;
        this.field2934 = 75518;
        this.field2921 = 45823;
        this.field2939 = 0;
        this.field2942 = 0;
        this.field2912 = 0;
        this.field2949 = 3500;
        this.field2937 = 3500;
        this.field2935 = this.field2937 - 255;
        this.field2929 = 0;
        this.field2944 = 0;
        this.field2928 = new class328(16);
        this.field2953 = -1;
        this.field2932 = new class328(20);
        this.field2951 = new class26();
        this.method1274(1);
        this.method1265(0);
        class279.method1873(25503, false, true);
        this.field2904 = true;
    }

    @OriginalMember(owner = "client!f", name = "k", descriptor = "()V")
    public final void method1293() {
        this.field2932.method2189(false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public final int method1294(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ln;)V")
    public final void method1295(class517 arg0) {
    }

    @OriginalMember(owner = "client!f", name = "u", descriptor = "()Z")
    public final boolean method1296() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "(III)V")
    public final void method1297(int arg0, int arg1, int arg2) {
        this.field2912 = arg0 & 16777215;
        int var4 = this.field2912 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field2912 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field2912 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field2912 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field2926 = false;
        } else {
            this.field2926 = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "AA", descriptor = "()I")
    public final int method1298() {
        return this.field2925;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)I")
    public final int method1299(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(IIIIII)Lmt;")
    public final class321 method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!f", name = "JA", descriptor = "(F)V")
    public final void method1301(float arg0) {
        this.field2934 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([Le;Ldm;Lc;[Lkk;I)V")
    public final void method1302(class536[] arg0, class519 arg1, class205 arg2, class182[] arg3, int arg4) {
        class44[] var6 = new class44[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class44) arg0[var7];
            }
        }
        class44 var8 = class44.method300(this, var6);
        var8.method284(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!f", name = "E", descriptor = "()V")
    private final void method1303() {
        if (this.field2946 != 0.0F) {
            float var1 = (float) this.field2937;
            float var2 = (float) this.field2925;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field2923 / (this.field2946 + this.field2923);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field2946;
            this.field2949 = (int) (((float) this.field2937 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field2949 = this.field2937;
        }
    }

    @OriginalMember(owner = "client!f", name = "A", descriptor = "()Z")
    public final boolean method1304() {
        return true;
    }

    @OriginalMember(owner = "client!f", name = "v", descriptor = "(III[I)V")
    public final void method1305(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field2951.field290 * arg2 + this.field2951.field286 * arg1 + this.field2951.field283 * arg0 >> 15) + this.field2951.field287;
        if (var5 >= this.field2925 && var5 <= this.field2937) {
            int var6 = ((this.field2951.field280 * arg2 + this.field2951.field289 * arg1 + this.field2951.field282 * arg0 >> 15) + this.field2951.field281) * this.field2917 / var5;
            int var7 = ((this.field2951.field285 * arg2 + this.field2951.field288 * arg1 + this.field2951.field284 * arg0 >> 15) + this.field2951.field291) * this.field2918 / var5;
            if (var6 >= this.field2936 && var6 <= this.field2927 && var7 >= this.field2948 && var7 <= this.field2922) {
                arg3[0] = var6 - this.field2936;
                arg3[1] = var7 - this.field2948;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldm;)V")
    public final void method1306(class519 arg0) {
        class282 var2 = arg0.field7690.field5963;
        for (class282 var3 = var2.field4453; var2 != var3; var3 = var3.field4453) {
            class113 var4 = (class113) var3;
            int var5 = var4.field1582 >> 12;
            int var6 = var4.field1588 >> 12;
            int var7 = var4.field1592 >> 12;
            int var8 = (this.field2951.field290 * var7 + this.field2951.field286 * var6 + this.field2951.field283 * var5 >> 15) + this.field2951.field287;
            if (var8 >= this.field2925 && var8 <= this.field2935) {
                int var9 = ((this.field2951.field280 * var7 + this.field2951.field289 * var6 + this.field2951.field282 * var5 >> 15) + this.field2951.field281) * this.field2917 / var8 + this.field2947;
                int var10 = ((this.field2951.field285 * var7 + this.field2951.field288 * var6 + this.field2951.field284 * var5 >> 15) + this.field2951.field291) * this.field2918 / var8 + this.field2933;
                if (var9 >= this.field2914 && var9 <= this.field2942 && var10 >= this.field2919 && var10 <= this.field2916) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1248(var4, var9, var10, (this.field2917 * var4.field1594 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "ba", descriptor = "(IIII)V")
    public final void method1307(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2950) {
            arg2 = this.field2950;
        }
        if (arg3 > this.field2930) {
            arg3 = this.field2930;
        }
        this.field2914 = arg0;
        this.field2942 = arg2;
        this.field2919 = arg1;
        this.field2916 = arg3;
        this.method1336();
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1308(Canvas arg0) {
        if (this.field2909 == arg0) {
            this.method1230((Canvas) null);
        }
        class343 var2 = (class343) this.field2906.method1122((byte) 59, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3149(68);
        }
    }

    @OriginalMember(owner = "client!f", name = "da", descriptor = "(FF)V")
    public final void method1309(float arg0, float arg1) {
        this.field2923 = arg0;
        this.field2946 = arg1;
        this.method1303();
    }

    @OriginalMember(owner = "client!f", name = "v", descriptor = "()V")
    public final void method1310() {
        if (this.field2904) {
            class269.method1825(false, 1, true);
            this.field2904 = false;
        }
        this.field2908 = null;
        this.field2909 = null;
        this.field2906 = null;
        this.field2905 = true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class139 method1311(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2950 * arg1 + arg0;
        int var8 = this.field2950 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2940[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class265(this, var6, arg2, arg3);
        } else {
            return new class430(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!f", name = "z", descriptor = "()Z")
    public final boolean method1312() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;)V")
    public class195(int arg0, Canvas arg1, class199 arg2) {
        this(arg0, arg2);
        this.method1282(arg1);
        this.method1230(arg1);
    }

    @OriginalMember(owner = "client!f", name = "o", descriptor = "()Z")
    public final boolean method1313() {
        return true;
    }

    @OriginalMember(owner = "client!f", name = "SA", descriptor = "(Lc;)V")
    public final void method1314(class205 arg0) {
        this.field2951 = (class26) arg0;
    }

    @OriginalMember(owner = "client!f", name = "t", descriptor = "()V")
    public final void method1315() {
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "()V")
    public final void method1316() {
    }

    @OriginalMember(owner = "client!f", name = "t", descriptor = "(I)V")
    public final void method1317(int arg0) {
        this.method1260(0, 0, this.field2950, this.field2930, arg0, 0);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()Z")
    public final boolean method1318() {
        return false;
    }

    @OriginalMember(owner = "client!f", name = "i", descriptor = "()V")
    public final void method1319() {
    }

    @OriginalMember(owner = "client!f", name = "m", descriptor = "(I)[I")
    private final int[] method1320(int arg0) {
        class328 var2 = this.field2932;
        class505 var3;
        synchronized (this.field2932) {
            var3 = (class505) this.field2932.method2191((byte) -73, (long) arg0);
            if (var3 == null) {
                if (!super.field7480.method1364((byte) 53, arg0)) {
                    return null;
                }
                class476 var5 = super.field7480.method1366(arg0, (byte) -25);
                int var6 = !var5.field7295 && !this.field2924 ? 128 : 64;
                var3 = new class505(arg0, var6, super.field7480.method1368(0.7F, var6, true, false, arg0, var6), var5.field7286);
                this.field2932.method2188(-127, (long) arg0, var3);
            }
        }
        var3.field7554 = true;
        return var3.method3069();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
    public final void method1321(int arg0, int arg1, int arg2, int arg3) {
        this.field2929 = arg0;
        this.field2912 = arg1;
        this.field2911 = arg2;
    }

    @OriginalMember(owner = "client!f", name = "n", descriptor = "(I)Z")
    public final boolean method1322(int arg0) {
        return super.field7480.method1364((byte) 53, arg0);
    }

    @OriginalMember(owner = "client!f", name = "ra", descriptor = "(ILta;II)V")
    public final void method1323(int arg0, class453 arg1, int arg2, int arg3) {
        class396 var5 = (class396) arg1;
        int[] var6 = var5.field5990;
        int[] var7 = var5.field5989;
        int var8;
        if (this.field2916 < var6.length + arg3) {
            var8 = this.field2916 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2919 > arg3) {
            var9 = this.field2919 - arg3;
            arg3 = this.field2919;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2950 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2914 > var12) {
                    var13 -= this.field2914 - var12;
                    var12 = this.field2914;
                }
                if (this.field2942 < var12 + var13) {
                    var13 = this.field2942 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2940[var14++] = arg0;
                }
                var10 += this.field2950;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "s", descriptor = "()I")
    public final int method1324() {
        return 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(FFF)V")
    public final void method1325(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!f", name = "s", descriptor = "(IIII)V")
    public final void method1326(int arg0, int arg1, int arg2, int arg3) {
        this.field2938 = this.field2912;
        this.field2929 = arg0;
        this.field2912 = arg1;
        this.field2911 = arg2;
        this.field2913 = true;
    }

    @OriginalMember(owner = "client!f", name = "OA", descriptor = "()I")
    public final int method1327() {
        int var1 = this.field2944;
        this.field2944 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "aa", descriptor = "()F")
    public final float method1328() {
        return this.field2946;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class453 arg6, int arg7, int arg8) {
        class396 var10 = (class396) arg6;
        int[] var11 = var10.field5990;
        int[] var12 = var10.field5989;
        int var13 = this.field2919 > arg8 ? this.field2919 : arg8;
        int var14 = this.field2916 < var11.length + arg8 ? this.field2916 : var11.length + arg8;
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
            if (arg0 < this.field2914) {
                var18 += (this.field2914 - arg0) * var20;
                arg0 = this.field2914;
            }
            if (var21 >= this.field2942) {
                var21 = this.field2942 - 1;
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
                                int var28 = this.field2950 * var25 + arg0;
                                int var29 = this.field2940[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2940[var28] = var23 + var30;
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
                                int var34 = this.field2950 * var31 + arg0;
                                int var35 = this.field2940[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2940[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2940[this.field2950 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2914 && var64 < this.field2942 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2940[this.field2950 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2914 && var50 < this.field2942 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2950 * arg1 + var50;
                        int var54 = this.field2940[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2940[this.field2950 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2914 && var56 < this.field2942 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2950 * arg1 + var56;
                        int var60 = this.field2940[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2940[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "o", descriptor = "(I)Z")
    public final boolean method1330(int arg0) {
        return super.field7480.method1366(arg0, (byte) 70).field7289;
    }

    @OriginalMember(owner = "client!f", name = "p", descriptor = "(I)Z")
    public final boolean method1331(int arg0) {
        return this.field2924 || super.field7480.method1366(arg0, (byte) 5).field7295;
    }

    @OriginalMember(owner = "client!f", name = "ma", descriptor = "(IIIII)V")
    public final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2919 && arg1 < this.field2916) {
            if (arg0 < this.field2914) {
                arg2 -= this.field2914 - arg0;
                arg0 = this.field2914;
            }
            if (arg0 + arg2 > this.field2942) {
                arg2 = this.field2942 - arg0;
            }
            int var6 = this.field2950 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2940[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2940[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2940[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2940[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2940[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIF)Las;")
    public final class415 method1333(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[I[I)Lta;")
    public final class453 method1334(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class396(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!f", name = "ya", descriptor = "(I)V")
    public final void method1335(int arg0) {
    }

    @OriginalMember(owner = "client!f", name = "F", descriptor = "()V")
    private final void method1336() {
        this.field2936 = this.field2914 - this.field2947;
        this.field2927 = this.field2942 - this.field2947;
        this.field2948 = this.field2919 - this.field2933;
        this.field2922 = this.field2916 - this.field2933;
        for (int var1 = 0; var1 < this.field2945; ++var1) {
            class351 var5 = this.field2920[var1].field630;
            var5.field5473 = this.field2947 - this.field2914;
            var5.field5474 = this.field2933 - this.field2919;
            var5.field5471 = this.field2942 - this.field2914;
            var5.field5475 = this.field2916 - this.field2919;
        }
        int var2 = this.field2950 * this.field2919 + this.field2914;
        for (int var3 = this.field2919; var3 < this.field2916; ++var3) {
            for (int var4 = 0; var4 < this.field2945; ++var4) {
                this.field2920[var4].field630.field5467[var3 - this.field2919] = var2;
            }
            var2 += this.field2950;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lfc;IIII)Le;")
    public final class536 method1337(class438 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, arg0, arg1, arg3, arg4, arg2);
    }
}
