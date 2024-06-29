import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lod;")
    private static class101 field2117 = class46.method335(78, "Sorry invited players only)3");

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public static int[] field2119 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lod;")
    public static class101 field2125 = class46.method335(-109, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
    public static int[] field2123 = new int[4000];

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lod;")
    private static class101 field2127 = class46.method335(100, "Malformed login packet)3");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lod;")
    public static class101 field2118 = field2127;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[Lod;")
    public static class101[] field2129 = new class101[500];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lod;")
    public static class101 field2124 = field2117;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lcb;")
    public static class17 field2128 = new class17(50);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lod;")
    private static class101 field2130 = class46.method335(90, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lod;")
    public static class101 field2132 = field2130;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lvf;")
    public static class152 field2114;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lc;")
    public static class15 field2122;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
    public static int[] field2131;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILrd;IIZI)V")
    public static final void method679(int arg0, class122 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2121++;
        if (arg1 == null) {
            return;
        }
        int var6 = class97.field2100 + class79.field1652 & 0x7FF;
        int var7 = arg3 * arg3 + arg5 * arg5;
        if (var7 > 6400) {
            return;
        }
        int var8 = class124.field2709[var6];
        int var9 = var8 * 256 / (class141.field3260 + 256);
        if (arg4) {
            return;
        }
        int var10 = class124.field2717[var6];
        int var11 = var10 * 256 / (class141.field3260 + 256);
        int var12 = arg5 * var9 + arg3 * var11 >> 16;
        int var13 = arg5 * var11 - arg3 * var9 >> 16;
        if (var7 > 2500) {
            arg1.method933(class6.field79, arg2 + var12 + 94 + 4 - arg1.field2689 / 2, arg0 + 79 + -var13 + -(arg1.field2694 / 2));
        } else {
            arg1.method937(arg2 + var12 + 98 - arg1.field2689 / 2, -(arg1.field2694 / 2) + -var13 + arg0 + 83 + -4);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
    public static final int method680(int arg0, int arg1, int arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        field2115++;
        if (arg2 < 106) {
            field2132 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2113++;
        class156 var10 = (class156) class17.field345.method523(false);
        class156 var11 = null;
        while (var10 != null) {
            if (var10.field3590 == arg4 && var10.field3582 == arg2 && var10.field3593 == arg1 && var10.field3585 == arg0) {
                var11 = var10;
                break;
            }
            var10 = (class156) class17.field345.method527(true);
        }
        if (var11 == null) {
            var11 = new class156();
            var11.field3582 = arg2;
            var11.field3593 = arg1;
            var11.field3590 = arg4;
            var11.field3585 = arg0;
            class140.method1118((byte) 116, var11);
            class17.field345.method529(var11, 19002);
        }
        int var12 = -92 % ((arg5 + 29) / 53);
        var11.field3586 = arg7;
        var11.field3595 = arg9;
        var11.field3589 = arg8;
        var11.field3581 = arg6;
        var11.field3591 = arg3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method682(int arg0) {
        field2127 = null;
        field2122 = null;
        field2118 = null;
        field2131 = null;
        field2129 = null;
        field2124 = null;
        field2130 = null;
        field2117 = null;
        if (arg0 != 4) {
            field2116 = 23;
        }
        field2132 = null;
        field2114 = null;
        field2128 = null;
        field2119 = null;
        field2123 = null;
        field2125 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
    public static final void method683(int arg0, int arg1, int arg2) {
        field2126++;
        class17.field364.method419(arg1, (byte) 0);
        class17.field364.method1063((byte) 119, arg2);
        class17.field364.method1068(arg0, arg1 + 28454);
        class149.field3382++;
    }
}
