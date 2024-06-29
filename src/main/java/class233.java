import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class233 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4153 = -1;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[Lcf;")
    public static class93[] field4150 = new class93[5];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[[[I")
    public static int[][][] field4151;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method1590(int arg0) {
        field4150 = null;
        field4151 = null;
        if (arg0 != 0) {
            field4155 = 103;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static final void method1591(int arg0) {
        field4156++;
        if (arg0 != 63) {
            return;
        }
        int var1 = class288.field5148.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class288.field5148[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class51.field841; var4++) {
                    if (class187.field3450[var4] == class149.field2614[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class187.field3450[class51.field841] = class149.field2614[var2];
                    var3 = class51.field841++;
                }
                class280 var5 = new class280(class288.field5148[var2]);
                int var6 = 0;
                while (var5.field5027 < class288.field5148[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1891(-115);
                    int var9 = (var8 & 0x1FA6) >> 7;
                    int var10 = var8 >> 14;
                    int var11 = (class149.field2614[var2] >> 8) * 64 + var9 - class229.field4111;
                    int var12 = var8 & 0x3F;
                    int var13 = (class149.field2614[var2] & 0xFF) * 64 + var12 - class4.field52;
                    class145 var14 = class5.method19((byte) -59, var5.method1891(arg0 ^ 0xFFFFFFAE));
                    if (class155.field2709[var7] == null && (var14.field2509 & 0x1) > 0 && class47.field767 == var10 && var11 >= 0 && (var14.field2504 + var11) < 104 && var13 >= 0 && var14.field2504 + var13 < 104) {
                        class155.field2709[var7] = new class227();
                        class227 var15 = class155.field2709[var7];
                        class58.field995[class72.field1299++] = var7;
                        var15.field3793 = class275.field4921;
                        var15.method1561(var14, 14579);
                        var15.method1479(var15.field4062.field2504, -1);
                        var15.field3770 = var15.field3807 = class143.field2478[var15.field4062.field2529];
                        var15.field3861 = var15.field4062.field2533;
                        var15.field3791 = var15.field4062.field2514;
                        if (var15.field3791 == 0) {
                            var15.field3807 = 0;
                        }
                        var15.method1482(7, var11, var13, true, var15.method1475(false));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public static final void method1592(int arg0) {
        field4154++;
        int var1 = 0;
        for (int var2 = arg0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class266.method1777(var1, arg0 ^ 0xF5B, var3, var2, class232.field4138, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)V")
    public static final void method1593(boolean arg0, int arg1) {
        if (arg0) {
            field4151 = null;
        }
        class216.field3930.method298(!arg0, arg1);
        field4152++;
    }
}
