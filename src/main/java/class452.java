import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class452 extends class418 {

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Z")
    public static boolean field6560 = true;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
    public static int[] field6562 = new int[6];

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public int field6557;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public int field6561;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public int field6572;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public int field6573;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "Lsj;")
    public class248 field6569;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "Lsj;")
    public class248 field6571;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Leb;")
    public static class386 field6556;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Ljava/lang/String;")
    public String field6558;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "Z")
    public boolean field6564;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[Lhm;")
    public static class196[] field6563;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field6570;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "[S")
    public static short[] field6566;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static void method2807(int arg0) {
        field6563 = null;
        field6556 = null;
        field6566 = null;
        if (arg0 != 0) {
            method2807(-30);
        }
        field6562 = null;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public static final void method2808(int arg0) {
        class228.method1485(0);
        field6559++;
        class118.method860((byte) 118);
        class362.method2380(0);
        class93.method747(100);
        class246.method1609(true);
        class320.method2107(false);
        class161.method1079(-37);
        class326.method2140(28806);
        class48.method346(1024);
        class362.method2382(116);
        class51.method368(arg0 - 26132);
        class236.method1533(124);
        class312.method2055((byte) 125);
        class186.method1242((byte) -67);
        class391.method2520(true);
        class228.method1486(-19017);
        class425.method2668(arg0 ^ 0x5E);
        class321.method2117(28862);
        class92.method741(arg0 ^ 0xFFFFFFFE);
        class246.method1606((byte) -114);
        class159.method1066(0);
        class268.method1789(arg0);
        if (class173.field2353 != 0) {
            for (int var1 = 0; var1 < class318.field4677.length; var1++) {
                class318.field4677[var1] = null;
            }
            class389.field5690 = 0;
        }
        class71.method586(~arg0);
        class93.method753(arg0 + 1);
        class353.method2327(-4698);
        class393.method2526(2);
        class347.method2295(false);
        class293.field4436.method372(arg0 + 117);
        class126.field1647.method456();
        class144.field1827.method2345(false);
        class217.method1430(1013274631);
        class277.field4061.method1211(0);
        class58.field869.method1211(0);
        class90.field1225.method1211(arg0);
        class95.field1293.method1211(0);
        class14.field228.method1211(0);
        class68.field992.method1211(0);
        class388.field5677.method1211(0);
        class115.field1497.method1211(0);
        class118.field1532.method1211(arg0);
        class273.field4007.method1211(0);
        class198.field2730.method1211(arg0);
        class394.field5733.method1211(arg0);
        class266.field3954.method1211(arg0);
        class341.field5043.method1211(0);
        class122.field1582.method1211(0);
        class107.field1408.method1211(0);
        class132.field1733.method1211(0);
        class184.field2475.method1211(0);
        class289.field4332.method1211(0);
        class60.field924.method1211(0);
        class112.field1440.method1211(arg0);
        class100.field1323.method1211(0);
        class386.field5647.method1211(0);
        class299.field4523.method1211(0);
        class198.field2737.method1211(0);
        class350.field5206.method1211(0);
        class350.field5209.method1211(0);
        class107.field1412.method1211(0);
        class81.field1117.method1211(0);
        class66.field981.method372(arg0 + 117);
        class235.field3278.method372(114);
        class278.field4074.method372(arg0 ^ 0x7F);
        class258.field3801.method372(116);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(DB)V")
    public static final void method2809(double arg0, byte arg1) {
        field6568++;
        int var3 = -27 / ((38 - arg1) / 42);
        if (class16.field266 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
            class185.field2482[var4] = var5 <= 255 ? var5 : 255;
        }
        class16.field266 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BZ)V")
    public static final void method2810(byte arg0, boolean arg1) {
        class140.field1797.method1833(-20379, 82);
        class84.field1158++;
        field6567++;
        for (class28 var2 = (class28) class242.field3402.method2812(15710); var2 != null; var2 = (class28) class242.field3402.method2819((byte) 104)) {
            if (!var2.method2633(true)) {
                var2 = (class28) class242.field3402.method2812(15710);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field483 == 0) {
                class93.method751(var2, true, (byte) -59, arg1);
            }
        }
        if (arg0 < 67) {
            method2807(77);
        }
        if (class415.field6015 != null) {
            class92.method744(20491, class415.field6015);
            class415.field6015 = null;
        }
    }
}
