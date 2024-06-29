import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class73 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1404 = 0;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lhj;")
    private static class69 field1407 = class181.method1318("Examine", (byte) -127);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[S")
    public static short[] field1405 = new short[256];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lhj;")
    public static class69 field1406 = field1407;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lhj;")
    public static class69 field1408 = class181.method1318("gleiten:", (byte) -119);

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lhj;")
    public static class69 field1410 = class181.method1318("Fallen lassen", (byte) -112);

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Z")
    public static volatile boolean field1409 = false;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "S")
    public static short field1412 = 320;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method508(byte arg0) {
        field1405 = null;
        field1408 = null;
        if (arg0 <= -92) {
            field1406 = null;
            field1410 = null;
            field1407 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)J")
    public static final long method509(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        return var3 == null || var3.field3949 == null ? 0L : var3.field3949.field1293;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZIIIIZZ)Lqb;")
    public static final class56 method510(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field1411++;
        class205 var8 = class83.method585(arg4, arg0 - 1);
        if (arg5 > 1 && var8.field3711 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg5 >= var8.field3692[var10] && var8.field3692[var10] != 0) {
                    var9 = var8.field3711[var10];
                }
            }
            if (var9 != -1) {
                var8 = class83.method585(var9, ~arg0);
            }
        }
        class238 var11 = var8.method1482((byte) -126);
        if (var11 == null) {
            return null;
        }
        class264 var12 = null;
        if (~var8.field3703 != arg0) {
            var12 = (class264) method510(arg0, false, 0, 1, var8.field3684, 10, true, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3732 != -1) {
            var12 = (class264) method510(0, false, arg2, arg3, var8.field3727, arg5, false, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class15.field201;
        int var14 = class15.field206;
        int var15 = class15.field207;
        int[] var16 = new int[4];
        class15.method84(var16);
        class264 var17 = new class264(36, 32);
        class15.method98(var17.field4704, 36, 32);
        class178.method1299();
        class178.method1284(16, 16);
        class178.field3241 = false;
        int var18 = var8.field3722;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class178.field3247[var8.field3709] * var18 >> 16;
        int var20 = class178.field3232[var8.field3709] * var18 >> 16;
        var11.method658(0, var8.field3731, var8.field3733, var8.field3709, var8.field3708, var19 + var8.field3698 - (var11.method211() / 2), var8.field3698 + var20);
        if (arg3 >= 1) {
            var17.method1824(1);
            if (arg3 >= 2) {
                var17.method1824(16777215);
            }
            class15.method98(var17.field4704, 36, 32);
        }
        if (arg2 != 0) {
            var17.method1819(arg2);
        }
        if (var8.field3703 != -1) {
            var12.method341(0, 0);
        } else if (var8.field3732 != -1) {
            class15.method98(var12.field4704, 36, 32);
            var17.method341(0, 0);
            var17 = var12;
        }
        if (arg1 && (var8.field3682 == 1 || arg5 != 1) && arg5 != -1) {
            class139.field2600.method1616(class158.method1192(1000000, arg5), 0, 9, 16776960, 1);
        }
        class15.method98(var13, var14, var15);
        class15.method83(var16);
        class178.method1299();
        class178.field3241 = true;
        return var17;
    }
}
