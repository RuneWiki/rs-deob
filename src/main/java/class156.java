import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class156 {

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lok;")
    public static class41 field2464 = class137.method956(")0", 45);

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lak;")
    public static class20 field2460 = new class20(50);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lok;")
    private static class41 field2467 = class137.method956("green:", 45);

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lok;")
    public static class41 field2469 = class137.method956("cookieprefix", 45);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lok;")
    public static class41 field2465 = class137.method956("hitmarks", 45);

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lok;")
    public static class41 field2466 = class137.method956("blaugr-Un:", 45);

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Lok;")
    public static class41 field2474 = field2467;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lok;")
    public static class41 field2471 = field2467;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field2472 = -1;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "[[I")
    public static int[][] field2468 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lok;")
    public static class41 field2473 = class137.method956("weiss:", 45);

    @OriginalMember(owner = "client!na", name = "r", descriptor = "J")
    public static volatile long field2475 = 0L;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lok;")
    public class41 field2470;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1111(int arg0) {
        if (arg0 == 1) {
            class306.field5131.method131(-2);
            field2462++;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 16)
    public static void method1112(int arg0) {
        if (arg0 != -21558) {
            method1113(-21, -20, 119, 98, -126, false, -39, -125);
        }
        field2466 = null;
        field2465 = null;
        field2468 = (int[][]) null;
        field2474 = null;
        field2464 = null;
        field2460 = null;
        field2471 = null;
        field2467 = null;
        field2469 = null;
        field2473 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIZII)V", line = 47)
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2461++;
        if (class166.field2625) {
            int var8 = arg4 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class206.field3334 - class14.field177) * var8 / 100 + class14.field177;
            arg0 = arg0 * var9 >> 8;
        }
        int var10 = 2048 - arg6 & 0x7FF;
        int var11 = 0;
        int var12 = arg0;
        int var13 = 2048 - arg2 & 0x7FF;
        int var14 = 0;
        if (var10 != 0) {
            int var15 = class31.field450[var10];
            var11 = -arg0 * var15 >> 16;
            int var16 = class31.field455[var10];
            var12 = arg0 * var16 >> 16;
        }
        if (var13 != 0) {
            int var17 = class31.field450[var13];
            int var18 = class31.field455[var13];
            var14 = var12 * var17 >> 16;
            var12 = var12 * var18 >> 16;
        }
        class235.field3779 = arg1 - var14;
        if (!arg5) {
            field2471 = (class41) null;
        }
        class57.field823 = arg6;
        class13.field159 = arg3 - var11;
        class304.field5072 = arg2;
        class251.field3990 = arg7 - var12;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZI)I", line = 113)
    public static final int method1114(int arg0, boolean arg1, int arg2) {
        field2458++;
        int var3 = arg0 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        if (arg1) {
            int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
            return (var5 & 0x7F94A1A) >> 19;
        } else {
            return -35;
        }
    }
}
