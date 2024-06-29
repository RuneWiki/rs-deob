import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class188 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Llu;")
    public static class610 field2794 = new class610(55, 16);

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Z")
    public static boolean field2800 = false;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field2798 = 1407;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field2799 = 2;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Llu;")
    public static class610 field2796 = new class610(11, 1);

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "[[I")
    public static int[][] field2797;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[[S")
    public static short[][] field2803;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 6)
    public static void method1292(byte arg0) {
        field2803 = null;
        field2794 = null;
        field2797 = null;
        int var1 = 126 % ((50 - arg0) / 57);
        field2796 = null;
    }

    @OriginalMember(owner = "client!hm", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        field2793++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1293(int arg0) {
        if (arg0 != -25147) {
            method1292((byte) -71);
        }
        class310.method1893(-117);
        field2795++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII)V", line = 40)
    public static final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= class14.field136 && class130.field1801 >= arg2 && arg4 >= class3.field25 && class100.field1452 >= arg1) {
            class48.method297(arg3, arg2, -114, arg4, arg5, arg1);
        } else {
            class84.method637(3727, arg4, arg2, arg1, arg5, arg3);
        }
        field2792++;
        if (arg0 != 16) {
            field2803 = null;
        }
    }
}
