import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class29 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lqj;")
    private static class196 field355 = class80.method502("glow2:", -48);

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lqj;")
    private static class196 field359 = class80.method502("cyan:", -48);

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lqj;")
    public static class196 field361 = field359;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lqj;")
    public static class196 field358 = field359;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lqj;")
    public static class196 field357 = class80.method502("cross", -48);

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lqj;")
    public static class196 field367 = field355;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lqj;")
    public static class196 field363 = class80.method502("Fps:", -48);

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lqj;")
    public static class196 field356 = field355;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    public static int[] field368 = new int[100];

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lea;")
    public static class243 field362 = new class243();

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Lqj;")
    public static class196 field369 = class80.method502("www", -48);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lnb;")
    public static class95 field360;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public static int[] field364;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 < 12) {
            return;
        }
        field365++;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg1 & 0x7FF;
        int var10 = 0;
        int var11 = arg0;
        int var12 = 0;
        if (var8 != 0) {
            int var13 = class15.field172[var8];
            int var14 = class15.field170[var8];
            var12 = -arg0 * var14 >> 16;
            var11 = arg0 * var13 >> 16;
        }
        if (var9 != 0) {
            int var15 = class15.field170[var9];
            int var16 = class15.field172[var9];
            var10 = var11 * var15 >> 16;
            var11 = var11 * var16 >> 16;
        }
        class132.field1889 = arg4 - var12;
        class185.field3232 = arg1;
        class25.field321 = arg7 - var11;
        class149.field2396 = arg3;
        class13.field151 = arg2 - var10;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method159(int arg0) {
        field360 = null;
        field367 = null;
        field355 = null;
        field356 = null;
        field361 = null;
        field364 = null;
        field363 = null;
        field369 = null;
        if (arg0 > -22) {
            return;
        }
        field357 = null;
        field358 = null;
        field362 = null;
        field359 = null;
        field368 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZBZ)I")
    public static final int method160(boolean arg0, byte arg1, boolean arg2) {
        int var3 = 0;
        field353++;
        if (arg1 > -48) {
            method160(true, (byte) 98, true);
        }
        if (arg0) {
            var3 += class72.field1045 + class45.field542;
        }
        if (arg2) {
            var3 += class8.field84 + class192.field3366;
        }
        return var3;
    }
}
