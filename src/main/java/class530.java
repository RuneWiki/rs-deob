import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class class530 extends class513 {

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "F")
    public float field7732;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public int field7733;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public int field7734;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    private int field7738;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    private int field7742;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public int field7736;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lcr;")
    public static class531 field7740 = new class531();

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field7744 = 0;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Z")
    public static boolean field7746 = false;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Z")
    public static boolean field7747 = false;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I", line = 10)
    public final int method3115(int arg0) {
        field7735++;
        if (arg0 != -30190) {
            this.field7738 = -81;
        }
        return this.field7736;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 21)
    public static void method3116(int arg0) {
        if (arg0 != 16708) {
            method3116(0);
        }
        field7740 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)F", line = 33)
    public final float method3117(boolean arg0) {
        field7741++;
        return arg0 ? -0.80417633F : this.field7732;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)I", line = 44)
    public final int method3118(int arg0) {
        field7745++;
        return arg0 == 34037 ? this.field7733 : -15;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)I", line = 59)
    public final int method3119(int arg0) {
        if (arg0 == 3553) {
            field7743++;
            return this.field7734;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIF)V", line = 75)
    public class530(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7732 = arg5;
        this.field7733 = arg0;
        this.field7734 = arg1;
        this.field7738 = arg3;
        this.field7742 = arg4;
        this.field7736 = arg2;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)I", line = 91)
    public final int method3120(boolean arg0) {
        field7737++;
        if (!arg0) {
            field7740 = null;
        }
        return this.field7742;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIILkga;)Leb;", line = 103)
    public static final class577 method3121(int arg0, int arg1, int arg2, int arg3, int arg4, class506 arg5) {
        if (arg0 >= -29) {
            field7747 = true;
        }
        field7739++;
        if (!arg5.field7360 && (!class326.method1894(arg4, 32) || !class326.method1894(arg2, 32))) {
            return arg5.field7355 ? new class577(arg5, 34037, arg1, arg3, arg4, arg2, true) : new class577(arg5, arg1, arg3, arg4, arg2, class698.method3915(arg4, (byte) 93), class698.method3915(arg2, (byte) 93), true);
        } else {
            return new class577(arg5, 3553, arg1, arg3, arg4, arg2, true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)I", line = 127)
    public final int method3122(int arg0) {
        field7731++;
        if (arg0 != -11184) {
            field7747 = true;
        }
        return this.field7738;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIZ)V")
    public abstract void method1159(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BF)V")
    public abstract void method1158(byte arg0, float arg1);
}
