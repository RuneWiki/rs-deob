import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class36 extends class132 {

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[I")
    public int[] field680 = new int[1];

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
    public int[] field681 = new int[] { -1 };

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
    public static int[] field671 = new int[2000];

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Ltg;")
    public static class184 field673 = class135.method812("(U5", 3);

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Ltg;")
    public static class184 field676 = class135.method812("", 3);

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Z")
    public static boolean field679 = true;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lwc;")
    public static class207 field674 = new class207();

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field683 = -1;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lvb;")
    public static class197 field678;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method217(int arg0) {
        field677++;
        if (arg0 != 7) {
            method219(47, -72, 68, -47);
        }
        if (class179.field3415 != null) {
            class19 var1 = class179.field3415;
            synchronized (class179.field3415) {
                class179.field3415 = null;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static void method218(int arg0) {
        field676 = null;
        field673 = null;
        field674 = null;
        if (arg0 != 3) {
            method218(-71);
        }
        field678 = null;
        field671 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)I")
    public static final int method219(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field675++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg0 != 32572) {
                method219(-91, -54, -55, 50);
            }
            return 7 - arg3;
        }
    }
}
