import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class232 {

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Ltb;")
    private class450 field2894 = new class450(64);

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Lpl;")
    private class612 field2900;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Lpl;")
    private class612 field2891;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "[I")
    public static int[] field2898 = new int[3];

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field2895 = -1;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Lcv;")
    public static class635 field2896;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        if (arg0 != -106) {
            field2896 = null;
        }
        field2898 = null;
        field2896 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method1396(int arg0, byte arg1, String arg2) {
        field2897++;
        class148.field1914++;
        class704 var3 = class314.method1820(class622.field8683, class400.field5014, (byte) -55);
        if (arg1 != -9) {
            method1399(35, (byte) 55, -127, -14, 127, -30, 3, -40, -116);
        }
        var3.field9929.method3509(class109.method611(arg2, (byte) 2) + 1, (byte) -108);
        var3.field9929.method3489(arg2, -78);
        var3.field9929.method3525((byte) 125, arg0);
        class122.method654(var3, (byte) -36);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public static final void method1397(int arg0) {
        class227.field2830.method247(2);
        field2899++;
        int var1 = -113 / ((arg0 + 9) / 54);
        class403.field5052 = 0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)Lqt;")
    public final class403 method1398(int arg0, int arg1) {
        field2892++;
        class403 var3 = (class403) this.field2894.method2418((long) arg1, (byte) 100);
        if (var3 != null) {
            return var3;
        }
        if (arg0 <= 25) {
            method1396(41, (byte) -79, null);
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field2891.method3365(arg1, -109, 0);
        } else {
            var4 = this.field2900.method3365(arg1 & 0x7FFF, -127, 0);
        }
        class403 var5 = new class403();
        if (var4 != null) {
            var5.method2149(new class630(var4), 70);
        }
        if (arg1 >= 32768) {
            var5.method2146(-54);
        }
        this.field2894.method2409((long) arg1, var5, 1);
        return var5;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method1399(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2893++;
        if (class525.method2860((byte) 82, arg5)) {
            if (arg1 == -23) {
                if (class688.field9760[arg5] == null) {
                    class410.method2174(arg7, arg2, arg6, arg8, (byte) -4, arg4, arg3, class103.field1390[arg5], arg0, -1);
                } else {
                    class410.method2174(arg7, arg2, arg6, arg8, (byte) -4, arg4, arg3, class688.field9760[arg5], arg0, -1);
                }
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class413.field5168[var9] = true;
            }
        } else {
            class413.field5168[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILpl;Lpl;)V")
    public class232(int arg0, class612 arg1, class612 arg2) {
        this.field2900 = arg2;
        this.field2891 = arg1;
        if (this.field2891 != null) {
            this.field2891.method3349(0, true);
        }
        if (this.field2900 != null) {
            this.field2900.method3349(0, true);
        }
    }
}
