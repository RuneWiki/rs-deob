import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class36 extends class222 {

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lna;")
    public static class26 field588 = class69.method505("K", (byte) -127);

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "[I")
    public static int[] field589 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lfd;")
    public static class242 field584;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Lfd;")
    public static class242 field599;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lve;")
    public static class266 field593;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "[I")
    public static int[] field586;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[[[Lbj;")
    public static class55[][][] field585;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V", line = 13)
    public final void method303(int arg0, int arg1, int arg2) {
        field591++;
        int var4 = this.field595 * arg1 >> 12;
        int var5 = this.field583 * arg1 >> 12;
        int var6 = this.field592 * arg2 >> 12;
        int var7 = this.field598 * arg2 >> 12;
        if (arg0 == 2) {
            class313.method2174(this.field3513, var7, var4, var6, -26571, var5);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILve;I)Lqf;", line = 36)
    public static final class148 method304(int arg0, class266 arg1, int arg2) {
        field594++;
        if (arg0 < 29) {
            field585 = (class55[][][]) ((class55[][][]) null);
        }
        return class141.method938((byte) -121, arg1, arg2) ? class215.method1439(99) : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)V", line = 50)
    public final void method305(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method305(-7, false, 66);
        }
        field596++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 63)
    public static void method306(int arg0) {
        field588 = null;
        if (arg0 >= -38) {
            method304(93, (class266) null, -70);
        }
        field589 = null;
        field585 = (class55[][][]) null;
        field599 = null;
        field584 = null;
        field593 = null;
        field586 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 80)
    public final void method307(int arg0, int arg1, int arg2) {
        int var4 = this.field595 * arg1 >> 12;
        if (arg2 != 4898) {
            this.field592 = -39;
        }
        field597++;
        int var5 = this.field598 * arg0 >> 12;
        int var6 = this.field592 * arg0 >> 12;
        int var7 = this.field583 * arg1 >> 12;
        class31.method245(true, this.field3518, var4, var6, var5, this.field3516, this.field3513, var7);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIII)V", line = 104)
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field598 = arg3;
        this.field595 = arg0;
        this.field592 = arg1;
        this.field583 = arg2;
    }
}
