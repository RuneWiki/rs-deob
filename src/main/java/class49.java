import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class49 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
    public static boolean field624 = false;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field627 = 0;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Llm;")
    public static class210 field620;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method336(boolean arg0) {
        if (arg0) {
            field621 = 114;
        }
        class161.field2424 = true;
        field628++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lqg;Z)V", line = 19)
    public static final void method337(class195 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field622++;
        class252 var2 = (class252) class141.field2129.method1320(class242.method1638(arg0.field2934, -14393), 13002);
        if (var2 == null) {
            return;
        }
        if (var2.field3776 != null) {
            class72.field936.method2230(var2.field3776);
            var2.field3776 = null;
        }
        var2.method714(-41);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V", line = 48)
    public static final void method338(int arg0, int arg1, int arg2) {
        field625++;
        class168 var3 = class274.method1934(97, arg2);
        int var4 = var3.field2515;
        int var5 = var3.field2524;
        int var6 = var3.field2523;
        int var7 = class87.field1286[var6 - var5];
        int var8 = 48 % ((arg1 + 18) / 46);
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var9 = var7 << var5;
        class203.method1392((byte) -9, var4, var9 & arg0 << var5 | ~var9 & class265.field4058[var4]);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 73)
    public static void method339(byte arg0) {
        field620 = null;
        int var1 = 126 % ((arg0 + 11) / 38);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 85)
    public static final void method340(int arg0, int arg1) {
        class88.field1313.method2174(-12634, arg1);
        field623++;
        if (arg0 != 0) {
            method337((class195) null, true);
        }
        class97.field1460.method2174(arg0 ^ 0xFFFFCEA6, arg1);
    }
}
