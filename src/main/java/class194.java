import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class194 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Z")
    public static boolean field3262 = false;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3265 = "Loaded fonts";

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    public static int[] field3260 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "[[I")
    public static int[][] field3268 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Ljava/lang/String;")
    public String field3269;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "[I")
    public static int[] field3267;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 9)
    public static void method1341(byte arg0) {
        field3260 = null;
        field3265 = null;
        if (arg0 != 64) {
            method1342(127, false);
        }
        field3268 = (int[][]) null;
        field3267 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)Z", line = 36)
    public static final boolean method1342(int arg0, boolean arg1) {
        if (arg0 >= -113) {
            return true;
        }
        field3263++;
        boolean var2 = class163.method1173();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class163.method1176();
        } else if (!class163.method1169() || !class163.method1171() || !class163.method1166()) {
            arg1 = false;
        }
        class133.field2281 = arg1;
        class235.method1634(class59.field1164, (byte) -50);
        if (arg1 == var2) {
            return false;
        } else {
            ((class7) class305.field4968).method83(1);
            return true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 78)
    public static final void method1343(byte arg0) {
        field3258++;
        if (class276.field4506 != class144.field2423 && arg0 > 34 && class277.method1962(class276.field4506, false)) {
            class144.field2423 = class276.field4506;
        }
    }
}
