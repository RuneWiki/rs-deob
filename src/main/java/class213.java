import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class213 extends class177 {

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "Z")
    public static boolean field3386 = false;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "Z")
    public static boolean field3387 = true;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Lsa;")
    public static class109 field3383;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Lem;")
    public static class11 field3390;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "[Lvd;")
    public static class134[] field3382;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "[Lq;")
    public static class96[] field3389;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[I", line = 10)
    public final int[] method95(int arg0, int arg1) {
        field3391++;
        if (arg0 > -52) {
            method1537(-15, -5);
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -76);
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 0, false);
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 41)
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V", line = 46)
    public static final void method1536(int arg0, int arg1) {
        if (class41.field616 == 0) {
            field3383.method841(-6260, arg0);
        } else {
            class96.field1428 = arg0;
        }
        if (arg1 != 4096) {
            field3387 = true;
        }
        field3377++;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(II)V", line = 64)
    public static final void method1537(int arg0, int arg1) {
        field3376++;
        class6.field62--;
        if (class6.field62 == arg0) {
            return;
        }
        class151.method1112(class27.field307, arg0 + 1, class27.field307, arg0, class6.field62 - arg0);
        class151.method1112(class271.field4097, arg0 + 1, class271.field4097, arg0, class6.field62 - arg0);
        class151.method1115(class67.field994, arg0 + 1, class67.field994, arg0, class6.field62 - arg0);
        class151.method1118(class326.field5068, arg0 + 1, class326.field5068, arg0, class6.field62 - arg0);
        class151.method1119(class86.field1267, arg0 + 1, class86.field1267, arg0, class6.field62 - arg0);
        class151.method1115(class207.field3264, arg0 - arg1, class207.field3264, arg0, class6.field62 - arg0);
        class151.method1115(class281.field4347, arg0 + 1, class281.field4347, arg0, class6.field62 - arg0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lhb;II)V", line = 84)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2649 = arg0.method273(arg1 + 83341) == 1;
        }
        field3384++;
        if (arg1 != -18061) {
            field3382 = (class134[]) null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Lia;", line = 99)
    public static final class209 method1538(int arg0) {
        field3380++;
        if (arg0 < 87) {
            field3387 = true;
        }
        try {
            return (class209) Class.forName("c").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class158();
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)[[I", line = 114)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            this.method99(-75, -101);
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        field3379++;
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, arg0, 27847);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class287.field4415; var11++) {
                var9[var11] = 4096 - var5[var11];
                var7[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var8[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V", line = 163)
    public static final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 2) {
            field3390 = (class11) null;
        }
        if (arg3 - arg1 >= class298.field4667 && (arg1 + arg3) <= class327.field5072 && class34.field432 <= (arg0 - arg1) && arg0 + arg1 <= class75.field1064) {
            class305.method2125(arg0, arg2, (byte) -111, arg3, arg1);
        } else {
            class302.method2115(arg3, arg2, arg0, false, arg1);
        }
        field3378++;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 185)
    public static void method1540(int arg0) {
        field3390 = null;
        field3389 = null;
        field3383 = null;
        if (arg0 <= 6) {
            field3387 = false;
        }
        field3382 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)V", line = 198)
    public static final void method1541(int arg0, int arg1, int arg2) {
        field3388++;
        if (arg1 != -16969) {
            method1536(-126, 58);
        }
        class147 var3 = class92.method731(-29125, arg0, 1);
        var3.method1095(118);
        var3.field2240 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIZII)V", line = 212)
    public static final void method1542(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return;
        }
        field3381++;
        if (arg2 > class75.field1064 || class34.field432 > arg1) {
            return;
        }
        boolean var6;
        if (arg4 < class298.field4667) {
            var6 = false;
            arg4 = class298.field4667;
        } else if (class327.field5072 >= arg4) {
            var6 = true;
        } else {
            var6 = false;
            arg4 = class327.field5072;
        }
        boolean var7;
        if (arg5 < class298.field4667) {
            var7 = false;
            arg5 = class298.field4667;
        } else if (arg5 > class327.field5072) {
            arg5 = class327.field5072;
            var7 = false;
        } else {
            var7 = true;
        }
        if (class34.field432 > arg2) {
            arg2 = class34.field432;
        } else {
            class138.method1047(arg0, arg4, arg5, 7, class320.field4990[arg2++]);
        }
        if (class75.field1064 < arg1) {
            arg1 = class75.field1064;
        } else {
            class138.method1047(arg0, arg4, arg5, 7, class320.field4990[arg1--]);
        }
        if (var7 && var6) {
            for (int var8 = arg2; var8 <= arg1; var8++) {
                int[] var9 = class320.field4990[var8];
                var9[arg5] = var9[arg4] = arg0;
            }
        } else if (var7) {
            for (int var11 = arg2; var11 <= arg1; var11++) {
                class320.field4990[var11][arg5] = arg0;
            }
        } else if (var6) {
            for (int var10 = arg2; var10 <= arg1; var10++) {
                class320.field4990[var10][arg4] = arg0;
            }
        }
    }
}
