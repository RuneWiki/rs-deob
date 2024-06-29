import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class694 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field9819 = -1;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Lbh;")
    public static class429 field9821;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 3)
    public static void method3866(int arg0) {
        field9821 = null;
        if (arg0 != -17044) {
            method3866(-49);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 14)
    public static final void method3867(int arg0) {
        while (true) {
            if (class24.field414.method4208(class677.field9199, (byte) 37) >= 15) {
                int var1 = class24.field414.method4206(15, 96);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class247 var3 = (class247) class563.field7875.method3248((long) var1, 0);
                    if (var3 == null) {
                        class124 var4 = new class124();
                        var4.field354 = var1;
                        var3 = new class247(var4);
                        class563.field7875.method3249((long) var1, var3, (byte) 52);
                        var2 = true;
                        class38.field559[class676.field9195++] = var3;
                    }
                    class124 var5 = var3.field3158;
                    class61.field832[class443.field6200++] = var1;
                    var5.field352 = class593.field8251;
                    if (var5.field1486 != null && var5.field1486.method965(-1)) {
                        class39.method336(var5, 31);
                    }
                    int var6 = class24.field414.method4206(1, -86);
                    if (var6 == 1) {
                        class83.field1071[class9.field95++] = var1;
                    }
                    var5.method803(-119, class598.field8304.method1452(class24.field414.method4206(14, 98), 64));
                    int var7 = class24.field414.method4206(2, -46);
                    int var8 = class24.field414.method4206(5, 115);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = class24.field414.method4206(1, 23);
                    int var10 = class24.field414.method4206(3, -36) + 4 << 11 & 0x39A6;
                    int var11 = class24.field414.method4206(5, 107);
                    if (var11 > 15) {
                        var11 -= 32;
                    }
                    var5.method254(var5.field1486.field1928, (byte) -63);
                    var5.field335 = var5.field1486.field1966 << 3;
                    if (var2) {
                        var5.method270(58, var10, true);
                    }
                    var5.method807(var9 == 1, class339.field4374.field426[0] + var8, -237433432, var5.method253((byte) -27), var7, class339.field4374.field435[0] + var11);
                    if (var5.field1486.method965(-1)) {
                        class274.method1642(var5.field435[0], null, var5.field426[0], var5.field5779, (byte) -114, null, 0, var5);
                    }
                    continue;
                }
            }
            field9820++;
            int var12 = 77 % ((arg0 - 38) / 40);
            class24.field414.method4214(false);
            return;
        }
    }
}
