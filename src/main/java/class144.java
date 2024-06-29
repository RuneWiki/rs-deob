import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class144 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lsj;")
    public static class48 field2328 = new class48();

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[J")
    public static long[] field2329 = new long[32];

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2333 = "Attack";

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Z")
    public static boolean field2331;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[I")
    public static int[] field2334;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method974(byte arg0) {
        field2334 = null;
        field2328 = null;
        field2333 = null;
        if (arg0 != 122) {
            method974((byte) -121);
        }
        field2329 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
    public static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2327++;
        if (arg4 <= 12) {
            return;
        }
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = ((arg1 << 1) - 3) * var11;
        int var18 = var9 << 2;
        int var19 = (var6 + 1) * var18;
        int var20 = (arg1 - 1) * var15;
        if (arg5 >= class156.field2507 && client.field3617 >= arg5) {
            int var21 = class18.method125(-24914, arg0 + arg2, class121.field2042, class58.field817);
            int var22 = class18.method125(-24914, arg2 - arg0, class121.field2042, class58.field817);
            class168.method1184(128, var21, var22, arg3, class85.field1162[arg5]);
        }
        while (var7 > 0) {
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var19;
                    var19 += var18;
                    var13 += var16;
                    var16 += var18;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var6++;
                var13 += var16;
                var19 += var18;
                var16 += var18;
            }
            if (var24 >= class156.field2507 && var23 <= client.field3617) {
                int var25 = class18.method125(-24914, arg2 + var6, class121.field2042, class58.field817);
                int var26 = class18.method125(-24914, arg2 - var6, class121.field2042, class58.field817);
                if (var23 >= class156.field2507) {
                    class168.method1184(128, var25, var26, arg3, class85.field1162[var23]);
                }
                if (var24 <= client.field3617) {
                    class168.method1184(128, var25, var26, arg3, class85.field1162[var24]);
                }
            }
            var14 += -var17;
            var13 += -var20;
            var20 -= var15;
            var17 -= var15;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
