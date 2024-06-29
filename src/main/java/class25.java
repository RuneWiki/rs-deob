import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 extends class32 {

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "Lik;")
    public class259 field527;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field521 = -2;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "[Lqk;")
    public static class207[] field523 = null;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "Lqk;")
    public static class207 field525 = class24.method212(255, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "Lqk;")
    public static class207 field519 = class24.method212(255, "Mem:");

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "[[I")
    public static int[][] field528 = new int[104][104];

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "[Lqk;")
    public static class207[] field530 = new class207[100];

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field532 = -1;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field533 = 128;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field534 = 0;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "Lee;")
    public static class280 field524;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "[I")
    public static int[] field520;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public static final void method213(int arg0) {
        if (arg0 >= -104) {
            return;
        }
        class176.method1259((byte) -64);
        field529++;
        class244.method1722(true);
        class234.method1671(true);
        class55.method414(3966);
        class156.method1144(-1);
        class179.method1276(-1601881921);
        class214.method1526(0);
        class254.method1766((byte) -114);
        class46.method355(false);
        class52.method403(0);
        class46.method354((byte) -65);
        class271.method1847(104);
        class282.method1916((byte) -127);
        class3.method21(107);
        class278.method1892((byte) 122);
        class157.method1148(-37);
        if (class225.field4107 != 0) {
            for (int var1 = 0; var1 < class10.field144.length; var1++) {
                class10.field144[var1] = null;
            }
            class191.field3375 = 0;
        }
        class277.method1887(99999999);
        class52.method402(25492);
        class143.field2474.method1390((byte) 112);
        ((class45) class257.field4602).method340(50);
        class195.field3420.method762(-115);
        class131.field2266.method731((byte) 120);
        class98.field1725.method731((byte) 120);
        class287.field5128.method731((byte) 120);
        class153.field2656.method731((byte) 120);
        class13.field191.method731((byte) 120);
        class56.field1050.method731((byte) 120);
        class85.field1549.method731((byte) 120);
        class101.field1832.method731((byte) 120);
        class183.field3256.method731((byte) 120);
        class88.field1594.method731((byte) 120);
        class287.field5124.method731((byte) 120);
        class101.field1815.method1390((byte) 125);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Lkf;")
    public static final class179 method214(int arg0, byte arg1) {
        int var2 = -122 / ((-arg1 - 75) / 36);
        class179 var3 = (class179) class86.field1566.method1387((long) arg0, 125);
        field522++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class241.field4399.method705(16, arg0, -1);
        class179 var5 = new class179();
        if (var4 != null) {
            var5.method1279(-1323, new class149(var4));
        }
        class86.field1566.method1385((long) arg0, var5, (byte) -128);
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
    public static void method215(byte arg0) {
        field528 = null;
        if (arg0 <= 57) {
            method214(-128, (byte) 46);
        }
        field525 = null;
        field520 = null;
        field530 = null;
        field519 = null;
        field524 = null;
        field523 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lik;)V")
    public class25(class259 arg0) {
        this.field527 = arg0;
    }
}
