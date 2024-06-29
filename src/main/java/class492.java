import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class492 extends class38 {

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Z")
    private boolean field7069;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Z")
    private boolean field7074;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lgu;")
    private class412 field7072;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public int field7083;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public int field7081;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    private int field7090;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    private int field7091;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    private int field7075;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    private int field7079;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public int field7087;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public int field7092;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public int field7098;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "Z")
    public boolean field7077;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public int field7100;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public int field7094;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public int field7085;

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "I")
    public int field7107;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "Z")
    private boolean field7076;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public int field7082;

    @OriginalMember(owner = "client!cj", name = "hb", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public int field7099;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public int field7102;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "I")
    public int field7109;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "Lkh;")
    private class13 field7093;

    @OriginalMember(owner = "client!cj", name = "pb", descriptor = "I")
    private int field7118;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "Lkh;")
    private class13 field7108;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "Lgj;")
    public class451 field7105;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "F")
    private float field7086;

    @OriginalMember(owner = "client!cj", name = "lb", descriptor = "F")
    private float field7114;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    private int field7070;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public int field7078;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public int field7084;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public int field7088;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public int field7089;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public int field7095;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public int field7096;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public int field7097;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public int field7101;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    private int field7103;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    public int field7104;

    @OriginalMember(owner = "client!cj", name = "jb", descriptor = "I")
    public int field7112;

    @OriginalMember(owner = "client!cj", name = "nb", descriptor = "I")
    public int field7116;

    @OriginalMember(owner = "client!cj", name = "kb", descriptor = "Ll;")
    private class16 field7113;

    @OriginalMember(owner = "client!cj", name = "ob", descriptor = "Ll;")
    private class16 field7117;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lva;")
    private class346 field7073;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7071;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Z")
    public boolean field7080;

    @OriginalMember(owner = "client!cj", name = "mb", descriptor = "[I")
    public int[] field7115;

    @OriginalMember(owner = "client!cj", name = "ib", descriptor = "[Lps;")
    private class64[] field7111;

    @OriginalMember(owner = "client!cj", name = "OA", descriptor = "(IIII)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7112) {
            arg2 = this.field7112;
        }
        if (arg3 > this.field7103) {
            arg3 = this.field7103;
        }
        this.field7102 = arg0;
        this.field7110 = arg2;
        this.field7094 = arg1;
        this.field7083 = arg3;
        this.method2930();
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lpc;Lpc;FLpc;)Lpc;")
    public final class477 method338(class477 arg0, class477 arg1, float arg2, class477 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "()Z")
    public final boolean method295() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "(I)I")
    public final int method2924(int arg0) {
        return super.field524.method584(true, arg0).field4263 & 65535;
    }

    @OriginalMember(owner = "client!cj", name = "DA", descriptor = "(IIIIII[BII)V")
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field7112 * arg1 + arg0;
            int var15 = this.field7112 - arg2;
            if (arg1 + arg3 > this.field7083) {
                arg3 -= arg1 + arg3 - this.field7083;
            }
            if (arg1 < this.field7094) {
                int var16 = this.field7094 - arg1;
                arg3 -= var16;
                var14 += this.field7112 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field7110) {
                int var17 = arg0 + arg2 - this.field7110;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field7102) {
                int var18 = this.field7102 - arg0;
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
                            int var28 = this.field7115[var14];
                            this.field7115[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field7115[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field7115[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field7115[var14++] = arg5;
                        } else {
                            this.field7115[var14++] = arg4;
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

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)I")
    public final int method314(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lu;)V")
    public final void method281(class54 arg0) {
    }

    @OriginalMember(owner = "client!cj", name = "AA", descriptor = "(IIII)V")
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        this.field7079 = this.field7092;
        this.field7082 = arg0;
        this.field7092 = arg1;
        this.field7099 = arg2;
        this.field7077 = true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        class181 var10 = (class181) arg6;
        int[] var11 = var10.field2719;
        int[] var12 = var10.field2713;
        int var13 = this.field7094 > arg8 ? this.field7094 : arg8;
        int var14 = this.field7083 < var11.length + arg8 ? this.field7083 : var11.length + arg8;
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
            if (arg0 < this.field7102) {
                var18 += (this.field7102 - arg0) * var20;
                arg0 = this.field7102;
            }
            if (var21 >= this.field7110) {
                var21 = this.field7110 - 1;
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
                                int var28 = this.field7112 * var25 + arg0;
                                int var29 = this.field7115[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field7115[var28] = var23 + var30;
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
                                int var34 = this.field7112 * var31 + arg0;
                                int var35 = this.field7115[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field7115[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field7115[this.field7112 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field7102 && var64 < this.field7110 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field7115[this.field7112 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field7102 && var50 < this.field7110 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field7112 * arg1 + var50;
                        int var54 = this.field7115[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field7115[this.field7112 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field7102 && var56 < this.field7110 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field7112 * arg1 + var56;
                        int var60 = this.field7115[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field7115[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[Lqp;)V")
    public final void method359(int arg0, class470[] arg1) {
    }

    @OriginalMember(owner = "client!cj", name = "MA", descriptor = "(I)V")
    public final void method321(int arg0) {
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method272(Canvas arg0) {
        if (arg0 != null) {
            class346 var2 = (class346) this.field7072.method2585((byte) 114, (long) arg0.hashCode());
            if (var2 != null) {
                this.field7071 = arg0;
                this.field7073 = var2;
                if (this.field7113 == null) {
                    this.field7115 = var2.field5114;
                    this.field7112 = var2.field5118;
                    this.field7103 = var2.field5117;
                    this.method2933();
                    return;
                }
            }
        } else {
            this.field7071 = null;
            this.field7073 = null;
            if (this.field7113 == null) {
                this.field7115 = null;
                this.field7112 = this.field7103 = 1;
                this.method2933();
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "(F)V")
    public final void method271(float arg0) {
        this.field7087 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "(I)[I")
    private final int[] method2925(int arg0) {
        class13 var2 = this.field7108;
        class330 var3;
        synchronized (this.field7108) {
            var3 = (class330) this.field7108.method87((long) arg0, -2062335807);
            if (var3 == null) {
                if (!super.field524.method579(arg0, true)) {
                    return null;
                }
                class281 var5 = super.field524.method584(true, arg0);
                int var6 = !var5.field4257 && !this.field7076 ? 128 : 64;
                var3 = new class330(arg0, var6, super.field524.method581(arg0, true, var6, 112, var6, 0.7F), var5.field4272);
                this.field7108.method84((long) arg0, var3, (byte) 27);
            }
        }
        var3.field4955 = true;
        return var3.method2092();
    }

    @OriginalMember(owner = "client!cj", name = "ia", descriptor = "(II)V")
    public final void method292(int arg0, int arg1) {
        this.field7109 = arg0;
        this.field7091 = arg1;
        this.field7106 = this.field7091 - 255;
        this.method2929();
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public final void method302(int arg0) {
        int var2 = arg0 - this.field7070;
        for (Object var3 = this.field7108.method90(0); var3 != null; var3 = this.field7108.method94(30243)) {
            class330 var4 = (class330) var3;
            if (var4.field4955) {
                var4.field4953 += var2;
                int var5 = var4.field4953 / 20;
                if (var5 > 0) {
                    class281 var6 = super.field524.method584(true, var4.field4954);
                    var4.method2093(var6.field4269 * var2 * 50 / 1000, var6.field4276 * var2 * 50 / 1000);
                    var4.field4953 -= var5 * 20;
                }
                var4.field4955 = false;
            }
        }
        this.field7070 = arg0;
        this.field7093.method91(28, 5);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIF)Lqp;")
    public final class470 method322(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "()Z")
    public final boolean method328() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "IA", descriptor = "()I")
    public final int method353() {
        return 0;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(IIIIII)Lpc;")
    public final class477 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lpc;)V")
    public final void method370(class477 arg0) {
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)Lu;")
    public final class54 method337(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class16 method269(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field7112 * arg1 + arg0;
        int var8 = this.field7112 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field7115[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class47(this, var6, arg2, arg3);
        } else {
            return new class527(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "()V")
    public final void method267() {
        this.field7102 = 0;
        this.field7094 = 0;
        this.field7110 = this.field7112;
        this.field7083 = this.field7103;
        this.method2930();
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
    public final void method334(int arg0) {
        if (this.field7116 != arg0) {
            this.field7116 = arg0;
            this.field7111 = new class64[this.field7116];
            for (int var2 = 0; var2 < this.field7116; ++var2) {
                this.field7111[var2] = new class64(this);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "()V")
    public final void method343() {
    }

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "(I)V")
    public final void method360(int arg0) {
        this.method284(0, 0, this.field7112, this.field7103, arg0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "()Z")
    public final boolean method323() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "()Z")
    public final boolean method372() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "JA", descriptor = "(IIIIII)Z")
    public final boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field7105.field6593 * arg2 + this.field7105.field6584 * arg0 + this.field7105.field6583 * arg1 >> 15) + this.field7105.field6592;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field7105.field6593 * arg5 + this.field7105.field6584 * arg3 + this.field7105.field6583 * arg4 >> 15) + this.field7105.field6592;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field7109 || var8 >= this.field7109) && (var7 <= this.field7091 || var8 <= this.field7091)) {
            int var9 = ((this.field7105.field6585 * arg2 + this.field7105.field6591 * arg1 + this.field7105.field6586 * arg0 >> 15) + this.field7105.field6590) * this.field7081 / var7;
            int var10 = ((this.field7105.field6585 * arg5 + this.field7105.field6591 * arg4 + this.field7105.field6586 * arg3 >> 15) + this.field7105.field6590) * this.field7081 / var8;
            if (var9 < this.field7095 && var10 < this.field7095 || var9 > this.field7078 && var10 > this.field7078) {
                return false;
            } else {
                int var11 = ((this.field7105.field6588 * arg2 + this.field7105.field6589 * arg0 + this.field7105.field6582 * arg1 >> 15) + this.field7105.field6587) * this.field7107 / var7;
                int var12 = ((this.field7105.field6588 * arg5 + this.field7105.field6589 * arg3 + this.field7105.field6582 * arg4 >> 15) + this.field7105.field6587) * this.field7107 / var8;
                return (var11 >= this.field7104 || var12 >= this.field7104) && (var11 <= this.field7089 || var12 <= this.field7089);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "()Lc;")
    public final class125 method296() {
        class64 var1 = this.method2927(Thread.currentThread());
        return var1.field786;
    }

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "(III[I)V")
    public final void method356(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field7105.field6593 * arg2 + this.field7105.field6584 * arg0 + this.field7105.field6583 * arg1 >> 15) + this.field7105.field6592;
        if (var5 >= this.field7109 && var5 <= this.field7091) {
            int var6 = ((this.field7105.field6585 * arg2 + this.field7105.field6591 * arg1 + this.field7105.field6586 * arg0 >> 15) + this.field7105.field6590) * this.field7081 / var5;
            int var7 = ((this.field7105.field6588 * arg2 + this.field7105.field6589 * arg0 + this.field7105.field6582 * arg1 >> 15) + this.field7105.field6587) * this.field7107 / var5;
            if (var6 >= this.field7095 && var6 <= this.field7078 && var7 >= this.field7104 && var7 <= this.field7089) {
                arg3[0] = var6 - this.field7095;
                arg3[1] = var7 - this.field7104;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
    public final void method287(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cj", name = "TA", descriptor = "(IIIII)V")
    public final void method369(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field7102 && arg0 < this.field7110) {
            if (arg1 < this.field7094) {
                arg2 -= this.field7094 - arg1;
                arg1 = this.field7094;
            }
            if (arg1 + arg2 > this.field7083) {
                arg2 = this.field7083 - arg1;
            }
            int var6 = this.field7112 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7112 * var10 + var6;
                        int var12 = this.field7115[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field7115[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field7112 * var14 + var6;
                        int var16 = this.field7115[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field7115[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field7115[this.field7112 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "()I")
    public final int method315() {
        int var1 = this.field7075;
        this.field7075 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(FF)V")
    public final void method365(float arg0, float arg1) {
        this.field7114 = arg0;
        this.field7086 = arg1;
        this.method2929();
    }

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "()V")
    public final void method367() {
    }

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "()Z")
    public final boolean method347() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "()Z")
    public final boolean method333() {
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)I")
    public final int method317(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public final void method290(int arg0) {
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;)V")
    public class492(int arg0, Canvas arg1, class279 arg2) {
        this(arg0, arg2);
        this.method300(arg1);
        this.method272(arg1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()I")
    public final int method308() {
        return this.field7109;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method274(Canvas arg0) {
        class346 var2 = (class346) this.field7072.method2585((byte) 114, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2677(-22491);
            class346 var3 = class167.method1125(arg0, (byte) -90);
            this.field7072.method2591((long) arg0.hashCode(), var3, (byte) 42);
            if (this.field7071 == arg0 && this.field7113 == null) {
                this.field7073 = var3;
                this.field7115 = var3.field5114;
                this.field7112 = var3.field5118;
                this.field7103 = var3.field5117;
                this.method2933();
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "()V")
    public final void method331() {
        this.field7092 = this.field7079;
        this.field7077 = false;
    }

    @OriginalMember(owner = "client!cj", name = "ZA", descriptor = "()I")
    public final int method341() {
        int var1 = this.field7090;
        this.field7090 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cj", name = "GA", descriptor = "(IIII)V")
    public final void method342(int arg0, int arg1, int arg2, int arg3) {
        this.field7082 = arg0;
        this.field7092 = arg1;
        this.field7099 = arg2;
    }

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "()V")
    public final void method306() {
    }

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "()Z")
    public final boolean method358() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "(I)[I")
    public final int[] method2926(int arg0) {
        class13 var2 = this.field7108;
        class330 var3;
        synchronized (this.field7108) {
            var3 = (class330) this.field7108.method87((long) arg0, -2062335807);
            if (var3 == null) {
                if (!super.field524.method579(arg0, true)) {
                    return null;
                }
                class281 var5 = super.field524.method584(true, arg0);
                int var6 = !var5.field4257 && !this.field7076 ? 128 : 64;
                var3 = new class330(arg0, var6, super.field524.method583(var6, var6, arg0, 0.7F, (byte) -124, true), var5.field4272);
                this.field7108.method84((long) arg0, var3, (byte) 27);
            }
        }
        var3.field4955 = true;
        return var3.method2092();
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method300(Canvas arg0) {
        class346 var2 = (class346) this.field7072.method2585((byte) 114, (long) arg0.hashCode());
        if (var2 == null) {
            class346 var3 = class167.method1125(arg0, (byte) -109);
            this.field7072.method2591((long) arg0.hashCode(), var3, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([Lt;Lc;[Lju;I)V")
    public final void method273(class475[] arg0, class125 arg1, class83[] arg2, int arg3) {
        class370[] var5 = new class370[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class370) arg0[var6];
            }
        }
        class370 var7 = class370.method2304(this, var5);
        var7.method2322(arg1, arg2 != null ? arg2[0] : null, (class341) null, arg3);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([Lt;Lkp;Lc;[Lju;I)V")
    public final void method279(class475[] arg0, class341 arg1, class125 arg2, class83[] arg3, int arg4) {
        class370[] var6 = new class370[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class370) arg0[var7];
            }
        }
        class370 var8 = class370.method2304(this, var6);
        var8.method2322(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/Runnable;)Lps;")
    public final class64 method2927(Runnable arg0) {
        for (int var2 = 0; var2 < this.field7116; ++var2) {
            if (this.field7111[var2].field788 == arg0) {
                return this.field7111[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "()Z")
    public final boolean method327() {
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
        this.field7076 = arg0;
        this.field7108.method93((byte) 115);
    }

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "(I)Z")
    public final boolean method2928(int arg0) {
        return super.field524.method579(arg0, true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lt;Lkp;Lc;Lju;I)V")
    public final void method311(class475 arg0, class341 arg1, class125 arg2, class83 arg3, int arg4) {
        ((class370) arg0).method2322(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method264(Rectangle[] arg0, int arg1) {
        if (this.field7071 != null && this.field7073 != null) {
            try {
                Graphics var3 = this.field7071.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field7112 && var5.y <= this.field7103 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field7073.method1904(var5.height, var5.x, var3, var5.y, 54, var5.width);
                    }
                }
            } catch (Exception var6) {
                this.field7071.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "()Z")
    public final boolean method355() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "()I")
    public final int method301() {
        return 0;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()Lc;")
    public final class125 method291() {
        return new class451();
    }

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "()V")
    private final void method2929() {
        if (this.field7086 != 0.0F) {
            float var1 = (float) this.field7091;
            float var2 = (float) this.field7109;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field7114 / (this.field7114 + this.field7086);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field7086;
            this.field7085 = (int) (((float) this.field7091 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field7085 = this.field7091;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method294(Canvas arg0) {
        if (this.field7071 == arg0) {
            this.method272((Canvas) null);
        }
        class346 var2 = (class346) this.field7072.method2585((byte) 114, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2677(-22491);
        }
    }

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "()V")
    public final void method320() {
        this.field7108.method93((byte) 87);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(Z)V")
    public final void method329(boolean arg0) {
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final void method265(int arg0) {
        this.field7111[arg0].method553(false, (Runnable) null);
    }

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "()Z")
    public final boolean method354() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "UA", descriptor = "(III)V")
    public final void method371(int arg0, int arg1, int arg2) {
        this.field7092 = arg0 & 16777215;
        int var4 = this.field7092 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field7092 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field7092 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field7092 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field7080 = false;
        } else {
            this.field7080 = true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "()V")
    private final void method2930() {
        this.field7095 = this.field7102 - this.field7084;
        this.field7078 = this.field7110 - this.field7084;
        this.field7104 = this.field7094 - this.field7088;
        this.field7089 = this.field7083 - this.field7088;
        for (int var1 = 0; var1 < this.field7116; ++var1) {
            class461 var5 = this.field7111[var1].field790;
            var5.field6699 = this.field7084 - this.field7102;
            var5.field6709 = this.field7088 - this.field7094;
            var5.field6708 = this.field7110 - this.field7102;
            var5.field6705 = this.field7083 - this.field7094;
        }
        int var2 = this.field7112 * this.field7094 + this.field7102;
        for (int var3 = this.field7094; var3 < this.field7083; ++var3) {
            for (int var4 = 0; var4 < this.field7116; ++var4) {
                this.field7111[var4].field790.field6706[var3 - this.field7094] = var2;
            }
            var2 += this.field7112;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII)V")
    public final void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class64 var8 = this.method2927(Thread.currentThread());
        class461 var9 = var8.field790;
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
            int var21 = arg0 - var9.method2790();
            int var22 = arg1 - var9.method2793();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field6707 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field6707 = 255 - (arg4 >> 24);
            }
            var9.field6701 = var23 < 0 || var23 > var9.field6708 || var24 < 0 || var24 > var9.field6708 || var25 < 0 || var25 > var9.field6708;
            var9.method2791(var27, var28, var29, var23, var24, var25, arg4);
            var9.field6701 = var23 < 0 || var23 > var9.field6708 || var24 < 0 || var24 > var9.field6708 || var26 < 0 || var26 > var9.field6708;
            var9.method2791(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class64 var11 = this.method2927(Thread.currentThread());
        class461 var12 = var11.field790;
        var12.field6704 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field6704 = false;
            var12.field6707 = 0;
            var12.field6701 = true;
            var12.method2795(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field6704 = false;
            var12.field6707 = 255 - var13;
            var12.field6701 = true;
            var12.method2795(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field6704 = true;
    }

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "(I)Z")
    public final boolean method2931(int arg0) {
        return this.field7076 || super.field524.method584(true, arg0).field4257;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public final void method318(int arg0) {
        this.field7111[arg0].method553(false, Thread.currentThread());
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIII)V")
    public final void method304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field7094 && arg1 < this.field7083) {
            if (arg0 < this.field7102) {
                arg2 -= this.field7102 - arg0;
                arg0 = this.field7102;
            }
            if (arg0 + arg2 > this.field7110) {
                arg2 = this.field7110 - arg0;
            }
            int var6 = this.field7112 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7115[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field7115[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field7115[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field7115[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field7115[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "()V")
    public final void method357() {
        if (this.field7071 != null && this.field7073 != null) {
            try {
                Graphics var1 = this.field7071.getGraphics();
                this.field7073.method1905(0, var1, 0, -10);
            } catch (Exception var2) {
                this.field7071.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lkp;)V")
    public final void method368(class341 arg0) {
        class505 var2 = arg0.field5066.field6456;
        for (class505 var3 = var2.field7378; var2 != var3; var3 = var3.field7378) {
            class456 var4 = (class456) var3;
            int var5 = var4.field6631 >> 12;
            int var6 = var4.field6633 >> 12;
            int var7 = var4.field6640 >> 12;
            int var8 = (this.field7105.field6593 * var7 + this.field7105.field6584 * var5 + this.field7105.field6583 * var6 >> 15) + this.field7105.field6592;
            if (var8 >= this.field7109 && var8 <= this.field7106) {
                int var9 = ((this.field7105.field6585 * var7 + this.field7105.field6591 * var6 + this.field7105.field6586 * var5 >> 15) + this.field7105.field6590) * this.field7081 / var8 + this.field7084;
                int var10 = ((this.field7105.field6588 * var7 + this.field7105.field6589 * var5 + this.field7105.field6582 * var6 >> 15) + this.field7105.field6587) * this.field7107 / var8 + this.field7088;
                if (var9 >= this.field7102 && var9 <= this.field7110 && var10 >= this.field7094 && var10 <= this.field7083) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2935(var4, var9, var10, (var4.field6632 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()Z")
    public final boolean method283() {
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "()Z")
    public final boolean method2932() {
        return this.field7074;
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "()V")
    public final void method297() {
    }

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "()V")
    private final void method2933() {
        for (int var1 = 0; var1 < this.field7116; ++var1) {
            this.field7111[var1].method556(23751);
        }
        this.method267();
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class145 method361(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class311(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cj", name = "da", descriptor = "([I)V")
    public final void method351(int[] arg0) {
        arg0[0] = this.field7102;
        arg0[1] = this.field7094;
        arg0[2] = this.field7110;
        arg0[3] = this.field7083;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(FFF)V")
    public final void method339(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cj", name = "xa", descriptor = "()F")
    public final float method275() {
        return this.field7086;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([IIIII)Ll;")
    public final class16 method350(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class47(this, arg0, arg1, arg2, arg3, arg4) : new class527(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class47(this, arg0, arg1, arg2, arg3, arg4) : new class527(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "()Z")
    public final boolean method340() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "(IIII)V")
    public final void method268(int arg0, int arg1, int arg2, int arg3) {
        this.field7084 = arg0;
        this.field7088 = arg1;
        this.field7081 = arg2;
        this.field7107 = arg3;
        this.method2930();
    }

    @OriginalMember(owner = "client!cj", name = "ea", descriptor = "(Lc;)V")
    public final void method362(class125 arg0) {
        this.field7105 = (class451) arg0;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIII)V")
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method304(arg0, arg1, arg2, arg4, arg5);
        this.method304(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method369(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method369(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!cj", name = "fa", descriptor = "(IIII)V")
    public final void method344(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7102 < arg0) {
            this.field7102 = arg0;
        }
        if (this.field7094 < arg1) {
            this.field7094 = arg1;
        }
        if (this.field7110 > arg2) {
            this.field7110 = arg2;
        }
        if (this.field7083 > arg3) {
            this.field7083 = arg3;
        }
        this.method2930();
    }

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "()V")
    public final void method349() {
        if (this.field7069) {
            class130.method964((byte) -126, false, true);
            this.field7069 = false;
        }
        this.field7073 = null;
        this.field7071 = null;
        this.field7072 = null;
        this.field7074 = true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field524.method584(true, arg5).field4259) {
                if (this.field7118 != arg5) {
                    class16 var10 = (class16) this.field7093.method87((long) arg5, -2062335807);
                    if (var10 == null) {
                        int[] var11 = this.method2925(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method2931(arg5) ? 64 : 128;
                        var10 = this.method350(var11, 0, var12, var12, var12);
                        this.field7093.method84((long) arg5, var10, (byte) 27);
                    }
                    this.field7118 = arg5;
                    this.field7117 = var10;
                }
                this.field7117.method135(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method336(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[I[I)Lma;")
    public final class10 method325(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class181(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lck;III)V")
    public final void method2935(class456 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field6638;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method336(arg1, arg2, var6, arg0.field6641, 1);
        } else {
            if (this.field7118 != var5) {
                class16 var7 = (class16) this.field7093.method87((long) var5, -2062335807);
                if (var7 == null) {
                    int[] var8 = this.method2925(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method2931(var5) ? 64 : 128;
                    var7 = this.method350(var8, 0, var9, var9, var9);
                    this.field7093.method84((long) var5, var7, (byte) 27);
                }
                this.field7118 = var5;
                this.field7117 = var7;
            }
            if (this.field7117.method129() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field7117.method135(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field6641, 1);
        }
    }

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "(IFFFFF)V")
    public final void method324(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field7098 = (int) (arg1 * 65535.0F);
        this.field7100 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field7101 = (int) (arg3 * 65535.0F / var7);
        this.field7097 = (int) (arg4 * 65535.0F / var7);
        this.field7096 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Llm;[Ldi;Z)Lla;")
    public final class317 method366(class348 arg0, class84[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1204;
            var5[var7] = arg1[var7].field1207;
            if (arg1[var7].field1210 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class478(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class115(this, arg0, arg1, var4, var5);
        } else {
            return new class394(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public final void method282(boolean arg0) {
    }

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "()Z")
    public final boolean method346() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "()F")
    public final float method335() {
        return this.field7114;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ldi;Z)Ll;")
    public final class16 method345(class84 arg0, boolean arg1) {
        int[] var3 = arg0.field1208;
        byte[] var4 = arg0.field1211;
        int var5 = arg0.field1204;
        int var6 = arg0.field1207;
        class441 var11;
        if (arg1 && arg0.field1210 == null) {
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
            var11 = new class243(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1210;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class47(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class47(this, var14, var5, var6);
                var11 = new class527(this, var14, var5, var6);
            }
        }
        var11.method130(arg0.field1205, arg0.field1209, arg0.field1206, arg0.field1212);
        return var11;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(ILga;)V")
    private class492(int arg0, class279 arg1) {
        super(arg0, arg1);
        this.field7069 = false;
        this.field7074 = false;
        this.field7072 = new class412(4);
        this.field7083 = 0;
        this.field7081 = 512;
        this.field7090 = 0;
        this.field7091 = 3500;
        this.field7075 = 0;
        this.field7079 = 0;
        this.field7087 = 75518;
        this.field7092 = 0;
        this.field7098 = 45823;
        this.field7077 = false;
        this.field7100 = 78642;
        this.field7094 = 0;
        this.field7085 = 3500;
        this.field7107 = 512;
        this.field7076 = false;
        this.field7082 = 0;
        this.field7110 = 0;
        this.field7099 = 0;
        this.field7102 = 0;
        this.field7106 = this.field7091 - 255;
        this.field7109 = 50;
        this.field7093 = new class13(16);
        this.field7118 = -1;
        this.field7108 = new class13(20);
        this.field7105 = new class451();
        this.method334(1);
        this.method318(0);
        class257.method1714((byte) 84, true, false);
        this.field7069 = true;
    }

    @OriginalMember(owner = "client!cj", name = "YA", descriptor = "()I")
    public final int method299() {
        return this.field7091;
    }

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "()Z")
    public final boolean method307() {
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "(I)Z")
    public final boolean method2936(int arg0) {
        return super.field524.method584(true, arg0).field4274;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ltp;IIII)Lt;")
    public final class475 method330(class374 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class370(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cj", name = "NA", descriptor = "(IIIII)V")
    public final void method336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field7094) {
            var6 = this.field7094;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field7083) {
            var7 = this.field7083;
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
                if (var64 < this.field7102) {
                    var64 = this.field7102;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field7110) {
                    var65 = this.field7110;
                }
                int var66 = this.field7112 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field7115[var66++] = arg3;
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
                if (var60 < this.field7102) {
                    var60 = this.field7102;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field7110 - 1) {
                    var61 = this.field7110 - 1;
                }
                int var62 = this.field7112 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field7115[var62++] = arg3;
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
                if (var28 < this.field7102) {
                    var28 = this.field7102;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field7110) {
                    var29 = this.field7110;
                }
                int var30 = this.field7112 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field7115[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field7115[var30++] = var15 + var33;
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
                if (var22 < this.field7102) {
                    var22 = this.field7102;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field7110 - 1) {
                    var23 = this.field7110 - 1;
                }
                int var24 = this.field7112 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field7115[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field7115[var24++] = var15 + var27;
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
                if (var47 < this.field7102) {
                    var47 = this.field7102;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field7110) {
                    var48 = this.field7110;
                }
                int var49 = this.field7112 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field7115[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field7115[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field7102) {
                    var39 = this.field7102;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field7110 - 1) {
                    var40 = this.field7110 - 1;
                }
                int var41 = this.field7112 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field7115[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field7115[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(IIIIII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method304(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method304(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method369(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method369(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field7102) {
                    var10 += (this.field7102 - arg0) * var12;
                    arg0 = this.field7102;
                }
                if (var13 >= this.field7110) {
                    var13 = this.field7110 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field7094 && var17 < this.field7083) {
                                int var18 = this.field7112 * var17 + arg0;
                                int var19 = this.field7115[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field7115[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field7094 && var21 < this.field7083) {
                                int var22 = this.field7112 * var21 + arg0;
                                int var23 = this.field7115[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field7115[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field7094 && var27 < this.field7083) {
                            this.field7115[this.field7112 * var27 + arg0] = arg4;
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
                if (arg1 < this.field7094) {
                    var29 += (this.field7094 - arg1) * var31;
                    arg1 = this.field7094;
                }
                if (var32 >= this.field7083) {
                    var32 = this.field7083 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field7102 && var46 < this.field7110) {
                            this.field7115[this.field7112 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field7102 && var36 < this.field7110) {
                            int var37 = this.field7112 * arg1 + var36;
                            int var38 = this.field7115[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field7115[this.field7112 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field7102 && var40 < this.field7110) {
                            int var41 = this.field7112 * arg1 + var40;
                            int var42 = this.field7115[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field7115[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "(IIII)[I")
    public final int[] method280(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field7112 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field7115[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "()Z")
    public final boolean method348() {
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "(IIIIII)V")
    public final void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field7102) {
            arg2 -= this.field7102 - arg0;
            arg0 = this.field7102;
        }
        if (arg1 < this.field7094) {
            arg3 -= this.field7094 - arg1;
            arg1 = this.field7094;
        }
        if (arg0 + arg2 > this.field7110) {
            arg2 = this.field7110 - arg0;
        }
        if (arg1 + arg3 > this.field7083) {
            arg3 = this.field7083 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7110 && arg1 <= this.field7083) {
            int var7 = this.field7112 - arg2;
            int var8 = this.field7112 * arg1 + arg0;
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
                            this.field7115[var24] = arg4;
                            ++var24;
                            this.field7115[var24] = arg4;
                            ++var24;
                            this.field7115[var24] = arg4;
                            ++var24;
                            this.field7115[var24] = arg4;
                            ++var24;
                            this.field7115[var24] = arg4;
                            ++var24;
                            this.field7115[var24] = arg4;
                            ++var24;
                            this.field7115[var24] = arg4;
                            ++var24;
                            this.field7115[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field7115[var24] = arg4;
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
                        int var14 = this.field7115[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field7115[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field7115[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field7115[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "ca", descriptor = "(ILma;II)V")
    public final void method270(int arg0, class10 arg1, int arg2, int arg3) {
        class181 var5 = (class181) arg1;
        int[] var6 = var5.field2719;
        int[] var7 = var5.field2713;
        int var8;
        if (this.field7083 < var6.length + arg3) {
            var8 = this.field7083 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field7094 > arg3) {
            var9 = this.field7094 - arg3;
            arg3 = this.field7094;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field7112 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field7102 > var12) {
                    var13 -= this.field7102 - var12;
                    var12 = this.field7102;
                }
                if (this.field7110 < var12 + var13) {
                    var13 = this.field7110 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field7115[var14++] = arg0;
                }
                var10 += this.field7112;
            }
        }
    }
}
