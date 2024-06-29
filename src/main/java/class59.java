import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class59 extends class162 {

    @OriginalMember(owner = "client!in", name = "r", descriptor = "Z")
    private boolean field996;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "Z")
    private boolean field1001;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "Lcv;")
    private class398 field997;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "Z")
    public boolean field1008;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!in", name = "ab", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "Z")
    private boolean field1014;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!in", name = "db", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!in", name = "hb", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!in", name = "eb", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!in", name = "bb", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!in", name = "lb", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!in", name = "jb", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!in", name = "kb", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!in", name = "mb", descriptor = "Llh;")
    private class364 field1043;

    @OriginalMember(owner = "client!in", name = "ob", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "Llh;")
    private class364 field1024;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "Lcj;")
    public class487 field1005;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "F")
    private float field1021;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "F")
    private float field1026;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!in", name = "X", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!in", name = "Y", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!in", name = "Z", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!in", name = "cb", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!in", name = "fb", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!in", name = "ib", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "Lpl;")
    private class458 field999;

    @OriginalMember(owner = "client!in", name = "gb", descriptor = "Lf;")
    private class528 field1037;

    @OriginalMember(owner = "client!in", name = "nb", descriptor = "Lf;")
    private class528 field1044;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1000;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "Z")
    public boolean field1025;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "[I")
    public int[] field1018;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "[Ljh;")
    private class109[] field1007;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "()V")
    public final void method427() {
        if (this.field996) {
            class86.method701(true, false, 0);
            this.field996 = false;
        }
        this.field999 = null;
        this.field1000 = null;
        this.field997 = null;
        this.field1001 = true;
    }

    @OriginalMember(owner = "client!in", name = "j", descriptor = "()Lia;")
    public final class413 method428() {
        return new class487();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!in", name = "aa", descriptor = "(IIIIII[BII)V")
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field1029 * arg1 + arg0;
            int var15 = this.field1029 - arg2;
            if (arg1 + arg3 > this.field1002) {
                arg3 -= arg1 + arg3 - this.field1002;
            }
            if (arg1 < this.field1027) {
                int var16 = this.field1027 - arg1;
                arg3 -= var16;
                var14 += this.field1029 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field1041) {
                int var17 = arg0 + arg2 - this.field1041;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field1032) {
                int var18 = this.field1032 - arg0;
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
                            int var28 = this.field1018[var14];
                            this.field1018[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field1018[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field1018[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field1018[var14++] = arg5;
                        } else {
                            this.field1018[var14++] = arg4;
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

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II[I[I)Lea;")
    public final class381 method431(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class33(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(IIIIII)Lmd;")
    public final class379 method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(Z)V")
    public final void method433(boolean arg0) {
    }

    @OriginalMember(owner = "client!in", name = "j", descriptor = "(ILea;II)V")
    public final void method434(int arg0, class381 arg1, int arg2, int arg3) {
        class33 var5 = (class33) arg1;
        int[] var6 = var5.field512;
        int[] var7 = var5.field517;
        int var8;
        if (this.field1002 < var6.length + arg3) {
            var8 = this.field1002 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field1027 > arg3) {
            var9 = this.field1027 - arg3;
            arg3 = this.field1027;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field1029 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field1032 > var12) {
                    var13 -= this.field1032 - var12;
                    var12 = this.field1032;
                }
                if (this.field1041 < var12 + var13) {
                    var13 = this.field1041 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field1018[var14++] = arg0;
                }
                var10 += this.field1029;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method435(Rectangle[] arg0, int arg1) {
        if (this.field1000 != null && this.field999 != null) {
            try {
                Graphics var3 = this.field1000.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field1029 && var5.y <= this.field1003 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field999.method1420(var5.x, var5.width, 110, var3, var5.height, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field1000.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!in", name = "M", descriptor = "(I)V")
    public final void method436(int arg0) {
        this.method471(0, 0, this.field1029, this.field1003, arg0, 0);
    }

    @OriginalMember(owner = "client!in", name = "i", descriptor = "(I)Z")
    public final boolean method437(int arg0) {
        return this.field1014 || super.field2449.method935(arg0, -8037).field3112;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([Lc;Lia;[Lsf;I)V")
    public final void method438(class121[] arg0, class413 arg1, class361[] arg2, int arg3) {
        class498[] var5 = new class498[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class498) arg0[var6];
            }
        }
        class498 var7 = class498.method2964(this, var5);
        var7.method2966(arg1, arg2 != null ? arg2[0] : null, (class492) null, arg3);
    }

    @OriginalMember(owner = "client!in", name = "i", descriptor = "()Lia;")
    public final class413 method439() {
        class109 var1 = this.method451(Thread.currentThread());
        return var1.field1693;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lmd;Lmd;FLmd;)Lmd;")
    public final class379 method440(class379 arg0, class379 arg1, float arg2, class379 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!in", name = "O", descriptor = "(IIIII)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field1027) {
            var6 = this.field1027;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field1002) {
            var7 = this.field1002;
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
                if (var64 < this.field1032) {
                    var64 = this.field1032;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field1041) {
                    var65 = this.field1041;
                }
                int var66 = this.field1029 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field1018[var66++] = arg3;
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
                if (var60 < this.field1032) {
                    var60 = this.field1032;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field1041 - 1) {
                    var61 = this.field1041 - 1;
                }
                int var62 = this.field1029 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field1018[var62++] = arg3;
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
                if (var28 < this.field1032) {
                    var28 = this.field1032;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field1041) {
                    var29 = this.field1041;
                }
                int var30 = this.field1029 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field1018[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field1018[var30++] = var15 + var33;
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
                if (var22 < this.field1032) {
                    var22 = this.field1032;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field1041 - 1) {
                    var23 = this.field1041 - 1;
                }
                int var24 = this.field1029 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field1018[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field1018[var24++] = var15 + var27;
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
                if (var47 < this.field1032) {
                    var47 = this.field1032;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field1041) {
                    var48 = this.field1041;
                }
                int var49 = this.field1029 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field1018[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field1018[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field1032) {
                    var39 = this.field1032;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field1041 - 1) {
                    var40 = this.field1041 - 1;
                }
                int var41 = this.field1029 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field1018[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field1018[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "()Z")
    public final boolean method442() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "A", descriptor = "()V")
    private final void method443() {
        if (this.field1021 != 0.0F) {
            float var1 = (float) this.field1020;
            float var2 = (float) this.field1015;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field1026 / (this.field1026 + this.field1021);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field1021;
            this.field1022 = (int) (((float) this.field1020 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field1022 = this.field1020;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()V")
    public final void method444() {
    }

    @OriginalMember(owner = "client!in", name = "xa", descriptor = "()I")
    public final int method445() {
        int var1 = this.field1017;
        this.field1017 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "()Z")
    public final boolean method446() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "D", descriptor = "()V")
    private final void method447() {
        for (int var1 = 0; var1 < this.field1030; ++var1) {
            this.field1007[var1].method808(105);
        }
        this.method492();
    }

    @OriginalMember(owner = "client!in", name = "q", descriptor = "()V")
    public final void method448() {
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ll;)V")
    public final void method449(class16 arg0) {
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(FFF)V")
    public final void method450(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/Runnable;)Ljh;")
    public final class109 method451(Runnable arg0) {
        for (int var2 = 0; var2 < this.field1030; ++var2) {
            if (this.field1007[var2].field1688 == arg0) {
                return this.field1007[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)Ll;")
    public final class16 method452(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lds;[Ldt;Z)Loa;")
    public final class488 method453(class12 arg0, class158[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2391;
            var5[var7] = arg1[var7].field2388;
            if (arg1[var7].field2390 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class293(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class69(this, arg0, arg1, var4, var5);
        } else {
            return new class77(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V")
    public final void method454(int arg0) {
        this.field1007[arg0].method811((byte) 77, (Runnable) null);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lmd;)V")
    public final void method455(class379 arg0) {
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class109 var11 = this.method451(Thread.currentThread());
        class174 var12 = var11.field1690;
        var12.field2661 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field2661 = false;
            var12.field2662 = 0;
            var12.field2659 = true;
            var12.method1242(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field2661 = false;
            var12.field2662 = 255 - var13;
            var12.field2659 = true;
            var12.method1242(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field2661 = true;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public final void method457(int arg0) {
        int var2 = arg0 - this.field998;
        for (Object var3 = this.field1024.method2346(-75); var3 != null; var3 = this.field1024.method2337(102)) {
            class423 var4 = (class423) var3;
            if (var4.field6212) {
                var4.field6214 += var2;
                int var5 = var4.field6214 / 20;
                if (var5 > 0) {
                    class216 var6 = super.field2449.method935(var4.field6213, -8037);
                    var4.method2586(var6.field3096 * var2 * 50 / 1000, var6.field3111 * var2 * 50 / 1000);
                    var4.field6214 -= var5 * 20;
                }
                var4.field6212 = false;
            }
        }
        this.field998 = arg0;
        this.field1043.method2348(5, -127);
    }

    @OriginalMember(owner = "client!in", name = "ua", descriptor = "(F)V")
    public final void method458(float arg0) {
        this.field1012 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!in", name = "W", descriptor = "()I")
    public final int method459() {
        return this.field1020;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIILea;II)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        class33 var10 = (class33) arg6;
        int[] var11 = var10.field512;
        int[] var12 = var10.field517;
        int var13 = this.field1027 > arg8 ? this.field1027 : arg8;
        int var14 = this.field1002 < var11.length + arg8 ? this.field1002 : var11.length + arg8;
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
            if (arg0 < this.field1032) {
                var18 += (this.field1032 - arg0) * var20;
                arg0 = this.field1032;
            }
            if (var21 >= this.field1041) {
                var21 = this.field1041 - 1;
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
                                int var28 = this.field1029 * var25 + arg0;
                                int var29 = this.field1018[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field1018[var28] = var23 + var30;
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
                                int var34 = this.field1029 * var31 + arg0;
                                int var35 = this.field1018[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field1018[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field1018[this.field1029 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field1032 && var64 < this.field1041 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field1018[this.field1029 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field1032 && var50 < this.field1041 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field1029 * arg1 + var50;
                        int var54 = this.field1018[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field1018[this.field1029 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field1032 && var56 < this.field1041 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field1029 * arg1 + var56;
                        int var60 = this.field1018[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field1018[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "da", descriptor = "(IIIII)V")
    public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field1032 && arg0 < this.field1041) {
            if (arg1 < this.field1027) {
                arg2 -= this.field1027 - arg1;
                arg1 = this.field1027;
            }
            if (arg1 + arg2 > this.field1002) {
                arg2 = this.field1002 - arg1;
            }
            int var6 = this.field1029 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1029 * var10 + var6;
                        int var12 = this.field1018[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field1018[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field1029 * var14 + var6;
                        int var16 = this.field1018[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field1018[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field1018[this.field1029 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "()I")
    public final int method462() {
        int var1 = this.field1034;
        this.field1034 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!in", name = "ia", descriptor = "(III[I)V")
    public final void method463(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field1005.field7103 * arg2 + this.field1005.field7111 * arg1 + this.field1005.field7107 * arg0 >> 15) + this.field1005.field7113;
        if (var5 >= this.field1015 && var5 <= this.field1020) {
            int var6 = ((this.field1005.field7109 * arg2 + this.field1005.field7108 * arg1 + this.field1005.field7105 * arg0 >> 15) + this.field1005.field7112) * this.field1013 / var5;
            int var7 = ((this.field1005.field7106 * arg2 + this.field1005.field7110 * arg0 + this.field1005.field7102 * arg1 >> 15) + this.field1005.field7104) * this.field1042 / var5;
            if (var6 >= this.field1006 && var6 <= this.field1039 && var7 >= this.field1016 && var7 <= this.field1023) {
                arg3[0] = var6 - this.field1006;
                arg3[1] = var7 - this.field1016;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[Ltj;)V")
    public final void method464(int arg0, class131[] arg1) {
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public final void method465(int arg0) {
        if (this.field1030 != arg0) {
            this.field1030 = arg0;
            this.field1007 = new class109[this.field1030];
            for (int var2 = 0; var2 < this.field1030; ++var2) {
                this.field1007[var2] = new class109(this);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method466(Canvas arg0) {
        if (this.field1000 == arg0) {
            this.method523((Canvas) null);
        }
        class458 var2 = (class458) this.field997.method2485(126, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2663(-110);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lgn;)V")
    public final void method467(class492 arg0) {
        class347 var2 = arg0.field7181.field3238;
        for (class347 var3 = var2.field5262; var2 != var3; var3 = var3.field5262) {
            class421 var4 = (class421) var3;
            int var5 = var4.field6196 >> 12;
            int var6 = var4.field6188 >> 12;
            int var7 = var4.field6185 >> 12;
            int var8 = (this.field1005.field7103 * var7 + this.field1005.field7111 * var6 + this.field1005.field7107 * var5 >> 15) + this.field1005.field7113;
            if (var8 >= this.field1015 && var8 <= this.field1031) {
                int var9 = ((this.field1005.field7109 * var7 + this.field1005.field7108 * var6 + this.field1005.field7105 * var5 >> 15) + this.field1005.field7112) * this.field1013 / var8 + this.field1004;
                int var10 = ((this.field1005.field7106 * var7 + this.field1005.field7110 * var5 + this.field1005.field7102 * var6 >> 15) + this.field1005.field7104) * this.field1042 / var8 + this.field1011;
                if (var9 >= this.field1032 && var9 <= this.field1041 && var10 >= this.field1027 && var10 <= this.field1002) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method528(var4, var9, var10, (var4.field6191 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
    public final void method468(int arg0) {
        this.field1007[arg0].method811((byte) 104, Thread.currentThread());
    }

    @OriginalMember(owner = "client!in", name = "y", descriptor = "()Z")
    public final boolean method469() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(IIIIII)V")
    public final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method530(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method530(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method461(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method461(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field1032) {
                    var10 += (this.field1032 - arg0) * var12;
                    arg0 = this.field1032;
                }
                if (var13 >= this.field1041) {
                    var13 = this.field1041 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field1027 && var17 < this.field1002) {
                                int var18 = this.field1029 * var17 + arg0;
                                int var19 = this.field1018[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field1018[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field1027 && var21 < this.field1002) {
                                int var22 = this.field1029 * var21 + arg0;
                                int var23 = this.field1018[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field1018[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field1027 && var27 < this.field1002) {
                            this.field1018[this.field1029 * var27 + arg0] = arg4;
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
                if (arg1 < this.field1027) {
                    var29 += (this.field1027 - arg1) * var31;
                    arg1 = this.field1027;
                }
                if (var32 >= this.field1002) {
                    var32 = this.field1002 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field1032 && var46 < this.field1041) {
                            this.field1018[this.field1029 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field1032 && var36 < this.field1041) {
                            int var37 = this.field1029 * arg1 + var36;
                            int var38 = this.field1018[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field1018[this.field1029 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field1032 && var40 < this.field1041) {
                            int var41 = this.field1029 * arg1 + var40;
                            int var42 = this.field1018[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field1018[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!in", name = "NA", descriptor = "(IIIIII)V")
    public final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field1032) {
            arg2 -= this.field1032 - arg0;
            arg0 = this.field1032;
        }
        if (arg1 < this.field1027) {
            arg3 -= this.field1027 - arg1;
            arg1 = this.field1027;
        }
        if (arg0 + arg2 > this.field1041) {
            arg2 = this.field1041 - arg0;
        }
        if (arg1 + arg3 > this.field1002) {
            arg3 = this.field1002 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field1041 && arg1 <= this.field1002) {
            int var7 = this.field1029 - arg2;
            int var8 = this.field1029 * arg1 + arg0;
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
                            this.field1018[var24] = arg4;
                            ++var24;
                            this.field1018[var24] = arg4;
                            ++var24;
                            this.field1018[var24] = arg4;
                            ++var24;
                            this.field1018[var24] = arg4;
                            ++var24;
                            this.field1018[var24] = arg4;
                            ++var24;
                            this.field1018[var24] = arg4;
                            ++var24;
                            this.field1018[var24] = arg4;
                            ++var24;
                            this.field1018[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field1018[var24] = arg4;
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
                        int var14 = this.field1018[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field1018[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field1018[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field1018[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)I")
    public final int method472(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!in", name = "m", descriptor = "()Z")
    public final boolean method473() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "s", descriptor = "()Z")
    public final boolean method474() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        this.field1014 = arg0;
        this.field1024.method2349(0);
    }

    @OriginalMember(owner = "client!in", name = "E", descriptor = "()V")
    private final void method476() {
        this.field1006 = this.field1032 - this.field1004;
        this.field1039 = this.field1041 - this.field1004;
        this.field1016 = this.field1027 - this.field1011;
        this.field1023 = this.field1002 - this.field1011;
        for (int var1 = 0; var1 < this.field1030; ++var1) {
            class174 var5 = this.field1007[var1].field1690;
            var5.field2667 = this.field1004 - this.field1032;
            var5.field2658 = this.field1011 - this.field1027;
            var5.field2663 = this.field1041 - this.field1032;
            var5.field2664 = this.field1002 - this.field1027;
        }
        int var2 = this.field1029 * this.field1027 + this.field1032;
        for (int var3 = this.field1027; var3 < this.field1002; ++var3) {
            for (int var4 = 0; var4 < this.field1030; ++var4) {
                this.field1007[var4].field1690.field2666[var3 - this.field1027] = var2;
            }
            var2 += this.field1029;
        }
    }

    @OriginalMember(owner = "client!in", name = "w", descriptor = "()F")
    public final float method477() {
        return this.field1021;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public final class35 method478(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class350(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!in", name = "na", descriptor = "(I)V")
    public final void method479(int arg0) {
    }

    @OriginalMember(owner = "client!in", name = "Z", descriptor = "(IIII)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1032 < arg0) {
            this.field1032 = arg0;
        }
        if (this.field1027 < arg1) {
            this.field1027 = arg1;
        }
        if (this.field1041 > arg2) {
            this.field1041 = arg2;
        }
        if (this.field1002 > arg3) {
            this.field1002 = arg3;
        }
        this.method476();
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(ILm;)V")
    private class59(int arg0, class126 arg1) {
        super(arg0, arg1);
        this.field996 = false;
        this.field1001 = false;
        this.field997 = new class398(4);
        this.field1008 = false;
        this.field1020 = 3500;
        this.field1002 = 0;
        this.field1022 = 3500;
        this.field1012 = 75518;
        this.field1017 = 0;
        this.field1031 = this.field1020 - 255;
        this.field1009 = 78642;
        this.field1013 = 512;
        this.field1010 = 45823;
        this.field1015 = 50;
        this.field1014 = false;
        this.field1019 = 0;
        this.field1034 = 0;
        this.field1027 = 0;
        this.field1038 = 0;
        this.field1035 = 0;
        this.field1032 = 0;
        this.field1042 = 512;
        this.field1040 = 0;
        this.field1041 = 0;
        this.field1043 = new class364(16);
        this.field1045 = -1;
        this.field1024 = new class364(20);
        this.field1005 = new class487();
        this.method465(1);
        this.method468(0);
        class91.method744(false, true, -59);
        this.field996 = true;
    }

    @OriginalMember(owner = "client!in", name = "z", descriptor = "()Z")
    public final boolean method481() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "n", descriptor = "()Z")
    public final boolean method482() {
        return true;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIF)Ltj;")
    public final class131 method483(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!in", name = "o", descriptor = "()Z")
    public final boolean method484() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "GA", descriptor = "(IIII)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3) {
        this.field1004 = arg0;
        this.field1011 = arg1;
        this.field1013 = arg2;
        this.field1042 = arg3;
        this.method476();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field2449.method935(arg5, -8037).field3114) {
                if (this.field1045 != arg5) {
                    class528 var10 = (class528) this.field1043.method2339(-99, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method515(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method437(arg5) ? 64 : 128;
                        var10 = this.method527(var11, 0, var12, var12, var12);
                        this.field1043.method2342((long) arg5, var10, -82);
                    }
                    this.field1045 = arg5;
                    this.field1044 = var10;
                }
                this.field1044.method136(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method441(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "la", descriptor = "()F")
    public final float method487() {
        return this.field1026;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "()I")
    public final int method488() {
        return 0;
    }

    @OriginalMember(owner = "client!in", name = "FA", descriptor = "()I")
    public final int method489() {
        return 0;
    }

    @OriginalMember(owner = "client!in", name = "F", descriptor = "()Z")
    public final boolean method490() {
        return this.field1001;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIII)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class109 var8 = this.method451(Thread.currentThread());
        class174 var9 = var8.field1690;
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
            int var21 = arg0 - var9.method1243();
            int var22 = arg1 - var9.method1253();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field2662 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2662 = 255 - (arg4 >> 24);
            }
            var9.field2659 = var23 < 0 || var23 > var9.field2663 || var24 < 0 || var24 > var9.field2663 || var25 < 0 || var25 > var9.field2663;
            var9.method1249(var27, var28, var29, var23, var24, var25, arg4);
            var9.field2659 = var23 < 0 || var23 > var9.field2663 || var24 < 0 || var24 > var9.field2663 || var26 < 0 || var26 > var9.field2663;
            var9.method1249(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!in", name = "va", descriptor = "()V")
    public final void method492() {
        this.field1032 = 0;
        this.field1027 = 0;
        this.field1041 = this.field1029;
        this.field1002 = this.field1003;
        this.method476();
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;)V")
    public class59(int arg0, Canvas arg1, class126 arg2) {
        this(arg0, arg2);
        this.method500(arg1);
        this.method523(arg1);
    }

    @OriginalMember(owner = "client!in", name = "u", descriptor = "()Z")
    public final boolean method493() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(Z)V")
    public final void method494(boolean arg0) {
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([Lc;Lgn;Lia;[Lsf;I)V")
    public final void method495(class121[] arg0, class492 arg1, class413 arg2, class361[] arg3, int arg4) {
        class498[] var6 = new class498[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class498) arg0[var7];
            }
        }
        class498 var8 = class498.method2964(this, var6);
        var8.method2966(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!in", name = "j", descriptor = "(I)I")
    public final int method496(int arg0) {
        return super.field2449.method935(arg0, -8037).field3119 & 65535;
    }

    @OriginalMember(owner = "client!in", name = "m", descriptor = "(Lia;)V")
    public final void method497(class413 arg0) {
        this.field1005 = (class487) arg0;
    }

    @OriginalMember(owner = "client!in", name = "k", descriptor = "(I)Z")
    public final boolean method498(int arg0) {
        return super.field2449.method937((byte) 43, arg0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Llo;IIII)Lc;")
    public final class121 method499(class527 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class498(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method500(Canvas arg0) {
        class458 var2 = (class458) this.field997.method2485(83, (long) arg0.hashCode());
        if (var2 == null) {
            class458 var3 = class66.method578(24742, arg0);
            this.field997.method2486(48, var3, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!in", name = "S", descriptor = "()V")
    public final void method501() {
        this.field1038 = this.field1035;
        this.field1008 = false;
    }

    @OriginalMember(owner = "client!in", name = "fa", descriptor = "(IIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3) {
        this.field1035 = this.field1038;
        this.field1040 = arg0;
        this.field1038 = arg1;
        this.field1019 = arg2;
        this.field1008 = true;
    }

    @OriginalMember(owner = "client!in", name = "x", descriptor = "()V")
    public final void method503() {
        this.field1024.method2349(0);
    }

    @OriginalMember(owner = "client!in", name = "l", descriptor = "(I)Z")
    public final boolean method504(int arg0) {
        return super.field2449.method935(arg0, -8037).field3095;
    }

    @OriginalMember(owner = "client!in", name = "u", descriptor = "([I)V")
    public final void method505(int[] arg0) {
        arg0[0] = this.field1032;
        arg0[1] = this.field1027;
        arg0[2] = this.field1041;
        arg0[3] = this.field1002;
    }

    @OriginalMember(owner = "client!in", name = "r", descriptor = "()V")
    public final void method506() {
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "(I)V")
    public final void method507(int arg0) {
    }

    @OriginalMember(owner = "client!in", name = "IA", descriptor = "(IIII)[I")
    public final int[] method508(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field1029 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field1018[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!in", name = "pa", descriptor = "(IIII)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field1029) {
            arg2 = this.field1029;
        }
        if (arg3 > this.field1003) {
            arg3 = this.field1003;
        }
        this.field1032 = arg0;
        this.field1041 = arg2;
        this.field1027 = arg1;
        this.field1002 = arg3;
        this.method476();
    }

    @OriginalMember(owner = "client!in", name = "v", descriptor = "()V")
    public final void method510() {
    }

    @OriginalMember(owner = "client!in", name = "JA", descriptor = "(II)V")
    public final void method511(int arg0, int arg1) {
        this.field1015 = arg0;
        this.field1020 = arg1;
        this.field1031 = this.field1020 - 255;
        this.method443();
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "()I")
    public final int method512() {
        return this.field1015;
    }

    @OriginalMember(owner = "client!in", name = "l", descriptor = "()Z")
    public final boolean method513() {
        return true;
    }

    @OriginalMember(owner = "client!in", name = "o", descriptor = "(FF)V")
    public final void method514(float arg0, float arg1) {
        this.field1026 = arg0;
        this.field1021 = arg1;
        this.method443();
    }

    @OriginalMember(owner = "client!in", name = "m", descriptor = "(I)[I")
    private final int[] method515(int arg0) {
        class364 var2 = this.field1024;
        class423 var3;
        synchronized (this.field1024) {
            var3 = (class423) this.field1024.method2339(-128, (long) arg0);
            if (var3 == null) {
                if (!super.field2449.method937((byte) 43, arg0)) {
                    return null;
                }
                class216 var5 = super.field2449.method935(arg0, -8037);
                int var6 = !var5.field3112 && !this.field1014 ? 128 : 64;
                var3 = new class423(arg0, var6, super.field2449.method936((byte) -100, true, arg0, var6, var6, 0.7F), var5.field3113);
                this.field1024.method2342((long) arg0, var3, -107);
            }
        }
        var3.field6212 = true;
        return var3.method2588();
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(IIIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method530(arg0, arg1, arg2, arg4, arg5);
        this.method530(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method461(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method461(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ldt;Z)Lf;")
    public final class528 method517(class158 arg0, boolean arg1) {
        int[] var3 = arg0.field2386;
        byte[] var4 = arg0.field2384;
        int var5 = arg0.field2391;
        int var6 = arg0.field2388;
        class316 var11;
        if (arg1 && arg0.field2390 == null) {
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
            var11 = new class247(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2390;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class429(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class429(this, var14, var5, var6);
                var11 = new class384(this, var14, var5, var6);
            }
        }
        var11.method141(arg0.field2392, arg0.field2385, arg0.field2387, arg0.field2389);
        return var11;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
    public final int method518(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!in", name = "B", descriptor = "()Z")
    public final boolean method519() {
        return true;
    }

    @OriginalMember(owner = "client!in", name = "XA", descriptor = "(IFFFFF)V")
    public final void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field1010 = (int) (arg1 * 65535.0F);
        this.field1009 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field1036 = (int) (arg3 * 65535.0F / var7);
        this.field1028 = (int) (arg4 * 65535.0F / var7);
        this.field1033 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!in", name = "k", descriptor = "()V")
    public final void method521() {
        if (this.field1000 != null && this.field999 != null) {
            try {
                Graphics var1 = this.field1000.getGraphics();
                this.field999.method1417(var1, 0, (byte) 116, 0);
            } catch (Exception var2) {
                this.field1000.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!in", name = "C", descriptor = "()Z")
    public final boolean method522() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method523(Canvas arg0) {
        if (arg0 != null) {
            class458 var2 = (class458) this.field997.method2485(17, (long) arg0.hashCode());
            if (var2 != null) {
                this.field1000 = arg0;
                this.field999 = var2;
                if (this.field1037 == null) {
                    this.field1018 = var2.field6756;
                    this.field1029 = var2.field6755;
                    this.field1003 = var2.field6754;
                    this.method447();
                    return;
                }
            }
        } else {
            this.field1000 = null;
            this.field999 = null;
            if (this.field1037 == null) {
                this.field1018 = null;
                this.field1029 = this.field1003 = 1;
                this.method447();
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "t", descriptor = "()Z")
    public final boolean method524() {
        return true;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "()Z")
    public final boolean method525() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "SA", descriptor = "(IIIIII)Z")
    public final boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field1005.field7103 * arg2 + this.field1005.field7111 * arg1 + this.field1005.field7107 * arg0 >> 15) + this.field1005.field7113;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field1005.field7103 * arg5 + this.field1005.field7111 * arg4 + this.field1005.field7107 * arg3 >> 15) + this.field1005.field7113;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field1015 || var8 >= this.field1015) && (var7 <= this.field1020 || var8 <= this.field1020)) {
            int var9 = ((this.field1005.field7109 * arg2 + this.field1005.field7108 * arg1 + this.field1005.field7105 * arg0 >> 15) + this.field1005.field7112) * this.field1013 / var7;
            int var10 = ((this.field1005.field7109 * arg5 + this.field1005.field7108 * arg4 + this.field1005.field7105 * arg3 >> 15) + this.field1005.field7112) * this.field1013 / var8;
            if (var9 < this.field1006 && var10 < this.field1006 || var9 > this.field1039 && var10 > this.field1039) {
                return false;
            } else {
                int var11 = ((this.field1005.field7106 * arg2 + this.field1005.field7110 * arg0 + this.field1005.field7102 * arg1 >> 15) + this.field1005.field7104) * this.field1042 / var7;
                int var12 = ((this.field1005.field7106 * arg5 + this.field1005.field7110 * arg3 + this.field1005.field7102 * arg4 >> 15) + this.field1005.field7104) * this.field1042 / var8;
                return (var11 >= this.field1016 || var12 >= this.field1016) && (var11 <= this.field1023 || var12 <= this.field1023);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([IIIII)Lf;")
    public final class528 method527(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class429(this, arg0, arg1, arg2, arg3, arg4) : new class384(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class429(this, arg0, arg1, arg2, arg3, arg4) : new class384(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lke;III)V")
    public final void method528(class421 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field6194;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method441(arg1, arg2, var6, arg0.field6186, 1);
        } else {
            if (this.field1045 != var5) {
                class528 var7 = (class528) this.field1043.method2339(-69, (long) var5);
                if (var7 == null) {
                    int[] var8 = this.method515(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method437(var5) ? 64 : 128;
                    var7 = this.method527(var8, 0, var9, var9, var9);
                    this.field1043.method2342((long) var5, var7, 119);
                }
                this.field1045 = var5;
                this.field1044 = var7;
            }
            if (this.field1044.method134() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field1044.method136(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field6186, 1);
        }
    }

    @OriginalMember(owner = "client!in", name = "p", descriptor = "()Z")
    public final boolean method529() {
        return false;
    }

    @OriginalMember(owner = "client!in", name = "U", descriptor = "(IIIII)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field1027 && arg1 < this.field1002) {
            if (arg0 < this.field1032) {
                arg2 -= this.field1032 - arg0;
                arg0 = this.field1032;
            }
            if (arg0 + arg2 > this.field1041) {
                arg2 = this.field1041 - arg0;
            }
            int var6 = this.field1029 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1018[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field1018[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field1018[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field1018[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field1018[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lc;Lgn;Lia;Lsf;I)V")
    public final void method531(class121 arg0, class492 arg1, class413 arg2, class361 arg3, int arg4) {
        ((class498) arg0).method2966(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class528 method532(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field1029 * arg1 + arg0;
        int var8 = this.field1029 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field1018[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class429(this, var6, arg2, arg3);
        } else {
            return new class384(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method533(Canvas arg0) {
        class458 var2 = (class458) this.field997.method2485(79, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2663(-113);
            class458 var3 = class66.method578(24742, arg0);
            this.field997.method2486(55, var3, (long) arg0.hashCode());
            if (this.field1000 == arg0 && this.field1037 == null) {
                this.field999 = var3;
                this.field1018 = var3.field6756;
                this.field1029 = var3.field6755;
                this.field1003 = var3.field6754;
                this.method447();
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "n", descriptor = "(I)[I")
    public final int[] method534(int arg0) {
        class364 var2 = this.field1024;
        class423 var3;
        synchronized (this.field1024) {
            var3 = (class423) this.field1024.method2339(-106, (long) arg0);
            if (var3 == null) {
                if (!super.field2449.method937((byte) 43, arg0)) {
                    return null;
                }
                class216 var5 = super.field2449.method935(arg0, -8037);
                int var6 = !var5.field3112 && !this.field1014 ? 128 : 64;
                var3 = new class423(arg0, var6, super.field2449.method938(arg0, true, 0.7F, (byte) -113, var6, var6), var5.field3113);
                this.field1024.method2342((long) arg0, var3, 34);
            }
        }
        var3.field6212 = true;
        return var3.method2588();
    }

    @OriginalMember(owner = "client!in", name = "V", descriptor = "(III)V")
    public final void method535(int arg0, int arg1, int arg2) {
        this.field1038 = arg0 & 16777215;
        int var4 = this.field1038 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field1038 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field1038 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field1038 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field1025 = false;
        } else {
            this.field1025 = true;
        }
    }

    @OriginalMember(owner = "client!in", name = "ba", descriptor = "(IIII)V")
    public final void method536(int arg0, int arg1, int arg2, int arg3) {
        this.field1040 = arg0;
        this.field1038 = arg1;
        this.field1019 = arg2;
    }
}
