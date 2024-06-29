import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class210 extends class183 {

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3748 = 0;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "[Z")
    public static boolean[] field3749 = new boolean[100];

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Ldj;")
    public static class44 field3751 = class89.method650(255, "null");

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Ldj;")
    private static class44 field3752 = class89.method650(255, "Unable to connect)3");

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Ldj;")
    public static class44 field3750 = field3752;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Ldj;")
    public static class44 field3755 = field3752;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Ls;")
    public static class190 field3754 = new class190();

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lod;")
    public static class155 field3757;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static void method1359(int arg0) {
        field3750 = null;
        field3754 = null;
        field3755 = null;
        field3749 = null;
        if (arg0 < 32) {
            method1359(-6);
        }
        field3752 = null;
        field3757 = null;
        field3751 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class82.field1609 * arg3 + class77.field1494 * arg0 >> 16;
        int var6 = class77.field1494 * arg3 - class82.field1609 * arg0 >> 16;
        int var7 = class174.field3030 * arg1 + class156.field2705 * var6 >> 16;
        int var8 = class156.field2705 * arg1 - class174.field3030 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class174.field3030 * arg2 + class156.field2705 * var6 >> 16;
        int var12 = class156.field2705 * arg2 - class174.field3030 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class60.field1122 && var13 < class60.field1122) {
            return false;
        } else if (var9 > class160.field2765 && var13 > class160.field2765) {
            return false;
        } else if (var10 < class117.field2092 && var14 < class117.field2092) {
            return false;
        } else {
            return var10 <= class196.field3470 || var14 <= class196.field3470;
        }
    }
}
