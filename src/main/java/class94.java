import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 extends class32 {

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Z")
    public boolean field2219 = false;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lv;")
    private static class146 field2220 = class159.method1226((byte) -37, "Feb");

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lv;")
    private static class146 field2227 = class159.method1226((byte) -37, "Apr");

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Lv;")
    private static class146 field2231 = class159.method1226((byte) -37, "Dec");

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[I")
    public static int[] field2218 = new int[25];

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lv;")
    private static class146 field2232 = class159.method1226((byte) -37, "skill)2");

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lv;")
    private static class146 field2222 = class159.method1226((byte) -37, "Aug");

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lv;")
    private static class146 field2234 = class159.method1226((byte) -37, "Nov");

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "Lv;")
    private static class146 field2237 = class159.method1226((byte) -37, "Jun");

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lv;")
    public static class146 field2223 = class159.method1226((byte) -37, "Welt");

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lv;")
    private static class146 field2221 = class159.method1226((byte) -37, "Oct");

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Lv;")
    public static class146 field2226 = class159.method1226((byte) -37, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lv;")
    private static class146 field2224 = class159.method1226((byte) -37, "Sep");

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Lv;")
    private static class146 field2235 = class159.method1226((byte) -37, "Mar");

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Lv;")
    private static class146 field2241 = class159.method1226((byte) -37, "Jan");

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "Lv;")
    public static class146 field2240 = field2232;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "[S")
    public static short[] field2244 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "[I")
    public static int[] field2238 = new int[100];

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Lv;")
    private static class146 field2228 = class159.method1226((byte) -37, "Jul");

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field2242 = 1;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "Lv;")
    private static class146 field2245 = class159.method1226((byte) -37, "May");

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "[Lv;")
    public static class146[] field2248 = new class146[] { field2241, field2220, field2235, field2227, field2245, field2237, field2228, field2222, field2224, field2221, field2234, field2231 };

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field2239 = 1;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Lv;")
    public static class146 field2249 = class159.method1226((byte) -37, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ldd;I)Z")
    public static final boolean method737(class26 arg0, int arg1) {
        int var2 = arg0.field442;
        field2246++;
        if (var2 == 205) {
            class47.field1080 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class103.field2503.method277(true, var3 == 1, var4);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class103.field2503.method284(arg1 + 19512, var5, var6 == 1);
        }
        if (var2 == 324) {
            class103.field2503.method285(95, false);
        }
        if (var2 == 325) {
            class103.field2503.method285(74, true);
        }
        if (var2 == 326) {
            class111.field2633++;
            class82.field1990.method265((byte) -85, 244);
            class103.field2503.method279(class82.field1990, 0);
            return true;
        } else {
            if (arg1 != -19443) {
                field2241 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
    public static final int method738(int arg0, int arg1, int arg2) {
        field2247++;
        class125 var3 = (class125) class124.field2868.method332((byte) -79, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg1 <= arg2 && arg2 < var3.field2899.length) {
            return var3.field2899[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method739(boolean arg0) {
        if (arg0) {
            method737(null, -79);
        }
        field2237 = null;
        field2228 = null;
        field2226 = null;
        field2244 = null;
        field2231 = null;
        field2223 = null;
        field2222 = null;
        field2235 = null;
        field2220 = null;
        field2240 = null;
        field2218 = null;
        field2248 = null;
        field2224 = null;
        field2245 = null;
        field2221 = null;
        field2227 = null;
        field2238 = null;
        field2241 = null;
        field2249 = null;
        field2232 = null;
        field2234 = null;
    }
}
