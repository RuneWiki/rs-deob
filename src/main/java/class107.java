import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class107 extends class638 {

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "Z")
    private boolean field1430;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "Z")
    private boolean field1431;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "Loj;")
    public class346 field1428;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "Z")
    private boolean field1435;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!fv", name = "Z", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!fv", name = "Y", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!fv", name = "cb", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!fv", name = "fb", descriptor = "Z")
    public boolean field1467;

    @OriginalMember(owner = "client!fv", name = "P", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!fv", name = "S", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!fv", name = "T", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!fv", name = "ib", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client!fv", name = "kb", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!fv", name = "Q", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!fv", name = "nb", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!fv", name = "mb", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!fv", name = "eb", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!fv", name = "hb", descriptor = "Lvh;")
    public class328 field1469;

    @OriginalMember(owner = "client!fv", name = "pb", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "Lvh;")
    private class328 field1443;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "Leq;")
    public class193 field1439;

    @OriginalMember(owner = "client!fv", name = "X", descriptor = "F")
    private float field1459;

    @OriginalMember(owner = "client!fv", name = "lb", descriptor = "F")
    private float field1473;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!fv", name = "R", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!fv", name = "V", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!fv", name = "W", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!fv", name = "ab", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!fv", name = "db", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!fv", name = "gb", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "Lkg;")
    public class246 field1433;

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "Lxa;")
    public class461 field1447;

    @OriginalMember(owner = "client!fv", name = "ob", descriptor = "Lxa;")
    public class461 field1476;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1429;

    @OriginalMember(owner = "client!fv", name = "bb", descriptor = "Z")
    public boolean field1463;

    @OriginalMember(owner = "client!fv", name = "jb", descriptor = "[I")
    public int[] field1471;

    @OriginalMember(owner = "client!fv", name = "U", descriptor = "[Lvd;")
    public class36[] field1456;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([IIIII)Lxa;", line = 4)
    public final class461 method452(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class541(this, arg0, arg1, arg2, arg3, arg4) : new class40(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class541(this, arg0, arg1, arg2, arg3, arg4) : new class40(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "()Z", line = 39)
    public final boolean method476() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "()V", line = 41)
    public final void method327() {
    }

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "(IIII)V", line = 45)
    public final void method404(int arg0, int arg1, int arg2, int arg3) {
        this.field1468 = arg0;
        this.field1442 = arg1;
        this.field1466 = arg2;
        this.field1461 = arg3;
        this.method380();
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "()I", line = 52)
    public final int method473() {
        return 0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIII)Lka;", line = 55)
    public final class434 method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "()Lq;", line = 59)
    public final class391 method459() {
        return new class193();
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "()Lq;", line = 63)
    public final class391 method401() {
        class36 var1 = this.method392(Thread.currentThread());
        return var1.field451;
    }

    @OriginalMember(owner = "client!fv", name = "X", descriptor = "(III)V", line = 67)
    public final void method453(int arg0, int arg1, int arg2) {
        this.field1455 = arg0 & 16777215;
        int var4 = this.field1455 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field1455 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field1455 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field1455 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field1463 = false;
        } else {
            this.field1463 = true;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lka;Lka;FLka;)Lka;", line = 91)
    public final class434 method317(class434 arg0, class434 arg1, float arg2, class434 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(IIIIII)V", line = 96)
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method445(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method445(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method414(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method414(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field1440) {
                    var10 += (this.field1440 - arg0) * var12;
                    arg0 = this.field1440;
                }
                if (var13 >= this.field1446) {
                    var13 = this.field1446 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field1470 && var17 < this.field1450) {
                                int var18 = this.field1453 * var17 + arg0;
                                int var19 = this.field1471[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field1471[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field1470 && var21 < this.field1450) {
                                int var22 = this.field1453 * var21 + arg0;
                                int var23 = this.field1471[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field1471[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field1470 && var27 < this.field1450) {
                            this.field1471[this.field1453 * var27 + arg0] = arg4;
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
                if (arg1 < this.field1470) {
                    var29 += (this.field1470 - arg1) * var31;
                    arg1 = this.field1470;
                }
                if (var32 >= this.field1450) {
                    var32 = this.field1450 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field1440 && var46 < this.field1446) {
                            this.field1471[this.field1453 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field1440 && var36 < this.field1446) {
                            int var37 = this.field1453 * arg1 + var36;
                            int var38 = this.field1471[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field1471[this.field1453 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field1440 && var40 < this.field1446) {
                            int var41 = this.field1453 * arg1 + var40;
                            int var42 = this.field1471[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field1471[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!fv", name = "FA", descriptor = "(IIIIII)Z", line = 310)
    public final boolean method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field1439.field2849 * arg2 + this.field1439.field2856 * arg0 + this.field1439.field2852 * arg1 >> 14) + this.field1439.field2855;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field1439.field2849 * arg5 + this.field1439.field2856 * arg3 + this.field1439.field2852 * arg4 >> 14) + this.field1439.field2855;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field1452 || var8 >= this.field1452) && (var7 <= this.field1438 || var8 <= this.field1438)) {
            int var9 = ((this.field1439.field2854 * arg2 + this.field1439.field2853 * arg1 + this.field1439.field2851 * arg0 >> 14) + this.field1439.field2847) * this.field1466 / var7;
            int var10 = ((this.field1439.field2854 * arg5 + this.field1439.field2853 * arg4 + this.field1439.field2851 * arg3 >> 14) + this.field1439.field2847) * this.field1466 / var8;
            if (var9 < this.field1465 && var10 < this.field1465 || var9 > this.field1445 && var10 > this.field1445) {
                return false;
            } else {
                int var11 = ((this.field1439.field2850 * arg2 + this.field1439.field2848 * arg1 + this.field1439.field2845 * arg0 >> 14) + this.field1439.field2846) * this.field1461 / var7;
                int var12 = ((this.field1439.field2850 * arg5 + this.field1439.field2848 * arg4 + this.field1439.field2845 * arg3 >> 14) + this.field1439.field2846) * this.field1461 / var8;
                return (var11 >= this.field1457 || var12 >= this.field1457) && (var11 <= this.field1448 || var12 <= this.field1448);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "(ILfa;II)V", line = 340)
    public final void method425(int arg0, class212 arg1, int arg2, int arg3) {
        class291 var5 = (class291) arg1;
        int[] var6 = var5.field4386;
        int[] var7 = var5.field4384;
        int var8;
        if (this.field1450 < var6.length + arg3) {
            var8 = this.field1450 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field1470 > arg3) {
            var9 = this.field1470 - arg3;
            arg3 = this.field1470;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field1453 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field1440 > var12) {
                    var13 -= this.field1440 - var12;
                    var12 = this.field1440;
                }
                if (this.field1446 < var12 + var13) {
                    var13 = this.field1446 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field1471[var14++] = arg0;
                }
                var10 += this.field1453;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "()V", line = 400)
    public final void method805() {
        for (int var1 = 0; var1 < this.field1462; ++var1) {
            this.field1456[var1].method171(896);
        }
        this.method449();
    }

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)V", line = 408)
    public void method382(int arg0) {
        this.field1456[arg0].method172((byte) -101, Thread.currentThread());
    }

    @OriginalMember(owner = "client!fv", name = "aa", descriptor = "()I", line = 412)
    public final int method471() {
        int var1 = this.field1437;
        this.field1437 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "(I)V", line = 417)
    public final void method310(int arg0) {
        this.method472(0, 0, this.field1453, this.field1444, arg0, 0);
    }

    @OriginalMember(owner = "client!fv", name = "AA", descriptor = "(IIII)V", line = 421)
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        this.field1436 = this.field1455;
        this.field1454 = arg0;
        this.field1455 = arg1;
        this.field1472 = arg2;
        this.field1467 = true;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(Z)V", line = 430)
    public final void method422(boolean arg0) {
        this.field1435 = arg0;
        this.field1443.method1997(1);
    }

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "()Z", line = 434)
    public final boolean method426() {
        return true;
    }

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "(IIIII)V", line = 438)
    public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field1470) {
            var6 = this.field1470;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field1450) {
            var7 = this.field1450;
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
                if (var64 < this.field1440) {
                    var64 = this.field1440;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field1446) {
                    var65 = this.field1446;
                }
                int var66 = this.field1453 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field1471[var66++] = arg3;
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
                if (var60 < this.field1440) {
                    var60 = this.field1440;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field1446 - 1) {
                    var61 = this.field1446 - 1;
                }
                int var62 = this.field1453 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field1471[var62++] = arg3;
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
                if (var28 < this.field1440) {
                    var28 = this.field1440;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field1446) {
                    var29 = this.field1446;
                }
                int var30 = this.field1453 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field1471[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field1471[var30++] = var15 + var33;
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
                if (var22 < this.field1440) {
                    var22 = this.field1440;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field1446 - 1) {
                    var23 = this.field1446 - 1;
                }
                int var24 = this.field1453 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field1471[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field1471[var24++] = var15 + var27;
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
                if (var47 < this.field1440) {
                    var47 = this.field1440;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field1446) {
                    var48 = this.field1446;
                }
                int var49 = this.field1453 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field1471[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field1471[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field1440) {
                    var39 = this.field1440;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field1446 - 1) {
                    var40 = this.field1446 - 1;
                }
                int var41 = this.field1453 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field1471[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field1471[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "()I", line = 725)
    public final int method400() {
        return 0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIF)Lld;", line = 729)
    public final class154 method457(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!fv", name = "ya", descriptor = "(IIIII)V", line = 734)
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field1440 && arg0 < this.field1446) {
            if (arg1 < this.field1470) {
                arg2 -= this.field1470 - arg1;
                arg1 = this.field1470;
            }
            if (arg1 + arg2 > this.field1450) {
                arg2 = this.field1450 - arg1;
            }
            int var6 = this.field1453 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1453 * var10 + var6;
                        int var12 = this.field1471[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field1471[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field1453 * var14 + var6;
                        int var16 = this.field1471[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field1471[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field1471[this.field1453 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "()Z", line = 810)
    public final boolean method417() {
        return true;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 813)
    public class107(Canvas arg0, class489 arg1) {
        this(arg1);
        this.method413(arg0);
        this.method381(arg0);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)I", line = 819)
    public final int method444(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fv", name = "JA", descriptor = "(I)V", line = 821)
    public final void method402(int arg0) {
    }

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "()V", line = 824)
    private final void method806() {
        if (this.field1473 != 0.0F) {
            float var1 = (float) this.field1438;
            float var2 = (float) this.field1452;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field1459 / (this.field1473 + this.field1459);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field1473;
            this.field1451 = (int) (((float) this.field1438 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field1451 = this.field1438;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lhfa;)V", line = 846)
    public final void method419(class281 arg0) {
        class226 var2 = arg0.field3924.field5393;
        for (class226 var3 = var2.field3254; var2 != var3; var3 = var3.field3254) {
            class429 var4 = (class429) var3;
            int var5 = var4.field6025 >> 12;
            int var6 = var4.field6021 >> 12;
            int var7 = var4.field6031 >> 12;
            int var8 = (this.field1439.field2849 * var7 + this.field1439.field2856 * var5 + this.field1439.field2852 * var6 >> 14) + this.field1439.field2855;
            if (var8 >= this.field1452 && var8 <= this.field1464) {
                int var9 = ((this.field1439.field2854 * var7 + this.field1439.field2853 * var6 + this.field1439.field2851 * var5 >> 14) + this.field1439.field2847) * this.field1466 / var8 + this.field1468;
                int var10 = ((this.field1439.field2850 * var7 + this.field1439.field2848 * var6 + this.field1439.field2845 * var5 >> 14) + this.field1439.field2846) * this.field1461 / var8 + this.field1442;
                if (var9 >= this.field1440 && var9 <= this.field1446 && var10 >= this.field1470 && var10 <= this.field1450) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method389(var4, var9, var10, var8, (this.field1466 * var4.field6028 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "()V", line = 881)
    public final void method325() {
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFF)V", line = 884)
    public final void method322(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)V", line = 888)
    public final void method299(int arg0) {
        int var2 = arg0 - this.field1432;
        for (Object var3 = this.field1443.method1990(1); var3 != null; var3 = this.field1443.method1998(1)) {
            class611 var4 = (class611) var3;
            if (var4.field8483) {
                var4.field8481 += var2;
                int var5 = var4.field8481 / 20;
                if (var5 > 0) {
                    class269 var6 = super.field9050.method588(-26679, var4.field8482);
                    var4.method3375(var6.field3808 * var2 * 50 / 1000, var6.field3806 * var2 * 50 / 1000);
                    var4.field8481 -= var5 * 20;
                }
                var4.field8483 = false;
            }
        }
        this.field1432 = arg0;
        this.field1469.method1989(5, (byte) 118);
        this.field1443.method1989(5, (byte) 99);
    }

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "()V", line = 920)
    public final void method306() {
        if (this.field1431) {
            class256.method1572(false, false, true);
            this.field1431 = false;
        }
        this.field1433 = null;
        this.field1429 = null;
        this.field1428 = null;
        this.field1430 = true;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIILfa;II)V", line = 933)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8) {
        class291 var10 = (class291) arg6;
        int[] var11 = var10.field4386;
        int[] var12 = var10.field4384;
        int var13 = this.field1470 > arg8 ? this.field1470 : arg8;
        int var14 = this.field1450 < var11.length + arg8 ? this.field1450 : var11.length + arg8;
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
            if (arg0 < this.field1440) {
                var18 += (this.field1440 - arg0) * var20;
                arg0 = this.field1440;
            }
            if (var21 >= this.field1446) {
                var21 = this.field1446 - 1;
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
                                int var28 = this.field1453 * var25 + arg0;
                                int var29 = this.field1471[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field1471[var28] = var23 + var30;
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
                                int var34 = this.field1453 * var31 + arg0;
                                int var35 = this.field1471[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field1471[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field1471[this.field1453 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field1440 && var64 < this.field1446 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field1471[this.field1453 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field1440 && var50 < this.field1446 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field1453 * arg1 + var50;
                        int var54 = this.field1471[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field1471[this.field1453 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field1440 && var56 < this.field1446 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field1453 * arg1 + var56;
                        int var60 = this.field1471[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field1471[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)[I", line = 1172)
    public final int[] method807(int arg0) {
        class328 var2 = this.field1443;
        class611 var3;
        synchronized (this.field1443) {
            var3 = (class611) this.field1443.method1986((byte) -107, (long) arg0);
            if (var3 == null) {
                if (!super.field9050.method590(arg0, (byte) -50)) {
                    return null;
                }
                class269 var5 = super.field9050.method588(-26679, arg0);
                int var6 = !var5.field3823 && !this.field1435 ? 128 : 64;
                var3 = new class611(arg0, var6, super.field9050.method582(var6, var6, 23117, true, arg0, 0.7F), var5.field3819);
                this.field1443.method1985(var3, (long) arg0, (byte) -102);
            }
        }
        var3.field8483 = true;
        return var3.method3374();
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)Li;", line = 1193)
    public final class37 method438(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[Lld;)V", line = 1195)
    public final void method398(int arg0, class154[] arg1) {
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lkq;Z)Lxa;", line = 1199)
    public final class461 method412(class543 arg0, boolean arg1) {
        int[] var3 = arg0.field7376;
        byte[] var4 = arg0.field7378;
        int var5 = arg0.field7377;
        int var6 = arg0.field7373;
        class6 var11;
        if (arg1 && arg0.field7380 == null) {
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
            var11 = new class58(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field7380;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class541(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class40(this, var14, var5, var6);
            }
        }
        var11.method34(arg0.field7375, arg0.field7374, arg0.field7381, arg0.field7379);
        return var11;
    }

    @OriginalMember(owner = "client!fv", name = "KA", descriptor = "(IIII)[I", line = 1304)
    public final int[] method360(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field1453 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field1471[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[I[I)Lfa;", line = 1331)
    public final class212 method469(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class291(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "()V", line = 1335)
    public final void method365() throws class211 {
        if (this.field1429 != null && this.field1433 != null) {
            try {
                Graphics var1 = this.field1429.getGraphics();
                this.field1433.method1524(var1, 22249, 0, 0);
            } catch (Exception var2) {
                this.field1429.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)V", line = 1351)
    public final void method342(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIZ)Lxa;", line = 1355)
    public final class461 method420(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field1453 * arg1 + arg0;
        int var8 = this.field1453 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field1471[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class541(this, var6, arg2, arg3);
        } else {
            return new class40(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(Li;)V", line = 1387)
    public final void method421(class37 arg0) {
    }

    @OriginalMember(owner = "client!fv", name = "ha", descriptor = "(F)V", line = 1390)
    public final void method465(float arg0) {
        this.field1460 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(Z)V", line = 1392)
    public void method387(boolean arg0) {
    }

    @OriginalMember(owner = "client!fv", name = "YA", descriptor = "(IFFFFF)V", line = 1397)
    public final void method450(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field1475 = (int) (arg1 * 65535.0F);
        this.field1474 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field1449 = (int) (arg3 * 65535.0F / var7);
        this.field1458 = (int) (arg4 * 65535.0F / var7);
        this.field1441 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!fv", name = "ca", descriptor = "(IIII)V", line = 1406)
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field1453) {
            arg2 = this.field1453;
        }
        if (arg3 > this.field1444) {
            arg3 = this.field1444;
        }
        this.field1440 = arg0;
        this.field1446 = arg2;
        this.field1470 = arg1;
        this.field1450 = arg3;
        this.method380();
    }

    @OriginalMember(owner = "client!fv", name = "ka", descriptor = "(FF)V", line = 1425)
    public final void method462(float arg0, float arg1) {
        this.field1459 = arg0;
        this.field1473 = arg1;
        this.method806();
    }

    @OriginalMember(owner = "client!fv", name = "SA", descriptor = "()I", line = 1433)
    public final int method356() {
        int var1 = this.field1434;
        this.field1434 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "([I)V", line = 1438)
    public final void method416(int[] arg0) {
        arg0[0] = this.field1440;
        arg0[1] = this.field1470;
        arg0[2] = this.field1446;
        arg0[3] = this.field1450;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lka;)V", line = 1444)
    public final void method432(class434 arg0) {
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lq;)V", line = 1447)
    public final void method446(class391 arg0) {
        this.field1439 = (class193) arg0;
    }

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)[I", line = 1451)
    public final int[] method808(int arg0) {
        class328 var2 = this.field1443;
        class611 var3;
        synchronized (this.field1443) {
            var3 = (class611) this.field1443.method1986((byte) -92, (long) arg0);
            if (var3 == null) {
                if (!super.field9050.method590(arg0, (byte) -50)) {
                    return null;
                }
                class269 var5 = super.field9050.method588(-26679, arg0);
                int var6 = !var5.field3823 && !this.field1435 ? 128 : 64;
                var3 = new class611(arg0, var6, super.field9050.method586(arg0, var6, 0.7F, var6, true, 109), var5.field3819);
                this.field1443.method1985(var3, (long) arg0, (byte) -102);
            }
        }
        var3.field8483 = true;
        return var3.method3374();
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(IIIIII)V", line = 1471)
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method445(arg0, arg1, arg2, arg4, arg5);
        this.method445(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method414(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method414(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "()Z", line = 1477)
    public final boolean method440() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1481)
    public final void method413(Canvas arg0) {
        class246 var2 = (class246) this.field1428.method2061(-17305, (long) arg0.hashCode());
        if (var2 == null) {
            class246 var3 = class397.method2257(73, arg0);
            this.field1428.method2063((long) arg0.hashCode(), 1, var3);
        }
    }

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "()Z", line = 1490)
    public final boolean method407() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "(I)Z", line = 1493)
    public final boolean method809(int arg0) {
        return super.field9050.method588(-26679, arg0).field3805;
    }

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "()V", line = 1495)
    public void method344() {
    }

    @OriginalMember(owner = "client!fv", name = "ma", descriptor = "(IIIIII[BII)V", line = 1498)
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field1453 * arg1 + arg0;
            int var15 = this.field1453 - arg2;
            if (arg1 + arg3 > this.field1450) {
                arg3 -= arg1 + arg3 - this.field1450;
            }
            if (arg1 < this.field1470) {
                int var16 = this.field1470 - arg1;
                arg3 -= var16;
                var14 += this.field1453 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field1446) {
                int var17 = arg0 + arg2 - this.field1446;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field1440) {
                int var18 = this.field1440 - arg0;
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
                            int var28 = this.field1471[var14];
                            this.field1471[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field1471[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field1471[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field1471[var14++] = arg5;
                        } else {
                            this.field1471[var14++] = arg4;
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

    @OriginalMember(owner = "client!fv", name = "IA", descriptor = "()I", line = 1673)
    public final int method474() {
        return this.field1438;
    }

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "()V", line = 1676)
    public final void method296() {
    }

    @OriginalMember(owner = "client!fv", name = "sa", descriptor = "(II)V", line = 1679)
    public final void method428(int arg0, int arg1) {
        this.field1452 = arg0;
        this.field1438 = arg1;
        this.field1464 = this.field1438 - 255;
        this.method806();
    }

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "()Z", line = 1686)
    public final boolean method297() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "(IIIIII)V", line = 1689)
    public final void method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field1440) {
            arg2 -= this.field1440 - arg0;
            arg0 = this.field1440;
        }
        if (arg1 < this.field1470) {
            arg3 -= this.field1470 - arg1;
            arg1 = this.field1470;
        }
        if (arg0 + arg2 > this.field1446) {
            arg2 = this.field1446 - arg0;
        }
        if (arg1 + arg3 > this.field1450) {
            arg3 = this.field1450 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field1446 && arg1 <= this.field1450) {
            int var7 = this.field1453 - arg2;
            int var8 = this.field1453 * arg1 + arg0;
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
                            this.field1471[var24] = arg4;
                            ++var24;
                            this.field1471[var24] = arg4;
                            ++var24;
                            this.field1471[var24] = arg4;
                            ++var24;
                            this.field1471[var24] = arg4;
                            ++var24;
                            this.field1471[var24] = arg4;
                            ++var24;
                            this.field1471[var24] = arg4;
                            ++var24;
                            this.field1471[var24] = arg4;
                            ++var24;
                            this.field1471[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field1471[var24] = arg4;
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
                        int var14 = this.field1471[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field1471[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field1471[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field1471[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lmj;[Lkq;Z)Lta;", line = 1825)
    public final class194 method405(class599 arg0, class543[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7377;
            var5[var7] = arg1[var7].field7373;
            if (arg1[var7].field7380 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class304(this, arg0, arg1, var4, var5);
            } else {
                return new class501(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class484(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "()Z", line = 1862)
    public final boolean method423() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1865)
    public final void method437(Canvas arg0) {
        if (this.field1429 == arg0) {
            this.method381((Canvas) null);
        }
        class246 var2 = (class246) this.field1428.method2061(-17305, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2971(1);
        }
    }

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "()Z", line = 1876)
    public final boolean method424() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "()Z", line = 1879)
    public final boolean method436() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "()V", line = 1883)
    public final void method460() {
        this.field1443.method1997(1);
        this.field1469.method1997(1);
    }

    @OriginalMember(owner = "client!fv", name = "LA", descriptor = "(IIII)V", line = 1887)
    public final void method410(int arg0, int arg1, int arg2, int arg3) {
        this.field1454 = arg0;
        this.field1455 = arg1;
        this.field1472 = arg2;
    }

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "()V", line = 1892)
    public final void method406() {
        this.field1455 = this.field1436;
        this.field1467 = false;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Le;)V", line = 1992)
    private class107(class489 arg0) {
        super(arg0);
        this.field1430 = false;
        this.field1431 = false;
        this.field1428 = new class346(4);
        this.field1436 = 0;
        this.field1438 = 3500;
        this.field1446 = 0;
        this.field1435 = false;
        this.field1440 = 0;
        this.field1461 = 512;
        this.field1460 = 75518;
        this.field1437 = 0;
        this.field1464 = this.field1438 - 255;
        this.field1450 = 0;
        this.field1467 = false;
        this.field1451 = 3500;
        this.field1454 = 0;
        this.field1455 = 0;
        this.field1470 = 0;
        this.field1434 = 0;
        this.field1472 = 0;
        this.field1452 = 50;
        this.field1475 = 45823;
        this.field1474 = 78642;
        this.field1466 = 512;
        this.field1469 = new class328(16);
        this.field1477 = -1;
        this.field1443 = new class328(256);
        this.field1439 = new class193();
        this.method386(1);
        this.method382(0);
        class256.method1570(false, true, -67);
        this.field1431 = true;
    }

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "()Z", line = 1903)
    public final boolean method447() {
        return true;
    }

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "()Z", line = 1908)
    public final boolean method408() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "Q", descriptor = "(IIII)V", line = 1912)
    public final void method433(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1440 < arg0) {
            this.field1440 = arg0;
        }
        if (this.field1470 < arg1) {
            this.field1470 = arg1;
        }
        if (this.field1446 > arg2) {
            this.field1446 = arg2;
        }
        if (this.field1450 > arg3) {
            this.field1450 = arg3;
        }
        this.method380();
    }

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "()Z", line = 1930)
    public final boolean method461() {
        return true;
    }

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "(I)Z", line = 1933)
    public final boolean method810(int arg0) {
        return super.field9050.method590(arg0, (byte) -50);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "()Lfea;", line = 1936)
    public final class127 method340() {
        return new class127(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lba;Lhfa;Lq;Lrc;I)V", line = 1940)
    public final void method434(class352 arg0, class281 arg1, class391 arg2, class494 arg3, int arg4) {
        ((class636) arg0).method3536(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "()V", line = 1949)
    public final void method449() {
        this.field1440 = 0;
        this.field1470 = 0;
        this.field1446 = this.field1453;
        this.field1450 = this.field1444;
        this.method380();
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I", line = 1956)
    public final int method431(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "()Z", line = 1960)
    public final boolean method308() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "(I)I", line = 1963)
    public final int method811(int arg0) {
        return super.field9050.method588(-26679, arg0).field3817 & 65535;
    }

    @OriginalMember(owner = "client!fv", name = "U", descriptor = "()I", line = 1966)
    public final int method451() {
        return this.field1452;
    }

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)V", line = 1968)
    public final void method448(int arg0) {
    }

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "(I)Z", line = 1971)
    public final boolean method812(int arg0) {
        return this.field1435 || super.field9050.method588(-26679, arg0).field3823;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "()Z", line = 1989)
    public final boolean method411() {
        return false;
    }

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "()V", line = 2002)
    public final void method358() {
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(Z)V", line = 2007)
    public final void method352(boolean arg0) {
    }

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "()Z", line = 2012)
    public final boolean method813() {
        return this.field1430;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2063)
    public final void method319(Rectangle[] arg0, int arg1) throws class211 {
        if (this.field1429 != null && this.field1433 != null) {
            try {
                Graphics var3 = this.field1429.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field1453 && var5.y <= this.field1444 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field1433.method1522(var5.height, var5.width, var5.y, var3, (byte) -117, var5.x);
                    }
                }
            } catch (Exception var6) {
                this.field1429.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(IIIII)V", line = 2110)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field1470 && arg1 < this.field1450) {
            if (arg0 < this.field1440) {
                arg2 -= this.field1440 - arg0;
                arg0 = this.field1440;
            }
            if (arg0 + arg2 > this.field1446) {
                arg2 = this.field1446 - arg0;
            }
            int var6 = this.field1453 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1471[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field1471[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field1471[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field1471[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field1471[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "na", descriptor = "(III[I)V", line = 2186)
    public final void method443(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field1439.field2849 * arg2 + this.field1439.field2856 * arg0 + this.field1439.field2852 * arg1 >> 14) + this.field1439.field2855;
        if (var5 >= this.field1452 && var5 <= this.field1438) {
            int var6 = ((this.field1439.field2854 * arg2 + this.field1439.field2853 * arg1 + this.field1439.field2851 * arg0 >> 14) + this.field1439.field2847) * this.field1466 / var5;
            int var7 = ((this.field1439.field2850 * arg2 + this.field1439.field2848 * arg1 + this.field1439.field2845 * arg0 >> 14) + this.field1439.field2846) * this.field1461 / var5;
            if (var6 >= this.field1465 && var6 <= this.field1445 && var7 >= this.field1457 && var7 <= this.field1448) {
                arg3[0] = var6 - this.field1465;
                arg3[1] = var7 - this.field1457;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method381(Canvas arg0);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lcq;IIII)V")
    public abstract void method389(class429 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lhn;IIII)Lba;")
    public abstract class352 method379(class661 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([Lba;Lhfa;Lq;[Lrc;I)V")
    public abstract void method390(class352[] arg0, class281 arg1, class391 arg2, class494[] arg3, int arg4);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([Lba;Lq;[Lrc;I)V")
    public abstract void method393(class352[] arg0, class391 arg1, class494[] arg2, int arg3);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
    public abstract void method386(int arg0);

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method395(Canvas arg0);

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "()V")
    public abstract void method380();

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    public abstract void method394(int arg0);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/Runnable;)Lvd;")
    public abstract class36 method392(Runnable arg0);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class136 method383(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "()Z")
    public abstract boolean method385();

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(IIIIIIIIII)V")
    public abstract void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);
}
