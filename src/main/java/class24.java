import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class63 {

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "Z")
    private boolean field224;

    @OriginalMember(owner = "client!fba", name = "Y", descriptor = "Z")
    private boolean field223;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "Lqr;")
    private class69 field222;

    @OriginalMember(owner = "client!fba", name = "fb", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!fba", name = "nb", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!fba", name = "ib", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!fba", name = "S", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "Z")
    private boolean field248;

    @OriginalMember(owner = "client!fba", name = "U", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!fba", name = "eb", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!fba", name = "bb", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!fba", name = "ab", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "Liha;")
    private class29 field237;

    @OriginalMember(owner = "client!fba", name = "X", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "Liha;")
    private class29 field252;

    @OriginalMember(owner = "client!fba", name = "O", descriptor = "Lag;")
    public class714 field231;

    @OriginalMember(owner = "client!fba", name = "M", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!fba", name = "pb", descriptor = "[Ljava/lang/String;")
    private static final String[] field270 = new String[] { method273(method272("l\u0014 ")), method273(method272("\u007f1\u0007#]e%\u0003'")), method273(method272("a+U\u000b)")), method273(method272("@\"\u0013")) };

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!fba", name = "N", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!fba", name = "lb", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!fba", name = "jb", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!fba", name = "V", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!fba", name = "db", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!fba", name = "ob", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!fba", name = "gb", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!fba", name = "R", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!fba", name = "kb", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!fba", name = "mb", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!fba", name = "W", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!fba", name = "Z", descriptor = "Lhk;")
    private class107 field269;

    @OriginalMember(owner = "client!fba", name = "T", descriptor = "Lio;")
    private class464 field262;

    @OriginalMember(owner = "client!fba", name = "cb", descriptor = "Lwga;")
    public class782 field227;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field225;

    @OriginalMember(owner = "client!fba", name = "Q", descriptor = "[F")
    public float[] field242;

    @OriginalMember(owner = "client!fba", name = "P", descriptor = "[F")
    public float[] field260;

    @OriginalMember(owner = "client!fba", name = "hb", descriptor = "[I")
    public int[] field240;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "[Ljq;")
    private class539[] field265;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "()V")
    private final void method146() {
        for (int var1 = 0; var1 < this.field233; ++var1) {
            this.field265[var1].method4019(false);
        }
        this.method227();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public final void method147(int arg0) {
        this.field233 = arg0;
        this.field265 = new class539[this.field233];
        for (int var2 = 0; var2 < this.field233; ++var2) {
            this.field265[var2] = new class539(this);
        }
    }

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "()Z")
    public final boolean method148() {
        return true;
    }

    @OriginalMember(owner = "client!fba", name = "X", descriptor = "(I)V")
    public final void method149(int arg0) {
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.field246 = arg0;
        this.field252.method304(1);
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ld;)V")
    private class24(class158 arg0) {
        super(arg0);
        this.field224 = false;
        this.field223 = false;
        this.field222 = new class69(4);
        this.field236 = 0;
        this.field245 = 50;
        this.field238 = 0;
        this.field230 = 0;
        this.field241 = 3500;
        this.field234 = 0;
        this.field246 = 128;
        this.field254 = 45823;
        this.field257 = 0;
        this.field248 = false;
        this.field232 = 75518;
        this.field256 = 78642;
        this.field263 = 0;
        this.field261 = 512;
        this.field253 = 512;
        this.field237 = new class29(16);
        this.field268 = -1;
        try {
            this.field252 = new class29(256);
            this.field231 = new class714();
            this.method147(1);
            this.method234(0);
            class517.method3877(true, true, 1);
            this.field223 = true;
            this.field226 = (int) class712.method5167(-2334);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method668(-4369);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(II)I")
    public final int method151(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "()Z")
    public final boolean method152() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field864.method1419(arg6, -119).field4890) {
                if (this.field268 != arg6) {
                    class107 var11 = (class107) this.field237.method302(-79, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method200(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method226(arg6) ? 64 : this.field246;
                        var11 = this.method665(var13, var13, 114, 0, var12, var13);
                        this.field237.method295(false, (long) arg6, var11);
                    }
                    this.field268 = arg6;
                    this.field269 = var11;
                }
                ((class219) this.field269).method909(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method185(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "()I")
    public final int method154() {
        int var1 = this.field236;
        this.field236 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "()I")
    public final int method155() {
        return this.field245;
    }

    @OriginalMember(owner = "client!fba", name = "DA", descriptor = "(IIII)V")
    public final void method156(int arg0, int arg1, int arg2, int arg3) {
        this.field249 = arg0;
        this.field229 = arg1;
        this.field253 = arg2;
        this.field261 = arg3;
        this.method175();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lza;)V")
    public final void method157(class437 arg0) {
    }

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "()Z")
    public final boolean method158() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(FFF)V")
    public final void method159(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "()Z")
    public final boolean method160() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "(II)V")
    public final void method161(int arg0, int arg1) {
        int var3 = this.field267 * arg1 + arg0;
        int var4 = this.field243 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field240;
            float[] var6 = this.field260;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class405.method3262(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class405.method3262(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class405.method3258(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class405.method3258(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "T", descriptor = "(IIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3) {
        if (this.field234 < arg0) {
            this.field234 = arg0;
        }
        if (this.field257 < arg1) {
            this.field257 = arg1;
        }
        if (this.field263 > arg2) {
            this.field263 = arg2;
        }
        if (this.field230 > arg3) {
            this.field230 = arg3;
        }
        this.method175();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class539 var14 = this.method230(Thread.currentThread());
        class564 var15 = var14.field7946;
        var15.field8198 = false;
        int var16 = arg0 - this.field239;
        int var17 = arg3 - this.field239;
        int var18 = arg6 - this.field239;
        int var19 = arg1 - this.field258;
        int var20 = arg4 - this.field258;
        int var21 = arg7 - this.field258;
        var15.field8205 = var16 < 0 || var16 > var15.field8192 || var17 < 0 || var17 > var15.field8192 || var18 < 0 || var18 > var15.field8192;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field8193 = 255 - var22;
                var15.field8201 = false;
                var15.method4147((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field8193 = 128;
                var15.field8201 = true;
                var15.method4147((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field8193 = 0;
            var15.field8201 = false;
            var15.method4147((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field8198 = true;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIII)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "(I)Z")
    public final boolean method165(int arg0) {
        return super.field864.method1419(arg0, -111).field4912 || super.field864.method1419(arg0, -128).field4909;
    }

    @OriginalMember(owner = "client!fba", name = "xa", descriptor = "(F)V")
    public final void method166(float arg0) {
        this.field232 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "()Z")
    public final boolean method167() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field267 * arg1 + arg0;
            int var15 = this.field267 - arg2;
            if (arg1 + arg3 > this.field230) {
                arg3 -= arg1 + arg3 - this.field230;
            }
            if (arg1 < this.field257) {
                int var16 = this.field257 - arg1;
                arg3 -= var16;
                var14 += this.field267 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field263) {
                int var17 = arg0 + arg2 - this.field263;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field234) {
                int var18 = this.field234 - arg0;
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
                            int var28 = this.field240[var14];
                            this.field240[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field240[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field240[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field240[var14++] = arg5;
                        } else {
                            this.field240[var14++] = arg4;
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

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)I")
    public final int method169(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "(ILaa;II)V")
    public final void method170(int arg0, class514 arg1, int arg2, int arg3) {
        class566 var5 = (class566) arg1;
        int[] var6 = var5.field8234;
        int[] var7 = var5.field8231;
        int var8;
        if (this.field230 < var6.length + arg3) {
            var8 = this.field230 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field257 > arg3) {
            var9 = this.field257 - arg3;
            arg3 = this.field257;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field267 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field234 > var12) {
                    var13 -= this.field234 - var12;
                    var12 = this.field234;
                }
                if (this.field263 < var12 + var13) {
                    var13 = this.field263 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field240[var14++] = arg0;
                }
                var10 += this.field267;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(II)V")
    public final void method171(int arg0, int arg1) throws class146 {
        if (this.field225 != null && this.field227 != null) {
            try {
                Graphics var3 = this.field225.getGraphics();
                this.field227.method2166(0, var3, arg1, (byte) 108, 0, this.field228, arg0, this.field221);
            } catch (Exception var4) {
                this.field225.repaint();
            }
        } else {
            throw new IllegalStateException(field270[3]);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lsn;I)V")
    public final void method172(class659 arg0, int arg1) {
        class539 var3 = this.method230(Thread.currentThread());
        class688 var4 = arg0.field9415.field7702;
        for (class688 var5 = var4.field9939; var4 != var5; var5 = var5.field9939) {
            class590 var6 = (class590) var5;
            int var7 = var6.field8554 >> 12;
            int var8 = var6.field8564 >> 12;
            int var9 = var6.field8560 >> 12;
            float var10 = (float) var9 * this.field231.field10330 + (float) var7 * this.field231.field10328 + (float) var8 * this.field231.field10334 + this.field231.field10319;
            if (!(var10 < (float) this.field245) && !(var10 > (float) var3.field7904)) {
                int var11 = (int) (((float) var9 * this.field231.field10340 + (float) var7 * this.field231.field10339 + (float) var8 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / (float) arg1) + this.field249;
                int var12 = (int) (((float) var9 * this.field231.field10343 + (float) var7 * this.field231.field10315 + (float) var8 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / (float) arg1) + this.field229;
                if (var11 >= this.field234 && var11 <= this.field263 && var12 >= this.field257 && var12 <= this.field230) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method255(var6, var11, var12, (int) var10, (this.field253 * var6.field8559 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "()Z")
    public final boolean method173() {
        return this.field224;
    }

    @OriginalMember(owner = "client!fba", name = "za", descriptor = "(IIIII)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field257) {
            var6 = this.field257;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field230) {
            var7 = this.field230;
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
                if (var64 < this.field234) {
                    var64 = this.field234;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field263) {
                    var65 = this.field263;
                }
                int var66 = this.field267 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field240[var66++] = arg3;
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
                if (var60 < this.field234) {
                    var60 = this.field234;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field263 - 1) {
                    var61 = this.field263 - 1;
                }
                int var62 = this.field267 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field240[var62++] = arg3;
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
                if (var28 < this.field234) {
                    var28 = this.field234;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field263) {
                    var29 = this.field263;
                }
                int var30 = this.field267 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field240[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field240[var30++] = var15 + var33;
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
                if (var22 < this.field234) {
                    var22 = this.field234;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field263 - 1) {
                    var23 = this.field263 - 1;
                }
                int var24 = this.field267 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field240[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field240[var24++] = var15 + var27;
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
                if (var47 < this.field234) {
                    var47 = this.field234;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field263) {
                    var48 = this.field263;
                }
                int var49 = this.field267 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field240[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field240[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field234) {
                    var39 = this.field234;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field263 - 1) {
                    var40 = this.field263 - 1;
                }
                int var41 = this.field267 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field240[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field240[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "()V")
    private final void method175() {
        this.field239 = this.field234 - this.field249;
        this.field266 = this.field263 - this.field249;
        this.field258 = this.field257 - this.field229;
        this.field255 = this.field230 - this.field229;
        for (int var1 = 0; var1 < this.field233; ++var1) {
            class564 var5 = this.field265[var1].field7946;
            var5.field8197 = this.field249 - this.field234;
            var5.field8204 = this.field229 - this.field257;
            var5.field8192 = this.field263 - this.field234;
            var5.field8200 = this.field230 - this.field257;
        }
        int var2 = this.field267 * this.field257 + this.field234;
        for (int var3 = this.field257; var3 < this.field230; ++var3) {
            for (int var4 = 0; var4 < this.field233; ++var4) {
                this.field265[var4].field7946.field8199[var3 - this.field257] = var2;
            }
            var2 += this.field267;
        }
    }

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "()Z")
    public final boolean method176() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "()I")
    public final int method177() {
        return 0;
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(Z)V")
    public final void method178(boolean arg0) {
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIZ)Lhk;")
    public final class107 method179(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class93(this, arg0, arg1) : new class637(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!fba", name = "HA", descriptor = "(IIII[I)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field231.field10330 + (float) arg0 * this.field231.field10328 + (float) arg1 * this.field231.field10334 + this.field231.field10319;
        if (!(var6 < (float) this.field245) && !(var6 > (float) this.field241)) {
            int var7 = (int) (((float) arg2 * this.field231.field10340 + (float) arg0 * this.field231.field10339 + (float) arg1 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field231.field10343 + (float) arg0 * this.field231.field10315 + (float) arg1 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / (float) arg3);
            if (var7 >= this.field239 && var7 <= this.field266 && var8 >= this.field258 && var8 <= this.field255) {
                arg4[0] = var7 - this.field239;
                arg4[1] = var8 - this.field258;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fba", name = "pa", descriptor = "()V")
    public final void method181() {
        for (int var1 = 0; var1 < this.field265.length; ++var1) {
            this.field265[var1].field7902 = this.field265[var1].field7914;
            this.field265[var1].field7909 = false;
        }
    }

    @OriginalMember(owner = "client!fba", name = "GA", descriptor = "(I)V")
    public final void method182(int arg0) {
        this.method242(0, 0, this.field267, this.field264, arg0, 0);
    }

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "(IIIIIII)I")
    public final int method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field231.field10330 + (float) arg0 * this.field231.field10328 + (float) arg1 * this.field231.field10334 + this.field231.field10319;
        float var9 = (float) arg5 * this.field231.field10330 + (float) arg3 * this.field231.field10328 + (float) arg4 * this.field231.field10334 + this.field231.field10319;
        int var10 = 0;
        if (var8 < (float) this.field245 && var9 < (float) this.field245) {
            var10 |= 16;
        } else if (var8 > (float) this.field241 && var9 > (float) this.field241) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field231.field10340 + (float) arg0 * this.field231.field10339 + (float) arg1 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field231.field10340 + (float) arg3 * this.field231.field10339 + (float) arg4 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / (float) arg6);
        if (var11 < this.field239 && var12 < this.field239) {
            var10 |= 1;
        } else if (var11 > this.field266 && var12 > this.field266) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field231.field10343 + (float) arg0 * this.field231.field10315 + (float) arg1 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field231.field10343 + (float) arg3 * this.field231.field10315 + (float) arg4 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / (float) arg6);
        if (var13 < this.field258 && var14 < this.field258) {
            var10 |= 4;
        } else if (var13 > this.field255 && var14 > this.field255) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lkaa;[Luh;Z)Lda;")
    public final class64 method184(class49 arg0, class174[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2781;
            var5[var7] = arg1[var7].field2782;
            if (arg1[var7].field2779 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class403(this, arg0, arg1, var4, var5);
            } else {
                return new class280(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class308(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(IIIIII)V")
    private final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field257) {
            var7 = this.field257;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field230) {
            var8 = this.field230;
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
                if (var65 < this.field234) {
                    var65 = this.field234;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field263) {
                    var66 = this.field263;
                }
                int var67 = this.field267 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field260[var67]) {
                        this.field240[var67] = arg4;
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
                if (var61 < this.field234) {
                    var61 = this.field234;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field263 - 1) {
                    var62 = this.field263 - 1;
                }
                int var63 = this.field267 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field260[var63]) {
                        this.field240[var63] = arg4;
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
                if (var29 < this.field234) {
                    var29 = this.field234;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field263) {
                    var30 = this.field263;
                }
                int var31 = this.field267 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field260[var31]) {
                        int var33 = this.field240[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field240[var31] = var16 + var34;
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
                if (var23 < this.field234) {
                    var23 = this.field234;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field263 - 1) {
                    var24 = this.field263 - 1;
                }
                int var25 = this.field267 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field260[var25]) {
                        int var27 = this.field240[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field240[var25] = var16 + var28;
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
                if (var48 < this.field234) {
                    var48 = this.field234;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field263) {
                    var49 = this.field263;
                }
                int var50 = this.field267 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field260[var50]) {
                        int var52 = this.field240[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field240[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field234) {
                    var40 = this.field234;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field263 - 1) {
                    var41 = this.field263 - 1;
                }
                int var42 = this.field267 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field260[var42]) {
                        int var44 = this.field240[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field240[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIII)V")
    private final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field257 && arg1 < this.field230) {
            int var9 = this.field267 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field234 && arg0 + var15 < this.field263 && var12 < arg5) {
                            int var16 = this.field240[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field240[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field234 && arg0 + var18 < this.field263 && var12 < arg5) {
                            int var19 = this.field240[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field240[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field234 && arg0 + var23 < this.field263 && var12 < arg5) {
                        this.field240[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "()I")
    public final int method187() {
        return 0;
    }

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "(I)I")
    public final int method188(int arg0) {
        return super.field864.method1419(arg0, -89).field4894 & 65535;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method189(Canvas arg0) {
        if (this.field225 == arg0) {
            this.method210((Canvas) null);
        }
        class782 var2 = (class782) this.field222.method737((byte) -39, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method4173(-1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "(I)Z")
    public final boolean method190(int arg0) {
        return super.field864.method1417((byte) -56, arg0);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lsn;)V")
    public final void method191(class659 arg0) {
        class539 var2 = this.method230(Thread.currentThread());
        class688 var3 = arg0.field9415.field7702;
        for (class688 var4 = var3.field9939; var3 != var4; var4 = var4.field9939) {
            class590 var5 = (class590) var4;
            int var6 = var5.field8554 >> 12;
            int var7 = var5.field8564 >> 12;
            int var8 = var5.field8560 >> 12;
            float var9 = (float) var8 * this.field231.field10330 + (float) var6 * this.field231.field10328 + (float) var7 * this.field231.field10334 + this.field231.field10319;
            if (!(var9 < (float) this.field245) && !(var9 > (float) var2.field7904)) {
                int var10 = (int) (((float) var8 * this.field231.field10340 + (float) var6 * this.field231.field10339 + (float) var7 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / var9) + this.field249;
                int var11 = (int) (((float) var8 * this.field231.field10343 + (float) var6 * this.field231.field10315 + (float) var7 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / var9) + this.field229;
                if (var10 >= this.field234 && var10 <= this.field263 && var11 >= this.field257 && var11 <= this.field230) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method255(var5, var10, var11, (int) var9, (int) ((float) (this.field253 * var5.field8559 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lkc;IIII)Lka;")
    public final class499 method192(class141 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class294(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fba", name = "XA", descriptor = "()I")
    public final int method193() {
        return this.field241;
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "()V")
    public final void method194() {
        this.field252.method304(1);
        this.field237.method304(1);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIF)Lih;")
    public final class731 method195(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "ya", descriptor = "()V")
    public final void method196() {
        if (this.field234 == 0 && this.field267 == this.field263 && this.field257 == 0 && this.field264 == this.field230) {
            int var1 = this.field260.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field260[var3++] = 2.1474836E9F;
                this.field260[var3++] = 2.1474836E9F;
                this.field260[var3++] = 2.1474836E9F;
                this.field260[var3++] = 2.1474836E9F;
                this.field260[var3++] = 2.1474836E9F;
                this.field260[var3++] = 2.1474836E9F;
                this.field260[var3++] = 2.1474836E9F;
                this.field260[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field260[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field263 - this.field234;
            int var5 = this.field230 - this.field257;
            int var6 = this.field267 - var4;
            int var7 = this.field267 * this.field257 + this.field234;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field260[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method186(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method186(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method224(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method224(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field234 && arg0 < this.field263 && var37 >= this.field257 && var37 < this.field230 && var24 < var21) {
                                int var38 = this.field267 * var37 + arg0;
                                int var39 = this.field240[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field240[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field234 && arg0 < this.field263 && var42 >= this.field257 && var42 < this.field230 && var24 < var21) {
                                int var43 = this.field267 * var42 + arg0;
                                int var44 = this.field240[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field240[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field234 && arg0 < this.field263 && var49 >= this.field257 && var49 < this.field230 && var24 < var21) {
                            this.field240[this.field267 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field257 && arg1 < this.field230 && var60 >= this.field234 && var60 < this.field263 && var24 < var21) {
                                int var61 = this.field267 * arg1 + var60;
                                int var62 = this.field240[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field240[this.field267 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field257 && arg1 < this.field230 && var65 >= this.field234 && var65 < this.field263 && var24 < var21) {
                                int var66 = this.field267 * arg1 + var65;
                                int var67 = this.field240[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field240[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field257 && arg1 < this.field230 && var72 >= this.field234 && var72 < this.field263 && var24 < var21) {
                            this.field240[this.field267 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!fba", name = "M", descriptor = "()I")
    public final int method198() {
        int var1 = this.field238;
        this.field238 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(IIIID)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field243 - arg2;
        int var8 = this.field243 * arg1 + arg0;
        float[] var9 = this.field260;
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

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "(I)[I")
    public final int[] method200(int arg0) {
        class29 var2 = this.field252;
        class744 var3;
        synchronized (this.field252) {
            var3 = (class744) this.field252.method302(-109, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field864.method1417((byte) 116, arg0)) {
                    return null;
                }
                class304 var5 = super.field864.method1419(arg0, -82);
                int var6 = !var5.field4911 && !this.field248 ? this.field246 : 64;
                var3 = new class744(arg0, var6, super.field864.method1415(arg0, 0.7F, var6, var6, 28039, true), var5.field4892 != 1);
                this.field252.method295(false, (long) arg0 | Long.MIN_VALUE, var3);
            }
        }
        var3.field10936 = true;
        return var3.method5415();
    }

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "([I)V")
    public final void method201(int[] arg0) {
        arg0[0] = this.field234;
        arg0[1] = this.field257;
        arg0[2] = this.field263;
        arg0[3] = this.field230;
    }

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "()V")
    public final void method202() {
        if (this.field223) {
            class300.method2587((byte) 113, true, false);
            this.field223 = false;
        }
        this.field227 = null;
        this.field225 = null;
        this.field221 = 0;
        this.field228 = 0;
        this.field222 = null;
        this.field224 = true;
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "()Z")
    public final boolean method203() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class293 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class589(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        class566 var10 = (class566) arg6;
        int[] var11 = var10.field8234;
        int[] var12 = var10.field8231;
        int var13 = this.field257 > arg8 ? this.field257 : arg8;
        int var14 = this.field230 < var11.length + arg8 ? this.field230 : var11.length + arg8;
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
            if (arg0 < this.field234) {
                var18 += (this.field234 - arg0) * var20;
                arg0 = this.field234;
            }
            if (var21 >= this.field263) {
                var21 = this.field263 - 1;
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
                                int var28 = this.field267 * var25 + arg0;
                                int var29 = this.field240[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field240[var28] = var23 + var30;
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
                                int var34 = this.field267 * var31 + arg0;
                                int var35 = this.field240[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field240[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field240[this.field267 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field234 && var64 < this.field263 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field240[this.field267 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field234 && var50 < this.field263 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field267 * arg1 + var50;
                        int var54 = this.field240[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field240[this.field267 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field234 && var56 < this.field263 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field267 * arg1 + var56;
                        int var60 = this.field240[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field240[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "(I)[I")
    public final int[] method206(int arg0) {
        class29 var2 = this.field252;
        class744 var3;
        synchronized (this.field252) {
            var3 = (class744) this.field252.method302(-119, (long) arg0);
            if (var3 == null) {
                if (!super.field864.method1417((byte) -70, arg0)) {
                    return null;
                }
                class304 var5 = super.field864.method1419(arg0, -92);
                int var6 = !var5.field4911 && !this.field248 ? this.field246 : 64;
                var3 = new class744(arg0, var6, super.field864.method1420(var6, true, var6, arg0, 0.7F, -7385), var5.field4892 != 1);
                this.field252.method295(false, (long) arg0, var3);
            }
        }
        var3.field10936 = true;
        return var3.method5415();
    }

    @OriginalMember(owner = "client!fba", name = "na", descriptor = "(IIII)[I")
    public final int[] method207(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field267 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field240[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(IIIIII)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method250(arg0, arg1, arg2, arg4, arg5);
        this.method250(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method262(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method262(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)Lel;")
    public final class575 method209(int arg0, int arg1) {
        return this.method179(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method210(Canvas arg0) {
        if (arg0 != null) {
            class782 var2 = (class782) this.field222.method737((byte) -39, (long) arg0.hashCode());
            if (var2 != null) {
                this.field225 = arg0;
                Dimension var3 = arg0.getSize();
                this.field221 = var3.width;
                this.field228 = var3.height;
                this.field227 = var2;
                if (this.field262 == null) {
                    this.field240 = var2.field11412;
                    this.field267 = var2.field11415;
                    this.field264 = var2.field11418;
                    if (this.field267 != this.field243 || this.field264 != this.field244) {
                        this.field247 = this.field243 = this.field267;
                        this.field235 = this.field244 = this.field264;
                        this.field242 = this.field260 = new float[this.field244 * this.field243];
                    }
                    this.method146();
                    return;
                }
            }
        } else {
            this.field225 = null;
            this.field227 = null;
            if (this.field262 == null) {
                this.field240 = null;
                this.field267 = this.field264 = 1;
                this.field243 = this.field244 = 1;
                this.method146();
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIZ)Lhk;")
    public final class107 method211(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field267 * arg1 + arg0;
        int var8 = this.field267 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field240[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class93(this, var6, arg2, arg3);
        } else {
            return new class637(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!fba", name = "Y", descriptor = "()[I")
    public final int[] method212() {
        return new int[] { this.field249, this.field229, this.field253, this.field261 };
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Luh;Z)Lhk;")
    public final class107 method213(class174 arg0, boolean arg1) {
        int[] var3 = arg0.field2775;
        byte[] var4 = arg0.field2776;
        int var5 = arg0.field2781;
        int var6 = arg0.field2782;
        class219 var11;
        if (arg1 && arg0.field2779 == null) {
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
            var11 = new class611(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field2779;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class93(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class637(this, var14, var5, var6);
            }
        }
        var11.method24(arg0.field2774, arg0.field2778, arg0.field2777, arg0.field2780);
        return var11;
    }

    @OriginalMember(owner = "client!fba", name = "EA", descriptor = "(IIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3) {
        class539 var5 = this.method230(Thread.currentThread());
        var5.field7899 = arg0;
        var5.field7902 = arg1;
        var5.field7913 = arg2;
    }

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "()V")
    public final void method215() {
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class24(Canvas arg0, class158 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method231(arg0, arg2, arg3);
            this.method210(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method668(-4369);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "()V")
    public final void method216() {
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lel;Ltq;)Lsia;")
    public final class769 method217(class575 arg0, class657 arg1) {
        return new class464(this, (class107) arg0, (class495) arg1);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I[Lih;)V")
    public final void method218(int arg0, class731[] arg1) {
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "()Z")
    public final boolean method219() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "([I)V")
    public final void method220(int[] arg0) {
        arg0[0] = this.field267;
        arg0[1] = this.field264;
    }

    @OriginalMember(owner = "client!fba", name = "KA", descriptor = "(IIII)V")
    public final void method221(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field267) {
            arg2 = this.field267;
        }
        if (arg3 > this.field264) {
            arg3 = this.field264;
        }
        this.field234 = arg0;
        this.field263 = arg2;
        this.field257 = arg1;
        this.field230 = arg3;
        this.method175();
    }

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "()V")
    public final void method222() {
        if (this.field225 != null) {
            this.field240 = this.field227.field11412;
            this.field267 = this.field227.field11415;
            this.field264 = this.field227.field11418;
            this.field260 = this.field242;
            this.field243 = this.field247;
            this.field244 = this.field235;
        } else {
            this.field267 = 1;
            this.field264 = 1;
            this.field240 = null;
            this.field243 = 1;
            this.field244 = 1;
            this.field260 = null;
        }
        this.field262 = null;
        this.method146();
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)Ltq;")
    public final class657 method223(int arg0, int arg1) {
        return new class495(arg0, arg1);
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(IIIIIIII)V")
    private final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field234 && arg0 < this.field263) {
            int var9 = this.field267 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field257 && arg1 + var15 < this.field230 && var12 < arg5) {
                            int var16 = this.field267 * var15 + var9;
                            int var17 = this.field240[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field240[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field257 && arg1 + var19 < this.field230 && var12 < arg5) {
                            int var20 = this.field267 * var19 + var9;
                            int var21 = this.field240[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field240[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field257 && arg1 + var25 < this.field230 && var12 < arg5) {
                        this.field240[this.field267 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "()V")
    public final void method225() {
    }

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "(I)Z")
    public final boolean method226(int arg0) {
        return this.field248 || super.field864.method1419(arg0, -112).field4911;
    }

    @OriginalMember(owner = "client!fba", name = "la", descriptor = "()V")
    public final void method227() {
        this.field234 = 0;
        this.field257 = 0;
        this.field263 = this.field267;
        this.field230 = this.field264;
        this.method175();
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)Lza;")
    public final class437 method228(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "(III[I)V")
    public final void method229(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field231.field10330 + (float) arg0 * this.field231.field10328 + (float) arg1 * this.field231.field10334 + this.field231.field10319;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field231.field10340 + (float) arg0 * this.field231.field10339 + (float) arg1 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / var5);
            int var7 = (int) (((float) arg2 * this.field231.field10343 + (float) arg0 * this.field231.field10315 + (float) arg1 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / var5);
            arg3[0] = var6 - this.field239;
            arg3[1] = var7 - this.field258;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/Runnable;)Ljq;")
    public final class539 method230(Runnable arg0) {
        for (int var2 = 0; var2 < this.field233; ++var2) {
            if (this.field265[var2].field7905 == arg0) {
                return this.field265[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method231(Canvas arg0, int arg1, int arg2) {
        class782 var4 = (class782) this.field222.method737((byte) -39, (long) arg0.hashCode());
        if (var4 == null) {
            class782 var5 = class138.method1286(6582, arg1, arg2, arg0);
            this.field222.method738(var5, (long) arg0.hashCode(), -12002);
        } else {
            if (var4.field11415 != arg1 || var4.field11418 != arg2) {
                this.method232(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method232(Canvas arg0, int arg1, int arg2) {
        class782 var4 = (class782) this.field222.method737((byte) -39, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method4173(-1);
            class782 var5 = class138.method1286(6582, arg1, arg2, arg0);
            this.field222.method738(var5, (long) arg0.hashCode(), -12002);
            if (this.field225 == arg0 && this.field262 == null) {
                Dimension var6 = arg0.getSize();
                this.field221 = var6.width;
                this.field228 = var6.height;
                this.field227 = var5;
                this.field240 = var5.field11412;
                this.field267 = var5.field11415;
                this.field264 = var5.field11418;
                if (this.field267 != this.field243 || this.field264 != this.field244) {
                    this.field247 = this.field243 = this.field267;
                    this.field235 = this.field244 = this.field264;
                    this.field242 = this.field260 = new float[this.field244 * this.field243];
                }
                this.method146();
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "()V")
    public final void method233() {
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
    public final void method234(int arg0) {
        this.field265[arg0].method4020(Thread.currentThread(), 64);
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(IIIIII)Llia;")
    public final class505 method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIII)V")
    public final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class539 var8 = this.method230(Thread.currentThread());
        class564 var9 = var8.field7946;
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
            int var23 = arg0 - var9.method4154();
            int var24 = arg1 - var9.method4159();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field8193 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field8193 = 255 - (arg4 >>> 24);
            }
            this.method265(false);
            var9.field8205 = var25 < 0 || var25 > var9.field8192 || var26 < 0 || var26 > var9.field8192 || var27 < 0 || var27 > var9.field8192;
            var9.method4148((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field8205 = var25 < 0 || var25 > var9.field8192 || var27 < 0 || var27 > var9.field8192 || var28 < 0 || var28 > var9.field8192;
            var9.method4148((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method265(true);
        }
    }

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "(III)V")
    public final void method237(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field265.length; ++var4) {
            class539 var5 = this.field265[var4];
            var5.field7902 = arg0 & 16777215;
            int var6 = var5.field7902 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7902 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7902 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7902 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7903 = false;
            } else {
                var5.field7903 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "()Z")
    public final boolean method238() {
        return true;
    }

    @OriginalMember(owner = "client!fba", name = "da", descriptor = "(III[I)V")
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field231.field10330 + (float) arg0 * this.field231.field10328 + (float) arg1 * this.field231.field10334 + this.field231.field10319;
        if (!(var5 < (float) this.field245) && !(var5 > (float) this.field241)) {
            int var6 = (int) (((float) arg2 * this.field231.field10340 + (float) arg0 * this.field231.field10339 + (float) arg1 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / var5);
            int var7 = (int) (((float) arg2 * this.field231.field10343 + (float) arg0 * this.field231.field10315 + (float) arg1 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / var5);
            if (var6 >= this.field239 && var6 <= this.field266 && var7 >= this.field258 && var7 <= this.field255) {
                arg3[0] = var6 - this.field239;
                arg3[1] = var7 - this.field258;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "()Lwaa;")
    public final class734 method240() {
        return new class734(0, field270[1], 1, field270[0], 0L);
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "()Z")
    public final boolean method241() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "aa", descriptor = "(IIIIII)V")
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field234) {
            arg2 -= this.field234 - arg0;
            arg0 = this.field234;
        }
        if (arg1 < this.field257) {
            arg3 -= this.field257 - arg1;
            arg1 = this.field257;
        }
        if (arg0 + arg2 > this.field263) {
            arg2 = this.field263 - arg0;
        }
        if (arg1 + arg3 > this.field230) {
            arg3 = this.field230 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field263 && arg1 <= this.field230) {
            int var7 = this.field267 - arg2;
            int var8 = this.field267 * arg1 + arg0;
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
                            this.field240[var24] = arg4;
                            ++var24;
                            this.field240[var24] = arg4;
                            ++var24;
                            this.field240[var24] = arg4;
                            ++var24;
                            this.field240[var24] = arg4;
                            ++var24;
                            this.field240[var24] = arg4;
                            ++var24;
                            this.field240[var24] = arg4;
                            ++var24;
                            this.field240[var24] = arg4;
                            ++var24;
                            this.field240[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field240[var24] = arg4;
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
                        int var14 = this.field240[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field240[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field240[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field240[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method243(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field254 = (int) (arg1 * 65535.0F);
        this.field256 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field251 = (int) (arg3 * 65535.0F / var7);
        this.field259 = (int) (arg4 * 65535.0F / var7);
        this.field250 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)I")
    public final int method244(int arg0) {
        return super.field864.method1419(arg0, -87).field4892;
    }

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "()Z")
    public final boolean method245() {
        return true;
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(Z)V")
    public final void method246(boolean arg0) {
        this.field248 = arg0;
        this.field252.method304(1);
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(II)V")
    public final void method247(int arg0, int arg1) {
        class539 var3 = this.method230(Thread.currentThread());
        this.field245 = arg0;
        this.field241 = arg1;
        var3.field7904 = this.field241 - 255;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lsia;)V")
    public final void method248(class769 arg0) {
        class464 var2 = (class464) arg0;
        this.field267 = var2.field7126;
        this.field264 = var2.field7130;
        this.field240 = var2.field7129;
        this.field262 = var2;
        this.field243 = var2.field7126;
        this.field244 = var2.field7130;
        this.field260 = var2.field7123;
        this.method146();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Llia;Llia;FLlia;)Llia;")
    public final class505 method249(class505 arg0, class505 arg1, float arg2, class505 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "U", descriptor = "(IIIII)V")
    public final void method250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field257 && arg1 < this.field230) {
            if (arg0 < this.field234) {
                arg2 -= this.field234 - arg0;
                arg0 = this.field234;
            }
            if (arg0 + arg2 > this.field263) {
                arg2 = this.field263 - arg0;
            }
            int var6 = this.field267 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field240[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field240[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field240[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field240[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field240[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "()Lsj;")
    public final class486 method251() {
        class539 var1 = this.method230(Thread.currentThread());
        return var1.field7906;
    }

    @OriginalMember(owner = "client!fba", name = "JA", descriptor = "(IIIIII)I")
    public final int method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field231.field10330 + (float) arg0 * this.field231.field10328 + (float) arg1 * this.field231.field10334 + this.field231.field10319;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field231.field10330 + (float) arg3 * this.field231.field10328 + (float) arg4 * this.field231.field10334 + this.field231.field10319;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field245 && var9 < (float) this.field245) {
            var7 |= 16;
        } else if (var8 > (float) this.field241 && var9 > (float) this.field241) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field231.field10340 + (float) arg0 * this.field231.field10339 + (float) arg1 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / var8);
        int var11 = (int) (((float) arg5 * this.field231.field10340 + (float) arg3 * this.field231.field10339 + (float) arg4 * this.field231.field10338 + this.field231.field10331) * (float) this.field253 / var9);
        if (var10 < this.field239 && var11 < this.field239) {
            var7 |= 1;
        } else if (var10 > this.field266 && var11 > this.field266) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field231.field10343 + (float) arg0 * this.field231.field10315 + (float) arg1 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / var8);
        int var13 = (int) (((float) arg5 * this.field231.field10343 + (float) arg3 * this.field231.field10315 + (float) arg4 * this.field231.field10333 + this.field231.field10327) * (float) this.field261 / var9);
        if (var12 < this.field258 && var13 < this.field258) {
            var7 |= 4;
        } else if (var12 > this.field255 && var13 > this.field255) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Llia;)V")
    public final void method253(class505 arg0) {
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lsj;)V")
    public final void method254(class486 arg0) {
        this.field231 = (class714) arg0;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lvia;IIII)V")
    private final void method255(class590 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field8566;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method185(arg1, arg2, arg3, arg4, arg0.field8556, 1);
        } else {
            if (this.field268 != var6) {
                class107 var9 = (class107) this.field237.method302(-82, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method200(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method226(var6) ? 64 : this.field246;
                    var9 = this.method665(var11, var11, -33, 0, var10, var11);
                    this.field237.method295(false, (long) var6, var9);
                }
                this.field268 = var6;
                this.field269 = var9;
            }
            ++var8;
            ((class219) this.field269).method909(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field8556, 1, 1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method256(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class146 {
        if (this.field225 != null && this.field227 != null) {
            try {
                Graphics var5 = this.field225.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field267 && var7.y + arg3 <= this.field264 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field227.method2166(var7.x, var5, var7.y + arg3, (byte) 101, var7.y, var7.height, var7.x + arg2, var7.width);
                    }
                }
            } catch (Exception var8) {
                this.field225.repaint();
            }
        } else {
            throw new IllegalStateException(field270[3]);
        }
    }

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "()Lsj;")
    public final class486 method257() {
        return new class714();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II[I[I)Laa;")
    public final class514 method258(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class566(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fba", name = "ra", descriptor = "(IIII)V")
    public final void method259(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field265.length; ++var5) {
            this.field265[var5].field7914 = this.field265[var5].field7902;
            this.field265[var5].field7899 = arg0;
            this.field265[var5].field7902 = arg1;
            this.field265[var5].field7913 = arg2;
            this.field265[var5].field7909 = true;
        }
    }

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)V")
    public final void method260(int arg0) {
        int var2 = arg0 - this.field226;
        for (Object var3 = this.field252.method301(118); var3 != null; var3 = this.field252.method303(126)) {
            class744 var4 = (class744) var3;
            if (var4.field10936) {
                var4.field10940 += var2;
                int var5 = var4.field10940 / 20;
                if (var5 > 0) {
                    class304 var6 = super.field864.method1419(var4.field10941, -123);
                    var4.method5416(var6.field4899 * var2 * 50 / 1000, var6.field4902 * var2 * 50 / 1000);
                    var4.field10940 -= var5 * 20;
                }
                var4.field10936 = false;
            }
        }
        this.field226 = arg0;
        this.field237.method294(5, -630);
        this.field252.method294(5, -630);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class566 var13 = (class566) arg6;
        int[] var14 = var13.field8234;
        int[] var15 = var13.field8231;
        int var16 = this.field257 > arg8 ? this.field257 : arg8;
        int var17 = this.field230 < var14.length + arg8 ? this.field230 : var14.length + arg8;
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
                        if (arg0 >= this.field234 && arg0 < this.field263 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field267 * var37 + arg0;
                                int var41 = this.field240[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field240[var40] = var35 + var42;
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
                        if (arg0 >= this.field234 && arg0 < this.field263 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field267 * var44 + arg0;
                                int var48 = this.field240[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field240[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field234 && arg0 < this.field263 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field240[this.field267 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field234 && var80 < this.field263 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field240[this.field267 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field234 && var66 < this.field263 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field267 * arg1 + var66;
                        int var69 = this.field240[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field240[this.field267 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field234 && var72 < this.field263 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field267 * arg1 + var72;
                        int var75 = this.field240[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field240[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!fba", name = "P", descriptor = "(IIIII)V")
    public final void method262(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field234 && arg0 < this.field263) {
            if (arg1 < this.field257) {
                arg2 -= this.field257 - arg1;
                arg1 = this.field257;
            }
            if (arg1 + arg2 > this.field230) {
                arg2 = this.field230 - arg1;
            }
            int var6 = this.field267 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field267 * var10 + var6;
                        int var12 = this.field240[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field240[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field267 * var14 + var6;
                        int var16 = this.field240[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field240[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field240[this.field267 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "()Z")
    public final boolean method263() {
        return false;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field864.method1419(arg6, -101).field4890) {
                if (this.field268 != arg6) {
                    class107 var11 = (class107) this.field237.method302(-82, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method200(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method226(arg6) ? 64 : this.field246;
                        var11 = this.method665(var13, var13, -117, 0, var12, var13);
                        this.field237.method295(false, (long) arg6, var11);
                    }
                    this.field268 = arg6;
                    this.field269 = var11;
                }
                ((class219) this.field269).method907(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method185(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "(Z)V")
    public final void method265(boolean arg0) {
        class539 var2 = this.method230(Thread.currentThread());
        var2.field7908 = arg0;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "([IIIIIZ)Lhk;")
    public final class107 method266(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class93(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class637(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class93(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class637(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(IIIIII)V")
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method250(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method250(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method262(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method262(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field234) {
                    var10 += (this.field234 - arg0) * var12;
                    arg0 = this.field234;
                }
                if (var13 >= this.field263) {
                    var13 = this.field263 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field257 && var17 < this.field230) {
                                int var18 = this.field267 * var17 + arg0;
                                int var19 = this.field240[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field240[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field257 && var21 < this.field230) {
                                int var22 = this.field267 * var21 + arg0;
                                int var23 = this.field240[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field240[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field257 && var27 < this.field230) {
                            this.field240[this.field267 * var27 + arg0] = arg4;
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
                if (arg1 < this.field257) {
                    var29 += (this.field257 - arg1) * var31;
                    arg1 = this.field257;
                }
                if (var32 >= this.field230) {
                    var32 = this.field230 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field234 && var46 < this.field263) {
                            this.field240[this.field267 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field234 && var36 < this.field263) {
                            int var37 = this.field267 * arg1 + var36;
                            int var38 = this.field240[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field240[this.field267 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field234 && var40 < this.field263) {
                            int var41 = this.field267 * arg1 + var40;
                            int var42 = this.field240[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field240[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)V")
    public final void method268(int arg0) {
        this.field265[arg0].method4020((Runnable) null, 64);
    }

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "()Z")
    public final boolean method269() {
        return true;
    }

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "(I)V")
    public final void method270(int arg0) {
        class294.field4717 = arg0;
        class294.field4728 = arg0;
        if (this.field233 > 1) {
            throw new IllegalStateException(field270[2]);
        } else {
            this.method147(this.field233);
            this.method234(0);
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "()Lsj;")
    public final class486 method271() {
        return this.field231;
    }

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method272(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 125);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method273(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
