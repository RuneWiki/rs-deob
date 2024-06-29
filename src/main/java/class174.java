import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class174 extends class67 {

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[I")
    public int[] field3462 = new int[] { -1 };

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "[I")
    public int[] field3468 = new int[1];

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Led;")
    public static class43 field3461 = class191.method1219("scape main", false);

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field3463 = 0;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
    public static boolean field3464 = false;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Ltd;")
    public static class176 field3460 = new class176(64);

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Led;")
    public static class43 field3472 = null;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "Led;")
    private static class43 field3474 = class191.method1219("Your ignore list is full)3 Max of 100 users)3", false);

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3473 = 0;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "Led;")
    public static class43 field3470 = field3474;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "J")
    public static long field3469;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[I")
    public static int[] field3465;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
    public static int[] field3471;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILnb;IIII)V")
    public static final void method1096(int arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 2755) {
            return;
        }
        field3466++;
        if (arg1 == null) {
            return;
        }
        int var6 = arg0 * arg0 + arg4 * arg4;
        int var7 = class142.field2933 + class204.field3967 & 0x7FF;
        if (var6 > 6400) {
            return;
        }
        int var8 = class135.field2798[var7];
        int var9 = var8 * 256 / (class54.field1091 + 256);
        int var10 = class135.field2797[var7];
        int var11 = var10 * 256 / (class54.field1091 + 256);
        int var12 = arg0 * var11 + arg4 * var9 >> 16;
        int var13 = arg0 * var9 - arg4 * var11 >> 16;
        if (var6 <= 2500) {
            arg1.method788(var12 + arg2 + 4 + 94 - arg1.field2386 / 2, arg3 - 4 + -var13 + 83 + -(arg1.field2390 / 2));
        } else {
            arg1.method783(class142.field2931, arg2 + var12 + 94 + 4 - arg1.field2386 / 2, arg3 + 83 + -var13 + -4 + -(arg1.field2390 / 2));
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1097(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3467++;
        if (arg0 != 25510) {
            field3473 = -63;
        }
        if (class54.method335(arg0 - 758998742, arg4)) {
            class32.method179(-1, arg2, (byte) -77, arg6, arg7, class12.field177[arg4], arg3, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public static void method1098(int arg0) {
        field3472 = null;
        field3474 = null;
        if (arg0 <= 67) {
            method1097(109, 31, 82, 99, -120, 97, 18, 19);
        }
        field3461 = null;
        field3465 = null;
        field3470 = null;
        field3460 = null;
        field3471 = null;
    }
}
