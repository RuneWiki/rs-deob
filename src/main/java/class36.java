import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class36 extends class270 {

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
    private int field491 = 3072;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    private int field483 = 1024;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
    private int field493 = 2048;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "Lmh;")
    public static class62 field478 = class201.method1405(true, "<col=00ff00>");

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "Lmh;")
    public static class62 field477 = class201.method1405(true, "leuchten3:");

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lmh;")
    public static class62 field485 = class201.method1405(true, "VOLL");

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field476 = 1;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "Lmh;")
    public static class62 field495 = class201.method1405(true, "rot:");

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lmh;")
    public static class62 field488 = class201.method1405(true, "Fps:");

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "Lsk;")
    public static class199 field496 = new class199(64);

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "Lsk;")
    public static class199 field498 = new class199(30);

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "Lhh;")
    public static class294 field499;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "Ljava/lang/String;")
    public static String field474;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(B)V", line = 6)
    public final void method231(byte arg0) {
        this.field493 = this.field491 - this.field483;
        field487++;
        if (arg0 != 90) {
            field485 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I", line = 18)
    public final int[] method6(int arg0, int arg1) {
        field484++;
        if (arg0 != 18693) {
            this.method231((byte) -29);
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, arg1);
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                var3[var5] = (var4[var5] * this.field493 >> 12) + this.field483;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 63)
    public static void method232(boolean arg0) {
        field477 = null;
        field488 = null;
        field498 = null;
        field495 = null;
        if (!arg0) {
            method233((class92) null, (byte) 62);
        }
        field474 = null;
        field496 = null;
        field499 = null;
        field478 = null;
        field485 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 80)
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lmi;B)Lmh;", line = 85)
    public static final class62 method233(class92 arg0, byte arg1) {
        if (arg1 > -28) {
            return (class62) null;
        } else {
            field489++;
            return class46.method299(arg0, 54, 32767);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V", line = 101)
    public static final void method234(int arg0) {
        int var1 = class206.field3498;
        field490++;
        int var2 = class162.field2632;
        int var3 = class250.field4246;
        int var4 = class276.field4751;
        int var5 = 6116423;
        class311.method2117(var1, var2, var3, var4, var5);
        class311.method2117(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class311.method2115(var1 + 1, var2 - -18, var3 - 2, var4 + -19, 0);
        class296.field5047.method2021(class57.field837, arg0 + var1, var2 - -14, var5, -1);
        int var6 = class221.field3795;
        int var7 = class275.field4725;
        for (int var8 = 0; var8 < class195.field3293; var8++) {
            int var9 = (class195.field3293 - var8 - 1) * 15 + (var2 + 31);
            int var10 = 16777215;
            if (var1 < var7 && var7 < var1 + var3 && var6 > var9 - 13 && var6 < (var9 + 3)) {
                var10 = 16776960;
            }
            class296.field5047.method2021(class2.method14(var8, true), var1 + 3, var9, var10, 0);
        }
        class173.method1234(0, class206.field3498, class162.field2632, class250.field4246, class276.field4751);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lhi;B)V", line = 148)
    public static final void method235(class26 arg0, byte arg1) {
        field482++;
        if (class214.field3637) {
            return;
        }
        class311.method2114();
        class4.field43 = class155.method1147(class184.field2954, arg0, false);
        int var2 = class60.field878;
        int var3 = var2 * 956 / 503;
        if (arg1 >= 29) {
            class4.field43.method644((class306.field5258 - var3) / 2, 0, var3, var2);
            class272.field4630 = class199.method1388(-27057, class256.field4321, arg0);
            class272.field4630.method124(class306.field5258 / 2 - (class272.field4630.field276 / 2), 18);
            class214.field3637 = true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)[[I", line = 174)
    public final int[][] method11(boolean arg0, int arg1) {
        field494++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (arg0) {
            this.method8((class92) null, -102, 95);
        }
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class109.field1770; var11++) {
                var7[var11] = this.field483 + (var5[var11] * this.field493 >> 12);
                var10[var11] = (var6[var11] * this.field493 >> 12) + this.field483;
                var9[var11] = (var8[var11] * this.field493 >> 12) + this.field483;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)V", line = 241)
    public static final void method236(int arg0, int arg1, int arg2) {
        field475++;
        class222.field3877[arg0] = arg2;
        class176 var3 = (class176) class269.field4567.method311((byte) 114, (long) arg0);
        if (var3 == null) {
            class176 var4 = new class176(class293.method1985((byte) -71) + 500L);
            class269.field4567.method309(var4, (long) arg0, 1);
        } else {
            var3.field2822 = class293.method1985((byte) -71) + 500L;
        }
        if (arg1 < 33) {
            method235((class26) null, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 277)
    public static final void method237(int arg0) {
        if (arg0 != -1) {
            field477 = (class62) null;
        }
        if (class218.field3769 == 2) {
            if (class45.field678 == class2.field25 && class155.field2501 == class113.field1883) {
                class218.field3769 = 0;
                class131.method961(class195.field3293 - 1, Integer.MAX_VALUE);
            }
        } else if (class45.field678 == class171.field2786 && class207.field3520 == class113.field1883) {
            class218.field3769 = 0;
            class131.method961(class195.field3293 - 1, Integer.MAX_VALUE);
        } else {
            class155.field2501 = class207.field3520;
            class218.field3769 = 2;
            class2.field25 = class171.field2786;
        }
        field486++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lmi;II)V", line = 349)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = -77 % ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field483 = arg0.method721(104);
        } else if (arg1 == 1) {
            this.field491 = arg0.method721(120);
        } else if (arg1 == 2) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        field481++;
    }
}
