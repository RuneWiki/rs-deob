import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class213 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ltj;")
    public static class108 field3010;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Lmn;")
    public static class206 field3014;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field3016;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[[Z")
    public static boolean[][] field3013;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 10)
    public static void method1491(int arg0) {
        field3013 = null;
        field3016 = null;
        if (arg0 != 1778113548) {
            method1491(35);
        }
        field3010 = null;
        field3014 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I", line = 31)
    public static final int method1492(int arg0, int arg1) {
        field3015++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 > -74) {
            method1492(-104, -93);
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
