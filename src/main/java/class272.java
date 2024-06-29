import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class272 extends class626 {

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lfca;")
    public class84 field3885;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[S")
    private static short[] field3891 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[S")
    private static short[] field3888 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "[S")
    private static short[] field3889 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[[S")
    public static short[][] field3890 = new short[][] { field3891, field3888, field3889 };

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "[Lkr;")
    public static class743[] field3886;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1798(int arg0) {
        field3886 = null;
        field3888 = null;
        field3889 = null;
        field3890 = null;
        field3891 = null;
        if (arg0 != -1) {
            field3892 = 3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method1799(int arg0, int arg1) {
        field3887++;
        if (arg0 >= -61) {
            field3886 = null;
        }
        class236 var2 = (class236) class160.field2387.method4203(true, (long) arg1);
        if (var2 != null) {
            var2.field3348.method3308(126);
            class249.method1660(var2.field3349, (byte) 117, var2.field3343);
            var2.method3617(1);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lfca;)V")
    public class272(class84 arg0) {
        this.field3885 = arg0;
    }
}
