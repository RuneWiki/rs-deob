import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class554 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Lwo;")
    public static class690 field8036 = new class690(66, 12);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lla;")
    public static class419 field8037;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3245(byte arg0) {
        if (arg0 < -25) {
            field8036 = null;
            field8037 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public static final void method3246() {
        byte var0 = 10;
        byte var1 = 30;
        if (class68.field1052 == null) {
            return;
        }
        class298.field4017.method251(class322.field4243);
        for (int var2 = 0; var2 < class91.field1281.length; var2++) {
            class298.field4017.method1045((byte) 71, class91.field1281[var2] + class271.field3715[var2], class322.field4243[3] - class322.field4243[1], -256, class322.field4243[1]);
        }
        for (int var3 = 0; var3 < class78.field1141; var3++) {
            class568 var11 = class677.field9705[var3];
            class298.field4017.method322(var11.field8306[0], var11.field8303[0], var11.field8310[0], class109.field1423);
            class298.field4017.method322(var11.field8306[1], var11.field8303[1], var11.field8310[1], class502.field7006);
            class298.field4017.method322(var11.field8306[2], var11.field8303[2], var11.field8310[2], class632.field9090);
            class298.field4017.method322(var11.field8306[3], var11.field8303[3], var11.field8310[3], class457.field6446);
            if (class109.field1423[2] != -1 && class502.field7006[2] != -1 && class632.field9090[2] != -1 && class457.field6446[2] != -1) {
                int var12 = -65536;
                if (var11.field8305 == 4) {
                    var12 = -16776961;
                }
                class298.field4017.method1048(var12, class502.field7006[0], class109.field1423[1], (byte) -51, class109.field1423[0], class502.field7006[1]);
                class298.field4017.method1048(var12, class632.field9090[0], class502.field7006[1], (byte) -113, class502.field7006[0], class632.field9090[1]);
                class298.field4017.method1048(var12, class457.field6446[0], class632.field9090[1], (byte) -100, class632.field9090[0], class457.field6446[1]);
                class298.field4017.method1048(var12, class109.field1423[0], class457.field6446[1], (byte) -118, class457.field6446[0], class109.field1423[1]);
                class298.field4017.method1048(var12, class632.field9090[0], class109.field1423[1], (byte) -120, class109.field1423[0], class632.field9090[1]);
            }
        }
        class68.field1052.method2515(-16777216, 0, -256, "Static Opaque: OW: " + class196.field2370[0] + "/" + class408.field5789[0] + " UW: " + class196.field2370[1] + "/" + class408.field5789[1], var1, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Static Trans: OW: " + class596.field8613[0] + "/" + class62.field1006[0] + " UW: " + class596.field8613[1] + "/" + class62.field1006[1], var1 + 15, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Static Anim: OW: " + class571.field8344[0] + "/" + class353.field4720[0] + " UW: " + class571.field8344[1] + "/" + class353.field4720[1], var1 + 30, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Dynamic: " + class300.field4041 + "/" + 5000, var1 + 45, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Total Opaque Onscreen: " + class632.field9091 + "/" + 10000, var1 + 60, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Total Trans Onscreen: " + class543.field7873 + "/" + 5000, var1 + 75, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Occluders: " + (class516.field7558 + class10.field100) + " Active: " + class78.field1141, var1 + 90, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Occluded: Ground:" + class577.field8430 + " Walls: " + class627.field8992 + " CPs: " + class408.field5788 + " Pixels: " + class86.field1213, var1 + 105, var0);
        class68.field1052.method2515(-16777216, 0, -256, "Occlude Calc Took: " + class588.field8525 / 1000L + "us", var1 + 120, var0);
        if (class501.field6999 == null) {
            return;
        }
        for (int var4 = 0; var4 < class501.field6999.length; var4++) {
            float var6 = (float) class501.field6999[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class501.field6999[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class701 var5 = class298.field4017.method311(class501.field6999, 0, class353.field4718, class353.field4718, class432.field6204);
        var5.method3(var0, 170, 1, 0, 0);
    }
}
