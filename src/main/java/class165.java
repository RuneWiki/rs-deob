import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class165 extends class744 {

    @OriginalMember(owner = "client!ada", name = "R", descriptor = "B")
    public static byte field2499 = -1;

    @OriginalMember(owner = "client!ada", name = "P", descriptor = "Lkaa;")
    public static class47 field2497 = new class47(50, 0);

    @OriginalMember(owner = "client!ada", name = "Q", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ada", name = "S", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ada", name = "T", descriptor = "Lwu;")
    public static class376 field2501;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lwu;II)Lrc;", line = 3)
    public static final class539 method1184(class376 arg0, int arg1, int arg2) {
        field2500++;
        if (arg1 == 13580) {
            byte[] var3 = arg0.method2226(-1, arg2);
            return var3 == null ? null : new class539(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "()V", line = 24)
    public static final void method1185() {
        byte var0 = 10;
        byte var1 = 30;
        if (class379.field5278 == 0 || class258.field3550 == null) {
            return;
        }
        class184.field2781.method393(class127.field2091);
        for (int var2 = 0; var2 < class568.field7468.length; var2++) {
            class184.field2781.method509(-256, 1, class127.field2091[3] - class127.field2091[1], class127.field2091[1], class568.field7468[var2] + class190.field2865[var2]);
        }
        for (int var3 = 0; var3 < class218.field3145; var3++) {
            class177 var11 = class44.field575[var3];
            class184.field2781.method494(var11.field2672[0], var11.field2670[0], var11.field2665[0], class648.field8618);
            class184.field2781.method494(var11.field2672[1], var11.field2670[1], var11.field2665[1], class257.field3524);
            class184.field2781.method494(var11.field2672[2], var11.field2670[2], var11.field2665[2], class197.field2976);
            class184.field2781.method494(var11.field2672[3], var11.field2670[3], var11.field2665[3], class622.field8293);
            if (class648.field8618[2] != -1 && class257.field3524[2] != -1 && class197.field2976[2] != -1 && class622.field8293[2] != -1) {
                int var12 = -65536;
                if (var11.field2663 == 4) {
                    var12 = -16776961;
                }
                class184.field2781.method427(class257.field3524[0], class257.field3524[1], class648.field8618[1], var12, (byte) 49, class648.field8618[0]);
                class184.field2781.method427(class197.field2976[0], class197.field2976[1], class257.field3524[1], var12, (byte) 49, class257.field3524[0]);
                class184.field2781.method427(class622.field8293[0], class622.field8293[1], class197.field2976[1], var12, (byte) 49, class197.field2976[0]);
                class184.field2781.method427(class648.field8618[0], class648.field8618[1], class622.field8293[1], var12, (byte) 49, class622.field8293[0]);
                class184.field2781.method427(class197.field2976[0], class197.field2976[1], class648.field8618[1], var12, (byte) 49, class648.field8618[0]);
            }
        }
        class258.field3550.method527(true, var0, "Dynamic: " + class197.field2980 + "/" + 5000, var1 + 45, -16777216, -256);
        class258.field3550.method527(true, var0, "Total Opaque Onscreen: " + class5.field125 + "/" + 10000, var1 + 60, -16777216, -256);
        class258.field3550.method527(true, var0, "Total Trans Onscreen: " + class503.field6749 + "/" + 5000, var1 + 75, -16777216, -256);
        class258.field3550.method527(true, var0, "Occluders: " + (class691.field9633 + class356.field4995) + " Active: " + class218.field3145, var1 + 90, -16777216, -256);
        class258.field3550.method527(true, var0, "Occluded: Ground:" + class324.field4600 + " Walls: " + class166.field2577 + " CPs: " + class589.field7689 + " Pixels: " + class462.field6335, var1 + 105, -16777216, -256);
        class258.field3550.method527(true, var0, "Occlude Calc Took: " + class412.field5721 / 1000L + "us", var1 + 120, -16777216, -256);
        if (class379.field5278 != 2 || class253.field3481 == null) {
            return;
        }
        for (int var4 = 0; var4 < class253.field3481.length; var4++) {
            float var6 = (float) class253.field3481[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class253.field3481[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class133 var5 = class184.field2781.method450(class721.field10044, (byte) 99, class758.field10556, class253.field3481, 0, class758.field10556);
        var5.method1045(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)V", line = 109)
    public static void method1186(int arg0) {
        field2497 = null;
        field2501 = null;
        if (arg0 != -1) {
            method1186(84);
        }
    }
}
