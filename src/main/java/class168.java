import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class168 {

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lp;")
    public static class284 field3111 = null;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lid;")
    public static class149 field3116 = class60.method382(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 100);

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "[I")
    public static int[] field3126 = new int[100];

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "Z")
    public static boolean field3129 = false;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lkc;")
    public static class278 field3120;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[Laj;")
    public static class47[] field3117;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "[[I")
    public static int[][] field3123;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZIBI)Lvc;")
    public static final class190 method1217(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field3128++;
        int var7 = arg0 - (-(arg2 ? 65536 : 0) - (arg1 << 17) - (arg5 << 19));
        int var8 = -15 / ((6 - arg4) / 57);
        long var9 = (long) arg3 * 3147483667L + (long) var7 * 3849834839L;
        class190 var11 = (class190) class148.field2666.method1293(var9, false);
        if (var11 != null) {
            return var11;
        }
        class235.field4119 = false;
        class190 var12 = class268.method1856(arg0, false, arg3, false, 120, arg1, arg2, arg5);
        if (var12 != null && !class235.field4119) {
            class148.field2666.method1295(var9, var12, (byte) -71);
        }
        return var12;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1218(int arg0) {
        field3126 = null;
        field3117 = null;
        field3123 = null;
        field3116 = null;
        if (arg0 != 25180) {
            field3126 = null;
        }
        field3120 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIBIII)V")
    public static final void method1219(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3112++;
        int var6 = 111 % ((-arg2 - 16) / 51);
        for (int var7 = arg1; var7 <= arg4; var7++) {
            class141.method987(2, arg5, class15.field220[var7], arg0, arg3);
        }
    }
}
