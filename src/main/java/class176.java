import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class176 extends class320 {

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "Lwg;")
    public class337 field2777;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "[I")
    public static int[] field2778 = new int[25];

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field2782 = 99;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "F")
    public static float field2780;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)[Lkk;", line = 6)
    public static final class77[] method1371(byte arg0) {
        int var1 = 108 % ((-arg0 - 50) / 41);
        field2774++;
        class77[] var2 = new class77[class9.field132];
        for (int var3 = 0; var3 < class9.field132; var3++) {
            var2[var3] = new class77(class280.field4332, class49.field776, class150.field2449[var3], class89.field1262[var3], class358.field5694[var3], class62.field957[var3], class172.field2732[var3], class38.field582);
        }
        class29.method330(-1);
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method1372(boolean arg0) {
        if (!arg0) {
            method1376(-23, -111, -31, -21, 108, (class160) null);
        }
        for (class76 var1 = (class76) class356.field5668.method2244((byte) -128); var1 != null; var1 = (class76) class356.field5668.method2241(-1)) {
            class3 var2 = var1.field1122;
            if (class119.field1826 != var2.field26 || var2.field19) {
                var1.method1357(947647010);
            } else if (class360.field5718 >= var2.field35) {
                var2.method28(class247.field3840, (byte) 24);
                if (var2.field19) {
                    var1.method1357(947647010);
                } else {
                    class276.method2028(var2.field26, var2.field31, var2.field22, var2.field34, 60, var2, 0, -1L, false);
                }
            }
        }
        field2775++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 64)
    public static final void method1373(boolean arg0, int arg1) {
        byte[][] var2;
        if (class240.field3737 && arg0) {
            var2 = class46.field738;
        } else {
            var2 = class22.field336;
        }
        field2773++;
        int var3 = class37.field570.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class292.field4540[var4] >> 8) * 64 - class358.field5696;
                int var7 = (class292.field4540[var4] & 0xFF) * 64 - class49.field755;
                class102.method886(true);
                class335.method2355(arg0, var5, 16884, class57.field905, var7, var6);
            }
        }
        if (arg1 != 25863) {
            method1376(-85, 9, 29, 70, -47, (class160) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V", line = 103)
    public static void method1374(int arg0) {
        field2778 = null;
        if (arg0 != 0) {
            field2778 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIILf;II)Z", line = 115)
    public static final boolean method1375(int arg0, int arg1, int arg2, int arg3, class212 arg4, int arg5, int arg6) {
        field2781++;
        int var7 = -32 / ((-arg5 - 1) / 46);
        class178 var8 = class25.method251(arg4.field3292, 34);
        if (var8.field2809 == -1) {
            return true;
        }
        int var9;
        if (arg4.field3251) {
            int var10 = arg4.field3312 + arg3;
            var9 = var10 & 0x3;
        } else {
            var9 = 0;
        }
        class77 var11 = var8.method1389(arg4.field3259, (byte) 74, var9);
        if (var11 == null) {
            return false;
        }
        int var12 = arg4.field3306;
        int var13 = var11.field3832;
        int var14 = arg4.field3250;
        if ((var9 & 0x1) == 1) {
            var14 = arg4.field3306;
            var12 = arg4.field3250;
        }
        int var15 = var11.field3825;
        if (var8.field2804) {
            var15 = var14 * 4;
            var13 = var12 * 4;
        }
        if (var8.field2806 == 0) {
            var11.method709(arg2 * 4 + 48, (-arg0 + 104 + -var14) * 4 + 48, var13, var15);
        } else {
            var11.method702(arg2 * 4 + 48, (-arg0 + 104 + -var14) * 4 + 48, var13, var15, var8.field2806);
        }
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIILlk;)V", line = 175)
    public static final void method1376(int arg0, int arg1, int arg2, int arg3, int arg4, class160 arg5) {
        field2776++;
        if (arg5.field2547 == -1 && arg5.field2544 == null) {
            return;
        }
        int var6 = 0;
        if (arg5.field2555 < arg4) {
            var6 += arg4 - arg5.field2555;
        } else if (arg5.field2556 > arg4) {
            var6 += arg5.field2556 - arg4;
        }
        int var7 = class287.field4454 * arg5.field2552 >> 8;
        if (arg0 != 100) {
            method1373(false, 69);
        }
        if (arg5.field2560 < arg1) {
            var6 += arg1 - arg5.field2560;
        } else if (arg1 < arg5.field2564) {
            var6 += arg5.field2564 - arg1;
        }
        if (arg5.field2559 == 0 || var6 - 64 > arg5.field2559 || class287.field4454 == 0 || arg5.field2540 != arg2) {
            if (arg5.field2563 != null) {
                class19.field316.method109(arg5.field2563);
                arg5.field2563 = null;
            }
            if (arg5.field2546 != null) {
                class19.field316.method109(arg5.field2546);
                arg5.field2546 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg5.field2559 - var6) * var7 / arg5.field2559;
        if (arg5.field2563 != null) {
            arg5.field2563.method78(var8);
        } else if (arg5.field2547 >= 0) {
            class251 var9 = class251.method1866(class239.field3701, arg5.field2547, 0);
            if (var9 != null) {
                class225 var10 = var9.method1865().method1686(class234.field3647);
                class7 var11 = class7.method91(var10, 100, var8);
                var11.method73(-1);
                class19.field316.method107(var11);
                arg5.field2563 = var11;
            }
        }
        if (arg5.field2546 != null) {
            arg5.field2546.method78(var8);
            if (!arg5.field2546.method1360(-2)) {
                arg5.field2546 = null;
            }
        } else if (arg5.field2544 != null && (arg5.field2545 -= arg3) <= 0) {
            int var12 = (int) (Math.random() * (double) arg5.field2544.length);
            class251 var13 = class251.method1866(class239.field3701, arg5.field2544[var12], 0);
            if (var13 != null) {
                class225 var14 = var13.method1865().method1686(class234.field3647);
                class7 var15 = class7.method91(var14, 100, var8);
                var15.method73(0);
                class19.field316.method107(var15);
                arg5.field2545 = (int) (Math.random() * (double) (arg5.field2562 - arg5.field2567)) + arg5.field2567;
                arg5.field2546 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lwg;)V", line = 300)
    public class176(class337 arg0) {
        this.field2777 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V", line = 312)
    public static final void method1377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -28139) {
            method1377(-30, 81, 68, -124, -32, 100);
        }
        field2779++;
        if (arg1 == arg2) {
            class63.method630(arg5, arg3, arg2, (byte) -77, arg4);
        } else if (class43.field693 <= (arg5 - arg2) && class128.field2130 >= (arg2 + arg5) && class328.field5042 <= arg3 - arg1 && class284.field4385 >= (arg1 + arg3)) {
            class231.method1731(arg4, arg0 + 538051436, arg2, arg3, arg5, arg1);
        } else {
            class311.method2210(arg1, arg5, arg3, false, arg4, arg2);
        }
    }
}
