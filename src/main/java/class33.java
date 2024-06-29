import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class33 extends class52 {

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    private int field668 = 0;

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "Z")
    private boolean field684 = false;

    @OriginalMember(owner = "client!de", name = "Gb", descriptor = "I")
    private int field697 = 0;

    @OriginalMember(owner = "client!de", name = "Bb", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!de", name = "Cb", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "Lpf;")
    private class140 field682;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "D")
    public double field670;

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "D")
    private double field676;

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "D")
    private double field679;

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "D")
    private double field680;

    @OriginalMember(owner = "client!de", name = "yb", descriptor = "D")
    private double field689;

    @OriginalMember(owner = "client!de", name = "Ab", descriptor = "D")
    private double field691;

    @OriginalMember(owner = "client!de", name = "Eb", descriptor = "D")
    public double field695;

    @OriginalMember(owner = "client!de", name = "Fb", descriptor = "D")
    public double field696;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!de", name = "zb", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!de", name = "Db", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!de", name = "vb", descriptor = "Lm;")
    public static class107 field686;

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "Lfa;")
    public static class47 field677;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "[I")
    public static int[] field673;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
    public final void method218(int arg0, int arg1) {
        field669++;
        this.field696 += (double) arg0 * this.field679;
        this.field695 += (double) arg0 * this.field689;
        if (arg1 != -3317) {
            return;
        }
        this.field670 += this.field691 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field676;
        this.field684 = true;
        this.field676 += (double) arg0 * this.field691;
        this.field694 = (int) (Math.atan2(this.field679, this.field689) * 325.949D) + 1024 & 0x7FF;
        this.field690 = (int) (Math.atan2(this.field676, this.field680) * 325.949D) & 0x7FF;
        if (this.field682 == null) {
            return;
        }
        this.field697 += arg0;
        while (true) {
            do {
                do {
                    if (this.field682.field2938[this.field668] >= this.field697) {
                        return;
                    }
                    this.field697 -= this.field682.field2938[this.field668];
                    this.field668++;
                } while (this.field682.field2919.length > this.field668);
                this.field668 -= this.field682.field2935;
            } while (this.field668 >= 0 && this.field668 < this.field682.field2919.length);
            this.field668 = 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "i", descriptor = "(I)V")
    public static void method219(int arg0) {
        field686 = null;
        field677 = null;
        if (arg0 != 1) {
            method219(-12);
        }
        field673 = null;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)Lrg;")
    public final class159 method220(boolean arg0) {
        field678++;
        if (!arg0) {
            this.field679 = -0.16412240162933073D;
        }
        class198 var2 = class177.method1224((byte) 106, this.field688);
        class159 var3 = var2.method1304(this.field668, arg0);
        if (var3 == null) {
            return null;
        } else {
            var3.method1146(this.field690);
            return var3;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLc;)V")
    public static final void method221(byte arg0, class19 arg1) {
        arg1.field387 = arg1.field441;
        field681++;
        if (arg1.field385 == 0) {
            arg1.field405 = 0;
            return;
        }
        if (arg1.field395 != -1 && arg1.field429 == 0) {
            class140 var2 = class139.method997(124, arg1.field395);
            if (arg1.field380 > 0 && var2.field2924 == 0) {
                arg1.field405++;
                return;
            }
            if (arg1.field380 <= 0 && var2.field2912 == 0) {
                arg1.field405++;
                return;
            }
        }
        int var3 = arg1.field406;
        int var4 = arg1.field391[arg1.field385 - 1] * 128 + arg1.field423 * 64;
        int var5 = arg1.field382;
        int var6 = arg1.field409[arg1.field385 - 1] * 128 + arg1.field423 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field382 = var6;
            arg1.field406 = var4;
            return;
        }
        if (var3 < var4) {
            if (var6 > var5) {
                arg1.field421 = 1280;
            } else if (var5 > var6) {
                arg1.field421 = 1792;
            } else {
                arg1.field421 = 1536;
            }
        } else if (var4 < var3) {
            if (var6 > var5) {
                arg1.field421 = 768;
            } else if (var6 < var5) {
                arg1.field421 = 256;
            } else {
                arg1.field421 = 512;
            }
        } else if (var5 < var6) {
            arg1.field421 = 1024;
        } else if (var6 < var5) {
            arg1.field421 = 0;
        }
        if (arg0 <= 33) {
            return;
        }
        int var7 = arg1.field400;
        int var8 = 4;
        int var9 = arg1.field421 - arg1.field403 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        boolean var10 = true;
        if (var9 >= -256 && var9 <= 256) {
            var7 = arg1.field397;
        } else if (var9 >= 256 && var9 < 768) {
            var7 = arg1.field418;
        } else if (var9 >= -768 && var9 <= -256) {
            var7 = arg1.field416;
        }
        if (var7 == -1) {
            var7 = arg1.field397;
        }
        arg1.field387 = var7;
        if (arg1 instanceof class102) {
            var10 = ((class102) arg1).field2298.field3162;
        }
        if (var10) {
            if (arg1.field421 != arg1.field403 && arg1.field393 == -1 && arg1.field408 != 0) {
                var8 = 2;
            }
            if (arg1.field385 > 2) {
                var8 = 6;
            }
            if (arg1.field385 > 3) {
                var8 = 8;
            }
            if (arg1.field405 > 0 && arg1.field385 > 1) {
                arg1.field405--;
                var8 = 8;
            }
        } else {
            if (arg1.field385 > 1) {
                var8 = 6;
            }
            if (arg1.field385 > 2) {
                var8 = 8;
            }
            if (arg1.field405 > 0 && arg1.field385 > 1) {
                var8 = 8;
                arg1.field405--;
            }
        }
        if (arg1.field422[arg1.field385 - 1]) {
            var8 <<= 0x1;
        }
        if (var3 < var4) {
            arg1.field406 += var8;
            if (arg1.field406 > var4) {
                arg1.field406 = var4;
            }
        } else if (var4 < var3) {
            arg1.field406 -= var8;
            if (arg1.field406 < var4) {
                arg1.field406 = var4;
            }
        }
        if (var6 > var5) {
            arg1.field382 += var8;
            if (arg1.field382 > var6) {
                arg1.field382 = var6;
            }
        } else if (var6 < var5) {
            arg1.field382 -= var8;
            if (var6 > arg1.field382) {
                arg1.field382 = var6;
            }
        }
        if (arg1.field406 == var4 && arg1.field382 == var6) {
            if (arg1.field380 > 0) {
                arg1.field380--;
            }
            arg1.field385--;
        }
        if (var8 >= 8 && arg1.field397 == arg1.field387 && arg1.field438 != -1) {
            arg1.field387 = arg1.field438;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZII)V")
    public final void method222(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field671++;
        if (!this.field684) {
            double var6 = (double) (arg0 - this.field693);
            double var8 = (double) (arg3 - this.field674);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field695 = (double) this.field667 * var8 / var10 + (double) this.field674;
            this.field670 = this.field666;
            this.field696 = (double) this.field667 * var6 / var10 + (double) this.field693;
        }
        double var12 = (double) (this.field692 + 1 - arg1);
        this.field679 = ((double) arg0 - this.field696) / var12;
        this.field689 = ((double) arg3 - this.field695) / var12;
        if (!arg2) {
            method221((byte) -55, null);
        }
        this.field680 = Math.sqrt(this.field689 * this.field689 + this.field679 * this.field679);
        if (!this.field684) {
            this.field676 = -this.field680 * Math.tan((double) this.field683 * 0.02454369D);
        }
        this.field691 = ((double) arg4 - this.field670 - this.field676 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field692 = arg6;
        this.field684 = false;
        this.field687 = arg10;
        this.field666 = arg4;
        this.field693 = arg2;
        this.field683 = arg7;
        this.field674 = arg3;
        this.field667 = arg8;
        this.field675 = arg5;
        this.field688 = arg0;
        this.field685 = arg1;
        this.field672 = arg9;
        int var12 = class177.method1224((byte) 117, this.field688).field3914;
        if (var12 == -1) {
            this.field682 = null;
        } else {
            this.field682 = class139.method997(123, var12);
        }
    }
}
