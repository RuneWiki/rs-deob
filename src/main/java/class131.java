import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class131 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "D")
    public static double field2346 = -1.0D;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Leb;")
    public static class230 field2349 = class68.method589(0, "leuchten1:");

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public static boolean field2348 = false;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Leb;")
    public static class230 field2353 = class68.method589(0, "Fertigkeit: ");

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Leb;")
    public static class230 field2350 = class68.method589(0, "<col=00ff80>");

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lkk;")
    public static class223 field2351;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Lna;")
    public class31 field2355;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lsj;")
    public static class48 field2352;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    public int[] field2347;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[[S")
    public static short[][] field2344;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2356++;
        if (arg2 >= 1 && arg0 >= 1 && arg2 <= 102 && arg0 <= 102) {
            if (!class179.method1302(-48) && (class79.field1435[0][arg2][arg0] & 0x2) == 0) {
                int var8 = arg1;
                if ((class79.field1435[arg1][arg2][arg0] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class171.field3036 != var8) {
                    return;
                }
            }
            int var9 = arg1;
            if (arg1 < 3 && (class79.field1435[1][arg2][arg0] & 0x2) == 2) {
                var9 = arg1 + 1;
            }
            class219.method1505(30, arg2, var9, arg5, class112.field2007[arg1], arg1, arg0);
            if (arg6 >= 0) {
                boolean var10 = class123.field2163;
                class123.field2163 = true;
                class130.method1026(arg0, arg7, arg4 + 24, arg2, false, class112.field2007[arg1], var9, arg6, arg3, false, arg1);
                class123.field2163 = var10;
            }
        }
        if (arg4 != 102) {
            field2348 = false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static void method1032(boolean arg0) {
        field2350 = null;
        field2353 = null;
        field2351 = null;
        field2349 = null;
        field2352 = null;
        field2344 = null;
        if (!arg0) {
            field2346 = -0.6005774199345414D;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public static final void method1033(int arg0, int arg1) {
        if (arg1 != 75) {
            field2346 = 0.3102054304492892D;
        }
        if (arg0 == 37) {
            class128.field2302 = 3.0F;
        } else if (arg0 == 50) {
            class128.field2302 = 4.0F;
        } else if (arg0 == 75) {
            class128.field2302 = 6.0F;
        } else {
            class128.field2302 = 8.0F;
        }
        class160.field2858 = -1;
        field2354++;
        class160.field2858 = -1;
    }
}
