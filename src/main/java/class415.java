import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class415 extends class562 {

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
    private boolean field5436;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "Z")
    private boolean field5440;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "Lwh;")
    private class546 field5441;

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
    public int field5452;

    @OriginalMember(owner = "client!rfa", name = "M", descriptor = "I")
    public int field5458;

    @OriginalMember(owner = "client!rfa", name = "X", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!rfa", name = "U", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!rfa", name = "W", descriptor = "Z")
    private boolean field5468;

    @OriginalMember(owner = "client!rfa", name = "O", descriptor = "I")
    private int field5460;

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
    private int field5450;

    @OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!rfa", name = "eb", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!rfa", name = "V", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!rfa", name = "db", descriptor = "I")
    public int field5475;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!rfa", name = "ab", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!rfa", name = "cb", descriptor = "I")
    public int field5474;

    @OriginalMember(owner = "client!rfa", name = "P", descriptor = "Luf;")
    private class380 field5461;

    @OriginalMember(owner = "client!rfa", name = "fb", descriptor = "I")
    private int field5477;

    @OriginalMember(owner = "client!rfa", name = "K", descriptor = "Luf;")
    private class380 field5456;

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "Llu;")
    public class557 field5448;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
    private int field5439;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!rfa", name = "N", descriptor = "I")
    private int field5459;

    @OriginalMember(owner = "client!rfa", name = "Q", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!rfa", name = "R", descriptor = "I")
    public int field5463;

    @OriginalMember(owner = "client!rfa", name = "S", descriptor = "I")
    private int field5464;

    @OriginalMember(owner = "client!rfa", name = "T", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!rfa", name = "Y", descriptor = "I")
    public int field5470;

    @OriginalMember(owner = "client!rfa", name = "Z", descriptor = "I")
    private int field5471;

    @OriginalMember(owner = "client!rfa", name = "bb", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "Lfc;")
    private class348 field5438;

    @OriginalMember(owner = "client!rfa", name = "I", descriptor = "Lf;")
    private class532 field5454;

    @OriginalMember(owner = "client!rfa", name = "gb", descriptor = "Lf;")
    private class532 field5478;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5437;

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "[I")
    public int[] field5447;

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "[I")
    public int[] field5455;

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "[Lmm;")
    private class26[] field5446;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "()V")
    public final void method1061() {
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([I)V")
    public final void method1127(int[] arg0) {
        arg0[0] = this.field5444;
        arg0[1] = this.field5471;
    }

    @OriginalMember(owner = "client!rfa", name = "ZA", descriptor = "(Z)V")
    public final void method1091(boolean arg0) {
        class26 var2 = this.method2353(Thread.currentThread());
        var2.field339 = arg0;
    }

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "()Z")
    public final boolean method1106() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "(IIII)[I")
    public final int[] method1068(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5444 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5455[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class532 method1076(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5444 * arg1 + arg0;
        int var8 = this.field5444 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5455[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class264(this, var6, arg2, arg3);
        } else {
            return new class39(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIII)V")
    public final void method1140(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!rfa", name = "BA", descriptor = "()I")
    public final int method1054() {
        return this.field5475;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
    public final void method1038(int arg0) {
        this.field5470 = arg0;
        this.field5446 = new class26[this.field5470];
        for (int var2 = 0; var2 < this.field5470; ++var2) {
            this.field5446[var2] = new class26(this);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class415(Canvas arg0, class522 arg1) {
        this(arg1);
        this.method1132(arg0);
        this.method1143(arg0);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
    public final void method1058(boolean arg0) {
        this.field5468 = arg0;
        this.field5456.method2168((byte) -91);
    }

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "()Z")
    public final boolean method1099() {
        return true;
    }

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "()Z")
    public final boolean method1117() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "()Z")
    public final boolean method1069() {
        return true;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lq;)V")
    public final void method1123(class487 arg0) {
        this.field5448 = (class557) arg0;
    }

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "(I)V")
    public final void method1109(int arg0) {
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1056(Rectangle[] arg0, int arg1) throws class56 {
        if (this.field5437 != null && this.field5438 != null) {
            try {
                Graphics var3 = this.field5437.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5444 && var5.y <= this.field5471 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5438.method553(var5.x, var3, 9, var5.height, var5.y, var5.width);
                    }
                }
            } catch (Exception var6) {
                this.field5437.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!rfa", name = "L", descriptor = "()V")
    public final void method1148() {
        for (int var1 = 0; var1 < this.field5446.length; ++var1) {
            this.field5446[var1].field345 = this.field5446[var1].field333;
            this.field5446[var1].field342 = false;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1143(Canvas arg0) {
        if (arg0 != null) {
            class348 var2 = (class348) this.field5441.method3057(1, (long) arg0.hashCode());
            if (var2 != null) {
                this.field5437 = arg0;
                this.field5438 = var2;
                if (this.field5454 == null) {
                    this.field5455 = var2.field4639;
                    this.field5444 = var2.field4635;
                    this.field5471 = var2.field4640;
                    if (this.field5464 != this.field5444 || this.field5471 != this.field5459) {
                        this.field5464 = this.field5444;
                        this.field5459 = this.field5471;
                        this.field5447 = new int[this.field5464 * this.field5459];
                    }
                    this.method2346();
                    return;
                }
            }
        } else {
            this.field5437 = null;
            this.field5438 = null;
            if (this.field5454 == null) {
                this.field5455 = null;
                this.field5444 = this.field5471 = 1;
                this.field5464 = this.field5459 = 1;
                this.method2346();
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(IIIIII)V")
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1144(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1144(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1149(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1149(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5467) {
                    var10 += (this.field5467 - arg0) * var12;
                    arg0 = this.field5467;
                }
                if (var13 >= this.field5469) {
                    var13 = this.field5469 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5449 && var17 < this.field5476) {
                                int var18 = this.field5444 * var17 + arg0;
                                int var19 = this.field5455[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5455[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5449 && var21 < this.field5476) {
                                int var22 = this.field5444 * var21 + arg0;
                                int var23 = this.field5455[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5455[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5449 && var27 < this.field5476) {
                            this.field5455[this.field5444 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5449) {
                    var29 += (this.field5449 - arg1) * var31;
                    arg1 = this.field5449;
                }
                if (var32 >= this.field5476) {
                    var32 = this.field5476 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5467 && var46 < this.field5469) {
                            this.field5455[this.field5444 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5467 && var36 < this.field5469) {
                            int var37 = this.field5444 * arg1 + var36;
                            int var38 = this.field5455[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5455[this.field5444 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5467 && var40 < this.field5469) {
                            int var41 = this.field5444 * arg1 + var40;
                            int var42 = this.field5455[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5455[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!rfa", name = "XA", descriptor = "(IIIII)V")
    public final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5449 && arg1 < this.field5476) {
            if (arg0 < this.field5467) {
                arg2 -= this.field5467 - arg0;
                arg0 = this.field5467;
            }
            if (arg0 + arg2 > this.field5469) {
                arg2 = this.field5469 - arg0;
            }
            int var6 = this.field5444 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5455[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5455[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5455[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5455[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5455[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "D", descriptor = "()V")
    private final void method2346() {
        for (int var1 = 0; var1 < this.field5470; ++var1) {
            this.field5446[var1].method159(-100);
        }
        this.method1044();
    }

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "(I)Z")
    public final boolean method2347(int arg0) {
        return super.field7682.method2959(124, arg0).field1250;
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)Le;")
    public final class381 method1078(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "(I)Z")
    public final boolean method2348(int arg0) {
        return super.field7682.method2961(true, arg0);
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method2349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field7682.method2959(101, arg6).field1249) {
                if (this.field5477 != arg6) {
                    class532 var11 = (class532) this.field5461.method2176(-127, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method2356(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2351(arg6) ? 64 : 128;
                        var11 = this.method1122(var12, 0, var13, var13, var13);
                        this.field5461.method2174(var11, (long) arg6, (byte) 123);
                    }
                    this.field5477 = arg6;
                    this.field5478 = var11;
                }
                ((class334) this.field5478).method220(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method2350(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "()Lq;")
    public final class487 method1153() {
        class26 var1 = this.method2353(Thread.currentThread());
        return var1.field346;
    }

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "()Z")
    public final boolean method1071() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)I")
    public final int method1080(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Z)V")
    public final void method1093(boolean arg0) {
    }

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "(IIIIII)V")
    private final void method2350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field5449) {
            var8 = this.field5449;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field5476) {
            var9 = this.field5476;
        }
        int var10 = var8;
        int var11 = arg3 * arg3;
        int var12 = 0;
        int var13 = arg1 - var8;
        int var14 = var13 * var13;
        int var15 = var14 - var13;
        if (arg1 > var9) {
            arg1 = var9;
        }
        int var16 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var16 == 255) {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var66 = arg0 - var12 + 1;
                if (var66 < this.field5467) {
                    var66 = this.field5467;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field5469) {
                    var67 = this.field5469;
                }
                int var68 = this.field5444 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field5447[var68]) {
                        this.field5455[var68] = arg4;
                    }
                    ++var68;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var57 = arg3;
            int var58 = var10 - arg1;
            int var59 = var58 * var58 + var11;
            int var60 = var59 - arg3;
            int var61 = var59 - var58;
            while (var10 < var9) {
                while (var61 > var11 && var60 > var11) {
                    var61 -= var57-- + var57;
                    var60 -= var57 + var57;
                }
                int var62 = arg0 - var57;
                if (var62 < this.field5467) {
                    var62 = this.field5467;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field5469 - 1) {
                    var63 = this.field5469 - 1;
                }
                int var64 = this.field5444 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field5447[var64]) {
                        this.field5455[var64] = arg4;
                    }
                    ++var64;
                }
                ++var10;
                var61 += var58 + var58;
                var60 += var58++ + var58;
            }
        } else if (arg5 == 1) {
            int var17 = (var16 << 24) + ((arg4 & 16711935) * var16 >> 8 & 16711935) + ((arg4 & 65280) * var16 >> 8 & 65280);
            int var18 = 256 - var16;
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var30 = arg0 - var12 + 1;
                if (var30 < this.field5467) {
                    var30 = this.field5467;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field5469) {
                    var31 = this.field5469;
                }
                int var32 = this.field5444 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field5447[var32]) {
                        int var34 = this.field5455[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field5455[var32] = var17 + var35;
                    }
                    ++var32;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var19 = arg3;
            int var20 = -var13;
            int var21 = var20 * var20 + var11;
            int var22 = var21 - arg3;
            int var23 = var21 - var20;
            while (var10 < var9) {
                while (var23 > var11 && var22 > var11) {
                    var23 -= var19-- + var19;
                    var22 -= var19 + var19;
                }
                int var24 = arg0 - var19;
                if (var24 < this.field5467) {
                    var24 = this.field5467;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field5469 - 1) {
                    var25 = this.field5469 - 1;
                }
                int var26 = this.field5444 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field5447[var26]) {
                        int var28 = this.field5455[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field5455[var26] = var17 + var29;
                    }
                    ++var26;
                }
                ++var10;
                var23 += var20 + var20;
                var22 += var20++ + var20;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var49 = arg0 - var12 + 1;
                if (var49 < this.field5467) {
                    var49 = this.field5467;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field5469) {
                    var50 = this.field5469;
                }
                int var51 = this.field5444 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field5447[var51]) {
                        int var53 = this.field5455[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field5455[var51] = var54 - var56 | var56 - (var56 >>> 8);
                    }
                    ++var51;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var36 = arg3;
            int var37 = -var13;
            int var38 = var37 * var37 + var11;
            int var39 = var38 - arg3;
            int var40 = var38 - var37;
            while (var10 < var9) {
                while (var40 > var11 && var39 > var11) {
                    var40 -= var36-- + var36;
                    var39 -= var36 + var36;
                }
                int var41 = arg0 - var36;
                if (var41 < this.field5467) {
                    var41 = this.field5467;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field5469 - 1) {
                    var42 = this.field5469 - 1;
                }
                int var43 = this.field5444 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field5447[var43]) {
                        int var45 = this.field5455[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field5455[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "U", descriptor = "()I")
    public final int method1108() {
        return this.field5472;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class270 method1037(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class476(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "()Z")
    public final boolean method1087() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "()V")
    public final void method1092() {
    }

    @OriginalMember(owner = "client!rfa", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5444 * arg1 + arg0;
            int var15 = this.field5444 - arg2;
            if (arg1 + arg3 > this.field5476) {
                arg3 -= arg1 + arg3 - this.field5476;
            }
            if (arg1 < this.field5449) {
                int var16 = this.field5449 - arg1;
                arg3 -= var16;
                var14 += this.field5444 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field5469) {
                int var17 = arg0 + arg2 - this.field5469;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5467) {
                int var18 = this.field5467 - arg0;
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
                            int var28 = this.field5455[var14];
                            this.field5455[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5455[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5455[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5455[var14++] = arg5;
                        } else {
                            this.field5455[var14++] = arg4;
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

    @OriginalMember(owner = "client!rfa", name = "JA", descriptor = "()V")
    public final void method1044() {
        this.field5467 = 0;
        this.field5449 = 0;
        this.field5469 = this.field5444;
        this.field5476 = this.field5471;
        this.method2355();
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lcca;IIII)Lda;")
    public final class470 method1089(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class272(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!rfa", name = "la", descriptor = "(IIII)V")
    public final void method1088(int arg0, int arg1, int arg2, int arg3) {
        this.field5462 = arg0;
        this.field5465 = arg1;
        this.field5458 = arg2;
        this.field5445 = arg3;
        this.method2355();
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lec;)V")
    public final void method1096(class144 arg0) {
        class26 var2 = this.method2353(Thread.currentThread());
        class701 var3 = arg0.field1942.field4349;
        for (class701 var4 = var3.field9865; var3 != var4; var4 = var4.field9865) {
            class545 var5 = (class545) var4;
            int var6 = var5.field7451 >> 12;
            int var7 = var5.field7448 >> 12;
            int var8 = var5.field7456 >> 12;
            float var9 = (float) var8 * this.field5448.field7610 + (float) var6 * this.field5448.field7613 + (float) var7 * this.field5448.field7591 + this.field5448.field7611;
            if (!(var9 < (float) this.field5475) && !(var9 > (float) var2.field336)) {
                int var10 = (int) (((float) var8 * this.field5448.field7590 + (float) var6 * this.field5448.field7594 + (float) var7 * this.field5448.field7587 + this.field5448.field7612) * (float) this.field5458 / var9) + this.field5462;
                int var11 = (int) (((float) var8 * this.field5448.field7614 + (float) var6 * this.field5448.field7589 + (float) var7 * this.field5448.field7588 + this.field5448.field7592) * (float) this.field5445 / var9) + this.field5465;
                if (var10 >= this.field5467 && var10 <= this.field5469 && var11 >= this.field5449 && var11 <= this.field5476) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method2354(var5, var10, var11, (int) var9, (int) ((float) (this.field5458 * var5.field7447 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[Lqea;)V")
    public final void method1111(int arg0, class392[] arg1) {
    }

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "(I)Z")
    public final boolean method2351(int arg0) {
        return this.field5468 || super.field7682.method2959(99, arg0).field1260;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ltq;Z)Lf;")
    public final class532 method1139(class92 arg0, boolean arg1) {
        int[] var3 = arg0.field1127;
        byte[] var4 = arg0.field1130;
        int var5 = arg0.field1132;
        int var6 = arg0.field1128;
        class334 var11;
        if (arg1 && arg0.field1129 == null) {
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
            var11 = new class652(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1129;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class264(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class39(this, var14, var5, var6);
            }
        }
        var11.method527(arg0.field1125, arg0.field1126, arg0.field1131, arg0.field1133);
        return var11;
    }

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "()Z")
    public final boolean method1100() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(IIIII)V")
    public final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5449) {
            var6 = this.field5449;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5476) {
            var7 = this.field5476;
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
                if (var64 < this.field5467) {
                    var64 = this.field5467;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field5469) {
                    var65 = this.field5469;
                }
                int var66 = this.field5444 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5455[var66++] = arg3;
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
                if (var60 < this.field5467) {
                    var60 = this.field5467;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field5469 - 1) {
                    var61 = this.field5469 - 1;
                }
                int var62 = this.field5444 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5455[var62++] = arg3;
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
                if (var28 < this.field5467) {
                    var28 = this.field5467;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field5469) {
                    var29 = this.field5469;
                }
                int var30 = this.field5444 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5455[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5455[var30++] = var15 + var33;
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
                if (var22 < this.field5467) {
                    var22 = this.field5467;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field5469 - 1) {
                    var23 = this.field5469 - 1;
                }
                int var24 = this.field5444 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5455[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5455[var24++] = var15 + var27;
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
                if (var47 < this.field5467) {
                    var47 = this.field5467;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field5469) {
                    var48 = this.field5469;
                }
                int var49 = this.field5444 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5455[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5455[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5467) {
                    var39 = this.field5467;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field5469 - 1) {
                    var40 = this.field5469 - 1;
                }
                int var41 = this.field5444 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5455[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5455[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "da", descriptor = "(IIII)V")
    public final void method1042(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5444) {
            arg2 = this.field5444;
        }
        if (arg3 > this.field5471) {
            arg3 = this.field5471;
        }
        this.field5467 = arg0;
        this.field5469 = arg2;
        this.field5449 = arg1;
        this.field5476 = arg3;
        this.method2355();
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1052(Canvas arg0) {
        class348 var2 = (class348) this.field5441.method3057(1, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method242(true);
            class348 var3 = class186.method1227(50, arg0);
            this.field5441.method3061(124, (long) arg0.hashCode(), var3);
            if (this.field5437 == arg0 && this.field5454 == null) {
                this.field5438 = var3;
                this.field5455 = var3.field4639;
                this.field5444 = var3.field4635;
                this.field5471 = var3.field4640;
                if (this.field5464 != this.field5444 || this.field5471 != this.field5459) {
                    this.field5464 = this.field5444;
                    this.field5459 = this.field5471;
                    this.field5447 = new int[this.field5464 * this.field5459];
                }
                this.method2346();
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method1083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field5448.field7610 + (float) arg0 * this.field5448.field7613 + (float) arg1 * this.field5448.field7591 + this.field5448.field7611;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5448.field7610 + (float) arg3 * this.field5448.field7613 + (float) arg4 * this.field5448.field7591 + this.field5448.field7611;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5475) || !(var8 < (float) this.field5475)) && (!(var7 > (float) this.field5472) || !(var8 > (float) this.field5472))) {
            int var9 = (int) (((float) arg2 * this.field5448.field7590 + (float) arg0 * this.field5448.field7594 + (float) arg1 * this.field5448.field7587 + this.field5448.field7612) * (float) this.field5458 / var7);
            int var10 = (int) (((float) arg5 * this.field5448.field7590 + (float) arg3 * this.field5448.field7594 + (float) arg4 * this.field5448.field7587 + this.field5448.field7612) * (float) this.field5458 / var8);
            if (var9 < this.field5442 && var10 < this.field5442 || var9 > this.field5451 && var10 > this.field5451) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5448.field7614 + (float) arg0 * this.field5448.field7589 + (float) arg1 * this.field5448.field7588 + this.field5448.field7592) * (float) this.field5445 / var7);
                int var12 = (int) (((float) arg5 * this.field5448.field7614 + (float) arg3 * this.field5448.field7589 + (float) arg4 * this.field5448.field7588 + this.field5448.field7592) * (float) this.field5445 / var8);
                return (var11 >= this.field5453 || var12 >= this.field5453) && (var11 <= this.field5463 || var12 <= this.field5463);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "()Lq;")
    public final class487 method1075() {
        return new class557();
    }

    @OriginalMember(owner = "client!rfa", name = "pa", descriptor = "(III)V")
    public final void method1073(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5446.length; ++var4) {
            class26 var5 = this.field5446[var4];
            var5.field345 = arg0 & 16777215;
            int var6 = var5.field345 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field345 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field345 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field345 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field334 = false;
            } else {
                var5.field334 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "()V")
    public final void method1150() {
        if (this.field5437 != null) {
            this.field5455 = this.field5438.field4639;
            this.field5444 = this.field5438.field4635;
            this.field5471 = this.field5438.field4640;
        } else {
            this.field5444 = 1;
            this.field5471 = 1;
            this.field5455 = null;
        }
        this.field5454 = null;
        this.method2346();
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lec;I)V")
    public final void method1120(class144 arg0, int arg1) {
        class26 var3 = this.method2353(Thread.currentThread());
        class701 var4 = arg0.field1942.field4349;
        for (class701 var5 = var4.field9865; var4 != var5; var5 = var5.field9865) {
            class545 var6 = (class545) var5;
            int var7 = var6.field7451 >> 12;
            int var8 = var6.field7448 >> 12;
            int var9 = var6.field7456 >> 12;
            float var10 = (float) var9 * this.field5448.field7610 + (float) var7 * this.field5448.field7613 + (float) var8 * this.field5448.field7591 + this.field5448.field7611;
            if (!(var10 < (float) this.field5475) && !(var10 > (float) var3.field336)) {
                int var11 = (int) (((float) var9 * this.field5448.field7590 + (float) var7 * this.field5448.field7594 + (float) var8 * this.field5448.field7587 + this.field5448.field7612) * (float) this.field5458 / (float) arg1) + this.field5462;
                int var12 = (int) (((float) var9 * this.field5448.field7614 + (float) var7 * this.field5448.field7589 + (float) var8 * this.field5448.field7588 + this.field5448.field7592) * (float) this.field5445 / (float) arg1) + this.field5465;
                if (var11 >= this.field5467 && var11 <= this.field5469 && var12 >= this.field5449 && var12 <= this.field5476) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method2354(var6, var11, var12, (int) var10, (this.field5458 * var6.field7447 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "(I)I")
    public final int method2352(int arg0) {
        return super.field7682.method2959(86, arg0).field1262 & 65535;
    }

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "()Z")
    public final boolean method1135() {
        return true;
    }

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "()Z")
    public final boolean method1098() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
    public final void method1082(int arg0) {
        this.field5446[arg0].method158((Runnable) null, false);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[I[I)Lua;")
    public final class596 method1128(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class646(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rfa", name = "GA", descriptor = "(II)V")
    public final void method1090(int arg0, int arg1) {
        class26 var3 = this.method2353(Thread.currentThread());
        this.field5475 = arg0;
        this.field5472 = arg1;
        var3.field336 = this.field5472 - 255;
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(IIIIII)Lit;")
    public final class513 method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "(IIIIII)V")
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5467) {
            arg2 -= this.field5467 - arg0;
            arg0 = this.field5467;
        }
        if (arg1 < this.field5449) {
            arg3 -= this.field5449 - arg1;
            arg1 = this.field5449;
        }
        if (arg0 + arg2 > this.field5469) {
            arg2 = this.field5469 - arg0;
        }
        if (arg1 + arg3 > this.field5476) {
            arg3 = this.field5476 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field5469 && arg1 <= this.field5476) {
            int var7 = this.field5444 - arg2;
            int var8 = this.field5444 * arg1 + arg0;
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
                            this.field5455[var24] = arg4;
                            ++var24;
                            this.field5455[var24] = arg4;
                            ++var24;
                            this.field5455[var24] = arg4;
                            ++var24;
                            this.field5455[var24] = arg4;
                            ++var24;
                            this.field5455[var24] = arg4;
                            ++var24;
                            this.field5455[var24] = arg4;
                            ++var24;
                            this.field5455[var24] = arg4;
                            ++var24;
                            this.field5455[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5455[var24] = arg4;
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
                        int var14 = this.field5455[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field5455[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5455[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5455[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)I")
    public final int method1053(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/Runnable;)Lmm;")
    public final class26 method2353(Runnable arg0) {
        for (int var2 = 0; var2 < this.field5470; ++var2) {
            if (this.field5446[var2].field332 == arg0) {
                return this.field5446[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "()Z")
    public final boolean method1074() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lbh;IIII)V")
    private final void method2354(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field7444;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2350(arg1, arg2, arg3, arg4, arg0.field7454, 1);
        } else {
            if (this.field5477 != var6) {
                class532 var9 = (class532) this.field5461.method2176(-126, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method2356(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2351(var6) ? 64 : 128;
                    var9 = this.method1122(var10, 0, var11, var11, var11);
                    this.field5461.method2174(var9, (long) var6, (byte) 127);
                }
                this.field5477 = var6;
                this.field5478 = var9;
            }
            ++var8;
            ((class334) this.field5478).method220(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field7454, 1, 1);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class26 var11 = this.method2353(Thread.currentThread());
        class142 var12 = var11.field362;
        var12.field1934 = false;
        int var13 = arg0 - this.field5442;
        int var14 = arg2 - this.field5442;
        int var15 = arg4 - this.field5442;
        int var16 = arg1 - this.field5453;
        int var17 = arg3 - this.field5453;
        int var18 = arg5 - this.field5453;
        var12.field1924 = var13 < 0 || var13 > var12.field1923 || var14 < 0 || var14 > var12.field1923 || var15 < 0 || var15 > var12.field1923;
        var12.field1919 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field1930 = 255 - var19;
                var12.field1925 = false;
                var12.method805(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field1930 = 128;
                var12.field1925 = true;
                var12.method805(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field1930 = 0;
            var12.field1925 = false;
            var12.method805(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field1934 = true;
        var12.field1919 = false;
    }

    @OriginalMember(owner = "client!rfa", name = "CA", descriptor = "(IIII)V")
    public final void method1072(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5446.length; ++var5) {
            this.field5446[var5].field333 = this.field5446[var5].field345;
            this.field5446[var5].field343 = arg0;
            this.field5446[var5].field345 = arg1;
            this.field5446[var5].field341 = arg2;
            this.field5446[var5].field342 = true;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "ja", descriptor = "(I)V")
    public final void method1146(int arg0) {
        this.method1113(0, 0, this.field5444, this.field5471, arg0, 0);
    }

    @OriginalMember(owner = "client!rfa", name = "T", descriptor = "()I")
    public final int method1062() {
        int var1 = this.field5450;
        this.field5450 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "()V")
    private final void method2355() {
        this.field5442 = this.field5467 - this.field5462;
        this.field5451 = this.field5469 - this.field5462;
        this.field5453 = this.field5449 - this.field5465;
        this.field5463 = this.field5476 - this.field5465;
        for (int var1 = 0; var1 < this.field5470; ++var1) {
            class142 var5 = this.field5446[var1].field362;
            var5.field1920 = this.field5462 - this.field5467;
            var5.field1921 = this.field5465 - this.field5449;
            var5.field1923 = this.field5469 - this.field5467;
            var5.field1928 = this.field5476 - this.field5449;
        }
        int var2 = this.field5449 * this.field5444 + this.field5467;
        for (int var3 = this.field5449; var3 < this.field5476; ++var3) {
            for (int var4 = 0; var4 < this.field5470; ++var4) {
                this.field5446[var4].field362.field1932[var3 - this.field5449] = var2;
            }
            var2 += this.field5444;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1126(Canvas arg0) {
        if (this.field5437 == arg0) {
            this.method1143((Canvas) null);
        }
        class348 var2 = (class348) this.field5441.method3057(1, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method242(true);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "()I")
    public final int method1137() {
        return 0;
    }

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "()Lq;")
    public final class487 method1136() {
        return this.field5448;
    }

    @OriginalMember(owner = "client!rfa", name = "YA", descriptor = "(IIII)V")
    public final void method1064(int arg0, int arg1, int arg2, int arg3) {
        class26 var5 = this.method2353(Thread.currentThread());
        var5.field343 = arg0;
        var5.field345 = arg1;
        var5.field341 = arg2;
    }

    @OriginalMember(owner = "client!rfa", name = "AA", descriptor = "(III[I)V")
    public final void method1045(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field5448.field7610 + (float) arg0 * this.field5448.field7613 + (float) arg1 * this.field5448.field7591 + this.field5448.field7611;
        if (!(var5 < (float) this.field5475) && !(var5 > (float) this.field5472)) {
            int var6 = (int) (((float) arg2 * this.field5448.field7590 + (float) arg0 * this.field5448.field7594 + (float) arg1 * this.field5448.field7587 + this.field5448.field7612) * (float) this.field5458 / var5);
            int var7 = (int) (((float) arg2 * this.field5448.field7614 + (float) arg0 * this.field5448.field7589 + (float) arg1 * this.field5448.field7588 + this.field5448.field7592) * (float) this.field5445 / var5);
            if (var6 >= this.field5442 && var6 <= this.field5451 && var7 >= this.field5453 && var7 <= this.field5463) {
                arg3[0] = var6 - this.field5442;
                arg3[1] = var7 - this.field5453;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "(I)[I")
    private final int[] method2356(int arg0) {
        class380 var2 = this.field5456;
        class139 var3;
        synchronized (this.field5456) {
            var3 = (class139) this.field5456.method2176(-124, (long) arg0);
            if (var3 == null) {
                if (!super.field7682.method2961(true, arg0)) {
                    return null;
                }
                class105 var5 = super.field7682.method2959(126, arg0);
                int var6 = !var5.field1260 && !this.field5468 ? 128 : 64;
                var3 = new class139(arg0, var6, super.field7682.method2963(true, var6, true, var6, 0.7F, arg0), var5.field1247);
                this.field5456.method2174(var3, (long) arg0, (byte) -16);
            }
        }
        var3.field1884 = true;
        return var3.method784();
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1132(Canvas arg0) {
        class348 var2 = (class348) this.field5441.method3057(1, (long) arg0.hashCode());
        if (var2 == null) {
            class348 var3 = class186.method1227(121, arg0);
            this.field5441.method3061(126, (long) arg0.hashCode(), var3);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "V", descriptor = "(IIII)V")
    public final void method1077(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5467 < arg0) {
            this.field5467 = arg0;
        }
        if (this.field5449 < arg1) {
            this.field5449 = arg1;
        }
        if (this.field5469 > arg2) {
            this.field5469 = arg2;
        }
        if (this.field5476 > arg3) {
            this.field5476 = arg3;
        }
        this.method2355();
    }

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "()Z")
    public final boolean method1084() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "DA", descriptor = "()I")
    public final int method1119() {
        int var1 = this.field5460;
        this.field5460 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
    public final void method1063(int arg0) {
        int var2 = arg0 - this.field5439;
        for (Object var3 = this.field5456.method2180(1); var3 != null; var3 = this.field5456.method2177(-74)) {
            class139 var4 = (class139) var3;
            if (var4.field1884) {
                var4.field1885 += var2;
                int var5 = var4.field1885 / 20;
                if (var5 > 0) {
                    class105 var6 = super.field7682.method2959(67, var4.field1881);
                    var4.method783(var6.field1258 * var2 * 50 / 1000, var6.field1248 * var2 * 50 / 1000);
                    var4.field1885 -= var5 * 20;
                }
                var4.field1884 = false;
            }
        }
        this.field5439 = arg0;
        this.field5461.method2179(false, 5);
        this.field5456.method2179(false, 5);
    }

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "(IIIII)V")
    public final void method1149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5467 && arg0 < this.field5469) {
            if (arg1 < this.field5449) {
                arg2 -= this.field5449 - arg1;
                arg1 = this.field5449;
            }
            if (arg1 + arg2 > this.field5476) {
                arg2 = this.field5476 - arg1;
            }
            int var6 = this.field5444 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5444 * var10 + var6;
                        int var12 = this.field5455[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5455[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5444 * var14 + var6;
                        int var16 = this.field5455[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5455[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5455[this.field5444 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        class646 var10 = (class646) arg6;
        int[] var11 = var10.field8935;
        int[] var12 = var10.field8937;
        int var13 = this.field5449 > arg8 ? this.field5449 : arg8;
        int var14 = this.field5476 < var11.length + arg8 ? this.field5476 : var11.length + arg8;
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
            if (arg0 < this.field5467) {
                var18 += (this.field5467 - arg0) * var20;
                arg0 = this.field5467;
            }
            if (var21 >= this.field5469) {
                var21 = this.field5469 - 1;
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
                                int var28 = this.field5444 * var25 + arg0;
                                int var29 = this.field5455[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5455[var28] = var23 + var30;
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
                                int var34 = this.field5444 * var31 + arg0;
                                int var35 = this.field5455[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5455[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5455[this.field5444 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5467 && var64 < this.field5469 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5455[this.field5444 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5467 && var50 < this.field5469 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5444 * arg1 + var50;
                        int var54 = this.field5455[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5455[this.field5444 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5467 && var56 < this.field5469 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5444 * arg1 + var56;
                        int var60 = this.field5455[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5455[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(FFF)V")
    public final void method1079(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!rfa", name = "ra", descriptor = "(F)V")
    public final void method1041(float arg0) {
        this.field5466 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "()[I")
    public final int[] method1110() {
        return new int[] { this.field5462, this.field5465, this.field5458, this.field5445 };
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Laga;[Ltq;Z)Lla;")
    public final class409 method1130(class658 arg0, class92[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1132;
            var5[var7] = arg1[var7].field1128;
            if (arg1[var7].field1129 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class575(this, arg0, arg1, var4, var5);
            } else {
                return new class128(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class203(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "MA", descriptor = "(III[I)V")
    public final void method1118(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field5448.field7610 + (float) arg0 * this.field5448.field7613 + (float) arg1 * this.field5448.field7591 + this.field5448.field7611;
        if (!(var5 < (float) this.field5475) && !(var5 > (float) this.field5472)) {
            int var6 = (int) (((float) arg2 * this.field5448.field7590 + (float) arg0 * this.field5448.field7594 + (float) arg1 * this.field5448.field7587 + this.field5448.field7612) * (float) this.field5458 / var5);
            int var7 = (int) (((float) arg2 * this.field5448.field7614 + (float) arg0 * this.field5448.field7589 + (float) arg1 * this.field5448.field7588 + this.field5448.field7592) * (float) this.field5445 / var5);
            arg3[0] = var6 - this.field5442;
            arg3[1] = var7 - this.field5453;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "FA", descriptor = "(ILua;II)V")
    public final void method1095(int arg0, class596 arg1, int arg2, int arg3) {
        class646 var5 = (class646) arg1;
        int[] var6 = var5.field8935;
        int[] var7 = var5.field8937;
        int var8;
        if (this.field5476 < var6.length + arg3) {
            var8 = this.field5476 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5449 > arg3) {
            var9 = this.field5449 - arg3;
            arg3 = this.field5449;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5444 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5467 > var12) {
                    var13 -= this.field5467 - var12;
                    var12 = this.field5467;
                }
                if (this.field5469 < var12 + var13) {
                    var13 = this.field5469 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5455[var14++] = arg0;
                }
                var10 += this.field5444;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lfa;)V")
    private class415(class522 arg0) {
        super(arg0);
        this.field5436 = false;
        this.field5440 = false;
        this.field5441 = new class546(4);
        this.field5452 = 45823;
        this.field5458 = 512;
        this.field5469 = 0;
        this.field5466 = 75518;
        this.field5468 = false;
        this.field5460 = 0;
        this.field5450 = 0;
        this.field5449 = 0;
        this.field5476 = 0;
        this.field5467 = 0;
        this.field5475 = 50;
        this.field5445 = 512;
        this.field5472 = 3500;
        this.field5474 = 78642;
        this.field5461 = new class380(16);
        this.field5477 = -1;
        this.field5456 = new class380(256);
        this.field5448 = new class557();
        this.method1038(1);
        this.method1081(0);
        class413.method2341(-111, false, true);
        this.field5436 = true;
        this.field5439 = (int) class529.method2982((byte) -69);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZ)Lf;")
    public final class532 method1040(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class264(this, arg0, arg1) : new class39(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class26 var8 = this.method2353(Thread.currentThread());
        class142 var9 = var8.field362;
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
            int var23 = arg0 - var9.method800();
            int var24 = arg1 - var9.method809();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field1930 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1930 = 255 - (arg4 >>> 24);
            }
            var9.field1924 = var25 < 0 || var25 > var9.field1923 || var26 < 0 || var26 > var9.field1923 || var27 < 0 || var27 > var9.field1923;
            var9.method812(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field1924 = var25 < 0 || var25 > var9.field1923 || var27 < 0 || var27 > var9.field1923 || var28 < 0 || var28 > var9.field1923;
            var9.method812(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "()Laa;")
    public final class102 method1141() {
        return new class102(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "()Z")
    public final boolean method1094() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)V")
    public final void method1081(int arg0) {
        this.field5446[arg0].method158(Thread.currentThread(), false);
    }

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "()Z")
    public final boolean method1112() {
        return false;
    }

    @OriginalMember(owner = "client!rfa", name = "VA", descriptor = "(IFFFFF)V")
    public final void method1060(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5452 = (int) (arg1 * 65535.0F);
        this.field5474 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5473 = (int) (arg3 * 65535.0F / var7);
        this.field5443 = (int) (arg4 * 65535.0F / var7);
        this.field5457 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "()Z")
    public final boolean method1065() {
        return true;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Le;)V")
    public final void method1129(class381 arg0) {
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lit;)V")
    public final void method1048(class513 arg0) {
    }

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "()V")
    public final void method1151() throws class56 {
        if (this.field5437 != null && this.field5438 != null) {
            try {
                Graphics var1 = this.field5437.getGraphics();
                this.field5438.method552(0, -23197, var1, 0);
            } catch (Exception var2) {
                this.field5437.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lf;Z)V")
    public final void method1107(class532 arg0, boolean arg1) {
        if (arg0 instanceof class39) {
            class39 var3 = (class39) arg0;
            this.field5444 = var3.field4495;
            this.field5471 = var3.field4492;
            this.field5455 = var3.field511;
            this.field5454 = arg0;
        } else {
            if (!(arg0 instanceof class264)) {
                throw new RuntimeException();
            }
            class264 var4 = (class264) arg0;
            this.field5444 = var4.field4495;
            this.field5471 = var4.field4492;
            this.field5455 = var4.field3436;
            this.field5454 = arg0;
        }
        this.method2346();
    }

    @OriginalMember(owner = "client!rfa", name = "ya", descriptor = "()V")
    public final void method1147() {
        if (this.field5467 == 0 && this.field5469 == this.field5444 && this.field5449 == 0 && this.field5476 == this.field5471) {
            int var1 = this.field5447.length;
            int var2 = var1 - var1 & 7;
            int var3 = 0;
            while (var3 < var2) {
                this.field5447[var3++] = Integer.MAX_VALUE;
                this.field5447[var3++] = Integer.MAX_VALUE;
                this.field5447[var3++] = Integer.MAX_VALUE;
                this.field5447[var3++] = Integer.MAX_VALUE;
                this.field5447[var3++] = Integer.MAX_VALUE;
                this.field5447[var3++] = Integer.MAX_VALUE;
                this.field5447[var3++] = Integer.MAX_VALUE;
                this.field5447[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field5447[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field5469 - this.field5467;
            int var5 = this.field5476 - this.field5449;
            int var6 = this.field5444 - var4;
            int var7 = this.field5449 * this.field5444 + this.field5467;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field5447[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([IIIII)Lf;")
    public final class532 method1122(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class264(this, arg0, arg1, arg2, arg3, arg4) : new class39(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class264(this, arg0, arg1, arg2, arg3, arg4) : new class39(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lit;Lit;FLit;)Lit;")
    public final class513 method1154(class513 arg0, class513 arg1, float arg2, class513 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!rfa", name = "oa", descriptor = "([I)V")
    public final void method1057(int[] arg0) {
        arg0[0] = this.field5467;
        arg0[1] = this.field5449;
        arg0[2] = this.field5469;
        arg0[3] = this.field5476;
    }

    @OriginalMember(owner = "client!rfa", name = "F", descriptor = "()Z")
    public final boolean method2357() {
        return this.field5440;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIF)Lqea;")
    public final class392 method1152(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "()V")
    public final void method1050() {
    }

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "(I)[I")
    public final int[] method2358(int arg0) {
        class380 var2 = this.field5456;
        class139 var3;
        synchronized (this.field5456) {
            var3 = (class139) this.field5456.method2176(-128, (long) arg0);
            if (var3 == null) {
                if (!super.field7682.method2961(true, arg0)) {
                    return null;
                }
                class105 var5 = super.field7682.method2959(93, arg0);
                int var6 = !var5.field1260 && !this.field5468 ? 128 : 64;
                var3 = new class139(arg0, var6, super.field7682.method2964(arg0, (byte) 67, var6, true, 0.7F, var6), var5.field1247);
                this.field5456.method2174(var3, (long) arg0, (byte) -112);
            }
        }
        var3.field1884 = true;
        return var3.method784();
    }

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "()V")
    public final void method1142() {
        if (this.field5436) {
            class374.method2146(true, false, false);
            this.field5436 = false;
        }
        this.field5438 = null;
        this.field5437 = null;
        this.field5441 = null;
        this.field5440 = true;
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "()I")
    public final int method1133() {
        return 0;
    }

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "()V")
    public final void method1125() {
        this.field5456.method2168((byte) -116);
        this.field5461.method2168((byte) -83);
    }

    @OriginalMember(owner = "client!rfa", name = "va", descriptor = "(I)V")
    public final void method1049(int arg0) {
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IIIIII)V")
    public final void method1121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1144(arg0, arg1, arg2, arg4, arg5);
        this.method1144(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1149(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1149(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "()V")
    public final void method1114() {
    }
}
