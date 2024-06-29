import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class184 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field2716 = 128;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public int field2722 = 128;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2717 = 0;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2724 = new Rectangle[100];

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "[[I")
    public static int[][] field2728;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "F")
    public static float field2727;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lwd;")
    public final class184 method1274(byte arg0) {
        if (arg0 != -85) {
            this.method1274((byte) -44);
        }
        field2715++;
        return new class184(this.field2718, this.field2716, this.field2722, this.field2719, this.field2725, this.field2723);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILbt;I)Lhf;")
    public static final class277 method1275(int arg0, int arg1, int arg2, int arg3, class33 arg4, int arg5) {
        field2721++;
        if (arg3 != 6) {
            return null;
        } else if (!arg4.field712 && (!class494.method2900((byte) 76, arg2) || !class494.method2900((byte) 100, arg0))) {
            return arg4.field665 ? new class277(arg4, 34037, arg5, arg1, arg2, arg0, true) : new class277(arg4, arg5, arg1, arg2, arg0, class487.method2869(1366891568, arg2), class487.method2869(arg3 ^ 0x51791C36, arg0), true);
        } else {
            return new class277(arg4, 3553, arg5, arg1, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field2724 = null;
        if (arg0 != 8421) {
            field2727 = 0.9933637F;
        }
        field2728 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lwd;I)V")
    public final void method1277(class184 arg0, int arg1) {
        this.field2718 = arg0.field2718;
        field2720++;
        if (arg1 >= -115) {
            return;
        }
        this.field2722 = arg0.field2722;
        this.field2725 = arg0.field2725;
        this.field2716 = arg0.field2716;
        this.field2719 = arg0.field2719;
        this.field2723 = arg0.field2723;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class184(int arg0) {
        this.field2718 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIII)V")
    private class184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2718 = arg0;
        this.field2722 = arg2;
        this.field2723 = arg5;
        this.field2725 = arg4;
        this.field2719 = arg3;
        this.field2716 = arg1;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2724[var0] = new Rectangle();
        }
        field2728 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
    }
}
