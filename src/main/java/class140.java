import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class140 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lvh;")
    public static class125 field2344 = new class125(55, 6);

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lvh;")
    public static class125 field2345 = new class125(81, 2);

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2346 = 0;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2349 = 503;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lgca;")
    public static class627 field2348 = new class627();

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Z")
    public static boolean field2347;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method1090(byte arg0) {
        field2344 = null;
        if (arg0 < 72) {
            field2346 = -88;
        }
        field2348 = null;
        field2345 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -123 / ((11 - arg6) / 55);
        field2343++;
        class258[] var8 = class481.field6873;
        for (int var9 = 0; var9 < var8.length; var9++) {
            class258 var10 = var8[var9];
            if (var10 != null && var10.field3709 == 2) {
                class466.method2756(var10.field3702 * 2, (byte) 106, var10.field3704, var10.field3700, arg2, arg5 >> 1, arg4 >> 1, arg0, var10.field3698);
                if (class166.field2737[0] > -1 && class148.field2508 % 20 < 10) {
                    class149.field2517[var10.field3701].method1638(class166.field2737[0] + arg3 - 12, class166.field2737[1] + arg1 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
    public static final boolean method1092(int arg0, int arg1) {
        field2342++;
        if (arg1 > -37) {
            method1090((byte) -42);
        }
        if (arg0 == 12 || arg0 == 30 || arg0 == 50 || arg0 == 22 || arg0 == 1003) {
            return true;
        } else {
            return arg0 == 57 || arg0 == 1008;
        }
    }
}
