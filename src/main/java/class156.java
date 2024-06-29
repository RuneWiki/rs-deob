import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class156 extends class570 {

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Z")
    private boolean field1986;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "Z")
    private boolean field1989;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "Lrda;")
    private class467 field1985;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "Z")
    private boolean field2007;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!qk", name = "lb", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!qk", name = "ob", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!qk", name = "nb", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!qk", name = "kb", descriptor = "Ltq;")
    private class536 field2023;

    @OriginalMember(owner = "client!qk", name = "rb", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "Ltq;")
    private class536 field1995;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "Lro;")
    public class548 field2018;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    private int field1987;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    private int field1982;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    private int field2009;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    private int field2010;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
    private int field2015;

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!qk", name = "jb", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "Lhca;")
    public class256 field1983;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "Ltr;")
    private class591 field1998;

    @OriginalMember(owner = "client!qk", name = "qb", descriptor = "Lpu;")
    private class772 field2029;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1988;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "[F")
    public float[] field2008;

    @OriginalMember(owner = "client!qk", name = "mb", descriptor = "[F")
    public float[] field2025;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "[I")
    public int[] field2001;

    @OriginalMember(owner = "client!qk", name = "pb", descriptor = "[Liq;")
    private class160[] field2028;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lod;Lic;)Lmd;", line = 3)
    public final class649 method878(class539 arg0, class537 arg1) {
        return new class591(this, (class772) arg0, (class711) arg1);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ld;)V", line = 6)
    private class156(class284 arg0) {
        super(arg0);
        this.field1986 = false;
        this.field1989 = false;
        this.field1985 = new class467(4);
        this.field1997 = 0;
        this.field2007 = false;
        this.field1994 = 45823;
        this.field1999 = 0;
        this.field1990 = 0;
        this.field2013 = 0;
        this.field2006 = 512;
        this.field2011 = 78642;
        this.field2021 = 512;
        this.field2004 = 3500;
        this.field2016 = 50;
        this.field2005 = 75518;
        this.field2024 = 0;
        this.field2027 = 128;
        this.field2026 = 0;
        this.field2023 = new class536(16);
        this.field2030 = -1;
        try {
            this.field1995 = new class536(256);
            this.field2018 = new class548();
            this.method939(1);
            this.method995(0);
            class385.method2206(1708, true, true);
            this.field1986 = true;
            this.field1987 = (int) class502.method2786(-7114);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method3072(5);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "()Z", line = 22)
    public final boolean method879() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "()Loha;", line = 25)
    public final class465 method880() {
        return this.field2018;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 29)
    public final void method881(Canvas arg0, int arg1, int arg2) {
        class256 var4 = (class256) this.field1985.method2616((long) arg0.hashCode(), (byte) -120);
        if (var4 != null) {
            var4.method1946(-10364);
            class256 var5 = class82.method525(arg1, (byte) 116, arg0, arg2);
            this.field1985.method2619(var5, (long) arg0.hashCode(), -1);
            if (this.field1988 == arg0 && this.field1998 == null) {
                Dimension var6 = arg0.getSize();
                this.field1982 = var6.width;
                this.field1984 = var6.height;
                this.field1983 = var5;
                this.field2001 = var5.field3467;
                this.field1992 = var5.field3468;
                this.field2010 = var5.field3469;
                if (this.field2009 != this.field1992 || this.field2022 != this.field2010) {
                    this.field2000 = this.field2009 = this.field1992;
                    this.field2015 = this.field2022 = this.field2010;
                    this.field2025 = this.field2008 = new float[this.field2022 * this.field2009];
                }
                this.method904();
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lia;IIII)V", line = 60)
    private final void method882(class165 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field2186;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method1000(arg1, arg2, arg3, arg4, arg0.field2191, 1);
        } else {
            if (this.field2030 != var6) {
                class772 var9 = (class772) this.field2023.method2931((long) var6, (byte) -112);
                if (var9 == null) {
                    int[] var10 = this.method902(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method986(var6) ? 64 : this.field2027;
                    var9 = this.method3078((byte) 71, var11, var11, var10, 0, var11);
                    this.field2023.method2918((long) var6, var9, 116);
                }
                this.field2030 = var6;
                this.field2029 = var9;
            }
            ++var8;
            ((class639) this.field2029).method2075(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field2191, 1, 1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "(Z)V", line = 99)
    public final void method883(boolean arg0) {
        class160 var2 = this.method996(Thread.currentThread());
        var2.field2080 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "(III)V", line = 105)
    public final void method884(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2028.length; ++var4) {
            class160 var5 = this.field2028[var4];
            var5.field2087 = arg0 & 16777215;
            int var6 = var5.field2087 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field2087 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field2087 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field2087 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field2084 = false;
            } else {
                var5.field2084 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([IIIIIZ)Lpu;", line = 138)
    public final class772 method885(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class782(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class360(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class782(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class360(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I", line = 173)
    public final int method886(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)[I", line = 177)
    public final int[] method887(int arg0) {
        class536 var2 = this.field1995;
        class743 var3;
        synchronized (this.field1995) {
            var3 = (class743) this.field1995.method2931((long) arg0, (byte) -105);
            if (var3 == null) {
                if (!super.field7199.method1733(-1852, arg0)) {
                    return null;
                }
                class191 var5 = super.field7199.method1732((byte) -100, arg0);
                int var6 = !var5.field2673 && !this.field2007 ? this.field2027 : 64;
                var3 = new class743(arg0, var6, super.field7199.method1737(arg0, var6, 0.7F, true, var6, (byte) 45), var5.field2682 != 1);
                this.field1995.method2918((long) arg0, var3, 99);
            }
        }
        var3.field10056 = true;
        return var3.method4038();
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 197)
    public final void method888(Canvas arg0) {
        if (arg0 != null) {
            class256 var2 = (class256) this.field1985.method2616((long) arg0.hashCode(), (byte) -97);
            if (var2 != null) {
                this.field1988 = arg0;
                Dimension var3 = arg0.getSize();
                this.field1982 = var3.width;
                this.field1984 = var3.height;
                this.field1983 = var2;
                if (this.field1998 == null) {
                    this.field2001 = var2.field3467;
                    this.field1992 = var2.field3468;
                    this.field2010 = var2.field3469;
                    if (this.field2009 != this.field1992 || this.field2022 != this.field2010) {
                        this.field2000 = this.field2009 = this.field1992;
                        this.field2015 = this.field2022 = this.field2010;
                        this.field2025 = this.field2008 = new float[this.field2022 * this.field2009];
                    }
                    this.method904();
                    return;
                }
            }
        } else {
            this.field1988 = null;
            this.field1983 = null;
            if (this.field1998 == null) {
                this.field2001 = null;
                this.field1992 = this.field2010 = 1;
                this.field2009 = this.field2022 = 1;
                this.method904();
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 244)
    public final void method889(Canvas arg0, int arg1, int arg2) {
        class256 var4 = (class256) this.field1985.method2616((long) arg0.hashCode(), (byte) 90);
        if (var4 == null) {
            class256 var5 = class82.method525(arg1, (byte) 127, arg0, arg2);
            this.field1985.method2619(var5, (long) arg0.hashCode(), -1);
        } else {
            if (var4.field3468 != arg1 || var4.field3469 != arg2) {
                this.method881(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 257)
    public final class358 method890(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class367(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "()V", line = 259)
    public final void method891() {
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 263)
    public final void method892(int arg0) {
        class183.field2530 = arg0;
        class183.field2544 = arg0;
        if (this.field1996 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method939(this.field1996);
            this.method995(0);
        }
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "()I", line = 271)
    public final int method893() {
        return 0;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIIID)V", line = 275)
    public final void method894(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field2009 - arg2;
        int var8 = this.field2009 * arg1 + arg0;
        float[] var9 = this.field2008;
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

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIII)V", line = 303)
    public final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field7199.method1732((byte) 121, arg6).field2679) {
                if (this.field2030 != arg6) {
                    class772 var11 = (class772) this.field2023.method2931((long) arg6, (byte) -93);
                    if (var11 == null) {
                        int[] var12 = this.method902(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method986(arg6) ? 64 : this.field2027;
                        var11 = this.method3078((byte) 71, var13, var13, var12, 0, var13);
                        this.field2023.method2918((long) arg6, var11, 103);
                    }
                    this.field2030 = arg6;
                    this.field2029 = var11;
                }
                ((class639) this.field2029).method2075(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method1000(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "(IIIII)V", line = 337)
    public final void method896(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field1997 && arg1 < this.field2013) {
            if (arg0 < this.field2024) {
                arg2 -= this.field2024 - arg0;
                arg0 = this.field2024;
            }
            if (arg0 + arg2 > this.field2026) {
                arg2 = this.field2026 - arg0;
            }
            int var6 = this.field1992 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field2001[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field2001[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field2001[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field2001[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field2001[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIII)V", line = 409)
    private final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field1997 && arg1 < this.field2013) {
            int var9 = this.field1992 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field2024 && arg0 + var15 < this.field2026 && var12 < arg5) {
                            int var16 = this.field2001[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field2001[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field2024 && arg0 + var18 < this.field2026 && var12 < arg5) {
                            int var19 = this.field2001[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field2001[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
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
                    if (arg0 + var23 >= this.field2024 && arg0 + var23 < this.field2026 && var12 < arg5) {
                        this.field2001[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFF)V", line = 487)
    public final void method898(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "()Z", line = 490)
    public final boolean method899() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "()Z", line = 494)
    public final boolean method900() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "(III[I)V", line = 498)
    public final void method901(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2018.field6871 + (float) arg0 * this.field2018.field6853 + (float) arg1 * this.field2018.field6855 + this.field2018.field6847;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field2018.field6873 + (float) arg0 * this.field2018.field6856 + (float) arg1 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / var5);
            int var7 = (int) (((float) arg2 * this.field2018.field6843 + (float) arg0 * this.field2018.field6865 + (float) arg1 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / var5);
            arg3[0] = var6 - this.field2002;
            arg3[1] = var7 - this.field2012;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "(I)[I", line = 516)
    public final int[] method902(int arg0) {
        class536 var2 = this.field1995;
        class743 var3;
        synchronized (this.field1995) {
            var3 = (class743) this.field1995.method2931((long) arg0 | Long.MIN_VALUE, (byte) -85);
            if (var3 == null) {
                if (!super.field7199.method1733(-1852, arg0)) {
                    return null;
                }
                class191 var5 = super.field7199.method1732((byte) -112, arg0);
                int var6 = !var5.field2673 && !this.field2007 ? this.field2027 : 64;
                var3 = new class743(arg0, var6, super.field7199.method1734(-25886, true, var6, var6, arg0, 0.7F), var5.field2682 != 1);
                this.field1995.method2918((long) arg0 | Long.MIN_VALUE, var3, 94);
            }
        }
        var3.field10056 = true;
        return var3.method4038();
    }

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "()Z", line = 537)
    public final boolean method903() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "()V", line = 542)
    private final void method904() {
        for (int var1 = 0; var1 < this.field1996; ++var1) {
            this.field2028[var1].method1022(0);
        }
        this.method957();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lmd;)V", line = 551)
    public final void method905(class649 arg0) {
        class591 var2 = (class591) arg0;
        this.field1992 = var2.field7495;
        this.field2010 = var2.field7491;
        this.field2001 = var2.field7492;
        this.field1998 = var2;
        this.field2009 = var2.field7495;
        this.field2022 = var2.field7491;
        this.field2008 = var2.field7499;
        this.method904();
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()Z", line = 562)
    public final boolean method906() {
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "GA", descriptor = "(I)V", line = 565)
    public final void method907(int arg0) {
        this.method921(0, 0, this.field1992, this.field2010, arg0, 0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[Lgu;)V", line = 567)
    public final void method908(int arg0, class757[] arg1) {
    }

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "()V", line = 571)
    public final void method909() {
        this.field1995.method2919(0);
        this.field2023.method2919(0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ltea;)V", line = 574)
    public final void method910(class589 arg0) {
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIIIII)V", line = 577)
    public final void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method896(arg0, arg1, arg2, arg4, arg5);
        this.method896(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method936(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method936(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lwq;)V", line = 584)
    public final void method912(class705 arg0) {
        class160 var2 = this.method996(Thread.currentThread());
        class411 var3 = arg0.field9317.field2337;
        for (class411 var4 = var3.field5451; var3 != var4; var4 = var4.field5451) {
            class165 var5 = (class165) var4;
            int var6 = var5.field2187 >> 12;
            int var7 = var5.field2190 >> 12;
            int var8 = var5.field2185 >> 12;
            float var9 = (float) var8 * this.field2018.field6871 + (float) var6 * this.field2018.field6853 + (float) var7 * this.field2018.field6855 + this.field2018.field6847;
            if (!(var9 < (float) this.field2016) && !(var9 > (float) var2.field2076)) {
                int var10 = (int) (((float) var8 * this.field2018.field6873 + (float) var6 * this.field2018.field6856 + (float) var7 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / var9) + this.field2014;
                int var11 = (int) (((float) var8 * this.field2018.field6843 + (float) var6 * this.field2018.field6865 + (float) var7 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / var9) + this.field2020;
                if (var10 >= this.field2024 && var10 <= this.field2026 && var11 >= this.field1997 && var11 <= this.field2013) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method882(var5, var10, var11, (int) var9, (int) ((float) (this.field2021 * var5.field2192 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIF)Lgu;", line = 622)
    public final class757 method913(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "()Z", line = 625)
    public final boolean method914() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "KA", descriptor = "(IIII)V", line = 628)
    public final void method915(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field1992) {
            arg2 = this.field1992;
        }
        if (arg3 > this.field2010) {
            arg3 = this.field2010;
        }
        this.field2024 = arg0;
        this.field2026 = arg2;
        this.field1997 = arg1;
        this.field2013 = arg3;
        this.method933();
    }

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "()[I", line = 647)
    public final int[] method916() {
        return new int[] { this.field2014, this.field2020, this.field2021, this.field2006 };
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "()Z", line = 650)
    public final boolean method917() {
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "pa", descriptor = "()V", line = 655)
    public final void method918() {
        for (int var1 = 0; var1 < this.field2028.length; ++var1) {
            this.field2028[var1].field2087 = this.field2028[var1].field2071;
            this.field2028[var1].field2085 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "()V", line = 665)
    public final void method919() {
        if (this.field1986) {
            class497.method2760(false, true, true);
            this.field1986 = false;
        }
        this.field1983 = null;
        this.field1988 = null;
        this.field1982 = 0;
        this.field1984 = 0;
        this.field1985 = null;
        this.field1989 = true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;", line = 679)
    public final class589 method920(class589 arg0, class589 arg1, float arg2, class589 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "aa", descriptor = "(IIIIII)V", line = 682)
    public final void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field2024) {
            arg2 -= this.field2024 - arg0;
            arg0 = this.field2024;
        }
        if (arg1 < this.field1997) {
            arg3 -= this.field1997 - arg1;
            arg1 = this.field1997;
        }
        if (arg0 + arg2 > this.field2026) {
            arg2 = this.field2026 - arg0;
        }
        if (arg1 + arg3 > this.field2013) {
            arg3 = this.field2013 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field2026 && arg1 <= this.field2013) {
            int var7 = this.field1992 - arg2;
            int var8 = this.field1992 * arg1 + arg0;
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
                            this.field2001[var24] = arg4;
                            ++var24;
                            this.field2001[var24] = arg4;
                            ++var24;
                            this.field2001[var24] = arg4;
                            ++var24;
                            this.field2001[var24] = arg4;
                            ++var24;
                            this.field2001[var24] = arg4;
                            ++var24;
                            this.field2001[var24] = arg4;
                            ++var24;
                            this.field2001[var24] = arg4;
                            ++var24;
                            this.field2001[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field2001[var24] = arg4;
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
                        int var14 = this.field2001[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field2001[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field2001[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field2001[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIIIIIII)V", line = 817)
    private final void method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field2024 && arg0 < this.field2026) {
            int var9 = this.field1992 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field1997 && arg1 + var15 < this.field2013 && var12 < arg5) {
                            int var16 = this.field1992 * var15 + var9;
                            int var17 = this.field2001[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field2001[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field1997 && arg1 + var19 < this.field2013 && var12 < arg5) {
                            int var20 = this.field1992 * var19 + var9;
                            int var21 = this.field2001[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field2001[var20] = var22 - var24 | var24 - (var24 >>> 8);
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
                    if (arg1 + var25 >= this.field1997 && arg1 + var25 < this.field2013 && var12 < arg5) {
                        this.field2001[this.field1992 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "HA", descriptor = "(IIII[I)V", line = 903)
    public final void method923(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field2018.field6871 + (float) arg0 * this.field2018.field6853 + (float) arg1 * this.field2018.field6855 + this.field2018.field6847;
        if (!(var6 < (float) this.field2016) && !(var6 > (float) this.field2004)) {
            int var7 = (int) (((float) arg2 * this.field2018.field6873 + (float) arg0 * this.field2018.field6856 + (float) arg1 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field2018.field6843 + (float) arg0 * this.field2018.field6865 + (float) arg1 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / (float) arg3);
            if (var7 >= this.field2002 && var7 <= this.field2019 && var8 >= this.field2012 && var8 <= this.field1993) {
                arg4[0] = var7 - this.field2002;
                arg4[1] = var8 - this.field2012;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "([I)V", line = 928)
    public final void method924(int[] arg0) {
        arg0[0] = this.field2024;
        arg0[1] = this.field1997;
        arg0[2] = this.field2026;
        arg0[3] = this.field2013;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(II)V", line = 935)
    public final void method925(int arg0, int arg1) throws class15 {
        if (this.field1988 != null && this.field1983 != null) {
            try {
                Graphics var3 = this.field1988.getGraphics();
                this.field1983.method1647(arg0, -1, var3, this.field1982, this.field1984, arg1, 0, 0);
            } catch (Exception var4) {
                this.field1988.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "()Z", line = 951)
    public final boolean method926() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()Lfga;", line = 954)
    public final class291 method927() {
        return new class291(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "(IIII)V", line = 957)
    public final void method928(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2024 < arg0) {
            this.field2024 = arg0;
        }
        if (this.field1997 < arg1) {
            this.field1997 = arg1;
        }
        if (this.field2026 > arg2) {
            this.field2026 = arg2;
        }
        if (this.field2013 > arg3) {
            this.field2013 = arg3;
        }
        this.method933();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lza;)V", line = 971)
    public final void method929(class270 arg0) {
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lsu;IIII)Lka;", line = 974)
    public final class299 method930(class615 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class183(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 977)
    public final void method931(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class15 {
        if (this.field1988 != null && this.field1983 != null) {
            try {
                Graphics var5 = this.field1988.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field1992 && var7.y + arg3 <= this.field2010 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field1983.method1647(var7.x + arg2, -1, var5, var7.width, var7.height, var7.y + arg3, var7.x, var7.y);
                    }
                }
            } catch (Exception var8) {
                this.field1988.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 1008)
    public final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class383 var13 = (class383) arg6;
        int[] var14 = var13.field4789;
        int[] var15 = var13.field4786;
        int var16 = this.field1997 > arg8 ? this.field1997 : arg8;
        int var17 = this.field2013 < var14.length + arg8 ? this.field2013 : var14.length + arg8;
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
                        if (arg0 >= this.field2024 && arg0 < this.field2026 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field1992 * var37 + arg0;
                                int var41 = this.field2001[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field2001[var40] = var35 + var42;
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
                        if (arg0 >= this.field2024 && arg0 < this.field2026 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field1992 * var44 + arg0;
                                int var48 = this.field2001[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field2001[var47] = var49 - var51 | var51 - (var51 >>> 8);
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
                    if (arg0 >= this.field2024 && arg0 < this.field2026 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field2001[this.field1992 * var53 + arg0] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field2024 && var80 < this.field2026 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field2001[this.field1992 * arg1 + var80] = arg4;
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
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field2024 && var66 < this.field2026 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field1992 * arg1 + var66;
                        int var69 = this.field2001[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field2001[this.field1992 * arg1 + var66] = var64 + var70;
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
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field2024 && var72 < this.field2026 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field1992 * arg1 + var72;
                        int var75 = this.field2001[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field2001[var74] = var76 - var78 | var78 - (var78 >>> 8);
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

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "()V", line = 1253)
    private final void method933() {
        this.field2002 = this.field2024 - this.field2014;
        this.field2019 = this.field2026 - this.field2014;
        this.field2012 = this.field1997 - this.field2020;
        this.field1993 = this.field2013 - this.field2020;
        for (int var1 = 0; var1 < this.field1996; ++var1) {
            class623 var5 = this.field2028[var1].field2097;
            var5.field7884 = this.field2014 - this.field2024;
            var5.field7874 = this.field2020 - this.field1997;
            var5.field7875 = this.field2026 - this.field2024;
            var5.field7883 = this.field2013 - this.field1997;
        }
        int var2 = this.field1997 * this.field1992 + this.field2024;
        for (int var3 = this.field1997; var3 < this.field2013; ++var3) {
            for (int var4 = 0; var4 < this.field1996; ++var4) {
                this.field2028[var4].field2097.field7872[var3 - this.field1997] = var2;
            }
            var2 += this.field1992;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 1290)
    public final void method934(boolean arg0) {
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V", line = 1294)
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class160 var8 = this.method996(Thread.currentThread());
        class623 var9 = var8.field2097;
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
            int var23 = arg0 - var9.method3328();
            int var24 = arg1 - var9.method3331();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field7880 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field7880 = 255 - (arg4 >>> 24);
            }
            this.method883(false);
            var9.field7878 = var25 < 0 || var25 > var9.field7875 || var26 < 0 || var26 > var9.field7875 || var27 < 0 || var27 > var9.field7875;
            var9.method3324((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field7878 = var25 < 0 || var25 > var9.field7875 || var27 < 0 || var27 > var9.field7875 || var28 < 0 || var28 > var9.field7875;
            var9.method3324((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method883(true);
        }
    }

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "(IIIII)V", line = 1367)
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field2024 && arg0 < this.field2026) {
            if (arg1 < this.field1997) {
                arg2 -= this.field1997 - arg1;
                arg1 = this.field1997;
            }
            if (arg1 + arg2 > this.field2013) {
                arg2 = this.field2013 - arg1;
            }
            int var6 = this.field1992 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field1992 * var10 + var6;
                        int var12 = this.field2001[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field2001[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field1992 * var14 + var6;
                        int var16 = this.field2001[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field2001[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field2001[this.field1992 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "ya", descriptor = "()V", line = 1443)
    public final void method937() {
        if (this.field2024 == 0 && this.field2026 == this.field1992 && this.field1997 == 0 && this.field2013 == this.field2010) {
            int var1 = this.field2008.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field2008[var3++] = 2.1474836E9F;
                this.field2008[var3++] = 2.1474836E9F;
                this.field2008[var3++] = 2.1474836E9F;
                this.field2008[var3++] = 2.1474836E9F;
                this.field2008[var3++] = 2.1474836E9F;
                this.field2008[var3++] = 2.1474836E9F;
                this.field2008[var3++] = 2.1474836E9F;
                this.field2008[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field2008[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field2026 - this.field2024;
            int var5 = this.field2013 - this.field1997;
            int var6 = this.field1992 - var4;
            int var7 = this.field1997 * this.field1992 + this.field2024;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field2008[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(II)Lic;", line = 1523)
    public final class537 method938(int arg0, int arg1) {
        return new class711(arg0, arg1);
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V", line = 1526)
    public final void method939(int arg0) {
        this.field1996 = arg0;
        this.field2028 = new class160[this.field1996];
        for (int var2 = 0; var2 < this.field1996; ++var2) {
            this.field2028[var2] = new class160(this);
        }
    }

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "(ILaa;II)V", line = 1540)
    public final void method940(int arg0, class596 arg1, int arg2, int arg3) {
        class383 var5 = (class383) arg1;
        int[] var6 = var5.field4789;
        int[] var7 = var5.field4786;
        int var8;
        if (this.field2013 < var6.length + arg3) {
            var8 = this.field2013 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field1997 > arg3) {
            var9 = this.field1997 - arg3;
            arg3 = this.field1997;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field1992 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field2024 > var12) {
                    var13 -= this.field2024 - var12;
                    var12 = this.field2024;
                }
                if (this.field2026 < var12 + var13) {
                    var13 = this.field2026 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field2001[var14++] = arg0;
                }
                var10 += this.field1992;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)I", line = 1597)
    public final int method941(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([I)V", line = 1601)
    public final void method942(int[] arg0) {
        arg0[0] = this.field1992;
        arg0[1] = this.field2010;
    }

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "()V", line = 1605)
    public final void method943() {
    }

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "(I)V", line = 1608)
    public final void method944(int arg0) {
    }

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "(I)I", line = 1612)
    public final int method945(int arg0) {
        return super.field7199.method1732((byte) -52, arg0).field2681 & 65535;
    }

    @OriginalMember(owner = "client!qk", name = "xa", descriptor = "(F)V", line = 1615)
    public final void method946(float arg0) {
        this.field2005 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[I[I)Laa;", line = 1618)
    public final class596 method947(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class383(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "()Loha;", line = 1624)
    public final class465 method948() {
        class160 var1 = this.method996(Thread.currentThread());
        return var1.field2086;
    }

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "()I", line = 1632)
    public final int method949() {
        int var1 = this.field1990;
        this.field1990 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "()I", line = 1638)
    public final int method950() {
        int var1 = this.field1999;
        this.field1999 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "()I", line = 1643)
    public final int method951() {
        return this.field2016;
    }

    @OriginalMember(owner = "client!qk", name = "ra", descriptor = "(IIII)V", line = 1648)
    public final void method952(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field2028.length; ++var5) {
            this.field2028[var5].field2071 = this.field2028[var5].field2087;
            this.field2028[var5].field2083 = arg0;
            this.field2028[var5].field2087 = arg1;
            this.field2028[var5].field2077 = arg2;
            this.field2028[var5].field2085 = true;
        }
    }

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "()Z", line = 1661)
    public final boolean method953() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "(IIIIII[BII)V", line = 1664)
    public final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field1992 * arg1 + arg0;
            int var15 = this.field1992 - arg2;
            if (arg1 + arg3 > this.field2013) {
                arg3 -= arg1 + arg3 - this.field2013;
            }
            if (arg1 < this.field1997) {
                int var16 = this.field1997 - arg1;
                arg3 -= var16;
                var14 += this.field1992 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field2026) {
                int var17 = arg0 + arg2 - this.field2026;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field2024) {
                int var18 = this.field2024 - arg0;
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
                            int var28 = this.field2001[var14];
                            this.field2001[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field2001[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field2001[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field2001[var14++] = arg5;
                        } else {
                            this.field2001[var14++] = arg4;
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

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIZ)Lpu;", line = 1840)
    public final class772 method955(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field1992 * arg1 + arg0;
        int var8 = this.field1992 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field2001[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class782(this, var6, arg2, arg3);
        } else {
            return new class360(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)Ltea;", line = 1872)
    public final class589 method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "la", descriptor = "()V", line = 1875)
    public final void method957() {
        this.field2024 = 0;
        this.field1997 = 0;
        this.field2026 = this.field1992;
        this.field2013 = this.field2010;
        this.method933();
    }

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "()Z", line = 1883)
    public final boolean method958() {
        return this.field1989;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIII)V", line = 1886)
    public final void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method897(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method897(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method922(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method922(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
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
                            if (arg0 >= this.field2024 && arg0 < this.field2026 && var37 >= this.field1997 && var37 < this.field2013 && var24 < var21) {
                                int var38 = this.field1992 * var37 + arg0;
                                int var39 = this.field2001[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field2001[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field2024 && arg0 < this.field2026 && var42 >= this.field1997 && var42 < this.field2013 && var24 < var21) {
                                int var43 = this.field1992 * var42 + arg0;
                                int var44 = this.field2001[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field2001[var43] = var45 - var47 | var47 - (var47 >>> 8);
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
                        if (arg0 >= this.field2024 && arg0 < this.field2026 && var49 >= this.field1997 && var49 < this.field2013 && var24 < var21) {
                            this.field2001[this.field1992 * var49 + arg0] = arg4;
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
                            if (arg1 >= this.field1997 && arg1 < this.field2013 && var60 >= this.field2024 && var60 < this.field2026 && var24 < var21) {
                                int var61 = this.field1992 * arg1 + var60;
                                int var62 = this.field2001[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field2001[this.field1992 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field1997 && arg1 < this.field2013 && var65 >= this.field2024 && var65 < this.field2026 && var24 < var21) {
                                int var66 = this.field1992 * arg1 + var65;
                                int var67 = this.field2001[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field2001[var66] = var68 - var70 | var70 - (var70 >>> 8);
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
                        if (arg1 >= this.field1997 && arg1 < this.field2013 && var72 >= this.field2024 && var72 < this.field2026 && var24 < var21) {
                            this.field2001[this.field1992 * arg1 + var72] = arg4;
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

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "()Z", line = 2132)
    public final boolean method960() {
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "(I)Z", line = 2135)
    public final boolean method961(int arg0) {
        return super.field7199.method1732((byte) 118, arg0).field2660 || super.field7199.method1732((byte) 126, arg0).field2663;
    }

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "()V", line = 2139)
    public final void method962() {
        if (this.field1988 != null) {
            this.field2001 = this.field1983.field3467;
            this.field1992 = this.field1983.field3468;
            this.field2010 = this.field1983.field3469;
            this.field2008 = this.field2025;
            this.field2009 = this.field2000;
            this.field2022 = this.field2015;
        } else {
            this.field1992 = 1;
            this.field2010 = 1;
            this.field2001 = null;
            this.field2009 = 1;
            this.field2022 = 1;
            this.field2008 = null;
        }
        this.field1998 = null;
        this.method904();
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 2163)
    public final void method963(int arg0) {
        int var2 = arg0 - this.field1987;
        for (Object var3 = this.field1995.method2921(25886); var3 != null; var3 = this.field1995.method2925(74)) {
            class743 var4 = (class743) var3;
            if (var4.field10056) {
                var4.field10057 += var2;
                int var5 = var4.field10057 / 20;
                if (var5 > 0) {
                    class191 var6 = super.field7199.method1732((byte) -126, var4.field10059);
                    var4.method4037(var6.field2662 * var2 * 50 / 1000, var6.field2665 * var2 * 50 / 1000);
                    var4.field10057 -= var5 * 20;
                }
                var4.field10056 = false;
            }
        }
        this.field1987 = arg0;
        this.field2023.method2928(true, 5);
        this.field1995.method2928(true, 5);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 2195)
    public class156(Canvas arg0, class284 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method889(arg0, arg2, arg3);
            this.method888(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method3072(5);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2207)
    public final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        class383 var10 = (class383) arg6;
        int[] var11 = var10.field4789;
        int[] var12 = var10.field4786;
        int var13 = this.field1997 > arg8 ? this.field1997 : arg8;
        int var14 = this.field2013 < var11.length + arg8 ? this.field2013 : var11.length + arg8;
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
            if (arg0 < this.field2024) {
                var18 += (this.field2024 - arg0) * var20;
                arg0 = this.field2024;
            }
            if (var21 >= this.field2026) {
                var21 = this.field2026 - 1;
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
                                int var28 = this.field1992 * var25 + arg0;
                                int var29 = this.field2001[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field2001[var28] = var23 + var30;
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
                                int var34 = this.field1992 * var31 + arg0;
                                int var35 = this.field2001[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field2001[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field2001[this.field1992 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field2024 && var64 < this.field2026 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field2001[this.field1992 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field2024 && var50 < this.field2026 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field1992 * arg1 + var50;
                        int var54 = this.field2001[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field2001[this.field1992 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field2024 && var56 < this.field2026 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field1992 * arg1 + var56;
                        int var60 = this.field2001[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field2001[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "()Z", line = 2445)
    public final boolean method965() {
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "(I)I", line = 2448)
    public final int method966(int arg0) {
        return super.field7199.method1732((byte) 125, arg0).field2682;
    }

    @OriginalMember(owner = "client!qk", name = "DA", descriptor = "(IIII)V", line = 2451)
    public final void method967(int arg0, int arg1, int arg2, int arg3) {
        this.field2014 = arg0;
        this.field2020 = arg1;
        this.field2021 = arg2;
        this.field2006 = arg3;
        this.method933();
    }

    @OriginalMember(owner = "client!qk", name = "na", descriptor = "(IIII)[I", line = 2460)
    public final int[] method968(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field1992 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field2001[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "(IIIIIII)I", line = 2487)
    public final int method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field2018.field6871 + (float) arg0 * this.field2018.field6853 + (float) arg1 * this.field2018.field6855 + this.field2018.field6847;
        float var9 = (float) arg5 * this.field2018.field6871 + (float) arg3 * this.field2018.field6853 + (float) arg4 * this.field2018.field6855 + this.field2018.field6847;
        int var10 = 0;
        if (var8 < (float) this.field2016 && var9 < (float) this.field2016) {
            var10 |= 16;
        } else if (var8 > (float) this.field2004 && var9 > (float) this.field2004) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field2018.field6873 + (float) arg0 * this.field2018.field6856 + (float) arg1 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field2018.field6873 + (float) arg3 * this.field2018.field6856 + (float) arg4 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / (float) arg6);
        if (var11 < this.field2002 && var12 < this.field2002) {
            var10 |= 1;
        } else if (var11 > this.field2019 && var12 > this.field2019) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field2018.field6843 + (float) arg0 * this.field2018.field6865 + (float) arg1 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field2018.field6843 + (float) arg3 * this.field2018.field6865 + (float) arg4 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / (float) arg6);
        if (var13 < this.field2012 && var14 < this.field2012) {
            var10 |= 4;
        } else if (var13 > this.field1993 && var14 > this.field1993) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "()V", line = 2523)
    public final void method970() {
    }

    @OriginalMember(owner = "client!qk", name = "EA", descriptor = "(IIII)V", line = 2527)
    public final void method971(int arg0, int arg1, int arg2, int arg3) {
        class160 var5 = this.method996(Thread.currentThread());
        var5.field2083 = arg0;
        var5.field2087 = arg1;
        var5.field2077 = arg2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 2536)
    public final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class160 var14 = this.method996(Thread.currentThread());
        class623 var15 = var14.field2097;
        var15.field7887 = false;
        int var16 = arg0 - this.field2002;
        int var17 = arg3 - this.field2002;
        int var18 = arg6 - this.field2002;
        int var19 = arg1 - this.field2012;
        int var20 = arg4 - this.field2012;
        int var21 = arg7 - this.field2012;
        var15.field7878 = var16 < 0 || var16 > var15.field7875 || var17 < 0 || var17 > var15.field7875 || var18 < 0 || var18 > var15.field7875;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field7880 = 255 - var22;
                var15.field7876 = false;
                var15.method3334((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field7880 = 128;
                var15.field7876 = true;
                var15.method3334((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field7880 = 0;
            var15.field7876 = false;
            var15.method3334((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field7887 = true;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(IIIIII)V", line = 2577)
    public final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method896(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method896(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method936(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method936(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field2024) {
                    var10 += (this.field2024 - arg0) * var12;
                    arg0 = this.field2024;
                }
                if (var13 >= this.field2026) {
                    var13 = this.field2026 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field1997 && var17 < this.field2013) {
                                int var18 = this.field1992 * var17 + arg0;
                                int var19 = this.field2001[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field2001[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field1997 && var21 < this.field2013) {
                                int var22 = this.field1992 * var21 + arg0;
                                int var23 = this.field2001[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field2001[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field1997 && var27 < this.field2013) {
                            this.field2001[this.field1992 * var27 + arg0] = arg4;
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
                if (arg1 < this.field1997) {
                    var29 += (this.field1997 - arg1) * var31;
                    arg1 = this.field1997;
                }
                if (var32 >= this.field2013) {
                    var32 = this.field2013 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field2024 && var46 < this.field2026) {
                            this.field2001[this.field1992 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field2024 && var36 < this.field2026) {
                            int var37 = this.field1992 * arg1 + var36;
                            int var38 = this.field2001[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field2001[this.field1992 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field2024 && var40 < this.field2026) {
                            int var41 = this.field1992 * arg1 + var40;
                            int var42 = this.field2001[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field2001[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "(I)Z", line = 2790)
    public final boolean method974(int arg0) {
        return super.field7199.method1733(-1852, arg0);
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)Lza;", line = 2793)
    public final class270 method975(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(II)V", line = 2798)
    public final void method976(int arg0, int arg1) {
        class160 var3 = this.method996(Thread.currentThread());
        this.field2016 = arg0;
        this.field2004 = arg1;
        var3.field2076 = this.field2004 - 255;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lvi;Z)Lpu;", line = 2805)
    public final class772 method977(class388 arg0, boolean arg1) {
        int[] var3 = arg0.field4951;
        byte[] var4 = arg0.field4949;
        int var5 = arg0.field4950;
        int var6 = arg0.field4946;
        class639 var11;
        if (arg1 && arg0.field4947 == null) {
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
            var11 = new class712(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4947;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class782(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class360(this, var14, var5, var6);
            }
        }
        var11.method626(arg0.field4948, arg0.field4945, arg0.field4953, arg0.field4952);
        return var11;
    }

    @OriginalMember(owner = "client!qk", name = "JA", descriptor = "(IIIIII)I", line = 2909)
    public final int method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field2018.field6871 + (float) arg0 * this.field2018.field6853 + (float) arg1 * this.field2018.field6855 + this.field2018.field6847;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field2018.field6871 + (float) arg3 * this.field2018.field6853 + (float) arg4 * this.field2018.field6855 + this.field2018.field6847;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field2016 && var9 < (float) this.field2016) {
            var7 |= 16;
        } else if (var8 > (float) this.field2004 && var9 > (float) this.field2004) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field2018.field6873 + (float) arg0 * this.field2018.field6856 + (float) arg1 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / var8);
        int var11 = (int) (((float) arg5 * this.field2018.field6873 + (float) arg3 * this.field2018.field6856 + (float) arg4 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / var9);
        if (var10 < this.field2002 && var11 < this.field2002) {
            var7 |= 1;
        } else if (var10 > this.field2019 && var11 > this.field2019) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field2018.field6843 + (float) arg0 * this.field2018.field6865 + (float) arg1 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / var8);
        int var13 = (int) (((float) arg5 * this.field2018.field6843 + (float) arg3 * this.field2018.field6865 + (float) arg4 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / var9);
        if (var12 < this.field2012 && var13 < this.field2012) {
            var7 |= 4;
        } else if (var12 > this.field1993 && var13 > this.field1993) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2952)
    public final void method979(Canvas arg0) {
        if (this.field1988 == arg0) {
            this.method888((Canvas) null);
        }
        class256 var2 = (class256) this.field1985.method2616((long) arg0.hashCode(), (byte) 25);
        if (var2 != null) {
            var2.method1946(-10364);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lwq;I)V", line = 2963)
    public final void method980(class705 arg0, int arg1) {
        class160 var3 = this.method996(Thread.currentThread());
        class411 var4 = arg0.field9317.field2337;
        for (class411 var5 = var4.field5451; var4 != var5; var5 = var5.field5451) {
            class165 var6 = (class165) var5;
            int var7 = var6.field2187 >> 12;
            int var8 = var6.field2190 >> 12;
            int var9 = var6.field2185 >> 12;
            float var10 = (float) var9 * this.field2018.field6871 + (float) var7 * this.field2018.field6853 + (float) var8 * this.field2018.field6855 + this.field2018.field6847;
            if (!(var10 < (float) this.field2016) && !(var10 > (float) var3.field2076)) {
                int var11 = (int) (((float) var9 * this.field2018.field6873 + (float) var7 * this.field2018.field6856 + (float) var8 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / (float) arg1) + this.field2014;
                int var12 = (int) (((float) var9 * this.field2018.field6843 + (float) var7 * this.field2018.field6865 + (float) var8 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / (float) arg1) + this.field2020;
                if (var11 >= this.field2024 && var11 <= this.field2026 && var12 >= this.field1997 && var12 <= this.field2013) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method882(var6, var11, var12, (int) var10, (this.field2021 * var6.field2192 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "()I", line = 3001)
    public final int method981() {
        return 0;
    }

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "(I)V", line = 3004)
    public final void method982(int arg0) {
        this.field2028[arg0].method1020((Runnable) null, false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)V", line = 3008)
    public final void method983(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 3011)
    public final void method984(boolean arg0) {
        this.field2007 = arg0;
        this.field1995.method2919(0);
    }

    @OriginalMember(owner = "client!qk", name = "XA", descriptor = "()I", line = 3015)
    public final int method985() {
        return this.field2004;
    }

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "(I)Z", line = 3018)
    public final boolean method986(int arg0) {
        return this.field2007 || super.field7199.method1732((byte) 123, arg0).field2673;
    }

    @OriginalMember(owner = "client!qk", name = "da", descriptor = "(III[I)V", line = 3029)
    public final void method987(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2018.field6871 + (float) arg0 * this.field2018.field6853 + (float) arg1 * this.field2018.field6855 + this.field2018.field6847;
        if (!(var5 < (float) this.field2016) && !(var5 > (float) this.field2004)) {
            int var6 = (int) (((float) arg2 * this.field2018.field6873 + (float) arg0 * this.field2018.field6856 + (float) arg1 * this.field2018.field6846 + this.field2018.field6844) * (float) this.field2021 / var5);
            int var7 = (int) (((float) arg2 * this.field2018.field6843 + (float) arg0 * this.field2018.field6865 + (float) arg1 * this.field2018.field6861 + this.field2018.field6862) * (float) this.field2006 / var5);
            if (var6 >= this.field2002 && var6 <= this.field2019 && var7 >= this.field2012 && var7 <= this.field1993) {
                arg3[0] = var6 - this.field2002;
                arg3[1] = var7 - this.field2012;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "(II)V", line = 3054)
    public final void method988(int arg0, int arg1) {
        int var3 = this.field1992 * arg1 + arg0;
        int var4 = this.field2009 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field2001;
            float[] var6 = this.field2008;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class642.method3475(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class642.method3475(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class642.method3476(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class642.method3476(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 3096)
    public final void method989(int arg0) {
        this.field2027 = arg0;
        this.field1995.method2919(0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)Lpu;", line = 3100)
    public final class772 method990(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class782(this, arg0, arg1) : new class360(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Loha;)V", line = 3106)
    public final void method991(class465 arg0) {
        this.field2018 = (class548) arg0;
    }

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "()Z", line = 3109)
    public final boolean method992() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "()Z", line = 3112)
    public final boolean method993() {
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "()Loha;", line = 3115)
    public final class465 method994() {
        return new class548();
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "(I)V", line = 3125)
    public final void method995(int arg0) {
        this.field2028[arg0].method1020(Thread.currentThread(), false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/Runnable;)Liq;", line = 3134)
    public final class160 method996(Runnable arg0) {
        for (int var2 = 0; var2 < this.field1996; ++var2) {
            if (this.field2028[var2].field2074 == arg0) {
                return this.field2028[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "ZA", descriptor = "(IFFFFF)V", line = 3146)
    public final void method997(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field1994 = (int) (arg1 * 65535.0F);
        this.field2011 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field2003 = (int) (arg3 * 65535.0F / var7);
        this.field1991 = (int) (arg4 * 65535.0F / var7);
        this.field2017 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!qk", name = "za", descriptor = "(IIIII)V", line = 3164)
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field1997) {
            var6 = this.field1997;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field2013) {
            var7 = this.field2013;
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
                if (var64 < this.field2024) {
                    var64 = this.field2024;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field2026) {
                    var65 = this.field2026;
                }
                int var66 = this.field1992 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field2001[var66++] = arg3;
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
                if (var60 < this.field2024) {
                    var60 = this.field2024;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field2026 - 1) {
                    var61 = this.field2026 - 1;
                }
                int var62 = this.field1992 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field2001[var62++] = arg3;
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
                if (var28 < this.field2024) {
                    var28 = this.field2024;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field2026) {
                    var29 = this.field2026;
                }
                int var30 = this.field1992 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field2001[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field2001[var30++] = var15 + var33;
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
                if (var22 < this.field2024) {
                    var22 = this.field2024;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field2026 - 1) {
                    var23 = this.field2026 - 1;
                }
                int var24 = this.field1992 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field2001[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field2001[var24++] = var15 + var27;
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
                if (var47 < this.field2024) {
                    var47 = this.field2024;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field2026) {
                    var48 = this.field2026;
                }
                int var49 = this.field1992 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field2001[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field2001[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field2024) {
                    var39 = this.field2024;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field2026 - 1) {
                    var40 = this.field2026 - 1;
                }
                int var41 = this.field1992 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field2001[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field2001[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "()V", line = 3457)
    public final void method999() {
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(IIIIII)V", line = 3471)
    private final void method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field1997) {
            var7 = this.field1997;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field2013) {
            var8 = this.field2013;
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
                if (var65 < this.field2024) {
                    var65 = this.field2024;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field2026) {
                    var66 = this.field2026;
                }
                int var67 = this.field1992 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field2008[var67]) {
                        this.field2001[var67] = arg4;
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
                if (var61 < this.field2024) {
                    var61 = this.field2024;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field2026 - 1) {
                    var62 = this.field2026 - 1;
                }
                int var63 = this.field1992 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field2008[var63]) {
                        this.field2001[var63] = arg4;
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
                if (var29 < this.field2024) {
                    var29 = this.field2024;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field2026) {
                    var30 = this.field2026;
                }
                int var31 = this.field1992 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field2008[var31]) {
                        int var33 = this.field2001[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field2001[var31] = var16 + var34;
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
                if (var23 < this.field2024) {
                    var23 = this.field2024;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field2026 - 1) {
                    var24 = this.field2026 - 1;
                }
                int var25 = this.field1992 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field2008[var25]) {
                        int var27 = this.field2001[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field2001[var25] = var16 + var28;
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
                if (var48 < this.field2024) {
                    var48 = this.field2024;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field2026) {
                    var49 = this.field2026;
                }
                int var50 = this.field1992 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field2008[var50]) {
                        int var52 = this.field2001[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field2001[var50] = var53 - var55 | var55 - (var55 >>> 8);
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
                if (var40 < this.field2024) {
                    var40 = this.field2024;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field2026 - 1) {
                    var41 = this.field2026 - 1;
                }
                int var42 = this.field1992 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field2008[var42]) {
                        int var44 = this.field2001[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field2001[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)Lod;", line = 3805)
    public final class539 method1001(int arg0, int arg1) {
        return this.method990(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lne;[Lvi;Z)Lda;", line = 3820)
    public final class420 method1002(class166 arg0, class388[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4950;
            var5[var7] = arg1[var7].field4946;
            if (arg1[var7].field4947 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class163(this, arg0, arg1, var4, var5);
            } else {
                return new class428(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class277(this, arg0, arg1, var4, var5);
        }
    }
}
