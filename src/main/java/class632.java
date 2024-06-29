import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class632 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public int field8766 = -1;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public int field8771 = -1;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lfq;")
    public static class141 field8769 = new class141(11, 0, 1, 2);

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lnha;")
    public static class501 field8773 = new class501("", 10);

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lwga;")
    public static class506 field8774 = new class506();

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lmq;")
    public static class78 field8775 = new class78(109, 8);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[I")
    public int[] field8770;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 6)
    public static void method3436(int arg0) {
        field8773 = null;
        field8775 = null;
        field8774 = null;
        field8769 = null;
        if (arg0 != 11) {
            field8774 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLtn;)V", line = 19)
    public final void method3437(byte arg0, class179 arg1) {
        if (arg0 != -53) {
            return;
        }
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                field8767++;
                return;
            }
            this.method3438(arg1, arg0 + 55, var3);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ltn;II)V", line = 44)
    private final void method3438(class179 arg0, int arg1, int arg2) {
        field8768++;
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 1) {
            this.field8771 = arg0.method1107(false);
        } else if (arg2 == 2) {
            this.field8770 = new int[arg0.method1094(255)];
            for (int var4 = 0; var4 < this.field8770.length; var4++) {
                this.field8770[var4] = arg0.method1107(false);
            }
        } else if (arg2 == 3) {
            this.field8766 = arg0.method1094(255);
            return;
        }
    }
}
