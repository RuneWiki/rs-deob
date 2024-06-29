import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class460 extends class89 {

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    public int field6484 = 0;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "Z")
    public boolean field6486 = false;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "I")
    public int field6481 = 512;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "I")
    public int field6482 = 75518;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "I")
    public int field6499 = 0;

    @OriginalMember(owner = "client!et", name = "X", descriptor = "I")
    public int field6503 = 512;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "Z")
    private boolean field6485 = false;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public int field6478 = 45823;

    @OriginalMember(owner = "client!et", name = "W", descriptor = "Z")
    private boolean field6502 = false;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "I")
    public int field6498 = 0;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    private int field6477 = 0;

    @OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
    public int field6505 = 50;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "Z")
    private boolean field6492 = false;

    @OriginalMember(owner = "client!et", name = "hb", descriptor = "I")
    public int field6513 = 0;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    private int field6488 = 0;

    @OriginalMember(owner = "client!et", name = "nb", descriptor = "I")
    public int field6519 = 0;

    @OriginalMember(owner = "client!et", name = "db", descriptor = "I")
    public int field6509 = 78642;

    @OriginalMember(owner = "client!et", name = "lb", descriptor = "I")
    public int field6517 = 3500;

    @OriginalMember(owner = "client!et", name = "kb", descriptor = "I")
    public int field6516 = 0;

    @OriginalMember(owner = "client!et", name = "jb", descriptor = "I")
    public int field6515 = 0;

    @OriginalMember(owner = "client!et", name = "ab", descriptor = "I")
    private int field6506 = 3500;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "I")
    public int field6494 = this.field6506 - 255;

    @OriginalMember(owner = "client!et", name = "ob", descriptor = "I")
    private int field6520 = 0;

    @OriginalMember(owner = "client!et", name = "V", descriptor = "Lmo;")
    private class336 field6501 = new class336(16);

    @OriginalMember(owner = "client!et", name = "fb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6511;

    @OriginalMember(owner = "client!et", name = "U", descriptor = "Lmd;")
    private class165 field6500;

    @OriginalMember(owner = "client!et", name = "gb", descriptor = "[I")
    public int[] field6512;

    @OriginalMember(owner = "client!et", name = "pb", descriptor = "I")
    public int field6521;

    @OriginalMember(owner = "client!et", name = "Y", descriptor = "I")
    private int field6504;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "F")
    private float field6487;

    @OriginalMember(owner = "client!et", name = "ib", descriptor = "F")
    private float field6514;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public int field6476;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public int field6479;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public int field6480;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "I")
    public int field6489;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public int field6490;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public int field6491;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public int field6493;

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public int field6496;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "I")
    public int field6497;

    @OriginalMember(owner = "client!et", name = "bb", descriptor = "I")
    private int field6507;

    @OriginalMember(owner = "client!et", name = "cb", descriptor = "I")
    public int field6508;

    @OriginalMember(owner = "client!et", name = "qb", descriptor = "Llq;")
    private class202 field6522;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "Lkf;")
    public class224 field6495;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "Lmo;")
    private class336 field6483;

    @OriginalMember(owner = "client!et", name = "eb", descriptor = "Z")
    public boolean field6510;

    @OriginalMember(owner = "client!et", name = "mb", descriptor = "[Lsq;")
    private class132[] field6518;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(IIIIII)V", line = 4)
    public final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method374(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method374(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method387(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method387(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field6484) {
                    var10 += (this.field6484 - arg0) * var12;
                    arg0 = this.field6484;
                }
                if (var13 >= this.field6516) {
                    var13 = this.field6516 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field6499 && var17 < this.field6513) {
                                int var18 = this.field6521 * var17 + arg0;
                                int var19 = this.field6512[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field6512[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field6499 && var21 < this.field6513) {
                                int var22 = this.field6521 * var21 + arg0;
                                int var23 = this.field6512[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field6512[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field6499 && var27 < this.field6513) {
                            this.field6512[this.field6521 * var27 + arg0] = arg4;
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
                if (arg1 < this.field6499) {
                    var29 += (this.field6499 - arg1) * var31;
                    arg1 = this.field6499;
                }
                if (var32 >= this.field6513) {
                    var32 = this.field6513 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field6484 && var46 < this.field6516) {
                            this.field6512[this.field6521 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field6484 && var36 < this.field6516) {
                            int var37 = this.field6521 * arg1 + var36;
                            int var38 = this.field6512[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field6512[this.field6521 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field6484 && var40 < this.field6516) {
                            int var41 = this.field6521 * arg1 + var40;
                            int var42 = this.field6512[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field6512[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ln;Lpa;Lde;Lr;I)V", line = 217)
    public final void method384(class468 arg0, class404 arg1, class257 arg2, class63 arg3, int arg4) {
        ((class229) arg0).method1586(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!et", name = "L", descriptor = "()Z", line = 220)
    public final boolean method390() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V", line = 223)
    public final void method357(int arg0) {
        if (this.field6491 != arg0) {
            this.field6491 = arg0;
            this.field6518 = new class132[this.field6491];
            for (int var2 = 0; var2 < this.field6491; ++var2) {
                this.field6518[var2] = new class132(this);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "()V", line = 239)
    public final void method345() {
        this.field6519 = this.field6477;
        this.field6486 = false;
    }

    @OriginalMember(owner = "client!et", name = "q", descriptor = "()I", line = 244)
    public final int method403() {
        return 0;
    }

    @OriginalMember(owner = "client!et", name = "i", descriptor = "(I)Z", line = 247)
    public final boolean method2748(int arg0) {
        return super.field1250.method1223(-29838, arg0);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ltq;I)V", line = 250)
    public class460(Canvas arg0, class248 arg1, int arg2) {
        super(arg2, arg1);
        this.field6511 = arg0;
        this.field6500 = class193.method1348((byte) -125, this.field6511);
        this.field6512 = this.field6500.field2400;
        this.field6521 = this.field6500.field2401;
        this.field6504 = this.field6500.field2398;
        this.method2752();
    }

    @OriginalMember(owner = "client!et", name = "j", descriptor = "(I)Z", line = 259)
    public final boolean method2749(int arg0) {
        return this.field6492 || super.field1250.method1224((byte) 110, arg0).field4361;
    }

    @OriginalMember(owner = "client!et", name = "J", descriptor = "()V", line = 265)
    public final void method343() {
        if (this.field6511 != null && this.field6500 != null) {
            try {
                Graphics var1 = this.field6511.getGraphics();
                this.field6500.method966(0, 0, 5, var1);
            } catch (Exception var2) {
                this.field6511.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIII)V", line = 278)
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class132 var8 = this.method2757(Thread.currentThread());
        class272 var9 = var8.field1811;
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
            int var21 = arg0 - var9.method1839();
            int var22 = arg1 - var9.method1841();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field3950 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3950 = 255 - (arg4 >> 24);
            }
            var9.field3947 = var23 < 0 || var23 > var9.field3949 || var24 < 0 || var24 > var9.field3949 || var25 < 0 || var25 > var9.field3949;
            var9.method1844(var27, var28, var29, var23, var24, var25, arg4);
            var9.field3947 = var23 < 0 || var23 > var9.field3949 || var24 < 0 || var24 > var9.field3949 || var26 < 0 || var26 > var9.field3949;
            var9.method1844(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)V", line = 347)
    public final void method391(int arg0) {
        this.field6518[arg0].method987((Runnable) null, (byte) 114);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IIIII)V", line = 350)
    public final void method374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field6499 && arg1 < this.field6513) {
            if (arg0 < this.field6484) {
                arg2 -= this.field6484 - arg0;
                arg0 = this.field6484;
            }
            if (arg0 + arg2 > this.field6516) {
                arg2 = this.field6516 - arg0;
            }
            int var6 = this.field6521 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6512[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field6512[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field6512[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field6512[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field6512[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(II)V", line = 422)
    public final void method350(int arg0, int arg1) {
        this.field6505 = arg0;
        this.field6506 = arg1;
        this.field6494 = this.field6506 - 255;
        this.method2751();
    }

    @OriginalMember(owner = "client!et", name = "C", descriptor = "()V", line = 427)
    public final void method298() {
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lpa;)V", line = 432)
    public final void method329(class404 arg0) {
        class360 var2 = arg0.field5528.field4710;
        for (class360 var3 = var2.field4948; var2 != var3; var3 = var3.field4948) {
            class133 var4 = (class133) var3;
            int var5 = var4.field1862 >> 12;
            int var6 = var4.field1863 >> 12;
            int var7 = var4.field1864 >> 12;
            int var8 = (this.field6495.field3235 * var7 + this.field6495.field3233 * var6 + this.field6495.field3230 * var5 >> 15) + this.field6495.field3234;
            if (var8 >= this.field6505 && var8 <= this.field6506) {
                int var9 = ((this.field6495.field3229 * var7 + this.field6495.field3236 * var5 + this.field6495.field3227 * var6 >> 15) + this.field6495.field3232) * this.field6503 / var8 + this.field6490;
                int var10 = ((this.field6495.field3226 * var7 + this.field6495.field3237 * var6 + this.field6495.field3228 * var5 >> 15) + this.field6495.field3231) * this.field6481 / var8 + this.field6479;
                if (var9 >= this.field6484 && var9 <= this.field6516 && var10 >= this.field6499 && var10 <= this.field6513) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2753(var4, var9, var10, (var4.field1870 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIILoj;II)V", line = 471)
    public final void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class405 arg6, int arg7, int arg8) {
        class187 var10 = (class187) arg6;
        int[] var11 = var10.field2803;
        int[] var12 = var10.field2805;
        int var13 = this.field6499 > arg8 ? this.field6499 : arg8;
        int var14 = this.field6513 < var11.length + arg8 ? this.field6513 : var11.length + arg8;
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
            if (arg0 < this.field6484) {
                var18 += (this.field6484 - arg0) * var20;
                arg0 = this.field6484;
            }
            if (var21 >= this.field6516) {
                var21 = this.field6516 - 1;
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
                                int var28 = this.field6521 * var25 + arg0;
                                int var29 = this.field6512[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field6512[var28] = var23 + var30;
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
                                int var34 = this.field6521 * var31 + arg0;
                                int var35 = this.field6512[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field6512[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field6512[this.field6521 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field6484 && var64 < this.field6516 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field6512[this.field6521 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field6484 && var50 < this.field6516 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field6521 * arg1 + var50;
                        int var54 = this.field6512[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field6512[this.field6521 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field6484 && var56 < this.field6516 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field6521 * arg1 + var56;
                        int var60 = this.field6512[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field6512[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([Ln;Lpa;Lde;[Lr;I)V", line = 710)
    public final void method326(class468[] arg0, class404 arg1, class257 arg2, class63[] arg3, int arg4) {
        class229[] var6 = new class229[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class229) arg0[var7];
            }
        }
        class229 var8 = class229.method1585(this, var6);
        var8.method1586(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!et", name = "u", descriptor = "()V", line = 724)
    public final void method323() {
    }

    @OriginalMember(owner = "client!et", name = "j", descriptor = "()V", line = 726)
    public final void method351() {
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(IIII)[I", line = 730)
    public final int[] method383(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field6521 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field6512[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lrp;)V", line = 757)
    public final void method446(class419 arg0) {
    }

    @OriginalMember(owner = "client!et", name = "k", descriptor = "(I)I", line = 760)
    public final int method2750(int arg0) {
        return super.field1250.method1224((byte) 110, arg0).field4365 & 65535;
    }

    @OriginalMember(owner = "client!et", name = "I", descriptor = "()I", line = 764)
    public final int method332() {
        int var1 = this.field6520;
        this.field6520 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V", line = 769)
    public final void method373(int arg0) {
        this.method438(0, 0, this.field6521, this.field6504, arg0, 0);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V", line = 771)
    public final void method389(boolean arg0) {
    }

    @OriginalMember(owner = "client!et", name = "D", descriptor = "()Lde;", line = 775)
    public final class257 method306() {
        class132 var1 = this.method2757(Thread.currentThread());
        return var1.field1813;
    }

    @OriginalMember(owner = "client!et", name = "k", descriptor = "()Z", line = 779)
    public final boolean method340() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([I)V", line = 785)
    public final void method409(int[] arg0) {
        arg0[0] = this.field6484;
        arg0[1] = this.field6499;
        arg0[2] = this.field6516;
        arg0[3] = this.field6513;
    }

    @OriginalMember(owner = "client!et", name = "F", descriptor = "()Z", line = 791)
    public final boolean method291() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IIIIII)V", line = 795)
    public final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method374(arg0, arg1, arg2, arg4, arg5);
        this.method374(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method387(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method387(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "()V", line = 801)
    private final void method2751() {
        if (this.field6487 != 0.0F) {
            float var1 = (float) this.field6506;
            float var2 = (float) this.field6505;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field6514 / (this.field6514 + this.field6487);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field6487;
            this.field6517 = (int) (((float) this.field6506 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field6517 = this.field6506;
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(IIIIII)Z", line = 827)
    public final boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field6495.field3235 * arg2 + this.field6495.field3233 * arg1 + this.field6495.field3230 * arg0 >> 15) + this.field6495.field3234;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field6495.field3235 * arg5 + this.field6495.field3233 * arg4 + this.field6495.field3230 * arg3 >> 15) + this.field6495.field3234;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field6505 || var8 >= this.field6505) && (var7 <= this.field6506 || var8 <= this.field6506)) {
            int var9 = ((this.field6495.field3229 * arg2 + this.field6495.field3236 * arg0 + this.field6495.field3227 * arg1 >> 15) + this.field6495.field3232) * this.field6503 / var7;
            int var10 = ((this.field6495.field3229 * arg5 + this.field6495.field3236 * arg3 + this.field6495.field3227 * arg4 >> 15) + this.field6495.field3232) * this.field6503 / var8;
            if (var9 < this.field6496 && var10 < this.field6496 || var9 > this.field6493 && var10 > this.field6493) {
                return false;
            } else {
                int var11 = ((this.field6495.field3226 * arg2 + this.field6495.field3237 * arg1 + this.field6495.field3228 * arg0 >> 15) + this.field6495.field3231) * this.field6481 / var7;
                int var12 = ((this.field6495.field3226 * arg5 + this.field6495.field3237 * arg4 + this.field6495.field3228 * arg3 >> 15) + this.field6495.field3231) * this.field6481 / var8;
                return (var11 >= this.field6489 || var12 >= this.field6489) && (var11 <= this.field6476 || var12 <= this.field6476);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(IIII)V", line = 856)
    public final void method443(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6484 < arg0) {
            this.field6484 = arg0;
        }
        if (this.field6499 < arg1) {
            this.field6499 = arg1;
        }
        if (this.field6516 > arg2) {
            this.field6516 = arg2;
        }
        if (this.field6513 > arg3) {
            this.field6513 = arg3;
        }
        this.method2759();
    }

    @OriginalMember(owner = "client!et", name = "t", descriptor = "()Z", line = 871)
    public final boolean method445() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "(IIIIII)Lrp;", line = 877)
    public final class419 method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[[I[[IIII)Lij;", line = 884)
    public final class241 method456(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class64(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(IIIIII)V", line = 887)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field6484) {
            arg2 -= this.field6484 - arg0;
            arg0 = this.field6484;
        }
        if (arg1 < this.field6499) {
            arg3 -= this.field6499 - arg1;
            arg1 = this.field6499;
        }
        if (arg0 + arg2 > this.field6516) {
            arg2 = this.field6516 - arg0;
        }
        if (arg1 + arg3 > this.field6513) {
            arg3 = this.field6513 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field6516 && arg1 <= this.field6513) {
            int var7 = this.field6521 - arg2;
            int var8 = this.field6521 * arg1 + arg0;
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
                            this.field6512[var24] = arg4;
                            ++var24;
                            this.field6512[var24] = arg4;
                            ++var24;
                            this.field6512[var24] = arg4;
                            ++var24;
                            this.field6512[var24] = arg4;
                            ++var24;
                            this.field6512[var24] = arg4;
                            ++var24;
                            this.field6512[var24] = arg4;
                            ++var24;
                            this.field6512[var24] = arg4;
                            ++var24;
                            this.field6512[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field6512[var24] = arg4;
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
                        int var14 = this.field6512[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field6512[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field6512[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field6512[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)V", line = 1022)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field6521) {
            arg2 = this.field6521;
        }
        if (arg3 > this.field6504) {
            arg3 = this.field6504;
        }
        this.field6484 = arg0;
        this.field6516 = arg2;
        this.field6499 = arg1;
        this.field6513 = arg3;
        this.method2759();
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "()Z", line = 1041)
    public final boolean method432() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "B", descriptor = "()V", line = 1045)
    public final void method450() {
        this.field6483.method2109(-1);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IIII)V", line = 1050)
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        this.field6477 = this.field6519;
        this.field6498 = arg0;
        this.field6519 = arg1;
        this.field6515 = arg2;
        this.field6486 = true;
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "()V", line = 1057)
    public final void method294() {
        this.field6500 = class193.method1348((byte) -107, this.field6511);
        this.field6512 = this.field6500.field2400;
        this.field6521 = this.field6500.field2401;
        this.field6504 = this.field6500.field2398;
        for (int var1 = 0; var1 < this.field6491; ++var1) {
            this.field6518[var1].method985(28816);
        }
        this.method360();
    }

    @OriginalMember(owner = "client!et", name = "o", descriptor = "()Z", line = 1072)
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V", line = 1076)
    public final void method314(int arg0) {
        this.field6518[arg0].method987(Thread.currentThread(), (byte) 123);
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(II)I", line = 1080)
    public final int method362(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "()V", line = 1084)
    private final void method2752() {
        this.field6483 = new class336(20);
        this.field6495 = new class224();
        class157.method1126(116, false, true);
        this.field6502 = true;
        this.method357(1);
        this.method314(0);
        this.method360();
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "()Z", line = 1097)
    public final boolean method455() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(IIII)V", line = 1101)
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
        this.field6490 = arg0;
        this.field6479 = arg1;
        this.field6503 = arg2;
        this.field6481 = arg3;
        this.method2759();
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(II)I", line = 1108)
    public final int method355(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V", line = 1119)
    public final void method295(int arg0) {
        int var2 = arg0 - this.field6507;
        for (Object var3 = this.field6483.method2118(true); var3 != null; var3 = this.field6483.method2121(-1)) {
            class358 var4 = (class358) var3;
            if (var4.field4938) {
                var4.field4937 += var2;
                int var5 = var4.field4937 / 20;
                if (var5 > 0) {
                    class308 var6 = super.field1250.method1224((byte) 110, var4.field4941);
                    var4.method2211(var6.field4363 * var2 * 50 / 1000, var6.field4360 * var2 * 50 / 1000);
                    var4.field4937 -= var5 * 20;
                }
                var4.field4938 = false;
            }
        }
        this.field6507 = arg0;
        this.field6501.method2120((byte) 79, 5);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lkg;[Lgm;Z)Lam;", line = 1151)
    public final class199 method367(class194 arg0, class355[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4877;
            var5[var7] = arg1[var7].field4876;
            if (arg1[var7].field4879 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class327(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class180(this, arg0, arg1, var4, var5);
        } else {
            return new class403(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(F)V", line = 1180)
    public final void method415(float arg0) {
        this.field6482 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lvm;III)V", line = 1184)
    public final void method2753(class133 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field1872;
        if (var6 == -1) {
            this.method352(arg1, arg2, var5, arg0.field1869, 1);
        } else {
            if (this.field6522 == null || (long) var6 != this.field6522.field6382) {
                this.field6522 = (class202) this.field6501.method2113(0, (long) var6);
            }
            if (this.field6522 == null) {
                int[] var7 = this.method2758(var6);
                if (var7 == null) {
                    return;
                }
                this.field6522 = new class202();
                this.field6522.field2985 = this.method2749(var6);
                int var8 = this.field6522.field2985 ? 64 : 128;
                this.field6522.field2989 = this.method342(var7, 0, var8, var8, var8);
                this.field6501.method2116((long) var6, (byte) -85, this.field6522);
            }
            if (this.field6522.field2985) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field6522.field2989.method725(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field1869, 1);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III[I)V", line = 1224)
    public final void method316(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field6495.field3235 * arg2 + this.field6495.field3233 * arg1 + this.field6495.field3230 * arg0 >> 15) + this.field6495.field3234;
        if (var5 >= this.field6505 && var5 <= this.field6506) {
            int var6 = ((this.field6495.field3229 * arg2 + this.field6495.field3236 * arg0 + this.field6495.field3227 * arg1 >> 15) + this.field6495.field3232) * this.field6503 / var5;
            int var7 = ((this.field6495.field3226 * arg2 + this.field6495.field3237 * arg1 + this.field6495.field3228 * arg0 >> 15) + this.field6495.field3231) * this.field6481 / var5;
            if (var6 >= this.field6496 && var6 <= this.field6493 && var7 >= this.field6489 && var7 <= this.field6476) {
                arg3[0] = var6 - this.field6496;
                arg3[1] = var7 - this.field6489;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!et", name = "A", descriptor = "()I", line = 1248)
    public final int method322() {
        return 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZ)Lrn;", line = 1252)
    public final class417 method429(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field6521 * arg1 + arg0;
        int var8 = this.field6521 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field6512[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class85(this, var6, arg2, arg3);
        } else {
            return new class298(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!et", name = "y", descriptor = "()Z", line = 1284)
    public final boolean method375() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "p", descriptor = "()I", line = 1288)
    public final int method300() {
        int var1 = this.field6488;
        this.field6488 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILoj;II)V", line = 1295)
    public final void method366(int arg0, class405 arg1, int arg2, int arg3) {
        class187 var5 = (class187) arg1;
        int[] var6 = var5.field2803;
        int[] var7 = var5.field2805;
        int var8;
        if (this.field6513 < var6.length + arg3) {
            var8 = this.field6513 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field6499 > arg3) {
            var9 = this.field6499 - arg3;
            arg3 = this.field6499;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field6521 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field6484 > var12) {
                    var13 -= this.field6484 - var12;
                    var12 = this.field6484;
                }
                if (this.field6516 < var12 + var13) {
                    var13 = this.field6516 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field6512[var14++] = arg0;
                }
                var10 += this.field6521;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V", line = 1353)
    public final void method296(int arg0, int arg1) {
        this.field6519 = arg0 & 16777215;
        int var3 = this.field6519 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field6519 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field6519 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field6519 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field6510 = false;
        } else {
            this.field6510 = true;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIII[BII)V", line = 1379)
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field6521 * arg1 + arg0;
            int var15 = this.field6521 - arg2;
            if (arg1 + arg3 > this.field6513) {
                arg3 -= arg1 + arg3 - this.field6513;
            }
            if (arg1 < this.field6499) {
                int var16 = this.field6499 - arg1;
                arg3 -= var16;
                var14 += this.field6521 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field6516) {
                int var17 = arg0 + arg2 - this.field6516;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field6484) {
                int var18 = this.field6484 - arg0;
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
                            int var28 = this.field6512[var14];
                            this.field6512[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field6512[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field6512[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field6512[var14++] = arg5;
                        } else {
                            this.field6512[var14++] = arg4;
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

    @OriginalMember(owner = "client!et", name = "l", descriptor = "(I)Z", line = 1561)
    public final boolean method2754(int arg0) {
        return super.field1250.method1224((byte) 110, arg0).field4370;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[Lnq;)V", line = 1563)
    public final void method439(int arg0, class104[] arg1) {
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(FFF)V", line = 1566)
    public final void method363(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(Z)V", line = 1568)
    public final void method308(boolean arg0) {
    }

    @OriginalMember(owner = "client!et", name = "w", descriptor = "()I", line = 1574)
    public final int method369() {
        return this.field6506;
    }

    @OriginalMember(owner = "client!et", name = "E", descriptor = "()Z", line = 1578)
    public final boolean method452() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "i", descriptor = "()V", line = 1584)
    public final void method360() {
        this.field6484 = 0;
        this.field6499 = 0;
        this.field6516 = this.field6521;
        this.field6513 = this.field6504;
        this.method2759();
    }

    @OriginalMember(owner = "client!et", name = "v", descriptor = "()F", line = 1591)
    public final float method404() {
        return this.field6514;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lhb;)V", line = 1593)
    public final void method376(class349 arg0) {
    }

    @OriginalMember(owner = "client!et", name = "G", descriptor = "()I", line = 1599)
    public final int method334() {
        return this.field6505;
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "()Z", line = 1602)
    public final boolean method299() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)Lhb;", line = 1605)
    public final class349 method444(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!et", name = "l", descriptor = "()Z", line = 1620)
    public final boolean method379() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([IIIII)Lrn;", line = 1631)
    public final class417 method342(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class85(this, arg0, arg1, arg2, arg3, arg4) : new class298(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class85(this, arg0, arg1, arg2, arg3, arg4) : new class298(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V", line = 1671)
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field6484 && arg0 < this.field6516) {
            if (arg1 < this.field6499) {
                arg2 -= this.field6499 - arg1;
                arg1 = this.field6499;
            }
            if (arg1 + arg2 > this.field6513) {
                arg2 = this.field6513 - arg1;
            }
            int var6 = this.field6521 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6521 * var10 + var6;
                        int var12 = this.field6512[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field6512[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field6521 * var14 + var6;
                        int var16 = this.field6512[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field6512[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field6512[this.field6521 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lgm;Z)Lrn;", line = 1748)
    public final class417 method302(class355 arg0, boolean arg1) {
        int[] var3 = arg0.field4881;
        byte[] var4 = arg0.field4880;
        int var5 = arg0.field4877;
        int var6 = arg0.field4876;
        class299 var11;
        if (arg1 && arg0.field4879 == null) {
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
            var11 = new class188(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4879;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class85(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class85(this, var14, var5, var6);
                var11 = new class298(this, var14, var5, var6);
            }
        }
        var11.method1291(arg0.field4874, arg0.field4873, arg0.field4875, arg0.field4878);
        return var11;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1850)
    public final void method393(Rectangle[] arg0, int arg1) {
        if (this.field6511 != null && this.field6500 != null) {
            try {
                Graphics var3 = this.field6511.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field6521 && var5.y <= this.field6504 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field6500.method964(var5.y, var3, var5.x, var5.width, (byte) 113, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field6511.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(FF)V", line = 1876)
    public final void method378(float arg0, float arg1) {
        this.field6514 = arg0;
        this.field6487 = arg1;
        this.method2751();
    }

    @OriginalMember(owner = "client!et", name = "n", descriptor = "()V", line = 1881)
    public final void method331() {
        if (this.field6502) {
            class169.method1225(false, (byte) 120, true);
            this.field6502 = false;
        }
        this.field6511 = null;
        this.field6500 = null;
        this.field6485 = true;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([Ln;Lde;[Lr;I)V", line = 1894)
    public final void method437(class468[] arg0, class257 arg1, class63[] arg2, int arg3) {
        class229[] var5 = new class229[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class229) arg0[var6];
            }
        }
        class229 var7 = class229.method1585(this, var5);
        var7.method1586(arg1, arg2 != null ? arg2[0] : null, (class404) null, arg3);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[I[I)Loj;", line = 1909)
    public final class405 method402(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class187(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!et", name = "m", descriptor = "(I)[I", line = 1918)
    public final int[] method2755(int arg0) {
        class336 var2 = this.field6483;
        class358 var3;
        synchronized (this.field6483) {
            var3 = (class358) this.field6483.method2113(0, (long) arg0);
            if (var3 == null) {
                if (!super.field1250.method1223(-29838, arg0)) {
                    return null;
                }
                class308 var5 = super.field1250.method1224((byte) 110, arg0);
                int var6 = !var5.field4361 && !this.field6492 ? 128 : 64;
                var3 = new class358(arg0, var6, super.field1250.method1231(arg0, var6, var6, true, -22414, 0.7F), var5.field4376);
                this.field6483.method2116((long) arg0, (byte) -38, var3);
            }
        }
        var3.field4938 = true;
        return var3.method2210();
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(IIII)V", line = 1938)
    public final void method423(int arg0, int arg1, int arg2, int arg3) {
        this.field6498 = arg0;
        this.field6519 = arg1;
        this.field6515 = arg2;
    }

    @OriginalMember(owner = "client!et", name = "s", descriptor = "()Lde;", line = 1950)
    public final class257 method328() {
        return new class224();
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "()Z", line = 1953)
    public final boolean method307() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "m", descriptor = "()Z", line = 1956)
    public final boolean method330() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "()Z", line = 1959)
    public final boolean method2756() {
        return this.field6485;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Runnable;)Lsq;", line = 1964)
    public final class132 method2757(Runnable arg0) {
        for (int var2 = 0; var2 < this.field6491; ++var2) {
            if (this.field6518[var2].field1812 == arg0) {
                return this.field6518[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lqi;IIII)Ln;", line = 1979)
    public final class468 method327(class430 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class229(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V", line = 1982)
    public final void method292(boolean arg0) {
        this.field6492 = arg0;
        this.field6483.method2109(-1);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lde;)V", line = 1986)
    public final void method454(class257 arg0) {
        this.field6495 = (class224) arg0;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(IIIII)V", line = 1992)
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field6499) {
            var6 = this.field6499;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field6513) {
            var7 = this.field6513;
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
                if (var64 < this.field6484) {
                    var64 = this.field6484;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field6516) {
                    var65 = this.field6516;
                }
                int var66 = this.field6521 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field6512[var66++] = arg3;
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
                if (var60 < this.field6484) {
                    var60 = this.field6484;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field6516 - 1) {
                    var61 = this.field6516 - 1;
                }
                int var62 = this.field6521 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field6512[var62++] = arg3;
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
                if (var28 < this.field6484) {
                    var28 = this.field6484;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field6516) {
                    var29 = this.field6516;
                }
                int var30 = this.field6521 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field6512[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field6512[var30++] = var15 + var33;
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
                if (var22 < this.field6484) {
                    var22 = this.field6484;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field6516 - 1) {
                    var23 = this.field6516 - 1;
                }
                int var24 = this.field6521 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field6512[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field6512[var24++] = var15 + var27;
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
                if (var47 < this.field6484) {
                    var47 = this.field6484;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field6516) {
                    var48 = this.field6516;
                }
                int var49 = this.field6521 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field6512[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field6512[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field6484) {
                    var39 = this.field6484;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field6516 - 1) {
                    var40 = this.field6516 - 1;
                }
                int var41 = this.field6521 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field6512[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field6512[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(IIII)V", line = 2283)
    public final void method382(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!et", name = "x", descriptor = "()Z", line = 2286)
    public final boolean method419() {
        return true;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2289)
    public final void method435(Canvas arg0) {
        this.field6511 = arg0;
        this.method294();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)V", line = 2297)
    public final void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class132 var11 = this.method2757(Thread.currentThread());
        class272 var12 = var11.field1811;
        var12.field3956 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field3956 = false;
            var12.field3950 = 0;
            var12.field3947 = true;
            var12.method1843(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field3956 = false;
            var12.field3950 = 255 - var13;
            var12.field3947 = true;
            var12.method1843(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field3956 = true;
    }

    @OriginalMember(owner = "client!et", name = "r", descriptor = "()Z", line = 2331)
    public final boolean method377() {
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lrp;Lrp;FLrp;)Lrp;", line = 2334)
    public final class419 method410(class419 arg0, class419 arg1, float arg2, class419 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!et", name = "n", descriptor = "(I)[I", line = 2338)
    private final int[] method2758(int arg0) {
        class336 var2 = this.field6483;
        class358 var3;
        synchronized (this.field6483) {
            var3 = (class358) this.field6483.method2113(0, (long) arg0);
            if (var3 == null) {
                if (!super.field1250.method1223(-29838, arg0)) {
                    return null;
                }
                class308 var5 = super.field1250.method1224((byte) 110, arg0);
                int var6 = !var5.field4361 && !this.field6492 ? 128 : 64;
                var3 = new class358(arg0, var6, super.field1250.method1226(var6, -20, true, 0.7F, var6, arg0), var5.field4376);
                this.field6483.method2116((long) arg0, (byte) -44, var3);
            }
        }
        var3.field4938 = true;
        return var3.method2210();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IFFFFF)V", line = 2362)
    public final void method420(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field6478 = (int) (arg1 * 65535.0F);
        this.field6509 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field6497 = (int) (arg3 * 65535.0F / var7);
        this.field6480 = (int) (arg4 * 65535.0F / var7);
        this.field6508 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!et", name = "M", descriptor = "()V", line = 2371)
    private final void method2759() {
        this.field6496 = this.field6484 - this.field6490;
        this.field6493 = this.field6516 - this.field6490;
        this.field6489 = this.field6499 - this.field6479;
        this.field6476 = this.field6513 - this.field6479;
        for (int var1 = 0; var1 < this.field6491; ++var1) {
            class272 var5 = this.field6518[var1].field1811;
            var5.field3946 = this.field6490 - this.field6484;
            var5.field3953 = this.field6479 - this.field6499;
            var5.field3949 = this.field6516 - this.field6484;
            var5.field3957 = this.field6513 - this.field6499;
        }
        int var2 = this.field6521 * this.field6499 + this.field6484;
        for (int var3 = this.field6499; var3 < this.field6513; ++var3) {
            for (int var4 = 0; var4 < this.field6491; ++var4) {
                this.field6518[var4].field1811.field3952[var3 - this.field6499] = var2;
            }
            var2 += this.field6521;
        }
    }

    @OriginalMember(owner = "client!et", name = "K", descriptor = "()F", line = 2409)
    public final float method414() {
        return this.field6487;
    }

    @OriginalMember(owner = "client!et", name = "H", descriptor = "()V", line = 2415)
    public final void method417() {
    }
}
