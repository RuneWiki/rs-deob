import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class626 extends class98 {

    @OriginalMember(owner = "client!st", name = "p", descriptor = "Z")
    private boolean field9051;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "Z")
    private boolean field9055;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "Lefa;")
    private class322 field9053;

    @OriginalMember(owner = "client!st", name = "A", descriptor = "I")
    public int field9062;

    @OriginalMember(owner = "client!st", name = "B", descriptor = "I")
    public int field9063;

    @OriginalMember(owner = "client!st", name = "F", descriptor = "I")
    public int field9067;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "Z")
    private boolean field9064;

    @OriginalMember(owner = "client!st", name = "M", descriptor = "I")
    public int field9074;

    @OriginalMember(owner = "client!st", name = "T", descriptor = "I")
    private int field9081;

    @OriginalMember(owner = "client!st", name = "V", descriptor = "I")
    public int field9083;

    @OriginalMember(owner = "client!st", name = "U", descriptor = "I")
    public int field9082;

    @OriginalMember(owner = "client!st", name = "L", descriptor = "I")
    public int field9073;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    public int field9061;

    @OriginalMember(owner = "client!st", name = "I", descriptor = "I")
    public int field9070;

    @OriginalMember(owner = "client!st", name = "S", descriptor = "I")
    public int field9080;

    @OriginalMember(owner = "client!st", name = "cb", descriptor = "I")
    public int field9090;

    @OriginalMember(owner = "client!st", name = "db", descriptor = "I")
    private int field9091;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "Lau;")
    private class692 field9057;

    @OriginalMember(owner = "client!st", name = "fb", descriptor = "I")
    private int field9093;

    @OriginalMember(owner = "client!st", name = "P", descriptor = "Lau;")
    private class692 field9077;

    @OriginalMember(owner = "client!st", name = "Q", descriptor = "Lnd;")
    public class121 field9078;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    private int field9052;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "I")
    public int field9058;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "I")
    public int field9060;

    @OriginalMember(owner = "client!st", name = "E", descriptor = "I")
    public int field9066;

    @OriginalMember(owner = "client!st", name = "G", descriptor = "I")
    public int field9068;

    @OriginalMember(owner = "client!st", name = "H", descriptor = "I")
    public int field9069;

    @OriginalMember(owner = "client!st", name = "J", descriptor = "I")
    public int field9071;

    @OriginalMember(owner = "client!st", name = "K", descriptor = "I")
    private int field9072;

    @OriginalMember(owner = "client!st", name = "N", descriptor = "I")
    private int field9075;

    @OriginalMember(owner = "client!st", name = "O", descriptor = "I")
    private int field9076;

    @OriginalMember(owner = "client!st", name = "R", descriptor = "I")
    public int field9079;

    @OriginalMember(owner = "client!st", name = "X", descriptor = "I")
    public int field9085;

    @OriginalMember(owner = "client!st", name = "Y", descriptor = "I")
    public int field9086;

    @OriginalMember(owner = "client!st", name = "ab", descriptor = "I")
    public int field9088;

    @OriginalMember(owner = "client!st", name = "bb", descriptor = "I")
    public int field9089;

    @OriginalMember(owner = "client!st", name = "Z", descriptor = "Lf;")
    private class256 field9087;

    @OriginalMember(owner = "client!st", name = "eb", descriptor = "Lf;")
    private class256 field9092;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "Lnca;")
    private class552 field9056;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9054;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "[I")
    public int[] field9059;

    @OriginalMember(owner = "client!st", name = "D", descriptor = "[I")
    public int[] field9065;

    @OriginalMember(owner = "client!st", name = "W", descriptor = "[Lqb;")
    private class56[] field9084;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(IIIII)V", line = 3)
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field9074) {
            var6 = this.field9074;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field9062) {
            var7 = this.field9062;
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
                if (var64 < this.field9080) {
                    var64 = this.field9080;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field9063) {
                    var65 = this.field9063;
                }
                int var66 = this.field9085 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field9065[var66++] = arg3;
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
                if (var60 < this.field9080) {
                    var60 = this.field9080;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field9063 - 1) {
                    var61 = this.field9063 - 1;
                }
                int var62 = this.field9085 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field9065[var62++] = arg3;
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
                if (var28 < this.field9080) {
                    var28 = this.field9080;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field9063) {
                    var29 = this.field9063;
                }
                int var30 = this.field9085 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field9065[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field9065[var30++] = var15 + var33;
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
                if (var22 < this.field9080) {
                    var22 = this.field9080;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field9063 - 1) {
                    var23 = this.field9063 - 1;
                }
                int var24 = this.field9085 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field9065[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field9065[var24++] = var15 + var27;
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
                if (var47 < this.field9080) {
                    var47 = this.field9080;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field9063) {
                    var48 = this.field9063;
                }
                int var49 = this.field9085 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field9065[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field9065[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field9080) {
                    var39 = this.field9080;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field9063 - 1) {
                    var40 = this.field9063 - 1;
                }
                int var41 = this.field9085 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field9065[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field9065[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "g", descriptor = "(I)I", line = 289)
    public final int method3597(int arg0) {
        return super.field1491.method955(-1330, arg0).field6597 & 65535;
    }

    @OriginalMember(owner = "client!st", name = "y", descriptor = "()Z", line = 293)
    public final boolean method686() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V", line = 297)
    public final void method639(int arg0) {
        int var2 = arg0 - this.field9052;
        for (Object var3 = this.field9077.method3902((byte) 62); var3 != null; var3 = this.field9077.method3893(-15482)) {
            class207 var4 = (class207) var3;
            if (var4.field2816) {
                var4.field2815 += var2;
                int var5 = var4.field2815 / 20;
                if (var5 > 0) {
                    class457 var6 = super.field1491.method955(-1330, var4.field2817);
                    var4.method1327(var6.field6601 * var2 * 50 / 1000, var6.field6607 * var2 * 50 / 1000);
                    var4.field2815 -= var5 * 20;
                }
                var4.field2816 = false;
            }
        }
        this.field9052 = arg0;
        this.field9057.method3900(5, 0);
        this.field9077.method3900(5, 0);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lfo;[Lut;Z)Lla;", line = 330)
    public final class393 method684(class606 arg0, class616[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8869;
            var5[var7] = arg1[var7].field8868;
            if (arg1[var7].field8875 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class585(this, arg0, arg1, var4, var5);
            } else {
                return new class472(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class633(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!st", name = "T", descriptor = "()I", line = 369)
    public final int method627() {
        int var1 = this.field9081;
        this.field9081 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!st", name = "V", descriptor = "(IIII)V", line = 374)
    public final void method692(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9080 < arg0) {
            this.field9080 = arg0;
        }
        if (this.field9074 < arg1) {
            this.field9074 = arg1;
        }
        if (this.field9063 > arg2) {
            this.field9063 = arg2;
        }
        if (this.field9062 > arg3) {
            this.field9062 = arg3;
        }
        this.method3604();
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(IIIIII)Lrs;", line = 389)
    public final class649 method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!st", name = "x", descriptor = "()Z", line = 392)
    public final boolean method685() {
        return true;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 395)
    public final void method672(Canvas arg0) {
        if (this.field9054 == arg0) {
            this.method709((Canvas) null);
        }
        class552 var2 = (class552) this.field9053.method2002((byte) -123, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2360((byte) 66);
        }
    }

    @OriginalMember(owner = "client!st", name = "da", descriptor = "(IIII)V", line = 406)
    public final void method652(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field9085) {
            arg2 = this.field9085;
        }
        if (arg3 > this.field9076) {
            arg3 = this.field9076;
        }
        this.field9080 = arg0;
        this.field9063 = arg2;
        this.field9074 = arg1;
        this.field9062 = arg3;
        this.method3604();
    }

    @OriginalMember(owner = "client!st", name = "ja", descriptor = "(I)V", line = 425)
    public final void method646(int arg0) {
        this.method700(0, 0, this.field9085, this.field9076, arg0, 0);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Luo;)V", line = 429)
    public final void method679(class620 arg0) {
        class56 var2 = this.method3609(Thread.currentThread());
        class400 var3 = arg0.field8978.field6446;
        for (class400 var4 = var3.field6020; var3 != var4; var4 = var4.field6020) {
            class169 var5 = (class169) var4;
            int var6 = var5.field2395 >> 12;
            int var7 = var5.field2386 >> 12;
            int var8 = var5.field2393 >> 12;
            float var9 = (float) var8 * this.field9078.field1806 + (float) var6 * this.field9078.field1788 + (float) var7 * this.field9078.field1793 + this.field9078.field1799;
            if (!(var9 < (float) this.field9070) && !(var9 > (float) var2.field888)) {
                int var10 = (int) (((float) var8 * this.field9078.field1794 + (float) var6 * this.field9078.field1792 + (float) var7 * this.field9078.field1801 + this.field9078.field1803) * (float) this.field9082 / var9) + this.field9058;
                int var11 = (int) (((float) var8 * this.field9078.field1800 + (float) var6 * this.field9078.field1787 + (float) var7 * this.field9078.field1804 + this.field9078.field1784) * (float) this.field9083 / var9) + this.field9088;
                if (var10 >= this.field9080 && var10 <= this.field9063 && var11 >= this.field9074 && var11 <= this.field9062) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method3598(var5, var10, var11, (int) var9, (int) ((float) (this.field9082 * var5.field2391 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "L", descriptor = "()V", line = 469)
    public final void method647() {
        for (int var1 = 0; var1 < this.field9084.length; ++var1) {
            this.field9084[var1].field880 = this.field9084[var1].field881;
            this.field9084[var1].field872 = false;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIILua;II)V", line = 481)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        class92 var10 = (class92) arg6;
        int[] var11 = var10.field1401;
        int[] var12 = var10.field1399;
        int var13 = this.field9074 > arg8 ? this.field9074 : arg8;
        int var14 = this.field9062 < var11.length + arg8 ? this.field9062 : var11.length + arg8;
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
            if (arg0 < this.field9080) {
                var18 += (this.field9080 - arg0) * var20;
                arg0 = this.field9080;
            }
            if (var21 >= this.field9063) {
                var21 = this.field9063 - 1;
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
                                int var28 = this.field9085 * var25 + arg0;
                                int var29 = this.field9065[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field9065[var28] = var23 + var30;
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
                                int var34 = this.field9085 * var31 + arg0;
                                int var35 = this.field9065[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field9065[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field9065[this.field9085 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field9080 && var64 < this.field9063 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field9065[this.field9085 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field9080 && var50 < this.field9063 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field9085 * arg1 + var50;
                        int var54 = this.field9065[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field9065[this.field9085 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field9080 && var56 < this.field9063 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field9085 * arg1 + var56;
                        int var60 = this.field9065[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field9065[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "m", descriptor = "(IIIII)V", line = 720)
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field9080 && arg0 < this.field9063) {
            if (arg1 < this.field9074) {
                arg2 -= this.field9074 - arg1;
                arg1 = this.field9074;
            }
            if (arg1 + arg2 > this.field9062) {
                arg2 = this.field9062 - arg1;
            }
            int var6 = this.field9085 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field9085 * var10 + var6;
                        int var12 = this.field9065[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field9065[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field9085 * var14 + var6;
                        int var16 = this.field9065[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field9065[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field9065[this.field9085 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "i", descriptor = "()V", line = 795)
    public final void method653() {
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIF)Ltg;", line = 798)
    public final class334 method687(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lan;IIII)V", line = 802)
    private final void method3598(class169 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field2392;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method3603(arg1, arg2, arg3, arg4, arg0.field2384, 1);
        } else {
            if (this.field9093 != var6) {
                class256 var9 = (class256) this.field9057.method3901((long) var6, -128);
                if (var9 == null) {
                    int[] var10 = this.method3602(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method3608(var6) ? 64 : 128;
                    var9 = this.method704(var10, 0, var11, var11, var11);
                    this.field9057.method3894(var9, (byte) 60, (long) var6);
                }
                this.field9093 = var6;
                this.field9092 = var9;
            }
            ++var8;
            ((class463) this.field9092).method1145(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field2384, 1, 1);
        }
    }

    @OriginalMember(owner = "client!st", name = "h", descriptor = "(I)[I", line = 842)
    public final int[] method3599(int arg0) {
        class692 var2 = this.field9077;
        class207 var3;
        synchronized (this.field9077) {
            var3 = (class207) this.field9077.method3901((long) arg0, -101);
            if (var3 == null) {
                if (!super.field1491.method956(arg0, 15925)) {
                    return null;
                }
                class457 var5 = super.field1491.method955(-1330, arg0);
                int var6 = !var5.field6610 && !this.field9064 ? 128 : 64;
                var3 = new class207(arg0, var6, super.field1491.method958(0.7F, var6, -17786, true, var6, arg0), var5.field6586);
                this.field9077.method3894(var3, (byte) 60, (long) arg0);
            }
        }
        var3.field2816 = true;
        return var3.method1328();
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIIIIII)V", line = 863)
    public final void method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class56 var11 = this.method3609(Thread.currentThread());
        class691 var12 = var11.field923;
        var12.field9754 = false;
        int var13 = arg0 - this.field9071;
        int var14 = arg2 - this.field9071;
        int var15 = arg4 - this.field9071;
        int var16 = arg1 - this.field9060;
        int var17 = arg3 - this.field9060;
        int var18 = arg5 - this.field9060;
        var12.field9752 = var13 < 0 || var13 > var12.field9748 || var14 < 0 || var14 > var12.field9748 || var15 < 0 || var15 > var12.field9748;
        var12.field9751 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field9750 = 255 - var19;
                var12.field9759 = false;
                var12.method3872(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field9750 = 128;
                var12.field9759 = true;
                var12.method3872(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field9750 = 0;
            var12.field9759 = false;
            var12.method3872(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field9754 = true;
        var12.field9751 = false;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V", line = 907)
    public final void method612(boolean arg0) {
        this.field9064 = arg0;
        this.field9077.method3890(-1);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIII)V", line = 911)
    public final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method691(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method691(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method635(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method635(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field9080) {
                    var10 += (this.field9080 - arg0) * var12;
                    arg0 = this.field9080;
                }
                if (var13 >= this.field9063) {
                    var13 = this.field9063 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field9074 && var17 < this.field9062) {
                                int var18 = this.field9085 * var17 + arg0;
                                int var19 = this.field9065[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field9065[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field9074 && var21 < this.field9062) {
                                int var22 = this.field9085 * var21 + arg0;
                                int var23 = this.field9065[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field9065[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field9074 && var27 < this.field9062) {
                            this.field9065[this.field9085 * var27 + arg0] = arg4;
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
                if (arg1 < this.field9074) {
                    var29 += (this.field9074 - arg1) * var31;
                    arg1 = this.field9074;
                }
                if (var32 >= this.field9062) {
                    var32 = this.field9062 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field9080 && var46 < this.field9063) {
                            this.field9065[this.field9085 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field9080 && var36 < this.field9063) {
                            int var37 = this.field9085 * arg1 + var36;
                            int var38 = this.field9065[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field9065[this.field9085 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field9080 && var40 < this.field9063) {
                            int var41 = this.field9085 * arg1 + var40;
                            int var42 = this.field9065[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field9065[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(IIIIZ)Lf;", line = 1125)
    public final class256 method688(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field9085 * arg1 + arg0;
        int var8 = this.field9085 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field9065[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class419(this, var6, arg2, arg3);
        } else {
            return new class666(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIII)V", line = 1157)
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!st", name = "va", descriptor = "(I)V", line = 1159)
    public final void method659(int arg0) {
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(II)I", line = 1162)
    public final int method661(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V", line = 1165)
    public class626(Canvas arg0, class615 arg1) {
        this(arg1);
        this.method613(arg0);
        this.method709(arg0);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lq;)V", line = 1170)
    public final void method616(class151 arg0) {
        this.field9078 = (class121) arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lak;IIII)Lda;", line = 1173)
    public final class395 method651(class677 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class368(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "()Z", line = 1176)
    public final boolean method618() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II[I[I)Lua;", line = 1179)
    public final class591 method617(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class92(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!st", name = "z", descriptor = "()Z", line = 1182)
    public final boolean method694() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "l", descriptor = "()V", line = 1185)
    public final void method656() {
        this.field9077.method3890(-1);
        this.field9057.method3890(-1);
    }

    @OriginalMember(owner = "client!st", name = "U", descriptor = "()I", line = 1189)
    public final int method608() {
        return this.field9073;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "()Z", line = 1192)
    public final boolean method624() {
        return true;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V", line = 1195)
    public final void method626(int arg0) {
        this.field9069 = arg0;
        this.field9084 = new class56[this.field9069];
        for (int var2 = 0; var2 < this.field9069; ++var2) {
            this.field9084[var2] = new class56(this);
        }
    }

    @OriginalMember(owner = "client!st", name = "o", descriptor = "()Z", line = 1208)
    public final boolean method663() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "i", descriptor = "(I)Z", line = 1211)
    public final boolean method3600(int arg0) {
        return super.field1491.method956(arg0, 15925);
    }

    @OriginalMember(owner = "client!st", name = "XA", descriptor = "(IIIII)V", line = 1214)
    public final void method691(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field9074 && arg1 < this.field9062) {
            if (arg0 < this.field9080) {
                arg2 -= this.field9080 - arg0;
                arg0 = this.field9080;
            }
            if (arg0 + arg2 > this.field9063) {
                arg2 = this.field9063 - arg0;
            }
            int var6 = this.field9085 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field9065[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field9065[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field9065[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field9065[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field9065[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "()V", line = 1285)
    public final void method642() {
    }

    @OriginalMember(owner = "client!st", name = "j", descriptor = "(I)Z", line = 1288)
    public final boolean method3601(int arg0) {
        return super.field1491.method955(-1330, arg0).field6602;
    }

    @OriginalMember(owner = "client!st", name = "g", descriptor = "()Z", line = 1292)
    public final boolean method649() {
        return true;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 1295)
    public final class682 method677(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class490(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Luo;I)V", line = 1299)
    public final void method708(class620 arg0, int arg1) {
        class56 var3 = this.method3609(Thread.currentThread());
        class400 var4 = arg0.field8978.field6446;
        for (class400 var5 = var4.field6020; var4 != var5; var5 = var5.field6020) {
            class169 var6 = (class169) var5;
            int var7 = var6.field2395 >> 12;
            int var8 = var6.field2386 >> 12;
            int var9 = var6.field2393 >> 12;
            float var10 = (float) var9 * this.field9078.field1806 + (float) var7 * this.field9078.field1788 + (float) var8 * this.field9078.field1793 + this.field9078.field1799;
            if (!(var10 < (float) this.field9070) && !(var10 > (float) var3.field888)) {
                int var11 = (int) (((float) var9 * this.field9078.field1794 + (float) var7 * this.field9078.field1792 + (float) var8 * this.field9078.field1801 + this.field9078.field1803) * (float) this.field9082 / (float) arg1) + this.field9058;
                int var12 = (int) (((float) var9 * this.field9078.field1800 + (float) var7 * this.field9078.field1787 + (float) var8 * this.field9078.field1804 + this.field9078.field1784) * (float) this.field9083 / (float) arg1) + this.field9088;
                if (var11 >= this.field9080 && var11 <= this.field9063 && var12 >= this.field9074 && var12 <= this.field9062) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method3598(var6, var11, var12, (int) var10, (this.field9082 * var6.field2391 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([I)V", line = 1337)
    public final void method610(int[] arg0) {
        arg0[0] = this.field9085;
        arg0[1] = this.field9076;
    }

    @OriginalMember(owner = "client!st", name = "p", descriptor = "()I", line = 1341)
    public final int method669() {
        return 0;
    }

    @OriginalMember(owner = "client!st", name = "C", descriptor = "()Lq;", line = 1345)
    public final class151 method717() {
        return new class121();
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1349)
    public final void method613(Canvas arg0) {
        class552 var2 = (class552) this.field9053.method2002((byte) -108, (long) arg0.hashCode());
        if (var2 == null) {
            class552 var3 = class44.method254((byte) 30, arg0);
            this.field9053.method2001(-108, var3, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!st", name = "O", descriptor = "(IIIIII)Z", line = 1359)
    public final boolean method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field9078.field1806 + (float) arg0 * this.field9078.field1788 + (float) arg1 * this.field9078.field1793 + this.field9078.field1799;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field9078.field1806 + (float) arg3 * this.field9078.field1788 + (float) arg4 * this.field9078.field1793 + this.field9078.field1799;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field9070) || !(var8 < (float) this.field9070)) && (!(var7 > (float) this.field9073) || !(var8 > (float) this.field9073))) {
            int var9 = (int) (((float) arg2 * this.field9078.field1794 + (float) arg0 * this.field9078.field1792 + (float) arg1 * this.field9078.field1801 + this.field9078.field1803) * (float) this.field9082 / var7);
            int var10 = (int) (((float) arg5 * this.field9078.field1794 + (float) arg3 * this.field9078.field1792 + (float) arg4 * this.field9078.field1801 + this.field9078.field1803) * (float) this.field9082 / var8);
            if (var9 < this.field9071 && var10 < this.field9071 || var9 > this.field9066 && var10 > this.field9066) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field9078.field1800 + (float) arg0 * this.field9078.field1787 + (float) arg1 * this.field9078.field1804 + this.field9078.field1784) * (float) this.field9083 / var7);
                int var12 = (int) (((float) arg5 * this.field9078.field1800 + (float) arg3 * this.field9078.field1787 + (float) arg4 * this.field9078.field1804 + this.field9078.field1784) * (float) this.field9083 / var8);
                return (var11 >= this.field9060 || var12 >= this.field9060) && (var11 <= this.field9068 || var12 <= this.field9068);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!st", name = "ra", descriptor = "(F)V", line = 1388)
    public final void method711(float arg0) {
        this.field9067 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!st", name = "JA", descriptor = "()V", line = 1391)
    public final void method699() {
        this.field9080 = 0;
        this.field9074 = 0;
        this.field9063 = this.field9085;
        this.field9062 = this.field9076;
        this.method3604();
    }

    @OriginalMember(owner = "client!st", name = "f", descriptor = "()Z", line = 1398)
    public final boolean method645() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "ZA", descriptor = "(Z)V", line = 1402)
    public final void method636(boolean arg0) {
        class56 var2 = this.method3609(Thread.currentThread());
        var2.field882 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "FA", descriptor = "(ILua;II)V", line = 1407)
    public final void method715(int arg0, class591 arg1, int arg2, int arg3) {
        class92 var5 = (class92) arg1;
        int[] var6 = var5.field1401;
        int[] var7 = var5.field1399;
        int var8;
        if (this.field9062 < var6.length + arg3) {
            var8 = this.field9062 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field9074 > arg3) {
            var9 = this.field9074 - arg3;
            arg3 = this.field9074;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field9085 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field9080 > var12) {
                    var13 -= this.field9080 - var12;
                    var12 = this.field9080;
                }
                if (this.field9063 < var12 + var13) {
                    var13 = this.field9063 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field9065[var14++] = arg0;
                }
                var10 += this.field9085;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "IA", descriptor = "(IIIIII[BII)V", line = 1464)
    public final void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field9085 * arg1 + arg0;
            int var15 = this.field9085 - arg2;
            if (arg1 + arg3 > this.field9062) {
                arg3 -= arg1 + arg3 - this.field9062;
            }
            if (arg1 < this.field9074) {
                int var16 = this.field9074 - arg1;
                arg3 -= var16;
                var14 += this.field9085 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field9063) {
                int var17 = arg0 + arg2 - this.field9063;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field9080) {
                int var18 = this.field9080 - arg0;
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
                            int var28 = this.field9065[var14];
                            this.field9065[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field9065[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field9065[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field9065[var14++] = arg5;
                        } else {
                            this.field9065[var14++] = arg4;
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

    @OriginalMember(owner = "client!st", name = "q", descriptor = "()Z", line = 1639)
    public final boolean method671() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(FFF)V", line = 1641)
    public final void method619(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!st", name = "k", descriptor = "(I)[I", line = 1645)
    private final int[] method3602(int arg0) {
        class692 var2 = this.field9077;
        class207 var3;
        synchronized (this.field9077) {
            var3 = (class207) this.field9077.method3901((long) arg0, -45);
            if (var3 == null) {
                if (!super.field1491.method956(arg0, 15925)) {
                    return null;
                }
                class457 var5 = super.field1491.method955(-1330, arg0);
                int var6 = !var5.field6610 && !this.field9064 ? 128 : 64;
                var3 = new class207(arg0, var6, super.field1491.method957(var6, -2226, var6, true, 0.7F, arg0), var5.field6586);
                this.field9077.method3894(var3, (byte) 60, (long) arg0);
            }
        }
        var3.field2816 = true;
        return var3.method1328();
    }

    @OriginalMember(owner = "client!st", name = "f", descriptor = "(I)V", line = 1664)
    public final void method690(int arg0) {
    }

    @OriginalMember(owner = "client!st", name = "h", descriptor = "()Z", line = 1667)
    public final boolean method650() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "BA", descriptor = "()I", line = 1670)
    public final int method668() {
        return this.field9070;
    }

    @OriginalMember(owner = "client!st", name = "oa", descriptor = "([I)V", line = 1675)
    public final void method628(int[] arg0) {
        arg0[0] = this.field9080;
        arg0[1] = this.field9074;
        arg0[2] = this.field9063;
        arg0[3] = this.field9062;
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(I)V", line = 1681)
    public final void method640(int arg0) {
        this.field9084[arg0].method353((Runnable) null, -31069);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lut;Z)Lf;", line = 1685)
    public final class256 method660(class616 arg0, boolean arg1) {
        int[] var3 = arg0.field8873;
        byte[] var4 = arg0.field8871;
        int var5 = arg0.field8869;
        int var6 = arg0.field8868;
        class463 var11;
        if (arg1 && arg0.field8875 == null) {
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
            var11 = new class161(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field8875;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class419(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class666(this, var14, var5, var6);
            }
        }
        var11.method58(arg0.field8870, arg0.field8874, arg0.field8872, arg0.field8867);
        return var11;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(IIIIII)V", line = 1788)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method691(arg0, arg1, arg2, arg4, arg5);
        this.method691(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method635(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method635(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!st", name = "w", descriptor = "()Lpg;", line = 1795)
    public final class658 method683() {
        return new class658(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(II)I", line = 1798)
    public final int method706(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!st", name = "pa", descriptor = "(III)V", line = 1804)
    public final void method718(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field9084.length; ++var4) {
            class56 var5 = this.field9084[var4];
            var5.field880 = arg0 & 16777215;
            int var6 = var5.field880 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field880 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field880 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field880 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field886 = false;
            } else {
                var5.field886 = true;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "j", descriptor = "()Z", line = 1836)
    public final boolean method654() {
        return true;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Le;", line = 1839)
    public final class698 method622(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!st", name = "ya", descriptor = "()V", line = 1842)
    public final void method638() {
        if (this.field9080 == 0 && this.field9085 == this.field9063 && this.field9074 == 0 && this.field9076 == this.field9062) {
            int var1 = this.field9059.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field9059[var3++] = Integer.MAX_VALUE;
                this.field9059[var3++] = Integer.MAX_VALUE;
                this.field9059[var3++] = Integer.MAX_VALUE;
                this.field9059[var3++] = Integer.MAX_VALUE;
                this.field9059[var3++] = Integer.MAX_VALUE;
                this.field9059[var3++] = Integer.MAX_VALUE;
                this.field9059[var3++] = Integer.MAX_VALUE;
                this.field9059[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field9059[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field9063 - this.field9080;
            int var5 = this.field9062 - this.field9074;
            int var6 = this.field9085 - var4;
            int var7 = this.field9085 * this.field9074 + this.field9080;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field9059[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Le;)V", line = 1921)
    public final void method648(class698 arg0) {
    }

    @OriginalMember(owner = "client!st", name = "v", descriptor = "()[I", line = 1926)
    public final int[] method625() {
        return new int[] { this.field9058, this.field9088, this.field9082, this.field9083 };
    }

    @OriginalMember(owner = "client!st", name = "g", descriptor = "(IIIIII)V", line = 1931)
    private final void method3603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field9074) {
            var8 = this.field9074;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field9062) {
            var9 = this.field9062;
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
                if (var66 < this.field9080) {
                    var66 = this.field9080;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field9063) {
                    var67 = this.field9063;
                }
                int var68 = this.field9085 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field9059[var68]) {
                        this.field9065[var68] = arg4;
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
                if (var62 < this.field9080) {
                    var62 = this.field9080;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field9063 - 1) {
                    var63 = this.field9063 - 1;
                }
                int var64 = this.field9085 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field9059[var64]) {
                        this.field9065[var64] = arg4;
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
                if (var30 < this.field9080) {
                    var30 = this.field9080;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field9063) {
                    var31 = this.field9063;
                }
                int var32 = this.field9085 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field9059[var32]) {
                        int var34 = this.field9065[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field9065[var32] = var17 + var35;
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
                if (var24 < this.field9080) {
                    var24 = this.field9080;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field9063 - 1) {
                    var25 = this.field9063 - 1;
                }
                int var26 = this.field9085 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field9059[var26]) {
                        int var28 = this.field9065[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field9065[var26] = var17 + var29;
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
                if (var49 < this.field9080) {
                    var49 = this.field9080;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field9063) {
                    var50 = this.field9063;
                }
                int var51 = this.field9085 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field9059[var51]) {
                        int var53 = this.field9065[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field9065[var51] = var54 - var56 | var56 - (var56 >>> 8);
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
                if (var41 < this.field9080) {
                    var41 = this.field9080;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field9063 - 1) {
                    var42 = this.field9063 - 1;
                }
                int var43 = this.field9085 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field9059[var43]) {
                        int var45 = this.field9065[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field9065[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lrs;)V", line = 2248)
    public final void method611(class649 arg0) {
    }

    @OriginalMember(owner = "client!st", name = "m", descriptor = "()Lq;", line = 2251)
    public final class151 method658() {
        return this.field9078;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lfa;)V", line = 2721)
    private class626(class615 arg0) {
        super(arg0);
        this.field9051 = false;
        this.field9055 = false;
        this.field9053 = new class322(4);
        this.field9062 = 0;
        this.field9063 = 0;
        this.field9067 = 75518;
        this.field9064 = false;
        this.field9074 = 0;
        this.field9081 = 0;
        this.field9083 = 512;
        this.field9082 = 512;
        this.field9073 = 3500;
        this.field9061 = 78642;
        this.field9070 = 50;
        this.field9080 = 0;
        this.field9090 = 45823;
        this.field9091 = 0;
        this.field9057 = new class692(16);
        this.field9093 = -1;
        this.field9077 = new class692(256);
        this.field9078 = new class121();
        this.method626(1);
        this.method665(0);
        class530.method3075(false, (byte) -69, true);
        this.field9055 = true;
        this.field9052 = (int) class60.method371(false);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2257)
    public final void method689(Rectangle[] arg0, int arg1) throws class232 {
        if (this.field9054 != null && this.field9056 != null) {
            try {
                Graphics var3 = this.field9054.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field9085 && var5.y <= this.field9076 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field9056.method2013(var5.x, -92, var3, var5.height, var5.width, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field9054.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V", line = 2285)
    public final void method713(boolean arg0) {
    }

    @OriginalMember(owner = "client!st", name = "r", descriptor = "()Z", line = 2289)
    public final boolean method674() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "D", descriptor = "()V", line = 2292)
    private final void method3604() {
        this.field9071 = this.field9080 - this.field9058;
        this.field9066 = this.field9063 - this.field9058;
        this.field9060 = this.field9074 - this.field9088;
        this.field9068 = this.field9062 - this.field9088;
        for (int var1 = 0; var1 < this.field9069; ++var1) {
            class691 var5 = this.field9084[var1].field923;
            var5.field9747 = this.field9058 - this.field9080;
            var5.field9762 = this.field9088 - this.field9074;
            var5.field9748 = this.field9063 - this.field9080;
            var5.field9758 = this.field9062 - this.field9074;
        }
        int var2 = this.field9085 * this.field9074 + this.field9080;
        for (int var3 = this.field9074; var3 < this.field9062; ++var3) {
            for (int var4 = 0; var4 < this.field9069; ++var4) {
                this.field9084[var4].field923.field9760[var3 - this.field9074] = var2;
            }
            var2 += this.field9085;
        }
    }

    @OriginalMember(owner = "client!st", name = "B", descriptor = "()Z", line = 2330)
    public final boolean method705() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2334)
    public final void method709(Canvas arg0) {
        if (arg0 != null) {
            class552 var2 = (class552) this.field9053.method2002((byte) -112, (long) arg0.hashCode());
            if (var2 != null) {
                this.field9054 = arg0;
                this.field9056 = var2;
                if (this.field9087 == null) {
                    this.field9065 = var2.field8119;
                    this.field9085 = var2.field8122;
                    this.field9076 = var2.field8123;
                    if (this.field9085 != this.field9075 || this.field9076 != this.field9072) {
                        this.field9075 = this.field9085;
                        this.field9072 = this.field9076;
                        this.field9059 = new int[this.field9075 * this.field9072];
                    }
                    this.method3607();
                    return;
                }
            }
        } else {
            this.field9054 = null;
            this.field9056 = null;
            if (this.field9087 == null) {
                this.field9065 = null;
                this.field9085 = this.field9076 = 1;
                this.field9075 = this.field9072 = 1;
                this.method3607();
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "J", descriptor = "(IIIIII)V", line = 2376)
    public final void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field9080) {
            arg2 -= this.field9080 - arg0;
            arg0 = this.field9080;
        }
        if (arg1 < this.field9074) {
            arg3 -= this.field9074 - arg1;
            arg1 = this.field9074;
        }
        if (arg0 + arg2 > this.field9063) {
            arg2 = this.field9063 - arg0;
        }
        if (arg1 + arg3 > this.field9062) {
            arg3 = this.field9062 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field9063 && arg1 <= this.field9062) {
            int var7 = this.field9085 - arg2;
            int var8 = this.field9085 * arg1 + arg0;
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
                            this.field9065[var24] = arg4;
                            ++var24;
                            this.field9065[var24] = arg4;
                            ++var24;
                            this.field9065[var24] = arg4;
                            ++var24;
                            this.field9065[var24] = arg4;
                            ++var24;
                            this.field9065[var24] = arg4;
                            ++var24;
                            this.field9065[var24] = arg4;
                            ++var24;
                            this.field9065[var24] = arg4;
                            ++var24;
                            this.field9065[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field9065[var24] = arg4;
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
                        int var14 = this.field9065[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field9065[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field9065[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field9065[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "VA", descriptor = "(IFFFFF)V", line = 2511)
    public final void method607(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field9090 = (int) (arg1 * 65535.0F);
        this.field9061 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field9086 = (int) (arg3 * 65535.0F / var7);
        this.field9079 = (int) (arg4 * 65535.0F / var7);
        this.field9089 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lf;Z)V", line = 2520)
    public final void method673(class256 arg0, boolean arg1) {
        if (arg0 instanceof class666) {
            class666 var3 = (class666) arg0;
            this.field9085 = var3.field6671;
            this.field9076 = var3.field6668;
            this.field9065 = var3.field9443;
            this.field9087 = arg0;
        } else {
            if (!(arg0 instanceof class419)) {
                throw new RuntimeException();
            }
            class419 var4 = (class419) arg0;
            this.field9085 = var4.field6671;
            this.field9076 = var4.field6668;
            this.field9065 = var4.field6182;
            this.field9087 = arg0;
        }
        this.method3607();
    }

    @OriginalMember(owner = "client!st", name = "h", descriptor = "(IIII)[I", line = 2548)
    public final int[] method702(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field9085 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field9065[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!st", name = "E", descriptor = "()Z", line = 2574)
    public final boolean method3605() {
        return this.field9051;
    }

    @OriginalMember(owner = "client!st", name = "la", descriptor = "(IIII)V", line = 2578)
    public final void method667(int arg0, int arg1, int arg2, int arg3) {
        this.field9058 = arg0;
        this.field9088 = arg1;
        this.field9082 = arg2;
        this.field9083 = arg3;
        this.method3604();
    }

    @OriginalMember(owner = "client!st", name = "CA", descriptor = "(IIII)V", line = 2587)
    public final void method680(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field9084.length; ++var5) {
            this.field9084[var5].field881 = this.field9084[var5].field880;
            this.field9084[var5].field891 = arg0;
            this.field9084[var5].field880 = arg1;
            this.field9084[var5].field871 = arg2;
            this.field9084[var5].field872 = true;
        }
    }

    @OriginalMember(owner = "client!st", name = "A", descriptor = "()V", line = 2601)
    public final void method697() {
        if (this.field9055) {
            class541.method3181((byte) 65, true, false);
            this.field9055 = false;
        }
        this.field9056 = null;
        this.field9054 = null;
        this.field9053 = null;
        this.field9051 = true;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(IIIIIIIIII)V", line = 2613)
    public final void method3606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field1491.method955(-1330, arg6).field6612) {
                if (this.field9093 != arg6) {
                    class256 var11 = (class256) this.field9057.method3901((long) arg6, -98);
                    if (var11 == null) {
                        int[] var12 = this.method3602(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method3608(arg6) ? 64 : 128;
                        var11 = this.method704(var12, 0, var13, var13, var13);
                        this.field9057.method3894(var11, (byte) 60, (long) arg6);
                    }
                    this.field9093 = arg6;
                    this.field9092 = var11;
                }
                ((class463) this.field9092).method1145(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method3603(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "s", descriptor = "()V", line = 2647)
    public final void method676() {
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lrs;Lrs;FLrs;)Lrs;", line = 2650)
    public final class649 method707(class649 arg0, class649 arg1, float arg2, class649 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "()Z", line = 2653)
    public final boolean method630() {
        return false;
    }

    @OriginalMember(owner = "client!st", name = "DA", descriptor = "()I", line = 2657)
    public final int method666() {
        int var1 = this.field9091;
        this.field9091 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I[Ltg;)V", line = 2661)
    public final void method696(int arg0, class334[] arg1) {
    }

    @OriginalMember(owner = "client!st", name = "GA", descriptor = "(II)V", line = 2666)
    public final void method675(int arg0, int arg1) {
        class56 var3 = this.method3609(Thread.currentThread());
        this.field9070 = arg0;
        this.field9073 = arg1;
        var3.field888 = this.field9073 - 255;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2673)
    public final void method641(Canvas arg0) {
        class552 var2 = (class552) this.field9053.method2002((byte) -112, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2360((byte) 66);
            class552 var3 = class44.method254((byte) 30, arg0);
            this.field9053.method2001(-88, var3, (long) arg0.hashCode());
            if (this.field9054 == arg0 && this.field9087 == null) {
                this.field9056 = var3;
                this.field9065 = var3.field8119;
                this.field9085 = var3.field8122;
                this.field9076 = var3.field8123;
                if (this.field9085 != this.field9075 || this.field9076 != this.field9072) {
                    this.field9075 = this.field9085;
                    this.field9072 = this.field9076;
                    this.field9059 = new int[this.field9075 * this.field9072];
                }
                this.method3607();
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "u", descriptor = "()Lq;", line = 2700)
    public final class151 method682() {
        class56 var1 = this.method3609(Thread.currentThread());
        return var1.field889;
    }

    @OriginalMember(owner = "client!st", name = "MA", descriptor = "(III[I)V", line = 2705)
    public final void method620(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field9078.field1806 + (float) arg0 * this.field9078.field1788 + (float) arg1 * this.field9078.field1793 + this.field9078.field1799;
        if (!(var5 < (float) this.field9070) && !(var5 > (float) this.field9073)) {
            int var6 = (int) (((float) arg2 * this.field9078.field1794 + (float) arg0 * this.field9078.field1792 + (float) arg1 * this.field9078.field1801 + this.field9078.field1803) * (float) this.field9082 / var5);
            int var7 = (int) (((float) arg2 * this.field9078.field1800 + (float) arg0 * this.field9078.field1787 + (float) arg1 * this.field9078.field1804 + this.field9078.field1784) * (float) this.field9083 / var5);
            arg3[0] = var6 - this.field9071;
            arg3[1] = var7 - this.field9060;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!st", name = "F", descriptor = "()V", line = 2733)
    private final void method3607() {
        for (int var1 = 0; var1 < this.field9069; ++var1) {
            this.field9084[var1].method354(8);
        }
        this.method699();
    }

    @OriginalMember(owner = "client!st", name = "YA", descriptor = "(IIII)V", line = 2743)
    public final void method657(int arg0, int arg1, int arg2, int arg3) {
        class56 var5 = this.method3609(Thread.currentThread());
        var5.field891 = arg0;
        var5.field880 = arg1;
        var5.field871 = arg2;
    }

    @OriginalMember(owner = "client!st", name = "n", descriptor = "()V", line = 2751)
    public final void method662() {
        if (this.field9054 != null) {
            this.field9065 = this.field9056.field8119;
            this.field9085 = this.field9056.field8122;
            this.field9076 = this.field9056.field8123;
        } else {
            this.field9085 = 1;
            this.field9076 = 1;
            this.field9065 = null;
        }
        this.field9087 = null;
        this.method3607();
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "()I", line = 2769)
    public final int method615() {
        return 0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([IIIII)Lf;", line = 2774)
    public final class256 method704(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class419(this, arg0, arg1, arg2, arg3, arg4) : new class666(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class419(this, arg0, arg1, arg2, arg3, arg4) : new class666(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!st", name = "k", descriptor = "()V", line = 2809)
    public final void method655() throws class232 {
        if (this.field9054 != null && this.field9056 != null) {
            try {
                Graphics var1 = this.field9054.getGraphics();
                this.field9056.method2017(0, var1, 0, (byte) 43);
            } catch (Exception var2) {
                this.field9054.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!st", name = "t", descriptor = "()V", line = 2824)
    public final void method681() {
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(I)V", line = 2827)
    public final void method665(int arg0) {
        this.field9084[arg0].method353(Thread.currentThread(), -31069);
    }

    @OriginalMember(owner = "client!st", name = "l", descriptor = "(I)Z", line = 2830)
    public final boolean method3608(int arg0) {
        return this.field9064 || super.field1491.method955(-1330, arg0).field6610;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZ)Lf;", line = 2839)
    public final class256 method631(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class419(this, arg0, arg1) : new class666(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/Runnable;)Lqb;", line = 2847)
    public final class56 method3609(Runnable arg0) {
        for (int var2 = 0; var2 < this.field9069; ++var2) {
            if (this.field9084[var2].field877 == arg0) {
                return this.field9084[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIII)V", line = 2860)
    public final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class56 var8 = this.method3609(Thread.currentThread());
        class691 var9 = var8.field923;
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
            int var23 = arg0 - var9.method3871();
            int var24 = arg1 - var9.method3876();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field9750 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field9750 = 255 - (arg4 >>> 24);
            }
            this.method636(false);
            var9.field9752 = var25 < 0 || var25 > var9.field9748 || var26 < 0 || var26 > var9.field9748 || var27 < 0 || var27 > var9.field9748;
            var9.method3882(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field9752 = var25 < 0 || var25 > var9.field9748 || var27 < 0 || var27 > var9.field9748 || var28 < 0 || var28 > var9.field9748;
            var9.method3882(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method636(true);
        }
    }

    @OriginalMember(owner = "client!st", name = "AA", descriptor = "(III[I)V", line = 2934)
    public final void method629(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field9078.field1806 + (float) arg0 * this.field9078.field1788 + (float) arg1 * this.field9078.field1793 + this.field9078.field1799;
        if (!(var5 < (float) this.field9070) && !(var5 > (float) this.field9073)) {
            int var6 = (int) (((float) arg2 * this.field9078.field1794 + (float) arg0 * this.field9078.field1792 + (float) arg1 * this.field9078.field1801 + this.field9078.field1803) * (float) this.field9082 / var5);
            int var7 = (int) (((float) arg2 * this.field9078.field1800 + (float) arg0 * this.field9078.field1787 + (float) arg1 * this.field9078.field1804 + this.field9078.field1784) * (float) this.field9083 / var5);
            if (var6 >= this.field9071 && var6 <= this.field9066 && var7 >= this.field9060 && var7 <= this.field9068) {
                arg3[0] = var6 - this.field9071;
                arg3[1] = var7 - this.field9060;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }
}
