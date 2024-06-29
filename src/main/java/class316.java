import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class316 extends class60 {

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "Z")
    private boolean field4472;

    @OriginalMember(owner = "client!iw", name = "D", descriptor = "Z")
    private boolean field4473;

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "Lhe;")
    private class372 field4470;

    @OriginalMember(owner = "client!iw", name = "Q", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!iw", name = "U", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!iw", name = "X", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!iw", name = "O", descriptor = "I")
    public int field4484;

    @OriginalMember(owner = "client!iw", name = "I", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!iw", name = "bb", descriptor = "I")
    private int field4497;

    @OriginalMember(owner = "client!iw", name = "ab", descriptor = "I")
    private int field4496;

    @OriginalMember(owner = "client!iw", name = "W", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!iw", name = "Y", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!iw", name = "R", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!iw", name = "jb", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!iw", name = "ib", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!iw", name = "lb", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!iw", name = "mb", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!iw", name = "qb", descriptor = "Z")
    private boolean field4512;

    @OriginalMember(owner = "client!iw", name = "S", descriptor = "Ljt;")
    private class106 field4488;

    @OriginalMember(owner = "client!iw", name = "sb", descriptor = "I")
    private int field4514;

    @OriginalMember(owner = "client!iw", name = "H", descriptor = "Ljt;")
    private class106 field4477;

    @OriginalMember(owner = "client!iw", name = "M", descriptor = "Liv;")
    public class99 field4482;

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "I")
    private int field4468;

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "I")
    private int field4469;

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
    private int field4471;

    @OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!iw", name = "F", descriptor = "I")
    private int field4475;

    @OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
    public int field4479;

    @OriginalMember(owner = "client!iw", name = "K", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!iw", name = "L", descriptor = "I")
    public int field4481;

    @OriginalMember(owner = "client!iw", name = "P", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!iw", name = "V", descriptor = "I")
    private int field4491;

    @OriginalMember(owner = "client!iw", name = "Z", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!iw", name = "db", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!iw", name = "eb", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!iw", name = "fb", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!iw", name = "gb", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!iw", name = "hb", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!iw", name = "nb", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!iw", name = "ob", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!iw", name = "pb", descriptor = "I")
    private int field4511;

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "Lkf;")
    public class255 field4467;

    @OriginalMember(owner = "client!iw", name = "rb", descriptor = "Lpga;")
    private class536 field4513;

    @OriginalMember(owner = "client!iw", name = "T", descriptor = "Lji;")
    private class612 field4489;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4466;

    @OriginalMember(owner = "client!iw", name = "G", descriptor = "[F")
    public float[] field4476;

    @OriginalMember(owner = "client!iw", name = "kb", descriptor = "[F")
    public float[] field4506;

    @OriginalMember(owner = "client!iw", name = "N", descriptor = "[I")
    public int[] field4483;

    @OriginalMember(owner = "client!iw", name = "cb", descriptor = "[Lmd;")
    private class545[] field4498;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lbi;Ldk;)Lpk;", line = 3)
    public final class198 method517(class482 arg0, class512 arg1) {
        return new class612(this, (class536) arg0, (class225) arg1);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 6)
    public final void method446(Canvas arg0) {
        if (arg0 != null) {
            class255 var2 = (class255) this.field4470.method2287((long) arg0.hashCode(), (byte) -117);
            if (var2 != null) {
                this.field4466 = arg0;
                Dimension var3 = arg0.getSize();
                this.field4471 = var3.width;
                this.field4469 = var3.height;
                this.field4467 = var2;
                if (this.field4489 == null) {
                    this.field4483 = var2.field3661;
                    this.field4479 = var2.field3658;
                    this.field4510 = var2.field3660;
                    if (this.field4479 != this.field4475 || this.field4510 != this.field4491) {
                        this.field4511 = this.field4475 = this.field4479;
                        this.field4500 = this.field4491 = this.field4510;
                        this.field4506 = this.field4476 = new float[this.field4491 * this.field4475];
                    }
                    this.method2009();
                    return;
                }
            }
        } else {
            this.field4466 = null;
            this.field4467 = null;
            if (this.field4489 == null) {
                this.field4483 = null;
                this.field4479 = this.field4510 = 1;
                this.field4475 = this.field4491 = 1;
                this.method2009();
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "ra", descriptor = "(IIII)V", line = 54)
    public final void method529(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4498.length; ++var5) {
            this.field4498[var5].field7747 = this.field4498[var5].field7758;
            this.field4498[var5].field7751 = arg0;
            this.field4498[var5].field7758 = arg1;
            this.field4498[var5].field7750 = arg2;
            this.field4498[var5].field7749 = true;
        }
    }

    @OriginalMember(owner = "client!iw", name = "DA", descriptor = "(IIII)V", line = 67)
    public final void method500(int arg0, int arg1, int arg2, int arg3) {
        this.field4495 = arg0;
        this.field4502 = arg1;
        this.field4484 = arg2;
        this.field4508 = arg3;
        this.method2007();
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)[I", line = 75)
    public final int[] method1995(int arg0) {
        class106 var2 = this.field4477;
        class563 var3;
        synchronized (this.field4477) {
            var3 = (class563) this.field4477.method803(116, (long) arg0);
            if (var3 == null) {
                if (!super.field849.method1121(-30695, arg0)) {
                    return null;
                }
                class293 var5 = super.field849.method1124((byte) 33, arg0);
                int var6 = !var5.field4174 && !this.field4512 ? this.field4505 : 64;
                var3 = new class563(arg0, var6, super.field849.method1123((byte) 87, 0.7F, true, arg0, var6, var6), var5.field4192 != 1);
                this.field4477.method801(1, var3, (long) arg0);
            }
        }
        var3.field8016 = true;
        return var3.method3285();
    }

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "()Z", line = 96)
    public final boolean method512() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(IIIIII)V", line = 99)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method497(arg0, arg1, arg2, arg4, arg5);
        this.method497(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method458(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method458(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!iw", name = "I", descriptor = "()I", line = 106)
    public final int method461() {
        int var1 = this.field4497;
        this.field4497 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "()Z", line = 112)
    public final boolean method459() {
        return true;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 115)
    public final void method539(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        if (this.field4466 != null && this.field4467 != null) {
            try {
                Graphics var5 = this.field4466.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field4479 && var7.y + arg3 <= this.field4510 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field4467.method1019(var7.width, var7.height, var7.y, var7.y + arg3, var5, var7.x, var7.x + arg2, 122);
                    }
                }
            } catch (Exception var8) {
                this.field4466.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lkga;IIII)V", line = 145)
    private final void method1996(class547 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field7810;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2001(arg1, arg2, arg3, arg4, arg0.field7804, 1);
        } else {
            if (this.field4514 != var6) {
                class536 var9 = (class536) this.field4488.method803(124, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method1998(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2008(var6) ? 64 : this.field4505;
                    var9 = this.method531(var11, var11, var10, var11, 0, (byte) -101);
                    this.field4488.method801(1, var9, (long) var6);
                }
                this.field4514 = var6;
                this.field4513 = var9;
            }
            ++var8;
            ((class737) this.field4513).method136(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field7804, 1, 1);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIZ)Lpga;", line = 184)
    public final class536 method470(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field4479 * arg1 + arg0;
        int var8 = this.field4479 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field4483[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class26(this, var6, arg2, arg3);
        } else {
            return new class155(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!iw", name = "K", descriptor = "([I)V", line = 216)
    public final void method530(int[] arg0) {
        arg0[0] = this.field4478;
        arg0[1] = this.field4492;
        arg0[2] = this.field4490;
        arg0[3] = this.field4493;
    }

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "()I", line = 222)
    public final int method457() {
        return this.field4494;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lom;)V", line = 224)
    public final void method440(class374 arg0) {
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lfg;Z)Lpga;", line = 228)
    public final class536 method422(class129 arg0, boolean arg1) {
        int[] var3 = arg0.field1732;
        byte[] var4 = arg0.field1738;
        int var5 = arg0.field1734;
        int var6 = arg0.field1739;
        class737 var11;
        if (arg1 && arg0.field1736 == null) {
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
            var11 = new class90(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field1736;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class26(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class155(this, var14, var5, var6);
            }
        }
        var11.method1505(arg0.field1735, arg0.field1737, arg0.field1731, arg0.field1733);
        return var11;
    }

    @OriginalMember(owner = "client!iw", name = "ZA", descriptor = "(IFFFFF)V", line = 331)
    public final void method460(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field4486 = (int) (arg1 * 65535.0F);
        this.field4504 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field4499 = (int) (arg3 * 65535.0F / var7);
        this.field4481 = (int) (arg4 * 65535.0F / var7);
        this.field4485 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "()V", line = 340)
    public final void method533() {
        this.field4477.method809(true);
        this.field4488.method809(true);
    }

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "(I)V", line = 345)
    public final void method487(int arg0) {
        int var2 = arg0 - this.field4468;
        for (Object var3 = this.field4477.method797(-83); var3 != null; var3 = this.field4477.method795(14023)) {
            class563 var4 = (class563) var3;
            if (var4.field8016) {
                var4.field8019 += var2;
                int var5 = var4.field8019 / 20;
                if (var5 > 0) {
                    class293 var6 = super.field849.method1124((byte) -105, var4.field8018);
                    var4.method3284(var6.field4188 * var2 * 50 / 1000, var6.field4171 * var2 * 50 / 1000);
                    var4.field8019 -= var5 * 20;
                }
                var4.field8016 = false;
            }
        }
        this.field4468 = arg0;
        this.field4488.method807(5, -1);
        this.field4477.method807(5, -1);
    }

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "(I)Z", line = 377)
    public final boolean method1997(int arg0) {
        return super.field849.method1121(-30695, arg0);
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "()Lql;", line = 381)
    public final class738 method442() {
        class545 var1 = this.method2005(Thread.currentThread());
        return var1.field7746;
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "()V", line = 385)
    public final void method538() {
        if (this.field4466 != null) {
            this.field4483 = this.field4467.field3661;
            this.field4479 = this.field4467.field3658;
            this.field4510 = this.field4467.field3660;
            this.field4476 = this.field4506;
            this.field4475 = this.field4511;
            this.field4491 = this.field4500;
        } else {
            this.field4479 = 1;
            this.field4510 = 1;
            this.field4483 = null;
            this.field4475 = 1;
            this.field4491 = 1;
            this.field4476 = null;
        }
        this.field4489 = null;
        this.method2009();
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V", line = 408)
    public final void method471(int arg0) {
        this.field4498[arg0].method3194(8, Thread.currentThread());
    }

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "()Z", line = 411)
    public final boolean method478() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "Y", descriptor = "()[I", line = 414)
    public final int[] method434() {
        return new int[] { this.field4495, this.field4502, this.field4484, this.field4508 };
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 417)
    public class316(Canvas arg0, class151 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method455(arg0, arg2, arg3);
            this.method446(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method447((byte) -9);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!iw", name = "xa", descriptor = "(F)V", line = 429)
    public final void method484(float arg0) {
        this.field4487 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "()Lql;", line = 432)
    public final class738 method515() {
        return new class99();
    }

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "(Z)V", line = 437)
    public final void method463(boolean arg0) {
        class545 var2 = this.method2005(Thread.currentThread());
        var2.field7759 = arg0;
    }

    @OriginalMember(owner = "client!iw", name = "da", descriptor = "(III[I)V", line = 442)
    public final void method488(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4482.field1401 + (float) arg0 * this.field4482.field1388 + (float) arg1 * this.field4482.field1389 + this.field4482.field1410;
        if (!(var5 < (float) this.field4494) && !(var5 > (float) this.field4507)) {
            int var6 = (int) (((float) arg2 * this.field4482.field1419 + (float) arg0 * this.field4482.field1395 + (float) arg1 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / var5);
            int var7 = (int) (((float) arg2 * this.field4482.field1417 + (float) arg0 * this.field4482.field1420 + (float) arg1 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / var5);
            if (var6 >= this.field4480 && var6 <= this.field4509 && var7 >= this.field4503 && var7 <= this.field4474) {
                arg3[0] = var6 - this.field4480;
                arg3[1] = var7 - this.field4503;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "()V", line = 465)
    public final void method427() {
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I[Lraa;)V", line = 467)
    public final void method501(int arg0, class609[] arg1) {
    }

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "()Z", line = 470)
    public final boolean method456() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "()I", line = 473)
    public final int method433() {
        return 0;
    }

    @OriginalMember(owner = "client!iw", name = "E", descriptor = "()I", line = 478)
    public final int method464() {
        return 0;
    }

    @OriginalMember(owner = "client!iw", name = "X", descriptor = "(I)V", line = 480)
    public final void method438(int arg0) {
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIII)V", line = 484)
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class545 var8 = this.method2005(Thread.currentThread());
        class7 var9 = var8.field7778;
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
            int var23 = arg0 - var9.method46();
            int var24 = arg1 - var9.method43();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field68 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field68 = 255 - (arg4 >>> 24);
            }
            this.method463(false);
            var9.field69 = var25 < 0 || var25 > var9.field70 || var26 < 0 || var26 > var9.field70 || var27 < 0 || var27 > var9.field70;
            var9.method44((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field69 = var25 < 0 || var25 > var9.field70 || var27 < 0 || var27 > var9.field70 || var28 < 0 || var28 > var9.field70;
            var9.method44((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method463(true);
        }
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(II)I", line = 557)
    public final int method490(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!iw", name = "U", descriptor = "(IIIII)V", line = 561)
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field4492 && arg1 < this.field4493) {
            if (arg0 < this.field4478) {
                arg2 -= this.field4478 - arg0;
                arg0 = this.field4478;
            }
            if (arg0 + arg2 > this.field4490) {
                arg2 = this.field4490 - arg0;
            }
            int var6 = this.field4479 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4483[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field4483[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field4483[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field4483[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field4483[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Ldk;", line = 634)
    public final class512 method454(int arg0, int arg1) {
        return new class225(arg0, arg1);
    }

    @OriginalMember(owner = "client!iw", name = "aa", descriptor = "(IIIIII)V", line = 637)
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field4478) {
            arg2 -= this.field4478 - arg0;
            arg0 = this.field4478;
        }
        if (arg1 < this.field4492) {
            arg3 -= this.field4492 - arg1;
            arg1 = this.field4492;
        }
        if (arg0 + arg2 > this.field4490) {
            arg2 = this.field4490 - arg0;
        }
        if (arg1 + arg3 > this.field4493) {
            arg3 = this.field4493 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field4490 && arg1 <= this.field4493) {
            int var7 = this.field4479 - arg2;
            int var8 = this.field4479 * arg1 + arg0;
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
                            this.field4483[var24] = arg4;
                            ++var24;
                            this.field4483[var24] = arg4;
                            ++var24;
                            this.field4483[var24] = arg4;
                            ++var24;
                            this.field4483[var24] = arg4;
                            ++var24;
                            this.field4483[var24] = arg4;
                            ++var24;
                            this.field4483[var24] = arg4;
                            ++var24;
                            this.field4483[var24] = arg4;
                            ++var24;
                            this.field4483[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field4483[var24] = arg4;
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
                        int var14 = this.field4483[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field4483[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field4483[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field4483[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II[I[I)Laa;", line = 772)
    public final class488 method521(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class341(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "(I)[I", line = 776)
    public final int[] method1998(int arg0) {
        class106 var2 = this.field4477;
        class563 var3;
        synchronized (this.field4477) {
            var3 = (class563) this.field4477.method803(124, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field849.method1121(-30695, arg0)) {
                    return null;
                }
                class293 var5 = super.field849.method1124((byte) 99, arg0);
                int var6 = !var5.field4174 && !this.field4512 ? this.field4505 : 64;
                var3 = new class563(arg0, var6, super.field849.method1126(true, arg0, (byte) 118, 0.7F, var6, var6), var5.field4192 != 1);
                this.field4477.method801(1, var3, (long) arg0 | Long.MIN_VALUE);
            }
        }
        var3.field8016 = true;
        return var3.method3285();
    }

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "()Z", line = 796)
    public final boolean method537() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "(IIIIIII)I", line = 800)
    public final int method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field4482.field1401 + (float) arg0 * this.field4482.field1388 + (float) arg1 * this.field4482.field1389 + this.field4482.field1410;
        float var9 = (float) arg5 * this.field4482.field1401 + (float) arg3 * this.field4482.field1388 + (float) arg4 * this.field4482.field1389 + this.field4482.field1410;
        int var10 = 0;
        if (var8 < (float) this.field4494 && var9 < (float) this.field4494) {
            var10 |= 16;
        } else if (var8 > (float) this.field4507 && var9 > (float) this.field4507) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field4482.field1419 + (float) arg0 * this.field4482.field1395 + (float) arg1 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field4482.field1419 + (float) arg3 * this.field4482.field1395 + (float) arg4 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / (float) arg6);
        if (var11 < this.field4480 && var12 < this.field4480) {
            var10 |= 1;
        } else if (var11 > this.field4509 && var12 > this.field4509) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field4482.field1417 + (float) arg0 * this.field4482.field1420 + (float) arg1 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field4482.field1417 + (float) arg3 * this.field4482.field1420 + (float) arg4 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / (float) arg6);
        if (var13 < this.field4503 && var14 < this.field4503) {
            var10 |= 4;
        } else if (var13 > this.field4474 && var14 > this.field4474) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIIII)V", line = 838)
    public final void method1999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field849.method1124((byte) 31, arg6).field4184) {
                if (this.field4514 != arg6) {
                    class536 var11 = (class536) this.field4488.method803(120, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method1998(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2008(arg6) ? 64 : this.field4505;
                        var11 = this.method531(var13, var13, var12, var13, 0, (byte) -101);
                        this.field4488.method801(1, var11, (long) arg6);
                    }
                    this.field4514 = arg6;
                    this.field4513 = var11;
                }
                ((class737) this.field4513).method136(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method2001(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(FFF)V", line = 870)
    public final void method489(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!iw", name = "GA", descriptor = "(I)V", line = 873)
    public final void method502(int arg0) {
        this.method516(0, 0, this.field4479, this.field4510, arg0, 0);
    }

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "()Z", line = 877)
    public final boolean method2000() {
        return this.field4472;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 881)
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class545 var14 = this.method2005(Thread.currentThread());
        class7 var15 = var14.field7778;
        var15.field67 = false;
        int var16 = arg0 - this.field4480;
        int var17 = arg3 - this.field4480;
        int var18 = arg6 - this.field4480;
        int var19 = arg1 - this.field4503;
        int var20 = arg4 - this.field4503;
        int var21 = arg7 - this.field4503;
        var15.field69 = var16 < 0 || var16 > var15.field70 || var17 < 0 || var17 > var15.field70 || var18 < 0 || var18 > var15.field70;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field68 = 255 - var22;
                var15.field71 = false;
                var15.method47((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field68 = 128;
                var15.field71 = true;
                var15.method47((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field68 = 0;
            var15.field71 = false;
            var15.method47((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field67 = true;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIII)V", line = 921)
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 925)
    public final void method417(Canvas arg0, int arg1, int arg2) {
        class255 var4 = (class255) this.field4470.method2287((long) arg0.hashCode(), (byte) -117);
        if (var4 != null) {
            var4.method1304((byte) 7);
            class255 var5 = class175.method1246(-1209375263, arg2, arg0, arg1);
            this.field4470.method2278((byte) -27, (long) arg0.hashCode(), var5);
            if (this.field4466 == arg0 && this.field4489 == null) {
                Dimension var6 = arg0.getSize();
                this.field4471 = var6.width;
                this.field4469 = var6.height;
                this.field4467 = var5;
                this.field4483 = var5.field3661;
                this.field4479 = var5.field3658;
                this.field4510 = var5.field3660;
                if (this.field4479 != this.field4475 || this.field4510 != this.field4491) {
                    this.field4511 = this.field4475 = this.field4479;
                    this.field4500 = this.field4491 = this.field4510;
                    this.field4506 = this.field4476 = new float[this.field4491 * this.field4475];
                }
                this.method2009();
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(IIIIII)V", line = 955)
    private final void method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field4492) {
            var7 = this.field4492;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field4493) {
            var8 = this.field4493;
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
                if (var65 < this.field4478) {
                    var65 = this.field4478;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field4490) {
                    var66 = this.field4490;
                }
                int var67 = this.field4479 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field4476[var67]) {
                        this.field4483[var67] = arg4;
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
                if (var61 < this.field4478) {
                    var61 = this.field4478;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field4490 - 1) {
                    var62 = this.field4490 - 1;
                }
                int var63 = this.field4479 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field4476[var63]) {
                        this.field4483[var63] = arg4;
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
                if (var29 < this.field4478) {
                    var29 = this.field4478;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field4490) {
                    var30 = this.field4490;
                }
                int var31 = this.field4479 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field4476[var31]) {
                        int var33 = this.field4483[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field4483[var31] = var16 + var34;
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
                if (var23 < this.field4478) {
                    var23 = this.field4478;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field4490 - 1) {
                    var24 = this.field4490 - 1;
                }
                int var25 = this.field4479 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field4476[var25]) {
                        int var27 = this.field4483[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field4483[var25] = var16 + var28;
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
                if (var48 < this.field4478) {
                    var48 = this.field4478;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field4490) {
                    var49 = this.field4490;
                }
                int var50 = this.field4479 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field4476[var50]) {
                        int var52 = this.field4483[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field4483[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field4478) {
                    var40 = this.field4478;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field4490 - 1) {
                    var41 = this.field4490 - 1;
                }
                int var42 = this.field4479 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field4476[var42]) {
                        int var44 = this.field4483[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field4483[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "()Z", line = 1271)
    public final boolean method475() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(II)I", line = 1274)
    public final int method491(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(II)V", line = 1278)
    public final void method462(int arg0, int arg1) throws class566 {
        if (this.field4466 != null && this.field4467 != null) {
            try {
                Graphics var3 = this.field4466.getGraphics();
                this.field4467.method1019(this.field4471, this.field4469, 0, arg1, var3, 0, arg0, 106);
            } catch (Exception var4) {
                this.field4466.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(IIIID)V", line = 1295)
    public final void method424(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field4475 - arg2;
        int var8 = this.field4475 * arg1 + arg0;
        float[] var9 = this.field4476;
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

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(Z)V", line = 1323)
    public final void method467(boolean arg0) {
        this.field4512 = arg0;
        this.field4477.method809(true);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lof;)V", line = 1328)
    public final void method523(class624 arg0) {
        class545 var2 = this.method2005(Thread.currentThread());
        class361 var3 = arg0.field8738.field5965;
        for (class361 var4 = var3.field5222; var3 != var4; var4 = var4.field5222) {
            class547 var5 = (class547) var4;
            int var6 = var5.field7801 >> 12;
            int var7 = var5.field7808 >> 12;
            int var8 = var5.field7806 >> 12;
            float var9 = (float) var8 * this.field4482.field1401 + (float) var6 * this.field4482.field1388 + (float) var7 * this.field4482.field1389 + this.field4482.field1410;
            if (!(var9 < (float) this.field4494) && !(var9 > (float) var2.field7753)) {
                int var10 = (int) (((float) var8 * this.field4482.field1419 + (float) var6 * this.field4482.field1395 + (float) var7 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / var9) + this.field4495;
                int var11 = (int) (((float) var8 * this.field4482.field1417 + (float) var6 * this.field4482.field1420 + (float) var7 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / var9) + this.field4502;
                if (var10 >= this.field4478 && var10 <= this.field4490 && var11 >= this.field4492 && var11 <= this.field4493) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method1996(var5, var10, var11, (int) var9, (int) ((float) (this.field4484 * var5.field7800 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "za", descriptor = "(IIIII)V", line = 1366)
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field4492) {
            var6 = this.field4492;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field4493) {
            var7 = this.field4493;
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
                if (var64 < this.field4478) {
                    var64 = this.field4478;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field4490) {
                    var65 = this.field4490;
                }
                int var66 = this.field4479 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field4483[var66++] = arg3;
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
                if (var60 < this.field4478) {
                    var60 = this.field4478;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field4490 - 1) {
                    var61 = this.field4490 - 1;
                }
                int var62 = this.field4479 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field4483[var62++] = arg3;
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
                if (var28 < this.field4478) {
                    var28 = this.field4478;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field4490) {
                    var29 = this.field4490;
                }
                int var30 = this.field4479 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field4483[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field4483[var30++] = var15 + var33;
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
                if (var22 < this.field4478) {
                    var22 = this.field4478;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field4490 - 1) {
                    var23 = this.field4490 - 1;
                }
                int var24 = this.field4479 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field4483[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field4483[var24++] = var15 + var27;
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
                if (var47 < this.field4478) {
                    var47 = this.field4478;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field4490) {
                    var48 = this.field4490;
                }
                int var49 = this.field4479 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field4483[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field4483[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field4478) {
                    var39 = this.field4478;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field4490 - 1) {
                    var40 = this.field4490 - 1;
                }
                int var41 = this.field4479 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field4483[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field4483[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "(I)I", line = 1654)
    public final int method2002(int arg0) {
        return super.field849.method1124((byte) 97, arg0).field4175 & 65535;
    }

    @OriginalMember(owner = "client!iw", name = "P", descriptor = "(IIIII)V", line = 1657)
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field4478 && arg0 < this.field4490) {
            if (arg1 < this.field4492) {
                arg2 -= this.field4492 - arg1;
                arg1 = this.field4492;
            }
            if (arg1 + arg2 > this.field4493) {
                arg2 = this.field4493 - arg1;
            }
            int var6 = this.field4479 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4479 * var10 + var6;
                        int var12 = this.field4483[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field4483[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field4479 * var14 + var6;
                        int var16 = this.field4483[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field4483[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field4483[this.field4479 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIII)V", line = 1733)
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method2006(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method2006(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method2003(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method2003(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field4478 && arg0 < this.field4490 && var37 >= this.field4492 && var37 < this.field4493 && var24 < var21) {
                                int var38 = this.field4479 * var37 + arg0;
                                int var39 = this.field4483[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field4483[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field4478 && arg0 < this.field4490 && var42 >= this.field4492 && var42 < this.field4493 && var24 < var21) {
                                int var43 = this.field4479 * var42 + arg0;
                                int var44 = this.field4483[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field4483[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field4478 && arg0 < this.field4490 && var49 >= this.field4492 && var49 < this.field4493 && var24 < var21) {
                            this.field4483[this.field4479 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field4492 && arg1 < this.field4493 && var60 >= this.field4478 && var60 < this.field4490 && var24 < var21) {
                                int var61 = this.field4479 * arg1 + var60;
                                int var62 = this.field4483[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field4483[this.field4479 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field4492 && arg1 < this.field4493 && var65 >= this.field4478 && var65 < this.field4490 && var24 < var21) {
                                int var66 = this.field4479 * arg1 + var65;
                                int var67 = this.field4483[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field4483[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field4492 && arg1 < this.field4493 && var72 >= this.field4478 && var72 < this.field4490 && var24 < var21) {
                            this.field4483[this.field4479 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!iw", name = "EA", descriptor = "(IIII)V", line = 1980)
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
        class545 var5 = this.method2005(Thread.currentThread());
        var5.field7751 = arg0;
        var5.field7758 = arg1;
        var5.field7750 = arg2;
    }

    @OriginalMember(owner = "client!iw", name = "T", descriptor = "(IIII)V", line = 1989)
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4478 < arg0) {
            this.field4478 = arg0;
        }
        if (this.field4492 < arg1) {
            this.field4492 = arg1;
        }
        if (this.field4490 > arg2) {
            this.field4490 = arg2;
        }
        if (this.field4493 > arg3) {
            this.field4493 = arg3;
        }
        this.method2007();
    }

    @OriginalMember(owner = "client!iw", name = "F", descriptor = "(II)V", line = 2006)
    public final void method430(int arg0, int arg1) {
        int var3 = this.field4479 * arg1 + arg0;
        int var4 = this.field4475 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field4483;
            float[] var6 = this.field4476;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class319.method2016(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class319.method2016(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class319.method2018(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class319.method2018(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "()Z", line = 2049)
    public final boolean method540() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIII)V", line = 2052)
    private final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field4478 && arg0 < this.field4490) {
            int var9 = this.field4479 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field4492 && arg1 + var15 < this.field4493 && var12 < arg5) {
                            int var16 = this.field4479 * var15 + var9;
                            int var17 = this.field4483[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field4483[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field4492 && arg1 + var19 < this.field4493 && var12 < arg5) {
                            int var20 = this.field4479 * var19 + var9;
                            int var21 = this.field4483[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field4483[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field4492 && arg1 + var25 < this.field4493 && var12 < arg5) {
                        this.field4483[this.field4479 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "()Lql;", line = 2137)
    public final class738 method504() {
        return this.field4482;
    }

    @OriginalMember(owner = "client!iw", name = "KA", descriptor = "(IIII)V", line = 2140)
    public final void method476(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field4479) {
            arg2 = this.field4479;
        }
        if (arg3 > this.field4510) {
            arg3 = this.field4510;
        }
        this.field4478 = arg0;
        this.field4490 = arg2;
        this.field4492 = arg1;
        this.field4493 = arg3;
        this.method2007();
    }

    @OriginalMember(owner = "client!iw", name = "Q", descriptor = "(IIIIII[BII)V", line = 2159)
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field4479 * arg1 + arg0;
            int var15 = this.field4479 - arg2;
            if (arg1 + arg3 > this.field4493) {
                arg3 -= arg1 + arg3 - this.field4493;
            }
            if (arg1 < this.field4492) {
                int var16 = this.field4492 - arg1;
                arg3 -= var16;
                var14 += this.field4479 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field4490) {
                int var17 = arg0 + arg2 - this.field4490;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field4478) {
                int var18 = this.field4478 - arg0;
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
                            int var28 = this.field4483[var14];
                            this.field4483[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field4483[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field4483[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field4483[var14++] = arg5;
                        } else {
                            this.field4483[var14++] = arg4;
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

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lql;)V", line = 2335)
    public final void method534(class738 arg0) {
        this.field4482 = (class99) arg0;
    }

    @OriginalMember(owner = "client!iw", name = "XA", descriptor = "()I", line = 2338)
    public final int method514() {
        return this.field4507;
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "()Z", line = 2341)
    public final boolean method441() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V", line = 2343)
    public final void method426(boolean arg0) {
    }

    @OriginalMember(owner = "client!iw", name = "ya", descriptor = "()V", line = 2346)
    public final void method444() {
        if (this.field4478 == 0 && this.field4490 == this.field4479 && this.field4492 == 0 && this.field4510 == this.field4493) {
            int var1 = this.field4476.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field4476[var3++] = 2.1474836E9F;
                this.field4476[var3++] = 2.1474836E9F;
                this.field4476[var3++] = 2.1474836E9F;
                this.field4476[var3++] = 2.1474836E9F;
                this.field4476[var3++] = 2.1474836E9F;
                this.field4476[var3++] = 2.1474836E9F;
                this.field4476[var3++] = 2.1474836E9F;
                this.field4476[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field4476[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field4490 - this.field4478;
            int var5 = this.field4493 - this.field4492;
            int var6 = this.field4479 - var4;
            int var7 = this.field4492 * this.field4479 + this.field4478;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field4476[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "L", descriptor = "(III)V", line = 2428)
    public final void method526(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4498.length; ++var4) {
            class545 var5 = this.field4498[var4];
            var5.field7758 = arg0 & 16777215;
            int var6 = var5.field7758 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7758 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7758 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7758 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7755 = false;
            } else {
                var5.field7755 = true;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 2461)
    public final void method455(Canvas arg0, int arg1, int arg2) {
        class255 var4 = (class255) this.field4470.method2287((long) arg0.hashCode(), (byte) -117);
        if (var4 == null) {
            class255 var5 = class175.method1246(-1209375263, arg2, arg0, arg1);
            this.field4470.method2278((byte) -85, (long) arg0.hashCode(), var5);
        } else {
            if (var4.field3658 != arg1 || var4.field3660 != arg2) {
                this.method417(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "na", descriptor = "(IIII)[I", line = 2475)
    public final int[] method428(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field4479 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field4483[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2501)
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8) {
        class341 var10 = (class341) arg6;
        int[] var11 = var10.field4951;
        int[] var12 = var10.field4955;
        int var13 = this.field4492 > arg8 ? this.field4492 : arg8;
        int var14 = this.field4493 < var11.length + arg8 ? this.field4493 : var11.length + arg8;
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
            if (arg0 < this.field4478) {
                var18 += (this.field4478 - arg0) * var20;
                arg0 = this.field4478;
            }
            if (var21 >= this.field4490) {
                var21 = this.field4490 - 1;
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
                                int var28 = this.field4479 * var25 + arg0;
                                int var29 = this.field4483[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field4483[var28] = var23 + var30;
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
                                int var34 = this.field4479 * var31 + arg0;
                                int var35 = this.field4483[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field4483[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field4483[this.field4479 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field4478 && var64 < this.field4490 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field4483[this.field4479 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field4478 && var50 < this.field4490 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field4479 * arg1 + var50;
                        int var54 = this.field4483[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field4483[this.field4479 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field4478 && var56 < this.field4490 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field4479 * arg1 + var56;
                        int var60 = this.field4483[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field4483[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "()Z", line = 2739)
    public final boolean method532() {
        return true;
    }

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "()V", line = 2742)
    public final void method498() {
        if (this.field4473) {
            class441.method2739(true, false, 16383);
            this.field4473 = false;
        }
        this.field4467 = null;
        this.field4466 = null;
        this.field4471 = 0;
        this.field4469 = 0;
        this.field4470 = null;
        this.field4472 = true;
    }

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "(ILaa;II)V", line = 2757)
    public final void method435(int arg0, class488 arg1, int arg2, int arg3) {
        class341 var5 = (class341) arg1;
        int[] var6 = var5.field4951;
        int[] var7 = var5.field4955;
        int var8;
        if (this.field4493 < var6.length + arg3) {
            var8 = this.field4493 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field4492 > arg3) {
            var9 = this.field4492 - arg3;
            arg3 = this.field4492;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field4479 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field4478 > var12) {
                    var13 -= this.field4478 - var12;
                    var12 = this.field4478;
                }
                if (this.field4490 < var12 + var13) {
                    var13 = this.field4490 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field4483[var14++] = arg0;
                }
                var10 += this.field4479;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "(I)Z", line = 2818)
    public final boolean method2004(int arg0) {
        return super.field849.method1124((byte) 123, arg0).field4186 || super.field849.method1124((byte) -98, arg0).field4189;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIZ)Lpga;", line = 2822)
    public final class536 method493(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class26(this, arg0, arg1) : new class155(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!iw", name = "H", descriptor = "(III[I)V", line = 2829)
    public final void method421(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4482.field1401 + (float) arg0 * this.field4482.field1388 + (float) arg1 * this.field4482.field1389 + this.field4482.field1410;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field4482.field1419 + (float) arg0 * this.field4482.field1395 + (float) arg1 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / var5);
            int var7 = (int) (((float) arg2 * this.field4482.field1417 + (float) arg0 * this.field4482.field1420 + (float) arg1 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / var5);
            arg3[0] = var6 - this.field4480;
            arg3[1] = var7 - this.field4503;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!iw", name = "pa", descriptor = "()V", line = 2848)
    public final void method466() {
        for (int var1 = 0; var1 < this.field4498.length; ++var1) {
            this.field4498[var1].field7758 = this.field4498[var1].field7747;
            this.field4498[var1].field7749 = false;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([IIIIIZ)Lpga;", line = 2859)
    public final class536 method429(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class26(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class155(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class26(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class155(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lom;Lom;FLom;)Lom;", line = 2895)
    public final class374 method499(class374 arg0, class374 arg1, float arg2, class374 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lmd;", line = 2901)
    public final class545 method2005(Runnable arg0) {
        for (int var2 = 0; var2 < this.field4501; ++var2) {
            if (this.field4498[var2].field7752 == arg0) {
                return this.field4498[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "(I)V", line = 2913)
    public final void method495(int arg0) {
        this.field4505 = arg0;
        this.field4477.method809(true);
    }

    @OriginalMember(owner = "client!iw", name = "JA", descriptor = "(IIIIII)I", line = 2918)
    public final int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field4482.field1401 + (float) arg0 * this.field4482.field1388 + (float) arg1 * this.field4482.field1389 + this.field4482.field1410;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field4482.field1401 + (float) arg3 * this.field4482.field1388 + (float) arg4 * this.field4482.field1389 + this.field4482.field1410;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field4494 && var9 < (float) this.field4494) {
            var7 |= 16;
        } else if (var8 > (float) this.field4507 && var9 > (float) this.field4507) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field4482.field1419 + (float) arg0 * this.field4482.field1395 + (float) arg1 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / var8);
        int var11 = (int) (((float) arg5 * this.field4482.field1419 + (float) arg3 * this.field4482.field1395 + (float) arg4 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / var9);
        if (var10 < this.field4480 && var11 < this.field4480) {
            var7 |= 1;
        } else if (var10 > this.field4509 && var11 > this.field4509) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field4482.field1417 + (float) arg0 * this.field4482.field1420 + (float) arg1 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / var8);
        int var13 = (int) (((float) arg5 * this.field4482.field1417 + (float) arg3 * this.field4482.field1420 + (float) arg4 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / var9);
        if (var12 < this.field4503 && var13 < this.field4503) {
            var7 |= 4;
        } else if (var12 > this.field4474 && var13 > this.field4474) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "()V", line = 2960)
    public final void method535() {
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "()Lkaa;", line = 2963)
    public final class48 method432() {
        return new class48(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIF)Lraa;", line = 2966)
    public final class609 method443(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!iw", name = "HA", descriptor = "(IIII[I)V", line = 2970)
    public final void method425(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field4482.field1401 + (float) arg0 * this.field4482.field1388 + (float) arg1 * this.field4482.field1389 + this.field4482.field1410;
        if (!(var6 < (float) this.field4494) && !(var6 > (float) this.field4507)) {
            int var7 = (int) (((float) arg2 * this.field4482.field1419 + (float) arg0 * this.field4482.field1395 + (float) arg1 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field4482.field1417 + (float) arg0 * this.field4482.field1420 + (float) arg1 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / (float) arg3);
            if (var7 >= this.field4480 && var7 <= this.field4509 && var8 >= this.field4503 && var8 <= this.field4474) {
                arg4[0] = var7 - this.field4480;
                arg4[1] = var8 - this.field4503;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!iw", name = "la", descriptor = "()V", line = 2994)
    public final void method469() {
        this.field4478 = 0;
        this.field4492 = 0;
        this.field4490 = this.field4479;
        this.field4493 = this.field4510;
        this.method2007();
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ld;)V", line = 3001)
    private class316(class151 arg0) {
        super(arg0);
        this.field4472 = false;
        this.field4473 = false;
        this.field4470 = new class372(4);
        this.field4486 = 45823;
        this.field4490 = 0;
        this.field4493 = 0;
        this.field4484 = 512;
        this.field4478 = 0;
        this.field4497 = 0;
        this.field4496 = 0;
        this.field4492 = 0;
        this.field4494 = 50;
        this.field4487 = 75518;
        this.field4505 = 128;
        this.field4504 = 78642;
        this.field4507 = 3500;
        this.field4508 = 512;
        this.field4512 = false;
        this.field4488 = new class106(16);
        this.field4514 = -1;
        try {
            this.field4477 = new class106(256);
            this.field4482 = new class99();
            this.method486(1);
            this.method471(0);
            class184.method1301(true, true, -22433);
            this.field4473 = true;
            this.field4468 = (int) class524.method3075(18);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method447((byte) -9);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(IIIIIIII)V", line = 3017)
    private final void method2006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field4492 && arg1 < this.field4493) {
            int var9 = this.field4479 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field4478 && arg0 + var15 < this.field4490 && var12 < arg5) {
                            int var16 = this.field4483[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field4483[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field4478 && arg0 + var18 < this.field4490 && var12 < arg5) {
                            int var19 = this.field4483[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field4483[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field4478 && arg0 + var23 < this.field4490 && var12 < arg5) {
                        this.field4483[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lhia;[Lfg;Z)Lda;", line = 3097)
    public final class61 method474(class66 arg0, class129[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1734;
            var5[var7] = arg1[var7].field1739;
            if (arg1[var7].field1736 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class480(this, arg0, arg1, var4, var5);
            } else {
                return new class404(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class138(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V", line = 3134)
    public final void method468(int arg0) {
        class532.field7598 = arg0;
        class532.field7659 = arg0;
        if (this.field4501 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method486(this.field4501);
            this.method471(0);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([I)V", line = 3142)
    public final void method479(int[] arg0) {
        arg0[0] = this.field4479;
        arg0[1] = this.field4510;
    }

    @OriginalMember(owner = "client!iw", name = "M", descriptor = "()I", line = 3147)
    public final int method508() {
        int var1 = this.field4496;
        this.field4496 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "()V", line = 3154)
    public final void method472() {
    }

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "()V", line = 3156)
    public final void method536() {
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(I)V", line = 3159)
    public final void method486(int arg0) {
        this.field4501 = arg0;
        this.field4498 = new class545[this.field4501];
        for (int var2 = 0; var2 < this.field4501; ++var2) {
            this.field4498[var2] = new class545(this);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lza;)V", line = 3171)
    public final void method445(class415 arg0) {
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ldh;IIII)Lka;", line = 3174)
    public final class473 method418(class322 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class532(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 3177)
    public final class280 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class137(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(II)V", line = 3181)
    public final void method528(int arg0, int arg1) {
        class545 var3 = this.method2005(Thread.currentThread());
        this.field4494 = arg0;
        this.field4507 = arg1;
        var3.field7753 = this.field4507 - 255;
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(IIIIII)Lom;", line = 3187)
    public final class374 method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(II)Lbi;", line = 3190)
    public final class482 method473(int arg0, int arg1) {
        return this.method493(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "()V", line = 3193)
    private final void method2007() {
        this.field4480 = this.field4478 - this.field4495;
        this.field4509 = this.field4490 - this.field4495;
        this.field4503 = this.field4492 - this.field4502;
        this.field4474 = this.field4493 - this.field4502;
        for (int var1 = 0; var1 < this.field4501; ++var1) {
            class7 var5 = this.field4498[var1].field7778;
            var5.field61 = this.field4495 - this.field4478;
            var5.field65 = this.field4502 - this.field4492;
            var5.field70 = this.field4490 - this.field4478;
            var5.field74 = this.field4493 - this.field4492;
        }
        int var2 = this.field4492 * this.field4479 + this.field4478;
        for (int var3 = this.field4492; var3 < this.field4493; ++var3) {
            for (int var4 = 0; var4 < this.field4501; ++var4) {
                this.field4498[var4].field7778.field72[var3 - this.field4492] = var2;
            }
            var2 += this.field4479;
        }
    }

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "(I)Z", line = 3231)
    public final boolean method2008(int arg0) {
        return this.field4512 || super.field849.method1124((byte) 98, arg0).field4174;
    }

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "()V", line = 3239)
    private final void method2009() {
        for (int var1 = 0; var1 < this.field4501; ++var1) {
            this.field4498[var1].method3195(true);
        }
        this.method469();
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lpk;)V", line = 3248)
    public final void method452(class198 arg0) {
        class612 var2 = (class612) arg0;
        this.field4479 = var2.field8648;
        this.field4510 = var2.field8652;
        this.field4483 = var2.field8650;
        this.field4489 = var2;
        this.field4475 = var2.field8648;
        this.field4491 = var2.field8652;
        this.field4476 = var2.field8643;
        this.method2009();
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIII)V", line = 3259)
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method497(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method497(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method458(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method458(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field4478) {
                    var10 += (this.field4478 - arg0) * var12;
                    arg0 = this.field4478;
                }
                if (var13 >= this.field4490) {
                    var13 = this.field4490 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field4492 && var17 < this.field4493) {
                                int var18 = this.field4479 * var17 + arg0;
                                int var19 = this.field4483[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field4483[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field4492 && var21 < this.field4493) {
                                int var22 = this.field4479 * var21 + arg0;
                                int var23 = this.field4483[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field4483[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field4492 && var27 < this.field4493) {
                            this.field4483[this.field4479 * var27 + arg0] = arg4;
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
                if (arg1 < this.field4492) {
                    var29 += (this.field4492 - arg1) * var31;
                    arg1 = this.field4492;
                }
                if (var32 >= this.field4493) {
                    var32 = this.field4493 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field4478 && var46 < this.field4490) {
                            this.field4483[this.field4479 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field4478 && var36 < this.field4490) {
                            int var37 = this.field4479 * arg1 + var36;
                            int var38 = this.field4483[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field4483[this.field4479 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field4478 && var40 < this.field4490) {
                            int var41 = this.field4479 * arg1 + var40;
                            int var42 = this.field4483[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field4483[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "(I)Lza;", line = 3472)
    public final class415 method520(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "()Z", line = 3475)
    public final boolean method518() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "()Z", line = 3478)
    public final boolean method453() {
        return false;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3482)
    public final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class341 var13 = (class341) arg6;
        int[] var14 = var13.field4951;
        int[] var15 = var13.field4955;
        int var16 = this.field4492 > arg8 ? this.field4492 : arg8;
        int var17 = this.field4493 < var14.length + arg8 ? this.field4493 : var14.length + arg8;
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
                        if (arg0 >= this.field4478 && arg0 < this.field4490 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field4479 * var37 + arg0;
                                int var41 = this.field4483[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field4483[var40] = var35 + var42;
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
                        if (arg0 >= this.field4478 && arg0 < this.field4490 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field4479 * var44 + arg0;
                                int var48 = this.field4483[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field4483[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field4478 && arg0 < this.field4490 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field4483[this.field4479 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field4478 && var80 < this.field4490 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field4483[this.field4479 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field4478 && var66 < this.field4490 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field4479 * arg1 + var66;
                        int var69 = this.field4483[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field4483[this.field4479 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field4478 && var72 < this.field4490 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field4479 * arg1 + var72;
                        int var75 = this.field4483[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field4483[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "()Z", line = 3727)
    public final boolean method483() {
        return true;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lof;I)V", line = 3731)
    public final void method505(class624 arg0, int arg1) {
        class545 var3 = this.method2005(Thread.currentThread());
        class361 var4 = arg0.field8738.field5965;
        for (class361 var5 = var4.field5222; var4 != var5; var5 = var5.field5222) {
            class547 var6 = (class547) var5;
            int var7 = var6.field7801 >> 12;
            int var8 = var6.field7808 >> 12;
            int var9 = var6.field7806 >> 12;
            float var10 = (float) var9 * this.field4482.field1401 + (float) var7 * this.field4482.field1388 + (float) var8 * this.field4482.field1389 + this.field4482.field1410;
            if (!(var10 < (float) this.field4494) && !(var10 > (float) var3.field7753)) {
                int var11 = (int) (((float) var9 * this.field4482.field1419 + (float) var7 * this.field4482.field1395 + (float) var8 * this.field4482.field1390 + this.field4482.field1398) * (float) this.field4484 / (float) arg1) + this.field4495;
                int var12 = (int) (((float) var9 * this.field4482.field1417 + (float) var7 * this.field4482.field1420 + (float) var8 * this.field4482.field1406 + this.field4482.field1418) * (float) this.field4508 / (float) arg1) + this.field4502;
                if (var11 >= this.field4478 && var11 <= this.field4490 && var12 >= this.field4492 && var12 <= this.field4493) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method1996(var6, var11, var12, (int) var10, (this.field4484 * var6.field7800 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "(I)I", line = 3769)
    public final int method2010(int arg0) {
        return super.field849.method1124((byte) 89, arg0).field4192;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3772)
    public final void method510(Canvas arg0) {
        if (this.field4466 == arg0) {
            this.method446((Canvas) null);
        }
        class255 var2 = (class255) this.field4470.method2287((long) arg0.hashCode(), (byte) -117);
        if (var2 != null) {
            var2.method1304((byte) 7);
        }
    }

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "()Z", line = 3782)
    public final boolean method496() {
        return true;
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)V", line = 3785)
    public final void method480(int arg0) {
        this.field4498[arg0].method3194(8, (Runnable) null);
    }
}
