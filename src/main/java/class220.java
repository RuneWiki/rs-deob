import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class220 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[S")
    public static short[] field3807 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Loh;")
    public static class258 field3811 = class153.method1046("hint_headicons", 89);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Loh;")
    public static class258 field3806 = class153.method1046("l", 115);

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Loh;")
    public static class258 field3813 = class153.method1046("::wm3", 125);

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Loh;")
    public static class258 field3814 = class153.method1046("Schrifts-=tze geladen)3", 107);

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Loh;")
    public static class258 field3812 = class153.method1046("blinken2:", 120);

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Loh;")
    public static class258 field3817 = class153.method1046("lila:", 112);

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII)V", line = 26)
    public static final void method1490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class206.field3557 < 100) {
            class30.method220((byte) -70);
        }
        field3810++;
        if (class257.field4390) {
            class296.method2085(arg2, arg3, arg1 + arg2, arg3 + arg4);
        } else {
            class211.method1414(arg2, arg3, arg1 + arg2, arg3 - -arg4);
        }
        if (class206.field3557 < 100) {
            int var5 = arg1 / 2 + arg2;
            byte var6 = 20;
            int var7 = arg4 / 2 + arg3 - var6 - 18;
            if (class257.field4390) {
                class296.method2096(arg2, arg3, arg1, arg4, 0);
                class296.method2084(var5 - 152, var7, 304, 34, 9179409);
                class296.method2084(var5 - 151, var7 + 1, 302, 32, 0);
                class296.method2096(var5 - 150, var7 + 2, class206.field3557 * 3, 30, 9179409);
                class296.method2096(class206.field3557 * 3 + var5 - 150, var7 + 2, 300 - (class206.field3557 * 3), 30, 0);
            } else {
                class211.method1398(arg2, arg3, arg1, arg4, 0);
                class211.method1404(var5 - 152, var7, 304, 34, 9179409);
                class211.method1404(var5 - 151, var7 + 1, 302, 32, 0);
                class211.method1398(var5 - 150, var7 + 2, class206.field3557 * 3, 30, 9179409);
                class211.method1398(var5 - (150 - class206.field3557 * 3), var7 + 2, 300 - (class206.field3557 * 3), 30, 0);
            }
            class123.field2180.method260(class83.field1409, var5, var6 + var7, 16777215, -1);
            return;
        }
        class139.field2367 = class176.field3163 - ((int) ((float) arg4 / class121.field2139));
        class61.field1043 = (int) ((float) (arg1 * 2) / class121.field2139);
        class194.field3419 = (int) ((float) (arg4 * 2) / class121.field2139);
        class122.field2153 = class165.field2784 - (int) ((float) arg1 / class121.field2139);
        int var8 = class165.field2784 - ((int) ((float) arg1 / class121.field2139));
        int var9 = class176.field3163 - ((int) ((float) arg4 / class121.field2139));
        int var10 = (int) ((float) arg4 / class121.field2139) + class176.field3163;
        int var11 = class165.field2784 + ((int) ((float) arg1 / class121.field2139));
        if (class257.field4390) {
            if (class85.field1448 == null || class85.field1448.field1141 != arg1 || class85.field1448.field1148 != arg4) {
                class85.field1448 = null;
                class85.field1448 = new class274(arg1, arg4);
            }
            class211.method1413(class85.field1448.field573, arg1, arg4);
            class118.method871(0, arg4, var10, 0, true, var11, arg1, var9, var8);
            class258.method1804(0, arg4, var11, var10, var8, arg1, var9, 0, -125);
            class313.method2167(var8, -121, var10, arg4, 0, var11, var9, 0, arg1);
            class85.field1448.method321(arg2, arg3);
        } else {
            class118.method871(arg2, arg3 + arg4, var10, arg3, true, var11, arg1 + arg2, var9, var8);
            class258.method1804(arg3, arg3 + arg4, var11, var10, var8, arg1 + arg2, var9, arg2, 33);
            class313.method2167(var8, -119, var10, arg3 + arg4, arg2, var11, var9, arg3, arg1 + arg2);
        }
        if (arg0 >= -109) {
            return;
        }
        if (class61.field1090 > 0) {
            class61.field1090--;
        }
        if (!class282.field4843) {
            return;
        }
        int var12 = arg1 + arg2 - 5;
        int var13 = arg3 + arg4 - 8;
        class44.field662.method246(class100.method755(-6, new class258[] { class203.field3528, class218.method1481(108, class149.field2533) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class44.field662.method246(class100.method755(-6, new class258[] { class23.field292, class218.method1481(105, var15), class301.field5158 }), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 155)
    public static void method1491(byte arg0) {
        if (arg0 != -31) {
            method1491((byte) -90);
        }
        field3814 = null;
        field3812 = null;
        field3811 = null;
        field3806 = null;
        field3817 = null;
        field3813 = null;
        field3807 = null;
    }
}
