import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class53 extends class41 {

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[Z")
    public static boolean[] field719 = new boolean[100];

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[Lfca;")
    public static class645[] field725 = new class645[4];

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lra;")
    public static class361 field722 = new class361(54, 12);

    @OriginalMember(owner = "client!u", name = "x", descriptor = "J")
    public static volatile long field727 = 0L;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lfl;")
    public final class103 method318(int arg0) {
        field718++;
        return arg0 == -26207 ? class197.field2593 : null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILpe;)Lxa;")
    public static final class511 method462(int arg0, int arg1, class615 arg2) {
        field721++;
        if (class635.field8839) {
            return class520.field6799.method325(class506.method2724(arg2, arg1), true);
        } else {
            if (arg0 != 26513) {
                field722 = null;
            }
            return class603.method3276(arg2.method3365(arg1, (byte) 117), (byte) 127);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lhea;")
    public static final class374 method463(int arg0, int arg1) {
        if (arg1 != 100) {
            method463(-74, 47);
        }
        field724++;
        return new class374(arg0, false);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lffa;Loca;IIIIIIIIII)V")
    public class53(class562 arg0, class573 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field720 = arg10;
        this.field723 = arg11;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method464(byte arg0) {
        if (arg0 == 33) {
            field719 = null;
            field722 = null;
            field725 = null;
        }
    }
}
