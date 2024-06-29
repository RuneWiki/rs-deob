import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class174 extends class89 {

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field3113 = 0;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Lqe;")
    private static class179 field3114 = class206.method1380("Free world", (byte) -127);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lqe;")
    public static class179 field3110 = field3114;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Lnc;")
    public static class144 field3115 = new class144(4096);

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lqe;")
    public static class179 field3121 = class206.method1380("Die Verbindung konnte", (byte) 80);

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public static int field3122 = -1;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Lqe;")
    public static class179 field3118 = class206.method1380("overlay2)3dat", (byte) -126);

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Lqe;")
    public static class179 field3123 = class206.method1380("Ladevorgang )2 bitte warten Sie)3", (byte) 57);

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Lqe;")
    public static class179 field3125 = class206.method1380("Schlie-8en", (byte) -126);

    @OriginalMember(owner = "client!q", name = "E", descriptor = "[I")
    public static int[] field3126 = new int[128];

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Ldc;")
    public static class36 field3119 = new class36();

    @OriginalMember(owner = "client!q", name = "G", descriptor = "[Lqe;")
    public static class179[] field3128 = new class179[1000];

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "Lb;")
    public static class12 field3120;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Lei;")
    public static class53 field3117;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[[B")
    public static byte[][] field3112;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "[[I")
    public static int[][] field3127;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method1099(int arg0) {
        field3114 = null;
        field3119 = null;
        field3127 = null;
        field3120 = null;
        field3117 = null;
        field3125 = null;
        field3123 = null;
        field3110 = null;
        field3112 = null;
        field3118 = null;
        field3121 = null;
        field3128 = null;
        if (arg0 <= 36) {
            method1100(-71, null, 119, 120, -10, -64, 15, -100);
        }
        field3126 = null;
        field3115 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILae;IIIIII)V")
    public static final void method1100(int arg0, class6 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3108++;
        if (class149.field2683) {
            class115.field2151 = 32;
        } else {
            class115.field2151 = 0;
        }
        class149.field2683 = false;
        if (class40.field868 != 0) {
            if (arg7 >= arg3 && arg7 < arg3 + 16 && arg6 <= arg2 && arg2 < arg6 + 16) {
                arg1.field119 -= 4;
                class139.method880(arg1, 116);
            } else if (arg7 >= arg3 && arg3 + 16 > arg7 && arg6 + arg0 - 16 <= arg2 && arg0 + arg6 > arg2) {
                arg1.field119 += 4;
                class139.method880(arg1, 102);
            } else if (arg3 - class115.field2151 <= arg7 && arg7 < class115.field2151 + arg3 + 16 && arg6 + 16 <= arg2 && arg0 + arg6 - 16 > arg2) {
                int var8 = (arg0 - 32) * arg0 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg6 - var8 / 2 - 16;
                int var10 = arg0 - var8 - 32;
                arg1.field119 = (arg4 - arg0) * var9 / var10;
                class139.method880(arg1, 114);
                class149.field2683 = true;
            }
        }
        if (class30.field660 != 0) {
            int var11 = arg1.field169;
            if (arg3 - var11 <= arg7 && arg6 <= arg2 && arg3 + 16 > arg7 && arg2 <= arg0 + arg6) {
                arg1.field119 += class30.field660 * 45;
                class139.method880(arg1, 105);
            }
        }
        if (arg5 >= -66) {
            field3121 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLra;)V")
    public static final void method1101(byte arg0, class185 arg1) {
        if (class171.field3066 != null) {
            try {
                class171.field3066.method980((byte) 90, 0L);
                class171.field3066.method977(false, arg1.field3397, arg1.field3432, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field3432 += 24;
        field3111++;
        if (arg0 <= 102) {
            field3113 = -124;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
    public class174(int arg0, int arg1) {
        this.field3116 = arg1;
        this.field3109 = arg0;
    }
}
