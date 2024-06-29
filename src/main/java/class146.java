import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class146 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
    public static int[] field2352 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lah;)V")
    public static final void method1085(class156 arg0) {
        for (int var1 = arg0.field2443; var1 <= arg0.field2447; var1++) {
            for (int var2 = arg0.field2432; var2 <= arg0.field2441; var2++) {
                class313 var3 = class223.field3286[arg0.field2430][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5022; var4++) {
                        if (var3.field5037[var4] == arg0) {
                            var3.field5022--;
                            for (int var5 = var4; var5 < var3.field5022; var5++) {
                                var3.field5037[var5] = var3.field5037[var5 + 1];
                                var3.field5021[var5] = var3.field5021[var5 + 1];
                            }
                            var3.field5037[var3.field5022] = null;
                            break;
                        }
                    }
                    var3.field5011 = 0;
                    for (int var6 = 0; var6 < var3.field5022; var6++) {
                        var3.field5011 |= var3.field5021[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lug;")
    public static final class231 method1086(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5012;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static final void method1087(boolean arg0) {
        if (class16.field170 != null) {
            class16.field170.method2006(2);
        }
        field2350++;
        if (class113.field1879 != null) {
            class113.field1879.method2006(2);
        }
        client.method912(2, 0, 22050, class281.field4536);
        class16.field170 = class121.method922(0, 0, 22050, class273.field4426, class12.field136);
        if (arg0) {
            field2349 = -7;
        }
        class16.field170.method2012(-7004, class272.field4400);
        class113.field1879 = class121.method922(1, 0, 2048, class273.field4426, class12.field136);
        class113.field1879.method2012(-7004, class241.field3543);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public static void method1088(boolean arg0) {
        if (!arg0) {
            method1087(false);
        }
        field2352 = null;
    }
}
