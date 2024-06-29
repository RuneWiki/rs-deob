import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class676 extends class312 {

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Leba;")
    public static class550 field9607 = new class550(24, -1);

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field9608 = -1;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lr;I)V", line = 4)
    public static final void method3845(class562 arg0, int arg1) {
        field9609++;
        if (arg1 != 0) {
            method3846(true);
        }
        if (!(class137.field1873 >= 2 || class38.field507) || class85.field1028 != null) {
            return;
        }
        String var2;
        if (class38.field507 && class137.field1873 < 2) {
            var2 = class418.field5499 + class371.field4911.method2141(class422.field5539, true) + class209.field2788 + " ->";
        } else if (class482.field6723 && class643.field8914.method2106((byte) -107, 81) && class137.field1873 > 2) {
            var2 = class509.method2886(-28, (class354) class101.field1211.field5887.field547.field547);
        } else {
            class354 var3 = (class354) class101.field1211.field5887.field547;
            var2 = class509.method2886(-29, var3);
            int[] var4 = null;
            if (class198.method1280(var3.field4729, -1007)) {
                var4 = class87.field1058.method1394(-76, (int) var3.field4723).field8058;
            } else if (var3.field4719 != -1) {
                var4 = class87.field1058.method1394(-98, var3.field4719).field8058;
            } else if (class258.method1561(var3.field4729, -121)) {
                class407 var7 = (class407) class296.field3921.method3057(1, (long) ((int) var3.field4723));
                if (var7 != null) {
                    class351 var8 = var7.field5354;
                    class384 var9 = var8.field4671;
                    if (var9.field5121 != null) {
                        var9 = var9.method2203(arg1 + 3, class564.field7696);
                    }
                    if (var9 != null) {
                        var4 = var9.field5091;
                    }
                }
            } else if (class125.method744(var3.field4729, 45)) {
                Object var5 = null;
                class600 var6;
                if (var3.field4729 == 1011) {
                    var6 = class118.field1510.method3921((int) var3.field4723, -100);
                } else {
                    var6 = class118.field1510.method3921((int) (var3.field4723 >>> 32 & 0x7FFFFFFFL), -56);
                }
                if (var6.field8257 != null) {
                    var6 = var6.method3324((byte) 79, class564.field7696);
                }
                if (var6 != null) {
                    var4 = var6.field8333;
                }
            }
            if (var4 != null) {
                var2 = var2 + class557.method3098(var4, arg1 + 584);
            }
        }
        if (class137.field1873 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class137.field1873 - 2) + class371.field4904.method2141(class422.field5539, true);
        }
        if (class358.field4762 != null) {
            class409 var11 = class358.field4762.method2399(arg0, (byte) -123);
            if (var11 == null) {
                var11 = class622.field8625;
            }
            var11.method2318(class358.field4762.field5664, 30250, class196.field2683, class358.field4762.field5670, class358.field4762.field5580, class358.field4762.field5672, class358.field4762.field5561, field9608, class466.field6127, var2, class120.field1537, class693.field9763, class358.field4762.field5671, class485.field6735, class473.field6592);
            class576.method3180(class485.field6735[1], class485.field6735[2], class485.field6735[0], class485.field6735[3], arg1 - 106);
        } else if (class663.field9448 != null && class510.field7101 == class508.field7015) {
            int var10 = class622.field8625.method2328(class196.field2683, -1, class466.field6127, var2, class595.field8211 + 16, class473.field6592, 16777215, class177.field2499 + 4, 0, class693.field9763);
            class576.method3180(class595.field8211, class254.field3332.method3765(var2, (byte) 6) + var10, class177.field2499 + 4, 16, -125);
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 113)
    public static void method3846(boolean arg0) {
        field9607 = null;
        if (!arg0) {
            field9608 = 95;
        }
    }
}
