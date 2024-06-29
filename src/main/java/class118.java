import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class118 {

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    private int field2838 = 0;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "[Lcb;")
    private class17[] field2833;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lmb;")
    private static class84 field2808 = class79.method672(true, "Loaded title screen");

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lmb;")
    public static class84 field2807 = class79.method672(true, "(Y");

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lmb;")
    private static class84 field2816 = class79.method672(true, "Loading fonts )2 ");

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lmb;")
    private static class84 field2820 = class79.method672(true, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lmb;")
    public static class84 field2817 = field2816;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lmb;")
    private static class84 field2819 = class79.method672(true, "Trade)4compete");

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lmb;")
    private static class84 field2814 = class79.method672(true, "Please try using a different world)3");

    @OriginalMember(owner = "client!s", name = "w", descriptor = "Lmb;")
    public static class84 field2828 = field2820;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lmb;")
    public static class84 field2806 = field2814;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field2822 = -1;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Lmb;")
    public static class84 field2831 = field2814;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lmb;")
    public static class84 field2810 = field2814;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "[I")
    public static int[] field2826 = new int[5];

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lmb;")
    public static class84 field2836 = field2814;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2827 = 0;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "Lmb;")
    public static class84 field2837 = field2808;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Lmb;")
    public static class84 field2834 = field2819;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lmb;")
    public static class84 field2813 = field2814;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lmb;")
    public static class84 field2830 = field2814;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lmb;")
    public static class84 field2815 = class79.method672(true, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "J")
    private long field2829;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Lcb;")
    private class17 field2835;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Lcb;")
    private class17 field2839;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "[I")
    public static int[] field2832;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method955(byte arg0) {
        field2817 = null;
        field2806 = null;
        field2814 = null;
        field2837 = null;
        field2836 = null;
        field2808 = null;
        field2826 = null;
        field2813 = null;
        field2816 = null;
        field2807 = null;
        field2830 = null;
        field2831 = null;
        field2834 = null;
        field2815 = null;
        if (arg0 != -5) {
            return;
        }
        field2832 = null;
        field2820 = null;
        field2810 = null;
        field2819 = null;
        field2828 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lcb;")
    public final class17 method956(int arg0) {
        if (arg0 != -1) {
            field2806 = null;
        }
        field2809++;
        if (this.field2838 > 0 && this.field2833[this.field2838 - 1] != this.field2839) {
            class17 var2 = this.field2839;
            this.field2839 = var2.field369;
            return var2;
        }
        while (this.field2811 > this.field2838) {
            class17 var3 = this.field2833[this.field2838++].field369;
            if (this.field2833[this.field2838 - 1] != var3) {
                this.field2839 = var3.field369;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lcb;")
    public final class17 method957(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field2812++;
        if (this.field2835 == null) {
            return null;
        }
        class17 var2 = this.field2833[(int) (this.field2829 & (long) (this.field2811 - 1))];
        while (this.field2835 != var2) {
            if (this.field2835.field370 == this.field2829) {
                class17 var3 = this.field2835;
                this.field2835 = this.field2835.field369;
                return var3;
            }
            this.field2835 = this.field2835.field369;
        }
        this.field2835 = null;
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JLcb;I)V")
    public final void method958(long arg0, class17 arg1, int arg2) {
        field2823++;
        if (arg1.field382 != null) {
            arg1.method121(false);
        }
        class17 var5 = this.field2833[(int) (arg0 & (long) (this.field2811 - 1))];
        arg1.field369 = var5;
        arg1.field370 = arg0;
        arg1.field382 = var5.field382;
        int var6 = 106 % ((46 - arg2) / 54);
        arg1.field382.field369 = arg1;
        arg1.field369.field382 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZJ)Lcb;")
    public final class17 method959(boolean arg0, long arg1) {
        field2825++;
        this.field2829 = arg1;
        class17 var4 = this.field2833[(int) (arg1 & (long) (this.field2811 - 1))];
        for (this.field2835 = var4.field369; this.field2835 != var4; this.field2835 = this.field2835.field369) {
            if (this.field2835.field370 == arg1) {
                class17 var5 = this.field2835;
                this.field2835 = this.field2835.field369;
                return var5;
            }
        }
        if (!arg0) {
            field2819 = null;
        }
        this.field2835 = null;
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
    public static final void method960(int arg0, boolean arg1) {
        field2824++;
        if (class40.field925.field3549 >> 7 == class1.field15 && class40.field925.field3535 >> 7 == class40.field919) {
            class1.field15 = 0;
        }
        if (arg0 != 19450) {
            field2837 = null;
        }
        int var2 = class71.field1746;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class62 var4;
            int var5;
            if (arg1) {
                var4 = class40.field925;
                var5 = 33538048;
            } else {
                var4 = class44.field978[class80.field1990[var3]];
                var5 = class80.field1990[var3] << 14;
            }
            if (var4 != null && var4.method569((byte) -94)) {
                var4.field1524 = false;
                int var6 = var4.field3535 >> 7;
                if ((class124.field3012 && class71.field1746 > 50 || class71.field1746 > 200) && !arg1 && var4.field3546 == var4.field3537) {
                    var4.field1524 = true;
                }
                int var7 = var4.field3549 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field1537 == null || var4.field1520 > class5.field100 || var4.field1538 <= class5.field100) {
                        if ((var4.field3549 & 0x7F) == 64 && (var4.field3535 & 0x7F) == 64) {
                            if (class64.field1587[var7][var6] == class20.field416) {
                                continue;
                            }
                            class64.field1587[var7][var6] = class20.field416;
                        }
                        var4.field1521 = class41.method309((byte) 64, var4.field3549, var4.field3535, class13.field251);
                        class133.field3173.method494(class13.field251, var4.field3549, var4.field3535, var4.field1521, 60, var4, var4.field3521, var5, var4.field3544);
                    } else {
                        var4.field1524 = false;
                        var4.field1521 = class41.method309((byte) 64, var4.field3549, var4.field3535, class13.field251);
                        class133.field3173.method466(class13.field251, var4.field3549, var4.field3535, var4.field1521, 60, var4, var4.field3521, var5, var4.field1519, var4.field1523, var4.field1541, var4.field1532);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[Lmb;)Lmb;")
    public static final class84 method961(int arg0, int arg1, int arg2, class84[] arg3) {
        field2818++;
        int var4 = arg1;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class140.field3356;
            }
            var4 += arg3[arg2 + var5].field2062;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class84 var10 = arg3[arg2 + var8];
            class55.method449(var10.field2058, 0, var6, var7, var10.field2062);
            var7 += var10.field2062;
        }
        class84 var9 = new class84();
        var9.field2058 = var6;
        var9.field2062 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)Lcb;")
    public final class17 method962(boolean arg0) {
        this.field2838 = 0;
        field2821++;
        if (!arg0) {
            field2814 = null;
        }
        return this.method956(-1);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
    public class118(int arg0) {
        this.field2811 = arg0;
        this.field2833 = new class17[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class17 var3 = this.field2833[var2] = new class17();
            var3.field382 = var3;
            var3.field369 = var3;
        }
    }
}
