import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class458 {

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "Lla;")
    public static class319 field6859 = new class319(71, 6);

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Z")
    public static boolean field6861 = false;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "Lqw;")
    public static class54 field6862;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 3)
    public static void method2775(int arg0) {
        if (arg0 != -1180) {
            method2778(-35);
        }
        field6862 = null;
        field6859 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIILjava/lang/String;Li;Lga;ILba;Lju;III)V", line = 15)
    public static final void method2776(int arg0, int arg1, int arg2, String arg3, class30 arg4, class282 arg5, int arg6, class268 arg7, class82 arg8, int arg9, int arg10, int arg11) {
        field6863++;
        int var12;
        if (class340.field5269 == 4) {
            var12 = (int) class53.field744 & 0x3FFF;
        } else {
            var12 = (int) class53.field744 + class303.field4433 & 0x3FFF;
        }
        int var13 = Math.max(arg5.field3991 / 2, arg5.field4043 / 2) + 10;
        int var14 = arg2 * arg2 + arg11 * arg11;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class428.field6502[var12];
        int var16 = class428.field6501[var12];
        if (class340.field5269 != 4) {
            var15 = var15 * 256 / (class514.field7549 + 256);
            var16 = var16 * 256 / (class514.field7549 + 256);
        }
        int var17 = arg11 * var15 + (arg2 * var16) >> 15;
        int var18 = arg11 * var16 - (arg2 * var15) >> 15;
        int var19 = arg8.method562(null, -127, arg3, 100);
        int var20 = arg8.method556(0, (byte) 1, arg3, 100, null);
        int var21 = var17 - var19 / 2;
        if (-arg5.field3991 <= var21 && var21 <= arg5.field3991 && (-arg5.field4043) <= var18 && arg5.field4043 >= var18) {
            arg7.method1720(50, arg1, arg10, arg3, arg4, 1, 0, -5594, arg5.field3991 / 2 + var21 + arg9, 0, null, var19, null, arg0, arg5.field4043 / 2 + arg0 - var18 - (arg6 + var20), arg9);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lew;", line = 62)
    public static final class346 method2777(int arg0, int arg1) {
        field6860++;
        class346 var2 = (class346) class478.field7073.method2917(arg0 - 4065, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class350.field5399.method1281(arg1, 0, 107);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class346 var4 = class178.method1195(true, var3);
            class478.field7073.method2916(var4, (long) arg1, -26941);
            return arg0 == 4069 ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V", line = 93)
    public static final void method2778(int arg0) {
        class294.field4294.method1745(-110);
        if (arg0 > -90) {
            method2775(46);
        }
        field6858++;
    }
}
