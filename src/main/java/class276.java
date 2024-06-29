import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class276 extends class548 {

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "Z")
    private boolean field3988;

    @OriginalMember(owner = "client!fga", name = "E", descriptor = "Z")
    private boolean field3993;

    @OriginalMember(owner = "client!fga", name = "A", descriptor = "Lbaa;")
    private class130 field3989;

    @OriginalMember(owner = "client!fga", name = "L", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!fga", name = "G", descriptor = "I")
    private int field3995;

    @OriginalMember(owner = "client!fga", name = "Q", descriptor = "I")
    private int field4005;

    @OriginalMember(owner = "client!fga", name = "fb", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!fga", name = "W", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!fga", name = "K", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!fga", name = "lb", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!fga", name = "R", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!fga", name = "S", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!fga", name = "ab", descriptor = "Z")
    private boolean field4015;

    @OriginalMember(owner = "client!fga", name = "db", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!fga", name = "pb", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!fga", name = "U", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!fga", name = "X", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!fga", name = "ib", descriptor = "Lgw;")
    private class690 field4023;

    @OriginalMember(owner = "client!fga", name = "tb", descriptor = "I")
    private int field4034;

    @OriginalMember(owner = "client!fga", name = "T", descriptor = "Lgw;")
    private class690 field4008;

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "Lbg;")
    public class330 field3997;

    @OriginalMember(owner = "client!fga", name = "D", descriptor = "I")
    private int field3992;

    @OriginalMember(owner = "client!fga", name = "B", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "I")
    public int field3994;

    @OriginalMember(owner = "client!fga", name = "M", descriptor = "I")
    private int field4001;

    @OriginalMember(owner = "client!fga", name = "N", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!fga", name = "O", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!fga", name = "P", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!fga", name = "V", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!fga", name = "Y", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!fga", name = "Z", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!fga", name = "bb", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!fga", name = "cb", descriptor = "I")
    private int field4017;

    @OriginalMember(owner = "client!fga", name = "eb", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!fga", name = "gb", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!fga", name = "hb", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!fga", name = "nb", descriptor = "I")
    private int field4028;

    @OriginalMember(owner = "client!fga", name = "ob", descriptor = "I")
    private int field4029;

    @OriginalMember(owner = "client!fga", name = "qb", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!fga", name = "H", descriptor = "Lil;")
    private class273 field3996;

    @OriginalMember(owner = "client!fga", name = "sb", descriptor = "Lfd;")
    private class298 field4033;

    @OriginalMember(owner = "client!fga", name = "x", descriptor = "Lev;")
    public class349 field3986;

    @OriginalMember(owner = "client!fga", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3987;

    @OriginalMember(owner = "client!fga", name = "mb", descriptor = "[F")
    public float[] field4027;

    @OriginalMember(owner = "client!fga", name = "rb", descriptor = "[F")
    public float[] field4032;

    @OriginalMember(owner = "client!fga", name = "jb", descriptor = "[I")
    public int[] field4024;

    @OriginalMember(owner = "client!fga", name = "kb", descriptor = "[Lrd;")
    private class552[] field4025;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "(I)Lza;")
    public final class257 method1539(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "(IIIIII)V")
    private final void method1847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field3998) {
            var7 = this.field3998;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field4006) {
            var8 = this.field4006;
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
                if (var65 < this.field4020) {
                    var65 = this.field4020;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field4012) {
                    var66 = this.field4012;
                }
                int var67 = this.field4014 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field4032[var67]) {
                        this.field4024[var67] = arg4;
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
                if (var61 < this.field4020) {
                    var61 = this.field4020;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field4012 - 1) {
                    var62 = this.field4012 - 1;
                }
                int var63 = this.field4014 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field4032[var63]) {
                        this.field4024[var63] = arg4;
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
                if (var29 < this.field4020) {
                    var29 = this.field4020;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field4012) {
                    var30 = this.field4012;
                }
                int var31 = this.field4014 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field4032[var31]) {
                        int var33 = this.field4024[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field4024[var31] = var16 + var34;
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
                if (var23 < this.field4020) {
                    var23 = this.field4020;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field4012 - 1) {
                    var24 = this.field4012 - 1;
                }
                int var25 = this.field4014 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field4032[var25]) {
                        int var27 = this.field4024[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field4024[var25] = var16 + var28;
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
                if (var48 < this.field4020) {
                    var48 = this.field4020;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field4012) {
                    var49 = this.field4012;
                }
                int var50 = this.field4014 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field4032[var50]) {
                        int var52 = this.field4024[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field4024[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field4020) {
                    var40 = this.field4020;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field4012 - 1) {
                    var41 = this.field4012 - 1;
                }
                int var42 = this.field4014 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field4032[var42]) {
                        int var44 = this.field4024[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field4024[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1533(Canvas arg0, int arg1, int arg2) {
        class349 var4 = (class349) this.field3989.method812(119, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method549(6410);
            class349 var5 = class718.method4025(arg0, arg1, arg2, 21739);
            this.field3989.method820((long) arg0.hashCode(), (byte) -42, var5);
            if (this.field3987 == arg0 && this.field3996 == null) {
                Dimension var6 = arg0.getSize();
                this.field3991 = var6.width;
                this.field3990 = var6.height;
                this.field3986 = var5;
                this.field4024 = var5.field4956;
                this.field4014 = var5.field4958;
                this.field4001 = var5.field4954;
                if (this.field4031 != this.field4014 || this.field4029 != this.field4001) {
                    this.field4028 = this.field4031 = this.field4014;
                    this.field4017 = this.field4029 = this.field4001;
                    this.field4027 = this.field4032 = new float[this.field4031 * this.field4029];
                }
                this.method1858();
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ldi;)V")
    public final void method325(class5 arg0) {
        class273 var2 = (class273) arg0;
        this.field4014 = var2.field3962;
        this.field4001 = var2.field3956;
        this.field4024 = var2.field3963;
        this.field3996 = var2;
        this.field4031 = var2.field3962;
        this.field4029 = var2.field3956;
        this.field4032 = var2.field3958;
        this.method1858();
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(II)V")
    public final void method262(int arg0, int arg1) throws class692 {
        if (this.field3987 != null && this.field3986 != null) {
            try {
                Graphics var3 = this.field3987.getGraphics();
                this.field3986.method583(this.field3991, this.field3990, arg0, 79, 0, 0, var3, arg1);
            } catch (Exception var4) {
                this.field3987.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "()V")
    public final void method290() {
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
    public final void method310(int arg0) {
        int var2 = arg0 - this.field3992;
        for (Object var3 = this.field4008.method3904(-111); var3 != null; var3 = this.field4008.method3900(true)) {
            class296 var4 = (class296) var3;
            if (var4.field4221) {
                var4.field4225 += var2;
                int var5 = var4.field4225 / 20;
                if (var5 > 0) {
                    class239 var6 = super.field7623.method521(var4.field4224, 117);
                    var4.method1948(var6.field3579 * var2 * 50 / 1000, var6.field3573 * var2 * 50 / 1000);
                    var4.field4225 -= var5 * 20;
                }
                var4.field4221 = false;
            }
        }
        this.field3992 = arg0;
        this.field4023.method3896(1, 5);
        this.field4008.method3896(1, 5);
    }

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "(IIIIIII)I")
    public final int method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field3997.field4687 + (float) arg0 * this.field3997.field4676 + (float) arg1 * this.field3997.field4673 + this.field3997.field4677;
        float var9 = (float) arg5 * this.field3997.field4687 + (float) arg3 * this.field3997.field4676 + (float) arg4 * this.field3997.field4673 + this.field3997.field4677;
        int var10 = 0;
        if (var8 < (float) this.field4000 && var9 < (float) this.field4000) {
            var10 |= 16;
        } else if (var8 > (float) this.field4007 && var9 > (float) this.field4007) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3997.field4689 + (float) arg0 * this.field3997.field4683 + (float) arg1 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3997.field4689 + (float) arg3 * this.field3997.field4683 + (float) arg4 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / (float) arg6);
        if (var11 < this.field4021 && var12 < this.field4021) {
            var10 |= 1;
        } else if (var11 > this.field4003 && var12 > this.field4003) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3997.field4662 + (float) arg0 * this.field3997.field4664 + (float) arg1 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3997.field4662 + (float) arg3 * this.field3997.field4664 + (float) arg4 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / (float) arg6);
        if (var13 < this.field4022 && var14 < this.field4022) {
            var10 |= 4;
        } else if (var13 > this.field4010 && var14 > this.field4010) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)I")
    public final int method1484(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(I)[I")
    public final int[] method1848(int arg0) {
        class690 var2 = this.field4008;
        class296 var3;
        synchronized (this.field4008) {
            var3 = (class296) this.field4008.method3898((byte) -42, (long) arg0);
            if (var3 == null) {
                if (!super.field7623.method517(arg0, true)) {
                    return null;
                }
                class239 var5 = super.field7623.method521(arg0, 114);
                int var6 = !var5.field3556 && !this.field4015 ? this.field4026 : 64;
                var3 = new class296(arg0, var6, super.field7623.method519(-6839, arg0, 0.7F, var6, var6, true), var5.field3557 != 1);
                this.field4008.method3899(91, var3, (long) arg0);
            }
        }
        var3.field4221 = true;
        return var3.method1949();
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIF)Ltj;")
    public final class687 method1476(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fga", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field4014 * arg1 + arg0;
            int var15 = this.field4014 - arg2;
            if (arg1 + arg3 > this.field4006) {
                arg3 -= arg1 + arg3 - this.field4006;
            }
            if (arg1 < this.field3998) {
                int var16 = this.field3998 - arg1;
                arg3 -= var16;
                var14 += this.field4014 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field4012) {
                int var17 = arg0 + arg2 - this.field4012;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field4020) {
                int var18 = this.field4020 - arg0;
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
                            int var28 = this.field4024[var14];
                            this.field4024[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field4024[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field4024[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field4024[var14++] = arg5;
                        } else {
                            this.field4024[var14++] = arg4;
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

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIZ)Lfd;")
    public final class298 method1471(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class358(this, arg0, arg1) : new class716(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!fga", name = "y", descriptor = "()Z")
    public final boolean method1430() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "()Z")
    public final boolean method1387() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class276(Canvas arg0, class270 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method1535(arg0, arg2, arg3);
            this.method1451(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method3248((byte) -88);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fga", name = "w", descriptor = "()Z")
    public final boolean method1441() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "t", descriptor = "()V")
    public final void method278() {
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1535(Canvas arg0, int arg1, int arg2) {
        class349 var4 = (class349) this.field3989.method812(119, (long) arg0.hashCode());
        if (var4 == null) {
            class349 var5 = class718.method4025(arg0, arg1, arg2, 21739);
            this.field3989.method820((long) arg0.hashCode(), (byte) -42, var5);
        } else {
            if (var4.field4958 != arg1 || var4.field4954 != arg2) {
                this.method1533(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "()I")
    public final int method1481() {
        return 0;
    }

    @OriginalMember(owner = "client!fga", name = "XA", descriptor = "()I")
    public final int method1504() {
        return this.field4007;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1510(Canvas arg0) {
        if (this.field3987 == arg0) {
            this.method1451((Canvas) null);
        }
        class349 var2 = (class349) this.field3989.method812(102, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method549(6410);
        }
    }

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "(I)Z")
    public final boolean method1849(int arg0) {
        return super.field7623.method521(arg0, 124).field3569 || super.field7623.method521(arg0, 124).field3576;
    }

    @OriginalMember(owner = "client!fga", name = "pa", descriptor = "()V")
    public final void method1531() {
        for (int var1 = 0; var1 < this.field4025.length; ++var1) {
            this.field4025[var1].field7663 = this.field4025[var1].field7664;
            this.field4025[var1].field7667 = false;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lhe;)V")
    public final void method1391(class577 arg0) {
    }

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "(I)Z")
    public final boolean method1850(int arg0) {
        return super.field7623.method517(arg0, true);
    }

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "()Z")
    public final boolean method283() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "()Z")
    public final boolean method1472() {
        return true;
    }

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "(II)V")
    public final void method1511(int arg0, int arg1) {
        class552 var3 = this.method1859(Thread.currentThread());
        this.field4000 = arg0;
        this.field4007 = arg1;
        var3.field7670 = this.field4007 - 255;
    }

    @OriginalMember(owner = "client!fga", name = "A", descriptor = "()Z")
    public final boolean method1419() {
        return true;
    }

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "()Z")
    public final boolean method1490() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1451(Canvas arg0) {
        if (arg0 != null) {
            class349 var2 = (class349) this.field3989.method812(110, (long) arg0.hashCode());
            if (var2 != null) {
                this.field3987 = arg0;
                Dimension var3 = arg0.getSize();
                this.field3991 = var3.width;
                this.field3990 = var3.height;
                this.field3986 = var2;
                if (this.field3996 == null) {
                    this.field4024 = var2.field4956;
                    this.field4014 = var2.field4958;
                    this.field4001 = var2.field4954;
                    if (this.field4031 != this.field4014 || this.field4029 != this.field4001) {
                        this.field4028 = this.field4031 = this.field4014;
                        this.field4017 = this.field4029 = this.field4001;
                        this.field4027 = this.field4032 = new float[this.field4031 * this.field4029];
                    }
                    this.method1858();
                    return;
                }
            }
        } else {
            this.field3987 = null;
            this.field3986 = null;
            if (this.field3996 == null) {
                this.field4024 = null;
                this.field4014 = this.field4001 = 1;
                this.field4031 = this.field4029 = 1;
                this.method1858();
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "P", descriptor = "(IIIII)V")
    public final void method1427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field4020 && arg0 < this.field4012) {
            if (arg1 < this.field3998) {
                arg2 -= this.field3998 - arg1;
                arg1 = this.field3998;
            }
            if (arg1 + arg2 > this.field4006) {
                arg2 = this.field4006 - arg1;
            }
            int var6 = this.field4014 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4014 * var10 + var6;
                        int var12 = this.field4024[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field4024[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field4014 * var14 + var6;
                        int var16 = this.field4024[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field4024[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field4024[this.field4014 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "xa", descriptor = "(F)V")
    public final void method1457(float arg0) {
        this.field4011 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIII)V")
    public final void method284(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II[I[I)Laa;")
    public final class573 method1461(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class745(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "()V")
    private final void method1851() {
        this.field4021 = this.field4020 - this.field4004;
        this.field4003 = this.field4012 - this.field4004;
        this.field4022 = this.field3998 - this.field4016;
        this.field4010 = this.field4006 - this.field4016;
        for (int var1 = 0; var1 < this.field4002; ++var1) {
            class59 var5 = this.field4025[var1].field7679;
            var5.field838 = this.field4004 - this.field4020;
            var5.field842 = this.field4016 - this.field3998;
            var5.field845 = this.field4012 - this.field4020;
            var5.field841 = this.field4006 - this.field3998;
        }
        int var2 = this.field4014 * this.field3998 + this.field4020;
        for (int var3 = this.field3998; var3 < this.field4006; ++var3) {
            for (int var4 = 0; var4 < this.field4002; ++var4) {
                this.field4025[var4].field7679.field837[var3 - this.field3998] = var2;
            }
            var2 += this.field4014;
        }
    }

    @OriginalMember(owner = "client!fga", name = "aa", descriptor = "(IIIIII)V")
    public final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field4020) {
            arg2 -= this.field4020 - arg0;
            arg0 = this.field4020;
        }
        if (arg1 < this.field3998) {
            arg3 -= this.field3998 - arg1;
            arg1 = this.field3998;
        }
        if (arg0 + arg2 > this.field4012) {
            arg2 = this.field4012 - arg0;
        }
        if (arg1 + arg3 > this.field4006) {
            arg3 = this.field4006 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field4012 && arg1 <= this.field4006) {
            int var7 = this.field4014 - arg2;
            int var8 = this.field4014 * arg1 + arg0;
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
                            this.field4024[var24] = arg4;
                            ++var24;
                            this.field4024[var24] = arg4;
                            ++var24;
                            this.field4024[var24] = arg4;
                            ++var24;
                            this.field4024[var24] = arg4;
                            ++var24;
                            this.field4024[var24] = arg4;
                            ++var24;
                            this.field4024[var24] = arg4;
                            ++var24;
                            this.field4024[var24] = arg4;
                            ++var24;
                            this.field4024[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field4024[var24] = arg4;
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
                        int var14 = this.field4024[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field4024[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field4024[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field4024[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "H", descriptor = "(III[I)V")
    public final void method1424(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3997.field4687 + (float) arg0 * this.field3997.field4676 + (float) arg1 * this.field3997.field4673 + this.field3997.field4677;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field3997.field4689 + (float) arg0 * this.field3997.field4683 + (float) arg1 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / var5);
            int var7 = (int) (((float) arg2 * this.field3997.field4662 + (float) arg0 * this.field3997.field4664 + (float) arg1 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / var5);
            arg3[0] = var6 - this.field4021;
            arg3[1] = var7 - this.field4022;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!fga", name = "U", descriptor = "(IIIII)V")
    public final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field3998 && arg1 < this.field4006) {
            if (arg0 < this.field4020) {
                arg2 -= this.field4020 - arg0;
                arg0 = this.field4020;
            }
            if (arg0 + arg2 > this.field4012) {
                arg2 = this.field4012 - arg0;
            }
            int var6 = this.field4014 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4024[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field4024[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field4024[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field4024[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field4024[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "(I)V")
    public final void method1521(int arg0) {
        this.field4002 = arg0;
        this.field4025 = new class552[this.field4002];
        for (int var2 = 0; var2 < this.field4002; ++var2) {
            this.field4025[var2] = new class552(this);
        }
    }

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "()Z")
    public final boolean method1446() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "(IIIIII)V")
    public final void method1534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1487(arg0, arg1, arg2, arg4, arg5);
        this.method1487(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1427(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1427(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!fga", name = "la", descriptor = "()V")
    public final void method1437() {
        this.field4020 = 0;
        this.field3998 = 0;
        this.field4012 = this.field4014;
        this.field4006 = this.field4001;
        this.method1851();
    }

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "(I)V")
    public final void method1398(int arg0) {
        this.field4026 = arg0;
        this.field4008.method3906(-99);
    }

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "(II)Llh;")
    public final class208 method317(int arg0, int arg1) {
        return new class510(arg0, arg1);
    }

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "(I)I")
    public final int method1852(int arg0) {
        return super.field7623.method521(arg0, 110).field3566 & 65535;
    }

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "()I")
    public final int method277() {
        int var1 = this.field3995;
        this.field3995 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lih;)V")
    public final void method1444(class744 arg0) {
        this.field3997 = (class330) arg0;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(FFF)V")
    public final void method306(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!fga", name = "X", descriptor = "(I)V")
    public final void method1399(int arg0) {
    }

    @OriginalMember(owner = "client!fga", name = "A", descriptor = "(ILaa;II)V")
    public final void method1402(int arg0, class573 arg1, int arg2, int arg3) {
        class745 var5 = (class745) arg1;
        int[] var6 = var5.field10237;
        int[] var7 = var5.field10241;
        int var8;
        if (this.field4006 < var6.length + arg3) {
            var8 = this.field4006 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field3998 > arg3) {
            var9 = this.field3998 - arg3;
            arg3 = this.field3998;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field4014 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field4020 > var12) {
                    var13 -= this.field4020 - var12;
                    var12 = this.field4020;
                }
                if (this.field4012 < var12 + var13) {
                    var13 = this.field4012 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field4024[var14++] = arg0;
                }
                var10 += this.field4014;
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "(I)V")
    public final void method1492(int arg0) {
        this.field4025[arg0].method3268(-1, (Runnable) null);
    }

    @OriginalMember(owner = "client!fga", name = "ya", descriptor = "()V")
    public final void method346() {
        if (this.field4020 == 0 && this.field4014 == this.field4012 && this.field3998 == 0 && this.field4006 == this.field4001) {
            int var1 = this.field4032.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field4032[var3++] = 2.1474836E9F;
                this.field4032[var3++] = 2.1474836E9F;
                this.field4032[var3++] = 2.1474836E9F;
                this.field4032[var3++] = 2.1474836E9F;
                this.field4032[var3++] = 2.1474836E9F;
                this.field4032[var3++] = 2.1474836E9F;
                this.field4032[var3++] = 2.1474836E9F;
                this.field4032[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field4032[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field4012 - this.field4020;
            int var5 = this.field4006 - this.field3998;
            int var6 = this.field4014 - var4;
            int var7 = this.field4014 * this.field3998 + this.field4020;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field4032[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "(I)[I")
    public final int[] method1853(int arg0) {
        class690 var2 = this.field4008;
        class296 var3;
        synchronized (this.field4008) {
            var3 = (class296) this.field4008.method3898((byte) -42, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field7623.method517(arg0, true)) {
                    return null;
                }
                class239 var5 = super.field7623.method521(arg0, 107);
                int var6 = !var5.field3556 && !this.field4015 ? this.field4026 : 64;
                var3 = new class296(arg0, var6, super.field7623.method520(var6, (byte) 122, var6, true, arg0, 0.7F), var5.field3557 != 1);
                this.field4008.method3899(91, var3, (long) arg0 | Long.MIN_VALUE);
            }
        }
        var3.field4221 = true;
        return var3.method1949();
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8) {
        class745 var10 = (class745) arg6;
        int[] var11 = var10.field10237;
        int[] var12 = var10.field10241;
        int var13 = this.field3998 > arg8 ? this.field3998 : arg8;
        int var14 = this.field4006 < var11.length + arg8 ? this.field4006 : var11.length + arg8;
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
            if (arg0 < this.field4020) {
                var18 += (this.field4020 - arg0) * var20;
                arg0 = this.field4020;
            }
            if (var21 >= this.field4012) {
                var21 = this.field4012 - 1;
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
                                int var28 = this.field4014 * var25 + arg0;
                                int var29 = this.field4024[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field4024[var28] = var23 + var30;
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
                                int var34 = this.field4014 * var31 + arg0;
                                int var35 = this.field4024[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field4024[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field4024[this.field4014 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field4020 && var64 < this.field4012 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field4024[this.field4014 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field4020 && var50 < this.field4012 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field4014 * arg1 + var50;
                        int var54 = this.field4024[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field4024[this.field4014 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field4020 && var56 < this.field4012 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field4014 * arg1 + var56;
                        int var60 = this.field4024[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field4024[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "()Z")
    public final boolean method1389() {
        return true;
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
    public final void method1445(int arg0) {
        class351.field5018 = arg0;
        class351.field5056 = arg0;
        if (this.field4002 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method1521(this.field4002);
            this.method1540(0);
        }
    }

    @OriginalMember(owner = "client!fga", name = "KA", descriptor = "(IIII)V")
    public final void method1544(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field4014) {
            arg2 = this.field4014;
        }
        if (arg3 > this.field4001) {
            arg3 = this.field4001;
        }
        this.field4020 = arg0;
        this.field4012 = arg2;
        this.field3998 = arg1;
        this.field4006 = arg3;
        this.method1851();
    }

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "(I)Z")
    public final boolean method1854(int arg0) {
        return this.field4015 || super.field7623.method521(arg0, 119).field3556;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field7623.method521(arg6, 115).field3562) {
                if (this.field4034 != arg6) {
                    class298 var11 = (class298) this.field4023.method3898((byte) -42, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1853(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1854(arg6) ? 64 : this.field4026;
                        var11 = this.method3244(var13, var12, (byte) -108, var13, 0, var13);
                        this.field4023.method3899(73, var11, (long) arg6);
                    }
                    this.field4034 = arg6;
                    this.field4033 = var11;
                }
                ((class631) this.field4033).method1011(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1847(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "(I)I")
    public final int method1856(int arg0) {
        return super.field7623.method521(arg0, 107).field3557;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIII)V")
    private final void method1857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field4020 && arg0 < this.field4012) {
            int var9 = this.field4014 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field3998 && arg1 + var15 < this.field4006 && var12 < arg5) {
                            int var16 = this.field4014 * var15 + var9;
                            int var17 = this.field4024[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field4024[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field3998 && arg1 + var19 < this.field4006 && var12 < arg5) {
                            int var20 = this.field4014 * var19 + var9;
                            int var21 = this.field4024[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field4024[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field3998 && arg1 + var25 < this.field4006 && var12 < arg5) {
                        this.field4024[this.field4014 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "HA", descriptor = "(IIII[I)V")
    public final void method1475(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field3997.field4687 + (float) arg0 * this.field3997.field4676 + (float) arg1 * this.field3997.field4673 + this.field3997.field4677;
        if (!(var6 < (float) this.field4000) && !(var6 > (float) this.field4007)) {
            int var7 = (int) (((float) arg2 * this.field3997.field4689 + (float) arg0 * this.field3997.field4683 + (float) arg1 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field3997.field4662 + (float) arg0 * this.field3997.field4664 + (float) arg1 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / (float) arg3);
            if (var7 >= this.field4021 && var7 <= this.field4003 && var8 >= this.field4022 && var8 <= this.field4010) {
                arg4[0] = var7 - this.field4021;
                arg4[1] = var8 - this.field4022;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fga", name = "v", descriptor = "()Lih;")
    public final class744 method1495() {
        return new class330();
    }

    @OriginalMember(owner = "client!fga", name = "B", descriptor = "()V")
    private final void method1858() {
        for (int var1 = 0; var1 < this.field4002; ++var1) {
            this.field4025[var1].method3270(0);
        }
        this.method1437();
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lza;)V")
    public final void method1523(class257 arg0) {
    }

    @OriginalMember(owner = "client!fga", name = "E", descriptor = "()I")
    public final int method1509() {
        return 0;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lpw;Llh;)Ldi;")
    public final class5 method311(class106 arg0, class208 arg1) {
        return new class273(this, (class298) arg0, (class510) arg1);
    }

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "()V")
    public final void method1513() {
        this.field4008.method3906(-110);
        this.field4023.method3906(-127);
    }

    @OriginalMember(owner = "client!fga", name = "da", descriptor = "(III[I)V")
    public final void method1486(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3997.field4687 + (float) arg0 * this.field3997.field4676 + (float) arg1 * this.field3997.field4673 + this.field3997.field4677;
        if (!(var5 < (float) this.field4000) && !(var5 > (float) this.field4007)) {
            int var6 = (int) (((float) arg2 * this.field3997.field4689 + (float) arg0 * this.field3997.field4683 + (float) arg1 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / var5);
            int var7 = (int) (((float) arg2 * this.field3997.field4662 + (float) arg0 * this.field3997.field4664 + (float) arg1 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / var5);
            if (var6 >= this.field4021 && var6 <= this.field4003 && var7 >= this.field4022 && var7 <= this.field4010) {
                arg3[0] = var6 - this.field4021;
                arg3[1] = var7 - this.field4022;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Loia;Z)Lfd;")
    public final class298 method1496(class52 arg0, boolean arg1) {
        int[] var3 = arg0.field760;
        byte[] var4 = arg0.field763;
        int var5 = arg0.field767;
        int var6 = arg0.field766;
        class631 var11;
        if (arg1 && arg0.field759 == null) {
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
            var11 = new class163(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field759;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class358(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class716(this, var14, var5, var6);
            }
        }
        var11.method1953(arg0.field765, arg0.field761, arg0.field762, arg0.field764);
        return var11;
    }

    @OriginalMember(owner = "client!fga", name = "na", descriptor = "(IIII)[I")
    public final int[] method268(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field4014 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field4024[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "()V")
    public final void method312() {
        if (this.field3988) {
            class394.method2462(123, true, false);
            this.field3988 = false;
        }
        this.field3986 = null;
        this.field3987 = null;
        this.field3991 = 0;
        this.field3990 = 0;
        this.field3989 = null;
        this.field3993 = true;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lik;)V")
    public final void method1413(class100 arg0) {
        class552 var2 = this.method1859(Thread.currentThread());
        class61 var3 = arg0.field1384.field7000;
        for (class61 var4 = var3.field880; var3 != var4; var4 = var4.field880) {
            class421 var5 = (class421) var4;
            int var6 = var5.field5919 >> 12;
            int var7 = var5.field5926 >> 12;
            int var8 = var5.field5922 >> 12;
            float var9 = (float) var8 * this.field3997.field4687 + (float) var6 * this.field3997.field4676 + (float) var7 * this.field3997.field4673 + this.field3997.field4677;
            if (!(var9 < (float) this.field4000) && !(var9 > (float) var2.field7670)) {
                int var10 = (int) (((float) var8 * this.field3997.field4689 + (float) var6 * this.field3997.field4683 + (float) var7 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / var9) + this.field4004;
                int var11 = (int) (((float) var8 * this.field3997.field4662 + (float) var6 * this.field3997.field4664 + (float) var7 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / var9) + this.field4016;
                if (var10 >= this.field4020 && var10 <= this.field4012 && var11 >= this.field3998 && var11 <= this.field4006) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1862(var5, var10, var11, (int) var9, (int) ((float) (this.field4009 * var5.field5920 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "()Z")
    public final boolean method1469() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "Y", descriptor = "()[I")
    public final int[] method1407() {
        return new int[] { this.field4004, this.field4016, this.field4009, this.field4018 };
    }

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "()I")
    public final int method1426() {
        return this.field4000;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIZ)Lfd;")
    public final class298 method1514(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field4014 * arg1 + arg0;
        int var8 = this.field4014 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field4024[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class358(this, var6, arg2, arg3);
        } else {
            return new class716(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/lang/Runnable;)Lrd;")
    public final class552 method1859(Runnable arg0) {
        for (int var2 = 0; var2 < this.field4002; ++var2) {
            if (this.field4025[var2].field7660 == arg0) {
                return this.field4025[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fga", name = "za", descriptor = "(IIIII)V")
    public final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field3998) {
            var6 = this.field3998;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field4006) {
            var7 = this.field4006;
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
                if (var64 < this.field4020) {
                    var64 = this.field4020;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field4012) {
                    var65 = this.field4012;
                }
                int var66 = this.field4014 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field4024[var66++] = arg3;
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
                if (var60 < this.field4020) {
                    var60 = this.field4020;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field4012 - 1) {
                    var61 = this.field4012 - 1;
                }
                int var62 = this.field4014 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field4024[var62++] = arg3;
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
                if (var28 < this.field4020) {
                    var28 = this.field4020;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field4012) {
                    var29 = this.field4012;
                }
                int var30 = this.field4014 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field4024[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field4024[var30++] = var15 + var33;
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
                if (var22 < this.field4020) {
                    var22 = this.field4020;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field4012 - 1) {
                    var23 = this.field4012 - 1;
                }
                int var24 = this.field4014 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field4024[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field4024[var24++] = var15 + var27;
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
                if (var47 < this.field4020) {
                    var47 = this.field4020;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field4012) {
                    var48 = this.field4012;
                }
                int var49 = this.field4014 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field4024[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field4024[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field4020) {
                    var39 = this.field4020;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field4012 - 1) {
                    var40 = this.field4012 - 1;
                }
                int var41 = this.field4014 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field4024[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field4024[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "K", descriptor = "([I)V")
    public final void method1454(int[] arg0) {
        arg0[0] = this.field4020;
        arg0[1] = this.field3998;
        arg0[2] = this.field4012;
        arg0[3] = this.field4006;
    }

    @OriginalMember(owner = "client!fga", name = "T", descriptor = "(IIII)V")
    public final void method1415(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4020 < arg0) {
            this.field4020 = arg0;
        }
        if (this.field3998 < arg1) {
            this.field3998 = arg1;
        }
        if (this.field4012 > arg2) {
            this.field4012 = arg2;
        }
        if (this.field4006 > arg3) {
            this.field4006 = arg3;
        }
        this.method1851();
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(IIIIII)V")
    public final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1487(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1487(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1427(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1427(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field4020) {
                    var10 += (this.field4020 - arg0) * var12;
                    arg0 = this.field4020;
                }
                if (var13 >= this.field4012) {
                    var13 = this.field4012 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field3998 && var17 < this.field4006) {
                                int var18 = this.field4014 * var17 + arg0;
                                int var19 = this.field4024[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field4024[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field3998 && var21 < this.field4006) {
                                int var22 = this.field4014 * var21 + arg0;
                                int var23 = this.field4024[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field4024[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field3998 && var27 < this.field4006) {
                            this.field4024[this.field4014 * var27 + arg0] = arg4;
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
                if (arg1 < this.field3998) {
                    var29 += (this.field3998 - arg1) * var31;
                    arg1 = this.field3998;
                }
                if (var32 >= this.field4006) {
                    var32 = this.field4006 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field4020 && var46 < this.field4012) {
                            this.field4024[this.field4014 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field4020 && var36 < this.field4012) {
                            int var37 = this.field4014 * arg1 + var36;
                            int var38 = this.field4024[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field4024[this.field4014 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field4020 && var40 < this.field4012) {
                            int var41 = this.field4014 * arg1 + var40;
                            int var42 = this.field4024[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field4024[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method1861(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method1861(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method1857(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method1857(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field4020 && arg0 < this.field4012 && var37 >= this.field3998 && var37 < this.field4006 && var24 < var21) {
                                int var38 = this.field4014 * var37 + arg0;
                                int var39 = this.field4024[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field4024[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field4020 && arg0 < this.field4012 && var42 >= this.field3998 && var42 < this.field4006 && var24 < var21) {
                                int var43 = this.field4014 * var42 + arg0;
                                int var44 = this.field4024[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field4024[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field4020 && arg0 < this.field4012 && var49 >= this.field3998 && var49 < this.field4006 && var24 < var21) {
                            this.field4024[this.field4014 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field3998 && arg1 < this.field4006 && var60 >= this.field4020 && var60 < this.field4012 && var24 < var21) {
                                int var61 = this.field4014 * arg1 + var60;
                                int var62 = this.field4024[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field4024[this.field4014 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field3998 && arg1 < this.field4006 && var65 >= this.field4020 && var65 < this.field4012 && var24 < var21) {
                                int var66 = this.field4014 * arg1 + var65;
                                int var67 = this.field4024[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field4024[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field3998 && arg1 < this.field4006 && var72 >= this.field4020 && var72 < this.field4012 && var24 < var21) {
                            this.field4024[this.field4014 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lvo;IIII)Lka;")
    public final class284 method1463(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class351(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lhe;Lhe;FLhe;)Lhe;")
    public final class577 method260(class577 arg0, class577 arg1, float arg2, class577 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIII)V")
    public final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class552 var8 = this.method1859(Thread.currentThread());
        class59 var9 = var8.field7679;
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
            int var23 = arg0 - var9.method427();
            int var24 = arg1 - var9.method421();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field832 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field832 = 255 - (arg4 >>> 24);
            }
            this.method1529(false);
            var9.field831 = var25 < 0 || var25 > var9.field845 || var26 < 0 || var26 > var9.field845 || var27 < 0 || var27 > var9.field845;
            var9.method419((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field831 = var25 < 0 || var25 > var9.field845 || var27 < 0 || var27 > var9.field845 || var28 < 0 || var28 > var9.field845;
            var9.method419((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method1529(true);
        }
    }

    @OriginalMember(owner = "client!fga", name = "JA", descriptor = "(IIIIII)I")
    public final int method1548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field3997.field4687 + (float) arg0 * this.field3997.field4676 + (float) arg1 * this.field3997.field4673 + this.field3997.field4677;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3997.field4687 + (float) arg3 * this.field3997.field4676 + (float) arg4 * this.field3997.field4673 + this.field3997.field4677;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field4000 && var9 < (float) this.field4000) {
            var7 |= 16;
        } else if (var8 > (float) this.field4007 && var9 > (float) this.field4007) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3997.field4689 + (float) arg0 * this.field3997.field4683 + (float) arg1 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / var8);
        int var11 = (int) (((float) arg5 * this.field3997.field4689 + (float) arg3 * this.field3997.field4683 + (float) arg4 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / var9);
        if (var10 < this.field4021 && var11 < this.field4021) {
            var7 |= 1;
        } else if (var10 > this.field4003 && var11 > this.field4003) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3997.field4662 + (float) arg0 * this.field3997.field4664 + (float) arg1 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / var8);
        int var13 = (int) (((float) arg5 * this.field3997.field4662 + (float) arg3 * this.field3997.field4664 + (float) arg4 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / var9);
        if (var12 < this.field4022 && var13 < this.field4022) {
            var7 |= 4;
        } else if (var12 > this.field4010 && var13 > this.field4010) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "()Z")
    public final boolean method1860() {
        return this.field3993;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(IIIIIIII)V")
    private final void method1861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field3998 && arg1 < this.field4006) {
            int var9 = this.field4014 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field4020 && arg0 + var15 < this.field4012 && var12 < arg5) {
                            int var16 = this.field4024[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field4024[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field4020 && arg0 + var18 < this.field4012 && var12 < arg5) {
                            int var19 = this.field4024[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field4024[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field4020 && arg0 + var23 < this.field4012 && var12 < arg5) {
                        this.field4024[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(Z)V")
    public final void method1545(boolean arg0) {
        this.field4015 = arg0;
        this.field4008.method3906(-120);
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "()Z")
    public final boolean method289() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lik;I)V")
    public final void method1479(class100 arg0, int arg1) {
        class552 var3 = this.method1859(Thread.currentThread());
        class61 var4 = arg0.field1384.field7000;
        for (class61 var5 = var4.field880; var4 != var5; var5 = var5.field880) {
            class421 var6 = (class421) var5;
            int var7 = var6.field5919 >> 12;
            int var8 = var6.field5926 >> 12;
            int var9 = var6.field5922 >> 12;
            float var10 = (float) var9 * this.field3997.field4687 + (float) var7 * this.field3997.field4676 + (float) var8 * this.field3997.field4673 + this.field3997.field4677;
            if (!(var10 < (float) this.field4000) && !(var10 > (float) var3.field7670)) {
                int var11 = (int) (((float) var9 * this.field3997.field4689 + (float) var7 * this.field3997.field4683 + (float) var8 * this.field3997.field4691 + this.field3997.field4665) * (float) this.field4009 / (float) arg1) + this.field4004;
                int var12 = (int) (((float) var9 * this.field3997.field4662 + (float) var7 * this.field3997.field4664 + (float) var8 * this.field3997.field4694 + this.field3997.field4669) * (float) this.field4018 / (float) arg1) + this.field4016;
                if (var11 >= this.field4020 && var11 <= this.field4012 && var12 >= this.field3998 && var12 <= this.field4006) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1862(var6, var11, var12, (int) var10, (this.field4009 * var6.field5920 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "()V")
    public final void method315() {
    }

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "(Z)V")
    public final void method1529(boolean arg0) {
        class552 var2 = this.method1859(Thread.currentThread());
        var2.field7665 = arg0;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "([IIIIIZ)Lfd;")
    public final class298 method1549(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class358(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class716(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class358(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class716(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fga", name = "EA", descriptor = "(IIII)V")
    public final void method1501(int arg0, int arg1, int arg2, int arg3) {
        class552 var5 = this.method1859(Thread.currentThread());
        var5.field7673 = arg0;
        var5.field7663 = arg1;
        var5.field7669 = arg2;
    }

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(IIIIII)Lhe;")
    public final class577 method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Ld;)V")
    private class276(class270 arg0) {
        super(arg0);
        this.field3988 = false;
        this.field3993 = false;
        this.field3989 = new class130(4);
        this.field4000 = 50;
        this.field3995 = 0;
        this.field4005 = 0;
        this.field4020 = 0;
        this.field4011 = 75518;
        this.field3999 = 78642;
        this.field4026 = 128;
        this.field4006 = 0;
        this.field4007 = 3500;
        this.field4015 = false;
        this.field4018 = 512;
        this.field4030 = 45823;
        this.field4009 = 512;
        this.field3998 = 0;
        this.field4012 = 0;
        this.field4023 = new class690(16);
        this.field4034 = -1;
        try {
            this.field4008 = new class690(256);
            this.field3997 = new class330();
            this.method1521(1);
            this.method1540(0);
            class612.method3470(true, true, (byte) -119);
            this.field3988 = true;
            this.field3992 = (int) class97.method664((byte) -50);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method3248((byte) -88);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "(II)V")
    public final void method264(int arg0, int arg1) {
        int var3 = this.field4014 * arg1 + arg0;
        int var4 = this.field4031 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field4024;
            float[] var6 = this.field4032;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class245.method1647(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class245.method1647(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class245.method1651(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class245.method1651(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lej;[Loia;Z)Lda;")
    public final class402 method1392(class179 arg0, class52[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field767;
            var5[var7] = arg1[var7].field766;
            if (arg1[var7].field759 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class322(this, arg0, arg1, var4, var5);
            } else {
                return new class586(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class642(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "()Lih;")
    public final class744 method1404() {
        class552 var1 = this.method1859(Thread.currentThread());
        return var1.field7666;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
    public final void method1540(int arg0) {
        this.field4025[arg0].method3268(-1, Thread.currentThread());
    }

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(II)I")
    public final int method1390(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "([I)V")
    public final void method1483(int[] arg0) {
        arg0[0] = this.field4014;
        arg0[1] = this.field4001;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(II)Lpw;")
    public final class106 method299(int arg0, int arg1) {
        return this.method1471(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!fga", name = "x", descriptor = "()Lih;")
    public final class744 method1385() {
        return this.field3997;
    }

    @OriginalMember(owner = "client!fga", name = "GA", descriptor = "(I)V")
    public final void method273(int arg0) {
        this.method1412(0, 0, this.field4014, this.field4001, arg0, 0);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "()Z")
    public final boolean method1395() {
        return true;
    }

    @OriginalMember(owner = "client!fga", name = "DA", descriptor = "(IIII)V")
    public final void method1421(int arg0, int arg1, int arg2, int arg3) {
        this.field4004 = arg0;
        this.field4016 = arg1;
        this.field4009 = arg2;
        this.field4018 = arg3;
        this.method1851();
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class341 method1542(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class183(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "()Ler;")
    public final class299 method263() {
        return new class299(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class552 var14 = this.method1859(Thread.currentThread());
        class59 var15 = var14.field7679;
        var15.field846 = false;
        int var16 = arg0 - this.field4021;
        int var17 = arg3 - this.field4021;
        int var18 = arg6 - this.field4021;
        int var19 = arg1 - this.field4022;
        int var20 = arg4 - this.field4022;
        int var21 = arg7 - this.field4022;
        var15.field831 = var16 < 0 || var16 > var15.field845 || var17 < 0 || var17 > var15.field845 || var18 < 0 || var18 > var15.field845;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field832 = 255 - var22;
                var15.field835 = false;
                var15.method418((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field832 = 128;
                var15.field835 = true;
                var15.method418((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field832 = 0;
            var15.field835 = false;
            var15.method418((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field846 = true;
    }

    @OriginalMember(owner = "client!fga", name = "u", descriptor = "()V")
    public final void method302() {
        if (this.field3987 != null) {
            this.field4024 = this.field3986.field4956;
            this.field4014 = this.field3986.field4958;
            this.field4001 = this.field3986.field4954;
            this.field4032 = this.field4027;
            this.field4031 = this.field4028;
            this.field4029 = this.field4017;
        } else {
            this.field4014 = 1;
            this.field4001 = 1;
            this.field4024 = null;
            this.field4031 = 1;
            this.field4029 = 1;
            this.field4032 = null;
        }
        this.field3996 = null;
        this.method1858();
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class745 var13 = (class745) arg6;
        int[] var14 = var13.field10237;
        int[] var15 = var13.field10241;
        int var16 = this.field3998 > arg8 ? this.field3998 : arg8;
        int var17 = this.field4006 < var14.length + arg8 ? this.field4006 : var14.length + arg8;
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
                        if (arg0 >= this.field4020 && arg0 < this.field4012 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field4014 * var37 + arg0;
                                int var41 = this.field4024[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field4024[var40] = var35 + var42;
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
                        if (arg0 >= this.field4020 && arg0 < this.field4012 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field4014 * var44 + arg0;
                                int var48 = this.field4024[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field4024[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field4020 && arg0 < this.field4012 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field4024[this.field4014 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field4020 && var80 < this.field4012 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field4024[this.field4014 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field4020 && var66 < this.field4012 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field4014 * arg1 + var66;
                        int var69 = this.field4024[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field4024[this.field4014 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field4020 && var72 < this.field4012 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field4014 * arg1 + var72;
                        int var75 = this.field4024[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field4024[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!fga", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method1498(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field4030 = (int) (arg1 * 65535.0F);
        this.field3999 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field4019 = (int) (arg3 * 65535.0F / var7);
        this.field4013 = (int) (arg4 * 65535.0F / var7);
        this.field3994 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!fga", name = "ra", descriptor = "(IIII)V")
    public final void method1411(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4025.length; ++var5) {
            this.field4025[var5].field7664 = this.field4025[var5].field7663;
            this.field4025[var5].field7673 = arg0;
            this.field4025[var5].field7663 = arg1;
            this.field4025[var5].field7669 = arg2;
            this.field4025[var5].field7667 = true;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lgia;IIII)V")
    private final void method1862(class421 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field5924;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1847(arg1, arg2, arg3, arg4, arg0.field5921, 1);
        } else {
            if (this.field4034 != var6) {
                class298 var9 = (class298) this.field4023.method3898((byte) -42, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1853(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1854(var6) ? 64 : this.field4026;
                    var9 = this.method3244(var11, var10, (byte) -97, var11, 0, var11);
                    this.field4023.method3899(38, var9, (long) var6);
                }
                this.field4034 = var6;
                this.field4033 = var9;
            }
            ++var8;
            ((class631) this.field4033).method1011(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field5921, 1, 1);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)V")
    public final void method272(boolean arg0) {
    }

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "()V")
    public final void method281() {
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I[Ltj;)V")
    public final void method1532(int arg0, class687[] arg1) {
    }

    @OriginalMember(owner = "client!fga", name = "L", descriptor = "(III)V")
    public final void method1474(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4025.length; ++var4) {
            class552 var5 = this.field4025[var4];
            var5.field7663 = arg0 & 16777215;
            int var6 = var5.field7663 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7663 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7663 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7663 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7668 = false;
            } else {
                var5.field7668 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method282(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class692 {
        if (this.field3987 != null && this.field3986 != null) {
            try {
                Graphics var5 = this.field3987.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field4014 && var7.y + arg3 <= this.field4001 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field3986.method583(var7.width, var7.height, var7.x + arg2, 69, var7.y, var7.x, var5, var7.y + arg3);
                    }
                }
            } catch (Exception var8) {
                this.field3987.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(IIIID)V")
    public final void method308(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field4031 - arg2;
        int var8 = this.field4031 * arg1 + arg0;
        float[] var9 = this.field4032;
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

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "()Z")
    public final boolean method1447() {
        return false;
    }

    @OriginalMember(owner = "client!fga", name = "M", descriptor = "()I")
    public final int method1482() {
        int var1 = this.field4005;
        this.field4005 = 0;
        return var1;
    }
}
