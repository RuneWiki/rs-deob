import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class16 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field306 = 0;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static volatile int field305 = 0;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lec;")
    public static class28 field309 = class28.method210(-46, "green:");

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lec;")
    public static class28 field311 = class28.method210(-46, "Loaded fonts");

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lec;")
    public static class28 field314 = class28.method210(-46, " with @yel@");

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lad;")
    public static class5 field302 = new class5();

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lec;")
    public static class28 field318 = class28.method210(-46, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "[I")
    public static int[] field319 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Ljava/awt/Image;")
    public Image field315;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
    public int[] field312;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method87(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBI)I")
    public static final int method88(int arg0, int arg1, byte arg2, int arg3) {
        field303++;
        if ((class47.field1080[arg3][arg0][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg2 < 40) {
            return 5;
        } else if (arg3 <= 0 || (class47.field1080[1][arg0][arg1] & 0x2) == 0) {
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZILn;III)V")
    public static final void method89(int arg0, int arg1, int arg2, boolean arg3, int arg4, class78 arg5, int arg6, int arg7, int arg8) {
        if (class11.field184) {
            class72.field1609 = 32;
        } else {
            class72.field1609 = 0;
        }
        class11.field184 = false;
        if (arg2 <= arg1 && arg1 < arg2 + 16 && arg4 <= arg7 && arg4 + 16 > arg7) {
            arg5.field1742 -= class3.field46 * 4;
            if (arg0 == 1) {
                class30.field646 = true;
            }
            if (arg0 == 2 || arg0 == 3) {
                class95.field2092 = true;
            }
        } else if (arg2 <= arg1 && arg2 + 16 > arg1 && arg4 + arg6 - 16 <= arg7 && arg4 + arg6 > arg7) {
            if (arg0 == 2 || arg0 == 3) {
                class95.field2092 = true;
            }
            if (arg0 == 1) {
                class30.field646 = true;
            }
            arg5.field1742 += class3.field46 * 4;
        } else if (arg2 - class72.field1609 <= arg1 && arg1 < arg2 + class72.field1609 + 16 && arg7 >= arg4 + 16 && arg7 < arg6 + arg4 - 16 && class3.field46 > 0) {
            class11.field184 = true;
            if (arg0 == 2 || arg0 == 3) {
                class95.field2092 = true;
            }
            if (arg0 == 1) {
                class30.field646 = true;
            }
            int var9 = (arg6 - 32) * arg6 / arg8;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg6 - var9 - 32;
            int var11 = arg7 - var9 / 2 - arg4 - 16;
            arg5.field1742 = (arg8 - arg6) * var11 / var10;
        }
        if (arg3) {
            field310++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method90(int arg0) {
        field318 = null;
        field309 = null;
        field319 = null;
        field311 = null;
        field302 = null;
        field314 = null;
        if (arg0 <= 15) {
            method93((byte) 8, -81);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method91(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        class120.method913(this.field312, this.field307, this.field301);
        field304++;
        if (arg0 != -4) {
            this.field312 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)Lec;")
    public static final class28 method93(byte arg0, int arg1) {
        if (arg0 != -108) {
            method88(-128, 2, (byte) -81, -10);
        }
        field308++;
        return class68.method537(arg0 ^ 0xFFFFFF95, new class28[] { class5.method25(6366, arg1 >> 24 & 0xFF), class83.field1892, class5.method25(arg0 + 6474, arg1 >> 16 & 0xFF), class83.field1892, class5.method25(6366, arg1 >> 8 & 0xFF), class83.field1892, class5.method25(arg0 ^ 0xFFFFE74A, arg1 & 0xFF) });
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    protected class16() {
    }
}
