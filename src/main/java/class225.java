import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class225 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field3189 = -1;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[Z")
    public static boolean[] field3191;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZILjava/lang/String;IIJIILjava/lang/String;IZ)V", line = 6)
    public static final void method1415(boolean arg0, int arg1, String arg2, int arg3, int arg4, long arg5, int arg6, int arg7, String arg8, int arg9, boolean arg10) {
        field3192++;
        if (!class351.field4800 && class161.field2310 < 500) {
            int var12 = ~arg6 == arg9 ? class299.field4106 : arg6;
            class106 var13 = new class106(arg8, arg2, var12, arg4, arg7, arg5, arg1, arg3, arg10, arg0);
            class250.field3514.method1553((byte) -113, var13);
            class161.field2310++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 28)
    public static final String method1416(int arg0, String arg1) {
        field3190++;
        int var2 = 113 / ((53 - arg0) / 57);
        String var3 = class127.method773(-79, class54.method421(arg1, -16583));
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(CI)Z", line = 50)
    public static final boolean method1417(char arg0, int arg1) {
        field3185++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 > -18) {
                method1416(29, (String) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lkm;ILfc;Lfc;)V", line = 73)
    public static final void method1418(class487 arg0, int arg1, class343 arg2, class343 arg3) {
        class329.field4538 = class231.method1450(53, arg2, 0, class355.field4954);
        field3188++;
        class96.field1381 = arg0.method1061(class329.field4538, class140.method864(arg3, class355.field4954, 0), true);
        class437.field5993 = class231.method1450(61, arg2, 0, class371.field5250);
        class262.field3662 = arg0.method1061(class437.field5993, class140.method864(arg3, class371.field5250, arg1), true);
        class328.field4531 = class231.method1450(121, arg2, 0, class467.field6552);
        class211.field2981 = arg0.method1061(class328.field4531, class140.method864(arg3, class467.field6552, 0), true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILfc;)Lwt;", line = 86)
    public static final class200 method1419(int arg0, int arg1, int arg2, class343 arg3) {
        field3186++;
        class425 var4 = new class425(arg3.method2029(arg2, arg0, 0));
        if (arg1 != 20965) {
            field3191 = null;
        }
        class200 var5 = new class200(arg0, var4.method2464(false), var4.method2464(false), var4.method2502((byte) -86), var4.method2502((byte) -86), var4.method2503(true) == 1, var4.method2503(true), var4.method2503(true));
        int var6 = var4.method2503(true);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2861.method1553((byte) -98, new class251(var4.method2503(true), var4.method2508(true), var4.method2508(true), var4.method2508(true), var4.method2508(true), var4.method2508(true), var4.method2508(true), var4.method2508(true), var4.method2508(true)));
        }
        var5.method1271(0);
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 114)
    public static void method1420(int arg0) {
        if (arg0 != 160) {
            field3191 = null;
        }
        field3191 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)V", line = 125)
    public static final void method1421(byte arg0, int arg1, int arg2) {
        field3187++;
        int var3 = 113 / ((-arg0 - 86) / 40);
        class265 var4 = class440.method2554(arg2, 2, 5);
        var4.method1675(false);
        var4.field3698 = arg1;
    }
}
