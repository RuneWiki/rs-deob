import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class186 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lqe;")
    private static class179 field3453 = class206.method1380("Loaded config", (byte) -127);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3456 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[Z")
    public static boolean[] field3455 = new boolean[100];

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lqe;")
    public static class179 field3457 = class206.method1380("welle2:", (byte) -127);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lqe;")
    private static class179 field3454 = class206.method1380(" ", (byte) -128);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "[[B")
    public static byte[][] field3460 = new byte[50][];

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lqe;")
    public static class179 field3458 = class206.method1380("Okay", (byte) 4);

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lqe;")
    public static class179 field3463 = field3454;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lqe;")
    public static class179 field3462 = field3453;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3451++;
        if (arg5 == 100) {
            for (int var6 = arg0; var6 <= arg2; var6++) {
                class23.method161(arg3, -1, arg1, arg4, class14.field331[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field3454 = null;
        field3453 = null;
        field3463 = null;
        field3458 = null;
        field3460 = null;
        field3455 = null;
        if (arg0 != 100) {
            method1258(111);
        }
        field3457 = null;
        field3462 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lrb;IIIZ)V")
    public void method1259(class186 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3461++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Lrb;")
    public class186 method1260(int arg0, int arg1, int arg2) {
        field3464++;
        return this;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
    public abstract int method295();

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()Z")
    public boolean method1261() {
        field3452++;
        return false;
    }
}
