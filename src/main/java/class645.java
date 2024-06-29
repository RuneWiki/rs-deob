import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class645 {

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "[I")
    public static int[] field8983 = new int[8];

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "Lni;")
    public static class522 field8984;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "[I")
    public static int[] field8982;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "()V", line = 4)
    public static final void method3640() {
        byte var0 = 10;
        byte var1 = 30;
        if (class223.field2880 == 0 || class343.field4609 == null) {
            return;
        }
        class22.field158.method398(class426.field6017);
        for (int var2 = 0; var2 < class281.field3729.length; var2++) {
            class22.field158.method361(8479, class426.field6017[1], class281.field3729[var2] + class116.field1540[var2], -256, class426.field6017[3] - class426.field6017[1]);
        }
        for (int var3 = 0; var3 < class501.field6815; var3++) {
            class620 var11 = class462.field6395[var3];
            class22.field158.method451(var11.field8692[0], var11.field8689[0], var11.field8694[0], class655.field9137);
            class22.field158.method451(var11.field8692[1], var11.field8689[1], var11.field8694[1], class233.field3024);
            class22.field158.method451(var11.field8692[2], var11.field8689[2], var11.field8694[2], class324.field4354);
            class22.field158.method451(var11.field8692[3], var11.field8689[3], var11.field8694[3], class69.field757);
            if (class655.field9137[2] != -1 && class233.field3024[2] != -1 && class324.field4354[2] != -1 && class69.field757[2] != -1) {
                int var12 = -65536;
                if (var11.field8696 == 4) {
                    var12 = -16776961;
                }
                class22.field158.method405(class655.field9137[1], var12, class233.field3024[1], class233.field3024[0], -10550, class655.field9137[0]);
                class22.field158.method405(class233.field3024[1], var12, class324.field4354[1], class324.field4354[0], -10550, class233.field3024[0]);
                class22.field158.method405(class324.field4354[1], var12, class69.field757[1], class69.field757[0], -10550, class324.field4354[0]);
                class22.field158.method405(class69.field757[1], var12, class655.field9137[1], class655.field9137[0], -10550, class69.field757[0]);
                class22.field158.method405(class655.field9137[1], var12, class324.field4354[1], class324.field4354[0], -10550, class655.field9137[0]);
            }
        }
        class343.field4609.method475((byte) -118, var1 + 45, "Dynamic: " + class320.field4304 + "/" + 5000, -256, -16777216, var0);
        class343.field4609.method475((byte) 62, var1 + 60, "Total Opaque Onscreen: " + class735.field10260 + "/" + 10000, -256, -16777216, var0);
        class343.field4609.method475((byte) 46, var1 + 75, "Total Trans Onscreen: " + class540.field7311 + "/" + 5000, -256, -16777216, var0);
        class343.field4609.method475((byte) 78, var1 + 90, "Occluders: " + (class387.field5458 + class282.field3738) + " Active: " + class501.field6815, -256, -16777216, var0);
        class343.field4609.method475((byte) 84, var1 + 105, "Occluded: Ground:" + class735.field10252 + " Walls: " + class426.field6010 + " CPs: " + class460.field6373 + " Pixels: " + class51.field536, -256, -16777216, var0);
        class343.field4609.method475((byte) 78, var1 + 120, "Occlude Calc Took: " + class199.field2360 / 1000L + "us", -256, -16777216, var0);
        if (class223.field2880 != 2 || class648.field9025 == null) {
            return;
        }
        for (int var4 = 0; var4 < class648.field9025.length; var4++) {
            float var6 = (float) class648.field9025[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class648.field9025[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class680 var5 = class22.field158.method351(-7962, 0, class38.field394, class547.field7720, class648.field9025, class38.field394);
        var5.method677(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 90)
    public static void method3641(int arg0) {
        field8982 = null;
        if (arg0 <= 97) {
            method3640();
        }
        field8983 = null;
        field8984 = null;
    }
}
