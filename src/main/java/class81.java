import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class81 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lcq;")
    public static class110 field836 = new class110(69, 4);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIBI)I", line = 3)
    public static final int method430(int arg0, int arg1, byte arg2, int arg3) {
        field837++;
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class170.method925(var6, var4, arg2 - 77);
        int var9 = class170.method925(var6, var4 + 1, -126);
        if (arg2 != 74) {
            method431(-98);
        }
        int var10 = class170.method925(var6 + 1, var4, -128);
        int var11 = class170.method925(var6 + 1, var4 + 1, -111);
        int var12 = class200.method1199((byte) -26, var5, var8, arg1, var9);
        int var13 = class200.method1199((byte) -26, var5, var10, arg1, var11);
        return class200.method1199((byte) -26, var7, var12, arg1, var13);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 35)
    public static void method431(int arg0) {
        field836 = null;
        if (arg0 != 18246) {
            method431(-56);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(JLjava/lang/String;ZI)V", line = 49)
    public static final void method432(long arg0, String arg1, boolean arg2, int arg3) {
        field839++;
        if (arg2) {
            class194.method1176((byte) 45);
            if (class705.field9907.equals("")) {
                class239.field2965 = 39;
                return;
            }
        }
        class115 var5 = new class115(576);
        var5.method658(10, (byte) 91);
        var5.method645(-672168216, (int) (Math.random() * 65535.0D));
        var5.method670((byte) 103, arg0);
        var5.method645(-672168216, arg2 ? class680.field9593 : class112.field1186);
        var5.method672((byte) 104, arg1);
        var5.method670((byte) 121, arg2 ? class452.field6474 : class658.field9243);
        if (arg2) {
            var5.method670((byte) 85, class266.method1569(class705.field9907, (byte) 125));
            try {
                var5.method670((byte) 106, Long.parseLong(class136.field1497));
            } catch (Exception var9) {
                class239.field2965 = 39;
                return;
            }
        } else {
            var5.method660((byte) 91, (int) (Math.random() * 9.9999999E7D));
            var5.method660((byte) 117, (int) (Math.random() * 9.9999999E7D));
            var5.method660((byte) 107, (int) (Math.random() * 9.9999999E7D));
            var5.method660((byte) 99, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method660((byte) 44, (int) (Math.random() * 9.9999999E7D));
        var5.method634(class595.field8389, 0, class101.field1084);
        class653 var6 = class496.method2869(-127);
        var6.field9158.method658(arg2 ? class249.field3128.field1673 : class249.field3125.field1673, (byte) 76);
        int var7 = 1;
        if (class359.field4829 != null) {
            var7 += class359.field4829.length() + 1;
        }
        var6.field9158.method645(-672168216, var7 + var5.field1218 + 28);
        var6.field9158.method645(-672168216, 622);
        var6.field9158.method658(class504.field7267, (byte) 108);
        var6.field9158.method658(class246.field3031.field3943, (byte) 112);
        class189.method1148((byte) 60, var6.field9158);
        String var8 = arg2 ? class73.field771 : class359.field4829;
        var6.field9158.method658(var8 == null ? 0 : 1, (byte) 114);
        if (var8 != null) {
            var6.field9158.method672((byte) -109, var8);
        }
        var6.field9158.method629(105, var5.field1269, var5.field1218, 0);
        class568.method3220(var6, (byte) 53);
        if (arg3 == -16289) {
            class227.field2811 = 0;
            class654.field9183 = 1;
            class51.field514 = 0;
            class239.field2965 = -3;
        }
    }
}
