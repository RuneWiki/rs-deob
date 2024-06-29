import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 extends class162 {

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Z")
    private boolean field485;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Z")
    private boolean field486;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lan;")
    private class20 field484;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Z")
    public boolean field490;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Z")
    private boolean field501;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "Ljv;")
    private class55 field520;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "Ljv;")
    private class55 field525;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "Lsq;")
    public class117 field519;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "F")
    private float field496;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "F")
    private float field507;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Lqr;")
    private class46 field489;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lf;")
    private class529 field504;

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "Lf;")
    private class529 field532;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field487;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "Z")
    public boolean field530;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "[I")
    public int[] field494;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "[Lus;")
    private class1[] field523;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "(IIII)V")
    public final void method198(int arg0, int arg1, int arg2, int arg3) {
        if (this.field513 < arg0) {
            this.field513 = arg0;
        }
        if (this.field529 < arg1) {
            this.field529 = arg1;
        }
        if (this.field506 > arg2) {
            this.field506 = arg2;
        }
        if (this.field502 > arg3) {
            this.field502 = arg3;
        }
        this.method236();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field2501.method956(-945, arg5).field1427) {
                if (this.field533 != arg5) {
                    class529 var10 = (class529) this.field520.method494(0, (long) arg5);
                    if (var10 == null) {
                        int[] var11 = this.method234(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method290(arg5) ? 64 : 128;
                        var10 = this.method306(var11, 0, var12, var12, var12);
                        this.field520.method485((long) arg5, (byte) -125, var10);
                    }
                    this.field533 = arg5;
                    this.field532 = var10;
                }
                this.field532.method105(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method271(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()I")
    public final int method200() {
        return this.field512;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII)V")
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class1 var8 = this.method254(Thread.currentThread());
        class336 var9 = var8.field13;
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
            int var21 = arg0 - var9.method2146();
            int var22 = arg1 - var9.method2160();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field5071 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5071 = 255 - (arg4 >> 24);
            }
            var9.field5063 = var23 < 0 || var23 > var9.field5072 || var24 < 0 || var24 > var9.field5072 || var25 < 0 || var25 > var9.field5072;
            var9.method2155(var27, var28, var29, var23, var24, var25, arg4);
            var9.field5063 = var23 < 0 || var23 > var9.field5072 || var24 < 0 || var24 > var9.field5072 || var26 < 0 || var26 > var9.field5072;
            var9.method2155(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "()Z")
    public final boolean method202() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "s", descriptor = "()V")
    public final void method203() {
        if (this.field487 != null && this.field489 != null) {
            try {
                Graphics var1 = this.field487.getGraphics();
                this.field489.method441(0, var1, 0, -94);
            } catch (Exception var2) {
                this.field487.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(IIIIII)Lbi;")
    public final class333 method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!o", name = "A", descriptor = "()Z")
    public final boolean method205() {
        return this.field485;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public final void method206() {
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
    public final void method207(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!o", name = "o", descriptor = "()Z")
    public final boolean method208() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "aa", descriptor = "(IIIIII[BII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field528 * arg1 + arg0;
            int var15 = this.field528 - arg2;
            if (arg1 + arg3 > this.field502) {
                arg3 -= arg1 + arg3 - this.field502;
            }
            if (arg1 < this.field529) {
                int var16 = this.field529 - arg1;
                arg3 -= var16;
                var14 += this.field528 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field506) {
                int var17 = arg0 + arg2 - this.field506;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field513) {
                int var18 = this.field513 - arg0;
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
                            int var28 = this.field494[var14];
                            this.field494[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field494[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field494[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field494[var14++] = arg5;
                        } else {
                            this.field494[var14++] = arg4;
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

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V")
    public final void method210(boolean arg0) {
        this.field501 = arg0;
        this.field525.method488(-3);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public final void method211(boolean arg0) {
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public final void method212(int arg0) {
        this.field523[arg0].method7((Runnable) null, (byte) 120);
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
    public final void method213(int arg0) {
        int var2 = arg0 - this.field488;
        for (Object var3 = this.field525.method491((byte) 125); var3 != null; var3 = this.field525.method492(-1)) {
            class112 var4 = (class112) var3;
            if (var4.field1892) {
                var4.field1893 += var2;
                int var5 = var4.field1893 / 20;
                if (var5 > 0) {
                    class83 var6 = super.field2501.method956(-945, var4.field1889);
                    var4.method837(var6.field1430 * var2 * 50 / 1000, var6.field1433 * var2 * 50 / 1000);
                    var4.field1893 -= var5 * 20;
                }
                var4.field1892 = false;
            }
        }
        this.field488 = arg0;
        this.field520.method493(false, 5);
    }

    @OriginalMember(owner = "client!o", name = "ba", descriptor = "(IIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3) {
        this.field493 = arg0;
        this.field492 = arg1;
        this.field497 = arg2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFF)V")
    public final void method215(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!o", name = "da", descriptor = "(IIIII)V")
    public final void method216(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field513 && arg0 < this.field506) {
            if (arg1 < this.field529) {
                arg2 -= this.field529 - arg1;
                arg1 = this.field529;
            }
            if (arg1 + arg2 > this.field502) {
                arg2 = this.field502 - arg1;
            }
            int var6 = this.field528 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field528 * var10 + var6;
                        int var12 = this.field494[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field494[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field528 * var14 + var6;
                        int var16 = this.field494[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field494[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field494[this.field528 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "FA", descriptor = "()I")
    public final int method217() {
        return 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class529 method218(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field528 * arg1 + arg0;
        int var8 = this.field528 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field494[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class313(this, var6, arg2, arg3);
        } else {
            return new class31(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!o", name = "k", descriptor = "()Z")
    public final boolean method219() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public final void method220(boolean arg0) {
    }

    @OriginalMember(owner = "client!o", name = "la", descriptor = "()F")
    public final float method221() {
        return this.field496;
    }

    @OriginalMember(owner = "client!o", name = "S", descriptor = "()V")
    public final void method222() {
        this.field492 = this.field510;
        this.field490 = false;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()Z")
    public final boolean method223() {
        return true;
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "()Z")
    public final boolean method224() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method225(Canvas arg0) {
        if (arg0 != null) {
            class46 var2 = (class46) this.field484.method171((byte) 64, (long) arg0.hashCode());
            if (var2 != null) {
                this.field487 = arg0;
                this.field489 = var2;
                if (this.field504 == null) {
                    this.field494 = var2.field858;
                    this.field528 = var2.field859;
                    this.field491 = var2.field855;
                    this.method242();
                    return;
                }
            }
        } else {
            this.field487 = null;
            this.field489 = null;
            if (this.field504 == null) {
                this.field494 = null;
                this.field528 = this.field491 = 1;
                this.method242();
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "r", descriptor = "()Z")
    public final boolean method226() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method227(Rectangle[] arg0, int arg1) {
        if (this.field487 != null && this.field489 != null) {
            try {
                Graphics var3 = this.field487.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field528 && var5.y <= this.field491 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field489.method442(var5.x, var5.width, var5.height, var5.y, -30179, var3);
                    }
                }
            } catch (Exception var6) {
                this.field487.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!o", name = "xa", descriptor = "()I")
    public final int method228() {
        int var1 = this.field495;
        this.field495 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!o", name = "D", descriptor = "()V")
    private final void method229() {
        if (this.field507 != 0.0F) {
            float var1 = (float) this.field514;
            float var2 = (float) this.field512;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field496 / (this.field507 + this.field496);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field507;
            this.field526 = (int) (((float) this.field514 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field526 = this.field514;
        }
    }

    @OriginalMember(owner = "client!o", name = "GA", descriptor = "(IIII)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3) {
        this.field499 = arg0;
        this.field508 = arg1;
        this.field498 = arg2;
        this.field516 = arg3;
        this.method236();
    }

    @OriginalMember(owner = "client!o", name = "v", descriptor = "()Lia;")
    public final class414 method231() {
        return new class117();
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()Z")
    public final boolean method232() {
        return true;
    }

    @OriginalMember(owner = "client!o", name = "XA", descriptor = "(IFFFFF)V")
    public final void method233(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field521 = (int) (arg1 * 65535.0F);
        this.field524 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field511 = (int) (arg3 * 65535.0F / var7);
        this.field522 = (int) (arg4 * 65535.0F / var7);
        this.field500 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)[I")
    private final int[] method234(int arg0) {
        class55 var2 = this.field525;
        class112 var3;
        synchronized (this.field525) {
            var3 = (class112) this.field525.method494(0, (long) arg0);
            if (var3 == null) {
                if (!super.field2501.method959(arg0, (byte) 94)) {
                    return null;
                }
                class83 var5 = super.field2501.method956(-945, arg0);
                int var6 = !var5.field1429 && !this.field501 ? 128 : 64;
                var3 = new class112(arg0, var6, super.field2501.method957(true, arg0, var6, 0.7F, var6, 26878), var5.field1445);
                this.field525.method485((long) arg0, (byte) -125, var3);
            }
        }
        var3.field1892 = true;
        return var3.method836();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIILea;II)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        class4 var10 = (class4) arg6;
        int[] var11 = var10.field105;
        int[] var12 = var10.field107;
        int var13 = this.field529 > arg8 ? this.field529 : arg8;
        int var14 = this.field502 < var11.length + arg8 ? this.field502 : var11.length + arg8;
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
            if (arg0 < this.field513) {
                var18 += (this.field513 - arg0) * var20;
                arg0 = this.field513;
            }
            if (var21 >= this.field506) {
                var21 = this.field506 - 1;
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
                                int var28 = this.field528 * var25 + arg0;
                                int var29 = this.field494[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field494[var28] = var23 + var30;
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
                                int var34 = this.field528 * var31 + arg0;
                                int var35 = this.field494[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field494[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field494[this.field528 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field513 && var64 < this.field506 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field494[this.field528 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field513 && var50 < this.field506 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field528 * arg1 + var50;
                        int var54 = this.field494[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field494[this.field528 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field513 && var56 < this.field506 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field528 * arg1 + var56;
                        int var60 = this.field494[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field494[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "E", descriptor = "()V")
    private final void method236() {
        this.field505 = this.field513 - this.field499;
        this.field509 = this.field506 - this.field499;
        this.field503 = this.field529 - this.field508;
        this.field517 = this.field502 - this.field508;
        for (int var1 = 0; var1 < this.field527; ++var1) {
            class336 var5 = this.field523[var1].field13;
            var5.field5069 = this.field499 - this.field513;
            var5.field5075 = this.field508 - this.field529;
            var5.field5072 = this.field506 - this.field513;
            var5.field5068 = this.field502 - this.field529;
        }
        int var2 = this.field529 * this.field528 + this.field513;
        for (int var3 = this.field529; var3 < this.field502; ++var3) {
            for (int var4 = 0; var4 < this.field527; ++var4) {
                this.field523[var4].field13.field5066[var3 - this.field529] = var2;
            }
            var2 += this.field528;
        }
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(I)Z")
    public final boolean method237(int arg0) {
        return super.field2501.method959(arg0, (byte) 94);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Ll;")
    public final class16 method238(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
    public final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method288(arg0, arg1, arg2, arg4, arg5);
        this.method288(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method216(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method216(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!o", name = "n", descriptor = "()Lia;")
    public final class414 method240() {
        class1 var1 = this.method254(Thread.currentThread());
        return var1.field11;
    }

    @OriginalMember(owner = "client!o", name = "M", descriptor = "(I)V")
    public final void method241(int arg0) {
        this.method253(0, 0, this.field528, this.field491, arg0, 0);
    }

    @OriginalMember(owner = "client!o", name = "F", descriptor = "()V")
    private final void method242() {
        for (int var1 = 0; var1 < this.field527; ++var1) {
            this.field523[var1].method3(-1);
        }
        this.method258();
    }

    @OriginalMember(owner = "client!o", name = "V", descriptor = "(III)V")
    public final void method243(int arg0, int arg1, int arg2) {
        this.field492 = arg0 & 16777215;
        int var4 = this.field492 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field492 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field492 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field492 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field530 = false;
        } else {
            this.field530 = true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class1 var11 = this.method254(Thread.currentThread());
        class336 var12 = var11.field13;
        var12.field5064 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field5064 = false;
            var12.field5071 = 0;
            var12.field5063 = true;
            var12.method2149(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field5064 = false;
            var12.field5071 = 255 - var13;
            var12.field5063 = true;
            var12.method2149(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field5064 = true;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public final void method245(int arg0) {
    }

    @OriginalMember(owner = "client!o", name = "k", descriptor = "(I)I")
    public final int method246(int arg0) {
        return super.field2501.method956(-945, arg0).field1432 & 65535;
    }

    @OriginalMember(owner = "client!o", name = "C", descriptor = "()V")
    public final void method247() {
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method248(Canvas arg0) {
        class46 var2 = (class46) this.field484.method171((byte) 23, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2090(-1);
            class46 var3 = class111.method832(arg0, true);
            this.field484.method166(var3, (long) arg0.hashCode(), 81);
            if (this.field487 == arg0 && this.field504 == null) {
                this.field489 = var3;
                this.field494 = var3.field858;
                this.field528 = var3.field859;
                this.field491 = var3.field855;
                this.method242();
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lc;Lsh;Lia;Llc;I)V")
    public final void method249(class121 arg0, class49 arg1, class414 arg2, class456 arg3, int arg4) {
        ((class231) arg0).method1511(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method250(Canvas arg0) {
        if (this.field487 == arg0) {
            this.method225((Canvas) null);
        }
        class46 var2 = (class46) this.field484.method171((byte) -84, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2090(-1);
        }
    }

    @OriginalMember(owner = "client!o", name = "u", descriptor = "([I)V")
    public final void method251(int[] arg0) {
        arg0[0] = this.field513;
        arg0[1] = this.field529;
        arg0[2] = this.field506;
        arg0[3] = this.field502;
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "()I")
    public final int method252() {
        int var1 = this.field518;
        this.field518 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!o", name = "NA", descriptor = "(IIIIII)V")
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field513) {
            arg2 -= this.field513 - arg0;
            arg0 = this.field513;
        }
        if (arg1 < this.field529) {
            arg3 -= this.field529 - arg1;
            arg1 = this.field529;
        }
        if (arg0 + arg2 > this.field506) {
            arg2 = this.field506 - arg0;
        }
        if (arg1 + arg3 > this.field502) {
            arg3 = this.field502 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field506 && arg1 <= this.field502) {
            int var7 = this.field528 - arg2;
            int var8 = this.field528 * arg1 + arg0;
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
                            this.field494[var24] = arg4;
                            ++var24;
                            this.field494[var24] = arg4;
                            ++var24;
                            this.field494[var24] = arg4;
                            ++var24;
                            this.field494[var24] = arg4;
                            ++var24;
                            this.field494[var24] = arg4;
                            ++var24;
                            this.field494[var24] = arg4;
                            ++var24;
                            this.field494[var24] = arg4;
                            ++var24;
                            this.field494[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field494[var24] = arg4;
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
                        int var14 = this.field494[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field494[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field494[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field494[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/Runnable;)Lus;")
    public final class1 method254(Runnable arg0) {
        for (int var2 = 0; var2 < this.field527; ++var2) {
            if (this.field523[var2].field5 == arg0) {
                return this.field523[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)I")
    public final int method255(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public final void method256(int arg0) {
        if (this.field527 != arg0) {
            this.field527 = arg0;
            this.field523 = new class1[this.field527];
            for (int var2 = 0; var2 < this.field527; ++var2) {
                this.field523[var2] = new class1(this);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "l", descriptor = "(I)[I")
    public final int[] method257(int arg0) {
        class55 var2 = this.field525;
        class112 var3;
        synchronized (this.field525) {
            var3 = (class112) this.field525.method494(0, (long) arg0);
            if (var3 == null) {
                if (!super.field2501.method959(arg0, (byte) 94)) {
                    return null;
                }
                class83 var5 = super.field2501.method956(-945, arg0);
                int var6 = !var5.field1429 && !this.field501 ? 128 : 64;
                var3 = new class112(arg0, var6, super.field2501.method958(arg0, var6, var6, true, true, 0.7F), var5.field1445);
                this.field525.method485((long) arg0, (byte) -125, var3);
            }
        }
        var3.field1892 = true;
        return var3.method836();
    }

    @OriginalMember(owner = "client!o", name = "va", descriptor = "()V")
    public final void method258() {
        this.field513 = 0;
        this.field529 = 0;
        this.field506 = this.field528;
        this.field502 = this.field491;
        this.method236();
    }

    @OriginalMember(owner = "client!o", name = "IA", descriptor = "(IIII)[I")
    public final int[] method259(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field528 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field494[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Leu;[Lwe;Z)Loa;")
    public final class489 method260(class332 arg0, class279[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4005;
            var5[var7] = arg1[var7].field4003;
            if (arg1[var7].field4004 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class505(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class439(this, arg0, arg1, var4, var5);
        } else {
            return new class301(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method261(Canvas arg0) {
        class46 var2 = (class46) this.field484.method171((byte) 69, (long) arg0.hashCode());
        if (var2 == null) {
            class46 var3 = class111.method832(arg0, true);
            this.field484.method166(var3, (long) arg0.hashCode(), -108);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;III)V")
    public final void method262(class41 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field741;
        int var6 = arg3 >> 1;
        if (var5 == -1) {
            this.method271(arg1, arg2, var6, arg0.field735, 1);
        } else {
            if (this.field533 != var5) {
                class529 var7 = (class529) this.field520.method494(0, (long) var5);
                if (var7 == null) {
                    int[] var8 = this.method234(var5);
                    if (var8 == null) {
                        return;
                    }
                    int var9 = this.method290(var5) ? 64 : 128;
                    var7 = this.method306(var8, 0, var9, var9, var9);
                    this.field520.method485((long) var5, (byte) -125, var7);
                }
                this.field533 = var5;
                this.field532 = var7;
            }
            if (this.field532.method100() == 64) {
                arg3 <<= 1;
                var6 <<= 1;
            }
            this.field532.method105(arg1 - var6, arg2 - var6, arg3, arg3, 0, arg0.field735, 1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([Lc;Lia;[Llc;I)V")
    public final void method263(class121[] arg0, class414 arg1, class456[] arg2, int arg3) {
        class231[] var5 = new class231[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class231) arg0[var6];
            }
        }
        class231 var7 = class231.method1515(this, var5);
        var7.method1511(arg1, arg2 != null ? arg2[0] : null, (class49) null, arg3);
    }

    @OriginalMember(owner = "client!o", name = "B", descriptor = "()Z")
    public final boolean method264() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lnd;IIII)Lc;")
    public final class121 method265(class380 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class231(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!o", name = "fa", descriptor = "(IIII)V")
    public final void method266(int arg0, int arg1, int arg2, int arg3) {
        this.field510 = this.field492;
        this.field493 = arg0;
        this.field492 = arg1;
        this.field497 = arg2;
        this.field490 = true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIF)Lfk;")
    public final class462 method267(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lsh;)V")
    public final void method268(class49 arg0) {
        class141 var2 = arg0.field892.field3397;
        for (class141 var3 = var2.field2236; var2 != var3; var3 = var3.field2236) {
            class41 var4 = (class41) var3;
            int var5 = var4.field738 >> 12;
            int var6 = var4.field743 >> 12;
            int var7 = var4.field745 >> 12;
            int var8 = (this.field519.field1934 * var7 + this.field519.field1938 * var6 + this.field519.field1937 * var5 >> 15) + this.field519.field1935;
            if (var8 >= this.field512 && var8 <= this.field515) {
                int var9 = ((this.field519.field1931 * var7 + this.field519.field1940 * var6 + this.field519.field1932 * var5 >> 15) + this.field519.field1941) * this.field498 / var8 + this.field499;
                int var10 = ((this.field519.field1930 * var7 + this.field519.field1939 * var5 + this.field519.field1936 * var6 >> 15) + this.field519.field1933) * this.field516 / var8 + this.field508;
                if (var9 >= this.field513 && var9 <= this.field506 && var10 >= this.field529 && var10 <= this.field502) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method262(var4, var9, var10, (var4.field744 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "p", descriptor = "()Z")
    public final boolean method269() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(ILea;II)V")
    public final void method270(int arg0, class381 arg1, int arg2, int arg3) {
        class4 var5 = (class4) arg1;
        int[] var6 = var5.field105;
        int[] var7 = var5.field107;
        int var8;
        if (this.field502 < var6.length + arg3) {
            var8 = this.field502 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field529 > arg3) {
            var9 = this.field529 - arg3;
            arg3 = this.field529;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field528 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field513 > var12) {
                    var13 -= this.field513 - var12;
                    var12 = this.field513;
                }
                if (this.field506 < var12 + var13) {
                    var13 = this.field506 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field494[var14++] = arg0;
                }
                var10 += this.field528;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "O", descriptor = "(IIIII)V")
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field529) {
            var6 = this.field529;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field502) {
            var7 = this.field502;
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
                if (var64 < this.field513) {
                    var64 = this.field513;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field506) {
                    var65 = this.field506;
                }
                int var66 = this.field528 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field494[var66++] = arg3;
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
                if (var60 < this.field513) {
                    var60 = this.field513;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field506 - 1) {
                    var61 = this.field506 - 1;
                }
                int var62 = this.field528 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field494[var62++] = arg3;
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
                if (var28 < this.field513) {
                    var28 = this.field513;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field506) {
                    var29 = this.field506;
                }
                int var30 = this.field528 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field494[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field494[var30++] = var15 + var33;
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
                if (var22 < this.field513) {
                    var22 = this.field513;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field506 - 1) {
                    var23 = this.field506 - 1;
                }
                int var24 = this.field528 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field494[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field494[var24++] = var15 + var27;
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
                if (var47 < this.field513) {
                    var47 = this.field513;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field506) {
                    var48 = this.field506;
                }
                int var49 = this.field528 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field494[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field494[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field513) {
                    var39 = this.field513;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field506 - 1) {
                    var40 = this.field506 - 1;
                }
                int var41 = this.field528 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field494[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field494[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([Lc;Lsh;Lia;[Llc;I)V")
    public final void method272(class121[] arg0, class49 arg1, class414 arg2, class456[] arg3, int arg4) {
        class231[] var6 = new class231[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class231) arg0[var7];
            }
        }
        class231 var8 = class231.method1515(this, var6);
        var8.method1511(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public final class35 method273(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class415(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!o", name = "SA", descriptor = "(IIIIII)Z")
    public final boolean method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field519.field1934 * arg2 + this.field519.field1938 * arg1 + this.field519.field1937 * arg0 >> 15) + this.field519.field1935;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field519.field1934 * arg5 + this.field519.field1938 * arg4 + this.field519.field1937 * arg3 >> 15) + this.field519.field1935;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field512 || var8 >= this.field512) && (var7 <= this.field514 || var8 <= this.field514)) {
            int var9 = ((this.field519.field1931 * arg2 + this.field519.field1940 * arg1 + this.field519.field1932 * arg0 >> 15) + this.field519.field1941) * this.field498 / var7;
            int var10 = ((this.field519.field1931 * arg5 + this.field519.field1940 * arg4 + this.field519.field1932 * arg3 >> 15) + this.field519.field1941) * this.field498 / var8;
            if (var9 < this.field505 && var10 < this.field505 || var9 > this.field509 && var10 > this.field509) {
                return false;
            } else {
                int var11 = ((this.field519.field1930 * arg2 + this.field519.field1939 * arg0 + this.field519.field1936 * arg1 >> 15) + this.field519.field1933) * this.field516 / var7;
                int var12 = ((this.field519.field1930 * arg5 + this.field519.field1939 * arg3 + this.field519.field1936 * arg4 >> 15) + this.field519.field1933) * this.field516 / var8;
                return (var11 >= this.field503 || var12 >= this.field503) && (var11 <= this.field517 || var12 <= this.field517);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILm;)V")
    private class24(int arg0, class126 arg1) {
        super(arg0, arg1);
        this.field485 = false;
        this.field486 = false;
        this.field484 = new class20(4);
        this.field490 = false;
        this.field498 = 512;
        this.field492 = 0;
        this.field513 = 0;
        this.field514 = 3500;
        this.field510 = 0;
        this.field518 = 0;
        this.field497 = 0;
        this.field515 = this.field514 - 255;
        this.field502 = 0;
        this.field512 = 50;
        this.field506 = 0;
        this.field495 = 0;
        this.field521 = 45823;
        this.field524 = 78642;
        this.field493 = 0;
        this.field529 = 0;
        this.field526 = 3500;
        this.field531 = 75518;
        this.field516 = 512;
        this.field501 = false;
        this.field520 = new class55(16);
        this.field533 = -1;
        this.field525 = new class55(20);
        this.field519 = new class117();
        this.method256(1);
        this.method277(0);
        class392.method2432(true, false, (byte) 51);
        this.field486 = true;
    }

    @OriginalMember(owner = "client!o", name = "W", descriptor = "()I")
    public final int method275() {
        return this.field514;
    }

    @OriginalMember(owner = "client!o", name = "w", descriptor = "()F")
    public final float method276() {
        return this.field507;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public final void method277(int arg0) {
        this.field523[arg0].method7(Thread.currentThread(), (byte) 124);
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "()V")
    public final void method278() {
        this.field525.method488(-3);
    }

    @OriginalMember(owner = "client!o", name = "ia", descriptor = "(III[I)V")
    public final void method279(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field519.field1934 * arg2 + this.field519.field1938 * arg1 + this.field519.field1937 * arg0 >> 15) + this.field519.field1935;
        if (var5 >= this.field512 && var5 <= this.field514) {
            int var6 = ((this.field519.field1931 * arg2 + this.field519.field1940 * arg1 + this.field519.field1932 * arg0 >> 15) + this.field519.field1941) * this.field498 / var5;
            int var7 = ((this.field519.field1930 * arg2 + this.field519.field1939 * arg0 + this.field519.field1936 * arg1 >> 15) + this.field519.field1933) * this.field516 / var5;
            if (var6 >= this.field505 && var6 <= this.field509 && var7 >= this.field503 && var7 <= this.field517) {
                arg3[0] = var6 - this.field505;
                arg3[1] = var7 - this.field503;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    public final int method280(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!o", name = "ua", descriptor = "(F)V")
    public final void method281(float arg0) {
        this.field531 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(IIIIII)V")
    public final void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method288(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method288(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method216(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method216(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field513) {
                    var10 += (this.field513 - arg0) * var12;
                    arg0 = this.field513;
                }
                if (var13 >= this.field506) {
                    var13 = this.field506 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field529 && var17 < this.field502) {
                                int var18 = this.field528 * var17 + arg0;
                                int var19 = this.field494[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field494[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field529 && var21 < this.field502) {
                                int var22 = this.field528 * var21 + arg0;
                                int var23 = this.field494[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field494[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field529 && var27 < this.field502) {
                            this.field494[this.field528 * var27 + arg0] = arg4;
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
                if (arg1 < this.field529) {
                    var29 += (this.field529 - arg1) * var31;
                    arg1 = this.field529;
                }
                if (var32 >= this.field502) {
                    var32 = this.field502 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field513 && var46 < this.field506) {
                            this.field494[this.field528 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field513 && var36 < this.field506) {
                            int var37 = this.field528 * arg1 + var36;
                            int var38 = this.field494[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field494[this.field528 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field513 && var40 < this.field506) {
                            int var41 = this.field528 * arg1 + var40;
                            int var42 = this.field494[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field494[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!o", name = "q", descriptor = "()Z")
    public final boolean method283() {
        return true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lbi;)V")
    public final void method284(class333 arg0) {
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()Z")
    public final boolean method285() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "m", descriptor = "()Z")
    public final boolean method286() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "z", descriptor = "()Z")
    public final boolean method287() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "U", descriptor = "(IIIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field529 && arg1 < this.field502) {
            if (arg0 < this.field513) {
                arg2 -= this.field513 - arg0;
                arg0 = this.field513;
            }
            if (arg0 + arg2 > this.field506) {
                arg2 = this.field506 - arg0;
            }
            int var6 = this.field528 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field494[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field494[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field494[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field494[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field494[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Lfk;)V")
    public final void method289(int arg0, class462[] arg1) {
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;)V")
    public class24(int arg0, Canvas arg1, class126 arg2) {
        this(arg0, arg2);
        this.method261(arg1);
        this.method225(arg1);
    }

    @OriginalMember(owner = "client!o", name = "m", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        return this.field501 || super.field2501.method956(-945, arg0).field1429;
    }

    @OriginalMember(owner = "client!o", name = "u", descriptor = "()V")
    public final void method291() {
    }

    @OriginalMember(owner = "client!o", name = "n", descriptor = "(I)Z")
    public final boolean method292(int arg0) {
        return super.field2501.method956(-945, arg0).field1441;
    }

    @OriginalMember(owner = "client!o", name = "y", descriptor = "()I")
    public final int method293() {
        return 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[I[I)Lea;")
    public final class381 method294(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class4(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lbi;Lbi;FLbi;)Lbi;")
    public final class333 method295(class333 arg0, class333 arg1, float arg2, class333 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!o", name = "JA", descriptor = "(II)V")
    public final void method296(int arg0, int arg1) {
        this.field512 = arg0;
        this.field514 = arg1;
        this.field515 = this.field514 - 255;
        this.method229();
    }

    @OriginalMember(owner = "client!o", name = "x", descriptor = "()V")
    public final void method297() {
        if (this.field486) {
            class404.method2473(false, true, 7);
            this.field486 = false;
        }
        this.field489 = null;
        this.field487 = null;
        this.field484 = null;
        this.field485 = true;
    }

    @OriginalMember(owner = "client!o", name = "pa", descriptor = "(IIII)V")
    public final void method298(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field528) {
            arg2 = this.field528;
        }
        if (arg3 > this.field491) {
            arg3 = this.field491;
        }
        this.field513 = arg0;
        this.field506 = arg2;
        this.field529 = arg1;
        this.field502 = arg3;
        this.method236();
    }

    @OriginalMember(owner = "client!o", name = "l", descriptor = "()Z")
    public final boolean method299() {
        return true;
    }

    @OriginalMember(owner = "client!o", name = "o", descriptor = "(FF)V")
    public final void method300(float arg0, float arg1) {
        this.field496 = arg0;
        this.field507 = arg1;
        this.method229();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ll;)V")
    public final void method301(class16 arg0) {
    }

    @OriginalMember(owner = "client!o", name = "m", descriptor = "(Lia;)V")
    public final void method302(class414 arg0) {
        this.field519 = (class117) arg0;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "()V")
    public final void method303() {
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lwe;Z)Lf;")
    public final class529 method304(class279 arg0, boolean arg1) {
        int[] var3 = arg0.field4011;
        byte[] var4 = arg0.field4006;
        int var5 = arg0.field4005;
        int var6 = arg0.field4003;
        class371 var11;
        if (arg1 && arg0.field4004 == null) {
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
            var11 = new class204(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4004;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class313(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class313(this, var14, var5, var6);
                var11 = new class31(this, var14, var5, var6);
            }
        }
        var11.method99(arg0.field4007, arg0.field4008, arg0.field4009, arg0.field4010);
        return var11;
    }

    @OriginalMember(owner = "client!o", name = "t", descriptor = "()Z")
    public final boolean method305() {
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([IIIII)Lf;")
    public final class529 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class313(this, arg0, arg1, arg2, arg3, arg4) : new class31(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class313(this, arg0, arg1, arg2, arg3, arg4) : new class31(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!o", name = "na", descriptor = "(I)V")
    public final void method307(int arg0) {
    }
}
