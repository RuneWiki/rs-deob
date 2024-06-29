import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class749 extends class58 {

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "Z")
    private boolean field10434;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "Z")
    private boolean field10437;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "Lpfa;")
    private class295 field10438;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public int field10443;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "Z")
    private boolean field10459;

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
    private int field10463;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
    public int field10458;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public int field10448;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public int field10445;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public int field10450;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public int field10455;

    @OriginalMember(owner = "client!lr", name = "fb", descriptor = "I")
    public int field10470;

    @OriginalMember(owner = "client!lr", name = "hb", descriptor = "I")
    public int field10472;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
    public int field10462;

    @OriginalMember(owner = "client!lr", name = "ib", descriptor = "I")
    public int field10473;

    @OriginalMember(owner = "client!lr", name = "db", descriptor = "I")
    private int field10468;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    public int field10460;

    @OriginalMember(owner = "client!lr", name = "gb", descriptor = "I")
    public int field10471;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "Lof;")
    private class620 field10449;

    @OriginalMember(owner = "client!lr", name = "pb", descriptor = "I")
    private int field10480;

    @OriginalMember(owner = "client!lr", name = "Z", descriptor = "Lof;")
    private class620 field10464;

    @OriginalMember(owner = "client!lr", name = "nb", descriptor = "Lch;")
    public class462 field10478;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    private int field10439;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    private int field10433;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    private int field10435;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public int field10441;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public int field10442;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    private int field10444;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    private int field10446;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public int field10451;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public int field10453;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public int field10454;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
    public int field10456;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
    public int field10457;

    @OriginalMember(owner = "client!lr", name = "ab", descriptor = "I")
    private int field10465;

    @OriginalMember(owner = "client!lr", name = "bb", descriptor = "I")
    public int field10466;

    @OriginalMember(owner = "client!lr", name = "eb", descriptor = "I")
    public int field10469;

    @OriginalMember(owner = "client!lr", name = "jb", descriptor = "I")
    private int field10474;

    @OriginalMember(owner = "client!lr", name = "lb", descriptor = "I")
    public int field10476;

    @OriginalMember(owner = "client!lr", name = "mb", descriptor = "I")
    private int field10477;

    @OriginalMember(owner = "client!lr", name = "ob", descriptor = "I")
    public int field10479;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "Lqca;")
    public class115 field10440;

    @OriginalMember(owner = "client!lr", name = "qb", descriptor = "Lhu;")
    private class131 field10481;

    @OriginalMember(owner = "client!lr", name = "W", descriptor = "Lov;")
    private class187 field10461;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field10436;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "[F")
    public float[] field10452;

    @OriginalMember(owner = "client!lr", name = "cb", descriptor = "[F")
    public float[] field10467;

    @OriginalMember(owner = "client!lr", name = "kb", descriptor = "[I")
    public int[] field10475;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "[Lij;")
    private class421[] field10447;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "()Loba;", line = 4)
    public final class261 method395() {
        return new class261(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "(III[I)V", line = 8)
    public final void method333(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field10478.field6596 + (float) arg0 * this.field10478.field6585 + (float) arg1 * this.field10478.field6576 + this.field10478.field6595;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field10478.field6579 + (float) arg0 * this.field10478.field6577 + (float) arg1 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / var5);
            int var7 = (int) (((float) arg2 * this.field10478.field6589 + (float) arg0 * this.field10478.field6590 + (float) arg1 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / var5);
            arg3[0] = var6 - this.field10456;
            arg3[1] = var7 - this.field10469;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V", line = 23)
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lza;)V", line = 25)
    public final void method385(class413 arg0) {
    }

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "(III)V", line = 30)
    public final void method342(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field10447.length; ++var4) {
            class421 var5 = this.field10447[var4];
            var5.field6105 = arg0 & 16777215;
            int var6 = var5.field6105 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field6105 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field6105 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field6105 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field6099 = false;
            } else {
                var5.field6099 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "(I)Lza;", line = 62)
    public final class413 method408(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "()Z", line = 65)
    public final boolean method358() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(IIIIII)V", line = 68)
    private final void method4160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field10455) {
            var7 = this.field10455;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field10458) {
            var8 = this.field10458;
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
                if (var65 < this.field10445) {
                    var65 = this.field10445;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field10470) {
                    var66 = this.field10470;
                }
                int var67 = this.field10479 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field10452[var67]) {
                        this.field10475[var67] = arg4;
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
                if (var61 < this.field10445) {
                    var61 = this.field10445;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field10470 - 1) {
                    var62 = this.field10470 - 1;
                }
                int var63 = this.field10479 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field10452[var63]) {
                        this.field10475[var63] = arg4;
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
                if (var29 < this.field10445) {
                    var29 = this.field10445;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field10470) {
                    var30 = this.field10470;
                }
                int var31 = this.field10479 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field10452[var31]) {
                        int var33 = this.field10475[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field10475[var31] = var16 + var34;
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
                if (var23 < this.field10445) {
                    var23 = this.field10445;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field10470 - 1) {
                    var24 = this.field10470 - 1;
                }
                int var25 = this.field10479 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field10452[var25]) {
                        int var27 = this.field10475[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field10475[var25] = var16 + var28;
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
                if (var48 < this.field10445) {
                    var48 = this.field10445;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field10470) {
                    var49 = this.field10470;
                }
                int var50 = this.field10479 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field10452[var50]) {
                        int var52 = this.field10475[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field10475[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field10445) {
                    var40 = this.field10445;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field10470 - 1) {
                    var41 = this.field10470 - 1;
                }
                int var42 = this.field10479 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field10452[var42]) {
                        int var44 = this.field10475[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field10475[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "(IIIII)V", line = 384)
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field10445 && arg0 < this.field10470) {
            if (arg1 < this.field10455) {
                arg2 -= this.field10455 - arg1;
                arg1 = this.field10455;
            }
            if (arg1 + arg2 > this.field10458) {
                arg2 = this.field10458 - arg1;
            }
            int var6 = this.field10479 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field10479 * var10 + var6;
                        int var12 = this.field10475[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field10475[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field10479 * var14 + var6;
                        int var16 = this.field10475[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field10475[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field10475[this.field10479 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(II)I", line = 460)
    public final int method418(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[I[I)Laa;", line = 464)
    public final class485 method345(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class303(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 467)
    public class749(Canvas arg0, class150 arg1, int arg2, int arg3) {
        this(arg1);
        this.method369(arg0, arg2, arg3);
        this.method417(arg0);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZ)Lhu;", line = 473)
    public final class131 method332(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class639(this, arg0, arg1) : new class455(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIII)Lkm;", line = 479)
    public final class353 method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "()V", line = 481)
    public final void method351() {
    }

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "()I", line = 484)
    public final int method406() {
        return 0;
    }

    @OriginalMember(owner = "client!lr", name = "KA", descriptor = "(IIII)V", line = 488)
    public final void method432(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field10479) {
            arg2 = this.field10479;
        }
        if (arg3 > this.field10474) {
            arg3 = this.field10474;
        }
        this.field10445 = arg0;
        this.field10470 = arg2;
        this.field10455 = arg1;
        this.field10458 = arg3;
        this.method4174();
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(IIIID)V", line = 508)
    public final void method403(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field10444 - arg2;
        int var8 = this.field10444 * arg1 + arg0;
        float[] var9 = this.field10452;
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

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lpca;)V", line = 538)
    public final void method391(class713 arg0) {
        class421 var2 = this.method4161(Thread.currentThread());
        class562 var3 = arg0.field10032.field2044;
        for (class562 var4 = var3.field8004; var3 != var4; var4 = var4.field8004) {
            class676 var5 = (class676) var4;
            int var6 = var5.field9573 >> 12;
            int var7 = var5.field9578 >> 12;
            int var8 = var5.field9571 >> 12;
            float var9 = (float) var8 * this.field10478.field6596 + (float) var6 * this.field10478.field6585 + (float) var7 * this.field10478.field6576 + this.field10478.field6595;
            if (!(var9 < (float) this.field10473) && !(var9 > (float) var2.field6106)) {
                int var10 = (int) (((float) var8 * this.field10478.field6579 + (float) var6 * this.field10478.field6577 + (float) var7 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / var9) + this.field10441;
                int var11 = (int) (((float) var8 * this.field10478.field6589 + (float) var6 * this.field10478.field6590 + (float) var7 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / var9) + this.field10442;
                if (var10 >= this.field10445 && var10 <= this.field10470 && var11 >= this.field10455 && var11 <= this.field10458) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method4169(var5, var10, var11, (int) var9, (int) ((float) (this.field10471 * var5.field9566 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "(II)V", line = 577)
    public final void method386(int arg0, int arg1) {
        int var3 = this.field10479 * arg1 + arg0;
        int var4 = this.field10444 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field10475;
            float[] var6 = this.field10452;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class143.method891(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class143.method891(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class143.method897(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class143.method897(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "xa", descriptor = "(F)V", line = 619)
    public final void method360(float arg0) {
        this.field10460 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V", line = 622)
    public final void method347(boolean arg0) {
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lij;", line = 627)
    public final class421 method4161(Runnable arg0) {
        for (int var2 = 0; var2 < this.field10451; ++var2) {
            if (this.field10447[var2].field6096 == arg0) {
                return this.field10447[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "(ILaa;II)V", line = 640)
    public final void method389(int arg0, class485 arg1, int arg2, int arg3) {
        class303 var5 = (class303) arg1;
        int[] var6 = var5.field3791;
        int[] var7 = var5.field3788;
        int var8;
        if (this.field10458 < var6.length + arg3) {
            var8 = this.field10458 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field10455 > arg3) {
            var9 = this.field10455 - arg3;
            arg3 = this.field10455;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field10479 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field10445 > var12) {
                    var13 -= this.field10445 - var12;
                    var12 = this.field10445;
                }
                if (this.field10470 < var12 + var13) {
                    var13 = this.field10470 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field10475[var14++] = arg0;
                }
                var10 += this.field10479;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "ra", descriptor = "(IIII)V", line = 700)
    public final void method323(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field10447.length; ++var5) {
            this.field10447[var5].field6090 = this.field10447[var5].field6105;
            this.field10447[var5].field6103 = arg0;
            this.field10447[var5].field6105 = arg1;
            this.field10447[var5].field6101 = arg2;
            this.field10447[var5].field6102 = true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "()V", line = 713)
    public final void method426() {
        if (this.field10436 != null) {
            this.field10475 = this.field10440.field1205;
            this.field10479 = this.field10440.field1201;
            this.field10474 = this.field10440.field1200;
            this.field10452 = this.field10467;
            this.field10444 = this.field10446;
            this.field10477 = this.field10465;
        } else {
            this.field10479 = 1;
            this.field10474 = 1;
            this.field10475 = null;
            this.field10444 = 1;
            this.field10477 = 1;
            this.field10452 = null;
        }
        this.field10461 = null;
        this.method4172();
    }

    @OriginalMember(owner = "client!lr", name = "aa", descriptor = "(IIIIII)V", line = 736)
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field10445) {
            arg2 -= this.field10445 - arg0;
            arg0 = this.field10445;
        }
        if (arg1 < this.field10455) {
            arg3 -= this.field10455 - arg1;
            arg1 = this.field10455;
        }
        if (arg0 + arg2 > this.field10470) {
            arg2 = this.field10470 - arg0;
        }
        if (arg1 + arg3 > this.field10458) {
            arg3 = this.field10458 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field10470 && arg1 <= this.field10458) {
            int var7 = this.field10479 - arg2;
            int var8 = this.field10479 * arg1 + arg0;
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
                            this.field10475[var24] = arg4;
                            ++var24;
                            this.field10475[var24] = arg4;
                            ++var24;
                            this.field10475[var24] = arg4;
                            ++var24;
                            this.field10475[var24] = arg4;
                            ++var24;
                            this.field10475[var24] = arg4;
                            ++var24;
                            this.field10475[var24] = arg4;
                            ++var24;
                            this.field10475[var24] = arg4;
                            ++var24;
                            this.field10475[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field10475[var24] = arg4;
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
                        int var14 = this.field10475[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field10475[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field10475[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field10475[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Z", line = 871)
    public final boolean method4162(int arg0) {
        return super.field578.method929(15715, arg0);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIIII)V", line = 874)
    public final void method4163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field578.method931(arg6, true).field3694) {
                if (this.field10480 != arg6) {
                    class131 var11 = (class131) this.field10449.method3538((long) arg6, 0);
                    if (var11 == null) {
                        int[] var12 = this.method4171(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method4175(arg6) ? 64 : this.field10450;
                        var11 = this.method430(var13, -104, var12, var13, var13, 0);
                        this.field10449.method3537(-88, (long) arg6, var11);
                    }
                    this.field10480 = arg6;
                    this.field10481 = var11;
                }
                ((class69) this.field10481).method508(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method4160(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "HA", descriptor = "(IIII[I)V", line = 909)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field10478.field6596 + (float) arg0 * this.field10478.field6585 + (float) arg1 * this.field10478.field6576 + this.field10478.field6595;
        if (!(var6 < (float) this.field10473) && !(var6 > (float) this.field10448)) {
            int var7 = (int) (((float) arg2 * this.field10478.field6579 + (float) arg0 * this.field10478.field6577 + (float) arg1 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field10478.field6589 + (float) arg0 * this.field10478.field6590 + (float) arg1 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / (float) arg3);
            if (var7 >= this.field10456 && var7 <= this.field10476 && var8 >= this.field10469 && var8 <= this.field10454) {
                arg4[0] = var7 - this.field10456;
                arg4[1] = var8 - this.field10469;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lkm;Lkm;FLkm;)Lkm;", line = 933)
    public final class353 method341(class353 arg0, class353 arg1, float arg2, class353 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "(I)I", line = 936)
    public final int method4164(int arg0) {
        return super.field578.method931(arg0, true).field3698;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "()V", line = 939)
    public final void method331() {
        this.field10464.method3549(0);
        this.field10449.method3549(0);
    }

    @OriginalMember(owner = "client!lr", name = "la", descriptor = "()V", line = 943)
    public final void method393() {
        this.field10445 = 0;
        this.field10455 = 0;
        this.field10470 = this.field10479;
        this.field10458 = this.field10474;
        this.method4174();
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V", line = 950)
    public final void method392(int arg0) {
        this.field10447[arg0].method2643(-1, Thread.currentThread());
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V", line = 953)
    public final void method366(int arg0) {
        class383.field5320 = arg0;
        class383.field5329 = arg0;
        if (this.field10451 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method390(this.field10451);
            this.method392(0);
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ld;)V", line = 961)
    private class749(class150 arg0) {
        super(arg0);
        this.field10434 = false;
        this.field10437 = false;
        this.field10438 = new class295(4);
        this.field10443 = 78642;
        this.field10459 = false;
        this.field10463 = 0;
        this.field10458 = 0;
        this.field10448 = 3500;
        this.field10445 = 0;
        this.field10450 = 128;
        this.field10455 = 0;
        this.field10470 = 0;
        this.field10472 = 45823;
        this.field10462 = 512;
        this.field10473 = 50;
        this.field10468 = 0;
        this.field10460 = 75518;
        this.field10471 = 512;
        this.field10449 = new class620(16);
        this.field10480 = -1;
        this.field10464 = new class620(256);
        this.field10478 = new class462();
        this.method390(1);
        this.method392(0);
        class246.method1492(true, true, (byte) 113);
        this.field10434 = true;
        this.field10439 = (int) class652.method3700(-1);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIII)V", line = 972)
    private final void method4165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field10455 && arg1 < this.field10458) {
            int var9 = this.field10479 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field10445 && arg0 + var15 < this.field10470 && var12 < arg5) {
                            int var16 = this.field10475[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field10475[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field10445 && arg0 + var18 < this.field10470 && var12 < arg5) {
                            int var19 = this.field10475[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field10475[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field10445 && arg0 + var23 < this.field10470 && var12 < arg5) {
                        this.field10475[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "()I", line = 1052)
    public final int method346() {
        int var1 = this.field10463;
        this.field10463 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(IIIIII)V", line = 1057)
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method340(arg0, arg1, arg2, arg4, arg5);
        this.method340(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method377(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method377(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Luk;IIII)Lka;", line = 1063)
    public final class470 method383(class260 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class383(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lr", name = "ZA", descriptor = "(IFFFFF)V", line = 1066)
    public final void method325(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field10472 = (int) (arg1 * 65535.0F);
        this.field10443 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field10466 = (int) (arg3 * 65535.0F / var7);
        this.field10457 = (int) (arg4 * 65535.0F / var7);
        this.field10453 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!lr", name = "za", descriptor = "(IIIII)V", line = 1075)
    public final void method382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field10455) {
            var6 = this.field10455;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field10458) {
            var7 = this.field10458;
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
                if (var64 < this.field10445) {
                    var64 = this.field10445;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field10470) {
                    var65 = this.field10470;
                }
                int var66 = this.field10479 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field10475[var66++] = arg3;
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
                if (var60 < this.field10445) {
                    var60 = this.field10445;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field10470 - 1) {
                    var61 = this.field10470 - 1;
                }
                int var62 = this.field10479 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field10475[var62++] = arg3;
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
                if (var28 < this.field10445) {
                    var28 = this.field10445;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field10470) {
                    var29 = this.field10470;
                }
                int var30 = this.field10479 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field10475[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field10475[var30++] = var15 + var33;
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
                if (var22 < this.field10445) {
                    var22 = this.field10445;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field10470 - 1) {
                    var23 = this.field10470 - 1;
                }
                int var24 = this.field10479 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field10475[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field10475[var24++] = var15 + var27;
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
                if (var47 < this.field10445) {
                    var47 = this.field10445;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field10470) {
                    var48 = this.field10470;
                }
                int var49 = this.field10479 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field10475[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field10475[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field10445) {
                    var39 = this.field10445;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field10470 - 1) {
                    var40 = this.field10470 - 1;
                }
                int var41 = this.field10479 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field10475[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field10475[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lkv;Liaa;)Ljj;", line = 1362)
    public final class118 method423(class268 arg0, class493 arg1) {
        return new class187(this, (class131) arg0, (class678) arg1);
    }

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "(I)Z", line = 1365)
    public final boolean method4166(int arg0) {
        return super.field578.method931(arg0, true).field3716 || super.field578.method931(arg0, true).field3700;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([IIIIIZ)Lhu;", line = 1369)
    public final class131 method324(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class639(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class455(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class639(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class455(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lr", name = "GA", descriptor = "(I)V", line = 1404)
    public final void method378(int arg0) {
        this.method370(0, 0, this.field10479, this.field10474, arg0, 0);
    }

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "()Ldfa;", line = 1407)
    public final class165 method414() {
        return this.field10478;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1411)
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class421 var14 = this.method4161(Thread.currentThread());
        class665 var15 = var14.field6127;
        var15.field9466 = false;
        int var16 = arg0 - this.field10456;
        int var17 = arg3 - this.field10456;
        int var18 = arg6 - this.field10456;
        int var19 = arg1 - this.field10469;
        int var20 = arg4 - this.field10469;
        int var21 = arg7 - this.field10469;
        var15.field9458 = var16 < 0 || var16 > var15.field9453 || var17 < 0 || var17 > var15.field9453 || var18 < 0 || var18 > var15.field9453;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field9454 = 255 - var22;
                var15.field9461 = false;
                var15.method3784((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field9454 = 128;
                var15.field9461 = true;
                var15.method3784((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field9454 = 0;
            var15.field9461 = false;
            var15.method3784((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field9466 = true;
    }

    @OriginalMember(owner = "client!lr", name = "XA", descriptor = "()I", line = 1452)
    public final int method435() {
        return this.field10448;
    }

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "()Z", line = 1455)
    public final boolean method413() {
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "ya", descriptor = "()V", line = 1458)
    public final void method319() {
        if (this.field10445 == 0 && this.field10479 == this.field10470 && this.field10455 == 0 && this.field10474 == this.field10458) {
            int var1 = this.field10452.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field10452[var3++] = 2.1474836E9F;
                this.field10452[var3++] = 2.1474836E9F;
                this.field10452[var3++] = 2.1474836E9F;
                this.field10452[var3++] = 2.1474836E9F;
                this.field10452[var3++] = 2.1474836E9F;
                this.field10452[var3++] = 2.1474836E9F;
                this.field10452[var3++] = 2.1474836E9F;
                this.field10452[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field10452[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field10470 - this.field10445;
            int var5 = this.field10458 - this.field10455;
            int var6 = this.field10479 - var4;
            int var7 = this.field10479 * this.field10455 + this.field10445;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field10452[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(IIIIIIII)V", line = 1539)
    private final void method4167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field10445 && arg0 < this.field10470) {
            int var9 = this.field10479 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field10455 && arg1 + var15 < this.field10458 && var12 < arg5) {
                            int var16 = this.field10479 * var15 + var9;
                            int var17 = this.field10475[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field10475[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field10455 && arg1 + var19 < this.field10458 && var12 < arg5) {
                            int var20 = this.field10479 * var19 + var9;
                            int var21 = this.field10475[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field10475[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field10455 && arg1 + var25 < this.field10458 && var12 < arg5) {
                        this.field10475[this.field10479 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Liaa;", line = 1624)
    public final class493 method337(int arg0, int arg1) {
        return new class678(arg0, arg1);
    }

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "(I)I", line = 1628)
    public final int method4168(int arg0) {
        return super.field578.method931(arg0, true).field3706 & 65535;
    }

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "(I)V", line = 1630)
    public final void method398(int arg0) {
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V", line = 1633)
    public final void method390(int arg0) {
        this.field10451 = arg0;
        this.field10447 = new class421[this.field10451];
        for (int var2 = 0; var2 < this.field10451; ++var2) {
            this.field10447[var2] = new class421(this);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 1648)
    public final void method427(Canvas arg0, int arg1, int arg2) {
        class115 var4 = (class115) this.field10438.method1754(false, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method864(12983);
            class115 var5 = class730.method4071(14444, arg2, arg0, arg1);
            this.field10438.method1751(var5, 3970, (long) arg0.hashCode());
            if (this.field10436 == arg0 && this.field10461 == null) {
                Dimension var6 = arg0.getSize();
                this.field10433 = var6.width;
                this.field10435 = var6.height;
                this.field10440 = var5;
                this.field10475 = var5.field1205;
                this.field10479 = var5.field1201;
                this.field10474 = var5.field1200;
                if (this.field10479 != this.field10444 || this.field10477 != this.field10474) {
                    this.field10446 = this.field10444 = this.field10479;
                    this.field10465 = this.field10477 = this.field10474;
                    this.field10467 = this.field10452 = new float[this.field10477 * this.field10444];
                }
                this.method4172();
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "da", descriptor = "(III[I)V", line = 1679)
    public final void method436(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field10478.field6596 + (float) arg0 * this.field10478.field6585 + (float) arg1 * this.field10478.field6576 + this.field10478.field6595;
        if (!(var5 < (float) this.field10473) && !(var5 > (float) this.field10448)) {
            int var6 = (int) (((float) arg2 * this.field10478.field6579 + (float) arg0 * this.field10478.field6577 + (float) arg1 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / var5);
            int var7 = (int) (((float) arg2 * this.field10478.field6589 + (float) arg0 * this.field10478.field6590 + (float) arg1 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / var5);
            if (var6 >= this.field10456 && var6 <= this.field10476 && var7 >= this.field10469 && var7 <= this.field10454) {
                arg3[0] = var6 - this.field10456;
                arg3[1] = var7 - this.field10469;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "()Z", line = 1703)
    public final boolean method394() {
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(II)Lkv;", line = 1706)
    public final class268 method425(int arg0, int arg1) {
        return this.method332(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "(I)V", line = 1709)
    public final void method433(int arg0) {
        this.field10447[arg0].method2643(-1, (Runnable) null);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([I)V", line = 1713)
    public final void method372(int[] arg0) {
        arg0[0] = this.field10479;
        arg0[1] = this.field10474;
    }

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "(Z)V", line = 1718)
    public final void method364(boolean arg0) {
        class421 var2 = this.method4161(Thread.currentThread());
        var2.field6098 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "()I", line = 1722)
    public final int method350() {
        return 0;
    }

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "()[I", line = 1725)
    public final int[] method327() {
        return new int[] { this.field10441, this.field10442, this.field10471, this.field10462 };
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V", line = 1729)
    public final void method365(int arg0) {
        this.field10450 = arg0;
        this.field10464.method3549(0);
    }

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "()Z", line = 1736)
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "()I", line = 1741)
    public final int method318() {
        int var1 = this.field10468;
        this.field10468 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "()Z", line = 1746)
    public final boolean method353() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lgi;IIII)V", line = 1750)
    private final void method4169(class676 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field9569;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method4160(arg1, arg2, arg3, arg4, arg0.field9576, 1);
        } else {
            if (this.field10480 != var6) {
                class131 var9 = (class131) this.field10449.method3538((long) var6, 0);
                if (var9 == null) {
                    int[] var10 = this.method4171(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method4175(var6) ? 64 : this.field10450;
                    var9 = this.method430(var11, -93, var10, var11, var11, 0);
                    this.field10449.method3537(95, (long) var6, var9);
                }
                this.field10480 = var6;
                this.field10481 = var9;
            }
            ++var8;
            ((class69) this.field10481).method508(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field9576, 1, 1);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lur;[Lg;Z)Lda;", line = 1789)
    public final class59 method373(class535 arg0, class155[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1708;
            var5[var7] = arg1[var7].field1706;
            if (arg1[var7].field1707 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class739(this, arg0, arg1, var4, var5);
            } else {
                return new class474(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class355(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "()Ldfa;", line = 1827)
    public final class165 method422() {
        class421 var1 = this.method4161(Thread.currentThread());
        return var1.field6107;
    }

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "(I)V", line = 1832)
    public final void method415(int arg0) {
        int var2 = arg0 - this.field10439;
        for (Object var3 = this.field10464.method3547(30770); var3 != null; var3 = this.field10464.method3550(99)) {
            class328 var4 = (class328) var3;
            if (var4.field4252) {
                var4.field4255 += var2;
                int var5 = var4.field4255 / 20;
                if (var5 > 0) {
                    class298 var6 = super.field578.method931(var4.field4251, true);
                    var4.method1960(var6.field3704 * var2 * 50 / 1000, var6.field3699 * var2 * 50 / 1000);
                    var4.field4255 -= var5 * 20;
                }
                var4.field4252 = false;
            }
        }
        this.field10439 = arg0;
        this.field10449.method3539((byte) 118, 5);
        this.field10464.method3539((byte) -7, 5);
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "()Z", line = 1864)
    public final boolean method4170() {
        return this.field10437;
    }

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "(IIIII)V", line = 1867)
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field10455 && arg1 < this.field10458) {
            if (arg0 < this.field10445) {
                arg2 -= this.field10445 - arg0;
                arg0 = this.field10445;
            }
            if (arg0 + arg2 > this.field10470) {
                arg2 = this.field10470 - arg0;
            }
            int var6 = this.field10479 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field10475[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field10475[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field10475[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field10475[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field10475[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()V", line = 1939)
    public final void method322() {
        if (this.field10434) {
            class125.method797(true, false, false);
            this.field10434 = false;
        }
        this.field10440 = null;
        this.field10436 = null;
        this.field10433 = 0;
        this.field10435 = 0;
        this.field10438 = null;
        this.field10437 = true;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1953)
    public final class278 method424(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class321(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "([I)V", line = 1957)
    public final void method354(int[] arg0) {
        arg0[0] = this.field10445;
        arg0[1] = this.field10455;
        arg0[2] = this.field10470;
        arg0[3] = this.field10458;
    }

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "(IIIIII[BII)V", line = 1963)
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field10479 * arg1 + arg0;
            int var15 = this.field10479 - arg2;
            if (arg1 + arg3 > this.field10458) {
                arg3 -= arg1 + arg3 - this.field10458;
            }
            if (arg1 < this.field10455) {
                int var16 = this.field10455 - arg1;
                arg3 -= var16;
                var14 += this.field10479 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field10470) {
                int var17 = arg0 + arg2 - this.field10470;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field10445) {
                int var18 = this.field10445 - arg0;
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
                            int var28 = this.field10475[var14];
                            this.field10475[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field10475[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field10475[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field10475[var14++] = arg5;
                        } else {
                            this.field10475[var14++] = arg4;
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

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(II)V", line = 2139)
    public final void method381(int arg0, int arg1) {
        class421 var3 = this.method4161(Thread.currentThread());
        this.field10473 = arg0;
        this.field10448 = arg1;
        var3.field6106 = this.field10448 - 255;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2146)
    public final void method369(Canvas arg0, int arg1, int arg2) {
        class115 var4 = (class115) this.field10438.method1754(false, (long) arg0.hashCode());
        if (var4 == null) {
            class115 var5 = class730.method4071(14444, arg2, arg0, arg1);
            this.field10438.method1751(var5, 3970, (long) arg0.hashCode());
        } else {
            if (var4.field1201 != arg1 || var4.field1200 != arg2) {
                this.method427(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "JA", descriptor = "(IIIIII)I", line = 2160)
    public final int method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field10478.field6596 + (float) arg0 * this.field10478.field6585 + (float) arg1 * this.field10478.field6576 + this.field10478.field6595;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field10478.field6596 + (float) arg3 * this.field10478.field6585 + (float) arg4 * this.field10478.field6576 + this.field10478.field6595;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field10473 && var9 < (float) this.field10473) {
            var7 |= 16;
        } else if (var8 > (float) this.field10448 && var9 > (float) this.field10448) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field10478.field6579 + (float) arg0 * this.field10478.field6577 + (float) arg1 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / var8);
        int var11 = (int) (((float) arg5 * this.field10478.field6579 + (float) arg3 * this.field10478.field6577 + (float) arg4 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / var9);
        if (var10 < this.field10456 && var11 < this.field10456) {
            var7 |= 1;
        } else if (var10 > this.field10476 && var11 > this.field10476) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field10478.field6589 + (float) arg0 * this.field10478.field6590 + (float) arg1 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / var8);
        int var13 = (int) (((float) arg5 * this.field10478.field6589 + (float) arg3 * this.field10478.field6590 + (float) arg4 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / var9);
        if (var12 < this.field10469 && var13 < this.field10469) {
            var7 |= 4;
        } else if (var12 > this.field10454 && var13 > this.field10454) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "()Z", line = 2203)
    public final boolean method328() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "EA", descriptor = "(IIII)V", line = 2207)
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        class421 var5 = this.method4161(Thread.currentThread());
        var5.field6103 = arg0;
        var5.field6105 = arg1;
        var5.field6101 = arg2;
    }

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "()Z", line = 2215)
    public final boolean method420() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(IIIIII)V", line = 2218)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method340(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method340(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method377(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method377(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field10445) {
                    var10 += (this.field10445 - arg0) * var12;
                    arg0 = this.field10445;
                }
                if (var13 >= this.field10470) {
                    var13 = this.field10470 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field10455 && var17 < this.field10458) {
                                int var18 = this.field10479 * var17 + arg0;
                                int var19 = this.field10475[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field10475[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field10455 && var21 < this.field10458) {
                                int var22 = this.field10479 * var21 + arg0;
                                int var23 = this.field10475[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field10475[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field10455 && var27 < this.field10458) {
                            this.field10475[this.field10479 * var27 + arg0] = arg4;
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
                if (arg1 < this.field10455) {
                    var29 += (this.field10455 - arg1) * var31;
                    arg1 = this.field10455;
                }
                if (var32 >= this.field10458) {
                    var32 = this.field10458 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field10445 && var46 < this.field10470) {
                            this.field10475[this.field10479 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field10445 && var36 < this.field10470) {
                            int var37 = this.field10479 * arg1 + var36;
                            int var38 = this.field10475[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field10475[this.field10479 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field10445 && var40 < this.field10470) {
                            int var41 = this.field10479 * arg1 + var40;
                            int var42 = this.field10475[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field10475[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "(I)[I", line = 2432)
    public final int[] method4171(int arg0) {
        class620 var2 = this.field10464;
        class328 var3;
        synchronized (this.field10464) {
            var3 = (class328) this.field10464.method3538((long) arg0 | Long.MIN_VALUE, 0);
            if (var3 == null) {
                if (!super.field578.method929(15715, arg0)) {
                    return null;
                }
                class298 var5 = super.field578.method931(arg0, true);
                int var6 = !var5.field3711 && !this.field10459 ? this.field10450 : 64;
                var3 = new class328(arg0, var6, super.field578.method932(0.7F, var6, arg0, true, -20255, var6), var5.field3698 != 1);
                this.field10464.method3537(-89, (long) arg0 | Long.MIN_VALUE, var3);
            }
        }
        var3.field4252 = true;
        return var3.method1961();
    }

    @OriginalMember(owner = "client!lr", name = "DA", descriptor = "(IIII)V", line = 2453)
    public final void method400(int arg0, int arg1, int arg2, int arg3) {
        this.field10441 = arg0;
        this.field10442 = arg1;
        this.field10471 = arg2;
        this.field10462 = arg3;
        this.method4174();
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2461)
    public final void method375(Canvas arg0) {
        if (this.field10436 == arg0) {
            this.method417((Canvas) null);
        }
        class115 var2 = (class115) this.field10438.method1754(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method864(12983);
        }
    }

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "()Z", line = 2471)
    public final boolean method411() {
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "()V", line = 2477)
    private final void method4172() {
        for (int var1 = 0; var1 < this.field10451; ++var1) {
            this.field10447[var1].method2642(-18746);
        }
        this.method393();
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[Lada;)V", line = 2484)
    public final void method321(int arg0, class163[] arg1) {
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ldfa;)V", line = 2487)
    public final void method339(class165 arg0) {
        this.field10478 = (class462) arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIII)V", line = 2491)
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class421 var8 = this.method4161(Thread.currentThread());
        class665 var9 = var8.field6127;
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
            int var23 = arg0 - var9.method3787();
            int var24 = arg1 - var9.method3779();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field9454 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field9454 = 255 - (arg4 >>> 24);
            }
            this.method364(false);
            var9.field9458 = var25 < 0 || var25 > var9.field9453 || var26 < 0 || var26 > var9.field9453 || var27 < 0 || var27 > var9.field9453;
            var9.method3777((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field9458 = var25 < 0 || var25 > var9.field9453 || var27 < 0 || var27 > var9.field9453 || var28 < 0 || var28 > var9.field9453;
            var9.method3777((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method364(true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2564)
    public final void method417(Canvas arg0) {
        if (arg0 != null) {
            class115 var2 = (class115) this.field10438.method1754(false, (long) arg0.hashCode());
            if (var2 != null) {
                this.field10436 = arg0;
                Dimension var3 = arg0.getSize();
                this.field10433 = var3.width;
                this.field10435 = var3.height;
                this.field10440 = var2;
                if (this.field10461 == null) {
                    this.field10475 = var2.field1205;
                    this.field10479 = var2.field1201;
                    this.field10474 = var2.field1200;
                    if (this.field10479 != this.field10444 || this.field10477 != this.field10474) {
                        this.field10446 = this.field10444 = this.field10479;
                        this.field10465 = this.field10477 = this.field10474;
                        this.field10467 = this.field10452 = new float[this.field10477 * this.field10444];
                    }
                    this.method4172();
                    return;
                }
            }
        } else {
            this.field10436 = null;
            this.field10440 = null;
            if (this.field10461 == null) {
                this.field10475 = null;
                this.field10479 = this.field10474 = 1;
                this.field10444 = this.field10477 = 1;
                this.method4172();
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2611)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class303 var13 = (class303) arg6;
        int[] var14 = var13.field3791;
        int[] var15 = var13.field3788;
        int var16 = this.field10455 > arg8 ? this.field10455 : arg8;
        int var17 = this.field10458 < var14.length + arg8 ? this.field10458 : var14.length + arg8;
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
                        if (arg0 >= this.field10445 && arg0 < this.field10470 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field10479 * var37 + arg0;
                                int var41 = this.field10475[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field10475[var40] = var35 + var42;
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
                        if (arg0 >= this.field10445 && arg0 < this.field10470 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field10479 * var44 + arg0;
                                int var48 = this.field10475[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field10475[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field10445 && arg0 < this.field10470 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field10475[this.field10479 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field10445 && var80 < this.field10470 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field10475[this.field10479 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field10445 && var66 < this.field10470 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field10479 * arg1 + var66;
                        int var69 = this.field10475[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field10475[this.field10479 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field10445 && var72 < this.field10470 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field10479 * arg1 + var72;
                        int var75 = this.field10475[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field10475[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "(IIIIIII)I", line = 2857)
    public final int method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field10478.field6596 + (float) arg0 * this.field10478.field6585 + (float) arg1 * this.field10478.field6576 + this.field10478.field6595;
        float var9 = (float) arg5 * this.field10478.field6596 + (float) arg3 * this.field10478.field6585 + (float) arg4 * this.field10478.field6576 + this.field10478.field6595;
        int var10 = 0;
        if (var8 < (float) this.field10473 && var9 < (float) this.field10473) {
            var10 |= 16;
        } else if (var8 > (float) this.field10448 && var9 > (float) this.field10448) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field10478.field6579 + (float) arg0 * this.field10478.field6577 + (float) arg1 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field10478.field6579 + (float) arg3 * this.field10478.field6577 + (float) arg4 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / (float) arg6);
        if (var11 < this.field10456 && var12 < this.field10456) {
            var10 |= 1;
        } else if (var11 > this.field10476 && var12 > this.field10476) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field10478.field6589 + (float) arg0 * this.field10478.field6590 + (float) arg1 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field10478.field6589 + (float) arg3 * this.field10478.field6590 + (float) arg4 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / (float) arg6);
        if (var13 < this.field10469 && var14 < this.field10469) {
            var10 |= 4;
        } else if (var13 > this.field10454 && var14 > this.field10454) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "()Z", line = 2894)
    public final boolean method440() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "pa", descriptor = "()V", line = 2899)
    public final void method419() {
        for (int var1 = 0; var1 < this.field10447.length; ++var1) {
            this.field10447[var1].field6105 = this.field10447[var1].field6090;
            this.field10447[var1].field6102 = false;
        }
    }

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "(IIII)V", line = 2909)
    public final void method438(int arg0, int arg1, int arg2, int arg3) {
        if (this.field10445 < arg0) {
            this.field10445 = arg0;
        }
        if (this.field10455 < arg1) {
            this.field10455 = arg1;
        }
        if (this.field10470 > arg2) {
            this.field10470 = arg2;
        }
        if (this.field10458 > arg3) {
            this.field10458 = arg3;
        }
        this.method4174();
    }

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "(I)[I", line = 2925)
    public final int[] method4173(int arg0) {
        class620 var2 = this.field10464;
        class328 var3;
        synchronized (this.field10464) {
            var3 = (class328) this.field10464.method3538((long) arg0, 0);
            if (var3 == null) {
                if (!super.field578.method929(15715, arg0)) {
                    return null;
                }
                class298 var5 = super.field578.method931(arg0, true);
                int var6 = !var5.field3711 && !this.field10459 ? this.field10450 : 64;
                var3 = new class328(arg0, var6, super.field578.method930(true, 123, var6, arg0, 0.7F, var6), var5.field3698 != 1);
                this.field10464.method3537(121, (long) arg0, var3);
            }
        }
        var3.field4252 = true;
        return var3.method1961();
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIF)Lada;", line = 2945)
    public final class163 method368(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lpca;I)V", line = 2949)
    public final void method402(class713 arg0, int arg1) {
        class421 var3 = this.method4161(Thread.currentThread());
        class562 var4 = arg0.field10032.field2044;
        for (class562 var5 = var4.field8004; var4 != var5; var5 = var5.field8004) {
            class676 var6 = (class676) var5;
            int var7 = var6.field9573 >> 12;
            int var8 = var6.field9578 >> 12;
            int var9 = var6.field9571 >> 12;
            float var10 = (float) var9 * this.field10478.field6596 + (float) var7 * this.field10478.field6585 + (float) var8 * this.field10478.field6576 + this.field10478.field6595;
            if (!(var10 < (float) this.field10473) && !(var10 > (float) var3.field6106)) {
                int var11 = (int) (((float) var9 * this.field10478.field6579 + (float) var7 * this.field10478.field6577 + (float) var8 * this.field10478.field6592 + this.field10478.field6599) * (float) this.field10471 / (float) arg1) + this.field10441;
                int var12 = (int) (((float) var9 * this.field10478.field6589 + (float) var7 * this.field10478.field6590 + (float) var8 * this.field10478.field6591 + this.field10478.field6605) * (float) this.field10462 / (float) arg1) + this.field10442;
                if (var11 >= this.field10445 && var11 <= this.field10470 && var12 >= this.field10455 && var12 <= this.field10458) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method4169(var6, var11, var12, (int) var10, (this.field10471 * var6.field9566 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "()V", line = 2986)
    public final void method362() {
    }

    @OriginalMember(owner = "client!lr", name = "na", descriptor = "(IIII)[I", line = 2990)
    public final int[] method356(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field10479 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field10475[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(FFF)V", line = 3014)
    public final void method401(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(II)V", line = 3018)
    public final void method429(int arg0, int arg1) throws class266 {
        if (this.field10436 != null && this.field10440 != null) {
            try {
                Graphics var3 = this.field10436.getGraphics();
                this.field10440.method763(var3, arg1, this.field10433, 10000, 0, this.field10435, 0, arg0);
            } catch (Exception var4) {
                this.field10436.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V", line = 3034)
    public final void method407(boolean arg0) {
        this.field10459 = arg0;
        this.field10464.method3549(0);
    }

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "()Z", line = 3038)
    public final boolean method421() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "()V", line = 3041)
    private final void method4174() {
        this.field10456 = this.field10445 - this.field10441;
        this.field10476 = this.field10470 - this.field10441;
        this.field10469 = this.field10455 - this.field10442;
        this.field10454 = this.field10458 - this.field10442;
        for (int var1 = 0; var1 < this.field10451; ++var1) {
            class665 var5 = this.field10447[var1].field6127;
            var5.field9452 = this.field10441 - this.field10445;
            var5.field9465 = this.field10442 - this.field10455;
            var5.field9453 = this.field10470 - this.field10445;
            var5.field9460 = this.field10458 - this.field10455;
        }
        int var2 = this.field10479 * this.field10455 + this.field10445;
        for (int var3 = this.field10455; var3 < this.field10458; ++var3) {
            for (int var4 = 0; var4 < this.field10451; ++var4) {
                this.field10447[var4].field6127.field9467[var3 - this.field10455] = var2;
            }
            var2 += this.field10479;
        }
    }

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "()I", line = 3079)
    public final int method320() {
        return this.field10473;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIII)V", line = 3082)
    public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method4165(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method4165(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method4167(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method4167(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field10445 && arg0 < this.field10470 && var37 >= this.field10455 && var37 < this.field10458 && var24 < var21) {
                                int var38 = this.field10479 * var37 + arg0;
                                int var39 = this.field10475[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field10475[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field10445 && arg0 < this.field10470 && var42 >= this.field10455 && var42 < this.field10458 && var24 < var21) {
                                int var43 = this.field10479 * var42 + arg0;
                                int var44 = this.field10475[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field10475[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field10445 && arg0 < this.field10470 && var49 >= this.field10455 && var49 < this.field10458 && var24 < var21) {
                            this.field10475[this.field10479 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field10455 && arg1 < this.field10458 && var60 >= this.field10445 && var60 < this.field10470 && var24 < var21) {
                                int var61 = this.field10479 * arg1 + var60;
                                int var62 = this.field10475[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field10475[this.field10479 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field10455 && arg1 < this.field10458 && var65 >= this.field10445 && var65 < this.field10470 && var24 < var21) {
                                int var66 = this.field10479 * arg1 + var65;
                                int var67 = this.field10475[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field10475[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field10455 && arg1 < this.field10458 && var72 >= this.field10445 && var72 < this.field10470 && var24 < var21) {
                            this.field10475[this.field10479 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "()Ldfa;", line = 3328)
    public final class165 method352() {
        return new class462();
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()Z", line = 3331)
    public final boolean method326() {
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lkm;)V", line = 3333)
    public final void method348(class353 arg0) {
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)I", line = 3336)
    public final int method404(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljj;)V", line = 3340)
    public final void method357(class118 arg0) {
        class187 var2 = (class187) arg0;
        this.field10479 = var2.field2227;
        this.field10474 = var2.field2219;
        this.field10475 = var2.field2221;
        this.field10461 = var2;
        this.field10444 = var2.field2227;
        this.field10477 = var2.field2219;
        this.field10452 = var2.field2224;
        this.method4172();
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "()V", line = 3352)
    public final void method334() {
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIZ)Lhu;", line = 3360)
    public final class131 method396(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field10479 * arg1 + arg0;
        int var8 = this.field10479 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field10475[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class639(this, var6, arg2, arg3);
        } else {
            return new class455(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "(I)Z", line = 3392)
    public final boolean method4175(int arg0) {
        return this.field10459 || super.field578.method931(arg0, true).field3711;
    }

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "()V", line = 3397)
    public final void method384() {
    }

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "()Z", line = 3406)
    public final boolean method376() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 3427)
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class266 {
        if (this.field10436 != null && this.field10440 != null) {
            try {
                Graphics var5 = this.field10436.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field10479 && var7.y + arg3 <= this.field10474 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field10440.method763(var5, var7.y + arg3, var7.width, 10000, var7.x, var7.height, var7.y, var7.x + arg2);
                    }
                }
            } catch (Exception var8) {
                this.field10436.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "()Z", line = 3482)
    public final boolean method359() {
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lg;Z)Lhu;", line = 3495)
    public final class131 method434(class155 arg0, boolean arg1) {
        int[] var3 = arg0.field1710;
        byte[] var4 = arg0.field1702;
        int var5 = arg0.field1708;
        int var6 = arg0.field1706;
        class69 var11;
        if (arg1 && arg0.field1707 == null) {
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
            var11 = new class401(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1707;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class639(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class455(this, var14, var5, var6);
            }
        }
        var11.method511(arg0.field1709, arg0.field1703, arg0.field1704, arg0.field1705);
        return var11;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIILaa;II)V", line = 3619)
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8) {
        class303 var10 = (class303) arg6;
        int[] var11 = var10.field3791;
        int[] var12 = var10.field3788;
        int var13 = this.field10455 > arg8 ? this.field10455 : arg8;
        int var14 = this.field10458 < var11.length + arg8 ? this.field10458 : var11.length + arg8;
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
            if (arg0 < this.field10445) {
                var18 += (this.field10445 - arg0) * var20;
                arg0 = this.field10445;
            }
            if (var21 >= this.field10470) {
                var21 = this.field10470 - 1;
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
                                int var28 = this.field10479 * var25 + arg0;
                                int var29 = this.field10475[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field10475[var28] = var23 + var30;
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
                                int var34 = this.field10479 * var31 + arg0;
                                int var35 = this.field10475[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field10475[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field10475[this.field10479 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field10445 && var64 < this.field10470 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field10475[this.field10479 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field10445 && var50 < this.field10470 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field10479 * arg1 + var50;
                        int var54 = this.field10475[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field10475[this.field10479 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field10445 && var56 < this.field10470 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field10479 * arg1 + var56;
                        int var60 = this.field10475[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field10475[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
