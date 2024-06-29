import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class137 extends class388 {

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Lsfa;")
    public class124 field1879;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Lvi;")
    public static class368 field1880 = new class368(128);

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Llc;")
    public static class435 field1883 = new class435(87, -1);

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "[[Z")
    public static boolean[][] field1885 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "F")
    public static float field1881;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "J")
    public static long field1882;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public static void method974(int arg0) {
        field1885 = null;
        field1883 = null;
        if (arg0 == 128) {
            field1880 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lsfa;)V")
    public class137(class124 arg0) {
        this.field1879 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILkw;II)Lof;")
    public static final class9 method975(int arg0, int arg1, int arg2, class346 arg3, int arg4, int arg5) {
        if (arg0 != -15633) {
            return null;
        }
        field1878++;
        if (!arg3.field5021 && (!class211.method1496(0, arg2) || !class211.method1496(0, arg1))) {
            return arg3.field5035 ? new class9(arg3, 34037, arg4, arg5, arg2, arg1, true) : new class9(arg3, arg4, arg5, arg2, arg1, class68.method609(arg2, (byte) -126), class68.method609(arg1, (byte) -126), true);
        } else {
            return new class9(arg3, 3553, arg4, arg5, arg2, arg1, true);
        }
    }
}
