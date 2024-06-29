import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class520 extends class261 {

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "J")
    public long field7557;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field7562 = 0;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "J")
    public static long field7563 = 0L;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[I")
    public static int[] field7564 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lvp;")
    public static class126 field7561;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[Lya;")
    public static class38[] field7560;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Les;Les;B)V")
    public static final void method3082(class261 arg0, class261 arg1, byte arg2) {
        field7559++;
        if (arg2 <= 63) {
            field7562 = -124;
        }
        if (arg0.field3976 != null) {
            arg0.method1676(true);
        }
        arg0.field3976 = arg1.field3976;
        arg0.field3972 = arg1;
        arg0.field3976.field3972 = arg0;
        arg0.field3972.field3976 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class520() {
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(J)V")
    public class520(long arg0) {
        this.field7557 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static final void method3083(int arg0) {
        for (int var1 = arg0; var1 < class22.field333.length; var1++) {
            for (int var2 = 0; var2 < class22.field333[0].length; var2++) {
                for (int var3 = 0; var3 < class22.field333[0][0].length; var3++) {
                    class22.field333[var1][var2][var3] = 0;
                }
            }
        }
        field7558++;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public static void method3084(int arg0) {
        field7561 = null;
        field7560 = null;
        if (arg0 != 64) {
            field7560 = null;
        }
        field7564 = null;
    }
}
