import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class137 extends class272 {

    @OriginalMember(owner = "client!an", name = "n", descriptor = "F")
    public static float field1832;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "Lpl;")
    public static class617 field1831;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(B)V")
    public static void method888(byte arg0) {
        int var1 = -12 % ((arg0 + 54) / 40);
        field1831 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
    public static final void method889() {
        byte var0 = 10;
        byte var1 = 30;
        if (class577.field8262 == 0 || class369.field4718 == null) {
            return;
        }
        class646.field9160.method2163(class644.field9143);
        for (int var2 = 0; var2 < class678.field9554.length; var2++) {
            class646.field9160.method3260(101, class678.field9554[var2] + class619.field8818[var2], -256, class644.field9143[3] - class644.field9143[1], class644.field9143[1]);
        }
        for (int var3 = 0; var3 < class75.field1036; var3++) {
            class27 var11 = class313.field4023[var3];
            class646.field9160.method2131(var11.field357[0], var11.field358[0], var11.field352[0], class298.field3894);
            class646.field9160.method2131(var11.field357[1], var11.field358[1], var11.field352[1], class82.field1116);
            class646.field9160.method2131(var11.field357[2], var11.field358[2], var11.field352[2], class14.field198);
            class646.field9160.method2131(var11.field357[3], var11.field358[3], var11.field352[3], class98.field1427);
            if (class298.field3894[2] != -1 && class82.field1116[2] != -1 && class14.field198[2] != -1 && class98.field1427[2] != -1) {
                int var12 = -65536;
                if (var11.field351 == 4) {
                    var12 = -16776961;
                }
                class646.field9160.method3259(class298.field3894[1], class82.field1116[1], class298.field3894[0], class82.field1116[0], (byte) -91, var12);
                class646.field9160.method3259(class82.field1116[1], class14.field198[1], class82.field1116[0], class14.field198[0], (byte) -91, var12);
                class646.field9160.method3259(class14.field198[1], class98.field1427[1], class14.field198[0], class98.field1427[0], (byte) -91, var12);
                class646.field9160.method3259(class98.field1427[1], class298.field3894[1], class98.field1427[0], class298.field3894[0], (byte) -91, var12);
                class646.field9160.method3259(class298.field3894[1], class14.field198[1], class298.field3894[0], class14.field198[0], (byte) -91, var12);
            }
        }
        class369.field4718.method2427(648, var0, "Static Opaque: OW: " + class269.field3635[0] + "/" + class560.field7960[0] + " UW: " + class269.field3635[1] + "/" + class560.field7960[1], var1, -256, -16777216);
        class369.field4718.method2427(648, var0, "Static Trans: OW: " + class352.field4548[0] + "/" + class380.field5356[0] + " UW: " + class352.field4548[1] + "/" + class380.field5356[1], var1 + 15, -256, -16777216);
        class369.field4718.method2427(648, var0, "Static Anim: OW: " + class609.field8671[0] + "/" + class416.field5788[0] + " UW: " + class609.field8671[1] + "/" + class416.field5788[1], var1 + 30, -256, -16777216);
        class369.field4718.method2427(648, var0, "Dynamic: " + class354.field4557 + "/" + 5000, var1 + 45, -256, -16777216);
        class369.field4718.method2427(648, var0, "Total Opaque Onscreen: " + class556.field7850 + "/" + 10000, var1 + 60, -256, -16777216);
        class369.field4718.method2427(648, var0, "Total Trans Onscreen: " + class706.field9853 + "/" + 5000, var1 + 75, -256, -16777216);
        class369.field4718.method2427(648, var0, "Occluders: " + (class679.field9573 + class163.field2248) + " Active: " + class75.field1036, var1 + 90, -256, -16777216);
        class369.field4718.method2427(648, var0, "Occluded: Ground:" + class27.field355 + " Walls: " + class114.field1607 + " CPs: " + class158.field2144 + " Pixels: " + class129.field1762, var1 + 105, -256, -16777216);
        class369.field4718.method2427(648, var0, "Occlude Calc Took: " + class437.field5997 / 1000L + "us", var1 + 120, -256, -16777216);
        if (class577.field8262 != 2 || class185.field2719 == null) {
            return;
        }
        for (int var4 = 0; var4 < class185.field2719.length; var4++) {
            float var6 = (float) class185.field2719[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class185.field2719[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class21 var5 = class646.field9160.method3258(class185.field2719, 1, 0, class102.field1460, class102.field1460, class690.field9668);
        var5.method104(var0, 170, 1, 0, 0);
    }
}
