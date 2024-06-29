import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class150 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Z")
    public static boolean field2363 = false;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2366 = "Loading config - ";

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
    public static int[] field2362 = new int[256];

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lwf;")
    public static class306 field2370;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[[I")
    public static int[][] field2367;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1057(int arg0, int arg1) {
        field2369++;
        class275.method1802(-7242);
        class286.method1872(arg1 + 16);
        int var2 = class273.method1796(0, arg0).field243;
        if (var2 == 0) {
            return;
        }
        int var3 = class156.field2442[arg0];
        if (var2 == 5) {
            class183.field2797 = var3;
        }
        if (var2 == 6) {
            class242.field3832 = var3;
        }
        if (~var2 == arg1) {
            class297.field4559 = var3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -106) {
            return;
        }
        field2365++;
        if (arg3 >= class256.field3995 && arg3 <= class118.field1834) {
            int var5 = class3.method20(class323.field5030, arg0, class88.field1324, -27521);
            int var6 = class3.method20(class323.field5030, arg4, class88.field1324, -27521);
            class322.method2178(true, var6, arg3, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 62)
    public static void method1059(boolean arg0) {
        field2366 = null;
        field2370 = null;
        field2362 = null;
        if (arg0) {
            field2362 = (int[]) null;
        }
        field2367 = (int[][]) null;
    }
}
