import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class44 extends class665 {

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lwba;")
    public class46 field705 = new class46();

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "F")
    public static float field703;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "Lf;")
    public static class702 field706;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "[I")
    public static int[] field708;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "()V")
    public static final void method469() {
        byte var0 = 10;
        byte var1 = 30;
        if (class248.field3861 == null) {
            return;
        }
        class682.field9618.method204(class383.field5414);
        for (int var2 = 0; var2 < class665.field9385.length; var2++) {
            class682.field9618.method1155(class383.field5414[3] - class383.field5414[1], 8, class665.field9385[var2] + class279.field4216[var2], class383.field5414[1], -256);
        }
        for (int var3 = 0; var3 < class266.field4020; var3++) {
            class327 var11 = class612.field8574[var3];
            class682.field9618.method214(var11.field4846[0], var11.field4839[0], var11.field4840[0], class375.field5346);
            class682.field9618.method214(var11.field4846[1], var11.field4839[1], var11.field4840[1], class240.field3755);
            class682.field9618.method214(var11.field4846[2], var11.field4839[2], var11.field4840[2], class167.field2421);
            class682.field9618.method214(var11.field4846[3], var11.field4839[3], var11.field4840[3], class182.field2576);
            if (class375.field5346[2] != -1 && class240.field3755[2] != -1 && class167.field2421[2] != -1 && class182.field2576[2] != -1) {
                int var12 = -65536;
                if (var11.field4835 == 4) {
                    var12 = -16776961;
                }
                class682.field9618.method1151(class375.field5346[0], class240.field3755[1], var12, class375.field5346[1], (byte) -127, class240.field3755[0]);
                class682.field9618.method1151(class240.field3755[0], class167.field2421[1], var12, class240.field3755[1], (byte) -118, class167.field2421[0]);
                class682.field9618.method1151(class167.field2421[0], class182.field2576[1], var12, class167.field2421[1], (byte) -126, class182.field2576[0]);
                class682.field9618.method1151(class182.field2576[0], class375.field5346[1], var12, class182.field2576[1], (byte) -117, class375.field5346[0]);
                class682.field9618.method1151(class375.field5346[0], class167.field2421[1], var12, class375.field5346[1], (byte) -110, class167.field2421[0]);
            }
        }
        class248.field3861.method2492(-256, "Static Opaque: OW: " + class313.field4626[0] + "/" + class70.field1250[0] + " UW: " + class313.field4626[1] + "/" + class70.field1250[1], var0, -16777216, (byte) -126, var1);
        class248.field3861.method2492(-256, "Static Trans: OW: " + class59.field1130[0] + "/" + class162.field2322[0] + " UW: " + class59.field1130[1] + "/" + class162.field2322[1], var0, -16777216, (byte) -114, var1 + 15);
        class248.field3861.method2492(-256, "Static Anim: OW: " + class127.field1896[0] + "/" + class200.field2828[0] + " UW: " + class127.field1896[1] + "/" + class200.field2828[1], var0, -16777216, (byte) -109, var1 + 30);
        class248.field3861.method2492(-256, "Dynamic: " + class282.field4237 + "/" + 5000, var0, -16777216, (byte) -107, var1 + 45);
        class248.field3861.method2492(-256, "Total Opaque Onscreen: " + class224.field3157 + "/" + 10000, var0, -16777216, (byte) -117, var1 + 60);
        class248.field3861.method2492(-256, "Total Trans Onscreen: " + class460.field6580 + "/" + 5000, var0, -16777216, (byte) -119, var1 + 75);
        class248.field3861.method2492(-256, "Occluders: " + (class9.field94 + class186.field2673) + " Active: " + class266.field4020, var0, -16777216, (byte) -123, var1 + 90);
        class248.field3861.method2492(-256, "Occluded: Ground:" + class56.field1093 + " Walls: " + class376.field5359 + " CPs: " + class109.field1669 + " Pixels: " + class416.field6031, var0, -16777216, (byte) -124, var1 + 105);
        class248.field3861.method2492(-256, "Occlude Calc Took: " + class598.field8454 / 1000L + "us", var0, -16777216, (byte) -108, var1 + 120);
        if (class704.field9914 == null) {
            return;
        }
        for (int var4 = 0; var4 < class704.field9914.length; var4++) {
            float var6 = (float) class704.field9914[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class704.field9914[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class702 var5 = class682.field9618.method209(class704.field9914, 0, class235.field3639, class235.field3639, class405.field5935);
        var5.method929(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static void method470(int arg0) {
        field706 = null;
        if (arg0 > -101) {
            method470(-14);
        }
        field708 = null;
    }
}
