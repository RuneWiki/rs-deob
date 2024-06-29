import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public abstract class class574 extends class650 {

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "Z")
    private boolean field7331;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "Z")
    private boolean field7334;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "Lhd;")
    public class694 field7333;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "Z")
    public boolean field7343;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public int field7340;

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
    private int field7344;

    @OriginalMember(owner = "client!lea", name = "V", descriptor = "I")
    public int field7360;

    @OriginalMember(owner = "client!lea", name = "S", descriptor = "I")
    public int field7357;

    @OriginalMember(owner = "client!lea", name = "Z", descriptor = "I")
    public int field7364;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "I")
    private int field7346;

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "I")
    public int field7354;

    @OriginalMember(owner = "client!lea", name = "Y", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!lea", name = "Q", descriptor = "I")
    private int field7355;

    @OriginalMember(owner = "client!lea", name = "db", descriptor = "I")
    public int field7368;

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
    public int field7350;

    @OriginalMember(owner = "client!lea", name = "cb", descriptor = "I")
    public int field7367;

    @OriginalMember(owner = "client!lea", name = "eb", descriptor = "Z")
    private boolean field7369;

    @OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
    private int field7356;

    @OriginalMember(owner = "client!lea", name = "fb", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!lea", name = "jb", descriptor = "I")
    public int field7374;

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!lea", name = "hb", descriptor = "I")
    public int field7372;

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
    public int field7351;

    @OriginalMember(owner = "client!lea", name = "mb", descriptor = "I")
    public int field7377;

    @OriginalMember(owner = "client!lea", name = "W", descriptor = "Lhm;")
    public class208 field7361;

    @OriginalMember(owner = "client!lea", name = "nb", descriptor = "I")
    public int field7378;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "Lhm;")
    private class208 field7337;

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "Lcr;")
    public class538 field7353;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "F")
    private float field7341;

    @OriginalMember(owner = "client!lea", name = "T", descriptor = "F")
    private float field7358;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    private int field7335;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
    public int field7336;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public int field7338;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
    public int field7339;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "I")
    public int field7347;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
    public int field7348;

    @OriginalMember(owner = "client!lea", name = "N", descriptor = "I")
    public int field7352;

    @OriginalMember(owner = "client!lea", name = "U", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!lea", name = "X", descriptor = "I")
    public int field7362;

    @OriginalMember(owner = "client!lea", name = "ab", descriptor = "I")
    public int field7365;

    @OriginalMember(owner = "client!lea", name = "gb", descriptor = "I")
    public int field7371;

    @OriginalMember(owner = "client!lea", name = "ib", descriptor = "I")
    public int field7373;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "Lmv;")
    public class348 field7332;

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "Lxa;")
    public class468 field7349;

    @OriginalMember(owner = "client!lea", name = "ob", descriptor = "Lxa;")
    public class468 field7379;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7330;

    @OriginalMember(owner = "client!lea", name = "kb", descriptor = "Z")
    public boolean field7375;

    @OriginalMember(owner = "client!lea", name = "lb", descriptor = "[I")
    public int[] field7376;

    @OriginalMember(owner = "client!lea", name = "bb", descriptor = "[Lcm;")
    public class683[] field7366;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lxa;Z)V")
    public abstract void method369(class468 arg0, boolean arg1);

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "()Ltaa;")
    public final class379 method317() {
        return new class379(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([IIIII)Lxa;")
    public final class468 method428(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class298(this, arg0, arg1, arg2, arg3, arg4) : new class533(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class298(this, arg0, arg1, arg2, arg3, arg4) : new class533(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "()V")
    public final void method3102() {
        for (int var1 = 0; var1 < this.field7362; ++var1) {
            this.field7366[var1].method1399(10);
        }
        this.method410();
    }

    @OriginalMember(owner = "client!lea", name = "AA", descriptor = "(IIII)V")
    public final void method484(int arg0, int arg1, int arg2, int arg3) {
        this.field7346 = this.field7372;
        this.field7342 = arg0;
        this.field7372 = arg1;
        this.field7354 = arg2;
        this.field7343 = true;
    }

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "()Z")
    public final boolean method434() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIZ)Lxa;")
    public final class468 method441(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class298(this, arg0, arg1) : new class533(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(I)V")
    public void method494(int arg0) {
        this.field7366[arg0].method3775(105, Thread.currentThread());
    }

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "()Z")
    public final boolean method466() {
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "()Z")
    public final boolean method404() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/Runnable;)Lcm;")
    public abstract class683 method937(Runnable arg0);

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "()Lq;")
    public final class396 method431() {
        return new class538();
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)I")
    public final int method469(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!lea", name = "ca", descriptor = "(IIII)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7339) {
            arg2 = this.field7339;
        }
        if (arg3 > this.field7373) {
            arg3 = this.field7373;
        }
        this.field7374 = arg0;
        this.field7350 = arg2;
        this.field7357 = arg1;
        this.field7367 = arg3;
        this.method934();
    }

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "()I")
    public final int method429() {
        return 0;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, int arg8) {
        class2 var10 = (class2) arg6;
        int[] var11 = var10.field6;
        int[] var12 = var10.field5;
        int var13 = this.field7357 > arg8 ? this.field7357 : arg8;
        int var14 = this.field7367 < var11.length + arg8 ? this.field7367 : var11.length + arg8;
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
            if (arg0 < this.field7374) {
                var18 += (this.field7374 - arg0) * var20;
                arg0 = this.field7374;
            }
            if (var21 >= this.field7350) {
                var21 = this.field7350 - 1;
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
                                int var28 = this.field7339 * var25 + arg0;
                                int var29 = this.field7376[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field7376[var28] = var23 + var30;
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
                                int var34 = this.field7339 * var31 + arg0;
                                int var35 = this.field7376[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field7376[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field7376[this.field7339 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field7374 && var64 < this.field7350 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field7376[this.field7339 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field7374 && var50 < this.field7350 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field7339 * arg1 + var50;
                        int var54 = this.field7376[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field7376[this.field7339 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field7374 && var56 < this.field7350 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field7339 * arg1 + var56;
                        int var60 = this.field7376[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field7376[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Liba;Z)Lxa;")
    public final class468 method402(class495 arg0, boolean arg1) {
        int[] var3 = arg0.field6187;
        byte[] var4 = arg0.field6191;
        int var5 = arg0.field6193;
        int var6 = arg0.field6195;
        class414 var11;
        if (arg1 && arg0.field6189 == null) {
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
            var11 = new class553(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field6189;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class298(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class533(this, var14, var5, var6);
            }
        }
        var11.method1559(arg0.field6190, arg0.field6192, arg0.field6188, arg0.field6194);
        return var11;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "()Z")
    public final boolean method422() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Li;)V")
    public final void method489(class37 arg0) {
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lub;[Liba;Z)Lta;")
    public final class201 method414(class20 arg0, class495[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6193;
            var5[var7] = arg1[var7].field6195;
            if (arg1[var7].field6189 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class425(this, arg0, arg1, var4, var5);
            } else {
                return new class535(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class554(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "()Z")
    public final boolean method492() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Le;)V")
    private class574(class498 arg0) {
        super(arg0);
        this.field7331 = false;
        this.field7334 = false;
        this.field7333 = new class694(4);
        this.field7343 = false;
        this.field7340 = 512;
        this.field7344 = 0;
        this.field7360 = 78642;
        this.field7357 = 0;
        this.field7364 = 3500;
        this.field7346 = 0;
        this.field7354 = 0;
        this.field7363 = 512;
        this.field7355 = 0;
        this.field7368 = 45823;
        this.field7350 = 0;
        this.field7367 = 0;
        this.field7369 = false;
        this.field7356 = 3500;
        this.field7370 = 75518;
        this.field7374 = 0;
        this.field7342 = 0;
        this.field7372 = 0;
        this.field7351 = 50;
        this.field7377 = this.field7356 - 255;
        this.field7361 = new class208(16);
        this.field7378 = -1;
        this.field7337 = new class208(256);
        this.field7353 = new class538();
        this.method413(1);
        this.method494(0);
        class536.method2886(false, (byte) -99, true);
        this.field7331 = true;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIIII)Lip;")
    public final class662 method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lea", name = "ka", descriptor = "(FF)V")
    public final void method406(float arg0, float arg1) {
        this.field7358 = arg0;
        this.field7341 = arg1;
        this.method3110();
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)[I")
    public final int[] method3103(int arg0) {
        class208 var2 = this.field7337;
        class43 var3;
        synchronized (this.field7337) {
            var3 = (class43) this.field7337.method1221((long) arg0, true);
            if (var3 == null) {
                if (!super.field8781.method2717(arg0, false)) {
                    return null;
                }
                class152 var5 = super.field8781.method2718(arg0, (byte) 72);
                int var6 = !var5.field1826 && !this.field7369 ? 128 : 64;
                var3 = new class43(arg0, var6, super.field8781.method2715(var6, var6, arg0, 0.7F, true, true), var5.field1819);
                this.field7337.method1230((byte) -115, (long) arg0, var3);
            }
        }
        var3.field599 = true;
        return var3.method266();
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "(I)Li;")
    public final class37 method468(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "()Z")
    public final boolean method361() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "()V")
    public final void method325() {
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method411(Canvas arg0);

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "(I)I")
    public final int method3104(int arg0) {
        return super.field8781.method2718(arg0, (byte) 72).field1825 & 65535;
    }

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "()Z")
    public abstract boolean method419();

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!lea", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field7353.field6787 * arg2 + this.field7353.field6788 * arg0 + this.field7353.field6784 * arg1 >> 14) + this.field7353.field6789;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field7353.field6787 * arg5 + this.field7353.field6788 * arg3 + this.field7353.field6784 * arg4 >> 14) + this.field7353.field6789;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field7351 || var8 >= this.field7351) && (var7 <= this.field7356 || var8 <= this.field7356)) {
            int var9 = ((this.field7353.field6786 * arg2 + this.field7353.field6785 * arg1 + this.field7353.field6780 * arg0 >> 14) + this.field7353.field6790) * this.field7340 / var7;
            int var10 = ((this.field7353.field6786 * arg5 + this.field7353.field6785 * arg4 + this.field7353.field6780 * arg3 >> 14) + this.field7353.field6790) * this.field7340 / var8;
            if (var9 < this.field7347 && var10 < this.field7347 || var9 > this.field7348 && var10 > this.field7348) {
                return false;
            } else {
                int var11 = ((this.field7353.field6782 * arg2 + this.field7353.field6791 * arg1 + this.field7353.field6783 * arg0 >> 14) + this.field7353.field6781) * this.field7363 / var7;
                int var12 = ((this.field7353.field6782 * arg5 + this.field7353.field6791 * arg4 + this.field7353.field6783 * arg3 >> 14) + this.field7353.field6781) * this.field7363 / var8;
                return (var11 >= this.field7338 || var12 >= this.field7338) && (var11 <= this.field7345 || var12 <= this.field7345);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lea", name = "aa", descriptor = "()I")
    public final int method460() {
        int var1 = this.field7344;
        this.field7344 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method439(Canvas arg0) {
        if (this.field7330 == arg0) {
            this.method411((Canvas) null);
        }
        class348 var2 = (class348) this.field7333.method3828((long) arg0.hashCode(), (byte) -91);
        if (var2 != null) {
            var2.method1566(-108);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        this.field7369 = arg0;
        this.field7337.method1218(116);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Z)V")
    public final void method388(boolean arg0) {
    }

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "()V")
    public final void method327() {
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class219 method400(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class2(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([Lba;Lig;Lq;[Lpo;I)V")
    public abstract void method480(class359[] arg0, class228 arg1, class396 arg2, class524[] arg3, int arg4);

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "(IIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3) {
        this.field7352 = arg0;
        this.field7365 = arg1;
        this.field7340 = arg2;
        this.field7363 = arg3;
        this.method934();
    }

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "(I)Z")
    public final boolean method3105(int arg0) {
        return super.field8781.method2718(arg0, (byte) 72).field1811;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "()Z")
    public final boolean method488() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "()V")
    public final void method312() {
    }

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "()Z")
    public final boolean method424() {
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "()V")
    public final void method318() throws class202 {
        if (this.field7330 != null && this.field7332 != null) {
            try {
                Graphics var1 = this.field7330.getGraphics();
                this.field7332.method797(0, var1, (byte) -119, 0);
            } catch (Exception var2) {
                this.field7330.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "()V")
    public final void method374() {
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(Z)V")
    public void method455(boolean arg0) {
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFF)V")
    public final void method391(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "()V")
    public abstract void method934();

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[Lbj;)V")
    public final void method473(int arg0, class227[] arg1) {
    }

    @OriginalMember(owner = "client!lea", name = "na", descriptor = "(III[I)V")
    public final void method420(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field7353.field6787 * arg2 + this.field7353.field6788 * arg0 + this.field7353.field6784 * arg1 >> 14) + this.field7353.field6789;
        if (var5 >= this.field7351 && var5 <= this.field7356) {
            int var6 = ((this.field7353.field6786 * arg2 + this.field7353.field6785 * arg1 + this.field7353.field6780 * arg0 >> 14) + this.field7353.field6790) * this.field7340 / var5;
            int var7 = ((this.field7353.field6782 * arg2 + this.field7353.field6791 * arg1 + this.field7353.field6783 * arg0 >> 14) + this.field7353.field6781) * this.field7363 / var5;
            if (var6 >= this.field7347 && var6 <= this.field7348 && var7 >= this.field7338 && var7 <= this.field7345) {
                arg3[0] = var6 - this.field7347;
                arg3[1] = var7 - this.field7338;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method345(Rectangle[] arg0, int arg1) throws class202 {
        if (this.field7330 != null && this.field7332 != null) {
            try {
                Graphics var3 = this.field7330.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field7339 && var5.y <= this.field7373 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field7332.method795(var5.x, var5.width, var3, var5.y, var5.height, 96);
                    }
                }
            } catch (Exception var6) {
                this.field7330.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!lea", name = "SA", descriptor = "()I")
    public final int method380() {
        int var1 = this.field7355;
        this.field7355 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "(I)V")
    public abstract void method413(int arg0);

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lq;)V")
    public final void method490(class396 arg0) {
        this.field7353 = (class538) arg0;
    }

    @OriginalMember(owner = "client!lea", name = "YA", descriptor = "(IFFFFF)V")
    public final void method445(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field7368 = (int) (arg1 * 65535.0F);
        this.field7360 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field7371 = (int) (arg3 * 65535.0F / var7);
        this.field7359 = (int) (arg4 * 65535.0F / var7);
        this.field7336 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
    public final void method444(int arg0) {
    }

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "()V")
    public final void method392() {
        if (this.field7331) {
            class465.method2536(false, true, 0);
            this.field7331 = false;
        }
        this.field7332 = null;
        this.field7330 = null;
        this.field7333 = null;
        this.field7334 = true;
    }

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "()Z")
    public final boolean method3106() {
        return this.field7334;
    }

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "()Z")
    public final boolean method465() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method417(Canvas arg0) {
        class348 var2 = (class348) this.field7333.method3828((long) arg0.hashCode(), (byte) -91);
        if (var2 == null) {
            class348 var3 = class681.method3760(arg0, (byte) -109);
            this.field7333.method3832(var3, (long) arg0.hashCode(), 119);
        }
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)V")
    public final void method354(int arg0) {
        int var2 = arg0 - this.field7335;
        for (Object var3 = this.field7337.method1220((byte) 127); var3 != null; var3 = this.field7337.method1229(-114)) {
            class43 var4 = (class43) var3;
            if (var4.field599) {
                var4.field603 += var2;
                int var5 = var4.field603 / 20;
                if (var5 > 0) {
                    class152 var6 = super.field8781.method2718(var4.field602, (byte) 72);
                    var4.method265(var6.field1806 * var2 * 50 / 1000, var6.field1821 * var2 * 50 / 1000);
                    var4.field603 -= var5 * 20;
                }
                var4.field599 = false;
            }
        }
        this.field7335 = arg0;
        this.field7361.method1222(14564, 5);
        this.field7337.method1222(14564, 5);
    }

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "(I)V")
    public final void method315(int arg0) {
        this.method475(0, 0, this.field7339, this.field7373, arg0, 0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([Lba;Lq;[Lpo;I)V")
    public abstract void method491(class359[] arg0, class396 arg1, class524[] arg2, int arg3);

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class140 method412(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIIIIIIII)V")
    public abstract void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!lea", name = "IA", descriptor = "()I")
    public final int method461() {
        return this.field7356;
    }

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "(IIIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field7357) {
            var6 = this.field7357;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field7367) {
            var7 = this.field7367;
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
                if (var64 < this.field7374) {
                    var64 = this.field7374;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field7350) {
                    var65 = this.field7350;
                }
                int var66 = this.field7339 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field7376[var66++] = arg3;
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
                if (var60 < this.field7374) {
                    var60 = this.field7374;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field7350 - 1) {
                    var61 = this.field7350 - 1;
                }
                int var62 = this.field7339 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field7376[var62++] = arg3;
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
                if (var28 < this.field7374) {
                    var28 = this.field7374;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field7350) {
                    var29 = this.field7350;
                }
                int var30 = this.field7339 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field7376[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field7376[var30++] = var15 + var33;
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
                if (var22 < this.field7374) {
                    var22 = this.field7374;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field7350 - 1) {
                    var23 = this.field7350 - 1;
                }
                int var24 = this.field7339 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field7376[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field7376[var24++] = var15 + var27;
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
                if (var47 < this.field7374) {
                    var47 = this.field7374;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field7350) {
                    var48 = this.field7350;
                }
                int var49 = this.field7339 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field7376[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field7376[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field7374) {
                    var39 = this.field7374;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field7350 - 1) {
                    var40 = this.field7350 - 1;
                }
                int var41 = this.field7339 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field7376[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field7376[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "sa", descriptor = "(II)V")
    public final void method438(int arg0, int arg1) {
        this.field7351 = arg0;
        this.field7356 = arg1;
        this.field7377 = this.field7356 - 255;
        this.method3110();
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "()Z")
    public final boolean method393() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "()V")
    public final void method409() {
        this.field7372 = this.field7346;
        this.field7343 = false;
    }

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "(I)Z")
    public final boolean method3107(int arg0) {
        return super.field8781.method2717(arg0, false);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)I")
    public final int method493(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class574(Canvas arg0, class498 arg1) {
        this(arg1);
        this.method417(arg0);
        this.method411(arg0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIF)Lbj;")
    public final class227 method436(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "()Lq;")
    public final class396 method470() {
        class683 var1 = this.method937(Thread.currentThread());
        return var1.field9306;
    }

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "(I)[I")
    public final int[] method3108(int arg0) {
        class208 var2 = this.field7337;
        class43 var3;
        synchronized (this.field7337) {
            var3 = (class43) this.field7337.method1221((long) arg0, true);
            if (var3 == null) {
                if (!super.field8781.method2717(arg0, false)) {
                    return null;
                }
                class152 var5 = super.field8781.method2718(arg0, (byte) 72);
                int var6 = !var5.field1826 && !this.field7369 ? 128 : 64;
                var3 = new class43(arg0, var6, super.field8781.method2714(0.7F, arg0, var6, 19991, true, var6), var5.field1819);
                this.field7337.method1230((byte) -124, (long) arg0, var3);
            }
        }
        var3.field599 = true;
        return var3.method266();
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(IIIIII)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method454(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method454(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method437(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method437(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field7374) {
                    var10 += (this.field7374 - arg0) * var12;
                    arg0 = this.field7374;
                }
                if (var13 >= this.field7350) {
                    var13 = this.field7350 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field7357 && var17 < this.field7367) {
                                int var18 = this.field7339 * var17 + arg0;
                                int var19 = this.field7376[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field7376[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field7357 && var21 < this.field7367) {
                                int var22 = this.field7339 * var21 + arg0;
                                int var23 = this.field7376[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field7376[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field7357 && var27 < this.field7367) {
                            this.field7376[this.field7339 * var27 + arg0] = arg4;
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
                if (arg1 < this.field7357) {
                    var29 += (this.field7357 - arg1) * var31;
                    arg1 = this.field7357;
                }
                if (var32 >= this.field7367) {
                    var32 = this.field7367 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field7374 && var46 < this.field7350) {
                            this.field7376[this.field7339 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field7374 && var36 < this.field7350) {
                            int var37 = this.field7339 * arg1 + var36;
                            int var38 = this.field7376[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field7376[this.field7339 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field7374 && var40 < this.field7350) {
                            int var41 = this.field7339 * arg1 + var40;
                            int var42 = this.field7376[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field7376[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!lea", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field7339 * arg1 + arg0;
            int var15 = this.field7339 - arg2;
            if (arg1 + arg3 > this.field7367) {
                arg3 -= arg1 + arg3 - this.field7367;
            }
            if (arg1 < this.field7357) {
                int var16 = this.field7357 - arg1;
                arg3 -= var16;
                var14 += this.field7339 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field7350) {
                int var17 = arg0 + arg2 - this.field7350;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field7374) {
                int var18 = this.field7374 - arg0;
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
                            int var28 = this.field7376[var14];
                            this.field7376[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field7376[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field7376[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field7376[var14++] = arg5;
                        } else {
                            this.field7376[var14++] = arg4;
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

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lig;)V")
    public final void method485(class228 arg0) {
        class634 var2 = arg0.field2940.field6862;
        for (class634 var3 = var2.field8593; var2 != var3; var3 = var3.field8593) {
            class688 var4 = (class688) var3;
            int var5 = var4.field9471 >> 12;
            int var6 = var4.field9480 >> 12;
            int var7 = var4.field9475 >> 12;
            int var8 = (this.field7353.field6787 * var7 + this.field7353.field6788 * var5 + this.field7353.field6784 * var6 >> 14) + this.field7353.field6789;
            if (var8 >= this.field7351 && var8 <= this.field7377) {
                int var9 = ((this.field7353.field6786 * var7 + this.field7353.field6785 * var6 + this.field7353.field6780 * var5 >> 14) + this.field7353.field6790) * this.field7340 / var8 + this.field7352;
                int var10 = ((this.field7353.field6782 * var7 + this.field7353.field6791 * var6 + this.field7353.field6783 * var5 >> 14) + this.field7353.field6781) * this.field7363 / var8 + this.field7365;
                if (var9 >= this.field7374 && var9 <= this.field7350 && var10 >= this.field7357 && var10 <= this.field7367) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method936(var4, var9, var10, var8, (this.field7340 * var4.field9469 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "JA", descriptor = "(I)V")
    public final void method442(int arg0) {
    }

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "(I)Z")
    public final boolean method3109(int arg0) {
        return this.field7369 || super.field8781.method2718(arg0, (byte) 72).field1826;
    }

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "()V")
    private final void method3110() {
        if (this.field7341 != 0.0F) {
            float var1 = (float) this.field7356;
            float var2 = (float) this.field7351;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field7358 / (this.field7358 + this.field7341);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field7341;
            this.field7364 = (int) (((float) this.field7356 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field7364 = this.field7356;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "()Z")
    public final boolean method471() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method405(Canvas arg0);

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "()Z")
    public final boolean method481() {
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "KA", descriptor = "(IIII)[I")
    public final int[] method396(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field7339 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field7376[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lip;)V")
    public final void method458(class662 arg0) {
    }

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "()I")
    public final int method430() {
        return 0;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lnj;IIII)Lba;")
    public abstract class359 method408(class229 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lea", name = "ya", descriptor = "(IIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field7374 && arg0 < this.field7350) {
            if (arg1 < this.field7357) {
                arg2 -= this.field7357 - arg1;
                arg1 = this.field7357;
            }
            if (arg1 + arg2 > this.field7367) {
                arg2 = this.field7367 - arg1;
            }
            int var6 = this.field7339 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7339 * var10 + var6;
                        int var12 = this.field7376[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field7376[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field7339 * var14 + var6;
                        int var16 = this.field7376[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field7376[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field7376[this.field7339 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "(ILfa;II)V")
    public final void method426(int arg0, class219 arg1, int arg2, int arg3) {
        class2 var5 = (class2) arg1;
        int[] var6 = var5.field6;
        int[] var7 = var5.field5;
        int var8;
        if (this.field7367 < var6.length + arg3) {
            var8 = this.field7367 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field7357 > arg3) {
            var9 = this.field7357 - arg3;
            arg3 = this.field7357;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field7339 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field7374 > var12) {
                    var13 -= this.field7374 - var12;
                    var12 = this.field7374;
                }
                if (this.field7350 < var12 + var13) {
                    var13 = this.field7350 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field7376[var14++] = arg0;
                }
                var10 += this.field7339;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
    public abstract void method476(int arg0);

    @OriginalMember(owner = "client!lea", name = "Q", descriptor = "(IIII)V")
    public final void method451(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7374 < arg0) {
            this.field7374 = arg0;
        }
        if (this.field7357 < arg1) {
            this.field7357 = arg1;
        }
        if (this.field7350 > arg2) {
            this.field7350 = arg2;
        }
        if (this.field7367 > arg3) {
            this.field7367 = arg3;
        }
        this.method934();
    }

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "(IIIIII)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field7374) {
            arg2 -= this.field7374 - arg0;
            arg0 = this.field7374;
        }
        if (arg1 < this.field7357) {
            arg3 -= this.field7357 - arg1;
            arg1 = this.field7357;
        }
        if (arg0 + arg2 > this.field7350) {
            arg2 = this.field7350 - arg0;
        }
        if (arg1 + arg3 > this.field7367) {
            arg3 = this.field7367 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field7350 && arg1 <= this.field7367) {
            int var7 = this.field7339 - arg2;
            int var8 = this.field7339 * arg1 + arg0;
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
                            this.field7376[var24] = arg4;
                            ++var24;
                            this.field7376[var24] = arg4;
                            ++var24;
                            this.field7376[var24] = arg4;
                            ++var24;
                            this.field7376[var24] = arg4;
                            ++var24;
                            this.field7376[var24] = arg4;
                            ++var24;
                            this.field7376[var24] = arg4;
                            ++var24;
                            this.field7376[var24] = arg4;
                            ++var24;
                            this.field7376[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field7376[var24] = arg4;
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
                        int var14 = this.field7376[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field7376[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field7376[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field7376[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "()V")
    public final void method410() {
        this.field7374 = 0;
        this.field7357 = 0;
        this.field7350 = this.field7339;
        this.field7367 = this.field7373;
        this.method934();
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lba;Lig;Lq;Lpo;I)V")
    public final void method427(class359 arg0, class228 arg1, class396 arg2, class524 arg3, int arg4) {
        ((class651) arg0).method3638(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "()V")
    public abstract void method336();

    @OriginalMember(owner = "client!lea", name = "ha", descriptor = "(F)V")
    public final void method449(float arg0) {
        this.field7370 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!lea", name = "U", descriptor = "()I")
    public final int method423() {
        return this.field7351;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lip;Lip;FLip;)Lip;")
    public final class662 method351(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "()Z")
    public final boolean method432() {
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "()Z")
    public final boolean method477() {
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class468 method433(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field7339 * arg1 + arg0;
        int var8 = this.field7339 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field7376[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class298(this, var6, arg2, arg3);
        } else {
            return new class533(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(IIIII)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field7357 && arg1 < this.field7367) {
            if (arg0 < this.field7374) {
                arg2 -= this.field7374 - arg0;
                arg0 = this.field7374;
            }
            if (arg0 + arg2 > this.field7350) {
                arg2 = this.field7350 - arg0;
            }
            int var6 = this.field7339 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field7376[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field7376[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field7376[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field7376[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field7376[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lfm;IIII)V")
    public abstract void method936(class688 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lea", name = "X", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        this.field7372 = arg0 & 16777215;
        int var4 = this.field7372 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field7372 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field7372 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field7372 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field7375 = false;
        } else {
            this.field7375 = true;
        }
    }

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "()V")
    public void method322() {
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIII)V")
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method454(arg0, arg1, arg2, arg4, arg5);
        this.method454(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method437(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method437(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "()V")
    public final void method401() {
        this.field7337.method1218(102);
        this.field7361.method1218(125);
    }

    @OriginalMember(owner = "client!lea", name = "LA", descriptor = "(IIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        this.field7342 = arg0;
        this.field7372 = arg1;
        this.field7354 = arg2;
    }

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "([I)V")
    public final void method478(int[] arg0) {
        arg0[0] = this.field7374;
        arg0[1] = this.field7357;
        arg0[2] = this.field7350;
        arg0[3] = this.field7367;
    }
}
