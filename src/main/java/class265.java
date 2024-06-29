import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class265 extends class62 {

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Leg;")
    private static class37 field4654 = class174.method1167("Close", 61);

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Leg;")
    public static class37 field4653 = field4654;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "[[[B")
    public static byte[][][] field4657;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[[[I")
    public static int[][][] field4649;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method1786(boolean arg0) {
        field4649 = null;
        field4654 = null;
        if (arg0) {
            field4653 = null;
        }
        field4653 = null;
        field4657 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
    public class265(int arg0, int arg1) {
        this.field4652 = arg1;
        this.field4656 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILva;)Lv;")
    public static final class224 method1787(int arg0, class187 arg1) {
        if (arg0 == 0) {
            field4651++;
            return new class224(arg1.method1276((byte) -107), arg1.method1276((byte) -114), arg1.method1276((byte) 92), arg1.method1276((byte) -121), arg1.method1276((byte) 11), arg1.method1276((byte) 29), arg1.method1276((byte) -103), arg1.method1276((byte) 30), arg1.method1248((byte) -122), arg1.method1268(arg0 + 255));
        } else {
            return null;
        }
    }
}
