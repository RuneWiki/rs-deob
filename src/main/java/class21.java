import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 extends class73 {

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field294 = 0;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field296 = 0;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lne;")
    public static class49 field299;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method120(int arg0) {
        field295++;
        int var1 = class200.field3613;
        int var2 = class46.field662;
        int var3 = class65.field1262;
        int var4 = class134.field2493;
        int var5 = 6116423;
        class15.method77(var1, var2, var3, var4, var5);
        class15.method77(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class15.method82(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        class26.field378.method1616(class229.field4201, var1 + 3, var2 + 14, var5, -1);
        int var6 = class205.field3681;
        int var7 = class72.field1398;
        for (int var8 = 0; var8 < class177.field3218; var8++) {
            int var9 = (class177.field3218 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < (var1 + var3) && (var9 - 13) < var7 && var7 < (var9 + 3)) {
                var10 = 16776960;
            }
            class26.field378.method1616(class224.method1589(false, var8), var1 + 3, var9, var10, 0);
        }
        class210.method1515(class200.field3613, (byte) -95, class46.field662, class65.field1262, class134.field2493);
        if (arg0 != 16777215) {
            method121(-25);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method121(int arg0) {
        field299 = null;
        if (arg0 != 1) {
            method120(-123);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lnc;I)V")
    public static final void method122(class83 arg0, int arg1) {
        field297++;
        if (arg1 == 0) {
            class110.field2100 = arg0;
        }
    }
}
