import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class126 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[[I")
    public static int[][] field2106 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    public static int[] field2105 = new int[100];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
    public static final boolean method938(int arg0, int arg1, int arg2) {
        field2109++;
        if (!class259.field4360) {
            return false;
        }
        int var3 = arg1 & 0xFFFF;
        if (arg0 != -11908) {
            return true;
        }
        int var4 = arg1 >> 16;
        if (class208.field3515[var4] == null || class208.field3515[var4][var3] == null) {
            return false;
        }
        class207 var5 = class208.field3515[var4][var3];
        if (arg2 == -1 && var5.field3376 == 0) {
            for (int var6 = 0; var6 < class287.field4747; var6++) {
                if (class195.field3154[var6] == 20 || class195.field3154[var6] == 1003 || class195.field3154[var6] == 42 || class195.field3154[var6] == 25 || class195.field3154[var6] == 43) {
                    for (class207 var7 = class222.method1574(arg0 + 12032, class67.field1125[var6]); var7 != null; var7 = class85.method603(var7, -6)) {
                        if (var5.field3405 == var7.field3405) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class287.field4747; var8++) {
                if (class197.field3204[var8] == arg2 && class67.field1125[var8] == var5.field3405 && (class195.field3154[var8] == 20 || class195.field3154[var8] == 1003 || class195.field3154[var8] == 42 || class195.field3154[var8] == 25 || class195.field3154[var8] == 43)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method939(byte arg0) {
        int var1 = -6 % ((arg0 - 48) / 47);
        field2105 = null;
        field2106 = null;
    }
}
