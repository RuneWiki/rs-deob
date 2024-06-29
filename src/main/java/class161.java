import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class161 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2295 = 16777215;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2296 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static final void method995(byte arg0) {
        int var1 = -30 / ((-arg0 - 71) / 46);
        field2299++;
        if (class305.field4186 == 5) {
            class305.field4186 = 6;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZZ)V")
    public static final void method996(boolean arg0, boolean arg1) {
        field2298++;
        while (class387.field5435.method2603(1825, class438.field6394) >= 15) {
            int var2 = class387.field5435.method2599((byte) 98, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class179.field2534[var2] == null) {
                class179.field2534[var2] = new class405();
                class179.field2534[var2].field297 = var2;
                var3 = true;
            }
            class405 var4 = class179.field2534[var2];
            class54.field750[class166.field2352++] = var2;
            var4.field298 = class393.field5484;
            if (var4.field5623 != null && var4.field5623.method1862(!arg1)) {
                class247.method1458(115, var4);
            }
            int var5 = class387.field5435.method2599((byte) 98, 1);
            int var6;
            if (arg0) {
                var6 = class387.field5435.method2599((byte) 98, 8);
                if (var6 > 127) {
                    var6 -= 256;
                }
            } else {
                var6 = class387.field5435.method2599((byte) 98, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
            }
            int var7 = class387.field5435.method2599((byte) 98, 2);
            int var8 = class387.field5435.method2599((byte) 98, 1);
            if (var8 == 1) {
                class59.field795[class44.field614++] = var2;
            }
            var4.method2343(class398.field5549.method2819(class387.field5435.method2599((byte) 98, 14), 114), -121);
            int var9 = class387.field5435.method2599((byte) 98, 3) + 4 << 11 & 0x3E75;
            int var10;
            if (arg0) {
                var10 = class387.field5435.method2599((byte) 98, 8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = class387.field5435.method2599((byte) 98, 5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            var4.method171(var4.field5623.field4637, 0);
            var4.field333 = var4.field5623.field4622 << 3;
            if (var4.field333 == 0) {
                var4.method169(true, 0);
            } else if (var3) {
                var4.method169(true, var9);
            }
            var4.method2342(var7, class75.field1089.field362[0] + var10, var5 == 1, false, class75.field1089.field372[0] + var6, var4.method167(-1));
            if (var4.field5623.method1862(!arg1)) {
                class405.method2344(0, 65535, var4.field464, null, var4.field372[0], var4.field362[0], var4, null);
            }
        }
        if (arg1) {
            field2296 = -72;
        }
        class387.field5435.method2601((byte) 56);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIIZ)V")
    public static final void method997(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field2296 = -121;
        }
        field2300++;
        class123.field1685 = 0L;
        int var5 = class448.method2641((byte) 116);
        if (arg3 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class418.field6109.method513()) {
            arg1 = true;
        }
        class107.method693(arg0, arg2, var5, arg3, 0, arg1);
    }
}
