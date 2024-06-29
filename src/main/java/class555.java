import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class class555 {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "Lhda;")
    public static class752 field7293 = new class752(87, -1);

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "Lmha;")
    public static class419 field7295 = new class419(2, 2);

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "[Z")
    public static boolean[] field7298 = new boolean[5];

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "Lqda;")
    public static class105 field7297 = new class105(1);

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BJ)I", line = 9)
    public final int method3087(byte arg0, long arg1) {
        field7294++;
        long var4 = this.method1092(6407);
        if (var4 > 0L) {
            class226.method1447((byte) -124, var4);
        }
        return arg0 < 3 ? -124 : this.method1091(arg1, -127);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(II)I", line = 28)
    public static final int method3088(int arg0, int arg1) {
        field7296++;
        if (arg1 < 18) {
            return -3;
        } else if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V", line = 64)
    public static void method3089(byte arg0) {
        if (arg0 != -19) {
            field7297 = null;
        }
        field7295 = null;
        field7298 = null;
        field7297 = null;
        field7293 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V")
    public abstract void method1093(byte arg0);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)J")
    public abstract long method1094(int arg0);

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)J")
    public abstract long method1092(int arg0);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(JI)I")
    public abstract int method1091(long arg0, int arg1);
}
