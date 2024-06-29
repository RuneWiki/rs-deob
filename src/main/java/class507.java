import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class507 {

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "[[I")
    public static int[][] field6887 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
    public static void method2955(byte arg0) {
        if (arg0 < -116) {
            field6887 = null;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method2956(int arg0, String arg1, int arg2) {
        if (arg0 == 10913) {
            field6886++;
            return class499.method2930(true, 43, arg1, arg2);
        } else {
            return 12;
        }
    }
}
