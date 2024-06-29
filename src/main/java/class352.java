import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class352 extends class311 {

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public int field4725 = -1;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public int field4732 = 0;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "[Lnj;")
    public static class230[] field4733 = new class230[6];

    @OriginalMember(owner = "client!im", name = "G", descriptor = "Lhc;")
    public static class368 field4741 = new class368("Hidden", "Versteckt", "Caché", "Oculto");

    @OriginalMember(owner = "client!im", name = "I", descriptor = "Lhc;")
    public static class368 field4743 = new class368("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public int field4726;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "Lclient;")
    public static client field4737;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Z")
    public static final boolean method2121(int arg0, int arg1) {
        field4735++;
        if (arg1 > -32) {
            return true;
        } else {
            class14.field148 = true;
            class230.field3244 = arg0 + 1 & 0xFFFF;
            return true;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lea;I)V")
    public static final void method2122(class58 arg0, int arg1) {
        field4724++;
        if (!(class149.field2171 >= 2 || class213.field2980) || class31.field431 != null) {
            return;
        }
        String var2;
        if (class213.field2980 && class149.field2171 < 2) {
            var2 = class302.field4121 + class310.field4202.method2313((byte) -92, class445.field6241) + class119.field1816 + " ->";
        } else if (class187.field2704 && class146.field2122.method1474(-20986, 81) && class149.field2171 > 2) {
            var2 = class361.method2225((class429) class451.field6491.field2296.field4225.field4225, -22);
        } else {
            class429 var3 = (class429) class451.field6491.field2296.field4225;
            var2 = class361.method2225(var3, arg1 + 10587);
            int[] var4 = null;
            if (class101.method772(var3.field5977, 9)) {
                var4 = class367.method2308(false, (int) var3.field5969).field186;
            } else if (class323.method1966((byte) 63, var3.field5977)) {
                class419 var5 = class428.field5951[(int) var3.field5969];
                if (var5 != null) {
                    var4 = var5.field5807.field3291;
                }
            } else if (class13.method69(var3.field5977, 125)) {
                if (var3.field5977 == 1011) {
                    var4 = class133.method996((byte) -19, (int) var3.field5969).field6303;
                } else {
                    var4 = class133.method996((byte) -19, (int) (var3.field5969 >>> 32 & 0x7FFFFFFFL)).field6303;
                }
            }
            if (var4 != null) {
                var2 = var2 + class303.method1837(var4, -3560);
            }
        }
        if (class149.field2171 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class149.field2171 - 2) + class93.field1303.method2313((byte) -77, class445.field6241);
        }
        if (class177.field2532 != null) {
            class61 var7 = class177.field2532.method822(-1, arg0);
            if (var7 == null) {
                var7 = class269.field3685;
            }
            var7.method482(class233.field3337, var2, class177.field2532.field1632, class177.field2532.field1568, class177.field2532.field1621, class387.field5329, class177.field2532.field1534, class165.field2336, class406.field5627, class109.field1683, class268.field3671, class177.field2532.field1635, class160.field2277, class177.field2532.field1577, (byte) 57);
            class349.method2110(class268.field3671[0], class268.field3671[3], class268.field3671[2], -11514, class268.field3671[1]);
        } else if (class1.field10 != null && class133.field1986 == 0) {
            int var6 = class269.field3685.method488(class406.field5627, 16777215, class80.field1122 + 4, class71.field996 + 16, 0, class160.field2277, class387.field5329, var2, 1, class165.field2336);
            class349.method2110(class80.field1122 + 4, 16, var6 + class280.field3810.method2419(var2, (byte) -91), -11514, class71.field996);
        }
        if (arg1 != -10461) {
            method2121(-69, 82);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public static void method2123(byte arg0) {
        field4743 = null;
        field4737 = null;
        field4733 = null;
        field4741 = null;
        if (arg0 != -123) {
            field4741 = null;
        }
    }
}
