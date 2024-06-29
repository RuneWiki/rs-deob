import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class366 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lpa;")
    public static class336 field5232 = new class336();

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ldg;")
    public static class376 field5233 = new class376(44, 7);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "F")
    public static float field5234;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method2218(byte arg0) {
        field5233 = null;
        if (arg0 == 81) {
            field5232 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2219(String arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            class282.field4228 = class166.method1156(class373.field5324, class31.field486, class231.field3600, (byte) 20, class287.field4270.field3706 * 2, 0);
            if (arg0 != null) {
                class282.field4228.method139(0);
                class146 var10 = class652.method3605(0, (byte) 88, class81.field1363, class132.field1956);
                class416 var11 = class282.field4228.method128(var10, class113.method884(class703.field9909, class132.field1956, 0), true);
                class157.method1089(0);
                class140.method1015(var11, true, var10, class282.field4228, (byte) 69, arg0);
            }
        } else {
            class166 var3 = null;
            if (arg0 != null) {
                var3 = class166.method1156(class373.field5324, class31.field486, class231.field3600, (byte) 20, 0, 0);
                var3.method139(0);
                class146 var4 = class652.method3605(0, (byte) 88, class81.field1363, class132.field1956);
                class416 var5 = var3.method128(var4, class113.method884(class703.field9909, class132.field1956, 0), true);
                class157.method1089(0);
                class140.method1015(var5, true, var4, var3, (byte) 39, arg0);
            }
            try {
                class282.field4228 = class166.method1156(class373.field5324, class31.field486, class231.field3600, (byte) 20, class287.field4270.field3706 * 2, arg1);
                if (arg0 != null) {
                    var3.method139(0);
                    class146 var6 = class652.method3605(0, (byte) 88, class81.field1363, class132.field1956);
                    class416 var7 = var3.method128(var6, class113.method884(class703.field9909, class132.field1956, 0), true);
                    class157.method1089(0);
                    class140.method1015(var7, true, var6, var3, (byte) 89, arg0);
                }
                if (class282.field4228.method123()) {
                    boolean var8 = true;
                    try {
                        var8 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class492 var9;
                    if (var8) {
                        var9 = class282.field4228.method120(146800640);
                    } else {
                        var9 = class282.field4228.method120(104857600);
                    }
                    class282.field4228.method196(var9);
                }
            } catch (Throwable var14) {
                class282.field4228 = class166.method1156(class373.field5324, class31.field486, class231.field3600, (byte) 20, 0, 0);
                arg1 = 0;
            }
            if (var3 != null) {
                try {
                    var3.method1154(false);
                } catch (Throwable var12) {
                }
            }
        }
        field5231++;
        class328.field4859 = arg1;
        if (arg2 != 7394) {
            field5234 = 0.36460605F;
        }
        class77.method709(8);
        class282.field4228.method154(32);
        class318.field4690 = class282.field4228.method100();
        class303.field4524 = class282.field4228.method100();
        class682.method3774(200);
        class282.field4228.method125(!class287.field4270.field3694);
        if (class282.field4228.method216()) {
            class224.method1479(class287.field4270.field3700, arg2 ^ 0x5E9A);
        }
        class228.method1535(3, class232.field3611 >> 3, class199.field2812 >> 3, class282.field4228);
        class646.method3587((byte) -124);
        class138.field2007 = null;
        class227.field3189 = false;
        class641.field9040 = true;
    }
}
