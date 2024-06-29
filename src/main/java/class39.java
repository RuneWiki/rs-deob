import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class125 {

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[Lod;")
    public static class101[] field932 = new class101[100];

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
    public static int[] field935 = new int[2048];

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lod;")
    public static class101 field930 = class46.method335(99, "me");

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field938 = -1;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[J")
    public static long[] field929 = new long[200];

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[B")
    public static byte[] field933 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lod;")
    public static class101 field940 = class46.method335(70, "Stufe)2");

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lod;")
    public static class101 field942 = class46.method335(88, "blinken3:");

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lod;")
    public class101 field934;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lc;")
    public static class15 field939;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lga;")
    public static class44 field941;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static void method292(boolean arg0) {
        field939 = null;
        field941 = null;
        field933 = null;
        field930 = null;
        if (!arg0) {
            method293(-99, (byte) -19, null);
        }
        field942 = null;
        field932 = null;
        field940 = null;
        field929 = null;
        field935 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLod;)V")
    public static final void method293(int arg0, byte arg1, class101 arg2) {
        field931++;
        class101 var3 = arg2.method709(18419).method714(-124);
        boolean var4 = false;
        for (int var5 = 0; var5 < class150.field3442; var5++) {
            class13 var6 = class94.field2032[class143.field3285[var5]];
            if (var6 != null && var6.field276 != null && var6.field276.method710(var3, arg1 ^ 0x19D6)) {
                var4 = true;
                class40.method306(var6.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var6.field1291[0], 2, (byte) 47);
                if (arg0 == 1) {
                    class119.field2623++;
                    class17.field364.method419(135, (byte) 0);
                    class17.field364.method1068(class143.field3285[var5], 28588);
                } else if (arg0 == 4) {
                    class62.field1376++;
                    class17.field364.method419(226, (byte) 0);
                    class17.field364.method1068(class143.field3285[var5], 28588);
                } else if (arg0 == 6) {
                    class17.field364.method419(28, (byte) 0);
                    class125.field2733++;
                    class17.field364.method1078(arg1 + 19, class143.field3285[var5]);
                } else if (arg0 == 7) {
                    class11.field189++;
                    class17.field364.method419(53, (byte) 0);
                    class17.field364.method1085(false, class143.field3285[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class111.method818(0, class26.field672, arg1 ^ 0x714D, class15.method101(-57, new class101[] { class47.field1126, var3 }));
        }
        if (arg1 != 109) {
            method292(true);
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static final void method294(int arg0) {
        field937++;
        if (arg0 != 14016) {
            method294(91);
        }
        class42.field1013.method135(arg0 - 14016);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public static int method295(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
