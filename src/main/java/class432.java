import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class432 {

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6111 = "";

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILop;II)J", line = 5)
    public static final long method2571(int arg0, class559 arg1, int arg2, int arg3) {
        if (arg2 != -1980257458) {
            field6111 = null;
        }
        field6110++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class290 var8 = class358.field5112.method890(arg1.method735(arg2 ^ 0x89F7F575), false);
        long var9 = (long) (arg1.method741(118) << 14 | arg0 | arg3 << 7 | arg1.method731(arg2 ^ 0x760854F7) << 20 | 0x40000000);
        if (var8.field3738 == 0) {
            var9 |= var6;
        }
        if (var8.field3777 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method735(24123) << 32;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIII)Z", line = 37)
    public static final boolean method2572(int arg0, int arg1, int arg2, int arg3) {
        field6112++;
        if (!class182.field2387 || !class379.field5297) {
            return false;
        } else if (class540.field7599 < 100) {
            return false;
        } else {
            int var4 = class468.field6737[arg0][arg1][arg3];
            if ((-class587.field8208) == var4) {
                return false;
            } else if (class587.field8208 == var4) {
                return true;
            } else if (class517.field7282 == class109.field1341) {
                return false;
            } else {
                int var5 = arg1 << class455.field6383;
                int var6 = arg3 << class455.field6383;
                if (class147.method923(class517.field7282[arg0].method2381(-95, arg1, arg2 + arg3), var5 + 1, var5 - -class431.field6109 + -1, class517.field7282[arg0].method2381(-113, arg1, arg3), var6 + 1, var5 + 1, class431.field6109 + var6 - 1, 0, class517.field7282[arg0].method2381(arg2 ^ 0xFFFFFF83, arg1 + 1, arg3 + 1), class431.field6109 + var6 - 1) && class147.method923(class517.field7282[arg0].method2381(-93, arg1 + 1, arg3 + 1), class431.field6109 + var5 - 1, class431.field6109 + var5 + -1, class517.field7282[arg0].method2381(arg2 ^ 0xFFFFFF96, arg1, arg3), var6 + 1, var5 - -1, var6 + 1, arg2 + -1, class517.field7282[arg0].method2381(-101, arg1 + 1, arg3), class431.field6109 + var6 - 1)) {
                    class408.field5748++;
                    class468.field6737[arg0][arg1][arg3] = class587.field8208;
                    return true;
                } else {
                    class468.field6737[arg0][arg1][arg3] = -class587.field8208;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V", line = 87)
    public static void method2573(int arg0) {
        field6111 = null;
        int var1 = 56 / ((7 - arg0) / 44);
    }
}
