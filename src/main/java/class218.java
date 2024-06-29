import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class218 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lr;")
    public class195 field2908;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lka;")
    public class500 field2909;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V", line = 7)
    public static final void method1436() {
        byte var0 = 10;
        byte var1 = 30;
        if (class178.field2377 == 0 || class644.field8947 == null) {
            return;
        }
        class192.field2582.method494(class8.field94);
        for (int var2 = 0; var2 < class418.field5999.length; var2++) {
            class192.field2582.method502(class8.field94[3] - class8.field94[1], 44, class418.field5999[var2] + class370.field5371[var2], class8.field94[1], -256);
        }
        for (int var3 = 0; var3 < class675.field9472; var3++) {
            class723 var11 = class268.field3958[var3];
            class192.field2582.method551(var11.field10066[0], var11.field10067[0], var11.field10063[0], class418.field6008);
            class192.field2582.method551(var11.field10066[1], var11.field10067[1], var11.field10063[1], class257.field3838);
            class192.field2582.method551(var11.field10066[2], var11.field10067[2], var11.field10063[2], class686.field9646);
            class192.field2582.method551(var11.field10066[3], var11.field10067[3], var11.field10063[3], class283.field4183);
            if (class418.field6008[2] != -1 && class257.field3838[2] != -1 && class686.field9646[2] != -1 && class283.field4183[2] != -1) {
                int var12 = -65536;
                if (var11.field10059 == 4) {
                    var12 = -16776961;
                }
                class192.field2582.method479(var12, (byte) -94, class418.field6008[1], class257.field3838[0], class257.field3838[1], class418.field6008[0]);
                class192.field2582.method479(var12, (byte) -72, class257.field3838[1], class686.field9646[0], class686.field9646[1], class257.field3838[0]);
                class192.field2582.method479(var12, (byte) -42, class686.field9646[1], class283.field4183[0], class283.field4183[1], class686.field9646[0]);
                class192.field2582.method479(var12, (byte) -44, class283.field4183[1], class418.field6008[0], class418.field6008[1], class283.field4183[0]);
                class192.field2582.method479(var12, (byte) -53, class418.field6008[1], class686.field9646[0], class686.field9646[1], class418.field6008[0]);
            }
        }
        class644.field8947.method583((byte) 56, var1 + 45, -16777216, "Dynamic: " + class186.field2480 + "/" + 5000, -256, var0);
        class644.field8947.method583((byte) 56, var1 + 60, -16777216, "Total Opaque Onscreen: " + class16.field235 + "/" + 10000, -256, var0);
        class644.field8947.method583((byte) 56, var1 + 75, -16777216, "Total Trans Onscreen: " + class455.field6321 + "/" + 5000, -256, var0);
        class644.field8947.method583((byte) 56, var1 + 90, -16777216, "Occluders: " + (class665.field9191 + class135.field1988) + " Active: " + class675.field9472, -256, var0);
        class644.field8947.method583((byte) 56, var1 + 105, -16777216, "Occluded: Ground:" + class20.field296 + " Walls: " + class639.field8883 + " CPs: " + class337.field4880 + " Pixels: " + class592.field7964, -256, var0);
        class644.field8947.method583((byte) 56, var1 + 120, -16777216, "Occlude Calc Took: " + class229.field3119 / 1000L + "us", -256, var0);
        if (class178.field2377 != 2 || class280.field4140 == null) {
            return;
        }
        for (int var4 = 0; var4 < class280.field4140.length; var4++) {
            float var6 = (float) class280.field4140[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class280.field4140[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class147 var5 = class192.field2582.method499(class492.field6819, class280.field4140, true, 0, class598.field8138, class492.field6819);
        var5.method1086(var0, 170, 1, 0, 0);
    }
}
