import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class495 implements class660 {

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public int field6332;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field6333 = 0;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "F")
    public static float field6329;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
    public static final void method2753(byte arg0) {
        for (class53 var1 = (class53) class409.field5429.method3591(0); var1 != null; var1 = (class53) class409.field5429.method3600((byte) 52)) {
            if (var1.field696) {
                var1.method332((byte) 125);
            }
        }
        field6330++;
        for (class53 var2 = (class53) class418.field5515.method3591(0); var2 != null; var2 = (class53) class418.field5515.method3600((byte) 66)) {
            if (var2.field696) {
                var2.method332((byte) 105);
            }
        }
        int var3 = 54 / ((-arg0 - 70) / 39);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
    public static final void method2754() {
        byte var0 = 10;
        byte var1 = 30;
        if (class689.field8858 == 0 || class28.field243 == null) {
            return;
        }
        class398.field5275.method924(class497.field6360);
        for (int var2 = 0; var2 < class309.field3868.length; var2++) {
            class398.field5275.method3065(class497.field6360[1], -256, class497.field6360[3] - class497.field6360[1], (byte) 17, class45.field507[var2] + class309.field3868[var2]);
        }
        for (int var3 = 0; var3 < class216.field2943; var3++) {
            class318 var11 = class656.field8454[var3];
            class398.field5275.method901(var11.field3960[0], var11.field3958[0], var11.field3968[0], class155.field1973);
            class398.field5275.method901(var11.field3960[1], var11.field3958[1], var11.field3968[1], class200.field2773);
            class398.field5275.method901(var11.field3960[2], var11.field3958[2], var11.field3968[2], class226.field3063);
            class398.field5275.method901(var11.field3960[3], var11.field3958[3], var11.field3968[3], class288.field3684);
            if (class155.field1973[2] != -1 && class200.field2773[2] != -1 && class226.field3063[2] != -1 && class288.field3684[2] != -1) {
                int var12 = -65536;
                if (var11.field3964 == 4) {
                    var12 = -16776961;
                }
                class398.field5275.method3066(var12, class200.field2773[1], class155.field1973[0], class200.field2773[0], class155.field1973[1], (byte) 123);
                class398.field5275.method3066(var12, class226.field3063[1], class200.field2773[0], class226.field3063[0], class200.field2773[1], (byte) 125);
                class398.field5275.method3066(var12, class288.field3684[1], class226.field3063[0], class288.field3684[0], class226.field3063[1], (byte) 126);
                class398.field5275.method3066(var12, class155.field1973[1], class288.field3684[0], class155.field1973[0], class288.field3684[1], (byte) 125);
                class398.field5275.method3066(var12, class226.field3063[1], class155.field1973[0], class226.field3063[0], class155.field1973[1], (byte) 120);
            }
        }
        class28.field243.method2419(var1 + 45, -256, "Dynamic: " + class100.field1332 + "/" + 5000, -54, var0, -16777216);
        class28.field243.method2419(var1 + 60, -256, "Total Opaque Onscreen: " + class304.field3830 + "/" + 10000, -7, var0, -16777216);
        class28.field243.method2419(var1 + 75, -256, "Total Trans Onscreen: " + class418.field5516 + "/" + 5000, -123, var0, -16777216);
        class28.field243.method2419(var1 + 90, -256, "Occluders: " + (class779.field10635 + class269.field3552) + " Active: " + class216.field2943, -113, var0, -16777216);
        class28.field243.method2419(var1 + 105, -256, "Occluded: Ground:" + class34.field386 + " Walls: " + class700.field9276 + " CPs: " + class6.field64 + " Pixels: " + class430.field5647, -114, var0, -16777216);
        class28.field243.method2419(var1 + 120, -256, "Occlude Calc Took: " + class469.field6107 / 1000L + "us", -23, var0, -16777216);
        if (class689.field8858 != 2 || class380.field4659 == null) {
            return;
        }
        for (int var4 = 0; var4 < class380.field4659.length; var4++) {
            float var6 = (float) class380.field4659[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class380.field4659[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class772 var5 = class398.field5275.method3078((byte) 71, class317.field3953, class566.field7172, class380.field4659, 0, class566.field7172);
        var5.method616(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(I)V")
    public class495(int arg0) {
        this.field6332 = arg0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)Lgp;")
    public final class576 method3(byte arg0) {
        if (arg0 > -15) {
            this.method3((byte) 52);
        }
        field6331++;
        return class169.field2250;
    }
}
