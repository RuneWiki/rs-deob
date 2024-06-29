import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class614 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
    private static int[] field8387 = new int[3];

    @OriginalMember(owner = "client!te", name = "d", descriptor = "F")
    public static float field8390;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 6)
    public static void method3481(int arg0) {
        if (arg0 != 25365) {
            field8388 = 100;
        }
        field8387 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lcm;Lcm;Z)V", line = 20)
    public static final void method3482(class726 arg0, class726 arg1, boolean arg2) {
        field8389++;
        if (arg1.field9830 != null) {
            arg1.method4018(false);
        }
        arg1.field9824 = arg0;
        if (!arg2) {
            field8387 = null;
        }
        arg1.field9830 = arg0.field9830;
        arg1.field9830.field9824 = arg1;
        arg1.field9824.field9830 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V", line = 43)
    public static final void method3483() {
        byte var0 = 10;
        byte var1 = 30;
        if (class340.field4790 == 0 || class130.field2182 == null) {
            return;
        }
        class44.field982.method206(class593.field8118);
        for (int var2 = 0; var2 < class691.field9346.length; var2++) {
            class44.field982.method620(class691.field9346[var2] + class488.field6756[var2], -256, class593.field8118[3] - class593.field8118[1], class593.field8118[1], true);
        }
        for (int var3 = 0; var3 < class454.field6412; var3++) {
            class546 var11 = class634.field8720[var3];
            class44.field982.method289(var11.field7524[0], var11.field7528[0], var11.field7521[0], class562.field7761);
            class44.field982.method289(var11.field7524[1], var11.field7528[1], var11.field7521[1], class633.field8704);
            class44.field982.method289(var11.field7524[2], var11.field7528[2], var11.field7521[2], field8387);
            class44.field982.method289(var11.field7524[3], var11.field7528[3], var11.field7521[3], class196.field2892);
            if (class562.field7761[2] != -1 && class633.field8704[2] != -1 && field8387[2] != -1 && class196.field2892[2] != -1) {
                int var12 = -65536;
                if (var11.field7529 == 4) {
                    var12 = -16776961;
                }
                class44.field982.method616(class562.field7761[1], class562.field7761[0], class633.field8704[0], -8003, var12, class633.field8704[1]);
                class44.field982.method616(class633.field8704[1], class633.field8704[0], field8387[0], -8003, var12, field8387[1]);
                class44.field982.method616(field8387[1], field8387[0], class196.field2892[0], -8003, var12, class196.field2892[1]);
                class44.field982.method616(class196.field2892[1], class196.field2892[0], class562.field7761[0], -8003, var12, class562.field7761[1]);
                class44.field982.method616(class562.field7761[1], class562.field7761[0], field8387[0], -8003, var12, field8387[1]);
            }
        }
        class130.field2182.method639("Dynamic: " + class612.field8367 + "/" + 5000, -256, var1 + 45, var0, -16777216, -120);
        class130.field2182.method639("Total Opaque Onscreen: " + class729.field9867 + "/" + 10000, -256, var1 + 60, var0, -16777216, -124);
        class130.field2182.method639("Total Trans Onscreen: " + class587.field8008 + "/" + 5000, -256, var1 + 75, var0, -16777216, -111);
        class130.field2182.method639("Occluders: " + (class85.field1531 + class239.field3493) + " Active: " + class454.field6412, -256, var1 + 90, var0, -16777216, -111);
        class130.field2182.method639("Occluded: Ground:" + class72.field1330 + " Walls: " + class553.field7607 + " CPs: " + class528.field7302 + " Pixels: " + class399.field5890, -256, var1 + 105, var0, -16777216, -115);
        class130.field2182.method639("Occlude Calc Took: " + class269.field3803 / 1000L + "us", -256, var1 + 120, var0, -16777216, -123);
        if (class340.field4790 != 2 || class747.field10344 == null) {
            return;
        }
        for (int var4 = 0; var4 < class747.field10344.length; var4++) {
            float var6 = (float) class747.field10344[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class747.field10344[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class496 var5 = class44.field982.method621(class359.field5179, class747.field10344, (byte) 94, 0, class359.field5179, class612.field8370);
        var5.method1200(var0, 170, 1, 0, 0);
    }
}
