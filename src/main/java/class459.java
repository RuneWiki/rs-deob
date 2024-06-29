import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class459 {

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field6421 = 0;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "[I")
    public static int[] field6423 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 15)
    public static void method2676(int arg0) {
        field6423 = null;
        if (arg0 != 1048575) {
            field6423 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIIZI)I", line = 26)
    public static final int method2677(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 != -1) {
            return 13;
        }
        field6422++;
        class167 var5 = class119.method803(arg0, arg4, 0);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field2432.length; var7++) {
            if (var5.field2432[var7] >= 0 && class344.field5000.field2223 > var5.field2432[var7]) {
                class395 var8 = class344.field5000.method993(var5.field2432[var7], true);
                int var9 = var8.method2285((byte) 95, class454.field6365.method1995(12, arg1).field5823, arg1);
                if (arg3) {
                    var6 += var5.field2433[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }
}
