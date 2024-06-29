import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class232 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[Z")
    public static boolean[] field3381 = new boolean[8];

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[I")
    public static int[] field3382 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[Ltq;")
    public static class537[] field3380 = new class537[32];

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[C")
    public static char[] field3383 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1489(int arg0) {
        if (arg0 != 8) {
            field3381 = null;
        }
        class423.field5717 = true;
        field3376++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lkp;Lkp;I)V", line = 24)
    public static final void method1490(class417 arg0, class417 arg1, int arg2) {
        if (arg1.field5648 != null) {
            arg1.method2457(-8422);
        }
        if (arg2 != 35) {
            method1489(-27);
        }
        field3377++;
        arg1.field5648 = arg0.field5648;
        arg1.field5645 = arg0;
        arg1.field5648.field5645 = arg1;
        arg1.field5645.field5648 = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        field3378++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 68)
    public static void method1491(boolean arg0) {
        field3382 = null;
        field3381 = null;
        field3383 = null;
        if (arg0) {
            field3380 = null;
        }
    }
}
