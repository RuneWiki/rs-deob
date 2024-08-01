import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("og")
public class class137 {

    @OriginalMember(owner = "og", name = "a", descriptor = "Llf;")
    public static class109 field2643 = class35.method275("scape main", 2);

    @OriginalMember(owner = "og", name = "h", descriptor = "Llf;")
    private static class109 field2650 = class35.method275("Click to switch", 2);

    @OriginalMember(owner = "og", name = "g", descriptor = "Llf;")
    public static class109 field2649 = field2650;

    @OriginalMember(owner = "og", name = "o", descriptor = "Llf;")
    public static class109 field2657 = class35.method275("(U0a )2 via: ", 2);

    @OriginalMember(owner = "og", name = "p", descriptor = "Llf;")
    private static class109 field2658 = class35.method275("yellow:", 2);

    @OriginalMember(owner = "og", name = "l", descriptor = "Llf;")
    public static class109 field2654 = field2658;

    @OriginalMember(owner = "og", name = "m", descriptor = "Llf;")
    public static class109 field2655 = class35.method275("rect_debug=", 2);

    @OriginalMember(owner = "og", name = "c", descriptor = "[Lef;")
    public static class47[] field2645 = new class47[50];

    @OriginalMember(owner = "og", name = "b", descriptor = "Llf;")
    private static class109 field2644 = class35.method275("Please wait)3)3)3", 2);

    @OriginalMember(owner = "og", name = "i", descriptor = "Llf;")
    public static class109 field2651 = field2644;

    @OriginalMember(owner = "og", name = "q", descriptor = "Llf;")
    public static class109 field2659 = field2658;

    @OriginalMember(owner = "og", name = "j", descriptor = "Llf;")
    public static class109 field2652 = class35.method275("sch-Utteln:", 2);

    @OriginalMember(owner = "og", name = "d", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "og", name = "e", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "og", name = "f", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "og", name = "n", descriptor = "Lbg;")
    public static class18 field2656;

    @OriginalMember(owner = "og", name = "k", descriptor = "[Lkf;")
    public static class100[] field2653;

    @OriginalMember(owner = "og", name = "a", descriptor = "(IZIII)V")
    public static final void method982(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 <= arg3 + arg4; var5++) {
            for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class204.field4018[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class184.field3448[0][var6][var5] = class184.field3448[0][var6 - 1][var5];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class184.field3448[0][var6][var5] = class184.field3448[0][var6 + 1][var5];
                    }
                    if (arg4 == var5 && var5 > 0) {
                        class184.field3448[0][var6][var5] = class184.field3448[0][var6][var5 - 1];
                    }
                    if (arg3 + arg4 == var5 && var5 < 103) {
                        class184.field3448[0][var6][var5] = class184.field3448[0][var6][var5 + 1];
                    }
                }
            }
        }
        field2646++;
        if (arg1) {
            field2658 = null;
        }
    }

    @OriginalMember(owner = "og", name = "a", descriptor = "(I)V")
    public static void method983(int arg0) {
        field2657 = null;
        int var1 = 0 % ((arg0 - 20) / 60);
        field2653 = null;
        field2651 = null;
        field2650 = null;
        field2645 = null;
        field2655 = null;
        field2643 = null;
        field2658 = null;
        field2649 = null;
        field2659 = null;
        field2656 = null;
        field2652 = null;
        field2654 = null;
        field2644 = null;
    }
}
