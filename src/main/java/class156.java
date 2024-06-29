import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class156 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
    public static boolean field2227 = false;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    public static int[] field2228 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lvh;")
    public static class240 field2225;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIILtf;B)V")
    public static final void method969(boolean arg0, int arg1, int arg2, class192 arg3, byte arg4) {
        field2226++;
        int var5 = arg3.field372[0];
        int var6 = arg3.field362[0];
        if (var5 < 0 || class442.field6435 <= var5 || var6 < 0 || var6 >= class232.field3217 || arg1 < 0 || arg1 >= class442.field6435 || arg2 < 0 || class232.field3217 <= arg2) {
            return;
        }
        int var7 = class282.method1618(var6, arg2, arg3.method167(-1), 0, -4, true, class242.field3363, 1822767280, class6.field64[arg3.field464], var5, 0, arg1, 0, 0, class247.field3443);
        if (var7 < 1 || var7 > 3) {
            return;
        }
        for (int var8 = 0; var8 < (var7 - 1); var8++) {
            arg3.method1165(false, arg4, class242.field3363[var8], class247.field3443[var8]);
        }
        if (arg0) {
            method970(-6);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method970(int arg0) {
        if (arg0 <= 26) {
            field2228 = null;
        }
        field2225 = null;
        field2228 = null;
    }
}
