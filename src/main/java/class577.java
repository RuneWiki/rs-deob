import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class577 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
    public static boolean field7933 = false;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    public static int[] field7932;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[Lfd;")
    public static class298[] field7930;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/awt/Canvas;Luu;Ld;II)Lha;")
    public static final class548 method3365(int arg0, Canvas arg1, class237 arg2, class270 arg3, int arg4, int arg5) {
        if (arg4 < 82) {
            method3367();
        }
        field7934++;
        int var6 = 0;
        int var7 = 0;
        if (arg1 != null) {
            Dimension var8 = arg1.getSize();
            var6 = var8.width;
            var7 = var8.height;
        }
        return class548.method3255(arg5, arg1, arg2, var7, 2, arg0, var6, arg3);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method3366(int arg0) {
        int var1 = 73 % ((-arg0 - 46) / 54);
        field7930 = null;
        field7932 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static final void method3367() {
        byte var0 = 10;
        byte var1 = 30;
        if (class726.field10059 == 0 || class320.field4451 == null) {
            return;
        }
        class441.field6132.method1454(class549.field7629);
        for (int var2 = 0; var2 < class454.field6293.length; var2++) {
            class441.field6132.method3254(class549.field7629[3] - class549.field7629[1], -256, class549.field7629[1], class454.field6293[var2] + class159.field2223[var2], false);
        }
        for (int var3 = 0; var3 < class723.field10045; var3++) {
            class616 var11 = class77.field1127[var3];
            class441.field6132.method1424(var11.field8283[0], var11.field8293[0], var11.field8281[0], class84.field1197);
            class441.field6132.method1424(var11.field8283[1], var11.field8293[1], var11.field8281[1], class42.field523);
            class441.field6132.method1424(var11.field8283[2], var11.field8293[2], var11.field8281[2], class186.field2541);
            class441.field6132.method1424(var11.field8283[3], var11.field8293[3], var11.field8281[3], class746.field10257);
            if (class84.field1197[2] != -1 && class42.field523[2] != -1 && class186.field2541[2] != -1 && class746.field10257[2] != -1) {
                int var12 = -65536;
                if (var11.field8290 == 4) {
                    var12 = -16776961;
                }
                class441.field6132.method3242(class42.field523[1], (byte) 93, class42.field523[0], class84.field1197[1], class84.field1197[0], var12);
                class441.field6132.method3242(class186.field2541[1], (byte) -98, class186.field2541[0], class42.field523[1], class42.field523[0], var12);
                class441.field6132.method3242(class746.field10257[1], (byte) -125, class746.field10257[0], class186.field2541[1], class186.field2541[0], var12);
                class441.field6132.method3242(class84.field1197[1], (byte) -88, class84.field1197[0], class746.field10257[1], class746.field10257[0], var12);
                class441.field6132.method3242(class186.field2541[1], (byte) 124, class186.field2541[0], class84.field1197[1], class84.field1197[0], var12);
            }
        }
        class320.field4451.method2505(var0, -69, -16777216, "Dynamic: " + class323.field4472 + "/" + 5000, -256, var1 + 45);
        class320.field4451.method2505(var0, -76, -16777216, "Total Opaque Onscreen: " + class450.field6246 + "/" + 10000, -256, var1 + 60);
        class320.field4451.method2505(var0, -106, -16777216, "Total Trans Onscreen: " + class477.field6643 + "/" + 5000, -256, var1 + 75);
        class320.field4451.method2505(var0, -83, -16777216, "Occluders: " + (class726.field10070 + class414.field5864) + " Active: " + class723.field10045, -256, var1 + 90);
        class320.field4451.method2505(var0, -121, -16777216, "Occluded: Ground:" + class671.field9270 + " Walls: " + class75.field1102 + " CPs: " + class78.field1129 + " Pixels: " + class527.field7314, -256, var1 + 105);
        class320.field4451.method2505(var0, -101, -16777216, "Occlude Calc Took: " + class118.field1568 / 1000L + "us", -256, var1 + 120);
        if (class726.field10059 != 2 || class87.field1241 == null) {
            return;
        }
        for (int var4 = 0; var4 < class87.field1241.length; var4++) {
            float var6 = (float) class87.field1241[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class87.field1241[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class298 var5 = class441.field6132.method3244(class466.field6481, class87.field1241, (byte) -88, class702.field9783, 0, class702.field9783);
        var5.method1013(var0, 170, 1, 0, 0);
    }
}
