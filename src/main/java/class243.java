import java.awt.Component;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class class243 {

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Z")
    public static boolean field3442 = false;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3443 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!un", name = "j", descriptor = "Lbj;")
    public static class131 field3449 = new class131(10);

    @OriginalMember(owner = "client!un", name = "m", descriptor = "Z")
    public static boolean field3452 = false;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Laq;")
    public static class90 field3450 = new class90();

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "[I")
    public static int[] field3447;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 6)
    public static void method1645(int arg0) {
        field3449 = null;
        field3443 = null;
        if (arg0 != 2) {
            field3452 = true;
        }
        field3447 = null;
        field3450 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIB)I", line = 19)
    public static final int method1646(int arg0, int arg1, byte arg2) {
        field3446++;
        int var3 = arg1 >>> 31;
        if (arg2 != -88) {
            method1648(64, 18, 20, 11, true, -111);
        }
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIZI)V", line = 33)
    public static final void method1648(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3440++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class29.field489 - class329.field4567) * var6 / 100 + class329.field4567;
        if (var7 < class245.field3458) {
            var7 = class245.field3458;
        } else if (class204.field2812 < var7) {
            var7 = class204.field2812;
        }
        int var8 = arg2 * 512 * var7 / (arg3 * 334);
        if (var8 < class306.field4230) {
            short var12 = class306.field4230;
            var7 = var12 * 334 * arg3 / (arg2 * 512);
            if (class204.field2812 < var7) {
                var7 = class204.field2812;
                int var13 = var7 * 512 * arg2 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg4) {
                    class64.field949.method143();
                    class64.field949.method2182(arg0, arg1, var14, -16777216, 103, arg2);
                    class64.field949.method2182(arg0 - (var14 - arg3), arg1, var14, -16777216, -76, arg2);
                }
                arg0 += var14;
                arg3 -= var14 * 2;
            }
        } else if (class275.field3832 < var8) {
            short var9 = class275.field3832;
            var7 = arg3 * 334 * var9 / (arg2 * 512);
            if (class245.field3458 > var7) {
                var7 = class245.field3458;
                int var10 = arg3 * var9 * 334 / (var7 * 512);
                int var11 = (arg2 - var10) / 2;
                if (arg4) {
                    class64.field949.method143();
                    class64.field949.method2182(arg0, arg1, arg3, -16777216, 126, var11);
                    class64.field949.method2182(arg0, arg2 + arg1 - var11, arg3, -16777216, -90, var11);
                }
                arg1 += var11;
                arg2 -= var11 * 2;
            }
        }
        class22.field402 = arg1;
        class392.field5618 = arg0;
        class371.field5226 = (short) arg2;
        if (arg5 > -103) {
            method1650(-49, -89, 54);
        }
        class362.field5014 = arg2 * var7 / 334;
        class447.field6277 = (short) arg3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZILuo;[Lhh;II[B)V", line = 130)
    public static final void method1649(boolean arg0, int arg1, class345 arg2, class67[] arg3, int arg4, int arg5, byte[] arg6) {
        field3445++;
        if (arg5 != 1) {
            field3447 = null;
        }
        class11 var7 = new class11(arg6);
        int var8 = -1;
        while (true) {
            int var9 = var7.method180(true);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method175(255);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method172((byte) 52);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = var13 + arg4;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < (class211.field2954 - 1) && (class290.field4061 - 1) > var19) {
                    class67 var20 = null;
                    if (!arg0) {
                        int var21 = var14;
                        if ((class368.field5193[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    class99.method715(-1, var16, arg0, var8, true, var14, var14, var17, arg2, var18, arg5, var19, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)I", line = 204)
    public static final int method1650(int arg0, int arg1, int arg2) {
        field3444++;
        if (arg1 < 77) {
            return -77;
        } else if (arg0 == 1 || arg0 == 3) {
            return class255.field3589[arg2 & 0x3];
        } else {
            return class183.field2499[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lco;ILbe;Luo;)V", line = 220)
    public static final void method1651(class62 arg0, int arg1, class25 arg2, class345 arg3) {
        field3441++;
        class226 var4 = arg2.method292(arg3, (byte) -77);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method600();
        if (var4.method598() > var5) {
            var5 = var4.method598();
        }
        byte var6 = 10;
        int var7 = arg0.field848;
        int var8 = arg0.field849;
        int var9 = 0;
        if (arg1 != 18129) {
            field3451 = -28;
        }
        int var10 = 0;
        int var11 = 0;
        if (arg2.field446 != null) {
            var9 = class1.field14.method2153((int[]) null, true, arg2.field446, class267.field3694, (class226[]) null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class267.field3694[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class218.field3020.method2736(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class218.field3020.method2739() + (class218.field3020.method2737() / 2);
        }
        int var15 = arg0.field848 + (var5 / 2);
        int var16 = arg0.field849;
        if ((class354.field4848 + var5) > var7) {
            var7 = class354.field4848;
            var15 = var10 / 2 + var6 + class354.field4848 + (var5 / 2) + 5;
        } else if (class354.field4846 - var5 < var7) {
            var15 = class354.field4846 - (var5 / 2) - (var10 / 2 + var6) - 5;
            var7 = class354.field4846 - var5;
        }
        if ((class354.field4859 + var5) > var8) {
            var16 = var5 / 2 + (class354.field4859 + var6);
            var8 = class354.field4859;
        } else if (class354.field4844 - var5 < var8) {
            var8 = class354.field4844 - var5;
            var16 = class354.field4844 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field848), (double) (var8 - arg0.field849)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1499((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field446 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var10 + var18 + 10;
            var21 = var16 - (-(class218.field3020.method2739() * var9) - 3);
            if (arg2.field427 != 0) {
                arg3.method2182(var18, var16, var20 - var18, arg2.field427, -102, var21 - var16);
            }
            if (arg2.field454 != 0) {
                arg3.method2188(var20 - var18, -var16 + var21, var18, var16, arg2.field454, (byte) -34);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class267.field3694[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class218.field3020.method2734(arg3, var23, var15, var16, arg2.field437, true);
                var16 += class218.field3020.method2739();
            }
        }
        if (arg2.field435 == -1 && arg2.field446 == null) {
            return;
        }
        class248 var24 = new class248(arg0);
        int var25 = var5 >> 1;
        var24.field3503 = var7 + var25;
        var24.field3504 = var8 + var25;
        var24.field3502 = var20;
        var24.field3498 = var18;
        var24.field3508 = var21;
        var24.field3506 = var19;
        var24.field3500 = var8 - var25;
        var24.field3497 = var7 - var25;
        class135.field1963.method643(var24, arg1 ^ 0xFFFFB906);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)V", line = 383)
    public static final void method1653(byte arg0, int arg1) {
        class133.field1915.method901(arg1, 12223);
        field3448++;
        if (arg0 < 86) {
            method1645(-50);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1644(Component arg0, byte arg1);

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I")
    public abstract int method1647(int arg0);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1652(int arg0, Component arg1);
}
