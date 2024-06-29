import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class292 extends class219 {

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Lqb;")
    public static class209 field4911 = new class209(64);

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Lbd;")
    public static class162 field4919 = class17.method142(0, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "[I")
    public static int[] field4917 = new int[32];

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Lbd;")
    public static class162 field4918 = class17.method142(0, "Fertigkeit: ");

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lbd;")
    public static class162 field4921 = class17.method142(0, "<col=40ff00>");

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Lli;")
    public static class18 field4920 = new class18();

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Lbd;")
    public static class162 field4923 = class17.method142(0, "Untersuchen");

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Lbd;")
    public static class162 field4922 = class17.method142(0, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lbd;")
    private static class162 field4926 = class17.method142(0, "wave:");

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "Lbd;")
    public static class162 field4924 = field4926;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lbd;")
    public static class162 field4925 = field4926;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 3)
    public class292() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILb;)V", line = 7)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            method2019(true);
        }
        if (arg0 == 0) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        field4909++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)I", line = 20)
    public static final int method2019(boolean arg0) {
        field4916++;
        if (arg0) {
            method2022((byte) 91);
        }
        return 6;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V", line = 35)
    public static void method2020(byte arg0) {
        field4924 = null;
        if (arg0 != -106) {
            field4925 = (class162) null;
        }
        field4925 = null;
        field4921 = null;
        field4920 = null;
        field4917 = null;
        field4911 = null;
        field4922 = null;
        field4926 = null;
        field4923 = null;
        field4918 = null;
        field4919 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[I", line = 57)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            this.method41(false, 103);
        }
        field4910++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, arg1, -6606);
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)V", line = 98)
    public static final void method2021(int arg0, byte arg1) {
        field4914++;
        int var2 = 70 % ((-arg1 - 40) / 47);
        class63 var3 = class46.method332(8, arg0, -12770);
        var3.method427(-22507);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[[I", line = 118)
    public final int[][] method219(int arg0, byte arg1) {
        field4912++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(arg0, true, 0);
            int[] var5 = var4[1];
            int[] var6 = var3[1];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class128.field2326; var11++) {
                var10[var11] = 4096 - var8[var11];
                var6[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var7[var11];
            }
        }
        if (arg1 != 83) {
            this.method219(-45, (byte) 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)V", line = 176)
    public static final void method2022(byte arg0) {
        class265.field4414 &= 0x7FF;
        if (class160.field2803 < 128) {
            class160.field2803 = 128;
        }
        if (class160.field2803 > 383) {
            class160.field2803 = 383;
        }
        int var1 = 85 % ((arg0 - 29) / 56);
        int var2 = class88.field1566 >> 7;
        field4915++;
        int var3 = class280.field4727 >> 7;
        int var4 = class3.method15(class88.field1566, class157.field2765, class280.field4727, false);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = class157.field2765;
                    if (var8 < 3 && (class213.field3580[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class206.field3473[var8][var6][var7];
                    if (var9 > var5) {
                        var5 = var9;
                    }
                }
            }
        }
        int var10 = var5 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > class178.field3049) {
            class178.field3049 += (var10 - class178.field3049) / 24;
        } else if (class178.field3049 > var10) {
            class178.field3049 += (var10 - class178.field3049) / 80;
        }
    }
}
