import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class6 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljd;")
    public static class85 field71 = class221.method1499("<col=00ffff>", (byte) 87);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field73 = Calendar.getInstance();

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lve;")
    public static class184 field74 = new class184(100);

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "S")
    public static short field76 = 1;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field70;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)Lcf;")
    public abstract class91 method24(byte arg0);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I")
    public abstract int method25(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public static void method26(byte arg0) {
        field70 = null;
        field74 = null;
        field71 = null;
        int var1 = 25 % ((39 - arg0) / 62);
        field73 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[B")
    public abstract byte[] method27(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class83.field1510 = arg1;
        if (arg4 <= 49) {
            return;
        }
        field72++;
        class119.field2117 = arg0;
        class74.field1385 = arg2;
        class128.field2256 = arg6;
        class75.field1394 = arg3;
        if (arg5 && class128.field2256 >= 100) {
            class267.field4762 = class74.field1385 * 128 + 64;
            class272.field4809 = class119.field2117 * 128 + 64;
            class231.field3987 = class246.method1660(604124551, class267.field4762, class116.field2066, class272.field4809) - class83.field1510;
        }
        class273.field4825 = 2;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)V")
    public abstract void method29(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(II)V")
    public static final void method30(int arg0, int arg1) {
        field69++;
        class171 var2 = class85.method579(8, 0, arg0);
        var2.method1141(-6456);
        if (arg1 != -64) {
            field74 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZLge;Lge;)V")
    public static final void method31(boolean arg0, boolean arg1, class68 arg2, class68 arg3) {
        class66.field1223 = arg2;
        field68++;
        class50.field880 = arg3;
        if (!arg1) {
            class202.field3515 = arg0;
        }
    }
}
