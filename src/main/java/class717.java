import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class717 extends class66 {

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "Z")
    private boolean field10036;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "Z")
    private boolean field10042;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "Ldj;")
    private class362 field10040;

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "I")
    public int field10059;

    @OriginalMember(owner = "client!bs", name = "X", descriptor = "I")
    public int field10062;

    @OriginalMember(owner = "client!bs", name = "cb", descriptor = "I")
    public int field10067;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "Z")
    private boolean field10057;

    @OriginalMember(owner = "client!bs", name = "eb", descriptor = "I")
    public int field10069;

    @OriginalMember(owner = "client!bs", name = "bb", descriptor = "I")
    public int field10066;

    @OriginalMember(owner = "client!bs", name = "fb", descriptor = "I")
    public int field10070;

    @OriginalMember(owner = "client!bs", name = "lb", descriptor = "I")
    public int field10076;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
    public int field10049;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
    public int field10056;

    @OriginalMember(owner = "client!bs", name = "pb", descriptor = "I")
    private int field10080;

    @OriginalMember(owner = "client!bs", name = "ob", descriptor = "I")
    private int field10079;

    @OriginalMember(owner = "client!bs", name = "qb", descriptor = "I")
    public int field10081;

    @OriginalMember(owner = "client!bs", name = "rb", descriptor = "I")
    public int field10082;

    @OriginalMember(owner = "client!bs", name = "ab", descriptor = "I")
    public int field10065;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "Ltja;")
    private class288 field10048;

    @OriginalMember(owner = "client!bs", name = "tb", descriptor = "I")
    private int field10084;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "Ltja;")
    private class288 field10055;

    @OriginalMember(owner = "client!bs", name = "hb", descriptor = "Lil;")
    public class7 field10072;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    private int field10039;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    private int field10041;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
    private int field10043;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
    public int field10045;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public int field10046;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    private int field10050;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    public int field10051;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public int field10052;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    public int field10053;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
    private int field10054;

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
    private int field10058;

    @OriginalMember(owner = "client!bs", name = "V", descriptor = "I")
    private int field10060;

    @OriginalMember(owner = "client!bs", name = "W", descriptor = "I")
    public int field10061;

    @OriginalMember(owner = "client!bs", name = "Y", descriptor = "I")
    public int field10063;

    @OriginalMember(owner = "client!bs", name = "gb", descriptor = "I")
    public int field10071;

    @OriginalMember(owner = "client!bs", name = "ib", descriptor = "I")
    public int field10073;

    @OriginalMember(owner = "client!bs", name = "kb", descriptor = "I")
    public int field10075;

    @OriginalMember(owner = "client!bs", name = "mb", descriptor = "I")
    public int field10077;

    @OriginalMember(owner = "client!bs", name = "nb", descriptor = "I")
    private int field10078;

    @OriginalMember(owner = "client!bs", name = "sb", descriptor = "Ltf;")
    private class312 field10083;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "Lnda;")
    public class584 field10038;

    @OriginalMember(owner = "client!bs", name = "db", descriptor = "Lrj;")
    private class622 field10068;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field10037;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "[F")
    public float[] field10044;

    @OriginalMember(owner = "client!bs", name = "Z", descriptor = "[F")
    public float[] field10064;

    @OriginalMember(owner = "client!bs", name = "jb", descriptor = "[I")
    public int[] field10074;

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "[Leu;")
    private class506[] field10047;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIZ)Ltf;")
    public final class312 method644(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field10053 * arg1 + arg0;
        int var8 = this.field10053 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field10074[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class21(this, var6, arg2, arg3);
        } else {
            return new class236(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(II)I")
    public final int method620(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!bs", name = "da", descriptor = "(III[I)V")
    public final void method642(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field10072.field126 + (float) arg0 * this.field10072.field106 + (float) arg1 * this.field10072.field109 + this.field10072.field130;
        if (!(var5 < (float) this.field10059) && !(var5 > (float) this.field10070)) {
            int var6 = (int) (((float) arg2 * this.field10072.field116 + (float) arg0 * this.field10072.field117 + (float) arg1 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / var5);
            int var7 = (int) (((float) arg2 * this.field10072.field122 + (float) arg0 * this.field10072.field128 + (float) arg1 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / var5);
            if (var6 >= this.field10077 && var6 <= this.field10046 && var7 >= this.field10073 && var7 <= this.field10052) {
                arg3[0] = var6 - this.field10077;
                arg3[1] = var7 - this.field10073;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(II)V")
    public final void method606(int arg0, int arg1) {
        class506 var3 = this.method4059(Thread.currentThread());
        this.field10059 = arg0;
        this.field10070 = arg1;
        var3.field7155 = this.field10070 - 255;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Lza;")
    public final class435 method585(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lsea;Lup;)Lnm;")
    public final class499 method70(class726 arg0, class292 arg1) {
        return new class622(this, (class312) arg0, (class95) arg1);
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)Z")
    public final boolean method4052(int arg0) {
        return super.field890.method1137(12429, arg0);
    }

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "()Z")
    public final boolean method639() {
        return true;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class506 var14 = this.method4059(Thread.currentThread());
        class376 var15 = var14.field7169;
        var15.field4735 = false;
        int var16 = arg0 - this.field10077;
        int var17 = arg3 - this.field10077;
        int var18 = arg6 - this.field10077;
        int var19 = arg1 - this.field10073;
        int var20 = arg4 - this.field10073;
        int var21 = arg7 - this.field10073;
        var15.field4737 = var16 < 0 || var16 > var15.field4738 || var17 < 0 || var17 > var15.field4738 || var18 < 0 || var18 > var15.field4738;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field4727 = 255 - var22;
                var15.field4734 = false;
                var15.method2204((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field4727 = 128;
                var15.field4734 = true;
                var15.method2204((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field4727 = 0;
            var15.field4734 = false;
            var15.method2204((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field4735 = true;
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "(IIIIII)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method593(arg0, arg1, arg2, arg4, arg5);
        this.method593(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method597(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method597(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lnh;)V")
    public final void method628(class778 arg0) {
        this.field10072 = (class7) arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIF)Lkp;")
    public final class515 method573(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lso;IIII)Lka;")
    public final class498 method567(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class306(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "()V")
    private final void method4053() {
        this.field10077 = this.field10082 - this.field10075;
        this.field10046 = this.field10081 - this.field10075;
        this.field10073 = this.field10067 - this.field10051;
        this.field10052 = this.field10069 - this.field10051;
        for (int var1 = 0; var1 < this.field10061; ++var1) {
            class376 var5 = this.field10047[var1].field7169;
            var5.field4739 = this.field10075 - this.field10082;
            var5.field4729 = this.field10051 - this.field10067;
            var5.field4738 = this.field10081 - this.field10082;
            var5.field4730 = this.field10069 - this.field10067;
        }
        int var2 = this.field10067 * this.field10053 + this.field10082;
        for (int var3 = this.field10067; var3 < this.field10069; ++var3) {
            for (int var4 = 0; var4 < this.field10061; ++var4) {
                this.field10047[var4].field7169.field4725[var3 - this.field10067] = var2;
            }
            var2 += this.field10053;
        }
    }

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "(III[I)V")
    public final void method570(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field10072.field126 + (float) arg0 * this.field10072.field106 + (float) arg1 * this.field10072.field109 + this.field10072.field130;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field10072.field116 + (float) arg0 * this.field10072.field117 + (float) arg1 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / var5);
            int var7 = (int) (((float) arg2 * this.field10072.field122 + (float) arg0 * this.field10072.field128 + (float) arg1 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / var5);
            arg3[0] = var6 - this.field10077;
            arg3[1] = var7 - this.field10073;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class708 var13 = (class708) arg6;
        int[] var14 = var13.field9943;
        int[] var15 = var13.field9942;
        int var16 = this.field10067 > arg8 ? this.field10067 : arg8;
        int var17 = this.field10069 < var14.length + arg8 ? this.field10069 : var14.length + arg8;
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
                        if (arg0 >= this.field10082 && arg0 < this.field10081 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field10053 * var37 + arg0;
                                int var41 = this.field10074[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field10074[var40] = var35 + var42;
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
                        if (arg0 >= this.field10082 && arg0 < this.field10081 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field10053 * var44 + arg0;
                                int var48 = this.field10074[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field10074[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field10082 && arg0 < this.field10081 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field10074[this.field10053 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field10082 && var80 < this.field10081 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field10074[this.field10053 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field10082 && var66 < this.field10081 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field10053 * arg1 + var66;
                        int var69 = this.field10074[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field10074[this.field10053 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field10082 && var72 < this.field10081 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field10053 * arg1 + var72;
                        int var75 = this.field10074[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field10074[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "()V")
    private final void method4054() {
        for (int var1 = 0; var1 < this.field10061; ++var1) {
            this.field10047[var1].method3032((byte) 121);
        }
        this.method634();
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8) {
        class708 var10 = (class708) arg6;
        int[] var11 = var10.field9943;
        int[] var12 = var10.field9942;
        int var13 = this.field10067 > arg8 ? this.field10067 : arg8;
        int var14 = this.field10069 < var11.length + arg8 ? this.field10069 : var11.length + arg8;
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
            if (arg0 < this.field10082) {
                var18 += (this.field10082 - arg0) * var20;
                arg0 = this.field10082;
            }
            if (var21 >= this.field10081) {
                var21 = this.field10081 - 1;
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
                                int var28 = this.field10053 * var25 + arg0;
                                int var29 = this.field10074[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field10074[var28] = var23 + var30;
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
                                int var34 = this.field10053 * var31 + arg0;
                                int var35 = this.field10074[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field10074[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field10074[this.field10053 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field10082 && var64 < this.field10081 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field10074[this.field10053 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field10082 && var50 < this.field10081 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field10053 * arg1 + var50;
                        int var54 = this.field10074[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field10074[this.field10053 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field10082 && var56 < this.field10081 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field10053 * arg1 + var56;
                        int var60 = this.field10074[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field10074[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "(IIII)V")
    public final void method607(int arg0, int arg1, int arg2, int arg3) {
        if (this.field10082 < arg0) {
            this.field10082 = arg0;
        }
        if (this.field10067 < arg1) {
            this.field10067 = arg1;
        }
        if (this.field10081 > arg2) {
            this.field10081 = arg2;
        }
        if (this.field10069 > arg3) {
            this.field10069 = arg3;
        }
        this.method4053();
    }

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "(IIIII)V")
    public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field10082 && arg0 < this.field10081) {
            if (arg1 < this.field10067) {
                arg2 -= this.field10067 - arg1;
                arg1 = this.field10067;
            }
            if (arg1 + arg2 > this.field10069) {
                arg2 = this.field10069 - arg1;
            }
            int var6 = this.field10053 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field10053 * var10 + var6;
                        int var12 = this.field10074[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field10074[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field10053 * var14 + var6;
                        int var16 = this.field10074[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field10074[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field10074[this.field10053 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
    public final void method609(int arg0) {
        this.field10061 = arg0;
        this.field10047 = new class506[this.field10061];
        for (int var2 = 0; var2 < this.field10061; ++var2) {
            this.field10047[var2] = new class506(this);
        }
    }

    @OriginalMember(owner = "client!bs", name = "aa", descriptor = "(IIIIII)V")
    public final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field10082) {
            arg2 -= this.field10082 - arg0;
            arg0 = this.field10082;
        }
        if (arg1 < this.field10067) {
            arg3 -= this.field10067 - arg1;
            arg1 = this.field10067;
        }
        if (arg0 + arg2 > this.field10081) {
            arg2 = this.field10081 - arg0;
        }
        if (arg1 + arg3 > this.field10069) {
            arg3 = this.field10069 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field10081 && arg1 <= this.field10069) {
            int var7 = this.field10053 - arg2;
            int var8 = this.field10053 * arg1 + arg0;
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
                            this.field10074[var24] = arg4;
                            ++var24;
                            this.field10074[var24] = arg4;
                            ++var24;
                            this.field10074[var24] = arg4;
                            ++var24;
                            this.field10074[var24] = arg4;
                            ++var24;
                            this.field10074[var24] = arg4;
                            ++var24;
                            this.field10074[var24] = arg4;
                            ++var24;
                            this.field10074[var24] = arg4;
                            ++var24;
                            this.field10074[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field10074[var24] = arg4;
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
                        int var14 = this.field10074[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field10074[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field10074[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field10074[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        int var3 = this.field10053 * arg1 + arg0;
        int var4 = this.field10058 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field10074;
            float[] var6 = this.field10064;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class211.method1332(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class211.method1332(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class211.method1329(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class211.method1329(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Lsea;")
    public final class726 method44(int arg0, int arg1) {
        return this.method638(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "()Z")
    public final boolean method622() {
        return true;
    }

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "()Z")
    public final boolean method4055() {
        return this.field10042;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "()Lnh;")
    public final class778 method574() {
        return this.field10072;
    }

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "()Z")
    public final boolean method603() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([IIIIIZ)Ltf;")
    public final class312 method652(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class21(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class236(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class21(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class236(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method608(Canvas arg0) {
        if (this.field10037 == arg0) {
            this.method627((Canvas) null);
        }
        class584 var2 = (class584) this.field10040.method2121(54, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2219(13630);
        }
    }

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "()Z")
    public final boolean method629() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "()I")
    public final int method81() {
        int var1 = this.field10080;
        this.field10080 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "()Z")
    public final boolean method604() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "()I")
    public final int method562() {
        int var1 = this.field10079;
        this.field10079 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "()V")
    public final void method20() {
        if (this.field10037 != null) {
            this.field10074 = this.field10038.field7973;
            this.field10053 = this.field10038.field7972;
            this.field10060 = this.field10038.field7974;
            this.field10064 = this.field10044;
            this.field10058 = this.field10054;
            this.field10078 = this.field10050;
        } else {
            this.field10053 = 1;
            this.field10060 = 1;
            this.field10074 = null;
            this.field10058 = 1;
            this.field10078 = 1;
            this.field10064 = null;
        }
        this.field10068 = null;
        this.method4054();
    }

    @OriginalMember(owner = "client!bs", name = "DA", descriptor = "(IIII)V")
    public final void method565(int arg0, int arg1, int arg2, int arg3) {
        this.field10075 = arg0;
        this.field10051 = arg1;
        this.field10076 = arg2;
        this.field10062 = arg3;
        this.method4053();
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ld;)V")
    private class717(class162 arg0) {
        super(arg0);
        this.field10036 = false;
        this.field10042 = false;
        this.field10040 = new class362(4);
        this.field10059 = 50;
        this.field10062 = 512;
        this.field10067 = 0;
        this.field10057 = false;
        this.field10069 = 0;
        this.field10066 = 78642;
        this.field10070 = 3500;
        this.field10076 = 512;
        this.field10049 = 128;
        this.field10056 = 45823;
        this.field10080 = 0;
        this.field10079 = 0;
        this.field10081 = 0;
        this.field10082 = 0;
        this.field10065 = 75518;
        this.field10048 = new class288(16);
        this.field10084 = -1;
        try {
            this.field10055 = new class288(256);
            this.field10072 = new class7();
            this.method609(1);
            this.method605(0);
            class322.method1922(true, (byte) 80, true);
            this.field10036 = true;
            this.field10039 = (int) class349.method2069(true);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method559((byte) 1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method4057(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method4057(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method4062(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method4062(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field10082 && arg0 < this.field10081 && var37 >= this.field10067 && var37 < this.field10069 && var24 < var21) {
                                int var38 = this.field10053 * var37 + arg0;
                                int var39 = this.field10074[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field10074[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field10082 && arg0 < this.field10081 && var42 >= this.field10067 && var42 < this.field10069 && var24 < var21) {
                                int var43 = this.field10053 * var42 + arg0;
                                int var44 = this.field10074[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field10074[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field10082 && arg0 < this.field10081 && var49 >= this.field10067 && var49 < this.field10069 && var24 < var21) {
                            this.field10074[this.field10053 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field10067 && arg1 < this.field10069 && var60 >= this.field10082 && var60 < this.field10081 && var24 < var21) {
                                int var61 = this.field10053 * arg1 + var60;
                                int var62 = this.field10074[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field10074[this.field10053 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field10067 && arg1 < this.field10069 && var65 >= this.field10082 && var65 < this.field10081 && var24 < var21) {
                                int var66 = this.field10053 * arg1 + var65;
                                int var67 = this.field10074[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field10074[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field10067 && arg1 < this.field10069 && var72 >= this.field10082 && var72 < this.field10081 && var24 < var21) {
                            this.field10074[this.field10053 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "(IIIIII)V")
    private final void method4056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field10067) {
            var7 = this.field10067;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field10069) {
            var8 = this.field10069;
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
                if (var65 < this.field10082) {
                    var65 = this.field10082;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field10081) {
                    var66 = this.field10081;
                }
                int var67 = this.field10053 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field10064[var67]) {
                        this.field10074[var67] = arg4;
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
                if (var61 < this.field10082) {
                    var61 = this.field10082;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field10081 - 1) {
                    var62 = this.field10081 - 1;
                }
                int var63 = this.field10053 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field10064[var63]) {
                        this.field10074[var63] = arg4;
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
                if (var29 < this.field10082) {
                    var29 = this.field10082;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field10081) {
                    var30 = this.field10081;
                }
                int var31 = this.field10053 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field10064[var31]) {
                        int var33 = this.field10074[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field10074[var31] = var16 + var34;
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
                if (var23 < this.field10082) {
                    var23 = this.field10082;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field10081 - 1) {
                    var24 = this.field10081 - 1;
                }
                int var25 = this.field10053 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field10064[var25]) {
                        int var27 = this.field10074[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field10074[var25] = var16 + var28;
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
                if (var48 < this.field10082) {
                    var48 = this.field10082;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field10081) {
                    var49 = this.field10081;
                }
                int var50 = this.field10053 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field10064[var50]) {
                        int var52 = this.field10074[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field10074[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field10082) {
                    var40 = this.field10082;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field10081 - 1) {
                    var41 = this.field10081 - 1;
                }
                int var42 = this.field10053 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field10064[var42]) {
                        int var44 = this.field10074[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field10074[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method557(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class493(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method627(Canvas arg0) {
        if (arg0 != null) {
            class584 var2 = (class584) this.field10040.method2121(87, (long) arg0.hashCode());
            if (var2 != null) {
                this.field10037 = arg0;
                Dimension var3 = arg0.getSize();
                this.field10041 = var3.width;
                this.field10043 = var3.height;
                this.field10038 = var2;
                if (this.field10068 == null) {
                    this.field10074 = var2.field7973;
                    this.field10053 = var2.field7972;
                    this.field10060 = var2.field7974;
                    if (this.field10058 != this.field10053 || this.field10078 != this.field10060) {
                        this.field10054 = this.field10058 = this.field10053;
                        this.field10050 = this.field10078 = this.field10060;
                        this.field10044 = this.field10064 = new float[this.field10078 * this.field10058];
                    }
                    this.method4054();
                    return;
                }
            }
        } else {
            this.field10037 = null;
            this.field10038 = null;
            if (this.field10068 == null) {
                this.field10074 = null;
                this.field10053 = this.field10060 = 1;
                this.field10058 = this.field10078 = 1;
                this.method4054();
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[Lkp;)V")
    public final void method587(int arg0, class515[] arg1) {
    }

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "([I)V")
    public final void method566(int[] arg0) {
        arg0[0] = this.field10082;
        arg0[1] = this.field10067;
        arg0[2] = this.field10081;
        arg0[3] = this.field10069;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIII)V")
    private final void method4057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field10067 && arg1 < this.field10069) {
            int var9 = this.field10053 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field10082 && arg0 + var15 < this.field10081 && var12 < arg5) {
                            int var16 = this.field10074[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field10074[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field10082 && arg0 + var18 < this.field10081 && var12 < arg5) {
                            int var19 = this.field10074[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field10074[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field10082 && arg0 + var23 < this.field10081 && var12 < arg5) {
                        this.field10074[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "()V")
    public final void method36() {
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(IIIIII)Ljia;")
    public final class645 method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "()Z")
    public final boolean method54() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "()Lnh;")
    public final class778 method614() {
        return new class7();
    }

    @OriginalMember(owner = "client!bs", name = "EA", descriptor = "(IIII)V")
    public final void method555(int arg0, int arg1, int arg2, int arg3) {
        class506 var5 = this.method4059(Thread.currentThread());
        var5.field7157 = arg0;
        var5.field7160 = arg1;
        var5.field7165 = arg2;
    }

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "(I)[I")
    public final int[] method4058(int arg0) {
        class288 var2 = this.field10055;
        class654 var3;
        synchronized (this.field10055) {
            var3 = (class654) this.field10055.method1684((long) arg0 | Long.MIN_VALUE, -359);
            if (var3 == null) {
                if (!super.field890.method1137(12429, arg0)) {
                    return null;
                }
                class359 var5 = super.field890.method1138(arg0, 114);
                int var6 = !var5.field4451 && !this.field10057 ? this.field10049 : 64;
                var3 = new class654(arg0, var6, super.field890.method1139(arg0, 11196, true, var6, var6, 0.7F), var5.field4457 != 1);
                this.field10055.method1686(-25638, (long) arg0 | Long.MIN_VALUE, var3);
            }
        }
        var3.field9019 = true;
        return var3.method3697();
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/Runnable;)Leu;")
    public final class506 method4059(Runnable arg0) {
        for (int var2 = 0; var2 < this.field10061; ++var2) {
            if (this.field10047[var2].field7167 == arg0) {
                return this.field10047[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(FFF)V")
    public final void method61(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!bs", name = "HA", descriptor = "(IIII[I)V")
    public final void method651(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field10072.field126 + (float) arg0 * this.field10072.field106 + (float) arg1 * this.field10072.field109 + this.field10072.field130;
        if (!(var6 < (float) this.field10059) && !(var6 > (float) this.field10070)) {
            int var7 = (int) (((float) arg2 * this.field10072.field116 + (float) arg0 * this.field10072.field117 + (float) arg1 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field10072.field122 + (float) arg0 * this.field10072.field128 + (float) arg1 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / (float) arg3);
            if (var7 >= this.field10077 && var7 <= this.field10046 && var8 >= this.field10073 && var8 <= this.field10052) {
                arg4[0] = var7 - this.field10077;
                arg4[1] = var8 - this.field10073;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bs", name = "za", descriptor = "(IIIII)V")
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field10067) {
            var6 = this.field10067;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field10069) {
            var7 = this.field10069;
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
                if (var64 < this.field10082) {
                    var64 = this.field10082;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field10081) {
                    var65 = this.field10081;
                }
                int var66 = this.field10053 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field10074[var66++] = arg3;
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
                if (var60 < this.field10082) {
                    var60 = this.field10082;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field10081 - 1) {
                    var61 = this.field10081 - 1;
                }
                int var62 = this.field10053 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field10074[var62++] = arg3;
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
                if (var28 < this.field10082) {
                    var28 = this.field10082;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field10081) {
                    var29 = this.field10081;
                }
                int var30 = this.field10053 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field10074[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field10074[var30++] = var15 + var33;
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
                if (var22 < this.field10082) {
                    var22 = this.field10082;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field10081 - 1) {
                    var23 = this.field10081 - 1;
                }
                int var24 = this.field10053 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field10074[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field10074[var24++] = var15 + var27;
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
                if (var47 < this.field10082) {
                    var47 = this.field10082;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field10081) {
                    var48 = this.field10081;
                }
                int var49 = this.field10053 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field10074[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field10074[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field10082) {
                    var39 = this.field10082;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field10081 - 1) {
                    var40 = this.field10081 - 1;
                }
                int var41 = this.field10053 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field10074[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field10074[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(II)V")
    public final void method5(int arg0, int arg1) throws class677 {
        if (this.field10037 != null && this.field10038 != null) {
            try {
                Graphics var3 = this.field10037.getGraphics();
                this.field10038.method1867(arg0, this.field10041, this.field10043, (byte) 19, var3, 0, arg1, 0);
            } catch (Exception var4) {
                this.field10037.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIZ)Ltf;")
    public final class312 method638(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class21(this, arg0, arg1) : new class236(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lcr;Z)Ltf;")
    public final class312 method640(class600 arg0, boolean arg1) {
        int[] var3 = arg0.field8120;
        byte[] var4 = arg0.field8122;
        int var5 = arg0.field8123;
        int var6 = arg0.field8116;
        class693 var11;
        if (arg1 && arg0.field8119 == null) {
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
            var11 = new class660(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field8119;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class21(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class236(this, var14, var5, var6);
            }
        }
        var11.method1632(arg0.field8118, arg0.field8124, arg0.field8121, arg0.field8117);
        return var11;
    }

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "(I)I")
    public final int method4060(int arg0) {
        return super.field890.method1138(arg0, 100).field4457;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Laf;)V")
    public final void method582(class460 arg0) {
        class506 var2 = this.method4059(Thread.currentThread());
        class208 var3 = arg0.field6472.field1810;
        for (class208 var4 = var3.field2467; var3 != var4; var4 = var4.field2467) {
            class488 var5 = (class488) var4;
            int var6 = var5.field6812 >> 12;
            int var7 = var5.field6817 >> 12;
            int var8 = var5.field6821 >> 12;
            float var9 = (float) var8 * this.field10072.field126 + (float) var6 * this.field10072.field106 + (float) var7 * this.field10072.field109 + this.field10072.field130;
            if (!(var9 < (float) this.field10059) && !(var9 > (float) var2.field7155)) {
                int var10 = (int) (((float) var8 * this.field10072.field116 + (float) var6 * this.field10072.field117 + (float) var7 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / var9) + this.field10075;
                int var11 = (int) (((float) var8 * this.field10072.field122 + (float) var6 * this.field10072.field128 + (float) var7 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / var9) + this.field10051;
                if (var10 >= this.field10082 && var10 <= this.field10081 && var11 >= this.field10067 && var11 <= this.field10069) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method4066(var5, var10, var11, (int) var9, (int) ((float) (this.field10076 * var5.field6819 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "()Z")
    public final boolean method646() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)V")
    public final void method40(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "()Lnh;")
    public final class778 method576() {
        class506 var1 = this.method4059(Thread.currentThread());
        return var1.field7162;
    }

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "()I")
    public final int method610() {
        return this.field10059;
    }

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "(I)I")
    public final int method4061(int arg0) {
        return super.field890.method1138(arg0, 41).field4448 & 65535;
    }

    @OriginalMember(owner = "client!bs", name = "na", descriptor = "(IIII)[I")
    public final int[] method87(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field10053 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field10074[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[I[I)Laa;")
    public final class513 method643(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class708(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
    public final void method589(int arg0) {
        this.field10049 = arg0;
        this.field10055.method1690(0);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIII)V")
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class506 var8 = this.method4059(Thread.currentThread());
        class376 var9 = var8.field7169;
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
            int var23 = arg0 - var9.method2209();
            int var24 = arg1 - var9.method2199();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field4727 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field4727 = 255 - (arg4 >>> 24);
            }
            this.method635(false);
            var9.field4737 = var25 < 0 || var25 > var9.field4738 || var26 < 0 || var26 > var9.field4738 || var27 < 0 || var27 > var9.field4738;
            var9.method2203((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field4737 = var25 < 0 || var25 > var9.field4738 || var27 < 0 || var27 > var9.field4738 || var28 < 0 || var28 > var9.field4738;
            var9.method2203((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method635(true);
        }
    }

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "(IIIIIII)I")
    public final int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field10072.field126 + (float) arg0 * this.field10072.field106 + (float) arg1 * this.field10072.field109 + this.field10072.field130;
        float var9 = (float) arg5 * this.field10072.field126 + (float) arg3 * this.field10072.field106 + (float) arg4 * this.field10072.field109 + this.field10072.field130;
        int var10 = 0;
        if (var8 < (float) this.field10059 && var9 < (float) this.field10059) {
            var10 |= 16;
        } else if (var8 > (float) this.field10070 && var9 > (float) this.field10070) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field10072.field116 + (float) arg0 * this.field10072.field117 + (float) arg1 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field10072.field116 + (float) arg3 * this.field10072.field117 + (float) arg4 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / (float) arg6);
        if (var11 < this.field10077 && var12 < this.field10077) {
            var10 |= 1;
        } else if (var11 > this.field10046 && var12 > this.field10046) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field10072.field122 + (float) arg0 * this.field10072.field128 + (float) arg1 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field10072.field122 + (float) arg3 * this.field10072.field128 + (float) arg4 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / (float) arg6);
        if (var13 < this.field10073 && var14 < this.field10073) {
            var10 |= 4;
        } else if (var13 > this.field10052 && var14 > this.field10052) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
    public final void method605(int arg0) {
        this.field10047[arg0].method3035(-28511, Thread.currentThread());
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)Lup;")
    public final class292 method52(int arg0, int arg1) {
        return new class95(arg0, arg1);
    }

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "()V")
    public final void method32() {
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class717(Canvas arg0, class162 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method637(arg0, arg2, arg3);
            this.method627(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method559((byte) 1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIIIIII)V")
    private final void method4062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field10082 && arg0 < this.field10081) {
            int var9 = this.field10053 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field10067 && arg1 + var15 < this.field10069 && var12 < arg5) {
                            int var16 = this.field10053 * var15 + var9;
                            int var17 = this.field10074[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field10074[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field10067 && arg1 + var19 < this.field10069 && var12 < arg5) {
                            int var20 = this.field10053 * var19 + var9;
                            int var21 = this.field10074[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field10074[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field10067 && arg1 + var25 < this.field10069 && var12 < arg5) {
                        this.field10074[this.field10053 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "()Z")
    public final boolean method601() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "ya", descriptor = "()V")
    public final void method6() {
        if (this.field10082 == 0 && this.field10081 == this.field10053 && this.field10067 == 0 && this.field10069 == this.field10060) {
            int var1 = this.field10064.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field10064[var3++] = 2.1474836E9F;
                this.field10064[var3++] = 2.1474836E9F;
                this.field10064[var3++] = 2.1474836E9F;
                this.field10064[var3++] = 2.1474836E9F;
                this.field10064[var3++] = 2.1474836E9F;
                this.field10064[var3++] = 2.1474836E9F;
                this.field10064[var3++] = 2.1474836E9F;
                this.field10064[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field10064[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field10081 - this.field10082;
            int var5 = this.field10069 - this.field10067;
            int var6 = this.field10053 - var4;
            int var7 = this.field10067 * this.field10053 + this.field10082;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field10064[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "JA", descriptor = "(IIIIII)I")
    public final int method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field10072.field126 + (float) arg0 * this.field10072.field106 + (float) arg1 * this.field10072.field109 + this.field10072.field130;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field10072.field126 + (float) arg3 * this.field10072.field106 + (float) arg4 * this.field10072.field109 + this.field10072.field130;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field10059 && var9 < (float) this.field10059) {
            var7 |= 16;
        } else if (var8 > (float) this.field10070 && var9 > (float) this.field10070) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field10072.field116 + (float) arg0 * this.field10072.field117 + (float) arg1 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / var8);
        int var11 = (int) (((float) arg5 * this.field10072.field116 + (float) arg3 * this.field10072.field117 + (float) arg4 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / var9);
        if (var10 < this.field10077 && var11 < this.field10077) {
            var7 |= 1;
        } else if (var10 > this.field10046 && var11 > this.field10046) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field10072.field122 + (float) arg0 * this.field10072.field128 + (float) arg1 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / var8);
        int var13 = (int) (((float) arg5 * this.field10072.field122 + (float) arg3 * this.field10072.field128 + (float) arg4 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / var9);
        if (var12 < this.field10073 && var13 < this.field10073) {
            var7 |= 4;
        } else if (var12 > this.field10052 && var13 > this.field10052) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!bs", name = "xa", descriptor = "(F)V")
    public final void method626(float arg0) {
        this.field10065 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "(ILaa;II)V")
    public final void method617(int arg0, class513 arg1, int arg2, int arg3) {
        class708 var5 = (class708) arg1;
        int[] var6 = var5.field9943;
        int[] var7 = var5.field9942;
        int var8;
        if (this.field10069 < var6.length + arg3) {
            var8 = this.field10069 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field10067 > arg3) {
            var9 = this.field10067 - arg3;
            arg3 = this.field10067;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field10053 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field10082 > var12) {
                    var13 -= this.field10082 - var12;
                    var12 = this.field10082;
                }
                if (this.field10081 < var12 + var13) {
                    var13 = this.field10081 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field10074[var14++] = arg0;
                }
                var10 += this.field10053;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "KA", descriptor = "(IIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field10053) {
            arg2 = this.field10053;
        }
        if (arg3 > this.field10060) {
            arg3 = this.field10060;
        }
        this.field10082 = arg0;
        this.field10081 = arg2;
        this.field10067 = arg1;
        this.field10069 = arg3;
        this.method4053();
    }

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "()V")
    public final void method25() {
    }

    @OriginalMember(owner = "client!bs", name = "X", descriptor = "(I)V")
    public final void method571(int arg0) {
    }

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "()V")
    public final void method647() {
        this.field10055.method1690(0);
        this.field10048.method1690(0);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIID)V")
    public final void method50(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field10058 - arg2;
        int var8 = this.field10058 * arg1 + arg0;
        float[] var9 = this.field10064;
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

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Laf;I)V")
    public final void method590(class460 arg0, int arg1) {
        class506 var3 = this.method4059(Thread.currentThread());
        class208 var4 = arg0.field6472.field1810;
        for (class208 var5 = var4.field2467; var4 != var5; var5 = var5.field2467) {
            class488 var6 = (class488) var5;
            int var7 = var6.field6812 >> 12;
            int var8 = var6.field6817 >> 12;
            int var9 = var6.field6821 >> 12;
            float var10 = (float) var9 * this.field10072.field126 + (float) var7 * this.field10072.field106 + (float) var8 * this.field10072.field109 + this.field10072.field130;
            if (!(var10 < (float) this.field10059) && !(var10 > (float) var3.field7155)) {
                int var11 = (int) (((float) var9 * this.field10072.field116 + (float) var7 * this.field10072.field117 + (float) var8 * this.field10072.field114 + this.field10072.field102) * (float) this.field10076 / (float) arg1) + this.field10075;
                int var12 = (int) (((float) var9 * this.field10072.field122 + (float) var7 * this.field10072.field128 + (float) var8 * this.field10072.field121 + this.field10072.field129) * (float) this.field10062 / (float) arg1) + this.field10051;
                if (var11 >= this.field10082 && var11 <= this.field10081 && var12 >= this.field10067 && var12 <= this.field10069) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method4066(var6, var11, var12, (int) var10, (this.field10076 * var6.field6819 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "(I)Z")
    public final boolean method4063(int arg0) {
        return super.field890.method1138(arg0, 112).field4447 || super.field890.method1138(arg0, 74).field4460;
    }

    @OriginalMember(owner = "client!bs", name = "GA", descriptor = "(I)V")
    public final void method13(int arg0) {
        this.method645(0, 0, this.field10053, this.field10060, arg0, 0);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lbq;[Lcr;Z)Lda;")
    public final class67 method579(class307 arg0, class600[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8123;
            var5[var7] = arg1[var7].field8116;
            if (arg1[var7].field8119 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class169(this, arg0, arg1, var4, var5);
            } else {
                return new class246(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class771(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljia;Ljia;FLjia;)Ljia;")
    public final class645 method65(class645 arg0, class645 arg1, float arg2, class645 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljia;)V")
    public final void method558(class645 arg0) {
    }

    @OriginalMember(owner = "client!bs", name = "la", descriptor = "()V")
    public final void method634() {
        this.field10082 = 0;
        this.field10067 = 0;
        this.field10081 = this.field10053;
        this.field10069 = this.field10060;
        this.method4053();
    }

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "()Z")
    public final boolean method599() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIII)V")
    public final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method593(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method593(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method597(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method597(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field10082) {
                    var10 += (this.field10082 - arg0) * var12;
                    arg0 = this.field10082;
                }
                if (var13 >= this.field10081) {
                    var13 = this.field10081 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field10067 && var17 < this.field10069) {
                                int var18 = this.field10053 * var17 + arg0;
                                int var19 = this.field10074[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field10074[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field10067 && var21 < this.field10069) {
                                int var22 = this.field10053 * var21 + arg0;
                                int var23 = this.field10074[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field10074[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field10067 && var27 < this.field10069) {
                            this.field10074[this.field10053 * var27 + arg0] = arg4;
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
                if (arg1 < this.field10067) {
                    var29 += (this.field10067 - arg1) * var31;
                    arg1 = this.field10067;
                }
                if (var32 >= this.field10069) {
                    var32 = this.field10069 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field10082 && var46 < this.field10081) {
                            this.field10074[this.field10053 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field10082 && var36 < this.field10081) {
                            int var37 = this.field10053 * arg1 + var36;
                            int var38 = this.field10074[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field10074[this.field10053 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field10082 && var40 < this.field10081) {
                            int var41 = this.field10053 * arg1 + var40;
                            int var42 = this.field10074[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field10074[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "()Lub;")
    public final class22 method60() {
        return new class22(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!bs", name = "pa", descriptor = "()V")
    public final void method564() {
        for (int var1 = 0; var1 < this.field10047.length; ++var1) {
            this.field10047[var1].field7160 = this.field10047[var1].field7154;
            this.field10047[var1].field7159 = false;
        }
    }

    @OriginalMember(owner = "client!bs", name = "Y", descriptor = "()[I")
    public final int[] method569() {
        return new int[] { this.field10075, this.field10051, this.field10076, this.field10062 };
    }

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "(I)[I")
    public final int[] method4064(int arg0) {
        class288 var2 = this.field10055;
        class654 var3;
        synchronized (this.field10055) {
            var3 = (class654) this.field10055.method1684((long) arg0, -359);
            if (var3 == null) {
                if (!super.field890.method1137(12429, arg0)) {
                    return null;
                }
                class359 var5 = super.field890.method1138(arg0, 94);
                int var6 = !var5.field4451 && !this.field10057 ? this.field10049 : 64;
                var3 = new class654(arg0, var6, super.field890.method1135(arg0, 0.7F, true, var6, var6, (byte) -26), var5.field4457 != 1);
                this.field10055.method1686(-25638, (long) arg0, var3);
            }
        }
        var3.field9019 = true;
        return var3.method3697();
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method637(Canvas arg0, int arg1, int arg2) {
        class584 var4 = (class584) this.field10040.method2121(123, (long) arg0.hashCode());
        if (var4 == null) {
            class584 var5 = class781.method4331(arg1, (byte) -70, arg0, arg2);
            this.field10040.method2112(var5, (byte) 6, (long) arg0.hashCode());
        } else {
            if (var4.field7972 != arg1 || var4.field7974 != arg2) {
                this.method595(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method578(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field10056 = (int) (arg1 * 65535.0F);
        this.field10066 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field10071 = (int) (arg3 * 65535.0F / var7);
        this.field10063 = (int) (arg4 * 65535.0F / var7);
        this.field10045 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "()V")
    public final void method53() {
        if (this.field10036) {
            class738.method4150(false, true, 0);
            this.field10036 = false;
        }
        this.field10038 = null;
        this.field10037 = null;
        this.field10041 = 0;
        this.field10043 = 0;
        this.field10040 = null;
        this.field10042 = true;
    }

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "(Z)V")
    public final void method635(boolean arg0) {
        class506 var2 = this.method4059(Thread.currentThread());
        var2.field7161 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lza;)V")
    public final void method581(class435 arg0) {
    }

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "()I")
    public final int method616() {
        return 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public final void method586(boolean arg0) {
        this.field10057 = arg0;
        this.field10055.method1690(0);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "()V")
    public final void method2() {
    }

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "(I)V")
    public final void method56(int arg0) {
        int var2 = arg0 - this.field10039;
        for (Object var3 = this.field10055.method1692(0); var3 != null; var3 = this.field10055.method1682(44)) {
            class654 var4 = (class654) var3;
            if (var4.field9019) {
                var4.field9022 += var2;
                int var5 = var4.field9022 / 20;
                if (var5 > 0) {
                    class359 var6 = super.field890.method1138(var4.field9020, 79);
                    var4.method3698(var6.field4444 * var2 * 50 / 1000, var6.field4449 * var2 * 50 / 1000);
                    var4.field9022 -= var5 * 20;
                }
                var4.field9019 = false;
            }
        }
        this.field10039 = arg0;
        this.field10048.method1694(5, -108);
        this.field10055.method1694(5, -91);
    }

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "(IIIII)V")
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field10067 && arg1 < this.field10069) {
            if (arg0 < this.field10082) {
                arg2 -= this.field10082 - arg0;
                arg0 = this.field10082;
            }
            if (arg0 + arg2 > this.field10081) {
                arg2 = this.field10081 - arg0;
            }
            int var6 = this.field10053 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field10074[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field10074[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field10074[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field10074[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field10074[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "ra", descriptor = "(IIII)V")
    public final void method560(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field10047.length; ++var5) {
            this.field10047[var5].field7154 = this.field10047[var5].field7160;
            this.field10047[var5].field7157 = arg0;
            this.field10047[var5].field7160 = arg1;
            this.field10047[var5].field7165 = arg2;
            this.field10047[var5].field7159 = true;
        }
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)V")
    public final void method615(int arg0) {
        class306.field3738 = arg0;
        class306.field3713 = arg0;
        if (this.field10061 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method609(this.field10061);
            this.method605(0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public final void method584(int arg0) {
        this.field10047[arg0].method3035(-28511, (Runnable) null);
    }

    @OriginalMember(owner = "client!bs", name = "XA", descriptor = "()I")
    public final int method568() {
        return this.field10070;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([I)V")
    public final void method648(int[] arg0) {
        arg0[0] = this.field10053;
        arg0[1] = this.field10060;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "()Z")
    public final boolean method71() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method92(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class677 {
        if (this.field10037 != null && this.field10038 != null) {
            try {
                Graphics var5 = this.field10037.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field10053 && var7.y + arg3 <= this.field10060 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field10038.method1867(var7.x + arg2, var7.width, var7.height, (byte) 19, var5, var7.x, var7.y + arg3, var7.y);
                    }
                }
            } catch (Exception var8) {
                this.field10037.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "(III)V")
    public final void method650(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field10047.length; ++var4) {
            class506 var5 = this.field10047[var4];
            var5.field7160 = arg0 & 16777215;
            int var6 = var5.field7160 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7160 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7160 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7160 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7156 = false;
            } else {
                var5.field7156 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "()Z")
    public final boolean method625() {
        return true;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method4065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field890.method1138(arg6, 41).field4464) {
                if (this.field10084 != arg6) {
                    class312 var11 = (class312) this.field10048.method1684((long) arg6, -359);
                    if (var11 == null) {
                        int[] var12 = this.method4058(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method4067(arg6) ? 64 : this.field10049;
                        var11 = this.method623(var12, var13, 1, var13, var13, 0);
                        this.field10048.method1686(-25638, (long) arg6, var11);
                    }
                    this.field10084 = arg6;
                    this.field10083 = var11;
                }
                ((class693) this.field10083).method235(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method4056(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field10053 * arg1 + arg0;
            int var15 = this.field10053 - arg2;
            if (arg1 + arg3 > this.field10069) {
                arg3 -= arg1 + arg3 - this.field10069;
            }
            if (arg1 < this.field10067) {
                int var16 = this.field10067 - arg1;
                arg3 -= var16;
                var14 += this.field10053 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field10081) {
                int var17 = arg0 + arg2 - this.field10081;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field10082) {
                int var18 = this.field10082 - arg0;
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
                            int var28 = this.field10074[var14];
                            this.field10074[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field10074[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field10074[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field10074[var14++] = arg5;
                        } else {
                            this.field10074[var14++] = arg4;
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

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "()I")
    public final int method583() {
        return 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method595(Canvas arg0, int arg1, int arg2) {
        class584 var4 = (class584) this.field10040.method2121(89, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method2219(13630);
            class584 var5 = class781.method4331(arg1, (byte) -128, arg0, arg2);
            this.field10040.method2112(var5, (byte) 6, (long) arg0.hashCode());
            if (this.field10037 == arg0 && this.field10068 == null) {
                Dimension var6 = arg0.getSize();
                this.field10041 = var6.width;
                this.field10043 = var6.height;
                this.field10038 = var5;
                this.field10074 = var5.field7973;
                this.field10053 = var5.field7972;
                this.field10060 = var5.field7974;
                if (this.field10058 != this.field10053 || this.field10078 != this.field10060) {
                    this.field10054 = this.field10058 = this.field10053;
                    this.field10050 = this.field10078 = this.field10060;
                    this.field10044 = this.field10064 = new float[this.field10078 * this.field10058];
                }
                this.method4054();
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lnm;)V")
    public final void method67(class499 arg0) {
        class622 var2 = (class622) arg0;
        this.field10053 = var2.field8539;
        this.field10060 = var2.field8534;
        this.field10074 = var2.field8537;
        this.field10068 = var2;
        this.field10058 = var2.field8539;
        this.field10078 = var2.field8534;
        this.field10064 = var2.field8529;
        this.method4054();
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)V")
    public final void method31(boolean arg0) {
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lqg;IIII)V")
    private final void method4066(class488 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field6814;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method4056(arg1, arg2, arg3, arg4, arg0.field6816, 1);
        } else {
            if (this.field10084 != var6) {
                class312 var9 = (class312) this.field10048.method1684((long) var6, -359);
                if (var9 == null) {
                    int[] var10 = this.method4058(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method4067(var6) ? 64 : this.field10049;
                    var9 = this.method623(var10, var11, 1, var11, var11, 0);
                    this.field10048.method1686(-25638, (long) var6, var9);
                }
                this.field10084 = var6;
                this.field10083 = var9;
            }
            ++var8;
            ((class693) this.field10083).method235(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field6816, 1, 1);
        }
    }

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "()Z")
    public final boolean method612() {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()Z")
    public final boolean method561() {
        return true;
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(II)I")
    public final int method632(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "(I)Z")
    public final boolean method4067(int arg0) {
        return this.field10057 || super.field890.method1138(arg0, 23).field4451;
    }
}
