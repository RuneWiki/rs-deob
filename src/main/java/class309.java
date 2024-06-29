import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class309 {

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field3946 = -1;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    public static final void method1785(byte arg0) {
        field3945++;
        int var1 = 0;
        if (class301.field3698.method2700(-107, class651.field9191)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class301.field3698.field6604) {
            var1 |= 0x40;
        }
        class470.method2490((byte) 67, var1);
        class428.field5352.method3140((byte) 102, var1);
        class633.field8881.method433(-12209, var1);
        class287.field3581.method1489(-111, var1);
        class370.field4686.method3942(-12336, var1);
        if (arg0 <= 45) {
            method1785((byte) 110);
        }
        class686.method3859(var1, 1);
        class168.method966(var1, (byte) 81);
        class128.method680(var1, (byte) 31);
        class630.method3508(var1, (byte) 51);
        class626.method3443((byte) -8);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZZ)V")
    public static final void method1786(boolean arg0, boolean arg1) {
        if (class407.field5098 == null) {
            class433.method2282(-123);
        }
        field3947++;
        if (!arg0) {
            method1787((byte) -104, null);
        }
        if (arg1) {
            class407.field5098.method668(111);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLkp;)Lkp;")
    public static final class507 method1787(byte arg0, class507 arg1) {
        field3949++;
        if (arg1.field6719 != -1) {
            return class156.method894(-1018745488, arg1.field6719);
        }
        if (arg0 < 119) {
            method1787((byte) 112, null);
        }
        int var2 = arg1.field6764 >>> 16;
        class374 var3 = new class374(class138.field1797);
        for (class340 var4 = (class340) var3.method2036((byte) 75); var4 != null; var4 = (class340) var3.method2034(1)) {
            if (var4.field4392 == var2) {
                return class156.method894(-1018745488, (int) var4.field4199);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)I")
    public static final int method1788(int arg0) {
        int var1 = -54 / ((arg0 - 69) / 37);
        field3948++;
        return class430.field5387;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
    public static final void method1789(int arg0, int arg1, int arg2) {
        field3944++;
        if (arg2 != 0) {
            method1789(-27, -117, -85);
        }
        class592 var3 = class61.method371(6, arg1, (byte) -33);
        var3.method3256((byte) 11);
        var3.field8314 = arg0;
    }
}
