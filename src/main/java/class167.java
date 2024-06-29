import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class167 {

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2576 = -1;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lua;")
    public static class83 field2572;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[B")
    public byte[] field2570;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[B")
    public byte[] field2578;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILuk;II)V")
    public static final void method1139(int arg0, class86 arg1, int arg2, int arg3) {
        if (arg1.field3987 == arg0 && arg0 != -1) {
            class57 var4 = class174.method1241(20, arg0);
            int var5 = var4.field839;
            if (var5 == 1) {
                arg1.field3980 = 0;
                arg1.field3932 = 0;
                arg1.field3977 = arg3;
                arg1.field3973 = 1;
                arg1.field3899 = 0;
                class173.method1240(arg1.field3915, arg1.field3920, -9160, false, var4, arg1.field3980);
            }
            if (var5 == 2) {
                arg1.field3899 = 0;
            }
        } else if (arg0 == -1 || arg1.field3987 == -1 || class174.method1241(72, arg0).field833 >= class174.method1241(55, arg1.field3987).field833) {
            arg1.field3976 = arg1.field3974;
            arg1.field3987 = arg0;
            arg1.field3977 = arg3;
            arg1.field3932 = 0;
            arg1.field3973 = 1;
            arg1.field3980 = 0;
            arg1.field3899 = 0;
            if (arg1.field3987 != -1) {
                class173.method1240(arg1.field3915, arg1.field3920, -9160, false, class174.method1241(90, arg1.field3987), arg1.field3980);
            }
        }
        int var6 = 82 % ((-arg2 - 39) / 50);
        field2583++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lfe;I)V")
    public static final void method1140(class231 arg0, int arg1) {
        class231 var2 = class123.method799(arg0, 12094);
        field2581++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class126.field1814;
            var4 = class112.field1626;
        } else {
            var4 = var2.field3730;
            var3 = var2.field3686;
        }
        class179.method1271(31582, false, var3, var4, arg0);
        class122.method793(var4, var3, true, arg0);
        if (arg1 != 50) {
            method1142((byte) 42);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
    public static final int method1141(int arg0) {
        field2574++;
        if (arg0 >= -127) {
            method1141(-5);
        }
        return class49.field626.method1520((byte) 108);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method1142(byte arg0) {
        field2575++;
        class163.method1129(false, 5);
        class162.method1106(5, -127);
        class82.method554(-29288, 5);
        class68.method452(5, -124);
        class272.method1894(5, 1);
        class298.method2007(0, 5);
        class313.method2101(5, true);
        class118.method777(5, -4);
        class190.method1326(5, 0);
        if (arg0 <= 100) {
            field2576 = 111;
        }
        class303.method2036(5, -3);
        class211.method1462(112, 5);
        class74.method517(1186334566, 5);
        class217.method1524(-20, 5);
        class55.method361(5, 2048);
        class135.method857(5, 88);
        class23.method125(5, (byte) -99);
        class121.method790(5, (byte) 99);
        class295.method1991(5, false);
        class112.method746((byte) 86, 50);
        class8.method46(5, -1);
        class32.method168((byte) -109, 5);
        class122.field1748.method1514(5, (byte) -55);
        class21.field272.method1514(5, (byte) -55);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static void method1143(byte arg0) {
        field2572 = null;
        if (arg0 <= 62) {
            method1140((class231) null, -18);
        }
    }
}
