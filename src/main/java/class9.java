import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class9 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Luf;")
    public static class168 field113 = class148.method1019(-1720, "hint_mapmarkers");

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field116 = 1;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Luf;")
    public static class168 field115 = class148.method1019(-1720, "null");

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[S")
    public static short[] field118 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[Loe;")
    public static class54[] field117 = new class54[2048];

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field120 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 5)
    public static void method34(boolean arg0) {
        field117 = null;
        field118 = null;
        field115 = null;
        if (arg0) {
            field113 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V", line = 23)
    public static final void method35(int arg0, boolean arg1) {
        if (arg0 <= 7) {
            method35(37, false);
        }
        for (int var2 = 0; var2 < class2.field15; var2++) {
            class22 var3 = class190.field3065[class116.field1814[var2]];
            long var4 = (long) class116.field1814[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method111(0) && var3.field267.field3181 == arg1 && var3.field267.method1374(-1)) {
                int var6 = var3.field3027 >> 7;
                int var7 = var3.field3021 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field3012 == 1 && (var3.field3027 & 0x7F) == 64 && (var3.field3021 & 0x7F) == 64) {
                        if (class96.field1537[var6][var7] == class134.field2091) {
                            continue;
                        }
                        class96.field1537[var6][var7] = class134.field2091;
                    }
                    if (!var3.field267.field3178) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field3055 = class62.method349(128, class79.field1127, var3.field3021, var3.field3027);
                    class2.method6(class79.field1127, var3.field3027, var3.field3021, var3.field3055, var3.field3012 * 64 + 60 - 64, var3, var3.field3008, var4, var3.field3010);
                }
            }
        }
        field119++;
    }
}
