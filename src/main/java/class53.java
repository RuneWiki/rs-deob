import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class53 {

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field720 = 1;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field717 = 0;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Ldt;")
    public static class145 field721 = null;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lwf;")
    public static class79 field719 = new class79(15, 8);

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "[I")
    public static int[] field727 = new int[16384];

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
    public static int[] field726 = new int[16384];

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "C")
    public char field718;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[Lpl;")
    public static class426[] field725;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
    public static final void method336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field723++;
        if (arg3 != 8) {
            return;
        }
        if (arg4 > arg1) {
            for (int var5 = arg1; var5 < arg4; var5++) {
                class128.field1676[var5][arg2] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class128.field1676[var6][arg2] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILrp;)V")
    private final void method337(int arg0, int arg1, class276 arg2) {
        if (arg1 == 1) {
            this.field718 = class313.method1930(0, arg2.method1715((byte) 105));
        } else if (arg1 == 2) {
            this.field720 = 0;
        }
        field722++;
        if (arg0 != -30510) {
            field727 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lrp;I)V")
    public final void method338(class276 arg0, int arg1) {
        field724++;
        if (arg1 != 16384) {
            field726 = null;
        }
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                return;
            }
            this.method337(-30510, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method339(byte arg0) {
        field721 = null;
        field725 = null;
        if (arg0 == 12) {
            field727 = null;
            field719 = null;
            field726 = null;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field727[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field726[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }
}
