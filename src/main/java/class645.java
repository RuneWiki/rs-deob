import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class645 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Ldr;")
    public static class675 field8743 = new class675(8, 10);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZIIIB)V", line = 4)
    public static final void method3607(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8744++;
        class510.field6386 = 0L;
        if (arg4 >= -122) {
            return;
        }
        int var5 = class207.method1211(3);
        if (arg1 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (!class309.field3898.method466()) {
            arg0 = true;
        }
        class403.method2269((byte) -31, arg1, var5, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 26)
    public static void method3608(byte arg0) {
        if (arg0 != -16) {
            method3610(null, 17);
        }
        field8743 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 39)
    public static final boolean method3609(int arg0, String arg1, int arg2) {
        field8741++;
        if (class386.field4955.field5919) {
            class360.field4628 = new class234();
            class360.field4628.field3030 = arg0;
            class360.field4628.field3035 = arg1;
            if (class257.field3292 != class255.field3277) {
                class360.field4628.field3037 = class360.field4628.field3030 + 50000;
                class360.field4628.field3031 = class360.field4628.field3030 + 40000;
            }
            if (class704.field9858.length > arg0 && class704.field9858[arg0] != null) {
                class74.field988 = class704.field9858[arg0].field6643;
            }
            return true;
        }
        String var3 = "";
        if (class257.field3292 != class255.field3277) {
            var3 = ":" + (arg0 + 7000);
        }
        int var4 = -123 % ((88 - arg2) / 32);
        String var5 = "";
        if (class122.field1487 != null) {
            var5 = "/p=" + class122.field1487;
        }
        String var6 = "http://" + arg1 + var3 + "/l=" + class71.field912 + "/a=" + class594.field7969 + var5 + "/j" + (class180.field2123 ? "1" : "0") + ",o" + (class361.field4630 ? "1" : "0") + ",a2";
        try {
            class455.field5687.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lts;I)I", line = 92)
    public static final int method3610(class501 arg0, int arg1) {
        field8742++;
        if (arg1 < 97) {
            method3609(28, null, 95);
        }
        String var2 = class293.method1769(arg0, -21589);
        int[] var3 = null;
        if (class534.method2880(-8897, arg0.field6242)) {
            var3 = class504.field6287.method1628((int) arg0.field6247, (byte) -114).field828;
        } else if (arg0.field6250 != -1) {
            var3 = class504.field6287.method1628(arg0.field6250, (byte) -108).field828;
        } else if (class453.method2489((byte) 104, arg0.field6242)) {
            class704 var6 = (class704) class168.field1973.method3828((long) ((int) arg0.field6247), (byte) -91);
            if (var6 != null) {
                class506 var7 = var6.field9854;
                class689 var8 = var7.field6326;
                if (var8.field9546 != null) {
                    var8 = var8.method3812(class327.field4084, -128);
                }
                if (var8 != null) {
                    var3 = var8.field9516;
                }
            }
        } else if (class245.method1473(arg0.field6242, -114)) {
            Object var4 = null;
            class687 var5;
            if (arg0.field6242 == 1011) {
                var5 = class232.field3017.method2358(0, (int) arg0.field6247);
            } else {
                var5 = class232.field3017.method2358(0, (int) (arg0.field6247 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field9421 != null) {
                var5 = var5.method3800(class327.field4084, (byte) -100);
            }
            if (var5 != null) {
                var3 = var5.field9447;
            }
        }
        if (var3 != null) {
            var2 = var2 + class617.method3443(false, var3);
        }
        int var9 = class36.field540.method129(var2, class306.field3871, (byte) -118);
        if (arg0.field6241) {
            var9 += class590.field7923.method1556() + 4;
        }
        return var9;
    }
}
