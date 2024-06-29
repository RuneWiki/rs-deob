import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class491 extends class544 {

    @OriginalMember(owner = "client!pga", name = "F", descriptor = "Z")
    private boolean field7082;

    @OriginalMember(owner = "client!pga", name = "I", descriptor = "Z")
    private boolean field7085;

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "Lpl;")
    private class616 field7079;

    @OriginalMember(owner = "client!pga", name = "Q", descriptor = "I")
    public int field7093;

    @OriginalMember(owner = "client!pga", name = "P", descriptor = "I")
    public int field7092;

    @OriginalMember(owner = "client!pga", name = "eb", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!pga", name = "T", descriptor = "I")
    public int field7095;

    @OriginalMember(owner = "client!pga", name = "L", descriptor = "I")
    public int field7088;

    @OriginalMember(owner = "client!pga", name = "Z", descriptor = "I")
    private int field7101;

    @OriginalMember(owner = "client!pga", name = "sb", descriptor = "I")
    public int field7120;

    @OriginalMember(owner = "client!pga", name = "hb", descriptor = "I")
    private int field7109;

    @OriginalMember(owner = "client!pga", name = "tb", descriptor = "I")
    public int field7121;

    @OriginalMember(owner = "client!pga", name = "Y", descriptor = "I")
    public int field7100;

    @OriginalMember(owner = "client!pga", name = "nb", descriptor = "I")
    public int field7115;

    @OriginalMember(owner = "client!pga", name = "N", descriptor = "I")
    public int field7090;

    @OriginalMember(owner = "client!pga", name = "ub", descriptor = "I")
    public int field7122;

    @OriginalMember(owner = "client!pga", name = "vb", descriptor = "I")
    public int field7123;

    @OriginalMember(owner = "client!pga", name = "xb", descriptor = "Z")
    private boolean field7125;

    @OriginalMember(owner = "client!pga", name = "V", descriptor = "Leda;")
    private class14 field7097;

    @OriginalMember(owner = "client!pga", name = "yb", descriptor = "I")
    private int field7126;

    @OriginalMember(owner = "client!pga", name = "X", descriptor = "Leda;")
    private class14 field7099;

    @OriginalMember(owner = "client!pga", name = "ob", descriptor = "Lvb;")
    public class629 field7116;

    @OriginalMember(owner = "client!pga", name = "J", descriptor = "I")
    private int field7086;

    @OriginalMember(owner = "client!pga", name = "D", descriptor = "I")
    private int field7080;

    @OriginalMember(owner = "client!pga", name = "E", descriptor = "I")
    private int field7081;

    @OriginalMember(owner = "client!pga", name = "K", descriptor = "I")
    private int field7087;

    @OriginalMember(owner = "client!pga", name = "M", descriptor = "I")
    public int field7089;

    @OriginalMember(owner = "client!pga", name = "O", descriptor = "I")
    public int field7091;

    @OriginalMember(owner = "client!pga", name = "S", descriptor = "I")
    public int field7094;

    @OriginalMember(owner = "client!pga", name = "U", descriptor = "I")
    private int field7096;

    @OriginalMember(owner = "client!pga", name = "bb", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!pga", name = "db", descriptor = "I")
    public int field7105;

    @OriginalMember(owner = "client!pga", name = "fb", descriptor = "I")
    public int field7107;

    @OriginalMember(owner = "client!pga", name = "ib", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!pga", name = "jb", descriptor = "I")
    public int field7111;

    @OriginalMember(owner = "client!pga", name = "kb", descriptor = "I")
    private int field7112;

    @OriginalMember(owner = "client!pga", name = "lb", descriptor = "I")
    private int field7113;

    @OriginalMember(owner = "client!pga", name = "mb", descriptor = "I")
    public int field7114;

    @OriginalMember(owner = "client!pga", name = "pb", descriptor = "I")
    private int field7117;

    @OriginalMember(owner = "client!pga", name = "rb", descriptor = "I")
    public int field7119;

    @OriginalMember(owner = "client!pga", name = "wb", descriptor = "I")
    public int field7124;

    @OriginalMember(owner = "client!pga", name = "ab", descriptor = "Lfi;")
    private class12 field7102;

    @OriginalMember(owner = "client!pga", name = "zb", descriptor = "Lit;")
    private class34 field7127;

    @OriginalMember(owner = "client!pga", name = "H", descriptor = "Llc;")
    public class434 field7084;

    @OriginalMember(owner = "client!pga", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7083;

    @OriginalMember(owner = "client!pga", name = "gb", descriptor = "[F")
    public float[] field7108;

    @OriginalMember(owner = "client!pga", name = "qb", descriptor = "[F")
    public float[] field7118;

    @OriginalMember(owner = "client!pga", name = "cb", descriptor = "[I")
    public int[] field7104;

    @OriginalMember(owner = "client!pga", name = "W", descriptor = "[Lqk;")
    private class145[] field7098;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(Z)V")
    public final void method246(boolean arg0) {
        this.field7125 = arg0;
        this.field7099.method76(20);
    }

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "()V")
    public final void method1274() {
        if (this.field7083 != null) {
            this.field7104 = this.field7084.field6344;
            this.field7119 = this.field7084.field6343;
            this.field7113 = this.field7084.field6340;
            this.field7118 = this.field7108;
            this.field7087 = this.field7112;
            this.field7117 = this.field7096;
        } else {
            this.field7119 = 1;
            this.field7113 = 1;
            this.field7104 = null;
            this.field7087 = 1;
            this.field7117 = 1;
            this.field7118 = null;
        }
        this.field7102 = null;
        this.method2990();
    }

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "(I)Lza;")
    public final class254 method260(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "()Z")
    public final boolean method1292() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "X", descriptor = "(I)V")
    public final void method395(int arg0) {
    }

    @OriginalMember(owner = "client!pga", name = "za", descriptor = "(IIIII)V")
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field7115) {
            var6 = this.field7115;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field7095) {
            var7 = this.field7095;
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
                if (var64 < this.field7122) {
                    var64 = this.field7122;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field7088) {
                    var65 = this.field7088;
                }
                int var66 = this.field7119 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field7104[var66++] = arg3;
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
                if (var60 < this.field7122) {
                    var60 = this.field7122;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field7088 - 1) {
                    var61 = this.field7088 - 1;
                }
                int var62 = this.field7119 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field7104[var62++] = arg3;
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
                if (var28 < this.field7122) {
                    var28 = this.field7122;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field7088) {
                    var29 = this.field7088;
                }
                int var30 = this.field7119 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field7104[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field7104[var30++] = var15 + var33;
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
                if (var22 < this.field7122) {
                    var22 = this.field7122;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field7088 - 1) {
                    var23 = this.field7088 - 1;
                }
                int var24 = this.field7119 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field7104[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field7104[var24++] = var15 + var27;
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
                if (var47 < this.field7122) {
                    var47 = this.field7122;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field7088) {
                    var48 = this.field7088;
                }
                int var49 = this.field7119 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field7104[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field7104[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field7122) {
                    var39 = this.field7122;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field7088 - 1) {
                    var40 = this.field7088 - 1;
                }
                int var41 = this.field7119 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field7104[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field7104[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "()Lqm;")
    public final class429 method1308() {
        return new class429(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[I[I)Laa;")
    public final class570 method282(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class169(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method2981(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method2981(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method2985(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method2985(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }
        } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
                int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
                int var26 = var25 % var23;
                int var27 = var21 + var23 - var24 - var26;
                var24 = var27 % var23;
                if (var24 < 0) {
                    var24 += var23;
                }
                arg0 += var10;
                var10 = -var10;
                arg1 += var11;
                var11 = -var11;
            }
            if (var10 > var11) {
                int var28 = arg1 << 16;
                int var29 = var28 + 32768;
                int var30 = var11 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
                int var32 = arg0 + var10;
                int var33 = arg4 >>> 24;
                int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                    if (arg5 == 1) {
                        int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                        int var36 = 256 - var33;
                        while (arg0 <= var32) {
                            int var37 = var29 >> 16;
                            if (arg0 >= this.field7122 && arg0 < this.field7088 && var37 >= this.field7115 && var37 < this.field7095 && var24 < var21) {
                                int var38 = this.field7119 * var37 + arg0;
                                int var39 = this.field7104[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field7104[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field7122 && arg0 < this.field7088 && var42 >= this.field7115 && var42 < this.field7095 && var24 < var21) {
                                int var43 = this.field7119 * var42 + arg0;
                                int var44 = this.field7104[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field7104[var43] = var45 - var47 | var47 - (var47 >>> 8);
                            }
                            var29 += var31;
                            ++arg0;
                            int var48 = var24 + var34;
                            var24 = var48 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var32) {
                        int var49 = var29 >> 16;
                        if (arg0 >= this.field7122 && arg0 < this.field7088 && var49 >= this.field7115 && var49 < this.field7095 && var24 < var21) {
                            this.field7104[this.field7119 * var49 + arg0] = arg4;
                        }
                        var29 += var31;
                        ++arg0;
                        int var50 = var24 + var34;
                        var24 = var50 % var23;
                    }
                }
            } else {
                int var51 = arg0 << 16;
                int var52 = var51 + 32768;
                int var53 = var10 << 16;
                int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
                int var55 = arg1 + var11;
                int var56 = arg4 >>> 24;
                int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
                    if (arg5 == 1) {
                        int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                        int var59 = 256 - var56;
                        while (arg1 <= var55) {
                            int var60 = var52 >> 16;
                            if (arg1 >= this.field7115 && arg1 < this.field7095 && var60 >= this.field7122 && var60 < this.field7088 && var24 < var21) {
                                int var61 = this.field7119 * arg1 + var60;
                                int var62 = this.field7104[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field7104[this.field7119 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field7115 && arg1 < this.field7095 && var65 >= this.field7122 && var65 < this.field7088 && var24 < var21) {
                                int var66 = this.field7119 * arg1 + var65;
                                int var67 = this.field7104[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field7104[var66] = var68 - var70 | var70 - (var70 >>> 8);
                            }
                            var52 += var54;
                            ++arg1;
                            int var71 = var24 + var57;
                            var24 = var71 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg1 <= var55) {
                        int var72 = var52 >> 16;
                        if (arg1 >= this.field7115 && arg1 < this.field7095 && var72 >= this.field7122 && var72 < this.field7088 && var24 < var21) {
                            this.field7104[this.field7119 * arg1 + var72] = arg4;
                        }
                        var52 += var54;
                        ++arg1;
                        int var73 = var24 + var57;
                        var24 = var73 % var23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "JA", descriptor = "(IIIIII)I")
    public final int method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field7116.field8816 + (float) arg0 * this.field7116.field8836 + (float) arg1 * this.field7116.field8833 + this.field7116.field8817;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field7116.field8816 + (float) arg3 * this.field7116.field8836 + (float) arg4 * this.field7116.field8833 + this.field7116.field8817;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field7093 && var9 < (float) this.field7093) {
            var7 |= 16;
        } else if (var8 > (float) this.field7100 && var9 > (float) this.field7100) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field7116.field8845 + (float) arg0 * this.field7116.field8826 + (float) arg1 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / var8);
        int var11 = (int) (((float) arg5 * this.field7116.field8845 + (float) arg3 * this.field7116.field8826 + (float) arg4 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / var9);
        if (var10 < this.field7111 && var11 < this.field7111) {
            var7 |= 1;
        } else if (var10 > this.field7124 && var11 > this.field7124) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field7116.field8815 + (float) arg0 * this.field7116.field8838 + (float) arg1 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / var8);
        int var13 = (int) (((float) arg5 * this.field7116.field8815 + (float) arg3 * this.field7116.field8838 + (float) arg4 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / var9);
        if (var12 < this.field7110 && var13 < this.field7110) {
            var7 |= 4;
        } else if (var12 > this.field7089 && var13 > this.field7089) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "(ILaa;II)V")
    public final void method287(int arg0, class570 arg1, int arg2, int arg3) {
        class169 var5 = (class169) arg1;
        int[] var6 = var5.field2929;
        int[] var7 = var5.field2931;
        int var8;
        if (this.field7095 < var6.length + arg3) {
            var8 = this.field7095 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field7115 > arg3) {
            var9 = this.field7115 - arg3;
            arg3 = this.field7115;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field7119 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field7122 > var12) {
                    var13 -= this.field7122 - var12;
                    var12 = this.field7122;
                }
                if (this.field7088 < var12 + var13) {
                    var13 = this.field7088 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field7104[var14++] = arg0;
                }
                var10 += this.field7119;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIII)V")
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "()Ltc;")
    public final class73 method236() {
        return this.field7116;
    }

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "()Z")
    public final boolean method239() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "()V")
    public final void method1258() {
    }

    @OriginalMember(owner = "client!pga", name = "M", descriptor = "()I")
    public final int method300() {
        int var1 = this.field7109;
        this.field7109 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIF)Lvt;")
    public final class759 method409(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([I)V")
    public final void method280(int[] arg0) {
        arg0[0] = this.field7119;
        arg0[1] = this.field7113;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ld;)V")
    private class491(class267 arg0) {
        super(arg0);
        this.field7082 = false;
        this.field7085 = false;
        this.field7079 = new class616(4);
        this.field7093 = 50;
        this.field7092 = 75518;
        this.field7106 = 78642;
        this.field7095 = 0;
        this.field7088 = 0;
        this.field7101 = 0;
        this.field7120 = 128;
        this.field7109 = 0;
        this.field7121 = 512;
        this.field7100 = 3500;
        this.field7115 = 0;
        this.field7090 = 45823;
        this.field7122 = 0;
        this.field7123 = 512;
        this.field7125 = false;
        this.field7097 = new class14(16);
        this.field7126 = -1;
        try {
            this.field7099 = new class14(256);
            this.field7116 = new class629();
            this.method322(1);
            this.method229(0);
            class614.method3506(true, (byte) 80, true);
            this.field7085 = true;
            this.field7086 = (int) class18.method109(-11121);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method3190((byte) 83);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(I)V")
    public final void method295(int arg0) {
        class280.field4288 = arg0;
        class280.field4359 = arg0;
        if (this.field7105 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method322(this.field7105);
            this.method229(0);
        }
    }

    @OriginalMember(owner = "client!pga", name = "K", descriptor = "([I)V")
    public final void method331(int[] arg0) {
        arg0[0] = this.field7122;
        arg0[1] = this.field7115;
        arg0[2] = this.field7088;
        arg0[3] = this.field7095;
    }

    @OriginalMember(owner = "client!pga", name = "DA", descriptor = "(IIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3) {
        this.field7091 = arg0;
        this.field7114 = arg1;
        this.field7123 = arg2;
        this.field7121 = arg3;
        this.method2980();
    }

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "(IIIIIII)I")
    public final int method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field7116.field8816 + (float) arg0 * this.field7116.field8836 + (float) arg1 * this.field7116.field8833 + this.field7116.field8817;
        float var9 = (float) arg5 * this.field7116.field8816 + (float) arg3 * this.field7116.field8836 + (float) arg4 * this.field7116.field8833 + this.field7116.field8817;
        int var10 = 0;
        if (var8 < (float) this.field7093 && var9 < (float) this.field7093) {
            var10 |= 16;
        } else if (var8 > (float) this.field7100 && var9 > (float) this.field7100) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field7116.field8845 + (float) arg0 * this.field7116.field8826 + (float) arg1 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field7116.field8845 + (float) arg3 * this.field7116.field8826 + (float) arg4 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / (float) arg6);
        if (var11 < this.field7111 && var12 < this.field7111) {
            var10 |= 1;
        } else if (var11 > this.field7124 && var12 > this.field7124) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field7116.field8815 + (float) arg0 * this.field7116.field8838 + (float) arg1 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field7116.field8815 + (float) arg3 * this.field7116.field8838 + (float) arg4 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / (float) arg6);
        if (var13 < this.field7110 && var14 < this.field7110) {
            var10 |= 4;
        } else if (var13 > this.field7089 && var14 > this.field7089) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!pga", name = "pa", descriptor = "()V")
    public final void method305() {
        for (int var1 = 0; var1 < this.field7098.length; ++var1) {
            this.field7098[var1].field2240 = this.field7098[var1].field2250;
            this.field7098[var1].field2249 = false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "E", descriptor = "()I")
    public final int method332() {
        return 0;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;")
    public final class72 method1242(class72 arg0, class72 arg1, float arg2, class72 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(II)V")
    public final void method223(int arg0, int arg1) {
        class145 var3 = this.method2979(Thread.currentThread());
        this.field7093 = arg0;
        this.field7100 = arg1;
        var3.field2255 = this.field7100 - 255;
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(II)I")
    public final int method351(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(I)Z")
    public final boolean method2976(int arg0) {
        return super.field7764.method1774(82, arg0).field8063 || super.field7764.method1774(92, arg0).field8078;
    }

    @OriginalMember(owner = "client!pga", name = "Y", descriptor = "()[I")
    public final int[] method217() {
        return new int[] { this.field7091, this.field7114, this.field7123, this.field7121 };
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "()Z")
    public final boolean method370() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method390(Canvas arg0) {
        if (this.field7083 == arg0) {
            this.method317((Canvas) null);
        }
        class434 var2 = (class434) this.field7079.method3512(true, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method636((byte) 97);
        }
    }

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "()V")
    public final void method427() {
        this.field7099.method76(-124);
        this.field7097.method76(-106);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIZ)Lit;")
    public final class34 method270(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field7119 * arg1 + arg0;
        int var8 = this.field7119 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field7104[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class513(this, var6, arg2, arg3);
        } else {
            return new class108(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method1272(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class556 {
        if (this.field7083 != null && this.field7084 != null) {
            try {
                Graphics var5 = this.field7083.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field7119 && var7.y + arg3 <= this.field7113 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field7084.method520(var7.y + arg3, var5, var7.x + arg2, 30075, var7.height, var7.width, var7.y, var7.x);
                    }
                }
            } catch (Exception var8) {
                this.field7083.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!pga", name = "GA", descriptor = "(I)V")
    public final void method1328(int arg0) {
        this.method410(0, 0, this.field7119, this.field7113, arg0, 0);
    }

    @OriginalMember(owner = "client!pga", name = "L", descriptor = "(III)V")
    public final void method253(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7098.length; ++var4) {
            class145 var5 = this.field7098[var4];
            var5.field2240 = arg0 & 16777215;
            int var6 = var5.field2240 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field2240 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field2240 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field2240 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field2245 = false;
            } else {
                var5.field2245 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "la", descriptor = "()V")
    public final void method374() {
        this.field7122 = 0;
        this.field7115 = 0;
        this.field7088 = this.field7119;
        this.field7095 = this.field7113;
        this.method2980();
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIIIII)V")
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method264(arg0, arg1, arg2, arg4, arg5);
        this.method264(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method292(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method292(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "()Z")
    public final boolean method320() {
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "()V")
    public final void method1285() {
    }

    @OriginalMember(owner = "client!pga", name = "H", descriptor = "(III[I)V")
    public final void method337(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field7116.field8816 + (float) arg0 * this.field7116.field8836 + (float) arg1 * this.field7116.field8833 + this.field7116.field8817;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field7116.field8845 + (float) arg0 * this.field7116.field8826 + (float) arg1 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / var5);
            int var7 = (int) (((float) arg2 * this.field7116.field8815 + (float) arg0 * this.field7116.field8838 + (float) arg1 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / var5);
            arg3[0] = var6 - this.field7111;
            arg3[1] = var7 - this.field7110;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "()V")
    public final void method1265() {
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(II)Lhu;")
    public final class224 method1288(int arg0, int arg1) {
        return this.method406(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ltc;)V")
    public final void method244(class73 arg0) {
        this.field7116 = (class629) arg0;
    }

    @OriginalMember(owner = "client!pga", name = "U", descriptor = "(IIIII)V")
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field7115 && arg1 < this.field7095) {
            if (arg0 < this.field7122) {
                arg2 -= this.field7122 - arg0;
                arg0 = this.field7122;
            }
            if (arg0 + arg2 > this.field7088) {
                arg2 = this.field7088 - arg0;
            }
            int var6 = this.field7119 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7104[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field7104[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field7104[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field7104[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field7104[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIZ)Lit;")
    public final class34 method406(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class513(this, arg0, arg1) : new class108(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lpia;[Lgu;Z)Lda;")
    public final class400 method424(class54 arg0, class726[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field10184;
            var5[var7] = arg1[var7].field10186;
            if (arg1[var7].field10185 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class534(this, arg0, arg1, var4, var5);
            } else {
                return new class50(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class568(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lvm;)V")
    public final void method238(class72 arg0) {
    }

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "(I)I")
    public final int method2977(int arg0) {
        return super.field7764.method1774(82, arg0).field8071 & 65535;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lpea;)V")
    public final void method1340(class456 arg0) {
        class12 var2 = (class12) arg0;
        this.field7119 = var2.field112;
        this.field7113 = var2.field114;
        this.field7104 = var2.field118;
        this.field7102 = var2;
        this.field7087 = var2.field112;
        this.field7117 = var2.field114;
        this.field7118 = var2.field113;
        this.method2990();
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V")
    public final void method322(int arg0) {
        this.field7105 = arg0;
        this.field7098 = new class145[this.field7105];
        for (int var2 = 0; var2 < this.field7105; ++var2) {
            this.field7098[var2] = new class145(this);
        }
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(IIIIII)V")
    private final void method2978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field7115) {
            var7 = this.field7115;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field7095) {
            var8 = this.field7095;
        }
        int var9 = var7;
        int var10 = arg3 * arg3;
        int var11 = 0;
        int var12 = arg1 - var7;
        int var13 = var12 * var12;
        int var14 = var13 - var12;
        if (arg1 > var8) {
            arg1 = var8;
        }
        int var15 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var15 == 255) {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var65 = arg0 - var11 + 1;
                if (var65 < this.field7122) {
                    var65 = this.field7122;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field7088) {
                    var66 = this.field7088;
                }
                int var67 = this.field7119 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field7118[var67]) {
                        this.field7104[var67] = arg4;
                    }
                    ++var67;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var56 = arg3;
            int var57 = var9 - arg1;
            int var58 = var57 * var57 + var10;
            int var59 = var58 - arg3;
            int var60 = var58 - var57;
            while (var9 < var8) {
                while (var60 > var10 && var59 > var10) {
                    var60 -= var56-- + var56;
                    var59 -= var56 + var56;
                }
                int var61 = arg0 - var56;
                if (var61 < this.field7122) {
                    var61 = this.field7122;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field7088 - 1) {
                    var62 = this.field7088 - 1;
                }
                int var63 = this.field7119 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field7118[var63]) {
                        this.field7104[var63] = arg4;
                    }
                    ++var63;
                }
                ++var9;
                var60 += var57 + var57;
                var59 += var57++ + var57;
            }
        } else if (arg5 == 1) {
            int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
            int var17 = 256 - var15;
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var29 = arg0 - var11 + 1;
                if (var29 < this.field7122) {
                    var29 = this.field7122;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field7088) {
                    var30 = this.field7088;
                }
                int var31 = this.field7119 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field7118[var31]) {
                        int var33 = this.field7104[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field7104[var31] = var16 + var34;
                    }
                    ++var31;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var18 = arg3;
            int var19 = -var12;
            int var20 = var19 * var19 + var10;
            int var21 = var20 - arg3;
            int var22 = var20 - var19;
            while (var9 < var8) {
                while (var22 > var10 && var21 > var10) {
                    var22 -= var18-- + var18;
                    var21 -= var18 + var18;
                }
                int var23 = arg0 - var18;
                if (var23 < this.field7122) {
                    var23 = this.field7122;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field7088 - 1) {
                    var24 = this.field7088 - 1;
                }
                int var25 = this.field7119 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field7118[var25]) {
                        int var27 = this.field7104[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field7104[var25] = var16 + var28;
                    }
                    ++var25;
                }
                ++var9;
                var22 += var19 + var19;
                var21 += var19++ + var19;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var48 = arg0 - var11 + 1;
                if (var48 < this.field7122) {
                    var48 = this.field7122;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field7088) {
                    var49 = this.field7088;
                }
                int var50 = this.field7119 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field7118[var50]) {
                        int var52 = this.field7104[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field7104[var50] = var53 - var55 | var55 - (var55 >>> 8);
                    }
                    ++var50;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var35 = arg3;
            int var36 = -var12;
            int var37 = var36 * var36 + var10;
            int var38 = var37 - arg3;
            int var39 = var37 - var36;
            while (var9 < var8) {
                while (var39 > var10 && var38 > var10) {
                    var39 -= var35-- + var35;
                    var38 -= var35 + var35;
                }
                int var40 = arg0 - var35;
                if (var40 < this.field7122) {
                    var40 = this.field7122;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field7088 - 1) {
                    var41 = this.field7088 - 1;
                }
                int var42 = this.field7119 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field7118[var42]) {
                        int var44 = this.field7104[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field7104[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([IIIIIZ)Lit;")
    public final class34 method231(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class513(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class108(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class513(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class108(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "()Z")
    public final boolean method381() {
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "()I")
    public final int method356() {
        return 0;
    }

    @OriginalMember(owner = "client!pga", name = "T", descriptor = "(IIII)V")
    public final void method298(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7122 < arg0) {
            this.field7122 = arg0;
        }
        if (this.field7115 < arg1) {
            this.field7115 = arg1;
        }
        if (this.field7088 > arg2) {
            this.field7088 = arg2;
        }
        if (this.field7095 > arg3) {
            this.field7095 = arg3;
        }
        this.method2980();
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lgu;Z)Lit;")
    public final class34 method310(class726 arg0, boolean arg1) {
        int[] var3 = arg0.field10183;
        byte[] var4 = arg0.field10181;
        int var5 = arg0.field10184;
        int var6 = arg0.field10186;
        class462 var11;
        if (arg1 && arg0.field10185 == null) {
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
            var11 = new class11(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field10185;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class513(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class108(this, var14, var5, var6);
            }
        }
        var11.method185(arg0.field10179, arg0.field10182, arg0.field10187, arg0.field10180);
        return var11;
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(IIIIII)Lvm;")
    public final class72 method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "()Z")
    public final boolean method218() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "()V")
    public final void method248() {
        if (this.field7085) {
            class342.method2203(false, true, 5438);
            this.field7085 = false;
        }
        this.field7084 = null;
        this.field7083 = null;
        this.field7081 = 0;
        this.field7080 = 0;
        this.field7079 = null;
        this.field7082 = true;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class491(Canvas arg0, class267 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method308(arg0, arg2, arg3);
            this.method317(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method3190((byte) 87);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V")
    public final void method261(int arg0) {
        int var2 = arg0 - this.field7086;
        for (Object var3 = this.field7099.method69(-6); var3 != null; var3 = this.field7099.method72(-95)) {
            class326 var4 = (class326) var3;
            if (var4.field4809) {
                var4.field4812 += var2;
                int var5 = var4.field4812 / 20;
                if (var5 > 0) {
                    class569 var6 = super.field7764.method1774(70, var4.field4808);
                    var4.method2105(var6.field8058 * var2 * 50 / 1000, var6.field8066 * var2 * 50 / 1000);
                    var4.field4812 -= var5 * 20;
                }
                var4.field4809 = false;
            }
        }
        this.field7086 = arg0;
        this.field7097.method68(-16878, 5);
        this.field7099.method68(-16878, 5);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/Runnable;)Lqk;")
    public final class145 method2979(Runnable arg0) {
        for (int var2 = 0; var2 < this.field7105; ++var2) {
            if (this.field7098[var2].field2247 == arg0) {
                return this.field7098[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.field7120 = arg0;
        this.field7099.method76(-98);
    }

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "()V")
    private final void method2980() {
        this.field7111 = this.field7122 - this.field7091;
        this.field7124 = this.field7088 - this.field7091;
        this.field7110 = this.field7115 - this.field7114;
        this.field7089 = this.field7095 - this.field7114;
        for (int var1 = 0; var1 < this.field7105; ++var1) {
            class240 var5 = this.field7098[var1].field2289;
            var5.field3866 = this.field7091 - this.field7122;
            var5.field3878 = this.field7114 - this.field7115;
            var5.field3870 = this.field7088 - this.field7122;
            var5.field3865 = this.field7095 - this.field7115;
        }
        int var2 = this.field7119 * this.field7115 + this.field7122;
        for (int var3 = this.field7115; var3 < this.field7095; ++var3) {
            for (int var4 = 0; var4 < this.field7105; ++var4) {
                this.field7098[var4].field2289.field3868[var3 - this.field7115] = var2;
            }
            var2 += this.field7119;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method361(Canvas arg0, int arg1, int arg2) {
        class434 var4 = (class434) this.field7079.method3512(true, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method636((byte) 97);
            class434 var5 = class477.method2902(arg0, 1196, arg2, arg1);
            this.field7079.method3516(255, (long) arg0.hashCode(), var5);
            if (this.field7083 == arg0 && this.field7102 == null) {
                Dimension var6 = arg0.getSize();
                this.field7081 = var6.width;
                this.field7080 = var6.height;
                this.field7084 = var5;
                this.field7104 = var5.field6344;
                this.field7119 = var5.field6343;
                this.field7113 = var5.field6340;
                if (this.field7119 != this.field7087 || this.field7117 != this.field7113) {
                    this.field7112 = this.field7087 = this.field7119;
                    this.field7096 = this.field7117 = this.field7113;
                    this.field7108 = this.field7118 = new float[this.field7117 * this.field7087];
                }
                this.method2990();
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "()Z")
    public final boolean method1237() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIII)V")
    private final void method2981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field7115 && arg1 < this.field7095) {
            int var9 = this.field7119 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field7122 && arg0 + var15 < this.field7088 && var12 < arg5) {
                            int var16 = this.field7104[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field7104[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field7122 && arg0 + var18 < this.field7088 && var12 < arg5) {
                            int var19 = this.field7104[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field7104[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                        }
                        ++var18;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var23 = 0;
                while (var23 < arg2) {
                    if (arg0 + var23 >= this.field7122 && arg0 + var23 < this.field7088 && var12 < arg5) {
                        this.field7104[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method2982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field7764.method1774(97, arg6).field8062) {
                if (this.field7126 != arg6) {
                    class34 var11 = (class34) this.field7097.method80((byte) -122, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method2988(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2983(arg6) ? 64 : this.field7120;
                        var11 = this.method3185(0, var12, false, var13, var13, var13);
                        this.field7097.method67((long) arg6, var11, -6772);
                    }
                    this.field7126 = arg6;
                    this.field7127 = var11;
                }
                ((class462) this.field7127).method46(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method2978(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pga", name = "xa", descriptor = "(F)V")
    public final void method328(float arg0) {
        this.field7092 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(I)V")
    public final void method229(int arg0) {
        this.field7098[arg0].method1114(Thread.currentThread(), false);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lhu;Lwm;)Lpea;")
    public final class456 method1344(class224 arg0, class28 arg1) {
        return new class12(this, (class34) arg0, (class10) arg1);
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "()Z")
    public final boolean method268() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "()Ltc;")
    public final class73 method343() {
        class145 var1 = this.method2979(Thread.currentThread());
        return var1.field2241;
    }

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "()Ltc;")
    public final class73 method414() {
        return new class629();
    }

    @OriginalMember(owner = "client!pga", name = "da", descriptor = "(III[I)V")
    public final void method249(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field7116.field8816 + (float) arg0 * this.field7116.field8836 + (float) arg1 * this.field7116.field8833 + this.field7116.field8817;
        if (!(var5 < (float) this.field7093) && !(var5 > (float) this.field7100)) {
            int var6 = (int) (((float) arg2 * this.field7116.field8845 + (float) arg0 * this.field7116.field8826 + (float) arg1 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / var5);
            int var7 = (int) (((float) arg2 * this.field7116.field8815 + (float) arg0 * this.field7116.field8838 + (float) arg1 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / var5);
            if (var6 >= this.field7111 && var6 <= this.field7124 && var7 >= this.field7110 && var7 <= this.field7089) {
                arg3[0] = var6 - this.field7111;
                arg3[1] = var7 - this.field7110;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(II)V")
    public final void method1261(int arg0, int arg1) throws class556 {
        if (this.field7083 != null && this.field7084 != null) {
            try {
                Graphics var3 = this.field7083.getGraphics();
                this.field7084.method520(arg1, var3, arg0, 30075, this.field7080, this.field7081, 0, 0);
            } catch (Exception var4) {
                this.field7083.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "(II)Lwm;")
    public final class28 method1276(int arg0, int arg1) {
        return new class10(arg0, arg1);
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIIID)V")
    public final void method1278(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field7087 - arg2;
        int var8 = this.field7087 * arg1 + arg0;
        float[] var9 = this.field7118;
        int var10 = 0;
        while (var10 < arg3) {
            int var11 = 0;
            while (var11 < arg2) {
                float var12 = var9[var8];
                if (var12 != 2.1474836E9F) {
                    var9[var8] = (float) ((double) var12 + arg4);
                }
                ++var11;
                ++var8;
            }
            ++var10;
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "()V")
    public final void method1338() {
    }

    @OriginalMember(owner = "client!pga", name = "ya", descriptor = "()V")
    public final void method1287() {
        if (this.field7122 == 0 && this.field7119 == this.field7088 && this.field7115 == 0 && this.field7113 == this.field7095) {
            int var1 = this.field7118.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field7118[var3++] = 2.1474836E9F;
                this.field7118[var3++] = 2.1474836E9F;
                this.field7118[var3++] = 2.1474836E9F;
                this.field7118[var3++] = 2.1474836E9F;
                this.field7118[var3++] = 2.1474836E9F;
                this.field7118[var3++] = 2.1474836E9F;
                this.field7118[var3++] = 2.1474836E9F;
                this.field7118[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field7118[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field7088 - this.field7122;
            int var5 = this.field7095 - this.field7115;
            int var6 = this.field7119 - var4;
            int var7 = this.field7119 * this.field7115 + this.field7122;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field7118[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "na", descriptor = "(IIII)[I")
    public final int[] method1262(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field7119 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field7104[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pga", name = "EA", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        class145 var5 = this.method2979(Thread.currentThread());
        var5.field2246 = arg0;
        var5.field2240 = arg1;
        var5.field2254 = arg2;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIII)V")
    public final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class145 var8 = this.method2979(Thread.currentThread());
        class240 var9 = var8.field2289;
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
            int var23 = arg0 - var9.method1662();
            int var24 = arg1 - var9.method1673();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field3875 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3875 = 255 - (arg4 >>> 24);
            }
            this.method326(false);
            var9.field3876 = var25 < 0 || var25 > var9.field3870 || var26 < 0 || var26 > var9.field3870 || var27 < 0 || var27 > var9.field3870;
            var9.method1668((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field3876 = var25 < 0 || var25 > var9.field3870 || var27 < 0 || var27 > var9.field3870 || var28 < 0 || var28 > var9.field3870;
            var9.method1668((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method326(true);
        }
    }

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "(I)Z")
    public final boolean method2983(int arg0) {
        return this.field7125 || super.field7764.method1774(48, arg0).field8067;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lmp;I)V")
    public final void method380(class315 arg0, int arg1) {
        class145 var3 = this.method2979(Thread.currentThread());
        class220 var4 = arg0.field4735.field3325;
        for (class220 var5 = var4.field3589; var4 != var5; var5 = var5.field3589) {
            class176 var6 = (class176) var5;
            int var7 = var6.field3015 >> 12;
            int var8 = var6.field3022 >> 12;
            int var9 = var6.field3016 >> 12;
            float var10 = (float) var9 * this.field7116.field8816 + (float) var7 * this.field7116.field8836 + (float) var8 * this.field7116.field8833 + this.field7116.field8817;
            if (!(var10 < (float) this.field7093) && !(var10 > (float) var3.field2255)) {
                int var11 = (int) (((float) var9 * this.field7116.field8845 + (float) var7 * this.field7116.field8826 + (float) var8 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / (float) arg1) + this.field7091;
                int var12 = (int) (((float) var9 * this.field7116.field8815 + (float) var7 * this.field7116.field8838 + (float) var8 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / (float) arg1) + this.field7114;
                if (var11 >= this.field7122 && var11 <= this.field7088 && var12 >= this.field7115 && var12 <= this.field7095) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method2987(var6, var11, var12, (int) var10, (this.field7123 * var6.field3017 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "(I)[I")
    public final int[] method2984(int arg0) {
        class14 var2 = this.field7099;
        class326 var3;
        synchronized (this.field7099) {
            var3 = (class326) this.field7099.method80((byte) -74, (long) arg0);
            if (var3 == null) {
                if (!super.field7764.method1772(-5919, arg0)) {
                    return null;
                }
                class569 var5 = super.field7764.method1774(53, arg0);
                int var6 = !var5.field8067 && !this.field7125 ? this.field7120 : 64;
                var3 = new class326(arg0, var6, super.field7764.method1771(0.7F, var6, arg0, var6, (byte) 70, true), var5.field8072 != 1);
                this.field7099.method67((long) arg0, var3, -6772);
            }
        }
        var3.field4809 = true;
        return var3.method2106();
    }

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "()Z")
    public final boolean method220() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "aa", descriptor = "(IIIIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field7122) {
            arg2 -= this.field7122 - arg0;
            arg0 = this.field7122;
        }
        if (arg1 < this.field7115) {
            arg3 -= this.field7115 - arg1;
            arg1 = this.field7115;
        }
        if (arg0 + arg2 > this.field7088) {
            arg2 = this.field7088 - arg0;
        }
        if (arg1 + arg3 > this.field7095) {
            arg3 = this.field7095 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7088 && arg1 <= this.field7095) {
            int var7 = this.field7119 - arg2;
            int var8 = this.field7119 * arg1 + arg0;
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
                            this.field7104[var24] = arg4;
                            ++var24;
                            this.field7104[var24] = arg4;
                            ++var24;
                            this.field7104[var24] = arg4;
                            ++var24;
                            this.field7104[var24] = arg4;
                            ++var24;
                            this.field7104[var24] = arg4;
                            ++var24;
                            this.field7104[var24] = arg4;
                            ++var24;
                            this.field7104[var24] = arg4;
                            ++var24;
                            this.field7104[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field7104[var24] = arg4;
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
                        int var14 = this.field7104[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field7104[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field7104[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field7104[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "(Z)V")
    public final void method326(boolean arg0) {
        class145 var2 = this.method2979(Thread.currentThread());
        var2.field2242 = arg0;
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(IIIIII)V")
    public final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method264(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method264(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method292(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method292(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field7122) {
                    var10 += (this.field7122 - arg0) * var12;
                    arg0 = this.field7122;
                }
                if (var13 >= this.field7088) {
                    var13 = this.field7088 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field7115 && var17 < this.field7095) {
                                int var18 = this.field7119 * var17 + arg0;
                                int var19 = this.field7104[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field7104[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field7115 && var21 < this.field7095) {
                                int var22 = this.field7119 * var21 + arg0;
                                int var23 = this.field7104[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field7104[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field7115 && var27 < this.field7095) {
                            this.field7104[this.field7119 * var27 + arg0] = arg4;
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
                if (arg1 < this.field7115) {
                    var29 += (this.field7115 - arg1) * var31;
                    arg1 = this.field7115;
                }
                if (var32 >= this.field7095) {
                    var32 = this.field7095 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field7122 && var46 < this.field7088) {
                            this.field7104[this.field7119 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field7122 && var36 < this.field7088) {
                            int var37 = this.field7119 * arg1 + var36;
                            int var38 = this.field7104[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field7104[this.field7119 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field7122 && var40 < this.field7088) {
                            int var41 = this.field7119 * arg1 + var40;
                            int var42 = this.field7104[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field7104[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "()Z")
    public final boolean method379() {
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class339 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class323(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIIIIIII)V")
    private final void method2985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field7122 && arg0 < this.field7088) {
            int var9 = this.field7119 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field7115 && arg1 + var15 < this.field7095 && var12 < arg5) {
                            int var16 = this.field7119 * var15 + var9;
                            int var17 = this.field7104[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field7104[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field7115 && arg1 + var19 < this.field7095 && var12 < arg5) {
                            int var20 = this.field7119 * var19 + var9;
                            int var21 = this.field7104[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field7104[var20] = var22 - var24 | var24 - (var24 >>> 8);
                        }
                        ++var19;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var25 = 0;
                while (var25 < arg2) {
                    if (arg1 + var25 >= this.field7115 && arg1 + var25 < this.field7095 && var12 < arg5) {
                        this.field7104[this.field7119 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
    public final void method423(int arg0) {
        this.field7098[arg0].method1114((Runnable) null, false);
    }

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "(I)I")
    public final int method2986(int arg0) {
        return super.field7764.method1774(58, arg0).field8072;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lej;IIII)V")
    private final void method2987(class176 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field3018;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2978(arg1, arg2, arg3, arg4, arg0.field3021, 1);
        } else {
            if (this.field7126 != var6) {
                class34 var9 = (class34) this.field7097.method80((byte) -73, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method2988(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2983(var6) ? 64 : this.field7120;
                    var9 = this.method3185(0, var10, false, var11, var11, var11);
                    this.field7097.method67((long) var6, var9, -6772);
                }
                this.field7126 = var6;
                this.field7127 = var9;
            }
            ++var8;
            ((class462) this.field7127).method46(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field3021, 1, 1);
        }
    }

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "()I")
    public final int method294() {
        return this.field7093;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFF)V")
    public final void method1268(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!pga", name = "KA", descriptor = "(IIII)V")
    public final void method240(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7119) {
            arg2 = this.field7119;
        }
        if (arg3 > this.field7113) {
            arg3 = this.field7113;
        }
        this.field7122 = arg0;
        this.field7088 = arg2;
        this.field7115 = arg1;
        this.field7095 = arg3;
        this.method2980();
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class145 var14 = this.method2979(Thread.currentThread());
        class240 var15 = var14.field2289;
        var15.field3867 = false;
        int var16 = arg0 - this.field7111;
        int var17 = arg3 - this.field7111;
        int var18 = arg6 - this.field7111;
        int var19 = arg1 - this.field7110;
        int var20 = arg4 - this.field7110;
        int var21 = arg7 - this.field7110;
        var15.field3876 = var16 < 0 || var16 > var15.field3870 || var17 < 0 || var17 > var15.field3870 || var18 < 0 || var18 > var15.field3870;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field3875 = 255 - var22;
                var15.field3879 = false;
                var15.method1664((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field3875 = 128;
                var15.field3879 = true;
                var15.method1664((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field3875 = 0;
            var15.field3879 = false;
            var15.method1664((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field3867 = true;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class169 var13 = (class169) arg6;
        int[] var14 = var13.field2929;
        int[] var15 = var13.field2931;
        int var16 = this.field7115 > arg8 ? this.field7115 : arg8;
        int var17 = this.field7095 < var14.length + arg8 ? this.field7095 : var14.length + arg8;
        int var18 = arg11 << 8;
        int var19 = arg9 << 8;
        int var20 = arg10 << 8;
        int var21 = var19 + var20;
        int var22 = var18 % var21;
        int var23 = arg2 - arg0;
        int var24 = arg3 - arg1;
        if (var23 + var24 < 0) {
            int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
                var22 += var21;
            }
            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
        }
        if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                if (arg5 == 1) {
                    int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var36 = 256 - var33;
                    while (arg0 <= var32) {
                        int var37 = var29 >> 16;
                        int var38 = var37 - arg8;
                        if (arg0 >= this.field7122 && arg0 < this.field7088 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field7119 * var37 + arg0;
                                int var41 = this.field7104[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field7104[var40] = var35 + var42;
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var43 = var22 + var34;
                        var22 = var43 % var21;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var32) {
                        int var44 = var29 >> 16;
                        int var45 = var44 - arg8;
                        if (arg0 >= this.field7122 && arg0 < this.field7088 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field7119 * var44 + arg0;
                                int var48 = this.field7104[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field7104[var47] = var49 - var51 | var51 - (var51 >>> 8);
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var52 = var22 + var34;
                        var22 = var52 % var21;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var32) {
                    int var53 = var29 >> 16;
                    int var54 = var53 - arg8;
                    if (arg0 >= this.field7122 && arg0 < this.field7088 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field7104[this.field7119 * var53 + arg0] = arg4;
                        }
                    }
                    var29 += var31;
                    ++arg0;
                    int var56 = var22 + var34;
                    var22 = var56 % var21;
                }
            }
        } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
            int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
                while (arg1 <= var62) {
                    int var80 = var58 >> 16;
                    int var81 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field7122 && var80 < this.field7088 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field7104[this.field7119 * arg1 + var80] = arg4;
                    }
                    var58 += var60;
                    ++arg1;
                    int var82 = var22 + var61;
                    var22 = var82 % var21;
                }
            } else if (arg5 == 1) {
                int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
                int var65 = 256 - var63;
                while (arg1 <= var62) {
                    int var66 = var58 >> 16;
                    int var67 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field7122 && var66 < this.field7088 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field7119 * arg1 + var66;
                        int var69 = this.field7104[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field7104[this.field7119 * arg1 + var66] = var64 + var70;
                    }
                    var58 += var60;
                    ++arg1;
                    int var71 = var22 + var61;
                    var22 = var71 % var21;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var62) {
                    int var72 = var58 >> 16;
                    int var73 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field7122 && var72 < this.field7088 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field7119 * arg1 + var72;
                        int var75 = this.field7104[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field7104[var74] = var76 - var78 | var78 - (var78 >>> 8);
                    }
                    var58 += var60;
                    ++arg1;
                    int var79 = var22 + var61;
                    var22 = var79 % var21;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "(I)[I")
    public final int[] method2988(int arg0) {
        class14 var2 = this.field7099;
        class326 var3;
        synchronized (this.field7099) {
            var3 = (class326) this.field7099.method80((byte) -107, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field7764.method1772(-5919, arg0)) {
                    return null;
                }
                class569 var5 = super.field7764.method1774(92, arg0);
                int var6 = !var5.field8067 && !this.field7125 ? this.field7120 : 64;
                var3 = new class326(arg0, var6, super.field7764.method1776(true, 0.7F, var6, (byte) 45, var6, arg0), var5.field8072 != 1);
                this.field7099.method67((long) arg0 | Long.MIN_VALUE, var3, -6772);
            }
        }
        var3.field4809 = true;
        return var3.method2106();
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lmp;)V")
    public final void method420(class315 arg0) {
        class145 var2 = this.method2979(Thread.currentThread());
        class220 var3 = arg0.field4735.field3325;
        for (class220 var4 = var3.field3589; var3 != var4; var4 = var4.field3589) {
            class176 var5 = (class176) var4;
            int var6 = var5.field3015 >> 12;
            int var7 = var5.field3022 >> 12;
            int var8 = var5.field3016 >> 12;
            float var9 = (float) var8 * this.field7116.field8816 + (float) var6 * this.field7116.field8836 + (float) var7 * this.field7116.field8833 + this.field7116.field8817;
            if (!(var9 < (float) this.field7093) && !(var9 > (float) var2.field2255)) {
                int var10 = (int) (((float) var8 * this.field7116.field8845 + (float) var6 * this.field7116.field8826 + (float) var7 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / var9) + this.field7091;
                int var11 = (int) (((float) var8 * this.field7116.field8815 + (float) var6 * this.field7116.field8838 + (float) var7 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / var9) + this.field7114;
                if (var10 >= this.field7122 && var10 <= this.field7088 && var11 >= this.field7115 && var11 <= this.field7095) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method2987(var5, var10, var11, (int) var9, (int) ((float) (this.field7123 * var5.field3017 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "B", descriptor = "()Z")
    public final boolean method2989() {
        return this.field7082;
    }

    @OriginalMember(owner = "client!pga", name = "F", descriptor = "(II)V")
    public final void method1290(int arg0, int arg1) {
        int var3 = this.field7119 * arg1 + arg0;
        int var4 = this.field7087 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field7104;
            float[] var6 = this.field7118;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class571.method3314(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class571.method3314(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class571.method3308(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class571.method3308(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "()V")
    private final void method2990() {
        for (int var1 = 0; var1 < this.field7105; ++var1) {
            this.field7098[var1].method1117(-4004);
        }
        this.method374();
    }

    @OriginalMember(owner = "client!pga", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method259(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field7090 = (int) (arg1 * 65535.0F);
        this.field7106 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field7107 = (int) (arg3 * 65535.0F / var7);
        this.field7103 = (int) (arg4 * 65535.0F / var7);
        this.field7094 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!pga", name = "XA", descriptor = "()I")
    public final int method377() {
        return this.field7100;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lb;IIII)Lka;")
    public final class282 method301(class352 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class280(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pga", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field7119 * arg1 + arg0;
            int var15 = this.field7119 - arg2;
            if (arg1 + arg3 > this.field7095) {
                arg3 -= arg1 + arg3 - this.field7095;
            }
            if (arg1 < this.field7115) {
                int var16 = this.field7115 - arg1;
                arg3 -= var16;
                var14 += this.field7119 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field7088) {
                int var17 = arg0 + arg2 - this.field7088;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field7122) {
                int var18 = this.field7122 - arg0;
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
                            int var28 = this.field7104[var14];
                            this.field7104[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field7104[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field7104[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field7104[var14++] = arg5;
                        } else {
                            this.field7104[var14++] = arg4;
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

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method308(Canvas arg0, int arg1, int arg2) {
        class434 var4 = (class434) this.field7079.method3512(true, (long) arg0.hashCode());
        if (var4 == null) {
            class434 var5 = class477.method2902(arg0, 1196, arg2, arg1);
            this.field7079.method3516(255, (long) arg0.hashCode(), var5);
        } else {
            if (var4.field6343 != arg1 || var4.field6340 != arg2) {
                this.method361(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "()Z")
    public final boolean method392() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method317(Canvas arg0) {
        if (arg0 != null) {
            class434 var2 = (class434) this.field7079.method3512(true, (long) arg0.hashCode());
            if (var2 != null) {
                this.field7083 = arg0;
                Dimension var3 = arg0.getSize();
                this.field7081 = var3.width;
                this.field7080 = var3.height;
                this.field7084 = var2;
                if (this.field7102 == null) {
                    this.field7104 = var2.field6344;
                    this.field7119 = var2.field6343;
                    this.field7113 = var2.field6340;
                    if (this.field7119 != this.field7087 || this.field7117 != this.field7113) {
                        this.field7112 = this.field7087 = this.field7119;
                        this.field7096 = this.field7117 = this.field7113;
                        this.field7108 = this.field7118 = new float[this.field7117 * this.field7087];
                    }
                    this.method2990();
                    return;
                }
            }
        } else {
            this.field7083 = null;
            this.field7084 = null;
            if (this.field7102 == null) {
                this.field7104 = null;
                this.field7119 = this.field7113 = 1;
                this.field7087 = this.field7117 = 1;
                this.method2990();
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "P", descriptor = "(IIIII)V")
    public final void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field7122 && arg0 < this.field7088) {
            if (arg1 < this.field7115) {
                arg2 -= this.field7115 - arg1;
                arg1 = this.field7115;
            }
            if (arg1 + arg2 > this.field7095) {
                arg2 = this.field7095 - arg1;
            }
            int var6 = this.field7119 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7119 * var10 + var6;
                        int var12 = this.field7104[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field7104[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field7119 * var14 + var6;
                        int var16 = this.field7104[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field7104[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field7104[this.field7119 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "I", descriptor = "()I")
    public final int method1273() {
        int var1 = this.field7101;
        this.field7101 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[Lvt;)V")
    public final void method339(int arg0, class759[] arg1) {
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lza;)V")
    public final void method285(class254 arg0) {
    }

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "(I)Z")
    public final boolean method2991(int arg0) {
        return super.field7764.method1772(-5919, arg0);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8) {
        class169 var10 = (class169) arg6;
        int[] var11 = var10.field2929;
        int[] var12 = var10.field2931;
        int var13 = this.field7115 > arg8 ? this.field7115 : arg8;
        int var14 = this.field7095 < var11.length + arg8 ? this.field7095 : var11.length + arg8;
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
            if (arg0 < this.field7122) {
                var18 += (this.field7122 - arg0) * var20;
                arg0 = this.field7122;
            }
            if (var21 >= this.field7088) {
                var21 = this.field7088 - 1;
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
                                int var28 = this.field7119 * var25 + arg0;
                                int var29 = this.field7104[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field7104[var28] = var23 + var30;
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
                                int var34 = this.field7119 * var31 + arg0;
                                int var35 = this.field7104[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field7104[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field7104[this.field7119 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field7122 && var64 < this.field7088 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field7104[this.field7119 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field7122 && var50 < this.field7088 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field7119 * arg1 + var50;
                        int var54 = this.field7104[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field7104[this.field7119 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field7122 && var56 < this.field7088 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field7119 * arg1 + var56;
                        int var60 = this.field7104[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field7104[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "ra", descriptor = "(IIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field7098.length; ++var5) {
            this.field7098[var5].field2250 = this.field7098[var5].field2240;
            this.field7098[var5].field2246 = arg0;
            this.field7098[var5].field2240 = arg1;
            this.field7098[var5].field2254 = arg2;
            this.field7098[var5].field2249 = true;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Z)V")
    public final void method1301(boolean arg0) {
    }

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "()Z")
    public final boolean method254() {
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "()Z")
    public final boolean method400() {
        return true;
    }

    @OriginalMember(owner = "client!pga", name = "HA", descriptor = "(IIII[I)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field7116.field8816 + (float) arg0 * this.field7116.field8836 + (float) arg1 * this.field7116.field8833 + this.field7116.field8817;
        if (!(var6 < (float) this.field7093) && !(var6 > (float) this.field7100)) {
            int var7 = (int) (((float) arg2 * this.field7116.field8845 + (float) arg0 * this.field7116.field8826 + (float) arg1 * this.field7116.field8821 + this.field7116.field8820) * (float) this.field7123 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field7116.field8815 + (float) arg0 * this.field7116.field8838 + (float) arg1 * this.field7116.field8841 + this.field7116.field8827) * (float) this.field7121 / (float) arg3);
            if (var7 >= this.field7111 && var7 <= this.field7124 && var8 >= this.field7110 && var8 <= this.field7089) {
                arg4[0] = var7 - this.field7111;
                arg4[1] = var8 - this.field7110;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }
}
