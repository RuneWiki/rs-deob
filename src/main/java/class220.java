import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class220 {

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3910 = 0;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "Lsf;")
    public static class108 field3916 = class140.method973(255, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Z")
    public static boolean field3915 = false;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field3919 = -1;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[I")
    public static int[] field3921 = new int[5];

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field3917 = 0;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "Lsf;")
    private static class108 field3923 = class140.method973(255, "Loaded input handler");

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lsf;")
    public static class108 field3906 = field3923;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public int field3920;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "J")
    public long field3922;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lma;")
    public class290 field3908;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lma;")
    public class290 field3914;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Lma;")
    public class290 field3918;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Z")
    public static boolean field3913;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1511(int arg0) {
        field3923 = null;
        if (arg0 != 407565543) {
            field3921 = (int[]) null;
        }
        field3906 = null;
        field3916 = null;
        field3921 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)[Lwf;", line = 25)
    public static final class59[] method1512(int arg0) {
        field3924++;
        class59[] var1 = new class59[class196.field3546];
        for (int var2 = arg0; var2 < class196.field3546; var2++) {
            if (class231.field4051) {
                var1[var2] = new class188(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], class94.field1512[var2], class321.field5494);
            } else {
                var1[var2] = new class257(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], class94.field1512[var2], class321.field5494);
            }
        }
        class15.method100(1);
        return var1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII[[I)I", line = 73)
    public static final int method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5) {
        field3905++;
        if (arg0 != -16244) {
            method1513(-62, 116, -40, 15, 58, (int[][]) ((int[][]) null));
        }
        int var6 = (128 - arg2) * arg5[arg1][arg4] + arg5[arg1 + 1][arg4] * arg2 >> 7;
        int var7 = (128 - arg2) * arg5[arg1][arg4 + 1] + (arg5[arg1 + 1][arg4 + 1] * arg2) >> 7;
        return (128 - arg3) * var6 + (arg3 * var7) >> 7;
    }
}
