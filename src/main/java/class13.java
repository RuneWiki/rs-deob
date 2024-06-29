import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class13 extends class11 {

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "Z")
    private boolean field126;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "Z")
    private boolean field128;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Lmt;")
    private class517 field123;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Z")
    private boolean field156;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "Z")
    public boolean field169;

    @OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Ljo;")
    private class382 field152;

    @OriginalMember(owner = "client!dg", name = "pb", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "Ljo;")
    private class382 field168;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "Lct;")
    public class308 field134;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "F")
    private float field130;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "F")
    private float field139;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "Lgw;")
    private class108 field125;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Ll;")
    private class127 field148;

    @OriginalMember(owner = "client!dg", name = "qb", descriptor = "Ll;")
    private class127 field172;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field124;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "Z")
    public boolean field140;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "[I")
    public int[] field164;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "[Lgg;")
    private class215[] field153;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method108(Canvas arg0) {
        if (arg0 != null) {
            class108 var2 = (class108) this.field123.method3059(116, (long) arg0.hashCode());
            if (var2 != null) {
                this.field124 = arg0;
                this.field125 = var2;
                if (this.field148 == null) {
                    this.field164 = var2.field1605;
                    this.field145 = var2.field1601;
                    this.field141 = var2.field1604;
                    this.method175();
                    return;
                }
            }
        } else {
            this.field124 = null;
            this.field125 = null;
            if (this.field148 == null) {
                this.field164 = null;
                this.field145 = this.field141 = 1;
                this.method175();
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "(IFFFFF)V")
    public final void method122(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field143 = (int) (arg1 * 65535.0F);
        this.field165 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field136 = (int) (arg3 * 65535.0F / var7);
        this.field129 = (int) (arg4 * 65535.0F / var7);
        this.field157 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lqs;)V")
    public final void method148(class50 arg0) {
    }

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "()Z")
    public final boolean method95() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method96(int arg0) {
        this.field153[arg0].method1373(8191, (Runnable) null);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public final void method57(boolean arg0) {
        this.field156 = arg0;
        this.field168.method2293(false);
    }

    @OriginalMember(owner = "client!dg", name = "DA", descriptor = "(IIIIII[BII)V")
    public final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field145 * arg1 + arg0;
            int var15 = this.field145 - arg2;
            if (arg1 + arg3 > this.field162) {
                arg3 -= arg1 + arg3 - this.field162;
            }
            if (arg1 < this.field142) {
                int var16 = this.field142 - arg1;
                arg3 -= var16;
                var14 += this.field145 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field131) {
                int var17 = arg0 + arg2 - this.field131;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field163) {
                int var18 = this.field163 - arg0;
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
                            int var28 = this.field164[var14];
                            this.field164[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field164[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field164[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field164[var14++] = arg5;
                        } else {
                            this.field164[var14++] = arg4;
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

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "(F)V")
    public final void method90(float arg0) {
        this.field151 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)V")
    public final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class215 var8 = this.method179(Thread.currentThread());
        class106 var9 = var8.field3063;
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
            int var21 = arg0 - var9.method791();
            int var22 = arg1 - var9.method794();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field1590 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1590 = 255 - (arg4 >> 24);
            }
            var9.field1589 = var23 < 0 || var23 > var9.field1586 || var24 < 0 || var24 > var9.field1586 || var25 < 0 || var25 > var9.field1586;
            var9.method793(var27, var28, var29, var23, var24, var25, arg4);
            var9.field1589 = var23 < 0 || var23 > var9.field1586 || var24 < 0 || var24 > var9.field1586 || var26 < 0 || var26 > var9.field1586;
            var9.method793(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIF)Lwr;")
    public final class531 method136(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "()I")
    public final int method72() {
        return 0;
    }

    @OriginalMember(owner = "client!dg", name = "ea", descriptor = "(Lc;)V")
    public final void method55(class511 arg0) {
        this.field134 = (class308) arg0;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method129(Canvas arg0) {
        class108 var2 = (class108) this.field123.method3059(120, (long) arg0.hashCode());
        if (var2 == null) {
            class108 var3 = class38.method313(0, arg0);
            this.field123.method3055(0, (long) arg0.hashCode(), var3);
        }
    }

    @OriginalMember(owner = "client!dg", name = "da", descriptor = "([I)V")
    public final void method109(int[] arg0) {
        arg0[0] = this.field163;
        arg0[1] = this.field142;
        arg0[2] = this.field131;
        arg0[3] = this.field162;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIII)V")
    public final void method60(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field142 && arg1 < this.field162) {
            if (arg0 < this.field163) {
                arg2 -= this.field163 - arg0;
                arg0 = this.field163;
            }
            if (arg0 + arg2 > this.field131) {
                arg2 = this.field131 - arg0;
            }
            int var6 = this.field145 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field164[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field164[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field164[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field164[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field164[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "()V")
    public final void method88() {
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "()Lc;")
    public final class511 method75() {
        return new class308();
    }

    @OriginalMember(owner = "client!dg", name = "TA", descriptor = "(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field163 && arg0 < this.field131) {
            if (arg1 < this.field142) {
                arg2 -= this.field142 - arg1;
                arg1 = this.field142;
            }
            if (arg1 + arg2 > this.field162) {
                arg2 = this.field162 - arg1;
            }
            int var6 = this.field145 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field145 * var10 + var6;
                        int var12 = this.field164[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field164[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field145 * var14 + var6;
                        int var16 = this.field164[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field164[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field164[this.field145 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "()Z")
    public final boolean method124() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()I")
    public final int method100() {
        return this.field166;
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)Z")
    public final boolean method169(int arg0) {
        return super.field101.method1480(arg0, 14270).field2407;
    }

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "()Z")
    public final boolean method170() {
        return this.field126;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lpv;)V")
    public final void method105(class46 arg0) {
        class514 var2 = arg0.field596.field1564;
        for (class514 var3 = var2.field7523; var2 != var3; var3 = var3.field7523) {
            class342 var4 = (class342) var3;
            int var5 = var4.field5264 >> 12;
            int var6 = var4.field5255 >> 12;
            int var7 = var4.field5257 >> 12;
            int var8 = (this.field134.field4626 * var7 + this.field134.field4623 * var5 + this.field134.field4621 * var6 >> 15) + this.field134.field4624;
            if (var8 >= this.field166 && var8 <= this.field149) {
                int var9 = ((this.field134.field4627 * var7 + this.field134.field4630 * var6 + this.field134.field4625 * var5 >> 15) + this.field134.field4628) * this.field137 / var8 + this.field150;
                int var10 = ((this.field134.field4631 * var7 + this.field134.field4622 * var6 + this.field134.field4620 * var5 >> 15) + this.field134.field4629) * this.field135 / var8 + this.field133;
                if (var9 >= this.field163 && var9 <= this.field131 && var10 >= this.field142 && var10 <= this.field162) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method180(var4, var9, var10, (var4.field5251 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (this.field154 != arg0) {
            this.field154 = arg0;
            this.field153 = new class215[this.field154];
            for (int var2 = 0; var2 < this.field154; ++var2) {
                this.field153[var2] = new class215(this);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "JA", descriptor = "(IIIIII)Z")
    public final boolean method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field134.field4626 * arg2 + this.field134.field4623 * arg0 + this.field134.field4621 * arg1 >> 15) + this.field134.field4624;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field134.field4626 * arg5 + this.field134.field4623 * arg3 + this.field134.field4621 * arg4 >> 15) + this.field134.field4624;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field166 || var8 >= this.field166) && (var7 <= this.field146 || var8 <= this.field146)) {
            int var9 = ((this.field134.field4627 * arg2 + this.field134.field4630 * arg1 + this.field134.field4625 * arg0 >> 15) + this.field134.field4628) * this.field137 / var7;
            int var10 = ((this.field134.field4627 * arg5 + this.field134.field4630 * arg4 + this.field134.field4625 * arg3 >> 15) + this.field134.field4628) * this.field137 / var8;
            if (var9 < this.field155 && var10 < this.field155 || var9 > this.field147 && var10 > this.field147) {
                return false;
            } else {
                int var11 = ((this.field134.field4631 * arg2 + this.field134.field4622 * arg1 + this.field134.field4620 * arg0 >> 15) + this.field134.field4629) * this.field135 / var7;
                int var12 = ((this.field134.field4631 * arg5 + this.field134.field4622 * arg4 + this.field134.field4620 * arg3 >> 15) + this.field134.field4629) * this.field135 / var8;
                return (var11 >= this.field132 || var12 >= this.field132) && (var11 <= this.field167 || var12 <= this.field167);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "()Z")
    public final boolean method152() {
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "(I)[I")
    private final int[] method171(int arg0) {
        class382 var2 = this.field168;
        class244 var3;
        synchronized (this.field168) {
            var3 = (class244) this.field168.method2288((long) arg0, 0);
            if (var3 == null) {
                if (!super.field101.method1482((byte) 114, arg0)) {
                    return null;
                }
                class161 var5 = super.field101.method1480(arg0, 14270);
                int var6 = !var5.field2421 && !this.field156 ? 128 : 64;
                var3 = new class244(arg0, var6, super.field101.method1481(true, 0.7F, 28907, arg0, var6, var6), var5.field2420);
                this.field168.method2290((long) arg0, var3, 127);
            }
        }
        var3.field3381 = true;
        return var3.method1486();
    }

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "(I)Z")
    public final boolean method172(int arg0) {
        return this.field156 || super.field101.method1480(arg0, 14270).field2421;
    }

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "()Z")
    public final boolean method138() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)Lu;")
    public final class346 method151(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "()Z")
    public final boolean method126() {
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(IIIIII)V")
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method60(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method60(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method91(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method91(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field163) {
                    var10 += (this.field163 - arg0) * var12;
                    arg0 = this.field163;
                }
                if (var13 >= this.field131) {
                    var13 = this.field131 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field142 && var17 < this.field162) {
                                int var18 = this.field145 * var17 + arg0;
                                int var19 = this.field164[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field164[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field142 && var21 < this.field162) {
                                int var22 = this.field145 * var21 + arg0;
                                int var23 = this.field164[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field164[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field142 && var27 < this.field162) {
                            this.field164[this.field145 * var27 + arg0] = arg4;
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
                if (arg1 < this.field142) {
                    var29 += (this.field142 - arg1) * var31;
                    arg1 = this.field142;
                }
                if (var32 >= this.field162) {
                    var32 = this.field162 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field163 && var46 < this.field131) {
                            this.field164[this.field145 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field163 && var36 < this.field131) {
                            int var37 = this.field145 * arg1 + var36;
                            int var38 = this.field164[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field164[this.field145 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field163 && var40 < this.field131) {
                            int var41 = this.field145 * arg1 + var40;
                            int var42 = this.field164[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field164[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "(I)[I")
    public final int[] method173(int arg0) {
        class382 var2 = this.field168;
        class244 var3;
        synchronized (this.field168) {
            var3 = (class244) this.field168.method2288((long) arg0, 0);
            if (var3 == null) {
                if (!super.field101.method1482((byte) 116, arg0)) {
                    return null;
                }
                class161 var5 = super.field101.method1480(arg0, 14270);
                int var6 = !var5.field2421 && !this.field156 ? 128 : 64;
                var3 = new class244(arg0, var6, super.field101.method1484(96, true, var6, 0.7F, arg0, var6), var5.field2420);
                this.field168.method2290((long) arg0, var3, 110);
            }
        }
        var3.field3381 = true;
        return var3.method1486();
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;)V")
    public class13(int arg0, Canvas arg1, class243 arg2) {
        this(arg0, arg2);
        this.method129(arg1);
        this.method108(arg1);
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.field153[arg0].method1373(8191, Thread.currentThread());
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILga;)V")
    private class13(int arg0, class243 arg1) {
        super(arg0, arg1);
        this.field126 = false;
        this.field128 = false;
        this.field123 = new class517(4);
        this.field135 = 512;
        this.field151 = 75518;
        this.field142 = 0;
        this.field137 = 512;
        this.field144 = 3500;
        this.field146 = 3500;
        this.field149 = this.field146 - 255;
        this.field165 = 78642;
        this.field161 = 0;
        this.field160 = 0;
        this.field159 = 0;
        this.field138 = 0;
        this.field158 = 0;
        this.field131 = 0;
        this.field143 = 45823;
        this.field156 = false;
        this.field162 = 0;
        this.field166 = 50;
        this.field169 = false;
        this.field170 = 0;
        this.field163 = 0;
        this.field152 = new class382(16);
        this.field171 = -1;
        this.field168 = new class382(20);
        this.field134 = new class308();
        this.method144(1);
        this.method145(0);
        class68.method478(false, 0, true);
        this.field128 = true;
    }

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "()Z")
    public final boolean method125() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "()F")
    public final float method157() {
        return this.field139;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lqs;Lqs;FLqs;)Lqs;")
    public final class50 method117(class50 arg0, class50 arg1, float arg2, class50 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "()Z")
    public final boolean method146() {
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "()Z")
    public final boolean method156() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "ZA", descriptor = "()I")
    public final int method110() {
        int var1 = this.field170;
        this.field170 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIIII)V")
    public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method60(arg0, arg1, arg2, arg4, arg5);
        this.method60(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method91(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method91(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!dg", name = "MA", descriptor = "(I)V")
    public final void method143(int arg0) {
    }

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "(IIII)[I")
    public final int[] method102(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field145 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field164[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(FF)V")
    public final void method154(float arg0, float arg1) {
        this.field139 = arg0;
        this.field130 = arg1;
        this.method174();
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()V")
    public final void method56() {
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "()V")
    public final void method74() {
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method147(Rectangle[] arg0, int arg1) {
        if (this.field124 != null && this.field125 != null) {
            try {
                Graphics var3 = this.field124.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field145 && var5.y <= this.field141 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field125.method812(var3, var5.y, var5.x, var5.width, 102, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field124.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lio;IIII)Lt;")
    public final class398 method150(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class82(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([Lt;Lpv;Lc;[Lqb;I)V")
    public final void method119(class398[] arg0, class46 arg1, class511 arg2, class518[] arg3, int arg4) {
        class82[] var6 = new class82[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class82) arg0[var7];
            }
        }
        class82 var8 = class82.method618(this, var6);
        var8.method631(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method81(Canvas arg0) {
        if (this.field124 == arg0) {
            this.method108((Canvas) null);
        }
        class108 var2 = (class108) this.field123.method3059(67, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method876((byte) -96);
        }
    }

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "()V")
    private final void method174() {
        if (this.field130 != 0.0F) {
            float var1 = (float) this.field146;
            float var2 = (float) this.field166;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field139 / (this.field139 + this.field130);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field130;
            this.field144 = (int) (((float) this.field146 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field144 = this.field146;
        }
    }

    @OriginalMember(owner = "client!dg", name = "OA", descriptor = "(IIII)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field145) {
            arg2 = this.field145;
        }
        if (arg3 > this.field141) {
            arg3 = this.field141;
        }
        this.field163 = arg0;
        this.field131 = arg2;
        this.field142 = arg1;
        this.field162 = arg3;
        this.method178();
    }

    @OriginalMember(owner = "client!dg", name = "NA", descriptor = "(IIIII)V")
    public final void method131(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field142) {
            var6 = this.field142;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field162) {
            var7 = this.field162;
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
                if (var64 < this.field163) {
                    var64 = this.field163;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field131) {
                    var65 = this.field131;
                }
                int var66 = this.field145 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field164[var66++] = arg3;
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
                if (var60 < this.field163) {
                    var60 = this.field163;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field131 - 1) {
                    var61 = this.field131 - 1;
                }
                int var62 = this.field145 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field164[var62++] = arg3;
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
                if (var28 < this.field163) {
                    var28 = this.field163;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field131) {
                    var29 = this.field131;
                }
                int var30 = this.field145 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field164[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field164[var30++] = var15 + var33;
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
                if (var22 < this.field163) {
                    var22 = this.field163;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field131 - 1) {
                    var23 = this.field131 - 1;
                }
                int var24 = this.field145 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field164[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field164[var24++] = var15 + var27;
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
                if (var47 < this.field163) {
                    var47 = this.field163;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field131) {
                    var48 = this.field131;
                }
                int var49 = this.field145 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field164[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field164[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field163) {
                    var39 = this.field163;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field131 - 1) {
                    var40 = this.field131 - 1;
                }
                int var41 = this.field145 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field164[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field164[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "GA", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
        this.field161 = arg0;
        this.field159 = arg1;
        this.field158 = arg2;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method99(Canvas arg0) {
        class108 var2 = (class108) this.field123.method3059(69, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method876((byte) -96);
            class108 var3 = class38.method313(0, arg0);
            this.field123.method3055(0, (long) arg0.hashCode(), var3);
            if (this.field124 == arg0 && this.field148 == null) {
                this.field125 = var3;
                this.field164 = var3.field1605;
                this.field145 = var3.field1601;
                this.field141 = var3.field1604;
                this.method175();
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class249 arg6, int arg7, int arg8) {
        class393 var10 = (class393) arg6;
        int[] var11 = var10.field5900;
        int[] var12 = var10.field5895;
        int var13 = this.field142 > arg8 ? this.field142 : arg8;
        int var14 = this.field162 < var11.length + arg8 ? this.field162 : var11.length + arg8;
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
            if (arg0 < this.field163) {
                var18 += (this.field163 - arg0) * var20;
                arg0 = this.field163;
            }
            if (var21 >= this.field131) {
                var21 = this.field131 - 1;
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
                                int var28 = this.field145 * var25 + arg0;
                                int var29 = this.field164[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field164[var28] = var23 + var30;
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
                                int var34 = this.field145 * var31 + arg0;
                                int var35 = this.field164[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field164[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field164[this.field145 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field163 && var64 < this.field131 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field164[this.field145 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field163 && var50 < this.field131 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field145 * arg1 + var50;
                        int var54 = this.field164[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field164[this.field145 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field163 && var56 < this.field131 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field145 * arg1 + var56;
                        int var60 = this.field164[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field164[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "()Z")
    public final boolean method97() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class215 var11 = this.method179(Thread.currentThread());
        class106 var12 = var11.field3063;
        var12.field1583 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field1583 = false;
            var12.field1590 = 0;
            var12.field1589 = true;
            var12.method803(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field1583 = false;
            var12.field1590 = 255 - var13;
            var12.field1589 = true;
            var12.method803(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field1583 = true;
    }

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "()V")
    private final void method175() {
        for (int var1 = 0; var1 < this.field154; ++var1) {
            this.field153[var1].method1374(true);
        }
        this.method94();
    }

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "()V")
    public final void method139() {
        if (this.field128) {
            class303.method1889(true, false, (byte) 107);
            this.field128 = false;
        }
        this.field125 = null;
        this.field124 = null;
        this.field123 = null;
        this.field126 = true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([IIIII)Ll;")
    public final class127 method103(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class527(this, arg0, arg1, arg2, arg3, arg4) : new class35(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class527(this, arg0, arg1, arg2, arg3, arg4) : new class35(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "()V")
    public final void method161() {
        if (this.field124 != null && this.field125 != null) {
            try {
                Graphics var1 = this.field124.getGraphics();
                this.field125.method810(69, 0, var1, 0);
            } catch (Exception var2) {
                this.field124.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(IIIIII)Lqs;")
    public final class50 method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "()Z")
    public final boolean method113() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lu;)V")
    public final void method137(class346 arg0) {
    }

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "()I")
    public final int method115() {
        int var1 = this.field160;
        this.field160 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dg", name = "IA", descriptor = "()I")
    public final int method80() {
        return 0;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)I")
    public final int method160(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "(IIIIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field163) {
            arg2 -= this.field163 - arg0;
            arg0 = this.field163;
        }
        if (arg1 < this.field142) {
            arg3 -= this.field142 - arg1;
            arg1 = this.field142;
        }
        if (arg0 + arg2 > this.field131) {
            arg2 = this.field131 - arg0;
        }
        if (arg1 + arg3 > this.field162) {
            arg3 = this.field162 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field131 && arg1 <= this.field162) {
            int var7 = this.field145 - arg2;
            int var8 = this.field145 * arg1 + arg0;
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
                            this.field164[var24] = arg4;
                            ++var24;
                            this.field164[var24] = arg4;
                            ++var24;
                            this.field164[var24] = arg4;
                            ++var24;
                            this.field164[var24] = arg4;
                            ++var24;
                            this.field164[var24] = arg4;
                            ++var24;
                            this.field164[var24] = arg4;
                            ++var24;
                            this.field164[var24] = arg4;
                            ++var24;
                            this.field164[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field164[var24] = arg4;
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
                        int var14 = this.field164[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field164[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field164[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field164[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()Z")
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
    public final void method94() {
        this.field163 = 0;
        this.field142 = 0;
        this.field131 = this.field145;
        this.field162 = this.field141;
        this.method178();
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([Lt;Lc;[Lqb;I)V")
    public final void method135(class398[] arg0, class511 arg1, class518[] arg2, int arg3) {
        class82[] var5 = new class82[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class82) arg0[var6];
            }
        }
        class82 var7 = class82.method618(this, var5);
        var7.method631(arg1, arg2 != null ? arg2[0] : null, (class46) null, arg3);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lul;Z)Ll;")
    public final class127 method98(class319 arg0, boolean arg1) {
        int[] var3 = arg0.field4923;
        byte[] var4 = arg0.field4921;
        int var5 = arg0.field4922;
        int var6 = arg0.field4920;
        class344 var11;
        if (arg1 && arg0.field4917 == null) {
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
            var11 = new class501(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4917;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class527(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class527(this, var14, var5, var6);
                var11 = new class35(this, var14, var5, var6);
            }
        }
        var11.method464(arg0.field4918, arg0.field4925, arg0.field4919, arg0.field4924);
        return var11;
    }

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "()Z")
    public final boolean method87() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "ia", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        this.field166 = arg0;
        this.field146 = arg1;
        this.field149 = this.field146 - 255;
        this.method174();
    }

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "(I)I")
    public final int method176(int arg0) {
        return super.field101.method1480(arg0, 14270).field2409 & 65535;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "()Lc;")
    public final class511 method66() {
        class215 var1 = this.method179(Thread.currentThread());
        return var1.field3059;
    }

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "()Z")
    public final boolean method112() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "(III[I)V")
    public final void method92(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field134.field4626 * arg2 + this.field134.field4623 * arg0 + this.field134.field4621 * arg1 >> 15) + this.field134.field4624;
        if (var5 >= this.field166 && var5 <= this.field146) {
            int var6 = ((this.field134.field4627 * arg2 + this.field134.field4630 * arg1 + this.field134.field4625 * arg0 >> 15) + this.field134.field4628) * this.field137 / var5;
            int var7 = ((this.field134.field4631 * arg2 + this.field134.field4622 * arg1 + this.field134.field4620 * arg0 >> 15) + this.field134.field4629) * this.field135 / var5;
            if (var6 >= this.field155 && var6 <= this.field147 && var7 >= this.field132 && var7 <= this.field167) {
                arg3[0] = var6 - this.field155;
                arg3[1] = var7 - this.field132;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(FFF)V")
    public final void method63(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "()Z")
    public final boolean method77() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)V")
    public final void method134(boolean arg0) {
    }

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "(IIII)V")
    public final void method59(int arg0, int arg1, int arg2, int arg3) {
        this.field150 = arg0;
        this.field133 = arg1;
        this.field137 = arg2;
        this.field135 = arg3;
        this.method178();
    }

    @OriginalMember(owner = "client!dg", name = "fa", descriptor = "(IIII)V")
    public final void method159(int arg0, int arg1, int arg2, int arg3) {
        if (this.field163 < arg0) {
            this.field163 = arg0;
        }
        if (this.field142 < arg1) {
            this.field142 = arg1;
        }
        if (this.field131 > arg2) {
            this.field131 = arg2;
        }
        if (this.field162 > arg3) {
            this.field162 = arg3;
        }
        this.method178();
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public final void method149(int arg0) {
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lt;Lpv;Lc;Lqb;I)V")
    public final void method73(class398 arg0, class46 arg1, class511 arg2, class518 arg3, int arg4) {
        ((class82) arg0).method631(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ldu;[Lul;Z)Lla;")
    public final class307 method61(class443 arg0, class319[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4922;
            var5[var7] = arg1[var7].field4920;
            if (arg1[var7].field4917 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class484(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class441(this, arg0, arg1, var4, var5);
        } else {
            return new class383(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        return super.field101.method1482((byte) 122, arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "(I)V")
    public final void method85(int arg0) {
        this.method162(0, 0, this.field145, this.field141, arg0, 0);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I")
    public final int method120(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class337 method70(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class343(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "()V")
    public final void method62() {
        this.field159 = this.field138;
        this.field169 = false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class127 method153(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field145 * arg1 + arg0;
        int var8 = this.field145 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field164[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class527(this, var6, arg2, arg3);
        } else {
            return new class35(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final void method83(int arg0) {
        int var2 = arg0 - this.field127;
        for (Object var3 = this.field168.method2286(false); var3 != null; var3 = this.field168.method2289(true)) {
            class244 var4 = (class244) var3;
            if (var4.field3381) {
                var4.field3382 += var2;
                int var5 = var4.field3382 / 20;
                if (var5 > 0) {
                    class161 var6 = super.field101.method1480(var4.field3383, 14270);
                    var4.method1487(var6.field2410 * var2 * 50 / 1000, var6.field2403 * var2 * 50 / 1000);
                    var4.field3382 -= var5 * 20;
                }
                var4.field3381 = false;
            }
        }
        this.field127 = arg0;
        this.field152.method2294(5, true);
    }

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "()V")
    private final void method178() {
        this.field155 = this.field163 - this.field150;
        this.field147 = this.field131 - this.field150;
        this.field132 = this.field142 - this.field133;
        this.field167 = this.field162 - this.field133;
        for (int var1 = 0; var1 < this.field154; ++var1) {
            class106 var5 = this.field153[var1].field3063;
            var5.field1582 = this.field150 - this.field163;
            var5.field1592 = this.field133 - this.field142;
            var5.field1586 = this.field131 - this.field163;
            var5.field1584 = this.field162 - this.field142;
        }
        int var2 = this.field145 * this.field142 + this.field163;
        for (int var3 = this.field142; var3 < this.field162; ++var3) {
            for (int var4 = 0; var4 < this.field154; ++var4) {
                this.field153[var4].field3063.field1588[var3 - this.field142] = var2;
            }
            var2 += this.field145;
        }
    }

    @OriginalMember(owner = "client!dg", name = "YA", descriptor = "()I")
    public final int method128() {
        return this.field146;
    }

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "()Z")
    public final boolean method118() {
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "()V")
    public final void method86() {
        this.field168.method2293(false);
    }

    @OriginalMember(owner = "client!dg", name = "ca", descriptor = "(ILma;II)V")
    public final void method132(int arg0, class249 arg1, int arg2, int arg3) {
        class393 var5 = (class393) arg1;
        int[] var6 = var5.field5900;
        int[] var7 = var5.field5895;
        int var8;
        if (this.field162 < var6.length + arg3) {
            var8 = this.field162 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field142 > arg3) {
            var9 = this.field142 - arg3;
            arg3 = this.field142;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field145 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field163 > var12) {
                    var13 -= this.field163 - var12;
                    var12 = this.field163;
                }
                if (this.field131 < var12 + var13) {
                    var13 = this.field131 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field164[var14++] = arg0;
                }
                var10 += this.field145;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/Runnable;)Lgg;")
    public final class215 method179(Runnable arg0) {
        for (int var2 = 0; var2 < this.field154; ++var2) {
            if (this.field153[var2].field3061 == arg0) {
                return this.field153[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[I[I)Lma;")
    public final class249 method78(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class393(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!dg", name = "AA", descriptor = "(IIII)V")
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        this.field138 = this.field159;
        this.field161 = arg0;
        this.field159 = arg1;
        this.field158 = arg2;
        this.field169 = true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lbq;III)V")
    public final void method180(class342 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field5266;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method131(arg1, arg2, var6, arg0.field5260, 1);
        } else {
            if (this.field171 != var5) {
                class127 var7 = (class127) this.field152.method2288((long) var5, 0);
                if (var7 == null) {
                    int[] var8 = this.method171(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method172(var5) ? 64 : 128;
                    var7 = this.method103(var8, 0, var9, var9, var9);
                    this.field152.method2290((long) var5, var7, 109);
                }
                this.field171 = var5;
                this.field172 = var7;
            }
            if (this.field172.method468() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field172.method293(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field5260, 1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "UA", descriptor = "(III)V")
    public final void method141(int arg0, int arg1, int arg2) {
        this.field159 = arg0 & 16777215;
        int var4 = this.field159 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field159 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field159 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field159 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field140 = false;
        } else {
            this.field140 = true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field101.method1480(arg5, 14270).field2405) {
                if (this.field171 != arg5) {
                    class127 var10 = (class127) this.field152.method2288((long) arg5, 0);
                    if (var10 == null) {
                        int[] var11 = this.method171(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method172(arg5) ? 64 : 128;
                        var10 = this.method103(var11, 0, var12, var12, var12);
                        this.field152.method2290((long) arg5, var10, 107);
                    }
                    this.field171 = arg5;
                    this.field172 = var10;
                }
                this.field172.method293(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method131(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[Lwr;)V")
    public final void method114(int arg0, class531[] arg1) {
    }

    @OriginalMember(owner = "client!dg", name = "xa", descriptor = "()F")
    public final float method82() {
        return this.field130;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()V")
    public final void method64() {
    }
}
