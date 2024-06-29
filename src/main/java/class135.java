import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class135 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2098 = "Loaded world list data";

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2102 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lhc;")
    public static class235 field2097;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Z")
    public static final boolean method925(int arg0, int arg1, int arg2) {
        field2099++;
        if (!class47.field687) {
            return false;
        }
        int var3 = arg2 & 0xFFFF;
        int var4 = arg2 >> 16;
        if (class193.field3052[var4] == null || class193.field3052[var4][var3] == null) {
            return false;
        }
        if (arg0 != 40) {
            field2102 = null;
        }
        class228 var5 = class193.field3052[var4][var3];
        if (arg1 == -1 && var5.field3477 == 0) {
            for (int var6 = 0; var6 < class128.field2018; var6++) {
                if (class146.field2319[var6] == 19 || class146.field2319[var6] == 1006 || class146.field2319[var6] == 40 || class146.field2319[var6] == 22 || class146.field2319[var6] == 41) {
                    for (class228 var7 = class84.method596((byte) 35, class45.field648[var6]); var7 != null; var7 = class180.method1230(var7, 86)) {
                        if (var5.field3480 == var7.field3480) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class128.field2018; var8++) {
                if (class29.field415[var8] == arg1 && class45.field648[var8] == var5.field3480 && (class146.field2319[var8] == 19 || class146.field2319[var8] == 1006 || class146.field2319[var8] == 40 || class146.field2319[var8] == 22 || class146.field2319[var8] == 41)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method926(byte arg0) {
        field2102 = null;
        field2097 = null;
        if (arg0 < -4) {
            field2098 = null;
        }
    }
}
