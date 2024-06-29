import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class297 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4692 = "flash1:";

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public static int[] field4694 = new int[99];

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
    public static int[] field4696;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
    public static int[] field4700;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4697;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[Z")
    public static boolean[] field4698;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static final void method1989(boolean arg0) {
        field4699++;
        if (!arg0) {
            field4697 = null;
        }
        int var1 = class103.field1392;
        int var2 = class190.field3074;
        int var3 = class73.field916;
        int var4 = class67.field850 - 3;
        byte var5 = 20;
        if (class145.field2292 == null || class176.field2797 == null) {
            if (class147.field2302.method938(class106.field1430, 843075268) && class147.field2302.method938(class189.field3062, 843075268)) {
                class145.field2292 = class45.method253((byte) 26, 0, class106.field1430, class147.field2302);
                class176.field2797 = class45.method253((byte) 26, 0, class189.field3062, class147.field2302);
            } else {
                class217.method1540(var3, var2, var1, var5, class275.field4401, 256 - class164.field2614);
            }
        }
        if (class145.field2292 != null && class176.field2797 != null) {
            int var6 = (var1 - class176.field2797.field720 * 2) / class145.field2292.field720;
            for (int var7 = 0; var7 < var6; var7++) {
                class145.field2292.method315(class145.field2292.field720 * var7 + class176.field2797.field720 + var3, var2);
            }
            class176.field2797.method315(var3, var2);
            class176.field2797.method314(var3 + var1 - class176.field2797.field720, var2);
        }
        class280.field4439.method687(class2.field11, var3 + 3, var2 + 14, class134.field2117, -1);
        class217.method1540(var3, var2 + var5, var1, var4 - var5, class275.field4401, 256 - class164.field2614);
        int var8 = class92.field1156;
        int var9 = class113.field1623;
        for (int var10 = 0; var10 < class34.field437; var10++) {
            int var18 = (class34.field437 - var10 - 1) * 15 + var5 + var2 + 13;
            if (var9 > var3 && var1 + var3 > var9 && var8 > (var18 - 13) && var8 < var18 + 3) {
                class217.method1540(var3, var18 - 12, var1, 15, class215.field3457, 256 - class120.field1707);
            }
        }
        if ((class52.field680 == null || class121.field1727 == null || class164.field2605 == null) && class147.field2302.method938(class201.field3182, 843075268) && class147.field2302.method938(class90.field1116, 843075268) && class147.field2302.method938(class235.field3878, 843075268)) {
            class52.field680 = class45.method253((byte) 26, 0, class201.field3182, class147.field2302);
            class121.field1727 = class45.method253((byte) 26, 0, class90.field1116, class147.field2302);
            class164.field2605 = class45.method253((byte) 26, 0, class235.field3878, class147.field2302);
        }
        if (class52.field680 != null && class121.field1727 != null && class164.field2605 != null) {
            int var11 = (var1 - (class164.field2605.field720 * 2)) / class52.field680.field720;
            for (int var12 = 0; var12 < var11; var12++) {
                class52.field680.method315(class52.field680.field720 * var12 + (var3 + class164.field2605.field720), -class52.field680.field719 + var2 - -var4);
            }
            int var13 = (var4 - class164.field2605.field719 - var5) / class121.field1727.field719;
            for (int var14 = 0; var14 < var13; var14++) {
                class121.field1727.method315(var3, class121.field1727.field719 * var14 + var2 + var5);
                class121.field1727.method314(var1 + var3 - class121.field1727.field720, class121.field1727.field719 * var14 + (var2 - -var5));
            }
            class164.field2605.method315(var3, var2 + var4 - class164.field2605.field719);
            class164.field2605.method314(var1 + var3 - class164.field2605.field720, var2 + var4 - class164.field2605.field719);
        }
        for (int var15 = 0; var15 < class34.field437; var15++) {
            int var16 = ((class34.field437 - var15 - 1) * 15) + var2 + var5 + 13;
            int var17 = class134.field2117;
            if (var3 < var9 && var3 + var1 > var9 && var16 - 13 < var8 && var8 < var16 + 3) {
                var17 = client.field1617;
            }
            class280.field4439.method687(class132.method895(var15, 0), var3 + 3, var16, var17, 0);
        }
        class176.method1223(class67.field850, class190.field3074, class73.field916, class103.field1392, 26597);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method1990(byte arg0) {
        if (arg0 >= -31) {
            return;
        }
        field4698 = null;
        field4697 = null;
        field4696 = null;
        field4700 = null;
        field4694 = null;
        field4692 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZJ)V")
    public static final void method1991(int arg0, boolean arg1, long arg2) {
        field4691++;
        if (arg2 == 0L) {
            return;
        }
        if (class198.field3141 >= 100) {
            class211.method1487(class50.field648, "", 0, (byte) -125);
            return;
        }
        String var4 = class145.method1013(arg2, 93);
        for (int var5 = 0; var5 < class198.field3141; var5++) {
            if (class53.field684[var5] == arg2) {
                class211.method1487(var4 + class139.field2230, "", 0, (byte) -125);
                return;
            }
        }
        for (int var6 = 0; var6 < class88.field1091; var6++) {
            if (class251.field4108[var6] == arg2) {
                class211.method1487(class148.field2336 + var4 + class273.field4373, "", 0, (byte) -121);
                return;
            }
        }
        if (var4.equals(class286.field4571.field4208)) {
            class211.method1487(class256.field4154, "", 0, (byte) -127);
            return;
        }
        class247.field4074++;
        class53.field684[class198.field3141] = arg2;
        class40.field496[class198.field3141] = class178.method1242((byte) -33, arg2);
        class71.field893[class198.field3141++] = arg1;
        class68.field856 = class162.field2582;
        class4.field57.method1932(false, 221);
        class4.field57.method590(arg2, 1027669520);
        if (arg0 != 256) {
            field4697 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZI)V")
    public static final void method1992(int arg0, int arg1, boolean arg2, int arg3) {
        field4690++;
        class233 var4 = class114.method746(arg1, 1228126432, 9);
        if (!arg2) {
            field4697 = null;
        }
        var4.method1651((byte) 121);
        var4.field3855 = arg0;
        var4.field3852 = arg3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4694[var1] = var0 / 4;
        }
        field4695 = 0;
        field4696 = new int[2];
        field4700 = new int[256];
    }
}
