import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class339 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lao;")
    public static class191 field4483 = new class191(80, 3);

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4487 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4485 = null;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4486 = -1;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[Lir;")
    public static class22[] field4484 = new class22[32768];

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[[S")
    public static short[][] field4490 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[[Ljk;")
    public static class450[][] field4491;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIB)V")
    public static final void method1974(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4488++;
        for (int var5 = 0; var5 < class266.field3569; var5++) {
            Rectangle var7 = class331.field4393[var5];
            if (arg2 < (var7.x + var7.width) && var7.x < (arg0 + arg2) && (var7.y + var7.height) > arg1 && arg1 + arg3 > var7.y) {
                class114.field1496[var5] = true;
            }
        }
        int var6 = 110 % ((arg4 + 50) / 56);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final void method1975(byte arg0) {
        class279.field3702.method2897(5, -3);
        field4489++;
        class144.field1914.method2175(5, -116);
        class453.field6782.method1484(7, 5);
        class123.field1593.method2914(5, 10123);
        class87.field1032.method1675(false, 5);
        class237.field3158.method230(5, (byte) 117);
        class7.field97.method2955(true, 5);
        class71.field914.method1610(5, false);
        class373.field5063.method681(32011, 5);
        class180.field2350.method800(5, (byte) -92);
        class254.field3381.method1922(5, -12565);
        class60.field698.method994((byte) -89, 5);
        if (arg0 > -100) {
            field4483 = null;
        }
        class465.field6927.method499(119, 5);
        class104.field1405.method447(5, 45);
        class468.field6947.method1080((byte) 87, 5);
        client.field2571.method2820(true, 5);
        class333.field4407.method2504(5, 4);
        class211.field2834.method1623(19562, 5);
        class211.field2827.method1342(5, -49);
        class505.field7341.method1570(5, 26);
        class254.method1574((byte) 119, 5);
        class390.method2360(-89, 50);
        class528.method3132(5, 0);
        class509.method3031(-127, 5);
        class68.field784.method3036(5, (byte) -78);
        class347.field4619.method3036(5, (byte) -43);
        class312.field4168.method3036(5, (byte) -106);
        class266.field3565.method3036(5, (byte) -29);
        class432.field6300.method3036(5, (byte) -13);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1976(int arg0) {
        if (arg0 != 4190) {
            method1975((byte) -120);
        }
        field4485 = null;
        field4490 = null;
        field4483 = null;
        field4484 = null;
        field4491 = null;
    }
}
