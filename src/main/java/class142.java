import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class142 extends class166 {

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "Z")
    private boolean field2010;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "Z")
    private boolean field2013;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "Lfaa;")
    private class139 field2011;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!kt", name = "X", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!kt", name = "ab", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!kt", name = "fb", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!kt", name = "db", descriptor = "Z")
    private boolean field2047;

    @OriginalMember(owner = "client!kt", name = "cb", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "Llga;")
    private class663 field2025;

    @OriginalMember(owner = "client!kt", name = "gb", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "Llga;")
    private class663 field2023;

    @OriginalMember(owner = "client!kt", name = "V", descriptor = "Lmba;")
    public class384 field2039;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    private int field2009;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!kt", name = "S", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!kt", name = "T", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!kt", name = "W", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!kt", name = "Y", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!kt", name = "Z", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!kt", name = "bb", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!kt", name = "eb", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "Lll;")
    private class333 field2014;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "Lf;")
    private class702 field2019;

    @OriginalMember(owner = "client!kt", name = "hb", descriptor = "Lf;")
    private class702 field2051;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2012;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "[I")
    public int[] field2017;

    @OriginalMember(owner = "client!kt", name = "U", descriptor = "[I")
    public int[] field2038;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "[Llw;")
    private class613[] field2032;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIF)Ltw;", line = 3)
    public final class186 method108(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "U", descriptor = "()I", line = 8)
    public final int method142() {
        return this.field2049;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "()V", line = 11)
    public final void method136() {
        if (this.field2013) {
            class5.method14((byte) -121, true, false);
            this.field2013 = false;
        }
        this.field2014 = null;
        this.field2012 = null;
        this.field2011 = null;
        this.field2010 = true;
    }

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "()Z", line = 23)
    public final boolean method127() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lwd;IIII)V", line = 27)
    private final void method991(class247 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field3382;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method993(arg1, arg2, arg3, arg4, arg0.field3384, 1);
        } else {
            if (this.field2050 != var6) {
                class702 var9 = (class702) this.field2025.method3747((byte) -66, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method999(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1003(var6) ? 64 : 128;
                    var9 = this.method175(var10, 0, var11, var11, var11);
                    this.field2025.method3748((long) var6, var9, 12537);
                }
                this.field2050 = var6;
                this.field2051 = var9;
            }
            ++var8;
            ((class612) this.field2051).method933(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field3384, 1, 1);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 65)
    public final void method92(Rectangle[] arg0, int arg1) throws class39 {
        if (this.field2012 != null && this.field2014 != null) {
            try {
                Graphics var3 = this.field2012.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2033 && var5.y <= this.field2048 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field2014.method860(var5.y, var5.width, var3, 16, var5.x, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field2012.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!kt", name = "CA", descriptor = "(IIII)V", line = 97)
    public final void method137(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field2032.length; ++var5) {
            this.field2032[var5].field8527 = this.field2032[var5].field8529;
            this.field2032[var5].field8513 = arg0;
            this.field2032[var5].field8529 = arg1;
            this.field2032[var5].field8533 = arg2;
            this.field2032[var5].field8530 = true;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V", line = 111)
    public final void method99(boolean arg0) {
        this.field2047 = arg0;
        this.field2023.method3749(7648);
    }

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "(I)Z", line = 115)
    public final boolean method992(int arg0) {
        return super.field2418.method1367(arg0, false);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lwn;Lwn;FLwn;)Lwn;", line = 118)
    public final class674 method91(class674 arg0, class674 arg1, float arg2, class674 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V", line = 121)
    public final void method191(int arg0) {
        this.field2016 = arg0;
        this.field2032 = new class613[this.field2016];
        for (int var2 = 0; var2 < this.field2016; ++var2) {
            this.field2032[var2] = new class613(this);
        }
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "(IIIIII)V", line = 135)
    private final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field2021) {
            var8 = this.field2021;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field2020) {
            var9 = this.field2020;
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
                if (var66 < this.field2034) {
                    var66 = this.field2034;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field2018) {
                    var67 = this.field2018;
                }
                int var68 = this.field2033 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field2038[var68]) {
                        this.field2017[var68] = arg4;
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
                if (var62 < this.field2034) {
                    var62 = this.field2034;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field2018 - 1) {
                    var63 = this.field2018 - 1;
                }
                int var64 = this.field2033 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field2038[var64]) {
                        this.field2017[var64] = arg4;
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
                if (var30 < this.field2034) {
                    var30 = this.field2034;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field2018) {
                    var31 = this.field2018;
                }
                int var32 = this.field2033 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field2038[var32]) {
                        int var34 = this.field2017[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field2017[var32] = var17 + var35;
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
                if (var24 < this.field2034) {
                    var24 = this.field2034;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field2018 - 1) {
                    var25 = this.field2018 - 1;
                }
                int var26 = this.field2033 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field2038[var26]) {
                        int var28 = this.field2017[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field2017[var26] = var17 + var29;
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
                if (var49 < this.field2034) {
                    var49 = this.field2034;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field2018) {
                    var50 = this.field2018;
                }
                int var51 = this.field2033 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field2038[var51]) {
                        int var53 = this.field2017[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field2017[var51] = var54 - var56 | var56 - (var56 >>> 8);
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
                if (var41 < this.field2034) {
                    var41 = this.field2034;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field2018 - 1) {
                    var42 = this.field2018 - 1;
                }
                int var43 = this.field2033 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field2038[var43]) {
                        int var45 = this.field2017[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field2017[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "la", descriptor = "(IIII)V", line = 452)
    public final void method161(int arg0, int arg1, int arg2, int arg3) {
        this.field2037 = arg0;
        this.field2042 = arg1;
        this.field2015 = arg2;
        this.field2044 = arg3;
        this.method996();
    }

    @OriginalMember(owner = "client!kt", name = "MA", descriptor = "(III[I)V", line = 460)
    public final void method154(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2039.field5439 + (float) arg0 * this.field2039.field5454 + (float) arg1 * this.field2039.field5437 + this.field2039.field5443;
        if (!(var5 < (float) this.field2035) && !(var5 > (float) this.field2049)) {
            int var6 = (int) (((float) arg2 * this.field2039.field5453 + (float) arg0 * this.field2039.field5432 + (float) arg1 * this.field2039.field5430 + this.field2039.field5441) * (float) this.field2015 / var5);
            int var7 = (int) (((float) arg2 * this.field2039.field5434 + (float) arg0 * this.field2039.field5450 + (float) arg1 * this.field2039.field5447 + this.field2039.field5438) * (float) this.field2044 / var5);
            arg3[0] = var6 - this.field2022;
            arg3[1] = var7 - this.field2036;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "()V", line = 475)
    public final void method196() {
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 478)
    public final void method152(Canvas arg0) {
        if (this.field2012 == arg0) {
            this.method86((Canvas) null);
        }
        class333 var2 = (class333) this.field2011.method970((byte) 89, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2340(-116);
        }
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "()Z", line = 488)
    public final boolean method132() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lq;)V", line = 492)
    public final void method93(class392 arg0) {
        this.field2039 = (class384) arg0;
    }

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "(I)V", line = 496)
    public final void method173(int arg0) {
        this.field2032[arg0].method3427(true, Thread.currentThread());
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ldk;I)V", line = 500)
    public final void method167(class472 arg0, int arg1) {
        class613 var3 = this.method1002(Thread.currentThread());
        class698 var4 = arg0.field6493.field8428;
        for (class698 var5 = var4.field9901; var4 != var5; var5 = var5.field9901) {
            class247 var6 = (class247) var5;
            int var7 = var6.field3389 >> 12;
            int var8 = var6.field3387 >> 12;
            int var9 = var6.field3381 >> 12;
            float var10 = (float) var9 * this.field2039.field5439 + (float) var7 * this.field2039.field5454 + (float) var8 * this.field2039.field5437 + this.field2039.field5443;
            if (!(var10 < (float) this.field2035) && !(var10 > (float) var3.field8528)) {
                int var11 = (int) (((float) var9 * this.field2039.field5453 + (float) var7 * this.field2039.field5432 + (float) var8 * this.field2039.field5430 + this.field2039.field5441) * (float) this.field2015 / (float) arg1) + this.field2037;
                int var12 = (int) (((float) var9 * this.field2039.field5434 + (float) var7 * this.field2039.field5450 + (float) var8 * this.field2039.field5447 + this.field2039.field5438) * (float) this.field2044 / (float) arg1) + this.field2042;
                if (var11 >= this.field2034 && var11 <= this.field2018 && var12 >= this.field2021 && var12 <= this.field2020) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method991(var6, var11, var12, (int) var10, (this.field2015 * var6.field3379 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(IIIIIIIIII)V", line = 538)
    public final void method994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field2418.method1365(-17951, arg6).field9794) {
                if (this.field2050 != arg6) {
                    class702 var11 = (class702) this.field2025.method3747((byte) -66, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method999(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1003(arg6) ? 64 : 128;
                        var11 = this.method175(var12, 0, var13, var13, var13);
                        this.field2025.method3748((long) arg6, var11, 12537);
                    }
                    this.field2050 = arg6;
                    this.field2051 = var11;
                }
                ((class612) this.field2051).method933(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method993(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "()I", line = 571)
    public final int method203() {
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "()Z", line = 574)
    public final boolean method201() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Le;)V", line = 577)
    public final void method111(class493 arg0) {
    }

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "()V", line = 579)
    public final void method98() {
    }

    @OriginalMember(owner = "client!kt", name = "JA", descriptor = "()V", line = 582)
    public final void method193() {
        this.field2034 = 0;
        this.field2021 = 0;
        this.field2018 = this.field2033;
        this.field2020 = this.field2048;
        this.method996();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lnba;IIII)Lda;", line = 590)
    public final class55 method106(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class673(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIILua;II)V", line = 595)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class618 arg6, int arg7, int arg8) {
        class521 var10 = (class521) arg6;
        int[] var11 = var10.field7091;
        int[] var12 = var10.field7089;
        int var13 = this.field2021 > arg8 ? this.field2021 : arg8;
        int var14 = this.field2020 < var11.length + arg8 ? this.field2020 : var11.length + arg8;
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
            if (arg0 < this.field2034) {
                var18 += (this.field2034 - arg0) * var20;
                arg0 = this.field2034;
            }
            if (var21 >= this.field2018) {
                var21 = this.field2018 - 1;
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
                                int var28 = this.field2033 * var25 + arg0;
                                int var29 = this.field2017[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2017[var28] = var23 + var30;
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
                                int var34 = this.field2033 * var31 + arg0;
                                int var35 = this.field2017[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2017[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2017[this.field2033 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2034 && var64 < this.field2018 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2017[this.field2033 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2034 && var50 < this.field2018 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2033 * arg1 + var50;
                        int var54 = this.field2017[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2017[this.field2033 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2034 && var56 < this.field2018 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2033 * arg1 + var56;
                        int var60 = this.field2017[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2017[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "()Z", line = 833)
    public final boolean method130() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ldk;)V", line = 837)
    public final void method163(class472 arg0) {
        class613 var2 = this.method1002(Thread.currentThread());
        class698 var3 = arg0.field6493.field8428;
        for (class698 var4 = var3.field9901; var3 != var4; var4 = var4.field9901) {
            class247 var5 = (class247) var4;
            int var6 = var5.field3389 >> 12;
            int var7 = var5.field3387 >> 12;
            int var8 = var5.field3381 >> 12;
            float var9 = (float) var8 * this.field2039.field5439 + (float) var6 * this.field2039.field5454 + (float) var7 * this.field2039.field5437 + this.field2039.field5443;
            if (!(var9 < (float) this.field2035) && !(var9 > (float) var2.field8528)) {
                int var10 = (int) (((float) var8 * this.field2039.field5453 + (float) var6 * this.field2039.field5432 + (float) var7 * this.field2039.field5430 + this.field2039.field5441) * (float) this.field2015 / var9) + this.field2037;
                int var11 = (int) (((float) var8 * this.field2039.field5434 + (float) var6 * this.field2039.field5450 + (float) var7 * this.field2039.field5447 + this.field2039.field5438) * (float) this.field2044 / var9) + this.field2042;
                if (var10 >= this.field2034 && var10 <= this.field2018 && var11 >= this.field2021 && var11 <= this.field2020) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method991(var5, var10, var11, (int) var9, (int) ((float) (this.field2015 * var5.field3379 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[I[I)Lua;", line = 876)
    public final class618 method180(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class521(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "()Lq;", line = 880)
    public final class392 method166() {
        class613 var1 = this.method1002(Thread.currentThread());
        return var1.field8518;
    }

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "(I)[I", line = 885)
    public final int[] method995(int arg0) {
        class663 var2 = this.field2023;
        class573 var3;
        synchronized (this.field2023) {
            var3 = (class573) this.field2023.method3747((byte) -66, (long) arg0);
            if (var3 == null) {
                if (!super.field2418.method1367(arg0, false)) {
                    return null;
                }
                class686 var5 = super.field2418.method1365(-17951, arg0);
                int var6 = !var5.field9795 && !this.field2047 ? 128 : 64;
                var3 = new class573(arg0, var6, super.field2418.method1366(true, arg0, var6, 0.7F, var6, (byte) -69), var5.field9793);
                this.field2023.method3748((long) arg0, var3, 12537);
            }
        }
        var3.field8114 = true;
        return var3.method3274();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 906)
    public final void method204(Canvas arg0) {
        class333 var2 = (class333) this.field2011.method970((byte) 89, (long) arg0.hashCode());
        if (var2 == null) {
            class333 var3 = class213.method1372(arg0, -102);
            this.field2011.method968((long) arg0.hashCode(), var3, -1);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIZ)Lf;", line = 917)
    public final class702 method156(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2033 * arg1 + arg0;
        int var8 = this.field2033 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2017[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class678(this, var6, arg2, arg3);
        } else {
            return new class132(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "(IIIIII)Z", line = 950)
    public final boolean method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field2039.field5439 + (float) arg0 * this.field2039.field5454 + (float) arg1 * this.field2039.field5437 + this.field2039.field5443;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field2039.field5439 + (float) arg3 * this.field2039.field5454 + (float) arg4 * this.field2039.field5437 + this.field2039.field5443;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field2035) || !(var8 < (float) this.field2035)) && (!(var7 > (float) this.field2049) || !(var8 > (float) this.field2049))) {
            int var9 = (int) (((float) arg2 * this.field2039.field5453 + (float) arg0 * this.field2039.field5432 + (float) arg1 * this.field2039.field5430 + this.field2039.field5441) * (float) this.field2015 / var7);
            int var10 = (int) (((float) arg5 * this.field2039.field5453 + (float) arg3 * this.field2039.field5432 + (float) arg4 * this.field2039.field5430 + this.field2039.field5441) * (float) this.field2015 / var8);
            if (var9 < this.field2022 && var10 < this.field2022 || var9 > this.field2024 && var10 > this.field2024) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field2039.field5434 + (float) arg0 * this.field2039.field5450 + (float) arg1 * this.field2039.field5447 + this.field2039.field5438) * (float) this.field2044 / var7);
                int var12 = (int) (((float) arg5 * this.field2039.field5434 + (float) arg3 * this.field2039.field5450 + (float) arg4 * this.field2039.field5447 + this.field2039.field5438) * (float) this.field2044 / var8);
                return (var11 >= this.field2036 || var12 >= this.field2036) && (var11 <= this.field2045 || var12 <= this.field2045);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "()Z", line = 979)
    public final boolean method116() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "ra", descriptor = "(F)V", line = 982)
    public final void method105(float arg0) {
        this.field2041 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V", line = 986)
    public final void method159(int arg0) {
        this.field2032[arg0].method3427(true, (Runnable) null);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIII)V", line = 989)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method118(arg0, arg1, arg2, arg4, arg5);
        this.method118(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method205(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method205(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 996)
    public final void method197(Canvas arg0) {
        class333 var2 = (class333) this.field2011.method970((byte) 89, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2340(97);
            class333 var3 = class213.method1372(arg0, -124);
            this.field2011.method968((long) arg0.hashCode(), var3, -1);
            if (this.field2012 == arg0 && this.field2019 == null) {
                this.field2014 = var3;
                this.field2017 = var3.field4492;
                this.field2033 = var3.field4487;
                this.field2048 = var3.field4493;
                if (this.field2033 != this.field2029 || this.field2048 != this.field2028) {
                    this.field2029 = this.field2033;
                    this.field2028 = this.field2048;
                    this.field2038 = new int[this.field2029 * this.field2028];
                }
                this.method1000();
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "()V", line = 1022)
    private final void method996() {
        this.field2022 = this.field2034 - this.field2037;
        this.field2024 = this.field2018 - this.field2037;
        this.field2036 = this.field2021 - this.field2042;
        this.field2045 = this.field2020 - this.field2042;
        for (int var1 = 0; var1 < this.field2016; ++var1) {
            class394 var5 = this.field2032[var1].field8556;
            var5.field5574 = this.field2037 - this.field2034;
            var5.field5557 = this.field2042 - this.field2021;
            var5.field5561 = this.field2018 - this.field2034;
            var5.field5567 = this.field2020 - this.field2021;
        }
        int var2 = this.field2033 * this.field2021 + this.field2034;
        for (int var3 = this.field2021; var3 < this.field2020; ++var3) {
            for (int var4 = 0; var4 < this.field2016; ++var4) {
                this.field2032[var4].field8556.field5573[var3 - this.field2021] = var2;
            }
            var2 += this.field2033;
        }
    }

    @OriginalMember(owner = "client!kt", name = "da", descriptor = "(IIII)V", line = 1062)
    public final void method200(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2033) {
            arg2 = this.field2033;
        }
        if (arg3 > this.field2048) {
            arg3 = this.field2048;
        }
        this.field2034 = arg0;
        this.field2018 = arg2;
        this.field2021 = arg1;
        this.field2020 = arg3;
        this.method996();
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "()Z", line = 1082)
    public final boolean method109() {
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "()Z", line = 1085)
    public final boolean method94() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1088)
    public final void method86(Canvas arg0) {
        if (arg0 != null) {
            class333 var2 = (class333) this.field2011.method970((byte) 89, (long) arg0.hashCode());
            if (var2 != null) {
                this.field2012 = arg0;
                this.field2014 = var2;
                if (this.field2019 == null) {
                    this.field2017 = var2.field4492;
                    this.field2033 = var2.field4487;
                    this.field2048 = var2.field4493;
                    if (this.field2033 != this.field2029 || this.field2048 != this.field2028) {
                        this.field2029 = this.field2033;
                        this.field2028 = this.field2048;
                        this.field2038 = new int[this.field2029 * this.field2028];
                    }
                    this.method1000();
                    return;
                }
            }
        } else {
            this.field2012 = null;
            this.field2014 = null;
            if (this.field2019 == null) {
                this.field2017 = null;
                this.field2033 = this.field2048 = 1;
                this.field2029 = this.field2028 = 1;
                this.method1000();
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "(IIIII)V", line = 1130)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2034 && arg0 < this.field2018) {
            if (arg1 < this.field2021) {
                arg2 -= this.field2021 - arg1;
                arg1 = this.field2021;
            }
            if (arg1 + arg2 > this.field2020) {
                arg2 = this.field2020 - arg1;
            }
            int var6 = this.field2033 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2033 * var10 + var6;
                        int var12 = this.field2017[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2017[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2033 * var14 + var6;
                        int var16 = this.field2017[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2017[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2017[this.field2033 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(FFF)V", line = 1205)
    public final void method147(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(IIIIII)V", line = 1208)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method118(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method118(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method205(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method205(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2034) {
                    var10 += (this.field2034 - arg0) * var12;
                    arg0 = this.field2034;
                }
                if (var13 >= this.field2018) {
                    var13 = this.field2018 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2021 && var17 < this.field2020) {
                                int var18 = this.field2033 * var17 + arg0;
                                int var19 = this.field2017[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2017[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2021 && var21 < this.field2020) {
                                int var22 = this.field2033 * var21 + arg0;
                                int var23 = this.field2017[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2017[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2021 && var27 < this.field2020) {
                            this.field2017[this.field2033 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2021) {
                    var29 += (this.field2021 - arg1) * var31;
                    arg1 = this.field2021;
                }
                if (var32 >= this.field2020) {
                    var32 = this.field2020 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2034 && var46 < this.field2018) {
                            this.field2017[this.field2033 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2034 && var36 < this.field2018) {
                            int var37 = this.field2033 * arg1 + var36;
                            int var38 = this.field2017[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2017[this.field2033 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2034 && var40 < this.field2018) {
                            int var41 = this.field2033 * arg1 + var40;
                            int var42 = this.field2017[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2017[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIII)V", line = 1422)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class613 var8 = this.method1002(Thread.currentThread());
        class394 var9 = var8.field8556;
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
            int var23 = arg0 - var9.method2306();
            int var24 = arg1 - var9.method2316();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field5569 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5569 = 255 - (arg4 >>> 24);
            }
            this.method202(false);
            var9.field5560 = var25 < 0 || var25 > var9.field5561 || var26 < 0 || var26 > var9.field5561 || var27 < 0 || var27 > var9.field5561;
            var9.method2301(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field5560 = var25 < 0 || var25 > var9.field5561 || var27 < 0 || var27 > var9.field5561 || var28 < 0 || var28 > var9.field5561;
            var9.method2301(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method202(true);
        }
    }

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "()Z", line = 1495)
    public final boolean method178() {
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "YA", descriptor = "(IIII)V", line = 1499)
    public final void method153(int arg0, int arg1, int arg2, int arg3) {
        class613 var5 = this.method1002(Thread.currentThread());
        var5.field8513 = arg0;
        var5.field8529 = arg1;
        var5.field8533 = arg2;
    }

    @OriginalMember(owner = "client!kt", name = "ja", descriptor = "(I)V", line = 1507)
    public final void method101(int arg0) {
        this.method110(0, 0, this.field2033, this.field2048, arg0, 0);
    }

    @OriginalMember(owner = "client!kt", name = "FA", descriptor = "(ILua;II)V", line = 1511)
    public final void method112(int arg0, class618 arg1, int arg2, int arg3) {
        class521 var5 = (class521) arg1;
        int[] var6 = var5.field7091;
        int[] var7 = var5.field7089;
        int var8;
        if (this.field2020 < var6.length + arg3) {
            var8 = this.field2020 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2021 > arg3) {
            var9 = this.field2021 - arg3;
            arg3 = this.field2021;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2033 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2034 > var12) {
                    var13 -= this.field2034 - var12;
                    var12 = this.field2034;
                }
                if (this.field2018 < var12 + var13) {
                    var13 = this.field2018 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2017[var14++] = arg0;
                }
                var10 += this.field2033;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "(I)Z", line = 1568)
    public final boolean method997(int arg0) {
        return super.field2418.method1365(-17951, arg0).field9779;
    }

    @OriginalMember(owner = "client!kt", name = "GA", descriptor = "(II)V", line = 1572)
    public final void method182(int arg0, int arg1) {
        class613 var3 = this.method1002(Thread.currentThread());
        this.field2035 = arg0;
        this.field2049 = arg1;
        var3.field8528 = this.field2049 - 255;
    }

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "(I)I", line = 1579)
    public final int method998(int arg0) {
        return super.field2418.method1365(-17951, arg0).field9777 & 65535;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)Lf;", line = 1583)
    public final class702 method170(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class678(this, arg0, arg1) : new class132(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "(I)[I", line = 1593)
    private final int[] method999(int arg0) {
        class663 var2 = this.field2023;
        class573 var3;
        synchronized (this.field2023) {
            var3 = (class573) this.field2023.method3747((byte) -66, (long) arg0);
            if (var3 == null) {
                if (!super.field2418.method1367(arg0, false)) {
                    return null;
                }
                class686 var5 = super.field2418.method1365(-17951, arg0);
                int var6 = !var5.field9795 && !this.field2047 ? 128 : 64;
                var3 = new class573(arg0, var6, super.field2418.method1370(0.7F, true, var6, (byte) -16, var6, arg0), var5.field9793);
                this.field2023.method3748((long) arg0, var3, 12537);
            }
        }
        var3.field8114 = true;
        return var3.method3274();
    }

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "()V", line = 1613)
    public final void method135() {
        this.field2023.method3749(7648);
        this.field2025.method3749(7648);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)I", line = 1617)
    public final int method114(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V", line = 1621)
    public final void method194(int arg0) {
        int var2 = arg0 - this.field2009;
        for (Object var3 = this.field2023.method3753((byte) 108); var3 != null; var3 = this.field2023.method3741((byte) -30)) {
            class573 var4 = (class573) var3;
            if (var4.field8114) {
                var4.field8112 += var2;
                int var5 = var4.field8112 / 20;
                if (var5 > 0) {
                    class686 var6 = super.field2418.method1365(-17951, var4.field8110);
                    var4.method3272(var6.field9785 * var2 * 50 / 1000, var6.field9787 * var2 * 50 / 1000);
                    var4.field8112 -= var5 * 20;
                }
                var4.field8114 = false;
            }
        }
        this.field2009 = arg0;
        this.field2025.method3754(5, true);
        this.field2023.method3754(5, true);
    }

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "()V", line = 1655)
    private final void method1000() {
        for (int var1 = 0; var1 < this.field2016; ++var1) {
            this.field2032[var1].method3433(119);
        }
        this.method193();
    }

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "(IIIIII)V", line = 1664)
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2034) {
            arg2 -= this.field2034 - arg0;
            arg0 = this.field2034;
        }
        if (arg1 < this.field2021) {
            arg3 -= this.field2021 - arg1;
            arg1 = this.field2021;
        }
        if (arg0 + arg2 > this.field2018) {
            arg2 = this.field2018 - arg0;
        }
        if (arg1 + arg3 > this.field2020) {
            arg3 = this.field2020 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2018 && arg1 <= this.field2020) {
            int var7 = this.field2033 - arg2;
            int var8 = this.field2033 * arg1 + arg0;
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
                            this.field2017[var24] = arg4;
                            ++var24;
                            this.field2017[var24] = arg4;
                            ++var24;
                            this.field2017[var24] = arg4;
                            ++var24;
                            this.field2017[var24] = arg4;
                            ++var24;
                            this.field2017[var24] = arg4;
                            ++var24;
                            this.field2017[var24] = arg4;
                            ++var24;
                            this.field2017[var24] = arg4;
                            ++var24;
                            this.field2017[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2017[var24] = arg4;
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
                        int var14 = this.field2017[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field2017[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2017[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2017[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "()V", line = 1799)
    public final void method100() throws class39 {
        if (this.field2012 != null && this.field2014 != null) {
            try {
                Graphics var1 = this.field2012.getGraphics();
                this.field2014.method862(var1, true, 0, 0);
            } catch (Exception var2) {
                this.field2012.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "()Z", line = 1815)
    public final boolean method87() {
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "()Lq;", line = 1818)
    public final class392 method144() {
        return this.field2039;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lqga;Z)Lf;", line = 1822)
    public final class702 method146(class168 arg0, boolean arg1) {
        int[] var3 = arg0.field2442;
        byte[] var4 = arg0.field2450;
        int var5 = arg0.field2445;
        int var6 = arg0.field2449;
        class612 var11;
        if (arg1 && arg0.field2447 == null) {
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
            var11 = new class634(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2447;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class678(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class132(this, var14, var5, var6);
            }
        }
        var11.method1663(arg0.field2446, arg0.field2448, arg0.field2443, arg0.field2444);
        return var11;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)I", line = 1925)
    public final int method134(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lfa;)V", line = 2316)
    private class142(class212 arg0) {
        super(arg0);
        this.field2010 = false;
        this.field2013 = false;
        this.field2011 = new class139(4);
        this.field2018 = 0;
        this.field2015 = 512;
        this.field2020 = 0;
        this.field2027 = 45823;
        this.field2034 = 0;
        this.field2035 = 50;
        this.field2041 = 75518;
        this.field2031 = 0;
        this.field2044 = 512;
        this.field2049 = 3500;
        this.field2021 = 0;
        this.field2047 = false;
        this.field2046 = 78642;
        this.field2030 = 0;
        this.field2025 = new class663(16);
        this.field2050 = -1;
        this.field2023 = new class663(256);
        this.field2039 = new class384();
        this.method191(1);
        this.method173(0);
        class581.method3314(false, true, 119);
        this.field2013 = true;
        this.field2009 = (int) class577.method3295((byte) 15);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)V", line = 1932)
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(Z)V", line = 1934)
    public final void method157(boolean arg0) {
    }

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "()Z", line = 1937)
    public final boolean method192() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "()Z", line = 1940)
    public final boolean method189() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "()V", line = 1943)
    public final void method96() {
        if (this.field2012 != null) {
            this.field2017 = this.field2014.field4492;
            this.field2033 = this.field2014.field4487;
            this.field2048 = this.field2014.field4493;
        } else {
            this.field2033 = 1;
            this.field2048 = 1;
            this.field2017 = null;
        }
        this.field2019 = null;
        this.method1000();
    }

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "()Lho;", line = 1960)
    public final class134 method151() {
        return new class134(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!kt", name = "va", descriptor = "(I)V", line = 1962)
    public final void method139(int arg0) {
    }

    @OriginalMember(owner = "client!kt", name = "oa", descriptor = "([I)V", line = 1965)
    public final void method174(int[] arg0) {
        arg0[0] = this.field2034;
        arg0[1] = this.field2021;
        arg0[2] = this.field2018;
        arg0[3] = this.field2020;
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(IIIII)V", line = 1971)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2021) {
            var6 = this.field2021;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2020) {
            var7 = this.field2020;
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
                if (var64 < this.field2034) {
                    var64 = this.field2034;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2018) {
                    var65 = this.field2018;
                }
                int var66 = this.field2033 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2017[var66++] = arg3;
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
                if (var60 < this.field2034) {
                    var60 = this.field2034;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2018 - 1) {
                    var61 = this.field2018 - 1;
                }
                int var62 = this.field2033 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2017[var62++] = arg3;
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
                if (var28 < this.field2034) {
                    var28 = this.field2034;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2018) {
                    var29 = this.field2018;
                }
                int var30 = this.field2033 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2017[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2017[var30++] = var15 + var33;
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
                if (var22 < this.field2034) {
                    var22 = this.field2034;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2018 - 1) {
                    var23 = this.field2018 - 1;
                }
                int var24 = this.field2033 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2017[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2017[var24++] = var15 + var27;
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
                if (var47 < this.field2034) {
                    var47 = this.field2034;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2018) {
                    var48 = this.field2018;
                }
                int var49 = this.field2033 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2017[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2017[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2034) {
                    var39 = this.field2034;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2018 - 1) {
                    var40 = this.field2018 - 1;
                }
                int var41 = this.field2033 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2017[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2017[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[Ltw;)V", line = 2256)
    public final void method183(int arg0, class186[] arg1) {
    }

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "()V", line = 2258)
    public final void method125() {
    }

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "()Z", line = 2261)
    public final boolean method107() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIIIIII)V", line = 2265)
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class613 var11 = this.method1002(Thread.currentThread());
        class394 var12 = var11.field8556;
        var12.field5571 = false;
        int var13 = arg0 - this.field2022;
        int var14 = arg2 - this.field2022;
        int var15 = arg4 - this.field2022;
        int var16 = arg1 - this.field2036;
        int var17 = arg3 - this.field2036;
        int var18 = arg5 - this.field2036;
        var12.field5560 = var13 < 0 || var13 > var12.field5561 || var14 < 0 || var14 > var12.field5561 || var15 < 0 || var15 > var12.field5561;
        var12.field5559 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field5569 = 255 - var19;
                var12.field5570 = false;
                var12.method2315(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field5569 = 128;
                var12.field5570 = true;
                var12.method2315(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field5569 = 0;
            var12.field5570 = false;
            var12.method2315(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field5571 = true;
        var12.field5559 = false;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "()I", line = 2308)
    public final int method169() {
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "()Z", line = 2312)
    public final boolean method1001() {
        return this.field2010;
    }

    @OriginalMember(owner = "client!kt", name = "AA", descriptor = "(III[I)V", line = 2327)
    public final void method155(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2039.field5439 + (float) arg0 * this.field2039.field5454 + (float) arg1 * this.field2039.field5437 + this.field2039.field5443;
        if (!(var5 < (float) this.field2035) && !(var5 > (float) this.field2049)) {
            int var6 = (int) (((float) arg2 * this.field2039.field5453 + (float) arg0 * this.field2039.field5432 + (float) arg1 * this.field2039.field5430 + this.field2039.field5441) * (float) this.field2015 / var5);
            int var7 = (int) (((float) arg2 * this.field2039.field5434 + (float) arg0 * this.field2039.field5450 + (float) arg1 * this.field2039.field5447 + this.field2039.field5438) * (float) this.field2044 / var5);
            if (var6 >= this.field2022 && var6 <= this.field2024 && var7 >= this.field2036 && var7 <= this.field2045) {
                arg3[0] = var6 - this.field2022;
                arg3[1] = var7 - this.field2036;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kt", name = "V", descriptor = "(IIII)V", line = 2352)
    public final void method123(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2034 < arg0) {
            this.field2034 = arg0;
        }
        if (this.field2021 < arg1) {
            this.field2021 = arg1;
        }
        if (this.field2018 > arg2) {
            this.field2018 = arg2;
        }
        if (this.field2020 > arg3) {
            this.field2020 = arg3;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "()Z", line = 2367)
    public final boolean method88() {
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([IIIII)Lf;", line = 2371)
    public final class702 method175(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class678(this, arg0, arg1, arg2, arg3, arg4) : new class132(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class678(this, arg0, arg1, arg2, arg3, arg4) : new class132(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/Runnable;)Llw;", line = 2408)
    public final class613 method1002(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2016; ++var2) {
            if (this.field2032[var2].field8523 == arg0) {
                return this.field2032[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "()[I", line = 2420)
    public final int[] method124() {
        return new int[] { this.field2037, this.field2042, this.field2015, this.field2044 };
    }

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "()Lq;", line = 2423)
    public final class392 method168() {
        return new class384();
    }

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "()Z", line = 2426)
    public final boolean method120() {
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "ya", descriptor = "()V", line = 2429)
    public final void method89() {
        if (this.field2034 == 0 && this.field2033 == this.field2018 && this.field2021 == 0 && this.field2048 == this.field2020) {
            int var1 = this.field2038.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field2038[var3++] = Integer.MAX_VALUE;
                this.field2038[var3++] = Integer.MAX_VALUE;
                this.field2038[var3++] = Integer.MAX_VALUE;
                this.field2038[var3++] = Integer.MAX_VALUE;
                this.field2038[var3++] = Integer.MAX_VALUE;
                this.field2038[var3++] = Integer.MAX_VALUE;
                this.field2038[var3++] = Integer.MAX_VALUE;
                this.field2038[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field2038[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field2018 - this.field2034;
            int var5 = this.field2020 - this.field2021;
            int var6 = this.field2033 - var4;
            int var7 = this.field2033 * this.field2021 + this.field2034;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field2038[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "ZA", descriptor = "(Z)V", line = 2511)
    public final void method202(boolean arg0) {
        class613 var2 = this.method1002(Thread.currentThread());
        var2.field8517 = arg0;
    }

    @OriginalMember(owner = "client!kt", name = "pa", descriptor = "(III)V", line = 2517)
    public final void method131(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2032.length; ++var4) {
            class613 var5 = this.field2032[var4];
            var5.field8529 = arg0 & 16777215;
            int var6 = var5.field8529 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field8529 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field8529 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field8529 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field8522 = false;
            } else {
                var5.field8522 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)Le;", line = 2549)
    public final class493 method185(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "()V", line = 2554)
    public final void method143() {
        for (int var1 = 0; var1 < this.field2032.length; ++var1) {
            this.field2032[var1].field8529 = this.field2032[var1].field8527;
            this.field2032[var1].field8530 = false;
        }
    }

    @OriginalMember(owner = "client!kt", name = "IA", descriptor = "(IIIIII[BII)V", line = 2564)
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2033 * arg1 + arg0;
            int var15 = this.field2033 - arg2;
            if (arg1 + arg3 > this.field2020) {
                arg3 -= arg1 + arg3 - this.field2020;
            }
            if (arg1 < this.field2021) {
                int var16 = this.field2021 - arg1;
                arg3 -= var16;
                var14 += this.field2033 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2018) {
                int var17 = arg0 + arg2 - this.field2018;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2034) {
                int var18 = this.field2034 - arg0;
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
                            int var28 = this.field2017[var14];
                            this.field2017[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2017[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2017[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2017[var14++] = arg5;
                        } else {
                            this.field2017[var14++] = arg4;
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

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(IIIIII)Lwn;", line = 2739)
    public final class674 method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "XA", descriptor = "(IIIII)V", line = 2746)
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2021 && arg1 < this.field2020) {
            if (arg0 < this.field2034) {
                arg2 -= this.field2034 - arg0;
                arg0 = this.field2034;
            }
            if (arg0 + arg2 > this.field2018) {
                arg2 = this.field2018 - arg0;
            }
            int var6 = this.field2033 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2017[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2017[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2017[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2017[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2017[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lvn;[Lqga;Z)Lla;", line = 2819)
    public final class417 method129(class283 arg0, class168[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2445;
            var5[var7] = arg1[var7].field2449;
            if (arg1[var7].field2447 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class580(this, arg0, arg1, var4, var5);
            } else {
                return new class530(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class211(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!kt", name = "BA", descriptor = "()I", line = 2856)
    public final int method133() {
        return this.field2035;
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)V", line = 2863)
    public final void method187(int arg0) {
    }

    @OriginalMember(owner = "client!kt", name = "VA", descriptor = "(IFFFFF)V", line = 2868)
    public final void method117(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2027 = (int) (arg1 * 65535.0F);
        this.field2046 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2026 = (int) (arg3 * 65535.0F / var7);
        this.field2040 = (int) (arg4 * 65535.0F / var7);
        this.field2043 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([I)V", line = 2877)
    public final void method158(int[] arg0) {
        arg0[0] = this.field2033;
        arg0[1] = this.field2048;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lf;Z)V", line = 2885)
    public final void method164(class702 arg0, boolean arg1) {
        if (arg0 instanceof class132) {
            class132 var3 = (class132) arg0;
            this.field2033 = var3.field8483;
            this.field2048 = var3.field8505;
            this.field2017 = var3.field1892;
            this.field2019 = arg0;
        } else {
            if (!(arg0 instanceof class678)) {
                throw new RuntimeException();
            }
            class678 var4 = (class678) arg0;
            this.field2033 = var4.field8483;
            this.field2048 = var4.field8505;
            this.field2017 = var4.field9712;
            this.field2019 = arg0;
        }
        this.method1000();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 2915)
    public final class37 method195(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class536(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kt", name = "T", descriptor = "()I", line = 2923)
    public final int method97() {
        int var1 = this.field2031;
        this.field2031 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "(IIII)[I", line = 2932)
    public final int[] method148(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2033 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2017[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "(I)Z", line = 2958)
    public final boolean method1003(int arg0) {
        return this.field2047 || super.field2418.method1365(-17951, arg0).field9795;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 2966)
    public class142(Canvas arg0, class212 arg1) {
        this(arg1);
        this.method204(arg0);
        this.method86(arg0);
    }

    @OriginalMember(owner = "client!kt", name = "DA", descriptor = "()I", line = 2986)
    public final int method184() {
        int var1 = this.field2030;
        this.field2030 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lwn;)V", line = 2999)
    public final void method128(class674 arg0) {
    }

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "()V", line = 3017)
    public final void method104() {
    }
}
