import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class150 extends class206 {

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lmh;")
    public static class62 field2367 = class201.method1405(true, "k");

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "[I")
    public static int[] field2365 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field2368 = -2;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "Lmh;")
    public static class62 field2366 = class201.method1405(true, ")1");

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Z")
    public static boolean field2361 = true;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "F")
    public static float field2362;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Lhi;")
    public static class26 field2364;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "[I")
    public static int[] field2370;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1076(int arg0, int arg1) {
        class101.field1659 = arg0;
        if (arg1 >= -67) {
            field2365 = (int[]) null;
        }
        class27.method165(3, 0);
        class27.method165(4, 0);
        field2371++;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 17)
    public static void method1077(int arg0) {
        field2364 = null;
        field2367 = null;
        field2366 = null;
        field2370 = null;
        field2365 = null;
        if (arg0 != 1) {
            method1078(15, -71);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V", line = 31)
    public static final void method1078(int arg0, int arg1) {
        field2372++;
        int var2 = -58 / ((22 - arg1) / 34);
        class104.field1707.method1390(arg0, -62);
        class69.field1058.method1390(arg0, -100);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIBI)V", line = 48)
    public static final void method1079(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2360++;
        class271.method1861(arg1, true, class282.field4817[arg4], arg0 + arg2, -arg2 + arg0);
        int var5 = 0;
        if (arg3 != -55) {
            field2362 = -0.56565857F;
        }
        int var6 = arg2;
        int var7 = -1;
        int var8 = -arg2;
        while (var5 < var6) {
            var7 += 2;
            var5++;
            var8 += var7;
            if (var8 >= 0) {
                var6--;
                int[] var9 = class282.field4817[arg4 + var6];
                var8 -= var6 << 1;
                int[] var10 = class282.field4817[arg4 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class271.method1861(arg1, true, var9, var11, var12);
                class271.method1861(arg1, true, var10, var11, var12);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class282.field4817[arg4 + var5];
            int[] var16 = class282.field4817[arg4 - var5];
            class271.method1861(arg1, true, var15, var13, var14);
            class271.method1861(arg1, true, var16, var13, var14);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)J", line = 115)
    public static final long method1080(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        return var3 == null || var3.field2706 == null ? 0L : var3.field2706.field787;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(II)V", line = 122)
    public class150(int arg0, int arg1) {
        this.field2369 = arg0;
        this.field2363 = arg1;
    }
}
