import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class289 extends class59 {

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "Z")
    private boolean field4013;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "Z")
    private boolean field4014;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "Leq;")
    private class213 field4010;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "Z")
    private boolean field4032;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
    private int field4030;

    @OriginalMember(owner = "client!ao", name = "ib", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!ao", name = "kb", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!ao", name = "db", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!ao", name = "eb", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!ao", name = "hb", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!ao", name = "mb", descriptor = "I")
    private int field4048;

    @OriginalMember(owner = "client!ao", name = "bb", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!ao", name = "ob", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!ao", name = "gb", descriptor = "Ljr;")
    private class112 field4042;

    @OriginalMember(owner = "client!ao", name = "tb", descriptor = "I")
    private int field4055;

    @OriginalMember(owner = "client!ao", name = "fb", descriptor = "Ljr;")
    private class112 field4041;

    @OriginalMember(owner = "client!ao", name = "Z", descriptor = "Lgq;")
    public class515 field4035;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    private int field4009;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    private int field4008;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    private int field4015;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    private int field4024;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "I")
    private int field4029;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!ao", name = "ab", descriptor = "I")
    private int field4036;

    @OriginalMember(owner = "client!ao", name = "cb", descriptor = "I")
    private int field4038;

    @OriginalMember(owner = "client!ao", name = "lb", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!ao", name = "nb", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!ao", name = "pb", descriptor = "I")
    public int field4051;

    @OriginalMember(owner = "client!ao", name = "qb", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!ao", name = "rb", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!ao", name = "ub", descriptor = "Lmi;")
    private class496 field4056;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "Lpi;")
    public class498 field4012;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "Lit;")
    private class647 field4018;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4011;

    @OriginalMember(owner = "client!ao", name = "jb", descriptor = "[F")
    public float[] field4045;

    @OriginalMember(owner = "client!ao", name = "sb", descriptor = "[F")
    public float[] field4054;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "[I")
    public int[] field4026;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "[Lpga;")
    private class534[] field4023;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "()Z", line = 3)
    public final boolean method238() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "GA", descriptor = "(I)V", line = 6)
    public final void method220(int arg0) {
        this.method217(0, 0, this.field4020, this.field4029, arg0, 0);
    }

    @OriginalMember(owner = "client!ao", name = "na", descriptor = "(IIII)[I", line = 10)
    public final int[] method359(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field4020 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field4026[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V", line = 35)
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method226(arg0, arg1, arg2, arg4, arg5);
        this.method226(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method338(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method338(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ao", name = "pa", descriptor = "()V", line = 44)
    public final void method332() {
        for (int var1 = 0; var1 < this.field4023.length; ++var1) {
            this.field4023[var1].field7340 = this.field4023[var1].field7353;
            this.field4023[var1].field7343 = false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 55)
    public final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class301 var13 = (class301) arg6;
        int[] var14 = var13.field4196;
        int[] var15 = var13.field4197;
        int var16 = this.field4019 > arg8 ? this.field4019 : arg8;
        int var17 = this.field4046 < var14.length + arg8 ? this.field4046 : var14.length + arg8;
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
                        if (arg0 >= this.field4039 && arg0 < this.field4050 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field4020 * var37 + arg0;
                                int var41 = this.field4026[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field4026[var40] = var35 + var42;
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
                        if (arg0 >= this.field4039 && arg0 < this.field4050 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field4020 * var44 + arg0;
                                int var48 = this.field4026[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field4026[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field4039 && arg0 < this.field4050 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field4026[this.field4020 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field4039 && var80 < this.field4050 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field4026[this.field4020 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field4039 && var66 < this.field4050 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field4020 * arg1 + var66;
                        int var69 = this.field4026[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field4026[this.field4020 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field4039 && var72 < this.field4050 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field4020 * arg1 + var72;
                        int var75 = this.field4026[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field4026[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I)Laa;", line = 300)
    public final class487 method268(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class301(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lmda;I)V", line = 304)
    public final void method295(class266 arg0, int arg1) {
        class534 var3 = this.method1893(Thread.currentThread());
        class409 var4 = arg0.field3774.field7287;
        for (class409 var5 = var4.field5961; var4 != var5; var5 = var5.field5961) {
            class441 var6 = (class441) var5;
            int var7 = var6.field6271 >> 12;
            int var8 = var6.field6276 >> 12;
            int var9 = var6.field6269 >> 12;
            float var10 = (float) var9 * this.field4035.field7158 + (float) var7 * this.field4035.field7156 + (float) var8 * this.field4035.field7174 + this.field4035.field7175;
            if (!(var10 < (float) this.field4025) && !(var10 > (float) var3.field7358)) {
                int var11 = (int) (((float) var9 * this.field4035.field7163 + (float) var7 * this.field4035.field7166 + (float) var8 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / (float) arg1) + this.field4053;
                int var12 = (int) (((float) var9 * this.field4035.field7160 + (float) var7 * this.field4035.field7149 + (float) var8 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / (float) arg1) + this.field4047;
                if (var11 >= this.field4039 && var11 <= this.field4050 && var12 >= this.field4019 && var12 <= this.field4046) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1881(var6, var11, var12, (int) var10, (this.field4034 * var6.field6273 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[Lab;)V", line = 341)
    public final void method329(int arg0, class669[] arg1) {
    }

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "()Z", line = 344)
    public final boolean method310() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "()V", line = 346)
    public final void method257() {
    }

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "(IIIII)V", line = 351)
    public final void method338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field4039 && arg0 < this.field4050) {
            if (arg1 < this.field4019) {
                arg2 -= this.field4019 - arg1;
                arg1 = this.field4019;
            }
            if (arg1 + arg2 > this.field4046) {
                arg2 = this.field4046 - arg1;
            }
            int var6 = this.field4020 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4020 * var10 + var6;
                        int var12 = this.field4026[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field4026[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field4020 * var14 + var6;
                        int var16 = this.field4026[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field4026[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field4026[this.field4020 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V", line = 426)
    public final void method325(boolean arg0) {
    }

    @OriginalMember(owner = "client!ao", name = "xa", descriptor = "(F)V", line = 429)
    public final void method228(float arg0) {
        this.field4043 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ao", name = "ra", descriptor = "(IIII)V", line = 434)
    public final void method277(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4023.length; ++var5) {
            this.field4023[var5].field7353 = this.field4023[var5].field7340;
            this.field4023[var5].field7359 = arg0;
            this.field4023[var5].field7340 = arg1;
            this.field4023[var5].field7345 = arg2;
            this.field4023[var5].field7343 = true;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lza;)V", line = 446)
    public final void method270(class415 arg0) {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljc;IIII)V", line = 450)
    private final void method1881(class441 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field6272;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1892(arg1, arg2, arg3, arg4, arg0.field6270, 1);
        } else {
            if (this.field4055 != var6) {
                class496 var9 = (class496) this.field4042.method992((long) var6, 117);
                if (var9 == null) {
                    int[] var10 = this.method1888(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method1896(var6) ? 64 : this.field4044;
                    var9 = this.method621(var11, var10, (byte) 94, 0, var11, var11);
                    this.field4042.method991(var9, (long) var6, (byte) -121);
                }
                this.field4055 = var6;
                this.field4056 = var9;
            }
            ++var8;
            ((class592) this.field4056).method1195(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field6270, 1, 1);
        }
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "()V", line = 488)
    private final void method1882() {
        this.field4052 = this.field4039 - this.field4053;
        this.field4051 = this.field4050 - this.field4053;
        this.field4033 = this.field4019 - this.field4047;
        this.field4049 = this.field4046 - this.field4047;
        for (int var1 = 0; var1 < this.field4028; ++var1) {
            class758 var5 = this.field4023[var1].field7368;
            var5.field10563 = this.field4053 - this.field4039;
            var5.field10566 = this.field4047 - this.field4019;
            var5.field10577 = this.field4050 - this.field4039;
            var5.field10570 = this.field4046 - this.field4019;
        }
        int var2 = this.field4020 * this.field4019 + this.field4039;
        for (int var3 = this.field4019; var3 < this.field4046; ++var3) {
            for (int var4 = 0; var4 < this.field4028; ++var4) {
                this.field4023[var4].field7368.field10574[var3 - this.field4019] = var2;
            }
            var2 += this.field4020;
        }
    }

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "()I", line = 526)
    public final int method323() {
        return this.field4025;
    }

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "()Lbca;", line = 530)
    public final class661 method322() {
        class534 var1 = this.method1893(Thread.currentThread());
        return var1.field7357;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)Z", line = 534)
    public final boolean method1883(int arg0) {
        return super.field1170.method1180(arg0, -6662).field9959 || super.field1170.method1180(arg0, -6662).field9957;
    }

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "(IIIIII[BII)V", line = 537)
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field4020 * arg1 + arg0;
            int var15 = this.field4020 - arg2;
            if (arg1 + arg3 > this.field4046) {
                arg3 -= arg1 + arg3 - this.field4046;
            }
            if (arg1 < this.field4019) {
                int var16 = this.field4019 - arg1;
                arg3 -= var16;
                var14 += this.field4020 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field4050) {
                int var17 = arg0 + arg2 - this.field4050;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field4039) {
                int var18 = this.field4039 - arg0;
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
                            int var28 = this.field4026[var14];
                            this.field4026[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field4026[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field4026[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field4026[var14++] = arg5;
                        } else {
                            this.field4026[var14++] = arg4;
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

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "()Z", line = 712)
    public final boolean method199() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIIIII)Lwh;", line = 715)
    public final class149 method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "KA", descriptor = "(IIII)V", line = 718)
    public final void method303(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field4020) {
            arg2 = this.field4020;
        }
        if (arg3 > this.field4029) {
            arg3 = this.field4029;
        }
        this.field4039 = arg0;
        this.field4050 = arg2;
        this.field4019 = arg1;
        this.field4046 = arg3;
        this.method1882();
    }

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "()V", line = 736)
    public final void method337() {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lbca;)V", line = 739)
    public final void method210(class661 arg0) {
        this.field4035 = (class515) arg0;
    }

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "(ILaa;II)V", line = 743)
    public final void method271(int arg0, class487 arg1, int arg2, int arg3) {
        class301 var5 = (class301) arg1;
        int[] var6 = var5.field4196;
        int[] var7 = var5.field4197;
        int var8;
        if (this.field4046 < var6.length + arg3) {
            var8 = this.field4046 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field4019 > arg3) {
            var9 = this.field4019 - arg3;
            arg3 = this.field4019;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field4020 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field4039 > var12) {
                    var13 -= this.field4039 - var12;
                    var12 = this.field4039;
                }
                if (this.field4050 < var12 + var13) {
                    var13 = this.field4050 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field4026[var14++] = arg0;
                }
                var10 += this.field4020;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(II)I", line = 800)
    public final int method343(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(II)V", line = 805)
    public final void method349(int arg0, int arg1) {
        class534 var3 = this.method1893(Thread.currentThread());
        this.field4025 = arg0;
        this.field4037 = arg1;
        var3.field7358 = this.field4037 - 255;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)V", line = 811)
    private final void method1884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field4019 && arg1 < this.field4046) {
            int var9 = this.field4020 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field4039 && arg0 + var15 < this.field4050 && var12 < arg5) {
                            int var16 = this.field4026[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field4026[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field4039 && arg0 + var18 < this.field4050 && var12 < arg5) {
                            int var19 = this.field4026[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field4026[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field4039 && arg0 + var23 < this.field4050 && var12 < arg5) {
                        this.field4026[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "()[I", line = 890)
    public final int[] method188() {
        return new int[] { this.field4053, this.field4047, this.field4034, this.field4040 };
    }

    @OriginalMember(owner = "client!ao", name = "ya", descriptor = "()V", line = 893)
    public final void method324() {
        if (this.field4039 == 0 && this.field4050 == this.field4020 && this.field4019 == 0 && this.field4046 == this.field4029) {
            int var1 = this.field4054.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field4054[var3++] = 2.1474836E9F;
                this.field4054[var3++] = 2.1474836E9F;
                this.field4054[var3++] = 2.1474836E9F;
                this.field4054[var3++] = 2.1474836E9F;
                this.field4054[var3++] = 2.1474836E9F;
                this.field4054[var3++] = 2.1474836E9F;
                this.field4054[var3++] = 2.1474836E9F;
                this.field4054[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field4054[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field4050 - this.field4039;
            int var5 = this.field4046 - this.field4019;
            int var6 = this.field4020 - var4;
            int var7 = this.field4020 * this.field4019 + this.field4039;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field4054[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()Z", line = 976)
    public final boolean method327() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "(IIIII)V", line = 979)
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field4019 && arg1 < this.field4046) {
            if (arg0 < this.field4039) {
                arg2 -= this.field4039 - arg0;
                arg0 = this.field4039;
            }
            if (arg0 + arg2 > this.field4050) {
                arg2 = this.field4050 - arg0;
            }
            int var6 = this.field4020 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4026[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field4026[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field4026[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field4026[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field4026[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "HA", descriptor = "(IIII[I)V", line = 1052)
    public final void method195(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field4035.field7158 + (float) arg0 * this.field4035.field7156 + (float) arg1 * this.field4035.field7174 + this.field4035.field7175;
        if (!(var6 < (float) this.field4025) && !(var6 > (float) this.field4037)) {
            int var7 = (int) (((float) arg2 * this.field4035.field7163 + (float) arg0 * this.field4035.field7166 + (float) arg1 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field4035.field7160 + (float) arg0 * this.field4035.field7149 + (float) arg1 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / (float) arg3);
            if (var7 >= this.field4052 && var7 <= this.field4051 && var8 >= this.field4033 && var8 <= this.field4049) {
                arg4[0] = var7 - this.field4052;
                arg4[1] = var8 - this.field4033;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "()Z", line = 1076)
    public final boolean method1885() {
        return this.field4013;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V", line = 1078)
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lmda;)V", line = 1082)
    public final void method208(class266 arg0) {
        class534 var2 = this.method1893(Thread.currentThread());
        class409 var3 = arg0.field3774.field7287;
        for (class409 var4 = var3.field5961; var3 != var4; var4 = var4.field5961) {
            class441 var5 = (class441) var4;
            int var6 = var5.field6271 >> 12;
            int var7 = var5.field6276 >> 12;
            int var8 = var5.field6269 >> 12;
            float var9 = (float) var8 * this.field4035.field7158 + (float) var6 * this.field4035.field7156 + (float) var7 * this.field4035.field7174 + this.field4035.field7175;
            if (!(var9 < (float) this.field4025) && !(var9 > (float) var2.field7358)) {
                int var10 = (int) (((float) var8 * this.field4035.field7163 + (float) var6 * this.field4035.field7166 + (float) var7 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / var9) + this.field4053;
                int var11 = (int) (((float) var8 * this.field4035.field7160 + (float) var6 * this.field4035.field7149 + (float) var7 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / var9) + this.field4047;
                if (var10 >= this.field4039 && var10 <= this.field4050 && var11 >= this.field4019 && var11 <= this.field4046) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1881(var5, var10, var11, (int) var9, (int) ((float) (this.field4034 * var5.field6273 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFF)V", line = 1119)
    public final void method244(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIZ)Lmi;", line = 1123)
    public final class496 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field4020 * arg1 + arg0;
        int var8 = this.field4020 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field4026[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class379(this, var6, arg2, arg3);
        } else {
            return new class188(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "()V", line = 1158)
    private final void method1886() {
        for (int var1 = 0; var1 < this.field4028; ++var1) {
            this.field4023[var1].method3074(64);
        }
        this.method305();
    }

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "()Z", line = 1166)
    public final boolean method263() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "()Z", line = 1169)
    public final boolean method247() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "DA", descriptor = "(IIII)V", line = 1172)
    public final void method179(int arg0, int arg1, int arg2, int arg3) {
        this.field4053 = arg0;
        this.field4047 = arg1;
        this.field4034 = arg2;
        this.field4040 = arg3;
        this.method1882();
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1180)
    public final void method245(Canvas arg0) {
        if (this.field4011 == arg0) {
            this.method341((Canvas) null);
        }
        class498 var2 = (class498) this.field4010.method1465((long) arg0.hashCode(), -6008);
        if (var2 != null) {
            var2.method2314((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "(III)V", line = 1192)
    public final void method172(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4023.length; ++var4) {
            class534 var5 = this.field4023[var4];
            var5.field7340 = arg0 & 16777215;
            int var6 = var5.field7340 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7340 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7340 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7340 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7349 = false;
            } else {
                var5.field7349 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()Z", line = 1224)
    public final boolean method204() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 1228)
    public final void method259(Canvas arg0, int arg1, int arg2) {
        class498 var4 = (class498) this.field4010.method1465((long) arg0.hashCode(), -6008);
        if (var4 == null) {
            class498 var5 = class145.method1143(9029, arg2, arg0, arg1);
            this.field4010.method1468((byte) 21, (long) arg0.hashCode(), var5);
        } else {
            if (var4.field6960 != arg1 || var4.field6963 != arg2) {
                this.method280(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIID)V", line = 1242)
    public final void method235(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field4038 - arg2;
        int var8 = this.field4038 * arg1 + arg0;
        float[] var9 = this.field4054;
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

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()V", line = 1269)
    public final void method355() {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 1272)
    public final void method352(int arg0) {
        this.field4028 = arg0;
        this.field4023 = new class534[this.field4028];
        for (int var2 = 0; var2 < this.field4028; ++var2) {
            this.field4023[var2] = new class534(this);
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(IIIIII)V", line = 1285)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method226(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method226(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method338(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method338(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field4039) {
                    var10 += (this.field4039 - arg0) * var12;
                    arg0 = this.field4039;
                }
                if (var13 >= this.field4050) {
                    var13 = this.field4050 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field4019 && var17 < this.field4046) {
                                int var18 = this.field4020 * var17 + arg0;
                                int var19 = this.field4026[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field4026[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field4019 && var21 < this.field4046) {
                                int var22 = this.field4020 * var21 + arg0;
                                int var23 = this.field4026[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field4026[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field4019 && var27 < this.field4046) {
                            this.field4026[this.field4020 * var27 + arg0] = arg4;
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
                if (arg1 < this.field4019) {
                    var29 += (this.field4019 - arg1) * var31;
                    arg1 = this.field4019;
                }
                if (var32 >= this.field4046) {
                    var32 = this.field4046 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field4039 && var46 < this.field4050) {
                            this.field4026[this.field4020 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field4039 && var36 < this.field4050) {
                            int var37 = this.field4020 * arg1 + var36;
                            int var38 = this.field4026[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field4026[this.field4020 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field4039 && var40 < this.field4050) {
                            int var41 = this.field4020 * arg1 + var40;
                            int var42 = this.field4026[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field4026[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1499)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class534 var14 = this.method1893(Thread.currentThread());
        class758 var15 = var14.field7368;
        var15.field10567 = false;
        int var16 = arg0 - this.field4052;
        int var17 = arg3 - this.field4052;
        int var18 = arg6 - this.field4052;
        int var19 = arg1 - this.field4033;
        int var20 = arg4 - this.field4033;
        int var21 = arg7 - this.field4033;
        var15.field10569 = var16 < 0 || var16 > var15.field10577 || var17 < 0 || var17 > var15.field10577 || var18 < 0 || var18 > var15.field10577;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field10572 = 255 - var22;
                var15.field10565 = false;
                var15.method4234((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field10572 = 128;
                var15.field10565 = true;
                var15.method4234((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field10572 = 0;
            var15.field10565 = false;
            var15.method4234((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field10567 = true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Loea;[Lrh;Z)Lda;", line = 1542)
    public final class60 method216(class597 arg0, class267[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field3784;
            var5[var7] = arg1[var7].field3778;
            if (arg1[var7].field3777 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class595(this, arg0, arg1, var4, var5);
            } else {
                return new class658(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class193(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lhe;Lvm;)Lis;", line = 1580)
    public final class503 method319(class372 arg0, class686 arg1) {
        return new class647(this, (class496) arg0, (class194) arg1);
    }

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "(Z)V", line = 1584)
    public final void method306(boolean arg0) {
        class534 var2 = this.method1893(Thread.currentThread());
        var2.field7350 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIILaa;II)V", line = 1589)
    public final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        class301 var10 = (class301) arg6;
        int[] var11 = var10.field4196;
        int[] var12 = var10.field4197;
        int var13 = this.field4019 > arg8 ? this.field4019 : arg8;
        int var14 = this.field4046 < var11.length + arg8 ? this.field4046 : var11.length + arg8;
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
            if (arg0 < this.field4039) {
                var18 += (this.field4039 - arg0) * var20;
                arg0 = this.field4039;
            }
            if (var21 >= this.field4050) {
                var21 = this.field4050 - 1;
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
                                int var28 = this.field4020 * var25 + arg0;
                                int var29 = this.field4026[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field4026[var28] = var23 + var30;
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
                                int var34 = this.field4020 * var31 + arg0;
                                int var35 = this.field4026[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field4026[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field4026[this.field4020 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field4039 && var64 < this.field4050 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field4026[this.field4020 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field4039 && var50 < this.field4050 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field4020 * arg1 + var50;
                        int var54 = this.field4026[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field4026[this.field4020 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field4039 && var56 < this.field4050 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field4020 * arg1 + var56;
                        int var60 = this.field4026[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field4026[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "XA", descriptor = "()I", line = 1827)
    public final int method186() {
        return this.field4037;
    }

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "(IIII)V", line = 1830)
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4039 < arg0) {
            this.field4039 = arg0;
        }
        if (this.field4019 < arg1) {
            this.field4019 = arg1;
        }
        if (this.field4050 > arg2) {
            this.field4050 = arg2;
        }
        if (this.field4046 > arg3) {
            this.field4046 = arg3;
        }
        this.method1882();
    }

    @OriginalMember(owner = "client!ao", name = "aa", descriptor = "(IIIIII)V", line = 1845)
    public final void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field4039) {
            arg2 -= this.field4039 - arg0;
            arg0 = this.field4039;
        }
        if (arg1 < this.field4019) {
            arg3 -= this.field4019 - arg1;
            arg1 = this.field4019;
        }
        if (arg0 + arg2 > this.field4050) {
            arg2 = this.field4050 - arg0;
        }
        if (arg1 + arg3 > this.field4046) {
            arg3 = this.field4046 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field4050 && arg1 <= this.field4046) {
            int var7 = this.field4020 - arg2;
            int var8 = this.field4020 * arg1 + arg0;
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
                            this.field4026[var24] = arg4;
                            ++var24;
                            this.field4026[var24] = arg4;
                            ++var24;
                            this.field4026[var24] = arg4;
                            ++var24;
                            this.field4026[var24] = arg4;
                            ++var24;
                            this.field4026[var24] = arg4;
                            ++var24;
                            this.field4026[var24] = arg4;
                            ++var24;
                            this.field4026[var24] = arg4;
                            ++var24;
                            this.field4026[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field4026[var24] = arg4;
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
                        int var14 = this.field4026[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field4026[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field4026[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field4026[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "(I)[I", line = 1981)
    public final int[] method1887(int arg0) {
        class112 var2 = this.field4041;
        class150 var3;
        synchronized (this.field4041) {
            var3 = (class150) this.field4041.method992((long) arg0, 77);
            if (var3 == null) {
                if (!super.field1170.method1181(-7953, arg0)) {
                    return null;
                }
                class739 var5 = super.field1170.method1180(arg0, -6662);
                int var6 = !var5.field9941 && !this.field4032 ? this.field4044 : 64;
                var3 = new class150(arg0, var6, super.field1170.method1182(true, arg0, 0.7F, var6, var6, 71), var5.field9942 != 1);
                this.field4041.method991(var3, (long) arg0, (byte) -122);
            }
        }
        var3.field2482 = true;
        return var3.method1177();
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "()V", line = 2004)
    public final void method251() {
        if (this.field4014) {
            class365.method2326(false, -101, true);
            this.field4014 = false;
        }
        this.field4012 = null;
        this.field4011 = null;
        this.field4008 = 0;
        this.field4015 = 0;
        this.field4010 = null;
        this.field4013 = true;
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()Lbca;", line = 2018)
    public final class661 method320() {
        return this.field4035;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 2021)
    public class289(Canvas arg0, class152 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method259(arg0, arg2, arg3);
            this.method341(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method614((byte) -115);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "(I)[I", line = 2033)
    public final int[] method1888(int arg0) {
        class112 var2 = this.field4041;
        class150 var3;
        synchronized (this.field4041) {
            var3 = (class150) this.field4041.method992((long) arg0 | Long.MIN_VALUE, 107);
            if (var3 == null) {
                if (!super.field1170.method1181(-7953, arg0)) {
                    return null;
                }
                class739 var5 = super.field1170.method1180(arg0, -6662);
                int var6 = !var5.field9941 && !this.field4032 ? this.field4044 : 64;
                var3 = new class150(arg0, var6, super.field1170.method1183(-21540, var6, 0.7F, arg0, true, var6), var5.field9942 != 1);
                this.field4041.method991(var3, (long) arg0 | Long.MIN_VALUE, (byte) -126);
            }
        }
        var3.field2482 = true;
        return var3.method1177();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2053)
    public final class281 method262(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class573(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "(III[I)V", line = 2057)
    public final void method289(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4035.field7158 + (float) arg0 * this.field4035.field7156 + (float) arg1 * this.field4035.field7174 + this.field4035.field7175;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field4035.field7163 + (float) arg0 * this.field4035.field7166 + (float) arg1 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / var5);
            int var7 = (int) (((float) arg2 * this.field4035.field7160 + (float) arg0 * this.field4035.field7149 + (float) arg1 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / var5);
            arg3[0] = var6 - this.field4052;
            arg3[1] = var7 - this.field4033;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "()Lbca;", line = 2073)
    public final class661 method290() {
        return new class515();
    }

    @OriginalMember(owner = "client!ao", name = "la", descriptor = "()V", line = 2076)
    public final void method305() {
        this.field4039 = 0;
        this.field4019 = 0;
        this.field4050 = this.field4020;
        this.field4046 = this.field4029;
        this.method1882();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lbh;IIII)Lka;", line = 2083)
    public final class472 method174(class37 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class714(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Lvm;", line = 2086)
    public final class686 method273(int arg0, int arg1) {
        return new class194(arg0, arg1);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([I)V", line = 2089)
    public final void method269(int[] arg0) {
        arg0[0] = this.field4020;
        arg0[1] = this.field4029;
    }

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "(II)V", line = 2094)
    public final void method301(int arg0, int arg1) {
        int var3 = this.field4020 * arg1 + arg0;
        int var4 = this.field4038 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field4026;
            float[] var6 = this.field4054;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class363.method2320(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class363.method2320(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class363.method2316(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class363.method2316(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lis;)V", line = 2137)
    public final void method302(class503 arg0) {
        class647 var2 = (class647) arg0;
        this.field4020 = var2.field8904;
        this.field4029 = var2.field8901;
        this.field4026 = var2.field8910;
        this.field4018 = var2;
        this.field4038 = var2.field8904;
        this.field4031 = var2.field8901;
        this.field4054 = var2.field8898;
        this.method1886();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIII)V", line = 2148)
    public final void method1889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field1170.method1180(arg6, -6662).field9951) {
                if (this.field4055 != arg6) {
                    class496 var11 = (class496) this.field4042.method992((long) arg6, 97);
                    if (var11 == null) {
                        int[] var12 = this.method1888(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method1896(arg6) ? 64 : this.field4044;
                        var11 = this.method621(var13, var12, (byte) 94, 0, var13, var13);
                        this.field4042.method991(var11, (long) arg6, (byte) -100);
                    }
                    this.field4055 = arg6;
                    this.field4056 = var11;
                }
                ((class592) this.field4056).method1195(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1892(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lwh;)V", line = 2180)
    public final void method177(class149 arg0) {
    }

    @OriginalMember(owner = "client!ao", name = "EA", descriptor = "(IIII)V", line = 2184)
    public final void method196(int arg0, int arg1, int arg2, int arg3) {
        class534 var5 = this.method1893(Thread.currentThread());
        var5.field7359 = arg0;
        var5.field7340 = arg1;
        var5.field7345 = arg2;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIIIII)V", line = 2192)
    private final void method1890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field4039 && arg0 < this.field4050) {
            int var9 = this.field4020 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field4019 && arg1 + var15 < this.field4046 && var12 < arg5) {
                            int var16 = this.field4020 * var15 + var9;
                            int var17 = this.field4026[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field4026[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field4019 && arg1 + var19 < this.field4046 && var12 < arg5) {
                            int var20 = this.field4020 * var19 + var9;
                            int var21 = this.field4026[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field4026[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field4019 && arg1 + var25 < this.field4046 && var12 < arg5) {
                        this.field4026[this.field4020 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2277)
    public final void method341(Canvas arg0) {
        if (arg0 != null) {
            class498 var2 = (class498) this.field4010.method1465((long) arg0.hashCode(), -6008);
            if (var2 != null) {
                this.field4011 = arg0;
                Dimension var3 = arg0.getSize();
                this.field4008 = var3.width;
                this.field4015 = var3.height;
                this.field4012 = var2;
                if (this.field4018 == null) {
                    this.field4026 = var2.field6959;
                    this.field4020 = var2.field6960;
                    this.field4029 = var2.field6963;
                    if (this.field4038 != this.field4020 || this.field4031 != this.field4029) {
                        this.field4024 = this.field4038 = this.field4020;
                        this.field4036 = this.field4031 = this.field4029;
                        this.field4045 = this.field4054 = new float[this.field4038 * this.field4031];
                    }
                    this.method1886();
                    return;
                }
            }
        } else {
            this.field4011 = null;
            this.field4012 = null;
            if (this.field4018 == null) {
                this.field4026 = null;
                this.field4020 = this.field4029 = 1;
                this.field4038 = this.field4031 = 1;
                this.method1886();
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "JA", descriptor = "(IIIIII)I", line = 2325)
    public final int method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field4035.field7158 + (float) arg0 * this.field4035.field7156 + (float) arg1 * this.field4035.field7174 + this.field4035.field7175;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field4035.field7158 + (float) arg3 * this.field4035.field7156 + (float) arg4 * this.field4035.field7174 + this.field4035.field7175;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field4025 && var9 < (float) this.field4025) {
            var7 |= 16;
        } else if (var8 > (float) this.field4037 && var9 > (float) this.field4037) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field4035.field7163 + (float) arg0 * this.field4035.field7166 + (float) arg1 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / var8);
        int var11 = (int) (((float) arg5 * this.field4035.field7163 + (float) arg3 * this.field4035.field7166 + (float) arg4 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / var9);
        if (var10 < this.field4052 && var11 < this.field4052) {
            var7 |= 1;
        } else if (var10 > this.field4051 && var11 > this.field4051) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field4035.field7160 + (float) arg0 * this.field4035.field7149 + (float) arg1 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / var8);
        int var13 = (int) (((float) arg5 * this.field4035.field7160 + (float) arg3 * this.field4035.field7149 + (float) arg4 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / var9);
        if (var12 < this.field4033 && var13 < this.field4033) {
            var7 |= 4;
        } else if (var12 > this.field4049 && var13 > this.field4049) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V", line = 2368)
    public final void method312(int arg0) {
        this.field4023[arg0].method3073(10000, (Runnable) null);
    }

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "()V", line = 2371)
    public final void method213() {
        if (this.field4011 != null) {
            this.field4026 = this.field4012.field6959;
            this.field4020 = this.field4012.field6960;
            this.field4029 = this.field4012.field6963;
            this.field4054 = this.field4045;
            this.field4038 = this.field4024;
            this.field4031 = this.field4036;
        } else {
            this.field4020 = 1;
            this.field4029 = 1;
            this.field4026 = null;
            this.field4038 = 1;
            this.field4031 = 1;
            this.field4054 = null;
        }
        this.field4018 = null;
        this.method1886();
    }

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "(I)I", line = 2394)
    public final int method1891(int arg0) {
        return super.field1170.method1180(arg0, -6662).field9950 & 65535;
    }

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "()Z", line = 2397)
    public final boolean method361() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "()Z", line = 2400)
    public final boolean method291() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIIIIZ)Lmi;", line = 2404)
    public final class496 method281(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class379(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class188(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class379(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class188(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lrh;Z)Lmi;", line = 2441)
    public final class496 method356(class267 arg0, boolean arg1) {
        int[] var3 = arg0.field3779;
        byte[] var4 = arg0.field3781;
        int var5 = arg0.field3784;
        int var6 = arg0.field3778;
        class592 var11;
        if (arg1 && arg0.field3777 == null) {
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
            var11 = new class156(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field3777;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class379(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class188(this, var14, var5, var6);
            }
        }
        var11.method1615(arg0.field3785, arg0.field3782, arg0.field3780, arg0.field3783);
        return var11;
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(IIIIII)V", line = 2544)
    private final void method1892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field4019) {
            var7 = this.field4019;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field4046) {
            var8 = this.field4046;
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
                if (var65 < this.field4039) {
                    var65 = this.field4039;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field4050) {
                    var66 = this.field4050;
                }
                int var67 = this.field4020 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field4054[var67]) {
                        this.field4026[var67] = arg4;
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
                if (var61 < this.field4039) {
                    var61 = this.field4039;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field4050 - 1) {
                    var62 = this.field4050 - 1;
                }
                int var63 = this.field4020 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field4054[var63]) {
                        this.field4026[var63] = arg4;
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
                if (var29 < this.field4039) {
                    var29 = this.field4039;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field4050) {
                    var30 = this.field4050;
                }
                int var31 = this.field4020 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field4054[var31]) {
                        int var33 = this.field4026[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field4026[var31] = var16 + var34;
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
                if (var23 < this.field4039) {
                    var23 = this.field4039;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field4050 - 1) {
                    var24 = this.field4050 - 1;
                }
                int var25 = this.field4020 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field4054[var25]) {
                        int var27 = this.field4026[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field4026[var25] = var16 + var28;
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
                if (var48 < this.field4039) {
                    var48 = this.field4039;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field4050) {
                    var49 = this.field4050;
                }
                int var50 = this.field4020 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field4054[var50]) {
                        int var52 = this.field4026[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field4026[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field4039) {
                    var40 = this.field4039;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field4050 - 1) {
                    var41 = this.field4050 - 1;
                }
                int var42 = this.field4020 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field4054[var42]) {
                        int var44 = this.field4026[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field4026[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V", line = 2861)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class534 var8 = this.method1893(Thread.currentThread());
        class758 var9 = var8.field7368;
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
            int var23 = arg0 - var9.method4235();
            int var24 = arg1 - var9.method4224();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field10572 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field10572 = 255 - (arg4 >>> 24);
            }
            this.method306(false);
            var9.field10569 = var25 < 0 || var25 > var9.field10577 || var26 < 0 || var26 > var9.field10577 || var27 < 0 || var27 > var9.field10577;
            var9.method4225((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field10569 = var25 < 0 || var25 > var9.field10577 || var27 < 0 || var27 > var9.field10577 || var28 < 0 || var28 > var9.field10577;
            var9.method4225((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method306(true);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZ)Lmi;", line = 2934)
    public final class496 method311(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class379(this, arg0, arg1) : new class188(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 2940)
    public final void method330(boolean arg0) {
        this.field4032 = arg0;
        this.field4041.method999(0);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V", line = 2944)
    public final void method221(int arg0) {
        class714.field9691 = arg0;
        class714.field9687 = arg0;
        if (this.field4028 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method352(this.field4028);
            this.method249(0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIF)Lab;", line = 2952)
    public final class669 method183(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "()Z", line = 2956)
    public final boolean method328() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lwh;Lwh;FLwh;)Lwh;", line = 2959)
    public final class149 method340(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "za", descriptor = "(IIIII)V", line = 2966)
    public final void method248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field4019) {
            var6 = this.field4019;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field4046) {
            var7 = this.field4046;
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
                if (var64 < this.field4039) {
                    var64 = this.field4039;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field4050) {
                    var65 = this.field4050;
                }
                int var66 = this.field4020 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field4026[var66++] = arg3;
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
                if (var60 < this.field4039) {
                    var60 = this.field4039;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field4050 - 1) {
                    var61 = this.field4050 - 1;
                }
                int var62 = this.field4020 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field4026[var62++] = arg3;
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
                if (var28 < this.field4039) {
                    var28 = this.field4039;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field4050) {
                    var29 = this.field4050;
                }
                int var30 = this.field4020 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field4026[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field4026[var30++] = var15 + var33;
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
                if (var22 < this.field4039) {
                    var22 = this.field4039;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field4050 - 1) {
                    var23 = this.field4050 - 1;
                }
                int var24 = this.field4020 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field4026[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field4026[var24++] = var15 + var27;
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
                if (var47 < this.field4039) {
                    var47 = this.field4039;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field4050) {
                    var48 = this.field4050;
                }
                int var49 = this.field4020 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field4026[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field4026[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field4039) {
                    var39 = this.field4039;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field4050 - 1) {
                    var40 = this.field4050 - 1;
                }
                int var41 = this.field4020 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field4026[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field4026[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/Runnable;)Lpga;", line = 3254)
    public final class534 method1893(Runnable arg0) {
        for (int var2 = 0; var2 < this.field4028; ++var2) {
            if (this.field4023[var2].field7346 == arg0) {
                return this.field4023[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "()I", line = 3266)
    public final int method339() {
        return 0;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V", line = 3269)
    public final void method348(int arg0, int arg1) throws class721 {
        if (this.field4011 != null && this.field4012 != null) {
            try {
                Graphics var3 = this.field4011.getGraphics();
                this.field4012.method1106(0, arg0, this.field4015, var3, -1, 0, this.field4008, arg1);
            } catch (Exception var4) {
                this.field4011.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ao", name = "ZA", descriptor = "(IFFFFF)V", line = 3285)
    public final void method218(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field4017 = (int) (arg1 * 65535.0F);
        this.field4021 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field4027 = (int) (arg3 * 65535.0F / var7);
        this.field4016 = (int) (arg4 * 65535.0F / var7);
        this.field4022 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V", line = 3294)
    public final void method227(int arg0) {
        this.field4044 = arg0;
        this.field4041.method999(0);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 3299)
    public final void method280(Canvas arg0, int arg1, int arg2) {
        class498 var4 = (class498) this.field4010.method1465((long) arg0.hashCode(), -6008);
        if (var4 != null) {
            var4.method2314((byte) 95);
            class498 var5 = class145.method1143(9029, arg2, arg0, arg1);
            this.field4010.method1468((byte) 112, (long) arg0.hashCode(), var5);
            if (this.field4011 == arg0 && this.field4018 == null) {
                Dimension var6 = arg0.getSize();
                this.field4008 = var6.width;
                this.field4015 = var6.height;
                this.field4012 = var5;
                this.field4026 = var5.field6959;
                this.field4020 = var5.field6960;
                this.field4029 = var5.field6963;
                if (this.field4038 != this.field4020 || this.field4031 != this.field4029) {
                    this.field4024 = this.field4038 = this.field4020;
                    this.field4036 = this.field4031 = this.field4029;
                    this.field4045 = this.field4054 = new float[this.field4038 * this.field4031];
                }
                this.method1886();
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "(IIIIIII)I", line = 3330)
    public final int method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field4035.field7158 + (float) arg0 * this.field4035.field7156 + (float) arg1 * this.field4035.field7174 + this.field4035.field7175;
        float var9 = (float) arg5 * this.field4035.field7158 + (float) arg3 * this.field4035.field7156 + (float) arg4 * this.field4035.field7174 + this.field4035.field7175;
        int var10 = 0;
        if (var8 < (float) this.field4025 && var9 < (float) this.field4025) {
            var10 |= 16;
        } else if (var8 > (float) this.field4037 && var9 > (float) this.field4037) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field4035.field7163 + (float) arg0 * this.field4035.field7166 + (float) arg1 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field4035.field7163 + (float) arg3 * this.field4035.field7166 + (float) arg4 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / (float) arg6);
        if (var11 < this.field4052 && var12 < this.field4052) {
            var10 |= 1;
        } else if (var11 > this.field4051 && var12 > this.field4051) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field4035.field7160 + (float) arg0 * this.field4035.field7149 + (float) arg1 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field4035.field7160 + (float) arg3 * this.field4035.field7149 + (float) arg4 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / (float) arg6);
        if (var13 < this.field4033 && var14 < this.field4033) {
            var10 |= 4;
        } else if (var13 > this.field4049 && var14 > this.field4049) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "(I)Z", line = 3368)
    public final boolean method1894(int arg0) {
        return super.field1170.method1181(-7953, arg0);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ld;)V", line = 3371)
    private class289(class152 arg0) {
        super(arg0);
        this.field4013 = false;
        this.field4014 = false;
        this.field4010 = new class213(4);
        this.field4017 = 45823;
        this.field4032 = false;
        this.field4030 = 0;
        this.field4044 = 128;
        this.field4019 = 0;
        this.field4025 = 50;
        this.field4046 = 0;
        this.field4039 = 0;
        this.field4040 = 512;
        this.field4043 = 75518;
        this.field4034 = 512;
        this.field4048 = 0;
        this.field4037 = 3500;
        this.field4050 = 0;
        this.field4021 = 78642;
        this.field4042 = new class112(16);
        this.field4055 = -1;
        try {
            this.field4041 = new class112(256);
            this.field4035 = new class515();
            this.method352(1);
            this.method249(0);
            class78.method721(true, true, (byte) -126);
            this.field4014 = true;
            this.field4009 = (int) class554.method3190(-70);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method614((byte) -98);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "()Z", line = 3387)
    public final boolean method364() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "([I)V", line = 3390)
    public final void method206(int[] arg0) {
        arg0[0] = this.field4039;
        arg0[1] = this.field4019;
        arg0[2] = this.field4050;
        arg0[3] = this.field4046;
    }

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "(I)Lza;", line = 3396)
    public final class415 method261(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(II)Lhe;", line = 3399)
    public final class372 method353(int arg0, int arg1) {
        return this.method311(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIII)V", line = 3402)
    public final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method1884(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method1884(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method1890(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method1890(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field4039 && arg0 < this.field4050 && var37 >= this.field4019 && var37 < this.field4046 && var24 < var21) {
                                int var38 = this.field4020 * var37 + arg0;
                                int var39 = this.field4026[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field4026[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field4039 && arg0 < this.field4050 && var42 >= this.field4019 && var42 < this.field4046 && var24 < var21) {
                                int var43 = this.field4020 * var42 + arg0;
                                int var44 = this.field4026[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field4026[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field4039 && arg0 < this.field4050 && var49 >= this.field4019 && var49 < this.field4046 && var24 < var21) {
                            this.field4026[this.field4020 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field4019 && arg1 < this.field4046 && var60 >= this.field4039 && var60 < this.field4050 && var24 < var21) {
                                int var61 = this.field4020 * arg1 + var60;
                                int var62 = this.field4026[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field4026[this.field4020 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field4019 && arg1 < this.field4046 && var65 >= this.field4039 && var65 < this.field4050 && var24 < var21) {
                                int var66 = this.field4020 * arg1 + var65;
                                int var67 = this.field4026[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field4026[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field4019 && arg1 < this.field4046 && var72 >= this.field4039 && var72 < this.field4050 && var24 < var21) {
                            this.field4026[this.field4020 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "(I)V", line = 3647)
    public final void method267(int arg0) {
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()Lfia;", line = 3650)
    public final class575 method298() {
        return new class575(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V", line = 3653)
    public final void method249(int arg0) {
        this.field4023[arg0].method3073(10000, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 3659)
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class721 {
        if (this.field4011 != null && this.field4012 != null) {
            try {
                Graphics var5 = this.field4011.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field4020 && var7.y + arg3 <= this.field4029 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field4012.method1106(var7.y, var7.x + arg2, var7.height, var5, -1, var7.x, var7.width, var7.y + arg3);
                    }
                }
            } catch (Exception var8) {
                this.field4011.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "()I", line = 3689)
    public final int method285() {
        int var1 = this.field4048;
        this.field4048 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "(I)I", line = 3694)
    public final int method1895(int arg0) {
        return super.field1170.method1180(arg0, -6662).field9942;
    }

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "()I", line = 3698)
    public final int method315() {
        int var1 = this.field4030;
        this.field4030 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "()I", line = 3704)
    public final int method318() {
        return 0;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 3708)
    public final void method233(int arg0) {
        int var2 = arg0 - this.field4009;
        for (Object var3 = this.field4041.method997(-5052); var3 != null; var3 = this.field4041.method988(-117)) {
            class150 var4 = (class150) var3;
            if (var4.field2482) {
                var4.field2479 += var2;
                int var5 = var4.field2479 / 20;
                if (var5 > 0) {
                    class739 var6 = super.field1170.method1180(var4.field2483, -6662);
                    var4.method1175(var6.field9940 * var2 * 50 / 1000, var6.field9953 * var2 * 50 / 1000);
                    var4.field2479 -= var5 * 20;
                }
                var4.field2482 = false;
            }
        }
        this.field4009 = arg0;
        this.field4042.method987(2, 5);
        this.field4041.method987(2, 5);
    }

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "()Z", line = 3740)
    public final boolean method272() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "da", descriptor = "(III[I)V", line = 3744)
    public final void method299(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4035.field7158 + (float) arg0 * this.field4035.field7156 + (float) arg1 * this.field4035.field7174 + this.field4035.field7175;
        if (!(var5 < (float) this.field4025) && !(var5 > (float) this.field4037)) {
            int var6 = (int) (((float) arg2 * this.field4035.field7163 + (float) arg0 * this.field4035.field7166 + (float) arg1 * this.field4035.field7167 + this.field4035.field7180) * (float) this.field4034 / var5);
            int var7 = (int) (((float) arg2 * this.field4035.field7160 + (float) arg0 * this.field4035.field7149 + (float) arg1 * this.field4035.field7172 + this.field4035.field7179) * (float) this.field4040 / var5);
            if (var6 >= this.field4052 && var6 <= this.field4051 && var7 >= this.field4033 && var7 <= this.field4049) {
                arg3[0] = var6 - this.field4052;
                arg3[1] = var7 - this.field4033;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "()V", line = 3768)
    public final void method252() {
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "()Z", line = 3771)
    public final boolean method193() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "()V", line = 3775)
    public final void method307() {
        this.field4041.method999(0);
        this.field4042.method999(0);
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(II)I", line = 3782)
    public final int method219(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "(I)Z", line = 3808)
    public final boolean method1896(int arg0) {
        return this.field4032 || super.field1170.method1180(arg0, -6662).field9941;
    }
}
