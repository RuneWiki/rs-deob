import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class123 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    public static int[] field1576 = new int[3];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 8)
    public static final int method953(int arg0, int arg1) {
        field1578++;
        if (arg0 != -12526) {
            method956((byte) -15);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method954(int arg0, int arg1, int arg2) {
        field1579++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 != 256) {
            return true;
        }
        class174 var3 = class379.field4811.method4192(27324, arg0);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1175(-99, arg2);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 39)
    public static final void method955(byte arg0) {
        field1580++;
        class714 var1 = class350.method2072(0L, 15, (byte) 126);
        int var2 = 11 % ((58 - arg0) / 38);
        var1.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 51)
    public static void method956(byte arg0) {
        if (arg0 == -109) {
            field1576 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZI)Z", line = 61)
    public static final boolean method957(int arg0, boolean arg1, int arg2) {
        field1575++;
        if (arg1) {
            method960(null, (byte) 30, -45);
        }
        return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V", line = 72)
    public static final void method958(boolean arg0) {
        field1573++;
        for (class581 var1 = (class581) class365.field4542.method1003((byte) 53); var1 != null; var1 = (class581) class365.field4542.method1004(arg0)) {
            if (var1.field7927 > 1) {
                var1.field7927 = 0;
                class488.field6822.method1686(-25638, ((class75) var1.field7925.field1703.field1903).field1024, var1);
                var1.field7925.method1000(31335);
            }
        }
        class245.field2894 = 0;
        if (!arg0) {
            method953(-11, -69);
        }
        class282.field3279 = 0;
        class5.field52.method2729(-48);
        class90.field1207.method2115(0);
        class365.field4542.method1000(31335);
        class672.field9218 = false;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLes;Ljava/lang/String;)I", line = 110)
    public static final int method959(byte arg0, class403 arg1, String arg2) {
        field1577++;
        int var3 = arg1.field5262;
        byte[] var4 = class72.method686(arg2, -30189);
        arg1.method2378((byte) 2, var4.length);
        if (arg0 >= -5) {
            method959((byte) -71, null, null);
        }
        arg1.field5262 += class37.field548.method304(arg1.field5262, arg1.field5275, 23828, 0, var4, var4.length);
        return arg1.field5262 - var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lkg;BI)V", line = 130)
    public static final void method960(class287 arg0, byte arg1, int arg2) {
        field1574++;
        int var3 = -1;
        int var4 = 0;
        if (arg0.field3375 > class228.field2707) {
            class372.method2176(arg0, 0);
        } else if (arg0.field3428 >= class228.field2707) {
            class321.method1916(arg0, 512);
        } else {
            class634.method3578(-81, false, arg0);
            var3 = class683.field9353;
            var4 = class413.field5396;
        }
        if (arg0.field823 < 512 || arg0.field813 < 512 || arg0.field823 >= (class596.field8090 - 1) * 512 || (class107.field1350 - 1) * 512 <= arg0.field813) {
            var3 = -1;
            arg0.field3420 = -1;
            arg0.field3375 = 0;
            var4 = 0;
            arg0.field3430 = null;
            arg0.field3428 = 0;
            arg0.field823 = arg0.field3453[0] * 512 + (arg0.method1665(1720746760) * 256);
            arg0.field813 = arg0.field3455[0] * 512 + arg0.method1665(1720746760) * 256;
            arg0.method1667(false);
            for (int var5 = 0; var5 < arg0.field3439.length; var5++) {
                arg0.field3439[var5].field9372 = -1;
            }
        }
        if (class300.field3596 == arg0 && (arg0.field823 < 6144 || arg0.field813 < 6144 || arg0.field823 >= ((class596.field8090 - 12) * 512) || class107.field1350 * 512 - 6144 <= arg0.field813)) {
            arg0.field3375 = 0;
            arg0.field3428 = 0;
            var4 = 0;
            arg0.field3430 = null;
            arg0.field3420 = -1;
            var3 = -1;
            arg0.field823 = arg0.field3453[0] * 512 + arg0.method1665(1720746760) * 256;
            arg0.field813 = arg0.field3455[0] * 512 + (arg0.method1665(1720746760) * 256);
            arg0.method1667(false);
            for (int var6 = 0; var6 < arg0.field3439.length; var6++) {
                arg0.field3439[var6].field9372 = -1;
            }
        }
        int var7 = class387.method2266(arg0, false);
        class488.method2897(arg0, 16383);
        class86.method793(true, arg0, var3, var7, var4);
        class535.method3184(0, var3, arg0);
        class141.method1023((byte) 100, arg0);
        if (arg1 > -19) {
            field1576 = null;
        }
    }
}
