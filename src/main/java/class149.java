import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class149 extends class152 {

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[J")
    private long[] field2450 = new long[10];

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    private int field2452 = 256;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    private int field2451 = 0;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    private int field2438 = 1;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "J")
    private long field2434 = class205.method1451(-12);

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Ltl;")
    public static class59 field2449 = class85.method639("Lade Wordpack )2 ", 9588);

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Lgb;")
    public static class212 field2453 = new class212(64);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    private int field2446;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lme;")
    public static class295 field2442;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Lme;")
    public static class295 field2448;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I", line = 5)
    public final int method804(int arg0, int arg1, int arg2) {
        field2435++;
        int var4 = this.field2452;
        int var5 = this.field2438;
        this.field2438 = 1;
        this.field2452 = 300;
        this.field2434 = class205.method1451(74);
        if (this.field2450[this.field2446] == 0L) {
            this.field2452 = var4;
            this.field2438 = var5;
        } else if (this.field2450[this.field2446] < this.field2434) {
            this.field2452 = (int) ((long) (arg0 * 2560) / (this.field2434 - this.field2450[this.field2446]));
        }
        if (arg2 != -31130) {
            field2453 = (class212) null;
        }
        if (this.field2452 < 25) {
            this.field2452 = 25;
        }
        if (this.field2452 > 256) {
            this.field2452 = 256;
            this.field2438 = (int) ((long) arg0 - ((this.field2434 - this.field2450[this.field2446]) / 10L));
        }
        if (this.field2438 > arg0) {
            this.field2438 = arg0;
        }
        this.field2450[this.field2446] = this.field2434;
        this.field2446 = (this.field2446 + 1) % 10;
        if (this.field2438 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2450[var6] != 0L) {
                    this.field2450[var6] += (long) this.field2438;
                }
            }
        }
        if (arg1 > this.field2438) {
            this.field2438 = arg1;
        }
        int var7 = 0;
        class183.method1360(false, (long) this.field2438);
        while (this.field2451 < 256) {
            var7++;
            this.field2451 += this.field2452;
        }
        this.field2451 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Z", line = 86)
    public static final boolean method1073(int arg0) {
        field2436++;
        if (class155.field2542) {
            try {
                class60.field944.method461(class308.field5222.field2870, -8660);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 17748) {
            field2453 = (class212) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V", line = 107)
    public static void method1074(int arg0) {
        if (arg0 >= 103) {
            field2448 = null;
            field2449 = null;
            field2453 = null;
            field2442 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V", line = 126)
    public static final void method1075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = arg0;
        field2437++;
        int var8 = arg2 * arg2;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var8 << 2;
        int var15 = var9 - (var12 - 1) * var11;
        int var16 = -6 % ((arg1 + 50) / 35);
        int var17 = var9 << 2;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var17;
        int var20 = ((var6 << 1) + 3) * var10;
        if (class28.field369 <= arg5 && arg5 <= class62.field957) {
            int var21 = class262.method1808(arg2 + arg4, class69.field1061, 0, class153.field2504);
            int var22 = class262.method1808(arg4 - arg2, class69.field1061, 0, class153.field2504);
            class174.method1283(7, arg3, class163.field2662[arg5], var22, var21);
        }
        int var23 = (arg0 - 1) * var14;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var19;
                    var19 += var17;
                    var13 += var20;
                    var6++;
                    var20 += var17;
                }
            }
            var7--;
            if (var15 < 0) {
                var6++;
                var13 += var20;
                var20 += var17;
                var15 += var19;
                var19 += var17;
            }
            int var24 = arg5 - var7;
            var13 += -var23;
            var15 += -var18;
            var18 -= var14;
            var23 -= var14;
            int var25 = arg5 + var7;
            if (var25 >= class28.field369 && var24 <= class62.field957) {
                int var26 = class262.method1808(arg4 + var6, class69.field1061, 0, class153.field2504);
                int var27 = class262.method1808(arg4 - var6, class69.field1061, 0, class153.field2504);
                if (var24 >= class28.field369) {
                    class174.method1283(7, arg3, class163.field2662[var24], var27, var26);
                }
                if (var25 <= class62.field957) {
                    class174.method1283(7, arg3, class163.field2662[var25], var27, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lme;Lme;BLme;Lme;)V", line = 237)
    public static final void method1076(class295 arg0, class295 arg1, byte arg2, class295 arg3, class295 arg4) {
        field2445++;
        class114.field1838 = arg1;
        class219.field3560 = arg4;
        class53.field789 = arg3;
        if (arg2 != 93) {
            method1075(-11, 125, -10, 95, -128, -58);
        }
        class179.field2938 = arg0;
        class239.field3986 = new class263[class219.field3560.method2048(-23643)][];
        class314.field5317 = new boolean[class219.field3560.method2048(arg2 ^ 0xFFFFA3F8)];
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 257)
    public static final void method1077(int arg0) {
        field2440++;
        class232.field3823 = null;
        class308.field5236 = null;
        int var1 = 29 % ((arg0 + 63) / 50);
        class233.field3846 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)I", line = 269)
    public static final int method1078(byte arg0) {
        if (arg0 > -105) {
            return -84;
        } else {
            field2447++;
            return class111.field1813 == 0 ? 0 : class275.field4729[class111.field1813].method14();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 296)
    public final void method805(int arg0) {
        field2439++;
        if (arg0 != -6838) {
            method1079(true, (byte) -44);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2450[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZB)V", line = 320)
    public static final void method1079(boolean arg0, byte arg1) {
        field2441++;
        if (class133.field2212 == arg0) {
            return;
        }
        if (arg1 >= -64) {
            field2449 = (class59) null;
        }
        class133.field2212 = arg0;
        class275.method1921(true);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 345)
    public class149() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2450[var1] = this.field2434;
        }
    }
}
