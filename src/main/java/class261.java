import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class261 extends class725 {

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "[I")
    private int[] field3776 = new int[16];

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "[I")
    private int[] field3761 = new int[16];

    @OriginalMember(owner = "client!aea", name = "I", descriptor = "[I")
    private int[] field3778 = new int[16];

    @OriginalMember(owner = "client!aea", name = "M", descriptor = "[I")
    private int[] field3782 = new int[16];

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
    private int field3771 = 1000000;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "[I")
    private int[] field3759 = new int[16];

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "[I")
    private int[] field3770 = new int[16];

    @OriginalMember(owner = "client!aea", name = "bb", descriptor = "[I")
    public int[] field3797 = new int[16];

    @OriginalMember(owner = "client!aea", name = "V", descriptor = "[I")
    private int[] field3791 = new int[16];

    @OriginalMember(owner = "client!aea", name = "T", descriptor = "[I")
    private int[] field3789 = new int[16];

    @OriginalMember(owner = "client!aea", name = "pb", descriptor = "[I")
    public int[] field3811 = new int[16];

    @OriginalMember(owner = "client!aea", name = "db", descriptor = "[I")
    private int[] field3799 = new int[16];

    @OriginalMember(owner = "client!aea", name = "jb", descriptor = "I")
    private int field3805 = 256;

    @OriginalMember(owner = "client!aea", name = "fb", descriptor = "[[Lafa;")
    private class380[][] field3801 = new class380[16][128];

    @OriginalMember(owner = "client!aea", name = "tb", descriptor = "[I")
    private int[] field3815 = new int[16];

    @OriginalMember(owner = "client!aea", name = "J", descriptor = "[I")
    private int[] field3779 = new int[16];

    @OriginalMember(owner = "client!aea", name = "H", descriptor = "[I")
    private int[] field3777 = new int[16];

    @OriginalMember(owner = "client!aea", name = "Db", descriptor = "[[Lafa;")
    private class380[][] field3825 = new class380[16][128];

    @OriginalMember(owner = "client!aea", name = "yb", descriptor = "[I")
    public int[] field3820 = new int[16];

    @OriginalMember(owner = "client!aea", name = "Bb", descriptor = "[I")
    private int[] field3823 = new int[16];

    @OriginalMember(owner = "client!aea", name = "mb", descriptor = "Luaa;")
    private class373 field3808 = new class373();

    @OriginalMember(owner = "client!aea", name = "Fb", descriptor = "Lhda;")
    private class347 field3827 = new class347(this);

    @OriginalMember(owner = "client!aea", name = "S", descriptor = "Lbaa;")
    private class130 field3788;

    @OriginalMember(owner = "client!aea", name = "P", descriptor = "Lmaa;")
    public static class508 field3785 = new class508(11, 4);

    @OriginalMember(owner = "client!aea", name = "ub", descriptor = "[I")
    public static int[] field3816 = new int[14];

    @OriginalMember(owner = "client!aea", name = "qb", descriptor = "Ljn;")
    public static class324 field3812 = new class324(8, 0, 4, 1);

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!aea", name = "D", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!aea", name = "F", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!aea", name = "K", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!aea", name = "L", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!aea", name = "N", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!aea", name = "O", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!aea", name = "Q", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!aea", name = "R", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!aea", name = "U", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!aea", name = "W", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!aea", name = "X", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!aea", name = "Y", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!aea", name = "Z", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!aea", name = "ab", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!aea", name = "cb", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!aea", name = "eb", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!aea", name = "gb", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!aea", name = "hb", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!aea", name = "ib", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!aea", name = "kb", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!aea", name = "lb", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!aea", name = "nb", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!aea", name = "ob", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!aea", name = "rb", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!aea", name = "sb", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!aea", name = "vb", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!aea", name = "wb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!aea", name = "xb", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!aea", name = "zb", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!aea", name = "Ab", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!aea", name = "Cb", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!aea", name = "Eb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!aea", name = "Ib", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!aea", name = "Kb", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!aea", name = "Mb", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!aea", name = "Hb", descriptor = "J")
    private long field3829;

    @OriginalMember(owner = "client!aea", name = "Jb", descriptor = "J")
    private long field3831;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "Lsg;")
    public static class17 field3769;

    @OriginalMember(owner = "client!aea", name = "Lb", descriptor = "Laha;")
    private class89 field3833;

    @OriginalMember(owner = "client!aea", name = "Gb", descriptor = "Z")
    private boolean field3828;

    @OriginalMember(owner = "client!aea", name = "Nb", descriptor = "Z")
    private boolean field3835;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IBI)V", line = 3)
    private final void method1760(int arg0, byte arg1, int arg2) {
        field3794++;
        this.field3799[arg2] = arg0;
        this.field3778[arg2] = class665.method3759(arg0, -128);
        this.method1768(arg0, 8192, arg2);
        int var4 = 75 % ((arg1 - 39) / 34);
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V", line = 16)
    public final synchronized void method1761(int arg0) {
        if (arg0 == 2) {
            field3795++;
            this.method1775(true, arg0 - 32462);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V", line = 30)
    public final synchronized void method1762(int arg0, int arg1, int arg2) {
        if (arg0 != 20668) {
            this.method1779(null, -56);
        }
        this.method1760(arg1, (byte) -68, arg2);
        field3781++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BII)V", line = 42)
    private final void method1763(byte arg0, int arg1, int arg2) {
        if (arg0 < 2) {
            this.method358();
        }
        field3765++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIB)V", line = 52)
    private final void method1764(int arg0, int arg1, byte arg2) {
        if (arg2 <= -42) {
            field3802++;
            this.field3770[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V", line = 67)
    private final void method1765(byte arg0) {
        field3809++;
        int var2 = 50 / ((85 - arg0) / 36);
        int var3 = this.field3830;
        int var4 = this.field3832;
        long var5 = this.field3831;
        if (this.field3833 != null && this.field3834 == var4) {
            this.method1776((byte) 18, this.field3835, this.field3833, this.field3828);
            this.method1765((byte) 125);
            return;
        }
        while (this.field3832 == var4) {
            while (this.field3808.field5254[var3] == var4) {
                this.field3808.method2335(var3);
                int var7 = this.field3808.method2346(var3);
                if (var7 == 1) {
                    this.field3808.method2344();
                    this.field3808.method2341(var3);
                    if (this.field3808.method2338()) {
                        if (this.field3833 != null) {
                            this.method1766(this.field3828, false, this.field3833);
                            this.method1765((byte) 42);
                            return;
                        }
                        if (!this.field3828 || var4 == 0) {
                            this.method1771(true, 0);
                            this.field3808.method2343();
                            return;
                        }
                        this.field3808.method2342(var5);
                    }
                    break;
                }
                if ((var7 & 0x80) != 0) {
                    this.method1784((byte) 78, var7);
                }
                this.field3808.method2333(var3);
                this.field3808.method2341(var3);
            }
            var3 = this.field3808.method2340();
            var4 = this.field3808.field5254[var3];
            var5 = this.field3808.method2336(var4);
        }
        this.field3832 = var4;
        this.field3831 = var5;
        this.field3830 = var3;
        if (this.field3833 != null && this.field3834 < var4) {
            this.field3832 = this.field3834;
            this.field3830 = -1;
            this.field3831 = this.field3808.method2336(this.field3832);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZZLaha;)V", line = 148)
    public final synchronized void method1766(boolean arg0, boolean arg1, class89 arg2) {
        if (arg1) {
            this.method357();
        }
        this.method1776((byte) 18, true, arg2, arg0);
        field3807++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)V", line = 159)
    private final void method1767(int arg0, int arg1) {
        class380 var3 = (class380) this.field3827.field4932.method3618(89);
        if (arg0 <= 10) {
            return;
        }
        while (var3 != null) {
            if (arg1 < 0 || var3.field5447 == arg1) {
                if (var3.field5444 != null) {
                    var3.field5444.method4219(class718.field9998 / 100);
                    if (var3.field5444.method4232()) {
                        this.field3827.field4939.method359(var3.field5444);
                    }
                    var3.method2382(-113);
                }
                if (var3.field5442 < 0) {
                    this.field3825[var3.field5447][var3.field5433] = null;
                }
                var3.method549(6410);
            }
            var3 = (class380) this.field3827.field4932.method3619(0);
        }
        field3790++;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)V", line = 201)
    private final void method1768(int arg0, int arg1, int arg2) {
        if (arg1 != 8192) {
            method1777(-46, -9, true);
        }
        field3814++;
        if (this.field3776[arg2] != arg0) {
            this.field3776[arg2] = arg0;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field3801[arg2][var4] = null;
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 223)
    public final synchronized void method366(int arg0) {
        field3760++;
        if (this.field3808.method2339()) {
            int var2 = this.field3808.field5255 * this.field3771 / class718.field9998;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3829;
                if ((this.field3831 - var3) >= 0L) {
                    this.field3829 = var3;
                    break;
                }
                int var5 = (int) ((this.field3831 + ((long) var2) - this.field3829 - 1L) / (long) var2);
                this.field3829 += (long) var2 * (long) var5;
                arg0 -= var5;
                this.field3827.method366(var5);
                this.method1765((byte) 123);
            } while (this.field3808.method2339());
        }
        this.field3827.method366(arg0);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)V", line = 261)
    private final void method1769(int arg0, int arg1, int arg2, int arg3) {
        field3800++;
        this.method1795((byte) 55, arg3, arg2, 64);
        if ((this.field3820[arg3] & 0x2) != 0) {
            for (class380 var5 = (class380) this.field3827.field4932.method3617((byte) -9); var5 != null; var5 = (class380) this.field3827.field4932.method3620(false)) {
                if (var5.field5447 == arg3 && var5.field5442 < 0) {
                    this.field3825[arg3][var5.field5433] = null;
                    this.field3825[arg3][arg2] = var5;
                    int var6 = (var5.field5449 * var5.field5438 >> 12) + var5.field5453;
                    var5.field5453 += arg2 - var5.field5433 << 8;
                    var5.field5433 = arg2;
                    var5.field5438 = 4096;
                    var5.field5449 = var6 - var5.field5453;
                    return;
                }
            }
        }
        class301 var7 = (class301) this.field3788.method812(arg1 - 32663, (long) this.field3776[arg3]);
        if (var7 == null) {
            return;
        }
        class695 var8 = var7.field4256[arg2];
        if (var8 == null) {
            return;
        }
        class380 var9 = new class380();
        var9.field5431 = var8;
        var9.field5447 = arg3;
        var9.field5456 = var7;
        var9.field5439 = var7.field4265[arg2];
        var9.field5448 = var7.field4257[arg2];
        var9.field5433 = arg2;
        var9.field5435 = var7.field4264 * arg0 * var7.field4266[arg2] * arg0 + 1024 >> 11;
        var9.field5441 = var7.field4262[arg2] & 0xFF;
        var9.field5453 = (arg2 << 8) - (var7.field4253[arg2] & 0x7FFF);
        var9.field5445 = 0;
        var9.field5446 = 0;
        var9.field5452 = 0;
        var9.field5434 = 0;
        if (arg1 != 32767) {
            return;
        }
        var9.field5442 = -1;
        if (this.field3811[arg3] == 0) {
            var9.field5444 = class760.method4212(var8, this.method1779(var9, 255), this.method1797(arg1 ^ 0xFFFF8001, var9), this.method1773(var9, false));
        } else {
            var9.field5444 = class760.method4212(var8, this.method1779(var9, 255), 0, this.method1773(var9, false));
            this.method1783(arg1 ^ 0xFFFF807D, var9, var7.field4253[arg2] < 0);
        }
        if (var7.field4253[arg2] < 0) {
            var9.field5444.method4242(-1);
        }
        if (var9.field5448 >= 0) {
            class380 var10 = this.field3801[arg3][var9.field5448];
            if (var10 != null && var10.field5442 < 0) {
                this.field3825[arg3][var10.field5433] = null;
                var10.field5442 = 0;
            }
            this.field3801[arg3][var9.field5448] = var9;
        }
        this.field3827.field4932.method3610(9289, var9);
        this.field3825[arg3][arg2] = var9;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIILafa;[I)Z", line = 355)
    public final boolean method1770(int arg0, int arg1, int arg2, class380 arg3, int[] arg4) {
        arg3.field5450 = class718.field9998 / 100;
        field3821++;
        if (arg3.field5442 >= 0 && arg3.field5444 == null || arg3.field5444.method4249()) {
            arg3.method2382(-115);
            arg3.method549(6410);
            if (arg3.field5448 > 0 && this.field3801[arg3.field5447][arg3.field5448] == arg3) {
                this.field3801[arg3.field5447][arg3.field5448] = null;
            }
            return true;
        }
        int var6 = arg3.field5438;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field3815[arg3.field5447] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg3.field5438 = var7;
        }
        arg3.field5444.method4231(this.method1779(arg3, 255));
        class88 var8 = arg3.field5439;
        arg3.field5436 += var8.field1251;
        arg3.field5443++;
        boolean var9 = false;
        double var10 = (double) ((arg3.field5433 - 60 << 8) + (arg3.field5449 * arg3.field5438 >> 12)) * 5.086263020833333E-6D;
        if (var8.field1250 > 0) {
            if (var8.field1254 <= 0) {
                arg3.field5446 += 128;
            } else {
                arg3.field5446 += (int) (Math.pow(2.0D, (double) var8.field1254 * var10) * 128.0D + 0.5D);
            }
            if (arg3.field5446 * var8.field1250 >= 819200) {
                var9 = true;
            }
        }
        if (var8.field1253 != null) {
            if (var8.field1247 > 0) {
                arg3.field5434 += (int) (Math.pow(2.0D, (double) var8.field1247 * var10) * 128.0D + 0.5D);
            } else {
                arg3.field5434 += 128;
            }
            while (var8.field1253.length - 2 > arg3.field5445 && arg3.field5434 > (var8.field1253[arg3.field5445 + 2] & 0xFF) << 8) {
                arg3.field5445 += 2;
            }
            if (var8.field1253.length - 2 == arg3.field5445 && var8.field1253[arg3.field5445 + 1] == 0) {
                var9 = true;
            }
        }
        if (arg3.field5442 >= 0 && var8.field1245 != null && (this.field3820[arg3.field5447] & 0x1) == 0 && (arg3.field5448 < 0 || this.field3801[arg3.field5447][arg3.field5448] != arg3)) {
            if (var8.field1252 <= 0) {
                arg3.field5442 += 128;
            } else {
                arg3.field5442 += (int) (Math.pow(2.0D, (double) var8.field1252 * var10) * 128.0D + 0.5D);
            }
            while ((var8.field1245.length - 2) > arg3.field5452 && arg3.field5442 > (var8.field1245[arg3.field5452 + 2] & 0xFF << 8)) {
                arg3.field5452 += 2;
            }
            if ((var8.field1245.length - 2) == arg3.field5452) {
                var9 = true;
            }
        }
        if (!var9) {
            arg3.field5444.method4229(arg3.field5450, this.method1797(-2, arg3), this.method1773(arg3, false));
            int var12 = 99 / ((1 - arg1) / 43);
            return false;
        }
        arg3.field5444.method4219(arg3.field5450);
        if (arg4 == null) {
            arg3.field5444.method366(arg0);
        } else {
            arg3.field5444.method360(arg4, arg2, arg0);
        }
        if (arg3.field5444.method4232()) {
            this.field3827.field4939.method359(arg3.field5444);
        }
        arg3.method2382(-115);
        if (arg3.field5442 >= 0) {
            arg3.method549(6410);
            if (arg3.field5448 > 0 && this.field3801[arg3.field5447][arg3.field5448] == arg3) {
                this.field3801[arg3.field5447][arg3.field5448] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZI)V", line = 478)
    private final void method1771(boolean arg0, int arg1) {
        if (arg0) {
            this.method1767(arg1 + 93, -1);
        } else {
            this.method1796(0, -1);
        }
        field3798++;
        this.method1787((byte) -63, -1);
        for (int var3 = 0; var3 < 16; var3++) {
            this.field3776[var3] = this.field3799[var3];
        }
        for (int var4 = arg1; var4 < 16; var4++) {
            this.field3778[var4] = class665.method3759(-128, this.field3799[var4]);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BLjava/lang/String;)V", line = 507)
    public static final void method1772(byte arg0, String arg1) {
        field3767++;
        if (class297.field4232 == null) {
            class625.method3523(18);
        }
        class647.field8679.setTime(new Date(class97.method664((byte) -50)));
        int var2 = class647.field8679.get(11);
        int var3 = class647.field8679.get(12);
        int var4 = class647.field8679.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class494.method2992('\n', arg1, 1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class537.field7437; var8 > 0; var8--) {
                class297.field4232[var8] = class297.field4232[var8 - 1];
            }
            class297.field4232[0] = var5 + ": " + var6[var7];
            if (class186.field2534 != null) {
                try {
                    class186.field2534.write(class489.method2963(class297.field4232[0] + "\n", (byte) 99));
                } catch (IOException var9) {
                }
            }
            if (class537.field7437 < (class297.field4232.length - 1)) {
                if (class489.field6846 > 0) {
                    class489.field6846++;
                }
                class537.field7437++;
            }
        }
        if (arg0 >= -96) {
            field3769 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lafa;Z)I", line = 568)
    private final int method1773(class380 arg0, boolean arg1) {
        if (arg1) {
            this.field3815 = null;
        }
        field3792++;
        int var3 = this.field3791[arg0.field5447];
        return var3 >= 8192 ? 16384 - ((128 - arg0.field5441) * (16384 - var3) + 32 >> 6) : arg0.field5441 * var3 + 32 >> 6;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "()I", line = 585)
    public final synchronized int method355() {
        field3757++;
        return 0;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)V", line = 594)
    public final synchronized void method1774(int arg0) {
        class301 var2 = (class301) this.field3788.method821((byte) 121);
        if (arg0 != 0) {
            return;
        }
        while (var2 != null) {
            var2.method549(arg0 ^ 0x190A);
            var2 = (class301) this.field3788.method818(75);
        }
        field3817++;
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V", line = 1662)
    public class261() {
        this.field3788 = new class130(128);
        this.method1788(256, -1, 16256);
        this.method1771(true, 0);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Laea;)V", line = 1671)
    public class261(class261 arg0) {
        this.field3788 = arg0.field3788;
        this.method1788(256, -1, 16256);
        this.method1771(true, 0);
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(ZI)V", line = 624)
    private final synchronized void method1775(boolean arg0, int arg1) {
        this.field3808.method2343();
        field3764++;
        if (arg1 != -32460) {
            this.method1775(false, 21);
        }
        this.field3833 = null;
        this.method1771(arg0, 0);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BZLaha;Z)V", line = 641)
    private final synchronized void method1776(byte arg0, boolean arg1, class89 arg2, boolean arg3) {
        this.method1775(arg1, -32460);
        field3784++;
        this.field3808.method2334(arg2.field1256);
        this.field3828 = arg3;
        this.field3829 = 0L;
        int var5 = this.field3808.method2345();
        int var6 = 0;
        if (arg0 != 18) {
            this.field3828 = false;
        }
        while (var5 > var6) {
            this.field3808.method2335(var6);
            this.field3808.method2333(var6);
            this.field3808.method2341(var6);
            var6++;
        }
        this.field3830 = this.field3808.method2340();
        this.field3832 = this.field3808.field5254[this.field3830];
        this.field3831 = this.field3808.method2336(this.field3832);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIZ)Z", line = 680)
    public static final boolean method1777(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3774 = 10;
        }
        field3819++;
        boolean var3 = (arg1 & 0x37) == 0 ? class286.method1899((byte) -126, arg1, arg0) : class90.method624(arg0, (byte) -13, arg1);
        return var3 | (arg0 & 0x10000) != 0 | class338.method2146(544, arg1, arg0);
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)I", line = 698)
    public final int method1778(byte arg0) {
        field3826++;
        if (arg0 > -69) {
            field3816 = null;
        }
        return this.field3805;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lafa;I)I", line = 713)
    private final int method1779(class380 arg0, int arg1) {
        field3786++;
        int var3 = arg0.field5453 + (arg0.field5449 * arg0.field5438 >> 12);
        int var4 = ((this.field3770[arg0.field5447] - 8192) * this.field3789[arg0.field5447] >> 12) + var3;
        if (arg1 != 255) {
            this.method1782(39, 14, 69);
        }
        class88 var5 = arg0.field5439;
        if (var5.field1251 > 0 && (var5.field1243 > 0 || this.field3779[arg0.field5447] > 0)) {
            int var6 = var5.field1243 << 2;
            int var7 = var5.field1248 << 1;
            if (arg0.field5443 < var7) {
                var6 = arg0.field5443 * var6 / var7;
            }
            int var8 = (this.field3779[arg0.field5447] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field5436 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg0.field5431.field9686 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class718.field9998 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)V", line = 750)
    public final synchronized void method1780(int arg0) {
        field3818++;
        class301 var2 = (class301) this.field3788.method821((byte) 121);
        int var3 = 117 / ((arg0 - 91) / 35);
        while (var2 != null) {
            var2.method1983(0);
            var2 = (class301) this.field3788.method818(120);
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "()Lco;", line = 767)
    public final synchronized class725 method358() {
        field3810++;
        return this.field3827;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(II)V", line = 775)
    private final void method1781(int arg0, int arg1) {
        if ((this.field3820[arg1] & 0x4) != 0) {
            for (class380 var3 = (class380) this.field3827.field4932.method3618(110); var3 != null; var3 = (class380) this.field3827.field4932.method3619(0)) {
                if (var3.field5447 == arg1) {
                    var3.field5437 = 0;
                }
            }
        }
        if (arg0 >= 102) {
            field3766++;
        }
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(III)V", line = 810)
    private final void method1782(int arg0, int arg1, int arg2) {
        this.field3761[arg2] = arg0;
        field3772++;
        this.field3797[arg2] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) arg1 + 0.5D);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILafa;Z)V", line = 823)
    public final void method1783(int arg0, class380 arg1, boolean arg2) {
        field3773++;
        if (arg0 > 0) {
            this.method1765((byte) -57);
        }
        int var4 = arg1.field5431.field9688.length;
        int var6;
        if (arg2 && arg1.field5431.field9685) {
            int var5 = var4 + var4 - arg1.field5431.field9687;
            var6 = (int) ((long) this.field3811[arg1.field5447] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var6 >= var7) {
                var6 = var7 + var7 - var6 - 1;
                arg1.field5444.method4211(true);
            }
        } else {
            var6 = (int) ((long) this.field3811[arg1.field5447] * (long) var4 >> 6);
        }
        arg1.field5444.method4238(var6);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "([III)V", line = 857)
    public final synchronized void method360(int[] arg0, int arg1, int arg2) {
        field3813++;
        if (this.field3808.method2339()) {
            int var4 = this.field3808.field5255 * this.field3771 / class718.field9998;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3829;
                if (this.field3831 - var5 >= 0L) {
                    this.field3829 = var5;
                    break;
                }
                int var7 = (int) ((this.field3831 + ((long) var4) - this.field3829 - 1L) / (long) var4);
                this.field3829 += (long) var4 * (long) var7;
                this.field3827.method360(arg0, arg1, var7);
                arg2 -= var7;
                arg1 += var7;
                this.method1765((byte) -118);
            } while (this.field3808.method2339());
        }
        this.field3827.method360(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V", line = 904)
    private final void method1784(byte arg0, int arg1) {
        if (arg0 < 64) {
            field3769 = null;
        }
        field3775++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = arg1 >> 8 & 0x7F;
            int var6 = arg1 >> 16 & 0x7F;
            this.method1795((byte) 122, var4, var5, var6);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = (arg1 & 0x7F2B) >> 8;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 > 0) {
                this.method1769(var9, 32767, var8, var7);
            } else {
                this.method1795((byte) 120, var7, var8, 64);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = arg1 >> 8 & 0x7F;
            int var12 = (arg1 & 0x7F44D6) >> 16;
            this.method1793(var11, var12, var10, -117);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = arg1 >> 8 & 0x7F;
            int var15 = (arg1 & 0x7FBDEA) >> 16;
            if (var14 == 0) {
                this.field3778[var13] = (var15 << 14) + class665.method3759(-2080769, this.field3778[var13]);
            }
            if (var14 == 32) {
                this.field3778[var13] = class665.method3759(this.field3778[var13], -16257) + (var15 << 7);
            }
            if (var14 == 1) {
                this.field3779[var13] = class665.method3759(this.field3779[var13], -16257) + (var15 << 7);
            }
            if (var14 == 33) {
                this.field3779[var13] = var15 + class665.method3759(-128, this.field3779[var13]);
            }
            if (var14 == 5) {
                this.field3815[var13] = (var15 << 7) + class665.method3759(-16257, this.field3815[var13]);
            }
            if (var14 == 37) {
                this.field3815[var13] = var15 + class665.method3759(this.field3815[var13], -128);
            }
            if (var14 == 7) {
                this.field3823[var13] = class665.method3759(this.field3823[var13], -16257) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field3823[var13] = class665.method3759(-128, this.field3823[var13]) + var15;
            }
            if (var14 == 10) {
                this.field3791[var13] = class665.method3759(-16257, this.field3791[var13]) + (var15 << 7);
            }
            if (var14 == 42) {
                this.field3791[var13] = var15 + class665.method3759(this.field3791[var13], -128);
            }
            if (var14 == 11) {
                this.field3777[var13] = class665.method3759(this.field3777[var13], -16257) + (var15 << 7);
            }
            if (var14 == 43) {
                this.field3777[var13] = class665.method3759(this.field3777[var13], -128) + var15;
            }
            if (var14 == 64) {
                if (var15 >= 64) {
                    this.field3820[var13] = class678.method3817(this.field3820[var13], 1);
                } else {
                    this.field3820[var13] = class665.method3759(this.field3820[var13], -2);
                }
            }
            if (var14 == 65) {
                if (var15 >= 64) {
                    this.field3820[var13] = class678.method3817(this.field3820[var13], 2);
                } else {
                    this.method1792(var13, -91);
                    this.field3820[var13] = class665.method3759(this.field3820[var13], -3);
                }
            }
            if (var14 == 99) {
                this.field3759[var13] = (var15 << 7) + class665.method3759(127, this.field3759[var13]);
            }
            if (var14 == 98) {
                this.field3759[var13] = var15 + class665.method3759(16256, this.field3759[var13]);
            }
            if (var14 == 101) {
                this.field3759[var13] = (var15 << 7) + class665.method3759(127, this.field3759[var13]) + 16384;
            }
            if (var14 == 100) {
                this.field3759[var13] = var15 + (class665.method3759(16256, this.field3759[var13]) + 16384);
            }
            if (var14 == 120) {
                this.method1767(88, var13);
            }
            if (var14 == 121) {
                this.method1787((byte) -63, var13);
            }
            if (var14 == 123) {
                this.method1796(0, var13);
            }
            if (var14 == 6) {
                int var16 = this.field3759[var13];
                if (var16 == 16384) {
                    this.field3789[var13] = class665.method3759(-16257, this.field3789[var13]) + (var15 << 7);
                }
            }
            if (var14 == 38) {
                int var17 = this.field3759[var13];
                if (var17 == 16384) {
                    this.field3789[var13] = class665.method3759(this.field3789[var13], -128) + var15;
                }
            }
            if (var14 == 16) {
                this.field3811[var13] = class665.method3759(this.field3811[var13], -16257) + (var15 << 7);
            }
            if (var14 == 48) {
                this.field3811[var13] = var15 + class665.method3759(this.field3811[var13], -128);
            }
            if (var14 == 81) {
                if (var15 >= 64) {
                    this.field3820[var13] = class678.method3817(this.field3820[var13], 4);
                } else {
                    this.method1781(125, var13);
                    this.field3820[var13] = class665.method3759(this.field3820[var13], -5);
                }
            }
            if (var14 == 17) {
                this.method1782((this.field3761[var13] & 0xFFFFC07F) + (var15 << 7), 2097152, var13);
            }
            if (var14 == 49) {
                this.method1782((this.field3761[var13] & 0xFFFFFF80) + var15, 2097152, var13);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = (arg1 & 0x7F48) >> 8;
            this.method1768(this.field3778[var18] + var19, 8192, var18);
        } else if (var3 == 208) {
            int var20 = arg1 & 0xF;
            int var21 = (arg1 & 0x7F16) >> 8;
            this.method1763((byte) 44, var21, var20);
        } else if (var3 == 224) {
            int var22 = arg1 & 0xF;
            int var23 = ((arg1 & 0x7F6A) >> 8) + (arg1 >> 9 & 0x3F80);
            this.method1764(var23, var22, (byte) -46);
        } else {
            int var24 = arg1 & 0xFF;
            if (var24 == 255) {
                this.method1771(true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZLaha;JZB)V", line = 1149)
    public final synchronized void method1785(boolean arg0, class89 arg1, long arg2, boolean arg3, byte arg4) {
        field3822++;
        if (arg4 != 15) {
            this.method1770(-35, -90, 33, null, null);
        }
        this.method1776((byte) 18, arg3, arg1, arg0);
        this.method1798(-84, (long) this.field3808.field5255 * arg2);
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(II)V", line = 1166)
    public final synchronized void method1786(int arg0, int arg1) {
        if (arg1 < 26) {
            this.method1768(-18, 94, -61);
        }
        this.field3805 = arg0;
        field3768++;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(BI)V", line = 1178)
    private final void method1787(byte arg0, int arg1) {
        field3793++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method1787((byte) -63, var3);
            }
            return;
        }
        this.field3823[arg1] = 12800;
        this.field3791[arg1] = 8192;
        this.field3777[arg1] = 16383;
        this.field3770[arg1] = 8192;
        this.field3779[arg1] = 0;
        this.field3815[arg1] = 8192;
        if (arg0 != -63) {
            this.field3835 = true;
        }
        this.method1792(arg1, -76);
        this.method1781(arg0 ^ 0xFFFFFFAF, arg1);
        this.field3820[arg1] = 0;
        this.field3759[arg1] = 32767;
        this.field3789[arg1] = 256;
        this.field3811[arg1] = 0;
        this.method1782(8192, 2097152, arg1);
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(III)V", line = 1217)
    public final synchronized void method1788(int arg0, int arg1, int arg2) {
        field3783++;
        if (arg2 != 16256) {
            return;
        }
        if (arg1 >= 0) {
            this.field3782[arg1] = arg0;
        } else {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field3782[var4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Laha;Luu;BLeia;I)Z", line = 1243)
    public final synchronized boolean method1789(class89 arg0, class237 arg1, byte arg2, class752 arg3, int arg4) {
        arg0.method617();
        field3824++;
        boolean var6 = true;
        int[] var7 = null;
        if (arg4 > 0) {
            var7 = new int[] { arg4 };
        }
        for (class484 var8 = (class484) arg0.field1257.method821((byte) 122); var8 != null; var8 = (class484) arg0.field1257.method818(80)) {
            int var9 = (int) var8.field1079;
            class301 var10 = (class301) this.field3788.method812(103, (long) var9);
            if (var10 == null) {
                var10 = class151.method957(arg1, var9, 11082);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field3788.method820((long) var9, (byte) -42, var10);
            }
            if (!var10.method1981(false, arg3, var8.field6744, var7)) {
                var6 = false;
            }
        }
        if (arg2 <= 75) {
            this.field3789 = null;
        }
        if (var6) {
            arg0.method616();
        }
        return var6;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(B)Z", line = 1295)
    public final synchronized boolean method1790(byte arg0) {
        field3806++;
        int var2 = -67 % ((49 - arg0) / 41);
        return this.field3808.method2339();
    }

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)V", line = 1314)
    public static void method1791(int arg0) {
        field3785 = null;
        field3812 = null;
        field3816 = null;
        if (arg0 < -14) {
            field3769 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(II)V", line = 1342)
    private final void method1792(int arg0, int arg1) {
        if ((this.field3820[arg0] & 0x2) != 0) {
            for (class380 var3 = (class380) this.field3827.field4932.method3618(-128); var3 != null; var3 = (class380) this.field3827.field4932.method3619(0)) {
                if (var3.field5447 == arg0 && this.field3825[arg0][var3.field5433] == null && var3.field5442 < 0) {
                    var3.field5442 = 0;
                }
            }
        }
        int var4 = 58 % ((arg1 + 27) / 43);
        field3763++;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIII)V", line = 1376)
    private final void method1793(int arg0, int arg1, int arg2, int arg3) {
        field3787++;
        if (arg3 > -30) {
            this.method1779(null, -73);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "()Lco;", line = 1388)
    public final synchronized class725 method357() {
        field3796++;
        return null;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(Lafa;I)Z", line = 1403)
    public final boolean method1794(class380 arg0, int arg1) {
        field3803++;
        if (arg0.field5444 == null) {
            if (arg0.field5442 >= 0) {
                arg0.method549(6410);
                if (arg0.field5448 > 0 && this.field3801[arg0.field5447][arg0.field5448] == arg0) {
                    this.field3801[arg0.field5447][arg0.field5448] = null;
                }
            }
            return true;
        } else if (arg1 == -1347527508) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BIII)V", line = 1434)
    private final void method1795(byte arg0, int arg1, int arg2, int arg3) {
        field3762++;
        class380 var5 = this.field3825[arg1][arg2];
        if (var5 == null) {
            return;
        }
        this.field3825[arg1][arg2] = null;
        if ((this.field3820[arg1] & 0x2) == 0) {
            var5.field5442 = 0;
        } else {
            for (class380 var6 = (class380) this.field3827.field4932.method3618(-113); var6 != null; var6 = (class380) this.field3827.field4932.method3619(0)) {
                if (var5.field5447 == var6.field5447 && var6.field5442 < 0 && var5 != var6) {
                    var5.field5442 = 0;
                    break;
                }
            }
        }
        if (arg0 <= 45) {
            method1791(41);
        }
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(II)V", line = 1477)
    private final void method1796(int arg0, int arg1) {
        for (class380 var3 = (class380) this.field3827.field4932.method3618(-72); var3 != null; var3 = (class380) this.field3827.field4932.method3619(0)) {
            if ((arg1 < 0 || var3.field5447 == arg1) && var3.field5442 < 0) {
                this.field3825[var3.field5447][var3.field5433] = null;
                var3.field5442 = 0;
            }
        }
        if (arg0 != 0) {
            this.field3834 = 56;
        }
        field3758++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILafa;)I", line = 1506)
    private final int method1797(int arg0, class380 arg1) {
        field3804++;
        if (this.field3782[arg1.field5447] == 0) {
            return 0;
        }
        class88 var3 = arg1.field5439;
        int var4 = this.field3823[arg1.field5447] * this.field3777[arg1.field5447] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg1.field5435 * var5 + 16384 >> 15;
        int var7 = this.field3805 * var6 + 128 >> 8;
        int var8 = this.field3782[arg1.field5447] * var7 + 128 >> 8;
        if (var3.field1250 > 0) {
            var8 = (int) (Math.pow(0.5D, (double) arg1.field5446 * 1.953125E-5D * (double) var3.field1250) * (double) var8 + 0.5D);
        }
        if (arg0 != -2) {
            this.field3805 = 53;
        }
        if (var3.field1253 != null) {
            int var9 = arg1.field5434;
            int var10 = var3.field1253[arg1.field5445 + 1];
            if (arg1.field5445 < (var3.field1253.length - 2)) {
                int var11 = (var3.field1253[arg1.field5445] & 0xFF) << 8;
                int var12 = (var3.field1253[arg1.field5445 + 2] & 0xFF) << 8;
                var10 += (var9 - var11) * (var3.field1253[arg1.field5445 + 3] - var10) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        if (arg1.field5442 > 0 && var3.field1245 != null) {
            int var13 = arg1.field5442;
            int var14 = var3.field1245[arg1.field5452 + 1];
            if ((var3.field1245.length - 2) > arg1.field5452) {
                int var15 = (var3.field1245[arg1.field5452] & 0xFF) << 8;
                int var16 = (var3.field1245[arg1.field5452 + 2] & 0xFF) << 8;
                var14 += (var3.field1245[arg1.field5452 + 3] - var14) * (var13 - var15) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        return var8;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IJ)V", line = 1577)
    private final void method1798(int arg0, long arg1) {
        if (arg0 > -24) {
            this.method1782(7, 10, -91);
        }
        field3780++;
        while (this.field3831 <= arg1) {
            int var4 = this.field3830;
            int var5 = this.field3832;
            long var6 = this.field3831;
            while (this.field3832 == var5) {
                while (this.field3808.field5254[var4] == var5) {
                    this.field3808.method2335(var4);
                    int var8 = this.field3808.method2346(var4);
                    if (var8 == 1) {
                        this.field3808.method2344();
                        this.field3808.method2341(var4);
                        if (this.field3808.method2338()) {
                            if (!this.field3828 || var5 == 0) {
                                this.method1771(true, 0);
                                this.field3808.method2343();
                                return;
                            }
                            this.field3808.method2342(var6);
                        }
                        break;
                    }
                    if ((var8 & 0x80) != 0 && (var8 & 0xF0) != 144) {
                        this.method1784((byte) 83, var8);
                    }
                    this.field3808.method2333(var4);
                    this.field3808.method2341(var4);
                }
                this.field3829 = var6;
                var4 = this.field3808.method2340();
                var5 = this.field3808.field5254[var4];
                var6 = this.field3808.method2336(var5);
            }
            this.field3832 = var5;
            this.field3831 = var6;
            this.field3830 = var4;
        }
    }
}
