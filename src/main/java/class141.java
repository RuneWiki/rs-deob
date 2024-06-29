import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class141 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field3291 = 0;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public int field3311 = 0;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lsc;")
    public static class128 field3295 = class129.method1017(false, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field3305 = -1;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lsc;")
    public static class128 field3310 = null;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lq;")
    public static class111 field3302 = new class111();

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "[I")
    public static int[] field3312 = new int[1000];

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lsc;")
    public static class128 field3313 = class129.method1017(false, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lsc;")
    public static class128 field3314 = class129.method1017(false, "(Z");

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field3318 = 500;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lsc;")
    public static class128 field3316 = class129.method1017(false, " )2> ");

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Lsc;")
    public static class128 field3317 = class129.method1017(false, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Lsc;")
    public static class128 field3319 = class129.method1017(false, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3315 = 0;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public int field3309;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lwc;")
    public class156 field3307;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field3319 = null;
        field3310 = null;
        field3302 = null;
        field3295 = null;
        field3313 = null;
        if (arg0 > -12) {
            method1156(113);
        }
        field3314 = null;
        field3316 = null;
        field3312 = null;
        field3317 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method1156(int arg0) {
        int var1 = 2 / ((arg0 + 43) / 58);
        for (class79 var2 = (class79) class1.field8.method920((byte) -60); var2 != null; var2 = (class79) class1.field8.method932(-6)) {
            if (var2.field1763 != null) {
                var2.method598((byte) -106);
            }
        }
        field3298++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public static final int method1157(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method1156(-86);
        }
        field3292++;
        if (arg1 >= 2) {
            int var3 = method1157(1, arg1 >> 1, arg2 * arg2);
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            return var3;
        } else if (arg1 == 1) {
            return arg2;
        } else {
            return 1;
        }
    }
}
