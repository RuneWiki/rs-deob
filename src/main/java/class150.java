import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class150 extends class129 {

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Z")
    private boolean field1975;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Z")
    private boolean field1980;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Ljr;")
    private class357 field1979;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public int field1984;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Z")
    public boolean field1993;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "Z")
    private boolean field2018;

    @OriginalMember(owner = "client!fe", name = "mb", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lad;")
    private class11 field2020;

    @OriginalMember(owner = "client!fe", name = "nb", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "Lad;")
    private class11 field2008;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "Lse;")
    public class155 field1999;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "F")
    private float field2019;

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "F")
    private float field2021;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "Lf;")
    private class404 field2003;

    @OriginalMember(owner = "client!fe", name = "ob", descriptor = "Lf;")
    private class404 field2024;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lrm;")
    private class78 field1977;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1976;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Z")
    public boolean field1994;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "[I")
    public int[] field2010;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "[Ldb;")
    private class115[] field2015;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIII)V", line = 3)
    public final void method1028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field1765.method460(-26282, arg5).field7335) {
                if (this.field2023 != arg5) {
                    class404 var10 = (class404) this.field2020.method78((long) arg5, (byte) -113);
                    if (var10 == null) {
                        int[] var11 = this.method1032(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method1036(arg5) ? 64 : 128;
                        var10 = this.method921(var11, 0, var12, var12, var12);
                        this.field2020.method88((long) arg5, 119, var10);
                    }
                    this.field2023 = arg5;
                    this.field2024 = var10;
                }
                this.field2024.method356(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method883(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 36)
    public final class251 method909(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class400(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "()Z", line = 40)
    public final boolean method903() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ll;)V", line = 42)
    public final void method832(class125 arg0) {
    }

    @OriginalMember(owner = "client!fe", name = "ua", descriptor = "(F)V", line = 45)
    public final void method901(float arg0) {
        this.field1998 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "(I)V", line = 48)
    public final void method900(int arg0) {
        this.method861(0, 0, this.field2013, this.field1997, arg0, 0);
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "(I)[I", line = 52)
    public final int[] method1029(int arg0) {
        class11 var2 = this.field2008;
        class123 var3;
        synchronized (this.field2008) {
            var3 = (class123) this.field2008.method78((long) arg0, (byte) -123);
            if (var3 == null) {
                if (!super.field1765.method461(arg0, false)) {
                    return null;
                }
                class499 var5 = super.field1765.method460(-26282, arg0);
                int var6 = !var5.field7331 && !this.field2018 ? 128 : 64;
                var3 = new class123(arg0, var6, super.field1765.method458(0.7F, var6, var6, (byte) 0, true, arg0), var5.field7337);
                this.field2008.method88((long) arg0, 86, var3);
            }
        }
        var3.field1712 = true;
        return var3.method782();
    }

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "()V", line = 72)
    public final void method893() {
        if (this.field1975) {
            class44.method284(false, true, (byte) 9);
            this.field1975 = false;
        }
        this.field1977 = null;
        this.field1976 = null;
        this.field1979 = null;
        this.field1980 = true;
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "()Lia;", line = 85)
    public final class142 method847() {
        class115 var1 = this.method1039(Thread.currentThread());
        return var1.field1573;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 90)
    public final void method818(int arg0) {
        int var2 = arg0 - this.field1978;
        for (Object var3 = this.field2008.method91(-4110); var3 != null; var3 = this.field2008.method82((byte) 23)) {
            class123 var4 = (class123) var3;
            if (var4.field1712) {
                var4.field1713 += var2;
                int var5 = var4.field1713 / 20;
                if (var5 > 0) {
                    class499 var6 = super.field1765.method460(-26282, var4.field1710);
                    var4.method784(var6.field7329 * var2 * 50 / 1000, var6.field7340 * var2 * 50 / 1000);
                    var4.field1713 -= var5 * 20;
                }
                var4.field1712 = false;
            }
        }
        this.field1978 = arg0;
        this.field2020.method80(-58, 5);
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V", line = 121)
    public final void method874(int arg0) {
        this.field2015[arg0].method747(Thread.currentThread(), (byte) -122);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIF)Lve;", line = 124)
    public final class182 method870(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "(III)V", line = 130)
    public final void method842(int arg0, int arg1, int arg2) {
        this.field1986 = arg0 & 16777215;
        int var4 = this.field1986 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field1986 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field1986 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field1986 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field1994 = false;
        } else {
            this.field1994 = true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "(IIIII)V", line = 157)
    public final void method883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field2009) {
            var6 = this.field2009;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2004) {
            var7 = this.field2004;
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
                if (var64 < this.field2014) {
                    var64 = this.field2014;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field1992) {
                    var65 = this.field1992;
                }
                int var66 = this.field2013 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2010[var66++] = arg3;
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
                if (var60 < this.field2014) {
                    var60 = this.field2014;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field1992 - 1) {
                    var61 = this.field1992 - 1;
                }
                int var62 = this.field2013 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2010[var62++] = arg3;
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
                if (var28 < this.field2014) {
                    var28 = this.field2014;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field1992) {
                    var29 = this.field1992;
                }
                int var30 = this.field2013 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2010[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2010[var30++] = var15 + var33;
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
                if (var22 < this.field2014) {
                    var22 = this.field2014;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field1992 - 1) {
                    var23 = this.field1992 - 1;
                }
                int var24 = this.field2013 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2010[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2010[var24++] = var15 + var27;
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
                if (var47 < this.field2014) {
                    var47 = this.field2014;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field1992) {
                    var48 = this.field1992;
                }
                int var49 = this.field2013 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2010[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2010[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2014) {
                    var39 = this.field2014;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field1992 - 1) {
                    var40 = this.field1992 - 1;
                }
                int var41 = this.field2013 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2010[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2010[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V", line = 444)
    public final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class115 var8 = this.method1039(Thread.currentThread());
        class320 var9 = var8.field1567;
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
            int var21 = arg0 - var9.method1914();
            int var22 = arg1 - var9.method1903();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field4121 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field4121 = 255 - (arg4 >> 24);
            }
            var9.field4124 = var23 < 0 || var23 > var9.field4122 || var24 < 0 || var24 > var9.field4122 || var25 < 0 || var25 > var9.field4122;
            var9.method1906(var27, var28, var29, var23, var24, var25, arg4);
            var9.field4124 = var23 < 0 || var23 > var9.field4122 || var24 < 0 || var24 > var9.field4122 || var26 < 0 || var26 > var9.field4122;
            var9.method1906(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!fe", name = "SA", descriptor = "(IIIIII)Z", line = 515)
    public final boolean method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field1999.field2061 * arg2 + this.field1999.field2059 * arg0 + this.field1999.field2056 * arg1 >> 15) + this.field1999.field2053;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field1999.field2061 * arg5 + this.field1999.field2059 * arg3 + this.field1999.field2056 * arg4 >> 15) + this.field1999.field2053;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field2000 || var8 >= this.field2000) && (var7 <= this.field1996 || var8 <= this.field1996)) {
            int var9 = ((this.field1999.field2054 * arg2 + this.field1999.field2060 * arg1 + this.field1999.field2051 * arg0 >> 15) + this.field1999.field2057) * this.field2005 / var7;
            int var10 = ((this.field1999.field2054 * arg5 + this.field1999.field2060 * arg4 + this.field1999.field2051 * arg3 >> 15) + this.field1999.field2057) * this.field2005 / var8;
            if (var9 < this.field2016 && var10 < this.field2016 || var9 > this.field1987 && var10 > this.field1987) {
                return false;
            } else {
                int var11 = ((this.field1999.field2058 * arg2 + this.field1999.field2055 * arg0 + this.field1999.field2052 * arg1 >> 15) + this.field1999.field2050) * this.field1984 / var7;
                int var12 = ((this.field1999.field2058 * arg5 + this.field1999.field2055 * arg3 + this.field1999.field2052 * arg4 >> 15) + this.field1999.field2050) * this.field1984 / var8;
                return (var11 >= this.field2001 || var12 >= this.field2001) && (var11 <= this.field2017 || var12 <= this.field2017);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()Z", line = 544)
    public final boolean method834() {
        return true;
    }

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "()Z", line = 548)
    public final boolean method1030() {
        return this.field1980;
    }

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "()Z", line = 551)
    public final boolean method923() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "()Z", line = 555)
    public final boolean method884() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "pa", descriptor = "(IIII)V", line = 558)
    public final void method925(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field2013) {
            arg2 = this.field2013;
        }
        if (arg3 > this.field1997) {
            arg3 = this.field1997;
        }
        this.field2014 = arg0;
        this.field1992 = arg2;
        this.field2009 = arg1;
        this.field2004 = arg3;
        this.method1033();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 576)
    public final void method825(boolean arg0) {
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 580)
    public final void method895(Canvas arg0) {
        class78 var2 = (class78) this.field1979.method2085((long) arg0.hashCode(), -5423);
        if (var2 == null) {
            class78 var3 = class121.method772(24429, arg0);
            this.field1979.method2096((long) arg0.hashCode(), var3, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()I", line = 589)
    public final int method871() {
        return this.field2000;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIILea;II)V", line = 593)
    public final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class113 arg6, int arg7, int arg8) {
        class64 var10 = (class64) arg6;
        int[] var11 = var10.field815;
        int[] var12 = var10.field816;
        int var13 = this.field2009 > arg8 ? this.field2009 : arg8;
        int var14 = this.field2004 < var11.length + arg8 ? this.field2004 : var11.length + arg8;
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
            if (arg0 < this.field2014) {
                var18 += (this.field2014 - arg0) * var20;
                arg0 = this.field2014;
            }
            if (var21 >= this.field1992) {
                var21 = this.field1992 - 1;
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
                                int var28 = this.field2013 * var25 + arg0;
                                int var29 = this.field2010[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2010[var28] = var23 + var30;
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
                                int var34 = this.field2013 * var31 + arg0;
                                int var35 = this.field2010[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2010[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2010[this.field2013 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2014 && var64 < this.field1992 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2010[this.field2013 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2014 && var50 < this.field1992 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field2013 * arg1 + var50;
                        int var54 = this.field2010[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2010[this.field2013 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2014 && var56 < this.field1992 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field2013 * arg1 + var56;
                        int var60 = this.field2010[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2010[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "()V", line = 830)
    public final void method911() {
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "()I", line = 834)
    public final int method872() {
        int var1 = this.field1995;
        this.field1995 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "()Z", line = 839)
    public final boolean method886() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "(I)Z", line = 842)
    public final boolean method1031(int arg0) {
        return super.field1765.method461(arg0, false);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I", line = 845)
    public final int method880(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[Lve;)V", line = 848)
    public final void method906(int arg0, class182[] arg1) {
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 852)
    public final void method852(Canvas arg0) {
        class78 var2 = (class78) this.field1979.method2085((long) arg0.hashCode(), -5423);
        if (var2 != null) {
            var2.method3021(-110);
            class78 var3 = class121.method772(24429, arg0);
            this.field1979.method2096((long) arg0.hashCode(), var3, (byte) 76);
            if (this.field1976 == arg0 && this.field2003 == null) {
                this.field1977 = var3;
                this.field2010 = var3.field996;
                this.field2013 = var3.field992;
                this.field1997 = var3.field991;
                this.method1035();
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V", line = 871)
    public final void method908(int arg0) {
        this.field2015[arg0].method747((Runnable) null, (byte) -74);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lvh;)V", line = 873)
    public final void method862(class191 arg0) {
    }

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "()Z", line = 877)
    public final boolean method897() {
        return true;
    }

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "()F", line = 880)
    public final float method828() {
        return this.field2019;
    }

    @OriginalMember(owner = "client!fe", name = "na", descriptor = "(I)V", line = 882)
    public final void method922(int arg0) {
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIZ)Lf;", line = 886)
    public final class404 method905(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field2013 * arg1 + arg0;
        int var8 = this.field2013 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2010[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class209(this, var6, arg2, arg3);
        } else {
            return new class62(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!fe", name = "ba", descriptor = "(IIII)V", line = 918)
    public final void method848(int arg0, int arg1, int arg2, int arg3) {
        this.field2012 = arg0;
        this.field1986 = arg1;
        this.field1983 = arg2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[I[I)Lea;", line = 923)
    public final class113 method896(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class64(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "()V", line = 927)
    public final void method856() {
        if (this.field1976 != null && this.field1977 != null) {
            try {
                Graphics var1 = this.field1976.getGraphics();
                this.field1977.method448(0, (byte) 39, var1, 0);
            } catch (Exception var2) {
                this.field1976.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V", line = 942)
    public final void method841() {
    }

    @OriginalMember(owner = "client!fe", name = "GA", descriptor = "(IIII)V", line = 945)
    public final void method821(int arg0, int arg1, int arg2, int arg3) {
        this.field2011 = arg0;
        this.field1985 = arg1;
        this.field2005 = arg2;
        this.field1984 = arg3;
        this.method1033();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V", line = 951)
    public final void method845(boolean arg0) {
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I", line = 954)
    public final int method885(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "()Z", line = 957)
    public final boolean method898() {
        return true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lc;Liv;Lia;Laq;I)V", line = 960)
    public final void method824(class507 arg0, class287 arg1, class142 arg2, class530 arg3, int arg4) {
        ((class84) arg0).method479(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "(IIIII)V", line = 963)
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field2009 && arg1 < this.field2004) {
            if (arg0 < this.field2014) {
                arg2 -= this.field2014 - arg0;
                arg0 = this.field2014;
            }
            if (arg0 + arg2 > this.field1992) {
                arg2 = this.field1992 - arg0;
            }
            int var6 = this.field2013 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2010[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2010[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2010[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2010[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2010[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILm;)V", line = 1254)
    private class150(int arg0, class79 arg1) {
        super(arg0, arg1);
        this.field1975 = false;
        this.field1980 = false;
        this.field1979 = new class357(4);
        this.field1983 = 0;
        this.field2000 = 50;
        this.field1988 = 3500;
        this.field1992 = 0;
        this.field1984 = 512;
        this.field1981 = 78642;
        this.field1996 = 3500;
        this.field2012 = 0;
        this.field1995 = 0;
        this.field2005 = 512;
        this.field1986 = 0;
        this.field1990 = 0;
        this.field2007 = 45823;
        this.field1998 = 75518;
        this.field2009 = 0;
        this.field1989 = this.field1996 - 255;
        this.field2014 = 0;
        this.field2004 = 0;
        this.field1993 = false;
        this.field2018 = false;
        this.field2022 = 0;
        this.field2020 = new class11(16);
        this.field2023 = -1;
        this.field2008 = new class11(20);
        this.field1999 = new class155();
        this.method914(1);
        this.method874(0);
        class212.method1357(false, -11116, true);
        this.field1975 = true;
    }

    @OriginalMember(owner = "client!fe", name = "NA", descriptor = "(IIIIII)V", line = 1038)
    public final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2014) {
            arg2 -= this.field2014 - arg0;
            arg0 = this.field2014;
        }
        if (arg1 < this.field2009) {
            arg3 -= this.field2009 - arg1;
            arg1 = this.field2009;
        }
        if (arg0 + arg2 > this.field1992) {
            arg2 = this.field1992 - arg0;
        }
        if (arg1 + arg3 > this.field2004) {
            arg3 = this.field2004 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field1992 && arg1 <= this.field2004) {
            int var7 = this.field2013 - arg2;
            int var8 = this.field2013 * arg1 + arg0;
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
                            this.field2010[var24] = arg4;
                            ++var24;
                            this.field2010[var24] = arg4;
                            ++var24;
                            this.field2010[var24] = arg4;
                            ++var24;
                            this.field2010[var24] = arg4;
                            ++var24;
                            this.field2010[var24] = arg4;
                            ++var24;
                            this.field2010[var24] = arg4;
                            ++var24;
                            this.field2010[var24] = arg4;
                            ++var24;
                            this.field2010[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2010[var24] = arg4;
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
                        int var14 = this.field2010[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field2010[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2010[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2010[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lov;[Lne;Z)Loa;", line = 1174)
    public final class167 method867(class278 arg0, class136[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1837;
            var5[var7] = arg1[var7].field1832;
            if (arg1[var7].field1830 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class262(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class229(this, arg0, arg1, var4, var5);
        } else {
            return new class178(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "()Z", line = 1203)
    public final boolean method844() {
        return true;
    }

    @OriginalMember(owner = "client!fe", name = "la", descriptor = "()F", line = 1206)
    public final float method863() {
        return this.field2021;
    }

    @OriginalMember(owner = "client!fe", name = "JA", descriptor = "(II)V", line = 1209)
    public final void method894(int arg0, int arg1) {
        this.field2000 = arg0;
        this.field1996 = arg1;
        this.field1989 = this.field1996 - 255;
        this.method1040();
    }

    @OriginalMember(owner = "client!fe", name = "IA", descriptor = "(IIII)[I", line = 1216)
    public final int[] method835(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field2013 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2010[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "()Z", line = 1241)
    public final boolean method890() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;)V", line = 1244)
    public class150(int arg0, Canvas arg1, class79 arg2) {
        this(arg0, arg2);
        this.method895(arg1);
        this.method919(arg1);
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()I", line = 1249)
    public final int method843() {
        return 0;
    }

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "(I)[I", line = 1264)
    private final int[] method1032(int arg0) {
        class11 var2 = this.field2008;
        class123 var3;
        synchronized (this.field2008) {
            var3 = (class123) this.field2008.method78((long) arg0, (byte) -106);
            if (var3 == null) {
                if (!super.field1765.method461(arg0, false)) {
                    return null;
                }
                class499 var5 = super.field1765.method460(-26282, arg0);
                int var6 = !var5.field7331 && !this.field2018 ? 128 : 64;
                var3 = new class123(arg0, var6, super.field1765.method457(var6, true, 0.7F, 12071, arg0, var6), var5.field7337);
                this.field2008.method88((long) arg0, 71, var3);
            }
        }
        var3.field1712 = true;
        return var3.method782();
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(IIIIII)V", line = 1284)
    public final void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method904(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method904(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method875(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method875(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2014) {
                    var10 += (this.field2014 - arg0) * var12;
                    arg0 = this.field2014;
                }
                if (var13 >= this.field1992) {
                    var13 = this.field1992 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field2009 && var17 < this.field2004) {
                                int var18 = this.field2013 * var17 + arg0;
                                int var19 = this.field2010[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2010[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field2009 && var21 < this.field2004) {
                                int var22 = this.field2013 * var21 + arg0;
                                int var23 = this.field2010[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2010[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field2009 && var27 < this.field2004) {
                            this.field2010[this.field2013 * var27 + arg0] = arg4;
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
                if (arg1 < this.field2009) {
                    var29 += (this.field2009 - arg1) * var31;
                    arg1 = this.field2009;
                }
                if (var32 >= this.field2004) {
                    var32 = this.field2004 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2014 && var46 < this.field1992) {
                            this.field2010[this.field2013 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2014 && var36 < this.field1992) {
                            int var37 = this.field2013 * arg1 + var36;
                            int var38 = this.field2010[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2010[this.field2013 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2014 && var40 < this.field1992) {
                            int var41 = this.field2013 * arg1 + var40;
                            int var42 = this.field2010[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2010[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "([I)V", line = 1499)
    public final void method846(int[] arg0) {
        arg0[0] = this.field2014;
        arg0[1] = this.field2009;
        arg0[2] = this.field1992;
        arg0[3] = this.field2004;
    }

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "()V", line = 1505)
    private final void method1033() {
        this.field2016 = this.field2014 - this.field2011;
        this.field1987 = this.field1992 - this.field2011;
        this.field2001 = this.field2009 - this.field1985;
        this.field2017 = this.field2004 - this.field1985;
        for (int var1 = 0; var1 < this.field2002; ++var1) {
            class320 var5 = this.field2015[var1].field1567;
            var5.field4114 = this.field2011 - this.field2014;
            var5.field4119 = this.field1985 - this.field2009;
            var5.field4122 = this.field1992 - this.field2014;
            var5.field4120 = this.field2004 - this.field2009;
        }
        int var2 = this.field2013 * this.field2009 + this.field2014;
        for (int var3 = this.field2009; var3 < this.field2004; ++var3) {
            for (int var4 = 0; var4 < this.field2002; ++var4) {
                this.field2015[var4].field1567.field4116[var3 - this.field2009] = var2;
            }
            var2 += this.field2013;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1543)
    public final void method817(Rectangle[] arg0, int arg1) {
        if (this.field1976 != null && this.field1977 != null) {
            try {
                Graphics var3 = this.field1976.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field2013 && var5.y <= this.field1997 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field1977.method453(var3, var5.x, var5.height, var5.y, var5.width, -24);
                    }
                }
            } catch (Exception var6) {
                this.field1976.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V", line = 1571)
    public final void method833(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "(I)Z", line = 1574)
    public final boolean method1034(int arg0) {
        return super.field1765.method460(-26282, arg0).field7349;
    }

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "()V", line = 1579)
    private final void method1035() {
        for (int var1 = 0; var1 < this.field2002; ++var1) {
            this.field2015[var1].method750((byte) 76);
        }
        this.method865();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1587)
    public final void method877(Canvas arg0) {
        if (this.field1976 == arg0) {
            this.method919((Canvas) null);
        }
        class78 var2 = (class78) this.field1979.method2085((long) arg0.hashCode(), -5423);
        if (var2 != null) {
            var2.method3021(75);
        }
    }

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "(Lia;)V", line = 1597)
    public final void method829(class142 arg0) {
        this.field1999 = (class155) arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 1599)
    public final void method822() {
    }

    @OriginalMember(owner = "client!fe", name = "xa", descriptor = "()I", line = 1603)
    public final int method889() {
        int var1 = this.field2022;
        this.field2022 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "(IIII)V", line = 1609)
    public final void method899(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2014 < arg0) {
            this.field2014 = arg0;
        }
        if (this.field2009 < arg1) {
            this.field2009 = arg1;
        }
        if (this.field1992 > arg2) {
            this.field1992 = arg2;
        }
        if (this.field2004 > arg3) {
            this.field2004 = arg3;
        }
        this.method1033();
    }

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "()Z", line = 1624)
    public final boolean method854() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIII)V", line = 1628)
    public final void method837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class115 var11 = this.method1039(Thread.currentThread());
        class320 var12 = var11.field1567;
        var12.field4118 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field4118 = false;
            var12.field4121 = 0;
            var12.field4124 = true;
            var12.method1915(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field4118 = false;
            var12.field4121 = 255 - var13;
            var12.field4124 = true;
            var12.method1915(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field4118 = true;
    }

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "()I", line = 1662)
    public final int method876() {
        return this.field1996;
    }

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "(I)Z", line = 1665)
    public final boolean method1036(int arg0) {
        return this.field2018 || super.field1765.method460(-26282, arg0).field7331;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lo;III)V", line = 1672)
    public final void method1037(class355 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field4556;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method883(arg1, arg2, var6, arg0.field4562, 1);
        } else {
            if (this.field2023 != var5) {
                class404 var7 = (class404) this.field2020.method78((long) var5, (byte) -94);
                if (var7 == null) {
                    int[] var8 = this.method1032(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method1036(var5) ? 64 : 128;
                    var7 = this.method921(var8, 0, var9, var9, var9);
                    this.field2020.method88((long) var5, 116, var7);
                }
                this.field2023 = var5;
                this.field2024 = var7;
            }
            if (this.field2024.method370() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field2024.method356(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field4562, 1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "va", descriptor = "()V", line = 1715)
    public final void method865() {
        this.field2014 = 0;
        this.field2009 = 0;
        this.field1992 = this.field2013;
        this.field2004 = this.field1997;
        this.method1033();
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(Z)V", line = 1722)
    public final void method853(boolean arg0) {
        this.field2018 = arg0;
        this.field2008.method90((byte) -27);
    }

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "()Z", line = 1726)
    public final boolean method915() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "FA", descriptor = "()I", line = 1729)
    public final int method917() {
        return 0;
    }

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "()V", line = 1733)
    public final void method892() {
        this.field2008.method90((byte) -27);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lne;Z)Lf;", line = 1737)
    public final class404 method851(class136 arg0, boolean arg1) {
        int[] var3 = arg0.field1831;
        byte[] var4 = arg0.field1833;
        int var5 = arg0.field1837;
        int var6 = arg0.field1832;
        class462 var11;
        if (arg1 && arg0.field1830 == null) {
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
            var11 = new class434(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1830;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class209(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class209(this, var14, var5, var6);
                var11 = new class62(this, var14, var5, var6);
            }
        }
        var11.method379(arg0.field1835, arg0.field1834, arg0.field1838, arg0.field1836);
        return var11;
    }

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "()V", line = 1839)
    public final void method831() {
        this.field1986 = this.field1990;
        this.field1993 = false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Luu;IIII)Lc;", line = 1844)
    public final class507 method888(class420 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class84(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(FFF)V", line = 1846)
    public final void method857(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!fe", name = "aa", descriptor = "(IIIIII[BII)V", line = 1850)
    public final void method864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field2013 * arg1 + arg0;
            int var15 = this.field2013 - arg2;
            if (arg1 + arg3 > this.field2004) {
                arg3 -= arg1 + arg3 - this.field2004;
            }
            if (arg1 < this.field2009) {
                int var16 = this.field2009 - arg1;
                arg3 -= var16;
                var14 += this.field2013 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field1992) {
                int var17 = arg0 + arg2 - this.field1992;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2014) {
                int var18 = this.field2014 - arg0;
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
                            int var28 = this.field2010[var14];
                            this.field2010[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2010[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2010[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2010[var14++] = arg5;
                        } else {
                            this.field2010[var14++] = arg4;
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

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 2025)
    public final void method820(int arg0) {
    }

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "()Lia;", line = 2028)
    public final class142 method916() {
        return new class155();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)Lvh;", line = 2031)
    public final class191 method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIIII)Lf;", line = 2035)
    public final class404 method921(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class209(this, arg0, arg1, arg2, arg3, arg4) : new class62(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class209(this, arg0, arg1, arg2, arg3, arg4) : new class62(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "(FF)V", line = 2071)
    public final void method913(float arg0, float arg1) {
        this.field2021 = arg0;
        this.field2019 = arg1;
        this.method1040();
    }

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "()Z", line = 2076)
    public final boolean method879() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "ia", descriptor = "(III[I)V", line = 2081)
    public final void method855(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field1999.field2061 * arg2 + this.field1999.field2059 * arg0 + this.field1999.field2056 * arg1 >> 15) + this.field1999.field2053;
        if (var5 >= this.field2000 && var5 <= this.field1996) {
            int var6 = ((this.field1999.field2054 * arg2 + this.field1999.field2060 * arg1 + this.field1999.field2051 * arg0 >> 15) + this.field1999.field2057) * this.field2005 / var5;
            int var7 = ((this.field1999.field2058 * arg2 + this.field1999.field2055 * arg0 + this.field1999.field2052 * arg1 >> 15) + this.field1999.field2050) * this.field1984 / var5;
            if (var6 >= this.field2016 && var6 <= this.field1987 && var7 >= this.field2001 && var7 <= this.field2017) {
                arg3[0] = var6 - this.field2016;
                arg3[1] = var7 - this.field2001;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Liv;)V", line = 2106)
    public final void method838(class287 arg0) {
        class37 var2 = arg0.field3665.field6885;
        for (class37 var3 = var2.field568; var2 != var3; var3 = var3.field568) {
            class355 var4 = (class355) var3;
            int var5 = var4.field4558 >> 12;
            int var6 = var4.field4552 >> 12;
            int var7 = var4.field4557 >> 12;
            int var8 = (this.field1999.field2061 * var7 + this.field1999.field2059 * var5 + this.field1999.field2056 * var6 >> 15) + this.field1999.field2053;
            if (var8 >= this.field2000 && var8 <= this.field1989) {
                int var9 = ((this.field1999.field2054 * var7 + this.field1999.field2060 * var6 + this.field1999.field2051 * var5 >> 15) + this.field1999.field2057) * this.field2005 / var8 + this.field2011;
                int var10 = ((this.field1999.field2058 * var7 + this.field1999.field2055 * var5 + this.field1999.field2052 * var6 >> 15) + this.field1999.field2050) * this.field1984 / var8 + this.field1985;
                if (var9 >= this.field2014 && var9 <= this.field1992 && var10 >= this.field2009 && var10 <= this.field2004) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method1037(var4, var9, var10, (var4.field4553 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lc;Liv;Lia;[Laq;I)V", line = 2143)
    public final void method868(class507[] arg0, class287 arg1, class142 arg2, class530[] arg3, int arg4) {
        class84[] var6 = new class84[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class84) arg0[var7];
            }
        }
        class84 var8 = class84.method527(this, var6);
        var8.method479(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!fe", name = "fa", descriptor = "(IIII)V", line = 2158)
    public final void method823(int arg0, int arg1, int arg2, int arg3) {
        this.field1990 = this.field1986;
        this.field2012 = arg0;
        this.field1986 = arg1;
        this.field1983 = arg2;
        this.field1993 = true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lc;Lia;[Laq;I)V", line = 2166)
    public final void method873(class507[] arg0, class142 arg1, class530[] arg2, int arg3) {
        class84[] var5 = new class84[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class84) arg0[var6];
            }
        }
        class84 var7 = class84.method527(this, var5);
        var7.method479(arg1, arg2 != null ? arg2[0] : null, (class287) null, arg3);
    }

    @OriginalMember(owner = "client!fe", name = "XA", descriptor = "(IFFFFF)V", line = 2181)
    public final void method840(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field2007 = (int) (arg1 * 65535.0F);
        this.field1981 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2006 = (int) (arg3 * 65535.0F / var7);
        this.field1982 = (int) (arg4 * 65535.0F / var7);
        this.field1991 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "()Z", line = 2190)
    public final boolean method882() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()V", line = 2193)
    public final void method836() {
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V", line = 2197)
    public final void method914(int arg0) {
        if (this.field2002 != arg0) {
            this.field2002 = arg0;
            this.field2015 = new class115[this.field2002];
            for (int var2 = 0; var2 < this.field2002; ++var2) {
                this.field2015[var2] = new class115(this);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lvh;Lvh;FLvh;)Lvh;", line = 2215)
    public final class191 method860(class191 arg0, class191 arg1, float arg2, class191 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "(I)I", line = 2218)
    public final int method1038(int arg0) {
        return super.field1765.method460(-26282, arg0).field7344 & 65535;
    }

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "()Z", line = 2221)
    public final boolean method924() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(IIIIII)V", line = 2224)
    public final void method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method904(arg0, arg1, arg2, arg4, arg5);
        this.method904(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method875(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method875(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "()Z", line = 2230)
    public final boolean method850() {
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)Ll;", line = 2236)
    public final class125 method849(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Runnable;)Ldb;", line = 2241)
    public final class115 method1039(Runnable arg0) {
        for (int var2 = 0; var2 < this.field2002; ++var2) {
            if (this.field2015[var2].field1569 == arg0) {
                return this.field2015[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "da", descriptor = "(IIIII)V", line = 2253)
    public final void method875(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2014 && arg0 < this.field1992) {
            if (arg1 < this.field2009) {
                arg2 -= this.field2009 - arg1;
                arg1 = this.field2009;
            }
            if (arg1 + arg2 > this.field2004) {
                arg2 = this.field2004 - arg1;
            }
            int var6 = this.field2013 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2013 * var10 + var6;
                        int var12 = this.field2010[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2010[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field2013 * var14 + var6;
                        int var16 = this.field2010[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2010[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2010[this.field2013 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "()V", line = 2329)
    private final void method1040() {
        if (this.field2019 != 0.0F) {
            float var1 = (float) this.field1996;
            float var2 = (float) this.field2000;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field2021 / (this.field2021 + this.field2019);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field2019;
            this.field1988 = (int) (((float) this.field1996 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field1988 = this.field1996;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2350)
    public final void method919(Canvas arg0) {
        if (arg0 != null) {
            class78 var2 = (class78) this.field1979.method2085((long) arg0.hashCode(), -5423);
            if (var2 != null) {
                this.field1976 = arg0;
                this.field1977 = var2;
                if (this.field2003 == null) {
                    this.field2010 = var2.field996;
                    this.field2013 = var2.field992;
                    this.field1997 = var2.field991;
                    this.method1035();
                    return;
                }
            }
        } else {
            this.field1976 = null;
            this.field1977 = null;
            if (this.field2003 == null) {
                this.field2010 = null;
                this.field2013 = this.field1997 = 1;
                this.method1035();
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "(ILea;II)V", line = 2389)
    public final void method912(int arg0, class113 arg1, int arg2, int arg3) {
        class64 var5 = (class64) arg1;
        int[] var6 = var5.field815;
        int[] var7 = var5.field816;
        int var8;
        if (this.field2004 < var6.length + arg3) {
            var8 = this.field2004 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field2009 > arg3) {
            var9 = this.field2009 - arg3;
            arg3 = this.field2009;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field2013 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2014 > var12) {
                    var13 -= this.field2014 - var12;
                    var12 = this.field2014;
                }
                if (this.field1992 < var12 + var13) {
                    var13 = this.field1992 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2010[var14++] = arg0;
                }
                var10 += this.field2013;
            }
        }
    }
}
