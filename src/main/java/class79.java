import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class79 {

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "[I")
    public static int[] field1136 = new int[2048];

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
    public static boolean field1138 = false;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[[Z")
    public static boolean[][] field1122;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Loi;B)Z", line = 7)
    public final boolean method675(class79 arg0, byte arg1) {
        field1128++;
        if (arg1 > -58) {
            return true;
        } else {
            return this.field1134 == arg0.field1134 && this.field1123 == arg0.field1123 && this.field1133 == arg0.field1133;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 23)
    public static void method676(int arg0) {
        if (arg0 != 2048) {
            method676(-49);
        }
        field1136 = null;
        field1122 = null;
    }
}
