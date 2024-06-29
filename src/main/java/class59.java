import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class59 {

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
    public int[] field914;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[Lvo;")
    public class22[] field922;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Z")
    public static boolean field927 = true;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field925 = -1;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lrn;")
    public static class18 field924;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 6)
    public static final void method579(int arg0) {
        class356.field5663.method655(-1);
        if (arg0 != 2) {
            method579(25);
        }
        class327.field5023.method655(-1);
        field918++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lia;Lia;I)V", line = 18)
    public static final void method580(class320 arg0, class320 arg1, int arg2) {
        field921++;
        if (arg0.field4928 != null) {
            arg0.method2262((byte) -102);
        }
        arg0.field4928 = arg1;
        if (arg2 != 2) {
            method584(-111, -111, -109, -116, 10, false, 45, -101);
        }
        arg0.field4934 = arg1.field4934;
        arg0.field4928.field4934 = arg0;
        arg0.field4934.field4928 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V", line = 42)
    public static void method581(int arg0) {
        if (arg0 == 0) {
            field924 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V", line = 53)
    public static final void method582(int arg0) {
        field923++;
        int var1 = class10.field141;
        int var2 = class310.field4785;
        int var3 = class135.field2259;
        int var4 = class43.field700;
        int var5 = 6116423;
        if (class240.field3737) {
            class213.method1593(var1, var2, var4, var3, var5);
            class213.method1593(var1 + 1, var2 - -1, var4 - 2, 16, 0);
            class213.method1599(var1 + 1, var2 + 18, var4 - 2, var3 - 19, 0);
        } else {
            class60.method611(var1, var2, var4, var3, var5);
            class60.method611(var1 + 1, var2 + 1, var4 - 2, 16, 0);
            class60.method604(var1 + 1, var2 + 18, var4 - 2, var3 + -19, 0);
        }
        class64.field988.method1190(class222.field3450, var1 + 3, var2 + 14, var5, -1);
        int var6 = class78.field1129;
        if (arg0 != -2) {
            return;
        }
        int var7 = class268.field4137;
        for (int var8 = 0; var8 < class66.field1006; var8++) {
            int var9 = 16777215;
            int var10 = (class66.field1006 - var8 - 1) * 15 + var2 + 31;
            if (var7 > var1 && (var1 + var4) > var7 && (var10 - 13) < var6 && (var10 + 3) > var6) {
                var9 = 16776960;
            }
            class64.field988.method1190(class78.method720(var8, false), var1 + 3, var10, var9, 0);
        }
        class100.method874(89, class43.field700, class10.field141, class310.field4785, class135.field2259);
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V", line = 110)
    public static final void method583(int arg0) {
        if (arg0 != 0) {
            field924 = (class18) null;
        }
        field916++;
        class224.field3496.method655(arg0 - 1);
        class63.field967.method655(-1);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIZII)V", line = 128)
    public static final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field919++;
        int var8 = arg1 + arg2;
        int var9 = arg7 - arg1;
        int var10 = arg1 + arg4;
        for (int var11 = arg2; var11 < var8; var11++) {
            class283.method2059(arg6, class133.field2235[var11], (byte) 91, arg3, arg4);
        }
        if (!arg5) {
            field926 = -113;
        }
        int var12 = arg3 - arg1;
        for (int var13 = arg7; var13 > var9; var13--) {
            class283.method2059(arg6, class133.field2235[var13], (byte) 93, arg3, arg4);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class133.field2235[var14];
            class283.method2059(arg6, var15, (byte) 99, var10, arg4);
            class283.method2059(arg0, var15, (byte) 103, var12, var10);
            class283.method2059(arg6, var15, (byte) 125, arg3, var12);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V", line = 174)
    public class59(int arg0) {
        this.field920 = arg0;
        this.field914 = new int[this.field920];
        this.field922 = new class22[this.field920];
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLoj;ZIZIIIB)Lho;", line = 194)
    public static final class215 method585(boolean arg0, class207 arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte arg8) {
        class263 var9 = class48.method469(10, arg3);
        if (arg5 > 1 && var9.field4024 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field4080[var11] <= arg5 && var9.field4080[var11] != 0) {
                    var10 = var9.field4024[var11];
                }
            }
            if (var10 != -1) {
                var9 = class48.method469(10, var10);
            }
        }
        field917++;
        class124 var12 = var9.method1939(true, arg1);
        if (var12 == null) {
            return null;
        }
        class361 var13 = null;
        if (var9.field4062 != -1) {
            var13 = (class361) method585(true, arg1, false, var9.field4023, true, 10, 1, 0, (byte) -104);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field4094 != -1) {
            var13 = (class361) method585(false, arg1, false, var9.field4048, true, arg5, arg6, arg7, (byte) -104);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class60.field928;
        int var15 = class60.field930;
        int var16 = class60.field933;
        int[] var17 = new int[4];
        class60.method588(var17);
        if (arg8 != -104) {
            method585(false, (class207) null, true, 62, false, -74, 19, -98, (byte) -82);
        }
        class361 var18 = new class361(36, 32);
        class60.method595(var18.field5720, 36, 32);
        class107.method923();
        class107.method920(16, 16);
        class107.field1618 = false;
        int var19 = var9.field4032;
        if (arg0) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg6 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class107.field1604[var9.field4061] * var19 >> 16;
        int var21 = class107.field1605[var9.field4061] * var19 >> 16;
        var12.method490(0, var9.field4089, var9.field4068, var9.field4061, var9.field4028, var9.field4025 + var20 - (var12.method21() / 2), var9.field4025 + var21, -1L);
        if (arg6 >= 1) {
            var18.method2540(1);
            if (arg6 >= 2) {
                var18.method2540(16777215);
            }
            class60.method595(var18.field5720, 36, 32);
        }
        if (arg7 != 0) {
            var18.method2533(arg7);
        }
        if (var9.field4062 != -1) {
            var13.method17(0, 0);
        } else if (var9.field4094 != -1) {
            class60.method595(var13.field5720, 36, 32);
            var18.method17(0, 0);
            var18 = var13;
        }
        if (arg2 && (var9.field4030 == 1 || arg5 != 1) && arg5 != -1) {
            class356.field5675.method1190(class191.method1457(-100001, arg5), 0, 9, 16776960, 1);
        }
        class60.method595(var14, var16, var15);
        class60.method590(var17);
        class107.method923();
        class107.field1618 = true;
        return class240.field3737 && !arg4 ? new class2(var18) : var18;
    }
}
