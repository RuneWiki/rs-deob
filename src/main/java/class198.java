import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class198 {

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lmh;")
    public static class62 field3345 = class201.method1405(true, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lwi;")
    public static class242 field3341;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lhi;")
    public static class26 field3350;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1381(int arg0) {
        field3343++;
        if (arg0 != -1791455576) {
            method1383(-76, -66);
        }
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II[[I[Z[II[[FI[[FZIIZB[[I[[FIZLmk;IZI)V", line = 25)
    public static final void method1382(int arg0, int arg1, int[][] arg2, boolean[] arg3, int[] arg4, int arg5, float[][] arg6, int arg7, float[][] arg8, boolean arg9, int arg10, int arg11, boolean arg12, byte arg13, int[][] arg14, float[][] arg15, int arg16, boolean arg17, class224 arg18, int arg19, boolean arg20, int arg21) {
        int var22 = (arg20 ? 255 : 0) + (arg0 << 8);
        field3342++;
        if (arg11 != 12313) {
            method1384(true);
        }
        int var23 = (arg17 ? 255 : 0) + (arg1 << 8);
        int var24 = (arg12 ? 255 : 0) + (arg10 << 8);
        int[] var25 = new int[arg4.length / 2];
        int var26 = (arg19 << 8) + (arg9 ? 255 : 0);
        for (int var27 = 0; var27 < var25.length; var27++) {
            int var28 = arg4[var27 + var27 + 1];
            int var29 = arg4[var27 + var27];
            int[][] var30 = arg14 == null || arg3 == null || !arg3[var27] ? arg2 : arg14;
            var25[var27] = class251.method1745(var29, arg7, var30, arg18, arg21, var22, arg14, (float) arg16, arg15, var26, arg8, arg6, (byte) -127, var28, var24, var23, arg13, false);
        }
        arg18.method1592(arg5, arg21, arg7, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lmh;", line = 65)
    public static final class62 method1383(int arg0, int arg1) {
        field3344++;
        if (arg0 >= 999999999) {
            if (arg1 <= 52) {
                method1381(-82);
            }
            return class46.field691;
        } else {
            return class42.method284(arg0, -116);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 81)
    public static void method1384(boolean arg0) {
        field3345 = null;
        field3350 = null;
        field3341 = null;
        if (!arg0) {
            field3348 = -45;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Lsc;", line = 96)
    public static final class164 method1385(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2724; var4++) {
            class164 var5 = var3.field2713[var4];
            if ((var5.field2668 >> 29 & 0x3L) == 2L && var5.field2651 == arg1 && var5.field2670 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILhi;)V", line = 120)
    public static final void method1386(int arg0, class26 arg1) {
        if (arg0 != -1479) {
            field3348 = -27;
        }
        field3349++;
        class186.field2966 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZILhi;II)V", line = 132)
    public static final void method1387(int arg0, boolean arg1, int arg2, class26 arg3, int arg4, int arg5) {
        field3346++;
        class148.field2348 = 10000;
        class24.field273 = arg1;
        if (arg2 <= 76) {
            return;
        }
        class237.field4064 = arg4;
        class15.field122 = arg0;
        class289.field4925 = arg3;
        class60.field876 = 1;
        class246.field4180 = arg5;
    }
}
