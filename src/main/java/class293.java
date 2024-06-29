import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class293 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "S")
    public static short field4248 = 256;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4254 = null;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field4256 = 0;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field4255 = -1;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lqb;")
    public static class135 field4252;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[Lnm;")
    public static class304[] field4249;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lck;I)V")
    public static final void method1825(class419 arg0, int arg1) {
        if (arg1 != 768919016) {
            method1825((class419) null, -128);
        }
        arg0.method2459(arg1 - 768919016);
        field4250++;
        int var2 = class295.field4273;
        class452 var3 = class492.field6935 = class124.field1559[var2] = new class452();
        var3.field2154 = var2;
        int var4 = arg0.method2464(30, 0);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field2163[0] = var6 - class240.field3602;
        var3.field4331 = (var3.field2163[0] << 7) + (var3.method918(false) << 6);
        var3.field2159[0] = var7 - class360.field5180;
        var3.field4317 = (var3.field2159[0] << 7) + (var3.method918(false) << 6);
        class29.field394 = var3.field4319 = var5;
        if (class486.field6847[var2] != null) {
            var3.method2647((byte) -128, class486.field6847[var2]);
        }
        class37.field491 = 0;
        class348.field5033[class37.field491++] = var2;
        class317.field4594[var2] = 0;
        class282.field4151 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2464(18, 0);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF09) >> 8;
                int var12 = var9 & 0xFF;
                class139.field1830[var8] = (var10 << 28) + (var11 << 14) + var12;
                class51.field705[var8] = 0;
                class359.field5163[var8] = -1;
                class427.field5979[class282.field4151++] = var8;
                class317.field4594[var8] = 0;
            }
        }
        arg0.method2465(false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method1826(byte arg0) {
        if (arg0 > 11) {
            field4252 = null;
            field4249 = null;
            field4254 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ldt;ILdt;)V")
    public static final void method1827(class145 arg0, int arg1, class145 arg2) {
        field4253++;
        if (arg1 != 0) {
            method1826((byte) 91);
        }
        class259.field3793++;
        class15.method110(class180.field2597, -125);
        class225.field3415.method1744(arg2.field1933, true);
        class225.field3415.method1711(false, arg0.field2016);
        class225.field3415.method1752(arg0.field1933, 25580);
        class225.field3415.method1689(arg0.field1951, (byte) 116);
        class225.field3415.method1711(false, arg2.field2016);
        class225.field3415.method1724((byte) 68, arg2.field1951);
    }
}
