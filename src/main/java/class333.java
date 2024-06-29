import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class333 {

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field4631 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLya;)V")
    public static final void method2036(byte arg0, class38 arg1) {
        field4629++;
        if (!(class291.field4175 >= 2 || class453.field6671) || class134.field1943 != null || arg0 > -47) {
            return;
        }
        String var2;
        if (class453.field6671 && class291.field4175 < 2) {
            var2 = class8.field93 + class85.field1160.method2031(true, class377.field5585) + class91.field1252 + " ->";
        } else if (class223.field3272 && class229.field3360.method796(-117, 81) && class291.field4175 > 2) {
            var2 = class87.method768(-102, (class97) class498.field7394.field1918.field3269.field3269);
        } else {
            class97 var3 = (class97) class498.field7394.field1918.field3269;
            var2 = class87.method768(-102, var3);
            int[] var4 = null;
            if (class293.method1857(var3.field1307, 0)) {
                var4 = class270.field3995.method6(22883, (int) var3.field1308).field923;
            } else if (var3.field1299 != -1) {
                var4 = class270.field3995.method6(22883, var3.field1299).field923;
            } else if (class478.method2889(var3.field1307, (byte) -123)) {
                class461 var5 = class250.field3690[(int) var3.field1308];
                if (var5 != null) {
                    class100 var6 = var5.field6790;
                    if (var6.field1364 != null) {
                        var6 = var6.method848(false, class253.field3739);
                    }
                    if (var6 != null) {
                        var4 = var6.field1404;
                    }
                }
            } else if (class9.method58(-112, var3.field1307)) {
                Object var7 = null;
                class222 var8;
                if (var3.field1307 == 1010) {
                    var8 = class384.field5645.method786((int) var3.field1308, 0);
                } else {
                    var8 = class384.field5645.method786((int) (var3.field1308 >>> 32 & 0x7FFFFFFFL), 0);
                }
                if (var8.field3233 != null) {
                    var8 = var8.method1509(class253.field3739, (byte) 92);
                }
                if (var8 != null) {
                    var4 = var8.field3245;
                }
            }
            if (var4 != null) {
                var2 = var2 + class213.method1463(var4, 124);
            }
        }
        if (class291.field4175 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class291.field4175 - 2) + class352.field4869.method2031(true, class377.field5585);
        }
        if (class457.field6711 != null) {
            class314 var10 = class457.field6711.method1318(arg1, -1);
            if (var10 == null) {
                var10 = class466.field6840;
            }
            var10.method1948(class457.field6711.field2720, class457.field6711.field2672, class88.field1197, class517.field7617, class436.field6393, class351.field4868, class49.field546, var2, class457.field6711.field2604, class457.field6711.field2711, class457.field6711.field2616, class457.field6711.field2669, -23980, class503.field7462, class188.field2768);
            class410.method2512(class503.field7462[0], true, class503.field7462[3], class503.field7462[2], class503.field7462[1]);
        } else if (class412.field6113 != null && class68.field872 == class61.field703) {
            int var9 = class466.field6840.method1953(class49.field546, class436.field6393, 0, class517.field7617, class88.field1197, var2, 0, 16777215, class221.field3176 + 4, class208.field3015 - -16);
            class410.method2512(class221.field3176 + 4, true, 16, class387.field5731.method1969(-1, var2) + var9, class208.field3015);
            return;
        }
    }
}
