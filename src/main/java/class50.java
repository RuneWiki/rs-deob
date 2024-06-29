import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class50 extends class219 {

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    private int field795 = 204;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    private int field793 = 1;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    private int field803 = 1;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "[I")
    public static int[] field799 = new int[5];

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Z")
    public static boolean field796 = false;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "Lli;")
    public static class18 field800 = new class18();

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Lbd;")
    public static class162 field804 = class17.method142(0, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "[I")
    public static int[] field807 = new int[25];

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Lda;")
    public static class143 field806;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "[Ldc;")
    public static class71[] field801;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "[Lhk;")
    public static class97[] field805;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V", line = 4)
    public static void method363(boolean arg0) {
        field799 = null;
        field804 = null;
        field805 = null;
        field801 = null;
        if (arg0) {
            field800 = null;
            field806 = null;
            field807 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILb;)V", line = 24)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field794++;
        if (arg0 == 0) {
            this.field803 = arg2.method756(915905888);
        } else if (arg0 == 1) {
            this.field793 = arg2.method756(915905888);
        } else if (arg0 == 2) {
            this.field795 = arg2.method761((byte) 108);
        }
        if (arg1 != 0) {
            this.field793 = -106;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[I", line = 83)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            method365(88, 45, -55);
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        field802++;
        if (this.field3654.field4967) {
            for (int var4 = 0; var4 < class128.field2326; var4++) {
                int var5 = class280.field4762[var4];
                int var6 = class53.field842[arg1];
                int var7 = this.field793 * var6 >> 12;
                int var8 = this.field803 * var5 >> 12;
                int var9 = var5 % (4096 / this.field803) * this.field803;
                int var10 = var6 % (4096 / this.field793) * this.field793;
                if (var10 < this.field795) {
                    for (var8 -= var7; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field795 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field795) {
                    int var11;
                    for (var11 = var8 - var7; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 171)
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V", line = 180)
    public static final void method364(int arg0) {
        field797++;
        try {
            if (class9.field105 == 1) {
                int var1 = class48.field764.method1924(true);
                if (var1 > 0 && class48.field764.method1922(true)) {
                    int var2 = var1 - class311.field5199;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class48.field764.method1925(false, var2);
                    return;
                }
                class48.field764.method1931(73);
                class48.field764.method1941((byte) -114);
                if (class34.field548 == null) {
                    class9.field105 = 0;
                } else {
                    class9.field105 = 2;
                }
                class295.field4948 = null;
                class22.field348 = null;
            }
            if (arg0 < 65) {
                method365(-28, -76, -128);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class48.field764.method1931(111);
            class22.field348 = null;
            class9.field105 = 0;
            class295.field4948 = null;
            class34.field548 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)V", line = 233)
    public static final void method365(int arg0, int arg1, int arg2) {
        field792++;
        int var3 = arg1;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class112.field2033[arg1];
        int var5 = class250.field4180[arg1];
        if (arg2 == 0) {
            class187.field3229.method338(24, (byte) 8);
            class187.field3229.method753(var3 + var3 + 3, true);
            class18.field291++;
        }
        if (arg2 == 1) {
            class262.field4379++;
            class187.field3229.method338(226, (byte) 8);
            class187.field3229.method753(var3 + var3 + 14 + 3, true);
        }
        int var6 = -30 / ((46 - arg0) / 40);
        if (arg2 == 2) {
            class187.field3229.method338(3, (byte) 8);
            class217.field3617++;
            class187.field3229.method753(var3 + var3 + 3, true);
        }
        class187.field3229.method731(-4, class178.field3052 + var4);
        class187.field3229.method753(class63.field991[82] ? 1 : 0, true);
        class187.field3229.method759(false, var5 + class258.field4294);
        class46.field727 = class250.field4180[0];
        class170.field2959 = class112.field2033[0];
        for (int var7 = 1; var7 < var3; var7++) {
            arg1--;
            class187.field3229.method753(class112.field2033[arg1] - var4, true);
            class187.field3229.method739(95, class250.field4180[arg1] - var5);
        }
    }
}
