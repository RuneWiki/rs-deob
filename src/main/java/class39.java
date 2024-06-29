import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class39 {

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public int field740 = -1;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field736 = 0;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Ltg;")
    public static class184 field738 = class135.method812("blinken2:", 3);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Ltg;")
    public static class184 field741 = class135.method812("title)3jpg", 3);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lhd;")
    public class73 field737;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public int[] field743;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[Loe;")
    public static class137[] field735;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[Ltg;")
    public class184[] field734;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "[[B")
    public static byte[][] field742;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
    public static final int method227(int arg0, int arg1, int arg2) {
        if (arg1 != 26515) {
            method228(true);
        }
        field739++;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method228(boolean arg0) {
        field738 = null;
        field742 = null;
        field735 = null;
        if (!arg0) {
            field741 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[Lsc;")
    public static final class171[] method229(byte arg0) {
        field733++;
        class171[] var1 = new class171[class46.field880];
        int var2 = 0;
        if (arg0 != 107) {
            return null;
        }
        while (var2 < class46.field880) {
            class171 var3 = new class171();
            var3.field3247 = class24.field436;
            var3.field3248 = class110.field1980;
            var3.field3252 = class177.field3387[var2];
            var3.field3253 = class26.field472[var2];
            var3.field3246 = class83.field1479[var2];
            var3.field3250 = class184.field3535[var2];
            var3.field3251 = class83.field1481;
            var3.field3249 = class202.field3902[var2];
            var1[var2] = var3;
            var2++;
        }
        class200.method1283((byte) 12);
        return var1;
    }
}
