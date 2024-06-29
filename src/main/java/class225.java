import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class225 {

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[B")
    public static byte[] field3779 = new byte[520];

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3780 = 0;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3781 = 0;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[I")
    public static int[] field3787 = new int[32];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[B")
    public static byte[] field3782;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIILtb;Ltb;IIJ)V")
    public static final void method1510(int arg0, int arg1, int arg2, int arg3, class184 arg4, class184 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class212 var10 = new class212();
        var10.field3577 = arg8;
        var10.field3581 = arg1 * 128 + 64;
        var10.field3574 = arg2 * 128 + 64;
        var10.field3573 = arg3;
        var10.field3572 = arg4;
        var10.field3575 = arg5;
        var10.field3571 = arg6;
        var10.field3570 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class79.field1367[var11][arg1][arg2] == null) {
                class79.field1367[var11][arg1][arg2] = new class109(var11, arg1, arg2);
            }
        }
        class79.field1367[arg0][arg1][arg2].field1957 = var10;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lvh;Z)I")
    public static final int method1511(class108 arg0, boolean arg1) {
        field3786++;
        if (!arg1) {
            method1511((class108) null, true);
        }
        int var2 = 0;
        if (arg0.method727(class22.field339, (byte) -109)) {
            var2++;
        }
        if (arg0.method727(class161.field2681, (byte) -90)) {
            var2++;
        }
        if (arg0.method727(class49.field847, (byte) -104)) {
            var2++;
        }
        if (arg0.method727(class248.field4082, (byte) -119)) {
            var2++;
        }
        if (arg0.method727(class266.field4302, (byte) -89)) {
            var2++;
        }
        if (arg0.method727(class272.field4370, (byte) -89)) {
            var2++;
        }
        if (arg0.method727(class199.field3261, (byte) -105)) {
            var2++;
        }
        if (arg0.method727(class196.field3170, (byte) -118)) {
            var2++;
        }
        if (arg0.method727(class187.field3034, (byte) -110)) {
            var2++;
        }
        if (arg0.method727(class243.field3987, (byte) -82)) {
            var2++;
        }
        if (arg0.method727(class286.field4520, (byte) -93)) {
            var2++;
        }
        if (arg0.method727(class135.field2356, (byte) -105)) {
            var2++;
        }
        if (arg0.method727(class2.field21, (byte) -128)) {
            var2++;
        }
        if (arg0.method727(class37.field562, (byte) -103)) {
            var2++;
        }
        if (arg0.method727(class223.field3751, (byte) -92)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static final void method1512(byte arg0) {
        class60.method367((byte) -124);
        class241.method1592(120);
        class294.method1982(-1);
        field3785++;
        class227.method1525((byte) -110);
        if (arg0 > -31) {
            field3779 = null;
        }
        class71.method430(-1);
        class176.method1169(false);
        class74.method458(-585803421);
        class245.method1637(16);
        class73.method443(-99);
        class217.method1442(13056);
        class154.method1054(-2);
        class29.method194(119);
        class243.method1602(-115);
        class57.method356((byte) 120);
        class100.method636(0);
        class211.method1414(-1);
        class37.method244(104);
        class84.method551(-120);
        if (class149.field2511 != 0) {
            for (int var1 = 0; var1 < class21.field335.length; var1++) {
                class21.field335[var1] = null;
            }
            class196.field3186 = 0;
        }
        class211.method1413(-1);
        class41.method272(-17674);
        class51.field882.method58(0);
        ((class240) class287.field4555).method1588(false);
        class56.field968.method2(5);
        class73.field1202.method733(0);
        class76.field1236.method733(0);
        class98.field1693.method733(0);
        class207.field3449.method733(0);
        class198.field3197.method733(0);
        class56.field972.method733(0);
        class206.field3438.method733(0);
        class33.field471.method733(0);
        class142.field2445.method733(0);
        class181.field2968.method733(0);
        class119.field2106.method733(0);
        class151.field2525.method58(0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3775++;
        if (arg6 != -27680) {
            method1511((class108) null, false);
        }
        if (class110.method766(-13786, arg2)) {
            class31.method210(arg0, true, arg3, arg4, arg7, arg5, arg8, -1, arg1, class115.field2068[arg2]);
        } else if (arg7 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class23.field367[var9] = true;
            }
        } else {
            class23.field367[arg7] = true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method1514(int arg0, int arg1) {
        class82.field1502.method63(0, arg1);
        field3774++;
        class142.field2449.method63(0, arg1);
        class276.field4422.method63(arg0, arg1);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static final void method1515(byte arg0) {
        field3784++;
        int var1 = 46 / ((arg0 + 13) / 33);
        if (class295.field4691 == 5) {
            class295.field4691 = 6;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)V")
    public static final void method1516(int arg0, byte arg1) {
        field3773++;
        class248.field4084 = -1;
        class248.field4084 = -1;
        if (arg1 != 113) {
            return;
        }
        if (arg0 == 37) {
            class151.field2534 = 3.0F;
        } else if (arg0 == 50) {
            class151.field2534 = 4.0F;
        } else if (arg0 == 75) {
            class151.field2534 = 6.0F;
            return;
        } else if (arg0 == 100) {
            class151.field2534 = 8.0F;
            return;
        } else if (arg0 == 200) {
            class151.field2534 = 16.0F;
            return;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V")
    public static void method1517(byte arg0) {
        field3787 = null;
        field3782 = null;
        field3779 = null;
        int var1 = -11 / ((-arg0 - 10) / 55);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Leh;II)Ljava/lang/String;")
    public static final String method1518(class101 arg0, int arg1, int arg2) {
        field3776++;
        try {
            int var3 = arg0.method692(arg1 ^ 0xCF7);
            if (var3 > arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field1762 += class252.field4132.method1011(0, var3, arg0.field1762, var4, arg0.field1730, (byte) -111);
            return arg1 == 25954 ? class234.method1551(var4, 0, (byte) -82, var3) : null;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
