import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class731 {

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10244 = 0;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field10243;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public int field10245;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field10246;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Ljava/lang/String;")
    public String field10249;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 5)
    public static final void method4070(int arg0, boolean arg1, String arg2) {
        field10242++;
        int var3 = class468.field6665;
        int[] var4 = class38.field500;
        boolean var5 = arg1;
        for (int var6 = 0; var6 < var3; var6++) {
            class639 var7 = class536.field7796[var4[var6]];
            if (var7 != null && class108.field1536 != var7 && var7.field9056 != null && var7.field9056.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class296.field4057++;
                    class88 var12 = class448.method2741((byte) 95, class348.field5153, class583.field8319);
                    var12.field1260.method2877(0, 128);
                    var12.field1260.method2887(var4[var6], (byte) -83);
                    class523.method3183(var12, (byte) 31);
                } else if (arg0 == 4) {
                    class206.field3102++;
                    class88 var11 = class448.method2741((byte) 43, class118.field1621, class583.field8319);
                    var11.field1260.method2914(var4[var6], (byte) 74);
                    var11.field1260.method2877(0, 128);
                    class523.method3183(var11, (byte) 31);
                } else if (arg0 == 5) {
                    class504.field7331++;
                    class88 var8 = class448.method2741((byte) 125, class496.field7142, class583.field8319);
                    var8.field1260.method2887(var4[var6], (byte) -109);
                    var8.field1260.method2864(0, (byte) 99);
                    class523.method3183(var8, (byte) 31);
                } else if (arg0 == 6) {
                    class538.field7817++;
                    class88 var9 = class448.method2741((byte) 46, class589.field8384, class583.field8319);
                    var9.field1260.method2901(0, 128);
                    var9.field1260.method2914(var4[var6], (byte) 56);
                    class523.method3183(var9, (byte) 31);
                } else if (arg0 == 7) {
                    class694.field9822++;
                    class88 var10 = class448.method2741((byte) 43, class96.field1385, class583.field8319);
                    var10.field1260.method2887(var4[var6], (byte) -99);
                    var10.field1260.method2877(0, 128);
                    class523.method3183(var10, (byte) 31);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class758.method4212(4, 2, class608.field8641.method3543(-24350, class45.field748) + arg2);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V", line = 99)
    public static final void method4071(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method4071(94, false);
        }
        field10248++;
        if (class703.field9912 == null) {
            class603.method3510(17768);
        }
        if (arg1) {
            class703.field9912.method1420(false);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)[Lhfa;", line = 117)
    public static final class696[] method4072(int arg0) {
        field10243++;
        return arg0 == 0 ? new class696[] { class105.field1484, class105.field1489, class105.field1490, class105.field1491, class105.field1492, class105.field1493, class105.field1494, class105.field1495, class105.field1496, class105.field1497, class105.field1498, class105.field1499, class105.field1500, class105.field1501 } : null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)I", line = 131)
    public static final int method4073(int arg0, int arg1, int arg2) {
        field10247++;
        int var3 = -113 % ((69 - arg0) / 40);
        byte var4;
        if (arg1 > 20000) {
            class693.method3910(2);
            var4 = 4;
        } else if (arg1 > 10000) {
            var4 = 3;
            class353.method2246(true);
        } else if (arg1 > 5000) {
            var4 = 2;
            class184.method1302(0);
        } else {
            class521.method3171(true, (byte) 21);
            var4 = 1;
        }
        if (class243.field3580.field7975.method3775(false) != arg2) {
            class243.field3580.method3301(arg2, 24, class243.field3580.field8019);
            class403.method2449(false, arg2, -117);
        }
        class23.method102((byte) -74);
        return var4;
    }
}
