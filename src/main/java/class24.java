import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 extends class110 {

    @OriginalMember(owner = "client!cc", name = "vb", descriptor = "I")
    private int field485 = 0;

    @OriginalMember(owner = "client!cc", name = "Gb", descriptor = "I")
    private int field496 = 0;

    @OriginalMember(owner = "client!cc", name = "Kb", descriptor = "Z")
    private boolean field500 = false;

    @OriginalMember(owner = "client!cc", name = "Ib", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!cc", name = "Cb", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!cc", name = "Jb", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!cc", name = "zb", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!cc", name = "Eb", descriptor = "Lfa;")
    private class52 field494;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "Ldd;")
    private static class35 field474 = class180.method1196((byte) 126, "Your account is already logged in)3");

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "[J")
    public static long[] field464 = new long[32];

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "Ldd;")
    public static class35 field482 = field474;

    @OriginalMember(owner = "client!cc", name = "ub", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!cc", name = "wb", descriptor = "[I")
    public static int[] field486 = new int[1000];

    @OriginalMember(owner = "client!cc", name = "xb", descriptor = "Ldd;")
    public static class35 field487 = class180.method1196((byte) 127, "nav");

    @OriginalMember(owner = "client!cc", name = "Fb", descriptor = "Ldd;")
    private static class35 field495 = class180.method1196((byte) -13, "level)2");

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "Ldd;")
    public static class35 field466 = field495;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "B")
    public static byte field470;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "D")
    private double field463;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "D")
    public double field465;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "D")
    public double field467;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "D")
    private double field469;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "D")
    private double field479;

    @OriginalMember(owner = "client!cc", name = "yb", descriptor = "D")
    public double field488;

    @OriginalMember(owner = "client!cc", name = "Ab", descriptor = "D")
    private double field490;

    @OriginalMember(owner = "client!cc", name = "Bb", descriptor = "D")
    private double field491;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cc", name = "Hb", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!cc", name = "Lb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!cc", name = "Db", descriptor = "Lsd;")
    public static class174 field493;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
    public static void method202(byte arg0) {
        field493 = null;
        field487 = null;
        field482 = null;
        int var1 = 23 % ((arg0 + 57) / 58);
        field464 = null;
        field495 = null;
        field486 = null;
        field474 = null;
        field466 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)Lnf;")
    public static final class131 method203(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1218; var4++) {
            class131 var5 = var3.field1225[var4];
            if ((var5.field2822 >> 29 & 0x3L) == 2L && var5.field2816 == arg1 && var5.field2812 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
    public final void method204(int arg0, int arg1) {
        this.field465 += (double) arg1 * this.field479;
        this.field467 += (double) arg1 * this.field463;
        this.field500 = true;
        this.field488 += this.field490 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field491;
        field501++;
        this.field491 += (double) arg1 * this.field490;
        this.field497 = (int) (Math.atan2(this.field463, this.field479) * 325.949D) + 1024 & 0x7FF;
        this.field462 = (int) (Math.atan2(this.field491, this.field469) * 325.949D) & 0x7FF;
        if (this.field494 != null) {
            this.field496 += arg1;
            label30: while (true) {
                do {
                    do {
                        if (this.field494.field1159[this.field485] >= this.field496) {
                            break label30;
                        }
                        this.field496 -= this.field494.field1159[this.field485];
                        this.field485++;
                    } while (this.field485 < this.field494.field1184.length);
                    this.field485 -= this.field494.field1185;
                } while (this.field485 >= 0 && this.field485 < this.field494.field1184.length);
                this.field485 = 0;
            }
        }
        if (arg0 > -124) {
            this.field471 = 2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)Lia;")
    public final class81 method205(byte arg0) {
        field473++;
        class17 var2 = class48.method434(46, this.field468);
        class81 var3 = var2.method151(this.field485, arg0);
        if (var3 == null) {
            return null;
        } else {
            var3.method610(this.field462);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
    public static final void method206(int arg0, int arg1, int arg2) {
        field475++;
        if (arg1 != -26100) {
            return;
        }
        class89[] var3 = class162.field3297;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class89 var5 = var3[var4];
            if (var5 != null && var5.field1994 == 2) {
                class187.method1240(true, var5.field1995 * 2, (var5.field1991 - class172.field3444 << 7) + var5.field1990, (var5.field1987 - class67.field1552 << 7) + var5.field1993);
                if (class73.field1747 > -1 && class89.field1988 % 20 < 10) {
                    class205.field4076[var5.field1981].method115(arg0 + class73.field1747 - 12, class35.field738 + arg2 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field481++;
        if (!this.field500) {
            double var6 = (double) (arg2 - this.field483);
            double var8 = (double) (arg3 - this.field492);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field488 = this.field480;
            this.field467 = (double) this.field478 * var6 / var10 + (double) this.field483;
            this.field465 = (double) this.field478 * var8 / var10 + (double) this.field492;
        }
        double var12 = (double) (this.field471 - arg1 - arg0);
        this.field479 = ((double) arg3 - this.field465) / var12;
        this.field463 = ((double) arg2 - this.field467) / var12;
        this.field469 = Math.sqrt(this.field479 * this.field479 + this.field463 * this.field463);
        if (!this.field500) {
            this.field491 = -this.field469 * Math.tan((double) this.field498 * 0.02454369D);
        }
        this.field490 = ((double) arg4 - this.field488 - this.field491 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V")
    public static final void method208(byte arg0) {
        field472++;
        int var1 = class113.field2533;
        int var2 = class97.field2146;
        int var3 = class57.field1436;
        int var4 = class183.field3767;
        int var5 = 6116423;
        class140.method970(var2, var1, var3, var4, var5);
        if (arg0 != 37) {
            field486 = null;
        }
        class140.method970(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class140.method959(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class122.field2673.method1322(class61.field1504, var2 + 3, var1 + 14, var5, -1);
        int var6 = class17.field329;
        int var7 = class98.field2168;
        for (int var8 = 0; var8 < class59.field1469; var8++) {
            int var9 = (class59.field1469 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var2 < var6 && var6 < var2 + var3 && var9 - 13 < var7 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class122.field2673.method1322(class110.method805(0, var8), var2 + 3, var9, var10, 0);
        }
        class70.method565(-17803, class183.field3767, class97.field2146, class57.field1436, class113.field2533);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field498 = arg7;
        this.field476 = arg5;
        this.field468 = arg0;
        this.field477 = arg9;
        this.field492 = arg3;
        this.field483 = arg2;
        this.field480 = arg4;
        this.field500 = false;
        this.field478 = arg8;
        this.field499 = arg10;
        this.field489 = arg1;
        this.field471 = arg6;
        int var12 = class48.method434(-119, this.field468).field326;
        if (var12 == -1) {
            this.field494 = null;
        } else {
            this.field494 = class160.method1070((byte) -27, var12);
        }
    }
}
