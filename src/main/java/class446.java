import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class446 {

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "F")
    public static float field6616;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "[I")
    public static int[] field6617;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)V")
    public static void method2759(boolean arg0) {
        field6617 = null;
        if (arg0) {
            method2760(69, null);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILha;)V")
    public static final void method2760(int arg0, class60 arg1) {
        field6618++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 < 20) {
            field6617 = null;
        }
        if (class419.field6265) {
            var2 = class210.method1422(true);
            var3 = class407.method2589((byte) -45);
        }
        int var4 = -10660793;
        class256.method1676(class642.field9012 + var2, class624.field8741, class177.field2747 + var3, arg1, var4, class338.field4919, -16777216, (byte) -79);
        class298.field4225.method546(false, -1, class642.field9012 + var2 + 3, class430.field6394.method2679(class650.field9160, 114), var3 + class177.field2747 + 14, var4);
        int var5 = var2 + class632.field8840.method2697(4212);
        int var6 = var3 + class632.field8840.method2698(0);
        if (class325.field4650) {
            int var7 = 0;
            for (class567 var8 = (class567) class673.field9386.method3508(-2); var8 != null; var8 = (class567) class673.field9386.method3507(-31)) {
                int var12 = var7 * 16 + class177.field2747 + var3 + 31;
                if (var8.field8052 == 1) {
                    class517.method3051((class342) var8.field8055.field8521.field6156, (byte) -66, var5, class177.field2747 + var3, -1, var6, class338.field4919, var12, arg1, class624.field8741, class642.field9012 + var2, -256);
                } else {
                    class505.method3000(class624.field8741, var8, class642.field9012 + var2, arg1, var5, 3, class177.field2747 + var3, class338.field4919, var6, var12, -1, -256);
                }
                var7++;
            }
            if (class218.field3211 != null) {
                class256.method1676(class582.field8289, class600.field8491, class304.field4300, arg1, var4, class128.field1706, -16777216, (byte) -56);
                class298.field4225.method546(false, -1, class582.field8289 + 3, class218.field3211.field8054, class304.field4300 + 14, var4);
                int var9 = 0;
                for (class342 var10 = (class342) class218.field3211.field8055.method3508(-2); var10 != null; var10 = (class342) class218.field3211.field8055.method3507(-98)) {
                    int var11 = var9 * 16 + class304.field4300 + 31;
                    var9++;
                    class517.method3051(var10, (byte) -95, var5, class304.field4300, -1, var6, class128.field1706, var11, arg1, class600.field8491, class582.field8289, -256);
                }
                class595.method3468(class582.field8289, -93, class304.field4300, class600.field8491, class128.field1706);
            }
        } else {
            int var13 = 0;
            for (class342 var14 = (class342) class748.field10459.method1195(0); var14 != null; var14 = (class342) class748.field10459.method1201(2)) {
                int var15 = class177.field2747 + ((class68.field969 - var13 - 1) * 16) + var3 + 31;
                class517.method3051(var14, (byte) -84, var5, class177.field2747 + var3, -1, var6, class338.field4919, var15, arg1, class624.field8741, class642.field9012 + var2, -256);
                var13++;
            }
        }
        class595.method3468(class642.field9012 + var2, -109, class177.field2747 + var3, class624.field8741, class338.field4919);
    }
}
