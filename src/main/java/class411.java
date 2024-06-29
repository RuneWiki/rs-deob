import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class411 extends class280 {

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    private int field5819 = 0;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public int field5828 = 512;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    private int field5825 = 0;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    private int field5816 = 0;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public int field5838 = 0;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Z")
    private boolean field5820 = false;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    private int field5818 = 3500;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public int field5841 = 78642;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public int field5836 = 3500;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public int field5834 = 0;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "Z")
    private boolean field5849 = false;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public int field5844 = this.field5818 - 255;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public int field5853 = 50;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
    public int field5857 = 0;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public int field5852 = 0;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public int field5835 = 75518;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public int field5858 = 45823;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public int field5854 = 512;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public int field5845 = 0;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public int field5839 = 0;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public int field5847 = 0;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Z")
    private boolean field5859 = false;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "Z")
    public boolean field5861 = false;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lco;")
    private class210 field5833 = new class210(16);

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5842;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "Ljq;")
    private class200 field5856;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "[I")
    public int[] field5817;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    private int field5823;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "F")
    private float field5826;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "F")
    private float field5827;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    private int field5821;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public int field5830;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public int field5831;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public int field5832;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public int field5846;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public int field5855;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Llr;")
    public class114 field5850;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lco;")
    private class210 field5822;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "Lsh;")
    private class367 field5862;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "Z")
    public boolean field5851;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "[Lpp;")
    private class284[] field5824;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIZ)Lrg;", line = 4)
    public final class395 method1461(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5860 * arg1 + arg0;
        int var8 = this.field5860 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5817[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class321(this, var6, arg2, arg3);
        } else {
            return new class449(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V", line = 36)
    public final void method1444(int arg0) {
        this.method1483(0, 0, this.field5860, this.field5823, arg0, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lar;III)V", line = 40)
    public final void method2431(class52 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field673;
        if (var6 == -1) {
            this.method1448(arg1, arg2, var5, arg0.field684, 1);
        } else {
            if (this.field5862 == null || (long) var6 != this.field5862.field1776) {
                this.field5862 = (class367) this.field5833.method1163((byte) 115, (long) var6);
            }
            if (this.field5862 == null) {
                int[] var7 = this.method2433(var6);
                if (var7 == null) {
                    return;
                }
                this.field5862 = new class367();
                this.field5862.field5252 = this.method2439(var6);
                int var8 = this.field5862.field5252 ? 64 : 128;
                this.field5862.field5249 = this.method1355(var7, 0, var8, var8, var8);
                this.field5833.method1172((long) var6, 1, this.field5862);
            }
            if (this.field5862.field5252) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field5862.field5249.method225(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field684, 1);
        }
    }

    @OriginalMember(owner = "client!d", name = "q", descriptor = "()Lbd;", line = 80)
    public final class327 method1344() {
        return new class114();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 82)
    public final void method1376(boolean arg0) {
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V", line = 87)
    public final void method1350(int arg0) {
        int var2 = arg0 - this.field5821;
        for (Object var3 = this.field5822.method1176(0); var3 != null; var3 = this.field5822.method1173((byte) -99)) {
            class452 var4 = (class452) var3;
            if (var4.field6393) {
                var4.field6389 += var2;
                int var5 = var4.field6389 / 20;
                if (var5 > 0) {
                    class189 var6 = super.field4073.method577(var4.field6390, -121);
                    var4.method2642(var6.field2574 * var2 * 50 / 1000, var6.field2586 * var2 * 50 / 1000);
                    var4.field6389 -= var5 * 20;
                }
                var4.field6393 = false;
            }
        }
        this.field5821 = arg0;
        this.field5833.method1166(5, (byte) -52);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lbd;)V", line = 118)
    public final void method1404(class327 arg0) {
        this.field5850 = (class114) arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIILhg;II)V", line = 123)
    public final void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class313 arg6, int arg7, int arg8) {
        class471 var10 = (class471) arg6;
        int[] var11 = var10.field6637;
        int[] var12 = var10.field6639;
        int var13 = this.field5847 > arg8 ? this.field5847 : arg8;
        int var14 = this.field5838 < var11.length + arg8 ? this.field5838 : var11.length + arg8;
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
            if (arg0 < this.field5857) {
                var18 += (this.field5857 - arg0) * var20;
                arg0 = this.field5857;
            }
            if (var21 >= this.field5839) {
                var21 = this.field5839 - 1;
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
                                int var28 = this.field5860 * var25 + arg0;
                                int var29 = this.field5817[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5817[var28] = var23 + var30;
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
                                int var34 = this.field5860 * var31 + arg0;
                                int var35 = this.field5817[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5817[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5817[this.field5860 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5857 && var64 < this.field5839 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5817[this.field5860 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5857 && var50 < this.field5839 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5860 * arg1 + var50;
                        int var54 = this.field5817[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5817[this.field5860 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5857 && var56 < this.field5839 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5860 * arg1 + var56;
                        int var60 = this.field5817[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5817[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(IIIII)V", line = 361)
    public final void method1364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5847 && arg1 < this.field5838) {
            if (arg0 < this.field5857) {
                arg2 -= this.field5857 - arg0;
                arg0 = this.field5857;
            }
            if (arg0 + arg2 > this.field5839) {
                arg2 = this.field5839 - arg0;
            }
            int var6 = this.field5860 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5817[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5817[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5817[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5817[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5817[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "G", descriptor = "()V", line = 434)
    public final void method1450() {
    }

    @OriginalMember(owner = "client!d", name = "k", descriptor = "()V", line = 437)
    public final void method1445() {
        this.field5822.method1165((byte) 118);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[[I[[IIII)Lmi;", line = 446)
    public final class443 method1415(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class467(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()Z", line = 450)
    public final boolean method2432() {
        return this.field5849;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIIII)V", line = 454)
    public final void method1338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class284 var11 = this.method2434(Thread.currentThread());
        class383 var12 = var11.field4133;
        var12.field5446 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field5446 = false;
            var12.field5443 = 0;
            var12.field5441 = true;
            var12.method2313(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field5446 = false;
            var12.field5443 = 255 - var13;
            var12.field5441 = true;
            var12.method2313(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field5446 = true;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/awt/Canvas;Leg;I)V", line = 827)
    public class411(Canvas arg0, class394 arg1, int arg2) {
        super(arg2, arg1);
        this.field5842 = arg0;
        this.field5856 = class274.method1651(this.field5842, false);
        this.field5817 = this.field5856.field2775;
        this.field5860 = this.field5856.field2773;
        this.field5823 = this.field5856.field2780;
        this.method2440();
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)[I", line = 492)
    private final int[] method2433(int arg0) {
        class210 var2 = this.field5822;
        class452 var3;
        synchronized (this.field5822) {
            var3 = (class452) this.field5822.method1163((byte) 106, (long) arg0);
            if (var3 == null) {
                if (!super.field4073.method575(arg0, (byte) 119)) {
                    return null;
                }
                class189 var5 = super.field4073.method577(arg0, -128);
                int var6 = !var5.field2592 && !this.field5859 ? 128 : 64;
                var3 = new class452(arg0, var6, super.field4073.method573(true, 77, arg0, 0.7F, var6, var6), var5.field2591);
                this.field5822.method1172((long) arg0, 1, var3);
            }
        }
        var3.field6393 = true;
        return var3.method2644();
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "()I", line = 512)
    public final int method1345() {
        return 0;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(II)V", line = 515)
    public final void method1422(int arg0, int arg1) {
        this.field5853 = arg0;
        this.field5818 = arg1;
        this.field5844 = this.field5818 - 255;
        this.method2437();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 521)
    public final void method1429(Rectangle[] arg0, int arg1) {
        if (this.field5842 != null && this.field5856 != null) {
            try {
                Graphics var3 = this.field5842.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5860 && var5.y <= this.field5823 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5856.method147(0, var5.width, var5.height, var5.x, var3, var5.y);
                    }
                }
            } catch (Exception var6) {
                this.field5842.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII[BII)V", line = 546)
    public final void method1367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5860 * arg1 + arg0;
            int var15 = this.field5860 - arg2;
            if (arg1 + arg3 > this.field5838) {
                arg3 -= arg1 + arg3 - this.field5838;
            }
            if (arg1 < this.field5847) {
                int var16 = this.field5847 - arg1;
                arg3 -= var16;
                var14 += this.field5860 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field5839) {
                int var17 = arg0 + arg2 - this.field5839;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5857) {
                int var18 = this.field5857 - arg0;
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
                            int var28 = this.field5817[var14];
                            this.field5817[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5817[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5817[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5817[var14++] = arg5;
                        } else {
                            this.field5817[var14++] = arg4;
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

    @OriginalMember(owner = "client!d", name = "y", descriptor = "()Z", line = 722)
    public final boolean method1495() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Runnable;)Lpp;", line = 729)
    public final class284 method2434(Runnable arg0) {
        for (int var2 = 0; var2 < this.field5843; ++var2) {
            if (this.field5824[var2].field4136 == arg0) {
                return this.field5824[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Laj;)V", line = 740)
    public final void method1424(class77 arg0) {
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V", line = 750)
    public final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class284 var8 = this.method2434(Thread.currentThread());
        class383 var9 = var8.field4133;
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
            int var21 = arg0 - var9.method2302();
            int var22 = arg1 - var9.method2303();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field5443 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5443 = 255 - (arg4 >> 24);
            }
            var9.field5441 = var23 < 0 || var23 > var9.field5451 || var24 < 0 || var24 > var9.field5451 || var25 < 0 || var25 > var9.field5451;
            var9.method2301(var27, var28, var29, var23, var24, var25, arg4);
            var9.field5441 = var23 < 0 || var23 > var9.field5451 || var24 < 0 || var24 > var9.field5451 || var26 < 0 || var26 > var9.field5451;
            var9.method2301(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!d", name = "z", descriptor = "()F", line = 820)
    public final float method1387() {
        return this.field5827;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "()Z", line = 823)
    public final boolean method1393() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "H", descriptor = "()V", line = 837)
    public final void method1477() {
        if (this.field5842 != null && this.field5856 != null) {
            try {
                Graphics var1 = this.field5842.getGraphics();
                this.field5856.method145(0, 27578, 0, var1);
            } catch (Exception var2) {
                this.field5842.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I", line = 849)
    public final int method1443(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lcd;)V", line = 855)
    public final void method1434(class46 arg0) {
        class325 var2 = arg0.field599.field1510;
        for (class325 var3 = var2.field4684; var2 != var3; var3 = var3.field4684) {
            class52 var4 = (class52) var3;
            int var5 = var4.field678 >> 12;
            int var6 = var4.field674 >> 12;
            int var7 = var4.field675 >> 12;
            int var8 = (this.field5850.field1406 * var7 + this.field5850.field1409 * var6 + this.field5850.field1404 * var5 >> 15) + this.field5850.field1400;
            if (var8 >= this.field5853 && var8 <= this.field5818) {
                int var9 = ((this.field5850.field1407 * var7 + this.field5850.field1405 * var6 + this.field5850.field1402 * var5 >> 15) + this.field5850.field1398) * this.field5828 / var8 + this.field5830;
                int var10 = ((this.field5850.field1401 * var7 + this.field5850.field1408 * var5 + this.field5850.field1403 * var6 >> 15) + this.field5850.field1399) * this.field5854 / var8 + this.field5831;
                if (var9 >= this.field5857 && var9 <= this.field5839 && var10 >= this.field5847 && var10 <= this.field5838) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2431(var4, var9, var10, (var4.field679 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(IIII)V", line = 895)
    public final void method1382(int arg0, int arg1, int arg2, int arg3) {
        this.field5834 = arg0;
        this.field5845 = arg1;
        this.field5852 = arg2;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lbg;[Lkm;Z)Lcr;", line = 902)
    public final class206 method1484(class406 arg0, class473[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6649;
            var5[var7] = arg1[var7].field6646;
            if (arg1[var7].field6648 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class55(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class102(this, arg0, arg1, var4, var5);
        } else {
            return new class49(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!d", name = "p", descriptor = "()Z", line = 933)
    public final boolean method1438() {
        return true;
    }

    @OriginalMember(owner = "client!d", name = "i", descriptor = "(I)I", line = 937)
    public final int method2435(int arg0) {
        return super.field4073.method577(arg0, -126).field2587 & 65535;
    }

    @OriginalMember(owner = "client!d", name = "r", descriptor = "()V", line = 939)
    public final void method1398() {
    }

    @OriginalMember(owner = "client!d", name = "I", descriptor = "()I", line = 943)
    public final int method1470() {
        return this.field5853;
    }

    @OriginalMember(owner = "client!d", name = "j", descriptor = "(I)[I", line = 947)
    public final int[] method2436(int arg0) {
        class210 var2 = this.field5822;
        class452 var3;
        synchronized (this.field5822) {
            var3 = (class452) this.field5822.method1163((byte) -28, (long) arg0);
            if (var3 == null) {
                if (!super.field4073.method575(arg0, (byte) 109)) {
                    return null;
                }
                class189 var5 = super.field4073.method577(arg0, -123);
                int var6 = !var5.field2592 && !this.field5859 ? 128 : 64;
                var3 = new class452(arg0, var6, super.field4073.method578(true, arg0, var6, 0.7F, -112, var6), var5.field2591);
                this.field5822.method1172((long) arg0, 1, var3);
            }
        }
        var3.field6393 = true;
        return var3.method2644();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V", line = 967)
    public final void method1448(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5847) {
            var6 = this.field5847;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5838) {
            var7 = this.field5838;
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
                if (var64 < this.field5857) {
                    var64 = this.field5857;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field5839) {
                    var65 = this.field5839;
                }
                int var66 = this.field5860 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5817[var66++] = arg3;
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
                if (var60 < this.field5857) {
                    var60 = this.field5857;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field5839 - 1) {
                    var61 = this.field5839 - 1;
                }
                int var62 = this.field5860 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5817[var62++] = arg3;
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
                if (var28 < this.field5857) {
                    var28 = this.field5857;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field5839) {
                    var29 = this.field5839;
                }
                int var30 = this.field5860 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5817[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5817[var30++] = var15 + var33;
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
                if (var22 < this.field5857) {
                    var22 = this.field5857;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field5839 - 1) {
                    var23 = this.field5839 - 1;
                }
                int var24 = this.field5860 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5817[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5817[var24++] = var15 + var27;
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
                if (var47 < this.field5857) {
                    var47 = this.field5857;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field5839) {
                    var48 = this.field5839;
                }
                int var49 = this.field5860 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5817[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5817[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5857) {
                    var39 = this.field5857;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field5839 - 1) {
                    var40 = this.field5839 - 1;
                }
                int var41 = this.field5860 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5817[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5817[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I)Lhg;", line = 1254)
    public final class313 method1472(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class471(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!d", name = "m", descriptor = "()V", line = 1257)
    public final void method1467() {
        this.field5856 = class274.method1651(this.field5842, false);
        this.field5817 = this.field5856.field2775;
        this.field5860 = this.field5856.field2773;
        this.field5823 = this.field5856.field2780;
        for (int var1 = 0; var1 < this.field5843; ++var1) {
            this.field5824[var1].method1784(12153);
        }
        this.method1352();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lwt;)V", line = 1270)
    public final void method1490(class345 arg0) {
    }

    @OriginalMember(owner = "client!d", name = "n", descriptor = "()Z", line = 1279)
    public final boolean method1400() {
        return true;
    }

    @OriginalMember(owner = "client!d", name = "K", descriptor = "()Z", line = 1282)
    public final boolean method1481() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)V", line = 1284)
    public final void method1489(boolean arg0) {
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(IIIIII)V", line = 1290)
    public final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1364(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1364(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1486(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1486(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5857) {
                    var10 += (this.field5857 - arg0) * var12;
                    arg0 = this.field5857;
                }
                if (var13 >= this.field5839) {
                    var13 = this.field5839 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5847 && var17 < this.field5838) {
                                int var18 = this.field5860 * var17 + arg0;
                                int var19 = this.field5817[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5817[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5847 && var21 < this.field5838) {
                                int var22 = this.field5860 * var21 + arg0;
                                int var23 = this.field5817[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5817[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5847 && var27 < this.field5838) {
                            this.field5817[this.field5860 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5847) {
                    var29 += (this.field5847 - arg1) * var31;
                    arg1 = this.field5847;
                }
                if (var32 >= this.field5838) {
                    var32 = this.field5838 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5857 && var46 < this.field5839) {
                            this.field5817[this.field5860 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5857 && var36 < this.field5839) {
                            int var37 = this.field5860 * arg1 + var36;
                            int var38 = this.field5817[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5817[this.field5860 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5857 && var40 < this.field5839) {
                            int var41 = this.field5860 * arg1 + var40;
                            int var42 = this.field5817[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5817[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Lhq;)V", line = 1502)
    public final void method1370(int arg0, class190[] arg1) {
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IFFFFF)V", line = 1507)
    public final void method1449(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5858 = (int) (arg1 * 65535.0F);
        this.field5841 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5846 = (int) (arg3 * 65535.0F / var7);
        this.field5837 = (int) (arg4 * 65535.0F / var7);
        this.field5855 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V", line = 1516)
    public final void method1381(int arg0) {
        this.field5824[arg0].method1783(64, Thread.currentThread());
    }

    @OriginalMember(owner = "client!d", name = "A", descriptor = "()Z", line = 1521)
    public final boolean method1407() {
        return true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqh;Lcd;Lbd;Lqt;I)V", line = 1524)
    public final void method1463(class352 arg0, class46 arg1, class327 arg2, class465 arg3, int arg4) {
        ((class279) arg0).method1693(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 1527)
    public final void method1395(int arg0) {
        if (this.field5843 != arg0) {
            this.field5843 = arg0;
            this.field5824 = new class284[this.field5843];
            for (int var2 = 0; var2 < this.field5843; ++var2) {
                this.field5824[var2] = new class284(this);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()V", line = 1543)
    private final void method2437() {
        if (this.field5827 != 0.0F) {
            float var1 = (float) this.field5818;
            float var2 = (float) this.field5853;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field5826 / (this.field5827 + this.field5826);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field5827;
            this.field5836 = (int) (((float) this.field5818 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field5836 = this.field5818;
        }
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "()Z", line = 1565)
    public final boolean method1386() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "L", descriptor = "()I", line = 1569)
    public final int method1409() {
        return 0;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IIII)V", line = 1571)
    public final void method1488(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)Laj;", line = 1575)
    public final class77 method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!d", name = "u", descriptor = "()V", line = 1585)
    public final void method1341() {
    }

    @OriginalMember(owner = "client!d", name = "C", descriptor = "()I", line = 1589)
    public final int method1462() {
        int var1 = this.field5816;
        this.field5816 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!d", name = "k", descriptor = "(I)Z", line = 1594)
    public final boolean method2438(int arg0) {
        return super.field4073.method575(arg0, (byte) 123);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[I)V", line = 1599)
    public final void method1478(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field5850.field1406 * arg2 + this.field5850.field1409 * arg1 + this.field5850.field1404 * arg0 >> 15) + this.field5850.field1400;
        if (var5 >= this.field5853 && var5 <= this.field5818) {
            int var6 = ((this.field5850.field1407 * arg2 + this.field5850.field1405 * arg1 + this.field5850.field1402 * arg0 >> 15) + this.field5850.field1398) * this.field5828 / var5;
            int var7 = ((this.field5850.field1401 * arg2 + this.field5850.field1408 * arg0 + this.field5850.field1403 * arg1 >> 15) + this.field5850.field1399) * this.field5854 / var5;
            if (var6 >= this.field5848 && var6 <= this.field5832 && var7 >= this.field5829 && var7 <= this.field5840) {
                arg3[0] = var6 - this.field5848;
                arg3[1] = var7 - this.field5829;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!d", name = "v", descriptor = "()V", line = 1623)
    public final void method1352() {
        this.field5857 = 0;
        this.field5847 = 0;
        this.field5839 = this.field5860;
        this.field5838 = this.field5823;
        this.method2442();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lkm;Z)Lrg;", line = 1632)
    public final class395 method1426(class473 arg0, boolean arg1) {
        int[] var3 = arg0.field6650;
        byte[] var4 = arg0.field6652;
        int var5 = arg0.field6649;
        int var6 = arg0.field6646;
        class43 var11;
        if (arg1 && arg0.field6648 == null) {
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
            var11 = new class384(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field6648;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class321(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class321(this, var14, var5, var6);
                var11 = new class449(this, var14, var5, var6);
            }
        }
        var11.method219(arg0.field6651, arg0.field6647, arg0.field6653, arg0.field6645);
        return var11;
    }

    @OriginalMember(owner = "client!d", name = "s", descriptor = "()Z", line = 1737)
    public final boolean method1421() {
        return true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I", line = 1740)
    public final int method1473(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 1744)
    public final void method1408(int arg0) {
        this.field5824[arg0].method1783(64, (Runnable) null);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V", line = 1747)
    public final void method1340(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5857 < arg0) {
            this.field5857 = arg0;
        }
        if (this.field5847 < arg1) {
            this.field5847 = arg1;
        }
        if (this.field5839 > arg2) {
            this.field5839 = arg2;
        }
        if (this.field5838 > arg3) {
            this.field5838 = arg3;
        }
        this.method2442();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lkp;IIII)Lqh;", line = 1765)
    public final class352 method1346(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class279(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(FF)V", line = 1769)
    public final void method1498(float arg0, float arg1) {
        this.field5826 = arg0;
        this.field5827 = arg1;
        this.method2437();
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(IIII)V", line = 1774)
    public final void method1351(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5860) {
            arg2 = this.field5860;
        }
        if (arg3 > this.field5823) {
            arg3 = this.field5823;
        }
        this.field5857 = arg0;
        this.field5839 = arg2;
        this.field5847 = arg1;
        this.field5838 = arg3;
        this.method2442();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIII)V", line = 1793)
    public final void method1483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5857) {
            arg2 -= this.field5857 - arg0;
            arg0 = this.field5857;
        }
        if (arg1 < this.field5847) {
            arg3 -= this.field5847 - arg1;
            arg1 = this.field5847;
        }
        if (arg0 + arg2 > this.field5839) {
            arg2 = this.field5839 - arg0;
        }
        if (arg1 + arg3 > this.field5838) {
            arg3 = this.field5838 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field5839 && arg1 <= this.field5838) {
            int var7 = this.field5860 - arg2;
            int var8 = this.field5860 * arg1 + arg0;
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
                            this.field5817[var24] = arg4;
                            ++var24;
                            this.field5817[var24] = arg4;
                            ++var24;
                            this.field5817[var24] = arg4;
                            ++var24;
                            this.field5817[var24] = arg4;
                            ++var24;
                            this.field5817[var24] = arg4;
                            ++var24;
                            this.field5817[var24] = arg4;
                            ++var24;
                            this.field5817[var24] = arg4;
                            ++var24;
                            this.field5817[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5817[var24] = arg4;
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
                        int var14 = this.field5817[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field5817[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5817[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5817[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Laj;Laj;FLaj;)Laj;", line = 1931)
    public final class77 method1385(class77 arg0, class77 arg1, float arg2, class77 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!d", name = "D", descriptor = "()V", line = 1933)
    public final void method1374() {
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Lwt;", line = 1945)
    public final class345 method1396(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(IIII)V", line = 1948)
    public final void method1482(int arg0, int arg1, int arg2, int arg3) {
        this.field5825 = this.field5845;
        this.field5834 = arg0;
        this.field5845 = arg1;
        this.field5852 = arg2;
        this.field5861 = true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILhg;II)V", line = 1956)
    public final void method1369(int arg0, class313 arg1, int arg2, int arg3) {
        class471 var5 = (class471) arg1;
        int[] var6 = var5.field6637;
        int[] var7 = var5.field6639;
        int var8;
        if (this.field5838 < var6.length + arg3) {
            var8 = this.field5838 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5847 > arg3) {
            var9 = this.field5847 - arg3;
            arg3 = this.field5847;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5860 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5857 > var12) {
                    var13 -= this.field5857 - var12;
                    var12 = this.field5857;
                }
                if (this.field5839 < var12 + var13) {
                    var13 = this.field5839 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5817[var14++] = arg0;
                }
                var10 += this.field5860;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V", line = 2013)
    public final void method1417(int arg0, int arg1) {
        this.field5845 = arg0 & 16777215;
        int var3 = this.field5845 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field5845 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field5845 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field5845 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field5851 = false;
        } else {
            this.field5851 = true;
        }
    }

    @OriginalMember(owner = "client!d", name = "l", descriptor = "(I)Z", line = 2038)
    public final boolean method2439(int arg0) {
        return this.field5859 || super.field4073.method577(arg0, -121).field2592;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()Lbd;", line = 2045)
    public final class327 method1456() {
        class284 var1 = this.method2434(Thread.currentThread());
        return var1.field4129;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(IIII)V", line = 2049)
    public final void method1468(int arg0, int arg1, int arg2, int arg3) {
        this.field5830 = arg0;
        this.field5831 = arg1;
        this.field5828 = arg2;
        this.field5854 = arg3;
        this.method2442();
    }

    @OriginalMember(owner = "client!d", name = "j", descriptor = "()F", line = 2057)
    public final float method1383() {
        return this.field5826;
    }

    @OriginalMember(owner = "client!d", name = "F", descriptor = "()Z", line = 2060)
    public final boolean method1394() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "o", descriptor = "()Z", line = 2063)
    public final boolean method1474() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([IIIII)Lrg;", line = 2068)
    public final class395 method1355(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class321(this, arg0, arg1, arg2, arg3, arg4) : new class449(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class321(this, arg0, arg1, arg2, arg3, arg4) : new class449(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!d", name = "w", descriptor = "()I", line = 2103)
    public final int method1403() {
        return this.field5818;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()V", line = 2106)
    private final void method2440() {
        this.field5822 = new class210(20);
        this.field5850 = new class114();
        class192.method1047(true, false, (byte) 123);
        this.field5820 = true;
        this.method1395(1);
        this.method1381(0);
        this.method1352();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2115)
    public final void method1413(Canvas arg0) {
        this.field5842 = arg0;
        this.method1467();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)[I", line = 2120)
    public final int[] method1501(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5860 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5817[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!d", name = "J", descriptor = "()Z", line = 2145)
    public final boolean method1373() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(FFF)V", line = 2148)
    public final void method1492(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(IIIIII)V", line = 2153)
    public final void method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1364(arg0, arg1, arg2, arg4, arg5);
        this.method1364(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1486(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1486(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!d", name = "i", descriptor = "()Z", line = 2159)
    public final boolean method1476() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(F)V", line = 2169)
    public final void method1388(float arg0) {
        this.field5835 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!d", name = "E", descriptor = "()V", line = 2172)
    public final void method1480() {
        this.field5845 = this.field5825;
        this.field5861 = false;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(IIIIII)Z", line = 2178)
    public final boolean method1347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field5850.field1406 * arg2 + this.field5850.field1409 * arg1 + this.field5850.field1404 * arg0 >> 15) + this.field5850.field1400;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field5850.field1406 * arg5 + this.field5850.field1409 * arg4 + this.field5850.field1404 * arg3 >> 15) + this.field5850.field1400;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field5853 || var8 >= this.field5853) && (var7 <= this.field5818 || var8 <= this.field5818)) {
            int var9 = ((this.field5850.field1407 * arg2 + this.field5850.field1405 * arg1 + this.field5850.field1402 * arg0 >> 15) + this.field5850.field1398) * this.field5828 / var7;
            int var10 = ((this.field5850.field1407 * arg5 + this.field5850.field1405 * arg4 + this.field5850.field1402 * arg3 >> 15) + this.field5850.field1398) * this.field5828 / var8;
            if (var9 < this.field5848 && var10 < this.field5848 || var9 > this.field5832 && var10 > this.field5832) {
                return false;
            } else {
                int var11 = ((this.field5850.field1401 * arg2 + this.field5850.field1408 * arg0 + this.field5850.field1403 * arg1 >> 15) + this.field5850.field1399) * this.field5854 / var7;
                int var12 = ((this.field5850.field1401 * arg5 + this.field5850.field1408 * arg3 + this.field5850.field1403 * arg4 >> 15) + this.field5850.field1399) * this.field5854 / var8;
                return (var11 >= this.field5829 || var12 >= this.field5829) && (var11 <= this.field5840 || var12 <= this.field5840);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "()Z", line = 2207)
    public final boolean method1359() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIII)V", line = 2210)
    public final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5857 && arg0 < this.field5839) {
            if (arg1 < this.field5847) {
                arg2 -= this.field5847 - arg1;
                arg1 = this.field5847;
            }
            if (arg1 + arg2 > this.field5838) {
                arg2 = this.field5838 - arg1;
            }
            int var6 = this.field5860 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5860 * var10 + var6;
                        int var12 = this.field5817[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5817[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5860 * var14 + var6;
                        int var16 = this.field5817[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5817[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5817[this.field5860 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([Lqh;Lcd;Lbd;[Lqt;I)V", line = 2287)
    public final void method1363(class352[] arg0, class46 arg1, class327 arg2, class465[] arg3, int arg4) {
        class279[] var6 = new class279[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class279) arg0[var7];
            }
        }
        class279 var8 = class279.method1717(this, var6);
        var8.method1693(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!d", name = "m", descriptor = "(I)Z", line = 2305)
    public final boolean method2441(int arg0) {
        return super.field4073.method577(arg0, -121).field2582;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([I)V", line = 2308)
    public final void method1500(int[] arg0) {
        arg0[0] = this.field5857;
        arg0[1] = this.field5847;
        arg0[2] = this.field5839;
        arg0[3] = this.field5838;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([Lqh;Lbd;[Lqt;I)V", line = 2319)
    public final void method1451(class352[] arg0, class327 arg1, class465[] arg2, int arg3) {
        class279[] var5 = new class279[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class279) arg0[var6];
            }
        }
        class279 var7 = class279.method1717(this, var5);
        var7.method1693(arg1, arg2 != null ? arg2[0] : null, (class46) null, arg3);
    }

    @OriginalMember(owner = "client!d", name = "M", descriptor = "()V", line = 2334)
    private final void method2442() {
        this.field5848 = this.field5857 - this.field5830;
        this.field5832 = this.field5839 - this.field5830;
        this.field5829 = this.field5847 - this.field5831;
        this.field5840 = this.field5838 - this.field5831;
        for (int var1 = 0; var1 < this.field5843; ++var1) {
            class383 var5 = this.field5824[var1].field4133;
            var5.field5452 = this.field5830 - this.field5857;
            var5.field5449 = this.field5831 - this.field5847;
            var5.field5451 = this.field5839 - this.field5857;
            var5.field5444 = this.field5838 - this.field5847;
        }
        int var2 = this.field5860 * this.field5847 + this.field5857;
        for (int var3 = this.field5847; var3 < this.field5838; ++var3) {
            for (int var4 = 0; var4 < this.field5843; ++var4) {
                this.field5824[var4].field4133.field5448[var3 - this.field5847] = var2;
            }
            var2 += this.field5860;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V", line = 2375)
    public final void method1342(boolean arg0) {
        this.field5859 = arg0;
        this.field5822.method1165((byte) 118);
    }

    @OriginalMember(owner = "client!d", name = "l", descriptor = "()V", line = 2382)
    public final void method1475() {
        if (this.field5820) {
            class340.method2068(false, (byte) 88, true);
            this.field5820 = false;
        }
        this.field5842 = null;
        this.field5856 = null;
        this.field5849 = true;
    }

    @OriginalMember(owner = "client!d", name = "t", descriptor = "()Z", line = 2393)
    public final boolean method1485() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "x", descriptor = "()Z", line = 2398)
    public final boolean method1410() {
        return false;
    }

    @OriginalMember(owner = "client!d", name = "B", descriptor = "()I", line = 2415)
    public final int method1431() {
        int var1 = this.field5819;
        this.field5819 = 0;
        return var1;
    }
}
